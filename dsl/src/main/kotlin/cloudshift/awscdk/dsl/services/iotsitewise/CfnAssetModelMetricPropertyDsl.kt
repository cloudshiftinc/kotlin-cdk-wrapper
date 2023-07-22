@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotsitewise

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotsitewise.CfnAssetModel

@CdkDslMarker
public class CfnAssetModelMetricPropertyDsl {
  private val cdkBuilder: CfnAssetModel.MetricProperty.Builder =
      CfnAssetModel.MetricProperty.builder()

  private val _variables: MutableList<Any> = mutableListOf()

  /**
   * @param expression The mathematical expression that defines the metric aggregation function. 
   * You can specify up to 10 variables per expression. You can specify up to 10 functions per
   * expression.
   *
   * For more information, see
   * [Quotas](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html) in the *AWS IoT
   * SiteWise User Guide* .
   */
  public fun expression(expression: String) {
    cdkBuilder.expression(expression)
  }

  /**
   * @param variables The list of variables used in the expression. 
   */
  public fun variables(vararg variables: Any) {
    _variables.addAll(listOf(*variables))
  }

  /**
   * @param variables The list of variables used in the expression. 
   */
  public fun variables(variables: Collection<Any>) {
    _variables.addAll(variables)
  }

  /**
   * @param variables The list of variables used in the expression. 
   */
  public fun variables(variables: IResolvable) {
    cdkBuilder.variables(variables)
  }

  /**
   * @param window The window (time interval) over which AWS IoT SiteWise computes the metric's
   * aggregation expression. 
   * AWS IoT SiteWise computes one data point per `window` .
   */
  public fun window(window: IResolvable) {
    cdkBuilder.window(window)
  }

  /**
   * @param window The window (time interval) over which AWS IoT SiteWise computes the metric's
   * aggregation expression. 
   * AWS IoT SiteWise computes one data point per `window` .
   */
  public fun window(window: CfnAssetModel.MetricWindowProperty) {
    cdkBuilder.window(window)
  }

  public fun build(): CfnAssetModel.MetricProperty {
    if(_variables.isNotEmpty()) cdkBuilder.variables(_variables)
    return cdkBuilder.build()
  }
}
