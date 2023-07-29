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

package cloudshift.awscdk.dsl.services.batch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.batch.CfnJobDefinition

/**
 * This is used when you're using an Amazon Elastic File System file system for job storage.
 *
 * For more information, see
 * [Amazon EFS Volumes](https://docs.aws.amazon.com/batch/latest/userguide/efs-volumes.html) in the
 * *AWS Batch User Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.batch.*;
 * EfsVolumeConfigurationProperty efsVolumeConfigurationProperty =
 * EfsVolumeConfigurationProperty.builder()
 * .fileSystemId("fileSystemId")
 * // the properties below are optional
 * .authorizationConfig(AuthorizationConfigProperty.builder()
 * .accessPointId("accessPointId")
 * .iam("iam")
 * .build())
 * .rootDirectory("rootDirectory")
 * .transitEncryption("transitEncryption")
 * .transitEncryptionPort(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-efsvolumeconfiguration.html)
 */
@CdkDslMarker
public class CfnJobDefinitionEfsVolumeConfigurationPropertyDsl {
    private val cdkBuilder: CfnJobDefinition.EfsVolumeConfigurationProperty.Builder =
        CfnJobDefinition.EfsVolumeConfigurationProperty.builder()

    /**
     * @param authorizationConfig The authorization configuration details for the Amazon EFS file
     *   system.
     */
    public fun authorizationConfig(authorizationConfig: IResolvable) {
        cdkBuilder.authorizationConfig(authorizationConfig)
    }

    /**
     * @param authorizationConfig The authorization configuration details for the Amazon EFS file
     *   system.
     */
    public fun authorizationConfig(
        authorizationConfig: CfnJobDefinition.AuthorizationConfigProperty
    ) {
        cdkBuilder.authorizationConfig(authorizationConfig)
    }

    /** @param fileSystemId The Amazon EFS file system ID to use. */
    public fun fileSystemId(fileSystemId: String) {
        cdkBuilder.fileSystemId(fileSystemId)
    }

    /**
     * @param rootDirectory The directory within the Amazon EFS file system to mount as the root
     *   directory inside the host. If this parameter is omitted, the root of the Amazon EFS volume
     *   is used instead. Specifying `/` has the same effect as omitting this parameter. The maximum
     *   length is 4,096 characters.
     *
     * If an EFS access point is specified in the `authorizationConfig` , the root directory
     * parameter must either be omitted or set to `/` , which enforces the path set on the Amazon
     * EFS access point.
     */
    public fun rootDirectory(rootDirectory: String) {
        cdkBuilder.rootDirectory(rootDirectory)
    }

    /**
     * @param transitEncryption Determines whether to enable encryption for Amazon EFS data in
     *   transit between the Amazon ECS host and the Amazon EFS server. Transit encryption must be
     *   enabled if Amazon EFS IAM authorization is used. If this parameter is omitted, the default
     *   value of `DISABLED` is used. For more information, see
     *   [Encrypting data in transit](https://docs.aws.amazon.com/efs/latest/ug/encryption-in-transit.html)
     *   in the *Amazon Elastic File System User Guide* .
     */
    public fun transitEncryption(transitEncryption: String) {
        cdkBuilder.transitEncryption(transitEncryption)
    }

    /**
     * @param transitEncryptionPort The port to use when sending encrypted data between the Amazon
     *   ECS host and the Amazon EFS server. If you don't specify a transit encryption port, it uses
     *   the port selection strategy that the Amazon EFS mount helper uses. The value must be
     *   between 0 and 65,535. For more information, see
     *   [EFS mount helper](https://docs.aws.amazon.com/efs/latest/ug/efs-mount-helper.html) in the
     *   *Amazon Elastic File System User Guide* .
     */
    public fun transitEncryptionPort(transitEncryptionPort: Number) {
        cdkBuilder.transitEncryptionPort(transitEncryptionPort)
    }

    public fun build(): CfnJobDefinition.EfsVolumeConfigurationProperty = cdkBuilder.build()
}
