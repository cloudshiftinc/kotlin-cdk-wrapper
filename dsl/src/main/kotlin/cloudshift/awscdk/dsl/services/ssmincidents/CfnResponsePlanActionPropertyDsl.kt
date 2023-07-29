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

package cloudshift.awscdk.dsl.services.ssmincidents

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ssmincidents.CfnResponsePlan

/**
 * The `Action` property type specifies the configuration to launch.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ssmincidents.*;
 * ActionProperty actionProperty = ActionProperty.builder()
 * .ssmAutomation(SsmAutomationProperty.builder()
 * .documentName("documentName")
 * .roleArn("roleArn")
 * // the properties below are optional
 * .documentVersion("documentVersion")
 * .dynamicParameters(List.of(DynamicSsmParameterProperty.builder()
 * .key("key")
 * .value(DynamicSsmParameterValueProperty.builder()
 * .variable("variable")
 * .build())
 * .build()))
 * .parameters(List.of(SsmParameterProperty.builder()
 * .key("key")
 * .values(List.of("values"))
 * .build()))
 * .targetAccount("targetAccount")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmincidents-responseplan-action.html)
 */
@CdkDslMarker
public class CfnResponsePlanActionPropertyDsl {
    private val cdkBuilder: CfnResponsePlan.ActionProperty.Builder =
        CfnResponsePlan.ActionProperty.builder()

    /**
     * @param ssmAutomation Details about the Systems Manager automation document that will be used
     *   as a runbook during an incident.
     */
    public fun ssmAutomation(ssmAutomation: IResolvable) {
        cdkBuilder.ssmAutomation(ssmAutomation)
    }

    /**
     * @param ssmAutomation Details about the Systems Manager automation document that will be used
     *   as a runbook during an incident.
     */
    public fun ssmAutomation(ssmAutomation: CfnResponsePlan.SsmAutomationProperty) {
        cdkBuilder.ssmAutomation(ssmAutomation)
    }

    public fun build(): CfnResponsePlan.ActionProperty = cdkBuilder.build()
}
