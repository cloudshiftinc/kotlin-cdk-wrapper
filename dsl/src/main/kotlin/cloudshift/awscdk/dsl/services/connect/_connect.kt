@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.connect

import software.amazon.awscdk.services.connect.CfnApprovedOrigin
import software.amazon.awscdk.services.connect.CfnApprovedOriginProps
import software.amazon.awscdk.services.connect.CfnContactFlow
import software.amazon.awscdk.services.connect.CfnContactFlowModule
import software.amazon.awscdk.services.connect.CfnContactFlowModuleProps
import software.amazon.awscdk.services.connect.CfnContactFlowProps
import software.amazon.awscdk.services.connect.CfnEvaluationForm
import software.amazon.awscdk.services.connect.CfnEvaluationFormProps
import software.amazon.awscdk.services.connect.CfnHoursOfOperation
import software.amazon.awscdk.services.connect.CfnHoursOfOperationProps
import software.amazon.awscdk.services.connect.CfnInstance
import software.amazon.awscdk.services.connect.CfnInstanceProps
import software.amazon.awscdk.services.connect.CfnInstanceStorageConfig
import software.amazon.awscdk.services.connect.CfnInstanceStorageConfigProps
import software.amazon.awscdk.services.connect.CfnIntegrationAssociation
import software.amazon.awscdk.services.connect.CfnIntegrationAssociationProps
import software.amazon.awscdk.services.connect.CfnPhoneNumber
import software.amazon.awscdk.services.connect.CfnPhoneNumberProps
import software.amazon.awscdk.services.connect.CfnPrompt
import software.amazon.awscdk.services.connect.CfnPromptProps
import software.amazon.awscdk.services.connect.CfnQuickConnect
import software.amazon.awscdk.services.connect.CfnQuickConnectProps
import software.amazon.awscdk.services.connect.CfnRule
import software.amazon.awscdk.services.connect.CfnRuleProps
import software.amazon.awscdk.services.connect.CfnSecurityKey
import software.amazon.awscdk.services.connect.CfnSecurityKeyProps
import software.amazon.awscdk.services.connect.CfnTaskTemplate
import software.amazon.awscdk.services.connect.CfnTaskTemplateProps
import software.amazon.awscdk.services.connect.CfnUser
import software.amazon.awscdk.services.connect.CfnUserHierarchyGroup
import software.amazon.awscdk.services.connect.CfnUserHierarchyGroupProps
import software.amazon.awscdk.services.connect.CfnUserProps
import software.constructs.Construct
import kotlin.String
import kotlin.Unit

