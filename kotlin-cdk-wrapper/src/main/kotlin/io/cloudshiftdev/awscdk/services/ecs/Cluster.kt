@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.autoscaling.AutoScalingGroup
import io.cloudshiftdev.awscdk.services.autoscaling.IAutoScalingGroup
import io.cloudshiftdev.awscdk.services.cloudwatch.Metric
import io.cloudshiftdev.awscdk.services.cloudwatch.MetricOptions
import io.cloudshiftdev.awscdk.services.ec2.Connections
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.servicediscovery.INamespace
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * A regional grouping of one or more container instances on which you can run tasks and services.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.Tags;
 * Vpc vpc = Vpc.Builder.create(this, "Vpc").maxAzs(1).build();
 * Cluster cluster = Cluster.Builder.create(this, "EcsCluster").vpc(vpc).build();
 * FargateTaskDefinition taskDefinition = FargateTaskDefinition.Builder.create(this, "TaskDef")
 * .memoryLimitMiB(512)
 * .cpu(256)
 * .build();
 * taskDefinition.addContainer("WebContainer", ContainerDefinitionOptions.builder()
 * .image(ContainerImage.fromRegistry("amazon/amazon-ecs-sample"))
 * .build());
 * Tags.of(taskDefinition).add("my-tag", "my-tag-value");
 * ScheduledFargateTask scheduledFargateTask = ScheduledFargateTask.Builder.create(this,
 * "ScheduledFargateTask")
 * .cluster(cluster)
 * .taskDefinition(taskDefinition)
 * .schedule(Schedule.expression("rate(1 minute)"))
 * .propagateTags(PropagatedTagSource.TASK_DEFINITION)
 * .build();
 * ```
 */
public open class Cluster(
  cdkObject: software.amazon.awscdk.services.ecs.Cluster,
) : Resource(cdkObject), ICluster {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.ecs.Cluster(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: ClusterProps,
  ) :
      this(software.amazon.awscdk.services.ecs.Cluster(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(ClusterProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: ClusterProps.Builder.() -> Unit,
  ) : this(scope, id, ClusterProps(props)
  )

  /**
   * This method adds an Auto Scaling Group Capacity Provider to a cluster.
   *
   * @param provider the capacity provider to add to this cluster. 
   * @param options
   */
  public open fun addAsgCapacityProvider(provider: AsgCapacityProvider) {
    unwrap(this).addAsgCapacityProvider(provider.let(AsgCapacityProvider::unwrap))
  }

  /**
   * This method adds an Auto Scaling Group Capacity Provider to a cluster.
   *
   * @param provider the capacity provider to add to this cluster. 
   * @param options
   */
  public open fun addAsgCapacityProvider(provider: AsgCapacityProvider,
      options: AddAutoScalingGroupCapacityOptions) {
    unwrap(this).addAsgCapacityProvider(provider.let(AsgCapacityProvider::unwrap),
        options.let(AddAutoScalingGroupCapacityOptions::unwrap))
  }

  /**
   * This method adds an Auto Scaling Group Capacity Provider to a cluster.
   *
   * @param provider the capacity provider to add to this cluster. 
   * @param options
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("1c74a4478bede1d52015e9dc4bf676fe09fc1f0be1804838cfcf8e063da3af6d")
  public open fun addAsgCapacityProvider(provider: AsgCapacityProvider,
      options: AddAutoScalingGroupCapacityOptions.Builder.() -> Unit): Unit =
      addAsgCapacityProvider(provider, AddAutoScalingGroupCapacityOptions(options))

  /**
   * It is highly recommended to use `Cluster.addAsgCapacityProvider` instead of this method.
   *
   * This method adds compute capacity to a cluster by creating an AutoScalingGroup with the
   * specified options.
   *
   * Returns the AutoScalingGroup so you can add autoscaling settings to it.
   *
   * @param id 
   * @param options 
   */
  public open fun addCapacity(id: String, options: AddCapacityOptions): AutoScalingGroup =
      unwrap(this).addCapacity(id,
      options.let(AddCapacityOptions::unwrap)).let(AutoScalingGroup::wrap)

  /**
   * It is highly recommended to use `Cluster.addAsgCapacityProvider` instead of this method.
   *
   * This method adds compute capacity to a cluster by creating an AutoScalingGroup with the
   * specified options.
   *
   * Returns the AutoScalingGroup so you can add autoscaling settings to it.
   *
   * @param id 
   * @param options 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a2ea6c7c87f52c2eb69d478a48b59f7d56b2895a61e8468323013844476400cb")
  public open fun addCapacity(id: String, options: AddCapacityOptions.Builder.() -> Unit):
      AutoScalingGroup = addCapacity(id, AddCapacityOptions(options))

  /**
   * Add default capacity provider strategy for this cluster.
   *
   * @param defaultCapacityProviderStrategy cluster default capacity provider strategy. This takes
   * the form of a list of CapacityProviderStrategy objects. 
   */
  public open
      fun addDefaultCapacityProviderStrategy(defaultCapacityProviderStrategy: List<CapacityProviderStrategy>) {
    unwrap(this).addDefaultCapacityProviderStrategy(defaultCapacityProviderStrategy.map(CapacityProviderStrategy::unwrap))
  }

  /**
   * Add default capacity provider strategy for this cluster.
   *
   * @param defaultCapacityProviderStrategy cluster default capacity provider strategy. This takes
   * the form of a list of CapacityProviderStrategy objects. 
   */
  public open fun addDefaultCapacityProviderStrategy(vararg
      defaultCapacityProviderStrategy: CapacityProviderStrategy): Unit =
      addDefaultCapacityProviderStrategy(defaultCapacityProviderStrategy.toList())

  /**
   * Add an AWS Cloud Map DNS namespace for this cluster.
   *
   * NOTE: HttpNamespaces are supported only for use cases involving Service Connect. For use cases
   * involving both Service-
   * Discovery and Service Connect, customers should manage the HttpNamespace outside of the
   * Cluster.addDefaultCloudMapNamespace method.
   *
   * @param options 
   */
  public open fun addDefaultCloudMapNamespace(options: CloudMapNamespaceOptions): INamespace =
      unwrap(this).addDefaultCloudMapNamespace(options.let(CloudMapNamespaceOptions::unwrap)).let(INamespace::wrap)

  /**
   * Add an AWS Cloud Map DNS namespace for this cluster.
   *
   * NOTE: HttpNamespaces are supported only for use cases involving Service Connect. For use cases
   * involving both Service-
   * Discovery and Service Connect, customers should manage the HttpNamespace outside of the
   * Cluster.addDefaultCloudMapNamespace method.
   *
   * @param options 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ed70f7db87ce0166be021e27b40ff2ea1c055a2bd9664c7d70a82227c473e981")
  public open fun addDefaultCloudMapNamespace(options: CloudMapNamespaceOptions.Builder.() -> Unit):
      INamespace = addDefaultCloudMapNamespace(CloudMapNamespaceOptions(options))

  /**
   * Returns an ARN that represents all tasks within the cluster that match the task pattern
   * specified.
   *
   * To represent all tasks, specify `"*"`.
   *
   * @param keyPattern Task id pattern. 
   */
  public open fun arnForTasks(keyPattern: String): String = unwrap(this).arnForTasks(keyPattern)

  /**
   * Getter for autoscaling group added to cluster.
   */
  public override fun autoscalingGroup(): IAutoScalingGroup? =
      unwrap(this).getAutoscalingGroup()?.let(IAutoScalingGroup::wrap)

  /**
   * Getter for _capacityProviderNames added to cluster.
   */
  public open fun capacityProviderNames(): List<String> = unwrap(this).getCapacityProviderNames()

  /**
   * The Amazon Resource Name (ARN) that identifies the cluster.
   */
  public override fun clusterArn(): String = unwrap(this).getClusterArn()

  /**
   * The name of the cluster.
   */
  public override fun clusterName(): String = unwrap(this).getClusterName()

  /**
   * Manage the allowed network connections for the cluster with Security Groups.
   */
  public override fun connections(): Connections =
      unwrap(this).getConnections().let(Connections::wrap)

  /**
   * Getter for _defaultCapacityProviderStrategy.
   *
   * This is necessary to correctly create Capacity Provider Associations.
   */
  public open fun defaultCapacityProviderStrategy(): List<CapacityProviderStrategy> =
      unwrap(this).getDefaultCapacityProviderStrategy().map(CapacityProviderStrategy::wrap)

  /**
   * Getter for namespace added to cluster.
   */
  public override fun defaultCloudMapNamespace(): INamespace? =
      unwrap(this).getDefaultCloudMapNamespace()?.let(INamespace::wrap)

  /**
   * Enable the Fargate capacity providers for this cluster.
   */
  public open fun enableFargateCapacityProviders() {
    unwrap(this).enableFargateCapacityProviders()
  }

  /**
   * Getter for execute command configuration associated with the cluster.
   */
  public override fun executeCommandConfiguration(): ExecuteCommandConfiguration? =
      unwrap(this).getExecuteCommandConfiguration()?.let(ExecuteCommandConfiguration::wrap)

  /**
   * Grants an ECS Task Protection API permission to the specified grantee.
   *
   * This method provides a streamlined way to assign the 'ecs:UpdateTaskProtection'
   * permission, enabling the grantee to manage task protection in the ECS cluster.
   *
   * @param grantee The entity (e.g., IAM role or user) to grant the permissions to. 
   */
  public open fun grantTaskProtection(grantee: IGrantable): Grant =
      unwrap(this).grantTaskProtection(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

  /**
   * Whether the cluster has EC2 capacity associated with it.
   */
  public override fun hasEc2Capacity(): Boolean = unwrap(this).getHasEc2Capacity()

  /**
   * This method returns the specifed CloudWatch metric for this cluster.
   *
   * @param metricName 
   * @param props
   */
  public open fun metric(metricName: String): Metric =
      unwrap(this).metric(metricName).let(Metric::wrap)

  /**
   * This method returns the specifed CloudWatch metric for this cluster.
   *
   * @param metricName 
   * @param props
   */
  public open fun metric(metricName: String, props: MetricOptions): Metric =
      unwrap(this).metric(metricName, props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * This method returns the specifed CloudWatch metric for this cluster.
   *
   * @param metricName 
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("629ccc2b9ed0d0686ac72be3c432836a76a92f56ab45dae83dc2e318f17ba80c")
  public open fun metric(metricName: String, props: MetricOptions.Builder.() -> Unit): Metric =
      metric(metricName, MetricOptions(props))

  /**
   * This method returns the CloudWatch metric for this clusters CPU reservation.
   *
   * Default: average over 5 minutes
   *
   * @param props
   */
  public open fun metricCpuReservation(): Metric =
      unwrap(this).metricCpuReservation().let(Metric::wrap)

  /**
   * This method returns the CloudWatch metric for this clusters CPU reservation.
   *
   * Default: average over 5 minutes
   *
   * @param props
   */
  public open fun metricCpuReservation(props: MetricOptions): Metric =
      unwrap(this).metricCpuReservation(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * This method returns the CloudWatch metric for this clusters CPU reservation.
   *
   * Default: average over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b1cccb28a8fbf5b804bd79a934ea306a3f8e9603732c81019144c8647693f16f")
  public open fun metricCpuReservation(props: MetricOptions.Builder.() -> Unit): Metric =
      metricCpuReservation(MetricOptions(props))

  /**
   * This method returns the CloudWatch metric for this clusters CPU utilization.
   *
   * Default: average over 5 minutes
   *
   * @param props
   */
  public open fun metricCpuUtilization(): Metric =
      unwrap(this).metricCpuUtilization().let(Metric::wrap)

  /**
   * This method returns the CloudWatch metric for this clusters CPU utilization.
   *
   * Default: average over 5 minutes
   *
   * @param props
   */
  public open fun metricCpuUtilization(props: MetricOptions): Metric =
      unwrap(this).metricCpuUtilization(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * This method returns the CloudWatch metric for this clusters CPU utilization.
   *
   * Default: average over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("06a38048efcdd43000e7f66d74001004b818625d95136f460bf350a2397a31d0")
  public open fun metricCpuUtilization(props: MetricOptions.Builder.() -> Unit): Metric =
      metricCpuUtilization(MetricOptions(props))

  /**
   * This method returns the CloudWatch metric for this clusters memory reservation.
   *
   * Default: average over 5 minutes
   *
   * @param props
   */
  public open fun metricMemoryReservation(): Metric =
      unwrap(this).metricMemoryReservation().let(Metric::wrap)

  /**
   * This method returns the CloudWatch metric for this clusters memory reservation.
   *
   * Default: average over 5 minutes
   *
   * @param props
   */
  public open fun metricMemoryReservation(props: MetricOptions): Metric =
      unwrap(this).metricMemoryReservation(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * This method returns the CloudWatch metric for this clusters memory reservation.
   *
   * Default: average over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d18b296d9f033d318edae2425d2187f6d1a2e9d3d4df88141e3cf3bbe4407cd9")
  public open fun metricMemoryReservation(props: MetricOptions.Builder.() -> Unit): Metric =
      metricMemoryReservation(MetricOptions(props))

  /**
   * This method returns the CloudWatch metric for this clusters memory utilization.
   *
   * Default: average over 5 minutes
   *
   * @param props
   */
  public open fun metricMemoryUtilization(): Metric =
      unwrap(this).metricMemoryUtilization().let(Metric::wrap)

  /**
   * This method returns the CloudWatch metric for this clusters memory utilization.
   *
   * Default: average over 5 minutes
   *
   * @param props
   */
  public open fun metricMemoryUtilization(props: MetricOptions): Metric =
      unwrap(this).metricMemoryUtilization(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * This method returns the CloudWatch metric for this clusters memory utilization.
   *
   * Default: average over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("920fdd548a5bd9f6f382929d6f52aa6b867238ab20350ec7f65f1d26154d7844")
  public open fun metricMemoryUtilization(props: MetricOptions.Builder.() -> Unit): Metric =
      metricMemoryUtilization(MetricOptions(props))

  /**
   * The VPC associated with the cluster.
   */
  public override fun vpc(): IVpc = unwrap(this).getVpc().let(IVpc::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ecs.Cluster].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The ec2 capacity to add to the cluster.
     *
     * Default: - no EC2 capacity will be added, you can use `addCapacity` to add capacity later.
     *
     * @param capacity The ec2 capacity to add to the cluster. 
     */
    public fun capacity(capacity: AddCapacityOptions)

    /**
     * The ec2 capacity to add to the cluster.
     *
     * Default: - no EC2 capacity will be added, you can use `addCapacity` to add capacity later.
     *
     * @param capacity The ec2 capacity to add to the cluster. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1747d0a15bfbde19321a2d8d7aab5ad188daf08bbad720ff8cd78f71bc5d0c30")
    public fun capacity(capacity: AddCapacityOptions.Builder.() -> Unit)

    /**
     * The name for the cluster.
     *
     * Default: CloudFormation-generated name
     *
     * @param clusterName The name for the cluster. 
     */
    public fun clusterName(clusterName: String)

    /**
     * If true CloudWatch Container Insights will be enabled for the cluster.
     *
     * Default: - Container Insights will be disabled for this cluster.
     *
     * @param containerInsights If true CloudWatch Container Insights will be enabled for the
     * cluster. 
     */
    public fun containerInsights(containerInsights: Boolean)

    /**
     * The service discovery namespace created in this cluster.
     *
     * Default: - no service discovery namespace created, you can use `addDefaultCloudMapNamespace`
     * to add a
     * default service discovery namespace later.
     *
     * @param defaultCloudMapNamespace The service discovery namespace created in this cluster. 
     */
    public fun defaultCloudMapNamespace(defaultCloudMapNamespace: CloudMapNamespaceOptions)

    /**
     * The service discovery namespace created in this cluster.
     *
     * Default: - no service discovery namespace created, you can use `addDefaultCloudMapNamespace`
     * to add a
     * default service discovery namespace later.
     *
     * @param defaultCloudMapNamespace The service discovery namespace created in this cluster. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("86fad33d93456dd392654e74eedbe276ef8687f3da3062b59797356804ca9d7d")
    public
        fun defaultCloudMapNamespace(defaultCloudMapNamespace: CloudMapNamespaceOptions.Builder.() -> Unit)

    /**
     * Whether to enable Fargate Capacity Providers.
     *
     * Default: false
     *
     * @param enableFargateCapacityProviders Whether to enable Fargate Capacity Providers. 
     */
    public fun enableFargateCapacityProviders(enableFargateCapacityProviders: Boolean)

    /**
     * The execute command configuration for the cluster.
     *
     * Default: - no configuration will be provided.
     *
     * @param executeCommandConfiguration The execute command configuration for the cluster. 
     */
    public fun executeCommandConfiguration(executeCommandConfiguration: ExecuteCommandConfiguration)

    /**
     * The execute command configuration for the cluster.
     *
     * Default: - no configuration will be provided.
     *
     * @param executeCommandConfiguration The execute command configuration for the cluster. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f0f4f83939edf7aed5681a9f9f8be14a1bb3bcc72ded205cab8950d1b23aed33")
    public
        fun executeCommandConfiguration(executeCommandConfiguration: ExecuteCommandConfiguration.Builder.() -> Unit)

    /**
     * The VPC where your ECS instances will be running or your ENIs will be deployed.
     *
     * Default: - creates a new VPC with two AZs
     *
     * @param vpc The VPC where your ECS instances will be running or your ENIs will be deployed. 
     */
    public fun vpc(vpc: IVpc)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.Cluster.Builder =
        software.amazon.awscdk.services.ecs.Cluster.Builder.create(scope, id)

    /**
     * The ec2 capacity to add to the cluster.
     *
     * Default: - no EC2 capacity will be added, you can use `addCapacity` to add capacity later.
     *
     * @param capacity The ec2 capacity to add to the cluster. 
     */
    override fun capacity(capacity: AddCapacityOptions) {
      cdkBuilder.capacity(capacity.let(AddCapacityOptions::unwrap))
    }

    /**
     * The ec2 capacity to add to the cluster.
     *
     * Default: - no EC2 capacity will be added, you can use `addCapacity` to add capacity later.
     *
     * @param capacity The ec2 capacity to add to the cluster. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1747d0a15bfbde19321a2d8d7aab5ad188daf08bbad720ff8cd78f71bc5d0c30")
    override fun capacity(capacity: AddCapacityOptions.Builder.() -> Unit): Unit =
        capacity(AddCapacityOptions(capacity))

    /**
     * The name for the cluster.
     *
     * Default: CloudFormation-generated name
     *
     * @param clusterName The name for the cluster. 
     */
    override fun clusterName(clusterName: String) {
      cdkBuilder.clusterName(clusterName)
    }

    /**
     * If true CloudWatch Container Insights will be enabled for the cluster.
     *
     * Default: - Container Insights will be disabled for this cluster.
     *
     * @param containerInsights If true CloudWatch Container Insights will be enabled for the
     * cluster. 
     */
    override fun containerInsights(containerInsights: Boolean) {
      cdkBuilder.containerInsights(containerInsights)
    }

    /**
     * The service discovery namespace created in this cluster.
     *
     * Default: - no service discovery namespace created, you can use `addDefaultCloudMapNamespace`
     * to add a
     * default service discovery namespace later.
     *
     * @param defaultCloudMapNamespace The service discovery namespace created in this cluster. 
     */
    override fun defaultCloudMapNamespace(defaultCloudMapNamespace: CloudMapNamespaceOptions) {
      cdkBuilder.defaultCloudMapNamespace(defaultCloudMapNamespace.let(CloudMapNamespaceOptions::unwrap))
    }

    /**
     * The service discovery namespace created in this cluster.
     *
     * Default: - no service discovery namespace created, you can use `addDefaultCloudMapNamespace`
     * to add a
     * default service discovery namespace later.
     *
     * @param defaultCloudMapNamespace The service discovery namespace created in this cluster. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("86fad33d93456dd392654e74eedbe276ef8687f3da3062b59797356804ca9d7d")
    override
        fun defaultCloudMapNamespace(defaultCloudMapNamespace: CloudMapNamespaceOptions.Builder.() -> Unit):
        Unit = defaultCloudMapNamespace(CloudMapNamespaceOptions(defaultCloudMapNamespace))

    /**
     * Whether to enable Fargate Capacity Providers.
     *
     * Default: false
     *
     * @param enableFargateCapacityProviders Whether to enable Fargate Capacity Providers. 
     */
    override fun enableFargateCapacityProviders(enableFargateCapacityProviders: Boolean) {
      cdkBuilder.enableFargateCapacityProviders(enableFargateCapacityProviders)
    }

    /**
     * The execute command configuration for the cluster.
     *
     * Default: - no configuration will be provided.
     *
     * @param executeCommandConfiguration The execute command configuration for the cluster. 
     */
    override
        fun executeCommandConfiguration(executeCommandConfiguration: ExecuteCommandConfiguration) {
      cdkBuilder.executeCommandConfiguration(executeCommandConfiguration.let(ExecuteCommandConfiguration::unwrap))
    }

    /**
     * The execute command configuration for the cluster.
     *
     * Default: - no configuration will be provided.
     *
     * @param executeCommandConfiguration The execute command configuration for the cluster. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f0f4f83939edf7aed5681a9f9f8be14a1bb3bcc72ded205cab8950d1b23aed33")
    override
        fun executeCommandConfiguration(executeCommandConfiguration: ExecuteCommandConfiguration.Builder.() -> Unit):
        Unit = executeCommandConfiguration(ExecuteCommandConfiguration(executeCommandConfiguration))

    /**
     * The VPC where your ECS instances will be running or your ENIs will be deployed.
     *
     * Default: - creates a new VPC with two AZs
     *
     * @param vpc The VPC where your ECS instances will be running or your ENIs will be deployed. 
     */
    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ecs.Cluster = cdkBuilder.build()
  }

  public companion object {
    public fun fromClusterArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      clusterArn: String,
    ): ICluster =
        software.amazon.awscdk.services.ecs.Cluster.fromClusterArn(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, clusterArn).let(ICluster::wrap)

    public fun fromClusterAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: ClusterAttributes,
    ): ICluster =
        software.amazon.awscdk.services.ecs.Cluster.fromClusterAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(ClusterAttributes::unwrap)).let(ICluster::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("54fbf9e293c46c81fc7b01109faa86bd7c632a14b9eee35f533a39b6ecf90964")
    public fun fromClusterAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: ClusterAttributes.Builder.() -> Unit,
    ): ICluster = fromClusterAttributes(scope, id, ClusterAttributes(attrs))

    public fun isCluster(x: Any): Boolean = software.amazon.awscdk.services.ecs.Cluster.isCluster(x)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): Cluster {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return Cluster(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.Cluster): Cluster =
        Cluster(cdkObject)

    internal fun unwrap(wrapped: Cluster): software.amazon.awscdk.services.ecs.Cluster =
        wrapped.cdkObject as software.amazon.awscdk.services.ecs.Cluster
  }
}
