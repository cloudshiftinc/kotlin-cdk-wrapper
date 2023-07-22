@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnModelCard

@CdkDslMarker
public class CfnModelCardMetricGroupPropertyDsl {
  private val cdkBuilder: CfnModelCard.MetricGroupProperty.Builder =
      CfnModelCard.MetricGroupProperty.builder()

  private val _metricData: MutableList<Any> = mutableListOf()

  /**
   * @param metricData A list of metric objects. The `MetricDataItems` list can have one of the
   * following values:. 
   * * `bar_chart_metric`
   * * `matrix_metric`
   * * `simple_metric`
   * * `linear_graph_metric`
   *
   * For more information about the metric schema, see the definition section of the [model card
   * JSON
   * schema](https://docs.aws.amazon.com/sagemaker/latest/dg/model-cards.html#model-cards-json-schema)
   * .
   */
  public fun metricData(vararg metricData: Any) {
    _metricData.addAll(listOf(*metricData))
  }

  /**
   * @param metricData A list of metric objects. The `MetricDataItems` list can have one of the
   * following values:. 
   * * `bar_chart_metric`
   * * `matrix_metric`
   * * `simple_metric`
   * * `linear_graph_metric`
   *
   * For more information about the metric schema, see the definition section of the [model card
   * JSON
   * schema](https://docs.aws.amazon.com/sagemaker/latest/dg/model-cards.html#model-cards-json-schema)
   * .
   */
  public fun metricData(metricData: Collection<Any>) {
    _metricData.addAll(metricData)
  }

  /**
   * @param metricData A list of metric objects. The `MetricDataItems` list can have one of the
   * following values:. 
   * * `bar_chart_metric`
   * * `matrix_metric`
   * * `simple_metric`
   * * `linear_graph_metric`
   *
   * For more information about the metric schema, see the definition section of the [model card
   * JSON
   * schema](https://docs.aws.amazon.com/sagemaker/latest/dg/model-cards.html#model-cards-json-schema)
   * .
   */
  public fun metricData(metricData: IResolvable) {
    cdkBuilder.metricData(metricData)
  }

  /**
   * @param name The metric group name. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): CfnModelCard.MetricGroupProperty {
    if(_metricData.isNotEmpty()) cdkBuilder.metricData(_metricData)
    return cdkBuilder.build()
  }
}
