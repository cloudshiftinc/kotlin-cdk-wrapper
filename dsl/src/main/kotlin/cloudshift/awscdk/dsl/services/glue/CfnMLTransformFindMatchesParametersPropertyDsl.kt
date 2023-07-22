@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.glue

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.glue.CfnMLTransform

@CdkDslMarker
public class CfnMLTransformFindMatchesParametersPropertyDsl {
  private val cdkBuilder: CfnMLTransform.FindMatchesParametersProperty.Builder =
      CfnMLTransform.FindMatchesParametersProperty.builder()

  /**
   * @param accuracyCostTradeoff The value that is selected when tuning your transform for a balance
   * between accuracy and cost.
   * A value of 0.5 means that the system balances accuracy and cost concerns. A value of 1.0 means
   * a bias purely for accuracy, which typically results in a higher cost, sometimes substantially
   * higher. A value of 0.0 means a bias purely for cost, which results in a less accurate
   * `FindMatches` transform, sometimes with unacceptable accuracy.
   *
   * Accuracy measures how well the transform finds true positives and true negatives. Increasing
   * accuracy requires more machine resources and cost. But it also results in increased recall.
   *
   * Cost measures how many compute resources, and thus money, are consumed to run the transform.
   */
  public fun accuracyCostTradeoff(accuracyCostTradeoff: Number) {
    cdkBuilder.accuracyCostTradeoff(accuracyCostTradeoff)
  }

  /**
   * @param enforceProvidedLabels The value to switch on or off to force the output to match the
   * provided labels from users.
   * If the value is `True` , the `find matches` transform forces the output to match the provided
   * labels. The results override the normal conflation results. If the value is `False` , the `find
   * matches` transform does not ensure all the labels provided are respected, and the results rely on
   * the trained model.
   *
   * Note that setting this value to true may increase the conflation execution time.
   */
  public fun enforceProvidedLabels(enforceProvidedLabels: Boolean) {
    cdkBuilder.enforceProvidedLabels(enforceProvidedLabels)
  }

  /**
   * @param enforceProvidedLabels The value to switch on or off to force the output to match the
   * provided labels from users.
   * If the value is `True` , the `find matches` transform forces the output to match the provided
   * labels. The results override the normal conflation results. If the value is `False` , the `find
   * matches` transform does not ensure all the labels provided are respected, and the results rely on
   * the trained model.
   *
   * Note that setting this value to true may increase the conflation execution time.
   */
  public fun enforceProvidedLabels(enforceProvidedLabels: IResolvable) {
    cdkBuilder.enforceProvidedLabels(enforceProvidedLabels)
  }

  /**
   * @param precisionRecallTradeoff The value selected when tuning your transform for a balance
   * between precision and recall.
   * A value of 0.5 means no preference; a value of 1.0 means a bias purely for precision, and a
   * value of 0.0 means a bias for recall. Because this is a tradeoff, choosing values close to 1.0
   * means very low recall, and choosing values close to 0.0 results in very low precision.
   *
   * The precision metric indicates how often your model is correct when it predicts a match.
   *
   * The recall metric indicates that for an actual match, how often your model predicts the match.
   */
  public fun precisionRecallTradeoff(precisionRecallTradeoff: Number) {
    cdkBuilder.precisionRecallTradeoff(precisionRecallTradeoff)
  }

  /**
   * @param primaryKeyColumnName The name of a column that uniquely identifies rows in the source
   * table. 
   * Used to help identify matching records.
   */
  public fun primaryKeyColumnName(primaryKeyColumnName: String) {
    cdkBuilder.primaryKeyColumnName(primaryKeyColumnName)
  }

  public fun build(): CfnMLTransform.FindMatchesParametersProperty = cdkBuilder.build()
}
