@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.connect

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.connect.CfnEvaluationForm

@CdkDslMarker
public class CfnEvaluationFormEvaluationFormSingleSelectQuestionAutomationPropertyDsl {
  private val cdkBuilder:
      CfnEvaluationForm.EvaluationFormSingleSelectQuestionAutomationProperty.Builder =
      CfnEvaluationForm.EvaluationFormSingleSelectQuestionAutomationProperty.builder()

  private val _options: MutableList<Any> = mutableListOf()

  /**
   * @param defaultOptionRefId The identifier of the default answer option, when none of the
   * automation options match the criteria.
   * *Length Constraints* : Minimum length of 1. Maximum length of 40.
   */
  public fun defaultOptionRefId(defaultOptionRefId: String) {
    cdkBuilder.defaultOptionRefId(defaultOptionRefId)
  }

  /**
   * @param options The automation options of the single select question. 
   * *Minimum* : 1
   *
   * *Maximum* : 20
   */
  public fun options(vararg options: Any) {
    _options.addAll(listOf(*options))
  }

  /**
   * @param options The automation options of the single select question. 
   * *Minimum* : 1
   *
   * *Maximum* : 20
   */
  public fun options(options: Collection<Any>) {
    _options.addAll(options)
  }

  /**
   * @param options The automation options of the single select question. 
   * *Minimum* : 1
   *
   * *Maximum* : 20
   */
  public fun options(options: IResolvable) {
    cdkBuilder.options(options)
  }

  public fun build(): CfnEvaluationForm.EvaluationFormSingleSelectQuestionAutomationProperty {
    if(_options.isNotEmpty()) cdkBuilder.options(_options)
    return cdkBuilder.build()
  }
}
