@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.connect

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.connect.CfnEvaluationForm

@CdkDslMarker
public class CfnEvaluationFormEvaluationFormQuestionPropertyDsl {
  private val cdkBuilder: CfnEvaluationForm.EvaluationFormQuestionProperty.Builder =
      CfnEvaluationForm.EvaluationFormQuestionProperty.builder()

  /**
   * @param instructions The instructions of the section.
   * *Length Constraints* : Minimum length of 0. Maximum length of 1024.
   */
  public fun instructions(instructions: String) {
    cdkBuilder.instructions(instructions)
  }

  /**
   * @param notApplicableEnabled The flag to enable not applicable answers to the question.
   */
  public fun notApplicableEnabled(notApplicableEnabled: Boolean) {
    cdkBuilder.notApplicableEnabled(notApplicableEnabled)
  }

  /**
   * @param notApplicableEnabled The flag to enable not applicable answers to the question.
   */
  public fun notApplicableEnabled(notApplicableEnabled: IResolvable) {
    cdkBuilder.notApplicableEnabled(notApplicableEnabled)
  }

  /**
   * @param questionType The type of the question. 
   * *Allowed values* : `NUMERIC` | `SINGLESELECT` | `TEXT`
   */
  public fun questionType(questionType: String) {
    cdkBuilder.questionType(questionType)
  }

  /**
   * @param questionTypeProperties The properties of the type of question.
   * Text questions do not have to define question type properties.
   */
  public fun questionTypeProperties(questionTypeProperties: IResolvable) {
    cdkBuilder.questionTypeProperties(questionTypeProperties)
  }

  /**
   * @param questionTypeProperties The properties of the type of question.
   * Text questions do not have to define question type properties.
   */
  public
      fun questionTypeProperties(questionTypeProperties: CfnEvaluationForm.EvaluationFormQuestionTypePropertiesProperty) {
    cdkBuilder.questionTypeProperties(questionTypeProperties)
  }

  /**
   * @param refId The identifier of the question. An identifier must be unique within the evaluation
   * form. 
   * *Length Constraints* : Minimum length of 1. Maximum length of 40.
   */
  public fun refId(refId: String) {
    cdkBuilder.refId(refId)
  }

  /**
   * @param title The title of the question. 
   * *Length Constraints* : Minimum length of 1. Maximum length of 350.
   */
  public fun title(title: String) {
    cdkBuilder.title(title)
  }

  /**
   * @param weight The scoring weight of the section.
   * *Minimum* : 0
   *
   * *Maximum* : 100
   */
  public fun weight(weight: Number) {
    cdkBuilder.weight(weight)
  }

  public fun build(): CfnEvaluationForm.EvaluationFormQuestionProperty = cdkBuilder.build()
}
