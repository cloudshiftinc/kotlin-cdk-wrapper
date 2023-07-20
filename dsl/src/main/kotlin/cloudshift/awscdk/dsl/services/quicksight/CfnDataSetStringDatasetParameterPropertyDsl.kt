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
import kotlin.String

@CdkDslMarker
public class CfnDataSetStringDatasetParameterPropertyDsl {
    private val cdkBuilder: CfnDataSet.StringDatasetParameterProperty.Builder =
        CfnDataSet.StringDatasetParameterProperty.builder()

    public fun defaultValues(defaultValues: IResolvable) {
        cdkBuilder.defaultValues(defaultValues)
    }

    public fun defaultValues(defaultValues: CfnDataSet.StringDatasetParameterDefaultValuesProperty) {
        cdkBuilder.defaultValues(defaultValues)
    }

    public fun id(id: String) {
        cdkBuilder.id(id)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun valueType(valueType: String) {
        cdkBuilder.valueType(valueType)
    }

    public fun build(): CfnDataSet.StringDatasetParameterProperty = cdkBuilder.build()
}
