@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticache

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.elasticache.CfnUser

@CdkDslMarker
public class CfnUserAuthenticationModePropertyDsl {
  private val cdkBuilder: CfnUser.AuthenticationModeProperty.Builder =
      CfnUser.AuthenticationModeProperty.builder()

  private val _passwords: MutableList<String> = mutableListOf()

  /**
   * @param passwords Specifies the passwords to use for authentication if `Type` is set to
   * `password` .
   */
  public fun passwords(vararg passwords: String) {
    _passwords.addAll(listOf(*passwords))
  }

  /**
   * @param passwords Specifies the passwords to use for authentication if `Type` is set to
   * `password` .
   */
  public fun passwords(passwords: Collection<String>) {
    _passwords.addAll(passwords)
  }

  /**
   * @param type Specifies the authentication type. 
   * Possible options are IAM authentication, password and no password.
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnUser.AuthenticationModeProperty {
    if(_passwords.isNotEmpty()) cdkBuilder.passwords(_passwords)
    return cdkBuilder.build()
  }
}
