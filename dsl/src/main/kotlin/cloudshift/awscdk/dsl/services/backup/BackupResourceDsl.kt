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
import software.amazon.awscdk.services.backup.BackupResource
import software.amazon.awscdk.services.backup.TagOperation
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class BackupResourceDsl(
    resource: String,
    construct: Construct,
) {
    private val cdkBuilder: BackupResource.Builder = BackupResource.Builder.create(
        resource,
        construct,
    )

    public fun key(key: String) {
        cdkBuilder.key(key)
    }

    public fun operation(operation: TagOperation) {
        cdkBuilder.operation(operation)
    }

    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): BackupResource = cdkBuilder.build()
}
