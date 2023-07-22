@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.sagemaker.CfnEndpointConfig

@CdkDslMarker
public class CfnEndpointConfigCaptureContentTypeHeaderPropertyDsl {
  private val cdkBuilder: CfnEndpointConfig.CaptureContentTypeHeaderProperty.Builder =
      CfnEndpointConfig.CaptureContentTypeHeaderProperty.builder()

  private val _csvContentTypes: MutableList<String> = mutableListOf()

  private val _jsonContentTypes: MutableList<String> = mutableListOf()

  /**
   * @param csvContentTypes A list of the CSV content types of the data that the endpoint captures.
   * For the endpoint to capture the data, you must also specify the content type when you invoke
   * the endpoint.
   */
  public fun csvContentTypes(vararg csvContentTypes: String) {
    _csvContentTypes.addAll(listOf(*csvContentTypes))
  }

  /**
   * @param csvContentTypes A list of the CSV content types of the data that the endpoint captures.
   * For the endpoint to capture the data, you must also specify the content type when you invoke
   * the endpoint.
   */
  public fun csvContentTypes(csvContentTypes: Collection<String>) {
    _csvContentTypes.addAll(csvContentTypes)
  }

  /**
   * @param jsonContentTypes A list of the JSON content types of the data that the endpoint
   * captures.
   * For the endpoint to capture the data, you must also specify the content type when you invoke
   * the endpoint.
   */
  public fun jsonContentTypes(vararg jsonContentTypes: String) {
    _jsonContentTypes.addAll(listOf(*jsonContentTypes))
  }

  /**
   * @param jsonContentTypes A list of the JSON content types of the data that the endpoint
   * captures.
   * For the endpoint to capture the data, you must also specify the content type when you invoke
   * the endpoint.
   */
  public fun jsonContentTypes(jsonContentTypes: Collection<String>) {
    _jsonContentTypes.addAll(jsonContentTypes)
  }

  public fun build(): CfnEndpointConfig.CaptureContentTypeHeaderProperty {
    if(_csvContentTypes.isNotEmpty()) cdkBuilder.csvContentTypes(_csvContentTypes)
    if(_jsonContentTypes.isNotEmpty()) cdkBuilder.jsonContentTypes(_jsonContentTypes)
    return cdkBuilder.build()
  }
}
