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

package cloudshift.awscdk.dsl.services.kinesisanalytics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2

/**
 * Specifies the maintence window parameters for a Kinesis Data Analytics application.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesisanalytics.*;
 * ApplicationMaintenanceConfigurationProperty applicationMaintenanceConfigurationProperty =
 * ApplicationMaintenanceConfigurationProperty.builder()
 * .applicationMaintenanceWindowStartTime("applicationMaintenanceWindowStartTime")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-applicationmaintenanceconfiguration.html)
 */
@CdkDslMarker
public class CfnApplicationV2ApplicationMaintenanceConfigurationPropertyDsl {
    private val cdkBuilder: CfnApplicationV2.ApplicationMaintenanceConfigurationProperty.Builder =
        CfnApplicationV2.ApplicationMaintenanceConfigurationProperty.builder()

    /**
     * @param applicationMaintenanceWindowStartTime Specifies the start time of the maintence
     *   window.
     */
    public fun applicationMaintenanceWindowStartTime(
        applicationMaintenanceWindowStartTime: String
    ) {
        cdkBuilder.applicationMaintenanceWindowStartTime(applicationMaintenanceWindowStartTime)
    }

    public fun build(): CfnApplicationV2.ApplicationMaintenanceConfigurationProperty =
        cdkBuilder.build()
}
