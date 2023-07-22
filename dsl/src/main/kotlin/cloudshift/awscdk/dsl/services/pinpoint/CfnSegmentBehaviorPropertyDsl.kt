@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pinpoint

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pinpoint.CfnSegment

/**
 * Specifies behavior-based criteria for the segment, such as how recently users have used your app.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pinpoint.*;
 * BehaviorProperty behaviorProperty = BehaviorProperty.builder()
 * .recency(RecencyProperty.builder()
 * .duration("duration")
 * .recencyType("recencyType")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-behavior.html)
 */
@CdkDslMarker
public class CfnSegmentBehaviorPropertyDsl {
  private val cdkBuilder: CfnSegment.BehaviorProperty.Builder =
      CfnSegment.BehaviorProperty.builder()

  /**
   * @param recency Specifies how recently segment members were active.
   */
  public fun recency(recency: IResolvable) {
    cdkBuilder.recency(recency)
  }

  /**
   * @param recency Specifies how recently segment members were active.
   */
  public fun recency(recency: CfnSegment.RecencyProperty) {
    cdkBuilder.recency(recency)
  }

  public fun build(): CfnSegment.BehaviorProperty = cdkBuilder.build()
}
