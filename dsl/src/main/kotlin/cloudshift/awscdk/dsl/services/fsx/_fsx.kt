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

package cloudshift.awscdk.dsl.services.fsx

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.fsx.CfnDataRepositoryAssociation
import software.amazon.awscdk.services.fsx.CfnDataRepositoryAssociationProps
import software.amazon.awscdk.services.fsx.CfnFileSystem
import software.amazon.awscdk.services.fsx.CfnFileSystemProps
import software.amazon.awscdk.services.fsx.CfnSnapshot
import software.amazon.awscdk.services.fsx.CfnSnapshotProps
import software.amazon.awscdk.services.fsx.CfnStorageVirtualMachine
import software.amazon.awscdk.services.fsx.CfnStorageVirtualMachineProps
import software.amazon.awscdk.services.fsx.CfnVolume
import software.amazon.awscdk.services.fsx.CfnVolumeProps
import software.amazon.awscdk.services.fsx.FileSystemAttributes
import software.amazon.awscdk.services.fsx.FileSystemProps
import software.amazon.awscdk.services.fsx.LustreConfiguration
import software.amazon.awscdk.services.fsx.LustreFileSystem
import software.amazon.awscdk.services.fsx.LustreFileSystemProps
import software.amazon.awscdk.services.fsx.LustreMaintenanceTime
import software.amazon.awscdk.services.fsx.LustreMaintenanceTimeProps
import software.constructs.Construct

