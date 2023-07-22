@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.amplify

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.amplify.CfnApp

/**
 * Environment variables are key-value pairs that are available at build time.
 *
 * Set environment variables for all branches in your app.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.amplify.*;
 * EnvironmentVariableProperty environmentVariableProperty = EnvironmentVariableProperty.builder()
 * .name("name")
 * .value("value")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-app-environmentvariable.html)
 */
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
