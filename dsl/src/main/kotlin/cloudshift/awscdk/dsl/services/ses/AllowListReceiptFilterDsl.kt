@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ses

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ses.AllowListReceiptFilter
import software.constructs.Construct

@CdkDslMarker
public class AllowListReceiptFilterDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: AllowListReceiptFilter.Builder =
      AllowListReceiptFilter.Builder.create(scope, id)

  private val _ips: MutableList<String> = mutableListOf()

  /**
   * A list of ip addresses or ranges to allow list.
   *
   * @param ips A list of ip addresses or ranges to allow list. 
   */
  public fun ips(vararg ips: String) {
    _ips.addAll(listOf(*ips))
  }

  /**
   * A list of ip addresses or ranges to allow list.
   *
   * @param ips A list of ip addresses or ranges to allow list. 
   */
  public fun ips(ips: Collection<String>) {
    _ips.addAll(ips)
  }

  public fun build(): AllowListReceiptFilter {
    if(_ips.isNotEmpty()) cdkBuilder.ips(_ips)
    return cdkBuilder.build()
  }
}
