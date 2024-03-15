@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String

/**
 * A Condition for use in a Choice state branch.
 *
 * Example:
 *
 * ```
 * Map map = Map.Builder.create(this, "Map State")
 * .maxConcurrency(1)
 * .itemsPath(JsonPath.stringAt("$.inputForMap"))
 * .itemSelector(Map.of(
 * "item", JsonPath.stringAt("$.Map.Item.Value")))
 * .resultPath("$.mapOutput")
 * .build();
 * // The Map iterator can contain a IChainable, which can be an individual or multiple steps
 * chained together.
 * // Below example is with a Choice and Pass step
 * Choice choice = new Choice(this, "Choice");
 * Condition condition1 = Condition.stringEquals("$.item.status", "SUCCESS");
 * Pass step1 = new Pass(this, "Step1");
 * Pass step2 = new Pass(this, "Step2");
 * Pass finish = new Pass(this, "Finish");
 * Chain definition = choice.when(condition1, step1).otherwise(step2).afterwards().next(finish);
 * map.itemProcessor(definition);
 * ```
 */
public abstract class Condition internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.stepfunctions.Condition,
) : CdkObject(cdkObject) {
  /**
   * Render Amazon States Language JSON for the condition.
   */
  public open fun renderCondition(): Any = unwrap(this).renderCondition()

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.stepfunctions.Condition,
  ) : Condition(cdkObject)

  public companion object {
    public fun and(conditions: Condition): Condition =
        software.amazon.awscdk.services.stepfunctions.Condition.and(conditions.let(Condition::unwrap)).let(Condition::wrap)

    public fun booleanEquals(variable: String, `value`: Boolean): Condition =
        software.amazon.awscdk.services.stepfunctions.Condition.booleanEquals(variable,
        `value`).let(Condition::wrap)

    public fun booleanEqualsJsonPath(variable: String, `value`: String): Condition =
        software.amazon.awscdk.services.stepfunctions.Condition.booleanEqualsJsonPath(variable,
        `value`).let(Condition::wrap)

    public fun isBoolean(variable: String): Condition =
        software.amazon.awscdk.services.stepfunctions.Condition.isBoolean(variable).let(Condition::wrap)

    public fun isNotBoolean(variable: String): Condition =
        software.amazon.awscdk.services.stepfunctions.Condition.isNotBoolean(variable).let(Condition::wrap)

    public fun isNotNull(variable: String): Condition =
        software.amazon.awscdk.services.stepfunctions.Condition.isNotNull(variable).let(Condition::wrap)

    public fun isNotNumeric(variable: String): Condition =
        software.amazon.awscdk.services.stepfunctions.Condition.isNotNumeric(variable).let(Condition::wrap)

    public fun isNotPresent(variable: String): Condition =
        software.amazon.awscdk.services.stepfunctions.Condition.isNotPresent(variable).let(Condition::wrap)

    public fun isNotString(variable: String): Condition =
        software.amazon.awscdk.services.stepfunctions.Condition.isNotString(variable).let(Condition::wrap)

    public fun isNotTimestamp(variable: String): Condition =
        software.amazon.awscdk.services.stepfunctions.Condition.isNotTimestamp(variable).let(Condition::wrap)

    public fun isNull(variable: String): Condition =
        software.amazon.awscdk.services.stepfunctions.Condition.isNull(variable).let(Condition::wrap)

    public fun isNumeric(variable: String): Condition =
        software.amazon.awscdk.services.stepfunctions.Condition.isNumeric(variable).let(Condition::wrap)

    public fun isPresent(variable: String): Condition =
        software.amazon.awscdk.services.stepfunctions.Condition.isPresent(variable).let(Condition::wrap)

    public fun isString(variable: String): Condition =
        software.amazon.awscdk.services.stepfunctions.Condition.isString(variable).let(Condition::wrap)

    public fun isTimestamp(variable: String): Condition =
        software.amazon.awscdk.services.stepfunctions.Condition.isTimestamp(variable).let(Condition::wrap)

    public fun not(condition: Condition): Condition =
        software.amazon.awscdk.services.stepfunctions.Condition.not(condition.let(Condition::unwrap)).let(Condition::wrap)

    public fun numberEquals(variable: String, `value`: Number): Condition =
        software.amazon.awscdk.services.stepfunctions.Condition.numberEquals(variable,
        `value`).let(Condition::wrap)

    public fun numberEqualsJsonPath(variable: String, `value`: String): Condition =
        software.amazon.awscdk.services.stepfunctions.Condition.numberEqualsJsonPath(variable,
        `value`).let(Condition::wrap)

    public fun numberGreaterThan(variable: String, `value`: Number): Condition =
        software.amazon.awscdk.services.stepfunctions.Condition.numberGreaterThan(variable,
        `value`).let(Condition::wrap)

    public fun numberGreaterThanEquals(variable: String, `value`: Number): Condition =
        software.amazon.awscdk.services.stepfunctions.Condition.numberGreaterThanEquals(variable,
        `value`).let(Condition::wrap)

    public fun numberGreaterThanEqualsJsonPath(variable: String, `value`: String): Condition =
        software.amazon.awscdk.services.stepfunctions.Condition.numberGreaterThanEqualsJsonPath(variable,
        `value`).let(Condition::wrap)

    public fun numberGreaterThanJsonPath(variable: String, `value`: String): Condition =
        software.amazon.awscdk.services.stepfunctions.Condition.numberGreaterThanJsonPath(variable,
        `value`).let(Condition::wrap)

    public fun numberLessThan(variable: String, `value`: Number): Condition =
        software.amazon.awscdk.services.stepfunctions.Condition.numberLessThan(variable,
        `value`).let(Condition::wrap)

    public fun numberLessThanEquals(variable: String, `value`: Number): Condition =
        software.amazon.awscdk.services.stepfunctions.Condition.numberLessThanEquals(variable,
        `value`).let(Condition::wrap)

    public fun numberLessThanEqualsJsonPath(variable: String, `value`: String): Condition =
        software.amazon.awscdk.services.stepfunctions.Condition.numberLessThanEqualsJsonPath(variable,
        `value`).let(Condition::wrap)

    public fun numberLessThanJsonPath(variable: String, `value`: String): Condition =
        software.amazon.awscdk.services.stepfunctions.Condition.numberLessThanJsonPath(variable,
        `value`).let(Condition::wrap)

    public fun or(conditions: Condition): Condition =
        software.amazon.awscdk.services.stepfunctions.Condition.or(conditions.let(Condition::unwrap)).let(Condition::wrap)

    public fun stringEquals(variable: String, `value`: String): Condition =
        software.amazon.awscdk.services.stepfunctions.Condition.stringEquals(variable,
        `value`).let(Condition::wrap)

    public fun stringEqualsJsonPath(variable: String, `value`: String): Condition =
        software.amazon.awscdk.services.stepfunctions.Condition.stringEqualsJsonPath(variable,
        `value`).let(Condition::wrap)

    public fun stringGreaterThan(variable: String, `value`: String): Condition =
        software.amazon.awscdk.services.stepfunctions.Condition.stringGreaterThan(variable,
        `value`).let(Condition::wrap)

    public fun stringGreaterThanEquals(variable: String, `value`: String): Condition =
        software.amazon.awscdk.services.stepfunctions.Condition.stringGreaterThanEquals(variable,
        `value`).let(Condition::wrap)

    public fun stringGreaterThanEqualsJsonPath(variable: String, `value`: String): Condition =
        software.amazon.awscdk.services.stepfunctions.Condition.stringGreaterThanEqualsJsonPath(variable,
        `value`).let(Condition::wrap)

    public fun stringGreaterThanJsonPath(variable: String, `value`: String): Condition =
        software.amazon.awscdk.services.stepfunctions.Condition.stringGreaterThanJsonPath(variable,
        `value`).let(Condition::wrap)

    public fun stringLessThan(variable: String, `value`: String): Condition =
        software.amazon.awscdk.services.stepfunctions.Condition.stringLessThan(variable,
        `value`).let(Condition::wrap)

    public fun stringLessThanEquals(variable: String, `value`: String): Condition =
        software.amazon.awscdk.services.stepfunctions.Condition.stringLessThanEquals(variable,
        `value`).let(Condition::wrap)

    public fun stringLessThanEqualsJsonPath(variable: String, `value`: String): Condition =
        software.amazon.awscdk.services.stepfunctions.Condition.stringLessThanEqualsJsonPath(variable,
        `value`).let(Condition::wrap)

    public fun stringLessThanJsonPath(variable: String, `value`: String): Condition =
        software.amazon.awscdk.services.stepfunctions.Condition.stringLessThanJsonPath(variable,
        `value`).let(Condition::wrap)

    public fun stringMatches(variable: String, `value`: String): Condition =
        software.amazon.awscdk.services.stepfunctions.Condition.stringMatches(variable,
        `value`).let(Condition::wrap)

    public fun timestampEquals(variable: String, `value`: String): Condition =
        software.amazon.awscdk.services.stepfunctions.Condition.timestampEquals(variable,
        `value`).let(Condition::wrap)

    public fun timestampEqualsJsonPath(variable: String, `value`: String): Condition =
        software.amazon.awscdk.services.stepfunctions.Condition.timestampEqualsJsonPath(variable,
        `value`).let(Condition::wrap)

    public fun timestampGreaterThan(variable: String, `value`: String): Condition =
        software.amazon.awscdk.services.stepfunctions.Condition.timestampGreaterThan(variable,
        `value`).let(Condition::wrap)

    public fun timestampGreaterThanEquals(variable: String, `value`: String): Condition =
        software.amazon.awscdk.services.stepfunctions.Condition.timestampGreaterThanEquals(variable,
        `value`).let(Condition::wrap)

    public fun timestampGreaterThanEqualsJsonPath(variable: String, `value`: String): Condition =
        software.amazon.awscdk.services.stepfunctions.Condition.timestampGreaterThanEqualsJsonPath(variable,
        `value`).let(Condition::wrap)

    public fun timestampGreaterThanJsonPath(variable: String, `value`: String): Condition =
        software.amazon.awscdk.services.stepfunctions.Condition.timestampGreaterThanJsonPath(variable,
        `value`).let(Condition::wrap)

    public fun timestampLessThan(variable: String, `value`: String): Condition =
        software.amazon.awscdk.services.stepfunctions.Condition.timestampLessThan(variable,
        `value`).let(Condition::wrap)

    public fun timestampLessThanEquals(variable: String, `value`: String): Condition =
        software.amazon.awscdk.services.stepfunctions.Condition.timestampLessThanEquals(variable,
        `value`).let(Condition::wrap)

    public fun timestampLessThanEqualsJsonPath(variable: String, `value`: String): Condition =
        software.amazon.awscdk.services.stepfunctions.Condition.timestampLessThanEqualsJsonPath(variable,
        `value`).let(Condition::wrap)

    public fun timestampLessThanJsonPath(variable: String, `value`: String): Condition =
        software.amazon.awscdk.services.stepfunctions.Condition.timestampLessThanJsonPath(variable,
        `value`).let(Condition::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.Condition): Condition
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: Condition): software.amazon.awscdk.services.stepfunctions.Condition
        = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.stepfunctions.Condition
  }
}
