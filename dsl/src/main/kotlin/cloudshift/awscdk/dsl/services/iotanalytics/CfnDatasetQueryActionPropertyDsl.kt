@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotanalytics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotanalytics.CfnDataset

@CdkDslMarker
public class CfnDatasetQueryActionPropertyDsl {
  private val cdkBuilder: CfnDataset.QueryActionProperty.Builder =
      CfnDataset.QueryActionProperty.builder()

  private val _filters: MutableList<Any> = mutableListOf()

  /**
   * @param filters Pre-filters applied to message data.
   */
  public fun filters(vararg filters: Any) {
    _filters.addAll(listOf(*filters))
  }

  /**
   * @param filters Pre-filters applied to message data.
   */
  public fun filters(filters: Collection<Any>) {
    _filters.addAll(filters)
  }

  /**
   * @param filters Pre-filters applied to message data.
   */
  public fun filters(filters: IResolvable) {
    cdkBuilder.filters(filters)
  }

  /**
   * @param sqlQuery An "SqlQueryDatasetAction" object that uses an SQL query to automatically
   * create data set contents. 
   */
  public fun sqlQuery(sqlQuery: String) {
    cdkBuilder.sqlQuery(sqlQuery)
  }

  public fun build(): CfnDataset.QueryActionProperty {
    if(_filters.isNotEmpty()) cdkBuilder.filters(_filters)
    return cdkBuilder.build()
  }
}
