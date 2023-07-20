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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.batch.CfnJobDefinition
import kotlin.Boolean
import kotlin.String

@CdkDslMarker
public class CfnJobDefinitionEksContainerVolumeMountPropertyDsl {
    private val cdkBuilder: CfnJobDefinition.EksContainerVolumeMountProperty.Builder =
        CfnJobDefinition.EksContainerVolumeMountProperty.builder()

    public fun mountPath(mountPath: String) {
        cdkBuilder.mountPath(mountPath)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun readOnly(readOnly: Boolean) {
        cdkBuilder.readOnly(readOnly)
    }

    public fun readOnly(readOnly: IResolvable) {
        cdkBuilder.readOnly(readOnly)
    }

    public fun build(): CfnJobDefinition.EksContainerVolumeMountProperty = cdkBuilder.build()
}
