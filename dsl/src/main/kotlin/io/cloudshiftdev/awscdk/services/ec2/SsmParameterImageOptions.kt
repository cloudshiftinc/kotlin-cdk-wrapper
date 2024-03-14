package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface SsmParameterImageOptions {
  /**
   * Whether the AMI ID is cached to be stable between deployments.
   *
   * By default, the newest image is used on each deployment. This will cause
   * instances to be replaced whenever a new version is released, and may cause
   * downtime if there aren't enough running instances in the AutoScalingGroup
   * to reschedule the tasks on.
   *
   * If set to true, the AMI ID will be cached in `cdk.context.json` and the
   * same value will be used on future runs. Your instances will not be replaced
   * but your AMI version will grow old over time. To refresh the AMI lookup,
   * you will have to evict the value from the cache using the `cdk context`
   * command. See https://docs.aws.amazon.com/cdk/latest/guide/context.html for
   * more information.
   *
   * Can not be set to `true` in environment-agnostic stacks.
   *
   * Default: false
   */
  public fun cachedInContext(): Boolean? = unwrap(this).getCachedInContext()

  /**
   * Operating system.
   *
   * Default: OperatingSystemType.LINUX
   */
  public fun os(): OperatingSystemType? = unwrap(this).getOs()?.let(OperatingSystemType::wrap)

  /**
   * The version of the SSM parameter.
   *
   * Default: no version specified.
   */
  public fun parameterVersion(): String? = unwrap(this).getParameterVersion()

  /**
   * Custom UserData.
   *
   * Default: - UserData appropriate for the OS
   */
  public fun userData(): UserData? = unwrap(this).getUserData()?.let(UserData::wrap)

  /**
   * A builder for [SsmParameterImageOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param cachedInContext Whether the AMI ID is cached to be stable between deployments.
     * By default, the newest image is used on each deployment. This will cause
     * instances to be replaced whenever a new version is released, and may cause
     * downtime if there aren't enough running instances in the AutoScalingGroup
     * to reschedule the tasks on.
     *
     * If set to true, the AMI ID will be cached in `cdk.context.json` and the
     * same value will be used on future runs. Your instances will not be replaced
     * but your AMI version will grow old over time. To refresh the AMI lookup,
     * you will have to evict the value from the cache using the `cdk context`
     * command. See https://docs.aws.amazon.com/cdk/latest/guide/context.html for
     * more information.
     *
     * Can not be set to `true` in environment-agnostic stacks.
     */
    public fun cachedInContext(cachedInContext: Boolean)

    /**
     * @param os Operating system.
     */
    public fun os(os: OperatingSystemType)

    /**
     * @param parameterVersion The version of the SSM parameter.
     */
    public fun parameterVersion(parameterVersion: String)

    /**
     * @param userData Custom UserData.
     */
    public fun userData(userData: UserData)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.SsmParameterImageOptions.Builder =
        software.amazon.awscdk.services.ec2.SsmParameterImageOptions.builder()

    /**
     * @param cachedInContext Whether the AMI ID is cached to be stable between deployments.
     * By default, the newest image is used on each deployment. This will cause
     * instances to be replaced whenever a new version is released, and may cause
     * downtime if there aren't enough running instances in the AutoScalingGroup
     * to reschedule the tasks on.
     *
     * If set to true, the AMI ID will be cached in `cdk.context.json` and the
     * same value will be used on future runs. Your instances will not be replaced
     * but your AMI version will grow old over time. To refresh the AMI lookup,
     * you will have to evict the value from the cache using the `cdk context`
     * command. See https://docs.aws.amazon.com/cdk/latest/guide/context.html for
     * more information.
     *
     * Can not be set to `true` in environment-agnostic stacks.
     */
    override fun cachedInContext(cachedInContext: Boolean) {
      cdkBuilder.cachedInContext(cachedInContext)
    }

    /**
     * @param os Operating system.
     */
    override fun os(os: OperatingSystemType) {
      cdkBuilder.os(os.let(OperatingSystemType::unwrap))
    }

    /**
     * @param parameterVersion The version of the SSM parameter.
     */
    override fun parameterVersion(parameterVersion: String) {
      cdkBuilder.parameterVersion(parameterVersion)
    }

    /**
     * @param userData Custom UserData.
     */
    override fun userData(userData: UserData) {
      cdkBuilder.userData(userData.let(UserData::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ec2.SsmParameterImageOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.SsmParameterImageOptions,
  ) : CdkObject(cdkObject), SsmParameterImageOptions {
    /**
     * Whether the AMI ID is cached to be stable between deployments.
     *
     * By default, the newest image is used on each deployment. This will cause
     * instances to be replaced whenever a new version is released, and may cause
     * downtime if there aren't enough running instances in the AutoScalingGroup
     * to reschedule the tasks on.
     *
     * If set to true, the AMI ID will be cached in `cdk.context.json` and the
     * same value will be used on future runs. Your instances will not be replaced
     * but your AMI version will grow old over time. To refresh the AMI lookup,
     * you will have to evict the value from the cache using the `cdk context`
     * command. See https://docs.aws.amazon.com/cdk/latest/guide/context.html for
     * more information.
     *
     * Can not be set to `true` in environment-agnostic stacks.
     *
     * Default: false
     */
    override fun cachedInContext(): Boolean? = unwrap(this).getCachedInContext()

    /**
     * Operating system.
     *
     * Default: OperatingSystemType.LINUX
     */
    override fun os(): OperatingSystemType? = unwrap(this).getOs()?.let(OperatingSystemType::wrap)

    /**
     * The version of the SSM parameter.
     *
     * Default: no version specified.
     */
    override fun parameterVersion(): String? = unwrap(this).getParameterVersion()

    /**
     * Custom UserData.
     *
     * Default: - UserData appropriate for the OS
     */
    override fun userData(): UserData? = unwrap(this).getUserData()?.let(UserData::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): SsmParameterImageOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.SsmParameterImageOptions):
        SsmParameterImageOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: SsmParameterImageOptions):
        software.amazon.awscdk.services.ec2.SsmParameterImageOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.SsmParameterImageOptions
  }
}
