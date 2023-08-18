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

package io.cloudshiftdev.awscdkdsl.services.backup

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.backup.CfnFramework

/**
 * A list of parameters for a control.
 *
 * A control can have zero, one, or more than one parameter. An example of a control with two
 * parameters is: "backup plan frequency is at least `daily` and the retention period is at least `1
 * year` ". The first parameter is `daily` . The second parameter is `1 year` .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.backup.*;
 * ControlInputParameterProperty controlInputParameterProperty =
 * ControlInputParameterProperty.builder()
 * .parameterName("parameterName")
 * .parameterValue("parameterValue")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-framework-controlinputparameter.html)
 */
@CdkDslMarker
public class CfnFrameworkControlInputParameterPropertyDsl {
    private val cdkBuilder: CfnFramework.ControlInputParameterProperty.Builder =
        CfnFramework.ControlInputParameterProperty.builder()

    /** @param parameterName The name of a parameter, for example, `BackupPlanFrequency` . */
    public fun parameterName(parameterName: String) {
        cdkBuilder.parameterName(parameterName)
    }

    /** @param parameterValue The value of parameter, for example, `hourly` . */
    public fun parameterValue(parameterValue: String) {
        cdkBuilder.parameterValue(parameterValue)
    }

    public fun build(): CfnFramework.ControlInputParameterProperty = cdkBuilder.build()
}
