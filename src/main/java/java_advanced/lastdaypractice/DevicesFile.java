package java_advanced.lastdaypractice;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class DevicesFile {
    private final Path path;

    public DevicesFile(Path path) {
        this.path = path;
    }
    public static void main(String[] args) {
        System.out.println(new DevicesFile(Path.of("Data.txt")).getDevices());

    }
    public List<Device> getDevices() {
        List<Device> result = new ArrayList<>();
        try {
            List<String> lines = Files.readAllLines(path);
            Device device = null;
            for (String line: lines) {
                String[] parts = line.split(":");
                String key = parts[0].trim();
                String value = parts[1].trim();
                

                device = processedDevice(result, device, key, value);
            }
        }
        catch (Exception e) {
            throw new IllegalStateException("Can not read file", e);
        }
        return result;
    }

    private Device processedDevice(List<Device> result, Device device, String key, String value) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        if (key.equals("class")) {
            device = createDevice(result, value);
        }
        else {

            setAttribute(device, key, value);
        }
        return device;
    }

    private void setAttribute(Device device, String key, String value) throws IllegalAccessException, InvocationTargetException {
        String methodName = getMethodName("set", key.substring(0, 1).toUpperCase(), key.substring(1));

        Method method = getMethod(device, methodName);

        if (method.getParameterTypes()[0] == int.class) {
            Integer i = Integer.parseInt(value);
            method.invoke(device, i);
        }
        else {
            method.invoke(device, value);
        }
    }

    private String getMethodName(String set, String key, String key1) {
        return set + key
                + key1;
    }

    private Method getMethod(Device device, String methodName) {
        return Arrays.stream(device.getClass().getMethods())
                .filter(m -> m.getName()
                        .equals(methodName))
                .findAny().get();

    }

    private Device createDevice(List<Device> result, String value) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        Device device;
        String className = getMethodName(DevicesFile.class.getPackageName(), ".", value);
        Class<?> clazz = Class.forName(className);
        var constructor = clazz.getConstructor();
        device = (Device) constructor.newInstance();
        result.add(device);
        return device;
    }


}
