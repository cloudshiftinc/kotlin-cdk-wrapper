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

package io.cloudshiftdev.awscdkdsl.services.batch

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.batch.EfsVolumeOptions
import software.amazon.awscdk.services.efs.IFileSystem

/**
 * Options for configuring an EfsVolume.
 *
 * Example:
 * ```
 * IFileSystem myFileSystem;
 * Role myJobRole;
 * myFileSystem.grantRead(myJobRole);
 * EcsJobDefinition jobDefn = EcsJobDefinition.Builder.create(this, "JobDefn")
 * .container(EcsEc2ContainerDefinition.Builder.create(this, "containerDefn")
 * .image(ContainerImage.fromRegistry("public.ecr.aws/amazonlinux/amazonlinux:latest"))
 * .memory(Size.mebibytes(2048))
 * .cpu(256)
 * .volumes(List.of(EcsVolume.efs(EfsVolumeOptions.builder()
 * .name("myVolume")
 * .fileSystem(myFileSystem)
 * .containerPath("/Volumes/myVolume")
 * .useJobRole(true)
 * .build())))
 * .jobRole(myJobRole)
 * .build())
 * .build();
 * ```
 */
@CdkDslMarker
public class EfsVolumeOptionsDsl {
    private val cdkBuilder: EfsVolumeOptions.Builder = EfsVolumeOptions.builder()

    /**
     * @param accessPointId The Amazon EFS access point ID to use. If an access point is specified,
     *   `rootDirectory` must either be omitted or set to `/` which enforces the path set on the EFS
     *   access point. If an access point is used, `enableTransitEncryption` must be `true`.
     */
    public fun accessPointId(accessPointId: String) {
        cdkBuilder.accessPointId(accessPointId)
    }

    /** @param containerPath the path on the container where this volume is mounted. */
    public fun containerPath(containerPath: String) {
        cdkBuilder.containerPath(containerPath)
    }

    /**
     * @param enableTransitEncryption Enables encryption for Amazon EFS data in transit between the
     *   Amazon ECS host and the Amazon EFS server.
     */
    public fun enableTransitEncryption(enableTransitEncryption: Boolean) {
        cdkBuilder.enableTransitEncryption(enableTransitEncryption)
    }

    /** @param fileSystem The EFS File System that supports this volume. */
    public fun fileSystem(fileSystem: IFileSystem) {
        cdkBuilder.fileSystem(fileSystem)
    }

    /** @param name the name of this volume. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param readonly if set, the container will have readonly access to the volume. */
    public fun readonly(readonly: Boolean) {
        cdkBuilder.readonly(readonly)
    }

    /**
     * @param rootDirectory The directory within the Amazon EFS file system to mount as the root
     *   directory inside the host. If this parameter is omitted, the root of the Amazon EFS volume
     *   is used instead. Specifying `/` has the same effect as omitting this parameter. The maximum
     *   length is 4,096 characters.
     */
    public fun rootDirectory(rootDirectory: String) {
        cdkBuilder.rootDirectory(rootDirectory)
    }

    /**
     * @param transitEncryptionPort The port to use when sending encrypted data between the Amazon
     *   ECS host and the Amazon EFS server. The value must be between 0 and 65,535.
     */
    public fun transitEncryptionPort(transitEncryptionPort: Number) {
        cdkBuilder.transitEncryptionPort(transitEncryptionPort)
    }

    /**
     * @param useJobRole Whether or not to use the AWS Batch job IAM role defined in a job
     *   definition when mounting the Amazon EFS file system. If specified,
     *   `enableTransitEncryption` must be `true`.
     */
    public fun useJobRole(useJobRole: Boolean) {
        cdkBuilder.useJobRole(useJobRole)
    }

    public fun build(): EfsVolumeOptions = cdkBuilder.build()
}
