@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateKPISortConfigurationPropertyDsl {
  private val cdkBuilder: CfnTemplate.KPISortConfigurationProperty.Builder =
      CfnTemplate.KPISortConfigurationProperty.builder()

  private val _trendGroupSort: MutableList<Any> = mutableListOf()

  /**
   * @param trendGroupSort The sort configuration of the trend group fields.
   */
  public fun trendGroupSort(vararg trendGroupSort: Any) {
    _trendGroupSort.addAll(listOf(*trendGroupSort))
  }

  /**
   * @param trendGroupSort The sort configuration of the trend group fields.
   */
  public fun trendGroupSort(trendGroupSort: Collection<Any>) {
    _trendGroupSort.addAll(trendGroupSort)
  }

  /**
   * @param trendGroupSort The sort configuration of the trend group fields.
   */
  public fun trendGroupSort(trendGroupSort: IResolvable) {
    cdkBuilder.trendGroupSort(trendGroupSort)
  }

  public fun build(): CfnTemplate.KPISortConfigurationProperty {
    if(_trendGroupSort.isNotEmpty()) cdkBuilder.trendGroupSort(_trendGroupSort)
    return cdkBuilder.build()
  }
}
