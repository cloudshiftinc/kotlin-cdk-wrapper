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

package cloudshift.awscdk.dsl.services.efs

import software.amazon.awscdk.services.efs.AccessPoint
import software.amazon.awscdk.services.efs.AccessPointAttributes
import software.amazon.awscdk.services.efs.AccessPointOptions
import software.amazon.awscdk.services.efs.AccessPointProps
import software.amazon.awscdk.services.efs.Acl
import software.amazon.awscdk.services.efs.CfnAccessPoint
import software.amazon.awscdk.services.efs.CfnAccessPointProps
import software.amazon.awscdk.services.efs.CfnFileSystem
import software.amazon.awscdk.services.efs.CfnFileSystemProps
import software.amazon.awscdk.services.efs.CfnMountTarget
import software.amazon.awscdk.services.efs.CfnMountTargetProps
import software.amazon.awscdk.services.efs.FileSystem
import software.amazon.awscdk.services.efs.FileSystemAttributes
import software.amazon.awscdk.services.efs.FileSystemProps
import software.amazon.awscdk.services.efs.PosixUser
import software.constructs.Construct
import kotlin.String
import kotlin.Unit

public object efs {
    public inline fun accessPoint(
        scope: Construct,
        id: String,
        block: AccessPointDsl.() -> Unit = {},
    ): AccessPoint {
        val builder = AccessPointDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun accessPointAttributes(block: AccessPointAttributesDsl.() -> Unit = {}): AccessPointAttributes {
        val builder = AccessPointAttributesDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun accessPointOptions(block: AccessPointOptionsDsl.() -> Unit = {}): AccessPointOptions {
        val builder = AccessPointOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun accessPointProps(block: AccessPointPropsDsl.() -> Unit = {}): AccessPointProps {
        val builder = AccessPointPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun acl(block: AclDsl.() -> Unit = {}): Acl {
        val builder = AclDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnAccessPoint(
        scope: Construct,
        id: String,
        block: CfnAccessPointDsl.() -> Unit = {},
    ): CfnAccessPoint {
        val builder = CfnAccessPointDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnAccessPointAccessPointTagProperty(
        block: CfnAccessPointAccessPointTagPropertyDsl.() -> Unit =
            {},
    ): CfnAccessPoint.AccessPointTagProperty {
        val builder = CfnAccessPointAccessPointTagPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnAccessPointCreationInfoProperty(
        block: CfnAccessPointCreationInfoPropertyDsl.() -> Unit =
            {},
    ): CfnAccessPoint.CreationInfoProperty {
        val builder = CfnAccessPointCreationInfoPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnAccessPointPosixUserProperty(
        block: CfnAccessPointPosixUserPropertyDsl.() -> Unit =
            {},
    ): CfnAccessPoint.PosixUserProperty {
        val builder = CfnAccessPointPosixUserPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnAccessPointProps(block: CfnAccessPointPropsDsl.() -> Unit = {}): CfnAccessPointProps {
        val builder = CfnAccessPointPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnAccessPointRootDirectoryProperty(
        block: CfnAccessPointRootDirectoryPropertyDsl.() -> Unit =
            {},
    ): CfnAccessPoint.RootDirectoryProperty {
        val builder = CfnAccessPointRootDirectoryPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnFileSystem(
        scope: Construct,
        id: String,
        block: CfnFileSystemDsl.() -> Unit = {},
    ): CfnFileSystem {
        val builder = CfnFileSystemDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnFileSystemBackupPolicyProperty(
        block: CfnFileSystemBackupPolicyPropertyDsl.() -> Unit =
            {},
    ): CfnFileSystem.BackupPolicyProperty {
        val builder = CfnFileSystemBackupPolicyPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnFileSystemElasticFileSystemTagProperty(
        block: CfnFileSystemElasticFileSystemTagPropertyDsl.() -> Unit =
            {},
    ): CfnFileSystem.ElasticFileSystemTagProperty {
        val builder = CfnFileSystemElasticFileSystemTagPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnFileSystemLifecyclePolicyProperty(
        block: CfnFileSystemLifecyclePolicyPropertyDsl.() -> Unit =
            {},
    ): CfnFileSystem.LifecyclePolicyProperty {
        val builder = CfnFileSystemLifecyclePolicyPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnFileSystemProps(block: CfnFileSystemPropsDsl.() -> Unit = {}): CfnFileSystemProps {
        val builder = CfnFileSystemPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnMountTarget(
        scope: Construct,
        id: String,
        block: CfnMountTargetDsl.() -> Unit = {},
    ): CfnMountTarget {
        val builder = CfnMountTargetDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnMountTargetProps(block: CfnMountTargetPropsDsl.() -> Unit = {}): CfnMountTargetProps {
        val builder = CfnMountTargetPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun fileSystem(
        scope: Construct,
        id: String,
        block: FileSystemDsl.() -> Unit = {},
    ): FileSystem {
        val builder = FileSystemDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun fileSystemAttributes(block: FileSystemAttributesDsl.() -> Unit = {}): FileSystemAttributes {
        val builder = FileSystemAttributesDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun fileSystemProps(block: FileSystemPropsDsl.() -> Unit = {}): FileSystemProps {
        val builder = FileSystemPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun posixUser(block: PosixUserDsl.() -> Unit = {}): PosixUser {
        val builder = PosixUserDsl()
        builder.apply(block)
        return builder.build()
    }
}
