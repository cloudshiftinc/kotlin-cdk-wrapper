@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotanalytics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotanalytics.CfnDataset

/**
 * Information needed to run the "containerAction" to produce data set contents.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotanalytics.*;
 * ContainerActionProperty containerActionProperty = ContainerActionProperty.builder()
 * .executionRoleArn("executionRoleArn")
 * .image("image")
 * .resourceConfiguration(ResourceConfigurationProperty.builder()
 * .computeType("computeType")
 * .volumeSizeInGb(123)
 * .build())
 * // the properties below are optional
 * .variables(List.of(VariableProperty.builder()
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
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-containeraction.html)
 */
@CdkDslMarker
public class CfnDatasetContainerActionPropertyDsl {
  private val cdkBuilder: CfnDataset.ContainerActionProperty.Builder =
      CfnDataset.ContainerActionProperty.builder()

  private val _variables: MutableList<Any> = mutableListOf()

  /**
   * @param executionRoleArn The ARN of the role which gives permission to the system to access
   * needed resources in order to run the "containerAction". 
   * This includes, at minimum, permission to retrieve the data set contents which are the input to
   * the containerized application.
   */
  public fun executionRoleArn(executionRoleArn: String) {
    cdkBuilder.executionRoleArn(executionRoleArn)
  }

  /**
   * @param image The ARN of the Docker container stored in your account. 
   * The Docker container contains an application and needed support libraries and is used to
   * generate data set contents.
   */
  public fun image(image: String) {
    cdkBuilder.image(image)
  }

  /**
   * @param resourceConfiguration Configuration of the resource which executes the
   * "containerAction". 
   */
  public fun resourceConfiguration(resourceConfiguration: IResolvable) {
    cdkBuilder.resourceConfiguration(resourceConfiguration)
  }

  /**
   * @param resourceConfiguration Configuration of the resource which executes the
   * "containerAction". 
   */
  public
      fun resourceConfiguration(resourceConfiguration: CfnDataset.ResourceConfigurationProperty) {
    cdkBuilder.resourceConfiguration(resourceConfiguration)
  }

  /**
   * @param variables The values of variables used within the context of the execution of the
   * containerized application (basically, parameters passed to the application).
   * Each variable must have a name and a value given by one of "stringValue",
   * "datasetContentVersionValue", or "outputFileUriValue".
   */
  public fun variables(vararg variables: Any) {
    _variables.addAll(listOf(*variables))
  }

  /**
   * @param variables The values of variables used within the context of the execution of the
   * containerized application (basically, parameters passed to the application).
   * Each variable must have a name and a value given by one of "stringValue",
   * "datasetContentVersionValue", or "outputFileUriValue".
   */
  public fun variables(variables: Collection<Any>) {
    _variables.addAll(variables)
  }

  /**
   * @param variables The values of variables used within the context of the execution of the
   * containerized application (basically, parameters passed to the application).
   * Each variable must have a name and a value given by one of "stringValue",
   * "datasetContentVersionValue", or "outputFileUriValue".
   */
  public fun variables(variables: IResolvable) {
    cdkBuilder.variables(variables)
  }

  public fun build(): CfnDataset.ContainerActionProperty {
    if(_variables.isNotEmpty()) cdkBuilder.variables(_variables)
    return cdkBuilder.build()
  }
}
