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
import kotlin.Number

@CdkDslMarker
public class CfnJobDefinitionSecurityContextPropertyDsl {
    private val cdkBuilder: CfnJobDefinition.SecurityContextProperty.Builder =
        CfnJobDefinition.SecurityContextProperty.builder()

    public fun privileged(privileged: Boolean) {
        cdkBuilder.privileged(privileged)
    }

    public fun privileged(privileged: IResolvable) {
        cdkBuilder.privileged(privileged)
    }

    public fun readOnlyRootFilesystem(readOnlyRootFilesystem: Boolean) {
        cdkBuilder.readOnlyRootFilesystem(readOnlyRootFilesystem)
    }

    public fun readOnlyRootFilesystem(readOnlyRootFilesystem: IResolvable) {
        cdkBuilder.readOnlyRootFilesystem(readOnlyRootFilesystem)
    }

    public fun runAsGroup(runAsGroup: Number) {
        cdkBuilder.runAsGroup(runAsGroup)
    }

    public fun runAsNonRoot(runAsNonRoot: Boolean) {
        cdkBuilder.runAsNonRoot(runAsNonRoot)
    }

    public fun runAsNonRoot(runAsNonRoot: IResolvable) {
        cdkBuilder.runAsNonRoot(runAsNonRoot)
    }

    public fun runAsUser(runAsUser: Number) {
        cdkBuilder.runAsUser(runAsUser)
    }

    public fun build(): CfnJobDefinition.SecurityContextProperty = cdkBuilder.build()
}
