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

package cloudshift.awscdk.dsl.services.iotevents

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotevents.CfnAlarmModel

/**
 * Defines when your alarm is invoked.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotevents.*;
 * AlarmRuleProperty alarmRuleProperty = AlarmRuleProperty.builder()
 * .simpleRule(SimpleRuleProperty.builder()
 * .comparisonOperator("comparisonOperator")
 * .inputProperty("inputProperty")
 * .threshold("threshold")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-alarmrule.html)
 */
@CdkDslMarker
public class CfnAlarmModelAlarmRulePropertyDsl {
    private val cdkBuilder: CfnAlarmModel.AlarmRuleProperty.Builder =
        CfnAlarmModel.AlarmRuleProperty.builder()

    /**
     * @param simpleRule A rule that compares an input property value to a threshold value with a
     *   comparison operator.
     */
    public fun simpleRule(simpleRule: IResolvable) {
        cdkBuilder.simpleRule(simpleRule)
    }

    /**
     * @param simpleRule A rule that compares an input property value to a threshold value with a
     *   comparison operator.
     */
    public fun simpleRule(simpleRule: CfnAlarmModel.SimpleRuleProperty) {
        cdkBuilder.simpleRule(simpleRule)
    }

    public fun build(): CfnAlarmModel.AlarmRuleProperty = cdkBuilder.build()
}
