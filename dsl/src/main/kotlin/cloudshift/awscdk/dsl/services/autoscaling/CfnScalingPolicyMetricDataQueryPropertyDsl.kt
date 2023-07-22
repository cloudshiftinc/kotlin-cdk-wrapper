@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.autoscaling

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.autoscaling.CfnScalingPolicy

@CdkDslMarker
public class CfnScalingPolicyMetricDataQueryPropertyDsl {
  private val cdkBuilder: CfnScalingPolicy.MetricDataQueryProperty.Builder =
      CfnScalingPolicy.MetricDataQueryProperty.builder()

  /**
   * @param expression The math expression to perform on the returned data, if this object is
   * performing a math expression.
   * This expression can use the `Id` of the other metrics to refer to those metrics, and can also
   * use the `Id` of other expressions to use the result of those expressions.
   *
   * Conditional: Within each `MetricDataQuery` object, you must specify either `Expression` or
   * `MetricStat` , but not both.
   */
  public fun expression(expression: String) {
    cdkBuilder.expression(expression)
  }

  /**
   * @param id A short name that identifies the object's results in the response. 
   * This name must be unique among all `MetricDataQuery` objects specified for a single scaling
   * policy. If you are performing math expressions on this set of data, this name represents that data
   * and can serve as a variable in the mathematical expression. The valid characters are letters,
   * numbers, and underscores. The first character must be a lowercase letter.
   */
  public fun id(id: String) {
    cdkBuilder.id(id)
  }

  /**
   * @param label A human-readable label for this metric or expression.
   * This is especially useful if this is a math expression, so that you know what the value
   * represents.
   */
  public fun label(label: String) {
    cdkBuilder.label(label)
  }

  /**
   * @param metricStat Information about the metric data to return.
   * Conditional: Within each `MetricDataQuery` object, you must specify either `Expression` or
   * `MetricStat` , but not both.
   */
  public fun metricStat(metricStat: IResolvable) {
    cdkBuilder.metricStat(metricStat)
  }

  /**
   * @param metricStat Information about the metric data to return.
   * Conditional: Within each `MetricDataQuery` object, you must specify either `Expression` or
   * `MetricStat` , but not both.
   */
  public fun metricStat(metricStat: CfnScalingPolicy.MetricStatProperty) {
    cdkBuilder.metricStat(metricStat)
  }

  /**
   * @param returnData Indicates whether to return the timestamps and raw data values of this
   * metric.
   * If you use any math expressions, specify `true` for this value for only the final math
   * expression that the metric specification is based on. You must specify `false` for `ReturnData`
   * for all the other metrics and expressions used in the metric specification.
   *
   * If you are only retrieving metrics and not performing any math expressions, do not specify
   * anything for `ReturnData` . This sets it to its default ( `true` ).
   */
  public fun returnData(returnData: Boolean) {
    cdkBuilder.returnData(returnData)
  }

  /**
   * @param returnData Indicates whether to return the timestamps and raw data values of this
   * metric.
   * If you use any math expressions, specify `true` for this value for only the final math
   * expression that the metric specification is based on. You must specify `false` for `ReturnData`
   * for all the other metrics and expressions used in the metric specification.
   *
   * If you are only retrieving metrics and not performing any math expressions, do not specify
   * anything for `ReturnData` . This sets it to its default ( `true` ).
   */
  public fun returnData(returnData: IResolvable) {
    cdkBuilder.returnData(returnData)
  }

  public fun build(): CfnScalingPolicy.MetricDataQueryProperty = cdkBuilder.build()
}
