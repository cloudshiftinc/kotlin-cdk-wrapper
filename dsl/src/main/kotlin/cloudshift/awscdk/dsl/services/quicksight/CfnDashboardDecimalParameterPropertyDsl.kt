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
public class CfnDashboardDecimalParameterPropertyDsl {
    private val cdkBuilder: CfnDashboard.DecimalParameterProperty.Builder =
        CfnDashboard.DecimalParameterProperty.builder()

    private val _values: MutableList<Number> = mutableListOf()

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun values(vararg values: Number) {
        _values.addAll(listOf(*values))
    }

    public fun values(values: Collection<Number>) {
        _values.addAll(values)
    }

    public fun values(values: IResolvable) {
        cdkBuilder.values(values)
    }

    public fun build(): CfnDashboard.DecimalParameterProperty {
        if (_values.isNotEmpty()) cdkBuilder.values(_values)
        return cdkBuilder.build()
    }
}
