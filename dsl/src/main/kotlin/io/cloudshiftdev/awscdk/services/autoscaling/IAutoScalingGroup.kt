package io.cloudshiftdev.awscdk.services.autoscaling

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.services.ec2.OperatingSystemType
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.iam.IPrincipal
import io.cloudshiftdev.constructs.Node
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface IAutoScalingGroup : IResource, IGrantable {
  public fun addLifecycleHook(arg0: String, arg1: BasicLifecycleHookProps): LifecycleHook

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e73b58a332c5f3bcf737c3c3902fb97721571b04a55f030350ee06a5be61db31")
  public fun addLifecycleHook(arg0: String, arg1: BasicLifecycleHookProps.Builder.() -> Unit):
      LifecycleHook

  public fun addUserData(arg0: String)

  public fun addWarmPool(): WarmPool

  public fun addWarmPool(arg0: WarmPoolOptions): WarmPool

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ebe3a17babce83c2ccb570a7464dccb7ae43140da33baacb05b1a15a27a69e43")
  public fun addWarmPool(arg0: WarmPoolOptions.Builder.() -> Unit): WarmPool

  public fun autoScalingGroupArn(): String

  public fun autoScalingGroupName(): String

  public fun osType(): OperatingSystemType

  public fun scaleOnCpuUtilization(arg0: String, arg1: CpuUtilizationScalingProps):
      TargetTrackingScalingPolicy

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("54ff0f79a3a0e98af41f878332105ce744cc94709e6dfa3c31c968213fde0127")
  public fun scaleOnCpuUtilization(arg0: String,
      arg1: CpuUtilizationScalingProps.Builder.() -> Unit): TargetTrackingScalingPolicy

  public fun scaleOnIncomingBytes(arg0: String, arg1: NetworkUtilizationScalingProps):
      TargetTrackingScalingPolicy

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("53d48012d390303ce4bdadda813caeca6ef440c93ff99ecf347c830212960766")
  public fun scaleOnIncomingBytes(arg0: String,
      arg1: NetworkUtilizationScalingProps.Builder.() -> Unit): TargetTrackingScalingPolicy

  public fun scaleOnMetric(arg0: String, arg1: BasicStepScalingPolicyProps): StepScalingPolicy

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("97c636215f9ded1865259a4c15b81d08ffc6cf47e1b5af030d3b308ae6eba808")
  public fun scaleOnMetric(arg0: String, arg1: BasicStepScalingPolicyProps.Builder.() -> Unit):
      StepScalingPolicy

  public fun scaleOnOutgoingBytes(arg0: String, arg1: NetworkUtilizationScalingProps):
      TargetTrackingScalingPolicy

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("041c27ca62dcbebfcb1881e27b18d9a65a9e76a73700f64dc5640d2cb3dd2620")
  public fun scaleOnOutgoingBytes(arg0: String,
      arg1: NetworkUtilizationScalingProps.Builder.() -> Unit): TargetTrackingScalingPolicy

  public fun scaleOnSchedule(arg0: String, arg1: BasicScheduledActionProps): ScheduledAction

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b8a0caadcedcb277caddacbd0e88af40e8ebf1b6606474968554ce75d027168a")
  public fun scaleOnSchedule(arg0: String, arg1: BasicScheduledActionProps.Builder.() -> Unit):
      ScheduledAction

  public fun scaleToTrackMetric(arg0: String, arg1: MetricTargetTrackingProps):
      TargetTrackingScalingPolicy

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("783dfddcfc4313e0ba0ad62e98c32ed03381c60b8a7586ca584816685414690c")
  public fun scaleToTrackMetric(arg0: String, arg1: MetricTargetTrackingProps.Builder.() -> Unit):
      TargetTrackingScalingPolicy

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.autoscaling.IAutoScalingGroup,
  ) : IAutoScalingGroup {
    public override fun addLifecycleHook(arg0: String, arg1: BasicLifecycleHookProps): LifecycleHook
        = unwrap(this).addLifecycleHook(arg0,
        arg1.let(BasicLifecycleHookProps::unwrap)).let(LifecycleHook::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e73b58a332c5f3bcf737c3c3902fb97721571b04a55f030350ee06a5be61db31")
    public override fun addLifecycleHook(arg0: String,
        arg1: BasicLifecycleHookProps.Builder.() -> Unit): LifecycleHook = addLifecycleHook(arg0,
        BasicLifecycleHookProps(arg1))

    public override fun addUserData(arg0: String) {
      unwrap(this).addUserData(arg0)
    }

    public override fun addWarmPool(): WarmPool = unwrap(this).addWarmPool().let(WarmPool::wrap)

    public override fun addWarmPool(arg0: WarmPoolOptions): WarmPool =
        unwrap(this).addWarmPool(arg0.let(WarmPoolOptions::unwrap)).let(WarmPool::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ebe3a17babce83c2ccb570a7464dccb7ae43140da33baacb05b1a15a27a69e43")
    public override fun addWarmPool(arg0: WarmPoolOptions.Builder.() -> Unit): WarmPool =
        addWarmPool(WarmPoolOptions(arg0))

    public override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    public override fun autoScalingGroupArn(): String = unwrap(this).getAutoScalingGroupArn()

    public override fun autoScalingGroupName(): String = unwrap(this).getAutoScalingGroupName()

    public override fun env(): ResourceEnvironment =
        unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    public override fun grantPrincipal(): IPrincipal =
        unwrap(this).getGrantPrincipal().let(IPrincipal::wrap)

    public override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    public override fun osType(): OperatingSystemType =
        unwrap(this).getOsType().let(OperatingSystemType::wrap)

    public override fun scaleOnCpuUtilization(arg0: String, arg1: CpuUtilizationScalingProps):
        TargetTrackingScalingPolicy = unwrap(this).scaleOnCpuUtilization(arg0,
        arg1.let(CpuUtilizationScalingProps::unwrap)).let(TargetTrackingScalingPolicy::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("54ff0f79a3a0e98af41f878332105ce744cc94709e6dfa3c31c968213fde0127")
    public override fun scaleOnCpuUtilization(arg0: String,
        arg1: CpuUtilizationScalingProps.Builder.() -> Unit): TargetTrackingScalingPolicy =
        scaleOnCpuUtilization(arg0, CpuUtilizationScalingProps(arg1))

    public override fun scaleOnIncomingBytes(arg0: String, arg1: NetworkUtilizationScalingProps):
        TargetTrackingScalingPolicy = unwrap(this).scaleOnIncomingBytes(arg0,
        arg1.let(NetworkUtilizationScalingProps::unwrap)).let(TargetTrackingScalingPolicy::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("53d48012d390303ce4bdadda813caeca6ef440c93ff99ecf347c830212960766")
    public override fun scaleOnIncomingBytes(arg0: String,
        arg1: NetworkUtilizationScalingProps.Builder.() -> Unit): TargetTrackingScalingPolicy =
        scaleOnIncomingBytes(arg0, NetworkUtilizationScalingProps(arg1))

    public override fun scaleOnMetric(arg0: String, arg1: BasicStepScalingPolicyProps):
        StepScalingPolicy = unwrap(this).scaleOnMetric(arg0,
        arg1.let(BasicStepScalingPolicyProps::unwrap)).let(StepScalingPolicy::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("97c636215f9ded1865259a4c15b81d08ffc6cf47e1b5af030d3b308ae6eba808")
    public override fun scaleOnMetric(arg0: String,
        arg1: BasicStepScalingPolicyProps.Builder.() -> Unit): StepScalingPolicy =
        scaleOnMetric(arg0, BasicStepScalingPolicyProps(arg1))

    public override fun scaleOnOutgoingBytes(arg0: String, arg1: NetworkUtilizationScalingProps):
        TargetTrackingScalingPolicy = unwrap(this).scaleOnOutgoingBytes(arg0,
        arg1.let(NetworkUtilizationScalingProps::unwrap)).let(TargetTrackingScalingPolicy::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("041c27ca62dcbebfcb1881e27b18d9a65a9e76a73700f64dc5640d2cb3dd2620")
    public override fun scaleOnOutgoingBytes(arg0: String,
        arg1: NetworkUtilizationScalingProps.Builder.() -> Unit): TargetTrackingScalingPolicy =
        scaleOnOutgoingBytes(arg0, NetworkUtilizationScalingProps(arg1))

    public override fun scaleOnSchedule(arg0: String, arg1: BasicScheduledActionProps):
        ScheduledAction = unwrap(this).scaleOnSchedule(arg0,
        arg1.let(BasicScheduledActionProps::unwrap)).let(ScheduledAction::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b8a0caadcedcb277caddacbd0e88af40e8ebf1b6606474968554ce75d027168a")
    public override fun scaleOnSchedule(arg0: String,
        arg1: BasicScheduledActionProps.Builder.() -> Unit): ScheduledAction = scaleOnSchedule(arg0,
        BasicScheduledActionProps(arg1))

    public override fun scaleToTrackMetric(arg0: String, arg1: MetricTargetTrackingProps):
        TargetTrackingScalingPolicy = unwrap(this).scaleToTrackMetric(arg0,
        arg1.let(MetricTargetTrackingProps::unwrap)).let(TargetTrackingScalingPolicy::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("783dfddcfc4313e0ba0ad62e98c32ed03381c60b8a7586ca584816685414690c")
    public override fun scaleToTrackMetric(arg0: String,
        arg1: MetricTargetTrackingProps.Builder.() -> Unit): TargetTrackingScalingPolicy =
        scaleToTrackMetric(arg0, MetricTargetTrackingProps(arg1))

    public override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.IAutoScalingGroup):
        IAutoScalingGroup = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IAutoScalingGroup):
        software.amazon.awscdk.services.autoscaling.IAutoScalingGroup = (wrapped as
        Wrapper).cdkObject
  }
}
