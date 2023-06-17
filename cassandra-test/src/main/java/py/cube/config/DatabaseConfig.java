// package py.cube.config;

// import org.eclipse.microprofile.config.inject.ConfigProperty;

// import com.datastax.oss.driver.api.core.CqlSession;
// import com.datastax.oss.driver.api.core.config.DriverConfigLoader;
// import com.datastax.oss.driver.api.core.cql.ResultSet;
// import com.datastax.oss.driver.api.core.cql.Row;

// import jakarta.inject.Inject;

// public class DatabaseConfig {
//     @Inject
//     @ConfigProperty(name = "quarkus.cassandra.contact-points")
//     String contactPoints;

//     @Inject
//     @ConfigProperty(name = "quarkus.cassandra.local-datacenter")
//     String localDatacenter;

//     @Inject
//     @ConfigProperty(name = "quarkus.cassandra.keyspace")
//     String keyspace;

//     String[] contactPointArray = contactPoints.split(",");

//     DriverConfigLoader loader = DriverConfigLoader.fromClasspath("application.conf");try(
//     CqlSession session = CqlSession.builder().withConfigLoader(loader).build())
//     {
//         ResultSet rs = session.execute("select * from system_schema.keyspaces");
//         Row row = rs.one();
//         System.out.println(row.getString("keyspace_name"));
//     }catch(
//     Exception e)
//     {
//     }

// }}
