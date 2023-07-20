@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appconfig

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appconfig.CfnConfigurationProfile

@CdkDslMarker
public class CfnConfigurationProfileValidatorsPropertyDsl {
  private val cdkBuilder: CfnConfigurationProfile.ValidatorsProperty.Builder =
      CfnConfigurationProfile.ValidatorsProperty.builder()

  public fun content(content: String) {
    cdkBuilder.content(content)
  }

  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnConfigurationProfile.ValidatorsProperty = cdkBuilder.build()
}
