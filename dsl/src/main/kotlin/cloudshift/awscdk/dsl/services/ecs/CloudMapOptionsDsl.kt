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
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.ecs.CloudMapOptions
import software.amazon.awscdk.services.ecs.ContainerDefinition
import software.amazon.awscdk.services.servicediscovery.DnsRecordType
import software.amazon.awscdk.services.servicediscovery.INamespace

/**
 * The options to enabling AWS Cloud Map for an Amazon ECS service.
 *
 * Example:
 * ```
 * TaskDefinition taskDefinition;
 * Cluster cluster;
 * Ec2Service service = Ec2Service.Builder.create(this, "Service")
 * .cluster(cluster)
 * .taskDefinition(taskDefinition)
 * .cloudMapOptions(CloudMapOptions.builder()
 * // Create A records - useful for AWSVPC network mode.
 * .dnsRecordType(DnsRecordType.A)
 * .build())
 * .build();
 * ```
 */
@CdkDslMarker
public class CloudMapOptionsDsl {
    private val cdkBuilder: CloudMapOptions.Builder = CloudMapOptions.builder()

    /**
     * @param cloudMapNamespace The service discovery namespace for the Cloud Map service to attach
     *   to the ECS service.
     */
    public fun cloudMapNamespace(cloudMapNamespace: INamespace) {
        cdkBuilder.cloudMapNamespace(cloudMapNamespace)
    }

    /** @param container The container to point to for a SRV record. */
    public fun container(container: ContainerDefinition) {
        cdkBuilder.container(container)
    }

    /** @param containerPort The port to point to for a SRV record. */
    public fun containerPort(containerPort: Number) {
        cdkBuilder.containerPort(containerPort)
    }

    /**
     * @param dnsRecordType The DNS record type that you want AWS Cloud Map to create. The supported
     *   record types are A or SRV.
     */
    public fun dnsRecordType(dnsRecordType: DnsRecordType) {
        cdkBuilder.dnsRecordType(dnsRecordType)
    }

    /**
     * @param dnsTtl The amount of time that you want DNS resolvers to cache the settings for this
     *   record.
     */
    public fun dnsTtl(dnsTtl: Duration) {
        cdkBuilder.dnsTtl(dnsTtl)
    }

    /**
     * @param failureThreshold The number of 30-second intervals that you want Cloud Map to wait
     *   after receiving an UpdateInstanceCustomHealthStatus request before it changes the health
     *   status of a service instance. NOTE: This is used for HealthCheckCustomConfig
     */
    public fun failureThreshold(failureThreshold: Number) {
        cdkBuilder.failureThreshold(failureThreshold)
    }

    /** @param name The name of the Cloud Map service to attach to the ECS service. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CloudMapOptions = cdkBuilder.build()
}
