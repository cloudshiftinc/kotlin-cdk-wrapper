@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.opsworks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.opsworks.CfnStack

@CdkDslMarker
public class CfnStackStackConfigurationManagerPropertyDsl {
  private val cdkBuilder: CfnStack.StackConfigurationManagerProperty.Builder =
      CfnStack.StackConfigurationManagerProperty.builder()

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun version(version: String) {
    cdkBuilder.version(version)
  }

  public fun build(): CfnStack.StackConfigurationManagerProperty = cdkBuilder.build()
}
