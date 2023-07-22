@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisanalyticsv2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication

/**
 * Describes the starting parameters for an Kinesis Data Analytics application.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesisanalyticsv2.*;
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
public class CfnApplicationRunConfigurationPropertyDsl {
  private val cdkBuilder: CfnApplication.RunConfigurationProperty.Builder =
      CfnApplication.RunConfigurationProperty.builder()

  /**
   * @param applicationRestoreConfiguration Describes the restore behavior of a restarting
   * application.
   */
  public fun applicationRestoreConfiguration(applicationRestoreConfiguration: IResolvable) {
    cdkBuilder.applicationRestoreConfiguration(applicationRestoreConfiguration)
  }

  /**
   * @param applicationRestoreConfiguration Describes the restore behavior of a restarting
   * application.
   */
  public
      fun applicationRestoreConfiguration(applicationRestoreConfiguration: CfnApplication.ApplicationRestoreConfigurationProperty) {
    cdkBuilder.applicationRestoreConfiguration(applicationRestoreConfiguration)
  }

  /**
   * @param flinkRunConfiguration Describes the starting parameters for a Flink-based Kinesis Data
   * Analytics application.
   */
  public fun flinkRunConfiguration(flinkRunConfiguration: IResolvable) {
    cdkBuilder.flinkRunConfiguration(flinkRunConfiguration)
  }

  /**
   * @param flinkRunConfiguration Describes the starting parameters for a Flink-based Kinesis Data
   * Analytics application.
   */
  public
      fun flinkRunConfiguration(flinkRunConfiguration: CfnApplication.FlinkRunConfigurationProperty) {
    cdkBuilder.flinkRunConfiguration(flinkRunConfiguration)
  }

  public fun build(): CfnApplication.RunConfigurationProperty = cdkBuilder.build()
}
