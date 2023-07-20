@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.amplify

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.amplify.CfnApp

@CdkDslMarker
public class CfnAppEnvironmentVariablePropertyDsl {
  private val cdkBuilder: CfnApp.EnvironmentVariableProperty.Builder =
      CfnApp.EnvironmentVariableProperty.builder()

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnApp.EnvironmentVariableProperty = cdkBuilder.build()
}
