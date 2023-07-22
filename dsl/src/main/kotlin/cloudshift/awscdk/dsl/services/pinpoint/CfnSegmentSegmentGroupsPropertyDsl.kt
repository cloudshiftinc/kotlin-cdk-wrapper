@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pinpoint

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pinpoint.CfnSegment

/**
 * Specifies the set of segment criteria to evaluate when handling segment groups for the segment.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pinpoint.*;
 * Object attributes;
 * Object metrics;
 * Object userAttributes;
 * SegmentGroupsProperty segmentGroupsProperty = SegmentGroupsProperty.builder()
 * .groups(List.of(GroupsProperty.builder()
 * .dimensions(List.of(SegmentDimensionsProperty.builder()
 * .attributes(attributes)
 * .behavior(BehaviorProperty.builder()
 * .recency(RecencyProperty.builder()
 * .duration("duration")
 * .recencyType("recencyType")
 * .build())
 * .build())
 * .demographic(DemographicProperty.builder()
 * .appVersion(SetDimensionProperty.builder()
 * .dimensionType("dimensionType")
 * .values(List.of("values"))
 * .build())
 * .channel(SetDimensionProperty.builder()
 * .dimensionType("dimensionType")
 * .values(List.of("values"))
 * .build())
 * .deviceType(SetDimensionProperty.builder()
 * .dimensionType("dimensionType")
 * .values(List.of("values"))
 * .build())
 * .make(SetDimensionProperty.builder()
 * .dimensionType("dimensionType")
 * .values(List.of("values"))
 * .build())
 * .model(SetDimensionProperty.builder()
 * .dimensionType("dimensionType")
 * .values(List.of("values"))
 * .build())
 * .platform(SetDimensionProperty.builder()
 * .dimensionType("dimensionType")
 * .values(List.of("values"))
 * .build())
 * .build())
 * .location(LocationProperty.builder()
 * .country(SetDimensionProperty.builder()
 * .dimensionType("dimensionType")
 * .values(List.of("values"))
 * .build())
 * .gpsPoint(GPSPointProperty.builder()
 * .coordinates(CoordinatesProperty.builder()
 * .latitude(123)
 * .longitude(123)
 * .build())
 * .rangeInKilometers(123)
 * .build())
 * .build())
 * .metrics(metrics)
 * .userAttributes(userAttributes)
 * .build()))
 * .sourceSegments(List.of(SourceSegmentsProperty.builder()
 * .id("id")
 * // the properties below are optional
 * .version(123)
 * .build()))
 * .sourceType("sourceType")
 * .type("type")
 * .build()))
 * .include("include")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-segmentgroups.html)
 */
@CdkDslMarker
public class CfnSegmentSegmentGroupsPropertyDsl {
  private val cdkBuilder: CfnSegment.SegmentGroupsProperty.Builder =
      CfnSegment.SegmentGroupsProperty.builder()

  private val _groups: MutableList<Any> = mutableListOf()

  /**
   * @param groups Specifies the set of segment criteria to evaluate when handling segment groups
   * for the segment.
   */
  public fun groups(vararg groups: Any) {
    _groups.addAll(listOf(*groups))
  }

  /**
   * @param groups Specifies the set of segment criteria to evaluate when handling segment groups
   * for the segment.
   */
  public fun groups(groups: Collection<Any>) {
    _groups.addAll(groups)
  }

  /**
   * @param groups Specifies the set of segment criteria to evaluate when handling segment groups
   * for the segment.
   */
  public fun groups(groups: IResolvable) {
    cdkBuilder.groups(groups)
  }

  /**
   * @param include Specifies how to handle multiple segment groups for the segment.
   * For example, if the segment includes three segment groups, whether the resulting segment
   * includes endpoints that match all, any, or none of the segment groups.
   */
  public fun include(include: String) {
    cdkBuilder.include(include)
  }

  public fun build(): CfnSegment.SegmentGroupsProperty {
    if(_groups.isNotEmpty()) cdkBuilder.groups(_groups)
    return cdkBuilder.build()
  }
}
