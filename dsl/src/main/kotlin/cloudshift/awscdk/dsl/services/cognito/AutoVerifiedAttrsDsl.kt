@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.services.cognito.AutoVerifiedAttrs

@CdkDslMarker
public class AutoVerifiedAttrsDsl {
  private val cdkBuilder: AutoVerifiedAttrs.Builder = AutoVerifiedAttrs.builder()

  public fun email(email: Boolean) {
    cdkBuilder.email(email)
  }

  public fun phone(phone: Boolean) {
    cdkBuilder.phone(phone)
  }

  public fun build(): AutoVerifiedAttrs = cdkBuilder.build()
}
