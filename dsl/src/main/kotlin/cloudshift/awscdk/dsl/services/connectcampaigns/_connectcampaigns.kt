@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.connectcampaigns

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.connectcampaigns.CfnCampaign
import software.amazon.awscdk.services.connectcampaigns.CfnCampaignProps
import software.constructs.Construct

public object connectcampaigns {
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
  public inline fun cfnCampaign(
    scope: Construct,
    id: String,
    block: CfnCampaignDsl.() -> Unit = {},
  ): CfnCampaign {
    val builder = CfnCampaignDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * The configuration used for answering machine detection during outbound calls.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.connectcampaigns.*;
   * AnswerMachineDetectionConfigProperty answerMachineDetectionConfigProperty =
   * AnswerMachineDetectionConfigProperty.builder()
   * .enableAnswerMachineDetection(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaigns-campaign-answermachinedetectionconfig.html)
   */
  public inline
      fun cfnCampaignAnswerMachineDetectionConfigProperty(block: CfnCampaignAnswerMachineDetectionConfigPropertyDsl.() -> Unit
      = {}): CfnCampaign.AnswerMachineDetectionConfigProperty {
    val builder = CfnCampaignAnswerMachineDetectionConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Contains dialer configuration for an outbound campaign.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.connectcampaigns.*;
   * DialerConfigProperty dialerConfigProperty = DialerConfigProperty.builder()
   * .predictiveDialerConfig(PredictiveDialerConfigProperty.builder()
   * .bandwidthAllocation(123)
   * .build())
   * .progressiveDialerConfig(ProgressiveDialerConfigProperty.builder()
   * .bandwidthAllocation(123)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaigns-campaign-dialerconfig.html)
   */
  public inline
      fun cfnCampaignDialerConfigProperty(block: CfnCampaignDialerConfigPropertyDsl.() -> Unit =
      {}): CfnCampaign.DialerConfigProperty {
    val builder = CfnCampaignDialerConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Contains outbound call configuration for an outbound campaign.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.connectcampaigns.*;
   * OutboundCallConfigProperty outboundCallConfigProperty = OutboundCallConfigProperty.builder()
   * .connectContactFlowArn("connectContactFlowArn")
   * .connectQueueArn("connectQueueArn")
   * // the properties below are optional
   * .answerMachineDetectionConfig(AnswerMachineDetectionConfigProperty.builder()
   * .enableAnswerMachineDetection(false)
   * .build())
   * .connectSourcePhoneNumber("connectSourcePhoneNumber")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaigns-campaign-outboundcallconfig.html)
   */
  public inline
      fun cfnCampaignOutboundCallConfigProperty(block: CfnCampaignOutboundCallConfigPropertyDsl.() -> Unit
      = {}): CfnCampaign.OutboundCallConfigProperty {
    val builder = CfnCampaignOutboundCallConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Contains predictive dialer configuration for an outbound campaign.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.connectcampaigns.*;
   * PredictiveDialerConfigProperty predictiveDialerConfigProperty =
   * PredictiveDialerConfigProperty.builder()
   * .bandwidthAllocation(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaigns-campaign-predictivedialerconfig.html)
   */
  public inline
      fun cfnCampaignPredictiveDialerConfigProperty(block: CfnCampaignPredictiveDialerConfigPropertyDsl.() -> Unit
      = {}): CfnCampaign.PredictiveDialerConfigProperty {
    val builder = CfnCampaignPredictiveDialerConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Contains progressive dialer configuration for an outbound campaign.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.connectcampaigns.*;
   * ProgressiveDialerConfigProperty progressiveDialerConfigProperty =
   * ProgressiveDialerConfigProperty.builder()
   * .bandwidthAllocation(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaigns-campaign-progressivedialerconfig.html)
   */
  public inline
      fun cfnCampaignProgressiveDialerConfigProperty(block: CfnCampaignProgressiveDialerConfigPropertyDsl.() -> Unit
      = {}): CfnCampaign.ProgressiveDialerConfigProperty {
    val builder = CfnCampaignProgressiveDialerConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnCampaign`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.connectcampaigns.*;
   * CfnCampaignProps cfnCampaignProps = CfnCampaignProps.builder()
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
  public inline fun cfnCampaignProps(block: CfnCampaignPropsDsl.() -> Unit = {}): CfnCampaignProps {
    val builder = CfnCampaignPropsDsl()
    builder.apply(block)
    return builder.build()
  }
}
