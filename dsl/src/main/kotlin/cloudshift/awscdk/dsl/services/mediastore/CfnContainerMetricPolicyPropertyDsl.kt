@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.mediastore

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.mediastore.CfnContainer

/**
 * The metric policy that is associated with the container.
 *
 * A metric policy allows AWS Elemental MediaStore to send metrics to Amazon CloudWatch. In the
 * policy, you must indicate whether you want MediaStore to send container-level metrics. You can also
 * include rules to define groups of objects that you want MediaStore to send object-level metrics for.
 *
 * To view examples of how to construct a metric policy for your use case, see [Example Metric
 * Policies](https://docs.aws.amazon.com/mediastore/latest/ug/policies-metric-examples.html) .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.mediastore.*;
 * MetricPolicyProperty metricPolicyProperty = MetricPolicyProperty.builder()
 * .containerLevelMetrics("containerLevelMetrics")
 * // the properties below are optional
 * .metricPolicyRules(List.of(MetricPolicyRuleProperty.builder()
 * .objectGroup("objectGroup")
 * .objectGroupName("objectGroupName")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediastore-container-metricpolicy.html)
 */
@CdkDslMarker
public class CfnContainerMetricPolicyPropertyDsl {
  private val cdkBuilder: CfnContainer.MetricPolicyProperty.Builder =
      CfnContainer.MetricPolicyProperty.builder()

  private val _metricPolicyRules: MutableList<Any> = mutableListOf()

  /**
   * @param containerLevelMetrics A setting to enable or disable metrics at the container level. 
   */
  public fun containerLevelMetrics(containerLevelMetrics: String) {
    cdkBuilder.containerLevelMetrics(containerLevelMetrics)
  }

  /**
   * @param metricPolicyRules A parameter that holds an array of rules that enable metrics at the
   * object level.
   * This parameter is optional, but if you choose to include it, you must also include at least one
   * rule. By default, you can include up to five rules. You can also [request a quota
   * increase](https://docs.aws.amazon.com/servicequotas/home?region=us-east-1#!/services/mediastore/quotas)
   * to allow up to 300 rules per policy.
   */
  public fun metricPolicyRules(vararg metricPolicyRules: Any) {
    _metricPolicyRules.addAll(listOf(*metricPolicyRules))
  }

  /**
   * @param metricPolicyRules A parameter that holds an array of rules that enable metrics at the
   * object level.
   * This parameter is optional, but if you choose to include it, you must also include at least one
   * rule. By default, you can include up to five rules. You can also [request a quota
   * increase](https://docs.aws.amazon.com/servicequotas/home?region=us-east-1#!/services/mediastore/quotas)
   * to allow up to 300 rules per policy.
   */
  public fun metricPolicyRules(metricPolicyRules: Collection<Any>) {
    _metricPolicyRules.addAll(metricPolicyRules)
  }

  /**
   * @param metricPolicyRules A parameter that holds an array of rules that enable metrics at the
   * object level.
   * This parameter is optional, but if you choose to include it, you must also include at least one
   * rule. By default, you can include up to five rules. You can also [request a quota
   * increase](https://docs.aws.amazon.com/servicequotas/home?region=us-east-1#!/services/mediastore/quotas)
   * to allow up to 300 rules per policy.
   */
  public fun metricPolicyRules(metricPolicyRules: IResolvable) {
    cdkBuilder.metricPolicyRules(metricPolicyRules)
  }

  public fun build(): CfnContainer.MetricPolicyProperty {
    if(_metricPolicyRules.isNotEmpty()) cdkBuilder.metricPolicyRules(_metricPolicyRules)
    return cdkBuilder.build()
  }
}
