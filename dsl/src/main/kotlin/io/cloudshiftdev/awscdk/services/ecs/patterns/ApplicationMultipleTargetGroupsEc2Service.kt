package io.cloudshiftdev.awscdk.services.ecs.patterns

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ecs.CloudMapOptions
import io.cloudshiftdev.awscdk.services.ecs.Ec2Service
import io.cloudshiftdev.awscdk.services.ecs.Ec2TaskDefinition
import io.cloudshiftdev.awscdk.services.ecs.ICluster
import io.cloudshiftdev.awscdk.services.ecs.PlacementConstraint
import io.cloudshiftdev.awscdk.services.ecs.PlacementStrategy
import io.cloudshiftdev.awscdk.services.ecs.PropagatedTagSource
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.ApplicationTargetGroup
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class ApplicationMultipleTargetGroupsEc2Service internal constructor(
  private val cdkObject:
      software.amazon.awscdk.services.ecs.patterns.ApplicationMultipleTargetGroupsEc2Service,
) : ApplicationMultipleTargetGroupsServiceBase(cdkObject) {
  public open fun service(): Ec2Service = unwrap(this).getService().let(Ec2Service::wrap)

  @Deprecated(message = "deprecated in CDK")
  public open fun targetGroup(): ApplicationTargetGroup =
      unwrap(this).getTargetGroup().let(ApplicationTargetGroup::wrap)

  public open fun taskDefinition(): Ec2TaskDefinition =
      unwrap(this).getTaskDefinition().let(Ec2TaskDefinition::wrap)

  public interface Builder {
    public fun cloudMapOptions(cloudMapOptions: CloudMapOptions) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("11eb525b244f8cbc490fd843a54bdcbc037db597c1e424ae66d5c8c33637b0f0")
    public fun cloudMapOptions(cloudMapOptions: CloudMapOptions.Builder.() -> Unit) {
    }

    public fun cluster(cluster: ICluster) {
    }

    public fun cpu(cpu: Number) {
    }

    public fun desiredCount(desiredCount: Number) {
    }

    public fun enableEcsManagedTags(enableEcsManagedTags: Boolean) {
    }

    public fun enableExecuteCommand(enableExecuteCommand: Boolean) {
    }

    public fun healthCheckGracePeriod(healthCheckGracePeriod: Duration) {
    }

    public fun loadBalancers(loadBalancers: List<ApplicationLoadBalancerProps>) {
    }

    public fun memoryLimitMiB(memoryLimitMiB: Number) {
    }

    public fun memoryReservationMiB(memoryReservationMiB: Number) {
    }

    public fun placementConstraints(placementConstraints: List<PlacementConstraint>) {
    }

    public fun placementStrategies(placementStrategies: List<PlacementStrategy>) {
    }

    public fun propagateTags(propagateTags: PropagatedTagSource) {
    }

    public fun serviceName(serviceName: String) {
    }

    public fun targetGroups(targetGroups: List<ApplicationTargetProps>) {
    }

    public fun taskDefinition(taskDefinition: Ec2TaskDefinition) {
    }

    public fun taskImageOptions(taskImageOptions: ApplicationLoadBalancedTaskImageProps) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("770567cc4022d3484ef5fd5757d9bf85e0681e74fd978568293f2e93cc55dd5c")
    public
        fun taskImageOptions(taskImageOptions: ApplicationLoadBalancedTaskImageProps.Builder.() -> Unit) {
    }

    public fun vpc(vpc: IVpc) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ecs.patterns.ApplicationMultipleTargetGroupsEc2Service.Builder
        =
        software.amazon.awscdk.services.ecs.patterns.ApplicationMultipleTargetGroupsEc2Service.Builder.create(scope,
        id)

    public override fun cloudMapOptions(cloudMapOptions: CloudMapOptions) {
      cdkBuilder.cloudMapOptions(cloudMapOptions.let(CloudMapOptions::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("11eb525b244f8cbc490fd843a54bdcbc037db597c1e424ae66d5c8c33637b0f0")
    public override fun cloudMapOptions(cloudMapOptions: CloudMapOptions.Builder.() -> Unit): Unit =
        cloudMapOptions(CloudMapOptions(cloudMapOptions))

    public override fun cluster(cluster: ICluster) {
      cdkBuilder.cluster(cluster.let(ICluster::unwrap))
    }

    public override fun cpu(cpu: Number) {
      cdkBuilder.cpu(cpu)
    }

    public override fun desiredCount(desiredCount: Number) {
      cdkBuilder.desiredCount(desiredCount)
    }

    public override fun enableEcsManagedTags(enableEcsManagedTags: Boolean) {
      cdkBuilder.enableEcsManagedTags(enableEcsManagedTags)
    }

    public override fun enableExecuteCommand(enableExecuteCommand: Boolean) {
      cdkBuilder.enableExecuteCommand(enableExecuteCommand)
    }

    public override fun healthCheckGracePeriod(healthCheckGracePeriod: Duration) {
      cdkBuilder.healthCheckGracePeriod(healthCheckGracePeriod.let(Duration::unwrap))
    }

    public override fun loadBalancers(loadBalancers: List<ApplicationLoadBalancerProps>) {
      cdkBuilder.loadBalancers(loadBalancers.map(ApplicationLoadBalancerProps::unwrap))
    }

    public override fun memoryLimitMiB(memoryLimitMiB: Number) {
      cdkBuilder.memoryLimitMiB(memoryLimitMiB)
    }

    public override fun memoryReservationMiB(memoryReservationMiB: Number) {
      cdkBuilder.memoryReservationMiB(memoryReservationMiB)
    }

    public override fun placementConstraints(placementConstraints: List<PlacementConstraint>) {
      cdkBuilder.placementConstraints(placementConstraints.map(PlacementConstraint::unwrap))
    }

    public override fun placementStrategies(placementStrategies: List<PlacementStrategy>) {
      cdkBuilder.placementStrategies(placementStrategies.map(PlacementStrategy::unwrap))
    }

    public override fun propagateTags(propagateTags: PropagatedTagSource) {
      cdkBuilder.propagateTags(propagateTags.let(PropagatedTagSource::unwrap))
    }

    public override fun serviceName(serviceName: String) {
      cdkBuilder.serviceName(serviceName)
    }

    public override fun targetGroups(targetGroups: List<ApplicationTargetProps>) {
      cdkBuilder.targetGroups(targetGroups.map(ApplicationTargetProps::unwrap))
    }

    public override fun taskDefinition(taskDefinition: Ec2TaskDefinition) {
      cdkBuilder.taskDefinition(taskDefinition.let(Ec2TaskDefinition::unwrap))
    }

    public override fun taskImageOptions(taskImageOptions: ApplicationLoadBalancedTaskImageProps) {
      cdkBuilder.taskImageOptions(taskImageOptions.let(ApplicationLoadBalancedTaskImageProps::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("770567cc4022d3484ef5fd5757d9bf85e0681e74fd978568293f2e93cc55dd5c")
    public override
        fun taskImageOptions(taskImageOptions: ApplicationLoadBalancedTaskImageProps.Builder.() -> Unit):
        Unit = taskImageOptions(ApplicationLoadBalancedTaskImageProps(taskImageOptions))

    public override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    public fun build():
        software.amazon.awscdk.services.ecs.patterns.ApplicationMultipleTargetGroupsEc2Service =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): ApplicationMultipleTargetGroupsEc2Service {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return ApplicationMultipleTargetGroupsEc2Service(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ecs.patterns.ApplicationMultipleTargetGroupsEc2Service):
        ApplicationMultipleTargetGroupsEc2Service =
        ApplicationMultipleTargetGroupsEc2Service(cdkObject)

    internal fun unwrap(wrapped: ApplicationMultipleTargetGroupsEc2Service):
        software.amazon.awscdk.services.ecs.patterns.ApplicationMultipleTargetGroupsEc2Service =
        wrapped.cdkObject
  }
}
