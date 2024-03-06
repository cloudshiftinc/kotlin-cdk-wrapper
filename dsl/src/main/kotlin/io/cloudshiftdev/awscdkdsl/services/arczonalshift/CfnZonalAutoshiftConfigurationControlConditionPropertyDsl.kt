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

package io.cloudshiftdev.awscdkdsl.services.arczonalshift

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.arczonalshift.CfnZonalAutoshiftConfiguration

/**
 * A control condition is an alarm that you specify for a practice run.
 *
 * When you configure practice runs with zonal autoshift for a resource, you specify Amazon
 * CloudWatch alarms, which you create in CloudWatch to use with the practice run. The alarms that
 * you specify are an *outcome alarm* , to monitor application health during practice runs and,
 * optionally, a *blocking alarm* , to block practice runs from starting or to interrupt a practice
 * run in progress.
 *
 * Control condition alarms do not apply for autoshifts.
 *
 * For more information, see
 * [Considerations when you configure zonal autoshift](https://docs.aws.amazon.com/r53recovery/latest/dg/arc-zonal-autoshift.considerations.html)
 * in the Route 53 ARC Developer Guide.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.arczonalshift.*;
 * ControlConditionProperty controlConditionProperty = ControlConditionProperty.builder()
 * .alarmIdentifier("alarmIdentifier")
 * .type("type")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-arczonalshift-zonalautoshiftconfiguration-controlcondition.html)
 */
@CdkDslMarker
public class CfnZonalAutoshiftConfigurationControlConditionPropertyDsl {
    private val cdkBuilder: CfnZonalAutoshiftConfiguration.ControlConditionProperty.Builder =
        CfnZonalAutoshiftConfiguration.ControlConditionProperty.builder()

    /**
     * @param alarmIdentifier The Amazon Resource Name (ARN) for an Amazon CloudWatch alarm that you
     *   specify as a control condition for a practice run.
     */
    public fun alarmIdentifier(alarmIdentifier: String) {
        cdkBuilder.alarmIdentifier(alarmIdentifier)
    }

    /**
     * @param type The type of alarm specified for a practice run. You can only specify Amazon
     *   CloudWatch alarms for practice runs, so the only valid value is `CLOUDWATCH` .
     */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnZonalAutoshiftConfiguration.ControlConditionProperty = cdkBuilder.build()
}
