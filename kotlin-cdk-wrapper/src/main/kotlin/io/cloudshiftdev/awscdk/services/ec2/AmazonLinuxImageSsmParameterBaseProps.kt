@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * Base properties for an Amazon Linux SSM Parameter.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * UserData userData;
 * AmazonLinuxImageSsmParameterBaseProps amazonLinuxImageSsmParameterBaseProps =
 * AmazonLinuxImageSsmParameterBaseProps.builder()
 * .parameterName("parameterName")
 * // the properties below are optional
 * .cachedInContext(false)
 * .userData(userData)
 * .build();
 * ```
 */
public interface AmazonLinuxImageSsmParameterBaseProps : AmazonLinuxImageSsmParameterBaseOptions {
  /**
   * The name of the SSM parameter that contains the AMI value.
   */
  public fun parameterName(): String

  /**
   * A builder for [AmazonLinuxImageSsmParameterBaseProps]
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
     * @param parameterName The name of the SSM parameter that contains the AMI value. 
     */
    public fun parameterName(parameterName: String)

    /**
     * @param userData Initial user data.
     */
    public fun userData(userData: UserData)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.AmazonLinuxImageSsmParameterBaseProps.Builder =
        software.amazon.awscdk.services.ec2.AmazonLinuxImageSsmParameterBaseProps.builder()

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
     * @param parameterName The name of the SSM parameter that contains the AMI value. 
     */
    override fun parameterName(parameterName: String) {
      cdkBuilder.parameterName(parameterName)
    }

    /**
     * @param userData Initial user data.
     */
    override fun userData(userData: UserData) {
      cdkBuilder.userData(userData.let(UserData::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ec2.AmazonLinuxImageSsmParameterBaseProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ec2.AmazonLinuxImageSsmParameterBaseProps,
  ) : CdkObject(cdkObject), AmazonLinuxImageSsmParameterBaseProps {
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
     * The name of the SSM parameter that contains the AMI value.
     */
    override fun parameterName(): String = unwrap(this).getParameterName()

    /**
     * Initial user data.
     *
     * Default: - Empty UserData for Linux machines
     */
    override fun userData(): UserData? = unwrap(this).getUserData()?.let(UserData::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        AmazonLinuxImageSsmParameterBaseProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.AmazonLinuxImageSsmParameterBaseProps):
        AmazonLinuxImageSsmParameterBaseProps = CdkObjectWrappers.wrap(cdkObject) as?
        AmazonLinuxImageSsmParameterBaseProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: AmazonLinuxImageSsmParameterBaseProps):
        software.amazon.awscdk.services.ec2.AmazonLinuxImageSsmParameterBaseProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.AmazonLinuxImageSsmParameterBaseProps
  }
}
