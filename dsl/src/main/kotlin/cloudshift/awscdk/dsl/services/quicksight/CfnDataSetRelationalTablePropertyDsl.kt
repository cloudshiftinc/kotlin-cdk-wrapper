@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDataSet

@CdkDslMarker
public class CfnDataSetRelationalTablePropertyDsl {
  private val cdkBuilder: CfnDataSet.RelationalTableProperty.Builder =
      CfnDataSet.RelationalTableProperty.builder()

  private val _inputColumns: MutableList<Any> = mutableListOf()

  public fun catalog(catalog: String) {
    cdkBuilder.catalog(catalog)
  }

  public fun dataSourceArn(dataSourceArn: String) {
    cdkBuilder.dataSourceArn(dataSourceArn)
  }

  public fun inputColumns(vararg inputColumns: Any) {
    _inputColumns.addAll(listOf(*inputColumns))
  }

  public fun inputColumns(inputColumns: Collection<Any>) {
    _inputColumns.addAll(inputColumns)
  }

  public fun inputColumns(inputColumns: IResolvable) {
    cdkBuilder.inputColumns(inputColumns)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun schema(schema: String) {
    cdkBuilder.schema(schema)
  }

  public fun build(): CfnDataSet.RelationalTableProperty {
    if(_inputColumns.isNotEmpty()) cdkBuilder.inputColumns(_inputColumns)
    return cdkBuilder.build()
  }
}
