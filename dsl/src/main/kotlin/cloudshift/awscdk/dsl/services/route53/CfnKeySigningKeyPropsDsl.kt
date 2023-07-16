@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.route53

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.route53.CfnKeySigningKeyProps

@CdkDslMarker
public class CfnKeySigningKeyPropsDsl {
  private val cdkBuilder: CfnKeySigningKeyProps.Builder = CfnKeySigningKeyProps.builder()

  public fun hostedZoneId(hostedZoneId: String) {
    cdkBuilder.hostedZoneId(hostedZoneId)
  }

  public fun keyManagementServiceArn(keyManagementServiceArn: String) {
    cdkBuilder.keyManagementServiceArn(keyManagementServiceArn)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun status(status: String) {
    cdkBuilder.status(status)
  }

  public fun build(): CfnKeySigningKeyProps = cdkBuilder.build()
}
