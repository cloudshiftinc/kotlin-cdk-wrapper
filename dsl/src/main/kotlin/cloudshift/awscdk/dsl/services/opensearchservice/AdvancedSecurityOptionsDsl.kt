@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.opensearchservice

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.SecretValue
import software.amazon.awscdk.services.opensearchservice.AdvancedSecurityOptions

@CdkDslMarker
public class AdvancedSecurityOptionsDsl {
  private val cdkBuilder: AdvancedSecurityOptions.Builder = AdvancedSecurityOptions.builder()

  public fun masterUserArn(masterUserArn: String) {
    cdkBuilder.masterUserArn(masterUserArn)
  }

  public fun masterUserName(masterUserName: String) {
    cdkBuilder.masterUserName(masterUserName)
  }

  public fun masterUserPassword(masterUserPassword: SecretValue) {
    cdkBuilder.masterUserPassword(masterUserPassword)
  }

  public fun build(): AdvancedSecurityOptions = cdkBuilder.build()
}
