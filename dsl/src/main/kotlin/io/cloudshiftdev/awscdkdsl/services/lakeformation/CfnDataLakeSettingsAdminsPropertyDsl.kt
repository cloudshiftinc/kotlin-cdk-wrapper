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

package io.cloudshiftdev.awscdkdsl.services.lakeformation

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import software.amazon.awscdk.services.lakeformation.CfnDataLakeSettings

/**
 * A list of AWS Lake Formation principals.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lakeformation.*;
 * AdminsProperty adminsProperty = AdminsProperty.builder().build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-datalakesettings-admins.html)
 */
@CdkDslMarker
public class CfnDataLakeSettingsAdminsPropertyDsl {
    private val cdkBuilder: CfnDataLakeSettings.AdminsProperty.Builder =
        CfnDataLakeSettings.AdminsProperty.builder()

    public fun build(): CfnDataLakeSettings.AdminsProperty = cdkBuilder.build()
}
