@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.waf

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.waf.CfnByteMatchSet
import software.amazon.awscdk.services.waf.CfnByteMatchSetProps
import software.amazon.awscdk.services.waf.CfnIPSet
import software.amazon.awscdk.services.waf.CfnIPSetProps
import software.amazon.awscdk.services.waf.CfnRule
import software.amazon.awscdk.services.waf.CfnRuleProps
import software.amazon.awscdk.services.waf.CfnSizeConstraintSet
import software.amazon.awscdk.services.waf.CfnSizeConstraintSetProps
import software.amazon.awscdk.services.waf.CfnSqlInjectionMatchSet
import software.amazon.awscdk.services.waf.CfnSqlInjectionMatchSetProps
import software.amazon.awscdk.services.waf.CfnWebACL
import software.amazon.awscdk.services.waf.CfnWebACLProps
import software.amazon.awscdk.services.waf.CfnXssMatchSet
import software.amazon.awscdk.services.waf.CfnXssMatchSetProps
import software.constructs.Construct

public object waf {
  public inline fun cfnByteMatchSet(
    scope: Construct,
    id: String,
    block: CfnByteMatchSetDsl.() -> Unit = {},
  ): CfnByteMatchSet {
    val builder = CfnByteMatchSetDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnByteMatchSetByteMatchTupleProperty(block: CfnByteMatchSetByteMatchTuplePropertyDsl.() -> Unit
      = {}): CfnByteMatchSet.ByteMatchTupleProperty {
    val builder = CfnByteMatchSetByteMatchTuplePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnByteMatchSetFieldToMatchProperty(block: CfnByteMatchSetFieldToMatchPropertyDsl.() -> Unit
      = {}): CfnByteMatchSet.FieldToMatchProperty {
    val builder = CfnByteMatchSetFieldToMatchPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnByteMatchSetProps(block: CfnByteMatchSetPropsDsl.() -> Unit = {}):
      CfnByteMatchSetProps {
    val builder = CfnByteMatchSetPropsDsl()
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

  public inline
      fun cfnIPSetIPSetDescriptorProperty(block: CfnIPSetIPSetDescriptorPropertyDsl.() -> Unit =
      {}): CfnIPSet.IPSetDescriptorProperty {
    val builder = CfnIPSetIPSetDescriptorPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnIPSetProps(block: CfnIPSetPropsDsl.() -> Unit = {}): CfnIPSetProps {
    val builder = CfnIPSetPropsDsl()
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

  public inline fun cfnRulePredicateProperty(block: CfnRulePredicatePropertyDsl.() -> Unit = {}):
      CfnRule.PredicateProperty {
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

  public inline
      fun cfnSizeConstraintSetFieldToMatchProperty(block: CfnSizeConstraintSetFieldToMatchPropertyDsl.() -> Unit
      = {}): CfnSizeConstraintSet.FieldToMatchProperty {
    val builder = CfnSizeConstraintSetFieldToMatchPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnSizeConstraintSetProps(block: CfnSizeConstraintSetPropsDsl.() -> Unit = {}):
      CfnSizeConstraintSetProps {
    val builder = CfnSizeConstraintSetPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnSizeConstraintSetSizeConstraintProperty(block: CfnSizeConstraintSetSizeConstraintPropertyDsl.() -> Unit
      = {}): CfnSizeConstraintSet.SizeConstraintProperty {
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

  public inline
      fun cfnSqlInjectionMatchSetFieldToMatchProperty(block: CfnSqlInjectionMatchSetFieldToMatchPropertyDsl.() -> Unit
      = {}): CfnSqlInjectionMatchSet.FieldToMatchProperty {
    val builder = CfnSqlInjectionMatchSetFieldToMatchPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnSqlInjectionMatchSetProps(block: CfnSqlInjectionMatchSetPropsDsl.() -> Unit =
      {}): CfnSqlInjectionMatchSetProps {
    val builder = CfnSqlInjectionMatchSetPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnSqlInjectionMatchSetSqlInjectionMatchTupleProperty(block: CfnSqlInjectionMatchSetSqlInjectionMatchTuplePropertyDsl.() -> Unit
      = {}): CfnSqlInjectionMatchSet.SqlInjectionMatchTupleProperty {
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

  public inline
      fun cfnWebACLActivatedRuleProperty(block: CfnWebACLActivatedRulePropertyDsl.() -> Unit = {}):
      CfnWebACL.ActivatedRuleProperty {
    val builder = CfnWebACLActivatedRulePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnWebACLProps(block: CfnWebACLPropsDsl.() -> Unit = {}): CfnWebACLProps {
    val builder = CfnWebACLPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnWebACLWafActionProperty(block: CfnWebACLWafActionPropertyDsl.() -> Unit =
      {}): CfnWebACL.WafActionProperty {
    val builder = CfnWebACLWafActionPropertyDsl()
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

  public inline
      fun cfnXssMatchSetFieldToMatchProperty(block: CfnXssMatchSetFieldToMatchPropertyDsl.() -> Unit
      = {}): CfnXssMatchSet.FieldToMatchProperty {
    val builder = CfnXssMatchSetFieldToMatchPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnXssMatchSetProps(block: CfnXssMatchSetPropsDsl.() -> Unit = {}):
      CfnXssMatchSetProps {
    val builder = CfnXssMatchSetPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnXssMatchSetXssMatchTupleProperty(block: CfnXssMatchSetXssMatchTuplePropertyDsl.() -> Unit
      = {}): CfnXssMatchSet.XssMatchTupleProperty {
    val builder = CfnXssMatchSetXssMatchTuplePropertyDsl()
    builder.apply(block)
    return builder.build()
  }
}
