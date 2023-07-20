@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.mediastore

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.mediastore.CfnContainer

@CdkDslMarker
public class CfnContainerMetricPolicyPropertyDsl {
  private val cdkBuilder: CfnContainer.MetricPolicyProperty.Builder =
      CfnContainer.MetricPolicyProperty.builder()

  private val _metricPolicyRules: MutableList<Any> = mutableListOf()

  public fun containerLevelMetrics(containerLevelMetrics: String) {
    cdkBuilder.containerLevelMetrics(containerLevelMetrics)
  }

  public fun metricPolicyRules(vararg metricPolicyRules: Any) {
    _metricPolicyRules.addAll(listOf(*metricPolicyRules))
  }

  public fun metricPolicyRules(metricPolicyRules: Collection<Any>) {
    _metricPolicyRules.addAll(metricPolicyRules)
  }

  public fun metricPolicyRules(metricPolicyRules: IResolvable) {
    cdkBuilder.metricPolicyRules(metricPolicyRules)
  }

  public fun build(): CfnContainer.MetricPolicyProperty {
    if(_metricPolicyRules.isNotEmpty()) cdkBuilder.metricPolicyRules(_metricPolicyRules)
    return cdkBuilder.build()
  }
}
