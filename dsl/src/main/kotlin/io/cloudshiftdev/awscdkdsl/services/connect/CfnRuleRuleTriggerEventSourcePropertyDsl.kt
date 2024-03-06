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

package io.cloudshiftdev.awscdkdsl.services.connect

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.connect.CfnRule

/**
 * The name of the event source.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.connect.*;
 * RuleTriggerEventSourceProperty ruleTriggerEventSourceProperty =
 * RuleTriggerEventSourceProperty.builder()
 * .eventSourceName("eventSourceName")
 * // the properties below are optional
 * .integrationAssociationArn("integrationAssociationArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-rule-ruletriggereventsource.html)
 */
@CdkDslMarker
public class CfnRuleRuleTriggerEventSourcePropertyDsl {
    private val cdkBuilder: CfnRule.RuleTriggerEventSourceProperty.Builder =
        CfnRule.RuleTriggerEventSourceProperty.builder()

    /** @param eventSourceName The name of the event source. */
    public fun eventSourceName(eventSourceName: String) {
        cdkBuilder.eventSourceName(eventSourceName)
    }

    /**
     * @param integrationAssociationArn The Amazon Resource Name (ARN) of the integration
     *   association. `IntegrationAssociationArn` is required if `TriggerEventSource` is one of the
     *   following values: `OnZendeskTicketCreate` | `OnZendeskTicketStatusUpdate` |
     *   `OnSalesforceCaseCreate`
     */
    public fun integrationAssociationArn(integrationAssociationArn: String) {
        cdkBuilder.integrationAssociationArn(integrationAssociationArn)
    }

    public fun build(): CfnRule.RuleTriggerEventSourceProperty = cdkBuilder.build()
}
