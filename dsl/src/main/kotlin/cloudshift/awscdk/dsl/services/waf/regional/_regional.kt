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

package cloudshift.awscdk.dsl.services.waf.regional

import software.amazon.awscdk.services.waf.regional.CfnByteMatchSet
import software.amazon.awscdk.services.waf.regional.CfnByteMatchSetProps
import software.amazon.awscdk.services.waf.regional.CfnGeoMatchSet
import software.amazon.awscdk.services.waf.regional.CfnGeoMatchSetProps
import software.amazon.awscdk.services.waf.regional.CfnIPSet
import software.amazon.awscdk.services.waf.regional.CfnIPSetProps
import software.amazon.awscdk.services.waf.regional.CfnRateBasedRule
import software.amazon.awscdk.services.waf.regional.CfnRateBasedRuleProps
import software.amazon.awscdk.services.waf.regional.CfnRegexPatternSet
import software.amazon.awscdk.services.waf.regional.CfnRegexPatternSetProps
import software.amazon.awscdk.services.waf.regional.CfnRule
import software.amazon.awscdk.services.waf.regional.CfnRuleProps
import software.amazon.awscdk.services.waf.regional.CfnSizeConstraintSet
import software.amazon.awscdk.services.waf.regional.CfnSizeConstraintSetProps
import software.amazon.awscdk.services.waf.regional.CfnSqlInjectionMatchSet
import software.amazon.awscdk.services.waf.regional.CfnSqlInjectionMatchSetProps
import software.amazon.awscdk.services.waf.regional.CfnWebACL
import software.amazon.awscdk.services.waf.regional.CfnWebACLAssociation
import software.amazon.awscdk.services.waf.regional.CfnWebACLAssociationProps
import software.amazon.awscdk.services.waf.regional.CfnWebACLProps
import software.amazon.awscdk.services.waf.regional.CfnXssMatchSet
import software.amazon.awscdk.services.waf.regional.CfnXssMatchSetProps
import software.constructs.Construct
import kotlin.String
import kotlin.Unit

