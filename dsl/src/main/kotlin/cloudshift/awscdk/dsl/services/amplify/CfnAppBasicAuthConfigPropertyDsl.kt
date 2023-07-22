@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.amplify

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.amplify.CfnApp

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
