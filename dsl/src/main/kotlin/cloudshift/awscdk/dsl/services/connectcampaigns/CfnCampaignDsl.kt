@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.connectcampaigns

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.connectcampaigns.CfnCampaign
import software.constructs.Construct

/**
 * Contains information about an outbound campaign.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.connectcampaigns.*;
 * CfnCampaign cfnCampaign = CfnCampaign.Builder.create(this, "MyCfnCampaign")
 * .connectInstanceArn("connectInstanceArn")
 * .dialerConfig(DialerConfigProperty.builder()
 * .predictiveDialerConfig(PredictiveDialerConfigProperty.builder()
 * .bandwidthAllocation(123)
 * .build())
 * .progressiveDialerConfig(ProgressiveDialerConfigProperty.builder()
 * .bandwidthAllocation(123)
 * .build())
 * .build())
 * .name("name")
 * .outboundCallConfig(OutboundCallConfigProperty.builder()
 * .connectContactFlowArn("connectContactFlowArn")
 * .connectQueueArn("connectQueueArn")
 * // the properties below are optional
 * .answerMachineDetectionConfig(AnswerMachineDetectionConfigProperty.builder()
 * .enableAnswerMachineDetection(false)
 * .build())
 * .connectSourcePhoneNumber("connectSourcePhoneNumber")
 * .build())
 * // the properties below are optional
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connectcampaigns-campaign.html)
 */
@CdkDslMarker
public class CfnCampaignDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnCampaign.Builder = CfnCampaign.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * The Amazon Resource Name (ARN) of the Amazon Connect instance.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connectcampaigns-campaign.html#cfn-connectcampaigns-campaign-connectinstancearn)
   * @param connectInstanceArn The Amazon Resource Name (ARN) of the Amazon Connect instance. 
   */
  public fun connectInstanceArn(connectInstanceArn: String) {
    cdkBuilder.connectInstanceArn(connectInstanceArn)
  }

  /**
   * Contains information about the dialer configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connectcampaigns-campaign.html#cfn-connectcampaigns-campaign-dialerconfig)
   * @param dialerConfig Contains information about the dialer configuration. 
   */
  public fun dialerConfig(dialerConfig: IResolvable) {
    cdkBuilder.dialerConfig(dialerConfig)
  }

  /**
   * Contains information about the dialer configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connectcampaigns-campaign.html#cfn-connectcampaigns-campaign-dialerconfig)
   * @param dialerConfig Contains information about the dialer configuration. 
   */
  public fun dialerConfig(dialerConfig: CfnCampaign.DialerConfigProperty) {
    cdkBuilder.dialerConfig(dialerConfig)
  }

  /**
   * The name of the campaign.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connectcampaigns-campaign.html#cfn-connectcampaigns-campaign-name)
   * @param name The name of the campaign. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * Contains information about the outbound call configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connectcampaigns-campaign.html#cfn-connectcampaigns-campaign-outboundcallconfig)
   * @param outboundCallConfig Contains information about the outbound call configuration. 
   */
  public fun outboundCallConfig(outboundCallConfig: IResolvable) {
    cdkBuilder.outboundCallConfig(outboundCallConfig)
  }

  /**
   * Contains information about the outbound call configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connectcampaigns-campaign.html#cfn-connectcampaigns-campaign-outboundcallconfig)
   * @param outboundCallConfig Contains information about the outbound call configuration. 
   */
  public fun outboundCallConfig(outboundCallConfig: CfnCampaign.OutboundCallConfigProperty) {
    cdkBuilder.outboundCallConfig(outboundCallConfig)
  }

  /**
   * The tags used to organize, track, or control access for this resource.
   *
   * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connectcampaigns-campaign.html#cfn-connectcampaigns-campaign-tags)
   * @param tags The tags used to organize, track, or control access for this resource. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * The tags used to organize, track, or control access for this resource.
   *
   * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connectcampaigns-campaign.html#cfn-connectcampaigns-campaign-tags)
   * @param tags The tags used to organize, track, or control access for this resource. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnCampaign {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
