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

package cloudshift.awscdk.dsl.services.batch

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.batch.CfnJobDefinition
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnJobDefinitionLogConfigurationPropertyDsl {
    private val cdkBuilder: CfnJobDefinition.LogConfigurationProperty.Builder =
        CfnJobDefinition.LogConfigurationProperty.builder()

    private val _secretOptions: MutableList<Any> = mutableListOf()

    public fun logDriver(logDriver: String) {
        cdkBuilder.logDriver(logDriver)
    }

    public fun options(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.options(builder.map)
    }

    public fun options(options: Any) {
        cdkBuilder.options(options)
    }

    public fun secretOptions(vararg secretOptions: Any) {
        _secretOptions.addAll(listOf(*secretOptions))
    }

    public fun secretOptions(secretOptions: Collection<Any>) {
        _secretOptions.addAll(secretOptions)
    }

    public fun secretOptions(secretOptions: IResolvable) {
        cdkBuilder.secretOptions(secretOptions)
    }

    public fun build(): CfnJobDefinition.LogConfigurationProperty {
        if (_secretOptions.isNotEmpty()) cdkBuilder.secretOptions(_secretOptions)
        return cdkBuilder.build()
    }
}
