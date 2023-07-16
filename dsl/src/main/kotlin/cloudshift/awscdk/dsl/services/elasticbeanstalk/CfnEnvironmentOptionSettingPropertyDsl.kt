@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticbeanstalk

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.elasticbeanstalk.CfnEnvironment

@CdkDslMarker
public class CfnEnvironmentOptionSettingPropertyDsl {
  private val cdkBuilder: CfnEnvironment.OptionSettingProperty.Builder =
      CfnEnvironment.OptionSettingProperty.builder()

  public fun namespace(namespace: String) {
    cdkBuilder.namespace(namespace)
  }

  public fun optionName(optionName: String) {
    cdkBuilder.optionName(optionName)
  }

  public fun resourceName(resourceName: String) {
    cdkBuilder.resourceName(resourceName)
  }

  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnEnvironment.OptionSettingProperty = cdkBuilder.build()
}
