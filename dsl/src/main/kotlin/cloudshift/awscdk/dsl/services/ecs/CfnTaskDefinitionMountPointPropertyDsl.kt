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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ecs.CfnTaskDefinition
import kotlin.Boolean
import kotlin.String

@CdkDslMarker
public class CfnTaskDefinitionMountPointPropertyDsl {
    private val cdkBuilder: CfnTaskDefinition.MountPointProperty.Builder =
        CfnTaskDefinition.MountPointProperty.builder()

    public fun containerPath(containerPath: String) {
        cdkBuilder.containerPath(containerPath)
    }

    public fun readOnly(readOnly: Boolean) {
        cdkBuilder.readOnly(readOnly)
    }

    public fun readOnly(readOnly: IResolvable) {
        cdkBuilder.readOnly(readOnly)
    }

    public fun sourceVolume(sourceVolume: String) {
        cdkBuilder.sourceVolume(sourceVolume)
    }

    public fun build(): CfnTaskDefinition.MountPointProperty = cdkBuilder.build()
}
