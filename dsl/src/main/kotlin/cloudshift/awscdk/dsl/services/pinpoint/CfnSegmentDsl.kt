@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pinpoint

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pinpoint.CfnSegment
import software.constructs.Construct

@CdkDslMarker
public class CfnSegmentDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnSegment.Builder = CfnSegment.Builder.create(scope, id)

  /**
   * The unique identifier for the Amazon Pinpoint application that the segment is associated with.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-segment.html#cfn-pinpoint-segment-applicationid)
   * @param applicationId The unique identifier for the Amazon Pinpoint application that the segment
   * is associated with. 
   */
  public fun applicationId(applicationId: String) {
    cdkBuilder.applicationId(applicationId)
  }

  /**
   * The criteria that define the dimensions for the segment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-segment.html#cfn-pinpoint-segment-dimensions)
   * @param dimensions The criteria that define the dimensions for the segment. 
   */
  public fun dimensions(dimensions: IResolvable) {
    cdkBuilder.dimensions(dimensions)
  }

  /**
   * The criteria that define the dimensions for the segment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-segment.html#cfn-pinpoint-segment-dimensions)
   * @param dimensions The criteria that define the dimensions for the segment. 
   */
  public fun dimensions(dimensions: CfnSegment.SegmentDimensionsProperty) {
    cdkBuilder.dimensions(dimensions)
  }

  /**
   * The name of the segment.
   *
   *
   * A segment must have a name otherwise it will not appear in the Amazon Pinpoint console.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-segment.html#cfn-pinpoint-segment-name)
   * @param name The name of the segment. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * The segment group to use and the dimensions to apply to the group's base segments in order to
   * build the segment.
   *
   * A segment group can consist of zero or more base segments. Your request can include only one
   * segment group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-segment.html#cfn-pinpoint-segment-segmentgroups)
   * @param segmentGroups The segment group to use and the dimensions to apply to the group's base
   * segments in order to build the segment. 
   */
  public fun segmentGroups(segmentGroups: IResolvable) {
    cdkBuilder.segmentGroups(segmentGroups)
  }

  /**
   * The segment group to use and the dimensions to apply to the group's base segments in order to
   * build the segment.
   *
   * A segment group can consist of zero or more base segments. Your request can include only one
   * segment group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-segment.html#cfn-pinpoint-segment-segmentgroups)
   * @param segmentGroups The segment group to use and the dimensions to apply to the group's base
   * segments in order to build the segment. 
   */
  public fun segmentGroups(segmentGroups: CfnSegment.SegmentGroupsProperty) {
    cdkBuilder.segmentGroups(segmentGroups)
  }

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-segment.html#cfn-pinpoint-segment-tags)
   * @param tags An array of key-value pairs to apply to this resource. 
   */
  public fun tags(tags: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(tags)
    cdkBuilder.tags(builder.map)
  }

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-segment.html#cfn-pinpoint-segment-tags)
   * @param tags An array of key-value pairs to apply to this resource. 
   */
  public fun tags(tags: Any) {
    cdkBuilder.tags(tags)
  }

  public fun build(): CfnSegment = cdkBuilder.build()
}
