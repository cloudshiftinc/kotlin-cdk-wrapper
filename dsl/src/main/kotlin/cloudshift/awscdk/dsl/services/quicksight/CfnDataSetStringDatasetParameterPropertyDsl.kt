@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDataSet

/**
 * A parameter created in the dataset of string data type.</p>.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * StringDatasetParameterProperty stringDatasetParameterProperty =
 * StringDatasetParameterProperty.builder()
 * .id("id")
 * .name("name")
 * .valueType("valueType")
 * // the properties below are optional
 * .defaultValues(StringDatasetParameterDefaultValuesProperty.builder()
 * .staticValues(List.of("staticValues"))
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-stringdatasetparameter.html)
 */
@CdkDslMarker
public class CfnDataSetStringDatasetParameterPropertyDsl {
  private val cdkBuilder: CfnDataSet.StringDatasetParameterProperty.Builder =
      CfnDataSet.StringDatasetParameterProperty.builder()

  /**
   * @param defaultValues List of default values defined for a given string dataset parameter type.
   * Currently only static values are supported.</p>
   */
  public fun defaultValues(defaultValues: IResolvable) {
    cdkBuilder.defaultValues(defaultValues)
  }

  /**
   * @param defaultValues List of default values defined for a given string dataset parameter type.
   * Currently only static values are supported.</p>
   */
  public fun defaultValues(defaultValues: CfnDataSet.StringDatasetParameterDefaultValuesProperty) {
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

  public fun build(): CfnDataSet.StringDatasetParameterProperty = cdkBuilder.build()
}
