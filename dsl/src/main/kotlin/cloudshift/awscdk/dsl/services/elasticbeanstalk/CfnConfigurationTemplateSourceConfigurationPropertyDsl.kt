@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticbeanstalk

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplate

@CdkDslMarker
public class CfnConfigurationTemplateSourceConfigurationPropertyDsl {
  private val cdkBuilder: CfnConfigurationTemplate.SourceConfigurationProperty.Builder =
      CfnConfigurationTemplate.SourceConfigurationProperty.builder()

  /**
   * @param applicationName The name of the application associated with the configuration. 
   */
  public fun applicationName(applicationName: String) {
    cdkBuilder.applicationName(applicationName)
  }

  /**
   * @param templateName The name of the configuration template. 
   */
  public fun templateName(templateName: String) {
    cdkBuilder.templateName(templateName)
  }

  public fun build(): CfnConfigurationTemplate.SourceConfigurationProperty = cdkBuilder.build()
}
