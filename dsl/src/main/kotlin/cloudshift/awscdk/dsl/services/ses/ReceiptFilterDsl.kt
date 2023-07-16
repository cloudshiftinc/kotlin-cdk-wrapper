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

  public fun ip(ip: String) {
    cdkBuilder.ip(ip)
  }

  public fun policy(policy: ReceiptFilterPolicy) {
    cdkBuilder.policy(policy)
  }

  public fun receiptFilterName(receiptFilterName: String) {
    cdkBuilder.receiptFilterName(receiptFilterName)
  }

  public fun build(): ReceiptFilter = cdkBuilder.build()
}
