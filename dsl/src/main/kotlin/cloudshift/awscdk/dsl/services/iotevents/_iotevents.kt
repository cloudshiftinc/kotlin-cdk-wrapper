@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotevents

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iotevents.CfnAlarmModel
import software.amazon.awscdk.services.iotevents.CfnAlarmModelProps
import software.amazon.awscdk.services.iotevents.CfnDetectorModel
import software.amazon.awscdk.services.iotevents.CfnDetectorModelProps
import software.amazon.awscdk.services.iotevents.CfnInput
import software.amazon.awscdk.services.iotevents.CfnInputProps
import software.constructs.Construct

public object iotevents {
  public inline fun cfnAlarmModel(
    scope: Construct,
    id: String,
    block: CfnAlarmModelDsl.() -> Unit = {},
  ): CfnAlarmModel {
    val builder = CfnAlarmModelDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAlarmModelAcknowledgeFlowProperty(block: CfnAlarmModelAcknowledgeFlowPropertyDsl.() -> Unit
      = {}): CfnAlarmModel.AcknowledgeFlowProperty {
    val builder = CfnAlarmModelAcknowledgeFlowPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAlarmModelAlarmActionProperty(block: CfnAlarmModelAlarmActionPropertyDsl.() -> Unit =
      {}): CfnAlarmModel.AlarmActionProperty {
    val builder = CfnAlarmModelAlarmActionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAlarmModelAlarmCapabilitiesProperty(block: CfnAlarmModelAlarmCapabilitiesPropertyDsl.() -> Unit
      = {}): CfnAlarmModel.AlarmCapabilitiesProperty {
    val builder = CfnAlarmModelAlarmCapabilitiesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAlarmModelAlarmEventActionsProperty(block: CfnAlarmModelAlarmEventActionsPropertyDsl.() -> Unit
      = {}): CfnAlarmModel.AlarmEventActionsProperty {
    val builder = CfnAlarmModelAlarmEventActionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAlarmModelAlarmRuleProperty(block: CfnAlarmModelAlarmRulePropertyDsl.() -> Unit = {}):
      CfnAlarmModel.AlarmRuleProperty {
    val builder = CfnAlarmModelAlarmRulePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAlarmModelAssetPropertyTimestampProperty(block: CfnAlarmModelAssetPropertyTimestampPropertyDsl.() -> Unit
      = {}): CfnAlarmModel.AssetPropertyTimestampProperty {
    val builder = CfnAlarmModelAssetPropertyTimestampPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAlarmModelAssetPropertyValueProperty(block: CfnAlarmModelAssetPropertyValuePropertyDsl.() -> Unit
      = {}): CfnAlarmModel.AssetPropertyValueProperty {
    val builder = CfnAlarmModelAssetPropertyValuePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAlarmModelAssetPropertyVariantProperty(block: CfnAlarmModelAssetPropertyVariantPropertyDsl.() -> Unit
      = {}): CfnAlarmModel.AssetPropertyVariantProperty {
    val builder = CfnAlarmModelAssetPropertyVariantPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnAlarmModelDynamoDBProperty(block: CfnAlarmModelDynamoDBPropertyDsl.() -> Unit
      = {}): CfnAlarmModel.DynamoDBProperty {
    val builder = CfnAlarmModelDynamoDBPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAlarmModelDynamoDBv2Property(block: CfnAlarmModelDynamoDBv2PropertyDsl.() -> Unit =
      {}): CfnAlarmModel.DynamoDBv2Property {
    val builder = CfnAlarmModelDynamoDBv2PropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnAlarmModelFirehoseProperty(block: CfnAlarmModelFirehosePropertyDsl.() -> Unit
      = {}): CfnAlarmModel.FirehoseProperty {
    val builder = CfnAlarmModelFirehosePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAlarmModelInitializationConfigurationProperty(block: CfnAlarmModelInitializationConfigurationPropertyDsl.() -> Unit
      = {}): CfnAlarmModel.InitializationConfigurationProperty {
    val builder = CfnAlarmModelInitializationConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAlarmModelIotEventsProperty(block: CfnAlarmModelIotEventsPropertyDsl.() -> Unit = {}):
      CfnAlarmModel.IotEventsProperty {
    val builder = CfnAlarmModelIotEventsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAlarmModelIotSiteWiseProperty(block: CfnAlarmModelIotSiteWisePropertyDsl.() -> Unit =
      {}): CfnAlarmModel.IotSiteWiseProperty {
    val builder = CfnAlarmModelIotSiteWisePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAlarmModelIotTopicPublishProperty(block: CfnAlarmModelIotTopicPublishPropertyDsl.() -> Unit
      = {}): CfnAlarmModel.IotTopicPublishProperty {
    val builder = CfnAlarmModelIotTopicPublishPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnAlarmModelLambdaProperty(block: CfnAlarmModelLambdaPropertyDsl.() -> Unit =
      {}): CfnAlarmModel.LambdaProperty {
    val builder = CfnAlarmModelLambdaPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnAlarmModelPayloadProperty(block: CfnAlarmModelPayloadPropertyDsl.() -> Unit =
      {}): CfnAlarmModel.PayloadProperty {
    val builder = CfnAlarmModelPayloadPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnAlarmModelProps(block: CfnAlarmModelPropsDsl.() -> Unit = {}):
      CfnAlarmModelProps {
    val builder = CfnAlarmModelPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAlarmModelSimpleRuleProperty(block: CfnAlarmModelSimpleRulePropertyDsl.() -> Unit =
      {}): CfnAlarmModel.SimpleRuleProperty {
    val builder = CfnAlarmModelSimpleRulePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnAlarmModelSnsProperty(block: CfnAlarmModelSnsPropertyDsl.() -> Unit = {}):
      CfnAlarmModel.SnsProperty {
    val builder = CfnAlarmModelSnsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnAlarmModelSqsProperty(block: CfnAlarmModelSqsPropertyDsl.() -> Unit = {}):
      CfnAlarmModel.SqsProperty {
    val builder = CfnAlarmModelSqsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnDetectorModel(
    scope: Construct,
    id: String,
    block: CfnDetectorModelDsl.() -> Unit = {},
  ): CfnDetectorModel {
    val builder = CfnDetectorModelDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDetectorModelActionProperty(block: CfnDetectorModelActionPropertyDsl.() -> Unit = {}):
      CfnDetectorModel.ActionProperty {
    val builder = CfnDetectorModelActionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDetectorModelAssetPropertyTimestampProperty(block: CfnDetectorModelAssetPropertyTimestampPropertyDsl.() -> Unit
      = {}): CfnDetectorModel.AssetPropertyTimestampProperty {
    val builder = CfnDetectorModelAssetPropertyTimestampPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDetectorModelAssetPropertyValueProperty(block: CfnDetectorModelAssetPropertyValuePropertyDsl.() -> Unit
      = {}): CfnDetectorModel.AssetPropertyValueProperty {
    val builder = CfnDetectorModelAssetPropertyValuePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDetectorModelAssetPropertyVariantProperty(block: CfnDetectorModelAssetPropertyVariantPropertyDsl.() -> Unit
      = {}): CfnDetectorModel.AssetPropertyVariantProperty {
    val builder = CfnDetectorModelAssetPropertyVariantPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDetectorModelClearTimerProperty(block: CfnDetectorModelClearTimerPropertyDsl.() -> Unit
      = {}): CfnDetectorModel.ClearTimerProperty {
    val builder = CfnDetectorModelClearTimerPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDetectorModelDetectorModelDefinitionProperty(block: CfnDetectorModelDetectorModelDefinitionPropertyDsl.() -> Unit
      = {}): CfnDetectorModel.DetectorModelDefinitionProperty {
    val builder = CfnDetectorModelDetectorModelDefinitionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDetectorModelDynamoDBProperty(block: CfnDetectorModelDynamoDBPropertyDsl.() -> Unit =
      {}): CfnDetectorModel.DynamoDBProperty {
    val builder = CfnDetectorModelDynamoDBPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDetectorModelDynamoDBv2Property(block: CfnDetectorModelDynamoDBv2PropertyDsl.() -> Unit
      = {}): CfnDetectorModel.DynamoDBv2Property {
    val builder = CfnDetectorModelDynamoDBv2PropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnDetectorModelEventProperty(block: CfnDetectorModelEventPropertyDsl.() -> Unit
      = {}): CfnDetectorModel.EventProperty {
    val builder = CfnDetectorModelEventPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDetectorModelFirehoseProperty(block: CfnDetectorModelFirehosePropertyDsl.() -> Unit =
      {}): CfnDetectorModel.FirehoseProperty {
    val builder = CfnDetectorModelFirehosePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDetectorModelIotEventsProperty(block: CfnDetectorModelIotEventsPropertyDsl.() -> Unit =
      {}): CfnDetectorModel.IotEventsProperty {
    val builder = CfnDetectorModelIotEventsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDetectorModelIotSiteWiseProperty(block: CfnDetectorModelIotSiteWisePropertyDsl.() -> Unit
      = {}): CfnDetectorModel.IotSiteWiseProperty {
    val builder = CfnDetectorModelIotSiteWisePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDetectorModelIotTopicPublishProperty(block: CfnDetectorModelIotTopicPublishPropertyDsl.() -> Unit
      = {}): CfnDetectorModel.IotTopicPublishProperty {
    val builder = CfnDetectorModelIotTopicPublishPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDetectorModelLambdaProperty(block: CfnDetectorModelLambdaPropertyDsl.() -> Unit = {}):
      CfnDetectorModel.LambdaProperty {
    val builder = CfnDetectorModelLambdaPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDetectorModelOnEnterProperty(block: CfnDetectorModelOnEnterPropertyDsl.() -> Unit =
      {}): CfnDetectorModel.OnEnterProperty {
    val builder = CfnDetectorModelOnEnterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDetectorModelOnExitProperty(block: CfnDetectorModelOnExitPropertyDsl.() -> Unit = {}):
      CfnDetectorModel.OnExitProperty {
    val builder = CfnDetectorModelOnExitPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDetectorModelOnInputProperty(block: CfnDetectorModelOnInputPropertyDsl.() -> Unit =
      {}): CfnDetectorModel.OnInputProperty {
    val builder = CfnDetectorModelOnInputPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDetectorModelPayloadProperty(block: CfnDetectorModelPayloadPropertyDsl.() -> Unit =
      {}): CfnDetectorModel.PayloadProperty {
    val builder = CfnDetectorModelPayloadPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnDetectorModelProps(block: CfnDetectorModelPropsDsl.() -> Unit = {}):
      CfnDetectorModelProps {
    val builder = CfnDetectorModelPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDetectorModelResetTimerProperty(block: CfnDetectorModelResetTimerPropertyDsl.() -> Unit
      = {}): CfnDetectorModel.ResetTimerProperty {
    val builder = CfnDetectorModelResetTimerPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDetectorModelSetTimerProperty(block: CfnDetectorModelSetTimerPropertyDsl.() -> Unit =
      {}): CfnDetectorModel.SetTimerProperty {
    val builder = CfnDetectorModelSetTimerPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDetectorModelSetVariableProperty(block: CfnDetectorModelSetVariablePropertyDsl.() -> Unit
      = {}): CfnDetectorModel.SetVariableProperty {
    val builder = CfnDetectorModelSetVariablePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnDetectorModelSnsProperty(block: CfnDetectorModelSnsPropertyDsl.() -> Unit =
      {}): CfnDetectorModel.SnsProperty {
    val builder = CfnDetectorModelSnsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnDetectorModelSqsProperty(block: CfnDetectorModelSqsPropertyDsl.() -> Unit =
      {}): CfnDetectorModel.SqsProperty {
    val builder = CfnDetectorModelSqsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnDetectorModelStateProperty(block: CfnDetectorModelStatePropertyDsl.() -> Unit
      = {}): CfnDetectorModel.StateProperty {
    val builder = CfnDetectorModelStatePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDetectorModelTransitionEventProperty(block: CfnDetectorModelTransitionEventPropertyDsl.() -> Unit
      = {}): CfnDetectorModel.TransitionEventProperty {
    val builder = CfnDetectorModelTransitionEventPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnInput(
    scope: Construct,
    id: String,
    block: CfnInputDsl.() -> Unit = {},
  ): CfnInput {
    val builder = CfnInputDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnInputAttributeProperty(block: CfnInputAttributePropertyDsl.() -> Unit = {}):
      CfnInput.AttributeProperty {
    val builder = CfnInputAttributePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnInputInputDefinitionProperty(block: CfnInputInputDefinitionPropertyDsl.() -> Unit =
      {}): CfnInput.InputDefinitionProperty {
    val builder = CfnInputInputDefinitionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnInputProps(block: CfnInputPropsDsl.() -> Unit = {}): CfnInputProps {
    val builder = CfnInputPropsDsl()
    builder.apply(block)
    return builder.build()
  }
}
