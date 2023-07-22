@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ssmcontacts

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ssmcontacts.CfnRotation

@CdkDslMarker
public class CfnRotationCoverageTimePropertyDsl {
  private val cdkBuilder: CfnRotation.CoverageTimeProperty.Builder =
      CfnRotation.CoverageTimeProperty.builder()

  /**
   * @param endTime Information about when an on-call rotation shift ends. 
   */
  public fun endTime(endTime: String) {
    cdkBuilder.endTime(endTime)
  }

  /**
   * @param startTime Information about when an on-call rotation shift begins. 
   */
  public fun startTime(startTime: String) {
    cdkBuilder.startTime(startTime)
  }

  public fun build(): CfnRotation.CoverageTimeProperty = cdkBuilder.build()
}
