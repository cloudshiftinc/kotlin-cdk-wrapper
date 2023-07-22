@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pinpoint

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.pinpoint.CfnSegment

@CdkDslMarker
public class CfnSegmentSourceSegmentsPropertyDsl {
  private val cdkBuilder: CfnSegment.SourceSegmentsProperty.Builder =
      CfnSegment.SourceSegmentsProperty.builder()

  /**
   * @param id The unique identifier for the source segment. 
   */
  public fun id(id: String) {
    cdkBuilder.id(id)
  }

  /**
   * @param version The version number of the source segment.
   */
  public fun version(version: Number) {
    cdkBuilder.version(version)
  }

  public fun build(): CfnSegment.SourceSegmentsProperty = cdkBuilder.build()
}
