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

package cloudshift.awscdk.dsl.services.dms

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.dms.CfnEndpoint
import kotlin.Boolean
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnEndpointGcpMySQLSettingsPropertyDsl {
    private val cdkBuilder: CfnEndpoint.GcpMySQLSettingsProperty.Builder =
        CfnEndpoint.GcpMySQLSettingsProperty.builder()

    public fun afterConnectScript(afterConnectScript: String) {
        cdkBuilder.afterConnectScript(afterConnectScript)
    }

    public fun cleanSourceMetadataOnMismatch(cleanSourceMetadataOnMismatch: Boolean) {
        cdkBuilder.cleanSourceMetadataOnMismatch(cleanSourceMetadataOnMismatch)
    }

    public fun cleanSourceMetadataOnMismatch(cleanSourceMetadataOnMismatch: IResolvable) {
        cdkBuilder.cleanSourceMetadataOnMismatch(cleanSourceMetadataOnMismatch)
    }

    public fun databaseName(databaseName: String) {
        cdkBuilder.databaseName(databaseName)
    }

    public fun eventsPollInterval(eventsPollInterval: Number) {
        cdkBuilder.eventsPollInterval(eventsPollInterval)
    }

    public fun maxFileSize(maxFileSize: Number) {
        cdkBuilder.maxFileSize(maxFileSize)
    }

    public fun parallelLoadThreads(parallelLoadThreads: Number) {
        cdkBuilder.parallelLoadThreads(parallelLoadThreads)
    }

    public fun password(password: String) {
        cdkBuilder.password(password)
    }

    public fun port(port: Number) {
        cdkBuilder.port(port)
    }

    public fun secretsManagerAccessRoleArn(secretsManagerAccessRoleArn: String) {
        cdkBuilder.secretsManagerAccessRoleArn(secretsManagerAccessRoleArn)
    }

    public fun secretsManagerSecretId(secretsManagerSecretId: String) {
        cdkBuilder.secretsManagerSecretId(secretsManagerSecretId)
    }

    public fun serverName(serverName: String) {
        cdkBuilder.serverName(serverName)
    }

    public fun serverTimezone(serverTimezone: String) {
        cdkBuilder.serverTimezone(serverTimezone)
    }

    public fun username(username: String) {
        cdkBuilder.username(username)
    }

    public fun build(): CfnEndpoint.GcpMySQLSettingsProperty = cdkBuilder.build()
}
