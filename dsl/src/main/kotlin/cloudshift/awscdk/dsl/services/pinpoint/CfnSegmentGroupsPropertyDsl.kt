@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.pinpoint

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pinpoint.CfnSegment
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

/**
 * An array that defines the set of segment criteria to evaluate when handling segment groups for
 * the segment.
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
 * GroupsProperty groupsProperty = GroupsProperty.builder()
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-groups.html)
 */
@CdkDslMarker
public class CfnSegmentGroupsPropertyDsl {
    private val cdkBuilder: CfnSegment.GroupsProperty.Builder = CfnSegment.GroupsProperty.builder()

    private val _dimensions: MutableList<Any> = mutableListOf()

    private val _sourceSegments: MutableList<Any> = mutableListOf()

    /**
     * @param dimensions An array that defines the dimensions to include or exclude from the segment.
     */
    public fun dimensions(vararg dimensions: Any) {
        _dimensions.addAll(listOf(*dimensions))
    }

    /**
     * @param dimensions An array that defines the dimensions to include or exclude from the segment.
     */
    public fun dimensions(dimensions: Collection<Any>) {
        _dimensions.addAll(dimensions)
    }

    /**
     * @param dimensions An array that defines the dimensions to include or exclude from the segment.
     */
    public fun dimensions(dimensions: IResolvable) {
        cdkBuilder.dimensions(dimensions)
    }

    /**
     * @param sourceSegments The base segment to build the segment on.
     * A base segment, also called a *source segment* , defines the initial population of endpoints
     * for a segment. When you add dimensions to the segment, Amazon Pinpoint filters the base segment by
     * using the dimensions that you specify.
     *
     * You can specify more than one dimensional segment or only one imported segment. If you specify
     * an imported segment, the segment size estimate that displays on the Amazon Pinpoint console
     * indicates the size of the imported segment without any filters applied to it.
     */
    public fun sourceSegments(vararg sourceSegments: Any) {
        _sourceSegments.addAll(listOf(*sourceSegments))
    }

    /**
     * @param sourceSegments The base segment to build the segment on.
     * A base segment, also called a *source segment* , defines the initial population of endpoints
     * for a segment. When you add dimensions to the segment, Amazon Pinpoint filters the base segment by
     * using the dimensions that you specify.
     *
     * You can specify more than one dimensional segment or only one imported segment. If you specify
     * an imported segment, the segment size estimate that displays on the Amazon Pinpoint console
     * indicates the size of the imported segment without any filters applied to it.
     */
    public fun sourceSegments(sourceSegments: Collection<Any>) {
        _sourceSegments.addAll(sourceSegments)
    }

    /**
     * @param sourceSegments The base segment to build the segment on.
     * A base segment, also called a *source segment* , defines the initial population of endpoints
     * for a segment. When you add dimensions to the segment, Amazon Pinpoint filters the base segment by
     * using the dimensions that you specify.
     *
     * You can specify more than one dimensional segment or only one imported segment. If you specify
     * an imported segment, the segment size estimate that displays on the Amazon Pinpoint console
     * indicates the size of the imported segment without any filters applied to it.
     */
    public fun sourceSegments(sourceSegments: IResolvable) {
        cdkBuilder.sourceSegments(sourceSegments)
    }

    /**
     * @param sourceType Specifies how to handle multiple base segments for the segment.
     * For example, if you specify three base segments for the segment, whether the resulting segment
     * is based on all, any, or none of the base segments.
     */
    public fun sourceType(sourceType: String) {
        cdkBuilder.sourceType(sourceType)
    }

    /**
     * @param type Specifies how to handle multiple dimensions for the segment.
     * For example, if you specify three dimensions for the segment, whether the resulting segment
     * includes endpoints that match all, any, or none of the dimensions.
     */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnSegment.GroupsProperty {
        if (_dimensions.isNotEmpty()) cdkBuilder.dimensions(_dimensions)
        if (_sourceSegments.isNotEmpty()) cdkBuilder.sourceSegments(_sourceSegments)
        return cdkBuilder.build()
    }
}
