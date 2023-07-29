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

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iot.CfnTopicRule

/**
 * Describes an action to send device location updates from an MQTT message to an Amazon Location
 * tracker resource.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iot.*;
 * LocationActionProperty locationActionProperty = LocationActionProperty.builder()
 * .deviceId("deviceId")
 * .latitude("latitude")
 * .longitude("longitude")
 * .roleArn("roleArn")
 * .trackerName("trackerName")
 * // the properties below are optional
 * .timestamp(TimestampProperty.builder()
 * .value("value")
 * // the properties below are optional
 * .unit("unit")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-locationaction.html)
 */
@CdkDslMarker
public class CfnTopicRuleLocationActionPropertyDsl {
    private val cdkBuilder: CfnTopicRule.LocationActionProperty.Builder =
        CfnTopicRule.LocationActionProperty.builder()

    /** @param deviceId The unique ID of the device providing the location data. */
    public fun deviceId(deviceId: String) {
        cdkBuilder.deviceId(deviceId)
    }

    /**
     * @param latitude A string that evaluates to a double value that represents the latitude of the
     *   device's location.
     */
    public fun latitude(latitude: String) {
        cdkBuilder.latitude(latitude)
    }

    /**
     * @param longitude A string that evaluates to a double value that represents the longitude of
     *   the device's location.
     */
    public fun longitude(longitude: String) {
        cdkBuilder.longitude(longitude)
    }

    /**
     * @param roleArn The IAM role that grants permission to write to the Amazon Location resource.
     */
    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    /**
     * @param timestamp The time that the location data was sampled. The default value is the time
     *   the MQTT message was processed.
     */
    public fun timestamp(timestamp: IResolvable) {
        cdkBuilder.timestamp(timestamp)
    }

    /**
     * @param timestamp The time that the location data was sampled. The default value is the time
     *   the MQTT message was processed.
     */
    public fun timestamp(timestamp: CfnTopicRule.TimestampProperty) {
        cdkBuilder.timestamp(timestamp)
    }

    /**
     * @param trackerName The name of the tracker resource in Amazon Location in which the location
     *   is updated.
     */
    public fun trackerName(trackerName: String) {
        cdkBuilder.trackerName(trackerName)
    }

    public fun build(): CfnTopicRule.LocationActionProperty = cdkBuilder.build()
}
