@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ecs.AuthorizationConfig
import software.amazon.awscdk.services.ecs.EfsVolumeConfiguration

/**
 * The configuration for an Elastic FileSystem volume.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ecs.*;
 * EfsVolumeConfiguration efsVolumeConfiguration = EfsVolumeConfiguration.builder()
 * .fileSystemId("fileSystemId")
 * // the properties below are optional
 * .authorizationConfig(AuthorizationConfig.builder()
 * .accessPointId("accessPointId")
 * .iam("iam")
 * .build())
 * .rootDirectory("rootDirectory")
 * .transitEncryption("transitEncryption")
 * .transitEncryptionPort(123)
 * .build();
 * ```
 */
@CdkDslMarker
public class EfsVolumeConfigurationDsl {
    private val cdkBuilder: EfsVolumeConfiguration.Builder = EfsVolumeConfiguration.builder()

    /**
     * @param authorizationConfig The authorization configuration details for the Amazon EFS file
     *   system.
     */
    public fun authorizationConfig(authorizationConfig: AuthorizationConfigDsl.() -> Unit = {}) {
        val builder = AuthorizationConfigDsl()
        builder.apply(authorizationConfig)
        cdkBuilder.authorizationConfig(builder.build())
    }

    /**
     * @param authorizationConfig The authorization configuration details for the Amazon EFS file
     *   system.
     */
    public fun authorizationConfig(authorizationConfig: AuthorizationConfig) {
        cdkBuilder.authorizationConfig(authorizationConfig)
    }

    /** @param fileSystemId The Amazon EFS file system ID to use. */
    public fun fileSystemId(fileSystemId: String) {
        cdkBuilder.fileSystemId(fileSystemId)
    }

    /**
     * @param rootDirectory The directory within the Amazon EFS file system to mount as the root
     *   directory inside the host. Specifying / will have the same effect as omitting this
     *   parameter.
     */
    public fun rootDirectory(rootDirectory: String) {
        cdkBuilder.rootDirectory(rootDirectory)
    }

    /**
     * @param transitEncryption Whether or not to enable encryption for Amazon EFS data in transit
     *   between the Amazon ECS host and the Amazon EFS server. Transit encryption must be enabled
     *   if Amazon EFS IAM authorization is used.
     *
     * Valid values: ENABLED | DISABLED
     */
    public fun transitEncryption(transitEncryption: String) {
        cdkBuilder.transitEncryption(transitEncryption)
    }

    /**
     * @param transitEncryptionPort The port to use when sending encrypted data between the Amazon
     *   ECS host and the Amazon EFS server. EFS mount helper uses.
     */
    public fun transitEncryptionPort(transitEncryptionPort: Number) {
        cdkBuilder.transitEncryptionPort(transitEncryptionPort)
    }

    public fun build(): EfsVolumeConfiguration = cdkBuilder.build()
}
