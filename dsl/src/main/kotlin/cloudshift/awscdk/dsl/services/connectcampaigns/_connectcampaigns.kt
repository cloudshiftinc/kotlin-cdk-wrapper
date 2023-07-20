@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.connectcampaigns

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.connectcampaigns.CfnCampaign
import software.amazon.awscdk.services.connectcampaigns.CfnCampaignProps
import software.constructs.Construct

public object connectcampaigns {
  public inline fun cfnCampaign(
    scope: Construct,
    id: String,
    block: CfnCampaignDsl.() -> Unit = {},
  ): CfnCampaign {
    val builder = CfnCampaignDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnCampaignAnswerMachineDetectionConfigProperty(block: CfnCampaignAnswerMachineDetectionConfigPropertyDsl.() -> Unit
      = {}): CfnCampaign.AnswerMachineDetectionConfigProperty {
    val builder = CfnCampaignAnswerMachineDetectionConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnCampaignDialerConfigProperty(block: CfnCampaignDialerConfigPropertyDsl.() -> Unit =
      {}): CfnCampaign.DialerConfigProperty {
    val builder = CfnCampaignDialerConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnCampaignOutboundCallConfigProperty(block: CfnCampaignOutboundCallConfigPropertyDsl.() -> Unit
      = {}): CfnCampaign.OutboundCallConfigProperty {
    val builder = CfnCampaignOutboundCallConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnCampaignPredictiveDialerConfigProperty(block: CfnCampaignPredictiveDialerConfigPropertyDsl.() -> Unit
      = {}): CfnCampaign.PredictiveDialerConfigProperty {
    val builder = CfnCampaignPredictiveDialerConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnCampaignProgressiveDialerConfigProperty(block: CfnCampaignProgressiveDialerConfigPropertyDsl.() -> Unit
      = {}): CfnCampaign.ProgressiveDialerConfigProperty {
    val builder = CfnCampaignProgressiveDialerConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnCampaignProps(block: CfnCampaignPropsDsl.() -> Unit = {}): CfnCampaignProps {
    val builder = CfnCampaignPropsDsl()
    builder.apply(block)
    return builder.build()
  }
}
