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

package io.cloudshiftdev.awscdkdsl.services.quicksight

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnDashboard

/**
 * The options that determine the null value format configuration.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * NullValueFormatConfigurationProperty nullValueFormatConfigurationProperty =
 * NullValueFormatConfigurationProperty.builder()
 * .nullString("nullString")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-nullvalueformatconfiguration.html)
 */
@CdkDslMarker
public class CfnDashboardNullValueFormatConfigurationPropertyDsl {
    private val cdkBuilder: CfnDashboard.NullValueFormatConfigurationProperty.Builder =
        CfnDashboard.NullValueFormatConfigurationProperty.builder()

    /** @param nullString Determines the null string of null values. */
    public fun nullString(nullString: String) {
        cdkBuilder.nullString(nullString)
    }

    public fun build(): CfnDashboard.NullValueFormatConfigurationProperty = cdkBuilder.build()
}
