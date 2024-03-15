@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * The properties used to define an ECS cluster.
 *
 * Example:
 *
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
public interface ClusterProps {
  /**
   * The ec2 capacity to add to the cluster.
   *
   * Default: - no EC2 capacity will be added, you can use `addCapacity` to add capacity later.
   */
  public fun capacity(): AddCapacityOptions? =
      unwrap(this).getCapacity()?.let(AddCapacityOptions::wrap)

  /**
   * The name for the cluster.
   *
   * Default: CloudFormation-generated name
   */
  public fun clusterName(): String? = unwrap(this).getClusterName()

  /**
   * If true CloudWatch Container Insights will be enabled for the cluster.
   *
   * Default: - Container Insights will be disabled for this cluster.
   */
  public fun containerInsights(): Boolean? = unwrap(this).getContainerInsights()

  /**
   * The service discovery namespace created in this cluster.
   *
   * Default: - no service discovery namespace created, you can use `addDefaultCloudMapNamespace` to
   * add a
   * default service discovery namespace later.
   */
  public fun defaultCloudMapNamespace(): CloudMapNamespaceOptions? =
      unwrap(this).getDefaultCloudMapNamespace()?.let(CloudMapNamespaceOptions::wrap)

  /**
   * Whether to enable Fargate Capacity Providers.
   *
   * Default: false
   */
  public fun enableFargateCapacityProviders(): Boolean? =
      unwrap(this).getEnableFargateCapacityProviders()

  /**
   * The execute command configuration for the cluster.
   *
   * Default: - no configuration will be provided.
   */
  public fun executeCommandConfiguration(): ExecuteCommandConfiguration? =
      unwrap(this).getExecuteCommandConfiguration()?.let(ExecuteCommandConfiguration::wrap)

  /**
   * The VPC where your ECS instances will be running or your ENIs will be deployed.
   *
   * Default: - creates a new VPC with two AZs
   */
  public fun vpc(): IVpc? = unwrap(this).getVpc()?.let(IVpc::wrap)

  /**
   * A builder for [ClusterProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param capacity The ec2 capacity to add to the cluster.
     */
    public fun capacity(capacity: AddCapacityOptions)

    /**
     * @param capacity The ec2 capacity to add to the cluster.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e051d48f3e89d80105be7002b335624e9e9f3b64eab963d8e54a67e555234f2f")
    public fun capacity(capacity: AddCapacityOptions.Builder.() -> Unit)

    /**
     * @param clusterName The name for the cluster.
     */
    public fun clusterName(clusterName: String)

    /**
     * @param containerInsights If true CloudWatch Container Insights will be enabled for the
     * cluster.
     */
    public fun containerInsights(containerInsights: Boolean)

    /**
     * @param defaultCloudMapNamespace The service discovery namespace created in this cluster.
     */
    public fun defaultCloudMapNamespace(defaultCloudMapNamespace: CloudMapNamespaceOptions)

    /**
     * @param defaultCloudMapNamespace The service discovery namespace created in this cluster.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("817e6e3d8baef1343d89633646695d178af990df11e3f918d69afb0fe94ee717")
    public
        fun defaultCloudMapNamespace(defaultCloudMapNamespace: CloudMapNamespaceOptions.Builder.() -> Unit)

    /**
     * @param enableFargateCapacityProviders Whether to enable Fargate Capacity Providers.
     */
    public fun enableFargateCapacityProviders(enableFargateCapacityProviders: Boolean)

    /**
     * @param executeCommandConfiguration The execute command configuration for the cluster.
     */
    public fun executeCommandConfiguration(executeCommandConfiguration: ExecuteCommandConfiguration)

    /**
     * @param executeCommandConfiguration The execute command configuration for the cluster.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7a84c57c81ae5d4feff639ad2768bf3ee1d0413198a625692cd77e859750443c")
    public
        fun executeCommandConfiguration(executeCommandConfiguration: ExecuteCommandConfiguration.Builder.() -> Unit)

    /**
     * @param vpc The VPC where your ECS instances will be running or your ENIs will be deployed.
     */
    public fun vpc(vpc: IVpc)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.ClusterProps.Builder =
        software.amazon.awscdk.services.ecs.ClusterProps.builder()

    /**
     * @param capacity The ec2 capacity to add to the cluster.
     */
    override fun capacity(capacity: AddCapacityOptions) {
      cdkBuilder.capacity(capacity.let(AddCapacityOptions::unwrap))
    }

