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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2

/**
 * Describes the starting parameters for an Kinesis Data Analytics application.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesisanalytics.*;
 * RunConfigurationProperty runConfigurationProperty = RunConfigurationProperty.builder()
 * .applicationRestoreConfiguration(ApplicationRestoreConfigurationProperty.builder()
 * .applicationRestoreType("applicationRestoreType")
 * // the properties below are optional
 * .snapshotName("snapshotName")
 * .build())
 * .flinkRunConfiguration(FlinkRunConfigurationProperty.builder()
 * .allowNonRestoredState(false)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-runconfiguration.html)
 */
@CdkDslMarker
public class CfnApplicationV2RunConfigurationPropertyDsl {
    private val cdkBuilder: CfnApplicationV2.RunConfigurationProperty.Builder =
        CfnApplicationV2.RunConfigurationProperty.builder()

    /**
     * @param applicationRestoreConfiguration Describes the restore behavior of a restarting
     *   application.
     */
    public fun applicationRestoreConfiguration(applicationRestoreConfiguration: IResolvable) {
        cdkBuilder.applicationRestoreConfiguration(applicationRestoreConfiguration)
    }

    /**
     * @param applicationRestoreConfiguration Describes the restore behavior of a restarting
     *   application.
     */
    public fun applicationRestoreConfiguration(
        applicationRestoreConfiguration: CfnApplicationV2.ApplicationRestoreConfigurationProperty
    ) {
        cdkBuilder.applicationRestoreConfiguration(applicationRestoreConfiguration)
    }

    /**
     * @param flinkRunConfiguration Describes the starting parameters for a Flink-based Kinesis Data
     *   Analytics application.
     */
    public fun flinkRunConfiguration(flinkRunConfiguration: IResolvable) {
        cdkBuilder.flinkRunConfiguration(flinkRunConfiguration)
    }

    /**
     * @param flinkRunConfiguration Describes the starting parameters for a Flink-based Kinesis Data
     *   Analytics application.
     */
    public fun flinkRunConfiguration(
        flinkRunConfiguration: CfnApplicationV2.FlinkRunConfigurationProperty
    ) {
        cdkBuilder.flinkRunConfiguration(flinkRunConfiguration)
    }

    public fun build(): CfnApplicationV2.RunConfigurationProperty = cdkBuilder.build()
}
