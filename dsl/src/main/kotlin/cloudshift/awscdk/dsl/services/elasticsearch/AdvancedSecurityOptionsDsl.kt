@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticsearch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Deprecated
import kotlin.String
import software.amazon.awscdk.SecretValue
import software.amazon.awscdk.services.elasticsearch.AdvancedSecurityOptions

@CdkDslMarker
@Deprecated(message = "deprecated in CDK")
public class AdvancedSecurityOptionsDsl {
  private val cdkBuilder: AdvancedSecurityOptions.Builder = AdvancedSecurityOptions.builder()

  @Deprecated(message = "deprecated in CDK")
  public fun masterUserArn(masterUserArn: String) {
    cdkBuilder.masterUserArn(masterUserArn)
  }

  @Deprecated(message = "deprecated in CDK")
  public fun masterUserName(masterUserName: String) {
    cdkBuilder.masterUserName(masterUserName)
  }

  @Deprecated(message = "deprecated in CDK")
  public fun masterUserPassword(masterUserPassword: SecretValue) {
    cdkBuilder.masterUserPassword(masterUserPassword)
  }

  public fun build(): AdvancedSecurityOptions = cdkBuilder.build()
}
