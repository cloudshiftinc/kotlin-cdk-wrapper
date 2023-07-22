@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iot.CfnTopicRuleDestination

/**
 * HTTP URL destination properties.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iot.*;
 * HttpUrlDestinationSummaryProperty httpUrlDestinationSummaryProperty =
 * HttpUrlDestinationSummaryProperty.builder()
 * .confirmationUrl("confirmationUrl")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicruledestination-httpurldestinationsummary.html)
 */
@CdkDslMarker
public class CfnTopicRuleDestinationHttpUrlDestinationSummaryPropertyDsl {
  private val cdkBuilder: CfnTopicRuleDestination.HttpUrlDestinationSummaryProperty.Builder =
      CfnTopicRuleDestination.HttpUrlDestinationSummaryProperty.builder()

  /**
   * @param confirmationUrl The URL used to confirm the HTTP topic rule destination URL.
   */
  public fun confirmationUrl(confirmationUrl: String) {
    cdkBuilder.confirmationUrl(confirmationUrl)
  }

  public fun build(): CfnTopicRuleDestination.HttpUrlDestinationSummaryProperty = cdkBuilder.build()
}
