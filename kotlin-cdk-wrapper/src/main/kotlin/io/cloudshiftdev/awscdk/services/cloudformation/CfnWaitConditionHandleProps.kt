@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudformation

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Unit

/**
 * Properties for defining a `CfnWaitConditionHandle`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cloudformation.*;
 * CfnWaitConditionHandleProps cfnWaitConditionHandleProps =
 * CfnWaitConditionHandleProps.builder().build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-waitconditionhandle.html)
 */
public interface CfnWaitConditionHandleProps {
  /**
   * A builder for [CfnWaitConditionHandleProps]
   */
  @CdkDslMarker
  public interface Builder

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cloudformation.CfnWaitConditionHandleProps.Builder =
        software.amazon.awscdk.services.cloudformation.CfnWaitConditionHandleProps.builder()

    public fun build(): software.amazon.awscdk.services.cloudformation.CfnWaitConditionHandleProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.cloudformation.CfnWaitConditionHandleProps,
  ) : CdkObject(cdkObject), CfnWaitConditionHandleProps

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnWaitConditionHandleProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cloudformation.CfnWaitConditionHandleProps):
        CfnWaitConditionHandleProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnWaitConditionHandleProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnWaitConditionHandleProps):
        software.amazon.awscdk.services.cloudformation.CfnWaitConditionHandleProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.cloudformation.CfnWaitConditionHandleProps
  }
}
