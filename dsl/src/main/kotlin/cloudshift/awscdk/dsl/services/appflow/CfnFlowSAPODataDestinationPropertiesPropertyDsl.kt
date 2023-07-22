@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appflow

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appflow.CfnFlow

/**
 * The properties that are applied when using SAPOData as a flow destination.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appflow.*;
 * SAPODataDestinationPropertiesProperty sAPODataDestinationPropertiesProperty =
 * SAPODataDestinationPropertiesProperty.builder()
 * .objectPath("objectPath")
 * // the properties below are optional
 * .errorHandlingConfig(ErrorHandlingConfigProperty.builder()
 * .bucketName("bucketName")
 * .bucketPrefix("bucketPrefix")
 * .failOnFirstError(false)
 * .build())
 * .idFieldNames(List.of("idFieldNames"))
 * .successResponseHandlingConfig(SuccessResponseHandlingConfigProperty.builder()
 * .bucketName("bucketName")
 * .bucketPrefix("bucketPrefix")
 * .build())
 * .writeOperationType("writeOperationType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-sapodatadestinationproperties.html)
 */
@CdkDslMarker
public class CfnFlowSAPODataDestinationPropertiesPropertyDsl {
  private val cdkBuilder: CfnFlow.SAPODataDestinationPropertiesProperty.Builder =
      CfnFlow.SAPODataDestinationPropertiesProperty.builder()

  private val _idFieldNames: MutableList<String> = mutableListOf()

  /**
   * @param errorHandlingConfig The settings that determine how Amazon AppFlow handles an error when
   * placing data in the destination.
   * For example, this setting would determine if the flow should fail after one insertion error, or
   * continue and attempt to insert every record regardless of the initial failure.
   * `ErrorHandlingConfig` is a part of the destination connector details.
   */
  public fun errorHandlingConfig(errorHandlingConfig: IResolvable) {
    cdkBuilder.errorHandlingConfig(errorHandlingConfig)
  }

  /**
   * @param errorHandlingConfig The settings that determine how Amazon AppFlow handles an error when
   * placing data in the destination.
   * For example, this setting would determine if the flow should fail after one insertion error, or
   * continue and attempt to insert every record regardless of the initial failure.
   * `ErrorHandlingConfig` is a part of the destination connector details.
   */
  public fun errorHandlingConfig(errorHandlingConfig: CfnFlow.ErrorHandlingConfigProperty) {
    cdkBuilder.errorHandlingConfig(errorHandlingConfig)
  }

  /**
   * @param idFieldNames A list of field names that can be used as an ID field when performing a
   * write operation.
   */
  public fun idFieldNames(vararg idFieldNames: String) {
    _idFieldNames.addAll(listOf(*idFieldNames))
  }

  /**
   * @param idFieldNames A list of field names that can be used as an ID field when performing a
   * write operation.
   */
  public fun idFieldNames(idFieldNames: Collection<String>) {
    _idFieldNames.addAll(idFieldNames)
  }

  /**
   * @param objectPath The object path specified in the SAPOData flow destination. 
   */
  public fun objectPath(objectPath: String) {
    cdkBuilder.objectPath(objectPath)
  }

  /**
   * @param successResponseHandlingConfig Determines how Amazon AppFlow handles the success response
   * that it gets from the connector after placing data.
   * For example, this setting would determine where to write the response from a destination
   * connector upon a successful insert operation.
   */
  public fun successResponseHandlingConfig(successResponseHandlingConfig: IResolvable) {
    cdkBuilder.successResponseHandlingConfig(successResponseHandlingConfig)
  }

  /**
   * @param successResponseHandlingConfig Determines how Amazon AppFlow handles the success response
   * that it gets from the connector after placing data.
   * For example, this setting would determine where to write the response from a destination
   * connector upon a successful insert operation.
   */
  public
      fun successResponseHandlingConfig(successResponseHandlingConfig: CfnFlow.SuccessResponseHandlingConfigProperty) {
    cdkBuilder.successResponseHandlingConfig(successResponseHandlingConfig)
  }

  /**
   * @param writeOperationType The possible write operations in the destination connector.
   * When this value is not provided, this defaults to the `INSERT` operation.
   */
  public fun writeOperationType(writeOperationType: String) {
    cdkBuilder.writeOperationType(writeOperationType)
  }

  public fun build(): CfnFlow.SAPODataDestinationPropertiesProperty {
    if(_idFieldNames.isNotEmpty()) cdkBuilder.idFieldNames(_idFieldNames)
    return cdkBuilder.build()
  }
}
