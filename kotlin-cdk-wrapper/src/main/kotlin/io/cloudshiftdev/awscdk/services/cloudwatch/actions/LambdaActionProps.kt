@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudwatch.actions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.Unit

/**
 * Properties for Lambda Alarm Action.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cloudwatch.actions.*;
 * LambdaActionProps lambdaActionProps = LambdaActionProps.builder()
 * .useUniquePermissionId(false)
 * .build();
 * ```
 */
public interface LambdaActionProps {
  /**
   * Whether to generate unique Lambda Permission id.
   *
   * Use this parameter to resolve id collision in case of multiple alarms triggering the same
   * action
   *
   * Default: - false
   *
   * [Documentation](https://github.com/aws/aws-cdk/issues/33958)
   */
  public fun useUniquePermissionId(): Boolean? = unwrap(this).getUseUniquePermissionId()

  /**
   * A builder for [LambdaActionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param useUniquePermissionId Whether to generate unique Lambda Permission id.
     * Use this parameter to resolve id collision in case of multiple alarms triggering the same
     * action
     */
    public fun useUniquePermissionId(useUniquePermissionId: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cloudwatch.actions.LambdaActionProps.Builder =
        software.amazon.awscdk.services.cloudwatch.actions.LambdaActionProps.builder()

    /**
     * @param useUniquePermissionId Whether to generate unique Lambda Permission id.
     * Use this parameter to resolve id collision in case of multiple alarms triggering the same
     * action
     */
    override fun useUniquePermissionId(useUniquePermissionId: Boolean) {
      cdkBuilder.useUniquePermissionId(useUniquePermissionId)
    }

    public fun build(): software.amazon.awscdk.services.cloudwatch.actions.LambdaActionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cloudwatch.actions.LambdaActionProps,
  ) : CdkObject(cdkObject),
      LambdaActionProps {
    /**
     * Whether to generate unique Lambda Permission id.
     *
     * Use this parameter to resolve id collision in case of multiple alarms triggering the same
     * action
     *
     * Default: - false
     *
     * [Documentation](https://github.com/aws/aws-cdk/issues/33958)
     */
    override fun useUniquePermissionId(): Boolean? = unwrap(this).getUseUniquePermissionId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): LambdaActionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.actions.LambdaActionProps):
        LambdaActionProps = CdkObjectWrappers.wrap(cdkObject) as? LambdaActionProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: LambdaActionProps):
        software.amazon.awscdk.services.cloudwatch.actions.LambdaActionProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloudwatch.actions.LambdaActionProps
  }
}
