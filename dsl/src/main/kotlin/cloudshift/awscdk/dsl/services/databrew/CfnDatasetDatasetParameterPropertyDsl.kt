@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.databrew

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.databrew.CfnDataset

@CdkDslMarker
public class CfnDatasetDatasetParameterPropertyDsl {
  private val cdkBuilder: CfnDataset.DatasetParameterProperty.Builder =
      CfnDataset.DatasetParameterProperty.builder()

  public fun createColumn(createColumn: Boolean) {
    cdkBuilder.createColumn(createColumn)
  }

  public fun createColumn(createColumn: IResolvable) {
    cdkBuilder.createColumn(createColumn)
  }

  public fun datetimeOptions(datetimeOptions: IResolvable) {
    cdkBuilder.datetimeOptions(datetimeOptions)
  }

  public fun datetimeOptions(datetimeOptions: CfnDataset.DatetimeOptionsProperty) {
    cdkBuilder.datetimeOptions(datetimeOptions)
  }

  public fun filter(filter: IResolvable) {
    cdkBuilder.filter(filter)
  }

  public fun filter(filter: CfnDataset.FilterExpressionProperty) {
    cdkBuilder.filter(filter)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnDataset.DatasetParameterProperty = cdkBuilder.build()
}
