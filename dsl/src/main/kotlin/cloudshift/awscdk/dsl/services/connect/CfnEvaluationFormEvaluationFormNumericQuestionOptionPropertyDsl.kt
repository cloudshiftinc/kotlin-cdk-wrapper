@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.connect

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.connect.CfnEvaluationForm

/**
 * Information about the option range used for scoring in numeric questions.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.connect.*;
 * EvaluationFormNumericQuestionOptionProperty evaluationFormNumericQuestionOptionProperty =
 * EvaluationFormNumericQuestionOptionProperty.builder()
 * .maxValue(123)
 * .minValue(123)
 * // the properties below are optional
 * .automaticFail(false)
 * .score(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-evaluationform-evaluationformnumericquestionoption.html)
 */
@CdkDslMarker
public class CfnEvaluationFormEvaluationFormNumericQuestionOptionPropertyDsl {
  private val cdkBuilder: CfnEvaluationForm.EvaluationFormNumericQuestionOptionProperty.Builder =
      CfnEvaluationForm.EvaluationFormNumericQuestionOptionProperty.builder()

  /**
   * @param automaticFail The flag to mark the option as automatic fail.
   * If an automatic fail answer is provided, the overall evaluation gets a score of 0.
   */
  public fun automaticFail(automaticFail: Boolean) {
    cdkBuilder.automaticFail(automaticFail)
  }

  /**
   * @param automaticFail The flag to mark the option as automatic fail.
   * If an automatic fail answer is provided, the overall evaluation gets a score of 0.
   */
  public fun automaticFail(automaticFail: IResolvable) {
    cdkBuilder.automaticFail(automaticFail)
  }

  /**
   * @param maxValue The maximum answer value of the range option. 
   */
  public fun maxValue(maxValue: Number) {
    cdkBuilder.maxValue(maxValue)
  }

  /**
   * @param minValue The minimum answer value of the range option. 
   */
  public fun minValue(minValue: Number) {
    cdkBuilder.minValue(minValue)
  }

  /**
   * @param score The score assigned to answer values within the range option.
   * *Minimum* : 0
   *
   * *Maximum* : 10
   */
  public fun score(score: Number) {
    cdkBuilder.score(score)
  }

  public fun build(): CfnEvaluationForm.EvaluationFormNumericQuestionOptionProperty =
      cdkBuilder.build()
}
