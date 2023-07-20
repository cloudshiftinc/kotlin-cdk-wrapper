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

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDataSet
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnDataSetNewDefaultValuesPropertyDsl {
    private val cdkBuilder: CfnDataSet.NewDefaultValuesProperty.Builder =
        CfnDataSet.NewDefaultValuesProperty.builder()

    private val _dateTimeStaticValues: MutableList<String> = mutableListOf()

    private val _decimalStaticValues: MutableList<Number> = mutableListOf()

    private val _integerStaticValues: MutableList<Number> = mutableListOf()

    private val _stringStaticValues: MutableList<String> = mutableListOf()

    public fun dateTimeStaticValues(vararg dateTimeStaticValues: String) {
        _dateTimeStaticValues.addAll(listOf(*dateTimeStaticValues))
    }

    public fun dateTimeStaticValues(dateTimeStaticValues: Collection<String>) {
        _dateTimeStaticValues.addAll(dateTimeStaticValues)
    }

    public fun decimalStaticValues(vararg decimalStaticValues: Number) {
        _decimalStaticValues.addAll(listOf(*decimalStaticValues))
    }

    public fun decimalStaticValues(decimalStaticValues: Collection<Number>) {
        _decimalStaticValues.addAll(decimalStaticValues)
    }

    public fun decimalStaticValues(decimalStaticValues: IResolvable) {
        cdkBuilder.decimalStaticValues(decimalStaticValues)
    }

    public fun integerStaticValues(vararg integerStaticValues: Number) {
        _integerStaticValues.addAll(listOf(*integerStaticValues))
    }

    public fun integerStaticValues(integerStaticValues: Collection<Number>) {
        _integerStaticValues.addAll(integerStaticValues)
    }

    public fun integerStaticValues(integerStaticValues: IResolvable) {
        cdkBuilder.integerStaticValues(integerStaticValues)
    }

    public fun stringStaticValues(vararg stringStaticValues: String) {
        _stringStaticValues.addAll(listOf(*stringStaticValues))
    }

    public fun stringStaticValues(stringStaticValues: Collection<String>) {
        _stringStaticValues.addAll(stringStaticValues)
    }

    public fun build(): CfnDataSet.NewDefaultValuesProperty {
        if (_dateTimeStaticValues.isNotEmpty()) cdkBuilder.dateTimeStaticValues(_dateTimeStaticValues)
        if (_decimalStaticValues.isNotEmpty()) cdkBuilder.decimalStaticValues(_decimalStaticValues)
        if (_integerStaticValues.isNotEmpty()) cdkBuilder.integerStaticValues(_integerStaticValues)
        if (_stringStaticValues.isNotEmpty()) cdkBuilder.stringStaticValues(_stringStaticValues)
        return cdkBuilder.build()
    }
}
