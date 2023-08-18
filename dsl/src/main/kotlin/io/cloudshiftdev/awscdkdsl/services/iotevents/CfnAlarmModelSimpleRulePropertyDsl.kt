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

package io.cloudshiftdev.awscdkdsl.services.iotevents

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iotevents.CfnAlarmModel

/**
 * A rule that compares an input property value to a threshold value with a comparison operator.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotevents.*;
 * SimpleRuleProperty simpleRuleProperty = SimpleRuleProperty.builder()
 * .comparisonOperator("comparisonOperator")
 * .inputProperty("inputProperty")
 * .threshold("threshold")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-simplerule.html)
 */
@CdkDslMarker
public class CfnAlarmModelSimpleRulePropertyDsl {
    private val cdkBuilder: CfnAlarmModel.SimpleRuleProperty.Builder =
        CfnAlarmModel.SimpleRuleProperty.builder()

    /** @param comparisonOperator The comparison operator. */
    public fun comparisonOperator(comparisonOperator: String) {
        cdkBuilder.comparisonOperator(comparisonOperator)
    }

    /**
     * @param inputProperty The value on the left side of the comparison operator. You can specify
     *   an AWS IoT Events input attribute as an input property.
     */
    public fun inputProperty(inputProperty: String) {
        cdkBuilder.inputProperty(inputProperty)
    }

    /**
     * @param threshold The value on the right side of the comparison operator. You can enter a
     *   number or specify an AWS IoT Events input attribute.
     */
    public fun threshold(threshold: String) {
        cdkBuilder.threshold(threshold)
    }

    public fun build(): CfnAlarmModel.SimpleRuleProperty = cdkBuilder.build()
}
