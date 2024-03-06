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
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.IVpc
import software.amazon.awscdk.services.ecs.AddCapacityOptions
import software.amazon.awscdk.services.ecs.CloudMapNamespaceOptions
import software.amazon.awscdk.services.ecs.ClusterProps
import software.amazon.awscdk.services.ecs.ExecuteCommandConfiguration

/**
 * The properties used to define an ECS cluster.
 *
 * Example:
 * ```
 * Vpc vpc;
 * Cluster cluster = Cluster.Builder.create(this, "Cluster")
 * .vpc(vpc)
 * .build();
 * AutoScalingGroup autoScalingGroup = AutoScalingGroup.Builder.create(this, "ASG")
 * .vpc(vpc)
 * .instanceType(new InstanceType("t2.micro"))
 * .machineImage(EcsOptimizedImage.amazonLinux2())
 * .minCapacity(0)
 * .maxCapacity(100)
 * .build();
 * AsgCapacityProvider capacityProvider = AsgCapacityProvider.Builder.create(this,
 * "AsgCapacityProvider")
 * .autoScalingGroup(autoScalingGroup)
 * .instanceWarmupPeriod(300)
 * .build();
 * cluster.addAsgCapacityProvider(capacityProvider);
 * Ec2TaskDefinition taskDefinition = new Ec2TaskDefinition(this, "TaskDef");
 * taskDefinition.addContainer("web", ContainerDefinitionOptions.builder()
 * .image(ContainerImage.fromRegistry("amazon/amazon-ecs-sample"))
 * .memoryReservationMiB(256)
 * .build());
 * Ec2Service.Builder.create(this, "EC2Service")
 * .cluster(cluster)
 * .taskDefinition(taskDefinition)
 * .capacityProviderStrategies(List.of(CapacityProviderStrategy.builder()
 * .capacityProvider(capacityProvider.getCapacityProviderName())
 * .weight(1)
 * .build()))
 * .build();
 * ```
 */
@CdkDslMarker
public class ClusterPropsDsl {
    private val cdkBuilder: ClusterProps.Builder = ClusterProps.builder()

    /** @param capacity The ec2 capacity to add to the cluster. */
    public fun capacity(capacity: AddCapacityOptionsDsl.() -> Unit = {}) {
        val builder = AddCapacityOptionsDsl()
        builder.apply(capacity)
        cdkBuilder.capacity(builder.build())
    }

    /** @param capacity The ec2 capacity to add to the cluster. */
    public fun capacity(capacity: AddCapacityOptions) {
        cdkBuilder.capacity(capacity)
    }

    /** @param clusterName The name for the cluster. */
    public fun clusterName(clusterName: String) {
        cdkBuilder.clusterName(clusterName)
    }

    /**
     * @param containerInsights If true CloudWatch Container Insights will be enabled for the
     *   cluster.
     */
    public fun containerInsights(containerInsights: Boolean) {
        cdkBuilder.containerInsights(containerInsights)
    }

    /** @param defaultCloudMapNamespace The service discovery namespace created in this cluster. */
    public fun defaultCloudMapNamespace(
        defaultCloudMapNamespace: CloudMapNamespaceOptionsDsl.() -> Unit = {}
    ) {
        val builder = CloudMapNamespaceOptionsDsl()
        builder.apply(defaultCloudMapNamespace)
        cdkBuilder.defaultCloudMapNamespace(builder.build())
    }

    /** @param defaultCloudMapNamespace The service discovery namespace created in this cluster. */
    public fun defaultCloudMapNamespace(defaultCloudMapNamespace: CloudMapNamespaceOptions) {
        cdkBuilder.defaultCloudMapNamespace(defaultCloudMapNamespace)
    }

    /** @param enableFargateCapacityProviders Whether to enable Fargate Capacity Providers. */
    public fun enableFargateCapacityProviders(enableFargateCapacityProviders: Boolean) {
        cdkBuilder.enableFargateCapacityProviders(enableFargateCapacityProviders)
    }

    /** @param executeCommandConfiguration The execute command configuration for the cluster. */
    public fun executeCommandConfiguration(
        executeCommandConfiguration: ExecuteCommandConfigurationDsl.() -> Unit = {}
    ) {
        val builder = ExecuteCommandConfigurationDsl()
        builder.apply(executeCommandConfiguration)
        cdkBuilder.executeCommandConfiguration(builder.build())
    }

    /** @param executeCommandConfiguration The execute command configuration for the cluster. */
    public fun executeCommandConfiguration(
        executeCommandConfiguration: ExecuteCommandConfiguration
    ) {
        cdkBuilder.executeCommandConfiguration(executeCommandConfiguration)
    }

    /**
     * @param vpc The VPC where your ECS instances will be running or your ENIs will be deployed.
     */
    public fun vpc(vpc: IVpc) {
        cdkBuilder.vpc(vpc)
    }

    public fun build(): ClusterProps = cdkBuilder.build()
}
