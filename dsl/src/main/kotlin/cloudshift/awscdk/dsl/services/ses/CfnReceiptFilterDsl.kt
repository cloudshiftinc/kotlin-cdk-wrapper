@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ses

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ses.CfnReceiptFilter
import software.constructs.Construct

@CdkDslMarker
public class CfnReceiptFilterDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnReceiptFilter.Builder = CfnReceiptFilter.Builder.create(scope, id)

  /**
   * A data structure that describes the IP address filter to create, which consists of a name, an
   * IP address range, and whether to allow or block mail from it.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-receiptfilter.html#cfn-ses-receiptfilter-filter)
   * @param filter A data structure that describes the IP address filter to create, which consists
   * of a name, an IP address range, and whether to allow or block mail from it. 
   */
  public fun filter(filter: IResolvable) {
    cdkBuilder.filter(filter)
  }

  /**
   * A data structure that describes the IP address filter to create, which consists of a name, an
   * IP address range, and whether to allow or block mail from it.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-receiptfilter.html#cfn-ses-receiptfilter-filter)
   * @param filter A data structure that describes the IP address filter to create, which consists
   * of a name, an IP address range, and whether to allow or block mail from it. 
   */
  public fun filter(filter: CfnReceiptFilter.FilterProperty) {
    cdkBuilder.filter(filter)
  }

  public fun build(): CfnReceiptFilter = cdkBuilder.build()
}
