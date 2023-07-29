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

package cloudshift.awscdk.dsl.services.guardduty

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.guardduty.CfnFilter

/**
 * Specifies the condition to apply to a single field when filtering through GuardDuty findings.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.guardduty.*;
 * ConditionProperty conditionProperty = ConditionProperty.builder()
 * .eq(List.of("eq"))
 * .equalTo(List.of("equalTo"))
 * .greaterThan(123)
 * .greaterThanOrEqual(123)
 * .gt(123)
 * .gte(123)
 * .lessThan(123)
 * .lessThanOrEqual(123)
 * .lt(123)
 * .lte(123)
 * .neq(List.of("neq"))
 * .notEquals(List.of("notEquals"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-filter-condition.html)
 */
@CdkDslMarker
public class CfnFilterConditionPropertyDsl {
    private val cdkBuilder: CfnFilter.ConditionProperty.Builder =
        CfnFilter.ConditionProperty.builder()

    private val _eq: MutableList<String> = mutableListOf()

    private val _equalTo: MutableList<String> = mutableListOf()

    private val _neq: MutableList<String> = mutableListOf()

    private val _notEquals: MutableList<String> = mutableListOf()

    /**
     * @param eq Represents the equal condition to apply to a single field when querying for
     *   findings.
     */
    public fun eq(vararg eq: String) {
        _eq.addAll(listOf(*eq))
    }

    /**
     * @param eq Represents the equal condition to apply to a single field when querying for
     *   findings.
     */
    public fun eq(eq: Collection<String>) {
        _eq.addAll(eq)
    }

    /**
     * @param equalTo Represents an *equal* ** condition to be applied to a single field when
     *   querying for findings.
     */
    public fun equalTo(vararg equalTo: String) {
        _equalTo.addAll(listOf(*equalTo))
    }

    /**
     * @param equalTo Represents an *equal* ** condition to be applied to a single field when
     *   querying for findings.
     */
    public fun equalTo(equalTo: Collection<String>) {
        _equalTo.addAll(equalTo)
    }

    /**
     * @param greaterThan Represents a *greater than* condition to be applied to a single field when
     *   querying for findings.
     */
    public fun greaterThan(greaterThan: Number) {
        cdkBuilder.greaterThan(greaterThan)
    }

    /**
     * @param greaterThanOrEqual Represents a *greater than or equal* condition to be applied to a
     *   single field when querying for findings.
     */
    public fun greaterThanOrEqual(greaterThanOrEqual: Number) {
        cdkBuilder.greaterThanOrEqual(greaterThanOrEqual)
    }

    /**
     * @param gt Represents a *greater than* condition to be applied to a single field when querying
     *   for findings.
     */
    public fun gt(gt: Number) {
        cdkBuilder.gt(gt)
    }

    /**
     * @param gte Represents the greater than or equal condition to apply to a single field when
     *   querying for findings.
     */
    public fun gte(gte: Number) {
        cdkBuilder.gte(gte)
    }

    /**
     * @param lessThan Represents a *less than* condition to be applied to a single field when
     *   querying for findings.
     */
    public fun lessThan(lessThan: Number) {
        cdkBuilder.lessThan(lessThan)
    }

    /**
     * @param lessThanOrEqual Represents a *less than or equal* condition to be applied to a single
     *   field when querying for findings.
     */
    public fun lessThanOrEqual(lessThanOrEqual: Number) {
        cdkBuilder.lessThanOrEqual(lessThanOrEqual)
    }

    /**
     * @param lt Represents the less than condition to apply to a single field when querying for
     *   findings.
     */
    public fun lt(lt: Number) {
        cdkBuilder.lt(lt)
    }

    /**
     * @param lte Represents the less than or equal condition to apply to a single field when
     *   querying for findings.
     */
    public fun lte(lte: Number) {
        cdkBuilder.lte(lte)
    }

    /**
     * @param neq Represents the not equal condition to apply to a single field when querying for
     *   findings.
     */
    public fun neq(vararg neq: String) {
        _neq.addAll(listOf(*neq))
    }

    /**
     * @param neq Represents the not equal condition to apply to a single field when querying for
     *   findings.
     */
    public fun neq(neq: Collection<String>) {
        _neq.addAll(neq)
    }

    /**
     * @param notEquals Represents a *not equal* ** condition to be applied to a single field when
     *   querying for findings.
     */
    public fun notEquals(vararg notEquals: String) {
        _notEquals.addAll(listOf(*notEquals))
    }

    /**
     * @param notEquals Represents a *not equal* ** condition to be applied to a single field when
     *   querying for findings.
     */
    public fun notEquals(notEquals: Collection<String>) {
        _notEquals.addAll(notEquals)
    }

    public fun build(): CfnFilter.ConditionProperty {
        if (_eq.isNotEmpty()) cdkBuilder.eq(_eq)
        if (_equalTo.isNotEmpty()) cdkBuilder.equalTo(_equalTo)
        if (_neq.isNotEmpty()) cdkBuilder.neq(_neq)
        if (_notEquals.isNotEmpty()) cdkBuilder.notEquals(_notEquals)
        return cdkBuilder.build()
    }
}
