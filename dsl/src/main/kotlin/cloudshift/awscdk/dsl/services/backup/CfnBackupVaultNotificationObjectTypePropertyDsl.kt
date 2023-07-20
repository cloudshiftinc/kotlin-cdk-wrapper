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
import software.amazon.awscdk.services.backup.CfnBackupVault
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnBackupVaultNotificationObjectTypePropertyDsl {
    private val cdkBuilder: CfnBackupVault.NotificationObjectTypeProperty.Builder =
        CfnBackupVault.NotificationObjectTypeProperty.builder()

    private val _backupVaultEvents: MutableList<String> = mutableListOf()

    public fun backupVaultEvents(vararg backupVaultEvents: String) {
        _backupVaultEvents.addAll(listOf(*backupVaultEvents))
    }

    public fun backupVaultEvents(backupVaultEvents: Collection<String>) {
        _backupVaultEvents.addAll(backupVaultEvents)
    }

    public fun snsTopicArn(snsTopicArn: String) {
        cdkBuilder.snsTopicArn(snsTopicArn)
    }

    public fun build(): CfnBackupVault.NotificationObjectTypeProperty {
        if (_backupVaultEvents.isNotEmpty()) cdkBuilder.backupVaultEvents(_backupVaultEvents)
        return cdkBuilder.build()
    }
}
