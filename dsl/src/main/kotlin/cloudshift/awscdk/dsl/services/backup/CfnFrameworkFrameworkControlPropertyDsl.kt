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

package cloudshift.awscdk.dsl.services.backup

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.backup.CfnFramework
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnFrameworkFrameworkControlPropertyDsl {
    private val cdkBuilder: CfnFramework.FrameworkControlProperty.Builder =
        CfnFramework.FrameworkControlProperty.builder()

    private val _controlInputParameters: MutableList<Any> = mutableListOf()

    public fun controlInputParameters(vararg controlInputParameters: Any) {
        _controlInputParameters.addAll(listOf(*controlInputParameters))
    }

    public fun controlInputParameters(controlInputParameters: Collection<Any>) {
        _controlInputParameters.addAll(controlInputParameters)
    }

    public fun controlInputParameters(controlInputParameters: IResolvable) {
        cdkBuilder.controlInputParameters(controlInputParameters)
    }

    public fun controlName(controlName: String) {
        cdkBuilder.controlName(controlName)
    }

    public fun controlScope(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.controlScope(builder.map)
    }

    public fun controlScope(controlScope: Any) {
        cdkBuilder.controlScope(controlScope)
    }

    public fun build(): CfnFramework.FrameworkControlProperty {
        if (_controlInputParameters.isNotEmpty()) {
            cdkBuilder.controlInputParameters(_controlInputParameters)
        }
        return cdkBuilder.build()
    }
}
