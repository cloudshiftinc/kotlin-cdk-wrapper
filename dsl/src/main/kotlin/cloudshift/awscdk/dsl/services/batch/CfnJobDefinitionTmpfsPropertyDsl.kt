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
import software.amazon.awscdk.services.batch.CfnJobDefinition
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnJobDefinitionTmpfsPropertyDsl {
    private val cdkBuilder: CfnJobDefinition.TmpfsProperty.Builder =
        CfnJobDefinition.TmpfsProperty.builder()

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

    public fun build(): CfnJobDefinition.TmpfsProperty {
        if (_mountOptions.isNotEmpty()) cdkBuilder.mountOptions(_mountOptions)
        return cdkBuilder.build()
    }
}
