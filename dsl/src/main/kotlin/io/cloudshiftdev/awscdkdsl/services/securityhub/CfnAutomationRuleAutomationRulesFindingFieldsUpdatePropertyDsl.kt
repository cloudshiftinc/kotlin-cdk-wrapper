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

package io.cloudshiftdev.awscdkdsl.services.securityhub

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.securityhub.CfnAutomationRule

/**
 * Identifies the finding fields that the automation rule action updates when a finding matches the
 * defined criteria.
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
@CdkDslMarker
public class CfnAutomationRuleAutomationRulesFindingFieldsUpdatePropertyDsl {
    private val cdkBuilder: CfnAutomationRule.AutomationRulesFindingFieldsUpdateProperty.Builder =
        CfnAutomationRule.AutomationRulesFindingFieldsUpdateProperty.builder()

    private val _relatedFindings: MutableList<Any> = mutableListOf()

    private val _types: MutableList<String> = mutableListOf()

    /** @param confidence The rule action updates the `Confidence` field of a finding. */
    public fun confidence(confidence: Number) {
        cdkBuilder.confidence(confidence)
    }

    /** @param criticality The rule action updates the `Criticality` field of a finding. */
    public fun criticality(criticality: Number) {
        cdkBuilder.criticality(criticality)
    }

    /** @param note The rule action will update the `Note` field of a finding. */
    public fun note(note: IResolvable) {
        cdkBuilder.note(note)
    }

    /** @param note The rule action will update the `Note` field of a finding. */
    public fun note(note: CfnAutomationRule.NoteUpdateProperty) {
        cdkBuilder.note(note)
    }

    /**
     * @param relatedFindings The rule action will update the `RelatedFindings` field of a finding.
     */
    public fun relatedFindings(vararg relatedFindings: Any) {
        _relatedFindings.addAll(listOf(*relatedFindings))
    }

    /**
     * @param relatedFindings The rule action will update the `RelatedFindings` field of a finding.
     */
    public fun relatedFindings(relatedFindings: Collection<Any>) {
        _relatedFindings.addAll(relatedFindings)
    }

    /**
     * @param relatedFindings The rule action will update the `RelatedFindings` field of a finding.
     */
    public fun relatedFindings(relatedFindings: IResolvable) {
        cdkBuilder.relatedFindings(relatedFindings)
    }

    /** @param severity The rule action will update the `Severity` field of a finding. */
    public fun severity(severity: IResolvable) {
        cdkBuilder.severity(severity)
    }

    /** @param severity The rule action will update the `Severity` field of a finding. */
    public fun severity(severity: CfnAutomationRule.SeverityUpdateProperty) {
        cdkBuilder.severity(severity)
    }

    /** @param types The rule action updates the `Types` field of a finding. */
    public fun types(vararg types: String) {
        _types.addAll(listOf(*types))
    }

    /** @param types The rule action updates the `Types` field of a finding. */
    public fun types(types: Collection<String>) {
        _types.addAll(types)
    }

    /**
     * @param userDefinedFields The rule action updates the `UserDefinedFields` field of a finding.
     */
    public fun userDefinedFields(userDefinedFields: Map<String, String>) {
        cdkBuilder.userDefinedFields(userDefinedFields)
    }

    /**
     * @param userDefinedFields The rule action updates the `UserDefinedFields` field of a finding.
     */
    public fun userDefinedFields(userDefinedFields: IResolvable) {
        cdkBuilder.userDefinedFields(userDefinedFields)
    }

    /**
     * @param verificationState The rule action updates the `VerificationState` field of a finding.
     */
    public fun verificationState(verificationState: String) {
        cdkBuilder.verificationState(verificationState)
    }

    /** @param workflow The rule action will update the `Workflow` field of a finding. */
    public fun workflow(workflow: IResolvable) {
        cdkBuilder.workflow(workflow)
    }

    /** @param workflow The rule action will update the `Workflow` field of a finding. */
    public fun workflow(workflow: CfnAutomationRule.WorkflowUpdateProperty) {
        cdkBuilder.workflow(workflow)
    }

    public fun build(): CfnAutomationRule.AutomationRulesFindingFieldsUpdateProperty {
        if (_relatedFindings.isNotEmpty()) cdkBuilder.relatedFindings(_relatedFindings)
        if (_types.isNotEmpty()) cdkBuilder.types(_types)
        return cdkBuilder.build()
    }
}
