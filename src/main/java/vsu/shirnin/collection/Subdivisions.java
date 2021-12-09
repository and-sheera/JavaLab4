package vsu.shirnin.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

public class Subdivisions {
    private Map<UUID, String> subdivision = new HashMap<UUID, String>();

    /**
     * Adds non-repeating subdivision
     * @param name name of subdivision
     */
    public void add(String name) {
        if (!subdivision.containsValue(name)) {
            subdivision.put(UUID.randomUUID(), name);
        }
    }

    /**
     * Finds id by name of subdivision
     * @param name name of subdivision
     * @return id if subdivision
     */
    public UUID getIdByName(String name) {
        for (Map.Entry<UUID, String> entry : subdivision.entrySet()) {
            if (Objects.equals(name, entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }

    /**
     * Finds name of subdivision by id
     * @param id id of subdivision
     * @return name of subdivision
     */
    public String getNameById(UUID id) {
        return subdivision.get(id);
    }

    /**
     * Removes subdivision by name
     * @param name name of subdivision
     */
    public void removeObj(String name) {
        subdivision.remove(getIdByName(name));
    }

}
