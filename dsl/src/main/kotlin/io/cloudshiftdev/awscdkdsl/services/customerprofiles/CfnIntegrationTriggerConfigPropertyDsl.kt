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

package io.cloudshiftdev.awscdkdsl.services.customerprofiles

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.customerprofiles.CfnIntegration

/**
 * The trigger settings that determine how and when Amazon AppFlow runs the specified flow.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.customerprofiles.*;
 * TriggerConfigProperty triggerConfigProperty = TriggerConfigProperty.builder()
 * .triggerType("triggerType")
 * // the properties below are optional
 * .triggerProperties(TriggerPropertiesProperty.builder()
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
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-triggerconfig.html)
 */
@CdkDslMarker
public class CfnIntegrationTriggerConfigPropertyDsl {
    private val cdkBuilder: CfnIntegration.TriggerConfigProperty.Builder =
        CfnIntegration.TriggerConfigProperty.builder()

    /**
     * @param triggerProperties Specifies the configuration details of a schedule-triggered flow
     *   that you define. Currently, these settings only apply to the Scheduled trigger type.
     */
    public fun triggerProperties(triggerProperties: IResolvable) {
        cdkBuilder.triggerProperties(triggerProperties)
    }

    /**
     * @param triggerProperties Specifies the configuration details of a schedule-triggered flow
     *   that you define. Currently, these settings only apply to the Scheduled trigger type.
     */
    public fun triggerProperties(triggerProperties: CfnIntegration.TriggerPropertiesProperty) {
        cdkBuilder.triggerProperties(triggerProperties)
    }

    /**
     * @param triggerType Specifies the type of flow trigger. It can be OnDemand, Scheduled, or
     *   Event.
     */
    public fun triggerType(triggerType: String) {
        cdkBuilder.triggerType(triggerType)
    }

    public fun build(): CfnIntegration.TriggerConfigProperty = cdkBuilder.build()
}
