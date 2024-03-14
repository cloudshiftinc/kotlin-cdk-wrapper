package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.Resource
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
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class Cluster internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ecs.Cluster,
) : Resource(cdkObject), ICluster {
  public open fun addAsgCapacityProvider(provider: AsgCapacityProvider) {
    unwrap(this).addAsgCapacityProvider(provider.let(AsgCapacityProvider::unwrap))
  }

  public open fun addAsgCapacityProvider(provider: AsgCapacityProvider,
      options: AddAutoScalingGroupCapacityOptions) {
    unwrap(this).addAsgCapacityProvider(provider.let(AsgCapacityProvider::unwrap),
        options.let(AddAutoScalingGroupCapacityOptions::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("1c74a4478bede1d52015e9dc4bf676fe09fc1f0be1804838cfcf8e063da3af6d")
  public open fun addAsgCapacityProvider(provider: AsgCapacityProvider,
      options: AddAutoScalingGroupCapacityOptions.Builder.() -> Unit): Unit =
      addAsgCapacityProvider(provider, AddAutoScalingGroupCapacityOptions(options))

  public open fun addCapacity(id: String, options: AddCapacityOptions): AutoScalingGroup =
      unwrap(this).addCapacity(id,
      options.let(AddCapacityOptions::unwrap)).let(AutoScalingGroup::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a2ea6c7c87f52c2eb69d478a48b59f7d56b2895a61e8468323013844476400cb")
  public open fun addCapacity(id: String, options: AddCapacityOptions.Builder.() -> Unit):
      AutoScalingGroup = addCapacity(id, AddCapacityOptions(options))

  public open
      fun addDefaultCapacityProviderStrategy(defaultCapacityProviderStrategy: List<CapacityProviderStrategy>) {
    unwrap(this).addDefaultCapacityProviderStrategy(defaultCapacityProviderStrategy.map(CapacityProviderStrategy::unwrap))
  }

  public open fun addDefaultCloudMapNamespace(options: CloudMapNamespaceOptions): INamespace =
      unwrap(this).addDefaultCloudMapNamespace(options.let(CloudMapNamespaceOptions::unwrap)).let(INamespace::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ed70f7db87ce0166be021e27b40ff2ea1c055a2bd9664c7d70a82227c473e981")
  public open fun addDefaultCloudMapNamespace(options: CloudMapNamespaceOptions.Builder.() -> Unit):
      INamespace = addDefaultCloudMapNamespace(CloudMapNamespaceOptions(options))

  public open fun arnForTasks(keyPattern: String): String = unwrap(this).arnForTasks(keyPattern)

  public override fun autoscalingGroup(): IAutoScalingGroup? =
      unwrap(this).getAutoscalingGroup()?.let(IAutoScalingGroup::wrap)

  public open fun capacityProviderNames(): List<String> = unwrap(this).getCapacityProviderNames() ?:
      emptyList()

  public override fun clusterArn(): String = unwrap(this).getClusterArn()

  public override fun clusterName(): String = unwrap(this).getClusterName()

  public override fun connections(): Connections =
      unwrap(this).getConnections().let(Connections::wrap)

  public open fun defaultCapacityProviderStrategy(): List<CapacityProviderStrategy> =
      unwrap(this).getDefaultCapacityProviderStrategy().map(CapacityProviderStrategy::wrap)

  public override fun defaultCloudMapNamespace(): INamespace? =
      unwrap(this).getDefaultCloudMapNamespace()?.let(INamespace::wrap)

  public open fun enableFargateCapacityProviders() {
    unwrap(this).enableFargateCapacityProviders()
  }

  public override fun executeCommandConfiguration(): ExecuteCommandConfiguration? =
      unwrap(this).getExecuteCommandConfiguration()?.let(ExecuteCommandConfiguration::wrap)

  public open fun grantTaskProtection(grantee: IGrantable): Grant =
      unwrap(this).grantTaskProtection(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

  public override fun hasEc2Capacity(): Boolean = unwrap(this).getHasEc2Capacity()

  public open fun metric(metricName: String): Metric =
      unwrap(this).metric(metricName).let(Metric::wrap)

  public open fun metric(metricName: String, props: MetricOptions): Metric =
      unwrap(this).metric(metricName, props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("629ccc2b9ed0d0686ac72be3c432836a76a92f56ab45dae83dc2e318f17ba80c")
  public open fun metric(metricName: String, props: MetricOptions.Builder.() -> Unit): Metric =
      metric(metricName, MetricOptions(props))

  public open fun metricCpuReservation(): Metric =
      unwrap(this).metricCpuReservation().let(Metric::wrap)

  public open fun metricCpuReservation(props: MetricOptions): Metric =
      unwrap(this).metricCpuReservation(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b1cccb28a8fbf5b804bd79a934ea306a3f8e9603732c81019144c8647693f16f")
  public open fun metricCpuReservation(props: MetricOptions.Builder.() -> Unit): Metric =
      metricCpuReservation(MetricOptions(props))

  public open fun metricCpuUtilization(): Metric =
      unwrap(this).metricCpuUtilization().let(Metric::wrap)

  public open fun metricCpuUtilization(props: MetricOptions): Metric =
      unwrap(this).metricCpuUtilization(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("06a38048efcdd43000e7f66d74001004b818625d95136f460bf350a2397a31d0")
  public open fun metricCpuUtilization(props: MetricOptions.Builder.() -> Unit): Metric =
      metricCpuUtilization(MetricOptions(props))

  public open fun metricMemoryReservation(): Metric =
      unwrap(this).metricMemoryReservation().let(Metric::wrap)

  public open fun metricMemoryReservation(props: MetricOptions): Metric =
      unwrap(this).metricMemoryReservation(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d18b296d9f033d318edae2425d2187f6d1a2e9d3d4df88141e3cf3bbe4407cd9")
  public open fun metricMemoryReservation(props: MetricOptions.Builder.() -> Unit): Metric =
      metricMemoryReservation(MetricOptions(props))

  public open fun metricMemoryUtilization(): Metric =
      unwrap(this).metricMemoryUtilization().let(Metric::wrap)

  public open fun metricMemoryUtilization(props: MetricOptions): Metric =
      unwrap(this).metricMemoryUtilization(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("920fdd548a5bd9f6f382929d6f52aa6b867238ab20350ec7f65f1d26154d7844")
  public open fun metricMemoryUtilization(props: MetricOptions.Builder.() -> Unit): Metric =
      metricMemoryUtilization(MetricOptions(props))

  public override fun vpc(): IVpc = unwrap(this).getVpc().let(IVpc::wrap)

  public interface Builder {
    public fun capacity(capacity: AddCapacityOptions) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1747d0a15bfbde19321a2d8d7aab5ad188daf08bbad720ff8cd78f71bc5d0c30")
    public fun capacity(capacity: AddCapacityOptions.Builder.() -> Unit) {
    }

    public fun clusterName(clusterName: String) {
    }

    public fun containerInsights(containerInsights: Boolean) {
    }

    public fun defaultCloudMapNamespace(defaultCloudMapNamespace: CloudMapNamespaceOptions) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("86fad33d93456dd392654e74eedbe276ef8687f3da3062b59797356804ca9d7d")
    public
        fun defaultCloudMapNamespace(defaultCloudMapNamespace: CloudMapNamespaceOptions.Builder.() -> Unit) {
    }

    public fun enableFargateCapacityProviders(enableFargateCapacityProviders: Boolean) {
    }

    public
        fun executeCommandConfiguration(executeCommandConfiguration: ExecuteCommandConfiguration) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f0f4f83939edf7aed5681a9f9f8be14a1bb3bcc72ded205cab8950d1b23aed33")
    public
        fun executeCommandConfiguration(executeCommandConfiguration: ExecuteCommandConfiguration.Builder.() -> Unit) {
    }

    public fun vpc(vpc: IVpc) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.Cluster.Builder =
        software.amazon.awscdk.services.ecs.Cluster.Builder.create(scope, id)

    public override fun capacity(capacity: AddCapacityOptions) {
      cdkBuilder.capacity(capacity.let(AddCapacityOptions::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1747d0a15bfbde19321a2d8d7aab5ad188daf08bbad720ff8cd78f71bc5d0c30")
    public override fun capacity(capacity: AddCapacityOptions.Builder.() -> Unit): Unit =
        capacity(AddCapacityOptions(capacity))

    public override fun clusterName(clusterName: String) {
      cdkBuilder.clusterName(clusterName)
    }

    public override fun containerInsights(containerInsights: Boolean) {
      cdkBuilder.containerInsights(containerInsights)
    }

    public override
        fun defaultCloudMapNamespace(defaultCloudMapNamespace: CloudMapNamespaceOptions) {
      cdkBuilder.defaultCloudMapNamespace(defaultCloudMapNamespace.let(CloudMapNamespaceOptions::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("86fad33d93456dd392654e74eedbe276ef8687f3da3062b59797356804ca9d7d")
    public override
        fun defaultCloudMapNamespace(defaultCloudMapNamespace: CloudMapNamespaceOptions.Builder.() -> Unit):
        Unit = defaultCloudMapNamespace(CloudMapNamespaceOptions(defaultCloudMapNamespace))

    public override fun enableFargateCapacityProviders(enableFargateCapacityProviders: Boolean) {
      cdkBuilder.enableFargateCapacityProviders(enableFargateCapacityProviders)
    }

    public override
        fun executeCommandConfiguration(executeCommandConfiguration: ExecuteCommandConfiguration) {
      cdkBuilder.executeCommandConfiguration(executeCommandConfiguration.let(ExecuteCommandConfiguration::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f0f4f83939edf7aed5681a9f9f8be14a1bb3bcc72ded205cab8950d1b23aed33")
    public override
        fun executeCommandConfiguration(executeCommandConfiguration: ExecuteCommandConfiguration.Builder.() -> Unit):
        Unit = executeCommandConfiguration(ExecuteCommandConfiguration(executeCommandConfiguration))

    public override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ecs.Cluster = cdkBuilder.build()
  }

  public companion object {
    public open fun fromClusterArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      clusterArn: String,
    ): ICluster =
        software.amazon.awscdk.services.ecs.Cluster.fromClusterArn(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, clusterArn).let(ICluster::wrap)

    public open fun fromClusterAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: ClusterAttributes,
    ): ICluster =
        software.amazon.awscdk.services.ecs.Cluster.fromClusterAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(ClusterAttributes::unwrap)).let(ICluster::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("54fbf9e293c46c81fc7b01109faa86bd7c632a14b9eee35f533a39b6ecf90964")
    public open fun fromClusterAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: ClusterAttributes.Builder.() -> Unit,
    ): ICluster = fromClusterAttributes(scope, id, ClusterAttributes(attrs))

    public open fun isCluster(x: Any): Boolean =
        software.amazon.awscdk.services.ecs.Cluster.isCluster(x)

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
        wrapped.cdkObject
  }
}
