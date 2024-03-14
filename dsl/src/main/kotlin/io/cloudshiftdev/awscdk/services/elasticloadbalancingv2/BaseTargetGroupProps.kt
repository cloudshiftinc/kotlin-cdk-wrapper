package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface BaseTargetGroupProps {
  /**
   * The amount of time for Elastic Load Balancing to wait before deregistering a target.
   *
   * The range is 0-3600 seconds.
   *
   * Default: 300
   */
  public fun deregistrationDelay(): Duration? =
      unwrap(this).getDeregistrationDelay()?.let(Duration::wrap)

  /**
   * Health check configuration.
   *
   * Default: - The default value for each property in this configuration varies depending on the
   * target.
   *
   * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#aws-resource-elasticloadbalancingv2-targetgroup-properties)
   */
  public fun healthCheck(): HealthCheck? = unwrap(this).getHealthCheck()?.let(HealthCheck::wrap)

  /**
   * The name of the target group.
   *
   * This name must be unique per region per account, can have a maximum of
   * 32 characters, must contain only alphanumeric characters or hyphens, and
   * must not begin or end with a hyphen.
   *
   * Default: - Automatically generated.
   */
  public fun targetGroupName(): String? = unwrap(this).getTargetGroupName()

  /**
   * The type of targets registered to this TargetGroup, either IP or Instance.
   *
   * All targets registered into the group must be of this type. If you
   * register targets to the TargetGroup in the CDK app, the TargetType is
   * determined automatically.
   *
   * Default: - Determined automatically.
   */
  public fun targetType(): TargetType? = unwrap(this).getTargetType()?.let(TargetType::wrap)

  /**
   * The virtual private cloud (VPC).
   *
   * only if `TargetType` is `Ip` or `InstanceId`
   *
   * Default: - undefined
   */
  public fun vpc(): IVpc? = unwrap(this).getVpc()?.let(IVpc::wrap)

  /**
   * A builder for [BaseTargetGroupProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param deregistrationDelay The amount of time for Elastic Load Balancing to wait before
     * deregistering a target.
     * The range is 0-3600 seconds.
     */
    public fun deregistrationDelay(deregistrationDelay: Duration)

    /**
     * @param healthCheck Health check configuration.
     */
    public fun healthCheck(healthCheck: HealthCheck)

    /**
     * @param healthCheck Health check configuration.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d447c1fdbad8fa2df305155c089a3fbc348687a137ca99e8ba194481d957409e")
    public fun healthCheck(healthCheck: HealthCheck.Builder.() -> Unit)

    /**
     * @param targetGroupName The name of the target group.
     * This name must be unique per region per account, can have a maximum of
     * 32 characters, must contain only alphanumeric characters or hyphens, and
     * must not begin or end with a hyphen.
     */
    public fun targetGroupName(targetGroupName: String)

    /**
     * @param targetType The type of targets registered to this TargetGroup, either IP or Instance.
     * All targets registered into the group must be of this type. If you
     * register targets to the TargetGroup in the CDK app, the TargetType is
     * determined automatically.
     */
    public fun targetType(targetType: TargetType)

    /**
     * @param vpc The virtual private cloud (VPC).
     * only if `TargetType` is `Ip` or `InstanceId`
     */
    public fun vpc(vpc: IVpc)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticloadbalancingv2.BaseTargetGroupProps.Builder =
        software.amazon.awscdk.services.elasticloadbalancingv2.BaseTargetGroupProps.builder()

    /**
     * @param deregistrationDelay The amount of time for Elastic Load Balancing to wait before
     * deregistering a target.
     * The range is 0-3600 seconds.
     */
    override fun deregistrationDelay(deregistrationDelay: Duration) {
      cdkBuilder.deregistrationDelay(deregistrationDelay.let(Duration::unwrap))
    }

    /**
     * @param healthCheck Health check configuration.
     */
    override fun healthCheck(healthCheck: HealthCheck) {
      cdkBuilder.healthCheck(healthCheck.let(HealthCheck::unwrap))
    }

    /**
     * @param healthCheck Health check configuration.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d447c1fdbad8fa2df305155c089a3fbc348687a137ca99e8ba194481d957409e")
    override fun healthCheck(healthCheck: HealthCheck.Builder.() -> Unit): Unit =
        healthCheck(HealthCheck(healthCheck))

    /**
     * @param targetGroupName The name of the target group.
     * This name must be unique per region per account, can have a maximum of
     * 32 characters, must contain only alphanumeric characters or hyphens, and
     * must not begin or end with a hyphen.
     */
    override fun targetGroupName(targetGroupName: String) {
      cdkBuilder.targetGroupName(targetGroupName)
    }

    /**
     * @param targetType The type of targets registered to this TargetGroup, either IP or Instance.
     * All targets registered into the group must be of this type. If you
     * register targets to the TargetGroup in the CDK app, the TargetType is
     * determined automatically.
     */
    override fun targetType(targetType: TargetType) {
      cdkBuilder.targetType(targetType.let(TargetType::unwrap))
    }

    /**
     * @param vpc The virtual private cloud (VPC).
     * only if `TargetType` is `Ip` or `InstanceId`
     */
    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.elasticloadbalancingv2.BaseTargetGroupProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.elasticloadbalancingv2.BaseTargetGroupProps,
  ) : CdkObject(cdkObject), BaseTargetGroupProps {
    /**
     * The amount of time for Elastic Load Balancing to wait before deregistering a target.
     *
     * The range is 0-3600 seconds.
     *
     * Default: 300
     */
    override fun deregistrationDelay(): Duration? =
        unwrap(this).getDeregistrationDelay()?.let(Duration::wrap)

    /**
     * Health check configuration.
     *
     * Default: - The default value for each property in this configuration varies depending on the
     * target.
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#aws-resource-elasticloadbalancingv2-targetgroup-properties)
     */
    override fun healthCheck(): HealthCheck? = unwrap(this).getHealthCheck()?.let(HealthCheck::wrap)

    /**
     * The name of the target group.
     *
     * This name must be unique per region per account, can have a maximum of
     * 32 characters, must contain only alphanumeric characters or hyphens, and
     * must not begin or end with a hyphen.
     *
     * Default: - Automatically generated.
     */
    override fun targetGroupName(): String? = unwrap(this).getTargetGroupName()

    /**
     * The type of targets registered to this TargetGroup, either IP or Instance.
     *
     * All targets registered into the group must be of this type. If you
     * register targets to the TargetGroup in the CDK app, the TargetType is
     * determined automatically.
     *
     * Default: - Determined automatically.
     */
    override fun targetType(): TargetType? = unwrap(this).getTargetType()?.let(TargetType::wrap)

    /**
     * The virtual private cloud (VPC).
     *
     * only if `TargetType` is `Ip` or `InstanceId`
     *
     * Default: - undefined
     */
    override fun vpc(): IVpc? = unwrap(this).getVpc()?.let(IVpc::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): BaseTargetGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.BaseTargetGroupProps):
        BaseTargetGroupProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: BaseTargetGroupProps):
        software.amazon.awscdk.services.elasticloadbalancingv2.BaseTargetGroupProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.elasticloadbalancingv2.BaseTargetGroupProps
  }
}
