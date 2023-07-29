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
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.batch.CfnJobDefinition

/**
 * A list of volumes that are associated with the job.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.batch.*;
 * VolumesProperty volumesProperty = VolumesProperty.builder()
 * .efsVolumeConfiguration(EfsVolumeConfigurationProperty.builder()
 * .fileSystemId("fileSystemId")
 * // the properties below are optional
 * .authorizationConfig(AuthorizationConfigProperty.builder()
 * .accessPointId("accessPointId")
 * .iam("iam")
 * .build())
 * .rootDirectory("rootDirectory")
 * .transitEncryption("transitEncryption")
 * .transitEncryptionPort(123)
 * .build())
 * .host(VolumesHostProperty.builder()
 * .sourcePath("sourcePath")
 * .build())
 * .name("name")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-volumes.html)
 */
@CdkDslMarker
public class CfnJobDefinitionVolumesPropertyDsl {
    private val cdkBuilder: CfnJobDefinition.VolumesProperty.Builder =
        CfnJobDefinition.VolumesProperty.builder()

    /**
     * @param efsVolumeConfiguration This is used when you're using an Amazon Elastic File System
     *   file system for job storage. For more information, see
     *   [Amazon EFS Volumes](https://docs.aws.amazon.com/batch/latest/userguide/efs-volumes.html)
     *   in the *AWS Batch User Guide* .
     */
    public fun efsVolumeConfiguration(efsVolumeConfiguration: IResolvable) {
        cdkBuilder.efsVolumeConfiguration(efsVolumeConfiguration)
    }

    /**
     * @param efsVolumeConfiguration This is used when you're using an Amazon Elastic File System
     *   file system for job storage. For more information, see
     *   [Amazon EFS Volumes](https://docs.aws.amazon.com/batch/latest/userguide/efs-volumes.html)
     *   in the *AWS Batch User Guide* .
     */
    public fun efsVolumeConfiguration(
        efsVolumeConfiguration: CfnJobDefinition.EfsVolumeConfigurationProperty
    ) {
        cdkBuilder.efsVolumeConfiguration(efsVolumeConfiguration)
    }

    /**
     * @param host The contents of the `host` parameter determine whether your data volume persists
     *   on the host container instance and where it's stored. If the host parameter is empty, then
     *   the Docker daemon assigns a host path for your data volume. However, the data isn't
     *   guaranteed to persist after the containers that are associated with it stop running.
     *
     * This parameter isn't applicable to jobs that are running on Fargate resources and shouldn't
     * be provided.
     */
    public fun host(host: IResolvable) {
        cdkBuilder.host(host)
    }

    /**
     * @param host The contents of the `host` parameter determine whether your data volume persists
     *   on the host container instance and where it's stored. If the host parameter is empty, then
     *   the Docker daemon assigns a host path for your data volume. However, the data isn't
     *   guaranteed to persist after the containers that are associated with it stop running.
     *
     * This parameter isn't applicable to jobs that are running on Fargate resources and shouldn't
     * be provided.
     */
    public fun host(host: CfnJobDefinition.VolumesHostProperty) {
        cdkBuilder.host(host)
    }

    /**
     * @param name The name of the volume. It can be up to 255 characters long. It can contain
     *   uppercase and lowercase letters, numbers, hyphens (-), and underscores (_). This name is
     *   referenced in the `sourceVolume` parameter of container definition `mountPoints` .
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CfnJobDefinition.VolumesProperty = cdkBuilder.build()
}
