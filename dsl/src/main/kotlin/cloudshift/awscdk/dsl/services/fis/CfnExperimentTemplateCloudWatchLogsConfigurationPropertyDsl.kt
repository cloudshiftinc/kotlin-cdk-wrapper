@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.fis

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.fis.CfnExperimentTemplate

@CdkDslMarker
public class CfnExperimentTemplateCloudWatchLogsConfigurationPropertyDsl {
  private val cdkBuilder: CfnExperimentTemplate.CloudWatchLogsConfigurationProperty.Builder =
      CfnExperimentTemplate.CloudWatchLogsConfigurationProperty.builder()

  public fun logGroupArn(logGroupArn: String) {
    cdkBuilder.logGroupArn(logGroupArn)
  }

  public fun build(): CfnExperimentTemplate.CloudWatchLogsConfigurationProperty = cdkBuilder.build()
}
