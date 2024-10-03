@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.Unit

/**
 * With scheduled actions, the group size properties of an Auto Scaling group can change at any
 * time.
 *
 * When you update a
 * stack with an Auto Scaling group and scheduled action, AWS CloudFormation always sets the group
 * size property values of
 * your Auto Scaling group to the values that are defined in the AWS::AutoScaling::AutoScalingGroup
 * resource of your template,
 * even if a scheduled action is in effect.
 *
 * If you do not want AWS CloudFormation to change any of the group size property values when you
 * have a scheduled action in
 * effect, use the AutoScalingScheduledAction update policy to prevent AWS CloudFormation from
 * changing the MinSize, MaxSize,
 * or DesiredCapacity properties unless you have modified these values in your template.\
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * CfnAutoScalingScheduledAction cfnAutoScalingScheduledAction =
 * CfnAutoScalingScheduledAction.builder()
 * .ignoreUnmodifiedGroupSizeProperties(false)
 * .build();
 * ```
 */
public interface CfnAutoScalingScheduledAction {
  /**
   *
   */
  public fun ignoreUnmodifiedGroupSizeProperties(): Boolean? =
      unwrap(this).getIgnoreUnmodifiedGroupSizeProperties()

  /**
   * A builder for [CfnAutoScalingScheduledAction]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param ignoreUnmodifiedGroupSizeProperties the value to be set.
     */
    public fun ignoreUnmodifiedGroupSizeProperties(ignoreUnmodifiedGroupSizeProperties: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.CfnAutoScalingScheduledAction.Builder =
        software.amazon.awscdk.CfnAutoScalingScheduledAction.builder()

    /**
     * @param ignoreUnmodifiedGroupSizeProperties the value to be set.
     */
    override fun ignoreUnmodifiedGroupSizeProperties(ignoreUnmodifiedGroupSizeProperties: Boolean) {
      cdkBuilder.ignoreUnmodifiedGroupSizeProperties(ignoreUnmodifiedGroupSizeProperties)
    }

    public fun build(): software.amazon.awscdk.CfnAutoScalingScheduledAction = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.CfnAutoScalingScheduledAction,
  ) : CdkObject(cdkObject),
      CfnAutoScalingScheduledAction {
    /**
     *
     */
    override fun ignoreUnmodifiedGroupSizeProperties(): Boolean? =
        unwrap(this).getIgnoreUnmodifiedGroupSizeProperties()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAutoScalingScheduledAction {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.CfnAutoScalingScheduledAction):
        CfnAutoScalingScheduledAction = CdkObjectWrappers.wrap(cdkObject) as?
        CfnAutoScalingScheduledAction ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAutoScalingScheduledAction):
        software.amazon.awscdk.CfnAutoScalingScheduledAction = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.CfnAutoScalingScheduledAction
  }
}
