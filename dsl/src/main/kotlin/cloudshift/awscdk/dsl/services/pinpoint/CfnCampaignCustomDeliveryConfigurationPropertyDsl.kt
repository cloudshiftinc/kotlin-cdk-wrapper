@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pinpoint

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.pinpoint.CfnCampaign

/**
 * Specifies the delivery configuration settings for sending a campaign or campaign treatment
 * through a custom channel.
 *
 * This object is required if you use the `CampaignCustomMessage` object to define the message to
 * send for the campaign or campaign treatment.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pinpoint.*;
 * CustomDeliveryConfigurationProperty customDeliveryConfigurationProperty =
 * CustomDeliveryConfigurationProperty.builder()
 * .deliveryUri("deliveryUri")
 * .endpointTypes(List.of("endpointTypes"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-customdeliveryconfiguration.html)
 */
@CdkDslMarker
public class CfnCampaignCustomDeliveryConfigurationPropertyDsl {
  private val cdkBuilder: CfnCampaign.CustomDeliveryConfigurationProperty.Builder =
      CfnCampaign.CustomDeliveryConfigurationProperty.builder()

  private val _endpointTypes: MutableList<String> = mutableListOf()

  /**
   * @param deliveryUri The destination to send the campaign or treatment to. This value can be one
   * of the following:.
   * * The name or Amazon Resource Name (ARN) of an AWS Lambda function to invoke to handle delivery
   * of the campaign or treatment.
   * * The URL for a web application or service that supports HTTPS and can receive the message. The
   * URL has to be a full URL, including the HTTPS protocol.
   */
  public fun deliveryUri(deliveryUri: String) {
    cdkBuilder.deliveryUri(deliveryUri)
  }

  /**
   * @param endpointTypes The types of endpoints to send the campaign or treatment to.
   * Each valid value maps to a type of channel that you can associate with an endpoint by using the
   * `ChannelType` property of an endpoint.
   */
  public fun endpointTypes(vararg endpointTypes: String) {
    _endpointTypes.addAll(listOf(*endpointTypes))
  }

  /**
   * @param endpointTypes The types of endpoints to send the campaign or treatment to.
   * Each valid value maps to a type of channel that you can associate with an endpoint by using the
   * `ChannelType` property of an endpoint.
   */
  public fun endpointTypes(endpointTypes: Collection<String>) {
    _endpointTypes.addAll(endpointTypes)
  }

  public fun build(): CfnCampaign.CustomDeliveryConfigurationProperty {
    if(_endpointTypes.isNotEmpty()) cdkBuilder.endpointTypes(_endpointTypes)
    return cdkBuilder.build()
  }
}
