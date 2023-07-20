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
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnTaskDefinitionTmpfsPropertyDsl {
    private val cdkBuilder: CfnTaskDefinition.TmpfsProperty.Builder =
        CfnTaskDefinition.TmpfsProperty.builder()

    private val _mountOptions: MutableList<String> = mutableListOf()

    public fun containerPath(containerPath: String) {
        cdkBuilder.containerPath(containerPath)
    }

    public fun mountOptions(vararg mountOptions: String) {
        _mountOptions.addAll(listOf(*mountOptions))
    }

    public fun mountOptions(mountOptions: Collection<String>) {
        _mountOptions.addAll(mountOptions)
    }

    public fun size(size: Number) {
        cdkBuilder.size(size)
    }

    public fun build(): CfnTaskDefinition.TmpfsProperty {
        if (_mountOptions.isNotEmpty()) cdkBuilder.mountOptions(_mountOptions)
        return cdkBuilder.build()
    }
}
