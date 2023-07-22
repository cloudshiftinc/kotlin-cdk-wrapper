@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ses

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ses.ReceiptFilter
import software.amazon.awscdk.services.ses.ReceiptFilterPolicy
import software.constructs.Construct

@CdkDslMarker
public class ReceiptFilterDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: ReceiptFilter.Builder = ReceiptFilter.Builder.create(scope, id)

  /**
   * The ip address or range to filter.
   *
   * Default: 0.0.0.0/0
   *
   * @param ip The ip address or range to filter. 
   */
  public fun ip(ip: String) {
    cdkBuilder.ip(ip)
  }

  /**
   * The policy for the filter.
   *
   * Default: Block
   *
   * @param policy The policy for the filter. 
   */
  public fun policy(policy: ReceiptFilterPolicy) {
    cdkBuilder.policy(policy)
  }

  /**
   * The name for the receipt filter.
   *
   * Default: a CloudFormation generated name
   *
   * @param receiptFilterName The name for the receipt filter. 
   */
  public fun receiptFilterName(receiptFilterName: String) {
    cdkBuilder.receiptFilterName(receiptFilterName)
  }

  public fun build(): ReceiptFilter = cdkBuilder.build()
}
