@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appflow

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appflow.CfnFlow

/**
 * The properties that are applied when the custom connector is being used as a destination.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appflow.*;
 * CustomConnectorDestinationPropertiesProperty customConnectorDestinationPropertiesProperty =
 * CustomConnectorDestinationPropertiesProperty.builder()
 * .entityName("entityName")
 * // the properties below are optional
 * .customProperties(Map.of(
 * "customPropertiesKey", "customProperties"))
 * .errorHandlingConfig(ErrorHandlingConfigProperty.builder()
 * .bucketName("bucketName")
 * .bucketPrefix("bucketPrefix")
 * .failOnFirstError(false)
 * .build())
 * .idFieldNames(List.of("idFieldNames"))
 * .writeOperationType("writeOperationType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-customconnectordestinationproperties.html)
 */
@CdkDslMarker
public class CfnFlowCustomConnectorDestinationPropertiesPropertyDsl {
  private val cdkBuilder: CfnFlow.CustomConnectorDestinationPropertiesProperty.Builder =
      CfnFlow.CustomConnectorDestinationPropertiesProperty.builder()

  private val _idFieldNames: MutableList<String> = mutableListOf()

  /**
   * @param customProperties The custom properties that are specific to the connector when it's used
   * as a destination in the flow.
   */
  public fun customProperties(customProperties: Map<String, String>) {
    cdkBuilder.customProperties(customProperties)
  }

  /**
   * @param customProperties The custom properties that are specific to the connector when it's used
   * as a destination in the flow.
   */
  public fun customProperties(customProperties: IResolvable) {
    cdkBuilder.customProperties(customProperties)
  }

  /**
   * @param entityName The entity specified in the custom connector as a destination in the flow. 
   */
  public fun entityName(entityName: String) {
    cdkBuilder.entityName(entityName)
  }

  /**
   * @param errorHandlingConfig The settings that determine how Amazon AppFlow handles an error when
   * placing data in the custom connector as destination.
   */
  public fun errorHandlingConfig(errorHandlingConfig: IResolvable) {
    cdkBuilder.errorHandlingConfig(errorHandlingConfig)
  }

  /**
   * @param errorHandlingConfig The settings that determine how Amazon AppFlow handles an error when
   * placing data in the custom connector as destination.
   */
  public fun errorHandlingConfig(errorHandlingConfig: CfnFlow.ErrorHandlingConfigProperty) {
    cdkBuilder.errorHandlingConfig(errorHandlingConfig)
  }

  /**
   * @param idFieldNames The name of the field that Amazon AppFlow uses as an ID when performing a
   * write operation such as update, delete, or upsert.
   */
  public fun idFieldNames(vararg idFieldNames: String) {
    _idFieldNames.addAll(listOf(*idFieldNames))
  }

  /**
   * @param idFieldNames The name of the field that Amazon AppFlow uses as an ID when performing a
   * write operation such as update, delete, or upsert.
   */
  public fun idFieldNames(idFieldNames: Collection<String>) {
    _idFieldNames.addAll(idFieldNames)
  }

  /**
   * @param writeOperationType Specifies the type of write operation to be performed in the custom
   * connector when it's used as destination.
   */
  public fun writeOperationType(writeOperationType: String) {
    cdkBuilder.writeOperationType(writeOperationType)
  }

  public fun build(): CfnFlow.CustomConnectorDestinationPropertiesProperty {
    if(_idFieldNames.isNotEmpty()) cdkBuilder.idFieldNames(_idFieldNames)
    return cdkBuilder.build()
  }
}
