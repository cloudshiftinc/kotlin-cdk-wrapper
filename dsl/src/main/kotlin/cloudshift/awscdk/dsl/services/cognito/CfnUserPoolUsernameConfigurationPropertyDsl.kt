@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cognito.CfnUserPool

@CdkDslMarker
public class CfnUserPoolUsernameConfigurationPropertyDsl {
  private val cdkBuilder: CfnUserPool.UsernameConfigurationProperty.Builder =
      CfnUserPool.UsernameConfigurationProperty.builder()

  /**
   * @param caseSensitive Specifies whether user name case sensitivity will be applied for all users
   * in the user pool through Amazon Cognito APIs.
   * For most use cases, set case sensitivity to `False` (case insensitive) as a best practice. When
   * usernames and email addresses are case insensitive, users can sign in as the same user when they
   * enter a different capitalization of their user name.
   *
   * Valid values include:
   *
   * * **True** - Enables case sensitivity for all username input. When this option is set to `True`
   * , users must sign in using the exact capitalization of their given username, such as “UserName”.
   * This is the default value.
   * * **False** - Enables case insensitivity for all username input. For example, when this option
   * is set to `False` , users can sign in using `username` , `USERNAME` , or `UserName` . This option
   * also enables both `preferred_username` and `email` alias to be case insensitive, in addition to
   * the `username` attribute.
   */
  public fun caseSensitive(caseSensitive: Boolean) {
    cdkBuilder.caseSensitive(caseSensitive)
  }

  /**
   * @param caseSensitive Specifies whether user name case sensitivity will be applied for all users
   * in the user pool through Amazon Cognito APIs.
   * For most use cases, set case sensitivity to `False` (case insensitive) as a best practice. When
   * usernames and email addresses are case insensitive, users can sign in as the same user when they
   * enter a different capitalization of their user name.
   *
   * Valid values include:
   *
   * * **True** - Enables case sensitivity for all username input. When this option is set to `True`
   * , users must sign in using the exact capitalization of their given username, such as “UserName”.
   * This is the default value.
   * * **False** - Enables case insensitivity for all username input. For example, when this option
   * is set to `False` , users can sign in using `username` , `USERNAME` , or `UserName` . This option
   * also enables both `preferred_username` and `email` alias to be case insensitive, in addition to
   * the `username` attribute.
   */
  public fun caseSensitive(caseSensitive: IResolvable) {
    cdkBuilder.caseSensitive(caseSensitive)
  }

  public fun build(): CfnUserPool.UsernameConfigurationProperty = cdkBuilder.build()
}
