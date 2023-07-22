@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotanalytics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotanalytics.CfnDataset

/**
 * An instance of a variable to be passed to the `containerAction` execution.
 *
 * Each variable must have a name and a value given by one of `stringValue` ,
 * `datasetContentVersionValue` , or `outputFileUriValue` .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotanalytics.*;
 * VariableProperty variableProperty = VariableProperty.builder()
 * .variableName("variableName")
 * // the properties below are optional
 * .datasetContentVersionValue(DatasetContentVersionValueProperty.builder()
 * .datasetName("datasetName")
 * .build())
 * .doubleValue(123)
 * .outputFileUriValue(OutputFileUriValueProperty.builder()
 * .fileName("fileName")
 * .build())
 * .stringValue("stringValue")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-variable.html)
 */
@CdkDslMarker
public class CfnDatasetVariablePropertyDsl {
  private val cdkBuilder: CfnDataset.VariableProperty.Builder =
      CfnDataset.VariableProperty.builder()

  /**
   * @param datasetContentVersionValue The value of the variable as a structure that specifies a
   * dataset content version.
   */
  public fun datasetContentVersionValue(datasetContentVersionValue: IResolvable) {
    cdkBuilder.datasetContentVersionValue(datasetContentVersionValue)
  }

  /**
   * @param datasetContentVersionValue The value of the variable as a structure that specifies a
   * dataset content version.
   */
  public
      fun datasetContentVersionValue(datasetContentVersionValue: CfnDataset.DatasetContentVersionValueProperty) {
    cdkBuilder.datasetContentVersionValue(datasetContentVersionValue)
  }

  /**
   * @param doubleValue The value of the variable as a double (numeric).
   */
  public fun doubleValue(doubleValue: Number) {
    cdkBuilder.doubleValue(doubleValue)
  }

  /**
   * @param outputFileUriValue The value of the variable as a structure that specifies an output
   * file URI.
   */
  public fun outputFileUriValue(outputFileUriValue: IResolvable) {
    cdkBuilder.outputFileUriValue(outputFileUriValue)
  }

  /**
   * @param outputFileUriValue The value of the variable as a structure that specifies an output
   * file URI.
   */
  public fun outputFileUriValue(outputFileUriValue: CfnDataset.OutputFileUriValueProperty) {
    cdkBuilder.outputFileUriValue(outputFileUriValue)
  }

  /**
   * @param stringValue The value of the variable as a string.
   */
  public fun stringValue(stringValue: String) {
    cdkBuilder.stringValue(stringValue)
  }

  /**
   * @param variableName The name of the variable. 
   */
  public fun variableName(variableName: String) {
    cdkBuilder.variableName(variableName)
  }

  public fun build(): CfnDataset.VariableProperty = cdkBuilder.build()
}
