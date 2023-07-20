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

package cloudshift.awscdk.dsl.services.iotsitewise

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotsitewise.CfnAssetModel
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnAssetModelMetricPropertyDsl {
    private val cdkBuilder: CfnAssetModel.MetricProperty.Builder =
        CfnAssetModel.MetricProperty.builder()

    private val _variables: MutableList<Any> = mutableListOf()

    public fun expression(expression: String) {
        cdkBuilder.expression(expression)
    }

    public fun variables(vararg variables: Any) {
        _variables.addAll(listOf(*variables))
    }

    public fun variables(variables: Collection<Any>) {
        _variables.addAll(variables)
    }

    public fun variables(variables: IResolvable) {
        cdkBuilder.variables(variables)
    }

    public fun window(window: IResolvable) {
        cdkBuilder.window(window)
    }

    public fun window(window: CfnAssetModel.MetricWindowProperty) {
        cdkBuilder.window(window)
    }

    public fun build(): CfnAssetModel.MetricProperty {
        if (_variables.isNotEmpty()) cdkBuilder.variables(_variables)
        return cdkBuilder.build()
    }
}
