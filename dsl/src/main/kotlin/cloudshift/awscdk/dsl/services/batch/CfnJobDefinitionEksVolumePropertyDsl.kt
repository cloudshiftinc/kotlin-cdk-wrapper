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
import kotlin.String

@CdkDslMarker
public class CfnJobDefinitionEksVolumePropertyDsl {
    private val cdkBuilder: CfnJobDefinition.EksVolumeProperty.Builder =
        CfnJobDefinition.EksVolumeProperty.builder()

    public fun emptyDir(emptyDir: IResolvable) {
        cdkBuilder.emptyDir(emptyDir)
    }

    public fun emptyDir(emptyDir: CfnJobDefinition.EmptyDirProperty) {
        cdkBuilder.emptyDir(emptyDir)
    }

    public fun hostPath(hostPath: IResolvable) {
        cdkBuilder.hostPath(hostPath)
    }

    public fun hostPath(hostPath: CfnJobDefinition.HostPathProperty) {
        cdkBuilder.hostPath(hostPath)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun secret(secret: IResolvable) {
        cdkBuilder.secret(secret)
    }

    public fun secret(secret: CfnJobDefinition.EksSecretProperty) {
        cdkBuilder.secret(secret)
    }

    public fun build(): CfnJobDefinition.EksVolumeProperty = cdkBuilder.build()
}
