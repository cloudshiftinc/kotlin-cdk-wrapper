@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.cxapi

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.cxapi.SecurityGroupContextResponse

@CdkDslMarker
public class SecurityGroupContextResponseDsl {
  private val cdkBuilder: SecurityGroupContextResponse.Builder =
      SecurityGroupContextResponse.builder()

  public fun allowAllOutbound(allowAllOutbound: Boolean) {
    cdkBuilder.allowAllOutbound(allowAllOutbound)
  }

  public fun securityGroupId(securityGroupId: String) {
    cdkBuilder.securityGroupId(securityGroupId)
  }

  public fun build(): SecurityGroupContextResponse = cdkBuilder.build()
}
