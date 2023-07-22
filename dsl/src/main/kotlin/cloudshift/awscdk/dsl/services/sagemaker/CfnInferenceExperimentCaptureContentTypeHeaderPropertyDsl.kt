@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment

@CdkDslMarker
public class CfnInferenceExperimentCaptureContentTypeHeaderPropertyDsl {
  private val cdkBuilder: CfnInferenceExperiment.CaptureContentTypeHeaderProperty.Builder =
      CfnInferenceExperiment.CaptureContentTypeHeaderProperty.builder()

  private val _csvContentTypes: MutableList<String> = mutableListOf()

  private val _jsonContentTypes: MutableList<String> = mutableListOf()

  /**
   * @param csvContentTypes The list of all content type headers that SageMaker will treat as CSV
   * and capture accordingly.
   */
  public fun csvContentTypes(vararg csvContentTypes: String) {
    _csvContentTypes.addAll(listOf(*csvContentTypes))
  }

  /**
   * @param csvContentTypes The list of all content type headers that SageMaker will treat as CSV
   * and capture accordingly.
   */
  public fun csvContentTypes(csvContentTypes: Collection<String>) {
    _csvContentTypes.addAll(csvContentTypes)
  }

  /**
   * @param jsonContentTypes The list of all content type headers that SageMaker will treat as JSON
   * and capture accordingly.
   */
  public fun jsonContentTypes(vararg jsonContentTypes: String) {
    _jsonContentTypes.addAll(listOf(*jsonContentTypes))
  }

  /**
   * @param jsonContentTypes The list of all content type headers that SageMaker will treat as JSON
   * and capture accordingly.
   */
  public fun jsonContentTypes(jsonContentTypes: Collection<String>) {
    _jsonContentTypes.addAll(jsonContentTypes)
  }

  public fun build(): CfnInferenceExperiment.CaptureContentTypeHeaderProperty {
    if(_csvContentTypes.isNotEmpty()) cdkBuilder.csvContentTypes(_csvContentTypes)
    if(_jsonContentTypes.isNotEmpty()) cdkBuilder.jsonContentTypes(_jsonContentTypes)
    return cdkBuilder.build()
  }
}
