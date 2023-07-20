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
import software.amazon.awscdk.services.backup.CfnBackupPlan
import software.amazon.awscdk.services.backup.CfnBackupPlanProps
import kotlin.String
import kotlin.collections.Map

@CdkDslMarker
public class CfnBackupPlanPropsDsl {
    private val cdkBuilder: CfnBackupPlanProps.Builder = CfnBackupPlanProps.builder()

    public fun backupPlan(backupPlan: IResolvable) {
        cdkBuilder.backupPlan(backupPlan)
    }

    public fun backupPlan(backupPlan: CfnBackupPlan.BackupPlanResourceTypeProperty) {
        cdkBuilder.backupPlan(backupPlan)
    }

    public fun backupPlanTags(backupPlanTags: Map<String, String>) {
        cdkBuilder.backupPlanTags(backupPlanTags)
    }

    public fun backupPlanTags(backupPlanTags: IResolvable) {
        cdkBuilder.backupPlanTags(backupPlanTags)
    }

    public fun build(): CfnBackupPlanProps = cdkBuilder.build()
}
