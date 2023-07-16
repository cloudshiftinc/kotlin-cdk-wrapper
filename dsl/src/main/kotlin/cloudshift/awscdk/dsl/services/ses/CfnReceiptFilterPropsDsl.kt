@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ses

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ses.CfnReceiptFilter
import software.amazon.awscdk.services.ses.CfnReceiptFilterProps

@CdkDslMarker
public class CfnReceiptFilterPropsDsl {
  private val cdkBuilder: CfnReceiptFilterProps.Builder = CfnReceiptFilterProps.builder()

  public fun filter(filter: IResolvable) {
    cdkBuilder.filter(filter)
  }

  public fun filter(filter: CfnReceiptFilter.FilterProperty) {
    cdkBuilder.filter(filter)
  }

  public fun build(): CfnReceiptFilterProps = cdkBuilder.build()
}
