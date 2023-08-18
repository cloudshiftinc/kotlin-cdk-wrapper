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

package io.cloudshiftdev.awscdkdsl.services.efs

import kotlin.String
import kotlin.Unit
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

public object efs {
    /**
     * Represents the AccessPoint.
     *
     * Example:
     * ```
     * AccessPoint.fromAccessPointAttributes(this, "ap", AccessPointAttributes.builder()
     * .accessPointId("fsap-1293c4d9832fo0912")
     * .fileSystem(FileSystem.fromFileSystemAttributes(this, "efs", FileSystemAttributes.builder()
     * .fileSystemId("fs-099d3e2f")
     * .securityGroup(SecurityGroup.fromSecurityGroupId(this, "sg", "sg-51530134"))
     * .build()))
     * .build());
     * ```
     */
    public inline fun accessPoint(
        scope: Construct,
        id: String,
        block: AccessPointDsl.() -> Unit = {},
    ): AccessPoint {
        val builder = AccessPointDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Attributes that can be specified when importing an AccessPoint.
     *
     * Example:
     * ```
     * AccessPoint.fromAccessPointAttributes(this, "ap", AccessPointAttributes.builder()
     * .accessPointId("fsap-1293c4d9832fo0912")
     * .fileSystem(FileSystem.fromFileSystemAttributes(this, "efs", FileSystemAttributes.builder()
     * .fileSystemId("fs-099d3e2f")
     * .securityGroup(SecurityGroup.fromSecurityGroupId(this, "sg", "sg-51530134"))
     * .build()))
     * .build());
     * ```
     */
    public inline fun accessPointAttributes(
        block: AccessPointAttributesDsl.() -> Unit = {}
    ): AccessPointAttributes {
        val builder = AccessPointAttributesDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options to create an AccessPoint.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.ec2.*;
     * import software.amazon.awscdk.services.efs.*;
     * // create a new VPC
     * Vpc vpc = new Vpc(this, "VPC");
     * // create a new Amazon EFS filesystem
     * FileSystem fileSystem = FileSystem.Builder.create(this, "Efs").vpc(vpc).build();
     * // create a new access point from the filesystem
     * AccessPoint accessPoint = fileSystem.addAccessPoint("AccessPoint", AccessPointOptions.builder()
     * // set /export/lambda as the root of the access point
     * .path("/export/lambda")
     * // as /export/lambda does not exist in a new efs filesystem, the efs will create the directory
     * with the following createAcl
     * .createAcl(Acl.builder()
     * .ownerUid("1001")
     * .ownerGid("1001")
     * .permissions("750")
     * .build())
     * // enforce the POSIX identity so lambda function will access with this identity
     * .posixUser(PosixUser.builder()
     * .uid("1001")
     * .gid("1001")
     * .build())
     * .build());
     * Function fn = Function.Builder.create(this, "MyLambda")
     * // mount the access point to /mnt/msg in the lambda runtime environment
     * .filesystem(FileSystem.fromEfsAccessPoint(accessPoint, "/mnt/msg"))
     * .runtime(Runtime.NODEJS_18_X)
     * .handler("index.handler")
     * .code(Code.fromAsset(join(__dirname, "lambda-handler")))
     * .vpc(vpc)
     * .build();
     * ```
     */
    public inline fun accessPointOptions(
        block: AccessPointOptionsDsl.() -> Unit = {}
    ): AccessPointOptions {
        val builder = AccessPointOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for the AccessPoint.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.efs.*;
     * FileSystem fileSystem;
     * AccessPointProps accessPointProps = AccessPointProps.builder()
     * .fileSystem(fileSystem)
     * // the properties below are optional
     * .createAcl(Acl.builder()
     * .ownerGid("ownerGid")
     * .ownerUid("ownerUid")
     * .permissions("permissions")
     * .build())
     * .path("path")
     * .posixUser(PosixUser.builder()
     * .gid("gid")
     * .uid("uid")
     * // the properties below are optional
     * .secondaryGids(List.of("secondaryGids"))
     * .build())
     * .build();
     * ```
     */
    public inline fun accessPointProps(
        block: AccessPointPropsDsl.() -> Unit = {}
    ): AccessPointProps {
        val builder = AccessPointPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Permissions as POSIX ACL.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.ec2.*;
     * import software.amazon.awscdk.services.efs.*;
     * // create a new VPC
     * Vpc vpc = new Vpc(this, "VPC");
     * // create a new Amazon EFS filesystem
     * FileSystem fileSystem = FileSystem.Builder.create(this, "Efs").vpc(vpc).build();
     * // create a new access point from the filesystem
     * AccessPoint accessPoint = fileSystem.addAccessPoint("AccessPoint", AccessPointOptions.builder()
     * // set /export/lambda as the root of the access point
     * .path("/export/lambda")
     * // as /export/lambda does not exist in a new efs filesystem, the efs will create the directory
     * with the following createAcl
     * .createAcl(Acl.builder()
     * .ownerUid("1001")
     * .ownerGid("1001")
     * .permissions("750")
     * .build())
     * // enforce the POSIX identity so lambda function will access with this identity
     * .posixUser(PosixUser.builder()
     * .uid("1001")
     * .gid("1001")
     * .build())
     * .build());
     * Function fn = Function.Builder.create(this, "MyLambda")
     * // mount the access point to /mnt/msg in the lambda runtime environment
     * .filesystem(FileSystem.fromEfsAccessPoint(accessPoint, "/mnt/msg"))
     * .runtime(Runtime.NODEJS_18_X)
     * .handler("index.handler")
     * .code(Code.fromAsset(join(__dirname, "lambda-handler")))
     * .vpc(vpc)
     * .build();
     * ```
     */
    public inline fun acl(block: AclDsl.() -> Unit = {}): Acl {
        val builder = AclDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::EFS::AccessPoint` resource creates an EFS access point.
     *
     * An access point is an application-specific view into an EFS file system that applies an
     * operating system user and group, and a file system path, to any file system request made
     * through the access point. The operating system user and group override any identity
     * information provided by the NFS client. The file system path is exposed as the access point's
     * root directory. Applications using the access point can only access data in its own directory
     * and below. To learn more, see
     * [Mounting a file system using EFS access points](https://docs.aws.amazon.com/efs/latest/ug/efs-access-points.html)
     * .
     *
     * This operation requires permissions for the `elasticfilesystem:CreateAccessPoint` action.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.efs.*;
     * CfnAccessPoint cfnAccessPoint = CfnAccessPoint.Builder.create(this, "MyCfnAccessPoint")
     * .fileSystemId("fileSystemId")
     * // the properties below are optional
     * .accessPointTags(List.of(AccessPointTagProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .clientToken("clientToken")
     * .posixUser(PosixUserProperty.builder()
     * .gid("gid")
     * .uid("uid")
     * // the properties below are optional
     * .secondaryGids(List.of("secondaryGids"))
     * .build())
     * .rootDirectory(RootDirectoryProperty.builder()
     * .creationInfo(CreationInfoProperty.builder()
     * .ownerGid("ownerGid")
     * .ownerUid("ownerUid")
     * .permissions("permissions")
     * .build())
     * .path("path")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-accesspoint.html)
     */
    public inline fun cfnAccessPoint(
        scope: Construct,
        id: String,
        block: CfnAccessPointDsl.() -> Unit = {},
    ): CfnAccessPoint {
        val builder = CfnAccessPointDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * A tag is a key-value pair attached to a file system.
     *
     * Allowed characters in the `Key` and `Value` properties are letters, white space, and numbers
     * that can be represented in UTF-8, and the following characters: `+ - = . _ : /`
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.efs.*;
     * AccessPointTagProperty accessPointTagProperty = AccessPointTagProperty.builder()
     * .key("key")
     * .value("value")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-efs-accesspoint-accesspointtag.html)
     */
    public inline fun cfnAccessPointAccessPointTagProperty(
        block: CfnAccessPointAccessPointTagPropertyDsl.() -> Unit = {}
    ): CfnAccessPoint.AccessPointTagProperty {
        val builder = CfnAccessPointAccessPointTagPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Required if the `RootDirectory` &gt; `Path` specified does not exist.
     *
     * Specifies the POSIX IDs and permissions to apply to the access point's `RootDirectory` &gt;
     * `Path` . If the access point root directory does not exist, EFS creates it with these
     * settings when a client connects to the access point. When specifying `CreationInfo` , you
     * must include values for all properties.
     *
     * Amazon EFS creates a root directory only if you have provided the CreationInfo: OwnUid,
     * OwnGID, and permissions for the directory. If you do not provide this information, Amazon EFS
     * does not create the root directory. If the root directory does not exist, attempts to mount
     * using the access point will fail.
     *
     * If you do not provide `CreationInfo` and the specified `RootDirectory` does not exist,
     * attempts to mount the file system using the access point will fail.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.efs.*;
     * CreationInfoProperty creationInfoProperty = CreationInfoProperty.builder()
     * .ownerGid("ownerGid")
     * .ownerUid("ownerUid")
     * .permissions("permissions")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-efs-accesspoint-creationinfo.html)
     */
    public inline fun cfnAccessPointCreationInfoProperty(
        block: CfnAccessPointCreationInfoPropertyDsl.() -> Unit = {}
    ): CfnAccessPoint.CreationInfoProperty {
        val builder = CfnAccessPointCreationInfoPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The full POSIX identity, including the user ID, group ID, and any secondary group IDs, on the
     * access point that is used for all file system operations performed by NFS clients using the
     * access point.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.efs.*;
     * PosixUserProperty posixUserProperty = PosixUserProperty.builder()
     * .gid("gid")
     * .uid("uid")
     * // the properties below are optional
     * .secondaryGids(List.of("secondaryGids"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-efs-accesspoint-posixuser.html)
     */
    public inline fun cfnAccessPointPosixUserProperty(
        block: CfnAccessPointPosixUserPropertyDsl.() -> Unit = {}
    ): CfnAccessPoint.PosixUserProperty {
        val builder = CfnAccessPointPosixUserPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnAccessPoint`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.efs.*;
     * CfnAccessPointProps cfnAccessPointProps = CfnAccessPointProps.builder()
     * .fileSystemId("fileSystemId")
     * // the properties below are optional
     * .accessPointTags(List.of(AccessPointTagProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .clientToken("clientToken")
     * .posixUser(PosixUserProperty.builder()
     * .gid("gid")
     * .uid("uid")
     * // the properties below are optional
     * .secondaryGids(List.of("secondaryGids"))
     * .build())
     * .rootDirectory(RootDirectoryProperty.builder()
     * .creationInfo(CreationInfoProperty.builder()
     * .ownerGid("ownerGid")
     * .ownerUid("ownerUid")
     * .permissions("permissions")
     * .build())
     * .path("path")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-accesspoint.html)
     */
    public inline fun cfnAccessPointProps(
        block: CfnAccessPointPropsDsl.() -> Unit = {}
    ): CfnAccessPointProps {
        val builder = CfnAccessPointPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the directory on the Amazon EFS file system that the access point provides access
     * to.
     *
     * The access point exposes the specified file system path as the root directory of your file
     * system to applications using the access point. NFS clients using the access point can only
     * access data in the access point's `RootDirectory` and it's subdirectories.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.efs.*;
     * RootDirectoryProperty rootDirectoryProperty = RootDirectoryProperty.builder()
     * .creationInfo(CreationInfoProperty.builder()
     * .ownerGid("ownerGid")
     * .ownerUid("ownerUid")
     * .permissions("permissions")
     * .build())
     * .path("path")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-efs-accesspoint-rootdirectory.html)
     */
    public inline fun cfnAccessPointRootDirectoryProperty(
        block: CfnAccessPointRootDirectoryPropertyDsl.() -> Unit = {}
    ): CfnAccessPoint.RootDirectoryProperty {
        val builder = CfnAccessPointRootDirectoryPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::EFS::FileSystem` resource creates a new, empty file system in Amazon Elastic File
     * System ( Amazon EFS ).
     *
     * You must create a mount target (
     * [AWS::EFS::MountTarget](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-mounttarget.html)
     * ) to mount your EFS file system on an Amazon EC2 or other AWS cloud compute resource.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.efs.*;
     * Object fileSystemPolicy;
     * CfnFileSystem cfnFileSystem = CfnFileSystem.Builder.create(this, "MyCfnFileSystem")
     * .availabilityZoneName("availabilityZoneName")
     * .backupPolicy(BackupPolicyProperty.builder()
     * .status("status")
     * .build())
     * .bypassPolicyLockoutSafetyCheck(false)
     * .encrypted(false)
     * .fileSystemPolicy(fileSystemPolicy)
     * .fileSystemTags(List.of(ElasticFileSystemTagProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .kmsKeyId("kmsKeyId")
     * .lifecyclePolicies(List.of(LifecyclePolicyProperty.builder()
     * .transitionToIa("transitionToIa")
     * .transitionToPrimaryStorageClass("transitionToPrimaryStorageClass")
     * .build()))
     * .performanceMode("performanceMode")
     * .provisionedThroughputInMibps(123)
     * .throughputMode("throughputMode")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html)
     */
    public inline fun cfnFileSystem(
        scope: Construct,
        id: String,
        block: CfnFileSystemDsl.() -> Unit = {},
    ): CfnFileSystem {
        val builder = CfnFileSystemDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The backup policy turns automatic backups for the file system on or off.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.efs.*;
     * BackupPolicyProperty backupPolicyProperty = BackupPolicyProperty.builder()
     * .status("status")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-efs-filesystem-backuppolicy.html)
     */
    public inline fun cfnFileSystemBackupPolicyProperty(
        block: CfnFileSystemBackupPolicyPropertyDsl.() -> Unit = {}
    ): CfnFileSystem.BackupPolicyProperty {
        val builder = CfnFileSystemBackupPolicyPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A tag is a key-value pair attached to a file system.
     *
     * Allowed characters in the `Key` and `Value` properties are letters, white space, and numbers
     * that can be represented in UTF-8, and the following characters: `+ - = . _ : /`
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.efs.*;
     * ElasticFileSystemTagProperty elasticFileSystemTagProperty =
     * ElasticFileSystemTagProperty.builder()
     * .key("key")
     * .value("value")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-efs-filesystem-elasticfilesystemtag.html)
     */
    public inline fun cfnFileSystemElasticFileSystemTagProperty(
        block: CfnFileSystemElasticFileSystemTagPropertyDsl.() -> Unit = {}
    ): CfnFileSystem.ElasticFileSystemTagProperty {
        val builder = CfnFileSystemElasticFileSystemTagPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes a policy used by EFS lifecycle management and EFS Intelligent-Tiering that
     * specifies when to transition files into and out of the file system's Infrequent Access (IA)
     * storage class.
     *
     * For more information, see
     * [EFS Intelligent‐Tiering and EFS Lifecycle Management](https://docs.aws.amazon.com/efs/latest/ug/lifecycle-management-efs.html)
     * .
     * * Each `LifecyclePolicy` object can have only a single transition. This means that in a
     *   request body, `LifecyclePolicies` must be structured as an array of `LifecyclePolicy`
     *   objects, one object for each transition, `TransitionToIA` ,
     *   `TransitionToPrimaryStorageClass` .
     * * See the AWS::EFS::FileSystem examples for the correct `LifecyclePolicy` structure. Do not
     *   use the syntax shown on this page.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.efs.*;
     * LifecyclePolicyProperty lifecyclePolicyProperty = LifecyclePolicyProperty.builder()
     * .transitionToIa("transitionToIa")
     * .transitionToPrimaryStorageClass("transitionToPrimaryStorageClass")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-efs-filesystem-lifecyclepolicy.html)
     */
    public inline fun cfnFileSystemLifecyclePolicyProperty(
        block: CfnFileSystemLifecyclePolicyPropertyDsl.() -> Unit = {}
    ): CfnFileSystem.LifecyclePolicyProperty {
        val builder = CfnFileSystemLifecyclePolicyPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnFileSystem`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.efs.*;
     * Object fileSystemPolicy;
     * CfnFileSystemProps cfnFileSystemProps = CfnFileSystemProps.builder()
     * .availabilityZoneName("availabilityZoneName")
     * .backupPolicy(BackupPolicyProperty.builder()
     * .status("status")
     * .build())
     * .bypassPolicyLockoutSafetyCheck(false)
     * .encrypted(false)
     * .fileSystemPolicy(fileSystemPolicy)
     * .fileSystemTags(List.of(ElasticFileSystemTagProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .kmsKeyId("kmsKeyId")
     * .lifecyclePolicies(List.of(LifecyclePolicyProperty.builder()
     * .transitionToIa("transitionToIa")
     * .transitionToPrimaryStorageClass("transitionToPrimaryStorageClass")
     * .build()))
     * .performanceMode("performanceMode")
     * .provisionedThroughputInMibps(123)
     * .throughputMode("throughputMode")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html)
     */
    public inline fun cfnFileSystemProps(
        block: CfnFileSystemPropsDsl.() -> Unit = {}
    ): CfnFileSystemProps {
        val builder = CfnFileSystemPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::EFS::MountTarget` resource is an Amazon EFS resource that creates a mount target
     * for an EFS file system.
     *
     * You can then mount the file system on Amazon EC2 instances or other resources by using the
     * mount target.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.efs.*;
     * CfnMountTarget cfnMountTarget = CfnMountTarget.Builder.create(this, "MyCfnMountTarget")
     * .fileSystemId("fileSystemId")
     * .securityGroups(List.of("securityGroups"))
     * .subnetId("subnetId")
     * // the properties below are optional
     * .ipAddress("ipAddress")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-mounttarget.html)
     */
    public inline fun cfnMountTarget(
        scope: Construct,
        id: String,
        block: CfnMountTargetDsl.() -> Unit = {},
    ): CfnMountTarget {
        val builder = CfnMountTargetDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnMountTarget`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.efs.*;
     * CfnMountTargetProps cfnMountTargetProps = CfnMountTargetProps.builder()
     * .fileSystemId("fileSystemId")
     * .securityGroups(List.of("securityGroups"))
     * .subnetId("subnetId")
     * // the properties below are optional
     * .ipAddress("ipAddress")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-mounttarget.html)
     */
    public inline fun cfnMountTargetProps(
        block: CfnMountTargetPropsDsl.() -> Unit = {}
    ): CfnMountTargetProps {
        val builder = CfnMountTargetPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The Elastic File System implementation of IFileSystem.
     *
     * It creates a new, empty file system in Amazon Elastic File System (Amazon EFS). It also
     * creates mount target (AWS::EFS::MountTarget) implicitly to mount the EFS file system on an
     * Amazon Elastic Compute Cloud (Amazon EC2) instance or another resource.
     *
     * Example:
     * ```
     * FileSystem fileSystem = FileSystem.Builder.create(this, "MyEfsFileSystem")
     * .vpc(new Vpc(this, "VPC"))
     * .lifecyclePolicy(LifecyclePolicy.AFTER_14_DAYS) // files are not transitioned to infrequent
     * access (IA) storage by default
     * .performanceMode(PerformanceMode.GENERAL_PURPOSE) // default
     * .outOfInfrequentAccessPolicy(OutOfInfrequentAccessPolicy.AFTER_1_ACCESS)
     * .build();
     * ```
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html)
     */
    public inline fun fileSystem(
        scope: Construct,
        id: String,
        block: FileSystemDsl.() -> Unit = {},
    ): FileSystem {
        val builder = FileSystemDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties that describe an existing EFS file system.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.iam.*;
     * IFileSystem importedFileSystem = FileSystem.fromFileSystemAttributes(this, "existingFS",
     * FileSystemAttributes.builder()
     * .fileSystemId("fs-12345678") // You can also use fileSystemArn instead of fileSystemId.
     * .securityGroup(SecurityGroup.fromSecurityGroupId(this, "SG", "sg-123456789",
     * SecurityGroupImportOptions.builder()
     * .allowAllOutbound(false)
     * .build()))
     * .build());
     * ```
     */
    public inline fun fileSystemAttributes(
        block: FileSystemAttributesDsl.() -> Unit = {}
    ): FileSystemAttributes {
        val builder = FileSystemAttributesDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties of EFS FileSystem.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.iam.*;
     * PolicyDocument myFileSystemPolicy = PolicyDocument.Builder.create()
     * .statements(List.of(PolicyStatement.Builder.create()
     * .actions(List.of("elasticfilesystem:ClientWrite", "elasticfilesystem:ClientMount"))
     * .principals(List.of(new AccountRootPrincipal()))
     * .resources(List.of("*"))
     * .conditions(Map.of(
     * "Bool", Map.of(
     * "elasticfilesystem:AccessedViaMountTarget", "true")))
     * .build()))
     * .build();
     * FileSystem fileSystem = FileSystem.Builder.create(this, "MyEfsFileSystem")
     * .vpc(new Vpc(this, "VPC"))
     * .fileSystemPolicy(myFileSystemPolicy)
     * .build();
     * ```
     */
    public inline fun fileSystemProps(block: FileSystemPropsDsl.() -> Unit = {}): FileSystemProps {
        val builder = FileSystemPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Represents the PosixUser.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.ec2.*;
     * import software.amazon.awscdk.services.efs.*;
     * // create a new VPC
     * Vpc vpc = new Vpc(this, "VPC");
     * // create a new Amazon EFS filesystem
     * FileSystem fileSystem = FileSystem.Builder.create(this, "Efs").vpc(vpc).build();
     * // create a new access point from the filesystem
     * AccessPoint accessPoint = fileSystem.addAccessPoint("AccessPoint", AccessPointOptions.builder()
     * // set /export/lambda as the root of the access point
     * .path("/export/lambda")
     * // as /export/lambda does not exist in a new efs filesystem, the efs will create the directory
     * with the following createAcl
     * .createAcl(Acl.builder()
     * .ownerUid("1001")
     * .ownerGid("1001")
     * .permissions("750")
     * .build())
     * // enforce the POSIX identity so lambda function will access with this identity
     * .posixUser(PosixUser.builder()
     * .uid("1001")
     * .gid("1001")
     * .build())
     * .build());
     * Function fn = Function.Builder.create(this, "MyLambda")
     * // mount the access point to /mnt/msg in the lambda runtime environment
     * .filesystem(FileSystem.fromEfsAccessPoint(accessPoint, "/mnt/msg"))
     * .runtime(Runtime.NODEJS_18_X)
     * .handler("index.handler")
     * .code(Code.fromAsset(join(__dirname, "lambda-handler")))
     * .vpc(vpc)
     * .build();
     * ```
     */
    public inline fun posixUser(block: PosixUserDsl.() -> Unit = {}): PosixUser {
        val builder = PosixUserDsl()
        builder.apply(block)
        return builder.build()
    }
}
