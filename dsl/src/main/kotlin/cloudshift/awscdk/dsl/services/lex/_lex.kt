@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lex

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.lex.CfnBot
import software.amazon.awscdk.services.lex.CfnBotAlias
import software.amazon.awscdk.services.lex.CfnBotAliasProps
import software.amazon.awscdk.services.lex.CfnBotProps
import software.amazon.awscdk.services.lex.CfnBotVersion
import software.amazon.awscdk.services.lex.CfnBotVersionProps
import software.amazon.awscdk.services.lex.CfnResourcePolicy
import software.amazon.awscdk.services.lex.CfnResourcePolicyProps
import software.constructs.Construct

public object lex {
  public inline fun cfnBot(
    scope: Construct,
    id: String,
    block: CfnBotDsl.() -> Unit = {},
  ): CfnBot {
    val builder = CfnBotDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnBotAdvancedRecognitionSettingProperty(block: CfnBotAdvancedRecognitionSettingPropertyDsl.() -> Unit
      = {}): CfnBot.AdvancedRecognitionSettingProperty {
    val builder = CfnBotAdvancedRecognitionSettingPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnBotAlias(
    scope: Construct,
    id: String,
    block: CfnBotAliasDsl.() -> Unit = {},
  ): CfnBotAlias {
    val builder = CfnBotAliasDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnBotAliasAudioLogDestinationProperty(block: CfnBotAliasAudioLogDestinationPropertyDsl.() -> Unit
      = {}): CfnBotAlias.AudioLogDestinationProperty {
    val builder = CfnBotAliasAudioLogDestinationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnBotAliasAudioLogSettingProperty(block: CfnBotAliasAudioLogSettingPropertyDsl.() -> Unit
      = {}): CfnBotAlias.AudioLogSettingProperty {
    val builder = CfnBotAliasAudioLogSettingPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnBotAliasBotAliasLocaleSettingsItemProperty(block: CfnBotAliasBotAliasLocaleSettingsItemPropertyDsl.() -> Unit
      = {}): CfnBotAlias.BotAliasLocaleSettingsItemProperty {
    val builder = CfnBotAliasBotAliasLocaleSettingsItemPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnBotAliasBotAliasLocaleSettingsProperty(block: CfnBotAliasBotAliasLocaleSettingsPropertyDsl.() -> Unit
      = {}): CfnBotAlias.BotAliasLocaleSettingsProperty {
    val builder = CfnBotAliasBotAliasLocaleSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnBotAliasCloudWatchLogGroupLogDestinationProperty(block: CfnBotAliasCloudWatchLogGroupLogDestinationPropertyDsl.() -> Unit
      = {}): CfnBotAlias.CloudWatchLogGroupLogDestinationProperty {
    val builder = CfnBotAliasCloudWatchLogGroupLogDestinationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnBotAliasCodeHookSpecificationProperty(block: CfnBotAliasCodeHookSpecificationPropertyDsl.() -> Unit
      = {}): CfnBotAlias.CodeHookSpecificationProperty {
    val builder = CfnBotAliasCodeHookSpecificationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnBotAliasConversationLogSettingsProperty(block: CfnBotAliasConversationLogSettingsPropertyDsl.() -> Unit
      = {}): CfnBotAlias.ConversationLogSettingsProperty {
    val builder = CfnBotAliasConversationLogSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnBotAliasLambdaCodeHookProperty(block: CfnBotAliasLambdaCodeHookPropertyDsl.() -> Unit =
      {}): CfnBotAlias.LambdaCodeHookProperty {
    val builder = CfnBotAliasLambdaCodeHookPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnBotAliasProps(block: CfnBotAliasPropsDsl.() -> Unit = {}): CfnBotAliasProps {
    val builder = CfnBotAliasPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnBotAliasS3BucketLogDestinationProperty(block: CfnBotAliasS3BucketLogDestinationPropertyDsl.() -> Unit
      = {}): CfnBotAlias.S3BucketLogDestinationProperty {
    val builder = CfnBotAliasS3BucketLogDestinationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnBotAliasSentimentAnalysisSettingsProperty(block: CfnBotAliasSentimentAnalysisSettingsPropertyDsl.() -> Unit
      = {}): CfnBotAlias.SentimentAnalysisSettingsProperty {
    val builder = CfnBotAliasSentimentAnalysisSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnBotAliasTextLogDestinationProperty(block: CfnBotAliasTextLogDestinationPropertyDsl.() -> Unit
      = {}): CfnBotAlias.TextLogDestinationProperty {
    val builder = CfnBotAliasTextLogDestinationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnBotAliasTextLogSettingProperty(block: CfnBotAliasTextLogSettingPropertyDsl.() -> Unit =
      {}): CfnBotAlias.TextLogSettingProperty {
    val builder = CfnBotAliasTextLogSettingPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnBotAllowedInputTypesProperty(block: CfnBotAllowedInputTypesPropertyDsl.() -> Unit =
      {}): CfnBot.AllowedInputTypesProperty {
    val builder = CfnBotAllowedInputTypesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnBotAudioAndDTMFInputSpecificationProperty(block: CfnBotAudioAndDTMFInputSpecificationPropertyDsl.() -> Unit
      = {}): CfnBot.AudioAndDTMFInputSpecificationProperty {
    val builder = CfnBotAudioAndDTMFInputSpecificationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnBotAudioLogDestinationProperty(block: CfnBotAudioLogDestinationPropertyDsl.() -> Unit =
      {}): CfnBot.AudioLogDestinationProperty {
    val builder = CfnBotAudioLogDestinationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnBotAudioLogSettingProperty(block: CfnBotAudioLogSettingPropertyDsl.() -> Unit
      = {}): CfnBot.AudioLogSettingProperty {
    val builder = CfnBotAudioLogSettingPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnBotAudioSpecificationProperty(block: CfnBotAudioSpecificationPropertyDsl.() -> Unit =
      {}): CfnBot.AudioSpecificationProperty {
    val builder = CfnBotAudioSpecificationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnBotBotAliasLocaleSettingsItemProperty(block: CfnBotBotAliasLocaleSettingsItemPropertyDsl.() -> Unit
      = {}): CfnBot.BotAliasLocaleSettingsItemProperty {
    val builder = CfnBotBotAliasLocaleSettingsItemPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnBotBotAliasLocaleSettingsProperty(block: CfnBotBotAliasLocaleSettingsPropertyDsl.() -> Unit
      = {}): CfnBot.BotAliasLocaleSettingsProperty {
    val builder = CfnBotBotAliasLocaleSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnBotBotLocaleProperty(block: CfnBotBotLocalePropertyDsl.() -> Unit = {}):
      CfnBot.BotLocaleProperty {
    val builder = CfnBotBotLocalePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnBotButtonProperty(block: CfnBotButtonPropertyDsl.() -> Unit = {}):
      CfnBot.ButtonProperty {
    val builder = CfnBotButtonPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnBotCloudWatchLogGroupLogDestinationProperty(block: CfnBotCloudWatchLogGroupLogDestinationPropertyDsl.() -> Unit
      = {}): CfnBot.CloudWatchLogGroupLogDestinationProperty {
    val builder = CfnBotCloudWatchLogGroupLogDestinationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnBotCodeHookSpecificationProperty(block: CfnBotCodeHookSpecificationPropertyDsl.() -> Unit
      = {}): CfnBot.CodeHookSpecificationProperty {
    val builder = CfnBotCodeHookSpecificationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnBotConditionProperty(block: CfnBotConditionPropertyDsl.() -> Unit = {}):
      CfnBot.ConditionProperty {
    val builder = CfnBotConditionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnBotConditionalBranchProperty(block: CfnBotConditionalBranchPropertyDsl.() -> Unit =
      {}): CfnBot.ConditionalBranchProperty {
    val builder = CfnBotConditionalBranchPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnBotConditionalSpecificationProperty(block: CfnBotConditionalSpecificationPropertyDsl.() -> Unit
      = {}): CfnBot.ConditionalSpecificationProperty {
    val builder = CfnBotConditionalSpecificationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnBotConversationLogSettingsProperty(block: CfnBotConversationLogSettingsPropertyDsl.() -> Unit
      = {}): CfnBot.ConversationLogSettingsProperty {
    val builder = CfnBotConversationLogSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnBotCustomPayloadProperty(block: CfnBotCustomPayloadPropertyDsl.() -> Unit =
      {}): CfnBot.CustomPayloadProperty {
    val builder = CfnBotCustomPayloadPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnBotCustomVocabularyItemProperty(block: CfnBotCustomVocabularyItemPropertyDsl.() -> Unit
      = {}): CfnBot.CustomVocabularyItemProperty {
    val builder = CfnBotCustomVocabularyItemPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnBotCustomVocabularyProperty(block: CfnBotCustomVocabularyPropertyDsl.() -> Unit = {}):
      CfnBot.CustomVocabularyProperty {
    val builder = CfnBotCustomVocabularyPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnBotDTMFSpecificationProperty(block: CfnBotDTMFSpecificationPropertyDsl.() -> Unit =
      {}): CfnBot.DTMFSpecificationProperty {
    val builder = CfnBotDTMFSpecificationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnBotDataPrivacyProperty(block: CfnBotDataPrivacyPropertyDsl.() -> Unit = {}):
      CfnBot.DataPrivacyProperty {
    val builder = CfnBotDataPrivacyPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnBotDefaultConditionalBranchProperty(block: CfnBotDefaultConditionalBranchPropertyDsl.() -> Unit
      = {}): CfnBot.DefaultConditionalBranchProperty {
    val builder = CfnBotDefaultConditionalBranchPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnBotDialogActionProperty(block: CfnBotDialogActionPropertyDsl.() -> Unit =
      {}): CfnBot.DialogActionProperty {
    val builder = CfnBotDialogActionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnBotDialogCodeHookInvocationSettingProperty(block: CfnBotDialogCodeHookInvocationSettingPropertyDsl.() -> Unit
      = {}): CfnBot.DialogCodeHookInvocationSettingProperty {
    val builder = CfnBotDialogCodeHookInvocationSettingPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnBotDialogCodeHookSettingProperty(block: CfnBotDialogCodeHookSettingPropertyDsl.() -> Unit
      = {}): CfnBot.DialogCodeHookSettingProperty {
    val builder = CfnBotDialogCodeHookSettingPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnBotDialogStateProperty(block: CfnBotDialogStatePropertyDsl.() -> Unit = {}):
      CfnBot.DialogStateProperty {
    val builder = CfnBotDialogStatePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnBotElicitationCodeHookInvocationSettingProperty(block: CfnBotElicitationCodeHookInvocationSettingPropertyDsl.() -> Unit
      = {}): CfnBot.ElicitationCodeHookInvocationSettingProperty {
    val builder = CfnBotElicitationCodeHookInvocationSettingPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnBotExternalSourceSettingProperty(block: CfnBotExternalSourceSettingPropertyDsl.() -> Unit
      = {}): CfnBot.ExternalSourceSettingProperty {
    val builder = CfnBotExternalSourceSettingPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnBotFulfillmentCodeHookSettingProperty(block: CfnBotFulfillmentCodeHookSettingPropertyDsl.() -> Unit
      = {}): CfnBot.FulfillmentCodeHookSettingProperty {
    val builder = CfnBotFulfillmentCodeHookSettingPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnBotFulfillmentStartResponseSpecificationProperty(block: CfnBotFulfillmentStartResponseSpecificationPropertyDsl.() -> Unit
      = {}): CfnBot.FulfillmentStartResponseSpecificationProperty {
    val builder = CfnBotFulfillmentStartResponseSpecificationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnBotFulfillmentUpdateResponseSpecificationProperty(block: CfnBotFulfillmentUpdateResponseSpecificationPropertyDsl.() -> Unit
      = {}): CfnBot.FulfillmentUpdateResponseSpecificationProperty {
    val builder = CfnBotFulfillmentUpdateResponseSpecificationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnBotFulfillmentUpdatesSpecificationProperty(block: CfnBotFulfillmentUpdatesSpecificationPropertyDsl.() -> Unit
      = {}): CfnBot.FulfillmentUpdatesSpecificationProperty {
    val builder = CfnBotFulfillmentUpdatesSpecificationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnBotGrammarSlotTypeSettingProperty(block: CfnBotGrammarSlotTypeSettingPropertyDsl.() -> Unit
      = {}): CfnBot.GrammarSlotTypeSettingProperty {
    val builder = CfnBotGrammarSlotTypeSettingPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnBotGrammarSlotTypeSourceProperty(block: CfnBotGrammarSlotTypeSourcePropertyDsl.() -> Unit
      = {}): CfnBot.GrammarSlotTypeSourceProperty {
    val builder = CfnBotGrammarSlotTypeSourcePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnBotImageResponseCardProperty(block: CfnBotImageResponseCardPropertyDsl.() -> Unit =
      {}): CfnBot.ImageResponseCardProperty {
    val builder = CfnBotImageResponseCardPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnBotInitialResponseSettingProperty(block: CfnBotInitialResponseSettingPropertyDsl.() -> Unit
      = {}): CfnBot.InitialResponseSettingProperty {
    val builder = CfnBotInitialResponseSettingPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnBotInputContextProperty(block: CfnBotInputContextPropertyDsl.() -> Unit =
      {}): CfnBot.InputContextProperty {
    val builder = CfnBotInputContextPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnBotIntentClosingSettingProperty(block: CfnBotIntentClosingSettingPropertyDsl.() -> Unit
      = {}): CfnBot.IntentClosingSettingProperty {
    val builder = CfnBotIntentClosingSettingPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnBotIntentConfirmationSettingProperty(block: CfnBotIntentConfirmationSettingPropertyDsl.() -> Unit
      = {}): CfnBot.IntentConfirmationSettingProperty {
    val builder = CfnBotIntentConfirmationSettingPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnBotIntentOverrideProperty(block: CfnBotIntentOverridePropertyDsl.() -> Unit =
      {}): CfnBot.IntentOverrideProperty {
    val builder = CfnBotIntentOverridePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnBotIntentProperty(block: CfnBotIntentPropertyDsl.() -> Unit = {}):
      CfnBot.IntentProperty {
    val builder = CfnBotIntentPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnBotKendraConfigurationProperty(block: CfnBotKendraConfigurationPropertyDsl.() -> Unit =
      {}): CfnBot.KendraConfigurationProperty {
    val builder = CfnBotKendraConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnBotLambdaCodeHookProperty(block: CfnBotLambdaCodeHookPropertyDsl.() -> Unit =
      {}): CfnBot.LambdaCodeHookProperty {
    val builder = CfnBotLambdaCodeHookPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnBotMessageGroupProperty(block: CfnBotMessageGroupPropertyDsl.() -> Unit =
      {}): CfnBot.MessageGroupProperty {
    val builder = CfnBotMessageGroupPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnBotMessageProperty(block: CfnBotMessagePropertyDsl.() -> Unit = {}):
      CfnBot.MessageProperty {
    val builder = CfnBotMessagePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnBotMultipleValuesSettingProperty(block: CfnBotMultipleValuesSettingPropertyDsl.() -> Unit
      = {}): CfnBot.MultipleValuesSettingProperty {
    val builder = CfnBotMultipleValuesSettingPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnBotObfuscationSettingProperty(block: CfnBotObfuscationSettingPropertyDsl.() -> Unit =
      {}): CfnBot.ObfuscationSettingProperty {
    val builder = CfnBotObfuscationSettingPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnBotOutputContextProperty(block: CfnBotOutputContextPropertyDsl.() -> Unit =
      {}): CfnBot.OutputContextProperty {
    val builder = CfnBotOutputContextPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnBotPlainTextMessageProperty(block: CfnBotPlainTextMessagePropertyDsl.() -> Unit = {}):
      CfnBot.PlainTextMessageProperty {
    val builder = CfnBotPlainTextMessagePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnBotPostDialogCodeHookInvocationSpecificationProperty(block: CfnBotPostDialogCodeHookInvocationSpecificationPropertyDsl.() -> Unit
      = {}): CfnBot.PostDialogCodeHookInvocationSpecificationProperty {
    val builder = CfnBotPostDialogCodeHookInvocationSpecificationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnBotPostFulfillmentStatusSpecificationProperty(block: CfnBotPostFulfillmentStatusSpecificationPropertyDsl.() -> Unit
      = {}): CfnBot.PostFulfillmentStatusSpecificationProperty {
    val builder = CfnBotPostFulfillmentStatusSpecificationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnBotPromptAttemptSpecificationProperty(block: CfnBotPromptAttemptSpecificationPropertyDsl.() -> Unit
      = {}): CfnBot.PromptAttemptSpecificationProperty {
    val builder = CfnBotPromptAttemptSpecificationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnBotPromptSpecificationProperty(block: CfnBotPromptSpecificationPropertyDsl.() -> Unit =
      {}): CfnBot.PromptSpecificationProperty {
    val builder = CfnBotPromptSpecificationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnBotProps(block: CfnBotPropsDsl.() -> Unit = {}): CfnBotProps {
    val builder = CfnBotPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnBotResponseSpecificationProperty(block: CfnBotResponseSpecificationPropertyDsl.() -> Unit
      = {}): CfnBot.ResponseSpecificationProperty {
    val builder = CfnBotResponseSpecificationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnBotS3BucketLogDestinationProperty(block: CfnBotS3BucketLogDestinationPropertyDsl.() -> Unit
      = {}): CfnBot.S3BucketLogDestinationProperty {
    val builder = CfnBotS3BucketLogDestinationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnBotS3LocationProperty(block: CfnBotS3LocationPropertyDsl.() -> Unit = {}):
      CfnBot.S3LocationProperty {
    val builder = CfnBotS3LocationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnBotSSMLMessageProperty(block: CfnBotSSMLMessagePropertyDsl.() -> Unit = {}):
      CfnBot.SSMLMessageProperty {
    val builder = CfnBotSSMLMessagePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnBotSampleUtteranceProperty(block: CfnBotSampleUtterancePropertyDsl.() -> Unit
      = {}): CfnBot.SampleUtteranceProperty {
    val builder = CfnBotSampleUtterancePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnBotSampleValueProperty(block: CfnBotSampleValuePropertyDsl.() -> Unit = {}):
      CfnBot.SampleValueProperty {
    val builder = CfnBotSampleValuePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnBotSentimentAnalysisSettingsProperty(block: CfnBotSentimentAnalysisSettingsPropertyDsl.() -> Unit
      = {}): CfnBot.SentimentAnalysisSettingsProperty {
    val builder = CfnBotSentimentAnalysisSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnBotSessionAttributeProperty(block: CfnBotSessionAttributePropertyDsl.() -> Unit = {}):
      CfnBot.SessionAttributeProperty {
    val builder = CfnBotSessionAttributePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnBotSlotCaptureSettingProperty(block: CfnBotSlotCaptureSettingPropertyDsl.() -> Unit =
      {}): CfnBot.SlotCaptureSettingProperty {
    val builder = CfnBotSlotCaptureSettingPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnBotSlotDefaultValueProperty(block: CfnBotSlotDefaultValuePropertyDsl.() -> Unit = {}):
      CfnBot.SlotDefaultValueProperty {
    val builder = CfnBotSlotDefaultValuePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnBotSlotDefaultValueSpecificationProperty(block: CfnBotSlotDefaultValueSpecificationPropertyDsl.() -> Unit
      = {}): CfnBot.SlotDefaultValueSpecificationProperty {
    val builder = CfnBotSlotDefaultValueSpecificationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnBotSlotPriorityProperty(block: CfnBotSlotPriorityPropertyDsl.() -> Unit =
      {}): CfnBot.SlotPriorityProperty {
    val builder = CfnBotSlotPriorityPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnBotSlotProperty(block: CfnBotSlotPropertyDsl.() -> Unit = {}):
      CfnBot.SlotProperty {
    val builder = CfnBotSlotPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnBotSlotTypeProperty(block: CfnBotSlotTypePropertyDsl.() -> Unit = {}):
      CfnBot.SlotTypeProperty {
    val builder = CfnBotSlotTypePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnBotSlotTypeValueProperty(block: CfnBotSlotTypeValuePropertyDsl.() -> Unit =
      {}): CfnBot.SlotTypeValueProperty {
    val builder = CfnBotSlotTypeValuePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnBotSlotValueElicitationSettingProperty(block: CfnBotSlotValueElicitationSettingPropertyDsl.() -> Unit
      = {}): CfnBot.SlotValueElicitationSettingProperty {
    val builder = CfnBotSlotValueElicitationSettingPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnBotSlotValueOverrideMapProperty(block: CfnBotSlotValueOverrideMapPropertyDsl.() -> Unit
      = {}): CfnBot.SlotValueOverrideMapProperty {
    val builder = CfnBotSlotValueOverrideMapPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnBotSlotValueOverrideProperty(block: CfnBotSlotValueOverridePropertyDsl.() -> Unit =
      {}): CfnBot.SlotValueOverrideProperty {
    val builder = CfnBotSlotValueOverridePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnBotSlotValueProperty(block: CfnBotSlotValuePropertyDsl.() -> Unit = {}):
      CfnBot.SlotValueProperty {
    val builder = CfnBotSlotValuePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnBotSlotValueRegexFilterProperty(block: CfnBotSlotValueRegexFilterPropertyDsl.() -> Unit
      = {}): CfnBot.SlotValueRegexFilterProperty {
    val builder = CfnBotSlotValueRegexFilterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnBotSlotValueSelectionSettingProperty(block: CfnBotSlotValueSelectionSettingPropertyDsl.() -> Unit
      = {}): CfnBot.SlotValueSelectionSettingProperty {
    val builder = CfnBotSlotValueSelectionSettingPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnBotStillWaitingResponseSpecificationProperty(block: CfnBotStillWaitingResponseSpecificationPropertyDsl.() -> Unit
      = {}): CfnBot.StillWaitingResponseSpecificationProperty {
    val builder = CfnBotStillWaitingResponseSpecificationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnBotTestBotAliasSettingsProperty(block: CfnBotTestBotAliasSettingsPropertyDsl.() -> Unit
      = {}): CfnBot.TestBotAliasSettingsProperty {
    val builder = CfnBotTestBotAliasSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnBotTextInputSpecificationProperty(block: CfnBotTextInputSpecificationPropertyDsl.() -> Unit
      = {}): CfnBot.TextInputSpecificationProperty {
    val builder = CfnBotTextInputSpecificationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnBotTextLogDestinationProperty(block: CfnBotTextLogDestinationPropertyDsl.() -> Unit =
      {}): CfnBot.TextLogDestinationProperty {
    val builder = CfnBotTextLogDestinationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnBotTextLogSettingProperty(block: CfnBotTextLogSettingPropertyDsl.() -> Unit =
      {}): CfnBot.TextLogSettingProperty {
    val builder = CfnBotTextLogSettingPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnBotVersion(
    scope: Construct,
    id: String,
    block: CfnBotVersionDsl.() -> Unit = {},
  ): CfnBotVersion {
    val builder = CfnBotVersionDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnBotVersionBotVersionLocaleDetailsProperty(block: CfnBotVersionBotVersionLocaleDetailsPropertyDsl.() -> Unit
      = {}): CfnBotVersion.BotVersionLocaleDetailsProperty {
    val builder = CfnBotVersionBotVersionLocaleDetailsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnBotVersionBotVersionLocaleSpecificationProperty(block: CfnBotVersionBotVersionLocaleSpecificationPropertyDsl.() -> Unit
      = {}): CfnBotVersion.BotVersionLocaleSpecificationProperty {
    val builder = CfnBotVersionBotVersionLocaleSpecificationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnBotVersionProps(block: CfnBotVersionPropsDsl.() -> Unit = {}):
      CfnBotVersionProps {
    val builder = CfnBotVersionPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnBotVoiceSettingsProperty(block: CfnBotVoiceSettingsPropertyDsl.() -> Unit =
      {}): CfnBot.VoiceSettingsProperty {
    val builder = CfnBotVoiceSettingsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnBotWaitAndContinueSpecificationProperty(block: CfnBotWaitAndContinueSpecificationPropertyDsl.() -> Unit
      = {}): CfnBot.WaitAndContinueSpecificationProperty {
    val builder = CfnBotWaitAndContinueSpecificationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnResourcePolicy(
    scope: Construct,
    id: String,
    block: CfnResourcePolicyDsl.() -> Unit = {},
  ): CfnResourcePolicy {
    val builder = CfnResourcePolicyDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnResourcePolicyPolicyProperty(block: CfnResourcePolicyPolicyPropertyDsl.() -> Unit =
      {}): CfnResourcePolicy.PolicyProperty {
    val builder = CfnResourcePolicyPolicyPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnResourcePolicyProps(block: CfnResourcePolicyPropsDsl.() -> Unit = {}):
      CfnResourcePolicyProps {
    val builder = CfnResourcePolicyPropsDsl()
    builder.apply(block)
    return builder.build()
  }
}
