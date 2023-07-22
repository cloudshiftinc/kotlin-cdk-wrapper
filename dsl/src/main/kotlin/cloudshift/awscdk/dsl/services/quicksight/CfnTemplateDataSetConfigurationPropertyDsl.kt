@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateDataSetConfigurationPropertyDsl {
  private val cdkBuilder: CfnTemplate.DataSetConfigurationProperty.Builder =
      CfnTemplate.DataSetConfigurationProperty.builder()

  private val _columnGroupSchemaList: MutableList<Any> = mutableListOf()

  /**
   * @param columnGroupSchemaList A structure containing the list of column group schemas.
   */
  public fun columnGroupSchemaList(vararg columnGroupSchemaList: Any) {
    _columnGroupSchemaList.addAll(listOf(*columnGroupSchemaList))
  }

  /**
   * @param columnGroupSchemaList A structure containing the list of column group schemas.
   */
  public fun columnGroupSchemaList(columnGroupSchemaList: Collection<Any>) {
    _columnGroupSchemaList.addAll(columnGroupSchemaList)
  }

  /**
   * @param columnGroupSchemaList A structure containing the list of column group schemas.
   */
  public fun columnGroupSchemaList(columnGroupSchemaList: IResolvable) {
    cdkBuilder.columnGroupSchemaList(columnGroupSchemaList)
  }

  /**
   * @param dataSetSchema Dataset schema.
   */
  public fun dataSetSchema(dataSetSchema: IResolvable) {
    cdkBuilder.dataSetSchema(dataSetSchema)
  }

  /**
   * @param dataSetSchema Dataset schema.
   */
  public fun dataSetSchema(dataSetSchema: CfnTemplate.DataSetSchemaProperty) {
    cdkBuilder.dataSetSchema(dataSetSchema)
  }

  /**
   * @param placeholder Placeholder.
   */
  public fun placeholder(placeholder: String) {
    cdkBuilder.placeholder(placeholder)
  }

  public fun build(): CfnTemplate.DataSetConfigurationProperty {
    if(_columnGroupSchemaList.isNotEmpty()) cdkBuilder.columnGroupSchemaList(_columnGroupSchemaList)
    return cdkBuilder.build()
  }
}
