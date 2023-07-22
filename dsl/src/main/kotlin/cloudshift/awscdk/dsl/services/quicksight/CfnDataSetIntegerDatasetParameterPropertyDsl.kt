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

  /**
   * @param defaultValues List of default values defined for a given integer dataset parameter type.
   * Currently only static values are supported.</p>
   */
  public fun defaultValues(defaultValues: IResolvable) {
    cdkBuilder.defaultValues(defaultValues)
  }

  /**
   * @param defaultValues List of default values defined for a given integer dataset parameter type.
   * Currently only static values are supported.</p>
   */
  public fun defaultValues(defaultValues: CfnDataSet.IntegerDatasetParameterDefaultValuesProperty) {
    cdkBuilder.defaultValues(defaultValues)
  }

  /**
   * @param id Identifier of the parameter created in the dataset.</p>. 
   */
  public fun id(id: String) {
    cdkBuilder.id(id)
  }

  /**
   * @param name Name of the parameter created in the dataset.</p>. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param valueType Every parameter value could be either a single value or multi value which
   * helps to validate before evaluation.</p>. 
   */
  public fun valueType(valueType: String) {
    cdkBuilder.valueType(valueType)
  }

  public fun build(): CfnDataSet.IntegerDatasetParameterProperty = cdkBuilder.build()
}
