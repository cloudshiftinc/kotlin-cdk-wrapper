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

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.fsx.CfnFileSystem
import software.amazon.awscdk.services.fsx.CfnFileSystemProps

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
@CdkDslMarker
public class CfnFileSystemPropsDsl {
    private val cdkBuilder: CfnFileSystemProps.Builder = CfnFileSystemProps.builder()

    private val _securityGroupIds: MutableList<String> = mutableListOf()

    private val _subnetIds: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param backupId The ID of the file system backup that you are using to create a file system.
     *   For more information, see
     *   [CreateFileSystemFromBackup](https://docs.aws.amazon.com/fsx/latest/APIReference/API_CreateFileSystemFromBackup.html)
     *   .
     */
    public fun backupId(backupId: String) {
        cdkBuilder.backupId(backupId)
    }

    /**
     * @param fileSystemType The type of Amazon FSx file system, which can be `LUSTRE` , `WINDOWS` ,
     *   `ONTAP` , or `OPENZFS` .
     */
    public fun fileSystemType(fileSystemType: String) {
        cdkBuilder.fileSystemType(fileSystemType)
    }

    /**
     * @param fileSystemTypeVersion (Optional) For FSx for Lustre file systems, sets the Lustre
     *   version for the file system that you're creating. Valid values are `2.10` and `2.12` :
     * * 2.10 is supported by the Scratch and Persistent_1 Lustre deployment types.
     * * 2.12 is supported by all Lustre deployment types. `2.12` is required when setting FSx for
     *   Lustre `DeploymentType` to `PERSISTENT_2` .
     *
     * Default value = `2.10` , except when `DeploymentType` is set to `PERSISTENT_2` , then the
     * default is `2.12` .
     *
     * If you set `FileSystemTypeVersion` to `2.10` for a `PERSISTENT_2` Lustre deployment type, the
     * `CreateFileSystem` operation fails.
     */
    public fun fileSystemTypeVersion(fileSystemTypeVersion: String) {
        cdkBuilder.fileSystemTypeVersion(fileSystemTypeVersion)
    }

    /**
     * @param kmsKeyId The ID of the AWS Key Management Service ( AWS KMS ) key used to encrypt
     *   Amazon FSx file system data. Used as follows with Amazon FSx file system types:
     * * Amazon FSx for Lustre `PERSISTENT_1` and `PERSISTENT_2` deployment types only.
     *
     * `SCRATCH_1` and `SCRATCH_2` types are encrypted using the Amazon FSx service AWS KMS key for
     * your account.
     * * Amazon FSx for NetApp ONTAP
     * * Amazon FSx for OpenZFS
     * * Amazon FSx for Windows File Server
     */
    public fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
    }

    /**
     * @param lustreConfiguration The Lustre configuration for the file system being created.
     *
     * The following parameters are not supported for file systems with a data repository
     * association.
     * * `AutoImportPolicy`
     * * `ExportPath`
     * * `ImportedChunkSize`
     * * `ImportPath`
     */
    public fun lustreConfiguration(lustreConfiguration: IResolvable) {
        cdkBuilder.lustreConfiguration(lustreConfiguration)
    }

    /**
     * @param lustreConfiguration The Lustre configuration for the file system being created.
     *
     * The following parameters are not supported for file systems with a data repository
     * association.
     * * `AutoImportPolicy`
     * * `ExportPath`
     * * `ImportedChunkSize`
     * * `ImportPath`
     */
    public fun lustreConfiguration(lustreConfiguration: CfnFileSystem.LustreConfigurationProperty) {
        cdkBuilder.lustreConfiguration(lustreConfiguration)
    }

    /**
     * @param ontapConfiguration The ONTAP configuration properties of the FSx for ONTAP file system
     *   that you are creating.
     */
    public fun ontapConfiguration(ontapConfiguration: IResolvable) {
        cdkBuilder.ontapConfiguration(ontapConfiguration)
    }

