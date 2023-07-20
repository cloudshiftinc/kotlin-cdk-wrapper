@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDataSet

@CdkDslMarker
public class CfnDataSetIntegerDatasetParameterPropertyDsl {
  private val cdkBuilder: CfnDataSet.IntegerDatasetParameterProperty.Builder =
      CfnDataSet.IntegerDatasetParameterProperty.builder()

  public fun defaultValues(defaultValues: IResolvable) {
    cdkBuilder.defaultValues(defaultValues)
  }

  public fun defaultValues(defaultValues: CfnDataSet.IntegerDatasetParameterDefaultValuesProperty) {
    cdkBuilder.defaultValues(defaultValues)
  }

  public fun id(id: String) {
    cdkBuilder.id(id)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun valueType(valueType: String) {
    cdkBuilder.valueType(valueType)
  }

  public fun build(): CfnDataSet.IntegerDatasetParameterProperty = cdkBuilder.build()
}
