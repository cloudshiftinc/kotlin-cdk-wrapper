@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.String
import kotlin.Unit

/**
 * Properties returned by a Subscription destination.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iam.*;
 * import io.cloudshiftdev.awscdk.services.logs.*;
 * Role role;
 * LogSubscriptionDestinationConfig logSubscriptionDestinationConfig =
 * LogSubscriptionDestinationConfig.builder()
 * .arn("arn")
 * // the properties below are optional
 * .role(role)
 * .build();
 * ```
 */
public interface LogSubscriptionDestinationConfig {
  /**
   * The ARN of the subscription's destination.
   */
  public fun arn(): String

  /**
   * The role to assume to write log events to the destination.
   *
   * Default: No role assumed
   */
  public fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

  /**
   * A builder for [LogSubscriptionDestinationConfig]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param arn The ARN of the subscription's destination. 
     */
    public fun arn(arn: String)

    /**
     * @param role The role to assume to write log events to the destination.
     */
    public fun role(role: IRole)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.logs.LogSubscriptionDestinationConfig.Builder =
        software.amazon.awscdk.services.logs.LogSubscriptionDestinationConfig.builder()

    /**
     * @param arn The ARN of the subscription's destination. 
     */
    override fun arn(arn: String) {
      cdkBuilder.arn(arn)
    }

    /**
     * @param role The role to assume to write log events to the destination.
     */
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.logs.LogSubscriptionDestinationConfig =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.logs.LogSubscriptionDestinationConfig,
  ) : CdkObject(cdkObject), LogSubscriptionDestinationConfig {
    /**
     * The ARN of the subscription's destination.
     */
    override fun arn(): String = unwrap(this).getArn()

    /**
     * The role to assume to write log events to the destination.
     *
     * Default: No role assumed
     */
    override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): LogSubscriptionDestinationConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.logs.LogSubscriptionDestinationConfig):
        LogSubscriptionDestinationConfig = CdkObjectWrappers.wrap(cdkObject) as?
        LogSubscriptionDestinationConfig ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: LogSubscriptionDestinationConfig):
        software.amazon.awscdk.services.logs.LogSubscriptionDestinationConfig = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.logs.LogSubscriptionDestinationConfig
  }
}
