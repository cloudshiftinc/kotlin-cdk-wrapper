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
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ecs.LogDriver
import software.amazon.awscdk.services.ecs.ServiceConnectProps
import software.amazon.awscdk.services.ecs.ServiceConnectService

/**
 * Interface for Service Connect configuration.
 *
 * Example:
 * ```
 * Cluster cluster;
 * TaskDefinition taskDefinition;
 * FargateService customService = FargateService.Builder.create(this, "CustomizedService")
 * .cluster(cluster)
 * .taskDefinition(taskDefinition)
 * .serviceConnectConfiguration(ServiceConnectProps.builder()
 * .logDriver(LogDrivers.awsLogs(AwsLogDriverProps.builder()
 * .streamPrefix("sc-traffic")
 * .build()))
 * .services(List.of(ServiceConnectService.builder()
 * .portMappingName("api")
 * .dnsName("customized-api")
 * .port(80)
 * .ingressPortOverride(20040)
 * .discoveryName("custom")
 * .build()))
 * .build())
 * .build();
 * ```
 */
@CdkDslMarker
public class ServiceConnectPropsDsl {
    private val cdkBuilder: ServiceConnectProps.Builder = ServiceConnectProps.builder()

    private val _services: MutableList<ServiceConnectService> = mutableListOf()

    /** @param logDriver The log driver configuration to use for the Service Connect agent logs. */
    public fun logDriver(logDriver: LogDriver) {
        cdkBuilder.logDriver(logDriver)
    }

    /** @param namespace The cloudmap namespace to register this service into. */
    public fun namespace(namespace: String) {
        cdkBuilder.namespace(namespace)
    }

    /**
     * @param services The list of Services, including a port mapping, terse client alias, and
     *   optional intermediate DNS name. This property may be left blank if the current ECS service
     *   does not need to advertise any ports via Service Connect.
     */
    public fun services(services: ServiceConnectServiceDsl.() -> Unit) {
        _services.add(ServiceConnectServiceDsl().apply(services).build())
    }

    /**
     * @param services The list of Services, including a port mapping, terse client alias, and
     *   optional intermediate DNS name. This property may be left blank if the current ECS service
     *   does not need to advertise any ports via Service Connect.
     */
    public fun services(services: Collection<ServiceConnectService>) {
        _services.addAll(services)
    }

    public fun build(): ServiceConnectProps {
        if (_services.isNotEmpty()) cdkBuilder.services(_services)
        return cdkBuilder.build()
    }
}
