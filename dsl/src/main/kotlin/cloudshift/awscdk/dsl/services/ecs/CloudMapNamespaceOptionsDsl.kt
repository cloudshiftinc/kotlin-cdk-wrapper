@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.services.ec2.IVpc
import software.amazon.awscdk.services.ecs.CloudMapNamespaceOptions
import software.amazon.awscdk.services.servicediscovery.NamespaceType

/**
 * The options for creating an AWS Cloud Map namespace.
 *
 * Example:
 * ```
 * Cluster cluster;
 * TaskDefinition taskDefinition;
 * ContainerDefinitionOptions containerOptions;
 * ContainerDefinition container = taskDefinition.addContainer("MyContainer", containerOptions);
 * container.addPortMappings(PortMapping.builder()
 * .name("api")
 * .containerPort(8080)
 * .build());
 * cluster.addDefaultCloudMapNamespace(CloudMapNamespaceOptions.builder()
 * .name("local")
 * .build());
 * FargateService service = FargateService.Builder.create(this, "Service")
 * .cluster(cluster)
 * .taskDefinition(taskDefinition)
 * .serviceConnectConfiguration(ServiceConnectProps.builder()
 * .services(List.of(ServiceConnectService.builder()
 * .portMappingName("api")
 * .dnsName("http-api")
 * .port(80)
 * .build()))
 * .build())
 * .build();
 * ```
 */
@CdkDslMarker
public class CloudMapNamespaceOptionsDsl {
    private val cdkBuilder: CloudMapNamespaceOptions.Builder = CloudMapNamespaceOptions.builder()

    /** @param name The name of the namespace, such as example.com. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param type The type of CloudMap Namespace to create. */
    public fun type(type: NamespaceType) {
        cdkBuilder.type(type)
    }

    /**
     * @param useForServiceConnect This property specifies whether to set the provided namespace as
     *   the service connect default in the cluster properties.
     */
    public fun useForServiceConnect(useForServiceConnect: Boolean) {
        cdkBuilder.useForServiceConnect(useForServiceConnect)
    }

    /**
     * @param vpc The VPC to associate the namespace with. This property is required for private DNS
     *   namespaces.
     */
    public fun vpc(vpc: IVpc) {
        cdkBuilder.vpc(vpc)
    }

    public fun build(): CloudMapNamespaceOptions = cdkBuilder.build()
}