    /**
     * @param ontapConfiguration The ONTAP configuration properties of the FSx for ONTAP file system
     *   that you are creating.
     */
    public fun ontapConfiguration(ontapConfiguration: CfnFileSystem.OntapConfigurationProperty) {
        cdkBuilder.ontapConfiguration(ontapConfiguration)
    }

    /**
     * @param openZfsConfiguration The Amazon FSx for OpenZFS configuration properties for the file
     *   system that you are creating.
     */
    public fun openZfsConfiguration(openZfsConfiguration: IResolvable) {
        cdkBuilder.openZfsConfiguration(openZfsConfiguration)
    }

    /**
     * @param openZfsConfiguration The Amazon FSx for OpenZFS configuration properties for the file
     *   system that you are creating.
     */
    public fun openZfsConfiguration(
        openZfsConfiguration: CfnFileSystem.OpenZFSConfigurationProperty
    ) {
        cdkBuilder.openZfsConfiguration(openZfsConfiguration)
    }

    /**
     * @param securityGroupIds A list of IDs specifying the security groups to apply to all network
     *   interfaces created for file system access. This list isn't returned in later requests to
     *   describe the file system.
     */
    public fun securityGroupIds(vararg securityGroupIds: String) {
        _securityGroupIds.addAll(listOf(*securityGroupIds))
    }

    /**
     * @param securityGroupIds A list of IDs specifying the security groups to apply to all network
     *   interfaces created for file system access. This list isn't returned in later requests to
     *   describe the file system.
     */
    public fun securityGroupIds(securityGroupIds: Collection<String>) {
        _securityGroupIds.addAll(securityGroupIds)
    }

    /**
     * @param storageCapacity Sets the storage capacity of the file system that you're creating.
     *   `StorageCapacity` is required if you are creating a new file system.
     *
     * *FSx for Lustre file systems* - The amount of storage capacity that you can configure depends
     * on the value that you set for `StorageType` and the Lustre `DeploymentType` , as follows:
     * * For `SCRATCH_2` , `PERSISTENT_2` and `PERSISTENT_1` deployment types using SSD storage
     *   type, the valid values are 1200 GiB, 2400 GiB, and increments of 2400 GiB.
     * * For `PERSISTENT_1` HDD file systems, valid values are increments of 6000 GiB for 12
     *   MB/s/TiB file systems and increments of 1800 GiB for 40 MB/s/TiB file systems.
     * * For `SCRATCH_1` deployment type, valid values are 1200 GiB, 2400 GiB, and increments of
     *   3600 GiB.
     *
     * *FSx for ONTAP file systems* - The amount of storage capacity that you can configure is from
     * 1024 GiB up to 196,608 GiB (192 TiB).
     *
     * *FSx for OpenZFS file systems* - The amount of storage capacity that you can configure is
     * from 64 GiB up to 524,288 GiB (512 TiB). If you are creating a file system from a backup, you
     * can specify a storage capacity equal to or greater than the original file system's storage
     * capacity.
     *
     * *FSx for Windows File Server file systems* - The amount of storage capacity that you can
     * configure depends on the value that you set for `StorageType` as follows:
     * * For SSD storage, valid values are 32 GiB-65,536 GiB (64 TiB).
     * * For HDD storage, valid values are 2000 GiB-65,536 GiB (64 TiB).
     */
    public fun storageCapacity(storageCapacity: Number) {
        cdkBuilder.storageCapacity(storageCapacity)
    }

    /**
     * @param storageType Sets the storage type for the file system that you're creating. Valid
     *   values are `SSD` and `HDD` .
     * * Set to `SSD` to use solid state drive storage. SSD is supported on all Windows, Lustre,
     *   ONTAP, and OpenZFS deployment types.
     * * Set to `HDD` to use hard disk drive storage. HDD is supported on `SINGLE_AZ_2` and
     *   `MULTI_AZ_1` Windows file system deployment types, and on `PERSISTENT_1` Lustre file system
     *   deployment types.
     *
     * Default value is `SSD` . For more information, see
     * [Storage type options](https://docs.aws.amazon.com/fsx/latest/WindowsGuide/optimize-fsx-costs.html#storage-type-options)
     * in the *FSx for Windows File Server User Guide* and
     * [Multiple storage options](https://docs.aws.amazon.com/fsx/latest/LustreGuide/what-is.html#storage-options)
     * in the *FSx for Lustre User Guide* .
     */
    public fun storageType(storageType: String) {
        cdkBuilder.storageType(storageType)
    }

