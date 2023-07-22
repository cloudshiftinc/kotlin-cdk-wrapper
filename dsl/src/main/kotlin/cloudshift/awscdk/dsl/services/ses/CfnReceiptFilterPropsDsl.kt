@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ses

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ses.CfnReceiptFilter
import software.amazon.awscdk.services.ses.CfnReceiptFilterProps

/**
 * Properties for defining a `CfnReceiptFilter`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ses.*;
 * CfnReceiptFilterProps cfnReceiptFilterProps = CfnReceiptFilterProps.builder()
 * .filter(FilterProperty.builder()
 * .ipFilter(IpFilterProperty.builder()
 * .cidr("cidr")
 * .policy("policy")
 * .build())
 * // the properties below are optional
 * .name("name")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-receiptfilter.html)
 */
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
