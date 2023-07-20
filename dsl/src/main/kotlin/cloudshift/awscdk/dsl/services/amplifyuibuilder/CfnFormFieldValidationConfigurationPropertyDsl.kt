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

package cloudshift.awscdk.dsl.services.amplifyuibuilder

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.amplifyuibuilder.CfnForm
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnFormFieldValidationConfigurationPropertyDsl {
    private val cdkBuilder: CfnForm.FieldValidationConfigurationProperty.Builder =
        CfnForm.FieldValidationConfigurationProperty.builder()

    private val _numValues: MutableList<Number> = mutableListOf()

    private val _strValues: MutableList<String> = mutableListOf()

    public fun numValues(vararg numValues: Number) {
        _numValues.addAll(listOf(*numValues))
    }

    public fun numValues(numValues: Collection<Number>) {
        _numValues.addAll(numValues)
    }

    public fun numValues(numValues: IResolvable) {
        cdkBuilder.numValues(numValues)
    }

    public fun strValues(vararg strValues: String) {
        _strValues.addAll(listOf(*strValues))
    }

    public fun strValues(strValues: Collection<String>) {
        _strValues.addAll(strValues)
    }

    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun validationMessage(validationMessage: String) {
        cdkBuilder.validationMessage(validationMessage)
    }

    public fun build(): CfnForm.FieldValidationConfigurationProperty {
        if (_numValues.isNotEmpty()) cdkBuilder.numValues(_numValues)
        if (_strValues.isNotEmpty()) cdkBuilder.strValues(_strValues)
        return cdkBuilder.build()
    }
}
