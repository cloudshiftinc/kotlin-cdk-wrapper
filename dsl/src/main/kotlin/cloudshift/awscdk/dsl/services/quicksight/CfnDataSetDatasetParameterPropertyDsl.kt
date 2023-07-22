@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDataSet

@CdkDslMarker
public class CfnDataSetDatasetParameterPropertyDsl {
  private val cdkBuilder: CfnDataSet.DatasetParameterProperty.Builder =
      CfnDataSet.DatasetParameterProperty.builder()

  /**
   * @param dateTimeDatasetParameter A parameter created in the dataset of date time data type.</p>.
   */
  public fun dateTimeDatasetParameter(dateTimeDatasetParameter: IResolvable) {
    cdkBuilder.dateTimeDatasetParameter(dateTimeDatasetParameter)
  }

  /**
   * @param dateTimeDatasetParameter A parameter created in the dataset of date time data type.</p>.
   */
  public
      fun dateTimeDatasetParameter(dateTimeDatasetParameter: CfnDataSet.DateTimeDatasetParameterProperty) {
    cdkBuilder.dateTimeDatasetParameter(dateTimeDatasetParameter)
  }

  /**
   * @param decimalDatasetParameter A parameter created in the dataset of decimal data type.</p>.
   */
  public fun decimalDatasetParameter(decimalDatasetParameter: IResolvable) {
    cdkBuilder.decimalDatasetParameter(decimalDatasetParameter)
  }

  /**
   * @param decimalDatasetParameter A parameter created in the dataset of decimal data type.</p>.
   */
  public
      fun decimalDatasetParameter(decimalDatasetParameter: CfnDataSet.DecimalDatasetParameterProperty) {
    cdkBuilder.decimalDatasetParameter(decimalDatasetParameter)
  }

  /**
   * @param integerDatasetParameter A parameter created in the dataset of integer data type.</p>.
   */
  public fun integerDatasetParameter(integerDatasetParameter: IResolvable) {
    cdkBuilder.integerDatasetParameter(integerDatasetParameter)
  }

  /**
   * @param integerDatasetParameter A parameter created in the dataset of integer data type.</p>.
   */
  public
      fun integerDatasetParameter(integerDatasetParameter: CfnDataSet.IntegerDatasetParameterProperty) {
    cdkBuilder.integerDatasetParameter(integerDatasetParameter)
  }

  /**
   * @param stringDatasetParameter A parameter created in the dataset of string data type.</p>.
   */
  public fun stringDatasetParameter(stringDatasetParameter: IResolvable) {
    cdkBuilder.stringDatasetParameter(stringDatasetParameter)
  }

  /**
   * @param stringDatasetParameter A parameter created in the dataset of string data type.</p>.
   */
  public
      fun stringDatasetParameter(stringDatasetParameter: CfnDataSet.StringDatasetParameterProperty) {
    cdkBuilder.stringDatasetParameter(stringDatasetParameter)
  }

  public fun build(): CfnDataSet.DatasetParameterProperty = cdkBuilder.build()
}
