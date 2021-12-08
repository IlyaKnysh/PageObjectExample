package propsResolver;

import ru.qatools.properties.Property;
import ru.qatools.properties.PropertyLoader;
import ru.qatools.properties.Resource;

@Resource.Classpath("properties")
public interface Properties {
    @Property("apiUrl")
    String apiUrl();

    @Property("basePath")
    String basePath();

    Properties props = PropertyLoader.newInstance().populate(Properties.class);
}
