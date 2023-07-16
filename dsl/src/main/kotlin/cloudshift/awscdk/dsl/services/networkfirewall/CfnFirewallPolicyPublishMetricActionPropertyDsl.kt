@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.networkfirewall

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy

@CdkDslMarker
public class CfnFirewallPolicyPublishMetricActionPropertyDsl {
  private val cdkBuilder: CfnFirewallPolicy.PublishMetricActionProperty.Builder =
      CfnFirewallPolicy.PublishMetricActionProperty.builder()

  private val _dimensions: MutableList<Any> = mutableListOf()

  public fun dimensions(vararg dimensions: Any) {
    _dimensions.addAll(listOf(*dimensions))
  }

  public fun dimensions(dimensions: Collection<Any>) {
    _dimensions.addAll(dimensions)
  }

  public fun dimensions(dimensions: IResolvable) {
    cdkBuilder.dimensions(dimensions)
  }

  public fun build(): CfnFirewallPolicy.PublishMetricActionProperty {
    if(_dimensions.isNotEmpty()) cdkBuilder.dimensions(_dimensions)
    return cdkBuilder.build()
  }
}
