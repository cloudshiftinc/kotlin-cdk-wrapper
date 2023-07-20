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
import software.amazon.awscdk.services.quicksight.CfnDataSet
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnDataSetStringDatasetParameterDefaultValuesPropertyDsl {
    private val cdkBuilder: CfnDataSet.StringDatasetParameterDefaultValuesProperty.Builder =
        CfnDataSet.StringDatasetParameterDefaultValuesProperty.builder()

    private val _staticValues: MutableList<String> = mutableListOf()

    public fun staticValues(vararg staticValues: String) {
        _staticValues.addAll(listOf(*staticValues))
    }

    public fun staticValues(staticValues: Collection<String>) {
        _staticValues.addAll(staticValues)
    }

    public fun build(): CfnDataSet.StringDatasetParameterDefaultValuesProperty {
        if (_staticValues.isNotEmpty()) cdkBuilder.staticValues(_staticValues)
        return cdkBuilder.build()
    }
}
