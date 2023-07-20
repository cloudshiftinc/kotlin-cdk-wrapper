@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticbeanstalk

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplate

@CdkDslMarker
public class CfnConfigurationTemplateSourceConfigurationPropertyDsl {
  private val cdkBuilder: CfnConfigurationTemplate.SourceConfigurationProperty.Builder =
      CfnConfigurationTemplate.SourceConfigurationProperty.builder()

  public fun applicationName(applicationName: String) {
    cdkBuilder.applicationName(applicationName)
  }

  public fun templateName(templateName: String) {
    cdkBuilder.templateName(templateName)
  }

  public fun build(): CfnConfigurationTemplate.SourceConfigurationProperty = cdkBuilder.build()
}
