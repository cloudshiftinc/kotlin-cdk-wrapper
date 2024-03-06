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
import software.amazon.awscdk.services.quicksight.CfnDataSet

/**
 * The new default values for the parameter.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * NewDefaultValuesProperty newDefaultValuesProperty = NewDefaultValuesProperty.builder()
 * .dateTimeStaticValues(List.of("dateTimeStaticValues"))
 * .decimalStaticValues(List.of(123))
 * .integerStaticValues(List.of(123))
 * .stringStaticValues(List.of("stringStaticValues"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-newdefaultvalues.html)
 */
@CdkDslMarker
public class CfnDataSetNewDefaultValuesPropertyDsl {
    private val cdkBuilder: CfnDataSet.NewDefaultValuesProperty.Builder =
        CfnDataSet.NewDefaultValuesProperty.builder()

    private val _dateTimeStaticValues: MutableList<String> = mutableListOf()

    private val _decimalStaticValues: MutableList<Number> = mutableListOf()

    private val _integerStaticValues: MutableList<Number> = mutableListOf()

    private val _stringStaticValues: MutableList<String> = mutableListOf()

    /**
     * @param dateTimeStaticValues A list of static default values for a given date time parameter.
     *   The valid format for this property is `yyyy-MM-dd’T’HH:mm:ss’Z’` .
     */
    public fun dateTimeStaticValues(vararg dateTimeStaticValues: String) {
        _dateTimeStaticValues.addAll(listOf(*dateTimeStaticValues))
    }

    /**
     * @param dateTimeStaticValues A list of static default values for a given date time parameter.
     *   The valid format for this property is `yyyy-MM-dd’T’HH:mm:ss’Z’` .
     */
    public fun dateTimeStaticValues(dateTimeStaticValues: Collection<String>) {
        _dateTimeStaticValues.addAll(dateTimeStaticValues)
    }

    /** @param decimalStaticValues A list of static default values for a given decimal parameter. */
    public fun decimalStaticValues(vararg decimalStaticValues: Number) {
        _decimalStaticValues.addAll(listOf(*decimalStaticValues))
    }

    /** @param decimalStaticValues A list of static default values for a given decimal parameter. */
    public fun decimalStaticValues(decimalStaticValues: Collection<Number>) {
        _decimalStaticValues.addAll(decimalStaticValues)
    }

    /** @param decimalStaticValues A list of static default values for a given decimal parameter. */
    public fun decimalStaticValues(decimalStaticValues: IResolvable) {
        cdkBuilder.decimalStaticValues(decimalStaticValues)
    }

    /** @param integerStaticValues A list of static default values for a given integer parameter. */
    public fun integerStaticValues(vararg integerStaticValues: Number) {
        _integerStaticValues.addAll(listOf(*integerStaticValues))
    }

    /** @param integerStaticValues A list of static default values for a given integer parameter. */
    public fun integerStaticValues(integerStaticValues: Collection<Number>) {
        _integerStaticValues.addAll(integerStaticValues)
    }

    /** @param integerStaticValues A list of static default values for a given integer parameter. */
    public fun integerStaticValues(integerStaticValues: IResolvable) {
        cdkBuilder.integerStaticValues(integerStaticValues)
    }

    /** @param stringStaticValues A list of static default values for a given string parameter. */
    public fun stringStaticValues(vararg stringStaticValues: String) {
        _stringStaticValues.addAll(listOf(*stringStaticValues))
    }

    /** @param stringStaticValues A list of static default values for a given string parameter. */
    public fun stringStaticValues(stringStaticValues: Collection<String>) {
        _stringStaticValues.addAll(stringStaticValues)
    }

    public fun build(): CfnDataSet.NewDefaultValuesProperty {
        if (_dateTimeStaticValues.isNotEmpty())
            cdkBuilder.dateTimeStaticValues(_dateTimeStaticValues)
        if (_decimalStaticValues.isNotEmpty()) cdkBuilder.decimalStaticValues(_decimalStaticValues)
        if (_integerStaticValues.isNotEmpty()) cdkBuilder.integerStaticValues(_integerStaticValues)
        if (_stringStaticValues.isNotEmpty()) cdkBuilder.stringStaticValues(_stringStaticValues)
        return cdkBuilder.build()
    }
}
