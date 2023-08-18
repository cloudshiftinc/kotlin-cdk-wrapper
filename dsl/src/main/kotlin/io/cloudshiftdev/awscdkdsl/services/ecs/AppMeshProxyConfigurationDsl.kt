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

package io.cloudshiftdev.awscdkdsl.services.ecs

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ecs.AppMeshProxyConfiguration
import software.amazon.awscdk.services.ecs.AppMeshProxyConfigurationProps

/**
 * The class for App Mesh proxy configurations.
 *
 * For tasks using the EC2 launch type, the container instances require at least version 1.26.0 of
 * the container agent and at least version 1.26.0-1 of the ecs-init package to enable a proxy
 * configuration. If your container instances are launched from the Amazon ECS-optimized AMI version
 * 20190301 or later, then they contain the required versions of the container agent and ecs-init.
 * For more information, see
 * [Amazon ECS-optimized AMIs](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html).
 *
 * For tasks using the Fargate launch type, the task or service requires platform version 1.3.0 or
 * later.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ecs.*;
 * AppMeshProxyConfiguration appMeshProxyConfiguration = AppMeshProxyConfiguration.Builder.create()
 * .containerName("containerName")
 * .properties(AppMeshProxyConfigurationProps.builder()
 * .appPorts(List.of(123))
 * .proxyEgressPort(123)
 * .proxyIngressPort(123)
 * // the properties below are optional
 * .egressIgnoredIPs(List.of("egressIgnoredIPs"))
 * .egressIgnoredPorts(List.of(123))
 * .ignoredGID(123)
 * .ignoredUID(123)
 * .build())
 * .build();
 * ```
 */
@CdkDslMarker
public class AppMeshProxyConfigurationDsl {
    private val cdkBuilder: AppMeshProxyConfiguration.Builder =
        AppMeshProxyConfiguration.Builder.create()

    /**
     * The name of the container that will serve as the App Mesh proxy.
     *
     * @param containerName The name of the container that will serve as the App Mesh proxy.
     */
    public fun containerName(containerName: String) {
        cdkBuilder.containerName(containerName)
    }

    /**
     * The set of network configuration parameters to provide the Container Network Interface (CNI)
     * plugin.
     *
     * @param properties The set of network configuration parameters to provide the Container
     *   Network Interface (CNI) plugin.
     */
    public fun properties(properties: AppMeshProxyConfigurationPropsDsl.() -> Unit = {}) {
        val builder = AppMeshProxyConfigurationPropsDsl()
        builder.apply(properties)
        cdkBuilder.properties(builder.build())
    }

    /**
     * The set of network configuration parameters to provide the Container Network Interface (CNI)
     * plugin.
     *
     * @param properties The set of network configuration parameters to provide the Container
     *   Network Interface (CNI) plugin.
     */
    public fun properties(properties: AppMeshProxyConfigurationProps) {
        cdkBuilder.properties(properties)
    }

    public fun build(): AppMeshProxyConfiguration = cdkBuilder.build()
}
