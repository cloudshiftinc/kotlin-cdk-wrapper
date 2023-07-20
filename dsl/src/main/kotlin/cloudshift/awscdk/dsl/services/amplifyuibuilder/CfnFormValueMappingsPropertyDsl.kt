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
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnFormValueMappingsPropertyDsl {
    private val cdkBuilder: CfnForm.ValueMappingsProperty.Builder =
        CfnForm.ValueMappingsProperty.builder()

    private val _values: MutableList<Any> = mutableListOf()

    public fun values(vararg values: Any) {
        _values.addAll(listOf(*values))
    }

    public fun values(values: Collection<Any>) {
        _values.addAll(values)
    }

    public fun values(values: IResolvable) {
        cdkBuilder.values(values)
    }

    public fun build(): CfnForm.ValueMappingsProperty {
        if (_values.isNotEmpty()) cdkBuilder.values(_values)
        return cdkBuilder.build()
    }
}
