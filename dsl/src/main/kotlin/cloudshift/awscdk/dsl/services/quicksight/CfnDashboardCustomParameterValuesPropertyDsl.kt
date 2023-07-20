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
import software.amazon.awscdk.services.quicksight.CfnDashboard
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnDashboardCustomParameterValuesPropertyDsl {
    private val cdkBuilder: CfnDashboard.CustomParameterValuesProperty.Builder =
        CfnDashboard.CustomParameterValuesProperty.builder()

    private val _dateTimeValues: MutableList<String> = mutableListOf()

    private val _decimalValues: MutableList<Number> = mutableListOf()

    private val _integerValues: MutableList<Number> = mutableListOf()

    private val _stringValues: MutableList<String> = mutableListOf()

    public fun dateTimeValues(vararg dateTimeValues: String) {
        _dateTimeValues.addAll(listOf(*dateTimeValues))
    }

    public fun dateTimeValues(dateTimeValues: Collection<String>) {
        _dateTimeValues.addAll(dateTimeValues)
    }

    public fun decimalValues(vararg decimalValues: Number) {
        _decimalValues.addAll(listOf(*decimalValues))
    }

    public fun decimalValues(decimalValues: Collection<Number>) {
        _decimalValues.addAll(decimalValues)
    }

    public fun decimalValues(decimalValues: IResolvable) {
        cdkBuilder.decimalValues(decimalValues)
    }

    public fun integerValues(vararg integerValues: Number) {
        _integerValues.addAll(listOf(*integerValues))
    }

    public fun integerValues(integerValues: Collection<Number>) {
        _integerValues.addAll(integerValues)
    }

    public fun integerValues(integerValues: IResolvable) {
        cdkBuilder.integerValues(integerValues)
    }

    public fun stringValues(vararg stringValues: String) {
        _stringValues.addAll(listOf(*stringValues))
    }

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
