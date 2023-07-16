@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.opsworks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.opsworks.CfnApp

@CdkDslMarker
public class CfnAppEnvironmentVariablePropertyDsl {
  private val cdkBuilder: CfnApp.EnvironmentVariableProperty.Builder =
      CfnApp.EnvironmentVariableProperty.builder()

  public fun key(key: String) {
    cdkBuilder.key(key)
  }

  public fun secure(secure: Boolean) {
    cdkBuilder.secure(secure)
  }

  public fun secure(secure: IResolvable) {
    cdkBuilder.secure(secure)
  }

  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnApp.EnvironmentVariableProperty = cdkBuilder.build()
}
