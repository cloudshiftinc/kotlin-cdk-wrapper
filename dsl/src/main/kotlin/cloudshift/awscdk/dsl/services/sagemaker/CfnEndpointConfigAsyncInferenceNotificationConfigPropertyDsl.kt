@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.sagemaker.CfnEndpointConfig

/**
 * Specifies the configuration for notifications of inference results for asynchronous inference.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * AsyncInferenceNotificationConfigProperty asyncInferenceNotificationConfigProperty =
 * AsyncInferenceNotificationConfigProperty.builder()
 * .errorTopic("errorTopic")
 * .includeInferenceResponseIn(List.of("includeInferenceResponseIn"))
 * .successTopic("successTopic")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-asyncinferencenotificationconfig.html)
 */
@CdkDslMarker
public class CfnEndpointConfigAsyncInferenceNotificationConfigPropertyDsl {
  private val cdkBuilder: CfnEndpointConfig.AsyncInferenceNotificationConfigProperty.Builder =
      CfnEndpointConfig.AsyncInferenceNotificationConfigProperty.builder()

  private val _includeInferenceResponseIn: MutableList<String> = mutableListOf()

  /**
   * @param errorTopic Amazon SNS topic to post a notification to when an inference fails.
   * If no topic is provided, no notification is sent on failure.
   */
  public fun errorTopic(errorTopic: String) {
    cdkBuilder.errorTopic(errorTopic)
  }

  /**
   * @param includeInferenceResponseIn the value to be set.
   */
  public fun includeInferenceResponseIn(vararg includeInferenceResponseIn: String) {
    _includeInferenceResponseIn.addAll(listOf(*includeInferenceResponseIn))
  }

  /**
   * @param includeInferenceResponseIn the value to be set.
   */
  public fun includeInferenceResponseIn(includeInferenceResponseIn: Collection<String>) {
    _includeInferenceResponseIn.addAll(includeInferenceResponseIn)
  }

  /**
   * @param successTopic Amazon SNS topic to post a notification to when an inference completes
   * successfully.
   * If no topic is provided, no notification is sent on success.
   */
  public fun successTopic(successTopic: String) {
    cdkBuilder.successTopic(successTopic)
  }

  public fun build(): CfnEndpointConfig.AsyncInferenceNotificationConfigProperty {
    if(_includeInferenceResponseIn.isNotEmpty())
        cdkBuilder.includeInferenceResponseIn(_includeInferenceResponseIn)
    return cdkBuilder.build()
  }
}