public object regional {
    public inline fun cfnByteMatchSet(
        scope: Construct,
        id: String,
        block: CfnByteMatchSetDsl.() -> Unit = {},
    ): CfnByteMatchSet {
        val builder = CfnByteMatchSetDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnByteMatchSetByteMatchTupleProperty(
        block: CfnByteMatchSetByteMatchTuplePropertyDsl.() -> Unit =
            {},
    ): CfnByteMatchSet.ByteMatchTupleProperty {
        val builder = CfnByteMatchSetByteMatchTuplePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnByteMatchSetFieldToMatchProperty(
        block: CfnByteMatchSetFieldToMatchPropertyDsl.() -> Unit =
            {},
    ): CfnByteMatchSet.FieldToMatchProperty {
        val builder = CfnByteMatchSetFieldToMatchPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnByteMatchSetProps(block: CfnByteMatchSetPropsDsl.() -> Unit = {}): CfnByteMatchSetProps {
        val builder = CfnByteMatchSetPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnGeoMatchSet(
        scope: Construct,
        id: String,
        block: CfnGeoMatchSetDsl.() -> Unit = {},
    ): CfnGeoMatchSet {
        val builder = CfnGeoMatchSetDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnGeoMatchSetGeoMatchConstraintProperty(
        block: CfnGeoMatchSetGeoMatchConstraintPropertyDsl.() -> Unit =
            {},
    ): CfnGeoMatchSet.GeoMatchConstraintProperty {
        val builder = CfnGeoMatchSetGeoMatchConstraintPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnGeoMatchSetProps(block: CfnGeoMatchSetPropsDsl.() -> Unit = {}): CfnGeoMatchSetProps {
        val builder = CfnGeoMatchSetPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnIPSet(
        scope: Construct,
        id: String,
        block: CfnIPSetDsl.() -> Unit = {},
    ): CfnIPSet {
        val builder = CfnIPSetDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnIPSetIPSetDescriptorProperty(
        block: CfnIPSetIPSetDescriptorPropertyDsl.() -> Unit =
            {},
    ): CfnIPSet.IPSetDescriptorProperty {
        val builder = CfnIPSetIPSetDescriptorPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnIPSetProps(block: CfnIPSetPropsDsl.() -> Unit = {}): CfnIPSetProps {
        val builder = CfnIPSetPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnRateBasedRule(
        scope: Construct,
        id: String,
        block: CfnRateBasedRuleDsl.() -> Unit = {},
    ): CfnRateBasedRule {
        val builder = CfnRateBasedRuleDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnRateBasedRulePredicateProperty(
        block: CfnRateBasedRulePredicatePropertyDsl.() -> Unit =
            {},
    ): CfnRateBasedRule.PredicateProperty {
        val builder = CfnRateBasedRulePredicatePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnRateBasedRuleProps(block: CfnRateBasedRulePropsDsl.() -> Unit = {}): CfnRateBasedRuleProps {
        val builder = CfnRateBasedRulePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnRegexPatternSet(
        scope: Construct,
        id: String,
        block: CfnRegexPatternSetDsl.() -> Unit = {},
    ): CfnRegexPatternSet {
        val builder = CfnRegexPatternSetDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnRegexPatternSetProps(block: CfnRegexPatternSetPropsDsl.() -> Unit = {}): CfnRegexPatternSetProps {
        val builder = CfnRegexPatternSetPropsDsl()
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

    public inline fun cfnRulePredicateProperty(block: CfnRulePredicatePropertyDsl.() -> Unit = {}): CfnRule.PredicateProperty {
        val builder = CfnRulePredicatePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnRuleProps(block: CfnRulePropsDsl.() -> Unit = {}): CfnRuleProps {
        val builder = CfnRulePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnSizeConstraintSet(
        scope: Construct,
        id: String,
        block: CfnSizeConstraintSetDsl.() -> Unit = {},
    ): CfnSizeConstraintSet {
        val builder = CfnSizeConstraintSetDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnSizeConstraintSetFieldToMatchProperty(
        block: CfnSizeConstraintSetFieldToMatchPropertyDsl.() -> Unit =
            {},
    ): CfnSizeConstraintSet.FieldToMatchProperty {
        val builder = CfnSizeConstraintSetFieldToMatchPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnSizeConstraintSetProps(block: CfnSizeConstraintSetPropsDsl.() -> Unit = {}): CfnSizeConstraintSetProps {
        val builder = CfnSizeConstraintSetPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnSizeConstraintSetSizeConstraintProperty(
        block: CfnSizeConstraintSetSizeConstraintPropertyDsl.() -> Unit =
            {},
    ): CfnSizeConstraintSet.SizeConstraintProperty {
        val builder = CfnSizeConstraintSetSizeConstraintPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnSqlInjectionMatchSet(
        scope: Construct,
        id: String,
        block: CfnSqlInjectionMatchSetDsl.() -> Unit = {},
    ): CfnSqlInjectionMatchSet {
        val builder = CfnSqlInjectionMatchSetDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnSqlInjectionMatchSetFieldToMatchProperty(
        block: CfnSqlInjectionMatchSetFieldToMatchPropertyDsl.() -> Unit =
            {},
    ): CfnSqlInjectionMatchSet.FieldToMatchProperty {
        val builder = CfnSqlInjectionMatchSetFieldToMatchPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnSqlInjectionMatchSetProps(
        block: CfnSqlInjectionMatchSetPropsDsl.() -> Unit =
            {},
    ): CfnSqlInjectionMatchSetProps {
        val builder = CfnSqlInjectionMatchSetPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnSqlInjectionMatchSetSqlInjectionMatchTupleProperty(
        block: CfnSqlInjectionMatchSetSqlInjectionMatchTuplePropertyDsl.() -> Unit =
            {},
    ): CfnSqlInjectionMatchSet.SqlInjectionMatchTupleProperty {
        val builder = CfnSqlInjectionMatchSetSqlInjectionMatchTuplePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnWebACL(
        scope: Construct,
        id: String,
        block: CfnWebACLDsl.() -> Unit = {},
    ): CfnWebACL {
        val builder = CfnWebACLDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnWebACLActionProperty(block: CfnWebACLActionPropertyDsl.() -> Unit = {}): CfnWebACL.ActionProperty {
        val builder = CfnWebACLActionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnWebACLAssociation(
        scope: Construct,
        id: String,
        block: CfnWebACLAssociationDsl.() -> Unit = {},
    ): CfnWebACLAssociation {
        val builder = CfnWebACLAssociationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnWebACLAssociationProps(block: CfnWebACLAssociationPropsDsl.() -> Unit = {}): CfnWebACLAssociationProps {
        val builder = CfnWebACLAssociationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnWebACLProps(block: CfnWebACLPropsDsl.() -> Unit = {}): CfnWebACLProps {
        val builder = CfnWebACLPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnWebACLRuleProperty(block: CfnWebACLRulePropertyDsl.() -> Unit = {}): CfnWebACL.RuleProperty {
        val builder = CfnWebACLRulePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnXssMatchSet(
        scope: Construct,
        id: String,
        block: CfnXssMatchSetDsl.() -> Unit = {},
    ): CfnXssMatchSet {
        val builder = CfnXssMatchSetDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnXssMatchSetFieldToMatchProperty(
        block: CfnXssMatchSetFieldToMatchPropertyDsl.() -> Unit =
            {},
    ): CfnXssMatchSet.FieldToMatchProperty {
        val builder = CfnXssMatchSetFieldToMatchPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnXssMatchSetProps(block: CfnXssMatchSetPropsDsl.() -> Unit = {}): CfnXssMatchSetProps {
        val builder = CfnXssMatchSetPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnXssMatchSetXssMatchTupleProperty(
        block: CfnXssMatchSetXssMatchTuplePropertyDsl.() -> Unit =
            {},
    ): CfnXssMatchSet.XssMatchTupleProperty {
        val builder = CfnXssMatchSetXssMatchTuplePropertyDsl()
        builder.apply(block)
        return builder.build()
    }
}
