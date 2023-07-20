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
import software.amazon.awscdk.services.backup.CfnBackupPlan
import kotlin.Number

@CdkDslMarker
public class CfnBackupPlanLifecycleResourceTypePropertyDsl {
    private val cdkBuilder: CfnBackupPlan.LifecycleResourceTypeProperty.Builder =
        CfnBackupPlan.LifecycleResourceTypeProperty.builder()

    public fun deleteAfterDays(deleteAfterDays: Number) {
        cdkBuilder.deleteAfterDays(deleteAfterDays)
    }

    public fun moveToColdStorageAfterDays(moveToColdStorageAfterDays: Number) {
        cdkBuilder.moveToColdStorageAfterDays(moveToColdStorageAfterDays)
    }

    public fun build(): CfnBackupPlan.LifecycleResourceTypeProperty = cdkBuilder.build()
}
