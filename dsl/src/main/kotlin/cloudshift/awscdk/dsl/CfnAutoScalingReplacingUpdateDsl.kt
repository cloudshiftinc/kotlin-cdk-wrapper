@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.CfnAutoScalingReplacingUpdate

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
 * import software.amazon.awscdk.*;
 * CfnAutoScalingReplacingUpdate cfnAutoScalingReplacingUpdate =
 * CfnAutoScalingReplacingUpdate.builder()
 * .willReplace(false)
 * .build();
 * ```
 */
@CdkDslMarker
public class CfnAutoScalingReplacingUpdateDsl {
  private val cdkBuilder: CfnAutoScalingReplacingUpdate.Builder =
      CfnAutoScalingReplacingUpdate.builder()

  /**
   * @param willReplace the value to be set.
   */
  public fun willReplace(willReplace: Boolean) {
    cdkBuilder.willReplace(willReplace)
  }

  public fun build(): CfnAutoScalingReplacingUpdate = cdkBuilder.build()
}
