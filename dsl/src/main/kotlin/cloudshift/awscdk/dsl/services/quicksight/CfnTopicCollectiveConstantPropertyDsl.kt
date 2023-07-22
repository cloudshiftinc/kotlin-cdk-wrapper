@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.quicksight.CfnTopic

@CdkDslMarker
public class CfnTopicCollectiveConstantPropertyDsl {
  private val cdkBuilder: CfnTopic.CollectiveConstantProperty.Builder =
      CfnTopic.CollectiveConstantProperty.builder()

  private val _valueList: MutableList<String> = mutableListOf()

  /**
   * @param valueList A list of values for the collective constant.
   */
  public fun valueList(vararg valueList: String) {
    _valueList.addAll(listOf(*valueList))
  }

  /**
   * @param valueList A list of values for the collective constant.
   */
  public fun valueList(valueList: Collection<String>) {
    _valueList.addAll(valueList)
  }

  public fun build(): CfnTopic.CollectiveConstantProperty {
    if(_valueList.isNotEmpty()) cdkBuilder.valueList(_valueList)
    return cdkBuilder.build()
  }
}
