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

package cloudshift.awscdk.dsl.services.securityhub

import software.amazon.awscdk.services.securityhub.CfnAutomationRule
import software.amazon.awscdk.services.securityhub.CfnAutomationRuleProps
import software.amazon.awscdk.services.securityhub.CfnHub
import software.amazon.awscdk.services.securityhub.CfnHubProps
import software.amazon.awscdk.services.securityhub.CfnStandard
import software.amazon.awscdk.services.securityhub.CfnStandardProps
import software.constructs.Construct
import kotlin.String
import kotlin.Unit

public object securityhub {
    public inline fun cfnAutomationRule(
        scope: Construct,
        id: String,
        block: CfnAutomationRuleDsl.() -> Unit = {},
    ): CfnAutomationRule {
        val builder = CfnAutomationRuleDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnAutomationRuleAutomationRulesActionProperty(
        block: CfnAutomationRuleAutomationRulesActionPropertyDsl.() -> Unit =
            {},
    ): CfnAutomationRule.AutomationRulesActionProperty {
        val builder = CfnAutomationRuleAutomationRulesActionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnAutomationRuleAutomationRulesFindingFieldsUpdateProperty(
        block: CfnAutomationRuleAutomationRulesFindingFieldsUpdatePropertyDsl.() -> Unit =
            {},
    ): CfnAutomationRule.AutomationRulesFindingFieldsUpdateProperty {
        val builder = CfnAutomationRuleAutomationRulesFindingFieldsUpdatePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnAutomationRuleAutomationRulesFindingFiltersProperty(
        block: CfnAutomationRuleAutomationRulesFindingFiltersPropertyDsl.() -> Unit =
            {},
    ): CfnAutomationRule.AutomationRulesFindingFiltersProperty {
        val builder = CfnAutomationRuleAutomationRulesFindingFiltersPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnAutomationRuleDateFilterProperty(
        block: CfnAutomationRuleDateFilterPropertyDsl.() -> Unit =
            {},
    ): CfnAutomationRule.DateFilterProperty {
        val builder = CfnAutomationRuleDateFilterPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnAutomationRuleDateRangeProperty(
        block: CfnAutomationRuleDateRangePropertyDsl.() -> Unit =
            {},
    ): CfnAutomationRule.DateRangeProperty {
        val builder = CfnAutomationRuleDateRangePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnAutomationRuleMapFilterProperty(
        block: CfnAutomationRuleMapFilterPropertyDsl.() -> Unit =
            {},
    ): CfnAutomationRule.MapFilterProperty {
        val builder = CfnAutomationRuleMapFilterPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnAutomationRuleNoteUpdateProperty(
        block: CfnAutomationRuleNoteUpdatePropertyDsl.() -> Unit =
            {},
    ): CfnAutomationRule.NoteUpdateProperty {
        val builder = CfnAutomationRuleNoteUpdatePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnAutomationRuleNumberFilterProperty(
        block: CfnAutomationRuleNumberFilterPropertyDsl.() -> Unit =
            {},
    ): CfnAutomationRule.NumberFilterProperty {
        val builder = CfnAutomationRuleNumberFilterPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnAutomationRuleProps(block: CfnAutomationRulePropsDsl.() -> Unit = {}): CfnAutomationRuleProps {
        val builder = CfnAutomationRulePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnAutomationRuleRelatedFindingProperty(
        block: CfnAutomationRuleRelatedFindingPropertyDsl.() -> Unit =
            {},
    ): CfnAutomationRule.RelatedFindingProperty {
        val builder = CfnAutomationRuleRelatedFindingPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnAutomationRuleSeverityUpdateProperty(
        block: CfnAutomationRuleSeverityUpdatePropertyDsl.() -> Unit =
            {},
    ): CfnAutomationRule.SeverityUpdateProperty {
        val builder = CfnAutomationRuleSeverityUpdatePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnAutomationRuleStringFilterProperty(
        block: CfnAutomationRuleStringFilterPropertyDsl.() -> Unit =
            {},
    ): CfnAutomationRule.StringFilterProperty {
        val builder = CfnAutomationRuleStringFilterPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnAutomationRuleWorkflowUpdateProperty(
        block: CfnAutomationRuleWorkflowUpdatePropertyDsl.() -> Unit =
            {},
    ): CfnAutomationRule.WorkflowUpdateProperty {
        val builder = CfnAutomationRuleWorkflowUpdatePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnHub(
        scope: Construct,
        id: String,
        block: CfnHubDsl.() -> Unit = {},
    ): CfnHub {
        val builder = CfnHubDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnHubProps(block: CfnHubPropsDsl.() -> Unit = {}): CfnHubProps {
        val builder = CfnHubPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnStandard(
        scope: Construct,
        id: String,
        block: CfnStandardDsl.() -> Unit = {},
    ): CfnStandard {
        val builder = CfnStandardDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnStandardProps(block: CfnStandardPropsDsl.() -> Unit = {}): CfnStandardProps {
        val builder = CfnStandardPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnStandardStandardsControlProperty(
        block: CfnStandardStandardsControlPropertyDsl.() -> Unit =
            {},
    ): CfnStandard.StandardsControlProperty {
        val builder = CfnStandardStandardsControlPropertyDsl()
        builder.apply(block)
        return builder.build()
    }
}
