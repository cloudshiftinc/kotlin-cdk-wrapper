@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis

@CdkDslMarker
public class CfnNetworkInsightsAnalysisAdditionalDetailPropertyDsl {
  private val cdkBuilder: CfnNetworkInsightsAnalysis.AdditionalDetailProperty.Builder =
      CfnNetworkInsightsAnalysis.AdditionalDetailProperty.builder()

  private val _loadBalancers: MutableList<Any> = mutableListOf()

  public fun additionalDetailType(additionalDetailType: String) {
    cdkBuilder.additionalDetailType(additionalDetailType)
  }

  public fun component(component: IResolvable) {
    cdkBuilder.component(component)
  }

  public fun component(component: CfnNetworkInsightsAnalysis.AnalysisComponentProperty) {
    cdkBuilder.component(component)
  }

  public fun loadBalancers(vararg loadBalancers: Any) {
    _loadBalancers.addAll(listOf(*loadBalancers))
  }

  public fun loadBalancers(loadBalancers: Collection<Any>) {
    _loadBalancers.addAll(loadBalancers)
  }

  public fun loadBalancers(loadBalancers: IResolvable) {
    cdkBuilder.loadBalancers(loadBalancers)
  }

  public fun serviceName(serviceName: String) {
    cdkBuilder.serviceName(serviceName)
  }

  public fun build(): CfnNetworkInsightsAnalysis.AdditionalDetailProperty {
    if(_loadBalancers.isNotEmpty()) cdkBuilder.loadBalancers(_loadBalancers)
    return cdkBuilder.build()
  }
}
