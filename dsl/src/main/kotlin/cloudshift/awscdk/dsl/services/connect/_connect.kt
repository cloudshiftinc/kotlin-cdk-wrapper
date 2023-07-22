@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.connect

import kotlin.String
import kotlin.Unit
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

public object connect {
  /**
   * The approved origin for the instance.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.connect.*;
   * CfnApprovedOrigin cfnApprovedOrigin = CfnApprovedOrigin.Builder.create(this,
   * "MyCfnApprovedOrigin")
   * .instanceId("instanceId")
   * .origin("origin")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-approvedorigin.html)
   */
  public inline fun cfnApprovedOrigin(
    scope: Construct,
    id: String,
    block: CfnApprovedOriginDsl.() -> Unit = {},
  ): CfnApprovedOrigin {
    val builder = CfnApprovedOriginDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnApprovedOrigin`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.connect.*;
   * CfnApprovedOriginProps cfnApprovedOriginProps = CfnApprovedOriginProps.builder()
   * .instanceId("instanceId")
   * .origin("origin")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-approvedorigin.html)
   */
  public inline fun cfnApprovedOriginProps(block: CfnApprovedOriginPropsDsl.() -> Unit = {}):
      CfnApprovedOriginProps {
    val builder = CfnApprovedOriginPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Specifies a flow for an Amazon Connect instance.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.connect.*;
   * CfnContactFlow cfnContactFlow = CfnContactFlow.Builder.create(this, "MyCfnContactFlow")
   * .content("content")
   * .instanceArn("instanceArn")
   * .name("name")
   * .type("type")
   * // the properties below are optional
   * .description("description")
   * .state("state")
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-contactflow.html)
   */
  public inline fun cfnContactFlow(
    scope: Construct,
    id: String,
    block: CfnContactFlowDsl.() -> Unit = {},
  ): CfnContactFlow {
    val builder = CfnContactFlowDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Specifies a flow module for an Amazon Connect instance.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.connect.*;
   * CfnContactFlowModule cfnContactFlowModule = CfnContactFlowModule.Builder.create(this,
   * "MyCfnContactFlowModule")
   * .content("content")
   * .instanceArn("instanceArn")
   * .name("name")
   * // the properties below are optional
   * .description("description")
   * .state("state")
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-contactflowmodule.html)
   */
  public inline fun cfnContactFlowModule(
    scope: Construct,
    id: String,
    block: CfnContactFlowModuleDsl.() -> Unit = {},
  ): CfnContactFlowModule {
    val builder = CfnContactFlowModuleDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnContactFlowModule`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.connect.*;
   * CfnContactFlowModuleProps cfnContactFlowModuleProps = CfnContactFlowModuleProps.builder()
   * .content("content")
   * .instanceArn("instanceArn")
   * .name("name")
   * // the properties below are optional
   * .description("description")
   * .state("state")
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-contactflowmodule.html)
   */
  public inline fun cfnContactFlowModuleProps(block: CfnContactFlowModulePropsDsl.() -> Unit = {}):
      CfnContactFlowModuleProps {
    val builder = CfnContactFlowModulePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnContactFlow`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.connect.*;
   * CfnContactFlowProps cfnContactFlowProps = CfnContactFlowProps.builder()
   * .content("content")
   * .instanceArn("instanceArn")
   * .name("name")
   * .type("type")
   * // the properties below are optional
   * .description("description")
   * .state("state")
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-contactflow.html)
   */
  public inline fun cfnContactFlowProps(block: CfnContactFlowPropsDsl.() -> Unit = {}):
      CfnContactFlowProps {
    val builder = CfnContactFlowPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Creates an evaluation form for the specified Amazon Connect instance.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.connect.*;
   * EvaluationFormSectionProperty evaluationFormSectionProperty_;
   * CfnEvaluationForm cfnEvaluationForm = CfnEvaluationForm.Builder.create(this,
   * "MyCfnEvaluationForm")
   * .instanceArn("instanceArn")
   * .items(List.of(EvaluationFormBaseItemProperty.builder()
   * .section(EvaluationFormSectionProperty.builder()
   * .refId("refId")
   * .title("title")
   * // the properties below are optional
   * .instructions("instructions")
   * .items(List.of(EvaluationFormItemProperty.builder()
   * .question(EvaluationFormQuestionProperty.builder()
   * .questionType("questionType")
   * .refId("refId")
   * .title("title")
   * // the properties below are optional
   * .instructions("instructions")
   * .notApplicableEnabled(false)
   * .questionTypeProperties(EvaluationFormQuestionTypePropertiesProperty.builder()
   * .numeric(EvaluationFormNumericQuestionPropertiesProperty.builder()
   * .maxValue(123)
   * .minValue(123)
   * // the properties below are optional
   * .automation(EvaluationFormNumericQuestionAutomationProperty.builder()
   * .propertyValue(NumericQuestionPropertyValueAutomationProperty.builder()
   * .label("label")
   * .build())
   * .build())
   * .options(List.of(EvaluationFormNumericQuestionOptionProperty.builder()
   * .maxValue(123)
   * .minValue(123)
   * // the properties below are optional
   * .automaticFail(false)
   * .score(123)
   * .build()))
   * .build())
   * .singleSelect(EvaluationFormSingleSelectQuestionPropertiesProperty.builder()
   * .options(List.of(EvaluationFormSingleSelectQuestionOptionProperty.builder()
   * .refId("refId")
   * .text("text")
   * // the properties below are optional
   * .automaticFail(false)
   * .score(123)
   * .build()))
   * // the properties below are optional
   * .automation(EvaluationFormSingleSelectQuestionAutomationProperty.builder()
   * .options(List.of(EvaluationFormSingleSelectQuestionAutomationOptionProperty.builder()
   * .ruleCategory(SingleSelectQuestionRuleCategoryAutomationProperty.builder()
   * .category("category")
   * .condition("condition")
   * .optionRefId("optionRefId")
   * .build())
   * .build()))
   * // the properties below are optional
   * .defaultOptionRefId("defaultOptionRefId")
   * .build())
   * .displayAs("displayAs")
   * .build())
   * .build())
   * .weight(123)
   * .build())
   * .section(evaluationFormSectionProperty_)
   * .build()))
   * .weight(123)
   * .build())
   * .build()))
   * .status("status")
   * .title("title")
   * // the properties below are optional
   * .description("description")
   * .scoringStrategy(ScoringStrategyProperty.builder()
   * .mode("mode")
   * .status("status")
   * .build())
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-evaluationform.html)
   */
  public inline fun cfnEvaluationForm(
    scope: Construct,
    id: String,
    block: CfnEvaluationFormDsl.() -> Unit = {},
  ): CfnEvaluationForm {
    val builder = CfnEvaluationFormDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * An item at the root level.
   *
   * All items must be sections.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.connect.*;
   * EvaluationFormSectionProperty evaluationFormSectionProperty_;
   * EvaluationFormBaseItemProperty evaluationFormBaseItemProperty =
   * EvaluationFormBaseItemProperty.builder()
   * .section(EvaluationFormSectionProperty.builder()
   * .refId("refId")
   * .title("title")
   * // the properties below are optional
   * .instructions("instructions")
   * .items(List.of(EvaluationFormItemProperty.builder()
   * .question(EvaluationFormQuestionProperty.builder()
   * .questionType("questionType")
   * .refId("refId")
   * .title("title")
   * // the properties below are optional
   * .instructions("instructions")
   * .notApplicableEnabled(false)
   * .questionTypeProperties(EvaluationFormQuestionTypePropertiesProperty.builder()
   * .numeric(EvaluationFormNumericQuestionPropertiesProperty.builder()
   * .maxValue(123)
   * .minValue(123)
   * // the properties below are optional
   * .automation(EvaluationFormNumericQuestionAutomationProperty.builder()
   * .propertyValue(NumericQuestionPropertyValueAutomationProperty.builder()
   * .label("label")
   * .build())
   * .build())
   * .options(List.of(EvaluationFormNumericQuestionOptionProperty.builder()
   * .maxValue(123)
   * .minValue(123)
   * // the properties below are optional
   * .automaticFail(false)
   * .score(123)
   * .build()))
   * .build())
   * .singleSelect(EvaluationFormSingleSelectQuestionPropertiesProperty.builder()
   * .options(List.of(EvaluationFormSingleSelectQuestionOptionProperty.builder()
   * .refId("refId")
   * .text("text")
   * // the properties below are optional
   * .automaticFail(false)
   * .score(123)
   * .build()))
   * // the properties below are optional
   * .automation(EvaluationFormSingleSelectQuestionAutomationProperty.builder()
   * .options(List.of(EvaluationFormSingleSelectQuestionAutomationOptionProperty.builder()
   * .ruleCategory(SingleSelectQuestionRuleCategoryAutomationProperty.builder()
   * .category("category")
   * .condition("condition")
   * .optionRefId("optionRefId")
   * .build())
   * .build()))
   * // the properties below are optional
   * .defaultOptionRefId("defaultOptionRefId")
   * .build())
   * .displayAs("displayAs")
   * .build())
   * .build())
   * .weight(123)
   * .build())
   * .section(evaluationFormSectionProperty_)
   * .build()))
   * .weight(123)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-evaluationform-evaluationformbaseitem.html)
   */
  public inline
      fun cfnEvaluationFormEvaluationFormBaseItemProperty(block: CfnEvaluationFormEvaluationFormBaseItemPropertyDsl.() -> Unit
      = {}): CfnEvaluationForm.EvaluationFormBaseItemProperty {
    val builder = CfnEvaluationFormEvaluationFormBaseItemPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Items that are part of the evaluation form.
   *
   * The total number of sections and questions must not exceed 100 each. Questions must be
   * contained in a section.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.connect.*;
   * EvaluationFormItemProperty evaluationFormItemProperty_;
   * EvaluationFormItemProperty evaluationFormItemProperty = EvaluationFormItemProperty.builder()
   * .question(EvaluationFormQuestionProperty.builder()
   * .questionType("questionType")
   * .refId("refId")
   * .title("title")
   * // the properties below are optional
   * .instructions("instructions")
   * .notApplicableEnabled(false)
   * .questionTypeProperties(EvaluationFormQuestionTypePropertiesProperty.builder()
   * .numeric(EvaluationFormNumericQuestionPropertiesProperty.builder()
   * .maxValue(123)
   * .minValue(123)
   * // the properties below are optional
   * .automation(EvaluationFormNumericQuestionAutomationProperty.builder()
   * .propertyValue(NumericQuestionPropertyValueAutomationProperty.builder()
   * .label("label")
   * .build())
   * .build())
   * .options(List.of(EvaluationFormNumericQuestionOptionProperty.builder()
   * .maxValue(123)
   * .minValue(123)
   * // the properties below are optional
   * .automaticFail(false)
   * .score(123)
   * .build()))
   * .build())
   * .singleSelect(EvaluationFormSingleSelectQuestionPropertiesProperty.builder()
   * .options(List.of(EvaluationFormSingleSelectQuestionOptionProperty.builder()
   * .refId("refId")
   * .text("text")
   * // the properties below are optional
   * .automaticFail(false)
   * .score(123)
   * .build()))
   * // the properties below are optional
   * .automation(EvaluationFormSingleSelectQuestionAutomationProperty.builder()
   * .options(List.of(EvaluationFormSingleSelectQuestionAutomationOptionProperty.builder()
   * .ruleCategory(SingleSelectQuestionRuleCategoryAutomationProperty.builder()
   * .category("category")
   * .condition("condition")
   * .optionRefId("optionRefId")
   * .build())
   * .build()))
   * // the properties below are optional
   * .defaultOptionRefId("defaultOptionRefId")
   * .build())
   * .displayAs("displayAs")
   * .build())
   * .build())
   * .weight(123)
   * .build())
   * .section(EvaluationFormSectionProperty.builder()
   * .refId("refId")
   * .title("title")
   * // the properties below are optional
   * .instructions("instructions")
   * .items(List.of(evaluationFormItemProperty_))
   * .weight(123)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-evaluationform-evaluationformitem.html)
   */
  public inline
      fun cfnEvaluationFormEvaluationFormItemProperty(block: CfnEvaluationFormEvaluationFormItemPropertyDsl.() -> Unit
      = {}): CfnEvaluationForm.EvaluationFormItemProperty {
    val builder = CfnEvaluationFormEvaluationFormItemPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Information about the automation configuration in numeric questions.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.connect.*;
   * EvaluationFormNumericQuestionAutomationProperty evaluationFormNumericQuestionAutomationProperty
   * = EvaluationFormNumericQuestionAutomationProperty.builder()
   * .propertyValue(NumericQuestionPropertyValueAutomationProperty.builder()
   * .label("label")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-evaluationform-evaluationformnumericquestionautomation.html)
   */
  public inline
      fun cfnEvaluationFormEvaluationFormNumericQuestionAutomationProperty(block: CfnEvaluationFormEvaluationFormNumericQuestionAutomationPropertyDsl.() -> Unit
      = {}): CfnEvaluationForm.EvaluationFormNumericQuestionAutomationProperty {
    val builder = CfnEvaluationFormEvaluationFormNumericQuestionAutomationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Information about the option range used for scoring in numeric questions.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.connect.*;
   * EvaluationFormNumericQuestionOptionProperty evaluationFormNumericQuestionOptionProperty =
   * EvaluationFormNumericQuestionOptionProperty.builder()
   * .maxValue(123)
   * .minValue(123)
   * // the properties below are optional
   * .automaticFail(false)
   * .score(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-evaluationform-evaluationformnumericquestionoption.html)
   */
  public inline
      fun cfnEvaluationFormEvaluationFormNumericQuestionOptionProperty(block: CfnEvaluationFormEvaluationFormNumericQuestionOptionPropertyDsl.() -> Unit
      = {}): CfnEvaluationForm.EvaluationFormNumericQuestionOptionProperty {
    val builder = CfnEvaluationFormEvaluationFormNumericQuestionOptionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Information about properties for a numeric question in an evaluation form.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.connect.*;
   * EvaluationFormNumericQuestionPropertiesProperty evaluationFormNumericQuestionPropertiesProperty
   * = EvaluationFormNumericQuestionPropertiesProperty.builder()
   * .maxValue(123)
   * .minValue(123)
   * // the properties below are optional
   * .automation(EvaluationFormNumericQuestionAutomationProperty.builder()
   * .propertyValue(NumericQuestionPropertyValueAutomationProperty.builder()
   * .label("label")
   * .build())
   * .build())
   * .options(List.of(EvaluationFormNumericQuestionOptionProperty.builder()
   * .maxValue(123)
   * .minValue(123)
   * // the properties below are optional
   * .automaticFail(false)
   * .score(123)
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-evaluationform-evaluationformnumericquestionproperties.html)
   */
  public inline
      fun cfnEvaluationFormEvaluationFormNumericQuestionPropertiesProperty(block: CfnEvaluationFormEvaluationFormNumericQuestionPropertiesPropertyDsl.() -> Unit
      = {}): CfnEvaluationForm.EvaluationFormNumericQuestionPropertiesProperty {
    val builder = CfnEvaluationFormEvaluationFormNumericQuestionPropertiesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Information about a question from an evaluation form.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.connect.*;
   * EvaluationFormQuestionProperty evaluationFormQuestionProperty =
   * EvaluationFormQuestionProperty.builder()
   * .questionType("questionType")
   * .refId("refId")
   * .title("title")
   * // the properties below are optional
   * .instructions("instructions")
   * .notApplicableEnabled(false)
   * .questionTypeProperties(EvaluationFormQuestionTypePropertiesProperty.builder()
   * .numeric(EvaluationFormNumericQuestionPropertiesProperty.builder()
   * .maxValue(123)
   * .minValue(123)
   * // the properties below are optional
   * .automation(EvaluationFormNumericQuestionAutomationProperty.builder()
   * .propertyValue(NumericQuestionPropertyValueAutomationProperty.builder()
   * .label("label")
   * .build())
   * .build())
   * .options(List.of(EvaluationFormNumericQuestionOptionProperty.builder()
   * .maxValue(123)
   * .minValue(123)
   * // the properties below are optional
   * .automaticFail(false)
   * .score(123)
   * .build()))
   * .build())
   * .singleSelect(EvaluationFormSingleSelectQuestionPropertiesProperty.builder()
   * .options(List.of(EvaluationFormSingleSelectQuestionOptionProperty.builder()
   * .refId("refId")
   * .text("text")
   * // the properties below are optional
   * .automaticFail(false)
   * .score(123)
   * .build()))
   * // the properties below are optional
   * .automation(EvaluationFormSingleSelectQuestionAutomationProperty.builder()
   * .options(List.of(EvaluationFormSingleSelectQuestionAutomationOptionProperty.builder()
   * .ruleCategory(SingleSelectQuestionRuleCategoryAutomationProperty.builder()
   * .category("category")
   * .condition("condition")
   * .optionRefId("optionRefId")
   * .build())
   * .build()))
   * // the properties below are optional
   * .defaultOptionRefId("defaultOptionRefId")
   * .build())
   * .displayAs("displayAs")
   * .build())
   * .build())
   * .weight(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-evaluationform-evaluationformquestion.html)
   */
  public inline
      fun cfnEvaluationFormEvaluationFormQuestionProperty(block: CfnEvaluationFormEvaluationFormQuestionPropertyDsl.() -> Unit
      = {}): CfnEvaluationForm.EvaluationFormQuestionProperty {
    val builder = CfnEvaluationFormEvaluationFormQuestionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Information about properties for a question in an evaluation form.
   *
   * The question type properties must be either for a numeric question or a single select question.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.connect.*;
   * EvaluationFormQuestionTypePropertiesProperty evaluationFormQuestionTypePropertiesProperty =
   * EvaluationFormQuestionTypePropertiesProperty.builder()
   * .numeric(EvaluationFormNumericQuestionPropertiesProperty.builder()
   * .maxValue(123)
   * .minValue(123)
   * // the properties below are optional
   * .automation(EvaluationFormNumericQuestionAutomationProperty.builder()
   * .propertyValue(NumericQuestionPropertyValueAutomationProperty.builder()
   * .label("label")
   * .build())
   * .build())
   * .options(List.of(EvaluationFormNumericQuestionOptionProperty.builder()
   * .maxValue(123)
   * .minValue(123)
   * // the properties below are optional
   * .automaticFail(false)
   * .score(123)
   * .build()))
   * .build())
   * .singleSelect(EvaluationFormSingleSelectQuestionPropertiesProperty.builder()
   * .options(List.of(EvaluationFormSingleSelectQuestionOptionProperty.builder()
   * .refId("refId")
   * .text("text")
   * // the properties below are optional
   * .automaticFail(false)
   * .score(123)
   * .build()))
   * // the properties below are optional
   * .automation(EvaluationFormSingleSelectQuestionAutomationProperty.builder()
   * .options(List.of(EvaluationFormSingleSelectQuestionAutomationOptionProperty.builder()
   * .ruleCategory(SingleSelectQuestionRuleCategoryAutomationProperty.builder()
   * .category("category")
   * .condition("condition")
   * .optionRefId("optionRefId")
   * .build())
   * .build()))
   * // the properties below are optional
   * .defaultOptionRefId("defaultOptionRefId")
   * .build())
   * .displayAs("displayAs")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-evaluationform-evaluationformquestiontypeproperties.html)
   */
  public inline
      fun cfnEvaluationFormEvaluationFormQuestionTypePropertiesProperty(block: CfnEvaluationFormEvaluationFormQuestionTypePropertiesPropertyDsl.() -> Unit
      = {}): CfnEvaluationForm.EvaluationFormQuestionTypePropertiesProperty {
    val builder = CfnEvaluationFormEvaluationFormQuestionTypePropertiesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Information about a section from an evaluation form.
   *
   * A section can contain sections and/or questions. Evaluation forms can only contain sections and
   * subsections (two level nesting).
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.connect.*;
   * EvaluationFormSectionProperty evaluationFormSectionProperty_;
   * EvaluationFormSectionProperty evaluationFormSectionProperty =
   * EvaluationFormSectionProperty.builder()
   * .refId("refId")
   * .title("title")
   * // the properties below are optional
   * .instructions("instructions")
   * .items(List.of(EvaluationFormItemProperty.builder()
   * .question(EvaluationFormQuestionProperty.builder()
   * .questionType("questionType")
   * .refId("refId")
   * .title("title")
   * // the properties below are optional
   * .instructions("instructions")
   * .notApplicableEnabled(false)
   * .questionTypeProperties(EvaluationFormQuestionTypePropertiesProperty.builder()
   * .numeric(EvaluationFormNumericQuestionPropertiesProperty.builder()
   * .maxValue(123)
   * .minValue(123)
   * // the properties below are optional
   * .automation(EvaluationFormNumericQuestionAutomationProperty.builder()
   * .propertyValue(NumericQuestionPropertyValueAutomationProperty.builder()
   * .label("label")
   * .build())
   * .build())
   * .options(List.of(EvaluationFormNumericQuestionOptionProperty.builder()
   * .maxValue(123)
   * .minValue(123)
   * // the properties below are optional
   * .automaticFail(false)
   * .score(123)
   * .build()))
   * .build())
   * .singleSelect(EvaluationFormSingleSelectQuestionPropertiesProperty.builder()
   * .options(List.of(EvaluationFormSingleSelectQuestionOptionProperty.builder()
   * .refId("refId")
   * .text("text")
   * // the properties below are optional
   * .automaticFail(false)
   * .score(123)
   * .build()))
   * // the properties below are optional
   * .automation(EvaluationFormSingleSelectQuestionAutomationProperty.builder()
   * .options(List.of(EvaluationFormSingleSelectQuestionAutomationOptionProperty.builder()
   * .ruleCategory(SingleSelectQuestionRuleCategoryAutomationProperty.builder()
   * .category("category")
   * .condition("condition")
   * .optionRefId("optionRefId")
   * .build())
   * .build()))
   * // the properties below are optional
   * .defaultOptionRefId("defaultOptionRefId")
   * .build())
   * .displayAs("displayAs")
   * .build())
   * .build())
   * .weight(123)
   * .build())
   * .section(evaluationFormSectionProperty_)
   * .build()))
   * .weight(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-evaluationform-evaluationformsection.html)
   */
  public inline
      fun cfnEvaluationFormEvaluationFormSectionProperty(block: CfnEvaluationFormEvaluationFormSectionPropertyDsl.() -> Unit
      = {}): CfnEvaluationForm.EvaluationFormSectionProperty {
    val builder = CfnEvaluationFormEvaluationFormSectionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The automation options of the single select question.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.connect.*;
   * EvaluationFormSingleSelectQuestionAutomationOptionProperty
   * evaluationFormSingleSelectQuestionAutomationOptionProperty =
   * EvaluationFormSingleSelectQuestionAutomationOptionProperty.builder()
   * .ruleCategory(SingleSelectQuestionRuleCategoryAutomationProperty.builder()
   * .category("category")
   * .condition("condition")
   * .optionRefId("optionRefId")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-evaluationform-evaluationformsingleselectquestionautomationoption.html)
   */
  public inline
      fun cfnEvaluationFormEvaluationFormSingleSelectQuestionAutomationOptionProperty(block: CfnEvaluationFormEvaluationFormSingleSelectQuestionAutomationOptionPropertyDsl.() -> Unit
      = {}): CfnEvaluationForm.EvaluationFormSingleSelectQuestionAutomationOptionProperty {
    val builder = CfnEvaluationFormEvaluationFormSingleSelectQuestionAutomationOptionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Information about the automation configuration in single select questions.
   *
   * Automation options are evaluated in order, and the first matched option is applied. If no
   * automation option matches, and there is a default option, then the default option is applied.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.connect.*;
   * EvaluationFormSingleSelectQuestionAutomationProperty
   * evaluationFormSingleSelectQuestionAutomationProperty =
   * EvaluationFormSingleSelectQuestionAutomationProperty.builder()
   * .options(List.of(EvaluationFormSingleSelectQuestionAutomationOptionProperty.builder()
   * .ruleCategory(SingleSelectQuestionRuleCategoryAutomationProperty.builder()
   * .category("category")
   * .condition("condition")
   * .optionRefId("optionRefId")
   * .build())
   * .build()))
   * // the properties below are optional
   * .defaultOptionRefId("defaultOptionRefId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-evaluationform-evaluationformsingleselectquestionautomation.html)
   */
  public inline
      fun cfnEvaluationFormEvaluationFormSingleSelectQuestionAutomationProperty(block: CfnEvaluationFormEvaluationFormSingleSelectQuestionAutomationPropertyDsl.() -> Unit
      = {}): CfnEvaluationForm.EvaluationFormSingleSelectQuestionAutomationProperty {
    val builder = CfnEvaluationFormEvaluationFormSingleSelectQuestionAutomationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Information about the automation configuration in single select questions.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.connect.*;
   * EvaluationFormSingleSelectQuestionOptionProperty
   * evaluationFormSingleSelectQuestionOptionProperty =
   * EvaluationFormSingleSelectQuestionOptionProperty.builder()
   * .refId("refId")
   * .text("text")
   * // the properties below are optional
   * .automaticFail(false)
   * .score(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-evaluationform-evaluationformsingleselectquestionoption.html)
   */
  public inline
      fun cfnEvaluationFormEvaluationFormSingleSelectQuestionOptionProperty(block: CfnEvaluationFormEvaluationFormSingleSelectQuestionOptionPropertyDsl.() -> Unit
      = {}): CfnEvaluationForm.EvaluationFormSingleSelectQuestionOptionProperty {
    val builder = CfnEvaluationFormEvaluationFormSingleSelectQuestionOptionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Information about the options in single select questions.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.connect.*;
   * EvaluationFormSingleSelectQuestionPropertiesProperty
   * evaluationFormSingleSelectQuestionPropertiesProperty =
   * EvaluationFormSingleSelectQuestionPropertiesProperty.builder()
   * .options(List.of(EvaluationFormSingleSelectQuestionOptionProperty.builder()
   * .refId("refId")
   * .text("text")
   * // the properties below are optional
   * .automaticFail(false)
   * .score(123)
   * .build()))
   * // the properties below are optional
   * .automation(EvaluationFormSingleSelectQuestionAutomationProperty.builder()
   * .options(List.of(EvaluationFormSingleSelectQuestionAutomationOptionProperty.builder()
   * .ruleCategory(SingleSelectQuestionRuleCategoryAutomationProperty.builder()
   * .category("category")
   * .condition("condition")
   * .optionRefId("optionRefId")
   * .build())
   * .build()))
   * // the properties below are optional
   * .defaultOptionRefId("defaultOptionRefId")
   * .build())
   * .displayAs("displayAs")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-evaluationform-evaluationformsingleselectquestionproperties.html)
   */
  public inline
      fun cfnEvaluationFormEvaluationFormSingleSelectQuestionPropertiesProperty(block: CfnEvaluationFormEvaluationFormSingleSelectQuestionPropertiesPropertyDsl.() -> Unit
      = {}): CfnEvaluationForm.EvaluationFormSingleSelectQuestionPropertiesProperty {
    val builder = CfnEvaluationFormEvaluationFormSingleSelectQuestionPropertiesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Information about the property value used in automation of a numeric questions.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.connect.*;
   * NumericQuestionPropertyValueAutomationProperty numericQuestionPropertyValueAutomationProperty =
   * NumericQuestionPropertyValueAutomationProperty.builder()
   * .label("label")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-evaluationform-numericquestionpropertyvalueautomation.html)
   */
  public inline
      fun cfnEvaluationFormNumericQuestionPropertyValueAutomationProperty(block: CfnEvaluationFormNumericQuestionPropertyValueAutomationPropertyDsl.() -> Unit
      = {}): CfnEvaluationForm.NumericQuestionPropertyValueAutomationProperty {
    val builder = CfnEvaluationFormNumericQuestionPropertyValueAutomationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnEvaluationForm`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.connect.*;
   * EvaluationFormSectionProperty evaluationFormSectionProperty_;
   * CfnEvaluationFormProps cfnEvaluationFormProps = CfnEvaluationFormProps.builder()
   * .instanceArn("instanceArn")
   * .items(List.of(EvaluationFormBaseItemProperty.builder()
   * .section(EvaluationFormSectionProperty.builder()
   * .refId("refId")
   * .title("title")
   * // the properties below are optional
   * .instructions("instructions")
   * .items(List.of(EvaluationFormItemProperty.builder()
   * .question(EvaluationFormQuestionProperty.builder()
   * .questionType("questionType")
   * .refId("refId")
   * .title("title")
   * // the properties below are optional
   * .instructions("instructions")
   * .notApplicableEnabled(false)
   * .questionTypeProperties(EvaluationFormQuestionTypePropertiesProperty.builder()
   * .numeric(EvaluationFormNumericQuestionPropertiesProperty.builder()
   * .maxValue(123)
   * .minValue(123)
   * // the properties below are optional
   * .automation(EvaluationFormNumericQuestionAutomationProperty.builder()
   * .propertyValue(NumericQuestionPropertyValueAutomationProperty.builder()
   * .label("label")
   * .build())
   * .build())
   * .options(List.of(EvaluationFormNumericQuestionOptionProperty.builder()
   * .maxValue(123)
   * .minValue(123)
   * // the properties below are optional
   * .automaticFail(false)
   * .score(123)
   * .build()))
   * .build())
   * .singleSelect(EvaluationFormSingleSelectQuestionPropertiesProperty.builder()
   * .options(List.of(EvaluationFormSingleSelectQuestionOptionProperty.builder()
   * .refId("refId")
   * .text("text")
   * // the properties below are optional
   * .automaticFail(false)
   * .score(123)
   * .build()))
   * // the properties below are optional
   * .automation(EvaluationFormSingleSelectQuestionAutomationProperty.builder()
   * .options(List.of(EvaluationFormSingleSelectQuestionAutomationOptionProperty.builder()
   * .ruleCategory(SingleSelectQuestionRuleCategoryAutomationProperty.builder()
   * .category("category")
   * .condition("condition")
   * .optionRefId("optionRefId")
   * .build())
   * .build()))
   * // the properties below are optional
   * .defaultOptionRefId("defaultOptionRefId")
   * .build())
   * .displayAs("displayAs")
   * .build())
   * .build())
   * .weight(123)
   * .build())
   * .section(evaluationFormSectionProperty_)
   * .build()))
   * .weight(123)
   * .build())
   * .build()))
   * .status("status")
   * .title("title")
   * // the properties below are optional
   * .description("description")
   * .scoringStrategy(ScoringStrategyProperty.builder()
   * .mode("mode")
   * .status("status")
   * .build())
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-evaluationform.html)
   */
  public inline fun cfnEvaluationFormProps(block: CfnEvaluationFormPropsDsl.() -> Unit = {}):
      CfnEvaluationFormProps {
    val builder = CfnEvaluationFormPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * A scoring strategy of the evaluation form.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.connect.*;
   * ScoringStrategyProperty scoringStrategyProperty = ScoringStrategyProperty.builder()
   * .mode("mode")
   * .status("status")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-evaluationform-scoringstrategy.html)
   */
  public inline
      fun cfnEvaluationFormScoringStrategyProperty(block: CfnEvaluationFormScoringStrategyPropertyDsl.() -> Unit
      = {}): CfnEvaluationForm.ScoringStrategyProperty {
    val builder = CfnEvaluationFormScoringStrategyPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Information about the automation option based on a rule category for a single select question.
   *
   * *Length Constraints* : Minimum length of 1. Maximum length of 50.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.connect.*;
   * SingleSelectQuestionRuleCategoryAutomationProperty
   * singleSelectQuestionRuleCategoryAutomationProperty =
   * SingleSelectQuestionRuleCategoryAutomationProperty.builder()
   * .category("category")
   * .condition("condition")
   * .optionRefId("optionRefId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-evaluationform-singleselectquestionrulecategoryautomation.html)
   */
  public inline
      fun cfnEvaluationFormSingleSelectQuestionRuleCategoryAutomationProperty(block: CfnEvaluationFormSingleSelectQuestionRuleCategoryAutomationPropertyDsl.() -> Unit
      = {}): CfnEvaluationForm.SingleSelectQuestionRuleCategoryAutomationProperty {
    val builder = CfnEvaluationFormSingleSelectQuestionRuleCategoryAutomationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Specifies hours of operation.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.connect.*;
   * CfnHoursOfOperation cfnHoursOfOperation = CfnHoursOfOperation.Builder.create(this,
   * "MyCfnHoursOfOperation")
   * .config(List.of(HoursOfOperationConfigProperty.builder()
   * .day("day")
   * .endTime(HoursOfOperationTimeSliceProperty.builder()
   * .hours(123)
   * .minutes(123)
   * .build())
   * .startTime(HoursOfOperationTimeSliceProperty.builder()
   * .hours(123)
   * .minutes(123)
   * .build())
   * .build()))
   * .instanceArn("instanceArn")
   * .name("name")
   * .timeZone("timeZone")
   * // the properties below are optional
   * .description("description")
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-hoursofoperation.html)
   */
  public inline fun cfnHoursOfOperation(
    scope: Construct,
    id: String,
    block: CfnHoursOfOperationDsl.() -> Unit = {},
  ): CfnHoursOfOperation {
    val builder = CfnHoursOfOperationDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Contains information about the hours of operation.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.connect.*;
   * HoursOfOperationConfigProperty hoursOfOperationConfigProperty =
   * HoursOfOperationConfigProperty.builder()
   * .day("day")
   * .endTime(HoursOfOperationTimeSliceProperty.builder()
   * .hours(123)
   * .minutes(123)
   * .build())
   * .startTime(HoursOfOperationTimeSliceProperty.builder()
   * .hours(123)
   * .minutes(123)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-hoursofoperation-hoursofoperationconfig.html)
   */
  public inline
      fun cfnHoursOfOperationHoursOfOperationConfigProperty(block: CfnHoursOfOperationHoursOfOperationConfigPropertyDsl.() -> Unit
      = {}): CfnHoursOfOperation.HoursOfOperationConfigProperty {
    val builder = CfnHoursOfOperationHoursOfOperationConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The start time or end time for an hours of operation.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.connect.*;
   * HoursOfOperationTimeSliceProperty hoursOfOperationTimeSliceProperty =
   * HoursOfOperationTimeSliceProperty.builder()
   * .hours(123)
   * .minutes(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-hoursofoperation-hoursofoperationtimeslice.html)
   */
  public inline
      fun cfnHoursOfOperationHoursOfOperationTimeSliceProperty(block: CfnHoursOfOperationHoursOfOperationTimeSlicePropertyDsl.() -> Unit
      = {}): CfnHoursOfOperation.HoursOfOperationTimeSliceProperty {
    val builder = CfnHoursOfOperationHoursOfOperationTimeSlicePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnHoursOfOperation`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.connect.*;
   * CfnHoursOfOperationProps cfnHoursOfOperationProps = CfnHoursOfOperationProps.builder()
   * .config(List.of(HoursOfOperationConfigProperty.builder()
   * .day("day")
   * .endTime(HoursOfOperationTimeSliceProperty.builder()
   * .hours(123)
   * .minutes(123)
   * .build())
   * .startTime(HoursOfOperationTimeSliceProperty.builder()
   * .hours(123)
   * .minutes(123)
   * .build())
   * .build()))
   * .instanceArn("instanceArn")
   * .name("name")
   * .timeZone("timeZone")
   * // the properties below are optional
   * .description("description")
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-hoursofoperation.html)
   */
  public inline fun cfnHoursOfOperationProps(block: CfnHoursOfOperationPropsDsl.() -> Unit = {}):
      CfnHoursOfOperationProps {
    val builder = CfnHoursOfOperationPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * *This is a preview release for Amazon Connect . It is subject to change.*.
   *
   * Initiates an Amazon Connect instance with all the supported channels enabled. It does not
   * attach any storage, such as Amazon Simple Storage Service (Amazon S3) or Amazon Kinesis.
   *
   * Amazon Connect enforces a limit on the total number of instances that you can create or delete
   * in 30 days. If you exceed this limit, you will get an error message indicating there has been an
   * excessive number of attempts at creating or deleting instances. You must wait 30 days before you
   * can restart creating and deleting instances in your account.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.connect.*;
   * CfnInstance cfnInstance = CfnInstance.Builder.create(this, "MyCfnInstance")
   * .attributes(AttributesProperty.builder()
   * .inboundCalls(false)
   * .outboundCalls(false)
   * // the properties below are optional
   * .autoResolveBestVoices(false)
   * .contactflowLogs(false)
   * .contactLens(false)
   * .earlyMedia(false)
   * .useCustomTtsVoices(false)
   * .build())
   * .identityManagementType("identityManagementType")
   * // the properties below are optional
   * .directoryId("directoryId")
   * .instanceAlias("instanceAlias")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-instance.html)
   */
  public inline fun cfnInstance(
    scope: Construct,
    id: String,
    block: CfnInstanceDsl.() -> Unit = {},
  ): CfnInstance {
    val builder = CfnInstanceDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * *This is a preview release for Amazon Connect .
   *
   * It is subject to change.*
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.connect.*;
   * AttributesProperty attributesProperty = AttributesProperty.builder()
   * .inboundCalls(false)
   * .outboundCalls(false)
   * // the properties below are optional
   * .autoResolveBestVoices(false)
   * .contactflowLogs(false)
   * .contactLens(false)
   * .earlyMedia(false)
   * .useCustomTtsVoices(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-instance-attributes.html)
   */
  public inline fun cfnInstanceAttributesProperty(block: CfnInstanceAttributesPropertyDsl.() -> Unit
      = {}): CfnInstance.AttributesProperty {
    val builder = CfnInstanceAttributesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnInstance`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.connect.*;
   * CfnInstanceProps cfnInstanceProps = CfnInstanceProps.builder()
   * .attributes(AttributesProperty.builder()
   * .inboundCalls(false)
   * .outboundCalls(false)
   * // the properties below are optional
   * .autoResolveBestVoices(false)
   * .contactflowLogs(false)
   * .contactLens(false)
   * .earlyMedia(false)
   * .useCustomTtsVoices(false)
   * .build())
   * .identityManagementType("identityManagementType")
   * // the properties below are optional
   * .directoryId("directoryId")
   * .instanceAlias("instanceAlias")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-instance.html)
   */
  public inline fun cfnInstanceProps(block: CfnInstancePropsDsl.() -> Unit = {}): CfnInstanceProps {
    val builder = CfnInstancePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The storage configuration for the instance.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.connect.*;
   * CfnInstanceStorageConfig cfnInstanceStorageConfig =
   * CfnInstanceStorageConfig.Builder.create(this, "MyCfnInstanceStorageConfig")
   * .instanceArn("instanceArn")
   * .resourceType("resourceType")
   * .storageType("storageType")
   * // the properties below are optional
   * .kinesisFirehoseConfig(KinesisFirehoseConfigProperty.builder()
   * .firehoseArn("firehoseArn")
   * .build())
   * .kinesisStreamConfig(KinesisStreamConfigProperty.builder()
   * .streamArn("streamArn")
   * .build())
   * .kinesisVideoStreamConfig(KinesisVideoStreamConfigProperty.builder()
   * .prefix("prefix")
   * .retentionPeriodHours(123)
   * // the properties below are optional
   * .encryptionConfig(EncryptionConfigProperty.builder()
   * .encryptionType("encryptionType")
   * .keyId("keyId")
   * .build())
   * .build())
   * .s3Config(S3ConfigProperty.builder()
   * .bucketName("bucketName")
   * .bucketPrefix("bucketPrefix")
   * // the properties below are optional
   * .encryptionConfig(EncryptionConfigProperty.builder()
   * .encryptionType("encryptionType")
   * .keyId("keyId")
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-instancestorageconfig.html)
   */
  public inline fun cfnInstanceStorageConfig(
    scope: Construct,
    id: String,
    block: CfnInstanceStorageConfigDsl.() -> Unit = {},
  ): CfnInstanceStorageConfig {
    val builder = CfnInstanceStorageConfigDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * The encryption configuration.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.connect.*;
   * EncryptionConfigProperty encryptionConfigProperty = EncryptionConfigProperty.builder()
   * .encryptionType("encryptionType")
   * .keyId("keyId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-instancestorageconfig-encryptionconfig.html)
   */
  public inline
      fun cfnInstanceStorageConfigEncryptionConfigProperty(block: CfnInstanceStorageConfigEncryptionConfigPropertyDsl.() -> Unit
      = {}): CfnInstanceStorageConfig.EncryptionConfigProperty {
    val builder = CfnInstanceStorageConfigEncryptionConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Configuration information of a Kinesis Data Firehose delivery stream.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.connect.*;
   * KinesisFirehoseConfigProperty kinesisFirehoseConfigProperty =
   * KinesisFirehoseConfigProperty.builder()
   * .firehoseArn("firehoseArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-instancestorageconfig-kinesisfirehoseconfig.html)
   */
  public inline
      fun cfnInstanceStorageConfigKinesisFirehoseConfigProperty(block: CfnInstanceStorageConfigKinesisFirehoseConfigPropertyDsl.() -> Unit
      = {}): CfnInstanceStorageConfig.KinesisFirehoseConfigProperty {
    val builder = CfnInstanceStorageConfigKinesisFirehoseConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Configuration information of a Kinesis data stream.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.connect.*;
   * KinesisStreamConfigProperty kinesisStreamConfigProperty = KinesisStreamConfigProperty.builder()
   * .streamArn("streamArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-instancestorageconfig-kinesisstreamconfig.html)
   */
  public inline
      fun cfnInstanceStorageConfigKinesisStreamConfigProperty(block: CfnInstanceStorageConfigKinesisStreamConfigPropertyDsl.() -> Unit
      = {}): CfnInstanceStorageConfig.KinesisStreamConfigProperty {
    val builder = CfnInstanceStorageConfigKinesisStreamConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Configuration information of a Kinesis video stream.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.connect.*;
   * KinesisVideoStreamConfigProperty kinesisVideoStreamConfigProperty =
   * KinesisVideoStreamConfigProperty.builder()
   * .prefix("prefix")
   * .retentionPeriodHours(123)
   * // the properties below are optional
   * .encryptionConfig(EncryptionConfigProperty.builder()
   * .encryptionType("encryptionType")
   * .keyId("keyId")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-instancestorageconfig-kinesisvideostreamconfig.html)
   */
  public inline
      fun cfnInstanceStorageConfigKinesisVideoStreamConfigProperty(block: CfnInstanceStorageConfigKinesisVideoStreamConfigPropertyDsl.() -> Unit
      = {}): CfnInstanceStorageConfig.KinesisVideoStreamConfigProperty {
    val builder = CfnInstanceStorageConfigKinesisVideoStreamConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnInstanceStorageConfig`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.connect.*;
   * CfnInstanceStorageConfigProps cfnInstanceStorageConfigProps =
   * CfnInstanceStorageConfigProps.builder()
   * .instanceArn("instanceArn")
   * .resourceType("resourceType")
   * .storageType("storageType")
   * // the properties below are optional
   * .kinesisFirehoseConfig(KinesisFirehoseConfigProperty.builder()
   * .firehoseArn("firehoseArn")
   * .build())
   * .kinesisStreamConfig(KinesisStreamConfigProperty.builder()
   * .streamArn("streamArn")
   * .build())
   * .kinesisVideoStreamConfig(KinesisVideoStreamConfigProperty.builder()
   * .prefix("prefix")
   * .retentionPeriodHours(123)
   * // the properties below are optional
   * .encryptionConfig(EncryptionConfigProperty.builder()
   * .encryptionType("encryptionType")
   * .keyId("keyId")
   * .build())
   * .build())
   * .s3Config(S3ConfigProperty.builder()
   * .bucketName("bucketName")
   * .bucketPrefix("bucketPrefix")
   * // the properties below are optional
   * .encryptionConfig(EncryptionConfigProperty.builder()
   * .encryptionType("encryptionType")
   * .keyId("keyId")
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-instancestorageconfig.html)
   */
  public inline fun cfnInstanceStorageConfigProps(block: CfnInstanceStorageConfigPropsDsl.() -> Unit
      = {}): CfnInstanceStorageConfigProps {
    val builder = CfnInstanceStorageConfigPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Information about the Amazon Simple Storage Service (Amazon S3) storage type.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.connect.*;
   * S3ConfigProperty s3ConfigProperty = S3ConfigProperty.builder()
   * .bucketName("bucketName")
   * .bucketPrefix("bucketPrefix")
   * // the properties below are optional
   * .encryptionConfig(EncryptionConfigProperty.builder()
   * .encryptionType("encryptionType")
   * .keyId("keyId")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-instancestorageconfig-s3config.html)
   */
  public inline
      fun cfnInstanceStorageConfigS3ConfigProperty(block: CfnInstanceStorageConfigS3ConfigPropertyDsl.() -> Unit
      = {}): CfnInstanceStorageConfig.S3ConfigProperty {
    val builder = CfnInstanceStorageConfigS3ConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Specifies the association of an AWS resource such as Lex bot (both v1 and v2) and Lambda
   * function with an Amazon Connect instance.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.connect.*;
   * CfnIntegrationAssociation cfnIntegrationAssociation =
   * CfnIntegrationAssociation.Builder.create(this, "MyCfnIntegrationAssociation")
   * .instanceId("instanceId")
   * .integrationArn("integrationArn")
   * .integrationType("integrationType")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-integrationassociation.html)
   */
  public inline fun cfnIntegrationAssociation(
    scope: Construct,
    id: String,
    block: CfnIntegrationAssociationDsl.() -> Unit = {},
  ): CfnIntegrationAssociation {
    val builder = CfnIntegrationAssociationDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnIntegrationAssociation`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.connect.*;
   * CfnIntegrationAssociationProps cfnIntegrationAssociationProps =
   * CfnIntegrationAssociationProps.builder()
   * .instanceId("instanceId")
   * .integrationArn("integrationArn")
   * .integrationType("integrationType")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-integrationassociation.html)
   */
  public inline
      fun cfnIntegrationAssociationProps(block: CfnIntegrationAssociationPropsDsl.() -> Unit = {}):
      CfnIntegrationAssociationProps {
    val builder = CfnIntegrationAssociationPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Claims a phone number to the specified Amazon Connect instance or traffic distribution group.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.connect.*;
   * CfnPhoneNumber cfnPhoneNumber = CfnPhoneNumber.Builder.create(this, "MyCfnPhoneNumber")
   * .countryCode("countryCode")
   * .targetArn("targetArn")
   * .type("type")
   * // the properties below are optional
   * .description("description")
   * .prefix("prefix")
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-phonenumber.html)
   */
  public inline fun cfnPhoneNumber(
    scope: Construct,
    id: String,
    block: CfnPhoneNumberDsl.() -> Unit = {},
  ): CfnPhoneNumber {
    val builder = CfnPhoneNumberDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnPhoneNumber`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.connect.*;
   * CfnPhoneNumberProps cfnPhoneNumberProps = CfnPhoneNumberProps.builder()
   * .countryCode("countryCode")
   * .targetArn("targetArn")
   * .type("type")
   * // the properties below are optional
   * .description("description")
   * .prefix("prefix")
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-phonenumber.html)
   */
  public inline fun cfnPhoneNumberProps(block: CfnPhoneNumberPropsDsl.() -> Unit = {}):
      CfnPhoneNumberProps {
    val builder = CfnPhoneNumberPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Creates a prompt for the specified Amazon Connect instance.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.connect.*;
   * CfnPrompt cfnPrompt = CfnPrompt.Builder.create(this, "MyCfnPrompt")
   * .instanceArn("instanceArn")
   * .name("name")
   * // the properties below are optional
   * .description("description")
   * .s3Uri("s3Uri")
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-prompt.html)
   */
  public inline fun cfnPrompt(
    scope: Construct,
    id: String,
    block: CfnPromptDsl.() -> Unit = {},
  ): CfnPrompt {
    val builder = CfnPromptDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnPrompt`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.connect.*;
   * CfnPromptProps cfnPromptProps = CfnPromptProps.builder()
   * .instanceArn("instanceArn")
   * .name("name")
   * // the properties below are optional
   * .description("description")
   * .s3Uri("s3Uri")
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-prompt.html)
   */
  public inline fun cfnPromptProps(block: CfnPromptPropsDsl.() -> Unit = {}): CfnPromptProps {
    val builder = CfnPromptPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Specifies a quick connect for an Amazon Connect instance.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.connect.*;
   * CfnQuickConnect cfnQuickConnect = CfnQuickConnect.Builder.create(this, "MyCfnQuickConnect")
   * .instanceArn("instanceArn")
   * .name("name")
   * .quickConnectConfig(QuickConnectConfigProperty.builder()
   * .quickConnectType("quickConnectType")
   * // the properties below are optional
   * .phoneConfig(PhoneNumberQuickConnectConfigProperty.builder()
   * .phoneNumber("phoneNumber")
   * .build())
   * .queueConfig(QueueQuickConnectConfigProperty.builder()
   * .contactFlowArn("contactFlowArn")
   * .queueArn("queueArn")
   * .build())
   * .userConfig(UserQuickConnectConfigProperty.builder()
   * .contactFlowArn("contactFlowArn")
   * .userArn("userArn")
   * .build())
   * .build())
   * // the properties below are optional
   * .description("description")
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-quickconnect.html)
   */
  public inline fun cfnQuickConnect(
    scope: Construct,
    id: String,
    block: CfnQuickConnectDsl.() -> Unit = {},
  ): CfnQuickConnect {
    val builder = CfnQuickConnectDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Contains information about a phone number for a quick connect.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.connect.*;
   * PhoneNumberQuickConnectConfigProperty phoneNumberQuickConnectConfigProperty =
   * PhoneNumberQuickConnectConfigProperty.builder()
   * .phoneNumber("phoneNumber")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-quickconnect-phonenumberquickconnectconfig.html)
   */
  public inline
      fun cfnQuickConnectPhoneNumberQuickConnectConfigProperty(block: CfnQuickConnectPhoneNumberQuickConnectConfigPropertyDsl.() -> Unit
      = {}): CfnQuickConnect.PhoneNumberQuickConnectConfigProperty {
    val builder = CfnQuickConnectPhoneNumberQuickConnectConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnQuickConnect`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.connect.*;
   * CfnQuickConnectProps cfnQuickConnectProps = CfnQuickConnectProps.builder()
   * .instanceArn("instanceArn")
   * .name("name")
   * .quickConnectConfig(QuickConnectConfigProperty.builder()
   * .quickConnectType("quickConnectType")
   * // the properties below are optional
   * .phoneConfig(PhoneNumberQuickConnectConfigProperty.builder()
   * .phoneNumber("phoneNumber")
   * .build())
   * .queueConfig(QueueQuickConnectConfigProperty.builder()
   * .contactFlowArn("contactFlowArn")
   * .queueArn("queueArn")
   * .build())
   * .userConfig(UserQuickConnectConfigProperty.builder()
   * .contactFlowArn("contactFlowArn")
   * .userArn("userArn")
   * .build())
   * .build())
   * // the properties below are optional
   * .description("description")
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-quickconnect.html)
   */
  public inline fun cfnQuickConnectProps(block: CfnQuickConnectPropsDsl.() -> Unit = {}):
      CfnQuickConnectProps {
    val builder = CfnQuickConnectPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Contains information about a queue for a quick connect.
   *
   * The flow must be of type Transfer to Queue.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.connect.*;
   * QueueQuickConnectConfigProperty queueQuickConnectConfigProperty =
   * QueueQuickConnectConfigProperty.builder()
   * .contactFlowArn("contactFlowArn")
   * .queueArn("queueArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-quickconnect-queuequickconnectconfig.html)
   */
  public inline
      fun cfnQuickConnectQueueQuickConnectConfigProperty(block: CfnQuickConnectQueueQuickConnectConfigPropertyDsl.() -> Unit
      = {}): CfnQuickConnect.QueueQuickConnectConfigProperty {
    val builder = CfnQuickConnectQueueQuickConnectConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Contains configuration settings for a quick connect.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.connect.*;
   * QuickConnectConfigProperty quickConnectConfigProperty = QuickConnectConfigProperty.builder()
   * .quickConnectType("quickConnectType")
   * // the properties below are optional
   * .phoneConfig(PhoneNumberQuickConnectConfigProperty.builder()
   * .phoneNumber("phoneNumber")
   * .build())
   * .queueConfig(QueueQuickConnectConfigProperty.builder()
   * .contactFlowArn("contactFlowArn")
   * .queueArn("queueArn")
   * .build())
   * .userConfig(UserQuickConnectConfigProperty.builder()
   * .contactFlowArn("contactFlowArn")
   * .userArn("userArn")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-quickconnect-quickconnectconfig.html)
   */
  public inline
      fun cfnQuickConnectQuickConnectConfigProperty(block: CfnQuickConnectQuickConnectConfigPropertyDsl.() -> Unit
      = {}): CfnQuickConnect.QuickConnectConfigProperty {
    val builder = CfnQuickConnectQuickConnectConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Contains information about the quick connect configuration settings for a user.
   *
   * The contact flow must be of type Transfer to Agent.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.connect.*;
   * UserQuickConnectConfigProperty userQuickConnectConfigProperty =
   * UserQuickConnectConfigProperty.builder()
   * .contactFlowArn("contactFlowArn")
   * .userArn("userArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-quickconnect-userquickconnectconfig.html)
   */
  public inline
      fun cfnQuickConnectUserQuickConnectConfigProperty(block: CfnQuickConnectUserQuickConnectConfigPropertyDsl.() -> Unit
      = {}): CfnQuickConnect.UserQuickConnectConfigProperty {
    val builder = CfnQuickConnectUserQuickConnectConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Creates a rule for the specified Amazon Connect instance.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.connect.*;
   * Object assignContactCategoryActions;
   * CfnRule cfnRule = CfnRule.Builder.create(this, "MyCfnRule")
   * .actions(ActionsProperty.builder()
   * .assignContactCategoryActions(List.of(assignContactCategoryActions))
   * .eventBridgeActions(List.of(EventBridgeActionProperty.builder()
   * .name("name")
   * .build()))
   * .sendNotificationActions(List.of(SendNotificationActionProperty.builder()
   * .content("content")
   * .contentType("contentType")
   * .deliveryMethod("deliveryMethod")
   * .recipient(NotificationRecipientTypeProperty.builder()
   * .userArns(List.of("userArns"))
   * .userTags(Map.of(
   * "userTagsKey", "userTags"))
   * .build())
   * // the properties below are optional
   * .subject("subject")
   * .build()))
   * .taskActions(List.of(TaskActionProperty.builder()
   * .contactFlowArn("contactFlowArn")
   * .name("name")
   * // the properties below are optional
   * .description("description")
   * .references(Map.of(
   * "referencesKey", ReferenceProperty.builder()
   * .type("type")
   * .value("value")
   * .build()))
   * .build()))
   * .build())
   * .function("function")
   * .instanceArn("instanceArn")
   * .name("name")
   * .publishStatus("publishStatus")
   * .triggerEventSource(RuleTriggerEventSourceProperty.builder()
   * .eventSourceName("eventSourceName")
   * // the properties below are optional
   * .integrationAssociationArn("integrationAssociationArn")
   * .build())
   * // the properties below are optional
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-rule.html)
   */
  public inline fun cfnRule(
    scope: Construct,
    id: String,
    block: CfnRuleDsl.() -> Unit = {},
  ): CfnRule {
    val builder = CfnRuleDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * A list of actions to be run when the rule is triggered.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.connect.*;
   * Object assignContactCategoryActions;
   * ActionsProperty actionsProperty = ActionsProperty.builder()
   * .assignContactCategoryActions(List.of(assignContactCategoryActions))
   * .eventBridgeActions(List.of(EventBridgeActionProperty.builder()
   * .name("name")
   * .build()))
   * .sendNotificationActions(List.of(SendNotificationActionProperty.builder()
   * .content("content")
   * .contentType("contentType")
   * .deliveryMethod("deliveryMethod")
   * .recipient(NotificationRecipientTypeProperty.builder()
   * .userArns(List.of("userArns"))
   * .userTags(Map.of(
   * "userTagsKey", "userTags"))
   * .build())
   * // the properties below are optional
   * .subject("subject")
   * .build()))
   * .taskActions(List.of(TaskActionProperty.builder()
   * .contactFlowArn("contactFlowArn")
   * .name("name")
   * // the properties below are optional
   * .description("description")
   * .references(Map.of(
   * "referencesKey", ReferenceProperty.builder()
   * .type("type")
   * .value("value")
   * .build()))
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-rule-actions.html)
   */
  public inline fun cfnRuleActionsProperty(block: CfnRuleActionsPropertyDsl.() -> Unit = {}):
      CfnRule.ActionsProperty {
    val builder = CfnRuleActionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The EventBridge action definition.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.connect.*;
   * EventBridgeActionProperty eventBridgeActionProperty = EventBridgeActionProperty.builder()
   * .name("name")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-rule-eventbridgeaction.html)
   */
  public inline
      fun cfnRuleEventBridgeActionProperty(block: CfnRuleEventBridgeActionPropertyDsl.() -> Unit =
      {}): CfnRule.EventBridgeActionProperty {
    val builder = CfnRuleEventBridgeActionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The type of notification recipient.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.connect.*;
   * NotificationRecipientTypeProperty notificationRecipientTypeProperty =
   * NotificationRecipientTypeProperty.builder()
   * .userArns(List.of("userArns"))
   * .userTags(Map.of(
   * "userTagsKey", "userTags"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-rule-notificationrecipienttype.html)
   */
  public inline
      fun cfnRuleNotificationRecipientTypeProperty(block: CfnRuleNotificationRecipientTypePropertyDsl.() -> Unit
      = {}): CfnRule.NotificationRecipientTypeProperty {
    val builder = CfnRuleNotificationRecipientTypePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnRule`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.connect.*;
   * Object assignContactCategoryActions;
   * CfnRuleProps cfnRuleProps = CfnRuleProps.builder()
   * .actions(ActionsProperty.builder()
   * .assignContactCategoryActions(List.of(assignContactCategoryActions))
   * .eventBridgeActions(List.of(EventBridgeActionProperty.builder()
   * .name("name")
   * .build()))
   * .sendNotificationActions(List.of(SendNotificationActionProperty.builder()
   * .content("content")
   * .contentType("contentType")
   * .deliveryMethod("deliveryMethod")
   * .recipient(NotificationRecipientTypeProperty.builder()
   * .userArns(List.of("userArns"))
   * .userTags(Map.of(
   * "userTagsKey", "userTags"))
   * .build())
   * // the properties below are optional
   * .subject("subject")
   * .build()))
   * .taskActions(List.of(TaskActionProperty.builder()
   * .contactFlowArn("contactFlowArn")
   * .name("name")
   * // the properties below are optional
   * .description("description")
   * .references(Map.of(
   * "referencesKey", ReferenceProperty.builder()
   * .type("type")
   * .value("value")
   * .build()))
   * .build()))
   * .build())
   * .function("function")
   * .instanceArn("instanceArn")
   * .name("name")
   * .publishStatus("publishStatus")
   * .triggerEventSource(RuleTriggerEventSourceProperty.builder()
   * .eventSourceName("eventSourceName")
   * // the properties below are optional
   * .integrationAssociationArn("integrationAssociationArn")
   * .build())
   * // the properties below are optional
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-rule.html)
   */
  public inline fun cfnRuleProps(block: CfnRulePropsDsl.() -> Unit = {}): CfnRuleProps {
    val builder = CfnRulePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Information about the reference when the `referenceType` is `URL` .
   *
   * Otherwise, null. (Supports variable injection in the `Value` field.)
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.connect.*;
   * ReferenceProperty referenceProperty = ReferenceProperty.builder()
   * .type("type")
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-rule-reference.html)
   */
  public inline fun cfnRuleReferenceProperty(block: CfnRuleReferencePropertyDsl.() -> Unit = {}):
      CfnRule.ReferenceProperty {
    val builder = CfnRuleReferencePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The name of the event source.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.connect.*;
   * RuleTriggerEventSourceProperty ruleTriggerEventSourceProperty =
   * RuleTriggerEventSourceProperty.builder()
   * .eventSourceName("eventSourceName")
   * // the properties below are optional
   * .integrationAssociationArn("integrationAssociationArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-rule-ruletriggereventsource.html)
   */
  public inline
      fun cfnRuleRuleTriggerEventSourceProperty(block: CfnRuleRuleTriggerEventSourcePropertyDsl.() -> Unit
      = {}): CfnRule.RuleTriggerEventSourceProperty {
    val builder = CfnRuleRuleTriggerEventSourcePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Information about the send notification action.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.connect.*;
   * SendNotificationActionProperty sendNotificationActionProperty =
   * SendNotificationActionProperty.builder()
   * .content("content")
   * .contentType("contentType")
   * .deliveryMethod("deliveryMethod")
   * .recipient(NotificationRecipientTypeProperty.builder()
   * .userArns(List.of("userArns"))
   * .userTags(Map.of(
   * "userTagsKey", "userTags"))
   * .build())
   * // the properties below are optional
   * .subject("subject")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-rule-sendnotificationaction.html)
   */
  public inline
      fun cfnRuleSendNotificationActionProperty(block: CfnRuleSendNotificationActionPropertyDsl.() -> Unit
      = {}): CfnRule.SendNotificationActionProperty {
    val builder = CfnRuleSendNotificationActionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Information about the task action.
   *
   * This field is required if `TriggerEventSource` is one of the following values:
   * `OnZendeskTicketCreate` | `OnZendeskTicketStatusUpdate` | `OnSalesforceCaseCreate`
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.connect.*;
   * TaskActionProperty taskActionProperty = TaskActionProperty.builder()
   * .contactFlowArn("contactFlowArn")
   * .name("name")
   * // the properties below are optional
   * .description("description")
   * .references(Map.of(
   * "referencesKey", ReferenceProperty.builder()
   * .type("type")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-rule-taskaction.html)
   */
  public inline fun cfnRuleTaskActionProperty(block: CfnRuleTaskActionPropertyDsl.() -> Unit = {}):
      CfnRule.TaskActionProperty {
    val builder = CfnRuleTaskActionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The security key for the instance.
   *
   *
   * Only two security keys are allowed per Amazon Connect instance.
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.connect.*;
   * CfnSecurityKey cfnSecurityKey = CfnSecurityKey.Builder.create(this, "MyCfnSecurityKey")
   * .instanceId("instanceId")
   * .key("key")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-securitykey.html)
   */
  public inline fun cfnSecurityKey(
    scope: Construct,
    id: String,
    block: CfnSecurityKeyDsl.() -> Unit = {},
  ): CfnSecurityKey {
    val builder = CfnSecurityKeyDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnSecurityKey`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.connect.*;
   * CfnSecurityKeyProps cfnSecurityKeyProps = CfnSecurityKeyProps.builder()
   * .instanceId("instanceId")
   * .key("key")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-securitykey.html)
   */
  public inline fun cfnSecurityKeyProps(block: CfnSecurityKeyPropsDsl.() -> Unit = {}):
      CfnSecurityKeyProps {
    val builder = CfnSecurityKeyPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Specifies a task template for a Amazon Connect instance.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.connect.*;
   * Object constraints;
   * CfnTaskTemplate cfnTaskTemplate = CfnTaskTemplate.Builder.create(this, "MyCfnTaskTemplate")
   * .instanceArn("instanceArn")
   * // the properties below are optional
   * .clientToken("clientToken")
   * .constraints(constraints)
   * .contactFlowArn("contactFlowArn")
   * .defaults(List.of(DefaultFieldValueProperty.builder()
   * .defaultValue("defaultValue")
   * .id(FieldIdentifierProperty.builder()
   * .name("name")
   * .build())
   * .build()))
   * .description("description")
   * .fields(List.of(FieldProperty.builder()
   * .id(FieldIdentifierProperty.builder()
   * .name("name")
   * .build())
   * .type("type")
   * // the properties below are optional
   * .description("description")
   * .singleSelectOptions(List.of("singleSelectOptions"))
   * .build()))
   * .name("name")
   * .status("status")
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-tasktemplate.html)
   */
  public inline fun cfnTaskTemplate(
    scope: Construct,
    id: String,
    block: CfnTaskTemplateDsl.() -> Unit = {},
  ): CfnTaskTemplate {
    val builder = CfnTaskTemplateDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Describes constraints that apply to the template fields.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.connect.*;
   * ConstraintsProperty constraintsProperty = ConstraintsProperty.builder()
   * .invisibleFields(List.of(InvisibleFieldInfoProperty.builder()
   * .id(FieldIdentifierProperty.builder()
   * .name("name")
   * .build())
   * .build()))
   * .readOnlyFields(List.of(ReadOnlyFieldInfoProperty.builder()
   * .id(FieldIdentifierProperty.builder()
   * .name("name")
   * .build())
   * .build()))
   * .requiredFields(List.of(RequiredFieldInfoProperty.builder()
   * .id(FieldIdentifierProperty.builder()
   * .name("name")
   * .build())
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-tasktemplate-constraints.html)
   */
  public inline
      fun cfnTaskTemplateConstraintsProperty(block: CfnTaskTemplateConstraintsPropertyDsl.() -> Unit
      = {}): CfnTaskTemplate.ConstraintsProperty {
    val builder = CfnTaskTemplateConstraintsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Describes a default field and its corresponding value.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.connect.*;
   * DefaultFieldValueProperty defaultFieldValueProperty = DefaultFieldValueProperty.builder()
   * .defaultValue("defaultValue")
   * .id(FieldIdentifierProperty.builder()
   * .name("name")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-tasktemplate-defaultfieldvalue.html)
   */
  public inline
      fun cfnTaskTemplateDefaultFieldValueProperty(block: CfnTaskTemplateDefaultFieldValuePropertyDsl.() -> Unit
      = {}): CfnTaskTemplate.DefaultFieldValueProperty {
    val builder = CfnTaskTemplateDefaultFieldValuePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The identifier of the task template field.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.connect.*;
   * FieldIdentifierProperty fieldIdentifierProperty = FieldIdentifierProperty.builder()
   * .name("name")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-tasktemplate-fieldidentifier.html)
   */
  public inline
      fun cfnTaskTemplateFieldIdentifierProperty(block: CfnTaskTemplateFieldIdentifierPropertyDsl.() -> Unit
      = {}): CfnTaskTemplate.FieldIdentifierProperty {
    val builder = CfnTaskTemplateFieldIdentifierPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Describes a single task template field.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.connect.*;
   * FieldProperty fieldProperty = FieldProperty.builder()
   * .id(FieldIdentifierProperty.builder()
   * .name("name")
   * .build())
   * .type("type")
   * // the properties below are optional
   * .description("description")
   * .singleSelectOptions(List.of("singleSelectOptions"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-tasktemplate-field.html)
   */
  public inline fun cfnTaskTemplateFieldProperty(block: CfnTaskTemplateFieldPropertyDsl.() -> Unit =
      {}): CfnTaskTemplate.FieldProperty {
    val builder = CfnTaskTemplateFieldPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * A field that is invisible to an agent.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.connect.*;
   * InvisibleFieldInfoProperty invisibleFieldInfoProperty = InvisibleFieldInfoProperty.builder()
   * .id(FieldIdentifierProperty.builder()
   * .name("name")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-tasktemplate-invisiblefieldinfo.html)
   */
  public inline
      fun cfnTaskTemplateInvisibleFieldInfoProperty(block: CfnTaskTemplateInvisibleFieldInfoPropertyDsl.() -> Unit
      = {}): CfnTaskTemplate.InvisibleFieldInfoProperty {
    val builder = CfnTaskTemplateInvisibleFieldInfoPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnTaskTemplate`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.connect.*;
   * Object constraints;
   * CfnTaskTemplateProps cfnTaskTemplateProps = CfnTaskTemplateProps.builder()
   * .instanceArn("instanceArn")
   * // the properties below are optional
   * .clientToken("clientToken")
   * .constraints(constraints)
   * .contactFlowArn("contactFlowArn")
   * .defaults(List.of(DefaultFieldValueProperty.builder()
   * .defaultValue("defaultValue")
   * .id(FieldIdentifierProperty.builder()
   * .name("name")
   * .build())
   * .build()))
   * .description("description")
   * .fields(List.of(FieldProperty.builder()
   * .id(FieldIdentifierProperty.builder()
   * .name("name")
   * .build())
   * .type("type")
   * // the properties below are optional
   * .description("description")
   * .singleSelectOptions(List.of("singleSelectOptions"))
   * .build()))
   * .name("name")
   * .status("status")
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-tasktemplate.html)
   */
  public inline fun cfnTaskTemplateProps(block: CfnTaskTemplatePropsDsl.() -> Unit = {}):
      CfnTaskTemplateProps {
    val builder = CfnTaskTemplatePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Indicates a field that is read-only to an agent.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.connect.*;
   * ReadOnlyFieldInfoProperty readOnlyFieldInfoProperty = ReadOnlyFieldInfoProperty.builder()
   * .id(FieldIdentifierProperty.builder()
   * .name("name")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-tasktemplate-readonlyfieldinfo.html)
   */
  public inline
      fun cfnTaskTemplateReadOnlyFieldInfoProperty(block: CfnTaskTemplateReadOnlyFieldInfoPropertyDsl.() -> Unit
      = {}): CfnTaskTemplate.ReadOnlyFieldInfoProperty {
    val builder = CfnTaskTemplateReadOnlyFieldInfoPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Information about a required field.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.connect.*;
   * RequiredFieldInfoProperty requiredFieldInfoProperty = RequiredFieldInfoProperty.builder()
   * .id(FieldIdentifierProperty.builder()
   * .name("name")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-tasktemplate-requiredfieldinfo.html)
   */
  public inline
      fun cfnTaskTemplateRequiredFieldInfoProperty(block: CfnTaskTemplateRequiredFieldInfoPropertyDsl.() -> Unit
      = {}): CfnTaskTemplate.RequiredFieldInfoProperty {
    val builder = CfnTaskTemplateRequiredFieldInfoPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Specifies a user account for an Amazon Connect instance.
   *
   * For information about how to create user accounts using the Amazon Connect console, see [Add
   * Users](https://docs.aws.amazon.com/connect/latest/adminguide/user-management.html) in the *Amazon
   * Connect Administrator Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.connect.*;
   * CfnUser cfnUser = CfnUser.Builder.create(this, "MyCfnUser")
   * .instanceArn("instanceArn")
   * .phoneConfig(UserPhoneConfigProperty.builder()
   * .phoneType("phoneType")
   * // the properties below are optional
   * .afterContactWorkTimeLimit(123)
   * .autoAccept(false)
   * .deskPhoneNumber("deskPhoneNumber")
   * .build())
   * .routingProfileArn("routingProfileArn")
   * .securityProfileArns(List.of("securityProfileArns"))
   * .username("username")
   * // the properties below are optional
   * .directoryUserId("directoryUserId")
   * .hierarchyGroupArn("hierarchyGroupArn")
   * .identityInfo(UserIdentityInfoProperty.builder()
   * .email("email")
   * .firstName("firstName")
   * .lastName("lastName")
   * .mobile("mobile")
   * .secondaryEmail("secondaryEmail")
   * .build())
   * .password("password")
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-user.html)
   */
  public inline fun cfnUser(
    scope: Construct,
    id: String,
    block: CfnUserDsl.() -> Unit = {},
  ): CfnUser {
    val builder = CfnUserDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Specifies a new user hierarchy group.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.connect.*;
   * CfnUserHierarchyGroup cfnUserHierarchyGroup = CfnUserHierarchyGroup.Builder.create(this,
   * "MyCfnUserHierarchyGroup")
   * .instanceArn("instanceArn")
   * .name("name")
   * // the properties below are optional
   * .parentGroupArn("parentGroupArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-userhierarchygroup.html)
   */
  public inline fun cfnUserHierarchyGroup(
    scope: Construct,
    id: String,
    block: CfnUserHierarchyGroupDsl.() -> Unit = {},
  ): CfnUserHierarchyGroup {
    val builder = CfnUserHierarchyGroupDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnUserHierarchyGroup`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.connect.*;
   * CfnUserHierarchyGroupProps cfnUserHierarchyGroupProps = CfnUserHierarchyGroupProps.builder()
   * .instanceArn("instanceArn")
   * .name("name")
   * // the properties below are optional
   * .parentGroupArn("parentGroupArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-userhierarchygroup.html)
   */
  public inline fun cfnUserHierarchyGroupProps(block: CfnUserHierarchyGroupPropsDsl.() -> Unit =
      {}): CfnUserHierarchyGroupProps {
    val builder = CfnUserHierarchyGroupPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnUser`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.connect.*;
   * CfnUserProps cfnUserProps = CfnUserProps.builder()
   * .instanceArn("instanceArn")
   * .phoneConfig(UserPhoneConfigProperty.builder()
   * .phoneType("phoneType")
   * // the properties below are optional
   * .afterContactWorkTimeLimit(123)
   * .autoAccept(false)
   * .deskPhoneNumber("deskPhoneNumber")
   * .build())
   * .routingProfileArn("routingProfileArn")
   * .securityProfileArns(List.of("securityProfileArns"))
   * .username("username")
   * // the properties below are optional
   * .directoryUserId("directoryUserId")
   * .hierarchyGroupArn("hierarchyGroupArn")
   * .identityInfo(UserIdentityInfoProperty.builder()
   * .email("email")
   * .firstName("firstName")
   * .lastName("lastName")
   * .mobile("mobile")
   * .secondaryEmail("secondaryEmail")
   * .build())
   * .password("password")
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-user.html)
   */
  public inline fun cfnUserProps(block: CfnUserPropsDsl.() -> Unit = {}): CfnUserProps {
    val builder = CfnUserPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Contains information about the identity of a user.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.connect.*;
   * UserIdentityInfoProperty userIdentityInfoProperty = UserIdentityInfoProperty.builder()
   * .email("email")
   * .firstName("firstName")
   * .lastName("lastName")
   * .mobile("mobile")
   * .secondaryEmail("secondaryEmail")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-user-useridentityinfo.html)
   */
  public inline
      fun cfnUserUserIdentityInfoProperty(block: CfnUserUserIdentityInfoPropertyDsl.() -> Unit =
      {}): CfnUser.UserIdentityInfoProperty {
    val builder = CfnUserUserIdentityInfoPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Contains information about the phone configuration settings for a user.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.connect.*;
   * UserPhoneConfigProperty userPhoneConfigProperty = UserPhoneConfigProperty.builder()
   * .phoneType("phoneType")
   * // the properties below are optional
   * .afterContactWorkTimeLimit(123)
   * .autoAccept(false)
   * .deskPhoneNumber("deskPhoneNumber")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-user-userphoneconfig.html)
   */
  public inline
      fun cfnUserUserPhoneConfigProperty(block: CfnUserUserPhoneConfigPropertyDsl.() -> Unit = {}):
      CfnUser.UserPhoneConfigProperty {
    val builder = CfnUserUserPhoneConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }
}
