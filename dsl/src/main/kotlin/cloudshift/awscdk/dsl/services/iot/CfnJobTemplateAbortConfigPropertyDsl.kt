@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iot.CfnJobTemplate

@CdkDslMarker
public class CfnJobTemplateAbortConfigPropertyDsl {
  private val cdkBuilder: CfnJobTemplate.AbortConfigProperty.Builder =
      CfnJobTemplate.AbortConfigProperty.builder()

  private val _criteriaList: MutableList<Any> = mutableListOf()

  /**
   * @param criteriaList The list of criteria that determine when and how to abort the job. 
   */
  public fun criteriaList(vararg criteriaList: Any) {
    _criteriaList.addAll(listOf(*criteriaList))
  }

  /**
   * @param criteriaList The list of criteria that determine when and how to abort the job. 
   */
  public fun criteriaList(criteriaList: Collection<Any>) {
    _criteriaList.addAll(criteriaList)
  }

  /**
   * @param criteriaList The list of criteria that determine when and how to abort the job. 
   */
  public fun criteriaList(criteriaList: IResolvable) {
    cdkBuilder.criteriaList(criteriaList)
  }

  public fun build(): CfnJobTemplate.AbortConfigProperty {
    if(_criteriaList.isNotEmpty()) cdkBuilder.criteriaList(_criteriaList)
    return cdkBuilder.build()
  }
}
