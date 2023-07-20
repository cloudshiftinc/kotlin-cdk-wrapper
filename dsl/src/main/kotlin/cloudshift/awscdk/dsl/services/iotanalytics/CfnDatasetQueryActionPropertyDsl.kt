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

  public fun filters(vararg filters: Any) {
    _filters.addAll(listOf(*filters))
  }

  public fun filters(filters: Collection<Any>) {
    _filters.addAll(filters)
  }

  public fun filters(filters: IResolvable) {
    cdkBuilder.filters(filters)
  }

  public fun sqlQuery(sqlQuery: String) {
    cdkBuilder.sqlQuery(sqlQuery)
  }

  public fun build(): CfnDataset.QueryActionProperty {
    if(_filters.isNotEmpty()) cdkBuilder.filters(_filters)
    return cdkBuilder.build()
  }
}
