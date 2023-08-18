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

package io.cloudshiftdev.awscdkdsl.services.iot

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iot.CfnTopicRule

/**
 * Describes how to interpret an application-defined timestamp value from an MQTT message payload
 * and the precision of that value.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iot.*;
 * TimestampProperty timestampProperty = TimestampProperty.builder()
 * .value("value")
 * // the properties below are optional
 * .unit("unit")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-timestamp.html)
 */
@CdkDslMarker
public class CfnTopicRuleTimestampPropertyDsl {
    private val cdkBuilder: CfnTopicRule.TimestampProperty.Builder =
        CfnTopicRule.TimestampProperty.builder()

    /**
     * @param unit The precision of the timestamp value that results from the expression described
     *   in `value` .
     */
    public fun unit(unit: String) {
        cdkBuilder.unit(unit)
    }

    /** @param value An expression that returns a long epoch time value. */
    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnTopicRule.TimestampProperty = cdkBuilder.build()
}
