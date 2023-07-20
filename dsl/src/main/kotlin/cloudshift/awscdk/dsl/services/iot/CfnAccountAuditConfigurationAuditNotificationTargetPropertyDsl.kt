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

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration
import kotlin.Boolean
import kotlin.String

@CdkDslMarker
public class CfnAccountAuditConfigurationAuditNotificationTargetPropertyDsl {
    private val cdkBuilder: CfnAccountAuditConfiguration.AuditNotificationTargetProperty.Builder =
        CfnAccountAuditConfiguration.AuditNotificationTargetProperty.builder()

    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    public fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled)
    }

    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    public fun targetArn(targetArn: String) {
        cdkBuilder.targetArn(targetArn)
    }

    public fun build(): CfnAccountAuditConfiguration.AuditNotificationTargetProperty =
        cdkBuilder.build()
}
