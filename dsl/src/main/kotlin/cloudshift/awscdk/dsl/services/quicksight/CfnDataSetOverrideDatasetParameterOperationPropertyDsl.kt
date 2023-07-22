@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDataSet

@CdkDslMarker
public class CfnDataSetOverrideDatasetParameterOperationPropertyDsl {
  private val cdkBuilder: CfnDataSet.OverrideDatasetParameterOperationProperty.Builder =
      CfnDataSet.OverrideDatasetParameterOperationProperty.builder()

  /**
   * @param newDefaultValues the value to be set.
   */
  public fun newDefaultValues(newDefaultValues: IResolvable) {
    cdkBuilder.newDefaultValues(newDefaultValues)
  }

  /**
   * @param newDefaultValues the value to be set.
   */
  public fun newDefaultValues(newDefaultValues: CfnDataSet.NewDefaultValuesProperty) {
    cdkBuilder.newDefaultValues(newDefaultValues)
  }

  /**
   * @param newParameterName Name of the parameter created in the dataset.</p>.
   */
  public fun newParameterName(newParameterName: String) {
    cdkBuilder.newParameterName(newParameterName)
  }

  /**
   * @param parameterName Name of the parameter created in the dataset.</p>. 
   */
  public fun parameterName(parameterName: String) {
    cdkBuilder.parameterName(parameterName)
  }

  public fun build(): CfnDataSet.OverrideDatasetParameterOperationProperty = cdkBuilder.build()
}
