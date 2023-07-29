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
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ssmincidents.CfnResponsePlan

/**
 * When you add a runbook to a response plan, you can specify the parameters the runbook should use
 * at runtime.
 *
 * Response plans support parameters with both static and dynamic values. For static values, you
 * enter the value when you define the parameter in the response plan. For dynamic values, the
 * system determines the correct parameter value by collecting information from the incident.
 * Incident Manager supports the following dynamic parameters:
 *
 * *Incident ARN*
 *
 * When Incident Manager creates an incident, the system captures the Amazon Resource Name (ARN) of
 * the corresponding incident record and enters it for this parameter in the runbook.
 *
 * This value can only be assigned to parameters of type `String` . If assigned to a parameter of
 * any other type, the runbook fails to run.
 *
 * *Involved resources*
 *
 * When Incident Manager creates an incident, the system captures the ARNs of the resources involved
 * in the incident. These resource ARNs are then assigned to this parameter in the runbook.
 *
 * This value can only be assigned to parameters of type `StringList` . If assigned to a parameter
 * of any other type, the runbook fails to run.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ssmincidents.*;
 * DynamicSsmParameterProperty dynamicSsmParameterProperty = DynamicSsmParameterProperty.builder()
 * .key("key")
 * .value(DynamicSsmParameterValueProperty.builder()
 * .variable("variable")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmincidents-responseplan-dynamicssmparameter.html)
 */
@CdkDslMarker
public class CfnResponsePlanDynamicSsmParameterPropertyDsl {
    private val cdkBuilder: CfnResponsePlan.DynamicSsmParameterProperty.Builder =
        CfnResponsePlan.DynamicSsmParameterProperty.builder()

    /** @param key The key parameter to use when running the Systems Manager Automation runbook. */
    public fun key(key: String) {
        cdkBuilder.key(key)
    }

    /** @param value The dynamic parameter value. */
    public fun `value`(`value`: IResolvable) {
        cdkBuilder.`value`(`value`)
    }

    /** @param value The dynamic parameter value. */
    public fun `value`(`value`: CfnResponsePlan.DynamicSsmParameterValueProperty) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnResponsePlan.DynamicSsmParameterProperty = cdkBuilder.build()
}
