@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sagemaker.CfnModelCard

@CdkDslMarker
public class CfnModelCardFunctionPropertyDsl {
  private val cdkBuilder: CfnModelCard.FunctionProperty.Builder =
      CfnModelCard.FunctionProperty.builder()

  /**
   * @param condition An optional description of any conditions of your objective function metric.
   */
  public fun condition(condition: String) {
    cdkBuilder.condition(condition)
  }

  /**
   * @param facet The metric of the model's objective function.
   * For example, *loss* or *rmse* . The following list shows examples of the values that you can
   * specify for the metric:
   *
   * * `ACCURACY`
   * * `AUC`
   * * `LOSS`
   * * `MAE`
   * * `RMSE`
   */
  public fun facet(facet: String) {
    cdkBuilder.facet(facet)
  }

  /**
   * @param function The optimization direction of the model's objective function. You must specify
   * one of the following values:.
   * * `Maximize`
   * * `Minimize`
   */
  public fun function(function: String) {
    cdkBuilder.function(function)
  }

  public fun build(): CfnModelCard.FunctionProperty = cdkBuilder.build()
}
