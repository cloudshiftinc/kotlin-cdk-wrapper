@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pinpoint

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pinpoint.CfnSegment
import software.amazon.awscdk.services.pinpoint.CfnSegmentProps

@CdkDslMarker
public class CfnSegmentPropsDsl {
  private val cdkBuilder: CfnSegmentProps.Builder = CfnSegmentProps.builder()

  /**
   * @param applicationId The unique identifier for the Amazon Pinpoint application that the segment
   * is associated with. 
   */
  public fun applicationId(applicationId: String) {
    cdkBuilder.applicationId(applicationId)
  }

  /**
   * @param dimensions The criteria that define the dimensions for the segment.
   */
  public fun dimensions(dimensions: IResolvable) {
    cdkBuilder.dimensions(dimensions)
  }

  /**
   * @param dimensions The criteria that define the dimensions for the segment.
   */
  public fun dimensions(dimensions: CfnSegment.SegmentDimensionsProperty) {
    cdkBuilder.dimensions(dimensions)
  }

  /**
   * @param name The name of the segment. 
   *
   * A segment must have a name otherwise it will not appear in the Amazon Pinpoint console.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param segmentGroups The segment group to use and the dimensions to apply to the group's base
   * segments in order to build the segment.
   * A segment group can consist of zero or more base segments. Your request can include only one
   * segment group.
   */
  public fun segmentGroups(segmentGroups: IResolvable) {
    cdkBuilder.segmentGroups(segmentGroups)
  }

  /**
   * @param segmentGroups The segment group to use and the dimensions to apply to the group's base
   * segments in order to build the segment.
   * A segment group can consist of zero or more base segments. Your request can include only one
   * segment group.
   */
  public fun segmentGroups(segmentGroups: CfnSegment.SegmentGroupsProperty) {
    cdkBuilder.segmentGroups(segmentGroups)
  }

  /**
   * @param tags An array of key-value pairs to apply to this resource.
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   */
  public fun tags(tags: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(tags)
    cdkBuilder.tags(builder.map)
  }

  /**
   * @param tags An array of key-value pairs to apply to this resource.
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   */
  public fun tags(tags: Any) {
    cdkBuilder.tags(tags)
  }

  public fun build(): CfnSegmentProps = cdkBuilder.build()
}
