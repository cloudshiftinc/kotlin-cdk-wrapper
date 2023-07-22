@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.connect

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.connect.CfnEvaluationForm

@CdkDslMarker
public class CfnEvaluationFormEvaluationFormItemPropertyDsl {
  private val cdkBuilder: CfnEvaluationForm.EvaluationFormItemProperty.Builder =
      CfnEvaluationForm.EvaluationFormItemProperty.builder()

  /**
   * @param question The information of the question.
   */
  public fun question(question: IResolvable) {
    cdkBuilder.question(question)
  }

  /**
   * @param question The information of the question.
   */
  public fun question(question: CfnEvaluationForm.EvaluationFormQuestionProperty) {
    cdkBuilder.question(question)
  }

  /**
   * @param section The information of the section.
   */
  public fun section(section: IResolvable) {
    cdkBuilder.section(section)
  }

  /**
   * @param section The information of the section.
   */
  public fun section(section: CfnEvaluationForm.EvaluationFormSectionProperty) {
    cdkBuilder.section(section)
  }

  public fun build(): CfnEvaluationForm.EvaluationFormItemProperty = cdkBuilder.build()
}
