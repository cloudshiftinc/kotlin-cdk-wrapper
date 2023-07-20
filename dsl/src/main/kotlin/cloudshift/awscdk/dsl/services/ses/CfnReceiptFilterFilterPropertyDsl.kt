@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ses

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ses.CfnReceiptFilter

@CdkDslMarker
public class CfnReceiptFilterFilterPropertyDsl {
  private val cdkBuilder: CfnReceiptFilter.FilterProperty.Builder =
      CfnReceiptFilter.FilterProperty.builder()

  public fun ipFilter(ipFilter: IResolvable) {
    cdkBuilder.ipFilter(ipFilter)
  }

  public fun ipFilter(ipFilter: CfnReceiptFilter.IpFilterProperty) {
    cdkBuilder.ipFilter(ipFilter)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): CfnReceiptFilter.FilterProperty = cdkBuilder.build()
}
