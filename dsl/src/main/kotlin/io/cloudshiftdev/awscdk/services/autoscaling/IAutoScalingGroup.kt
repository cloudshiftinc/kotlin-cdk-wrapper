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
  /**
   * Send a message to either an SQS queue or SNS topic when instances launch or terminate.
   *
   * @param id 
   * @param props 
   */
  public fun addLifecycleHook(id: String, props: BasicLifecycleHookProps): LifecycleHook

  /**
   * Send a message to either an SQS queue or SNS topic when instances launch or terminate.
   *
   * @param id 
   * @param props 
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e73b58a332c5f3bcf737c3c3902fb97721571b04a55f030350ee06a5be61db31")
  public fun addLifecycleHook(id: String, props: BasicLifecycleHookProps.Builder.() -> Unit):
      LifecycleHook

  /**
   * Add command to the startup script of fleet instances.
   *
   * The command must be in the scripting language supported by the fleet's OS (i.e. Linux/Windows).
   * Does nothing for imported ASGs.
   *
   * @param commands 
   */
  public fun addUserData(commands: String)

  /**
   * Add a pool of pre-initialized EC2 instances that sits alongside an Auto Scaling group.
   *
   * @param options
   */
  public fun addWarmPool(): WarmPool

  /**
   * Add a pool of pre-initialized EC2 instances that sits alongside an Auto Scaling group.
   *
   * @param options
   */
  public fun addWarmPool(options: WarmPoolOptions): WarmPool

  /**
   * Add a pool of pre-initialized EC2 instances that sits alongside an Auto Scaling group.
   *
   * @param options
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ebe3a17babce83c2ccb570a7464dccb7ae43140da33baacb05b1a15a27a69e43")
  public fun addWarmPool(options: WarmPoolOptions.Builder.() -> Unit): WarmPool

  /**
   * The arn of the AutoScalingGroup.
   */
  public fun autoScalingGroupArn(): String

  /**
   * The name of the AutoScalingGroup.
   */
  public fun autoScalingGroupName(): String

  /**
   * The operating system family that the instances in this auto-scaling group belong to.
   *
   * Is 'UNKNOWN' for imported ASGs.
   */
  public fun osType(): OperatingSystemType

  /**
   * Scale out or in to achieve a target CPU utilization.
   *
   * @param id 
   * @param props 
   */
  public fun scaleOnCpuUtilization(id: String, props: CpuUtilizationScalingProps):
      TargetTrackingScalingPolicy

  /**
   * Scale out or in to achieve a target CPU utilization.
   *
   * @param id 
   * @param props 
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("54ff0f79a3a0e98af41f878332105ce744cc94709e6dfa3c31c968213fde0127")
  public fun scaleOnCpuUtilization(id: String,
      props: CpuUtilizationScalingProps.Builder.() -> Unit): TargetTrackingScalingPolicy

  /**
   * Scale out or in to achieve a target network ingress rate.
   *
   * @param id 
   * @param props 
   */
  public fun scaleOnIncomingBytes(id: String, props: NetworkUtilizationScalingProps):
      TargetTrackingScalingPolicy

  /**
   * Scale out or in to achieve a target network ingress rate.
   *
   * @param id 
   * @param props 
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("53d48012d390303ce4bdadda813caeca6ef440c93ff99ecf347c830212960766")
  public fun scaleOnIncomingBytes(id: String,
      props: NetworkUtilizationScalingProps.Builder.() -> Unit): TargetTrackingScalingPolicy

  /**
   * Scale out or in, in response to a metric.
   *
   * @param id 
   * @param props 
   */
  public fun scaleOnMetric(id: String, props: BasicStepScalingPolicyProps): StepScalingPolicy

  /**
   * Scale out or in, in response to a metric.
   *
   * @param id 
   * @param props 
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("97c636215f9ded1865259a4c15b81d08ffc6cf47e1b5af030d3b308ae6eba808")
  public fun scaleOnMetric(id: String, props: BasicStepScalingPolicyProps.Builder.() -> Unit):
      StepScalingPolicy

  /**
   * Scale out or in to achieve a target network egress rate.
   *
   * @param id 
   * @param props 
   */
  public fun scaleOnOutgoingBytes(id: String, props: NetworkUtilizationScalingProps):
      TargetTrackingScalingPolicy

  /**
   * Scale out or in to achieve a target network egress rate.
   *
   * @param id 
   * @param props 
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("041c27ca62dcbebfcb1881e27b18d9a65a9e76a73700f64dc5640d2cb3dd2620")
  public fun scaleOnOutgoingBytes(id: String,
      props: NetworkUtilizationScalingProps.Builder.() -> Unit): TargetTrackingScalingPolicy

  /**
   * Scale out or in based on time.
   *
   * @param id 
   * @param props 
   */
  public fun scaleOnSchedule(id: String, props: BasicScheduledActionProps): ScheduledAction

  /**
   * Scale out or in based on time.
   *
   * @param id 
   * @param props 
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b8a0caadcedcb277caddacbd0e88af40e8ebf1b6606474968554ce75d027168a")
  public fun scaleOnSchedule(id: String, props: BasicScheduledActionProps.Builder.() -> Unit):
      ScheduledAction

  /**
   * Scale out or in in order to keep a metric around a target value.
   *
   * @param id 
   * @param props 
   */
  public fun scaleToTrackMetric(id: String, props: MetricTargetTrackingProps):
      TargetTrackingScalingPolicy

  /**
   * Scale out or in in order to keep a metric around a target value.
   *
   * @param id 
   * @param props 
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("783dfddcfc4313e0ba0ad62e98c32ed03381c60b8a7586ca584816685414690c")
  public fun scaleToTrackMetric(id: String, props: MetricTargetTrackingProps.Builder.() -> Unit):
      TargetTrackingScalingPolicy

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.autoscaling.IAutoScalingGroup,
  ) : IAutoScalingGroup {
    /**
     * Send a message to either an SQS queue or SNS topic when instances launch or terminate.
     *
     * @param id 
     * @param props 
     */
    override fun addLifecycleHook(id: String, props: BasicLifecycleHookProps): LifecycleHook =
        unwrap(this).addLifecycleHook(id,
        props.let(BasicLifecycleHookProps::unwrap)).let(LifecycleHook::wrap)

    /**
     * Send a message to either an SQS queue or SNS topic when instances launch or terminate.
     *
     * @param id 
     * @param props 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e73b58a332c5f3bcf737c3c3902fb97721571b04a55f030350ee06a5be61db31")
    override fun addLifecycleHook(id: String, props: BasicLifecycleHookProps.Builder.() -> Unit):
        LifecycleHook = addLifecycleHook(id, BasicLifecycleHookProps(props))

    /**
     * Add command to the startup script of fleet instances.
     *
     * The command must be in the scripting language supported by the fleet's OS (i.e.
     * Linux/Windows).
     * Does nothing for imported ASGs.
     *
     * @param commands 
     */
    override fun addUserData(commands: String) {
      unwrap(this).addUserData(commands)
    }

    /**
     * Add a pool of pre-initialized EC2 instances that sits alongside an Auto Scaling group.
     *
     * @param options
     */
    override fun addWarmPool(): WarmPool = unwrap(this).addWarmPool().let(WarmPool::wrap)

    /**
     * Add a pool of pre-initialized EC2 instances that sits alongside an Auto Scaling group.
     *
     * @param options
     */
    override fun addWarmPool(options: WarmPoolOptions): WarmPool =
        unwrap(this).addWarmPool(options.let(WarmPoolOptions::unwrap)).let(WarmPool::wrap)

    /**
     * Add a pool of pre-initialized EC2 instances that sits alongside an Auto Scaling group.
     *
     * @param options
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ebe3a17babce83c2ccb570a7464dccb7ae43140da33baacb05b1a15a27a69e43")
    override fun addWarmPool(options: WarmPoolOptions.Builder.() -> Unit): WarmPool =
        addWarmPool(WarmPoolOptions(options))

    /**
     * Apply the given removal policy to this resource.
     *
     * The Removal Policy controls what happens to this resource when it stops
     * being managed by CloudFormation, either because you've removed it from the
     * CDK application or because you've made a change that requires the resource
     * to be replaced.
     *
     * The resource can be deleted (`RemovalPolicy.DESTROY`), or left in your AWS
     * account for data recovery and cleanup later (`RemovalPolicy.RETAIN`).
     *
     * @param policy 
     */
    override fun applyRemovalPolicy(policy: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(policy.let(RemovalPolicy::unwrap))
    }

    /**
     * The arn of the AutoScalingGroup.
     */
    override fun autoScalingGroupArn(): String = unwrap(this).getAutoScalingGroupArn()

    /**
     * The name of the AutoScalingGroup.
     */
    override fun autoScalingGroupName(): String = unwrap(this).getAutoScalingGroupName()

    /**
     * The environment this resource belongs to.
     *
     * For resources that are created and managed by the CDK
     * (generally, those created by creating new class instances like Role, Bucket, etc.),
     * this is always the same as the environment of the stack they belong to;
     * however, for imported resources
     * (those obtained from static methods like fromRoleArn, fromBucketName, etc.),
     * that might be different than the stack they were imported into.
     */
    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    /**
     * The principal to grant permissions to.
     */
    override fun grantPrincipal(): IPrincipal =
        unwrap(this).getGrantPrincipal().let(IPrincipal::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    /**
     * The operating system family that the instances in this auto-scaling group belong to.
     *
     * Is 'UNKNOWN' for imported ASGs.
     */
    override fun osType(): OperatingSystemType =
        unwrap(this).getOsType().let(OperatingSystemType::wrap)

    /**
     * Scale out or in to achieve a target CPU utilization.
     *
     * @param id 
     * @param props 
     */
    override fun scaleOnCpuUtilization(id: String, props: CpuUtilizationScalingProps):
        TargetTrackingScalingPolicy = unwrap(this).scaleOnCpuUtilization(id,
        props.let(CpuUtilizationScalingProps::unwrap)).let(TargetTrackingScalingPolicy::wrap)

    /**
     * Scale out or in to achieve a target CPU utilization.
     *
     * @param id 
     * @param props 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("54ff0f79a3a0e98af41f878332105ce744cc94709e6dfa3c31c968213fde0127")
    override fun scaleOnCpuUtilization(id: String,
        props: CpuUtilizationScalingProps.Builder.() -> Unit): TargetTrackingScalingPolicy =
        scaleOnCpuUtilization(id, CpuUtilizationScalingProps(props))

    /**
     * Scale out or in to achieve a target network ingress rate.
     *
     * @param id 
     * @param props 
     */
    override fun scaleOnIncomingBytes(id: String, props: NetworkUtilizationScalingProps):
        TargetTrackingScalingPolicy = unwrap(this).scaleOnIncomingBytes(id,
        props.let(NetworkUtilizationScalingProps::unwrap)).let(TargetTrackingScalingPolicy::wrap)

    /**
     * Scale out or in to achieve a target network ingress rate.
     *
     * @param id 
     * @param props 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("53d48012d390303ce4bdadda813caeca6ef440c93ff99ecf347c830212960766")
    override fun scaleOnIncomingBytes(id: String,
        props: NetworkUtilizationScalingProps.Builder.() -> Unit): TargetTrackingScalingPolicy =
        scaleOnIncomingBytes(id, NetworkUtilizationScalingProps(props))

    /**
     * Scale out or in, in response to a metric.
     *
     * @param id 
     * @param props 
     */
    override fun scaleOnMetric(id: String, props: BasicStepScalingPolicyProps): StepScalingPolicy =
        unwrap(this).scaleOnMetric(id,
        props.let(BasicStepScalingPolicyProps::unwrap)).let(StepScalingPolicy::wrap)

    /**
     * Scale out or in, in response to a metric.
     *
     * @param id 
     * @param props 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("97c636215f9ded1865259a4c15b81d08ffc6cf47e1b5af030d3b308ae6eba808")
    override fun scaleOnMetric(id: String, props: BasicStepScalingPolicyProps.Builder.() -> Unit):
        StepScalingPolicy = scaleOnMetric(id, BasicStepScalingPolicyProps(props))

    /**
     * Scale out or in to achieve a target network egress rate.
     *
     * @param id 
     * @param props 
     */
    override fun scaleOnOutgoingBytes(id: String, props: NetworkUtilizationScalingProps):
        TargetTrackingScalingPolicy = unwrap(this).scaleOnOutgoingBytes(id,
        props.let(NetworkUtilizationScalingProps::unwrap)).let(TargetTrackingScalingPolicy::wrap)

    /**
     * Scale out or in to achieve a target network egress rate.
     *
     * @param id 
     * @param props 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("041c27ca62dcbebfcb1881e27b18d9a65a9e76a73700f64dc5640d2cb3dd2620")
    override fun scaleOnOutgoingBytes(id: String,
        props: NetworkUtilizationScalingProps.Builder.() -> Unit): TargetTrackingScalingPolicy =
        scaleOnOutgoingBytes(id, NetworkUtilizationScalingProps(props))

    /**
     * Scale out or in based on time.
     *
     * @param id 
     * @param props 
     */
    override fun scaleOnSchedule(id: String, props: BasicScheduledActionProps): ScheduledAction =
        unwrap(this).scaleOnSchedule(id,
        props.let(BasicScheduledActionProps::unwrap)).let(ScheduledAction::wrap)

    /**
     * Scale out or in based on time.
     *
     * @param id 
     * @param props 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b8a0caadcedcb277caddacbd0e88af40e8ebf1b6606474968554ce75d027168a")
    override fun scaleOnSchedule(id: String, props: BasicScheduledActionProps.Builder.() -> Unit):
        ScheduledAction = scaleOnSchedule(id, BasicScheduledActionProps(props))

    /**
     * Scale out or in in order to keep a metric around a target value.
     *
     * @param id 
     * @param props 
     */
    override fun scaleToTrackMetric(id: String, props: MetricTargetTrackingProps):
        TargetTrackingScalingPolicy = unwrap(this).scaleToTrackMetric(id,
        props.let(MetricTargetTrackingProps::unwrap)).let(TargetTrackingScalingPolicy::wrap)

    /**
     * Scale out or in in order to keep a metric around a target value.
     *
     * @param id 
     * @param props 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("783dfddcfc4313e0ba0ad62e98c32ed03381c60b8a7586ca584816685414690c")
    override fun scaleToTrackMetric(id: String,
        props: MetricTargetTrackingProps.Builder.() -> Unit): TargetTrackingScalingPolicy =
        scaleToTrackMetric(id, MetricTargetTrackingProps(props))

    /**
     * The stack in which this resource is defined.
     */
    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
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
