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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.backup.CfnBackupSelection
import software.amazon.awscdk.services.backup.CfnBackupSelectionProps
import kotlin.String

@CdkDslMarker
public class CfnBackupSelectionPropsDsl {
    private val cdkBuilder: CfnBackupSelectionProps.Builder = CfnBackupSelectionProps.builder()

    public fun backupPlanId(backupPlanId: String) {
        cdkBuilder.backupPlanId(backupPlanId)
    }

    public fun backupSelection(backupSelection: IResolvable) {
        cdkBuilder.backupSelection(backupSelection)
    }

    public fun backupSelection(backupSelection: CfnBackupSelection.BackupSelectionResourceTypeProperty) {
        cdkBuilder.backupSelection(backupSelection)
    }

    public fun build(): CfnBackupSelectionProps = cdkBuilder.build()
}
