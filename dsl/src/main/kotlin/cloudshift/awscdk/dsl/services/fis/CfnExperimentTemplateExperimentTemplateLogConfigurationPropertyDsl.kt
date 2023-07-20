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

  public fun cloudWatchLogsConfiguration(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.cloudWatchLogsConfiguration(builder.map)
  }

  public fun cloudWatchLogsConfiguration(cloudWatchLogsConfiguration: Any) {
    cdkBuilder.cloudWatchLogsConfiguration(cloudWatchLogsConfiguration)
  }

  public fun logSchemaVersion(logSchemaVersion: Number) {
    cdkBuilder.logSchemaVersion(logSchemaVersion)
  }

  public fun s3Configuration(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.s3Configuration(builder.map)
  }

  public fun s3Configuration(s3Configuration: Any) {
    cdkBuilder.s3Configuration(s3Configuration)
  }

  public fun build(): CfnExperimentTemplate.ExperimentTemplateLogConfigurationProperty =
      cdkBuilder.build()
}
