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

package io.cloudshiftdev.awscdkdsl.services.quicksight

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

/**
 * The customized parameter values.
 *
 * This is a union type structure. For this structure to be valid, only one of the attributes can be
 * defined.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * CustomParameterValuesProperty customParameterValuesProperty =
 * CustomParameterValuesProperty.builder()
 * .dateTimeValues(List.of("dateTimeValues"))
 * .decimalValues(List.of(123))
 * .integerValues(List.of(123))
 * .stringValues(List.of("stringValues"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-customparametervalues.html)
 */
@CdkDslMarker
public class CfnDashboardCustomParameterValuesPropertyDsl {
    private val cdkBuilder: CfnDashboard.CustomParameterValuesProperty.Builder =
        CfnDashboard.CustomParameterValuesProperty.builder()

    private val _dateTimeValues: MutableList<String> = mutableListOf()

    private val _decimalValues: MutableList<Number> = mutableListOf()

    private val _integerValues: MutableList<Number> = mutableListOf()

    private val _stringValues: MutableList<String> = mutableListOf()

    /** @param dateTimeValues A list of datetime-type parameter values. */
    public fun dateTimeValues(vararg dateTimeValues: String) {
        _dateTimeValues.addAll(listOf(*dateTimeValues))
    }

    /** @param dateTimeValues A list of datetime-type parameter values. */
    public fun dateTimeValues(dateTimeValues: Collection<String>) {
        _dateTimeValues.addAll(dateTimeValues)
    }

    /** @param decimalValues A list of decimal-type parameter values. */
    public fun decimalValues(vararg decimalValues: Number) {
        _decimalValues.addAll(listOf(*decimalValues))
    }

    /** @param decimalValues A list of decimal-type parameter values. */
    public fun decimalValues(decimalValues: Collection<Number>) {
        _decimalValues.addAll(decimalValues)
    }

    /** @param decimalValues A list of decimal-type parameter values. */
    public fun decimalValues(decimalValues: IResolvable) {
        cdkBuilder.decimalValues(decimalValues)
    }

    /** @param integerValues A list of integer-type parameter values. */
    public fun integerValues(vararg integerValues: Number) {
        _integerValues.addAll(listOf(*integerValues))
    }

    /** @param integerValues A list of integer-type parameter values. */
    public fun integerValues(integerValues: Collection<Number>) {
        _integerValues.addAll(integerValues)
    }

    /** @param integerValues A list of integer-type parameter values. */
    public fun integerValues(integerValues: IResolvable) {
        cdkBuilder.integerValues(integerValues)
    }

    /** @param stringValues A list of string-type parameter values. */
    public fun stringValues(vararg stringValues: String) {
        _stringValues.addAll(listOf(*stringValues))
    }

    /** @param stringValues A list of string-type parameter values. */
    public fun stringValues(stringValues: Collection<String>) {
        _stringValues.addAll(stringValues)
    }

    public fun build(): CfnDashboard.CustomParameterValuesProperty {
        if (_dateTimeValues.isNotEmpty()) cdkBuilder.dateTimeValues(_dateTimeValues)
        if (_decimalValues.isNotEmpty()) cdkBuilder.decimalValues(_decimalValues)
        if (_integerValues.isNotEmpty()) cdkBuilder.integerValues(_integerValues)
        if (_stringValues.isNotEmpty()) cdkBuilder.stringValues(_stringValues)
        return cdkBuilder.build()
    }
}