    /**
     * @param subnetIds Specifies the IDs of the subnets that the file system will be accessible
     *   from.
     *
     * For Windows and ONTAP `MULTI_AZ_1` deployment types,provide exactly two subnet IDs, one for
     * the preferred file server and one for the standby file server. You specify one of these
     * subnets as the preferred subnet using the `WindowsConfiguration &gt; PreferredSubnetID` or
     * `OntapConfiguration &gt; PreferredSubnetID` properties. For more information about Multi-AZ
     * file system configuration, see
     * [Availability and durability: Single-AZ and Multi-AZ file systems](https://docs.aws.amazon.com/fsx/latest/WindowsGuide/high-availability-multiAZ.html)
     * in the *Amazon FSx for Windows User Guide* and
     * [Availability and durability](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/high-availability-multiAZ.html)
     * in the *Amazon FSx for ONTAP User Guide* .
     *
     * For Windows `SINGLE_AZ_1` and `SINGLE_AZ_2` and all Lustre deployment types, provide exactly
     * one subnet ID. The file server is launched in that subnet's Availability Zone.
     */
    public fun subnetIds(vararg subnetIds: String) {
        _subnetIds.addAll(listOf(*subnetIds))
    }

    /**
     * @param subnetIds Specifies the IDs of the subnets that the file system will be accessible
     *   from.
     *
     * For Windows and ONTAP `MULTI_AZ_1` deployment types,provide exactly two subnet IDs, one for
     * the preferred file server and one for the standby file server. You specify one of these
     * subnets as the preferred subnet using the `WindowsConfiguration &gt; PreferredSubnetID` or
     * `OntapConfiguration &gt; PreferredSubnetID` properties. For more information about Multi-AZ
     * file system configuration, see
     * [Availability and durability: Single-AZ and Multi-AZ file systems](https://docs.aws.amazon.com/fsx/latest/WindowsGuide/high-availability-multiAZ.html)
     * in the *Amazon FSx for Windows User Guide* and
     * [Availability and durability](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/high-availability-multiAZ.html)
     * in the *Amazon FSx for ONTAP User Guide* .
     *
     * For Windows `SINGLE_AZ_1` and `SINGLE_AZ_2` and all Lustre deployment types, provide exactly
     * one subnet ID. The file server is launched in that subnet's Availability Zone.
     */
    public fun subnetIds(subnetIds: Collection<String>) {
        _subnetIds.addAll(subnetIds)
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource. For more information, see
     *   [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     *   .
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource. For more information, see
     *   [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     *   .
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * @param windowsConfiguration The configuration object for the Microsoft Windows file system
     *   you are creating. This value is required if `FileSystemType` is set to `WINDOWS` .
     */
    public fun windowsConfiguration(windowsConfiguration: IResolvable) {
        cdkBuilder.windowsConfiguration(windowsConfiguration)
    }

    /**
     * @param windowsConfiguration The configuration object for the Microsoft Windows file system
     *   you are creating. This value is required if `FileSystemType` is set to `WINDOWS` .
     */
    public fun windowsConfiguration(
        windowsConfiguration: CfnFileSystem.WindowsConfigurationProperty
    ) {
        cdkBuilder.windowsConfiguration(windowsConfiguration)
    }

    public fun build(): CfnFileSystemProps {
        if (_securityGroupIds.isNotEmpty()) cdkBuilder.securityGroupIds(_securityGroupIds)
        if (_subnetIds.isNotEmpty()) cdkBuilder.subnetIds(_subnetIds)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
