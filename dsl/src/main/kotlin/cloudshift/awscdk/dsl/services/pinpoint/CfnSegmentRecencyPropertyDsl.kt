@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pinpoint

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.pinpoint.CfnSegment

@CdkDslMarker
public class CfnSegmentRecencyPropertyDsl {
  private val cdkBuilder: CfnSegment.RecencyProperty.Builder = CfnSegment.RecencyProperty.builder()

  /**
   * @param duration The duration to use when determining which users have been active or inactive
   * with your app. 
   * Possible values: `HR_24` | `DAY_7` | `DAY_14` | `DAY_30` .
   */
  public fun duration(duration: String) {
    cdkBuilder.duration(duration)
  }

  /**
   * @param recencyType The type of recency dimension to use for the segment. 
   * Valid values are: `ACTIVE` and `INACTIVE` . If the value is `ACTIVE` , the segment includes
   * users who have used your app within the specified duration are included in the segment. If the
   * value is `INACTIVE` , the segment includes users who haven't used your app within the specified
   * duration are included in the segment.
   */
  public fun recencyType(recencyType: String) {
    cdkBuilder.recencyType(recencyType)
  }

  public fun build(): CfnSegment.RecencyProperty = cdkBuilder.build()
}
