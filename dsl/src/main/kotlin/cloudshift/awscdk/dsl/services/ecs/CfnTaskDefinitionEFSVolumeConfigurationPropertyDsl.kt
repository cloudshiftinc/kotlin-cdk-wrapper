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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ecs.CfnTaskDefinition

/**
 * This parameter is specified when you're using an Amazon Elastic File System file system for task
 * storage.
 *
 * For more information, see
 * [Amazon EFS volumes](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/efs-volumes.html)
 * in the *Amazon Elastic Container Service Developer Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ecs.*;
 * EFSVolumeConfigurationProperty eFSVolumeConfigurationProperty =
 * EFSVolumeConfigurationProperty.builder()
 * .filesystemId("filesystemId")
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-efsvolumeconfiguration.html)
 */
@CdkDslMarker
public class CfnTaskDefinitionEFSVolumeConfigurationPropertyDsl {
    private val cdkBuilder: CfnTaskDefinition.EFSVolumeConfigurationProperty.Builder =
        CfnTaskDefinition.EFSVolumeConfigurationProperty.builder()

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
        authorizationConfig: CfnTaskDefinition.AuthorizationConfigProperty
    ) {
        cdkBuilder.authorizationConfig(authorizationConfig)
    }

    /** @param filesystemId The Amazon EFS file system ID to use. */
    public fun filesystemId(filesystemId: String) {
        cdkBuilder.filesystemId(filesystemId)
    }

    /**
     * @param rootDirectory The directory within the Amazon EFS file system to mount as the root
     *   directory inside the host. If this parameter is omitted, the root of the Amazon EFS volume
     *   will be used. Specifying `/` will have the same effect as omitting this parameter.
     *
     * If an EFS access point is specified in the `authorizationConfig` , the root directory
     * parameter must either be omitted or set to `/` which will enforce the path set on the EFS
     * access point.
     */
    public fun rootDirectory(rootDirectory: String) {
        cdkBuilder.rootDirectory(rootDirectory)
    }

    /**
     * @param transitEncryption Determines whether to use encryption for Amazon EFS data in transit
     *   between the Amazon ECS host and the Amazon EFS server. Transit encryption must be turned on
     *   if Amazon EFS IAM authorization is used. If this parameter is omitted, the default value of
     *   `DISABLED` is used. For more information, see
     *   [Encrypting data in transit](https://docs.aws.amazon.com/efs/latest/ug/encryption-in-transit.html)
     *   in the *Amazon Elastic File System User Guide* .
     */
    public fun transitEncryption(transitEncryption: String) {
        cdkBuilder.transitEncryption(transitEncryption)
    }

    /**
     * @param transitEncryptionPort The port to use when sending encrypted data between the Amazon
     *   ECS host and the Amazon EFS server. If you do not specify a transit encryption port, it
     *   will use the port selection strategy that the Amazon EFS mount helper uses. For more
     *   information, see
     *   [EFS mount helper](https://docs.aws.amazon.com/efs/latest/ug/efs-mount-helper.html) in the
     *   *Amazon Elastic File System User Guide* .
     */
    public fun transitEncryptionPort(transitEncryptionPort: Number) {
        cdkBuilder.transitEncryptionPort(transitEncryptionPort)
    }

    public fun build(): CfnTaskDefinition.EFSVolumeConfigurationProperty = cdkBuilder.build()
}
