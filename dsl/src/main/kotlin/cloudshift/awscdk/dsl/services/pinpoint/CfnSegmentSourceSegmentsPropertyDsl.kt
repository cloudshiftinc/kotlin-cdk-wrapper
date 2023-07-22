@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pinpoint

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.pinpoint.CfnSegment

/**
 * Specifies the base segment to build the segment on.
 *
 * A base segment, also called a *source segment* , defines the initial population of endpoints for
 * a segment. When you add dimensions to the segment, Amazon Pinpoint filters the base segment by using
 * the dimensions that you specify.
 *
 * You can specify more than one dimensional segment or only one imported segment. If you specify an
 * imported segment, the segment size estimate that displays on the Amazon Pinpoint console indicates
 * the size of the imported segment without any filters applied to it.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pinpoint.*;
 * SourceSegmentsProperty sourceSegmentsProperty = SourceSegmentsProperty.builder()
 * .id("id")
 * // the properties below are optional
 * .version(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-sourcesegments.html)
 */
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
