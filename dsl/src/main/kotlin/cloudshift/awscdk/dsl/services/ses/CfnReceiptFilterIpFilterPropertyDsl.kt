@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ses

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ses.CfnReceiptFilter

@CdkDslMarker
public class CfnReceiptFilterIpFilterPropertyDsl {
  private val cdkBuilder: CfnReceiptFilter.IpFilterProperty.Builder =
      CfnReceiptFilter.IpFilterProperty.builder()

  public fun cidr(cidr: String) {
    cdkBuilder.cidr(cidr)
  }

  public fun policy(policy: String) {
    cdkBuilder.policy(policy)
  }

  public fun build(): CfnReceiptFilter.IpFilterProperty = cdkBuilder.build()
}