    /**
     * @param capacity The ec2 capacity to add to the cluster.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e051d48f3e89d80105be7002b335624e9e9f3b64eab963d8e54a67e555234f2f")
    override fun capacity(capacity: AddCapacityOptions.Builder.() -> Unit): Unit =
        capacity(AddCapacityOptions(capacity))

    /**
     * @param clusterName The name for the cluster.
     */
    override fun clusterName(clusterName: String) {
      cdkBuilder.clusterName(clusterName)
    }

    /**
     * @param containerInsights If true CloudWatch Container Insights will be enabled for the
     * cluster.
     */
    override fun containerInsights(containerInsights: Boolean) {
      cdkBuilder.containerInsights(containerInsights)
    }

    /**
     * @param defaultCloudMapNamespace The service discovery namespace created in this cluster.
     */
    override fun defaultCloudMapNamespace(defaultCloudMapNamespace: CloudMapNamespaceOptions) {
      cdkBuilder.defaultCloudMapNamespace(defaultCloudMapNamespace.let(CloudMapNamespaceOptions::unwrap))
    }

    /**
     * @param defaultCloudMapNamespace The service discovery namespace created in this cluster.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("817e6e3d8baef1343d89633646695d178af990df11e3f918d69afb0fe94ee717")
    override
        fun defaultCloudMapNamespace(defaultCloudMapNamespace: CloudMapNamespaceOptions.Builder.() -> Unit):
        Unit = defaultCloudMapNamespace(CloudMapNamespaceOptions(defaultCloudMapNamespace))

    /**
     * @param enableFargateCapacityProviders Whether to enable Fargate Capacity Providers.
     */
    override fun enableFargateCapacityProviders(enableFargateCapacityProviders: Boolean) {
      cdkBuilder.enableFargateCapacityProviders(enableFargateCapacityProviders)
    }

    /**
     * @param executeCommandConfiguration The execute command configuration for the cluster.
     */
    override
        fun executeCommandConfiguration(executeCommandConfiguration: ExecuteCommandConfiguration) {
      cdkBuilder.executeCommandConfiguration(executeCommandConfiguration.let(ExecuteCommandConfiguration::unwrap))
    }

    /**
     * @param executeCommandConfiguration The execute command configuration for the cluster.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7a84c57c81ae5d4feff639ad2768bf3ee1d0413198a625692cd77e859750443c")
    override
        fun executeCommandConfiguration(executeCommandConfiguration: ExecuteCommandConfiguration.Builder.() -> Unit):
        Unit = executeCommandConfiguration(ExecuteCommandConfiguration(executeCommandConfiguration))

    /**
     * @param vpc The VPC where your ECS instances will be running or your ENIs will be deployed.
     */
    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ecs.ClusterProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ecs.ClusterProps,
  ) : CdkObject(cdkObject), ClusterProps {
    /**
     * The ec2 capacity to add to the cluster.
     *
     * Default: - no EC2 capacity will be added, you can use `addCapacity` to add capacity later.
     */
    override fun capacity(): AddCapacityOptions? =
        unwrap(this).getCapacity()?.let(AddCapacityOptions::wrap)

    /**
     * The name for the cluster.
     *
     * Default: CloudFormation-generated name
     */
    override fun clusterName(): String? = unwrap(this).getClusterName()

    /**
     * If true CloudWatch Container Insights will be enabled for the cluster.
     *
     * Default: - Container Insights will be disabled for this cluster.
     */
    override fun containerInsights(): Boolean? = unwrap(this).getContainerInsights()

    /**
     * The service discovery namespace created in this cluster.
     *
     * Default: - no service discovery namespace created, you can use `addDefaultCloudMapNamespace`
     * to add a
     * default service discovery namespace later.
     */
    override fun defaultCloudMapNamespace(): CloudMapNamespaceOptions? =
        unwrap(this).getDefaultCloudMapNamespace()?.let(CloudMapNamespaceOptions::wrap)

    /**
     * Whether to enable Fargate Capacity Providers.
     *
     * Default: false
     */
    override fun enableFargateCapacityProviders(): Boolean? =
        unwrap(this).getEnableFargateCapacityProviders()

    /**
     * The execute command configuration for the cluster.
     *
     * Default: - no configuration will be provided.
     */
    override fun executeCommandConfiguration(): ExecuteCommandConfiguration? =
        unwrap(this).getExecuteCommandConfiguration()?.let(ExecuteCommandConfiguration::wrap)

    /**
     * The VPC where your ECS instances will be running or your ENIs will be deployed.
     *
     * Default: - creates a new VPC with two AZs
     */
    override fun vpc(): IVpc? = unwrap(this).getVpc()?.let(IVpc::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ClusterProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.ClusterProps): ClusterProps =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ClusterProps): software.amazon.awscdk.services.ecs.ClusterProps =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.ecs.ClusterProps
  }
}
