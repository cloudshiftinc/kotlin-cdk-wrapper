@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.fsx

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnFileSystem`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.fsx.*;
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
 * .dataReadCacheConfiguration(DataReadCacheConfigurationProperty.builder()
 * .sizeGiB(123)
 * .sizingMode("sizingMode")
 * .build())
 * .deploymentType("deploymentType")
 * .driveCacheType("driveCacheType")
 * .efaEnabled(false)
 * .exportPath("exportPath")
 * .importedFileChunkSize(123)
 * .importPath("importPath")
 * .metadataConfiguration(MetadataConfigurationProperty.builder()
 * .iops(123)
 * .mode("mode")
 * .build())
 * .perUnitStorageThroughput(123)
 * .throughputCapacity(123)
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
 * .haPairs(123)
 * .preferredSubnetId("preferredSubnetId")
 * .routeTableIds(List.of("routeTableIds"))
 * .throughputCapacity(123)
 * .throughputCapacityPerHaPair(123)
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
 * .endpointIpAddressRange("endpointIpAddressRange")
 * .options(List.of("options"))
 * .preferredSubnetId("preferredSubnetId")
 * .readCacheConfiguration(ReadCacheConfigurationProperty.builder()
 * .sizeGiB(123)
 * .sizingMode("sizingMode")
 * .build())
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
 * .routeTableIds(List.of("routeTableIds"))
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
 * .diskIopsConfiguration(DiskIopsConfigurationProperty.builder()
 * .iops(123)
 * .mode("mode")
 * .build())
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
public interface CfnFileSystemProps {
  /**
   * The ID of the file system backup that you are using to create a file system.
   *
   * For more information, see
   * [CreateFileSystemFromBackup](https://docs.aws.amazon.com/fsx/latest/APIReference/API_CreateFileSystemFromBackup.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-filesystem.html#cfn-fsx-filesystem-backupid)
   */
  public fun backupId(): String? = unwrap(this).getBackupId()

  /**
   * The type of Amazon FSx file system, which can be `LUSTRE` , `WINDOWS` , `ONTAP` , or `OPENZFS`
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-filesystem.html#cfn-fsx-filesystem-filesystemtype)
   */
  public fun fileSystemType(): String

  /**
   * For FSx for Lustre file systems, sets the Lustre version for the file system that you're
   * creating.
   *
   * Valid values are `2.10` , `2.12` , and `2.15` :
   *
   * * `2.10` is supported by the Scratch and Persistent_1 Lustre deployment types.
   * * `2.12` is supported by all Lustre deployment types, except for `PERSISTENT_2` with a metadata
   * configuration mode.
   * * `2.15` is supported by all Lustre deployment types and is recommended for all new file
   * systems.
   *
   * Default value is `2.10` , except for the following deployments:
   *
   * * Default value is `2.12` when `DeploymentType` is set to `PERSISTENT_2` without a metadata
   * configuration mode.
   * * Default value is `2.15` when `DeploymentType` is set to `PERSISTENT_2` with a metadata
   * configuration mode.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-filesystem.html#cfn-fsx-filesystem-filesystemtypeversion)
   */
  public fun fileSystemTypeVersion(): String? = unwrap(this).getFileSystemTypeVersion()

  /**
   * The ID of the AWS Key Management Service ( AWS KMS ) key used to encrypt Amazon FSx file system
   * data.
   *
   * Used as follows with Amazon FSx file system types:
   *
   * * Amazon FSx for Lustre `PERSISTENT_1` and `PERSISTENT_2` deployment types only.
   *
   * `SCRATCH_1` and `SCRATCH_2` types are encrypted using the Amazon FSx service AWS KMS key for
   * your account.
   *
   * * Amazon FSx for NetApp ONTAP
   * * Amazon FSx for OpenZFS
   * * Amazon FSx for Windows File Server
   *
   * If this ID isn't specified, the Amazon FSx-managed key for your account is used. For more
   * information, see [Encrypt](https://docs.aws.amazon.com//kms/latest/APIReference/API_Encrypt.html)
   * in the *AWS Key Management Service API Reference* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-filesystem.html#cfn-fsx-filesystem-kmskeyid)
   */
  public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  /**
   * The Lustre configuration for the file system being created.
   *
   * This configuration is required if the `FileSystemType` is set to `LUSTRE` .
   *
   *
   * The following parameters are not supported when creating Lustre file systems with a data
   * repository association.
   *
   * * `AutoImportPolicy`
   * * `ExportPath`
   * * `ImportedChunkSize`
   * * `ImportPath`
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-filesystem.html#cfn-fsx-filesystem-lustreconfiguration)
   */
  public fun lustreConfiguration(): Any? = unwrap(this).getLustreConfiguration()

  /**
   * The ONTAP configuration properties of the FSx for ONTAP file system that you are creating.
   *
   * This configuration is required if the `FileSystemType` is set to `ONTAP` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-filesystem.html#cfn-fsx-filesystem-ontapconfiguration)
   */
  public fun ontapConfiguration(): Any? = unwrap(this).getOntapConfiguration()

  /**
   * The Amazon FSx for OpenZFS configuration properties for the file system that you are creating.
   *
   * This configuration is required if the `FileSystemType` is set to `OPENZFS` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-filesystem.html#cfn-fsx-filesystem-openzfsconfiguration)
   */
  public fun openZfsConfiguration(): Any? = unwrap(this).getOpenZfsConfiguration()

  /**
   * A list of IDs specifying the security groups to apply to all network interfaces created for
   * file system access.
   *
   * This list isn't returned in later requests to describe the file system.
   *
   *
   * You must specify a security group if you are creating a Multi-AZ FSx for ONTAP file system in a
   * VPC subnet that has been shared with you.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-filesystem.html#cfn-fsx-filesystem-securitygroupids)
   */
  public fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?: emptyList()

  /**
   * Sets the storage capacity of the file system that you're creating.
   *
   * `StorageCapacity` is required if you are creating a new file system. It is not required if you
   * are creating a file system by restoring a backup.
   *
   * *FSx for Lustre file systems* - The amount of storage capacity that you can configure depends
   * on the value that you set for `StorageType` and the Lustre `DeploymentType` , as follows:
   *
   * * For `SCRATCH_2` , `PERSISTENT_2` and `PERSISTENT_1` deployment types using SSD storage type,
   * the valid values are 1200 GiB, 2400 GiB, and increments of 2400 GiB.
   * * For `PERSISTENT_1` HDD file systems, valid values are increments of 6000 GiB for 12 MB/s/TiB
   * file systems and increments of 1800 GiB for 40 MB/s/TiB file systems.
   * * For `SCRATCH_1` deployment type, valid values are 1200 GiB, 2400 GiB, and increments of 3600
   * GiB.
   *
   * *FSx for ONTAP file systems* - The amount of SSD storage capacity that you can configure
   * depends on the value of the `HAPairs` property. The minimum value is calculated as 1,024 GiB *
   * HAPairs and the maximum is calculated as 524,288 GiB * HAPairs, up to a maximum amount of SSD
   * storage capacity of 1,048,576 GiB (1 pebibyte).
   *
   * *FSx for OpenZFS file systems* - The amount of storage capacity that you can configure is from
   * 64 GiB up to 524,288 GiB (512 TiB). If you are creating a file system from a backup, you can
   * specify a storage capacity equal to or greater than the original file system's storage capacity.
   *
   * *FSx for Windows File Server file systems* - The amount of storage capacity that you can
   * configure depends on the value that you set for `StorageType` as follows:
   *
   * * For SSD storage, valid values are 32 GiB-65,536 GiB (64 TiB).
   * * For HDD storage, valid values are 2000 GiB-65,536 GiB (64 TiB).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-filesystem.html#cfn-fsx-filesystem-storagecapacity)
   */
  public fun storageCapacity(): Number? = unwrap(this).getStorageCapacity()

  /**
   * Sets the storage class for the file system that you're creating.
   *
   * Valid values are `SSD` , `HDD` , and `INTELLIGENT_TIERING` .
   *
   * * Set to `SSD` to use solid state drive storage. SSD is supported on all Windows, Lustre,
   * ONTAP, and OpenZFS deployment types.
   * * Set to `HDD` to use hard disk drive storage, which is supported on `SINGLE_AZ_2` and
   * `MULTI_AZ_1` Windows file system deployment types, and on `PERSISTENT_1` Lustre file system
   * deployment types.
   * * Set to `INTELLIGENT_TIERING` to use fully elastic, intelligently-tiered storage.
   * Intelligent-Tiering is only available for OpenZFS file systems with the Multi-AZ deployment type
   * and for Lustre file systems with the Persistent_2 deployment type.
   *
   * Default value is `SSD` . For more information, see [Storage type
   * options](https://docs.aws.amazon.com/fsx/latest/WindowsGuide/optimize-fsx-costs.html#storage-type-options)
   * in the *FSx for Windows File Server User Guide* , [FSx for Lustre storage
   * classes](https://docs.aws.amazon.com/fsx/latest/LustreGuide/using-fsx-lustre.html#lustre-storage-classes)
   * in the *FSx for Lustre User Guide* , and [Working with
   * Intelligent-Tiering](https://docs.aws.amazon.com/fsx/latest/OpenZFSGuide/performance-intelligent-tiering)
   * in the *Amazon FSx for OpenZFS User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-filesystem.html#cfn-fsx-filesystem-storagetype)
   */
  public fun storageType(): String? = unwrap(this).getStorageType()

  /**
   * Specifies the IDs of the subnets that the file system will be accessible from.
   *
   * For Windows and ONTAP `MULTI_AZ_1` deployment types,provide exactly two subnet IDs, one for the
   * preferred file server and one for the standby file server. You specify one of these subnets as the
   * preferred subnet using the `WindowsConfiguration &gt; PreferredSubnetID` or `OntapConfiguration
   * &gt; PreferredSubnetID` properties. For more information about Multi-AZ file system configuration,
   * see [Availability and durability: Single-AZ and Multi-AZ file
   * systems](https://docs.aws.amazon.com/fsx/latest/WindowsGuide/high-availability-multiAZ.html) in
   * the *Amazon FSx for Windows User Guide* and [Availability and
   * durability](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/high-availability-multiAZ.html) in
   * the *Amazon FSx for ONTAP User Guide* .
   *
   * For Windows `SINGLE_AZ_1` and `SINGLE_AZ_2` and all Lustre deployment types, provide exactly
   * one subnet ID. The file server is launched in that subnet's Availability Zone.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-filesystem.html#cfn-fsx-filesystem-subnetids)
   */
  public fun subnetIds(): List<String>

  /**
   * The tags to associate with the file system.
   *
   * For more information, see [Tagging your Amazon FSx
   * resources](https://docs.aws.amazon.com/fsx/latest/LustreGuide/tag-resources.html) in the *Amazon
   * FSx for Lustre User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-filesystem.html#cfn-fsx-filesystem-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The configuration object for the Microsoft Windows file system you are creating.
   *
   * This configuration is required if `FileSystemType` is set to `WINDOWS` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-filesystem.html#cfn-fsx-filesystem-windowsconfiguration)
   */
  public fun windowsConfiguration(): Any? = unwrap(this).getWindowsConfiguration()

  /**
   * A builder for [CfnFileSystemProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param backupId The ID of the file system backup that you are using to create a file system.
     * For more information, see
     * [CreateFileSystemFromBackup](https://docs.aws.amazon.com/fsx/latest/APIReference/API_CreateFileSystemFromBackup.html)
     * .
     */
    public fun backupId(backupId: String)

    /**
     * @param fileSystemType The type of Amazon FSx file system, which can be `LUSTRE` , `WINDOWS` ,
     * `ONTAP` , or `OPENZFS` . 
     */
    public fun fileSystemType(fileSystemType: String)

    /**
     * @param fileSystemTypeVersion For FSx for Lustre file systems, sets the Lustre version for the
     * file system that you're creating.
     * Valid values are `2.10` , `2.12` , and `2.15` :
     *
     * * `2.10` is supported by the Scratch and Persistent_1 Lustre deployment types.
     * * `2.12` is supported by all Lustre deployment types, except for `PERSISTENT_2` with a
     * metadata configuration mode.
     * * `2.15` is supported by all Lustre deployment types and is recommended for all new file
     * systems.
     *
     * Default value is `2.10` , except for the following deployments:
     *
     * * Default value is `2.12` when `DeploymentType` is set to `PERSISTENT_2` without a metadata
     * configuration mode.
     * * Default value is `2.15` when `DeploymentType` is set to `PERSISTENT_2` with a metadata
     * configuration mode.
     */
    public fun fileSystemTypeVersion(fileSystemTypeVersion: String)

    /**
     * @param kmsKeyId The ID of the AWS Key Management Service ( AWS KMS ) key used to encrypt
     * Amazon FSx file system data.
     * Used as follows with Amazon FSx file system types:
     *
     * * Amazon FSx for Lustre `PERSISTENT_1` and `PERSISTENT_2` deployment types only.
     *
     * `SCRATCH_1` and `SCRATCH_2` types are encrypted using the Amazon FSx service AWS KMS key for
     * your account.
     *
     * * Amazon FSx for NetApp ONTAP
     * * Amazon FSx for OpenZFS
     * * Amazon FSx for Windows File Server
     *
     * If this ID isn't specified, the Amazon FSx-managed key for your account is used. For more
     * information, see
     * [Encrypt](https://docs.aws.amazon.com//kms/latest/APIReference/API_Encrypt.html) in the *AWS Key
     * Management Service API Reference* .
     */
    public fun kmsKeyId(kmsKeyId: String)

    /**
     * @param lustreConfiguration The Lustre configuration for the file system being created.
     * This configuration is required if the `FileSystemType` is set to `LUSTRE` .
     *
     *
     * The following parameters are not supported when creating Lustre file systems with a data
     * repository association.
     *
     * * `AutoImportPolicy`
     * * `ExportPath`
     * * `ImportedChunkSize`
     * * `ImportPath`
     */
    public fun lustreConfiguration(lustreConfiguration: IResolvable)

    /**
     * @param lustreConfiguration The Lustre configuration for the file system being created.
     * This configuration is required if the `FileSystemType` is set to `LUSTRE` .
     *
     *
     * The following parameters are not supported when creating Lustre file systems with a data
     * repository association.
     *
     * * `AutoImportPolicy`
     * * `ExportPath`
     * * `ImportedChunkSize`
     * * `ImportPath`
     */
    public fun lustreConfiguration(lustreConfiguration: CfnFileSystem.LustreConfigurationProperty)

    /**
     * @param lustreConfiguration The Lustre configuration for the file system being created.
     * This configuration is required if the `FileSystemType` is set to `LUSTRE` .
     *
     *
     * The following parameters are not supported when creating Lustre file systems with a data
     * repository association.
     *
     * * `AutoImportPolicy`
     * * `ExportPath`
     * * `ImportedChunkSize`
     * * `ImportPath`
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6008d372e61bee9305b367f8a8b889a4444c339fcfd06d44101c4f26afb70217")
    public
        fun lustreConfiguration(lustreConfiguration: CfnFileSystem.LustreConfigurationProperty.Builder.() -> Unit)

    /**
     * @param ontapConfiguration The ONTAP configuration properties of the FSx for ONTAP file system
     * that you are creating.
     * This configuration is required if the `FileSystemType` is set to `ONTAP` .
     */
    public fun ontapConfiguration(ontapConfiguration: IResolvable)

    /**
     * @param ontapConfiguration The ONTAP configuration properties of the FSx for ONTAP file system
     * that you are creating.
     * This configuration is required if the `FileSystemType` is set to `ONTAP` .
     */
    public fun ontapConfiguration(ontapConfiguration: CfnFileSystem.OntapConfigurationProperty)

    /**
     * @param ontapConfiguration The ONTAP configuration properties of the FSx for ONTAP file system
     * that you are creating.
     * This configuration is required if the `FileSystemType` is set to `ONTAP` .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("969662ef7196eeedb20d8965ca0b9c9017c9c1850c7292c9c8c3768e47b730ee")
    public
        fun ontapConfiguration(ontapConfiguration: CfnFileSystem.OntapConfigurationProperty.Builder.() -> Unit)

    /**
     * @param openZfsConfiguration The Amazon FSx for OpenZFS configuration properties for the file
     * system that you are creating.
     * This configuration is required if the `FileSystemType` is set to `OPENZFS` .
     */
    public fun openZfsConfiguration(openZfsConfiguration: IResolvable)

    /**
     * @param openZfsConfiguration The Amazon FSx for OpenZFS configuration properties for the file
     * system that you are creating.
     * This configuration is required if the `FileSystemType` is set to `OPENZFS` .
     */
    public
        fun openZfsConfiguration(openZfsConfiguration: CfnFileSystem.OpenZFSConfigurationProperty)

    /**
     * @param openZfsConfiguration The Amazon FSx for OpenZFS configuration properties for the file
     * system that you are creating.
     * This configuration is required if the `FileSystemType` is set to `OPENZFS` .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b2cfc7b987460a27f9cd662be0c3ed29f7de877ab35232f42a0449bb34c8e627")
    public
        fun openZfsConfiguration(openZfsConfiguration: CfnFileSystem.OpenZFSConfigurationProperty.Builder.() -> Unit)

    /**
     * @param securityGroupIds A list of IDs specifying the security groups to apply to all network
     * interfaces created for file system access.
     * This list isn't returned in later requests to describe the file system.
     *
     *
     * You must specify a security group if you are creating a Multi-AZ FSx for ONTAP file system in
     * a VPC subnet that has been shared with you.
     */
    public fun securityGroupIds(securityGroupIds: List<String>)

    /**
     * @param securityGroupIds A list of IDs specifying the security groups to apply to all network
     * interfaces created for file system access.
     * This list isn't returned in later requests to describe the file system.
     *
     *
     * You must specify a security group if you are creating a Multi-AZ FSx for ONTAP file system in
     * a VPC subnet that has been shared with you.
     */
    public fun securityGroupIds(vararg securityGroupIds: String)

    /**
     * @param storageCapacity Sets the storage capacity of the file system that you're creating.
     * `StorageCapacity` is required if you are creating a new file system. It is not required if
     * you are creating a file system by restoring a backup.
     *
     * *FSx for Lustre file systems* - The amount of storage capacity that you can configure depends
     * on the value that you set for `StorageType` and the Lustre `DeploymentType` , as follows:
     *
     * * For `SCRATCH_2` , `PERSISTENT_2` and `PERSISTENT_1` deployment types using SSD storage
     * type, the valid values are 1200 GiB, 2400 GiB, and increments of 2400 GiB.
     * * For `PERSISTENT_1` HDD file systems, valid values are increments of 6000 GiB for 12
     * MB/s/TiB file systems and increments of 1800 GiB for 40 MB/s/TiB file systems.
     * * For `SCRATCH_1` deployment type, valid values are 1200 GiB, 2400 GiB, and increments of
     * 3600 GiB.
     *
     * *FSx for ONTAP file systems* - The amount of SSD storage capacity that you can configure
     * depends on the value of the `HAPairs` property. The minimum value is calculated as 1,024 GiB *
     * HAPairs and the maximum is calculated as 524,288 GiB * HAPairs, up to a maximum amount of SSD
     * storage capacity of 1,048,576 GiB (1 pebibyte).
     *
     * *FSx for OpenZFS file systems* - The amount of storage capacity that you can configure is
     * from 64 GiB up to 524,288 GiB (512 TiB). If you are creating a file system from a backup, you
     * can specify a storage capacity equal to or greater than the original file system's storage
     * capacity.
     *
     * *FSx for Windows File Server file systems* - The amount of storage capacity that you can
     * configure depends on the value that you set for `StorageType` as follows:
     *
     * * For SSD storage, valid values are 32 GiB-65,536 GiB (64 TiB).
     * * For HDD storage, valid values are 2000 GiB-65,536 GiB (64 TiB).
     */
    public fun storageCapacity(storageCapacity: Number)

    /**
     * @param storageType Sets the storage class for the file system that you're creating.
     * Valid values are `SSD` , `HDD` , and `INTELLIGENT_TIERING` .
     *
     * * Set to `SSD` to use solid state drive storage. SSD is supported on all Windows, Lustre,
     * ONTAP, and OpenZFS deployment types.
     * * Set to `HDD` to use hard disk drive storage, which is supported on `SINGLE_AZ_2` and
     * `MULTI_AZ_1` Windows file system deployment types, and on `PERSISTENT_1` Lustre file system
     * deployment types.
     * * Set to `INTELLIGENT_TIERING` to use fully elastic, intelligently-tiered storage.
     * Intelligent-Tiering is only available for OpenZFS file systems with the Multi-AZ deployment type
     * and for Lustre file systems with the Persistent_2 deployment type.
     *
     * Default value is `SSD` . For more information, see [Storage type
     * options](https://docs.aws.amazon.com/fsx/latest/WindowsGuide/optimize-fsx-costs.html#storage-type-options)
     * in the *FSx for Windows File Server User Guide* , [FSx for Lustre storage
     * classes](https://docs.aws.amazon.com/fsx/latest/LustreGuide/using-fsx-lustre.html#lustre-storage-classes)
     * in the *FSx for Lustre User Guide* , and [Working with
     * Intelligent-Tiering](https://docs.aws.amazon.com/fsx/latest/OpenZFSGuide/performance-intelligent-tiering)
     * in the *Amazon FSx for OpenZFS User Guide* .
     */
    public fun storageType(storageType: String)

    /**
     * @param subnetIds Specifies the IDs of the subnets that the file system will be accessible
     * from. 
     * For Windows and ONTAP `MULTI_AZ_1` deployment types,provide exactly two subnet IDs, one for
     * the preferred file server and one for the standby file server. You specify one of these subnets
     * as the preferred subnet using the `WindowsConfiguration &gt; PreferredSubnetID` or
     * `OntapConfiguration &gt; PreferredSubnetID` properties. For more information about Multi-AZ file
     * system configuration, see [Availability and durability: Single-AZ and Multi-AZ file
     * systems](https://docs.aws.amazon.com/fsx/latest/WindowsGuide/high-availability-multiAZ.html) in
     * the *Amazon FSx for Windows User Guide* and [Availability and
     * durability](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/high-availability-multiAZ.html) in
     * the *Amazon FSx for ONTAP User Guide* .
     *
     * For Windows `SINGLE_AZ_1` and `SINGLE_AZ_2` and all Lustre deployment types, provide exactly
     * one subnet ID. The file server is launched in that subnet's Availability Zone.
     */
    public fun subnetIds(subnetIds: List<String>)

    /**
     * @param subnetIds Specifies the IDs of the subnets that the file system will be accessible
     * from. 
     * For Windows and ONTAP `MULTI_AZ_1` deployment types,provide exactly two subnet IDs, one for
     * the preferred file server and one for the standby file server. You specify one of these subnets
     * as the preferred subnet using the `WindowsConfiguration &gt; PreferredSubnetID` or
     * `OntapConfiguration &gt; PreferredSubnetID` properties. For more information about Multi-AZ file
     * system configuration, see [Availability and durability: Single-AZ and Multi-AZ file
     * systems](https://docs.aws.amazon.com/fsx/latest/WindowsGuide/high-availability-multiAZ.html) in
     * the *Amazon FSx for Windows User Guide* and [Availability and
     * durability](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/high-availability-multiAZ.html) in
     * the *Amazon FSx for ONTAP User Guide* .
     *
     * For Windows `SINGLE_AZ_1` and `SINGLE_AZ_2` and all Lustre deployment types, provide exactly
     * one subnet ID. The file server is launched in that subnet's Availability Zone.
     */
    public fun subnetIds(vararg subnetIds: String)

    /**
     * @param tags The tags to associate with the file system.
     * For more information, see [Tagging your Amazon FSx
     * resources](https://docs.aws.amazon.com/fsx/latest/LustreGuide/tag-resources.html) in the *Amazon
     * FSx for Lustre User Guide* .
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags to associate with the file system.
     * For more information, see [Tagging your Amazon FSx
     * resources](https://docs.aws.amazon.com/fsx/latest/LustreGuide/tag-resources.html) in the *Amazon
     * FSx for Lustre User Guide* .
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param windowsConfiguration The configuration object for the Microsoft Windows file system
     * you are creating.
     * This configuration is required if `FileSystemType` is set to `WINDOWS` .
     */
    public fun windowsConfiguration(windowsConfiguration: IResolvable)

    /**
     * @param windowsConfiguration The configuration object for the Microsoft Windows file system
     * you are creating.
     * This configuration is required if `FileSystemType` is set to `WINDOWS` .
     */
    public
        fun windowsConfiguration(windowsConfiguration: CfnFileSystem.WindowsConfigurationProperty)

    /**
     * @param windowsConfiguration The configuration object for the Microsoft Windows file system
     * you are creating.
     * This configuration is required if `FileSystemType` is set to `WINDOWS` .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e8c519948299082c85c0be491844cb6b0e13d5b8b453446a7c4f85863f7a63b3")
    public
        fun windowsConfiguration(windowsConfiguration: CfnFileSystem.WindowsConfigurationProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.fsx.CfnFileSystemProps.Builder =
        software.amazon.awscdk.services.fsx.CfnFileSystemProps.builder()

    /**
     * @param backupId The ID of the file system backup that you are using to create a file system.
     * For more information, see
     * [CreateFileSystemFromBackup](https://docs.aws.amazon.com/fsx/latest/APIReference/API_CreateFileSystemFromBackup.html)
     * .
     */
    override fun backupId(backupId: String) {
      cdkBuilder.backupId(backupId)
    }

    /**
     * @param fileSystemType The type of Amazon FSx file system, which can be `LUSTRE` , `WINDOWS` ,
     * `ONTAP` , or `OPENZFS` . 
     */
    override fun fileSystemType(fileSystemType: String) {
      cdkBuilder.fileSystemType(fileSystemType)
    }

    /**
     * @param fileSystemTypeVersion For FSx for Lustre file systems, sets the Lustre version for the
     * file system that you're creating.
     * Valid values are `2.10` , `2.12` , and `2.15` :
     *
     * * `2.10` is supported by the Scratch and Persistent_1 Lustre deployment types.
     * * `2.12` is supported by all Lustre deployment types, except for `PERSISTENT_2` with a
     * metadata configuration mode.
     * * `2.15` is supported by all Lustre deployment types and is recommended for all new file
     * systems.
     *
     * Default value is `2.10` , except for the following deployments:
     *
     * * Default value is `2.12` when `DeploymentType` is set to `PERSISTENT_2` without a metadata
     * configuration mode.
     * * Default value is `2.15` when `DeploymentType` is set to `PERSISTENT_2` with a metadata
     * configuration mode.
     */
    override fun fileSystemTypeVersion(fileSystemTypeVersion: String) {
      cdkBuilder.fileSystemTypeVersion(fileSystemTypeVersion)
    }

    /**
     * @param kmsKeyId The ID of the AWS Key Management Service ( AWS KMS ) key used to encrypt
     * Amazon FSx file system data.
     * Used as follows with Amazon FSx file system types:
     *
     * * Amazon FSx for Lustre `PERSISTENT_1` and `PERSISTENT_2` deployment types only.
     *
     * `SCRATCH_1` and `SCRATCH_2` types are encrypted using the Amazon FSx service AWS KMS key for
     * your account.
     *
     * * Amazon FSx for NetApp ONTAP
     * * Amazon FSx for OpenZFS
     * * Amazon FSx for Windows File Server
     *
     * If this ID isn't specified, the Amazon FSx-managed key for your account is used. For more
     * information, see
     * [Encrypt](https://docs.aws.amazon.com//kms/latest/APIReference/API_Encrypt.html) in the *AWS Key
     * Management Service API Reference* .
     */
    override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    /**
     * @param lustreConfiguration The Lustre configuration for the file system being created.
     * This configuration is required if the `FileSystemType` is set to `LUSTRE` .
     *
     *
     * The following parameters are not supported when creating Lustre file systems with a data
     * repository association.
     *
     * * `AutoImportPolicy`
     * * `ExportPath`
     * * `ImportedChunkSize`
     * * `ImportPath`
     */
    override fun lustreConfiguration(lustreConfiguration: IResolvable) {
      cdkBuilder.lustreConfiguration(lustreConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param lustreConfiguration The Lustre configuration for the file system being created.
     * This configuration is required if the `FileSystemType` is set to `LUSTRE` .
     *
     *
     * The following parameters are not supported when creating Lustre file systems with a data
     * repository association.
     *
     * * `AutoImportPolicy`
     * * `ExportPath`
     * * `ImportedChunkSize`
     * * `ImportPath`
     */
    override
        fun lustreConfiguration(lustreConfiguration: CfnFileSystem.LustreConfigurationProperty) {
      cdkBuilder.lustreConfiguration(lustreConfiguration.let(CfnFileSystem.LustreConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param lustreConfiguration The Lustre configuration for the file system being created.
     * This configuration is required if the `FileSystemType` is set to `LUSTRE` .
     *
     *
     * The following parameters are not supported when creating Lustre file systems with a data
     * repository association.
     *
     * * `AutoImportPolicy`
     * * `ExportPath`
     * * `ImportedChunkSize`
     * * `ImportPath`
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6008d372e61bee9305b367f8a8b889a4444c339fcfd06d44101c4f26afb70217")
    override
        fun lustreConfiguration(lustreConfiguration: CfnFileSystem.LustreConfigurationProperty.Builder.() -> Unit):
        Unit = lustreConfiguration(CfnFileSystem.LustreConfigurationProperty(lustreConfiguration))

    /**
     * @param ontapConfiguration The ONTAP configuration properties of the FSx for ONTAP file system
     * that you are creating.
     * This configuration is required if the `FileSystemType` is set to `ONTAP` .
     */
    override fun ontapConfiguration(ontapConfiguration: IResolvable) {
      cdkBuilder.ontapConfiguration(ontapConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param ontapConfiguration The ONTAP configuration properties of the FSx for ONTAP file system
     * that you are creating.
     * This configuration is required if the `FileSystemType` is set to `ONTAP` .
     */
    override fun ontapConfiguration(ontapConfiguration: CfnFileSystem.OntapConfigurationProperty) {
      cdkBuilder.ontapConfiguration(ontapConfiguration.let(CfnFileSystem.OntapConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param ontapConfiguration The ONTAP configuration properties of the FSx for ONTAP file system
     * that you are creating.
     * This configuration is required if the `FileSystemType` is set to `ONTAP` .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("969662ef7196eeedb20d8965ca0b9c9017c9c1850c7292c9c8c3768e47b730ee")
    override
        fun ontapConfiguration(ontapConfiguration: CfnFileSystem.OntapConfigurationProperty.Builder.() -> Unit):
        Unit = ontapConfiguration(CfnFileSystem.OntapConfigurationProperty(ontapConfiguration))

    /**
     * @param openZfsConfiguration The Amazon FSx for OpenZFS configuration properties for the file
     * system that you are creating.
     * This configuration is required if the `FileSystemType` is set to `OPENZFS` .
     */
    override fun openZfsConfiguration(openZfsConfiguration: IResolvable) {
      cdkBuilder.openZfsConfiguration(openZfsConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param openZfsConfiguration The Amazon FSx for OpenZFS configuration properties for the file
     * system that you are creating.
     * This configuration is required if the `FileSystemType` is set to `OPENZFS` .
     */
    override
        fun openZfsConfiguration(openZfsConfiguration: CfnFileSystem.OpenZFSConfigurationProperty) {
      cdkBuilder.openZfsConfiguration(openZfsConfiguration.let(CfnFileSystem.OpenZFSConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param openZfsConfiguration The Amazon FSx for OpenZFS configuration properties for the file
     * system that you are creating.
     * This configuration is required if the `FileSystemType` is set to `OPENZFS` .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b2cfc7b987460a27f9cd662be0c3ed29f7de877ab35232f42a0449bb34c8e627")
    override
        fun openZfsConfiguration(openZfsConfiguration: CfnFileSystem.OpenZFSConfigurationProperty.Builder.() -> Unit):
        Unit =
        openZfsConfiguration(CfnFileSystem.OpenZFSConfigurationProperty(openZfsConfiguration))

    /**
     * @param securityGroupIds A list of IDs specifying the security groups to apply to all network
     * interfaces created for file system access.
     * This list isn't returned in later requests to describe the file system.
     *
     *
     * You must specify a security group if you are creating a Multi-AZ FSx for ONTAP file system in
     * a VPC subnet that has been shared with you.
     */
    override fun securityGroupIds(securityGroupIds: List<String>) {
      cdkBuilder.securityGroupIds(securityGroupIds)
    }

    /**
     * @param securityGroupIds A list of IDs specifying the security groups to apply to all network
     * interfaces created for file system access.
     * This list isn't returned in later requests to describe the file system.
     *
     *
     * You must specify a security group if you are creating a Multi-AZ FSx for ONTAP file system in
     * a VPC subnet that has been shared with you.
     */
    override fun securityGroupIds(vararg securityGroupIds: String): Unit =
        securityGroupIds(securityGroupIds.toList())

    /**
     * @param storageCapacity Sets the storage capacity of the file system that you're creating.
     * `StorageCapacity` is required if you are creating a new file system. It is not required if
     * you are creating a file system by restoring a backup.
     *
     * *FSx for Lustre file systems* - The amount of storage capacity that you can configure depends
     * on the value that you set for `StorageType` and the Lustre `DeploymentType` , as follows:
     *
     * * For `SCRATCH_2` , `PERSISTENT_2` and `PERSISTENT_1` deployment types using SSD storage
     * type, the valid values are 1200 GiB, 2400 GiB, and increments of 2400 GiB.
     * * For `PERSISTENT_1` HDD file systems, valid values are increments of 6000 GiB for 12
     * MB/s/TiB file systems and increments of 1800 GiB for 40 MB/s/TiB file systems.
     * * For `SCRATCH_1` deployment type, valid values are 1200 GiB, 2400 GiB, and increments of
     * 3600 GiB.
     *
     * *FSx for ONTAP file systems* - The amount of SSD storage capacity that you can configure
     * depends on the value of the `HAPairs` property. The minimum value is calculated as 1,024 GiB *
     * HAPairs and the maximum is calculated as 524,288 GiB * HAPairs, up to a maximum amount of SSD
     * storage capacity of 1,048,576 GiB (1 pebibyte).
     *
     * *FSx for OpenZFS file systems* - The amount of storage capacity that you can configure is
     * from 64 GiB up to 524,288 GiB (512 TiB). If you are creating a file system from a backup, you
     * can specify a storage capacity equal to or greater than the original file system's storage
     * capacity.
     *
     * *FSx for Windows File Server file systems* - The amount of storage capacity that you can
     * configure depends on the value that you set for `StorageType` as follows:
     *
     * * For SSD storage, valid values are 32 GiB-65,536 GiB (64 TiB).
     * * For HDD storage, valid values are 2000 GiB-65,536 GiB (64 TiB).
     */
    override fun storageCapacity(storageCapacity: Number) {
      cdkBuilder.storageCapacity(storageCapacity)
    }

    /**
     * @param storageType Sets the storage class for the file system that you're creating.
     * Valid values are `SSD` , `HDD` , and `INTELLIGENT_TIERING` .
     *
     * * Set to `SSD` to use solid state drive storage. SSD is supported on all Windows, Lustre,
     * ONTAP, and OpenZFS deployment types.
     * * Set to `HDD` to use hard disk drive storage, which is supported on `SINGLE_AZ_2` and
     * `MULTI_AZ_1` Windows file system deployment types, and on `PERSISTENT_1` Lustre file system
     * deployment types.
     * * Set to `INTELLIGENT_TIERING` to use fully elastic, intelligently-tiered storage.
     * Intelligent-Tiering is only available for OpenZFS file systems with the Multi-AZ deployment type
     * and for Lustre file systems with the Persistent_2 deployment type.
     *
     * Default value is `SSD` . For more information, see [Storage type
     * options](https://docs.aws.amazon.com/fsx/latest/WindowsGuide/optimize-fsx-costs.html#storage-type-options)
     * in the *FSx for Windows File Server User Guide* , [FSx for Lustre storage
     * classes](https://docs.aws.amazon.com/fsx/latest/LustreGuide/using-fsx-lustre.html#lustre-storage-classes)
     * in the *FSx for Lustre User Guide* , and [Working with
     * Intelligent-Tiering](https://docs.aws.amazon.com/fsx/latest/OpenZFSGuide/performance-intelligent-tiering)
     * in the *Amazon FSx for OpenZFS User Guide* .
     */
    override fun storageType(storageType: String) {
      cdkBuilder.storageType(storageType)
    }

    /**
     * @param subnetIds Specifies the IDs of the subnets that the file system will be accessible
     * from. 
     * For Windows and ONTAP `MULTI_AZ_1` deployment types,provide exactly two subnet IDs, one for
     * the preferred file server and one for the standby file server. You specify one of these subnets
     * as the preferred subnet using the `WindowsConfiguration &gt; PreferredSubnetID` or
     * `OntapConfiguration &gt; PreferredSubnetID` properties. For more information about Multi-AZ file
     * system configuration, see [Availability and durability: Single-AZ and Multi-AZ file
     * systems](https://docs.aws.amazon.com/fsx/latest/WindowsGuide/high-availability-multiAZ.html) in
     * the *Amazon FSx for Windows User Guide* and [Availability and
     * durability](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/high-availability-multiAZ.html) in
     * the *Amazon FSx for ONTAP User Guide* .
     *
     * For Windows `SINGLE_AZ_1` and `SINGLE_AZ_2` and all Lustre deployment types, provide exactly
     * one subnet ID. The file server is launched in that subnet's Availability Zone.
     */
    override fun subnetIds(subnetIds: List<String>) {
      cdkBuilder.subnetIds(subnetIds)
    }

    /**
     * @param subnetIds Specifies the IDs of the subnets that the file system will be accessible
     * from. 
     * For Windows and ONTAP `MULTI_AZ_1` deployment types,provide exactly two subnet IDs, one for
     * the preferred file server and one for the standby file server. You specify one of these subnets
     * as the preferred subnet using the `WindowsConfiguration &gt; PreferredSubnetID` or
     * `OntapConfiguration &gt; PreferredSubnetID` properties. For more information about Multi-AZ file
     * system configuration, see [Availability and durability: Single-AZ and Multi-AZ file
     * systems](https://docs.aws.amazon.com/fsx/latest/WindowsGuide/high-availability-multiAZ.html) in
     * the *Amazon FSx for Windows User Guide* and [Availability and
     * durability](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/high-availability-multiAZ.html) in
     * the *Amazon FSx for ONTAP User Guide* .
     *
     * For Windows `SINGLE_AZ_1` and `SINGLE_AZ_2` and all Lustre deployment types, provide exactly
     * one subnet ID. The file server is launched in that subnet's Availability Zone.
     */
    override fun subnetIds(vararg subnetIds: String): Unit = subnetIds(subnetIds.toList())

    /**
     * @param tags The tags to associate with the file system.
     * For more information, see [Tagging your Amazon FSx
     * resources](https://docs.aws.amazon.com/fsx/latest/LustreGuide/tag-resources.html) in the *Amazon
     * FSx for Lustre User Guide* .
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags The tags to associate with the file system.
     * For more information, see [Tagging your Amazon FSx
     * resources](https://docs.aws.amazon.com/fsx/latest/LustreGuide/tag-resources.html) in the *Amazon
     * FSx for Lustre User Guide* .
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param windowsConfiguration The configuration object for the Microsoft Windows file system
     * you are creating.
     * This configuration is required if `FileSystemType` is set to `WINDOWS` .
     */
    override fun windowsConfiguration(windowsConfiguration: IResolvable) {
      cdkBuilder.windowsConfiguration(windowsConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param windowsConfiguration The configuration object for the Microsoft Windows file system
     * you are creating.
     * This configuration is required if `FileSystemType` is set to `WINDOWS` .
     */
    override
        fun windowsConfiguration(windowsConfiguration: CfnFileSystem.WindowsConfigurationProperty) {
      cdkBuilder.windowsConfiguration(windowsConfiguration.let(CfnFileSystem.WindowsConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param windowsConfiguration The configuration object for the Microsoft Windows file system
     * you are creating.
     * This configuration is required if `FileSystemType` is set to `WINDOWS` .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e8c519948299082c85c0be491844cb6b0e13d5b8b453446a7c4f85863f7a63b3")
    override
        fun windowsConfiguration(windowsConfiguration: CfnFileSystem.WindowsConfigurationProperty.Builder.() -> Unit):
        Unit =
        windowsConfiguration(CfnFileSystem.WindowsConfigurationProperty(windowsConfiguration))

    public fun build(): software.amazon.awscdk.services.fsx.CfnFileSystemProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.fsx.CfnFileSystemProps,
  ) : CdkObject(cdkObject),
      CfnFileSystemProps {
    /**
     * The ID of the file system backup that you are using to create a file system.
     *
     * For more information, see
     * [CreateFileSystemFromBackup](https://docs.aws.amazon.com/fsx/latest/APIReference/API_CreateFileSystemFromBackup.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-filesystem.html#cfn-fsx-filesystem-backupid)
     */
    override fun backupId(): String? = unwrap(this).getBackupId()

    /**
     * The type of Amazon FSx file system, which can be `LUSTRE` , `WINDOWS` , `ONTAP` , or
     * `OPENZFS` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-filesystem.html#cfn-fsx-filesystem-filesystemtype)
     */
    override fun fileSystemType(): String = unwrap(this).getFileSystemType()

    /**
     * For FSx for Lustre file systems, sets the Lustre version for the file system that you're
     * creating.
     *
     * Valid values are `2.10` , `2.12` , and `2.15` :
     *
     * * `2.10` is supported by the Scratch and Persistent_1 Lustre deployment types.
     * * `2.12` is supported by all Lustre deployment types, except for `PERSISTENT_2` with a
     * metadata configuration mode.
     * * `2.15` is supported by all Lustre deployment types and is recommended for all new file
     * systems.
     *
     * Default value is `2.10` , except for the following deployments:
     *
     * * Default value is `2.12` when `DeploymentType` is set to `PERSISTENT_2` without a metadata
     * configuration mode.
     * * Default value is `2.15` when `DeploymentType` is set to `PERSISTENT_2` with a metadata
     * configuration mode.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-filesystem.html#cfn-fsx-filesystem-filesystemtypeversion)
     */
    override fun fileSystemTypeVersion(): String? = unwrap(this).getFileSystemTypeVersion()

    /**
     * The ID of the AWS Key Management Service ( AWS KMS ) key used to encrypt Amazon FSx file
     * system data.
     *
     * Used as follows with Amazon FSx file system types:
     *
     * * Amazon FSx for Lustre `PERSISTENT_1` and `PERSISTENT_2` deployment types only.
     *
     * `SCRATCH_1` and `SCRATCH_2` types are encrypted using the Amazon FSx service AWS KMS key for
     * your account.
     *
     * * Amazon FSx for NetApp ONTAP
     * * Amazon FSx for OpenZFS
     * * Amazon FSx for Windows File Server
     *
     * If this ID isn't specified, the Amazon FSx-managed key for your account is used. For more
     * information, see
     * [Encrypt](https://docs.aws.amazon.com//kms/latest/APIReference/API_Encrypt.html) in the *AWS Key
     * Management Service API Reference* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-filesystem.html#cfn-fsx-filesystem-kmskeyid)
     */
    override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    /**
     * The Lustre configuration for the file system being created.
     *
     * This configuration is required if the `FileSystemType` is set to `LUSTRE` .
     *
     *
     * The following parameters are not supported when creating Lustre file systems with a data
     * repository association.
     *
     * * `AutoImportPolicy`
     * * `ExportPath`
     * * `ImportedChunkSize`
     * * `ImportPath`
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-filesystem.html#cfn-fsx-filesystem-lustreconfiguration)
     */
    override fun lustreConfiguration(): Any? = unwrap(this).getLustreConfiguration()

    /**
     * The ONTAP configuration properties of the FSx for ONTAP file system that you are creating.
     *
     * This configuration is required if the `FileSystemType` is set to `ONTAP` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-filesystem.html#cfn-fsx-filesystem-ontapconfiguration)
     */
    override fun ontapConfiguration(): Any? = unwrap(this).getOntapConfiguration()

    /**
     * The Amazon FSx for OpenZFS configuration properties for the file system that you are
     * creating.
     *
     * This configuration is required if the `FileSystemType` is set to `OPENZFS` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-filesystem.html#cfn-fsx-filesystem-openzfsconfiguration)
     */
    override fun openZfsConfiguration(): Any? = unwrap(this).getOpenZfsConfiguration()

    /**
     * A list of IDs specifying the security groups to apply to all network interfaces created for
     * file system access.
     *
     * This list isn't returned in later requests to describe the file system.
     *
     *
     * You must specify a security group if you are creating a Multi-AZ FSx for ONTAP file system in
     * a VPC subnet that has been shared with you.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-filesystem.html#cfn-fsx-filesystem-securitygroupids)
     */
    override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
        emptyList()

    /**
     * Sets the storage capacity of the file system that you're creating.
     *
     * `StorageCapacity` is required if you are creating a new file system. It is not required if
     * you are creating a file system by restoring a backup.
     *
     * *FSx for Lustre file systems* - The amount of storage capacity that you can configure depends
     * on the value that you set for `StorageType` and the Lustre `DeploymentType` , as follows:
     *
     * * For `SCRATCH_2` , `PERSISTENT_2` and `PERSISTENT_1` deployment types using SSD storage
     * type, the valid values are 1200 GiB, 2400 GiB, and increments of 2400 GiB.
     * * For `PERSISTENT_1` HDD file systems, valid values are increments of 6000 GiB for 12
     * MB/s/TiB file systems and increments of 1800 GiB for 40 MB/s/TiB file systems.
     * * For `SCRATCH_1` deployment type, valid values are 1200 GiB, 2400 GiB, and increments of
     * 3600 GiB.
     *
     * *FSx for ONTAP file systems* - The amount of SSD storage capacity that you can configure
     * depends on the value of the `HAPairs` property. The minimum value is calculated as 1,024 GiB *
     * HAPairs and the maximum is calculated as 524,288 GiB * HAPairs, up to a maximum amount of SSD
     * storage capacity of 1,048,576 GiB (1 pebibyte).
     *
     * *FSx for OpenZFS file systems* - The amount of storage capacity that you can configure is
     * from 64 GiB up to 524,288 GiB (512 TiB). If you are creating a file system from a backup, you
     * can specify a storage capacity equal to or greater than the original file system's storage
     * capacity.
     *
     * *FSx for Windows File Server file systems* - The amount of storage capacity that you can
     * configure depends on the value that you set for `StorageType` as follows:
     *
     * * For SSD storage, valid values are 32 GiB-65,536 GiB (64 TiB).
     * * For HDD storage, valid values are 2000 GiB-65,536 GiB (64 TiB).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-filesystem.html#cfn-fsx-filesystem-storagecapacity)
     */
    override fun storageCapacity(): Number? = unwrap(this).getStorageCapacity()

    /**
     * Sets the storage class for the file system that you're creating.
     *
     * Valid values are `SSD` , `HDD` , and `INTELLIGENT_TIERING` .
     *
     * * Set to `SSD` to use solid state drive storage. SSD is supported on all Windows, Lustre,
     * ONTAP, and OpenZFS deployment types.
     * * Set to `HDD` to use hard disk drive storage, which is supported on `SINGLE_AZ_2` and
     * `MULTI_AZ_1` Windows file system deployment types, and on `PERSISTENT_1` Lustre file system
     * deployment types.
     * * Set to `INTELLIGENT_TIERING` to use fully elastic, intelligently-tiered storage.
     * Intelligent-Tiering is only available for OpenZFS file systems with the Multi-AZ deployment type
     * and for Lustre file systems with the Persistent_2 deployment type.
     *
     * Default value is `SSD` . For more information, see [Storage type
     * options](https://docs.aws.amazon.com/fsx/latest/WindowsGuide/optimize-fsx-costs.html#storage-type-options)
     * in the *FSx for Windows File Server User Guide* , [FSx for Lustre storage
     * classes](https://docs.aws.amazon.com/fsx/latest/LustreGuide/using-fsx-lustre.html#lustre-storage-classes)
     * in the *FSx for Lustre User Guide* , and [Working with
     * Intelligent-Tiering](https://docs.aws.amazon.com/fsx/latest/OpenZFSGuide/performance-intelligent-tiering)
     * in the *Amazon FSx for OpenZFS User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-filesystem.html#cfn-fsx-filesystem-storagetype)
     */
    override fun storageType(): String? = unwrap(this).getStorageType()

    /**
     * Specifies the IDs of the subnets that the file system will be accessible from.
     *
     * For Windows and ONTAP `MULTI_AZ_1` deployment types,provide exactly two subnet IDs, one for
     * the preferred file server and one for the standby file server. You specify one of these subnets
     * as the preferred subnet using the `WindowsConfiguration &gt; PreferredSubnetID` or
     * `OntapConfiguration &gt; PreferredSubnetID` properties. For more information about Multi-AZ file
     * system configuration, see [Availability and durability: Single-AZ and Multi-AZ file
     * systems](https://docs.aws.amazon.com/fsx/latest/WindowsGuide/high-availability-multiAZ.html) in
     * the *Amazon FSx for Windows User Guide* and [Availability and
     * durability](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/high-availability-multiAZ.html) in
     * the *Amazon FSx for ONTAP User Guide* .
     *
     * For Windows `SINGLE_AZ_1` and `SINGLE_AZ_2` and all Lustre deployment types, provide exactly
     * one subnet ID. The file server is launched in that subnet's Availability Zone.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-filesystem.html#cfn-fsx-filesystem-subnetids)
     */
    override fun subnetIds(): List<String> = unwrap(this).getSubnetIds()

    /**
     * The tags to associate with the file system.
     *
     * For more information, see [Tagging your Amazon FSx
     * resources](https://docs.aws.amazon.com/fsx/latest/LustreGuide/tag-resources.html) in the *Amazon
     * FSx for Lustre User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-filesystem.html#cfn-fsx-filesystem-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The configuration object for the Microsoft Windows file system you are creating.
     *
     * This configuration is required if `FileSystemType` is set to `WINDOWS` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-filesystem.html#cfn-fsx-filesystem-windowsconfiguration)
     */
    override fun windowsConfiguration(): Any? = unwrap(this).getWindowsConfiguration()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnFileSystemProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.fsx.CfnFileSystemProps):
        CfnFileSystemProps = CdkObjectWrappers.wrap(cdkObject) as? CfnFileSystemProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnFileSystemProps):
        software.amazon.awscdk.services.fsx.CfnFileSystemProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.fsx.CfnFileSystemProps
  }
}
