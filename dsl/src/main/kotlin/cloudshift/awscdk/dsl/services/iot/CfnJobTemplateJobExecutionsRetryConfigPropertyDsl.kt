@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iot.CfnJobTemplate

@CdkDslMarker
public class CfnJobTemplateJobExecutionsRetryConfigPropertyDsl {
  private val cdkBuilder: CfnJobTemplate.JobExecutionsRetryConfigProperty.Builder =
      CfnJobTemplate.JobExecutionsRetryConfigProperty.builder()

  private val _retryCriteriaList: MutableList<Any> = mutableListOf()

  /**
   * @param retryCriteriaList the value to be set.
   */
  public fun retryCriteriaList(vararg retryCriteriaList: Any) {
    _retryCriteriaList.addAll(listOf(*retryCriteriaList))
  }

  /**
   * @param retryCriteriaList the value to be set.
   */
  public fun retryCriteriaList(retryCriteriaList: Collection<Any>) {
    _retryCriteriaList.addAll(retryCriteriaList)
  }

  /**
   * @param retryCriteriaList the value to be set.
   */
  public fun retryCriteriaList(retryCriteriaList: IResolvable) {
    cdkBuilder.retryCriteriaList(retryCriteriaList)
  }

  public fun build(): CfnJobTemplate.JobExecutionsRetryConfigProperty {
    if(_retryCriteriaList.isNotEmpty()) cdkBuilder.retryCriteriaList(_retryCriteriaList)
    return cdkBuilder.build()
  }
}
