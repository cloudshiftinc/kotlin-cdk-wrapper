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

package cloudshift.awscdk.dsl.services.fsx

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.fsx.CfnFileSystem
import kotlin.String

@CdkDslMarker
public class CfnFileSystemAuditLogConfigurationPropertyDsl {
    private val cdkBuilder: CfnFileSystem.AuditLogConfigurationProperty.Builder =
        CfnFileSystem.AuditLogConfigurationProperty.builder()

    public fun auditLogDestination(auditLogDestination: String) {
        cdkBuilder.auditLogDestination(auditLogDestination)
    }

    public fun fileAccessAuditLogLevel(fileAccessAuditLogLevel: String) {
        cdkBuilder.fileAccessAuditLogLevel(fileAccessAuditLogLevel)
    }

    public fun fileShareAccessAuditLogLevel(fileShareAccessAuditLogLevel: String) {
        cdkBuilder.fileShareAccessAuditLogLevel(fileShareAccessAuditLogLevel)
    }

    public fun build(): CfnFileSystem.AuditLogConfigurationProperty = cdkBuilder.build()
}
