package io.cloudshiftdev.awscdk.services.stepfunctions

import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String

public abstract class Condition internal constructor(
  private val cdkObject: software.amazon.awscdk.services.stepfunctions.Condition,
) {
  public open fun renderCondition(): Any = unwrap(this).renderCondition()

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.stepfunctions.Condition,
  ) : Condition(cdkObject)

  public companion object {
    public open fun and(conditions: Condition): Condition =
        software.amazon.awscdk.services.stepfunctions.Condition.and(conditions.let(Condition::unwrap)).let(Condition::wrap)

    public open fun booleanEquals(variable: String, `value`: Boolean): Condition =
        software.amazon.awscdk.services.stepfunctions.Condition.booleanEquals(variable,
        `value`).let(Condition::wrap)

    public open fun booleanEqualsJsonPath(variable: String, `value`: String): Condition =
        software.amazon.awscdk.services.stepfunctions.Condition.booleanEqualsJsonPath(variable,
        `value`).let(Condition::wrap)

    public open fun isBoolean(variable: String): Condition =
        software.amazon.awscdk.services.stepfunctions.Condition.isBoolean(variable).let(Condition::wrap)

    public open fun isNotBoolean(variable: String): Condition =
        software.amazon.awscdk.services.stepfunctions.Condition.isNotBoolean(variable).let(Condition::wrap)

    public open fun isNotNull(variable: String): Condition =
        software.amazon.awscdk.services.stepfunctions.Condition.isNotNull(variable).let(Condition::wrap)

    public open fun isNotNumeric(variable: String): Condition =
        software.amazon.awscdk.services.stepfunctions.Condition.isNotNumeric(variable).let(Condition::wrap)

    public open fun isNotPresent(variable: String): Condition =
        software.amazon.awscdk.services.stepfunctions.Condition.isNotPresent(variable).let(Condition::wrap)

    public open fun isNotString(variable: String): Condition =
        software.amazon.awscdk.services.stepfunctions.Condition.isNotString(variable).let(Condition::wrap)

    public open fun isNotTimestamp(variable: String): Condition =
        software.amazon.awscdk.services.stepfunctions.Condition.isNotTimestamp(variable).let(Condition::wrap)

    public open fun isNull(variable: String): Condition =
        software.amazon.awscdk.services.stepfunctions.Condition.isNull(variable).let(Condition::wrap)

    public open fun isNumeric(variable: String): Condition =
        software.amazon.awscdk.services.stepfunctions.Condition.isNumeric(variable).let(Condition::wrap)

    public open fun isPresent(variable: String): Condition =
        software.amazon.awscdk.services.stepfunctions.Condition.isPresent(variable).let(Condition::wrap)

    public open fun isString(variable: String): Condition =
        software.amazon.awscdk.services.stepfunctions.Condition.isString(variable).let(Condition::wrap)

    public open fun isTimestamp(variable: String): Condition =
        software.amazon.awscdk.services.stepfunctions.Condition.isTimestamp(variable).let(Condition::wrap)

    public open fun not(condition: Condition): Condition =
        software.amazon.awscdk.services.stepfunctions.Condition.not(condition.let(Condition::unwrap)).let(Condition::wrap)

    public open fun numberEquals(variable: String, `value`: Number): Condition =
        software.amazon.awscdk.services.stepfunctions.Condition.numberEquals(variable,
        `value`).let(Condition::wrap)

    public open fun numberEqualsJsonPath(variable: String, `value`: String): Condition =
        software.amazon.awscdk.services.stepfunctions.Condition.numberEqualsJsonPath(variable,
        `value`).let(Condition::wrap)

    public open fun numberGreaterThan(variable: String, `value`: Number): Condition =
        software.amazon.awscdk.services.stepfunctions.Condition.numberGreaterThan(variable,
        `value`).let(Condition::wrap)

    public open fun numberGreaterThanEquals(variable: String, `value`: Number): Condition =
        software.amazon.awscdk.services.stepfunctions.Condition.numberGreaterThanEquals(variable,
        `value`).let(Condition::wrap)

    public open fun numberGreaterThanEqualsJsonPath(variable: String, `value`: String): Condition =
        software.amazon.awscdk.services.stepfunctions.Condition.numberGreaterThanEqualsJsonPath(variable,
        `value`).let(Condition::wrap)

    public open fun numberGreaterThanJsonPath(variable: String, `value`: String): Condition =
        software.amazon.awscdk.services.stepfunctions.Condition.numberGreaterThanJsonPath(variable,
        `value`).let(Condition::wrap)

    public open fun numberLessThan(variable: String, `value`: Number): Condition =
        software.amazon.awscdk.services.stepfunctions.Condition.numberLessThan(variable,
        `value`).let(Condition::wrap)

    public open fun numberLessThanEquals(variable: String, `value`: Number): Condition =
        software.amazon.awscdk.services.stepfunctions.Condition.numberLessThanEquals(variable,
        `value`).let(Condition::wrap)

    public open fun numberLessThanEqualsJsonPath(variable: String, `value`: String): Condition =
        software.amazon.awscdk.services.stepfunctions.Condition.numberLessThanEqualsJsonPath(variable,
        `value`).let(Condition::wrap)

    public open fun numberLessThanJsonPath(variable: String, `value`: String): Condition =
        software.amazon.awscdk.services.stepfunctions.Condition.numberLessThanJsonPath(variable,
        `value`).let(Condition::wrap)

    public open fun or(conditions: Condition): Condition =
        software.amazon.awscdk.services.stepfunctions.Condition.or(conditions.let(Condition::unwrap)).let(Condition::wrap)

    public open fun stringEquals(variable: String, `value`: String): Condition =
        software.amazon.awscdk.services.stepfunctions.Condition.stringEquals(variable,
        `value`).let(Condition::wrap)

    public open fun stringEqualsJsonPath(variable: String, `value`: String): Condition =
        software.amazon.awscdk.services.stepfunctions.Condition.stringEqualsJsonPath(variable,
        `value`).let(Condition::wrap)

    public open fun stringGreaterThan(variable: String, `value`: String): Condition =
        software.amazon.awscdk.services.stepfunctions.Condition.stringGreaterThan(variable,
        `value`).let(Condition::wrap)

    public open fun stringGreaterThanEquals(variable: String, `value`: String): Condition =
        software.amazon.awscdk.services.stepfunctions.Condition.stringGreaterThanEquals(variable,
        `value`).let(Condition::wrap)

    public open fun stringGreaterThanEqualsJsonPath(variable: String, `value`: String): Condition =
        software.amazon.awscdk.services.stepfunctions.Condition.stringGreaterThanEqualsJsonPath(variable,
        `value`).let(Condition::wrap)

    public open fun stringGreaterThanJsonPath(variable: String, `value`: String): Condition =
        software.amazon.awscdk.services.stepfunctions.Condition.stringGreaterThanJsonPath(variable,
        `value`).let(Condition::wrap)

    public open fun stringLessThan(variable: String, `value`: String): Condition =
        software.amazon.awscdk.services.stepfunctions.Condition.stringLessThan(variable,
        `value`).let(Condition::wrap)

    public open fun stringLessThanEquals(variable: String, `value`: String): Condition =
        software.amazon.awscdk.services.stepfunctions.Condition.stringLessThanEquals(variable,
        `value`).let(Condition::wrap)

    public open fun stringLessThanEqualsJsonPath(variable: String, `value`: String): Condition =
        software.amazon.awscdk.services.stepfunctions.Condition.stringLessThanEqualsJsonPath(variable,
        `value`).let(Condition::wrap)

    public open fun stringLessThanJsonPath(variable: String, `value`: String): Condition =
        software.amazon.awscdk.services.stepfunctions.Condition.stringLessThanJsonPath(variable,
        `value`).let(Condition::wrap)

    public open fun stringMatches(variable: String, `value`: String): Condition =
        software.amazon.awscdk.services.stepfunctions.Condition.stringMatches(variable,
        `value`).let(Condition::wrap)

    public open fun timestampEquals(variable: String, `value`: String): Condition =
        software.amazon.awscdk.services.stepfunctions.Condition.timestampEquals(variable,
        `value`).let(Condition::wrap)

    public open fun timestampEqualsJsonPath(variable: String, `value`: String): Condition =
        software.amazon.awscdk.services.stepfunctions.Condition.timestampEqualsJsonPath(variable,
        `value`).let(Condition::wrap)

    public open fun timestampGreaterThan(variable: String, `value`: String): Condition =
        software.amazon.awscdk.services.stepfunctions.Condition.timestampGreaterThan(variable,
        `value`).let(Condition::wrap)

    public open fun timestampGreaterThanEquals(variable: String, `value`: String): Condition =
        software.amazon.awscdk.services.stepfunctions.Condition.timestampGreaterThanEquals(variable,
        `value`).let(Condition::wrap)

    public open fun timestampGreaterThanEqualsJsonPath(variable: String, `value`: String): Condition
        =
        software.amazon.awscdk.services.stepfunctions.Condition.timestampGreaterThanEqualsJsonPath(variable,
        `value`).let(Condition::wrap)

    public open fun timestampGreaterThanJsonPath(variable: String, `value`: String): Condition =
        software.amazon.awscdk.services.stepfunctions.Condition.timestampGreaterThanJsonPath(variable,
        `value`).let(Condition::wrap)

    public open fun timestampLessThan(variable: String, `value`: String): Condition =
        software.amazon.awscdk.services.stepfunctions.Condition.timestampLessThan(variable,
        `value`).let(Condition::wrap)

    public open fun timestampLessThanEquals(variable: String, `value`: String): Condition =
        software.amazon.awscdk.services.stepfunctions.Condition.timestampLessThanEquals(variable,
        `value`).let(Condition::wrap)

    public open fun timestampLessThanEqualsJsonPath(variable: String, `value`: String): Condition =
        software.amazon.awscdk.services.stepfunctions.Condition.timestampLessThanEqualsJsonPath(variable,
        `value`).let(Condition::wrap)

    public open fun timestampLessThanJsonPath(variable: String, `value`: String): Condition =
        software.amazon.awscdk.services.stepfunctions.Condition.timestampLessThanJsonPath(variable,
        `value`).let(Condition::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.Condition): Condition
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: Condition): software.amazon.awscdk.services.stepfunctions.Condition
        = (wrapped as Wrapper).cdkObject
  }
}
