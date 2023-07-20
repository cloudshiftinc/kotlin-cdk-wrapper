@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.connect

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.connect.CfnUser

@CdkDslMarker
public class CfnUserUserIdentityInfoPropertyDsl {
  private val cdkBuilder: CfnUser.UserIdentityInfoProperty.Builder =
      CfnUser.UserIdentityInfoProperty.builder()

  public fun email(email: String) {
    cdkBuilder.email(email)
  }

  public fun firstName(firstName: String) {
    cdkBuilder.firstName(firstName)
  }

  public fun lastName(lastName: String) {
    cdkBuilder.lastName(lastName)
  }

  public fun mobile(mobile: String) {
    cdkBuilder.mobile(mobile)
  }

  public fun secondaryEmail(secondaryEmail: String) {
    cdkBuilder.secondaryEmail(secondaryEmail)
  }

  public fun build(): CfnUser.UserIdentityInfoProperty = cdkBuilder.build()
}
