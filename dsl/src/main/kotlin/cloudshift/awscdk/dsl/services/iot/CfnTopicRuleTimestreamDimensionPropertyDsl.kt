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
import software.amazon.awscdk.services.iot.CfnTopicRule

/**
 * Metadata attributes of the time series that are written in each measure record.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iot.*;
 * TimestreamDimensionProperty timestreamDimensionProperty = TimestreamDimensionProperty.builder()
 * .name("name")
 * .value("value")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-timestreamdimension.html)
 */
@CdkDslMarker
public class CfnTopicRuleTimestreamDimensionPropertyDsl {
    private val cdkBuilder: CfnTopicRule.TimestreamDimensionProperty.Builder =
        CfnTopicRule.TimestreamDimensionProperty.builder()

    /**
     * @param name The metadata dimension name. This is the name of the column in the Amazon
     *   Timestream database table record.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param value The value to write in this column of the database record. */
    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnTopicRule.TimestreamDimensionProperty = cdkBuilder.build()
}
