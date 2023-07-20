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
import software.amazon.awscdk.services.backup.BackupSelectionProps
import software.amazon.awscdk.services.backup.IBackupPlan
import software.amazon.awscdk.services.iam.IRole
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class BackupSelectionPropsDsl {
    private val cdkBuilder: BackupSelectionProps.Builder = BackupSelectionProps.builder()

    private val _resources: MutableList<BackupResource> = mutableListOf()

    public fun allowRestores(allowRestores: Boolean) {
        cdkBuilder.allowRestores(allowRestores)
    }

    public fun backupPlan(backupPlan: IBackupPlan) {
        cdkBuilder.backupPlan(backupPlan)
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

    public fun build(): BackupSelectionProps {
        if (_resources.isNotEmpty()) cdkBuilder.resources(_resources)
        return cdkBuilder.build()
    }
}
