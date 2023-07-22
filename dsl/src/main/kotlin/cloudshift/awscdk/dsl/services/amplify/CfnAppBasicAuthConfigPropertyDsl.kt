@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.amplify

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.amplify.CfnApp

/**
 * Use the BasicAuthConfig property type to set password protection at an app level to all your
 * branches.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.amplify.*;
 * BasicAuthConfigProperty basicAuthConfigProperty = BasicAuthConfigProperty.builder()
 * .enableBasicAuth(false)
 * .password("password")
 * .username("username")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-app-basicauthconfig.html)
 */
@CdkDslMarker
public class CfnAppBasicAuthConfigPropertyDsl {
  private val cdkBuilder: CfnApp.BasicAuthConfigProperty.Builder =
      CfnApp.BasicAuthConfigProperty.builder()

  /**
   * @param enableBasicAuth Enables basic authorization for the Amplify app's branches.
   */
  public fun enableBasicAuth(enableBasicAuth: Boolean) {
    cdkBuilder.enableBasicAuth(enableBasicAuth)
  }

  /**
   * @param enableBasicAuth Enables basic authorization for the Amplify app's branches.
   */
  public fun enableBasicAuth(enableBasicAuth: IResolvable) {
    cdkBuilder.enableBasicAuth(enableBasicAuth)
  }

  /**
   * @param password The password for basic authorization.
   * *Length Constraints:* Minimum length of 1. Maximum length of 255.
   */
  public fun password(password: String) {
    cdkBuilder.password(password)
  }

  /**
   * @param username The user name for basic authorization.
   * *Length Constraints:* Minimum length of 1. Maximum length of 255.
   */
  public fun username(username: String) {
    cdkBuilder.username(username)
  }

  public fun build(): CfnApp.BasicAuthConfigProperty = cdkBuilder.build()
}
