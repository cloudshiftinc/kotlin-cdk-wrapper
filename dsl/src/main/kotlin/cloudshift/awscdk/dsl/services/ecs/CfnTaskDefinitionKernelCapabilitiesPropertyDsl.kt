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

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ecs.CfnTaskDefinition
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnTaskDefinitionKernelCapabilitiesPropertyDsl {
    private val cdkBuilder: CfnTaskDefinition.KernelCapabilitiesProperty.Builder =
        CfnTaskDefinition.KernelCapabilitiesProperty.builder()

    private val _add: MutableList<String> = mutableListOf()

    private val _drop: MutableList<String> = mutableListOf()

    public fun add(vararg add: String) {
        _add.addAll(listOf(*add))
    }

    public fun add(add: Collection<String>) {
        _add.addAll(add)
    }

    public fun drop(vararg drop: String) {
        _drop.addAll(listOf(*drop))
    }

    public fun drop(drop: Collection<String>) {
        _drop.addAll(drop)
    }

    public fun build(): CfnTaskDefinition.KernelCapabilitiesProperty {
        if (_add.isNotEmpty()) cdkBuilder.add(_add)
        if (_drop.isNotEmpty()) cdkBuilder.drop(_drop)
        return cdkBuilder.build()
    }
}
