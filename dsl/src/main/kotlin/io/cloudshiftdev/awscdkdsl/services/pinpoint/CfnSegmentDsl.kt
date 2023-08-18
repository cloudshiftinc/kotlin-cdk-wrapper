@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.pinpoint

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pinpoint.CfnSegment
import software.constructs.Construct

/**
 * Updates the configuration, dimension, and other settings for an existing segment.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pinpoint.*;
 * Object attributes;
 * Object metrics;
 * Object tags;
 * Object userAttributes;
 * CfnSegment cfnSegment = CfnSegment.Builder.create(this, "MyCfnSegment")
 * .applicationId("applicationId")
 * .name("name")
 * // the properties below are optional
 * .dimensions(SegmentDimensionsProperty.builder()
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
 * .build())
 * .segmentGroups(SegmentGroupsProperty.builder()
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
 * .build())
 * .tags(tags)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-segment.html)
 */
@CdkDslMarker
public class CfnSegmentDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnSegment.Builder = CfnSegment.Builder.create(scope, id)

    /**
     * The unique identifier for the Amazon Pinpoint application that the segment is associated
     * with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-segment.html#cfn-pinpoint-segment-applicationid)
     *
     * @param applicationId The unique identifier for the Amazon Pinpoint application that the
     *   segment is associated with.
     */
    public fun applicationId(applicationId: String) {
        cdkBuilder.applicationId(applicationId)
    }

    /**
     * The criteria that define the dimensions for the segment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-segment.html#cfn-pinpoint-segment-dimensions)
     *
     * @param dimensions The criteria that define the dimensions for the segment.
     */
    public fun dimensions(dimensions: IResolvable) {
        cdkBuilder.dimensions(dimensions)
    }

    /**
     * The criteria that define the dimensions for the segment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-segment.html#cfn-pinpoint-segment-dimensions)
     *
     * @param dimensions The criteria that define the dimensions for the segment.
     */
    public fun dimensions(dimensions: CfnSegment.SegmentDimensionsProperty) {
        cdkBuilder.dimensions(dimensions)
    }

    /**
     * The name of the segment.
     *
     * A segment must have a name otherwise it will not appear in the Amazon Pinpoint console.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-segment.html#cfn-pinpoint-segment-name)
     *
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
     *
     * @param segmentGroups The segment group to use and the dimensions to apply to the group's base
     *   segments in order to build the segment.
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
     *
     * @param segmentGroups The segment group to use and the dimensions to apply to the group's base
     *   segments in order to build the segment.
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
     *
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
     *
     * @param tags An array of key-value pairs to apply to this resource.
     */
    public fun tags(tags: Any) {
        cdkBuilder.tags(tags)
    }

    public fun build(): CfnSegment = cdkBuilder.build()
}
