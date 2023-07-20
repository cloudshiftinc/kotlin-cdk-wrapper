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
import kotlin.String
import kotlin.Unit

public object fsx {
    public inline fun cfnDataRepositoryAssociation(
        scope: Construct,
        id: String,
        block: CfnDataRepositoryAssociationDsl.() -> Unit = {},
    ): CfnDataRepositoryAssociation {
        val builder = CfnDataRepositoryAssociationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDataRepositoryAssociationAutoExportPolicyProperty(
        block: CfnDataRepositoryAssociationAutoExportPolicyPropertyDsl.() -> Unit =
            {},
    ): CfnDataRepositoryAssociation.AutoExportPolicyProperty {
        val builder = CfnDataRepositoryAssociationAutoExportPolicyPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDataRepositoryAssociationAutoImportPolicyProperty(
        block: CfnDataRepositoryAssociationAutoImportPolicyPropertyDsl.() -> Unit =
            {},
    ): CfnDataRepositoryAssociation.AutoImportPolicyProperty {
        val builder = CfnDataRepositoryAssociationAutoImportPolicyPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDataRepositoryAssociationProps(
        block: CfnDataRepositoryAssociationPropsDsl.() -> Unit =
            {},
    ): CfnDataRepositoryAssociationProps {
        val builder = CfnDataRepositoryAssociationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDataRepositoryAssociationS3Property(
        block: CfnDataRepositoryAssociationS3PropertyDsl.() -> Unit =
            {},
    ): CfnDataRepositoryAssociation.S3Property {
        val builder = CfnDataRepositoryAssociationS3PropertyDsl()
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

    public inline fun cfnFileSystemAuditLogConfigurationProperty(
        block: CfnFileSystemAuditLogConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnFileSystem.AuditLogConfigurationProperty {
        val builder = CfnFileSystemAuditLogConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnFileSystemClientConfigurationsProperty(
        block: CfnFileSystemClientConfigurationsPropertyDsl.() -> Unit =
            {},
    ): CfnFileSystem.ClientConfigurationsProperty {
        val builder = CfnFileSystemClientConfigurationsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnFileSystemDiskIopsConfigurationProperty(
        block: CfnFileSystemDiskIopsConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnFileSystem.DiskIopsConfigurationProperty {
        val builder = CfnFileSystemDiskIopsConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnFileSystemLustreConfigurationProperty(
        block: CfnFileSystemLustreConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnFileSystem.LustreConfigurationProperty {
        val builder = CfnFileSystemLustreConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnFileSystemNfsExportsProperty(
        block: CfnFileSystemNfsExportsPropertyDsl.() -> Unit =
            {},
    ): CfnFileSystem.NfsExportsProperty {
        val builder = CfnFileSystemNfsExportsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnFileSystemOntapConfigurationProperty(
        block: CfnFileSystemOntapConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnFileSystem.OntapConfigurationProperty {
        val builder = CfnFileSystemOntapConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnFileSystemOpenZFSConfigurationProperty(
        block: CfnFileSystemOpenZFSConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnFileSystem.OpenZFSConfigurationProperty {
        val builder = CfnFileSystemOpenZFSConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnFileSystemProps(block: CfnFileSystemPropsDsl.() -> Unit = {}): CfnFileSystemProps {
        val builder = CfnFileSystemPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnFileSystemRootVolumeConfigurationProperty(
        block: CfnFileSystemRootVolumeConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnFileSystem.RootVolumeConfigurationProperty {
        val builder = CfnFileSystemRootVolumeConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnFileSystemSelfManagedActiveDirectoryConfigurationProperty(
        block: CfnFileSystemSelfManagedActiveDirectoryConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnFileSystem.SelfManagedActiveDirectoryConfigurationProperty {
        val builder = CfnFileSystemSelfManagedActiveDirectoryConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnFileSystemUserAndGroupQuotasProperty(
        block: CfnFileSystemUserAndGroupQuotasPropertyDsl.() -> Unit =
            {},
    ): CfnFileSystem.UserAndGroupQuotasProperty {
        val builder = CfnFileSystemUserAndGroupQuotasPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnFileSystemWindowsConfigurationProperty(
        block: CfnFileSystemWindowsConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnFileSystem.WindowsConfigurationProperty {
        val builder = CfnFileSystemWindowsConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnSnapshot(
        scope: Construct,
        id: String,
        block: CfnSnapshotDsl.() -> Unit = {},
    ): CfnSnapshot {
        val builder = CfnSnapshotDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnSnapshotProps(block: CfnSnapshotPropsDsl.() -> Unit = {}): CfnSnapshotProps {
        val builder = CfnSnapshotPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnStorageVirtualMachine(
        scope: Construct,
        id: String,
        block: CfnStorageVirtualMachineDsl.() -> Unit = {},
    ): CfnStorageVirtualMachine {
        val builder = CfnStorageVirtualMachineDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnStorageVirtualMachineActiveDirectoryConfigurationProperty(
        block: CfnStorageVirtualMachineActiveDirectoryConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnStorageVirtualMachine.ActiveDirectoryConfigurationProperty {
        val builder = CfnStorageVirtualMachineActiveDirectoryConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnStorageVirtualMachineProps(
        block: CfnStorageVirtualMachinePropsDsl.() -> Unit =
            {},
    ): CfnStorageVirtualMachineProps {
        val builder = CfnStorageVirtualMachinePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnStorageVirtualMachineSelfManagedActiveDirectoryConfigurationProperty(
        block: CfnStorageVirtualMachineSelfManagedActiveDirectoryConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnStorageVirtualMachine.SelfManagedActiveDirectoryConfigurationProperty {
        val builder = CfnStorageVirtualMachineSelfManagedActiveDirectoryConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnVolume(
        scope: Construct,
        id: String,
        block: CfnVolumeDsl.() -> Unit = {},
    ): CfnVolume {
        val builder = CfnVolumeDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnVolumeClientConfigurationsProperty(
        block: CfnVolumeClientConfigurationsPropertyDsl.() -> Unit =
            {},
    ): CfnVolume.ClientConfigurationsProperty {
        val builder = CfnVolumeClientConfigurationsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnVolumeNfsExportsProperty(
        block: CfnVolumeNfsExportsPropertyDsl.() -> Unit =
            {},
    ): CfnVolume.NfsExportsProperty {
        val builder = CfnVolumeNfsExportsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnVolumeOntapConfigurationProperty(
        block: CfnVolumeOntapConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnVolume.OntapConfigurationProperty {
        val builder = CfnVolumeOntapConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnVolumeOpenZFSConfigurationProperty(
        block: CfnVolumeOpenZFSConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnVolume.OpenZFSConfigurationProperty {
        val builder = CfnVolumeOpenZFSConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnVolumeOriginSnapshotProperty(
        block: CfnVolumeOriginSnapshotPropertyDsl.() -> Unit =
            {},
    ): CfnVolume.OriginSnapshotProperty {
        val builder = CfnVolumeOriginSnapshotPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnVolumeProps(block: CfnVolumePropsDsl.() -> Unit = {}): CfnVolumeProps {
        val builder = CfnVolumePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnVolumeTieringPolicyProperty(
        block: CfnVolumeTieringPolicyPropertyDsl.() -> Unit = {
        },
    ): CfnVolume.TieringPolicyProperty {
        val builder = CfnVolumeTieringPolicyPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnVolumeUserAndGroupQuotasProperty(
        block: CfnVolumeUserAndGroupQuotasPropertyDsl.() -> Unit =
            {},
    ): CfnVolume.UserAndGroupQuotasProperty {
        val builder = CfnVolumeUserAndGroupQuotasPropertyDsl()
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

    public inline fun lustreConfiguration(block: LustreConfigurationDsl.() -> Unit = {}): LustreConfiguration {
        val builder = LustreConfigurationDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun lustreFileSystem(
        scope: Construct,
        id: String,
        block: LustreFileSystemDsl.() -> Unit = {},
    ): LustreFileSystem {
        val builder = LustreFileSystemDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun lustreFileSystemProps(block: LustreFileSystemPropsDsl.() -> Unit = {}): LustreFileSystemProps {
        val builder = LustreFileSystemPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun lustreMaintenanceTime(block: LustreMaintenanceTimeDsl.() -> Unit = {}): LustreMaintenanceTime {
        val builder = LustreMaintenanceTimeDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun lustreMaintenanceTimeProps(
        block: LustreMaintenanceTimePropsDsl.() -> Unit =
            {},
    ): LustreMaintenanceTimeProps {
        val builder = LustreMaintenanceTimePropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
