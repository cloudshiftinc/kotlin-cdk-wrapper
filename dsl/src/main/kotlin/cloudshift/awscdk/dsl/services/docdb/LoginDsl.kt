@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.docdb

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.SecretValue
import software.amazon.awscdk.services.docdb.Login
import software.amazon.awscdk.services.kms.IKey

@CdkDslMarker
public class LoginDsl {
  private val cdkBuilder: Login.Builder = Login.builder()

  public fun excludeCharacters(excludeCharacters: String) {
    cdkBuilder.excludeCharacters(excludeCharacters)
  }

  public fun kmsKey(kmsKey: IKey) {
    cdkBuilder.kmsKey(kmsKey)
  }

  public fun password(password: SecretValue) {
    cdkBuilder.password(password)
  }

  public fun secretName(secretName: String) {
    cdkBuilder.secretName(secretName)
  }

  public fun username(username: String) {
    cdkBuilder.username(username)
  }

  public fun build(): Login = cdkBuilder.build()
}
