@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.securityhub

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.securityhub.CfnAutomationRule
import software.amazon.awscdk.services.securityhub.CfnAutomationRuleProps
import software.amazon.awscdk.services.securityhub.CfnHub
import software.amazon.awscdk.services.securityhub.CfnHubProps
import software.amazon.awscdk.services.securityhub.CfnStandard
import software.amazon.awscdk.services.securityhub.CfnStandardProps
import software.constructs.Construct

public object securityhub {
    /**
     * The `AWS::SecurityHub::AutomationRule` resource specifies an automation rule based on input
     * parameters.
     *
     * For more information, see
     * [Automation rules](https://docs.aws.amazon.com/securityhub/latest/userguide/automation-rules.html)
     * in the *AWS Security Hub User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.securityhub.*;
     * Object id;
     * Object updatedBy;
     * CfnAutomationRule cfnAutomationRule = CfnAutomationRule.Builder.create(this,
     * "MyCfnAutomationRule")
     * .actions(List.of(AutomationRulesActionProperty.builder()
     * .findingFieldsUpdate(AutomationRulesFindingFieldsUpdateProperty.builder()
     * .confidence(123)
     * .criticality(123)
     * .note(NoteUpdateProperty.builder()
     * .text("text")
     * .updatedBy(updatedBy)
     * .build())
     * .relatedFindings(List.of(RelatedFindingProperty.builder()
     * .id(id)
     * .productArn("productArn")
     * .build()))
     * .severity(SeverityUpdateProperty.builder()
     * .label("label")
     * .normalized(123)
     * .product(123)
     * .build())
     * .types(List.of("types"))
     * .userDefinedFields(Map.of(
     * "userDefinedFieldsKey", "userDefinedFields"))
     * .verificationState("verificationState")
     * .workflow(WorkflowUpdateProperty.builder()
     * .status("status")
     * .build())
     * .build())
     * .type("type")
     * .build()))
     * .criteria(AutomationRulesFindingFiltersProperty.builder()
     * .awsAccountId(List.of(StringFilterProperty.builder()
     * .comparison("comparison")
     * .value("value")
     * .build()))
     * .companyName(List.of(StringFilterProperty.builder()
     * .comparison("comparison")
     * .value("value")
     * .build()))
     * .complianceAssociatedStandardsId(List.of(StringFilterProperty.builder()
     * .comparison("comparison")
     * .value("value")
     * .build()))
     * .complianceSecurityControlId(List.of(StringFilterProperty.builder()
     * .comparison("comparison")
     * .value("value")
     * .build()))
     * .complianceStatus(List.of(StringFilterProperty.builder()
     * .comparison("comparison")
     * .value("value")
     * .build()))
     * .confidence(List.of(NumberFilterProperty.builder()
     * .eq(123)
     * .gte(123)
     * .lte(123)
     * .build()))
     * .createdAt(List.of(DateFilterProperty.builder()
     * .dateRange(DateRangeProperty.builder()
     * .unit("unit")
     * .value(123)
     * .build())
     * .end("end")
     * .start("start")
     * .build()))
     * .criticality(List.of(NumberFilterProperty.builder()
     * .eq(123)
     * .gte(123)
     * .lte(123)
     * .build()))
     * .description(List.of(StringFilterProperty.builder()
     * .comparison("comparison")
     * .value("value")
     * .build()))
     * .firstObservedAt(List.of(DateFilterProperty.builder()
     * .dateRange(DateRangeProperty.builder()
     * .unit("unit")
     * .value(123)
     * .build())
     * .end("end")
     * .start("start")
     * .build()))
     * .generatorId(List.of(StringFilterProperty.builder()
     * .comparison("comparison")
     * .value("value")
     * .build()))
     * .id(List.of(StringFilterProperty.builder()
     * .comparison("comparison")
     * .value("value")
     * .build()))
     * .lastObservedAt(List.of(DateFilterProperty.builder()
     * .dateRange(DateRangeProperty.builder()
     * .unit("unit")
     * .value(123)
     * .build())
     * .end("end")
     * .start("start")
     * .build()))
     * .noteText(List.of(StringFilterProperty.builder()
     * .comparison("comparison")
     * .value("value")
     * .build()))
     * .noteUpdatedAt(List.of(DateFilterProperty.builder()
     * .dateRange(DateRangeProperty.builder()
     * .unit("unit")
     * .value(123)
     * .build())
     * .end("end")
     * .start("start")
     * .build()))
     * .noteUpdatedBy(List.of(StringFilterProperty.builder()
     * .comparison("comparison")
     * .value("value")
     * .build()))
     * .productArn(List.of(StringFilterProperty.builder()
     * .comparison("comparison")
     * .value("value")
     * .build()))
     * .productName(List.of(StringFilterProperty.builder()
     * .comparison("comparison")
     * .value("value")
     * .build()))
     * .recordState(List.of(StringFilterProperty.builder()
     * .comparison("comparison")
     * .value("value")
     * .build()))
     * .relatedFindingsId(List.of(StringFilterProperty.builder()
     * .comparison("comparison")
     * .value("value")
     * .build()))
     * .relatedFindingsProductArn(List.of(StringFilterProperty.builder()
     * .comparison("comparison")
     * .value("value")
     * .build()))
     * .resourceDetailsOther(List.of(MapFilterProperty.builder()
     * .comparison("comparison")
     * .key("key")
     * .value("value")
     * .build()))
     * .resourceId(List.of(StringFilterProperty.builder()
     * .comparison("comparison")
     * .value("value")
     * .build()))
     * .resourcePartition(List.of(StringFilterProperty.builder()
     * .comparison("comparison")
     * .value("value")
     * .build()))
     * .resourceRegion(List.of(StringFilterProperty.builder()
     * .comparison("comparison")
     * .value("value")
     * .build()))
     * .resourceTags(List.of(MapFilterProperty.builder()
     * .comparison("comparison")
     * .key("key")
     * .value("value")
     * .build()))
     * .resourceType(List.of(StringFilterProperty.builder()
     * .comparison("comparison")
     * .value("value")
     * .build()))
     * .severityLabel(List.of(StringFilterProperty.builder()
     * .comparison("comparison")
     * .value("value")
     * .build()))
     * .sourceUrl(List.of(StringFilterProperty.builder()
     * .comparison("comparison")
     * .value("value")
     * .build()))
     * .title(List.of(StringFilterProperty.builder()
     * .comparison("comparison")
     * .value("value")
     * .build()))
     * .type(List.of(StringFilterProperty.builder()
     * .comparison("comparison")
     * .value("value")
     * .build()))
     * .updatedAt(List.of(DateFilterProperty.builder()
     * .dateRange(DateRangeProperty.builder()
     * .unit("unit")
     * .value(123)
     * .build())
     * .end("end")
     * .start("start")
     * .build()))
     * .userDefinedFields(List.of(MapFilterProperty.builder()
     * .comparison("comparison")
     * .key("key")
     * .value("value")
     * .build()))
     * .verificationState(List.of(StringFilterProperty.builder()
     * .comparison("comparison")
     * .value("value")
     * .build()))
     * .workflowStatus(List.of(StringFilterProperty.builder()
     * .comparison("comparison")
     * .value("value")
     * .build()))
     * .build())
     * .description("description")
     * .isTerminal(false)
     * .ruleName("ruleName")
     * .ruleOrder(123)
     * .ruleStatus("ruleStatus")
     * .tags(Map.of(
     * "tagsKey", "tags"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-automationrule.html)
     */
    public inline fun cfnAutomationRule(
        scope: Construct,
        id: String,
        block: CfnAutomationRuleDsl.() -> Unit = {},
    ): CfnAutomationRule {
        val builder = CfnAutomationRuleDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * One or more actions to update finding fields if a finding matches the defined criteria of the
     * rule.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.securityhub.*;
     * Object id;
     * Object updatedBy;
     * AutomationRulesActionProperty automationRulesActionProperty =
     * AutomationRulesActionProperty.builder()
     * .findingFieldsUpdate(AutomationRulesFindingFieldsUpdateProperty.builder()
     * .confidence(123)
     * .criticality(123)
     * .note(NoteUpdateProperty.builder()
     * .text("text")
     * .updatedBy(updatedBy)
     * .build())
     * .relatedFindings(List.of(RelatedFindingProperty.builder()
     * .id(id)
     * .productArn("productArn")
     * .build()))
     * .severity(SeverityUpdateProperty.builder()
     * .label("label")
     * .normalized(123)
     * .product(123)
     * .build())
     * .types(List.of("types"))
     * .userDefinedFields(Map.of(
     * "userDefinedFieldsKey", "userDefinedFields"))
     * .verificationState("verificationState")
     * .workflow(WorkflowUpdateProperty.builder()
     * .status("status")
     * .build())
     * .build())
     * .type("type")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-automationrulesaction.html)
     */
    public inline fun cfnAutomationRuleAutomationRulesActionProperty(
        block: CfnAutomationRuleAutomationRulesActionPropertyDsl.() -> Unit = {}
    ): CfnAutomationRule.AutomationRulesActionProperty {
        val builder = CfnAutomationRuleAutomationRulesActionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Identifies the finding fields that the automation rule action updates when a finding matches
     * the defined criteria.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.securityhub.*;
     * Object id;
     * Object updatedBy;
     * AutomationRulesFindingFieldsUpdateProperty automationRulesFindingFieldsUpdateProperty =
     * AutomationRulesFindingFieldsUpdateProperty.builder()
     * .confidence(123)
     * .criticality(123)
     * .note(NoteUpdateProperty.builder()
     * .text("text")
     * .updatedBy(updatedBy)
     * .build())
     * .relatedFindings(List.of(RelatedFindingProperty.builder()
     * .id(id)
     * .productArn("productArn")
     * .build()))
     * .severity(SeverityUpdateProperty.builder()
     * .label("label")
     * .normalized(123)
     * .product(123)
     * .build())
     * .types(List.of("types"))
     * .userDefinedFields(Map.of(
     * "userDefinedFieldsKey", "userDefinedFields"))
     * .verificationState("verificationState")
     * .workflow(WorkflowUpdateProperty.builder()
     * .status("status")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-automationrulesfindingfieldsupdate.html)
     */
    public inline fun cfnAutomationRuleAutomationRulesFindingFieldsUpdateProperty(
        block: CfnAutomationRuleAutomationRulesFindingFieldsUpdatePropertyDsl.() -> Unit = {}
    ): CfnAutomationRule.AutomationRulesFindingFieldsUpdateProperty {
        val builder = CfnAutomationRuleAutomationRulesFindingFieldsUpdatePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The criteria that determine which findings a rule applies to.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.securityhub.*;
     * AutomationRulesFindingFiltersProperty automationRulesFindingFiltersProperty =
     * AutomationRulesFindingFiltersProperty.builder()
     * .awsAccountId(List.of(StringFilterProperty.builder()
     * .comparison("comparison")
     * .value("value")
     * .build()))
     * .companyName(List.of(StringFilterProperty.builder()
     * .comparison("comparison")
     * .value("value")
     * .build()))
     * .complianceAssociatedStandardsId(List.of(StringFilterProperty.builder()
     * .comparison("comparison")
     * .value("value")
     * .build()))
     * .complianceSecurityControlId(List.of(StringFilterProperty.builder()
     * .comparison("comparison")
     * .value("value")
     * .build()))
     * .complianceStatus(List.of(StringFilterProperty.builder()
     * .comparison("comparison")
     * .value("value")
     * .build()))
     * .confidence(List.of(NumberFilterProperty.builder()
     * .eq(123)
     * .gte(123)
     * .lte(123)
     * .build()))
     * .createdAt(List.of(DateFilterProperty.builder()
     * .dateRange(DateRangeProperty.builder()
     * .unit("unit")
     * .value(123)
     * .build())
     * .end("end")
     * .start("start")
     * .build()))
     * .criticality(List.of(NumberFilterProperty.builder()
     * .eq(123)
     * .gte(123)
     * .lte(123)
     * .build()))
     * .description(List.of(StringFilterProperty.builder()
     * .comparison("comparison")
     * .value("value")
     * .build()))
     * .firstObservedAt(List.of(DateFilterProperty.builder()
     * .dateRange(DateRangeProperty.builder()
     * .unit("unit")
     * .value(123)
     * .build())
     * .end("end")
     * .start("start")
     * .build()))
     * .generatorId(List.of(StringFilterProperty.builder()
     * .comparison("comparison")
     * .value("value")
     * .build()))
     * .id(List.of(StringFilterProperty.builder()
     * .comparison("comparison")
     * .value("value")
     * .build()))
     * .lastObservedAt(List.of(DateFilterProperty.builder()
     * .dateRange(DateRangeProperty.builder()
     * .unit("unit")
     * .value(123)
     * .build())
     * .end("end")
     * .start("start")
     * .build()))
     * .noteText(List.of(StringFilterProperty.builder()
     * .comparison("comparison")
     * .value("value")
     * .build()))
     * .noteUpdatedAt(List.of(DateFilterProperty.builder()
     * .dateRange(DateRangeProperty.builder()
     * .unit("unit")
     * .value(123)
     * .build())
     * .end("end")
     * .start("start")
     * .build()))
     * .noteUpdatedBy(List.of(StringFilterProperty.builder()
     * .comparison("comparison")
     * .value("value")
     * .build()))
     * .productArn(List.of(StringFilterProperty.builder()
     * .comparison("comparison")
     * .value("value")
     * .build()))
     * .productName(List.of(StringFilterProperty.builder()
     * .comparison("comparison")
     * .value("value")
     * .build()))
     * .recordState(List.of(StringFilterProperty.builder()
     * .comparison("comparison")
     * .value("value")
     * .build()))
     * .relatedFindingsId(List.of(StringFilterProperty.builder()
     * .comparison("comparison")
     * .value("value")
     * .build()))
     * .relatedFindingsProductArn(List.of(StringFilterProperty.builder()
     * .comparison("comparison")
     * .value("value")
     * .build()))
     * .resourceDetailsOther(List.of(MapFilterProperty.builder()
     * .comparison("comparison")
     * .key("key")
     * .value("value")
     * .build()))
     * .resourceId(List.of(StringFilterProperty.builder()
     * .comparison("comparison")
     * .value("value")
     * .build()))
     * .resourcePartition(List.of(StringFilterProperty.builder()
     * .comparison("comparison")
     * .value("value")
     * .build()))
     * .resourceRegion(List.of(StringFilterProperty.builder()
     * .comparison("comparison")
     * .value("value")
     * .build()))
     * .resourceTags(List.of(MapFilterProperty.builder()
     * .comparison("comparison")
     * .key("key")
     * .value("value")
     * .build()))
     * .resourceType(List.of(StringFilterProperty.builder()
     * .comparison("comparison")
     * .value("value")
     * .build()))
     * .severityLabel(List.of(StringFilterProperty.builder()
     * .comparison("comparison")
     * .value("value")
     * .build()))
     * .sourceUrl(List.of(StringFilterProperty.builder()
     * .comparison("comparison")
     * .value("value")
     * .build()))
     * .title(List.of(StringFilterProperty.builder()
     * .comparison("comparison")
     * .value("value")
     * .build()))
     * .type(List.of(StringFilterProperty.builder()
     * .comparison("comparison")
     * .value("value")
     * .build()))
     * .updatedAt(List.of(DateFilterProperty.builder()
     * .dateRange(DateRangeProperty.builder()
     * .unit("unit")
     * .value(123)
     * .build())
     * .end("end")
     * .start("start")
     * .build()))
     * .userDefinedFields(List.of(MapFilterProperty.builder()
     * .comparison("comparison")
     * .key("key")
     * .value("value")
     * .build()))
     * .verificationState(List.of(StringFilterProperty.builder()
     * .comparison("comparison")
     * .value("value")
     * .build()))
     * .workflowStatus(List.of(StringFilterProperty.builder()
     * .comparison("comparison")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-automationrulesfindingfilters.html)
     */
    public inline fun cfnAutomationRuleAutomationRulesFindingFiltersProperty(
        block: CfnAutomationRuleAutomationRulesFindingFiltersPropertyDsl.() -> Unit = {}
    ): CfnAutomationRule.AutomationRulesFindingFiltersProperty {
        val builder = CfnAutomationRuleAutomationRulesFindingFiltersPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A date filter for querying findings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.securityhub.*;
     * DateFilterProperty dateFilterProperty = DateFilterProperty.builder()
     * .dateRange(DateRangeProperty.builder()
     * .unit("unit")
     * .value(123)
     * .build())
     * .end("end")
     * .start("start")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-datefilter.html)
     */
    public inline fun cfnAutomationRuleDateFilterProperty(
        block: CfnAutomationRuleDateFilterPropertyDsl.() -> Unit = {}
    ): CfnAutomationRule.DateFilterProperty {
        val builder = CfnAutomationRuleDateFilterPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A date range for the date filter.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.securityhub.*;
     * DateRangeProperty dateRangeProperty = DateRangeProperty.builder()
     * .unit("unit")
     * .value(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-daterange.html)
     */
    public inline fun cfnAutomationRuleDateRangeProperty(
        block: CfnAutomationRuleDateRangePropertyDsl.() -> Unit = {}
    ): CfnAutomationRule.DateRangeProperty {
        val builder = CfnAutomationRuleDateRangePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A map filter for querying findings.
     *
     * Each map filter provides the field to check, the value to look for, and the comparison
     * operator.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.securityhub.*;
     * MapFilterProperty mapFilterProperty = MapFilterProperty.builder()
     * .comparison("comparison")
     * .key("key")
     * .value("value")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-mapfilter.html)
     */
    public inline fun cfnAutomationRuleMapFilterProperty(
        block: CfnAutomationRuleMapFilterPropertyDsl.() -> Unit = {}
    ): CfnAutomationRule.MapFilterProperty {
        val builder = CfnAutomationRuleMapFilterPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The updated note.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.securityhub.*;
     * Object updatedBy;
     * NoteUpdateProperty noteUpdateProperty = NoteUpdateProperty.builder()
     * .text("text")
     * .updatedBy(updatedBy)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-noteupdate.html)
     */
    public inline fun cfnAutomationRuleNoteUpdateProperty(
        block: CfnAutomationRuleNoteUpdatePropertyDsl.() -> Unit = {}
    ): CfnAutomationRule.NoteUpdateProperty {
        val builder = CfnAutomationRuleNoteUpdatePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A number filter for querying findings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.securityhub.*;
     * NumberFilterProperty numberFilterProperty = NumberFilterProperty.builder()
     * .eq(123)
     * .gte(123)
     * .lte(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-numberfilter.html)
     */
    public inline fun cfnAutomationRuleNumberFilterProperty(
        block: CfnAutomationRuleNumberFilterPropertyDsl.() -> Unit = {}
    ): CfnAutomationRule.NumberFilterProperty {
        val builder = CfnAutomationRuleNumberFilterPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnAutomationRule`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.securityhub.*;
     * Object id;
     * Object updatedBy;
     * CfnAutomationRuleProps cfnAutomationRuleProps = CfnAutomationRuleProps.builder()
     * .actions(List.of(AutomationRulesActionProperty.builder()
     * .findingFieldsUpdate(AutomationRulesFindingFieldsUpdateProperty.builder()
     * .confidence(123)
     * .criticality(123)
     * .note(NoteUpdateProperty.builder()
     * .text("text")
     * .updatedBy(updatedBy)
     * .build())
     * .relatedFindings(List.of(RelatedFindingProperty.builder()
     * .id(id)
     * .productArn("productArn")
     * .build()))
     * .severity(SeverityUpdateProperty.builder()
     * .label("label")
     * .normalized(123)
     * .product(123)
     * .build())
     * .types(List.of("types"))
     * .userDefinedFields(Map.of(
     * "userDefinedFieldsKey", "userDefinedFields"))
     * .verificationState("verificationState")
     * .workflow(WorkflowUpdateProperty.builder()
     * .status("status")
     * .build())
     * .build())
     * .type("type")
     * .build()))
     * .criteria(AutomationRulesFindingFiltersProperty.builder()
     * .awsAccountId(List.of(StringFilterProperty.builder()
     * .comparison("comparison")
     * .value("value")
     * .build()))
     * .companyName(List.of(StringFilterProperty.builder()
     * .comparison("comparison")
     * .value("value")
     * .build()))
     * .complianceAssociatedStandardsId(List.of(StringFilterProperty.builder()
     * .comparison("comparison")
     * .value("value")
     * .build()))
     * .complianceSecurityControlId(List.of(StringFilterProperty.builder()
     * .comparison("comparison")
     * .value("value")
     * .build()))
     * .complianceStatus(List.of(StringFilterProperty.builder()
     * .comparison("comparison")
     * .value("value")
     * .build()))
     * .confidence(List.of(NumberFilterProperty.builder()
     * .eq(123)
     * .gte(123)
     * .lte(123)
     * .build()))
     * .createdAt(List.of(DateFilterProperty.builder()
     * .dateRange(DateRangeProperty.builder()
     * .unit("unit")
     * .value(123)
     * .build())
     * .end("end")
     * .start("start")
     * .build()))
     * .criticality(List.of(NumberFilterProperty.builder()
     * .eq(123)
     * .gte(123)
     * .lte(123)
     * .build()))
     * .description(List.of(StringFilterProperty.builder()
     * .comparison("comparison")
     * .value("value")
     * .build()))
     * .firstObservedAt(List.of(DateFilterProperty.builder()
     * .dateRange(DateRangeProperty.builder()
     * .unit("unit")
     * .value(123)
     * .build())
     * .end("end")
     * .start("start")
     * .build()))
     * .generatorId(List.of(StringFilterProperty.builder()
     * .comparison("comparison")
     * .value("value")
     * .build()))
     * .id(List.of(StringFilterProperty.builder()
     * .comparison("comparison")
     * .value("value")
     * .build()))
     * .lastObservedAt(List.of(DateFilterProperty.builder()
     * .dateRange(DateRangeProperty.builder()
     * .unit("unit")
     * .value(123)
     * .build())
     * .end("end")
     * .start("start")
     * .build()))
     * .noteText(List.of(StringFilterProperty.builder()
     * .comparison("comparison")
     * .value("value")
     * .build()))
     * .noteUpdatedAt(List.of(DateFilterProperty.builder()
     * .dateRange(DateRangeProperty.builder()
     * .unit("unit")
     * .value(123)
     * .build())
     * .end("end")
     * .start("start")
     * .build()))
     * .noteUpdatedBy(List.of(StringFilterProperty.builder()
     * .comparison("comparison")
     * .value("value")
     * .build()))
     * .productArn(List.of(StringFilterProperty.builder()
     * .comparison("comparison")
     * .value("value")
     * .build()))
     * .productName(List.of(StringFilterProperty.builder()
     * .comparison("comparison")
     * .value("value")
     * .build()))
     * .recordState(List.of(StringFilterProperty.builder()
     * .comparison("comparison")
     * .value("value")
     * .build()))
     * .relatedFindingsId(List.of(StringFilterProperty.builder()
     * .comparison("comparison")
     * .value("value")
     * .build()))
     * .relatedFindingsProductArn(List.of(StringFilterProperty.builder()
     * .comparison("comparison")
     * .value("value")
     * .build()))
     * .resourceDetailsOther(List.of(MapFilterProperty.builder()
     * .comparison("comparison")
     * .key("key")
     * .value("value")
     * .build()))
     * .resourceId(List.of(StringFilterProperty.builder()
     * .comparison("comparison")
     * .value("value")
     * .build()))
     * .resourcePartition(List.of(StringFilterProperty.builder()
     * .comparison("comparison")
     * .value("value")
     * .build()))
     * .resourceRegion(List.of(StringFilterProperty.builder()
     * .comparison("comparison")
     * .value("value")
     * .build()))
     * .resourceTags(List.of(MapFilterProperty.builder()
     * .comparison("comparison")
     * .key("key")
     * .value("value")
     * .build()))
     * .resourceType(List.of(StringFilterProperty.builder()
     * .comparison("comparison")
     * .value("value")
     * .build()))
     * .severityLabel(List.of(StringFilterProperty.builder()
     * .comparison("comparison")
     * .value("value")
     * .build()))
     * .sourceUrl(List.of(StringFilterProperty.builder()
     * .comparison("comparison")
     * .value("value")
     * .build()))
     * .title(List.of(StringFilterProperty.builder()
     * .comparison("comparison")
     * .value("value")
     * .build()))
     * .type(List.of(StringFilterProperty.builder()
     * .comparison("comparison")
     * .value("value")
     * .build()))
     * .updatedAt(List.of(DateFilterProperty.builder()
     * .dateRange(DateRangeProperty.builder()
     * .unit("unit")
     * .value(123)
     * .build())
     * .end("end")
     * .start("start")
     * .build()))
     * .userDefinedFields(List.of(MapFilterProperty.builder()
     * .comparison("comparison")
     * .key("key")
     * .value("value")
     * .build()))
     * .verificationState(List.of(StringFilterProperty.builder()
     * .comparison("comparison")
     * .value("value")
     * .build()))
     * .workflowStatus(List.of(StringFilterProperty.builder()
     * .comparison("comparison")
     * .value("value")
     * .build()))
     * .build())
     * .description("description")
     * .isTerminal(false)
     * .ruleName("ruleName")
     * .ruleOrder(123)
     * .ruleStatus("ruleStatus")
     * .tags(Map.of(
     * "tagsKey", "tags"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-automationrule.html)
     */
    public inline fun cfnAutomationRuleProps(
        block: CfnAutomationRulePropsDsl.() -> Unit = {}
    ): CfnAutomationRuleProps {
        val builder = CfnAutomationRulePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Provides details about a list of findings that the current finding relates to.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.securityhub.*;
     * Object id;
     * RelatedFindingProperty relatedFindingProperty = RelatedFindingProperty.builder()
     * .id(id)
     * .productArn("productArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-relatedfinding.html)
     */
    public inline fun cfnAutomationRuleRelatedFindingProperty(
        block: CfnAutomationRuleRelatedFindingPropertyDsl.() -> Unit = {}
    ): CfnAutomationRule.RelatedFindingProperty {
        val builder = CfnAutomationRuleRelatedFindingPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Updates to the severity information for a finding.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.securityhub.*;
     * SeverityUpdateProperty severityUpdateProperty = SeverityUpdateProperty.builder()
     * .label("label")
     * .normalized(123)
     * .product(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-severityupdate.html)
     */
    public inline fun cfnAutomationRuleSeverityUpdateProperty(
        block: CfnAutomationRuleSeverityUpdatePropertyDsl.() -> Unit = {}
    ): CfnAutomationRule.SeverityUpdateProperty {
        val builder = CfnAutomationRuleSeverityUpdatePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A string filter for querying findings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.securityhub.*;
     * StringFilterProperty stringFilterProperty = StringFilterProperty.builder()
     * .comparison("comparison")
     * .value("value")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-stringfilter.html)
     */
    public inline fun cfnAutomationRuleStringFilterProperty(
        block: CfnAutomationRuleStringFilterPropertyDsl.() -> Unit = {}
    ): CfnAutomationRule.StringFilterProperty {
        val builder = CfnAutomationRuleStringFilterPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Used to update information about the investigation into the finding.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.securityhub.*;
     * WorkflowUpdateProperty workflowUpdateProperty = WorkflowUpdateProperty.builder()
     * .status("status")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-workflowupdate.html)
     */
    public inline fun cfnAutomationRuleWorkflowUpdateProperty(
        block: CfnAutomationRuleWorkflowUpdatePropertyDsl.() -> Unit = {}
    ): CfnAutomationRule.WorkflowUpdateProperty {
        val builder = CfnAutomationRuleWorkflowUpdatePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::SecurityHub::Hub` resource specifies the enablement of the AWS Security Hub service
     * in your AWS account .
     *
     * The service is enabled in the current AWS Region or the specified Region. You create a
     * separate `Hub` resource in each Region in which you want to enable Security Hub .
     *
     * When you use this resource to enable Security Hub , default security standards are enabled.
     * To disable default standards, set the `EnableDefaultStandards` property to `false` . You can
     * use the
     * [`AWS::SecurityHub::Standard`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-standard.html)
     * resource to enable additional standards.
     *
     * When you use this resource to enable Security Hub , new controls are automatically enabled
     * for your enabled standards. To disable automatic enablement of new controls, set the
     * `AutoEnableControls` property to `false` .
     *
     * You must create an `AWS::SecurityHub::Hub` resource for an account before you can create
     * other types of Security Hub resources for the account through AWS CloudFormation . Use a
     * [DependsOn attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-dependson.html)
     * , such as `"DependsOn": "Hub"` , to ensure that you've created an `AWS::SecurityHub::Hub`
     * resource before creating other Security Hub resources for an account.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.securityhub.*;
     * Object tags;
     * CfnHub cfnHub = CfnHub.Builder.create(this, "MyCfnHub")
     * .autoEnableControls(false)
     * .controlFindingGenerator("controlFindingGenerator")
     * .enableDefaultStandards(false)
     * .tags(tags)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-hub.html)
     */
    public inline fun cfnHub(
        scope: Construct,
        id: String,
        block: CfnHubDsl.() -> Unit = {},
    ): CfnHub {
        val builder = CfnHubDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnHub`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.securityhub.*;
     * Object tags;
     * CfnHubProps cfnHubProps = CfnHubProps.builder()
     * .autoEnableControls(false)
     * .controlFindingGenerator("controlFindingGenerator")
     * .enableDefaultStandards(false)
     * .tags(tags)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-hub.html)
     */
    public inline fun cfnHubProps(block: CfnHubPropsDsl.() -> Unit = {}): CfnHubProps {
        val builder = CfnHubPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::SecurityHub::Standard` resource specifies the enablement of a security standard.
     *
     * The standard is identified by the `StandardsArn` property. To view a list of Security Hub
     * standards and their Amazon Resource Names (ARNs), use the
     * [`DescribeStandards`](https://docs.aws.amazon.com/securityhub/1.0/APIReference/API_DescribeStandards.html)
     * API operation.
     *
     * You must create a separate `AWS::SecurityHub::Standard` resource for each standard that you
     * want to enable.
     *
     * For more information about Security Hub standards, see
     * [Security Hub standards reference](https://docs.aws.amazon.com/securityhub/latest/userguide/standards-reference.html)
     * in the *AWS Security Hub User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.securityhub.*;
     * CfnStandard cfnStandard = CfnStandard.Builder.create(this, "MyCfnStandard")
     * .standardsArn("standardsArn")
     * // the properties below are optional
     * .disabledStandardsControls(List.of(StandardsControlProperty.builder()
     * .standardsControlArn("standardsControlArn")
     * // the properties below are optional
     * .reason("reason")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-standard.html)
     */
    public inline fun cfnStandard(
        scope: Construct,
        id: String,
        block: CfnStandardDsl.() -> Unit = {},
    ): CfnStandard {
        val builder = CfnStandardDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnStandard`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.securityhub.*;
     * CfnStandardProps cfnStandardProps = CfnStandardProps.builder()
     * .standardsArn("standardsArn")
     * // the properties below are optional
     * .disabledStandardsControls(List.of(StandardsControlProperty.builder()
     * .standardsControlArn("standardsControlArn")
     * // the properties below are optional
     * .reason("reason")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-standard.html)
     */
    public inline fun cfnStandardProps(
        block: CfnStandardPropsDsl.() -> Unit = {}
    ): CfnStandardProps {
        val builder = CfnStandardPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Provides details about an individual security control.
     *
     * For a list of Security Hub controls, see
     * [Security Hub controls reference](https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-controls-reference.html)
     * in the *AWS Security Hub User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.securityhub.*;
     * StandardsControlProperty standardsControlProperty = StandardsControlProperty.builder()
     * .standardsControlArn("standardsControlArn")
     * // the properties below are optional
     * .reason("reason")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-standard-standardscontrol.html)
     */
    public inline fun cfnStandardStandardsControlProperty(
        block: CfnStandardStandardsControlPropertyDsl.() -> Unit = {}
    ): CfnStandard.StandardsControlProperty {
        val builder = CfnStandardStandardsControlPropertyDsl()
        builder.apply(block)
        return builder.build()
    }
}
