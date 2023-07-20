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
import software.amazon.awscdk.services.backup.BackupSelectionOptions
import software.amazon.awscdk.services.iam.IRole
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class BackupSelectionOptionsDsl {
    private val cdkBuilder: BackupSelectionOptions.Builder = BackupSelectionOptions.builder()

    private val _resources: MutableList<BackupResource> = mutableListOf()

    public fun allowRestores(allowRestores: Boolean) {
        cdkBuilder.allowRestores(allowRestores)
    }

    public fun backupSelectionName(backupSelectionName: String) {
        cdkBuilder.backupSelectionName(backupSelectionName)
    }

    public fun resources(vararg resources: BackupResource) {
        _resources.addAll(listOf(*resources))
    }

    public fun resources(resources: Collection<BackupResource>) {
        _resources.addAll(resources)
    }

    public fun role(role: IRole) {
        cdkBuilder.role(role)
    }

    public fun build(): BackupSelectionOptions {
        if (_resources.isNotEmpty()) cdkBuilder.resources(_resources)
        return cdkBuilder.build()
    }
}