public object fsx {
    /**
     * Creates an Amazon FSx for Lustre data repository association (DRA).
     *
     * A data repository association is a link between a directory on the file system and an Amazon
     * S3 bucket or prefix. You can have a maximum of 8 data repository associations on a file
     * system. Data repository associations are supported on all FSx for Lustre 2.12 and newer file
     * systems, excluding `scratch_1` deployment type.
     *
     * Each data repository association must have a unique Amazon FSx file system directory and a
     * unique S3 bucket or prefix associated with it. You can configure a data repository
     * association for automatic import only, for automatic export only, or for both. To learn more
     * about linking a data repository to your file system, see
     * [Linking your file system to an S3 bucket](https://docs.aws.amazon.com/fsx/latest/LustreGuide/create-dra-linked-data-repo.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.fsx.*;
     * CfnDataRepositoryAssociation cfnDataRepositoryAssociation =
     * CfnDataRepositoryAssociation.Builder.create(this, "MyCfnDataRepositoryAssociation")
     * .dataRepositoryPath("dataRepositoryPath")
     * .fileSystemId("fileSystemId")
     * .fileSystemPath("fileSystemPath")
     * // the properties below are optional
     * .batchImportMetaDataOnCreate(false)
     * .importedFileChunkSize(123)
     * .s3(S3Property.builder()
     * .autoExportPolicy(AutoExportPolicyProperty.builder()
     * .events(List.of("events"))
     * .build())
     * .autoImportPolicy(AutoImportPolicyProperty.builder()
     * .events(List.of("events"))
     * .build())
     * .build())
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-datarepositoryassociation.html)
     */
    public inline fun cfnDataRepositoryAssociation(
        scope: Construct,
        id: String,
        block: CfnDataRepositoryAssociationDsl.() -> Unit = {},
    ): CfnDataRepositoryAssociation {
        val builder = CfnDataRepositoryAssociationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes a data repository association's automatic export policy.
     *
     * The `AutoExportPolicy` defines the types of updated objects on the file system that will be
     * automatically exported to the data repository. As you create, modify, or delete files, Amazon
     * FSx for Lustre automatically exports the defined changes asynchronously once your application
     * finishes modifying the file.
     *
     * The `AutoExportPolicy` is only supported on Amazon FSx for Lustre file systems with a data
     * repository association.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.fsx.*;
     * AutoExportPolicyProperty autoExportPolicyProperty = AutoExportPolicyProperty.builder()
     * .events(List.of("events"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-datarepositoryassociation-autoexportpolicy.html)
     */
    public inline fun cfnDataRepositoryAssociationAutoExportPolicyProperty(
        block: CfnDataRepositoryAssociationAutoExportPolicyPropertyDsl.() -> Unit = {}
    ): CfnDataRepositoryAssociation.AutoExportPolicyProperty {
        val builder = CfnDataRepositoryAssociationAutoExportPolicyPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes the data repository association's automatic import policy.
     *
     * The AutoImportPolicy defines how Amazon FSx keeps your file metadata and directory listings
     * up to date by importing changes to your Amazon FSx for Lustre file system as you modify
     * objects in a linked S3 bucket.
     *
     * The `AutoImportPolicy` is only supported on Amazon FSx for Lustre file systems with a data
     * repository association.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.fsx.*;
     * AutoImportPolicyProperty autoImportPolicyProperty = AutoImportPolicyProperty.builder()
     * .events(List.of("events"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-datarepositoryassociation-autoimportpolicy.html)
     */
    public inline fun cfnDataRepositoryAssociationAutoImportPolicyProperty(
        block: CfnDataRepositoryAssociationAutoImportPolicyPropertyDsl.() -> Unit = {}
    ): CfnDataRepositoryAssociation.AutoImportPolicyProperty {
        val builder = CfnDataRepositoryAssociationAutoImportPolicyPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnDataRepositoryAssociation`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.fsx.*;
     * CfnDataRepositoryAssociationProps cfnDataRepositoryAssociationProps =
     * CfnDataRepositoryAssociationProps.builder()
     * .dataRepositoryPath("dataRepositoryPath")
     * .fileSystemId("fileSystemId")
     * .fileSystemPath("fileSystemPath")
     * // the properties below are optional
     * .batchImportMetaDataOnCreate(false)
     * .importedFileChunkSize(123)
     * .s3(S3Property.builder()
     * .autoExportPolicy(AutoExportPolicyProperty.builder()
     * .events(List.of("events"))
     * .build())
     * .autoImportPolicy(AutoImportPolicyProperty.builder()
     * .events(List.of("events"))
     * .build())
     * .build())
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-datarepositoryassociation.html)
     */
    public inline fun cfnDataRepositoryAssociationProps(
        block: CfnDataRepositoryAssociationPropsDsl.() -> Unit = {}
    ): CfnDataRepositoryAssociationProps {
        val builder = CfnDataRepositoryAssociationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The configuration for an Amazon S3 data repository linked to an Amazon FSx Lustre file system
     * with a data repository association.
     *
     * The configuration defines which file events (new, changed, or deleted files or directories)
     * are automatically imported from the linked data repository to the file system or
     * automatically exported from the file system to the data repository.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.fsx.*;
     * S3Property s3Property = S3Property.builder()
     * .autoExportPolicy(AutoExportPolicyProperty.builder()
     * .events(List.of("events"))
     * .build())
     * .autoImportPolicy(AutoImportPolicyProperty.builder()
     * .events(List.of("events"))
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-datarepositoryassociation-s3.html)
     */
    public inline fun cfnDataRepositoryAssociationS3Property(
        block: CfnDataRepositoryAssociationS3PropertyDsl.() -> Unit = {}
    ): CfnDataRepositoryAssociation.S3Property {
        val builder = CfnDataRepositoryAssociationS3PropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::FSx::FileSystem` resource is an Amazon FSx resource type that specifies an Amazon
     * FSx file system.
     *
     * You can create any of the following supported file system types:
     * * Amazon FSx for Lustre
     * * Amazon FSx for NetApp ONTAP
     * * Amazon FSx for OpenZFS
     * * Amazon FSx for Windows File Server
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.fsx.*;
     * CfnFileSystem cfnFileSystem = CfnFileSystem.Builder.create(this, "MyCfnFileSystem")
     * .fileSystemType("fileSystemType")
     * .subnetIds(List.of("subnetIds"))
     * // the properties below are optional
     * .backupId("backupId")
     * .fileSystemTypeVersion("fileSystemTypeVersion")
     * .kmsKeyId("kmsKeyId")
     * .lustreConfiguration(LustreConfigurationProperty.builder()
     * .autoImportPolicy("autoImportPolicy")
     * .automaticBackupRetentionDays(123)
     * .copyTagsToBackups(false)
     * .dailyAutomaticBackupStartTime("dailyAutomaticBackupStartTime")
     * .dataCompressionType("dataCompressionType")
     * .deploymentType("deploymentType")
     * .driveCacheType("driveCacheType")
     * .exportPath("exportPath")
     * .importedFileChunkSize(123)
     * .importPath("importPath")
     * .perUnitStorageThroughput(123)
     * .weeklyMaintenanceStartTime("weeklyMaintenanceStartTime")
     * .build())
     * .ontapConfiguration(OntapConfigurationProperty.builder()
     * .deploymentType("deploymentType")
     * // the properties below are optional
     * .automaticBackupRetentionDays(123)
     * .dailyAutomaticBackupStartTime("dailyAutomaticBackupStartTime")
     * .diskIopsConfiguration(DiskIopsConfigurationProperty.builder()
     * .iops(123)
     * .mode("mode")
     * .build())
     * .endpointIpAddressRange("endpointIpAddressRange")
     * .fsxAdminPassword("fsxAdminPassword")
     * .preferredSubnetId("preferredSubnetId")
     * .routeTableIds(List.of("routeTableIds"))
     * .throughputCapacity(123)
     * .weeklyMaintenanceStartTime("weeklyMaintenanceStartTime")
     * .build())
     * .openZfsConfiguration(OpenZFSConfigurationProperty.builder()
     * .deploymentType("deploymentType")
     * // the properties below are optional
     * .automaticBackupRetentionDays(123)
     * .copyTagsToBackups(false)
     * .copyTagsToVolumes(false)
     * .dailyAutomaticBackupStartTime("dailyAutomaticBackupStartTime")
     * .diskIopsConfiguration(DiskIopsConfigurationProperty.builder()
     * .iops(123)
     * .mode("mode")
     * .build())
     * .options(List.of("options"))
     * .rootVolumeConfiguration(RootVolumeConfigurationProperty.builder()
     * .copyTagsToSnapshots(false)
     * .dataCompressionType("dataCompressionType")
     * .nfsExports(List.of(NfsExportsProperty.builder()
     * .clientConfigurations(List.of(ClientConfigurationsProperty.builder()
     * .clients("clients")
     * .options(List.of("options"))
     * .build()))
     * .build()))
     * .readOnly(false)
     * .recordSizeKiB(123)
     * .userAndGroupQuotas(List.of(UserAndGroupQuotasProperty.builder()
     * .id(123)
     * .storageCapacityQuotaGiB(123)
     * .type("type")
     * .build()))
     * .build())
     * .throughputCapacity(123)
     * .weeklyMaintenanceStartTime("weeklyMaintenanceStartTime")
     * .build())
     * .securityGroupIds(List.of("securityGroupIds"))
     * .storageCapacity(123)
     * .storageType("storageType")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .windowsConfiguration(WindowsConfigurationProperty.builder()
     * .throughputCapacity(123)
     * // the properties below are optional
     * .activeDirectoryId("activeDirectoryId")
     * .aliases(List.of("aliases"))
     * .auditLogConfiguration(AuditLogConfigurationProperty.builder()
     * .fileAccessAuditLogLevel("fileAccessAuditLogLevel")
     * .fileShareAccessAuditLogLevel("fileShareAccessAuditLogLevel")
     * // the properties below are optional
     * .auditLogDestination("auditLogDestination")
     * .build())
     * .automaticBackupRetentionDays(123)
     * .copyTagsToBackups(false)
     * .dailyAutomaticBackupStartTime("dailyAutomaticBackupStartTime")
     * .deploymentType("deploymentType")
     * .preferredSubnetId("preferredSubnetId")
     * .selfManagedActiveDirectoryConfiguration(SelfManagedActiveDirectoryConfigurationProperty.builder()
     * .dnsIps(List.of("dnsIps"))
     * .domainName("domainName")
     * .fileSystemAdministratorsGroup("fileSystemAdministratorsGroup")
     * .organizationalUnitDistinguishedName("organizationalUnitDistinguishedName")
     * .password("password")
     * .userName("userName")
     * .build())
     * .weeklyMaintenanceStartTime("weeklyMaintenanceStartTime")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-filesystem.html)
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
     * The configuration that Amazon FSx for Windows File Server uses to audit and log user accesses
     * of files, folders, and file shares on the Amazon FSx for Windows File Server file system.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.fsx.*;
     * AuditLogConfigurationProperty auditLogConfigurationProperty =
     * AuditLogConfigurationProperty.builder()
     * .fileAccessAuditLogLevel("fileAccessAuditLogLevel")
     * .fileShareAccessAuditLogLevel("fileShareAccessAuditLogLevel")
     * // the properties below are optional
     * .auditLogDestination("auditLogDestination")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-auditlogconfiguration.html)
     */
    public inline fun cfnFileSystemAuditLogConfigurationProperty(
        block: CfnFileSystemAuditLogConfigurationPropertyDsl.() -> Unit = {}
    ): CfnFileSystem.AuditLogConfigurationProperty {
        val builder = CfnFileSystemAuditLogConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies who can mount an OpenZFS file system and the options available while mounting the
     * file system.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.fsx.*;
     * ClientConfigurationsProperty clientConfigurationsProperty =
     * ClientConfigurationsProperty.builder()
     * .clients("clients")
     * .options(List.of("options"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-clientconfigurations.html)
     */
    public inline fun cfnFileSystemClientConfigurationsProperty(
        block: CfnFileSystemClientConfigurationsPropertyDsl.() -> Unit = {}
    ): CfnFileSystem.ClientConfigurationsProperty {
        val builder = CfnFileSystemClientConfigurationsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The SSD IOPS (input/output operations per second) configuration for an Amazon FSx for NetApp
     * ONTAP or FSx for OpenZFS file system.
     *
     * By default, Amazon FSx automatically provisions 3 IOPS per GB of storage capacity. You can
     * provision additional IOPS per GB of storage. The configuration consists of the total number
     * of provisioned SSD IOPS and how it is was provisioned, or the mode (by the customer or by
     * Amazon FSx).
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.fsx.*;
     * DiskIopsConfigurationProperty diskIopsConfigurationProperty =
     * DiskIopsConfigurationProperty.builder()
     * .iops(123)
     * .mode("mode")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-diskiopsconfiguration.html)
     */
    public inline fun cfnFileSystemDiskIopsConfigurationProperty(
        block: CfnFileSystemDiskIopsConfigurationPropertyDsl.() -> Unit = {}
    ): CfnFileSystem.DiskIopsConfigurationProperty {
        val builder = CfnFileSystemDiskIopsConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The configuration for the Amazon FSx for Lustre file system.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.fsx.*;
     * LustreConfigurationProperty lustreConfigurationProperty = LustreConfigurationProperty.builder()
     * .autoImportPolicy("autoImportPolicy")
     * .automaticBackupRetentionDays(123)
     * .copyTagsToBackups(false)
     * .dailyAutomaticBackupStartTime("dailyAutomaticBackupStartTime")
     * .dataCompressionType("dataCompressionType")
     * .deploymentType("deploymentType")
     * .driveCacheType("driveCacheType")
     * .exportPath("exportPath")
     * .importedFileChunkSize(123)
     * .importPath("importPath")
     * .perUnitStorageThroughput(123)
     * .weeklyMaintenanceStartTime("weeklyMaintenanceStartTime")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-lustreconfiguration.html)
     */
    public inline fun cfnFileSystemLustreConfigurationProperty(
        block: CfnFileSystemLustreConfigurationPropertyDsl.() -> Unit = {}
    ): CfnFileSystem.LustreConfigurationProperty {
        val builder = CfnFileSystemLustreConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The configuration object for mounting a file system.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.fsx.*;
     * NfsExportsProperty nfsExportsProperty = NfsExportsProperty.builder()
     * .clientConfigurations(List.of(ClientConfigurationsProperty.builder()
     * .clients("clients")
     * .options(List.of("options"))
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-nfsexports.html)
     */
    public inline fun cfnFileSystemNfsExportsProperty(
        block: CfnFileSystemNfsExportsPropertyDsl.() -> Unit = {}
    ): CfnFileSystem.NfsExportsProperty {
        val builder = CfnFileSystemNfsExportsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The configuration for this Amazon FSx for NetApp ONTAP file system.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.fsx.*;
     * OntapConfigurationProperty ontapConfigurationProperty = OntapConfigurationProperty.builder()
     * .deploymentType("deploymentType")
     * // the properties below are optional
     * .automaticBackupRetentionDays(123)
     * .dailyAutomaticBackupStartTime("dailyAutomaticBackupStartTime")
     * .diskIopsConfiguration(DiskIopsConfigurationProperty.builder()
     * .iops(123)
     * .mode("mode")
     * .build())
     * .endpointIpAddressRange("endpointIpAddressRange")
     * .fsxAdminPassword("fsxAdminPassword")
     * .preferredSubnetId("preferredSubnetId")
     * .routeTableIds(List.of("routeTableIds"))
     * .throughputCapacity(123)
     * .weeklyMaintenanceStartTime("weeklyMaintenanceStartTime")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-ontapconfiguration.html)
     */
    public inline fun cfnFileSystemOntapConfigurationProperty(
        block: CfnFileSystemOntapConfigurationPropertyDsl.() -> Unit = {}
    ): CfnFileSystem.OntapConfigurationProperty {
        val builder = CfnFileSystemOntapConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The OpenZFS configuration for the file system that's being created.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.fsx.*;
     * OpenZFSConfigurationProperty openZFSConfigurationProperty =
     * OpenZFSConfigurationProperty.builder()
     * .deploymentType("deploymentType")
     * // the properties below are optional
     * .automaticBackupRetentionDays(123)
     * .copyTagsToBackups(false)
     * .copyTagsToVolumes(false)
     * .dailyAutomaticBackupStartTime("dailyAutomaticBackupStartTime")
     * .diskIopsConfiguration(DiskIopsConfigurationProperty.builder()
     * .iops(123)
     * .mode("mode")
     * .build())
     * .options(List.of("options"))
     * .rootVolumeConfiguration(RootVolumeConfigurationProperty.builder()
     * .copyTagsToSnapshots(false)
     * .dataCompressionType("dataCompressionType")
     * .nfsExports(List.of(NfsExportsProperty.builder()
     * .clientConfigurations(List.of(ClientConfigurationsProperty.builder()
     * .clients("clients")
     * .options(List.of("options"))
     * .build()))
     * .build()))
     * .readOnly(false)
     * .recordSizeKiB(123)
     * .userAndGroupQuotas(List.of(UserAndGroupQuotasProperty.builder()
     * .id(123)
     * .storageCapacityQuotaGiB(123)
     * .type("type")
     * .build()))
     * .build())
     * .throughputCapacity(123)
     * .weeklyMaintenanceStartTime("weeklyMaintenanceStartTime")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-openzfsconfiguration.html)
     */
    public inline fun cfnFileSystemOpenZFSConfigurationProperty(
        block: CfnFileSystemOpenZFSConfigurationPropertyDsl.() -> Unit = {}
    ): CfnFileSystem.OpenZFSConfigurationProperty {
        val builder = CfnFileSystemOpenZFSConfigurationPropertyDsl()
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
     * import software.amazon.awscdk.services.fsx.*;
     * CfnFileSystemProps cfnFileSystemProps = CfnFileSystemProps.builder()
     * .fileSystemType("fileSystemType")
     * .subnetIds(List.of("subnetIds"))
     * // the properties below are optional
     * .backupId("backupId")
     * .fileSystemTypeVersion("fileSystemTypeVersion")
     * .kmsKeyId("kmsKeyId")
     * .lustreConfiguration(LustreConfigurationProperty.builder()
     * .autoImportPolicy("autoImportPolicy")
     * .automaticBackupRetentionDays(123)
     * .copyTagsToBackups(false)
     * .dailyAutomaticBackupStartTime("dailyAutomaticBackupStartTime")
     * .dataCompressionType("dataCompressionType")
     * .deploymentType("deploymentType")
     * .driveCacheType("driveCacheType")
     * .exportPath("exportPath")
     * .importedFileChunkSize(123)
     * .importPath("importPath")
     * .perUnitStorageThroughput(123)
     * .weeklyMaintenanceStartTime("weeklyMaintenanceStartTime")
     * .build())
     * .ontapConfiguration(OntapConfigurationProperty.builder()
     * .deploymentType("deploymentType")
     * // the properties below are optional
     * .automaticBackupRetentionDays(123)
     * .dailyAutomaticBackupStartTime("dailyAutomaticBackupStartTime")
     * .diskIopsConfiguration(DiskIopsConfigurationProperty.builder()
     * .iops(123)
     * .mode("mode")
     * .build())
     * .endpointIpAddressRange("endpointIpAddressRange")
     * .fsxAdminPassword("fsxAdminPassword")
     * .preferredSubnetId("preferredSubnetId")
     * .routeTableIds(List.of("routeTableIds"))
     * .throughputCapacity(123)
     * .weeklyMaintenanceStartTime("weeklyMaintenanceStartTime")
     * .build())
     * .openZfsConfiguration(OpenZFSConfigurationProperty.builder()
     * .deploymentType("deploymentType")
     * // the properties below are optional
     * .automaticBackupRetentionDays(123)
     * .copyTagsToBackups(false)
     * .copyTagsToVolumes(false)
     * .dailyAutomaticBackupStartTime("dailyAutomaticBackupStartTime")
     * .diskIopsConfiguration(DiskIopsConfigurationProperty.builder()
     * .iops(123)
     * .mode("mode")
     * .build())
     * .options(List.of("options"))
     * .rootVolumeConfiguration(RootVolumeConfigurationProperty.builder()
     * .copyTagsToSnapshots(false)
     * .dataCompressionType("dataCompressionType")
     * .nfsExports(List.of(NfsExportsProperty.builder()
     * .clientConfigurations(List.of(ClientConfigurationsProperty.builder()
     * .clients("clients")
     * .options(List.of("options"))
     * .build()))
     * .build()))
     * .readOnly(false)
     * .recordSizeKiB(123)
     * .userAndGroupQuotas(List.of(UserAndGroupQuotasProperty.builder()
     * .id(123)
     * .storageCapacityQuotaGiB(123)
     * .type("type")
     * .build()))
     * .build())
     * .throughputCapacity(123)
     * .weeklyMaintenanceStartTime("weeklyMaintenanceStartTime")
     * .build())
     * .securityGroupIds(List.of("securityGroupIds"))
     * .storageCapacity(123)
     * .storageType("storageType")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .windowsConfiguration(WindowsConfigurationProperty.builder()
     * .throughputCapacity(123)
     * // the properties below are optional
     * .activeDirectoryId("activeDirectoryId")
     * .aliases(List.of("aliases"))
     * .auditLogConfiguration(AuditLogConfigurationProperty.builder()
     * .fileAccessAuditLogLevel("fileAccessAuditLogLevel")
     * .fileShareAccessAuditLogLevel("fileShareAccessAuditLogLevel")
     * // the properties below are optional
     * .auditLogDestination("auditLogDestination")
     * .build())
     * .automaticBackupRetentionDays(123)
     * .copyTagsToBackups(false)
     * .dailyAutomaticBackupStartTime("dailyAutomaticBackupStartTime")
     * .deploymentType("deploymentType")
     * .preferredSubnetId("preferredSubnetId")
     * .selfManagedActiveDirectoryConfiguration(SelfManagedActiveDirectoryConfigurationProperty.builder()
     * .dnsIps(List.of("dnsIps"))
     * .domainName("domainName")
     * .fileSystemAdministratorsGroup("fileSystemAdministratorsGroup")
     * .organizationalUnitDistinguishedName("organizationalUnitDistinguishedName")
     * .password("password")
     * .userName("userName")
     * .build())
     * .weeklyMaintenanceStartTime("weeklyMaintenanceStartTime")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-filesystem.html)
     */
    public inline fun cfnFileSystemProps(
        block: CfnFileSystemPropsDsl.() -> Unit = {}
    ): CfnFileSystemProps {
        val builder = CfnFileSystemPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The configuration of an Amazon FSx for OpenZFS root volume.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.fsx.*;
     * RootVolumeConfigurationProperty rootVolumeConfigurationProperty =
     * RootVolumeConfigurationProperty.builder()
     * .copyTagsToSnapshots(false)
     * .dataCompressionType("dataCompressionType")
     * .nfsExports(List.of(NfsExportsProperty.builder()
     * .clientConfigurations(List.of(ClientConfigurationsProperty.builder()
     * .clients("clients")
     * .options(List.of("options"))
     * .build()))
     * .build()))
     * .readOnly(false)
     * .recordSizeKiB(123)
     * .userAndGroupQuotas(List.of(UserAndGroupQuotasProperty.builder()
     * .id(123)
     * .storageCapacityQuotaGiB(123)
     * .type("type")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-rootvolumeconfiguration.html)
     */
    public inline fun cfnFileSystemRootVolumeConfigurationProperty(
        block: CfnFileSystemRootVolumeConfigurationPropertyDsl.() -> Unit = {}
    ): CfnFileSystem.RootVolumeConfigurationProperty {
        val builder = CfnFileSystemRootVolumeConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The configuration that Amazon FSx uses to join a FSx for Windows File Server file system or
     * an FSx for ONTAP storage virtual machine (SVM) to a self-managed (including on-premises)
     * Microsoft Active Directory (AD) directory.
     *
     * For more information, see
     * [Using Amazon FSx for Windows with your self-managed Microsoft Active Directory](https://docs.aws.amazon.com/fsx/latest/WindowsGuide/self-managed-AD.html)
     * or
     * [Managing FSx for ONTAP SVMs](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/managing-svms.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.fsx.*;
     * SelfManagedActiveDirectoryConfigurationProperty selfManagedActiveDirectoryConfigurationProperty
     * = SelfManagedActiveDirectoryConfigurationProperty.builder()
     * .dnsIps(List.of("dnsIps"))
     * .domainName("domainName")
     * .fileSystemAdministratorsGroup("fileSystemAdministratorsGroup")
     * .organizationalUnitDistinguishedName("organizationalUnitDistinguishedName")
     * .password("password")
     * .userName("userName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-selfmanagedactivedirectoryconfiguration.html)
     */
    public inline fun cfnFileSystemSelfManagedActiveDirectoryConfigurationProperty(
        block: CfnFileSystemSelfManagedActiveDirectoryConfigurationPropertyDsl.() -> Unit = {}
    ): CfnFileSystem.SelfManagedActiveDirectoryConfigurationProperty {
        val builder = CfnFileSystemSelfManagedActiveDirectoryConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The configuration for how much storage a user or group can use on the volume.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.fsx.*;
     * UserAndGroupQuotasProperty userAndGroupQuotasProperty = UserAndGroupQuotasProperty.builder()
     * .id(123)
     * .storageCapacityQuotaGiB(123)
     * .type("type")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-userandgroupquotas.html)
     */
    public inline fun cfnFileSystemUserAndGroupQuotasProperty(
        block: CfnFileSystemUserAndGroupQuotasPropertyDsl.() -> Unit = {}
    ): CfnFileSystem.UserAndGroupQuotasProperty {
        val builder = CfnFileSystemUserAndGroupQuotasPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The Microsoft Windows configuration for the file system that's being created.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.fsx.*;
     * WindowsConfigurationProperty windowsConfigurationProperty =
     * WindowsConfigurationProperty.builder()
     * .throughputCapacity(123)
     * // the properties below are optional
     * .activeDirectoryId("activeDirectoryId")
     * .aliases(List.of("aliases"))
     * .auditLogConfiguration(AuditLogConfigurationProperty.builder()
     * .fileAccessAuditLogLevel("fileAccessAuditLogLevel")
     * .fileShareAccessAuditLogLevel("fileShareAccessAuditLogLevel")
     * // the properties below are optional
     * .auditLogDestination("auditLogDestination")
     * .build())
     * .automaticBackupRetentionDays(123)
     * .copyTagsToBackups(false)
     * .dailyAutomaticBackupStartTime("dailyAutomaticBackupStartTime")
     * .deploymentType("deploymentType")
     * .preferredSubnetId("preferredSubnetId")
     * .selfManagedActiveDirectoryConfiguration(SelfManagedActiveDirectoryConfigurationProperty.builder()
     * .dnsIps(List.of("dnsIps"))
     * .domainName("domainName")
     * .fileSystemAdministratorsGroup("fileSystemAdministratorsGroup")
     * .organizationalUnitDistinguishedName("organizationalUnitDistinguishedName")
     * .password("password")
     * .userName("userName")
     * .build())
     * .weeklyMaintenanceStartTime("weeklyMaintenanceStartTime")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-windowsconfiguration.html)
     */
    public inline fun cfnFileSystemWindowsConfigurationProperty(
        block: CfnFileSystemWindowsConfigurationPropertyDsl.() -> Unit = {}
    ): CfnFileSystem.WindowsConfigurationProperty {
        val builder = CfnFileSystemWindowsConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A snapshot of an Amazon FSx for OpenZFS volume.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.fsx.*;
     * CfnSnapshot cfnSnapshot = CfnSnapshot.Builder.create(this, "MyCfnSnapshot")
     * .name("name")
     * .volumeId("volumeId")
     * // the properties below are optional
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-snapshot.html)
     */
    public inline fun cfnSnapshot(
        scope: Construct,
        id: String,
        block: CfnSnapshotDsl.() -> Unit = {},
    ): CfnSnapshot {
        val builder = CfnSnapshotDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnSnapshot`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.fsx.*;
     * CfnSnapshotProps cfnSnapshotProps = CfnSnapshotProps.builder()
     * .name("name")
     * .volumeId("volumeId")
     * // the properties below are optional
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-snapshot.html)
     */
    public inline fun cfnSnapshotProps(
        block: CfnSnapshotPropsDsl.() -> Unit = {}
    ): CfnSnapshotProps {
        val builder = CfnSnapshotPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a storage virtual machine (SVM) for an Amazon FSx for ONTAP file system.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.fsx.*;
     * CfnStorageVirtualMachine cfnStorageVirtualMachine =
     * CfnStorageVirtualMachine.Builder.create(this, "MyCfnStorageVirtualMachine")
     * .fileSystemId("fileSystemId")
     * .name("name")
     * // the properties below are optional
     * .activeDirectoryConfiguration(ActiveDirectoryConfigurationProperty.builder()
     * .netBiosName("netBiosName")
     * .selfManagedActiveDirectoryConfiguration(SelfManagedActiveDirectoryConfigurationProperty.builder()
     * .dnsIps(List.of("dnsIps"))
     * .domainName("domainName")
     * .fileSystemAdministratorsGroup("fileSystemAdministratorsGroup")
     * .organizationalUnitDistinguishedName("organizationalUnitDistinguishedName")
     * .password("password")
     * .userName("userName")
     * .build())
     * .build())
     * .rootVolumeSecurityStyle("rootVolumeSecurityStyle")
     * .svmAdminPassword("svmAdminPassword")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-storagevirtualmachine.html)
     */
    public inline fun cfnStorageVirtualMachine(
        scope: Construct,
        id: String,
        block: CfnStorageVirtualMachineDsl.() -> Unit = {},
    ): CfnStorageVirtualMachine {
        val builder = CfnStorageVirtualMachineDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes the self-managed Microsoft Active Directory to which you want to join the SVM.
     *
     * Joining an Active Directory provides user authentication and access control for SMB clients,
     * including Microsoft Windows and macOS client accessing the file system.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.fsx.*;
     * ActiveDirectoryConfigurationProperty activeDirectoryConfigurationProperty =
     * ActiveDirectoryConfigurationProperty.builder()
     * .netBiosName("netBiosName")
     * .selfManagedActiveDirectoryConfiguration(SelfManagedActiveDirectoryConfigurationProperty.builder()
     * .dnsIps(List.of("dnsIps"))
     * .domainName("domainName")
     * .fileSystemAdministratorsGroup("fileSystemAdministratorsGroup")
     * .organizationalUnitDistinguishedName("organizationalUnitDistinguishedName")
     * .password("password")
     * .userName("userName")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-storagevirtualmachine-activedirectoryconfiguration.html)
     */
    public inline fun cfnStorageVirtualMachineActiveDirectoryConfigurationProperty(
        block: CfnStorageVirtualMachineActiveDirectoryConfigurationPropertyDsl.() -> Unit = {}
    ): CfnStorageVirtualMachine.ActiveDirectoryConfigurationProperty {
        val builder = CfnStorageVirtualMachineActiveDirectoryConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnStorageVirtualMachine`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.fsx.*;
     * CfnStorageVirtualMachineProps cfnStorageVirtualMachineProps =
     * CfnStorageVirtualMachineProps.builder()
     * .fileSystemId("fileSystemId")
     * .name("name")
     * // the properties below are optional
     * .activeDirectoryConfiguration(ActiveDirectoryConfigurationProperty.builder()
     * .netBiosName("netBiosName")
     * .selfManagedActiveDirectoryConfiguration(SelfManagedActiveDirectoryConfigurationProperty.builder()
     * .dnsIps(List.of("dnsIps"))
     * .domainName("domainName")
     * .fileSystemAdministratorsGroup("fileSystemAdministratorsGroup")
     * .organizationalUnitDistinguishedName("organizationalUnitDistinguishedName")
     * .password("password")
     * .userName("userName")
     * .build())
     * .build())
     * .rootVolumeSecurityStyle("rootVolumeSecurityStyle")
     * .svmAdminPassword("svmAdminPassword")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-storagevirtualmachine.html)
     */
    public inline fun cfnStorageVirtualMachineProps(
        block: CfnStorageVirtualMachinePropsDsl.() -> Unit = {}
    ): CfnStorageVirtualMachineProps {
        val builder = CfnStorageVirtualMachinePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The configuration that Amazon FSx uses to join a FSx for Windows File Server file system or
     * an FSx for ONTAP storage virtual machine (SVM) to a self-managed (including on-premises)
     * Microsoft Active Directory (AD) directory.
     *
     * For more information, see
     * [Using Amazon FSx for Windows with your self-managed Microsoft Active Directory](https://docs.aws.amazon.com/fsx/latest/WindowsGuide/self-managed-AD.html)
     * or
     * [Managing FSx for ONTAP SVMs](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/managing-svms.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.fsx.*;
     * SelfManagedActiveDirectoryConfigurationProperty selfManagedActiveDirectoryConfigurationProperty
     * = SelfManagedActiveDirectoryConfigurationProperty.builder()
     * .dnsIps(List.of("dnsIps"))
     * .domainName("domainName")
     * .fileSystemAdministratorsGroup("fileSystemAdministratorsGroup")
     * .organizationalUnitDistinguishedName("organizationalUnitDistinguishedName")
     * .password("password")
     * .userName("userName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-storagevirtualmachine-selfmanagedactivedirectoryconfiguration.html)
     */
    public inline fun cfnStorageVirtualMachineSelfManagedActiveDirectoryConfigurationProperty(
        block:
            CfnStorageVirtualMachineSelfManagedActiveDirectoryConfigurationPropertyDsl.() -> Unit =
            {}
    ): CfnStorageVirtualMachine.SelfManagedActiveDirectoryConfigurationProperty {
        val builder = CfnStorageVirtualMachineSelfManagedActiveDirectoryConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates an FSx for ONTAP or Amazon FSx for OpenZFS storage volume.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.fsx.*;
     * CfnVolume cfnVolume = CfnVolume.Builder.create(this, "MyCfnVolume")
     * .name("name")
     * // the properties below are optional
     * .backupId("backupId")
     * .ontapConfiguration(OntapConfigurationProperty.builder()
     * .sizeInMegabytes("sizeInMegabytes")
     * .storageVirtualMachineId("storageVirtualMachineId")
     * // the properties below are optional
     * .copyTagsToBackups("copyTagsToBackups")
     * .junctionPath("junctionPath")
     * .ontapVolumeType("ontapVolumeType")
     * .securityStyle("securityStyle")
     * .snapshotPolicy("snapshotPolicy")
     * .storageEfficiencyEnabled("storageEfficiencyEnabled")
     * .tieringPolicy(TieringPolicyProperty.builder()
     * .coolingPeriod(123)
     * .name("name")
     * .build())
     * .build())
     * .openZfsConfiguration(OpenZFSConfigurationProperty.builder()
     * .parentVolumeId("parentVolumeId")
     * // the properties below are optional
     * .copyTagsToSnapshots(false)
     * .dataCompressionType("dataCompressionType")
     * .nfsExports(List.of(NfsExportsProperty.builder()
     * .clientConfigurations(List.of(ClientConfigurationsProperty.builder()
     * .clients("clients")
     * .options(List.of("options"))
     * .build()))
     * .build()))
     * .options(List.of("options"))
     * .originSnapshot(OriginSnapshotProperty.builder()
     * .copyStrategy("copyStrategy")
     * .snapshotArn("snapshotArn")
     * .build())
     * .readOnly(false)
     * .recordSizeKiB(123)
     * .storageCapacityQuotaGiB(123)
     * .storageCapacityReservationGiB(123)
     * .userAndGroupQuotas(List.of(UserAndGroupQuotasProperty.builder()
     * .id(123)
     * .storageCapacityQuotaGiB(123)
     * .type("type")
     * .build()))
     * .build())
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .volumeType("volumeType")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-volume.html)
     */
    public inline fun cfnVolume(
        scope: Construct,
        id: String,
        block: CfnVolumeDsl.() -> Unit = {},
    ): CfnVolume {
        val builder = CfnVolumeDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies who can mount an OpenZFS file system and the options available while mounting the
     * file system.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.fsx.*;
     * ClientConfigurationsProperty clientConfigurationsProperty =
     * ClientConfigurationsProperty.builder()
     * .clients("clients")
     * .options(List.of("options"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-volume-clientconfigurations.html)
     */
    public inline fun cfnVolumeClientConfigurationsProperty(
        block: CfnVolumeClientConfigurationsPropertyDsl.() -> Unit = {}
    ): CfnVolume.ClientConfigurationsProperty {
        val builder = CfnVolumeClientConfigurationsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The configuration object for mounting a Network File System (NFS) file system.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.fsx.*;
     * NfsExportsProperty nfsExportsProperty = NfsExportsProperty.builder()
     * .clientConfigurations(List.of(ClientConfigurationsProperty.builder()
     * .clients("clients")
     * .options(List.of("options"))
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-volume-nfsexports.html)
     */
    public inline fun cfnVolumeNfsExportsProperty(
        block: CfnVolumeNfsExportsPropertyDsl.() -> Unit = {}
    ): CfnVolume.NfsExportsProperty {
        val builder = CfnVolumeNfsExportsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the configuration of the ONTAP volume that you are creating.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.fsx.*;
     * OntapConfigurationProperty ontapConfigurationProperty = OntapConfigurationProperty.builder()
     * .sizeInMegabytes("sizeInMegabytes")
     * .storageVirtualMachineId("storageVirtualMachineId")
     * // the properties below are optional
     * .copyTagsToBackups("copyTagsToBackups")
     * .junctionPath("junctionPath")
     * .ontapVolumeType("ontapVolumeType")
     * .securityStyle("securityStyle")
     * .snapshotPolicy("snapshotPolicy")
     * .storageEfficiencyEnabled("storageEfficiencyEnabled")
     * .tieringPolicy(TieringPolicyProperty.builder()
     * .coolingPeriod(123)
     * .name("name")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-volume-ontapconfiguration.html)
     */
    public inline fun cfnVolumeOntapConfigurationProperty(
        block: CfnVolumeOntapConfigurationPropertyDsl.() -> Unit = {}
    ): CfnVolume.OntapConfigurationProperty {
        val builder = CfnVolumeOntapConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the configuration of the Amazon FSx for OpenZFS volume that you are creating.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.fsx.*;
     * OpenZFSConfigurationProperty openZFSConfigurationProperty =
     * OpenZFSConfigurationProperty.builder()
     * .parentVolumeId("parentVolumeId")
     * // the properties below are optional
     * .copyTagsToSnapshots(false)
     * .dataCompressionType("dataCompressionType")
     * .nfsExports(List.of(NfsExportsProperty.builder()
     * .clientConfigurations(List.of(ClientConfigurationsProperty.builder()
     * .clients("clients")
     * .options(List.of("options"))
     * .build()))
     * .build()))
     * .options(List.of("options"))
     * .originSnapshot(OriginSnapshotProperty.builder()
     * .copyStrategy("copyStrategy")
     * .snapshotArn("snapshotArn")
     * .build())
     * .readOnly(false)
     * .recordSizeKiB(123)
     * .storageCapacityQuotaGiB(123)
     * .storageCapacityReservationGiB(123)
     * .userAndGroupQuotas(List.of(UserAndGroupQuotasProperty.builder()
     * .id(123)
     * .storageCapacityQuotaGiB(123)
     * .type("type")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-volume-openzfsconfiguration.html)
     */
    public inline fun cfnVolumeOpenZFSConfigurationProperty(
        block: CfnVolumeOpenZFSConfigurationPropertyDsl.() -> Unit = {}
    ): CfnVolume.OpenZFSConfigurationProperty {
        val builder = CfnVolumeOpenZFSConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The configuration object that specifies the snapshot to use as the origin of the data for the
     * volume.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.fsx.*;
     * OriginSnapshotProperty originSnapshotProperty = OriginSnapshotProperty.builder()
     * .copyStrategy("copyStrategy")
     * .snapshotArn("snapshotArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-volume-originsnapshot.html)
     */
    public inline fun cfnVolumeOriginSnapshotProperty(
        block: CfnVolumeOriginSnapshotPropertyDsl.() -> Unit = {}
    ): CfnVolume.OriginSnapshotProperty {
        val builder = CfnVolumeOriginSnapshotPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnVolume`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.fsx.*;
     * CfnVolumeProps cfnVolumeProps = CfnVolumeProps.builder()
     * .name("name")
     * // the properties below are optional
     * .backupId("backupId")
     * .ontapConfiguration(OntapConfigurationProperty.builder()
     * .sizeInMegabytes("sizeInMegabytes")
     * .storageVirtualMachineId("storageVirtualMachineId")
     * // the properties below are optional
     * .copyTagsToBackups("copyTagsToBackups")
     * .junctionPath("junctionPath")
     * .ontapVolumeType("ontapVolumeType")
     * .securityStyle("securityStyle")
     * .snapshotPolicy("snapshotPolicy")
     * .storageEfficiencyEnabled("storageEfficiencyEnabled")
     * .tieringPolicy(TieringPolicyProperty.builder()
     * .coolingPeriod(123)
     * .name("name")
     * .build())
     * .build())
     * .openZfsConfiguration(OpenZFSConfigurationProperty.builder()
     * .parentVolumeId("parentVolumeId")
     * // the properties below are optional
     * .copyTagsToSnapshots(false)
     * .dataCompressionType("dataCompressionType")
     * .nfsExports(List.of(NfsExportsProperty.builder()
     * .clientConfigurations(List.of(ClientConfigurationsProperty.builder()
     * .clients("clients")
     * .options(List.of("options"))
     * .build()))
     * .build()))
     * .options(List.of("options"))
     * .originSnapshot(OriginSnapshotProperty.builder()
     * .copyStrategy("copyStrategy")
     * .snapshotArn("snapshotArn")
     * .build())
     * .readOnly(false)
     * .recordSizeKiB(123)
     * .storageCapacityQuotaGiB(123)
     * .storageCapacityReservationGiB(123)
     * .userAndGroupQuotas(List.of(UserAndGroupQuotasProperty.builder()
     * .id(123)
     * .storageCapacityQuotaGiB(123)
     * .type("type")
     * .build()))
     * .build())
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .volumeType("volumeType")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-volume.html)
     */
    public inline fun cfnVolumeProps(block: CfnVolumePropsDsl.() -> Unit = {}): CfnVolumeProps {
        val builder = CfnVolumePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes the data tiering policy for an ONTAP volume.
     *
     * When enabled, Amazon FSx for ONTAP's intelligent tiering automatically transitions a volume's
     * data between the file system's primary storage and capacity pool storage based on your access
     * patterns.
     *
     * Valid tiering policies are the following:
     * * `SNAPSHOT_ONLY` - (Default value) moves cold snapshots to the capacity pool storage tier.
     * * `AUTO` - moves cold user data and snapshots to the capacity pool storage tier based on your
     *   access patterns.
     * * `ALL` - moves all user data blocks in both the active file system and Snapshot copies to
     *   the storage pool tier.
     * * `NONE` - keeps a volume's data in the primary storage tier, preventing it from being moved
     *   to the capacity pool tier.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.fsx.*;
     * TieringPolicyProperty tieringPolicyProperty = TieringPolicyProperty.builder()
     * .coolingPeriod(123)
     * .name("name")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-volume-tieringpolicy.html)
     */
    public inline fun cfnVolumeTieringPolicyProperty(
        block: CfnVolumeTieringPolicyPropertyDsl.() -> Unit = {}
    ): CfnVolume.TieringPolicyProperty {
        val builder = CfnVolumeTieringPolicyPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An object specifying how much storage users or groups can use on the volume.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.fsx.*;
     * UserAndGroupQuotasProperty userAndGroupQuotasProperty = UserAndGroupQuotasProperty.builder()
     * .id(123)
     * .storageCapacityQuotaGiB(123)
     * .type("type")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-volume-userandgroupquotas.html)
     */
    public inline fun cfnVolumeUserAndGroupQuotasProperty(
        block: CfnVolumeUserAndGroupQuotasPropertyDsl.() -> Unit = {}
    ): CfnVolume.UserAndGroupQuotasProperty {
        val builder = CfnVolumeUserAndGroupQuotasPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties that describe an existing FSx file system.
     *
     * Example:
     * ```
     * ISecurityGroup sg = SecurityGroup.fromSecurityGroupId(this, "FsxSecurityGroup",
     * "{SECURITY-GROUP-ID}");
     * IFileSystem fs = LustreFileSystem.fromLustreFileSystemAttributes(this, "FsxLustreFileSystem",
     * FileSystemAttributes.builder()
     * .dnsName("{FILE-SYSTEM-DNS-NAME}")
     * .fileSystemId("{FILE-SYSTEM-ID}")
     * .securityGroup(sg)
     * .build());
     * IVpc vpc = Vpc.fromVpcAttributes(this, "Vpc", VpcAttributes.builder()
     * .availabilityZones(List.of("us-west-2a", "us-west-2b"))
     * .publicSubnetIds(List.of("{US-WEST-2A-SUBNET-ID}", "{US-WEST-2B-SUBNET-ID}"))
     * .vpcId("{VPC-ID}")
     * .build());
     * Instance inst = Instance.Builder.create(this, "inst")
     * .instanceType(InstanceType.of(InstanceClass.T2, InstanceSize.LARGE))
     * .machineImage(AmazonLinuxImage.Builder.create()
     * .generation(AmazonLinuxGeneration.AMAZON_LINUX_2)
     * .build())
     * .vpc(vpc)
     * .vpcSubnets(SubnetSelection.builder()
     * .subnetType(SubnetType.PUBLIC)
     * .build())
     * .build();
     * fs.connections.allowDefaultPortFrom(inst);
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
     * Properties for the FSx file system.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.ec2.*;
     * import software.amazon.awscdk.services.fsx.*;
     * import software.amazon.awscdk.services.kms.*;
     * Key key;
     * SecurityGroup securityGroup;
     * Vpc vpc;
     * FileSystemProps fileSystemProps = FileSystemProps.builder()
     * .storageCapacityGiB(123)
     * .vpc(vpc)
     * // the properties below are optional
     * .backupId("backupId")
     * .kmsKey(key)
     * .removalPolicy(RemovalPolicy.DESTROY)
     * .securityGroup(securityGroup)
     * .build();
     * ```
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-filesystem.html)
     */
    public inline fun fileSystemProps(block: FileSystemPropsDsl.() -> Unit = {}): FileSystemProps {
        val builder = FileSystemPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The configuration for the Amazon FSx for Lustre file system.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.s3.*;
     * Vpc vpc;
     * Bucket bucket;
     * Map&lt;String, Object&gt; lustreConfiguration = Map.of(
     * "deploymentType", LustreDeploymentType.SCRATCH_2,
     * "exportPath", bucket.s3UrlForObject(),
     * "importPath", bucket.s3UrlForObject(),
     * "autoImportPolicy", LustreAutoImportPolicy.NEW_CHANGED_DELETED);
     * LustreFileSystem fs = LustreFileSystem.Builder.create(this, "FsxLustreFileSystem")
     * .vpc(vpc)
     * .vpcSubnet(vpc.getPrivateSubnets()[0])
     * .storageCapacityGiB(1200)
     * .lustreConfiguration(lustreConfiguration)
     * .build();
     * ```
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-lustreconfiguration.html)
     */
    public inline fun lustreConfiguration(
        block: LustreConfigurationDsl.() -> Unit = {}
    ): LustreConfiguration {
        val builder = LustreConfigurationDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The FSx for Lustre File System implementation of IFileSystem.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.s3.*;
     * Vpc vpc;
     * Bucket bucket;
     * Map&lt;String, Object&gt; lustreConfiguration = Map.of(
     * "deploymentType", LustreDeploymentType.SCRATCH_2,
     * "exportPath", bucket.s3UrlForObject(),
     * "importPath", bucket.s3UrlForObject(),
     * "autoImportPolicy", LustreAutoImportPolicy.NEW_CHANGED_DELETED);
     * LustreFileSystem fs = LustreFileSystem.Builder.create(this, "FsxLustreFileSystem")
     * .vpc(vpc)
     * .vpcSubnet(vpc.getPrivateSubnets()[0])
     * .storageCapacityGiB(1200)
     * .lustreConfiguration(lustreConfiguration)
     * .build();
     * ```
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-filesystem.html)
     */
    public inline fun lustreFileSystem(
        scope: Construct,
        id: String,
        block: LustreFileSystemDsl.() -> Unit = {},
    ): LustreFileSystem {
        val builder = LustreFileSystemDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties specific to the Lustre version of the FSx file system.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.s3.*;
     * Vpc vpc;
     * Bucket bucket;
     * Map&lt;String, Object&gt; lustreConfiguration = Map.of(
     * "deploymentType", LustreDeploymentType.SCRATCH_2,
     * "exportPath", bucket.s3UrlForObject(),
     * "importPath", bucket.s3UrlForObject(),
     * "autoImportPolicy", LustreAutoImportPolicy.NEW_CHANGED_DELETED);
     * LustreFileSystem fs = LustreFileSystem.Builder.create(this, "FsxLustreFileSystem")
     * .vpc(vpc)
     * .vpcSubnet(vpc.getPrivateSubnets()[0])
     * .storageCapacityGiB(1200)
     * .lustreConfiguration(lustreConfiguration)
     * .build();
     * ```
     */
    public inline fun lustreFileSystemProps(
        block: LustreFileSystemPropsDsl.() -> Unit = {}
    ): LustreFileSystemProps {
        val builder = LustreFileSystemPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Class for scheduling a weekly manitenance time.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.fsx.*;
     * LustreMaintenanceTime lustreMaintenanceTime = LustreMaintenanceTime.Builder.create()
     * .day(Weekday.MONDAY)
     * .hour(123)
     * .minute(123)
     * .build();
     * ```
     */
    public inline fun lustreMaintenanceTime(
        block: LustreMaintenanceTimeDsl.() -> Unit = {}
    ): LustreMaintenanceTime {
        val builder = LustreMaintenanceTimeDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties required for setting up a weekly maintenance time.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.fsx.*;
     * LustreMaintenanceTimeProps lustreMaintenanceTimeProps = LustreMaintenanceTimeProps.builder()
     * .day(Weekday.MONDAY)
     * .hour(123)
     * .minute(123)
     * .build();
     * ```
     */
    public inline fun lustreMaintenanceTimeProps(
        block: LustreMaintenanceTimePropsDsl.() -> Unit = {}
    ): LustreMaintenanceTimeProps {
        val builder = LustreMaintenanceTimePropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
