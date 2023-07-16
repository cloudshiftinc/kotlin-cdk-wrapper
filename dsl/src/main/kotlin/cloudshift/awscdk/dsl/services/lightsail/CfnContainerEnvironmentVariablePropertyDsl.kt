@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lightsail

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.lightsail.CfnContainer

@CdkDslMarker
public class CfnContainerEnvironmentVariablePropertyDsl {
  private val cdkBuilder: CfnContainer.EnvironmentVariableProperty.Builder =
      CfnContainer.EnvironmentVariableProperty.builder()

  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun variable(variable: String) {
    cdkBuilder.variable(variable)
  }

  public fun build(): CfnContainer.EnvironmentVariableProperty = cdkBuilder.build()
}
