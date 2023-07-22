@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.databrew

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.databrew.CfnJob

@CdkDslMarker
public class CfnJobColumnStatisticsConfigurationPropertyDsl {
  private val cdkBuilder: CfnJob.ColumnStatisticsConfigurationProperty.Builder =
      CfnJob.ColumnStatisticsConfigurationProperty.builder()

  private val _selectors: MutableList<Any> = mutableListOf()

  /**
   * @param selectors List of column selectors.
   * Selectors can be used to select columns from the dataset. When selectors are undefined,
   * configuration will be applied to all supported columns.
   */
  public fun selectors(vararg selectors: Any) {
    _selectors.addAll(listOf(*selectors))
  }

  /**
   * @param selectors List of column selectors.
   * Selectors can be used to select columns from the dataset. When selectors are undefined,
   * configuration will be applied to all supported columns.
   */
  public fun selectors(selectors: Collection<Any>) {
    _selectors.addAll(selectors)
  }

  /**
   * @param selectors List of column selectors.
   * Selectors can be used to select columns from the dataset. When selectors are undefined,
   * configuration will be applied to all supported columns.
   */
  public fun selectors(selectors: IResolvable) {
    cdkBuilder.selectors(selectors)
  }

  /**
   * @param statistics Configuration for evaluations. 
   * Statistics can be used to select evaluations and override parameters of evaluations.
   */
  public fun statistics(statistics: IResolvable) {
    cdkBuilder.statistics(statistics)
  }

  /**
   * @param statistics Configuration for evaluations. 
   * Statistics can be used to select evaluations and override parameters of evaluations.
   */
  public fun statistics(statistics: CfnJob.StatisticsConfigurationProperty) {
    cdkBuilder.statistics(statistics)
  }

  public fun build(): CfnJob.ColumnStatisticsConfigurationProperty {
    if(_selectors.isNotEmpty()) cdkBuilder.selectors(_selectors)
    return cdkBuilder.build()
  }
}
