@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.amplify

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.amplify.CfnApp

@CdkDslMarker
public class CfnAppEnvironmentVariablePropertyDsl {
  private val cdkBuilder: CfnApp.EnvironmentVariableProperty.Builder =
      CfnApp.EnvironmentVariableProperty.builder()

  /**
   * @param name The environment variable name. 
   * *Length Constraints:* Maximum length of 255.
   *
   * *Pattern:* (?s).*
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param value The environment variable value. 
   * *Length Constraints:* Maximum length of 5500.
   *
   * *Pattern:* (?s).*
   */
  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnApp.EnvironmentVariableProperty = cdkBuilder.build()
}
