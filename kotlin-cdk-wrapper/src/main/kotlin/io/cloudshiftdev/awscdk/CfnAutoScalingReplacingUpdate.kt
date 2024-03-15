@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.Unit

/**
 * Specifies whether an Auto Scaling group and the instances it contains are replaced during an
 * update.
 *
 * During replacement,
 * AWS CloudFormation retains the old group until it finishes creating the new one. If the update
 * fails, AWS CloudFormation
 * can roll back to the old Auto Scaling group and delete the new Auto Scaling group.
 *
 * While AWS CloudFormation creates the new group, it doesn't detach or attach any instances. After
 * successfully creating
 * the new Auto Scaling group, AWS CloudFormation deletes the old Auto Scaling group during the
 * cleanup process.
 *
 * When you set the WillReplace parameter, remember to specify a matching CreationPolicy. If the
 * minimum number of
 * instances (specified by the MinSuccessfulInstancesPercent property) don't signal success within
 * the Timeout period
 * (specified in the CreationPolicy policy), the replacement update fails and AWS CloudFormation
 * rolls back to the old
 * Auto Scaling group.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * CfnAutoScalingReplacingUpdate cfnAutoScalingReplacingUpdate =
 * CfnAutoScalingReplacingUpdate.builder()
 * .willReplace(false)
 * .build();
 * ```
 */
public interface CfnAutoScalingReplacingUpdate {
  /**
   *
   */
  public fun willReplace(): Boolean? = unwrap(this).getWillReplace()

  /**
   * A builder for [CfnAutoScalingReplacingUpdate]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param willReplace the value to be set.
     */
    public fun willReplace(willReplace: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.CfnAutoScalingReplacingUpdate.Builder =
        software.amazon.awscdk.CfnAutoScalingReplacingUpdate.builder()

    /**
     * @param willReplace the value to be set.
     */
    override fun willReplace(willReplace: Boolean) {
      cdkBuilder.willReplace(willReplace)
    }

    public fun build(): software.amazon.awscdk.CfnAutoScalingReplacingUpdate = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.CfnAutoScalingReplacingUpdate,
  ) : CdkObject(cdkObject), CfnAutoScalingReplacingUpdate {
    /**
     *
     */
    override fun willReplace(): Boolean? = unwrap(this).getWillReplace()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAutoScalingReplacingUpdate {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.CfnAutoScalingReplacingUpdate):
        CfnAutoScalingReplacingUpdate = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAutoScalingReplacingUpdate):
        software.amazon.awscdk.CfnAutoScalingReplacingUpdate = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.CfnAutoScalingReplacingUpdate
  }
}
