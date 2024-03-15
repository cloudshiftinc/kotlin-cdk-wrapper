@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs.patterns

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ecs.CloudMapOptions
import io.cloudshiftdev.awscdk.services.ecs.ICluster
import io.cloudshiftdev.awscdk.services.ecs.PropagatedTagSource
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface ApplicationMultipleTargetGroupsServiceBaseProps {
  public fun cloudMapOptions(): CloudMapOptions? =
      unwrap(this).getCloudMapOptions()?.let(CloudMapOptions::wrap)

  public fun cluster(): ICluster? = unwrap(this).getCluster()?.let(ICluster::wrap)

  public fun desiredCount(): Number? = unwrap(this).getDesiredCount()

  public fun enableEcsManagedTags(): Boolean? = unwrap(this).getEnableECSManagedTags()

  public fun enableExecuteCommand(): Boolean? = unwrap(this).getEnableExecuteCommand()

  public fun healthCheckGracePeriod(): Duration? =
      unwrap(this).getHealthCheckGracePeriod()?.let(Duration::wrap)

  public fun loadBalancers(): List<ApplicationLoadBalancerProps> =
      unwrap(this).getLoadBalancers()?.map(ApplicationLoadBalancerProps::wrap) ?: emptyList()

  public fun propagateTags(): PropagatedTagSource? =
      unwrap(this).getPropagateTags()?.let(PropagatedTagSource::wrap)

  public fun serviceName(): String? = unwrap(this).getServiceName()

  public fun targetGroups(): List<ApplicationTargetProps> =
      unwrap(this).getTargetGroups()?.map(ApplicationTargetProps::wrap) ?: emptyList()

  public fun taskImageOptions(): ApplicationLoadBalancedTaskImageProps? =
      unwrap(this).getTaskImageOptions()?.let(ApplicationLoadBalancedTaskImageProps::wrap)

  public fun vpc(): IVpc? = unwrap(this).getVpc()?.let(IVpc::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun cloudMapOptions(cloudMapOptions: CloudMapOptions)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("098bcfe6e487ac472a11a4102683ddb20eb5dc694fbfbe26288f3d6d4c562cc1")
    public fun cloudMapOptions(cloudMapOptions: CloudMapOptions.Builder.() -> Unit)

    public fun cluster(cluster: ICluster)

    public fun desiredCount(desiredCount: Number)

    public fun enableEcsManagedTags(enableEcsManagedTags: Boolean)

    public fun enableExecuteCommand(enableExecuteCommand: Boolean)

    public fun healthCheckGracePeriod(healthCheckGracePeriod: Duration)

    public fun loadBalancers(loadBalancers: List<ApplicationLoadBalancerProps>)

    public fun loadBalancers(vararg loadBalancers: ApplicationLoadBalancerProps)

    public fun propagateTags(propagateTags: PropagatedTagSource)

    public fun serviceName(serviceName: String)

    public fun targetGroups(targetGroups: List<ApplicationTargetProps>)

    public fun targetGroups(vararg targetGroups: ApplicationTargetProps)

    public fun taskImageOptions(taskImageOptions: ApplicationLoadBalancedTaskImageProps)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("104ce746e95740cc349f76735478ef47af51c6603d0276753eba05d92d37941d")
    public
        fun taskImageOptions(taskImageOptions: ApplicationLoadBalancedTaskImageProps.Builder.() -> Unit)

    public fun vpc(vpc: IVpc)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ecs.patterns.ApplicationMultipleTargetGroupsServiceBaseProps.Builder
        =
        software.amazon.awscdk.services.ecs.patterns.ApplicationMultipleTargetGroupsServiceBaseProps.builder()

    override fun cloudMapOptions(cloudMapOptions: CloudMapOptions) {
      cdkBuilder.cloudMapOptions(cloudMapOptions.let(CloudMapOptions::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("098bcfe6e487ac472a11a4102683ddb20eb5dc694fbfbe26288f3d6d4c562cc1")
    override fun cloudMapOptions(cloudMapOptions: CloudMapOptions.Builder.() -> Unit): Unit =
        cloudMapOptions(CloudMapOptions(cloudMapOptions))

    override fun cluster(cluster: ICluster) {
      cdkBuilder.cluster(cluster.let(ICluster::unwrap))
    }

    override fun desiredCount(desiredCount: Number) {
      cdkBuilder.desiredCount(desiredCount)
    }

    override fun enableEcsManagedTags(enableEcsManagedTags: Boolean) {
      cdkBuilder.enableEcsManagedTags(enableEcsManagedTags)
    }

    override fun enableExecuteCommand(enableExecuteCommand: Boolean) {
      cdkBuilder.enableExecuteCommand(enableExecuteCommand)
    }

    override fun healthCheckGracePeriod(healthCheckGracePeriod: Duration) {
      cdkBuilder.healthCheckGracePeriod(healthCheckGracePeriod.let(Duration::unwrap))
    }

    override fun loadBalancers(loadBalancers: List<ApplicationLoadBalancerProps>) {
      cdkBuilder.loadBalancers(loadBalancers.map(ApplicationLoadBalancerProps::unwrap))
    }

    override fun loadBalancers(vararg loadBalancers: ApplicationLoadBalancerProps): Unit =
        loadBalancers(loadBalancers.toList())

    override fun propagateTags(propagateTags: PropagatedTagSource) {
      cdkBuilder.propagateTags(propagateTags.let(PropagatedTagSource::unwrap))
    }

    override fun serviceName(serviceName: String) {
      cdkBuilder.serviceName(serviceName)
    }

    override fun targetGroups(targetGroups: List<ApplicationTargetProps>) {
      cdkBuilder.targetGroups(targetGroups.map(ApplicationTargetProps::unwrap))
    }

    override fun targetGroups(vararg targetGroups: ApplicationTargetProps): Unit =
        targetGroups(targetGroups.toList())

    override fun taskImageOptions(taskImageOptions: ApplicationLoadBalancedTaskImageProps) {
      cdkBuilder.taskImageOptions(taskImageOptions.let(ApplicationLoadBalancedTaskImageProps::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("104ce746e95740cc349f76735478ef47af51c6603d0276753eba05d92d37941d")
    override
        fun taskImageOptions(taskImageOptions: ApplicationLoadBalancedTaskImageProps.Builder.() -> Unit):
        Unit = taskImageOptions(ApplicationLoadBalancedTaskImageProps(taskImageOptions))

    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    public fun build():
        software.amazon.awscdk.services.ecs.patterns.ApplicationMultipleTargetGroupsServiceBaseProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.ecs.patterns.ApplicationMultipleTargetGroupsServiceBaseProps,
  ) : CdkObject(cdkObject), ApplicationMultipleTargetGroupsServiceBaseProps {
    override fun cloudMapOptions(): CloudMapOptions? =
        unwrap(this).getCloudMapOptions()?.let(CloudMapOptions::wrap)

    override fun cluster(): ICluster? = unwrap(this).getCluster()?.let(ICluster::wrap)

    override fun desiredCount(): Number? = unwrap(this).getDesiredCount()

    override fun enableEcsManagedTags(): Boolean? = unwrap(this).getEnableECSManagedTags()

    override fun enableExecuteCommand(): Boolean? = unwrap(this).getEnableExecuteCommand()

    override fun healthCheckGracePeriod(): Duration? =
        unwrap(this).getHealthCheckGracePeriod()?.let(Duration::wrap)

    override fun loadBalancers(): List<ApplicationLoadBalancerProps> =
        unwrap(this).getLoadBalancers()?.map(ApplicationLoadBalancerProps::wrap) ?: emptyList()

    override fun propagateTags(): PropagatedTagSource? =
        unwrap(this).getPropagateTags()?.let(PropagatedTagSource::wrap)

    override fun serviceName(): String? = unwrap(this).getServiceName()

    override fun targetGroups(): List<ApplicationTargetProps> =
        unwrap(this).getTargetGroups()?.map(ApplicationTargetProps::wrap) ?: emptyList()

    override fun taskImageOptions(): ApplicationLoadBalancedTaskImageProps? =
        unwrap(this).getTaskImageOptions()?.let(ApplicationLoadBalancedTaskImageProps::wrap)

    override fun vpc(): IVpc? = unwrap(this).getVpc()?.let(IVpc::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        ApplicationMultipleTargetGroupsServiceBaseProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ecs.patterns.ApplicationMultipleTargetGroupsServiceBaseProps):
        ApplicationMultipleTargetGroupsServiceBaseProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ApplicationMultipleTargetGroupsServiceBaseProps):
        software.amazon.awscdk.services.ecs.patterns.ApplicationMultipleTargetGroupsServiceBaseProps
        = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ecs.patterns.ApplicationMultipleTargetGroupsServiceBaseProps
  }
}
