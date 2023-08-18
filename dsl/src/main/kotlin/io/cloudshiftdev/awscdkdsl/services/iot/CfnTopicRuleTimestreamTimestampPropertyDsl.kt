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
 * The value to use for the entry's timestamp.
 *
 * If blank, the time that the entry was processed is used.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iot.*;
 * TimestreamTimestampProperty timestreamTimestampProperty = TimestreamTimestampProperty.builder()
 * .unit("unit")
 * .value("value")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-timestreamtimestamp.html)
 */
@CdkDslMarker
public class CfnTopicRuleTimestreamTimestampPropertyDsl {
    private val cdkBuilder: CfnTopicRule.TimestreamTimestampProperty.Builder =
        CfnTopicRule.TimestreamTimestampProperty.builder()

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

    public fun build(): CfnTopicRule.TimestreamTimestampProperty = cdkBuilder.build()
}
