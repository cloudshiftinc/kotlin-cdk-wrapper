@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.fis

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.Number
import kotlin.Unit
import software.amazon.awscdk.services.fis.CfnExperimentTemplate

@CdkDslMarker
public class CfnExperimentTemplateExperimentTemplateLogConfigurationPropertyDsl {
  private val cdkBuilder: CfnExperimentTemplate.ExperimentTemplateLogConfigurationProperty.Builder =
      CfnExperimentTemplate.ExperimentTemplateLogConfigurationProperty.builder()

  /**
   * @param cloudWatchLogsConfiguration The configuration for experiment logging to CloudWatch Logs
   * .
   */
  public fun cloudWatchLogsConfiguration(cloudWatchLogsConfiguration: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(cloudWatchLogsConfiguration)
    cdkBuilder.cloudWatchLogsConfiguration(builder.map)
  }

  /**
   * @param cloudWatchLogsConfiguration The configuration for experiment logging to CloudWatch Logs
   * .
   */
  public fun cloudWatchLogsConfiguration(cloudWatchLogsConfiguration: Any) {
    cdkBuilder.cloudWatchLogsConfiguration(cloudWatchLogsConfiguration)
  }

  /**
   * @param logSchemaVersion The schema version. 
   */
  public fun logSchemaVersion(logSchemaVersion: Number) {
    cdkBuilder.logSchemaVersion(logSchemaVersion)
  }

  /**
   * @param s3Configuration The configuration for experiment logging to Amazon S3 .
   */
  public fun s3Configuration(s3Configuration: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(s3Configuration)
    cdkBuilder.s3Configuration(builder.map)
  }

  /**
   * @param s3Configuration The configuration for experiment logging to Amazon S3 .
   */
  public fun s3Configuration(s3Configuration: Any) {
    cdkBuilder.s3Configuration(s3Configuration)
  }

  public fun build(): CfnExperimentTemplate.ExperimentTemplateLogConfigurationProperty =
      cdkBuilder.build()
}
