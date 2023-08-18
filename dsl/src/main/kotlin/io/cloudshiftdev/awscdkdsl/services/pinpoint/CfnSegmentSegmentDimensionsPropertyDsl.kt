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
import kotlin.Unit
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pinpoint.CfnSegment

/**
 * Specifies the dimension settings for a segment.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pinpoint.*;
 * Object attributes;
 * Object metrics;
 * Object userAttributes;
 * SegmentDimensionsProperty segmentDimensionsProperty = SegmentDimensionsProperty.builder()
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-segmentdimensions.html)
 */
@CdkDslMarker
public class CfnSegmentSegmentDimensionsPropertyDsl {
    private val cdkBuilder: CfnSegment.SegmentDimensionsProperty.Builder =
        CfnSegment.SegmentDimensionsProperty.builder()

    /**
     * @param attributes One or more custom attributes to use as criteria for the segment. For more
     *   information see
     *   [AttributeDimension](https://docs.aws.amazon.com/pinpoint/latest/apireference/apps-application-id-segments.html#apps-application-id-segments-model-attributedimension)
     */
    public fun attributes(attributes: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(attributes)
        cdkBuilder.attributes(builder.map)
    }

    /**
     * @param attributes One or more custom attributes to use as criteria for the segment. For more
     *   information see
     *   [AttributeDimension](https://docs.aws.amazon.com/pinpoint/latest/apireference/apps-application-id-segments.html#apps-application-id-segments-model-attributedimension)
     */
    public fun attributes(attributes: Any) {
        cdkBuilder.attributes(attributes)
    }

    /**
     * @param behavior The behavior-based criteria, such as how recently users have used your app,
     *   for the segment.
     */
    public fun behavior(behavior: IResolvable) {
        cdkBuilder.behavior(behavior)
    }

    /**
     * @param behavior The behavior-based criteria, such as how recently users have used your app,
     *   for the segment.
     */
    public fun behavior(behavior: CfnSegment.BehaviorProperty) {
        cdkBuilder.behavior(behavior)
    }

    /**
     * @param demographic The demographic-based criteria, such as device platform, for the segment.
     */
    public fun demographic(demographic: IResolvable) {
        cdkBuilder.demographic(demographic)
    }

    /**
     * @param demographic The demographic-based criteria, such as device platform, for the segment.
     */
    public fun demographic(demographic: CfnSegment.DemographicProperty) {
        cdkBuilder.demographic(demographic)
    }

    /**
     * @param location The location-based criteria, such as region or GPS coordinates, for the
     *   segment.
     */
    public fun location(location: IResolvable) {
        cdkBuilder.location(location)
    }

    /**
     * @param location The location-based criteria, such as region or GPS coordinates, for the
     *   segment.
     */
    public fun location(location: CfnSegment.LocationProperty) {
        cdkBuilder.location(location)
    }

    /** @param metrics One or more custom metrics to use as criteria for the segment. */
    public fun metrics(metrics: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(metrics)
        cdkBuilder.metrics(builder.map)
    }

    /** @param metrics One or more custom metrics to use as criteria for the segment. */
    public fun metrics(metrics: Any) {
        cdkBuilder.metrics(metrics)
    }

    /**
     * @param userAttributes One or more custom user attributes to use as criteria for the segment.
     */
    public fun userAttributes(userAttributes: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(userAttributes)
        cdkBuilder.userAttributes(builder.map)
    }

    /**
     * @param userAttributes One or more custom user attributes to use as criteria for the segment.
     */
    public fun userAttributes(userAttributes: Any) {
        cdkBuilder.userAttributes(userAttributes)
    }

    public fun build(): CfnSegment.SegmentDimensionsProperty = cdkBuilder.build()
}
