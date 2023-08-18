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
 * A list of the account IDs of AWS accounts with Amazon EMR clusters that are allowed to perform
 * data filtering.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lakeformation.*;
 * ExternalDataFilteringAllowListProperty externalDataFilteringAllowListProperty =
 * ExternalDataFilteringAllowListProperty.builder().build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-datalakesettings-externaldatafilteringallowlist.html)
 */
@CdkDslMarker
public class CfnDataLakeSettingsExternalDataFilteringAllowListPropertyDsl {
    private val cdkBuilder: CfnDataLakeSettings.ExternalDataFilteringAllowListProperty.Builder =
        CfnDataLakeSettings.ExternalDataFilteringAllowListProperty.builder()

    public fun build(): CfnDataLakeSettings.ExternalDataFilteringAllowListProperty =
        cdkBuilder.build()
}
