package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.constructs.Construct
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public open class ResolveSsmParameterAtLaunchImage internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.ec2.ResolveSsmParameterAtLaunchImage,
) : CdkObject(cdkObject), IMachineImage {
  /**
   * Return the image to use in the given context.
   *
   * @param _ 
   */
  public override fun image(`__`: Construct): MachineImageConfig =
      unwrap(this).getImage(`__`.let(Construct::unwrap)).let(MachineImageConfig::wrap)

  /**
   * Name of the SSM parameter we're looking up.
   */
  public open fun parameterName(): String = unwrap(this).getParameterName()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ec2.ResolveSsmParameterAtLaunchImage].
   */
  @CdkDslMarker
  public interface Builder {
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
     *
     * @param cachedInContext Whether the AMI ID is cached to be stable between deployments. 
     */
    public fun cachedInContext(cachedInContext: Boolean)

    /**
     * Operating system.
     *
     * Default: OperatingSystemType.LINUX
     *
     * @param os Operating system. 
     */
    public fun os(os: OperatingSystemType)

    /**
     * The version of the SSM parameter.
     *
     * Default: no version specified.
     *
     * @param parameterVersion The version of the SSM parameter. 
     */
    public fun parameterVersion(parameterVersion: String)

    /**
     * Custom UserData.
     *
     * Default: - UserData appropriate for the OS
     *
     * @param userData Custom UserData. 
     */
    public fun userData(userData: UserData)
  }

  private class BuilderImpl(
    parameterName: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.ResolveSsmParameterAtLaunchImage.Builder =
        software.amazon.awscdk.services.ec2.ResolveSsmParameterAtLaunchImage.Builder.create(parameterName)

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
     *
     * @param cachedInContext Whether the AMI ID is cached to be stable between deployments. 
     */
    override fun cachedInContext(cachedInContext: Boolean) {
      cdkBuilder.cachedInContext(cachedInContext)
    }

    /**
     * Operating system.
     *
     * Default: OperatingSystemType.LINUX
     *
     * @param os Operating system. 
     */
    override fun os(os: OperatingSystemType) {
      cdkBuilder.os(os.let(OperatingSystemType::unwrap))
    }

    /**
     * The version of the SSM parameter.
     *
     * Default: no version specified.
     *
     * @param parameterVersion The version of the SSM parameter. 
     */
    override fun parameterVersion(parameterVersion: String) {
      cdkBuilder.parameterVersion(parameterVersion)
    }

    /**
     * Custom UserData.
     *
     * Default: - UserData appropriate for the OS
     *
     * @param userData Custom UserData. 
     */
    override fun userData(userData: UserData) {
      cdkBuilder.userData(userData.let(UserData::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ec2.ResolveSsmParameterAtLaunchImage =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(parameterName: String, block: Builder.() -> Unit = {}):
        ResolveSsmParameterAtLaunchImage {
      val builderImpl = BuilderImpl(parameterName)
      return ResolveSsmParameterAtLaunchImage(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.ResolveSsmParameterAtLaunchImage):
        ResolveSsmParameterAtLaunchImage = ResolveSsmParameterAtLaunchImage(cdkObject)

    internal fun unwrap(wrapped: ResolveSsmParameterAtLaunchImage):
        software.amazon.awscdk.services.ec2.ResolveSsmParameterAtLaunchImage = wrapped.cdkObject
  }
}
