@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ses

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ses.CfnReceiptFilter
import software.amazon.awscdk.services.ses.CfnReceiptFilterProps

@CdkDslMarker
public class CfnReceiptFilterPropsDsl {
  private val cdkBuilder: CfnReceiptFilterProps.Builder = CfnReceiptFilterProps.builder()

  /**
   * @param filter A data structure that describes the IP address filter to create, which consists
   * of a name, an IP address range, and whether to allow or block mail from it. 
   */
  public fun filter(filter: IResolvable) {
    cdkBuilder.filter(filter)
  }

  /**
   * @param filter A data structure that describes the IP address filter to create, which consists
   * of a name, an IP address range, and whether to allow or block mail from it. 
   */
  public fun filter(filter: CfnReceiptFilter.FilterProperty) {
    cdkBuilder.filter(filter)
  }

  public fun build(): CfnReceiptFilterProps = cdkBuilder.build()
}