public object connect {
    public inline fun cfnApprovedOrigin(
        scope: Construct,
        id: String,
        block: CfnApprovedOriginDsl.() -> Unit = {},
    ): CfnApprovedOrigin {
        val builder = CfnApprovedOriginDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnApprovedOriginProps(block: CfnApprovedOriginPropsDsl.() -> Unit = {}): CfnApprovedOriginProps {
        val builder = CfnApprovedOriginPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnContactFlow(
        scope: Construct,
        id: String,
        block: CfnContactFlowDsl.() -> Unit = {},
    ): CfnContactFlow {
        val builder = CfnContactFlowDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnContactFlowModule(
        scope: Construct,
        id: String,
        block: CfnContactFlowModuleDsl.() -> Unit = {},
    ): CfnContactFlowModule {
        val builder = CfnContactFlowModuleDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnContactFlowModuleProps(block: CfnContactFlowModulePropsDsl.() -> Unit = {}): CfnContactFlowModuleProps {
        val builder = CfnContactFlowModulePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnContactFlowProps(block: CfnContactFlowPropsDsl.() -> Unit = {}): CfnContactFlowProps {
        val builder = CfnContactFlowPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnEvaluationForm(
        scope: Construct,
        id: String,
        block: CfnEvaluationFormDsl.() -> Unit = {},
    ): CfnEvaluationForm {
        val builder = CfnEvaluationFormDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnEvaluationFormEvaluationFormBaseItemProperty(
        block: CfnEvaluationFormEvaluationFormBaseItemPropertyDsl.() -> Unit =
            {},
    ): CfnEvaluationForm.EvaluationFormBaseItemProperty {
        val builder = CfnEvaluationFormEvaluationFormBaseItemPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnEvaluationFormEvaluationFormItemProperty(
        block: CfnEvaluationFormEvaluationFormItemPropertyDsl.() -> Unit =
            {},
    ): CfnEvaluationForm.EvaluationFormItemProperty {
        val builder = CfnEvaluationFormEvaluationFormItemPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnEvaluationFormEvaluationFormNumericQuestionAutomationProperty(
        block: CfnEvaluationFormEvaluationFormNumericQuestionAutomationPropertyDsl.() -> Unit =
            {},
    ): CfnEvaluationForm.EvaluationFormNumericQuestionAutomationProperty {
        val builder = CfnEvaluationFormEvaluationFormNumericQuestionAutomationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnEvaluationFormEvaluationFormNumericQuestionOptionProperty(
        block: CfnEvaluationFormEvaluationFormNumericQuestionOptionPropertyDsl.() -> Unit =
            {},
    ): CfnEvaluationForm.EvaluationFormNumericQuestionOptionProperty {
        val builder = CfnEvaluationFormEvaluationFormNumericQuestionOptionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnEvaluationFormEvaluationFormNumericQuestionPropertiesProperty(
        block: CfnEvaluationFormEvaluationFormNumericQuestionPropertiesPropertyDsl.() -> Unit =
            {},
    ): CfnEvaluationForm.EvaluationFormNumericQuestionPropertiesProperty {
        val builder = CfnEvaluationFormEvaluationFormNumericQuestionPropertiesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnEvaluationFormEvaluationFormQuestionProperty(
        block: CfnEvaluationFormEvaluationFormQuestionPropertyDsl.() -> Unit =
            {},
    ): CfnEvaluationForm.EvaluationFormQuestionProperty {
        val builder = CfnEvaluationFormEvaluationFormQuestionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnEvaluationFormEvaluationFormQuestionTypePropertiesProperty(
        block: CfnEvaluationFormEvaluationFormQuestionTypePropertiesPropertyDsl.() -> Unit =
            {},
    ): CfnEvaluationForm.EvaluationFormQuestionTypePropertiesProperty {
        val builder = CfnEvaluationFormEvaluationFormQuestionTypePropertiesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnEvaluationFormEvaluationFormSectionProperty(
        block: CfnEvaluationFormEvaluationFormSectionPropertyDsl.() -> Unit =
            {},
    ): CfnEvaluationForm.EvaluationFormSectionProperty {
        val builder = CfnEvaluationFormEvaluationFormSectionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnEvaluationFormEvaluationFormSingleSelectQuestionAutomationOptionProperty(
        block: CfnEvaluationFormEvaluationFormSingleSelectQuestionAutomationOptionPropertyDsl.() -> Unit =
            {},
    ): CfnEvaluationForm.EvaluationFormSingleSelectQuestionAutomationOptionProperty {
        val builder = CfnEvaluationFormEvaluationFormSingleSelectQuestionAutomationOptionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnEvaluationFormEvaluationFormSingleSelectQuestionAutomationProperty(
        block: CfnEvaluationFormEvaluationFormSingleSelectQuestionAutomationPropertyDsl.() -> Unit =
            {},
    ): CfnEvaluationForm.EvaluationFormSingleSelectQuestionAutomationProperty {
        val builder = CfnEvaluationFormEvaluationFormSingleSelectQuestionAutomationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnEvaluationFormEvaluationFormSingleSelectQuestionOptionProperty(
        block: CfnEvaluationFormEvaluationFormSingleSelectQuestionOptionPropertyDsl.() -> Unit =
            {},
    ): CfnEvaluationForm.EvaluationFormSingleSelectQuestionOptionProperty {
        val builder = CfnEvaluationFormEvaluationFormSingleSelectQuestionOptionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnEvaluationFormEvaluationFormSingleSelectQuestionPropertiesProperty(
        block: CfnEvaluationFormEvaluationFormSingleSelectQuestionPropertiesPropertyDsl.() -> Unit =
            {},
    ): CfnEvaluationForm.EvaluationFormSingleSelectQuestionPropertiesProperty {
        val builder = CfnEvaluationFormEvaluationFormSingleSelectQuestionPropertiesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnEvaluationFormNumericQuestionPropertyValueAutomationProperty(
        block: CfnEvaluationFormNumericQuestionPropertyValueAutomationPropertyDsl.() -> Unit =
            {},
    ): CfnEvaluationForm.NumericQuestionPropertyValueAutomationProperty {
        val builder = CfnEvaluationFormNumericQuestionPropertyValueAutomationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnEvaluationFormProps(block: CfnEvaluationFormPropsDsl.() -> Unit = {}): CfnEvaluationFormProps {
        val builder = CfnEvaluationFormPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnEvaluationFormScoringStrategyProperty(
        block: CfnEvaluationFormScoringStrategyPropertyDsl.() -> Unit =
            {},
    ): CfnEvaluationForm.ScoringStrategyProperty {
        val builder = CfnEvaluationFormScoringStrategyPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnEvaluationFormSingleSelectQuestionRuleCategoryAutomationProperty(
        block: CfnEvaluationFormSingleSelectQuestionRuleCategoryAutomationPropertyDsl.() -> Unit =
            {},
    ): CfnEvaluationForm.SingleSelectQuestionRuleCategoryAutomationProperty {
        val builder = CfnEvaluationFormSingleSelectQuestionRuleCategoryAutomationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnHoursOfOperation(
        scope: Construct,
        id: String,
        block: CfnHoursOfOperationDsl.() -> Unit = {},
    ): CfnHoursOfOperation {
        val builder = CfnHoursOfOperationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnHoursOfOperationHoursOfOperationConfigProperty(
        block: CfnHoursOfOperationHoursOfOperationConfigPropertyDsl.() -> Unit =
            {},
    ): CfnHoursOfOperation.HoursOfOperationConfigProperty {
        val builder = CfnHoursOfOperationHoursOfOperationConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnHoursOfOperationHoursOfOperationTimeSliceProperty(
        block: CfnHoursOfOperationHoursOfOperationTimeSlicePropertyDsl.() -> Unit =
            {},
    ): CfnHoursOfOperation.HoursOfOperationTimeSliceProperty {
        val builder = CfnHoursOfOperationHoursOfOperationTimeSlicePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnHoursOfOperationProps(block: CfnHoursOfOperationPropsDsl.() -> Unit = {}): CfnHoursOfOperationProps {
        val builder = CfnHoursOfOperationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnInstance(
        scope: Construct,
        id: String,
        block: CfnInstanceDsl.() -> Unit = {},
    ): CfnInstance {
        val builder = CfnInstanceDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnInstanceAttributesProperty(
        block: CfnInstanceAttributesPropertyDsl.() -> Unit =
            {},
    ): CfnInstance.AttributesProperty {
        val builder = CfnInstanceAttributesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnInstanceProps(block: CfnInstancePropsDsl.() -> Unit = {}): CfnInstanceProps {
        val builder = CfnInstancePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnInstanceStorageConfig(
        scope: Construct,
        id: String,
        block: CfnInstanceStorageConfigDsl.() -> Unit = {},
    ): CfnInstanceStorageConfig {
        val builder = CfnInstanceStorageConfigDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnInstanceStorageConfigEncryptionConfigProperty(
        block: CfnInstanceStorageConfigEncryptionConfigPropertyDsl.() -> Unit =
            {},
    ): CfnInstanceStorageConfig.EncryptionConfigProperty {
        val builder = CfnInstanceStorageConfigEncryptionConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnInstanceStorageConfigKinesisFirehoseConfigProperty(
        block: CfnInstanceStorageConfigKinesisFirehoseConfigPropertyDsl.() -> Unit =
            {},
    ): CfnInstanceStorageConfig.KinesisFirehoseConfigProperty {
        val builder = CfnInstanceStorageConfigKinesisFirehoseConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnInstanceStorageConfigKinesisStreamConfigProperty(
        block: CfnInstanceStorageConfigKinesisStreamConfigPropertyDsl.() -> Unit =
            {},
    ): CfnInstanceStorageConfig.KinesisStreamConfigProperty {
        val builder = CfnInstanceStorageConfigKinesisStreamConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnInstanceStorageConfigKinesisVideoStreamConfigProperty(
        block: CfnInstanceStorageConfigKinesisVideoStreamConfigPropertyDsl.() -> Unit =
            {},
    ): CfnInstanceStorageConfig.KinesisVideoStreamConfigProperty {
        val builder = CfnInstanceStorageConfigKinesisVideoStreamConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnInstanceStorageConfigProps(
        block: CfnInstanceStorageConfigPropsDsl.() -> Unit =
            {},
    ): CfnInstanceStorageConfigProps {
        val builder = CfnInstanceStorageConfigPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnInstanceStorageConfigS3ConfigProperty(
        block: CfnInstanceStorageConfigS3ConfigPropertyDsl.() -> Unit =
            {},
    ): CfnInstanceStorageConfig.S3ConfigProperty {
        val builder = CfnInstanceStorageConfigS3ConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnIntegrationAssociation(
        scope: Construct,
        id: String,
        block: CfnIntegrationAssociationDsl.() -> Unit = {},
    ): CfnIntegrationAssociation {
        val builder = CfnIntegrationAssociationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnIntegrationAssociationProps(block: CfnIntegrationAssociationPropsDsl.() -> Unit = {}): CfnIntegrationAssociationProps {
        val builder = CfnIntegrationAssociationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnPhoneNumber(
        scope: Construct,
        id: String,
        block: CfnPhoneNumberDsl.() -> Unit = {},
    ): CfnPhoneNumber {
        val builder = CfnPhoneNumberDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnPhoneNumberProps(block: CfnPhoneNumberPropsDsl.() -> Unit = {}): CfnPhoneNumberProps {
        val builder = CfnPhoneNumberPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnPrompt(
        scope: Construct,
        id: String,
        block: CfnPromptDsl.() -> Unit = {},
    ): CfnPrompt {
        val builder = CfnPromptDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnPromptProps(block: CfnPromptPropsDsl.() -> Unit = {}): CfnPromptProps {
        val builder = CfnPromptPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnQuickConnect(
        scope: Construct,
        id: String,
        block: CfnQuickConnectDsl.() -> Unit = {},
    ): CfnQuickConnect {
        val builder = CfnQuickConnectDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnQuickConnectPhoneNumberQuickConnectConfigProperty(
        block: CfnQuickConnectPhoneNumberQuickConnectConfigPropertyDsl.() -> Unit =
            {},
    ): CfnQuickConnect.PhoneNumberQuickConnectConfigProperty {
        val builder = CfnQuickConnectPhoneNumberQuickConnectConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnQuickConnectProps(block: CfnQuickConnectPropsDsl.() -> Unit = {}): CfnQuickConnectProps {
        val builder = CfnQuickConnectPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnQuickConnectQueueQuickConnectConfigProperty(
        block: CfnQuickConnectQueueQuickConnectConfigPropertyDsl.() -> Unit =
            {},
    ): CfnQuickConnect.QueueQuickConnectConfigProperty {
        val builder = CfnQuickConnectQueueQuickConnectConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnQuickConnectQuickConnectConfigProperty(
        block: CfnQuickConnectQuickConnectConfigPropertyDsl.() -> Unit =
            {},
    ): CfnQuickConnect.QuickConnectConfigProperty {
        val builder = CfnQuickConnectQuickConnectConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnQuickConnectUserQuickConnectConfigProperty(
        block: CfnQuickConnectUserQuickConnectConfigPropertyDsl.() -> Unit =
            {},
    ): CfnQuickConnect.UserQuickConnectConfigProperty {
        val builder = CfnQuickConnectUserQuickConnectConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnRule(
        scope: Construct,
        id: String,
        block: CfnRuleDsl.() -> Unit = {},
    ): CfnRule {
        val builder = CfnRuleDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnRuleActionsProperty(block: CfnRuleActionsPropertyDsl.() -> Unit = {}): CfnRule.ActionsProperty {
        val builder = CfnRuleActionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnRuleEventBridgeActionProperty(
        block: CfnRuleEventBridgeActionPropertyDsl.() -> Unit =
            {},
    ): CfnRule.EventBridgeActionProperty {
        val builder = CfnRuleEventBridgeActionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnRuleNotificationRecipientTypeProperty(
        block: CfnRuleNotificationRecipientTypePropertyDsl.() -> Unit =
            {},
    ): CfnRule.NotificationRecipientTypeProperty {
        val builder = CfnRuleNotificationRecipientTypePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnRuleProps(block: CfnRulePropsDsl.() -> Unit = {}): CfnRuleProps {
        val builder = CfnRulePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnRuleReferenceProperty(block: CfnRuleReferencePropertyDsl.() -> Unit = {}): CfnRule.ReferenceProperty {
        val builder = CfnRuleReferencePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnRuleRuleTriggerEventSourceProperty(
        block: CfnRuleRuleTriggerEventSourcePropertyDsl.() -> Unit =
            {},
    ): CfnRule.RuleTriggerEventSourceProperty {
        val builder = CfnRuleRuleTriggerEventSourcePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnRuleSendNotificationActionProperty(
        block: CfnRuleSendNotificationActionPropertyDsl.() -> Unit =
            {},
    ): CfnRule.SendNotificationActionProperty {
        val builder = CfnRuleSendNotificationActionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnRuleTaskActionProperty(block: CfnRuleTaskActionPropertyDsl.() -> Unit = {}): CfnRule.TaskActionProperty {
        val builder = CfnRuleTaskActionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnSecurityKey(
        scope: Construct,
        id: String,
        block: CfnSecurityKeyDsl.() -> Unit = {},
    ): CfnSecurityKey {
        val builder = CfnSecurityKeyDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnSecurityKeyProps(block: CfnSecurityKeyPropsDsl.() -> Unit = {}): CfnSecurityKeyProps {
        val builder = CfnSecurityKeyPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTaskTemplate(
        scope: Construct,
        id: String,
        block: CfnTaskTemplateDsl.() -> Unit = {},
    ): CfnTaskTemplate {
        val builder = CfnTaskTemplateDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTaskTemplateConstraintsProperty(
        block: CfnTaskTemplateConstraintsPropertyDsl.() -> Unit =
            {},
    ): CfnTaskTemplate.ConstraintsProperty {
        val builder = CfnTaskTemplateConstraintsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTaskTemplateDefaultFieldValueProperty(
        block: CfnTaskTemplateDefaultFieldValuePropertyDsl.() -> Unit =
            {},
    ): CfnTaskTemplate.DefaultFieldValueProperty {
        val builder = CfnTaskTemplateDefaultFieldValuePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTaskTemplateFieldIdentifierProperty(
        block: CfnTaskTemplateFieldIdentifierPropertyDsl.() -> Unit =
            {},
    ): CfnTaskTemplate.FieldIdentifierProperty {
        val builder = CfnTaskTemplateFieldIdentifierPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTaskTemplateFieldProperty(
        block: CfnTaskTemplateFieldPropertyDsl.() -> Unit =
            {},
    ): CfnTaskTemplate.FieldProperty {
        val builder = CfnTaskTemplateFieldPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTaskTemplateInvisibleFieldInfoProperty(
        block: CfnTaskTemplateInvisibleFieldInfoPropertyDsl.() -> Unit =
            {},
    ): CfnTaskTemplate.InvisibleFieldInfoProperty {
        val builder = CfnTaskTemplateInvisibleFieldInfoPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTaskTemplateProps(block: CfnTaskTemplatePropsDsl.() -> Unit = {}): CfnTaskTemplateProps {
        val builder = CfnTaskTemplatePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTaskTemplateReadOnlyFieldInfoProperty(
        block: CfnTaskTemplateReadOnlyFieldInfoPropertyDsl.() -> Unit =
            {},
    ): CfnTaskTemplate.ReadOnlyFieldInfoProperty {
        val builder = CfnTaskTemplateReadOnlyFieldInfoPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTaskTemplateRequiredFieldInfoProperty(
        block: CfnTaskTemplateRequiredFieldInfoPropertyDsl.() -> Unit =
            {},
    ): CfnTaskTemplate.RequiredFieldInfoProperty {
        val builder = CfnTaskTemplateRequiredFieldInfoPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnUser(
        scope: Construct,
        id: String,
        block: CfnUserDsl.() -> Unit = {},
    ): CfnUser {
        val builder = CfnUserDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnUserHierarchyGroup(
        scope: Construct,
        id: String,
        block: CfnUserHierarchyGroupDsl.() -> Unit = {},
    ): CfnUserHierarchyGroup {
        val builder = CfnUserHierarchyGroupDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnUserHierarchyGroupProps(
        block: CfnUserHierarchyGroupPropsDsl.() -> Unit =
            {},
    ): CfnUserHierarchyGroupProps {
        val builder = CfnUserHierarchyGroupPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnUserProps(block: CfnUserPropsDsl.() -> Unit = {}): CfnUserProps {
        val builder = CfnUserPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnUserUserIdentityInfoProperty(
        block: CfnUserUserIdentityInfoPropertyDsl.() -> Unit =
            {},
    ): CfnUser.UserIdentityInfoProperty {
        val builder = CfnUserUserIdentityInfoPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnUserUserPhoneConfigProperty(
        block: CfnUserUserPhoneConfigPropertyDsl.() -> Unit = {
        },
    ): CfnUser.UserPhoneConfigProperty {
        val builder = CfnUserUserPhoneConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }
}
