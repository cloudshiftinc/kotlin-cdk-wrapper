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

package cloudshift.awscdk.dsl.services.customerprofiles

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.customerprofiles.CfnIntegration

/**
 * Specifies the configuration details that control the trigger for a flow.
 *
 * Currently, these settings only apply to the Scheduled trigger type.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.customerprofiles.*;
 * TriggerPropertiesProperty triggerPropertiesProperty = TriggerPropertiesProperty.builder()
 * .scheduled(ScheduledTriggerPropertiesProperty.builder()
 * .scheduleExpression("scheduleExpression")
 * // the properties below are optional
 * .dataPullMode("dataPullMode")
 * .firstExecutionFrom(123)
 * .scheduleEndTime(123)
 * .scheduleOffset(123)
 * .scheduleStartTime(123)
 * .timezone("timezone")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-triggerproperties.html)
 */
@CdkDslMarker
public class CfnIntegrationTriggerPropertiesPropertyDsl {
    private val cdkBuilder: CfnIntegration.TriggerPropertiesProperty.Builder =
        CfnIntegration.TriggerPropertiesProperty.builder()

    /**
     * @param scheduled Specifies the configuration details of a schedule-triggered flow that you
     *   define.
     */
    public fun scheduled(scheduled: IResolvable) {
        cdkBuilder.scheduled(scheduled)
    }

    /**
     * @param scheduled Specifies the configuration details of a schedule-triggered flow that you
     *   define.
     */
    public fun scheduled(scheduled: CfnIntegration.ScheduledTriggerPropertiesProperty) {
        cdkBuilder.scheduled(scheduled)
    }

    public fun build(): CfnIntegration.TriggerPropertiesProperty = cdkBuilder.build()
}
