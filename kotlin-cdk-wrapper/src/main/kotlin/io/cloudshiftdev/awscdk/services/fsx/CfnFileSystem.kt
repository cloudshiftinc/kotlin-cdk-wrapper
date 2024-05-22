@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.fsx

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::FSx::FileSystem` resource is an Amazon FSx resource type that specifies an Amazon FSx
 * file system.
 *
 * You can create any of the following supported file system types:
 *
 * * Amazon FSx for Lustre
 * * Amazon FSx for NetApp ONTAP
 * * FSx for OpenZFS
 * * Amazon FSx for Windows File Server
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.fsx.*;
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
public open class CfnFileSystem(
  cdkObject: software.amazon.awscdk.services.fsx.CfnFileSystem,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnFileSystemProps,
  ) :
      this(software.amazon.awscdk.services.fsx.CfnFileSystem(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnFileSystemProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnFileSystemProps.Builder.() -> Unit,
  ) : this(scope, id, CfnFileSystemProps(props)
  )

  /**
   * Returns the FSx for Windows file system's DNSName.
   *
   * Example: `amznfsxp1honlek.corp.example.com`
   */
  public open fun attrDnsName(): String = unwrap(this).getAttrDnsName()

  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * Returns the Lustre file system's `LustreMountName` .
   *
   * Example for `SCRATCH_1` deployment types: This value is always `fsx` .
   *
   * Example for `SCRATCH_2` and `PERSISTENT` deployment types: `2p3fhbmv`
   */
  public open fun attrLustreMountName(): String = unwrap(this).getAttrLustreMountName()

  /**
   * Returns the Amazon Resource Name (ARN) for the Amazon FSx file system.
   *
   * Example: `arn:aws:fsx:us-east-2:111122223333:file-system/fs-0123abcd56789ef0a`
   */
  public open fun attrResourceArn(): String = unwrap(this).getAttrResourceArn()

  /**
   * Returns the root volume ID of the FSx for OpenZFS file system.
   *
   * Example: `fsvol-0123456789abcdefa`
   */
  public open fun attrRootVolumeId(): String = unwrap(this).getAttrRootVolumeId()

  /**
   * The ID of the file system backup that you are using to create a file system.
   */
  public open fun backupId(): String? = unwrap(this).getBackupId()

  /**
   * The ID of the file system backup that you are using to create a file system.
   */
  public open fun backupId(`value`: String) {
    unwrap(this).setBackupId(`value`)
  }

  /**
   * The type of Amazon FSx file system, which can be `LUSTRE` , `WINDOWS` , `ONTAP` , or `OPENZFS`
   * .
   */
  public open fun fileSystemType(): String = unwrap(this).getFileSystemType()

  /**
   * The type of Amazon FSx file system, which can be `LUSTRE` , `WINDOWS` , `ONTAP` , or `OPENZFS`
   * .
   */
  public open fun fileSystemType(`value`: String) {
    unwrap(this).setFileSystemType(`value`)
  }

  /**
   * (Optional) For FSx for Lustre file systems, sets the Lustre version for the file system that
   * you're creating.
   */
  public open fun fileSystemTypeVersion(): String? = unwrap(this).getFileSystemTypeVersion()

  /**
   * (Optional) For FSx for Lustre file systems, sets the Lustre version for the file system that
   * you're creating.
   */
  public open fun fileSystemTypeVersion(`value`: String) {
    unwrap(this).setFileSystemTypeVersion(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The ID of the AWS Key Management Service ( AWS KMS ) key used to encrypt Amazon FSx file system
   * data.
   */
  public open fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  /**
   * The ID of the AWS Key Management Service ( AWS KMS ) key used to encrypt Amazon FSx file system
   * data.
   */
  public open fun kmsKeyId(`value`: String) {
    unwrap(this).setKmsKeyId(`value`)
  }

  /**
   * The Lustre configuration for the file system being created.
   */
  public open fun lustreConfiguration(): Any? = unwrap(this).getLustreConfiguration()

  /**
   * The Lustre configuration for the file system being created.
   */
  public open fun lustreConfiguration(`value`: IResolvable) {
    unwrap(this).setLustreConfiguration(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The Lustre configuration for the file system being created.
   */
  public open fun lustreConfiguration(`value`: LustreConfigurationProperty) {
    unwrap(this).setLustreConfiguration(`value`.let(LustreConfigurationProperty.Companion::unwrap))
  }

  /**
   * The Lustre configuration for the file system being created.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f3674dc04634b3a0bb3f33c1b76d7fc75e14b409710628bdbc9dd07fc02c6950")
  public open fun lustreConfiguration(`value`: LustreConfigurationProperty.Builder.() -> Unit): Unit
      = lustreConfiguration(LustreConfigurationProperty(`value`))

  /**
   * The ONTAP configuration properties of the FSx for ONTAP file system that you are creating.
   */
  public open fun ontapConfiguration(): Any? = unwrap(this).getOntapConfiguration()

  /**
   * The ONTAP configuration properties of the FSx for ONTAP file system that you are creating.
   */
  public open fun ontapConfiguration(`value`: IResolvable) {
    unwrap(this).setOntapConfiguration(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The ONTAP configuration properties of the FSx for ONTAP file system that you are creating.
   */
  public open fun ontapConfiguration(`value`: OntapConfigurationProperty) {
    unwrap(this).setOntapConfiguration(`value`.let(OntapConfigurationProperty.Companion::unwrap))
  }

  /**
   * The ONTAP configuration properties of the FSx for ONTAP file system that you are creating.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("96cdd10e0272dc9887ba907d5b421058290f17fb59ac25532dbb50dee66a83e7")
  public open fun ontapConfiguration(`value`: OntapConfigurationProperty.Builder.() -> Unit): Unit =
      ontapConfiguration(OntapConfigurationProperty(`value`))

  /**
   * The Amazon FSx for OpenZFS configuration properties for the file system that you are creating.
   */
  public open fun openZfsConfiguration(): Any? = unwrap(this).getOpenZfsConfiguration()

  /**
   * The Amazon FSx for OpenZFS configuration properties for the file system that you are creating.
   */
  public open fun openZfsConfiguration(`value`: IResolvable) {
    unwrap(this).setOpenZfsConfiguration(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The Amazon FSx for OpenZFS configuration properties for the file system that you are creating.
   */
  public open fun openZfsConfiguration(`value`: OpenZFSConfigurationProperty) {
    unwrap(this).setOpenZfsConfiguration(`value`.let(OpenZFSConfigurationProperty.Companion::unwrap))
  }

  /**
   * The Amazon FSx for OpenZFS configuration properties for the file system that you are creating.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("016365e3cb81303ddfc696920962edad0f979025ec1ab854e0a0e0a7bd61cda9")
  public open fun openZfsConfiguration(`value`: OpenZFSConfigurationProperty.Builder.() -> Unit):
      Unit = openZfsConfiguration(OpenZFSConfigurationProperty(`value`))

  /**
   * A list of IDs specifying the security groups to apply to all network interfaces created for
   * file system access.
   */
  public open fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
      emptyList()

  /**
   * A list of IDs specifying the security groups to apply to all network interfaces created for
   * file system access.
   */
  public open fun securityGroupIds(`value`: List<String>) {
    unwrap(this).setSecurityGroupIds(`value`)
  }

  /**
   * A list of IDs specifying the security groups to apply to all network interfaces created for
   * file system access.
   */
  public open fun securityGroupIds(vararg `value`: String): Unit =
      securityGroupIds(`value`.toList())

  /**
   * Sets the storage capacity of the file system that you're creating.
   */
  public open fun storageCapacity(): Number? = unwrap(this).getStorageCapacity()

  /**
   * Sets the storage capacity of the file system that you're creating.
   */
  public open fun storageCapacity(`value`: Number) {
    unwrap(this).setStorageCapacity(`value`)
  }

  /**
   * Sets the storage type for the file system that you're creating.
   *
   * Valid values are `SSD` and `HDD` .
   */
  public open fun storageType(): String? = unwrap(this).getStorageType()

  /**
   * Sets the storage type for the file system that you're creating.
   *
   * Valid values are `SSD` and `HDD` .
   */
  public open fun storageType(`value`: String) {
    unwrap(this).setStorageType(`value`)
  }

  /**
   * Specifies the IDs of the subnets that the file system will be accessible from.
   */
  public open fun subnetIds(): List<String> = unwrap(this).getSubnetIds()

  /**
   * Specifies the IDs of the subnets that the file system will be accessible from.
   */
  public open fun subnetIds(`value`: List<String>) {
    unwrap(this).setSubnetIds(`value`)
  }

  /**
   * Specifies the IDs of the subnets that the file system will be accessible from.
   */
  public open fun subnetIds(vararg `value`: String): Unit = subnetIds(`value`.toList())

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The tags to associate with the file system.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The tags to associate with the file system.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * The tags to associate with the file system.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * The configuration object for the Microsoft Windows file system you are creating.
   */
  public open fun windowsConfiguration(): Any? = unwrap(this).getWindowsConfiguration()

  /**
   * The configuration object for the Microsoft Windows file system you are creating.
   */
  public open fun windowsConfiguration(`value`: IResolvable) {
    unwrap(this).setWindowsConfiguration(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The configuration object for the Microsoft Windows file system you are creating.
   */
  public open fun windowsConfiguration(`value`: WindowsConfigurationProperty) {
    unwrap(this).setWindowsConfiguration(`value`.let(WindowsConfigurationProperty.Companion::unwrap))
  }

  /**
   * The configuration object for the Microsoft Windows file system you are creating.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("17ceb7592c7412f1800f62afd4f1d12cdfe3200011aedfb7d1ea9cd242161ca4")
  public open fun windowsConfiguration(`value`: WindowsConfigurationProperty.Builder.() -> Unit):
      Unit = windowsConfiguration(WindowsConfigurationProperty(`value`))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.fsx.CfnFileSystem].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The ID of the file system backup that you are using to create a file system.
     *
     * For more information, see
     * [CreateFileSystemFromBackup](https://docs.aws.amazon.com/fsx/latest/APIReference/API_CreateFileSystemFromBackup.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-filesystem.html#cfn-fsx-filesystem-backupid)
     * @param backupId The ID of the file system backup that you are using to create a file system. 
     */
    public fun backupId(backupId: String)

    /**
     * The type of Amazon FSx file system, which can be `LUSTRE` , `WINDOWS` , `ONTAP` , or
     * `OPENZFS` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-filesystem.html#cfn-fsx-filesystem-filesystemtype)
     * @param fileSystemType The type of Amazon FSx file system, which can be `LUSTRE` , `WINDOWS` ,
     * `ONTAP` , or `OPENZFS` . 
     */
    public fun fileSystemType(fileSystemType: String)

    /**
     * (Optional) For FSx for Lustre file systems, sets the Lustre version for the file system that
     * you're creating.
     *
     * Valid values are `2.10` , `2.12` , and `2.15` :
     *
     * * 2.10 is supported by the Scratch and Persistent_1 Lustre deployment types.
     * * 2.12 and 2.15 are supported by all Lustre deployment types. `2.12` or `2.15` is required
     * when setting FSx for Lustre `DeploymentType` to `PERSISTENT_2` .
     *
     * Default value = `2.10` , except when `DeploymentType` is set to `PERSISTENT_2` , then the
     * default is `2.12` .
     *
     *
     * If you set `FileSystemTypeVersion` to `2.10` for a `PERSISTENT_2` Lustre deployment type, the
     * `CreateFileSystem` operation fails.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-filesystem.html#cfn-fsx-filesystem-filesystemtypeversion)
     * @param fileSystemTypeVersion (Optional) For FSx for Lustre file systems, sets the Lustre
     * version for the file system that you're creating. 
     */
    public fun fileSystemTypeVersion(fileSystemTypeVersion: String)

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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-filesystem.html#cfn-fsx-filesystem-kmskeyid)
     * @param kmsKeyId The ID of the AWS Key Management Service ( AWS KMS ) key used to encrypt
     * Amazon FSx file system data. 
     */
    public fun kmsKeyId(kmsKeyId: String)

    /**
     * The Lustre configuration for the file system being created.
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
     * @param lustreConfiguration The Lustre configuration for the file system being created. 
     */
    public fun lustreConfiguration(lustreConfiguration: IResolvable)

    /**
     * The Lustre configuration for the file system being created.
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
     * @param lustreConfiguration The Lustre configuration for the file system being created. 
     */
    public fun lustreConfiguration(lustreConfiguration: LustreConfigurationProperty)

    /**
     * The Lustre configuration for the file system being created.
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
     * @param lustreConfiguration The Lustre configuration for the file system being created. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7ffb1848ab6306452bcbd16ffcb6ba2d5894d86e5251b5e929bf9e7aa0e10b9e")
    public
        fun lustreConfiguration(lustreConfiguration: LustreConfigurationProperty.Builder.() -> Unit)

    /**
     * The ONTAP configuration properties of the FSx for ONTAP file system that you are creating.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-filesystem.html#cfn-fsx-filesystem-ontapconfiguration)
     * @param ontapConfiguration The ONTAP configuration properties of the FSx for ONTAP file system
     * that you are creating. 
     */
    public fun ontapConfiguration(ontapConfiguration: IResolvable)

    /**
     * The ONTAP configuration properties of the FSx for ONTAP file system that you are creating.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-filesystem.html#cfn-fsx-filesystem-ontapconfiguration)
     * @param ontapConfiguration The ONTAP configuration properties of the FSx for ONTAP file system
     * that you are creating. 
     */
    public fun ontapConfiguration(ontapConfiguration: OntapConfigurationProperty)

    /**
     * The ONTAP configuration properties of the FSx for ONTAP file system that you are creating.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-filesystem.html#cfn-fsx-filesystem-ontapconfiguration)
     * @param ontapConfiguration The ONTAP configuration properties of the FSx for ONTAP file system
     * that you are creating. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bf84fd5c58c0ed36bb428bdaaa93c4e6ffeeb9e94edd4d4f2a34c8b0124b7068")
    public fun ontapConfiguration(ontapConfiguration: OntapConfigurationProperty.Builder.() -> Unit)

    /**
     * The Amazon FSx for OpenZFS configuration properties for the file system that you are
     * creating.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-filesystem.html#cfn-fsx-filesystem-openzfsconfiguration)
     * @param openZfsConfiguration The Amazon FSx for OpenZFS configuration properties for the file
     * system that you are creating. 
     */
    public fun openZfsConfiguration(openZfsConfiguration: IResolvable)

    /**
     * The Amazon FSx for OpenZFS configuration properties for the file system that you are
     * creating.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-filesystem.html#cfn-fsx-filesystem-openzfsconfiguration)
     * @param openZfsConfiguration The Amazon FSx for OpenZFS configuration properties for the file
     * system that you are creating. 
     */
    public fun openZfsConfiguration(openZfsConfiguration: OpenZFSConfigurationProperty)

    /**
     * The Amazon FSx for OpenZFS configuration properties for the file system that you are
     * creating.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-filesystem.html#cfn-fsx-filesystem-openzfsconfiguration)
     * @param openZfsConfiguration The Amazon FSx for OpenZFS configuration properties for the file
     * system that you are creating. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3d2a7f63461a36538cf88a3b8eaaacef125133a8bdbc5b8ac360598430d7a99b")
    public
        fun openZfsConfiguration(openZfsConfiguration: OpenZFSConfigurationProperty.Builder.() -> Unit)

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
     * @param securityGroupIds A list of IDs specifying the security groups to apply to all network
     * interfaces created for file system access. 
     */
    public fun securityGroupIds(securityGroupIds: List<String>)

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
     * @param securityGroupIds A list of IDs specifying the security groups to apply to all network
     * interfaces created for file system access. 
     */
    public fun securityGroupIds(vararg securityGroupIds: String)

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
     *
     * * For SSD storage, valid values are 32 GiB-65,536 GiB (64 TiB).
     * * For HDD storage, valid values are 2000 GiB-65,536 GiB (64 TiB).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-filesystem.html#cfn-fsx-filesystem-storagecapacity)
     * @param storageCapacity Sets the storage capacity of the file system that you're creating. 
     */
    public fun storageCapacity(storageCapacity: Number)

    /**
     * Sets the storage type for the file system that you're creating. Valid values are `SSD` and
     * `HDD` .
     *
     * * Set to `SSD` to use solid state drive storage. SSD is supported on all Windows, Lustre,
     * ONTAP, and OpenZFS deployment types.
     * * Set to `HDD` to use hard disk drive storage. HDD is supported on `SINGLE_AZ_2` and
     * `MULTI_AZ_1` Windows file system deployment types, and on `PERSISTENT_1` Lustre file system
     * deployment types.
     *
     * Default value is `SSD` . For more information, see [Storage type
     * options](https://docs.aws.amazon.com/fsx/latest/WindowsGuide/optimize-fsx-costs.html#storage-type-options)
     * in the *FSx for Windows File Server User Guide* and [Multiple storage
     * options](https://docs.aws.amazon.com/fsx/latest/LustreGuide/what-is.html#storage-options) in the
     * *FSx for Lustre User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-filesystem.html#cfn-fsx-filesystem-storagetype)
     * @param storageType Sets the storage type for the file system that you're creating. Valid
     * values are `SSD` and `HDD` . 
     */
    public fun storageType(storageType: String)

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
     * @param subnetIds Specifies the IDs of the subnets that the file system will be accessible
     * from. 
     */
    public fun subnetIds(subnetIds: List<String>)

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
     * @param subnetIds Specifies the IDs of the subnets that the file system will be accessible
     * from. 
     */
    public fun subnetIds(vararg subnetIds: String)

    /**
     * The tags to associate with the file system.
     *
     * For more information, see [Tagging your Amazon FSx
     * resources](https://docs.aws.amazon.com/fsx/latest/LustreGuide/tag-resources.html) in the *Amazon
     * FSx for Lustre User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-filesystem.html#cfn-fsx-filesystem-tags)
     * @param tags The tags to associate with the file system. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags to associate with the file system.
     *
     * For more information, see [Tagging your Amazon FSx
     * resources](https://docs.aws.amazon.com/fsx/latest/LustreGuide/tag-resources.html) in the *Amazon
     * FSx for Lustre User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-filesystem.html#cfn-fsx-filesystem-tags)
     * @param tags The tags to associate with the file system. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The configuration object for the Microsoft Windows file system you are creating.
     *
     * This value is required if `FileSystemType` is set to `WINDOWS` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-filesystem.html#cfn-fsx-filesystem-windowsconfiguration)
     * @param windowsConfiguration The configuration object for the Microsoft Windows file system
     * you are creating. 
     */
    public fun windowsConfiguration(windowsConfiguration: IResolvable)

    /**
     * The configuration object for the Microsoft Windows file system you are creating.
     *
     * This value is required if `FileSystemType` is set to `WINDOWS` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-filesystem.html#cfn-fsx-filesystem-windowsconfiguration)
     * @param windowsConfiguration The configuration object for the Microsoft Windows file system
     * you are creating. 
     */
    public fun windowsConfiguration(windowsConfiguration: WindowsConfigurationProperty)

    /**
     * The configuration object for the Microsoft Windows file system you are creating.
     *
     * This value is required if `FileSystemType` is set to `WINDOWS` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-filesystem.html#cfn-fsx-filesystem-windowsconfiguration)
     * @param windowsConfiguration The configuration object for the Microsoft Windows file system
     * you are creating. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ed77315dad931a284e8c8b5ebfa01303758a2f360f000b6381c2cf38716af285")
    public
        fun windowsConfiguration(windowsConfiguration: WindowsConfigurationProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.fsx.CfnFileSystem.Builder =
        software.amazon.awscdk.services.fsx.CfnFileSystem.Builder.create(scope, id)

    /**
     * The ID of the file system backup that you are using to create a file system.
     *
     * For more information, see
     * [CreateFileSystemFromBackup](https://docs.aws.amazon.com/fsx/latest/APIReference/API_CreateFileSystemFromBackup.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-filesystem.html#cfn-fsx-filesystem-backupid)
     * @param backupId The ID of the file system backup that you are using to create a file system. 
     */
    override fun backupId(backupId: String) {
      cdkBuilder.backupId(backupId)
    }

    /**
     * The type of Amazon FSx file system, which can be `LUSTRE` , `WINDOWS` , `ONTAP` , or
     * `OPENZFS` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-filesystem.html#cfn-fsx-filesystem-filesystemtype)
     * @param fileSystemType The type of Amazon FSx file system, which can be `LUSTRE` , `WINDOWS` ,
     * `ONTAP` , or `OPENZFS` . 
     */
    override fun fileSystemType(fileSystemType: String) {
      cdkBuilder.fileSystemType(fileSystemType)
    }

    /**
     * (Optional) For FSx for Lustre file systems, sets the Lustre version for the file system that
     * you're creating.
     *
     * Valid values are `2.10` , `2.12` , and `2.15` :
     *
     * * 2.10 is supported by the Scratch and Persistent_1 Lustre deployment types.
     * * 2.12 and 2.15 are supported by all Lustre deployment types. `2.12` or `2.15` is required
     * when setting FSx for Lustre `DeploymentType` to `PERSISTENT_2` .
     *
     * Default value = `2.10` , except when `DeploymentType` is set to `PERSISTENT_2` , then the
     * default is `2.12` .
     *
     *
     * If you set `FileSystemTypeVersion` to `2.10` for a `PERSISTENT_2` Lustre deployment type, the
     * `CreateFileSystem` operation fails.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-filesystem.html#cfn-fsx-filesystem-filesystemtypeversion)
     * @param fileSystemTypeVersion (Optional) For FSx for Lustre file systems, sets the Lustre
     * version for the file system that you're creating. 
     */
    override fun fileSystemTypeVersion(fileSystemTypeVersion: String) {
      cdkBuilder.fileSystemTypeVersion(fileSystemTypeVersion)
    }

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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-filesystem.html#cfn-fsx-filesystem-kmskeyid)
     * @param kmsKeyId The ID of the AWS Key Management Service ( AWS KMS ) key used to encrypt
     * Amazon FSx file system data. 
     */
    override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    /**
     * The Lustre configuration for the file system being created.
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
     * @param lustreConfiguration The Lustre configuration for the file system being created. 
     */
    override fun lustreConfiguration(lustreConfiguration: IResolvable) {
      cdkBuilder.lustreConfiguration(lustreConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * The Lustre configuration for the file system being created.
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
     * @param lustreConfiguration The Lustre configuration for the file system being created. 
     */
    override fun lustreConfiguration(lustreConfiguration: LustreConfigurationProperty) {
      cdkBuilder.lustreConfiguration(lustreConfiguration.let(LustreConfigurationProperty.Companion::unwrap))
    }

    /**
     * The Lustre configuration for the file system being created.
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
     * @param lustreConfiguration The Lustre configuration for the file system being created. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7ffb1848ab6306452bcbd16ffcb6ba2d5894d86e5251b5e929bf9e7aa0e10b9e")
    override
        fun lustreConfiguration(lustreConfiguration: LustreConfigurationProperty.Builder.() -> Unit):
        Unit = lustreConfiguration(LustreConfigurationProperty(lustreConfiguration))

    /**
     * The ONTAP configuration properties of the FSx for ONTAP file system that you are creating.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-filesystem.html#cfn-fsx-filesystem-ontapconfiguration)
     * @param ontapConfiguration The ONTAP configuration properties of the FSx for ONTAP file system
     * that you are creating. 
     */
    override fun ontapConfiguration(ontapConfiguration: IResolvable) {
      cdkBuilder.ontapConfiguration(ontapConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * The ONTAP configuration properties of the FSx for ONTAP file system that you are creating.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-filesystem.html#cfn-fsx-filesystem-ontapconfiguration)
     * @param ontapConfiguration The ONTAP configuration properties of the FSx for ONTAP file system
     * that you are creating. 
     */
    override fun ontapConfiguration(ontapConfiguration: OntapConfigurationProperty) {
      cdkBuilder.ontapConfiguration(ontapConfiguration.let(OntapConfigurationProperty.Companion::unwrap))
    }

    /**
     * The ONTAP configuration properties of the FSx for ONTAP file system that you are creating.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-filesystem.html#cfn-fsx-filesystem-ontapconfiguration)
     * @param ontapConfiguration The ONTAP configuration properties of the FSx for ONTAP file system
     * that you are creating. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bf84fd5c58c0ed36bb428bdaaa93c4e6ffeeb9e94edd4d4f2a34c8b0124b7068")
    override
        fun ontapConfiguration(ontapConfiguration: OntapConfigurationProperty.Builder.() -> Unit):
        Unit = ontapConfiguration(OntapConfigurationProperty(ontapConfiguration))

    /**
     * The Amazon FSx for OpenZFS configuration properties for the file system that you are
     * creating.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-filesystem.html#cfn-fsx-filesystem-openzfsconfiguration)
     * @param openZfsConfiguration The Amazon FSx for OpenZFS configuration properties for the file
     * system that you are creating. 
     */
    override fun openZfsConfiguration(openZfsConfiguration: IResolvable) {
      cdkBuilder.openZfsConfiguration(openZfsConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * The Amazon FSx for OpenZFS configuration properties for the file system that you are
     * creating.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-filesystem.html#cfn-fsx-filesystem-openzfsconfiguration)
     * @param openZfsConfiguration The Amazon FSx for OpenZFS configuration properties for the file
     * system that you are creating. 
     */
    override fun openZfsConfiguration(openZfsConfiguration: OpenZFSConfigurationProperty) {
      cdkBuilder.openZfsConfiguration(openZfsConfiguration.let(OpenZFSConfigurationProperty.Companion::unwrap))
    }

    /**
     * The Amazon FSx for OpenZFS configuration properties for the file system that you are
     * creating.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-filesystem.html#cfn-fsx-filesystem-openzfsconfiguration)
     * @param openZfsConfiguration The Amazon FSx for OpenZFS configuration properties for the file
     * system that you are creating. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3d2a7f63461a36538cf88a3b8eaaacef125133a8bdbc5b8ac360598430d7a99b")
    override
        fun openZfsConfiguration(openZfsConfiguration: OpenZFSConfigurationProperty.Builder.() -> Unit):
        Unit = openZfsConfiguration(OpenZFSConfigurationProperty(openZfsConfiguration))

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
     * @param securityGroupIds A list of IDs specifying the security groups to apply to all network
     * interfaces created for file system access. 
     */
    override fun securityGroupIds(securityGroupIds: List<String>) {
      cdkBuilder.securityGroupIds(securityGroupIds)
    }

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
     * @param securityGroupIds A list of IDs specifying the security groups to apply to all network
     * interfaces created for file system access. 
     */
    override fun securityGroupIds(vararg securityGroupIds: String): Unit =
        securityGroupIds(securityGroupIds.toList())

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
     *
     * * For SSD storage, valid values are 32 GiB-65,536 GiB (64 TiB).
     * * For HDD storage, valid values are 2000 GiB-65,536 GiB (64 TiB).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-filesystem.html#cfn-fsx-filesystem-storagecapacity)
     * @param storageCapacity Sets the storage capacity of the file system that you're creating. 
     */
    override fun storageCapacity(storageCapacity: Number) {
      cdkBuilder.storageCapacity(storageCapacity)
    }

    /**
     * Sets the storage type for the file system that you're creating. Valid values are `SSD` and
     * `HDD` .
     *
     * * Set to `SSD` to use solid state drive storage. SSD is supported on all Windows, Lustre,
     * ONTAP, and OpenZFS deployment types.
     * * Set to `HDD` to use hard disk drive storage. HDD is supported on `SINGLE_AZ_2` and
     * `MULTI_AZ_1` Windows file system deployment types, and on `PERSISTENT_1` Lustre file system
     * deployment types.
     *
     * Default value is `SSD` . For more information, see [Storage type
     * options](https://docs.aws.amazon.com/fsx/latest/WindowsGuide/optimize-fsx-costs.html#storage-type-options)
     * in the *FSx for Windows File Server User Guide* and [Multiple storage
     * options](https://docs.aws.amazon.com/fsx/latest/LustreGuide/what-is.html#storage-options) in the
     * *FSx for Lustre User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-filesystem.html#cfn-fsx-filesystem-storagetype)
     * @param storageType Sets the storage type for the file system that you're creating. Valid
     * values are `SSD` and `HDD` . 
     */
    override fun storageType(storageType: String) {
      cdkBuilder.storageType(storageType)
    }

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
     * @param subnetIds Specifies the IDs of the subnets that the file system will be accessible
     * from. 
     */
    override fun subnetIds(subnetIds: List<String>) {
      cdkBuilder.subnetIds(subnetIds)
    }

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
     * @param subnetIds Specifies the IDs of the subnets that the file system will be accessible
     * from. 
     */
    override fun subnetIds(vararg subnetIds: String): Unit = subnetIds(subnetIds.toList())

    /**
     * The tags to associate with the file system.
     *
     * For more information, see [Tagging your Amazon FSx
     * resources](https://docs.aws.amazon.com/fsx/latest/LustreGuide/tag-resources.html) in the *Amazon
     * FSx for Lustre User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-filesystem.html#cfn-fsx-filesystem-tags)
     * @param tags The tags to associate with the file system. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * The tags to associate with the file system.
     *
     * For more information, see [Tagging your Amazon FSx
     * resources](https://docs.aws.amazon.com/fsx/latest/LustreGuide/tag-resources.html) in the *Amazon
     * FSx for Lustre User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-filesystem.html#cfn-fsx-filesystem-tags)
     * @param tags The tags to associate with the file system. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The configuration object for the Microsoft Windows file system you are creating.
     *
     * This value is required if `FileSystemType` is set to `WINDOWS` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-filesystem.html#cfn-fsx-filesystem-windowsconfiguration)
     * @param windowsConfiguration The configuration object for the Microsoft Windows file system
     * you are creating. 
     */
    override fun windowsConfiguration(windowsConfiguration: IResolvable) {
      cdkBuilder.windowsConfiguration(windowsConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * The configuration object for the Microsoft Windows file system you are creating.
     *
     * This value is required if `FileSystemType` is set to `WINDOWS` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-filesystem.html#cfn-fsx-filesystem-windowsconfiguration)
     * @param windowsConfiguration The configuration object for the Microsoft Windows file system
     * you are creating. 
     */
    override fun windowsConfiguration(windowsConfiguration: WindowsConfigurationProperty) {
      cdkBuilder.windowsConfiguration(windowsConfiguration.let(WindowsConfigurationProperty.Companion::unwrap))
    }

    /**
     * The configuration object for the Microsoft Windows file system you are creating.
     *
     * This value is required if `FileSystemType` is set to `WINDOWS` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-filesystem.html#cfn-fsx-filesystem-windowsconfiguration)
     * @param windowsConfiguration The configuration object for the Microsoft Windows file system
     * you are creating. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ed77315dad931a284e8c8b5ebfa01303758a2f360f000b6381c2cf38716af285")
    override
        fun windowsConfiguration(windowsConfiguration: WindowsConfigurationProperty.Builder.() -> Unit):
        Unit = windowsConfiguration(WindowsConfigurationProperty(windowsConfiguration))

    public fun build(): software.amazon.awscdk.services.fsx.CfnFileSystem = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.fsx.CfnFileSystem.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnFileSystem {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnFileSystem(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.fsx.CfnFileSystem): CfnFileSystem =
        CfnFileSystem(cdkObject)

    internal fun unwrap(wrapped: CfnFileSystem): software.amazon.awscdk.services.fsx.CfnFileSystem =
        wrapped.cdkObject as software.amazon.awscdk.services.fsx.CfnFileSystem
  }

  /**
   * The configuration that Amazon FSx for Windows File Server uses to audit and log user accesses
   * of files, folders, and file shares on the Amazon FSx for Windows File Server file system.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.fsx.*;
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
  public interface AuditLogConfigurationProperty {
    /**
     * The Amazon Resource Name (ARN) for the destination of the audit logs.
     *
     * The destination can be any Amazon CloudWatch Logs log group ARN or Amazon Kinesis Data
     * Firehose delivery stream ARN.
     *
     * The name of the Amazon CloudWatch Logs log group must begin with the `/aws/fsx` prefix. The
     * name of the Amazon Kinesis Data Firehose delivery stream must begin with the `aws-fsx` prefix.
     *
     * The destination ARN (either CloudWatch Logs log group or Kinesis Data Firehose delivery
     * stream) must be in the same AWS partition, AWS Region , and AWS account as your Amazon FSx file
     * system.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-auditlogconfiguration.html#cfn-fsx-filesystem-auditlogconfiguration-auditlogdestination)
     */
    public fun auditLogDestination(): String? = unwrap(this).getAuditLogDestination()

    /**
     * Sets which attempt type is logged by Amazon FSx for file and folder accesses.
     *
     * * `SUCCESS_ONLY` - only successful attempts to access files or folders are logged.
     * * `FAILURE_ONLY` - only failed attempts to access files or folders are logged.
     * * `SUCCESS_AND_FAILURE` - both successful attempts and failed attempts to access files or
     * folders are logged.
     * * `DISABLED` - access auditing of files and folders is turned off.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-auditlogconfiguration.html#cfn-fsx-filesystem-auditlogconfiguration-fileaccessauditloglevel)
     */
    public fun fileAccessAuditLogLevel(): String

    /**
     * Sets which attempt type is logged by Amazon FSx for file share accesses.
     *
     * * `SUCCESS_ONLY` - only successful attempts to access file shares are logged.
     * * `FAILURE_ONLY` - only failed attempts to access file shares are logged.
     * * `SUCCESS_AND_FAILURE` - both successful attempts and failed attempts to access file shares
     * are logged.
     * * `DISABLED` - access auditing of file shares is turned off.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-auditlogconfiguration.html#cfn-fsx-filesystem-auditlogconfiguration-fileshareaccessauditloglevel)
     */
    public fun fileShareAccessAuditLogLevel(): String

    /**
     * A builder for [AuditLogConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param auditLogDestination The Amazon Resource Name (ARN) for the destination of the audit
       * logs.
       * The destination can be any Amazon CloudWatch Logs log group ARN or Amazon Kinesis Data
       * Firehose delivery stream ARN.
       *
       * The name of the Amazon CloudWatch Logs log group must begin with the `/aws/fsx` prefix. The
       * name of the Amazon Kinesis Data Firehose delivery stream must begin with the `aws-fsx` prefix.
       *
       * The destination ARN (either CloudWatch Logs log group or Kinesis Data Firehose delivery
       * stream) must be in the same AWS partition, AWS Region , and AWS account as your Amazon FSx
       * file system.
       */
      public fun auditLogDestination(auditLogDestination: String)

      /**
       * @param fileAccessAuditLogLevel Sets which attempt type is logged by Amazon FSx for file and
       * folder accesses. 
       * * `SUCCESS_ONLY` - only successful attempts to access files or folders are logged.
       * * `FAILURE_ONLY` - only failed attempts to access files or folders are logged.
       * * `SUCCESS_AND_FAILURE` - both successful attempts and failed attempts to access files or
       * folders are logged.
       * * `DISABLED` - access auditing of files and folders is turned off.
       */
      public fun fileAccessAuditLogLevel(fileAccessAuditLogLevel: String)

      /**
       * @param fileShareAccessAuditLogLevel Sets which attempt type is logged by Amazon FSx for
       * file share accesses. 
       * * `SUCCESS_ONLY` - only successful attempts to access file shares are logged.
       * * `FAILURE_ONLY` - only failed attempts to access file shares are logged.
       * * `SUCCESS_AND_FAILURE` - both successful attempts and failed attempts to access file
       * shares are logged.
       * * `DISABLED` - access auditing of file shares is turned off.
       */
      public fun fileShareAccessAuditLogLevel(fileShareAccessAuditLogLevel: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.fsx.CfnFileSystem.AuditLogConfigurationProperty.Builder =
          software.amazon.awscdk.services.fsx.CfnFileSystem.AuditLogConfigurationProperty.builder()

      /**
       * @param auditLogDestination The Amazon Resource Name (ARN) for the destination of the audit
       * logs.
       * The destination can be any Amazon CloudWatch Logs log group ARN or Amazon Kinesis Data
       * Firehose delivery stream ARN.
       *
       * The name of the Amazon CloudWatch Logs log group must begin with the `/aws/fsx` prefix. The
       * name of the Amazon Kinesis Data Firehose delivery stream must begin with the `aws-fsx` prefix.
       *
       * The destination ARN (either CloudWatch Logs log group or Kinesis Data Firehose delivery
       * stream) must be in the same AWS partition, AWS Region , and AWS account as your Amazon FSx
       * file system.
       */
      override fun auditLogDestination(auditLogDestination: String) {
        cdkBuilder.auditLogDestination(auditLogDestination)
      }

      /**
       * @param fileAccessAuditLogLevel Sets which attempt type is logged by Amazon FSx for file and
       * folder accesses. 
       * * `SUCCESS_ONLY` - only successful attempts to access files or folders are logged.
       * * `FAILURE_ONLY` - only failed attempts to access files or folders are logged.
       * * `SUCCESS_AND_FAILURE` - both successful attempts and failed attempts to access files or
       * folders are logged.
       * * `DISABLED` - access auditing of files and folders is turned off.
       */
      override fun fileAccessAuditLogLevel(fileAccessAuditLogLevel: String) {
        cdkBuilder.fileAccessAuditLogLevel(fileAccessAuditLogLevel)
      }

      /**
       * @param fileShareAccessAuditLogLevel Sets which attempt type is logged by Amazon FSx for
       * file share accesses. 
       * * `SUCCESS_ONLY` - only successful attempts to access file shares are logged.
       * * `FAILURE_ONLY` - only failed attempts to access file shares are logged.
       * * `SUCCESS_AND_FAILURE` - both successful attempts and failed attempts to access file
       * shares are logged.
       * * `DISABLED` - access auditing of file shares is turned off.
       */
      override fun fileShareAccessAuditLogLevel(fileShareAccessAuditLogLevel: String) {
        cdkBuilder.fileShareAccessAuditLogLevel(fileShareAccessAuditLogLevel)
      }

      public fun build():
          software.amazon.awscdk.services.fsx.CfnFileSystem.AuditLogConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.fsx.CfnFileSystem.AuditLogConfigurationProperty,
    ) : CdkObject(cdkObject), AuditLogConfigurationProperty {
      /**
       * The Amazon Resource Name (ARN) for the destination of the audit logs.
       *
       * The destination can be any Amazon CloudWatch Logs log group ARN or Amazon Kinesis Data
       * Firehose delivery stream ARN.
       *
       * The name of the Amazon CloudWatch Logs log group must begin with the `/aws/fsx` prefix. The
       * name of the Amazon Kinesis Data Firehose delivery stream must begin with the `aws-fsx` prefix.
       *
       * The destination ARN (either CloudWatch Logs log group or Kinesis Data Firehose delivery
       * stream) must be in the same AWS partition, AWS Region , and AWS account as your Amazon FSx
       * file system.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-auditlogconfiguration.html#cfn-fsx-filesystem-auditlogconfiguration-auditlogdestination)
       */
      override fun auditLogDestination(): String? = unwrap(this).getAuditLogDestination()

      /**
       * Sets which attempt type is logged by Amazon FSx for file and folder accesses.
       *
       * * `SUCCESS_ONLY` - only successful attempts to access files or folders are logged.
       * * `FAILURE_ONLY` - only failed attempts to access files or folders are logged.
       * * `SUCCESS_AND_FAILURE` - both successful attempts and failed attempts to access files or
       * folders are logged.
       * * `DISABLED` - access auditing of files and folders is turned off.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-auditlogconfiguration.html#cfn-fsx-filesystem-auditlogconfiguration-fileaccessauditloglevel)
       */
      override fun fileAccessAuditLogLevel(): String = unwrap(this).getFileAccessAuditLogLevel()

      /**
       * Sets which attempt type is logged by Amazon FSx for file share accesses.
       *
       * * `SUCCESS_ONLY` - only successful attempts to access file shares are logged.
       * * `FAILURE_ONLY` - only failed attempts to access file shares are logged.
       * * `SUCCESS_AND_FAILURE` - both successful attempts and failed attempts to access file
       * shares are logged.
       * * `DISABLED` - access auditing of file shares is turned off.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-auditlogconfiguration.html#cfn-fsx-filesystem-auditlogconfiguration-fileshareaccessauditloglevel)
       */
      override fun fileShareAccessAuditLogLevel(): String =
          unwrap(this).getFileShareAccessAuditLogLevel()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AuditLogConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.fsx.CfnFileSystem.AuditLogConfigurationProperty):
          AuditLogConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AuditLogConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AuditLogConfigurationProperty):
          software.amazon.awscdk.services.fsx.CfnFileSystem.AuditLogConfigurationProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.fsx.CfnFileSystem.AuditLogConfigurationProperty
    }
  }

  /**
   * Specifies who can mount an OpenZFS file system and the options available while mounting the
   * file system.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.fsx.*;
   * ClientConfigurationsProperty clientConfigurationsProperty =
   * ClientConfigurationsProperty.builder()
   * .clients("clients")
   * .options(List.of("options"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-clientconfigurations.html)
   */
  public interface ClientConfigurationsProperty {
    /**
     * A value that specifies who can mount the file system.
     *
     * You can provide a wildcard character ( `*` ), an IP address ( `0.0.0.0` ), or a CIDR address
     * ( `192.0.2.0/24` ). By default, Amazon FSx uses the wildcard character when specifying the
     * client.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-clientconfigurations.html#cfn-fsx-filesystem-clientconfigurations-clients)
     */
    public fun clients(): String? = unwrap(this).getClients()

    /**
     * The options to use when mounting the file system.
     *
     * For a list of options that you can use with Network File System (NFS), see the [exports(5) -
     * Linux man page](https://docs.aws.amazon.com/https://linux.die.net/man/5/exports) . When choosing
     * your options, consider the following:
     *
     * * `crossmnt` is used by default. If you don't specify `crossmnt` when changing the client
     * configuration, you won't be able to see or access snapshots in your file system's snapshot
     * directory.
     * * `sync` is used by default. If you instead specify `async` , the system acknowledges writes
     * before writing to disk. If the system crashes before the writes are finished, you lose the
     * unwritten data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-clientconfigurations.html#cfn-fsx-filesystem-clientconfigurations-options)
     */
    public fun options(): List<String> = unwrap(this).getOptions() ?: emptyList()

    /**
     * A builder for [ClientConfigurationsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param clients A value that specifies who can mount the file system.
       * You can provide a wildcard character ( `*` ), an IP address ( `0.0.0.0` ), or a CIDR
       * address ( `192.0.2.0/24` ). By default, Amazon FSx uses the wildcard character when specifying
       * the client.
       */
      public fun clients(clients: String)

      /**
       * @param options The options to use when mounting the file system.
       * For a list of options that you can use with Network File System (NFS), see the
       * [exports(5) - Linux man page](https://docs.aws.amazon.com/https://linux.die.net/man/5/exports)
       * . When choosing your options, consider the following:
       *
       * * `crossmnt` is used by default. If you don't specify `crossmnt` when changing the client
       * configuration, you won't be able to see or access snapshots in your file system's snapshot
       * directory.
       * * `sync` is used by default. If you instead specify `async` , the system acknowledges
       * writes before writing to disk. If the system crashes before the writes are finished, you lose
       * the unwritten data.
       */
      public fun options(options: List<String>)

      /**
       * @param options The options to use when mounting the file system.
       * For a list of options that you can use with Network File System (NFS), see the
       * [exports(5) - Linux man page](https://docs.aws.amazon.com/https://linux.die.net/man/5/exports)
       * . When choosing your options, consider the following:
       *
       * * `crossmnt` is used by default. If you don't specify `crossmnt` when changing the client
       * configuration, you won't be able to see or access snapshots in your file system's snapshot
       * directory.
       * * `sync` is used by default. If you instead specify `async` , the system acknowledges
       * writes before writing to disk. If the system crashes before the writes are finished, you lose
       * the unwritten data.
       */
      public fun options(vararg options: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.fsx.CfnFileSystem.ClientConfigurationsProperty.Builder =
          software.amazon.awscdk.services.fsx.CfnFileSystem.ClientConfigurationsProperty.builder()

      /**
       * @param clients A value that specifies who can mount the file system.
       * You can provide a wildcard character ( `*` ), an IP address ( `0.0.0.0` ), or a CIDR
       * address ( `192.0.2.0/24` ). By default, Amazon FSx uses the wildcard character when specifying
       * the client.
       */
      override fun clients(clients: String) {
        cdkBuilder.clients(clients)
      }

      /**
       * @param options The options to use when mounting the file system.
       * For a list of options that you can use with Network File System (NFS), see the
       * [exports(5) - Linux man page](https://docs.aws.amazon.com/https://linux.die.net/man/5/exports)
       * . When choosing your options, consider the following:
       *
       * * `crossmnt` is used by default. If you don't specify `crossmnt` when changing the client
       * configuration, you won't be able to see or access snapshots in your file system's snapshot
       * directory.
       * * `sync` is used by default. If you instead specify `async` , the system acknowledges
       * writes before writing to disk. If the system crashes before the writes are finished, you lose
       * the unwritten data.
       */
      override fun options(options: List<String>) {
        cdkBuilder.options(options)
      }

      /**
       * @param options The options to use when mounting the file system.
       * For a list of options that you can use with Network File System (NFS), see the
       * [exports(5) - Linux man page](https://docs.aws.amazon.com/https://linux.die.net/man/5/exports)
       * . When choosing your options, consider the following:
       *
       * * `crossmnt` is used by default. If you don't specify `crossmnt` when changing the client
       * configuration, you won't be able to see or access snapshots in your file system's snapshot
       * directory.
       * * `sync` is used by default. If you instead specify `async` , the system acknowledges
       * writes before writing to disk. If the system crashes before the writes are finished, you lose
       * the unwritten data.
       */
      override fun options(vararg options: String): Unit = options(options.toList())

      public fun build():
          software.amazon.awscdk.services.fsx.CfnFileSystem.ClientConfigurationsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.fsx.CfnFileSystem.ClientConfigurationsProperty,
    ) : CdkObject(cdkObject), ClientConfigurationsProperty {
      /**
       * A value that specifies who can mount the file system.
       *
       * You can provide a wildcard character ( `*` ), an IP address ( `0.0.0.0` ), or a CIDR
       * address ( `192.0.2.0/24` ). By default, Amazon FSx uses the wildcard character when specifying
       * the client.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-clientconfigurations.html#cfn-fsx-filesystem-clientconfigurations-clients)
       */
      override fun clients(): String? = unwrap(this).getClients()

      /**
       * The options to use when mounting the file system.
       *
       * For a list of options that you can use with Network File System (NFS), see the
       * [exports(5) - Linux man page](https://docs.aws.amazon.com/https://linux.die.net/man/5/exports)
       * . When choosing your options, consider the following:
       *
       * * `crossmnt` is used by default. If you don't specify `crossmnt` when changing the client
       * configuration, you won't be able to see or access snapshots in your file system's snapshot
       * directory.
       * * `sync` is used by default. If you instead specify `async` , the system acknowledges
       * writes before writing to disk. If the system crashes before the writes are finished, you lose
       * the unwritten data.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-clientconfigurations.html#cfn-fsx-filesystem-clientconfigurations-options)
       */
      override fun options(): List<String> = unwrap(this).getOptions() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ClientConfigurationsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.fsx.CfnFileSystem.ClientConfigurationsProperty):
          ClientConfigurationsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ClientConfigurationsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ClientConfigurationsProperty):
          software.amazon.awscdk.services.fsx.CfnFileSystem.ClientConfigurationsProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.fsx.CfnFileSystem.ClientConfigurationsProperty
    }
  }

  /**
   * The SSD IOPS (input/output operations per second) configuration for an Amazon FSx for NetApp
   * ONTAP, Amazon FSx for Windows File Server, or FSx for OpenZFS file system.
   *
   * By default, Amazon FSx automatically provisions 3 IOPS per GB of storage capacity. You can
   * provision additional IOPS per GB of storage. The configuration consists of the total number of
   * provisioned SSD IOPS and how it is was provisioned, or the mode (by the customer or by Amazon
   * FSx).
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.fsx.*;
   * DiskIopsConfigurationProperty diskIopsConfigurationProperty =
   * DiskIopsConfigurationProperty.builder()
   * .iops(123)
   * .mode("mode")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-diskiopsconfiguration.html)
   */
  public interface DiskIopsConfigurationProperty {
    /**
     * The total number of SSD IOPS provisioned for the file system.
     *
     * The minimum and maximum values for this property depend on the value of `HAPairs` and
     * `StorageCapacity` . The minimum value is calculated as `StorageCapacity` * 3 * `HAPairs` (3 IOPS
     * per GB of `StorageCapacity` ). The maximum value is calculated as 200,000 * `HAPairs` .
     *
     * Amazon FSx responds with an HTTP status code 400 (Bad Request) if the value of `Iops` is
     * outside of the minimum or maximum values.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-diskiopsconfiguration.html#cfn-fsx-filesystem-diskiopsconfiguration-iops)
     */
    public fun iops(): Number? = unwrap(this).getIops()

    /**
     * Specifies whether the file system is using the `AUTOMATIC` setting of SSD IOPS of 3 IOPS per
     * GB of storage capacity, or if it using a `USER_PROVISIONED` value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-diskiopsconfiguration.html#cfn-fsx-filesystem-diskiopsconfiguration-mode)
     */
    public fun mode(): String? = unwrap(this).getMode()

    /**
     * A builder for [DiskIopsConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param iops The total number of SSD IOPS provisioned for the file system.
       * The minimum and maximum values for this property depend on the value of `HAPairs` and
       * `StorageCapacity` . The minimum value is calculated as `StorageCapacity` * 3 * `HAPairs` (3
       * IOPS per GB of `StorageCapacity` ). The maximum value is calculated as 200,000 * `HAPairs` .
       *
       * Amazon FSx responds with an HTTP status code 400 (Bad Request) if the value of `Iops` is
       * outside of the minimum or maximum values.
       */
      public fun iops(iops: Number)

      /**
       * @param mode Specifies whether the file system is using the `AUTOMATIC` setting of SSD IOPS
       * of 3 IOPS per GB of storage capacity, or if it using a `USER_PROVISIONED` value.
       */
      public fun mode(mode: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.fsx.CfnFileSystem.DiskIopsConfigurationProperty.Builder =
          software.amazon.awscdk.services.fsx.CfnFileSystem.DiskIopsConfigurationProperty.builder()

      /**
       * @param iops The total number of SSD IOPS provisioned for the file system.
       * The minimum and maximum values for this property depend on the value of `HAPairs` and
       * `StorageCapacity` . The minimum value is calculated as `StorageCapacity` * 3 * `HAPairs` (3
       * IOPS per GB of `StorageCapacity` ). The maximum value is calculated as 200,000 * `HAPairs` .
       *
       * Amazon FSx responds with an HTTP status code 400 (Bad Request) if the value of `Iops` is
       * outside of the minimum or maximum values.
       */
      override fun iops(iops: Number) {
        cdkBuilder.iops(iops)
      }

      /**
       * @param mode Specifies whether the file system is using the `AUTOMATIC` setting of SSD IOPS
       * of 3 IOPS per GB of storage capacity, or if it using a `USER_PROVISIONED` value.
       */
      override fun mode(mode: String) {
        cdkBuilder.mode(mode)
      }

      public fun build():
          software.amazon.awscdk.services.fsx.CfnFileSystem.DiskIopsConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.fsx.CfnFileSystem.DiskIopsConfigurationProperty,
    ) : CdkObject(cdkObject), DiskIopsConfigurationProperty {
      /**
       * The total number of SSD IOPS provisioned for the file system.
       *
       * The minimum and maximum values for this property depend on the value of `HAPairs` and
       * `StorageCapacity` . The minimum value is calculated as `StorageCapacity` * 3 * `HAPairs` (3
       * IOPS per GB of `StorageCapacity` ). The maximum value is calculated as 200,000 * `HAPairs` .
       *
       * Amazon FSx responds with an HTTP status code 400 (Bad Request) if the value of `Iops` is
       * outside of the minimum or maximum values.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-diskiopsconfiguration.html#cfn-fsx-filesystem-diskiopsconfiguration-iops)
       */
      override fun iops(): Number? = unwrap(this).getIops()

      /**
       * Specifies whether the file system is using the `AUTOMATIC` setting of SSD IOPS of 3 IOPS
       * per GB of storage capacity, or if it using a `USER_PROVISIONED` value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-diskiopsconfiguration.html#cfn-fsx-filesystem-diskiopsconfiguration-mode)
       */
      override fun mode(): String? = unwrap(this).getMode()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DiskIopsConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.fsx.CfnFileSystem.DiskIopsConfigurationProperty):
          DiskIopsConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          DiskIopsConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DiskIopsConfigurationProperty):
          software.amazon.awscdk.services.fsx.CfnFileSystem.DiskIopsConfigurationProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.fsx.CfnFileSystem.DiskIopsConfigurationProperty
    }
  }

  /**
   * The configuration for the Amazon FSx for Lustre file system.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.fsx.*;
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
  public interface LustreConfigurationProperty {
    /**
     * (Optional) When you create your file system, your existing S3 objects appear as file and
     * directory listings.
     *
     * Use this property to choose how Amazon FSx keeps your file and directory listings up to date
     * as you add or modify objects in your linked S3 bucket. `AutoImportPolicy` can have the following
     * values:
     *
     * * `NONE` - (Default) AutoImport is off. Amazon FSx only updates file and directory listings
     * from the linked S3 bucket when the file system is created. FSx does not update file and
     * directory listings for any new or changed objects after choosing this option.
     * * `NEW` - AutoImport is on. Amazon FSx automatically imports directory listings of any new
     * objects added to the linked S3 bucket that do not currently exist in the FSx file system.
     * * `NEW_CHANGED` - AutoImport is on. Amazon FSx automatically imports file and directory
     * listings of any new objects added to the S3 bucket and any existing objects that are changed in
     * the S3 bucket after you choose this option.
     * * `NEW_CHANGED_DELETED` - AutoImport is on. Amazon FSx automatically imports file and
     * directory listings of any new objects added to the S3 bucket, any existing objects that are
     * changed in the S3 bucket, and any objects that were deleted in the S3 bucket.
     *
     * For more information, see [Automatically import updates from your S3
     * bucket](https://docs.aws.amazon.com/fsx/latest/LustreGuide/autoimport-data-repo.html) .
     *
     *
     * This parameter is not supported for Lustre file systems with a data repository association.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-lustreconfiguration.html#cfn-fsx-filesystem-lustreconfiguration-autoimportpolicy)
     */
    public fun autoImportPolicy(): String? = unwrap(this).getAutoImportPolicy()

    /**
     * The number of days to retain automatic backups.
     *
     * Setting this property to `0` disables automatic backups. You can retain automatic backups for
     * a maximum of 90 days. The default is `0` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-lustreconfiguration.html#cfn-fsx-filesystem-lustreconfiguration-automaticbackupretentiondays)
     */
    public fun automaticBackupRetentionDays(): Number? =
        unwrap(this).getAutomaticBackupRetentionDays()

    /**
     * (Optional) Not available for use with file systems that are linked to a data repository.
     *
     * A boolean flag indicating whether tags for the file system should be copied to backups. The
     * default value is false. If `CopyTagsToBackups` is set to true, all file system tags are copied
     * to all automatic and user-initiated backups when the user doesn't specify any backup-specific
     * tags. If `CopyTagsToBackups` is set to true and you specify one or more backup tags, only the
     * specified tags are copied to backups. If you specify one or more tags when creating a
     * user-initiated backup, no tags are copied from the file system, regardless of this value.
     *
     * (Default = `false` )
     *
     * For more information, see [Working with
     * backups](https://docs.aws.amazon.com/fsx/latest/LustreGuide/using-backups-fsx.html) in the
     * *Amazon FSx for Lustre User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-lustreconfiguration.html#cfn-fsx-filesystem-lustreconfiguration-copytagstobackups)
     */
    public fun copyTagsToBackups(): Any? = unwrap(this).getCopyTagsToBackups()

    /**
     * A recurring daily time, in the format `HH:MM` .
     *
     * `HH` is the zero-padded hour of the day (0-23), and `MM` is the zero-padded minute of the
     * hour. For example, `05:00` specifies 5 AM daily.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-lustreconfiguration.html#cfn-fsx-filesystem-lustreconfiguration-dailyautomaticbackupstarttime)
     */
    public fun dailyAutomaticBackupStartTime(): String? =
        unwrap(this).getDailyAutomaticBackupStartTime()

    /**
     * Sets the data compression configuration for the file system. `DataCompressionType` can have
     * the following values:.
     *
     * * `NONE` - (Default) Data compression is turned off when the file system is created.
     * * `LZ4` - Data compression is turned on with the LZ4 algorithm.
     *
     * For more information, see [Lustre data
     * compression](https://docs.aws.amazon.com/fsx/latest/LustreGuide/data-compression.html) in the
     * *Amazon FSx for Lustre User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-lustreconfiguration.html#cfn-fsx-filesystem-lustreconfiguration-datacompressiontype)
     */
    public fun dataCompressionType(): String? = unwrap(this).getDataCompressionType()

    /**
     * (Optional) Choose `SCRATCH_1` and `SCRATCH_2` deployment types when you need temporary
     * storage and shorter-term processing of data.
     *
     * The `SCRATCH_2` deployment type provides in-transit encryption of data and higher burst
     * throughput capacity than `SCRATCH_1` .
     *
     * Choose `PERSISTENT_1` for longer-term storage and for throughput-focused workloads that
     * aren’t latency-sensitive. `PERSISTENT_1` supports encryption of data in transit, and is
     * available in all AWS Regions in which FSx for Lustre is available.
     *
     * Choose `PERSISTENT_2` for longer-term storage and for latency-sensitive workloads that
     * require the highest levels of IOPS/throughput. `PERSISTENT_2` supports SSD storage, and offers
     * higher `PerUnitStorageThroughput` (up to 1000 MB/s/TiB). `PERSISTENT_2` is available in a
     * limited number of AWS Regions . For more information, and an up-to-date list of AWS Regions in
     * which `PERSISTENT_2` is available, see [File system deployment options for FSx for
     * Lustre](https://docs.aws.amazon.com/fsx/latest/LustreGuide/using-fsx-lustre.html#lustre-deployment-types)
     * in the *Amazon FSx for Lustre User Guide* .
     *
     *
     * If you choose `PERSISTENT_2` , and you set `FileSystemTypeVersion` to `2.10` , the
     * `CreateFileSystem` operation fails.
     *
     *
     * Encryption of data in transit is automatically turned on when you access `SCRATCH_2` ,
     * `PERSISTENT_1` and `PERSISTENT_2` file systems from Amazon EC2 instances that support automatic
     * encryption in the AWS Regions where they are available. For more information about encryption in
     * transit for FSx for Lustre file systems, see [Encrypting data in
     * transit](https://docs.aws.amazon.com/fsx/latest/LustreGuide/encryption-in-transit-fsxl.html) in
     * the *Amazon FSx for Lustre User Guide* .
     *
     * (Default = `SCRATCH_1` )
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-lustreconfiguration.html#cfn-fsx-filesystem-lustreconfiguration-deploymenttype)
     */
    public fun deploymentType(): String? = unwrap(this).getDeploymentType()

    /**
     * The type of drive cache used by `PERSISTENT_1` file systems that are provisioned with HDD
     * storage devices.
     *
     * This parameter is required when storage type is HDD. Set this property to `READ` to improve
     * the performance for frequently accessed files by caching up to 20% of the total storage capacity
     * of the file system.
     *
     * This parameter is required when `StorageType` is set to `HDD` and `DeploymentType` is
     * `PERSISTENT_1` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-lustreconfiguration.html#cfn-fsx-filesystem-lustreconfiguration-drivecachetype)
     */
    public fun driveCacheType(): String? = unwrap(this).getDriveCacheType()

    /**
     * (Optional) Specifies the path in the Amazon S3 bucket where the root of your Amazon FSx file
     * system is exported.
     *
     * The path must use the same Amazon S3 bucket as specified in ImportPath. You can provide an
     * optional prefix to which new and changed data is to be exported from your Amazon FSx for Lustre
     * file system. If an `ExportPath` value is not provided, Amazon FSx sets a default export path,
     * `s3://import-bucket/FSxLustre[creation-timestamp]` . The timestamp is in UTC format, for example
     * `s3://import-bucket/FSxLustre20181105T222312Z` .
     *
     * The Amazon S3 export bucket must be the same as the import bucket specified by `ImportPath` .
     * If you specify only a bucket name, such as `s3://import-bucket` , you get a 1:1 mapping of file
     * system objects to S3 bucket objects. This mapping means that the input data in S3 is overwritten
     * on export. If you provide a custom prefix in the export path, such as
     * `s3://import-bucket/[custom-optional-prefix]` , Amazon FSx exports the contents of your file
     * system to that export prefix in the Amazon S3 bucket.
     *
     *
     * This parameter is not supported for file systems with a data repository association.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-lustreconfiguration.html#cfn-fsx-filesystem-lustreconfiguration-exportpath)
     */
    public fun exportPath(): String? = unwrap(this).getExportPath()

    /**
     * (Optional) The path to the Amazon S3 bucket (including the optional prefix) that you're using
     * as the data repository for your Amazon FSx for Lustre file system.
     *
     * The root of your FSx for Lustre file system will be mapped to the root of the Amazon S3
     * bucket you select. An example is `s3://import-bucket/optional-prefix` . If you specify a prefix
     * after the Amazon S3 bucket name, only object keys with that prefix are loaded into the file
     * system.
     *
     *
     * This parameter is not supported for Lustre file systems with a data repository association.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-lustreconfiguration.html#cfn-fsx-filesystem-lustreconfiguration-importpath)
     */
    public fun importPath(): String? = unwrap(this).getImportPath()

    /**
     * (Optional) For files imported from a data repository, this value determines the stripe count
     * and maximum amount of data per file (in MiB) stored on a single physical disk.
     *
     * The maximum number of disks that a single file can be striped across is limited by the total
     * number of disks that make up the file system.
     *
     * The default chunk size is 1,024 MiB (1 GiB) and can go as high as 512,000 MiB (500 GiB).
     * Amazon S3 objects have a maximum size of 5 TB.
     *
     *
     * This parameter is not supported for Lustre file systems with a data repository association.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-lustreconfiguration.html#cfn-fsx-filesystem-lustreconfiguration-importedfilechunksize)
     */
    public fun importedFileChunkSize(): Number? = unwrap(this).getImportedFileChunkSize()

    /**
     * Required with `PERSISTENT_1` and `PERSISTENT_2` deployment types, provisions the amount of
     * read and write throughput for each 1 tebibyte (TiB) of file system storage capacity, in
     * MB/s/TiB.
     *
     * File system throughput capacity is calculated by multiplying ﬁle system storage capacity
     * (TiB) by the `PerUnitStorageThroughput` (MB/s/TiB). For a 2.4-TiB ﬁle system, provisioning 50
     * MB/s/TiB of `PerUnitStorageThroughput` yields 120 MB/s of ﬁle system throughput. You pay for the
     * amount of throughput that you provision.
     *
     * Valid values:
     *
     * * For `PERSISTENT_1` SSD storage: 50, 100, 200 MB/s/TiB.
     * * For `PERSISTENT_1` HDD storage: 12, 40 MB/s/TiB.
     * * For `PERSISTENT_2` SSD storage: 125, 250, 500, 1000 MB/s/TiB.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-lustreconfiguration.html#cfn-fsx-filesystem-lustreconfiguration-perunitstoragethroughput)
     */
    public fun perUnitStorageThroughput(): Number? = unwrap(this).getPerUnitStorageThroughput()

    /**
     * A recurring weekly time, in the format `D:HH:MM` .
     *
     * `D` is the day of the week, for which 1 represents Monday and 7 represents Sunday. For
     * further details, see [the ISO-8601 spec as described on
     * Wikipedia](https://docs.aws.amazon.com/https://en.wikipedia.org/wiki/ISO_week_date) .
     *
     * `HH` is the zero-padded hour of the day (0-23), and `MM` is the zero-padded minute of the
     * hour.
     *
     * For example, `1:05:00` specifies maintenance at 5 AM Monday.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-lustreconfiguration.html#cfn-fsx-filesystem-lustreconfiguration-weeklymaintenancestarttime)
     */
    public fun weeklyMaintenanceStartTime(): String? = unwrap(this).getWeeklyMaintenanceStartTime()

    /**
     * A builder for [LustreConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param autoImportPolicy (Optional) When you create your file system, your existing S3
       * objects appear as file and directory listings.
       * Use this property to choose how Amazon FSx keeps your file and directory listings up to
       * date as you add or modify objects in your linked S3 bucket. `AutoImportPolicy` can have the
       * following values:
       *
       * * `NONE` - (Default) AutoImport is off. Amazon FSx only updates file and directory listings
       * from the linked S3 bucket when the file system is created. FSx does not update file and
       * directory listings for any new or changed objects after choosing this option.
       * * `NEW` - AutoImport is on. Amazon FSx automatically imports directory listings of any new
       * objects added to the linked S3 bucket that do not currently exist in the FSx file system.
       * * `NEW_CHANGED` - AutoImport is on. Amazon FSx automatically imports file and directory
       * listings of any new objects added to the S3 bucket and any existing objects that are changed
       * in the S3 bucket after you choose this option.
       * * `NEW_CHANGED_DELETED` - AutoImport is on. Amazon FSx automatically imports file and
       * directory listings of any new objects added to the S3 bucket, any existing objects that are
       * changed in the S3 bucket, and any objects that were deleted in the S3 bucket.
       *
       * For more information, see [Automatically import updates from your S3
       * bucket](https://docs.aws.amazon.com/fsx/latest/LustreGuide/autoimport-data-repo.html) .
       *
       *
       * This parameter is not supported for Lustre file systems with a data repository association.
       */
      public fun autoImportPolicy(autoImportPolicy: String)

      /**
       * @param automaticBackupRetentionDays The number of days to retain automatic backups.
       * Setting this property to `0` disables automatic backups. You can retain automatic backups
       * for a maximum of 90 days. The default is `0` .
       */
      public fun automaticBackupRetentionDays(automaticBackupRetentionDays: Number)

      /**
       * @param copyTagsToBackups (Optional) Not available for use with file systems that are linked
       * to a data repository.
       * A boolean flag indicating whether tags for the file system should be copied to backups. The
       * default value is false. If `CopyTagsToBackups` is set to true, all file system tags are copied
       * to all automatic and user-initiated backups when the user doesn't specify any backup-specific
       * tags. If `CopyTagsToBackups` is set to true and you specify one or more backup tags, only the
       * specified tags are copied to backups. If you specify one or more tags when creating a
       * user-initiated backup, no tags are copied from the file system, regardless of this value.
       *
       * (Default = `false` )
       *
       * For more information, see [Working with
       * backups](https://docs.aws.amazon.com/fsx/latest/LustreGuide/using-backups-fsx.html) in the
       * *Amazon FSx for Lustre User Guide* .
       */
      public fun copyTagsToBackups(copyTagsToBackups: Boolean)

      /**
       * @param copyTagsToBackups (Optional) Not available for use with file systems that are linked
       * to a data repository.
       * A boolean flag indicating whether tags for the file system should be copied to backups. The
       * default value is false. If `CopyTagsToBackups` is set to true, all file system tags are copied
       * to all automatic and user-initiated backups when the user doesn't specify any backup-specific
       * tags. If `CopyTagsToBackups` is set to true and you specify one or more backup tags, only the
       * specified tags are copied to backups. If you specify one or more tags when creating a
       * user-initiated backup, no tags are copied from the file system, regardless of this value.
       *
       * (Default = `false` )
       *
       * For more information, see [Working with
       * backups](https://docs.aws.amazon.com/fsx/latest/LustreGuide/using-backups-fsx.html) in the
       * *Amazon FSx for Lustre User Guide* .
       */
      public fun copyTagsToBackups(copyTagsToBackups: IResolvable)

      /**
       * @param dailyAutomaticBackupStartTime A recurring daily time, in the format `HH:MM` .
       * `HH` is the zero-padded hour of the day (0-23), and `MM` is the zero-padded minute of the
       * hour. For example, `05:00` specifies 5 AM daily.
       */
      public fun dailyAutomaticBackupStartTime(dailyAutomaticBackupStartTime: String)

      /**
       * @param dataCompressionType Sets the data compression configuration for the file system.
       * `DataCompressionType` can have the following values:.
       * * `NONE` - (Default) Data compression is turned off when the file system is created.
       * * `LZ4` - Data compression is turned on with the LZ4 algorithm.
       *
       * For more information, see [Lustre data
       * compression](https://docs.aws.amazon.com/fsx/latest/LustreGuide/data-compression.html) in the
       * *Amazon FSx for Lustre User Guide* .
       */
      public fun dataCompressionType(dataCompressionType: String)

      /**
       * @param deploymentType (Optional) Choose `SCRATCH_1` and `SCRATCH_2` deployment types when
       * you need temporary storage and shorter-term processing of data.
       * The `SCRATCH_2` deployment type provides in-transit encryption of data and higher burst
       * throughput capacity than `SCRATCH_1` .
       *
       * Choose `PERSISTENT_1` for longer-term storage and for throughput-focused workloads that
       * aren’t latency-sensitive. `PERSISTENT_1` supports encryption of data in transit, and is
       * available in all AWS Regions in which FSx for Lustre is available.
       *
       * Choose `PERSISTENT_2` for longer-term storage and for latency-sensitive workloads that
       * require the highest levels of IOPS/throughput. `PERSISTENT_2` supports SSD storage, and offers
       * higher `PerUnitStorageThroughput` (up to 1000 MB/s/TiB). `PERSISTENT_2` is available in a
       * limited number of AWS Regions . For more information, and an up-to-date list of AWS Regions in
       * which `PERSISTENT_2` is available, see [File system deployment options for FSx for
       * Lustre](https://docs.aws.amazon.com/fsx/latest/LustreGuide/using-fsx-lustre.html#lustre-deployment-types)
       * in the *Amazon FSx for Lustre User Guide* .
       *
       *
       * If you choose `PERSISTENT_2` , and you set `FileSystemTypeVersion` to `2.10` , the
       * `CreateFileSystem` operation fails.
       *
       *
       * Encryption of data in transit is automatically turned on when you access `SCRATCH_2` ,
       * `PERSISTENT_1` and `PERSISTENT_2` file systems from Amazon EC2 instances that support
       * automatic encryption in the AWS Regions where they are available. For more information about
       * encryption in transit for FSx for Lustre file systems, see [Encrypting data in
       * transit](https://docs.aws.amazon.com/fsx/latest/LustreGuide/encryption-in-transit-fsxl.html)
       * in the *Amazon FSx for Lustre User Guide* .
       *
       * (Default = `SCRATCH_1` )
       */
      public fun deploymentType(deploymentType: String)

      /**
       * @param driveCacheType The type of drive cache used by `PERSISTENT_1` file systems that are
       * provisioned with HDD storage devices.
       * This parameter is required when storage type is HDD. Set this property to `READ` to improve
       * the performance for frequently accessed files by caching up to 20% of the total storage
       * capacity of the file system.
       *
       * This parameter is required when `StorageType` is set to `HDD` and `DeploymentType` is
       * `PERSISTENT_1` .
       */
      public fun driveCacheType(driveCacheType: String)

      /**
       * @param exportPath (Optional) Specifies the path in the Amazon S3 bucket where the root of
       * your Amazon FSx file system is exported.
       * The path must use the same Amazon S3 bucket as specified in ImportPath. You can provide an
       * optional prefix to which new and changed data is to be exported from your Amazon FSx for
       * Lustre file system. If an `ExportPath` value is not provided, Amazon FSx sets a default export
       * path, `s3://import-bucket/FSxLustre[creation-timestamp]` . The timestamp is in UTC format, for
       * example `s3://import-bucket/FSxLustre20181105T222312Z` .
       *
       * The Amazon S3 export bucket must be the same as the import bucket specified by `ImportPath`
       * . If you specify only a bucket name, such as `s3://import-bucket` , you get a 1:1 mapping of
       * file system objects to S3 bucket objects. This mapping means that the input data in S3 is
       * overwritten on export. If you provide a custom prefix in the export path, such as
       * `s3://import-bucket/[custom-optional-prefix]` , Amazon FSx exports the contents of your file
       * system to that export prefix in the Amazon S3 bucket.
       *
       *
       * This parameter is not supported for file systems with a data repository association.
       */
      public fun exportPath(exportPath: String)

      /**
       * @param importPath (Optional) The path to the Amazon S3 bucket (including the optional
       * prefix) that you're using as the data repository for your Amazon FSx for Lustre file system.
       * The root of your FSx for Lustre file system will be mapped to the root of the Amazon S3
       * bucket you select. An example is `s3://import-bucket/optional-prefix` . If you specify a
       * prefix after the Amazon S3 bucket name, only object keys with that prefix are loaded into the
       * file system.
       *
       *
       * This parameter is not supported for Lustre file systems with a data repository association.
       */
      public fun importPath(importPath: String)

      /**
       * @param importedFileChunkSize (Optional) For files imported from a data repository, this
       * value determines the stripe count and maximum amount of data per file (in MiB) stored on a
       * single physical disk.
       * The maximum number of disks that a single file can be striped across is limited by the
       * total number of disks that make up the file system.
       *
       * The default chunk size is 1,024 MiB (1 GiB) and can go as high as 512,000 MiB (500 GiB).
       * Amazon S3 objects have a maximum size of 5 TB.
       *
       *
       * This parameter is not supported for Lustre file systems with a data repository association.
       */
      public fun importedFileChunkSize(importedFileChunkSize: Number)

      /**
       * @param perUnitStorageThroughput Required with `PERSISTENT_1` and `PERSISTENT_2` deployment
       * types, provisions the amount of read and write throughput for each 1 tebibyte (TiB) of file
       * system storage capacity, in MB/s/TiB.
       * File system throughput capacity is calculated by multiplying ﬁle system storage capacity
       * (TiB) by the `PerUnitStorageThroughput` (MB/s/TiB). For a 2.4-TiB ﬁle system, provisioning 50
       * MB/s/TiB of `PerUnitStorageThroughput` yields 120 MB/s of ﬁle system throughput. You pay for
       * the amount of throughput that you provision.
       *
       * Valid values:
       *
       * * For `PERSISTENT_1` SSD storage: 50, 100, 200 MB/s/TiB.
       * * For `PERSISTENT_1` HDD storage: 12, 40 MB/s/TiB.
       * * For `PERSISTENT_2` SSD storage: 125, 250, 500, 1000 MB/s/TiB.
       */
      public fun perUnitStorageThroughput(perUnitStorageThroughput: Number)

      /**
       * @param weeklyMaintenanceStartTime A recurring weekly time, in the format `D:HH:MM` .
       * `D` is the day of the week, for which 1 represents Monday and 7 represents Sunday. For
       * further details, see [the ISO-8601 spec as described on
       * Wikipedia](https://docs.aws.amazon.com/https://en.wikipedia.org/wiki/ISO_week_date) .
       *
       * `HH` is the zero-padded hour of the day (0-23), and `MM` is the zero-padded minute of the
       * hour.
       *
       * For example, `1:05:00` specifies maintenance at 5 AM Monday.
       */
      public fun weeklyMaintenanceStartTime(weeklyMaintenanceStartTime: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.fsx.CfnFileSystem.LustreConfigurationProperty.Builder =
          software.amazon.awscdk.services.fsx.CfnFileSystem.LustreConfigurationProperty.builder()

      /**
       * @param autoImportPolicy (Optional) When you create your file system, your existing S3
       * objects appear as file and directory listings.
       * Use this property to choose how Amazon FSx keeps your file and directory listings up to
       * date as you add or modify objects in your linked S3 bucket. `AutoImportPolicy` can have the
       * following values:
       *
       * * `NONE` - (Default) AutoImport is off. Amazon FSx only updates file and directory listings
       * from the linked S3 bucket when the file system is created. FSx does not update file and
       * directory listings for any new or changed objects after choosing this option.
       * * `NEW` - AutoImport is on. Amazon FSx automatically imports directory listings of any new
       * objects added to the linked S3 bucket that do not currently exist in the FSx file system.
       * * `NEW_CHANGED` - AutoImport is on. Amazon FSx automatically imports file and directory
       * listings of any new objects added to the S3 bucket and any existing objects that are changed
       * in the S3 bucket after you choose this option.
       * * `NEW_CHANGED_DELETED` - AutoImport is on. Amazon FSx automatically imports file and
       * directory listings of any new objects added to the S3 bucket, any existing objects that are
       * changed in the S3 bucket, and any objects that were deleted in the S3 bucket.
       *
       * For more information, see [Automatically import updates from your S3
       * bucket](https://docs.aws.amazon.com/fsx/latest/LustreGuide/autoimport-data-repo.html) .
       *
       *
       * This parameter is not supported for Lustre file systems with a data repository association.
       */
      override fun autoImportPolicy(autoImportPolicy: String) {
        cdkBuilder.autoImportPolicy(autoImportPolicy)
      }

      /**
       * @param automaticBackupRetentionDays The number of days to retain automatic backups.
       * Setting this property to `0` disables automatic backups. You can retain automatic backups
       * for a maximum of 90 days. The default is `0` .
       */
      override fun automaticBackupRetentionDays(automaticBackupRetentionDays: Number) {
        cdkBuilder.automaticBackupRetentionDays(automaticBackupRetentionDays)
      }

      /**
       * @param copyTagsToBackups (Optional) Not available for use with file systems that are linked
       * to a data repository.
       * A boolean flag indicating whether tags for the file system should be copied to backups. The
       * default value is false. If `CopyTagsToBackups` is set to true, all file system tags are copied
       * to all automatic and user-initiated backups when the user doesn't specify any backup-specific
       * tags. If `CopyTagsToBackups` is set to true and you specify one or more backup tags, only the
       * specified tags are copied to backups. If you specify one or more tags when creating a
       * user-initiated backup, no tags are copied from the file system, regardless of this value.
       *
       * (Default = `false` )
       *
       * For more information, see [Working with
       * backups](https://docs.aws.amazon.com/fsx/latest/LustreGuide/using-backups-fsx.html) in the
       * *Amazon FSx for Lustre User Guide* .
       */
      override fun copyTagsToBackups(copyTagsToBackups: Boolean) {
        cdkBuilder.copyTagsToBackups(copyTagsToBackups)
      }

      /**
       * @param copyTagsToBackups (Optional) Not available for use with file systems that are linked
       * to a data repository.
       * A boolean flag indicating whether tags for the file system should be copied to backups. The
       * default value is false. If `CopyTagsToBackups` is set to true, all file system tags are copied
       * to all automatic and user-initiated backups when the user doesn't specify any backup-specific
       * tags. If `CopyTagsToBackups` is set to true and you specify one or more backup tags, only the
       * specified tags are copied to backups. If you specify one or more tags when creating a
       * user-initiated backup, no tags are copied from the file system, regardless of this value.
       *
       * (Default = `false` )
       *
       * For more information, see [Working with
       * backups](https://docs.aws.amazon.com/fsx/latest/LustreGuide/using-backups-fsx.html) in the
       * *Amazon FSx for Lustre User Guide* .
       */
      override fun copyTagsToBackups(copyTagsToBackups: IResolvable) {
        cdkBuilder.copyTagsToBackups(copyTagsToBackups.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param dailyAutomaticBackupStartTime A recurring daily time, in the format `HH:MM` .
       * `HH` is the zero-padded hour of the day (0-23), and `MM` is the zero-padded minute of the
       * hour. For example, `05:00` specifies 5 AM daily.
       */
      override fun dailyAutomaticBackupStartTime(dailyAutomaticBackupStartTime: String) {
        cdkBuilder.dailyAutomaticBackupStartTime(dailyAutomaticBackupStartTime)
      }

      /**
       * @param dataCompressionType Sets the data compression configuration for the file system.
       * `DataCompressionType` can have the following values:.
       * * `NONE` - (Default) Data compression is turned off when the file system is created.
       * * `LZ4` - Data compression is turned on with the LZ4 algorithm.
       *
       * For more information, see [Lustre data
       * compression](https://docs.aws.amazon.com/fsx/latest/LustreGuide/data-compression.html) in the
       * *Amazon FSx for Lustre User Guide* .
       */
      override fun dataCompressionType(dataCompressionType: String) {
        cdkBuilder.dataCompressionType(dataCompressionType)
      }

      /**
       * @param deploymentType (Optional) Choose `SCRATCH_1` and `SCRATCH_2` deployment types when
       * you need temporary storage and shorter-term processing of data.
       * The `SCRATCH_2` deployment type provides in-transit encryption of data and higher burst
       * throughput capacity than `SCRATCH_1` .
       *
       * Choose `PERSISTENT_1` for longer-term storage and for throughput-focused workloads that
       * aren’t latency-sensitive. `PERSISTENT_1` supports encryption of data in transit, and is
       * available in all AWS Regions in which FSx for Lustre is available.
       *
       * Choose `PERSISTENT_2` for longer-term storage and for latency-sensitive workloads that
       * require the highest levels of IOPS/throughput. `PERSISTENT_2` supports SSD storage, and offers
       * higher `PerUnitStorageThroughput` (up to 1000 MB/s/TiB). `PERSISTENT_2` is available in a
       * limited number of AWS Regions . For more information, and an up-to-date list of AWS Regions in
       * which `PERSISTENT_2` is available, see [File system deployment options for FSx for
       * Lustre](https://docs.aws.amazon.com/fsx/latest/LustreGuide/using-fsx-lustre.html#lustre-deployment-types)
       * in the *Amazon FSx for Lustre User Guide* .
       *
       *
       * If you choose `PERSISTENT_2` , and you set `FileSystemTypeVersion` to `2.10` , the
       * `CreateFileSystem` operation fails.
       *
       *
       * Encryption of data in transit is automatically turned on when you access `SCRATCH_2` ,
       * `PERSISTENT_1` and `PERSISTENT_2` file systems from Amazon EC2 instances that support
       * automatic encryption in the AWS Regions where they are available. For more information about
       * encryption in transit for FSx for Lustre file systems, see [Encrypting data in
       * transit](https://docs.aws.amazon.com/fsx/latest/LustreGuide/encryption-in-transit-fsxl.html)
       * in the *Amazon FSx for Lustre User Guide* .
       *
       * (Default = `SCRATCH_1` )
       */
      override fun deploymentType(deploymentType: String) {
        cdkBuilder.deploymentType(deploymentType)
      }

      /**
       * @param driveCacheType The type of drive cache used by `PERSISTENT_1` file systems that are
       * provisioned with HDD storage devices.
       * This parameter is required when storage type is HDD. Set this property to `READ` to improve
       * the performance for frequently accessed files by caching up to 20% of the total storage
       * capacity of the file system.
       *
       * This parameter is required when `StorageType` is set to `HDD` and `DeploymentType` is
       * `PERSISTENT_1` .
       */
      override fun driveCacheType(driveCacheType: String) {
        cdkBuilder.driveCacheType(driveCacheType)
      }

      /**
       * @param exportPath (Optional) Specifies the path in the Amazon S3 bucket where the root of
       * your Amazon FSx file system is exported.
       * The path must use the same Amazon S3 bucket as specified in ImportPath. You can provide an
       * optional prefix to which new and changed data is to be exported from your Amazon FSx for
       * Lustre file system. If an `ExportPath` value is not provided, Amazon FSx sets a default export
       * path, `s3://import-bucket/FSxLustre[creation-timestamp]` . The timestamp is in UTC format, for
       * example `s3://import-bucket/FSxLustre20181105T222312Z` .
       *
       * The Amazon S3 export bucket must be the same as the import bucket specified by `ImportPath`
       * . If you specify only a bucket name, such as `s3://import-bucket` , you get a 1:1 mapping of
       * file system objects to S3 bucket objects. This mapping means that the input data in S3 is
       * overwritten on export. If you provide a custom prefix in the export path, such as
       * `s3://import-bucket/[custom-optional-prefix]` , Amazon FSx exports the contents of your file
       * system to that export prefix in the Amazon S3 bucket.
       *
       *
       * This parameter is not supported for file systems with a data repository association.
       */
      override fun exportPath(exportPath: String) {
        cdkBuilder.exportPath(exportPath)
      }

      /**
       * @param importPath (Optional) The path to the Amazon S3 bucket (including the optional
       * prefix) that you're using as the data repository for your Amazon FSx for Lustre file system.
       * The root of your FSx for Lustre file system will be mapped to the root of the Amazon S3
       * bucket you select. An example is `s3://import-bucket/optional-prefix` . If you specify a
       * prefix after the Amazon S3 bucket name, only object keys with that prefix are loaded into the
       * file system.
       *
       *
       * This parameter is not supported for Lustre file systems with a data repository association.
       */
      override fun importPath(importPath: String) {
        cdkBuilder.importPath(importPath)
      }

      /**
       * @param importedFileChunkSize (Optional) For files imported from a data repository, this
       * value determines the stripe count and maximum amount of data per file (in MiB) stored on a
       * single physical disk.
       * The maximum number of disks that a single file can be striped across is limited by the
       * total number of disks that make up the file system.
       *
       * The default chunk size is 1,024 MiB (1 GiB) and can go as high as 512,000 MiB (500 GiB).
       * Amazon S3 objects have a maximum size of 5 TB.
       *
       *
       * This parameter is not supported for Lustre file systems with a data repository association.
       */
      override fun importedFileChunkSize(importedFileChunkSize: Number) {
        cdkBuilder.importedFileChunkSize(importedFileChunkSize)
      }

      /**
       * @param perUnitStorageThroughput Required with `PERSISTENT_1` and `PERSISTENT_2` deployment
       * types, provisions the amount of read and write throughput for each 1 tebibyte (TiB) of file
       * system storage capacity, in MB/s/TiB.
       * File system throughput capacity is calculated by multiplying ﬁle system storage capacity
       * (TiB) by the `PerUnitStorageThroughput` (MB/s/TiB). For a 2.4-TiB ﬁle system, provisioning 50
       * MB/s/TiB of `PerUnitStorageThroughput` yields 120 MB/s of ﬁle system throughput. You pay for
       * the amount of throughput that you provision.
       *
       * Valid values:
       *
       * * For `PERSISTENT_1` SSD storage: 50, 100, 200 MB/s/TiB.
       * * For `PERSISTENT_1` HDD storage: 12, 40 MB/s/TiB.
       * * For `PERSISTENT_2` SSD storage: 125, 250, 500, 1000 MB/s/TiB.
       */
      override fun perUnitStorageThroughput(perUnitStorageThroughput: Number) {
        cdkBuilder.perUnitStorageThroughput(perUnitStorageThroughput)
      }

      /**
       * @param weeklyMaintenanceStartTime A recurring weekly time, in the format `D:HH:MM` .
       * `D` is the day of the week, for which 1 represents Monday and 7 represents Sunday. For
       * further details, see [the ISO-8601 spec as described on
       * Wikipedia](https://docs.aws.amazon.com/https://en.wikipedia.org/wiki/ISO_week_date) .
       *
       * `HH` is the zero-padded hour of the day (0-23), and `MM` is the zero-padded minute of the
       * hour.
       *
       * For example, `1:05:00` specifies maintenance at 5 AM Monday.
       */
      override fun weeklyMaintenanceStartTime(weeklyMaintenanceStartTime: String) {
        cdkBuilder.weeklyMaintenanceStartTime(weeklyMaintenanceStartTime)
      }

      public fun build():
          software.amazon.awscdk.services.fsx.CfnFileSystem.LustreConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.fsx.CfnFileSystem.LustreConfigurationProperty,
    ) : CdkObject(cdkObject), LustreConfigurationProperty {
      /**
       * (Optional) When you create your file system, your existing S3 objects appear as file and
       * directory listings.
       *
       * Use this property to choose how Amazon FSx keeps your file and directory listings up to
       * date as you add or modify objects in your linked S3 bucket. `AutoImportPolicy` can have the
       * following values:
       *
       * * `NONE` - (Default) AutoImport is off. Amazon FSx only updates file and directory listings
       * from the linked S3 bucket when the file system is created. FSx does not update file and
       * directory listings for any new or changed objects after choosing this option.
       * * `NEW` - AutoImport is on. Amazon FSx automatically imports directory listings of any new
       * objects added to the linked S3 bucket that do not currently exist in the FSx file system.
       * * `NEW_CHANGED` - AutoImport is on. Amazon FSx automatically imports file and directory
       * listings of any new objects added to the S3 bucket and any existing objects that are changed
       * in the S3 bucket after you choose this option.
       * * `NEW_CHANGED_DELETED` - AutoImport is on. Amazon FSx automatically imports file and
       * directory listings of any new objects added to the S3 bucket, any existing objects that are
       * changed in the S3 bucket, and any objects that were deleted in the S3 bucket.
       *
       * For more information, see [Automatically import updates from your S3
       * bucket](https://docs.aws.amazon.com/fsx/latest/LustreGuide/autoimport-data-repo.html) .
       *
       *
       * This parameter is not supported for Lustre file systems with a data repository association.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-lustreconfiguration.html#cfn-fsx-filesystem-lustreconfiguration-autoimportpolicy)
       */
      override fun autoImportPolicy(): String? = unwrap(this).getAutoImportPolicy()

      /**
       * The number of days to retain automatic backups.
       *
       * Setting this property to `0` disables automatic backups. You can retain automatic backups
       * for a maximum of 90 days. The default is `0` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-lustreconfiguration.html#cfn-fsx-filesystem-lustreconfiguration-automaticbackupretentiondays)
       */
      override fun automaticBackupRetentionDays(): Number? =
          unwrap(this).getAutomaticBackupRetentionDays()

      /**
       * (Optional) Not available for use with file systems that are linked to a data repository.
       *
       * A boolean flag indicating whether tags for the file system should be copied to backups. The
       * default value is false. If `CopyTagsToBackups` is set to true, all file system tags are copied
       * to all automatic and user-initiated backups when the user doesn't specify any backup-specific
       * tags. If `CopyTagsToBackups` is set to true and you specify one or more backup tags, only the
       * specified tags are copied to backups. If you specify one or more tags when creating a
       * user-initiated backup, no tags are copied from the file system, regardless of this value.
       *
       * (Default = `false` )
       *
       * For more information, see [Working with
       * backups](https://docs.aws.amazon.com/fsx/latest/LustreGuide/using-backups-fsx.html) in the
       * *Amazon FSx for Lustre User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-lustreconfiguration.html#cfn-fsx-filesystem-lustreconfiguration-copytagstobackups)
       */
      override fun copyTagsToBackups(): Any? = unwrap(this).getCopyTagsToBackups()

      /**
       * A recurring daily time, in the format `HH:MM` .
       *
       * `HH` is the zero-padded hour of the day (0-23), and `MM` is the zero-padded minute of the
       * hour. For example, `05:00` specifies 5 AM daily.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-lustreconfiguration.html#cfn-fsx-filesystem-lustreconfiguration-dailyautomaticbackupstarttime)
       */
      override fun dailyAutomaticBackupStartTime(): String? =
          unwrap(this).getDailyAutomaticBackupStartTime()

      /**
       * Sets the data compression configuration for the file system. `DataCompressionType` can have
       * the following values:.
       *
       * * `NONE` - (Default) Data compression is turned off when the file system is created.
       * * `LZ4` - Data compression is turned on with the LZ4 algorithm.
       *
       * For more information, see [Lustre data
       * compression](https://docs.aws.amazon.com/fsx/latest/LustreGuide/data-compression.html) in the
       * *Amazon FSx for Lustre User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-lustreconfiguration.html#cfn-fsx-filesystem-lustreconfiguration-datacompressiontype)
       */
      override fun dataCompressionType(): String? = unwrap(this).getDataCompressionType()

      /**
       * (Optional) Choose `SCRATCH_1` and `SCRATCH_2` deployment types when you need temporary
       * storage and shorter-term processing of data.
       *
       * The `SCRATCH_2` deployment type provides in-transit encryption of data and higher burst
       * throughput capacity than `SCRATCH_1` .
       *
       * Choose `PERSISTENT_1` for longer-term storage and for throughput-focused workloads that
       * aren’t latency-sensitive. `PERSISTENT_1` supports encryption of data in transit, and is
       * available in all AWS Regions in which FSx for Lustre is available.
       *
       * Choose `PERSISTENT_2` for longer-term storage and for latency-sensitive workloads that
       * require the highest levels of IOPS/throughput. `PERSISTENT_2` supports SSD storage, and offers
       * higher `PerUnitStorageThroughput` (up to 1000 MB/s/TiB). `PERSISTENT_2` is available in a
       * limited number of AWS Regions . For more information, and an up-to-date list of AWS Regions in
       * which `PERSISTENT_2` is available, see [File system deployment options for FSx for
       * Lustre](https://docs.aws.amazon.com/fsx/latest/LustreGuide/using-fsx-lustre.html#lustre-deployment-types)
       * in the *Amazon FSx for Lustre User Guide* .
       *
       *
       * If you choose `PERSISTENT_2` , and you set `FileSystemTypeVersion` to `2.10` , the
       * `CreateFileSystem` operation fails.
       *
       *
       * Encryption of data in transit is automatically turned on when you access `SCRATCH_2` ,
       * `PERSISTENT_1` and `PERSISTENT_2` file systems from Amazon EC2 instances that support
       * automatic encryption in the AWS Regions where they are available. For more information about
       * encryption in transit for FSx for Lustre file systems, see [Encrypting data in
       * transit](https://docs.aws.amazon.com/fsx/latest/LustreGuide/encryption-in-transit-fsxl.html)
       * in the *Amazon FSx for Lustre User Guide* .
       *
       * (Default = `SCRATCH_1` )
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-lustreconfiguration.html#cfn-fsx-filesystem-lustreconfiguration-deploymenttype)
       */
      override fun deploymentType(): String? = unwrap(this).getDeploymentType()

      /**
       * The type of drive cache used by `PERSISTENT_1` file systems that are provisioned with HDD
       * storage devices.
       *
       * This parameter is required when storage type is HDD. Set this property to `READ` to improve
       * the performance for frequently accessed files by caching up to 20% of the total storage
       * capacity of the file system.
       *
       * This parameter is required when `StorageType` is set to `HDD` and `DeploymentType` is
       * `PERSISTENT_1` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-lustreconfiguration.html#cfn-fsx-filesystem-lustreconfiguration-drivecachetype)
       */
      override fun driveCacheType(): String? = unwrap(this).getDriveCacheType()

      /**
       * (Optional) Specifies the path in the Amazon S3 bucket where the root of your Amazon FSx
       * file system is exported.
       *
       * The path must use the same Amazon S3 bucket as specified in ImportPath. You can provide an
       * optional prefix to which new and changed data is to be exported from your Amazon FSx for
       * Lustre file system. If an `ExportPath` value is not provided, Amazon FSx sets a default export
       * path, `s3://import-bucket/FSxLustre[creation-timestamp]` . The timestamp is in UTC format, for
       * example `s3://import-bucket/FSxLustre20181105T222312Z` .
       *
       * The Amazon S3 export bucket must be the same as the import bucket specified by `ImportPath`
       * . If you specify only a bucket name, such as `s3://import-bucket` , you get a 1:1 mapping of
       * file system objects to S3 bucket objects. This mapping means that the input data in S3 is
       * overwritten on export. If you provide a custom prefix in the export path, such as
       * `s3://import-bucket/[custom-optional-prefix]` , Amazon FSx exports the contents of your file
       * system to that export prefix in the Amazon S3 bucket.
       *
       *
       * This parameter is not supported for file systems with a data repository association.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-lustreconfiguration.html#cfn-fsx-filesystem-lustreconfiguration-exportpath)
       */
      override fun exportPath(): String? = unwrap(this).getExportPath()

      /**
       * (Optional) The path to the Amazon S3 bucket (including the optional prefix) that you're
       * using as the data repository for your Amazon FSx for Lustre file system.
       *
       * The root of your FSx for Lustre file system will be mapped to the root of the Amazon S3
       * bucket you select. An example is `s3://import-bucket/optional-prefix` . If you specify a
       * prefix after the Amazon S3 bucket name, only object keys with that prefix are loaded into the
       * file system.
       *
       *
       * This parameter is not supported for Lustre file systems with a data repository association.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-lustreconfiguration.html#cfn-fsx-filesystem-lustreconfiguration-importpath)
       */
      override fun importPath(): String? = unwrap(this).getImportPath()

      /**
       * (Optional) For files imported from a data repository, this value determines the stripe
       * count and maximum amount of data per file (in MiB) stored on a single physical disk.
       *
       * The maximum number of disks that a single file can be striped across is limited by the
       * total number of disks that make up the file system.
       *
       * The default chunk size is 1,024 MiB (1 GiB) and can go as high as 512,000 MiB (500 GiB).
       * Amazon S3 objects have a maximum size of 5 TB.
       *
       *
       * This parameter is not supported for Lustre file systems with a data repository association.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-lustreconfiguration.html#cfn-fsx-filesystem-lustreconfiguration-importedfilechunksize)
       */
      override fun importedFileChunkSize(): Number? = unwrap(this).getImportedFileChunkSize()

      /**
       * Required with `PERSISTENT_1` and `PERSISTENT_2` deployment types, provisions the amount of
       * read and write throughput for each 1 tebibyte (TiB) of file system storage capacity, in
       * MB/s/TiB.
       *
       * File system throughput capacity is calculated by multiplying ﬁle system storage capacity
       * (TiB) by the `PerUnitStorageThroughput` (MB/s/TiB). For a 2.4-TiB ﬁle system, provisioning 50
       * MB/s/TiB of `PerUnitStorageThroughput` yields 120 MB/s of ﬁle system throughput. You pay for
       * the amount of throughput that you provision.
       *
       * Valid values:
       *
       * * For `PERSISTENT_1` SSD storage: 50, 100, 200 MB/s/TiB.
       * * For `PERSISTENT_1` HDD storage: 12, 40 MB/s/TiB.
       * * For `PERSISTENT_2` SSD storage: 125, 250, 500, 1000 MB/s/TiB.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-lustreconfiguration.html#cfn-fsx-filesystem-lustreconfiguration-perunitstoragethroughput)
       */
      override fun perUnitStorageThroughput(): Number? = unwrap(this).getPerUnitStorageThroughput()

      /**
       * A recurring weekly time, in the format `D:HH:MM` .
       *
       * `D` is the day of the week, for which 1 represents Monday and 7 represents Sunday. For
       * further details, see [the ISO-8601 spec as described on
       * Wikipedia](https://docs.aws.amazon.com/https://en.wikipedia.org/wiki/ISO_week_date) .
       *
       * `HH` is the zero-padded hour of the day (0-23), and `MM` is the zero-padded minute of the
       * hour.
       *
       * For example, `1:05:00` specifies maintenance at 5 AM Monday.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-lustreconfiguration.html#cfn-fsx-filesystem-lustreconfiguration-weeklymaintenancestarttime)
       */
      override fun weeklyMaintenanceStartTime(): String? =
          unwrap(this).getWeeklyMaintenanceStartTime()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LustreConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.fsx.CfnFileSystem.LustreConfigurationProperty):
          LustreConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          LustreConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: LustreConfigurationProperty):
          software.amazon.awscdk.services.fsx.CfnFileSystem.LustreConfigurationProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.fsx.CfnFileSystem.LustreConfigurationProperty
    }
  }

  /**
   * The configuration object for mounting a file system.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.fsx.*;
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
  public interface NfsExportsProperty {
    /**
     * A list of configuration objects that contain the client and options for mounting the OpenZFS
     * file system.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-nfsexports.html#cfn-fsx-filesystem-nfsexports-clientconfigurations)
     */
    public fun clientConfigurations(): Any? = unwrap(this).getClientConfigurations()

    /**
     * A builder for [NfsExportsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param clientConfigurations A list of configuration objects that contain the client and
       * options for mounting the OpenZFS file system.
       */
      public fun clientConfigurations(clientConfigurations: IResolvable)

      /**
       * @param clientConfigurations A list of configuration objects that contain the client and
       * options for mounting the OpenZFS file system.
       */
      public fun clientConfigurations(clientConfigurations: List<Any>)

      /**
       * @param clientConfigurations A list of configuration objects that contain the client and
       * options for mounting the OpenZFS file system.
       */
      public fun clientConfigurations(vararg clientConfigurations: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.fsx.CfnFileSystem.NfsExportsProperty.Builder =
          software.amazon.awscdk.services.fsx.CfnFileSystem.NfsExportsProperty.builder()

      /**
       * @param clientConfigurations A list of configuration objects that contain the client and
       * options for mounting the OpenZFS file system.
       */
      override fun clientConfigurations(clientConfigurations: IResolvable) {
        cdkBuilder.clientConfigurations(clientConfigurations.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param clientConfigurations A list of configuration objects that contain the client and
       * options for mounting the OpenZFS file system.
       */
      override fun clientConfigurations(clientConfigurations: List<Any>) {
        cdkBuilder.clientConfigurations(clientConfigurations.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param clientConfigurations A list of configuration objects that contain the client and
       * options for mounting the OpenZFS file system.
       */
      override fun clientConfigurations(vararg clientConfigurations: Any): Unit =
          clientConfigurations(clientConfigurations.toList())

      public fun build(): software.amazon.awscdk.services.fsx.CfnFileSystem.NfsExportsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.fsx.CfnFileSystem.NfsExportsProperty,
    ) : CdkObject(cdkObject), NfsExportsProperty {
      /**
       * A list of configuration objects that contain the client and options for mounting the
       * OpenZFS file system.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-nfsexports.html#cfn-fsx-filesystem-nfsexports-clientconfigurations)
       */
      override fun clientConfigurations(): Any? = unwrap(this).getClientConfigurations()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): NfsExportsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.fsx.CfnFileSystem.NfsExportsProperty):
          NfsExportsProperty = CdkObjectWrappers.wrap(cdkObject) as? NfsExportsProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: NfsExportsProperty):
          software.amazon.awscdk.services.fsx.CfnFileSystem.NfsExportsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.fsx.CfnFileSystem.NfsExportsProperty
    }
  }

  /**
   * The configuration for this Amazon FSx for NetApp ONTAP file system.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.fsx.*;
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
   * .haPairs(123)
   * .preferredSubnetId("preferredSubnetId")
   * .routeTableIds(List.of("routeTableIds"))
   * .throughputCapacity(123)
   * .throughputCapacityPerHaPair(123)
   * .weeklyMaintenanceStartTime("weeklyMaintenanceStartTime")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-ontapconfiguration.html)
   */
  public interface OntapConfigurationProperty {
    /**
     * The number of days to retain automatic backups.
     *
     * Setting this property to `0` disables automatic backups. You can retain automatic backups for
     * a maximum of 90 days. The default is `30` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-ontapconfiguration.html#cfn-fsx-filesystem-ontapconfiguration-automaticbackupretentiondays)
     */
    public fun automaticBackupRetentionDays(): Number? =
        unwrap(this).getAutomaticBackupRetentionDays()

    /**
     * A recurring daily time, in the format `HH:MM` .
     *
     * `HH` is the zero-padded hour of the day (0-23), and `MM` is the zero-padded minute of the
     * hour. For example, `05:00` specifies 5 AM daily.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-ontapconfiguration.html#cfn-fsx-filesystem-ontapconfiguration-dailyautomaticbackupstarttime)
     */
    public fun dailyAutomaticBackupStartTime(): String? =
        unwrap(this).getDailyAutomaticBackupStartTime()

    /**
     * Specifies the FSx for ONTAP file system deployment type to use in creating the file system.
     *
     * * `MULTI_AZ_1` - (Default) A high availability file system configured for Multi-AZ redundancy
     * to tolerate temporary Availability Zone (AZ) unavailability.
     * * `SINGLE_AZ_1` - A file system configured for Single-AZ redundancy.
     * * `SINGLE_AZ_2` - A file system configured with multiple high-availability (HA) pairs for
     * Single-AZ redundancy.
     *
     * For information about the use cases for Multi-AZ and Single-AZ deployments, refer to
     * [Choosing a file system deployment
     * type](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/high-availability-AZ.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-ontapconfiguration.html#cfn-fsx-filesystem-ontapconfiguration-deploymenttype)
     */
    public fun deploymentType(): String

    /**
     * The SSD IOPS configuration for the FSx for ONTAP file system.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-ontapconfiguration.html#cfn-fsx-filesystem-ontapconfiguration-diskiopsconfiguration)
     */
    public fun diskIopsConfiguration(): Any? = unwrap(this).getDiskIopsConfiguration()

    /**
     * (Multi-AZ only) Specifies the IP address range in which the endpoints to access your file
     * system will be created.
     *
     * By default in the Amazon FSx API, Amazon FSx selects an unused IP address range for you from
     * the 198.19.* range. By default in the Amazon FSx console, Amazon FSx chooses the last 64 IP
     * addresses from the VPC’s primary CIDR range to use as the endpoint IP address range for the file
     * system. You can have overlapping endpoint IP addresses for file systems deployed in the same
     * VPC/route tables, as long as they don't overlap with any subnet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-ontapconfiguration.html#cfn-fsx-filesystem-ontapconfiguration-endpointipaddressrange)
     */
    public fun endpointIpAddressRange(): String? = unwrap(this).getEndpointIpAddressRange()

    /**
     * The ONTAP administrative password for the `fsxadmin` user with which you administer your file
     * system using the NetApp ONTAP CLI and REST API.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-ontapconfiguration.html#cfn-fsx-filesystem-ontapconfiguration-fsxadminpassword)
     */
    public fun fsxAdminPassword(): String? = unwrap(this).getFsxAdminPassword()

    /**
     * Specifies how many high-availability (HA) pairs of file servers will power your file system.
     *
     * Scale-up file systems are powered by 1 HA pair. The default value is 1. FSx for ONTAP
     * scale-out file systems are powered by up to 12 HA pairs. The value of this property affects the
     * values of `StorageCapacity` , `Iops` , and `ThroughputCapacity` . For more information, see
     * [High-availability (HA) pairs](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/HA-pairs.html)
     * in the FSx for ONTAP user guide.
     *
     * Amazon FSx responds with an HTTP status code 400 (Bad Request) for the following conditions:
     *
     * * The value of `HAPairs` is less than 1 or greater than 12.
     * * The value of `HAPairs` is greater than 1 and the value of `DeploymentType` is `SINGLE_AZ_1`
     * or `MULTI_AZ_1` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-ontapconfiguration.html#cfn-fsx-filesystem-ontapconfiguration-hapairs)
     */
    public fun haPairs(): Number? = unwrap(this).getHaPairs()

    /**
     * Required when `DeploymentType` is set to `MULTI_AZ_1` .
     *
     * This specifies the subnet in which you want the preferred file server to be located.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-ontapconfiguration.html#cfn-fsx-filesystem-ontapconfiguration-preferredsubnetid)
     */
    public fun preferredSubnetId(): String? = unwrap(this).getPreferredSubnetId()

    /**
     * (Multi-AZ only) Specifies the route tables in which Amazon FSx creates the rules for routing
     * traffic to the correct file server.
     *
     * You should specify all virtual private cloud (VPC) route tables associated with the subnets
     * in which your clients are located. By default, Amazon FSx selects your VPC's default route
     * table.
     *
     *
     * Amazon FSx manages these route tables for Multi-AZ file systems using tag-based
     * authentication. These route tables are tagged with `Key: AmazonFSx; Value: ManagedByAmazonFSx` .
     * When creating FSx for ONTAP Multi-AZ file systems using AWS CloudFormation we recommend that you
     * add the `Key: AmazonFSx; Value: ManagedByAmazonFSx` tag manually.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-ontapconfiguration.html#cfn-fsx-filesystem-ontapconfiguration-routetableids)
     */
    public fun routeTableIds(): List<String> = unwrap(this).getRouteTableIds() ?: emptyList()

    /**
     * Sets the throughput capacity for the file system that you're creating in megabytes per second
     * (MBps).
     *
     * For more information, see [Managing throughput
     * capacity](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/managing-throughput-capacity.html)
     * in the FSx for ONTAP User Guide.
     *
     * Amazon FSx responds with an HTTP status code 400 (Bad Request) for the following conditions:
     *
     * * The value of `ThroughputCapacity` and `ThroughputCapacityPerHAPair` are not the same value.
     * * The value of `ThroughputCapacity` when divided by the value of `HAPairs` is outside of the
     * valid range for `ThroughputCapacity` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-ontapconfiguration.html#cfn-fsx-filesystem-ontapconfiguration-throughputcapacity)
     */
    public fun throughputCapacity(): Number? = unwrap(this).getThroughputCapacity()

    /**
     * Use to choose the throughput capacity per HA pair, rather than the total throughput for the
     * file system.
     *
     * You can define either the `ThroughputCapacityPerHAPair` or the `ThroughputCapacity` when
     * creating a file system, but not both.
     *
     * This field and `ThroughputCapacity` are the same for scale-up file systems powered by one HA
     * pair.
     *
     * * For `SINGLE_AZ_1` and `MULTI_AZ_1` file systems, valid values are 128, 256, 512, 1024,
     * 2048, or 4096 MBps.
     * * For `SINGLE_AZ_2` file systems, valid values are 3072 or 6144 MBps.
     *
     * Amazon FSx responds with an HTTP status code 400 (Bad Request) for the following conditions:
     *
     * * The value of `ThroughputCapacity` and `ThroughputCapacityPerHAPair` are not the same value
     * for file systems with one HA pair.
     * * The value of deployment type is `SINGLE_AZ_2` and `ThroughputCapacity` /
     * `ThroughputCapacityPerHAPair` is a valid HA pair (a value between 2 and 12).
     * * The value of `ThroughputCapacityPerHAPair` is not a valid value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-ontapconfiguration.html#cfn-fsx-filesystem-ontapconfiguration-throughputcapacityperhapair)
     */
    public fun throughputCapacityPerHaPair(): Number? =
        unwrap(this).getThroughputCapacityPerHaPair()

    /**
     * A recurring weekly time, in the format `D:HH:MM` .
     *
     * `D` is the day of the week, for which 1 represents Monday and 7 represents Sunday. For
     * further details, see [the ISO-8601 spec as described on
     * Wikipedia](https://docs.aws.amazon.com/https://en.wikipedia.org/wiki/ISO_week_date) .
     *
     * `HH` is the zero-padded hour of the day (0-23), and `MM` is the zero-padded minute of the
     * hour.
     *
     * For example, `1:05:00` specifies maintenance at 5 AM Monday.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-ontapconfiguration.html#cfn-fsx-filesystem-ontapconfiguration-weeklymaintenancestarttime)
     */
    public fun weeklyMaintenanceStartTime(): String? = unwrap(this).getWeeklyMaintenanceStartTime()

    /**
     * A builder for [OntapConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param automaticBackupRetentionDays The number of days to retain automatic backups.
       * Setting this property to `0` disables automatic backups. You can retain automatic backups
       * for a maximum of 90 days. The default is `30` .
       */
      public fun automaticBackupRetentionDays(automaticBackupRetentionDays: Number)

      /**
       * @param dailyAutomaticBackupStartTime A recurring daily time, in the format `HH:MM` .
       * `HH` is the zero-padded hour of the day (0-23), and `MM` is the zero-padded minute of the
       * hour. For example, `05:00` specifies 5 AM daily.
       */
      public fun dailyAutomaticBackupStartTime(dailyAutomaticBackupStartTime: String)

      /**
       * @param deploymentType Specifies the FSx for ONTAP file system deployment type to use in
       * creating the file system. 
       * * `MULTI_AZ_1` - (Default) A high availability file system configured for Multi-AZ
       * redundancy to tolerate temporary Availability Zone (AZ) unavailability.
       * * `SINGLE_AZ_1` - A file system configured for Single-AZ redundancy.
       * * `SINGLE_AZ_2` - A file system configured with multiple high-availability (HA) pairs for
       * Single-AZ redundancy.
       *
       * For information about the use cases for Multi-AZ and Single-AZ deployments, refer to
       * [Choosing a file system deployment
       * type](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/high-availability-AZ.html) .
       */
      public fun deploymentType(deploymentType: String)

      /**
       * @param diskIopsConfiguration The SSD IOPS configuration for the FSx for ONTAP file system.
       */
      public fun diskIopsConfiguration(diskIopsConfiguration: IResolvable)

      /**
       * @param diskIopsConfiguration The SSD IOPS configuration for the FSx for ONTAP file system.
       */
      public fun diskIopsConfiguration(diskIopsConfiguration: DiskIopsConfigurationProperty)

      /**
       * @param diskIopsConfiguration The SSD IOPS configuration for the FSx for ONTAP file system.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fa848444d8fe815186bb9a42535c50f3de4891f0bb7fd7cc4082410a54d93baa")
      public
          fun diskIopsConfiguration(diskIopsConfiguration: DiskIopsConfigurationProperty.Builder.() -> Unit)

      /**
       * @param endpointIpAddressRange (Multi-AZ only) Specifies the IP address range in which the
       * endpoints to access your file system will be created.
       * By default in the Amazon FSx API, Amazon FSx selects an unused IP address range for you
       * from the 198.19.* range. By default in the Amazon FSx console, Amazon FSx chooses the last 64
       * IP addresses from the VPC’s primary CIDR range to use as the endpoint IP address range for the
       * file system. You can have overlapping endpoint IP addresses for file systems deployed in the
       * same VPC/route tables, as long as they don't overlap with any subnet.
       */
      public fun endpointIpAddressRange(endpointIpAddressRange: String)

      /**
       * @param fsxAdminPassword The ONTAP administrative password for the `fsxadmin` user with
       * which you administer your file system using the NetApp ONTAP CLI and REST API.
       */
      public fun fsxAdminPassword(fsxAdminPassword: String)

      /**
       * @param haPairs Specifies how many high-availability (HA) pairs of file servers will power
       * your file system.
       * Scale-up file systems are powered by 1 HA pair. The default value is 1. FSx for ONTAP
       * scale-out file systems are powered by up to 12 HA pairs. The value of this property affects
       * the values of `StorageCapacity` , `Iops` , and `ThroughputCapacity` . For more information,
       * see [High-availability (HA)
       * pairs](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/HA-pairs.html) in the FSx for ONTAP
       * user guide.
       *
       * Amazon FSx responds with an HTTP status code 400 (Bad Request) for the following
       * conditions:
       *
       * * The value of `HAPairs` is less than 1 or greater than 12.
       * * The value of `HAPairs` is greater than 1 and the value of `DeploymentType` is
       * `SINGLE_AZ_1` or `MULTI_AZ_1` .
       */
      public fun haPairs(haPairs: Number)

      /**
       * @param preferredSubnetId Required when `DeploymentType` is set to `MULTI_AZ_1` .
       * This specifies the subnet in which you want the preferred file server to be located.
       */
      public fun preferredSubnetId(preferredSubnetId: String)

      /**
       * @param routeTableIds (Multi-AZ only) Specifies the route tables in which Amazon FSx creates
       * the rules for routing traffic to the correct file server.
       * You should specify all virtual private cloud (VPC) route tables associated with the subnets
       * in which your clients are located. By default, Amazon FSx selects your VPC's default route
       * table.
       *
       *
       * Amazon FSx manages these route tables for Multi-AZ file systems using tag-based
       * authentication. These route tables are tagged with `Key: AmazonFSx; Value: ManagedByAmazonFSx`
       * . When creating FSx for ONTAP Multi-AZ file systems using AWS CloudFormation we recommend that
       * you add the `Key: AmazonFSx; Value: ManagedByAmazonFSx` tag manually.
       */
      public fun routeTableIds(routeTableIds: List<String>)

      /**
       * @param routeTableIds (Multi-AZ only) Specifies the route tables in which Amazon FSx creates
       * the rules for routing traffic to the correct file server.
       * You should specify all virtual private cloud (VPC) route tables associated with the subnets
       * in which your clients are located. By default, Amazon FSx selects your VPC's default route
       * table.
       *
       *
       * Amazon FSx manages these route tables for Multi-AZ file systems using tag-based
       * authentication. These route tables are tagged with `Key: AmazonFSx; Value: ManagedByAmazonFSx`
       * . When creating FSx for ONTAP Multi-AZ file systems using AWS CloudFormation we recommend that
       * you add the `Key: AmazonFSx; Value: ManagedByAmazonFSx` tag manually.
       */
      public fun routeTableIds(vararg routeTableIds: String)

      /**
       * @param throughputCapacity Sets the throughput capacity for the file system that you're
       * creating in megabytes per second (MBps).
       * For more information, see [Managing throughput
       * capacity](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/managing-throughput-capacity.html)
       * in the FSx for ONTAP User Guide.
       *
       * Amazon FSx responds with an HTTP status code 400 (Bad Request) for the following
       * conditions:
       *
       * * The value of `ThroughputCapacity` and `ThroughputCapacityPerHAPair` are not the same
       * value.
       * * The value of `ThroughputCapacity` when divided by the value of `HAPairs` is outside of
       * the valid range for `ThroughputCapacity` .
       */
      public fun throughputCapacity(throughputCapacity: Number)

      /**
       * @param throughputCapacityPerHaPair Use to choose the throughput capacity per HA pair,
       * rather than the total throughput for the file system.
       * You can define either the `ThroughputCapacityPerHAPair` or the `ThroughputCapacity` when
       * creating a file system, but not both.
       *
       * This field and `ThroughputCapacity` are the same for scale-up file systems powered by one
       * HA pair.
       *
       * * For `SINGLE_AZ_1` and `MULTI_AZ_1` file systems, valid values are 128, 256, 512, 1024,
       * 2048, or 4096 MBps.
       * * For `SINGLE_AZ_2` file systems, valid values are 3072 or 6144 MBps.
       *
       * Amazon FSx responds with an HTTP status code 400 (Bad Request) for the following
       * conditions:
       *
       * * The value of `ThroughputCapacity` and `ThroughputCapacityPerHAPair` are not the same
       * value for file systems with one HA pair.
       * * The value of deployment type is `SINGLE_AZ_2` and `ThroughputCapacity` /
       * `ThroughputCapacityPerHAPair` is a valid HA pair (a value between 2 and 12).
       * * The value of `ThroughputCapacityPerHAPair` is not a valid value.
       */
      public fun throughputCapacityPerHaPair(throughputCapacityPerHaPair: Number)

      /**
       * @param weeklyMaintenanceStartTime A recurring weekly time, in the format `D:HH:MM` .
       * `D` is the day of the week, for which 1 represents Monday and 7 represents Sunday. For
       * further details, see [the ISO-8601 spec as described on
       * Wikipedia](https://docs.aws.amazon.com/https://en.wikipedia.org/wiki/ISO_week_date) .
       *
       * `HH` is the zero-padded hour of the day (0-23), and `MM` is the zero-padded minute of the
       * hour.
       *
       * For example, `1:05:00` specifies maintenance at 5 AM Monday.
       */
      public fun weeklyMaintenanceStartTime(weeklyMaintenanceStartTime: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.fsx.CfnFileSystem.OntapConfigurationProperty.Builder =
          software.amazon.awscdk.services.fsx.CfnFileSystem.OntapConfigurationProperty.builder()

      /**
       * @param automaticBackupRetentionDays The number of days to retain automatic backups.
       * Setting this property to `0` disables automatic backups. You can retain automatic backups
       * for a maximum of 90 days. The default is `30` .
       */
      override fun automaticBackupRetentionDays(automaticBackupRetentionDays: Number) {
        cdkBuilder.automaticBackupRetentionDays(automaticBackupRetentionDays)
      }

      /**
       * @param dailyAutomaticBackupStartTime A recurring daily time, in the format `HH:MM` .
       * `HH` is the zero-padded hour of the day (0-23), and `MM` is the zero-padded minute of the
       * hour. For example, `05:00` specifies 5 AM daily.
       */
      override fun dailyAutomaticBackupStartTime(dailyAutomaticBackupStartTime: String) {
        cdkBuilder.dailyAutomaticBackupStartTime(dailyAutomaticBackupStartTime)
      }

      /**
       * @param deploymentType Specifies the FSx for ONTAP file system deployment type to use in
       * creating the file system. 
       * * `MULTI_AZ_1` - (Default) A high availability file system configured for Multi-AZ
       * redundancy to tolerate temporary Availability Zone (AZ) unavailability.
       * * `SINGLE_AZ_1` - A file system configured for Single-AZ redundancy.
       * * `SINGLE_AZ_2` - A file system configured with multiple high-availability (HA) pairs for
       * Single-AZ redundancy.
       *
       * For information about the use cases for Multi-AZ and Single-AZ deployments, refer to
       * [Choosing a file system deployment
       * type](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/high-availability-AZ.html) .
       */
      override fun deploymentType(deploymentType: String) {
        cdkBuilder.deploymentType(deploymentType)
      }

      /**
       * @param diskIopsConfiguration The SSD IOPS configuration for the FSx for ONTAP file system.
       */
      override fun diskIopsConfiguration(diskIopsConfiguration: IResolvable) {
        cdkBuilder.diskIopsConfiguration(diskIopsConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param diskIopsConfiguration The SSD IOPS configuration for the FSx for ONTAP file system.
       */
      override fun diskIopsConfiguration(diskIopsConfiguration: DiskIopsConfigurationProperty) {
        cdkBuilder.diskIopsConfiguration(diskIopsConfiguration.let(DiskIopsConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param diskIopsConfiguration The SSD IOPS configuration for the FSx for ONTAP file system.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fa848444d8fe815186bb9a42535c50f3de4891f0bb7fd7cc4082410a54d93baa")
      override
          fun diskIopsConfiguration(diskIopsConfiguration: DiskIopsConfigurationProperty.Builder.() -> Unit):
          Unit = diskIopsConfiguration(DiskIopsConfigurationProperty(diskIopsConfiguration))

      /**
       * @param endpointIpAddressRange (Multi-AZ only) Specifies the IP address range in which the
       * endpoints to access your file system will be created.
       * By default in the Amazon FSx API, Amazon FSx selects an unused IP address range for you
       * from the 198.19.* range. By default in the Amazon FSx console, Amazon FSx chooses the last 64
       * IP addresses from the VPC’s primary CIDR range to use as the endpoint IP address range for the
       * file system. You can have overlapping endpoint IP addresses for file systems deployed in the
       * same VPC/route tables, as long as they don't overlap with any subnet.
       */
      override fun endpointIpAddressRange(endpointIpAddressRange: String) {
        cdkBuilder.endpointIpAddressRange(endpointIpAddressRange)
      }

      /**
       * @param fsxAdminPassword The ONTAP administrative password for the `fsxadmin` user with
       * which you administer your file system using the NetApp ONTAP CLI and REST API.
       */
      override fun fsxAdminPassword(fsxAdminPassword: String) {
        cdkBuilder.fsxAdminPassword(fsxAdminPassword)
      }

      /**
       * @param haPairs Specifies how many high-availability (HA) pairs of file servers will power
       * your file system.
       * Scale-up file systems are powered by 1 HA pair. The default value is 1. FSx for ONTAP
       * scale-out file systems are powered by up to 12 HA pairs. The value of this property affects
       * the values of `StorageCapacity` , `Iops` , and `ThroughputCapacity` . For more information,
       * see [High-availability (HA)
       * pairs](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/HA-pairs.html) in the FSx for ONTAP
       * user guide.
       *
       * Amazon FSx responds with an HTTP status code 400 (Bad Request) for the following
       * conditions:
       *
       * * The value of `HAPairs` is less than 1 or greater than 12.
       * * The value of `HAPairs` is greater than 1 and the value of `DeploymentType` is
       * `SINGLE_AZ_1` or `MULTI_AZ_1` .
       */
      override fun haPairs(haPairs: Number) {
        cdkBuilder.haPairs(haPairs)
      }

      /**
       * @param preferredSubnetId Required when `DeploymentType` is set to `MULTI_AZ_1` .
       * This specifies the subnet in which you want the preferred file server to be located.
       */
      override fun preferredSubnetId(preferredSubnetId: String) {
        cdkBuilder.preferredSubnetId(preferredSubnetId)
      }

      /**
       * @param routeTableIds (Multi-AZ only) Specifies the route tables in which Amazon FSx creates
       * the rules for routing traffic to the correct file server.
       * You should specify all virtual private cloud (VPC) route tables associated with the subnets
       * in which your clients are located. By default, Amazon FSx selects your VPC's default route
       * table.
       *
       *
       * Amazon FSx manages these route tables for Multi-AZ file systems using tag-based
       * authentication. These route tables are tagged with `Key: AmazonFSx; Value: ManagedByAmazonFSx`
       * . When creating FSx for ONTAP Multi-AZ file systems using AWS CloudFormation we recommend that
       * you add the `Key: AmazonFSx; Value: ManagedByAmazonFSx` tag manually.
       */
      override fun routeTableIds(routeTableIds: List<String>) {
        cdkBuilder.routeTableIds(routeTableIds)
      }

      /**
       * @param routeTableIds (Multi-AZ only) Specifies the route tables in which Amazon FSx creates
       * the rules for routing traffic to the correct file server.
       * You should specify all virtual private cloud (VPC) route tables associated with the subnets
       * in which your clients are located. By default, Amazon FSx selects your VPC's default route
       * table.
       *
       *
       * Amazon FSx manages these route tables for Multi-AZ file systems using tag-based
       * authentication. These route tables are tagged with `Key: AmazonFSx; Value: ManagedByAmazonFSx`
       * . When creating FSx for ONTAP Multi-AZ file systems using AWS CloudFormation we recommend that
       * you add the `Key: AmazonFSx; Value: ManagedByAmazonFSx` tag manually.
       */
      override fun routeTableIds(vararg routeTableIds: String): Unit =
          routeTableIds(routeTableIds.toList())

      /**
       * @param throughputCapacity Sets the throughput capacity for the file system that you're
       * creating in megabytes per second (MBps).
       * For more information, see [Managing throughput
       * capacity](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/managing-throughput-capacity.html)
       * in the FSx for ONTAP User Guide.
       *
       * Amazon FSx responds with an HTTP status code 400 (Bad Request) for the following
       * conditions:
       *
       * * The value of `ThroughputCapacity` and `ThroughputCapacityPerHAPair` are not the same
       * value.
       * * The value of `ThroughputCapacity` when divided by the value of `HAPairs` is outside of
       * the valid range for `ThroughputCapacity` .
       */
      override fun throughputCapacity(throughputCapacity: Number) {
        cdkBuilder.throughputCapacity(throughputCapacity)
      }

      /**
       * @param throughputCapacityPerHaPair Use to choose the throughput capacity per HA pair,
       * rather than the total throughput for the file system.
       * You can define either the `ThroughputCapacityPerHAPair` or the `ThroughputCapacity` when
       * creating a file system, but not both.
       *
       * This field and `ThroughputCapacity` are the same for scale-up file systems powered by one
       * HA pair.
       *
       * * For `SINGLE_AZ_1` and `MULTI_AZ_1` file systems, valid values are 128, 256, 512, 1024,
       * 2048, or 4096 MBps.
       * * For `SINGLE_AZ_2` file systems, valid values are 3072 or 6144 MBps.
       *
       * Amazon FSx responds with an HTTP status code 400 (Bad Request) for the following
       * conditions:
       *
       * * The value of `ThroughputCapacity` and `ThroughputCapacityPerHAPair` are not the same
       * value for file systems with one HA pair.
       * * The value of deployment type is `SINGLE_AZ_2` and `ThroughputCapacity` /
       * `ThroughputCapacityPerHAPair` is a valid HA pair (a value between 2 and 12).
       * * The value of `ThroughputCapacityPerHAPair` is not a valid value.
       */
      override fun throughputCapacityPerHaPair(throughputCapacityPerHaPair: Number) {
        cdkBuilder.throughputCapacityPerHaPair(throughputCapacityPerHaPair)
      }

      /**
       * @param weeklyMaintenanceStartTime A recurring weekly time, in the format `D:HH:MM` .
       * `D` is the day of the week, for which 1 represents Monday and 7 represents Sunday. For
       * further details, see [the ISO-8601 spec as described on
       * Wikipedia](https://docs.aws.amazon.com/https://en.wikipedia.org/wiki/ISO_week_date) .
       *
       * `HH` is the zero-padded hour of the day (0-23), and `MM` is the zero-padded minute of the
       * hour.
       *
       * For example, `1:05:00` specifies maintenance at 5 AM Monday.
       */
      override fun weeklyMaintenanceStartTime(weeklyMaintenanceStartTime: String) {
        cdkBuilder.weeklyMaintenanceStartTime(weeklyMaintenanceStartTime)
      }

      public fun build():
          software.amazon.awscdk.services.fsx.CfnFileSystem.OntapConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.fsx.CfnFileSystem.OntapConfigurationProperty,
    ) : CdkObject(cdkObject), OntapConfigurationProperty {
      /**
       * The number of days to retain automatic backups.
       *
       * Setting this property to `0` disables automatic backups. You can retain automatic backups
       * for a maximum of 90 days. The default is `30` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-ontapconfiguration.html#cfn-fsx-filesystem-ontapconfiguration-automaticbackupretentiondays)
       */
      override fun automaticBackupRetentionDays(): Number? =
          unwrap(this).getAutomaticBackupRetentionDays()

      /**
       * A recurring daily time, in the format `HH:MM` .
       *
       * `HH` is the zero-padded hour of the day (0-23), and `MM` is the zero-padded minute of the
       * hour. For example, `05:00` specifies 5 AM daily.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-ontapconfiguration.html#cfn-fsx-filesystem-ontapconfiguration-dailyautomaticbackupstarttime)
       */
      override fun dailyAutomaticBackupStartTime(): String? =
          unwrap(this).getDailyAutomaticBackupStartTime()

      /**
       * Specifies the FSx for ONTAP file system deployment type to use in creating the file system.
       *
       * * `MULTI_AZ_1` - (Default) A high availability file system configured for Multi-AZ
       * redundancy to tolerate temporary Availability Zone (AZ) unavailability.
       * * `SINGLE_AZ_1` - A file system configured for Single-AZ redundancy.
       * * `SINGLE_AZ_2` - A file system configured with multiple high-availability (HA) pairs for
       * Single-AZ redundancy.
       *
       * For information about the use cases for Multi-AZ and Single-AZ deployments, refer to
       * [Choosing a file system deployment
       * type](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/high-availability-AZ.html) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-ontapconfiguration.html#cfn-fsx-filesystem-ontapconfiguration-deploymenttype)
       */
      override fun deploymentType(): String = unwrap(this).getDeploymentType()

      /**
       * The SSD IOPS configuration for the FSx for ONTAP file system.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-ontapconfiguration.html#cfn-fsx-filesystem-ontapconfiguration-diskiopsconfiguration)
       */
      override fun diskIopsConfiguration(): Any? = unwrap(this).getDiskIopsConfiguration()

      /**
       * (Multi-AZ only) Specifies the IP address range in which the endpoints to access your file
       * system will be created.
       *
       * By default in the Amazon FSx API, Amazon FSx selects an unused IP address range for you
       * from the 198.19.* range. By default in the Amazon FSx console, Amazon FSx chooses the last 64
       * IP addresses from the VPC’s primary CIDR range to use as the endpoint IP address range for the
       * file system. You can have overlapping endpoint IP addresses for file systems deployed in the
       * same VPC/route tables, as long as they don't overlap with any subnet.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-ontapconfiguration.html#cfn-fsx-filesystem-ontapconfiguration-endpointipaddressrange)
       */
      override fun endpointIpAddressRange(): String? = unwrap(this).getEndpointIpAddressRange()

      /**
       * The ONTAP administrative password for the `fsxadmin` user with which you administer your
       * file system using the NetApp ONTAP CLI and REST API.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-ontapconfiguration.html#cfn-fsx-filesystem-ontapconfiguration-fsxadminpassword)
       */
      override fun fsxAdminPassword(): String? = unwrap(this).getFsxAdminPassword()

      /**
       * Specifies how many high-availability (HA) pairs of file servers will power your file
       * system.
       *
       * Scale-up file systems are powered by 1 HA pair. The default value is 1. FSx for ONTAP
       * scale-out file systems are powered by up to 12 HA pairs. The value of this property affects
       * the values of `StorageCapacity` , `Iops` , and `ThroughputCapacity` . For more information,
       * see [High-availability (HA)
       * pairs](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/HA-pairs.html) in the FSx for ONTAP
       * user guide.
       *
       * Amazon FSx responds with an HTTP status code 400 (Bad Request) for the following
       * conditions:
       *
       * * The value of `HAPairs` is less than 1 or greater than 12.
       * * The value of `HAPairs` is greater than 1 and the value of `DeploymentType` is
       * `SINGLE_AZ_1` or `MULTI_AZ_1` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-ontapconfiguration.html#cfn-fsx-filesystem-ontapconfiguration-hapairs)
       */
      override fun haPairs(): Number? = unwrap(this).getHaPairs()

      /**
       * Required when `DeploymentType` is set to `MULTI_AZ_1` .
       *
       * This specifies the subnet in which you want the preferred file server to be located.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-ontapconfiguration.html#cfn-fsx-filesystem-ontapconfiguration-preferredsubnetid)
       */
      override fun preferredSubnetId(): String? = unwrap(this).getPreferredSubnetId()

      /**
       * (Multi-AZ only) Specifies the route tables in which Amazon FSx creates the rules for
       * routing traffic to the correct file server.
       *
       * You should specify all virtual private cloud (VPC) route tables associated with the subnets
       * in which your clients are located. By default, Amazon FSx selects your VPC's default route
       * table.
       *
       *
       * Amazon FSx manages these route tables for Multi-AZ file systems using tag-based
       * authentication. These route tables are tagged with `Key: AmazonFSx; Value: ManagedByAmazonFSx`
       * . When creating FSx for ONTAP Multi-AZ file systems using AWS CloudFormation we recommend that
       * you add the `Key: AmazonFSx; Value: ManagedByAmazonFSx` tag manually.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-ontapconfiguration.html#cfn-fsx-filesystem-ontapconfiguration-routetableids)
       */
      override fun routeTableIds(): List<String> = unwrap(this).getRouteTableIds() ?: emptyList()

      /**
       * Sets the throughput capacity for the file system that you're creating in megabytes per
       * second (MBps).
       *
       * For more information, see [Managing throughput
       * capacity](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/managing-throughput-capacity.html)
       * in the FSx for ONTAP User Guide.
       *
       * Amazon FSx responds with an HTTP status code 400 (Bad Request) for the following
       * conditions:
       *
       * * The value of `ThroughputCapacity` and `ThroughputCapacityPerHAPair` are not the same
       * value.
       * * The value of `ThroughputCapacity` when divided by the value of `HAPairs` is outside of
       * the valid range for `ThroughputCapacity` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-ontapconfiguration.html#cfn-fsx-filesystem-ontapconfiguration-throughputcapacity)
       */
      override fun throughputCapacity(): Number? = unwrap(this).getThroughputCapacity()

      /**
       * Use to choose the throughput capacity per HA pair, rather than the total throughput for the
       * file system.
       *
       * You can define either the `ThroughputCapacityPerHAPair` or the `ThroughputCapacity` when
       * creating a file system, but not both.
       *
       * This field and `ThroughputCapacity` are the same for scale-up file systems powered by one
       * HA pair.
       *
       * * For `SINGLE_AZ_1` and `MULTI_AZ_1` file systems, valid values are 128, 256, 512, 1024,
       * 2048, or 4096 MBps.
       * * For `SINGLE_AZ_2` file systems, valid values are 3072 or 6144 MBps.
       *
       * Amazon FSx responds with an HTTP status code 400 (Bad Request) for the following
       * conditions:
       *
       * * The value of `ThroughputCapacity` and `ThroughputCapacityPerHAPair` are not the same
       * value for file systems with one HA pair.
       * * The value of deployment type is `SINGLE_AZ_2` and `ThroughputCapacity` /
       * `ThroughputCapacityPerHAPair` is a valid HA pair (a value between 2 and 12).
       * * The value of `ThroughputCapacityPerHAPair` is not a valid value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-ontapconfiguration.html#cfn-fsx-filesystem-ontapconfiguration-throughputcapacityperhapair)
       */
      override fun throughputCapacityPerHaPair(): Number? =
          unwrap(this).getThroughputCapacityPerHaPair()

      /**
       * A recurring weekly time, in the format `D:HH:MM` .
       *
       * `D` is the day of the week, for which 1 represents Monday and 7 represents Sunday. For
       * further details, see [the ISO-8601 spec as described on
       * Wikipedia](https://docs.aws.amazon.com/https://en.wikipedia.org/wiki/ISO_week_date) .
       *
       * `HH` is the zero-padded hour of the day (0-23), and `MM` is the zero-padded minute of the
       * hour.
       *
       * For example, `1:05:00` specifies maintenance at 5 AM Monday.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-ontapconfiguration.html#cfn-fsx-filesystem-ontapconfiguration-weeklymaintenancestarttime)
       */
      override fun weeklyMaintenanceStartTime(): String? =
          unwrap(this).getWeeklyMaintenanceStartTime()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OntapConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.fsx.CfnFileSystem.OntapConfigurationProperty):
          OntapConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          OntapConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: OntapConfigurationProperty):
          software.amazon.awscdk.services.fsx.CfnFileSystem.OntapConfigurationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.fsx.CfnFileSystem.OntapConfigurationProperty
    }
  }

  /**
   * The OpenZFS configuration for the file system that's being created.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.fsx.*;
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
   * .endpointIpAddressRange("endpointIpAddressRange")
   * .options(List.of("options"))
   * .preferredSubnetId("preferredSubnetId")
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-openzfsconfiguration.html)
   */
  public interface OpenZFSConfigurationProperty {
    /**
     * The number of days to retain automatic backups.
     *
     * Setting this property to `0` disables automatic backups. You can retain automatic backups for
     * a maximum of 90 days. The default is `30` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-openzfsconfiguration.html#cfn-fsx-filesystem-openzfsconfiguration-automaticbackupretentiondays)
     */
    public fun automaticBackupRetentionDays(): Number? =
        unwrap(this).getAutomaticBackupRetentionDays()

    /**
     * A Boolean value indicating whether tags for the file system should be copied to backups.
     *
     * This value defaults to `false` . If it's set to `true` , all tags for the file system are
     * copied to all automatic and user-initiated backups where the user doesn't specify tags. If this
     * value is `true` , and you specify one or more tags, only the specified tags are copied to
     * backups. If you specify one or more tags when creating a user-initiated backup, no tags are
     * copied from the file system, regardless of this value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-openzfsconfiguration.html#cfn-fsx-filesystem-openzfsconfiguration-copytagstobackups)
     */
    public fun copyTagsToBackups(): Any? = unwrap(this).getCopyTagsToBackups()

    /**
     * A Boolean value indicating whether tags for the file system should be copied to volumes.
     *
     * This value defaults to `false` . If it's set to `true` , all tags for the file system are
     * copied to volumes where the user doesn't specify tags. If this value is `true` , and you specify
     * one or more tags, only the specified tags are copied to volumes. If you specify one or more tags
     * when creating the volume, no tags are copied from the file system, regardless of this value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-openzfsconfiguration.html#cfn-fsx-filesystem-openzfsconfiguration-copytagstovolumes)
     */
    public fun copyTagsToVolumes(): Any? = unwrap(this).getCopyTagsToVolumes()

    /**
     * A recurring daily time, in the format `HH:MM` .
     *
     * `HH` is the zero-padded hour of the day (0-23), and `MM` is the zero-padded minute of the
     * hour. For example, `05:00` specifies 5 AM daily.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-openzfsconfiguration.html#cfn-fsx-filesystem-openzfsconfiguration-dailyautomaticbackupstarttime)
     */
    public fun dailyAutomaticBackupStartTime(): String? =
        unwrap(this).getDailyAutomaticBackupStartTime()

    /**
     * Specifies the file system deployment type.
     *
     * Single AZ deployment types are configured for redundancy within a single Availability Zone in
     * an AWS Region . Valid values are the following:
     *
     * * `MULTI_AZ_1` - Creates file systems with high availability that are configured for Multi-AZ
     * redundancy to tolerate temporary unavailability in Availability Zones (AZs). `Multi_AZ_1` is
     * available only in the US East (N. Virginia), US East (Ohio), US West (Oregon), Asia Pacific
     * (Singapore), Asia Pacific (Tokyo), and Europe (Ireland) AWS Regions .
     * * `SINGLE_AZ_1` - Creates file systems with throughput capacities of 64 - 4,096 MB/s.
     * `Single_AZ_1` is available in all AWS Regions where Amazon FSx for OpenZFS is available.
     * * `SINGLE_AZ_2` - Creates file systems with throughput capacities of 160 - 10,240 MB/s using
     * an NVMe L2ARC cache. `Single_AZ_2` is available only in the US East (N. Virginia), US East
     * (Ohio), US West (Oregon), Asia Pacific (Singapore), Asia Pacific (Tokyo), and Europe (Ireland)
     * AWS Regions .
     *
     * For more information, see [Deployment type
     * availability](https://docs.aws.amazon.com/fsx/latest/OpenZFSGuide/availability-durability.html#available-aws-regions)
     * and [File system
     * performance](https://docs.aws.amazon.com/fsx/latest/OpenZFSGuide/performance.html#zfs-fs-performance)
     * in the *Amazon FSx for OpenZFS User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-openzfsconfiguration.html#cfn-fsx-filesystem-openzfsconfiguration-deploymenttype)
     */
    public fun deploymentType(): String

    /**
     * The SSD IOPS (input/output operations per second) configuration for an Amazon FSx for NetApp
     * ONTAP, Amazon FSx for Windows File Server, or FSx for OpenZFS file system.
     *
     * By default, Amazon FSx automatically provisions 3 IOPS per GB of storage capacity. You can
     * provision additional IOPS per GB of storage. The configuration consists of the total number of
     * provisioned SSD IOPS and how it is was provisioned, or the mode (by the customer or by Amazon
     * FSx).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-openzfsconfiguration.html#cfn-fsx-filesystem-openzfsconfiguration-diskiopsconfiguration)
     */
    public fun diskIopsConfiguration(): Any? = unwrap(this).getDiskIopsConfiguration()

    /**
     * (Multi-AZ only) Specifies the IP address range in which the endpoints to access your file
     * system will be created.
     *
     * By default in the Amazon FSx API and Amazon FSx console, Amazon FSx selects an available /28
     * IP address range for you from one of the VPC's CIDR ranges. You can have overlapping endpoint IP
     * addresses for file systems deployed in the same VPC/route tables.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-openzfsconfiguration.html#cfn-fsx-filesystem-openzfsconfiguration-endpointipaddressrange)
     */
    public fun endpointIpAddressRange(): String? = unwrap(this).getEndpointIpAddressRange()

    /**
     * To delete a file system if there are child volumes present below the root volume, use the
     * string `DELETE_CHILD_VOLUMES_AND_SNAPSHOTS` .
     *
     * If your file system has child volumes and you don't use this option, the delete request will
     * fail.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-openzfsconfiguration.html#cfn-fsx-filesystem-openzfsconfiguration-options)
     */
    public fun options(): List<String> = unwrap(this).getOptions() ?: emptyList()

    /**
     * Required when `DeploymentType` is set to `MULTI_AZ_1` .
     *
     * This specifies the subnet in which you want the preferred file server to be located.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-openzfsconfiguration.html#cfn-fsx-filesystem-openzfsconfiguration-preferredsubnetid)
     */
    public fun preferredSubnetId(): String? = unwrap(this).getPreferredSubnetId()

    /**
     * The configuration Amazon FSx uses when creating the root value of the Amazon FSx for OpenZFS
     * file system.
     *
     * All volumes are children of the root volume.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-openzfsconfiguration.html#cfn-fsx-filesystem-openzfsconfiguration-rootvolumeconfiguration)
     */
    public fun rootVolumeConfiguration(): Any? = unwrap(this).getRootVolumeConfiguration()

    /**
     * (Multi-AZ only) Specifies the route tables in which Amazon FSx creates the rules for routing
     * traffic to the correct file server.
     *
     * You should specify all virtual private cloud (VPC) route tables associated with the subnets
     * in which your clients are located. By default, Amazon FSx selects your VPC's default route
     * table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-openzfsconfiguration.html#cfn-fsx-filesystem-openzfsconfiguration-routetableids)
     */
    public fun routeTableIds(): List<String> = unwrap(this).getRouteTableIds() ?: emptyList()

    /**
     * Specifies the throughput of an Amazon FSx for OpenZFS file system, measured in megabytes per
     * second (MBps).
     *
     * Valid values depend on the DeploymentType you choose, as follows:
     *
     * * For `MULTI_AZ_1` and `SINGLE_AZ_2` , valid values are 160, 320, 640, 1280, 2560, 3840,
     * 5120, 7680, or 10240 MBps.
     * * For `SINGLE_AZ_1` , valid values are 64, 128, 256, 512, 1024, 2048, 3072, or 4096 MBps.
     *
     * You pay for additional throughput capacity that you provision.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-openzfsconfiguration.html#cfn-fsx-filesystem-openzfsconfiguration-throughputcapacity)
     */
    public fun throughputCapacity(): Number? = unwrap(this).getThroughputCapacity()

    /**
     * A recurring weekly time, in the format `D:HH:MM` .
     *
     * `D` is the day of the week, for which 1 represents Monday and 7 represents Sunday. For
     * further details, see [the ISO-8601 spec as described on
     * Wikipedia](https://docs.aws.amazon.com/https://en.wikipedia.org/wiki/ISO_week_date) .
     *
     * `HH` is the zero-padded hour of the day (0-23), and `MM` is the zero-padded minute of the
     * hour.
     *
     * For example, `1:05:00` specifies maintenance at 5 AM Monday.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-openzfsconfiguration.html#cfn-fsx-filesystem-openzfsconfiguration-weeklymaintenancestarttime)
     */
    public fun weeklyMaintenanceStartTime(): String? = unwrap(this).getWeeklyMaintenanceStartTime()

    /**
     * A builder for [OpenZFSConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param automaticBackupRetentionDays The number of days to retain automatic backups.
       * Setting this property to `0` disables automatic backups. You can retain automatic backups
       * for a maximum of 90 days. The default is `30` .
       */
      public fun automaticBackupRetentionDays(automaticBackupRetentionDays: Number)

      /**
       * @param copyTagsToBackups A Boolean value indicating whether tags for the file system should
       * be copied to backups.
       * This value defaults to `false` . If it's set to `true` , all tags for the file system are
       * copied to all automatic and user-initiated backups where the user doesn't specify tags. If
       * this value is `true` , and you specify one or more tags, only the specified tags are copied to
       * backups. If you specify one or more tags when creating a user-initiated backup, no tags are
       * copied from the file system, regardless of this value.
       */
      public fun copyTagsToBackups(copyTagsToBackups: Boolean)

      /**
       * @param copyTagsToBackups A Boolean value indicating whether tags for the file system should
       * be copied to backups.
       * This value defaults to `false` . If it's set to `true` , all tags for the file system are
       * copied to all automatic and user-initiated backups where the user doesn't specify tags. If
       * this value is `true` , and you specify one or more tags, only the specified tags are copied to
       * backups. If you specify one or more tags when creating a user-initiated backup, no tags are
       * copied from the file system, regardless of this value.
       */
      public fun copyTagsToBackups(copyTagsToBackups: IResolvable)

      /**
       * @param copyTagsToVolumes A Boolean value indicating whether tags for the file system should
       * be copied to volumes.
       * This value defaults to `false` . If it's set to `true` , all tags for the file system are
       * copied to volumes where the user doesn't specify tags. If this value is `true` , and you
       * specify one or more tags, only the specified tags are copied to volumes. If you specify one or
       * more tags when creating the volume, no tags are copied from the file system, regardless of
       * this value.
       */
      public fun copyTagsToVolumes(copyTagsToVolumes: Boolean)

      /**
       * @param copyTagsToVolumes A Boolean value indicating whether tags for the file system should
       * be copied to volumes.
       * This value defaults to `false` . If it's set to `true` , all tags for the file system are
       * copied to volumes where the user doesn't specify tags. If this value is `true` , and you
       * specify one or more tags, only the specified tags are copied to volumes. If you specify one or
       * more tags when creating the volume, no tags are copied from the file system, regardless of
       * this value.
       */
      public fun copyTagsToVolumes(copyTagsToVolumes: IResolvable)

      /**
       * @param dailyAutomaticBackupStartTime A recurring daily time, in the format `HH:MM` .
       * `HH` is the zero-padded hour of the day (0-23), and `MM` is the zero-padded minute of the
       * hour. For example, `05:00` specifies 5 AM daily.
       */
      public fun dailyAutomaticBackupStartTime(dailyAutomaticBackupStartTime: String)

      /**
       * @param deploymentType Specifies the file system deployment type. 
       * Single AZ deployment types are configured for redundancy within a single Availability Zone
       * in an AWS Region . Valid values are the following:
       *
       * * `MULTI_AZ_1` - Creates file systems with high availability that are configured for
       * Multi-AZ redundancy to tolerate temporary unavailability in Availability Zones (AZs).
       * `Multi_AZ_1` is available only in the US East (N. Virginia), US East (Ohio), US West (Oregon),
       * Asia Pacific (Singapore), Asia Pacific (Tokyo), and Europe (Ireland) AWS Regions .
       * * `SINGLE_AZ_1` - Creates file systems with throughput capacities of 64 - 4,096 MB/s.
       * `Single_AZ_1` is available in all AWS Regions where Amazon FSx for OpenZFS is available.
       * * `SINGLE_AZ_2` - Creates file systems with throughput capacities of 160 - 10,240 MB/s
       * using an NVMe L2ARC cache. `Single_AZ_2` is available only in the US East (N. Virginia), US
       * East (Ohio), US West (Oregon), Asia Pacific (Singapore), Asia Pacific (Tokyo), and Europe
       * (Ireland) AWS Regions .
       *
       * For more information, see [Deployment type
       * availability](https://docs.aws.amazon.com/fsx/latest/OpenZFSGuide/availability-durability.html#available-aws-regions)
       * and [File system
       * performance](https://docs.aws.amazon.com/fsx/latest/OpenZFSGuide/performance.html#zfs-fs-performance)
       * in the *Amazon FSx for OpenZFS User Guide* .
       */
      public fun deploymentType(deploymentType: String)

      /**
       * @param diskIopsConfiguration The SSD IOPS (input/output operations per second)
       * configuration for an Amazon FSx for NetApp ONTAP, Amazon FSx for Windows File Server, or FSx
       * for OpenZFS file system.
       * By default, Amazon FSx automatically provisions 3 IOPS per GB of storage capacity. You can
       * provision additional IOPS per GB of storage. The configuration consists of the total number of
       * provisioned SSD IOPS and how it is was provisioned, or the mode (by the customer or by Amazon
       * FSx).
       */
      public fun diskIopsConfiguration(diskIopsConfiguration: IResolvable)

      /**
       * @param diskIopsConfiguration The SSD IOPS (input/output operations per second)
       * configuration for an Amazon FSx for NetApp ONTAP, Amazon FSx for Windows File Server, or FSx
       * for OpenZFS file system.
       * By default, Amazon FSx automatically provisions 3 IOPS per GB of storage capacity. You can
       * provision additional IOPS per GB of storage. The configuration consists of the total number of
       * provisioned SSD IOPS and how it is was provisioned, or the mode (by the customer or by Amazon
       * FSx).
       */
      public fun diskIopsConfiguration(diskIopsConfiguration: DiskIopsConfigurationProperty)

      /**
       * @param diskIopsConfiguration The SSD IOPS (input/output operations per second)
       * configuration for an Amazon FSx for NetApp ONTAP, Amazon FSx for Windows File Server, or FSx
       * for OpenZFS file system.
       * By default, Amazon FSx automatically provisions 3 IOPS per GB of storage capacity. You can
       * provision additional IOPS per GB of storage. The configuration consists of the total number of
       * provisioned SSD IOPS and how it is was provisioned, or the mode (by the customer or by Amazon
       * FSx).
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6599b9fa97fd21cf4a69f3d1ffebe3a6f1a1656042284dec261c2076d2c3e0fe")
      public
          fun diskIopsConfiguration(diskIopsConfiguration: DiskIopsConfigurationProperty.Builder.() -> Unit)

      /**
       * @param endpointIpAddressRange (Multi-AZ only) Specifies the IP address range in which the
       * endpoints to access your file system will be created.
       * By default in the Amazon FSx API and Amazon FSx console, Amazon FSx selects an available
       * /28 IP address range for you from one of the VPC's CIDR ranges. You can have overlapping
       * endpoint IP addresses for file systems deployed in the same VPC/route tables.
       */
      public fun endpointIpAddressRange(endpointIpAddressRange: String)

      /**
       * @param options To delete a file system if there are child volumes present below the root
       * volume, use the string `DELETE_CHILD_VOLUMES_AND_SNAPSHOTS` .
       * If your file system has child volumes and you don't use this option, the delete request
       * will fail.
       */
      public fun options(options: List<String>)

      /**
       * @param options To delete a file system if there are child volumes present below the root
       * volume, use the string `DELETE_CHILD_VOLUMES_AND_SNAPSHOTS` .
       * If your file system has child volumes and you don't use this option, the delete request
       * will fail.
       */
      public fun options(vararg options: String)

      /**
       * @param preferredSubnetId Required when `DeploymentType` is set to `MULTI_AZ_1` .
       * This specifies the subnet in which you want the preferred file server to be located.
       */
      public fun preferredSubnetId(preferredSubnetId: String)

      /**
       * @param rootVolumeConfiguration The configuration Amazon FSx uses when creating the root
       * value of the Amazon FSx for OpenZFS file system.
       * All volumes are children of the root volume.
       */
      public fun rootVolumeConfiguration(rootVolumeConfiguration: IResolvable)

      /**
       * @param rootVolumeConfiguration The configuration Amazon FSx uses when creating the root
       * value of the Amazon FSx for OpenZFS file system.
       * All volumes are children of the root volume.
       */
      public fun rootVolumeConfiguration(rootVolumeConfiguration: RootVolumeConfigurationProperty)

      /**
       * @param rootVolumeConfiguration The configuration Amazon FSx uses when creating the root
       * value of the Amazon FSx for OpenZFS file system.
       * All volumes are children of the root volume.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2698595964bd241ea977ee8dbad20601300443dc3fe31b8a47932a577ea24b76")
      public
          fun rootVolumeConfiguration(rootVolumeConfiguration: RootVolumeConfigurationProperty.Builder.() -> Unit)

      /**
       * @param routeTableIds (Multi-AZ only) Specifies the route tables in which Amazon FSx creates
       * the rules for routing traffic to the correct file server.
       * You should specify all virtual private cloud (VPC) route tables associated with the subnets
       * in which your clients are located. By default, Amazon FSx selects your VPC's default route
       * table.
       */
      public fun routeTableIds(routeTableIds: List<String>)

      /**
       * @param routeTableIds (Multi-AZ only) Specifies the route tables in which Amazon FSx creates
       * the rules for routing traffic to the correct file server.
       * You should specify all virtual private cloud (VPC) route tables associated with the subnets
       * in which your clients are located. By default, Amazon FSx selects your VPC's default route
       * table.
       */
      public fun routeTableIds(vararg routeTableIds: String)

      /**
       * @param throughputCapacity Specifies the throughput of an Amazon FSx for OpenZFS file
       * system, measured in megabytes per second (MBps).
       * Valid values depend on the DeploymentType you choose, as follows:
       *
       * * For `MULTI_AZ_1` and `SINGLE_AZ_2` , valid values are 160, 320, 640, 1280, 2560, 3840,
       * 5120, 7680, or 10240 MBps.
       * * For `SINGLE_AZ_1` , valid values are 64, 128, 256, 512, 1024, 2048, 3072, or 4096 MBps.
       *
       * You pay for additional throughput capacity that you provision.
       */
      public fun throughputCapacity(throughputCapacity: Number)

      /**
       * @param weeklyMaintenanceStartTime A recurring weekly time, in the format `D:HH:MM` .
       * `D` is the day of the week, for which 1 represents Monday and 7 represents Sunday. For
       * further details, see [the ISO-8601 spec as described on
       * Wikipedia](https://docs.aws.amazon.com/https://en.wikipedia.org/wiki/ISO_week_date) .
       *
       * `HH` is the zero-padded hour of the day (0-23), and `MM` is the zero-padded minute of the
       * hour.
       *
       * For example, `1:05:00` specifies maintenance at 5 AM Monday.
       */
      public fun weeklyMaintenanceStartTime(weeklyMaintenanceStartTime: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.fsx.CfnFileSystem.OpenZFSConfigurationProperty.Builder =
          software.amazon.awscdk.services.fsx.CfnFileSystem.OpenZFSConfigurationProperty.builder()

      /**
       * @param automaticBackupRetentionDays The number of days to retain automatic backups.
       * Setting this property to `0` disables automatic backups. You can retain automatic backups
       * for a maximum of 90 days. The default is `30` .
       */
      override fun automaticBackupRetentionDays(automaticBackupRetentionDays: Number) {
        cdkBuilder.automaticBackupRetentionDays(automaticBackupRetentionDays)
      }

      /**
       * @param copyTagsToBackups A Boolean value indicating whether tags for the file system should
       * be copied to backups.
       * This value defaults to `false` . If it's set to `true` , all tags for the file system are
       * copied to all automatic and user-initiated backups where the user doesn't specify tags. If
       * this value is `true` , and you specify one or more tags, only the specified tags are copied to
       * backups. If you specify one or more tags when creating a user-initiated backup, no tags are
       * copied from the file system, regardless of this value.
       */
      override fun copyTagsToBackups(copyTagsToBackups: Boolean) {
        cdkBuilder.copyTagsToBackups(copyTagsToBackups)
      }

      /**
       * @param copyTagsToBackups A Boolean value indicating whether tags for the file system should
       * be copied to backups.
       * This value defaults to `false` . If it's set to `true` , all tags for the file system are
       * copied to all automatic and user-initiated backups where the user doesn't specify tags. If
       * this value is `true` , and you specify one or more tags, only the specified tags are copied to
       * backups. If you specify one or more tags when creating a user-initiated backup, no tags are
       * copied from the file system, regardless of this value.
       */
      override fun copyTagsToBackups(copyTagsToBackups: IResolvable) {
        cdkBuilder.copyTagsToBackups(copyTagsToBackups.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param copyTagsToVolumes A Boolean value indicating whether tags for the file system should
       * be copied to volumes.
       * This value defaults to `false` . If it's set to `true` , all tags for the file system are
       * copied to volumes where the user doesn't specify tags. If this value is `true` , and you
       * specify one or more tags, only the specified tags are copied to volumes. If you specify one or
       * more tags when creating the volume, no tags are copied from the file system, regardless of
       * this value.
       */
      override fun copyTagsToVolumes(copyTagsToVolumes: Boolean) {
        cdkBuilder.copyTagsToVolumes(copyTagsToVolumes)
      }

      /**
       * @param copyTagsToVolumes A Boolean value indicating whether tags for the file system should
       * be copied to volumes.
       * This value defaults to `false` . If it's set to `true` , all tags for the file system are
       * copied to volumes where the user doesn't specify tags. If this value is `true` , and you
       * specify one or more tags, only the specified tags are copied to volumes. If you specify one or
       * more tags when creating the volume, no tags are copied from the file system, regardless of
       * this value.
       */
      override fun copyTagsToVolumes(copyTagsToVolumes: IResolvable) {
        cdkBuilder.copyTagsToVolumes(copyTagsToVolumes.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param dailyAutomaticBackupStartTime A recurring daily time, in the format `HH:MM` .
       * `HH` is the zero-padded hour of the day (0-23), and `MM` is the zero-padded minute of the
       * hour. For example, `05:00` specifies 5 AM daily.
       */
      override fun dailyAutomaticBackupStartTime(dailyAutomaticBackupStartTime: String) {
        cdkBuilder.dailyAutomaticBackupStartTime(dailyAutomaticBackupStartTime)
      }

      /**
       * @param deploymentType Specifies the file system deployment type. 
       * Single AZ deployment types are configured for redundancy within a single Availability Zone
       * in an AWS Region . Valid values are the following:
       *
       * * `MULTI_AZ_1` - Creates file systems with high availability that are configured for
       * Multi-AZ redundancy to tolerate temporary unavailability in Availability Zones (AZs).
       * `Multi_AZ_1` is available only in the US East (N. Virginia), US East (Ohio), US West (Oregon),
       * Asia Pacific (Singapore), Asia Pacific (Tokyo), and Europe (Ireland) AWS Regions .
       * * `SINGLE_AZ_1` - Creates file systems with throughput capacities of 64 - 4,096 MB/s.
       * `Single_AZ_1` is available in all AWS Regions where Amazon FSx for OpenZFS is available.
       * * `SINGLE_AZ_2` - Creates file systems with throughput capacities of 160 - 10,240 MB/s
       * using an NVMe L2ARC cache. `Single_AZ_2` is available only in the US East (N. Virginia), US
       * East (Ohio), US West (Oregon), Asia Pacific (Singapore), Asia Pacific (Tokyo), and Europe
       * (Ireland) AWS Regions .
       *
       * For more information, see [Deployment type
       * availability](https://docs.aws.amazon.com/fsx/latest/OpenZFSGuide/availability-durability.html#available-aws-regions)
       * and [File system
       * performance](https://docs.aws.amazon.com/fsx/latest/OpenZFSGuide/performance.html#zfs-fs-performance)
       * in the *Amazon FSx for OpenZFS User Guide* .
       */
      override fun deploymentType(deploymentType: String) {
        cdkBuilder.deploymentType(deploymentType)
      }

      /**
       * @param diskIopsConfiguration The SSD IOPS (input/output operations per second)
       * configuration for an Amazon FSx for NetApp ONTAP, Amazon FSx for Windows File Server, or FSx
       * for OpenZFS file system.
       * By default, Amazon FSx automatically provisions 3 IOPS per GB of storage capacity. You can
       * provision additional IOPS per GB of storage. The configuration consists of the total number of
       * provisioned SSD IOPS and how it is was provisioned, or the mode (by the customer or by Amazon
       * FSx).
       */
      override fun diskIopsConfiguration(diskIopsConfiguration: IResolvable) {
        cdkBuilder.diskIopsConfiguration(diskIopsConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param diskIopsConfiguration The SSD IOPS (input/output operations per second)
       * configuration for an Amazon FSx for NetApp ONTAP, Amazon FSx for Windows File Server, or FSx
       * for OpenZFS file system.
       * By default, Amazon FSx automatically provisions 3 IOPS per GB of storage capacity. You can
       * provision additional IOPS per GB of storage. The configuration consists of the total number of
       * provisioned SSD IOPS and how it is was provisioned, or the mode (by the customer or by Amazon
       * FSx).
       */
      override fun diskIopsConfiguration(diskIopsConfiguration: DiskIopsConfigurationProperty) {
        cdkBuilder.diskIopsConfiguration(diskIopsConfiguration.let(DiskIopsConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param diskIopsConfiguration The SSD IOPS (input/output operations per second)
       * configuration for an Amazon FSx for NetApp ONTAP, Amazon FSx for Windows File Server, or FSx
       * for OpenZFS file system.
       * By default, Amazon FSx automatically provisions 3 IOPS per GB of storage capacity. You can
       * provision additional IOPS per GB of storage. The configuration consists of the total number of
       * provisioned SSD IOPS and how it is was provisioned, or the mode (by the customer or by Amazon
       * FSx).
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6599b9fa97fd21cf4a69f3d1ffebe3a6f1a1656042284dec261c2076d2c3e0fe")
      override
          fun diskIopsConfiguration(diskIopsConfiguration: DiskIopsConfigurationProperty.Builder.() -> Unit):
          Unit = diskIopsConfiguration(DiskIopsConfigurationProperty(diskIopsConfiguration))

      /**
       * @param endpointIpAddressRange (Multi-AZ only) Specifies the IP address range in which the
       * endpoints to access your file system will be created.
       * By default in the Amazon FSx API and Amazon FSx console, Amazon FSx selects an available
       * /28 IP address range for you from one of the VPC's CIDR ranges. You can have overlapping
       * endpoint IP addresses for file systems deployed in the same VPC/route tables.
       */
      override fun endpointIpAddressRange(endpointIpAddressRange: String) {
        cdkBuilder.endpointIpAddressRange(endpointIpAddressRange)
      }

      /**
       * @param options To delete a file system if there are child volumes present below the root
       * volume, use the string `DELETE_CHILD_VOLUMES_AND_SNAPSHOTS` .
       * If your file system has child volumes and you don't use this option, the delete request
       * will fail.
       */
      override fun options(options: List<String>) {
        cdkBuilder.options(options)
      }

      /**
       * @param options To delete a file system if there are child volumes present below the root
       * volume, use the string `DELETE_CHILD_VOLUMES_AND_SNAPSHOTS` .
       * If your file system has child volumes and you don't use this option, the delete request
       * will fail.
       */
      override fun options(vararg options: String): Unit = options(options.toList())

      /**
       * @param preferredSubnetId Required when `DeploymentType` is set to `MULTI_AZ_1` .
       * This specifies the subnet in which you want the preferred file server to be located.
       */
      override fun preferredSubnetId(preferredSubnetId: String) {
        cdkBuilder.preferredSubnetId(preferredSubnetId)
      }

      /**
       * @param rootVolumeConfiguration The configuration Amazon FSx uses when creating the root
       * value of the Amazon FSx for OpenZFS file system.
       * All volumes are children of the root volume.
       */
      override fun rootVolumeConfiguration(rootVolumeConfiguration: IResolvable) {
        cdkBuilder.rootVolumeConfiguration(rootVolumeConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param rootVolumeConfiguration The configuration Amazon FSx uses when creating the root
       * value of the Amazon FSx for OpenZFS file system.
       * All volumes are children of the root volume.
       */
      override
          fun rootVolumeConfiguration(rootVolumeConfiguration: RootVolumeConfigurationProperty) {
        cdkBuilder.rootVolumeConfiguration(rootVolumeConfiguration.let(RootVolumeConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param rootVolumeConfiguration The configuration Amazon FSx uses when creating the root
       * value of the Amazon FSx for OpenZFS file system.
       * All volumes are children of the root volume.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2698595964bd241ea977ee8dbad20601300443dc3fe31b8a47932a577ea24b76")
      override
          fun rootVolumeConfiguration(rootVolumeConfiguration: RootVolumeConfigurationProperty.Builder.() -> Unit):
          Unit = rootVolumeConfiguration(RootVolumeConfigurationProperty(rootVolumeConfiguration))

      /**
       * @param routeTableIds (Multi-AZ only) Specifies the route tables in which Amazon FSx creates
       * the rules for routing traffic to the correct file server.
       * You should specify all virtual private cloud (VPC) route tables associated with the subnets
       * in which your clients are located. By default, Amazon FSx selects your VPC's default route
       * table.
       */
      override fun routeTableIds(routeTableIds: List<String>) {
        cdkBuilder.routeTableIds(routeTableIds)
      }

      /**
       * @param routeTableIds (Multi-AZ only) Specifies the route tables in which Amazon FSx creates
       * the rules for routing traffic to the correct file server.
       * You should specify all virtual private cloud (VPC) route tables associated with the subnets
       * in which your clients are located. By default, Amazon FSx selects your VPC's default route
       * table.
       */
      override fun routeTableIds(vararg routeTableIds: String): Unit =
          routeTableIds(routeTableIds.toList())

      /**
       * @param throughputCapacity Specifies the throughput of an Amazon FSx for OpenZFS file
       * system, measured in megabytes per second (MBps).
       * Valid values depend on the DeploymentType you choose, as follows:
       *
       * * For `MULTI_AZ_1` and `SINGLE_AZ_2` , valid values are 160, 320, 640, 1280, 2560, 3840,
       * 5120, 7680, or 10240 MBps.
       * * For `SINGLE_AZ_1` , valid values are 64, 128, 256, 512, 1024, 2048, 3072, or 4096 MBps.
       *
       * You pay for additional throughput capacity that you provision.
       */
      override fun throughputCapacity(throughputCapacity: Number) {
        cdkBuilder.throughputCapacity(throughputCapacity)
      }

      /**
       * @param weeklyMaintenanceStartTime A recurring weekly time, in the format `D:HH:MM` .
       * `D` is the day of the week, for which 1 represents Monday and 7 represents Sunday. For
       * further details, see [the ISO-8601 spec as described on
       * Wikipedia](https://docs.aws.amazon.com/https://en.wikipedia.org/wiki/ISO_week_date) .
       *
       * `HH` is the zero-padded hour of the day (0-23), and `MM` is the zero-padded minute of the
       * hour.
       *
       * For example, `1:05:00` specifies maintenance at 5 AM Monday.
       */
      override fun weeklyMaintenanceStartTime(weeklyMaintenanceStartTime: String) {
        cdkBuilder.weeklyMaintenanceStartTime(weeklyMaintenanceStartTime)
      }

      public fun build():
          software.amazon.awscdk.services.fsx.CfnFileSystem.OpenZFSConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.fsx.CfnFileSystem.OpenZFSConfigurationProperty,
    ) : CdkObject(cdkObject), OpenZFSConfigurationProperty {
      /**
       * The number of days to retain automatic backups.
       *
       * Setting this property to `0` disables automatic backups. You can retain automatic backups
       * for a maximum of 90 days. The default is `30` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-openzfsconfiguration.html#cfn-fsx-filesystem-openzfsconfiguration-automaticbackupretentiondays)
       */
      override fun automaticBackupRetentionDays(): Number? =
          unwrap(this).getAutomaticBackupRetentionDays()

      /**
       * A Boolean value indicating whether tags for the file system should be copied to backups.
       *
       * This value defaults to `false` . If it's set to `true` , all tags for the file system are
       * copied to all automatic and user-initiated backups where the user doesn't specify tags. If
       * this value is `true` , and you specify one or more tags, only the specified tags are copied to
       * backups. If you specify one or more tags when creating a user-initiated backup, no tags are
       * copied from the file system, regardless of this value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-openzfsconfiguration.html#cfn-fsx-filesystem-openzfsconfiguration-copytagstobackups)
       */
      override fun copyTagsToBackups(): Any? = unwrap(this).getCopyTagsToBackups()

      /**
       * A Boolean value indicating whether tags for the file system should be copied to volumes.
       *
       * This value defaults to `false` . If it's set to `true` , all tags for the file system are
       * copied to volumes where the user doesn't specify tags. If this value is `true` , and you
       * specify one or more tags, only the specified tags are copied to volumes. If you specify one or
       * more tags when creating the volume, no tags are copied from the file system, regardless of
       * this value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-openzfsconfiguration.html#cfn-fsx-filesystem-openzfsconfiguration-copytagstovolumes)
       */
      override fun copyTagsToVolumes(): Any? = unwrap(this).getCopyTagsToVolumes()

      /**
       * A recurring daily time, in the format `HH:MM` .
       *
       * `HH` is the zero-padded hour of the day (0-23), and `MM` is the zero-padded minute of the
       * hour. For example, `05:00` specifies 5 AM daily.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-openzfsconfiguration.html#cfn-fsx-filesystem-openzfsconfiguration-dailyautomaticbackupstarttime)
       */
      override fun dailyAutomaticBackupStartTime(): String? =
          unwrap(this).getDailyAutomaticBackupStartTime()

      /**
       * Specifies the file system deployment type.
       *
       * Single AZ deployment types are configured for redundancy within a single Availability Zone
       * in an AWS Region . Valid values are the following:
       *
       * * `MULTI_AZ_1` - Creates file systems with high availability that are configured for
       * Multi-AZ redundancy to tolerate temporary unavailability in Availability Zones (AZs).
       * `Multi_AZ_1` is available only in the US East (N. Virginia), US East (Ohio), US West (Oregon),
       * Asia Pacific (Singapore), Asia Pacific (Tokyo), and Europe (Ireland) AWS Regions .
       * * `SINGLE_AZ_1` - Creates file systems with throughput capacities of 64 - 4,096 MB/s.
       * `Single_AZ_1` is available in all AWS Regions where Amazon FSx for OpenZFS is available.
       * * `SINGLE_AZ_2` - Creates file systems with throughput capacities of 160 - 10,240 MB/s
       * using an NVMe L2ARC cache. `Single_AZ_2` is available only in the US East (N. Virginia), US
       * East (Ohio), US West (Oregon), Asia Pacific (Singapore), Asia Pacific (Tokyo), and Europe
       * (Ireland) AWS Regions .
       *
       * For more information, see [Deployment type
       * availability](https://docs.aws.amazon.com/fsx/latest/OpenZFSGuide/availability-durability.html#available-aws-regions)
       * and [File system
       * performance](https://docs.aws.amazon.com/fsx/latest/OpenZFSGuide/performance.html#zfs-fs-performance)
       * in the *Amazon FSx for OpenZFS User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-openzfsconfiguration.html#cfn-fsx-filesystem-openzfsconfiguration-deploymenttype)
       */
      override fun deploymentType(): String = unwrap(this).getDeploymentType()

      /**
       * The SSD IOPS (input/output operations per second) configuration for an Amazon FSx for
       * NetApp ONTAP, Amazon FSx for Windows File Server, or FSx for OpenZFS file system.
       *
       * By default, Amazon FSx automatically provisions 3 IOPS per GB of storage capacity. You can
       * provision additional IOPS per GB of storage. The configuration consists of the total number of
       * provisioned SSD IOPS and how it is was provisioned, or the mode (by the customer or by Amazon
       * FSx).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-openzfsconfiguration.html#cfn-fsx-filesystem-openzfsconfiguration-diskiopsconfiguration)
       */
      override fun diskIopsConfiguration(): Any? = unwrap(this).getDiskIopsConfiguration()

      /**
       * (Multi-AZ only) Specifies the IP address range in which the endpoints to access your file
       * system will be created.
       *
       * By default in the Amazon FSx API and Amazon FSx console, Amazon FSx selects an available
       * /28 IP address range for you from one of the VPC's CIDR ranges. You can have overlapping
       * endpoint IP addresses for file systems deployed in the same VPC/route tables.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-openzfsconfiguration.html#cfn-fsx-filesystem-openzfsconfiguration-endpointipaddressrange)
       */
      override fun endpointIpAddressRange(): String? = unwrap(this).getEndpointIpAddressRange()

      /**
       * To delete a file system if there are child volumes present below the root volume, use the
       * string `DELETE_CHILD_VOLUMES_AND_SNAPSHOTS` .
       *
       * If your file system has child volumes and you don't use this option, the delete request
       * will fail.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-openzfsconfiguration.html#cfn-fsx-filesystem-openzfsconfiguration-options)
       */
      override fun options(): List<String> = unwrap(this).getOptions() ?: emptyList()

      /**
       * Required when `DeploymentType` is set to `MULTI_AZ_1` .
       *
       * This specifies the subnet in which you want the preferred file server to be located.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-openzfsconfiguration.html#cfn-fsx-filesystem-openzfsconfiguration-preferredsubnetid)
       */
      override fun preferredSubnetId(): String? = unwrap(this).getPreferredSubnetId()

      /**
       * The configuration Amazon FSx uses when creating the root value of the Amazon FSx for
       * OpenZFS file system.
       *
       * All volumes are children of the root volume.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-openzfsconfiguration.html#cfn-fsx-filesystem-openzfsconfiguration-rootvolumeconfiguration)
       */
      override fun rootVolumeConfiguration(): Any? = unwrap(this).getRootVolumeConfiguration()

      /**
       * (Multi-AZ only) Specifies the route tables in which Amazon FSx creates the rules for
       * routing traffic to the correct file server.
       *
       * You should specify all virtual private cloud (VPC) route tables associated with the subnets
       * in which your clients are located. By default, Amazon FSx selects your VPC's default route
       * table.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-openzfsconfiguration.html#cfn-fsx-filesystem-openzfsconfiguration-routetableids)
       */
      override fun routeTableIds(): List<String> = unwrap(this).getRouteTableIds() ?: emptyList()

      /**
       * Specifies the throughput of an Amazon FSx for OpenZFS file system, measured in megabytes
       * per second (MBps).
       *
       * Valid values depend on the DeploymentType you choose, as follows:
       *
       * * For `MULTI_AZ_1` and `SINGLE_AZ_2` , valid values are 160, 320, 640, 1280, 2560, 3840,
       * 5120, 7680, or 10240 MBps.
       * * For `SINGLE_AZ_1` , valid values are 64, 128, 256, 512, 1024, 2048, 3072, or 4096 MBps.
       *
       * You pay for additional throughput capacity that you provision.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-openzfsconfiguration.html#cfn-fsx-filesystem-openzfsconfiguration-throughputcapacity)
       */
      override fun throughputCapacity(): Number? = unwrap(this).getThroughputCapacity()

      /**
       * A recurring weekly time, in the format `D:HH:MM` .
       *
       * `D` is the day of the week, for which 1 represents Monday and 7 represents Sunday. For
       * further details, see [the ISO-8601 spec as described on
       * Wikipedia](https://docs.aws.amazon.com/https://en.wikipedia.org/wiki/ISO_week_date) .
       *
       * `HH` is the zero-padded hour of the day (0-23), and `MM` is the zero-padded minute of the
       * hour.
       *
       * For example, `1:05:00` specifies maintenance at 5 AM Monday.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-openzfsconfiguration.html#cfn-fsx-filesystem-openzfsconfiguration-weeklymaintenancestarttime)
       */
      override fun weeklyMaintenanceStartTime(): String? =
          unwrap(this).getWeeklyMaintenanceStartTime()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OpenZFSConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.fsx.CfnFileSystem.OpenZFSConfigurationProperty):
          OpenZFSConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          OpenZFSConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: OpenZFSConfigurationProperty):
          software.amazon.awscdk.services.fsx.CfnFileSystem.OpenZFSConfigurationProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.fsx.CfnFileSystem.OpenZFSConfigurationProperty
    }
  }

  /**
   * The configuration of an Amazon FSx for OpenZFS root volume.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.fsx.*;
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
  public interface RootVolumeConfigurationProperty {
    /**
     * A Boolean value indicating whether tags for the volume should be copied to snapshots of the
     * volume.
     *
     * This value defaults to `false` . If it's set to `true` , all tags for the volume are copied
     * to snapshots where the user doesn't specify tags. If this value is `true` and you specify one or
     * more tags, only the specified tags are copied to snapshots. If you specify one or more tags when
     * creating the snapshot, no tags are copied from the volume, regardless of this value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-rootvolumeconfiguration.html#cfn-fsx-filesystem-rootvolumeconfiguration-copytagstosnapshots)
     */
    public fun copyTagsToSnapshots(): Any? = unwrap(this).getCopyTagsToSnapshots()

    /**
     * Specifies the method used to compress the data on the volume. The compression type is `NONE`
     * by default.
     *
     * * `NONE` - Doesn't compress the data on the volume. `NONE` is the default.
     * * `ZSTD` - Compresses the data in the volume using the Zstandard (ZSTD) compression
     * algorithm. Compared to LZ4, Z-Standard provides a better compression ratio to minimize on-disk
     * storage utilization.
     * * `LZ4` - Compresses the data in the volume using the LZ4 compression algorithm. Compared to
     * Z-Standard, LZ4 is less compute-intensive and delivers higher write throughput speeds.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-rootvolumeconfiguration.html#cfn-fsx-filesystem-rootvolumeconfiguration-datacompressiontype)
     */
    public fun dataCompressionType(): String? = unwrap(this).getDataCompressionType()

    /**
     * The configuration object for mounting a file system.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-rootvolumeconfiguration.html#cfn-fsx-filesystem-rootvolumeconfiguration-nfsexports)
     */
    public fun nfsExports(): Any? = unwrap(this).getNfsExports()

    /**
     * A Boolean value indicating whether the volume is read-only.
     *
     * Setting this value to `true` can be useful after you have completed changes to a volume and
     * no longer want changes to occur.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-rootvolumeconfiguration.html#cfn-fsx-filesystem-rootvolumeconfiguration-readonly)
     */
    public fun readOnly(): Any? = unwrap(this).getReadOnly()

    /**
     * Specifies the record size of an OpenZFS root volume, in kibibytes (KiB).
     *
     * Valid values are 4, 8, 16, 32, 64, 128, 256, 512, or 1024 KiB. The default is 128 KiB. Most
     * workloads should use the default record size. Database workflows can benefit from a smaller
     * record size, while streaming workflows can benefit from a larger record size. For additional
     * guidance on setting a custom record size, see [Tips for maximizing
     * performance](https://docs.aws.amazon.com/fsx/latest/OpenZFSGuide/performance.html#performance-tips-zfs)
     * in the *Amazon FSx for OpenZFS User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-rootvolumeconfiguration.html#cfn-fsx-filesystem-rootvolumeconfiguration-recordsizekib)
     */
    public fun recordSizeKiB(): Number? = unwrap(this).getRecordSizeKiB()

    /**
     * An object specifying how much storage users or groups can use on the volume.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-rootvolumeconfiguration.html#cfn-fsx-filesystem-rootvolumeconfiguration-userandgroupquotas)
     */
    public fun userAndGroupQuotas(): Any? = unwrap(this).getUserAndGroupQuotas()

    /**
     * A builder for [RootVolumeConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param copyTagsToSnapshots A Boolean value indicating whether tags for the volume should be
       * copied to snapshots of the volume.
       * This value defaults to `false` . If it's set to `true` , all tags for the volume are copied
       * to snapshots where the user doesn't specify tags. If this value is `true` and you specify one
       * or more tags, only the specified tags are copied to snapshots. If you specify one or more tags
       * when creating the snapshot, no tags are copied from the volume, regardless of this value.
       */
      public fun copyTagsToSnapshots(copyTagsToSnapshots: Boolean)

      /**
       * @param copyTagsToSnapshots A Boolean value indicating whether tags for the volume should be
       * copied to snapshots of the volume.
       * This value defaults to `false` . If it's set to `true` , all tags for the volume are copied
       * to snapshots where the user doesn't specify tags. If this value is `true` and you specify one
       * or more tags, only the specified tags are copied to snapshots. If you specify one or more tags
       * when creating the snapshot, no tags are copied from the volume, regardless of this value.
       */
      public fun copyTagsToSnapshots(copyTagsToSnapshots: IResolvable)

      /**
       * @param dataCompressionType Specifies the method used to compress the data on the volume.
       * The compression type is `NONE` by default.
       * * `NONE` - Doesn't compress the data on the volume. `NONE` is the default.
       * * `ZSTD` - Compresses the data in the volume using the Zstandard (ZSTD) compression
       * algorithm. Compared to LZ4, Z-Standard provides a better compression ratio to minimize on-disk
       * storage utilization.
       * * `LZ4` - Compresses the data in the volume using the LZ4 compression algorithm. Compared
       * to Z-Standard, LZ4 is less compute-intensive and delivers higher write throughput speeds.
       */
      public fun dataCompressionType(dataCompressionType: String)

      /**
       * @param nfsExports The configuration object for mounting a file system.
       */
      public fun nfsExports(nfsExports: IResolvable)

      /**
       * @param nfsExports The configuration object for mounting a file system.
       */
      public fun nfsExports(nfsExports: List<Any>)

      /**
       * @param nfsExports The configuration object for mounting a file system.
       */
      public fun nfsExports(vararg nfsExports: Any)

      /**
       * @param readOnly A Boolean value indicating whether the volume is read-only.
       * Setting this value to `true` can be useful after you have completed changes to a volume and
       * no longer want changes to occur.
       */
      public fun readOnly(readOnly: Boolean)

      /**
       * @param readOnly A Boolean value indicating whether the volume is read-only.
       * Setting this value to `true` can be useful after you have completed changes to a volume and
       * no longer want changes to occur.
       */
      public fun readOnly(readOnly: IResolvable)

      /**
       * @param recordSizeKiB Specifies the record size of an OpenZFS root volume, in kibibytes
       * (KiB).
       * Valid values are 4, 8, 16, 32, 64, 128, 256, 512, or 1024 KiB. The default is 128 KiB. Most
       * workloads should use the default record size. Database workflows can benefit from a smaller
       * record size, while streaming workflows can benefit from a larger record size. For additional
       * guidance on setting a custom record size, see [Tips for maximizing
       * performance](https://docs.aws.amazon.com/fsx/latest/OpenZFSGuide/performance.html#performance-tips-zfs)
       * in the *Amazon FSx for OpenZFS User Guide* .
       */
      public fun recordSizeKiB(recordSizeKiB: Number)

      /**
       * @param userAndGroupQuotas An object specifying how much storage users or groups can use on
       * the volume.
       */
      public fun userAndGroupQuotas(userAndGroupQuotas: IResolvable)

      /**
       * @param userAndGroupQuotas An object specifying how much storage users or groups can use on
       * the volume.
       */
      public fun userAndGroupQuotas(userAndGroupQuotas: List<Any>)

      /**
       * @param userAndGroupQuotas An object specifying how much storage users or groups can use on
       * the volume.
       */
      public fun userAndGroupQuotas(vararg userAndGroupQuotas: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.fsx.CfnFileSystem.RootVolumeConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.fsx.CfnFileSystem.RootVolumeConfigurationProperty.builder()

      /**
       * @param copyTagsToSnapshots A Boolean value indicating whether tags for the volume should be
       * copied to snapshots of the volume.
       * This value defaults to `false` . If it's set to `true` , all tags for the volume are copied
       * to snapshots where the user doesn't specify tags. If this value is `true` and you specify one
       * or more tags, only the specified tags are copied to snapshots. If you specify one or more tags
       * when creating the snapshot, no tags are copied from the volume, regardless of this value.
       */
      override fun copyTagsToSnapshots(copyTagsToSnapshots: Boolean) {
        cdkBuilder.copyTagsToSnapshots(copyTagsToSnapshots)
      }

      /**
       * @param copyTagsToSnapshots A Boolean value indicating whether tags for the volume should be
       * copied to snapshots of the volume.
       * This value defaults to `false` . If it's set to `true` , all tags for the volume are copied
       * to snapshots where the user doesn't specify tags. If this value is `true` and you specify one
       * or more tags, only the specified tags are copied to snapshots. If you specify one or more tags
       * when creating the snapshot, no tags are copied from the volume, regardless of this value.
       */
      override fun copyTagsToSnapshots(copyTagsToSnapshots: IResolvable) {
        cdkBuilder.copyTagsToSnapshots(copyTagsToSnapshots.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param dataCompressionType Specifies the method used to compress the data on the volume.
       * The compression type is `NONE` by default.
       * * `NONE` - Doesn't compress the data on the volume. `NONE` is the default.
       * * `ZSTD` - Compresses the data in the volume using the Zstandard (ZSTD) compression
       * algorithm. Compared to LZ4, Z-Standard provides a better compression ratio to minimize on-disk
       * storage utilization.
       * * `LZ4` - Compresses the data in the volume using the LZ4 compression algorithm. Compared
       * to Z-Standard, LZ4 is less compute-intensive and delivers higher write throughput speeds.
       */
      override fun dataCompressionType(dataCompressionType: String) {
        cdkBuilder.dataCompressionType(dataCompressionType)
      }

      /**
       * @param nfsExports The configuration object for mounting a file system.
       */
      override fun nfsExports(nfsExports: IResolvable) {
        cdkBuilder.nfsExports(nfsExports.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param nfsExports The configuration object for mounting a file system.
       */
      override fun nfsExports(nfsExports: List<Any>) {
        cdkBuilder.nfsExports(nfsExports.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param nfsExports The configuration object for mounting a file system.
       */
      override fun nfsExports(vararg nfsExports: Any): Unit = nfsExports(nfsExports.toList())

      /**
       * @param readOnly A Boolean value indicating whether the volume is read-only.
       * Setting this value to `true` can be useful after you have completed changes to a volume and
       * no longer want changes to occur.
       */
      override fun readOnly(readOnly: Boolean) {
        cdkBuilder.readOnly(readOnly)
      }

      /**
       * @param readOnly A Boolean value indicating whether the volume is read-only.
       * Setting this value to `true` can be useful after you have completed changes to a volume and
       * no longer want changes to occur.
       */
      override fun readOnly(readOnly: IResolvable) {
        cdkBuilder.readOnly(readOnly.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param recordSizeKiB Specifies the record size of an OpenZFS root volume, in kibibytes
       * (KiB).
       * Valid values are 4, 8, 16, 32, 64, 128, 256, 512, or 1024 KiB. The default is 128 KiB. Most
       * workloads should use the default record size. Database workflows can benefit from a smaller
       * record size, while streaming workflows can benefit from a larger record size. For additional
       * guidance on setting a custom record size, see [Tips for maximizing
       * performance](https://docs.aws.amazon.com/fsx/latest/OpenZFSGuide/performance.html#performance-tips-zfs)
       * in the *Amazon FSx for OpenZFS User Guide* .
       */
      override fun recordSizeKiB(recordSizeKiB: Number) {
        cdkBuilder.recordSizeKiB(recordSizeKiB)
      }

      /**
       * @param userAndGroupQuotas An object specifying how much storage users or groups can use on
       * the volume.
       */
      override fun userAndGroupQuotas(userAndGroupQuotas: IResolvable) {
        cdkBuilder.userAndGroupQuotas(userAndGroupQuotas.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param userAndGroupQuotas An object specifying how much storage users or groups can use on
       * the volume.
       */
      override fun userAndGroupQuotas(userAndGroupQuotas: List<Any>) {
        cdkBuilder.userAndGroupQuotas(userAndGroupQuotas.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param userAndGroupQuotas An object specifying how much storage users or groups can use on
       * the volume.
       */
      override fun userAndGroupQuotas(vararg userAndGroupQuotas: Any): Unit =
          userAndGroupQuotas(userAndGroupQuotas.toList())

      public fun build():
          software.amazon.awscdk.services.fsx.CfnFileSystem.RootVolumeConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.fsx.CfnFileSystem.RootVolumeConfigurationProperty,
    ) : CdkObject(cdkObject), RootVolumeConfigurationProperty {
      /**
       * A Boolean value indicating whether tags for the volume should be copied to snapshots of the
       * volume.
       *
       * This value defaults to `false` . If it's set to `true` , all tags for the volume are copied
       * to snapshots where the user doesn't specify tags. If this value is `true` and you specify one
       * or more tags, only the specified tags are copied to snapshots. If you specify one or more tags
       * when creating the snapshot, no tags are copied from the volume, regardless of this value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-rootvolumeconfiguration.html#cfn-fsx-filesystem-rootvolumeconfiguration-copytagstosnapshots)
       */
      override fun copyTagsToSnapshots(): Any? = unwrap(this).getCopyTagsToSnapshots()

      /**
       * Specifies the method used to compress the data on the volume. The compression type is
       * `NONE` by default.
       *
       * * `NONE` - Doesn't compress the data on the volume. `NONE` is the default.
       * * `ZSTD` - Compresses the data in the volume using the Zstandard (ZSTD) compression
       * algorithm. Compared to LZ4, Z-Standard provides a better compression ratio to minimize on-disk
       * storage utilization.
       * * `LZ4` - Compresses the data in the volume using the LZ4 compression algorithm. Compared
       * to Z-Standard, LZ4 is less compute-intensive and delivers higher write throughput speeds.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-rootvolumeconfiguration.html#cfn-fsx-filesystem-rootvolumeconfiguration-datacompressiontype)
       */
      override fun dataCompressionType(): String? = unwrap(this).getDataCompressionType()

      /**
       * The configuration object for mounting a file system.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-rootvolumeconfiguration.html#cfn-fsx-filesystem-rootvolumeconfiguration-nfsexports)
       */
      override fun nfsExports(): Any? = unwrap(this).getNfsExports()

      /**
       * A Boolean value indicating whether the volume is read-only.
       *
       * Setting this value to `true` can be useful after you have completed changes to a volume and
       * no longer want changes to occur.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-rootvolumeconfiguration.html#cfn-fsx-filesystem-rootvolumeconfiguration-readonly)
       */
      override fun readOnly(): Any? = unwrap(this).getReadOnly()

      /**
       * Specifies the record size of an OpenZFS root volume, in kibibytes (KiB).
       *
       * Valid values are 4, 8, 16, 32, 64, 128, 256, 512, or 1024 KiB. The default is 128 KiB. Most
       * workloads should use the default record size. Database workflows can benefit from a smaller
       * record size, while streaming workflows can benefit from a larger record size. For additional
       * guidance on setting a custom record size, see [Tips for maximizing
       * performance](https://docs.aws.amazon.com/fsx/latest/OpenZFSGuide/performance.html#performance-tips-zfs)
       * in the *Amazon FSx for OpenZFS User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-rootvolumeconfiguration.html#cfn-fsx-filesystem-rootvolumeconfiguration-recordsizekib)
       */
      override fun recordSizeKiB(): Number? = unwrap(this).getRecordSizeKiB()

      /**
       * An object specifying how much storage users or groups can use on the volume.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-rootvolumeconfiguration.html#cfn-fsx-filesystem-rootvolumeconfiguration-userandgroupquotas)
       */
      override fun userAndGroupQuotas(): Any? = unwrap(this).getUserAndGroupQuotas()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RootVolumeConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.fsx.CfnFileSystem.RootVolumeConfigurationProperty):
          RootVolumeConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          RootVolumeConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: RootVolumeConfigurationProperty):
          software.amazon.awscdk.services.fsx.CfnFileSystem.RootVolumeConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.fsx.CfnFileSystem.RootVolumeConfigurationProperty
    }
  }

  /**
   * The configuration that Amazon FSx uses to join a FSx for Windows File Server file system or an
   * FSx for ONTAP storage virtual machine (SVM) to a self-managed (including on-premises) Microsoft
   * Active Directory (AD) directory.
   *
   * For more information, see [Using Amazon FSx for Windows with your self-managed Microsoft Active
   * Directory](https://docs.aws.amazon.com/fsx/latest/WindowsGuide/self-managed-AD.html) or [Managing
   * FSx for ONTAP SVMs](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/managing-svms.html) .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.fsx.*;
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
  public interface SelfManagedActiveDirectoryConfigurationProperty {
    /**
     * A list of up to three IP addresses of DNS servers or domain controllers in the self-managed
     * AD directory.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-selfmanagedactivedirectoryconfiguration.html#cfn-fsx-filesystem-selfmanagedactivedirectoryconfiguration-dnsips)
     */
    public fun dnsIps(): List<String> = unwrap(this).getDnsIps() ?: emptyList()

    /**
     * The fully qualified domain name of the self-managed AD directory, such as `corp.example.com`
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-selfmanagedactivedirectoryconfiguration.html#cfn-fsx-filesystem-selfmanagedactivedirectoryconfiguration-domainname)
     */
    public fun domainName(): String? = unwrap(this).getDomainName()

    /**
     * (Optional) The name of the domain group whose members are granted administrative privileges
     * for the file system.
     *
     * Administrative privileges include taking ownership of files and folders, setting audit
     * controls (audit ACLs) on files and folders, and administering the file system remotely by using
     * the FSx Remote PowerShell. The group that you specify must already exist in your domain. If you
     * don't provide one, your AD domain's Domain Admins group is used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-selfmanagedactivedirectoryconfiguration.html#cfn-fsx-filesystem-selfmanagedactivedirectoryconfiguration-filesystemadministratorsgroup)
     */
    public fun fileSystemAdministratorsGroup(): String? =
        unwrap(this).getFileSystemAdministratorsGroup()

    /**
     * (Optional) The fully qualified distinguished name of the organizational unit within your
     * self-managed AD directory.
     *
     * Amazon FSx only accepts OU as the direct parent of the file system. An example is
     * `OU=FSx,DC=yourdomain,DC=corp,DC=com` . To learn more, see [RFC
     * 2253](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc2253) . If none is provided,
     * the FSx file system is created in the default location of your self-managed AD directory.
     *
     *
     * Only Organizational Unit (OU) objects can be the direct parent of the file system that you're
     * creating.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-selfmanagedactivedirectoryconfiguration.html#cfn-fsx-filesystem-selfmanagedactivedirectoryconfiguration-organizationalunitdistinguishedname)
     */
    public fun organizationalUnitDistinguishedName(): String? =
        unwrap(this).getOrganizationalUnitDistinguishedName()

    /**
     * The password for the service account on your self-managed AD domain that Amazon FSx will use
     * to join to your AD domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-selfmanagedactivedirectoryconfiguration.html#cfn-fsx-filesystem-selfmanagedactivedirectoryconfiguration-password)
     */
    public fun password(): String? = unwrap(this).getPassword()

    /**
     * The user name for the service account on your self-managed AD domain that Amazon FSx will use
     * to join to your AD domain.
     *
     * This account must have the permission to join computers to the domain in the organizational
     * unit provided in `OrganizationalUnitDistinguishedName` , or in the default location of your AD
     * domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-selfmanagedactivedirectoryconfiguration.html#cfn-fsx-filesystem-selfmanagedactivedirectoryconfiguration-username)
     */
    public fun userName(): String? = unwrap(this).getUserName()

    /**
     * A builder for [SelfManagedActiveDirectoryConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param dnsIps A list of up to three IP addresses of DNS servers or domain controllers in
       * the self-managed AD directory.
       */
      public fun dnsIps(dnsIps: List<String>)

      /**
       * @param dnsIps A list of up to three IP addresses of DNS servers or domain controllers in
       * the self-managed AD directory.
       */
      public fun dnsIps(vararg dnsIps: String)

      /**
       * @param domainName The fully qualified domain name of the self-managed AD directory, such as
       * `corp.example.com` .
       */
      public fun domainName(domainName: String)

      /**
       * @param fileSystemAdministratorsGroup (Optional) The name of the domain group whose members
       * are granted administrative privileges for the file system.
       * Administrative privileges include taking ownership of files and folders, setting audit
       * controls (audit ACLs) on files and folders, and administering the file system remotely by
       * using the FSx Remote PowerShell. The group that you specify must already exist in your domain.
       * If you don't provide one, your AD domain's Domain Admins group is used.
       */
      public fun fileSystemAdministratorsGroup(fileSystemAdministratorsGroup: String)

      /**
       * @param organizationalUnitDistinguishedName (Optional) The fully qualified distinguished
       * name of the organizational unit within your self-managed AD directory.
       * Amazon FSx only accepts OU as the direct parent of the file system. An example is
       * `OU=FSx,DC=yourdomain,DC=corp,DC=com` . To learn more, see [RFC
       * 2253](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc2253) . If none is provided,
       * the FSx file system is created in the default location of your self-managed AD directory.
       *
       *
       * Only Organizational Unit (OU) objects can be the direct parent of the file system that
       * you're creating.
       */
      public fun organizationalUnitDistinguishedName(organizationalUnitDistinguishedName: String)

      /**
       * @param password The password for the service account on your self-managed AD domain that
       * Amazon FSx will use to join to your AD domain.
       */
      public fun password(password: String)

      /**
       * @param userName The user name for the service account on your self-managed AD domain that
       * Amazon FSx will use to join to your AD domain.
       * This account must have the permission to join computers to the domain in the organizational
       * unit provided in `OrganizationalUnitDistinguishedName` , or in the default location of your AD
       * domain.
       */
      public fun userName(userName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.fsx.CfnFileSystem.SelfManagedActiveDirectoryConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.fsx.CfnFileSystem.SelfManagedActiveDirectoryConfigurationProperty.builder()

      /**
       * @param dnsIps A list of up to three IP addresses of DNS servers or domain controllers in
       * the self-managed AD directory.
       */
      override fun dnsIps(dnsIps: List<String>) {
        cdkBuilder.dnsIps(dnsIps)
      }

      /**
       * @param dnsIps A list of up to three IP addresses of DNS servers or domain controllers in
       * the self-managed AD directory.
       */
      override fun dnsIps(vararg dnsIps: String): Unit = dnsIps(dnsIps.toList())

      /**
       * @param domainName The fully qualified domain name of the self-managed AD directory, such as
       * `corp.example.com` .
       */
      override fun domainName(domainName: String) {
        cdkBuilder.domainName(domainName)
      }

      /**
       * @param fileSystemAdministratorsGroup (Optional) The name of the domain group whose members
       * are granted administrative privileges for the file system.
       * Administrative privileges include taking ownership of files and folders, setting audit
       * controls (audit ACLs) on files and folders, and administering the file system remotely by
       * using the FSx Remote PowerShell. The group that you specify must already exist in your domain.
       * If you don't provide one, your AD domain's Domain Admins group is used.
       */
      override fun fileSystemAdministratorsGroup(fileSystemAdministratorsGroup: String) {
        cdkBuilder.fileSystemAdministratorsGroup(fileSystemAdministratorsGroup)
      }

      /**
       * @param organizationalUnitDistinguishedName (Optional) The fully qualified distinguished
       * name of the organizational unit within your self-managed AD directory.
       * Amazon FSx only accepts OU as the direct parent of the file system. An example is
       * `OU=FSx,DC=yourdomain,DC=corp,DC=com` . To learn more, see [RFC
       * 2253](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc2253) . If none is provided,
       * the FSx file system is created in the default location of your self-managed AD directory.
       *
       *
       * Only Organizational Unit (OU) objects can be the direct parent of the file system that
       * you're creating.
       */
      override
          fun organizationalUnitDistinguishedName(organizationalUnitDistinguishedName: String) {
        cdkBuilder.organizationalUnitDistinguishedName(organizationalUnitDistinguishedName)
      }

      /**
       * @param password The password for the service account on your self-managed AD domain that
       * Amazon FSx will use to join to your AD domain.
       */
      override fun password(password: String) {
        cdkBuilder.password(password)
      }

      /**
       * @param userName The user name for the service account on your self-managed AD domain that
       * Amazon FSx will use to join to your AD domain.
       * This account must have the permission to join computers to the domain in the organizational
       * unit provided in `OrganizationalUnitDistinguishedName` , or in the default location of your AD
       * domain.
       */
      override fun userName(userName: String) {
        cdkBuilder.userName(userName)
      }

      public fun build():
          software.amazon.awscdk.services.fsx.CfnFileSystem.SelfManagedActiveDirectoryConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.fsx.CfnFileSystem.SelfManagedActiveDirectoryConfigurationProperty,
    ) : CdkObject(cdkObject), SelfManagedActiveDirectoryConfigurationProperty {
      /**
       * A list of up to three IP addresses of DNS servers or domain controllers in the self-managed
       * AD directory.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-selfmanagedactivedirectoryconfiguration.html#cfn-fsx-filesystem-selfmanagedactivedirectoryconfiguration-dnsips)
       */
      override fun dnsIps(): List<String> = unwrap(this).getDnsIps() ?: emptyList()

      /**
       * The fully qualified domain name of the self-managed AD directory, such as
       * `corp.example.com` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-selfmanagedactivedirectoryconfiguration.html#cfn-fsx-filesystem-selfmanagedactivedirectoryconfiguration-domainname)
       */
      override fun domainName(): String? = unwrap(this).getDomainName()

      /**
       * (Optional) The name of the domain group whose members are granted administrative privileges
       * for the file system.
       *
       * Administrative privileges include taking ownership of files and folders, setting audit
       * controls (audit ACLs) on files and folders, and administering the file system remotely by
       * using the FSx Remote PowerShell. The group that you specify must already exist in your domain.
       * If you don't provide one, your AD domain's Domain Admins group is used.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-selfmanagedactivedirectoryconfiguration.html#cfn-fsx-filesystem-selfmanagedactivedirectoryconfiguration-filesystemadministratorsgroup)
       */
      override fun fileSystemAdministratorsGroup(): String? =
          unwrap(this).getFileSystemAdministratorsGroup()

      /**
       * (Optional) The fully qualified distinguished name of the organizational unit within your
       * self-managed AD directory.
       *
       * Amazon FSx only accepts OU as the direct parent of the file system. An example is
       * `OU=FSx,DC=yourdomain,DC=corp,DC=com` . To learn more, see [RFC
       * 2253](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc2253) . If none is provided,
       * the FSx file system is created in the default location of your self-managed AD directory.
       *
       *
       * Only Organizational Unit (OU) objects can be the direct parent of the file system that
       * you're creating.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-selfmanagedactivedirectoryconfiguration.html#cfn-fsx-filesystem-selfmanagedactivedirectoryconfiguration-organizationalunitdistinguishedname)
       */
      override fun organizationalUnitDistinguishedName(): String? =
          unwrap(this).getOrganizationalUnitDistinguishedName()

      /**
       * The password for the service account on your self-managed AD domain that Amazon FSx will
       * use to join to your AD domain.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-selfmanagedactivedirectoryconfiguration.html#cfn-fsx-filesystem-selfmanagedactivedirectoryconfiguration-password)
       */
      override fun password(): String? = unwrap(this).getPassword()

      /**
       * The user name for the service account on your self-managed AD domain that Amazon FSx will
       * use to join to your AD domain.
       *
       * This account must have the permission to join computers to the domain in the organizational
       * unit provided in `OrganizationalUnitDistinguishedName` , or in the default location of your AD
       * domain.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-selfmanagedactivedirectoryconfiguration.html#cfn-fsx-filesystem-selfmanagedactivedirectoryconfiguration-username)
       */
      override fun userName(): String? = unwrap(this).getUserName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          SelfManagedActiveDirectoryConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.fsx.CfnFileSystem.SelfManagedActiveDirectoryConfigurationProperty):
          SelfManagedActiveDirectoryConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          SelfManagedActiveDirectoryConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SelfManagedActiveDirectoryConfigurationProperty):
          software.amazon.awscdk.services.fsx.CfnFileSystem.SelfManagedActiveDirectoryConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.fsx.CfnFileSystem.SelfManagedActiveDirectoryConfigurationProperty
    }
  }

  /**
   * Used to configure quotas that define how much storage a user or group can use on an FSx for
   * OpenZFS volume.
   *
   * For more information, see [Volume
   * properties](https://docs.aws.amazon.com/fsx/latest/OpenZFSGuide/managing-volumes.html#volume-properties)
   * in the FSx for OpenZFS User Guide.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.fsx.*;
   * UserAndGroupQuotasProperty userAndGroupQuotasProperty = UserAndGroupQuotasProperty.builder()
   * .id(123)
   * .storageCapacityQuotaGiB(123)
   * .type("type")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-userandgroupquotas.html)
   */
  public interface UserAndGroupQuotasProperty {
    /**
     * The ID of the user or group that the quota applies to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-userandgroupquotas.html#cfn-fsx-filesystem-userandgroupquotas-id)
     */
    public fun id(): Number? = unwrap(this).getId()

    /**
     * The user or group's storage quota, in gibibytes (GiB).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-userandgroupquotas.html#cfn-fsx-filesystem-userandgroupquotas-storagecapacityquotagib)
     */
    public fun storageCapacityQuotaGiB(): Number? = unwrap(this).getStorageCapacityQuotaGiB()

    /**
     * Specifies whether the quota applies to a user or group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-userandgroupquotas.html#cfn-fsx-filesystem-userandgroupquotas-type)
     */
    public fun type(): String? = unwrap(this).getType()

    /**
     * A builder for [UserAndGroupQuotasProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param id The ID of the user or group that the quota applies to.
       */
      public fun id(id: Number)

      /**
       * @param storageCapacityQuotaGiB The user or group's storage quota, in gibibytes (GiB).
       */
      public fun storageCapacityQuotaGiB(storageCapacityQuotaGiB: Number)

      /**
       * @param type Specifies whether the quota applies to a user or group.
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.fsx.CfnFileSystem.UserAndGroupQuotasProperty.Builder =
          software.amazon.awscdk.services.fsx.CfnFileSystem.UserAndGroupQuotasProperty.builder()

      /**
       * @param id The ID of the user or group that the quota applies to.
       */
      override fun id(id: Number) {
        cdkBuilder.id(id)
      }

      /**
       * @param storageCapacityQuotaGiB The user or group's storage quota, in gibibytes (GiB).
       */
      override fun storageCapacityQuotaGiB(storageCapacityQuotaGiB: Number) {
        cdkBuilder.storageCapacityQuotaGiB(storageCapacityQuotaGiB)
      }

      /**
       * @param type Specifies whether the quota applies to a user or group.
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.fsx.CfnFileSystem.UserAndGroupQuotasProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.fsx.CfnFileSystem.UserAndGroupQuotasProperty,
    ) : CdkObject(cdkObject), UserAndGroupQuotasProperty {
      /**
       * The ID of the user or group that the quota applies to.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-userandgroupquotas.html#cfn-fsx-filesystem-userandgroupquotas-id)
       */
      override fun id(): Number? = unwrap(this).getId()

      /**
       * The user or group's storage quota, in gibibytes (GiB).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-userandgroupquotas.html#cfn-fsx-filesystem-userandgroupquotas-storagecapacityquotagib)
       */
      override fun storageCapacityQuotaGiB(): Number? = unwrap(this).getStorageCapacityQuotaGiB()

      /**
       * Specifies whether the quota applies to a user or group.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-userandgroupquotas.html#cfn-fsx-filesystem-userandgroupquotas-type)
       */
      override fun type(): String? = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): UserAndGroupQuotasProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.fsx.CfnFileSystem.UserAndGroupQuotasProperty):
          UserAndGroupQuotasProperty = CdkObjectWrappers.wrap(cdkObject) as?
          UserAndGroupQuotasProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: UserAndGroupQuotasProperty):
          software.amazon.awscdk.services.fsx.CfnFileSystem.UserAndGroupQuotasProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.fsx.CfnFileSystem.UserAndGroupQuotasProperty
    }
  }

  /**
   * The Microsoft Windows configuration for the file system that's being created.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.fsx.*;
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-windowsconfiguration.html)
   */
  public interface WindowsConfigurationProperty {
    /**
     * The ID for an existing AWS Managed Microsoft Active Directory (AD) instance that the file
     * system should join when it's created.
     *
     * Required if you are joining the file system to an existing AWS Managed Microsoft AD.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-windowsconfiguration.html#cfn-fsx-filesystem-windowsconfiguration-activedirectoryid)
     */
    public fun activeDirectoryId(): String? = unwrap(this).getActiveDirectoryId()

    /**
     * An array of one or more DNS alias names that you want to associate with the Amazon FSx file
     * system.
     *
     * Aliases allow you to use existing DNS names to access the data in your Amazon FSx file
     * system. You can associate up to 50 aliases with a file system at any time.
     *
     * For more information, see [Working with DNS
     * Aliases](https://docs.aws.amazon.com/fsx/latest/WindowsGuide/managing-dns-aliases.html) and
     * [Walkthrough 5: Using DNS aliases to access your file
     * system](https://docs.aws.amazon.com/fsx/latest/WindowsGuide/walkthrough05-file-system-custom-CNAME.html)
     * , including additional steps you must take to be able to access your file system using a DNS
     * alias.
     *
     * An alias name has to meet the following requirements:
     *
     * * Formatted as a fully-qualified domain name (FQDN), `hostname.domain` , for example,
     * `accounting.example.com` .
     * * Can contain alphanumeric characters, the underscore (_), and the hyphen (-).
     * * Cannot start or end with a hyphen.
     * * Can start with a numeric.
     *
     * For DNS alias names, Amazon FSx stores alphabetical characters as lowercase letters (a-z),
     * regardless of how you specify them: as uppercase letters, lowercase letters, or the
     * corresponding letters in escape codes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-windowsconfiguration.html#cfn-fsx-filesystem-windowsconfiguration-aliases)
     */
    public fun aliases(): List<String> = unwrap(this).getAliases() ?: emptyList()

    /**
     * The configuration that Amazon FSx for Windows File Server uses to audit and log user accesses
     * of files, folders, and file shares on the Amazon FSx for Windows File Server file system.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-windowsconfiguration.html#cfn-fsx-filesystem-windowsconfiguration-auditlogconfiguration)
     */
    public fun auditLogConfiguration(): Any? = unwrap(this).getAuditLogConfiguration()

    /**
     * The number of days to retain automatic backups.
     *
     * Setting this property to `0` disables automatic backups. You can retain automatic backups for
     * a maximum of 90 days. The default is `30` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-windowsconfiguration.html#cfn-fsx-filesystem-windowsconfiguration-automaticbackupretentiondays)
     */
    public fun automaticBackupRetentionDays(): Number? =
        unwrap(this).getAutomaticBackupRetentionDays()

    /**
     * A boolean flag indicating whether tags for the file system should be copied to backups.
     *
     * This value defaults to false. If it's set to true, all tags for the file system are copied to
     * all automatic and user-initiated backups where the user doesn't specify tags. If this value is
     * true, and you specify one or more tags, only the specified tags are copied to backups. If you
     * specify one or more tags when creating a user-initiated backup, no tags are copied from the file
     * system, regardless of this value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-windowsconfiguration.html#cfn-fsx-filesystem-windowsconfiguration-copytagstobackups)
     */
    public fun copyTagsToBackups(): Any? = unwrap(this).getCopyTagsToBackups()

    /**
     * A recurring daily time, in the format `HH:MM` .
     *
     * `HH` is the zero-padded hour of the day (0-23), and `MM` is the zero-padded minute of the
     * hour. For example, `05:00` specifies 5 AM daily.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-windowsconfiguration.html#cfn-fsx-filesystem-windowsconfiguration-dailyautomaticbackupstarttime)
     */
    public fun dailyAutomaticBackupStartTime(): String? =
        unwrap(this).getDailyAutomaticBackupStartTime()

    /**
     * Specifies the file system deployment type, valid values are the following:.
     *
     * * `MULTI_AZ_1` - Deploys a high availability file system that is configured for Multi-AZ
     * redundancy to tolerate temporary Availability Zone (AZ) unavailability. You can only deploy a
     * Multi-AZ file system in AWS Regions that have a minimum of three Availability Zones. Also
     * supports HDD storage type
     * * `SINGLE_AZ_1` - (Default) Choose to deploy a file system that is configured for single AZ
     * redundancy.
     * * `SINGLE_AZ_2` - The latest generation Single AZ file system. Specifies a file system that
     * is configured for single AZ redundancy and supports HDD storage type.
     *
     * For more information, see [Availability and Durability: Single-AZ and Multi-AZ File
     * Systems](https://docs.aws.amazon.com/fsx/latest/WindowsGuide/high-availability-multiAZ.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-windowsconfiguration.html#cfn-fsx-filesystem-windowsconfiguration-deploymenttype)
     */
    public fun deploymentType(): String? = unwrap(this).getDeploymentType()

    /**
     * The SSD IOPS (input/output operations per second) configuration for an Amazon FSx for Windows
     * file system.
     *
     * By default, Amazon FSx automatically provisions 3 IOPS per GiB of storage capacity. You can
     * provision additional IOPS per GiB of storage, up to the maximum limit associated with your
     * chosen throughput capacity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-windowsconfiguration.html#cfn-fsx-filesystem-windowsconfiguration-diskiopsconfiguration)
     */
    public fun diskIopsConfiguration(): Any? = unwrap(this).getDiskIopsConfiguration()

    /**
     * Required when `DeploymentType` is set to `MULTI_AZ_1` .
     *
     * This specifies the subnet in which you want the preferred file server to be located. For in-
     * AWS applications, we recommend that you launch your clients in the same availability zone as
     * your preferred file server to reduce cross-availability zone data transfer costs and minimize
     * latency.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-windowsconfiguration.html#cfn-fsx-filesystem-windowsconfiguration-preferredsubnetid)
     */
    public fun preferredSubnetId(): String? = unwrap(this).getPreferredSubnetId()

    /**
     * The configuration that Amazon FSx uses to join a FSx for Windows File Server file system or
     * an FSx for ONTAP storage virtual machine (SVM) to a self-managed (including on-premises)
     * Microsoft Active Directory (AD) directory.
     *
     * For more information, see [Using Amazon FSx for Windows with your self-managed Microsoft
     * Active Directory](https://docs.aws.amazon.com/fsx/latest/WindowsGuide/self-managed-AD.html) or
     * [Managing FSx for ONTAP
     * SVMs](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/managing-svms.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-windowsconfiguration.html#cfn-fsx-filesystem-windowsconfiguration-selfmanagedactivedirectoryconfiguration)
     */
    public fun selfManagedActiveDirectoryConfiguration(): Any? =
        unwrap(this).getSelfManagedActiveDirectoryConfiguration()

    /**
     * Sets the throughput capacity of an Amazon FSx file system, measured in megabytes per second
     * (MB/s), in 2 to the *n* th increments, between 2^3 (8) and 2^11 (2048).
     *
     *
     * To increase storage capacity, a file system must have a minimum throughput capacity of 16
     * MB/s.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-windowsconfiguration.html#cfn-fsx-filesystem-windowsconfiguration-throughputcapacity)
     */
    public fun throughputCapacity(): Number

    /**
     * A recurring weekly time, in the format `D:HH:MM` .
     *
     * `D` is the day of the week, for which 1 represents Monday and 7 represents Sunday. For
     * further details, see [the ISO-8601 spec as described on
     * Wikipedia](https://docs.aws.amazon.com/https://en.wikipedia.org/wiki/ISO_week_date) .
     *
     * `HH` is the zero-padded hour of the day (0-23), and `MM` is the zero-padded minute of the
     * hour.
     *
     * For example, `1:05:00` specifies maintenance at 5 AM Monday.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-windowsconfiguration.html#cfn-fsx-filesystem-windowsconfiguration-weeklymaintenancestarttime)
     */
    public fun weeklyMaintenanceStartTime(): String? = unwrap(this).getWeeklyMaintenanceStartTime()

    /**
     * A builder for [WindowsConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param activeDirectoryId The ID for an existing AWS Managed Microsoft Active Directory (AD)
       * instance that the file system should join when it's created.
       * Required if you are joining the file system to an existing AWS Managed Microsoft AD.
       */
      public fun activeDirectoryId(activeDirectoryId: String)

      /**
       * @param aliases An array of one or more DNS alias names that you want to associate with the
       * Amazon FSx file system.
       * Aliases allow you to use existing DNS names to access the data in your Amazon FSx file
       * system. You can associate up to 50 aliases with a file system at any time.
       *
       * For more information, see [Working with DNS
       * Aliases](https://docs.aws.amazon.com/fsx/latest/WindowsGuide/managing-dns-aliases.html) and
       * [Walkthrough 5: Using DNS aliases to access your file
       * system](https://docs.aws.amazon.com/fsx/latest/WindowsGuide/walkthrough05-file-system-custom-CNAME.html)
       * , including additional steps you must take to be able to access your file system using a DNS
       * alias.
       *
       * An alias name has to meet the following requirements:
       *
       * * Formatted as a fully-qualified domain name (FQDN), `hostname.domain` , for example,
       * `accounting.example.com` .
       * * Can contain alphanumeric characters, the underscore (_), and the hyphen (-).
       * * Cannot start or end with a hyphen.
       * * Can start with a numeric.
       *
       * For DNS alias names, Amazon FSx stores alphabetical characters as lowercase letters (a-z),
       * regardless of how you specify them: as uppercase letters, lowercase letters, or the
       * corresponding letters in escape codes.
       */
      public fun aliases(aliases: List<String>)

      /**
       * @param aliases An array of one or more DNS alias names that you want to associate with the
       * Amazon FSx file system.
       * Aliases allow you to use existing DNS names to access the data in your Amazon FSx file
       * system. You can associate up to 50 aliases with a file system at any time.
       *
       * For more information, see [Working with DNS
       * Aliases](https://docs.aws.amazon.com/fsx/latest/WindowsGuide/managing-dns-aliases.html) and
       * [Walkthrough 5: Using DNS aliases to access your file
       * system](https://docs.aws.amazon.com/fsx/latest/WindowsGuide/walkthrough05-file-system-custom-CNAME.html)
       * , including additional steps you must take to be able to access your file system using a DNS
       * alias.
       *
       * An alias name has to meet the following requirements:
       *
       * * Formatted as a fully-qualified domain name (FQDN), `hostname.domain` , for example,
       * `accounting.example.com` .
       * * Can contain alphanumeric characters, the underscore (_), and the hyphen (-).
       * * Cannot start or end with a hyphen.
       * * Can start with a numeric.
       *
       * For DNS alias names, Amazon FSx stores alphabetical characters as lowercase letters (a-z),
       * regardless of how you specify them: as uppercase letters, lowercase letters, or the
       * corresponding letters in escape codes.
       */
      public fun aliases(vararg aliases: String)

      /**
       * @param auditLogConfiguration The configuration that Amazon FSx for Windows File Server uses
       * to audit and log user accesses of files, folders, and file shares on the Amazon FSx for
       * Windows File Server file system.
       */
      public fun auditLogConfiguration(auditLogConfiguration: IResolvable)

      /**
       * @param auditLogConfiguration The configuration that Amazon FSx for Windows File Server uses
       * to audit and log user accesses of files, folders, and file shares on the Amazon FSx for
       * Windows File Server file system.
       */
      public fun auditLogConfiguration(auditLogConfiguration: AuditLogConfigurationProperty)

      /**
       * @param auditLogConfiguration The configuration that Amazon FSx for Windows File Server uses
       * to audit and log user accesses of files, folders, and file shares on the Amazon FSx for
       * Windows File Server file system.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e3607c85da94b03db39fd8d5195dc2332a907b139d68ddcb6e4bfb47fe033a4f")
      public
          fun auditLogConfiguration(auditLogConfiguration: AuditLogConfigurationProperty.Builder.() -> Unit)

      /**
       * @param automaticBackupRetentionDays The number of days to retain automatic backups.
       * Setting this property to `0` disables automatic backups. You can retain automatic backups
       * for a maximum of 90 days. The default is `30` .
       */
      public fun automaticBackupRetentionDays(automaticBackupRetentionDays: Number)

      /**
       * @param copyTagsToBackups A boolean flag indicating whether tags for the file system should
       * be copied to backups.
       * This value defaults to false. If it's set to true, all tags for the file system are copied
       * to all automatic and user-initiated backups where the user doesn't specify tags. If this value
       * is true, and you specify one or more tags, only the specified tags are copied to backups. If
       * you specify one or more tags when creating a user-initiated backup, no tags are copied from
       * the file system, regardless of this value.
       */
      public fun copyTagsToBackups(copyTagsToBackups: Boolean)

      /**
       * @param copyTagsToBackups A boolean flag indicating whether tags for the file system should
       * be copied to backups.
       * This value defaults to false. If it's set to true, all tags for the file system are copied
       * to all automatic and user-initiated backups where the user doesn't specify tags. If this value
       * is true, and you specify one or more tags, only the specified tags are copied to backups. If
       * you specify one or more tags when creating a user-initiated backup, no tags are copied from
       * the file system, regardless of this value.
       */
      public fun copyTagsToBackups(copyTagsToBackups: IResolvable)

      /**
       * @param dailyAutomaticBackupStartTime A recurring daily time, in the format `HH:MM` .
       * `HH` is the zero-padded hour of the day (0-23), and `MM` is the zero-padded minute of the
       * hour. For example, `05:00` specifies 5 AM daily.
       */
      public fun dailyAutomaticBackupStartTime(dailyAutomaticBackupStartTime: String)

      /**
       * @param deploymentType Specifies the file system deployment type, valid values are the
       * following:.
       * * `MULTI_AZ_1` - Deploys a high availability file system that is configured for Multi-AZ
       * redundancy to tolerate temporary Availability Zone (AZ) unavailability. You can only deploy a
       * Multi-AZ file system in AWS Regions that have a minimum of three Availability Zones. Also
       * supports HDD storage type
       * * `SINGLE_AZ_1` - (Default) Choose to deploy a file system that is configured for single AZ
       * redundancy.
       * * `SINGLE_AZ_2` - The latest generation Single AZ file system. Specifies a file system that
       * is configured for single AZ redundancy and supports HDD storage type.
       *
       * For more information, see [Availability and Durability: Single-AZ and Multi-AZ File
       * Systems](https://docs.aws.amazon.com/fsx/latest/WindowsGuide/high-availability-multiAZ.html) .
       */
      public fun deploymentType(deploymentType: String)

      /**
       * @param diskIopsConfiguration The SSD IOPS (input/output operations per second)
       * configuration for an Amazon FSx for Windows file system.
       * By default, Amazon FSx automatically provisions 3 IOPS per GiB of storage capacity. You can
       * provision additional IOPS per GiB of storage, up to the maximum limit associated with your
       * chosen throughput capacity.
       */
      public fun diskIopsConfiguration(diskIopsConfiguration: IResolvable)

      /**
       * @param diskIopsConfiguration The SSD IOPS (input/output operations per second)
       * configuration for an Amazon FSx for Windows file system.
       * By default, Amazon FSx automatically provisions 3 IOPS per GiB of storage capacity. You can
       * provision additional IOPS per GiB of storage, up to the maximum limit associated with your
       * chosen throughput capacity.
       */
      public fun diskIopsConfiguration(diskIopsConfiguration: DiskIopsConfigurationProperty)

      /**
       * @param diskIopsConfiguration The SSD IOPS (input/output operations per second)
       * configuration for an Amazon FSx for Windows file system.
       * By default, Amazon FSx automatically provisions 3 IOPS per GiB of storage capacity. You can
       * provision additional IOPS per GiB of storage, up to the maximum limit associated with your
       * chosen throughput capacity.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("629a73cb1184c8d8e6e1aeee2e1a17222f7701a575244823c03d524616c7c576")
      public
          fun diskIopsConfiguration(diskIopsConfiguration: DiskIopsConfigurationProperty.Builder.() -> Unit)

      /**
       * @param preferredSubnetId Required when `DeploymentType` is set to `MULTI_AZ_1` .
       * This specifies the subnet in which you want the preferred file server to be located. For
       * in- AWS applications, we recommend that you launch your clients in the same availability zone
       * as your preferred file server to reduce cross-availability zone data transfer costs and
       * minimize latency.
       */
      public fun preferredSubnetId(preferredSubnetId: String)

      /**
       * @param selfManagedActiveDirectoryConfiguration The configuration that Amazon FSx uses to
       * join a FSx for Windows File Server file system or an FSx for ONTAP storage virtual machine
       * (SVM) to a self-managed (including on-premises) Microsoft Active Directory (AD) directory.
       * For more information, see [Using Amazon FSx for Windows with your self-managed Microsoft
       * Active Directory](https://docs.aws.amazon.com/fsx/latest/WindowsGuide/self-managed-AD.html) or
       * [Managing FSx for ONTAP
       * SVMs](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/managing-svms.html) .
       */
      public
          fun selfManagedActiveDirectoryConfiguration(selfManagedActiveDirectoryConfiguration: IResolvable)

      /**
       * @param selfManagedActiveDirectoryConfiguration The configuration that Amazon FSx uses to
       * join a FSx for Windows File Server file system or an FSx for ONTAP storage virtual machine
       * (SVM) to a self-managed (including on-premises) Microsoft Active Directory (AD) directory.
       * For more information, see [Using Amazon FSx for Windows with your self-managed Microsoft
       * Active Directory](https://docs.aws.amazon.com/fsx/latest/WindowsGuide/self-managed-AD.html) or
       * [Managing FSx for ONTAP
       * SVMs](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/managing-svms.html) .
       */
      public
          fun selfManagedActiveDirectoryConfiguration(selfManagedActiveDirectoryConfiguration: SelfManagedActiveDirectoryConfigurationProperty)

      /**
       * @param selfManagedActiveDirectoryConfiguration The configuration that Amazon FSx uses to
       * join a FSx for Windows File Server file system or an FSx for ONTAP storage virtual machine
       * (SVM) to a self-managed (including on-premises) Microsoft Active Directory (AD) directory.
       * For more information, see [Using Amazon FSx for Windows with your self-managed Microsoft
       * Active Directory](https://docs.aws.amazon.com/fsx/latest/WindowsGuide/self-managed-AD.html) or
       * [Managing FSx for ONTAP
       * SVMs](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/managing-svms.html) .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bfc424b18d560f4ccb1d00ec2edf493cf56bd33b079c038bcdeeb7e29a499969")
      public
          fun selfManagedActiveDirectoryConfiguration(selfManagedActiveDirectoryConfiguration: SelfManagedActiveDirectoryConfigurationProperty.Builder.() -> Unit)

      /**
       * @param throughputCapacity Sets the throughput capacity of an Amazon FSx file system,
       * measured in megabytes per second (MB/s), in 2 to the *n* th increments, between 2^3 (8) and
       * 2^11 (2048). 
       *
       * To increase storage capacity, a file system must have a minimum throughput capacity of 16
       * MB/s.
       */
      public fun throughputCapacity(throughputCapacity: Number)

      /**
       * @param weeklyMaintenanceStartTime A recurring weekly time, in the format `D:HH:MM` .
       * `D` is the day of the week, for which 1 represents Monday and 7 represents Sunday. For
       * further details, see [the ISO-8601 spec as described on
       * Wikipedia](https://docs.aws.amazon.com/https://en.wikipedia.org/wiki/ISO_week_date) .
       *
       * `HH` is the zero-padded hour of the day (0-23), and `MM` is the zero-padded minute of the
       * hour.
       *
       * For example, `1:05:00` specifies maintenance at 5 AM Monday.
       */
      public fun weeklyMaintenanceStartTime(weeklyMaintenanceStartTime: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.fsx.CfnFileSystem.WindowsConfigurationProperty.Builder =
          software.amazon.awscdk.services.fsx.CfnFileSystem.WindowsConfigurationProperty.builder()

      /**
       * @param activeDirectoryId The ID for an existing AWS Managed Microsoft Active Directory (AD)
       * instance that the file system should join when it's created.
       * Required if you are joining the file system to an existing AWS Managed Microsoft AD.
       */
      override fun activeDirectoryId(activeDirectoryId: String) {
        cdkBuilder.activeDirectoryId(activeDirectoryId)
      }

      /**
       * @param aliases An array of one or more DNS alias names that you want to associate with the
       * Amazon FSx file system.
       * Aliases allow you to use existing DNS names to access the data in your Amazon FSx file
       * system. You can associate up to 50 aliases with a file system at any time.
       *
       * For more information, see [Working with DNS
       * Aliases](https://docs.aws.amazon.com/fsx/latest/WindowsGuide/managing-dns-aliases.html) and
       * [Walkthrough 5: Using DNS aliases to access your file
       * system](https://docs.aws.amazon.com/fsx/latest/WindowsGuide/walkthrough05-file-system-custom-CNAME.html)
       * , including additional steps you must take to be able to access your file system using a DNS
       * alias.
       *
       * An alias name has to meet the following requirements:
       *
       * * Formatted as a fully-qualified domain name (FQDN), `hostname.domain` , for example,
       * `accounting.example.com` .
       * * Can contain alphanumeric characters, the underscore (_), and the hyphen (-).
       * * Cannot start or end with a hyphen.
       * * Can start with a numeric.
       *
       * For DNS alias names, Amazon FSx stores alphabetical characters as lowercase letters (a-z),
       * regardless of how you specify them: as uppercase letters, lowercase letters, or the
       * corresponding letters in escape codes.
       */
      override fun aliases(aliases: List<String>) {
        cdkBuilder.aliases(aliases)
      }

      /**
       * @param aliases An array of one or more DNS alias names that you want to associate with the
       * Amazon FSx file system.
       * Aliases allow you to use existing DNS names to access the data in your Amazon FSx file
       * system. You can associate up to 50 aliases with a file system at any time.
       *
       * For more information, see [Working with DNS
       * Aliases](https://docs.aws.amazon.com/fsx/latest/WindowsGuide/managing-dns-aliases.html) and
       * [Walkthrough 5: Using DNS aliases to access your file
       * system](https://docs.aws.amazon.com/fsx/latest/WindowsGuide/walkthrough05-file-system-custom-CNAME.html)
       * , including additional steps you must take to be able to access your file system using a DNS
       * alias.
       *
       * An alias name has to meet the following requirements:
       *
       * * Formatted as a fully-qualified domain name (FQDN), `hostname.domain` , for example,
       * `accounting.example.com` .
       * * Can contain alphanumeric characters, the underscore (_), and the hyphen (-).
       * * Cannot start or end with a hyphen.
       * * Can start with a numeric.
       *
       * For DNS alias names, Amazon FSx stores alphabetical characters as lowercase letters (a-z),
       * regardless of how you specify them: as uppercase letters, lowercase letters, or the
       * corresponding letters in escape codes.
       */
      override fun aliases(vararg aliases: String): Unit = aliases(aliases.toList())

      /**
       * @param auditLogConfiguration The configuration that Amazon FSx for Windows File Server uses
       * to audit and log user accesses of files, folders, and file shares on the Amazon FSx for
       * Windows File Server file system.
       */
      override fun auditLogConfiguration(auditLogConfiguration: IResolvable) {
        cdkBuilder.auditLogConfiguration(auditLogConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param auditLogConfiguration The configuration that Amazon FSx for Windows File Server uses
       * to audit and log user accesses of files, folders, and file shares on the Amazon FSx for
       * Windows File Server file system.
       */
      override fun auditLogConfiguration(auditLogConfiguration: AuditLogConfigurationProperty) {
        cdkBuilder.auditLogConfiguration(auditLogConfiguration.let(AuditLogConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param auditLogConfiguration The configuration that Amazon FSx for Windows File Server uses
       * to audit and log user accesses of files, folders, and file shares on the Amazon FSx for
       * Windows File Server file system.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e3607c85da94b03db39fd8d5195dc2332a907b139d68ddcb6e4bfb47fe033a4f")
      override
          fun auditLogConfiguration(auditLogConfiguration: AuditLogConfigurationProperty.Builder.() -> Unit):
          Unit = auditLogConfiguration(AuditLogConfigurationProperty(auditLogConfiguration))

      /**
       * @param automaticBackupRetentionDays The number of days to retain automatic backups.
       * Setting this property to `0` disables automatic backups. You can retain automatic backups
       * for a maximum of 90 days. The default is `30` .
       */
      override fun automaticBackupRetentionDays(automaticBackupRetentionDays: Number) {
        cdkBuilder.automaticBackupRetentionDays(automaticBackupRetentionDays)
      }

      /**
       * @param copyTagsToBackups A boolean flag indicating whether tags for the file system should
       * be copied to backups.
       * This value defaults to false. If it's set to true, all tags for the file system are copied
       * to all automatic and user-initiated backups where the user doesn't specify tags. If this value
       * is true, and you specify one or more tags, only the specified tags are copied to backups. If
       * you specify one or more tags when creating a user-initiated backup, no tags are copied from
       * the file system, regardless of this value.
       */
      override fun copyTagsToBackups(copyTagsToBackups: Boolean) {
        cdkBuilder.copyTagsToBackups(copyTagsToBackups)
      }

      /**
       * @param copyTagsToBackups A boolean flag indicating whether tags for the file system should
       * be copied to backups.
       * This value defaults to false. If it's set to true, all tags for the file system are copied
       * to all automatic and user-initiated backups where the user doesn't specify tags. If this value
       * is true, and you specify one or more tags, only the specified tags are copied to backups. If
       * you specify one or more tags when creating a user-initiated backup, no tags are copied from
       * the file system, regardless of this value.
       */
      override fun copyTagsToBackups(copyTagsToBackups: IResolvable) {
        cdkBuilder.copyTagsToBackups(copyTagsToBackups.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param dailyAutomaticBackupStartTime A recurring daily time, in the format `HH:MM` .
       * `HH` is the zero-padded hour of the day (0-23), and `MM` is the zero-padded minute of the
       * hour. For example, `05:00` specifies 5 AM daily.
       */
      override fun dailyAutomaticBackupStartTime(dailyAutomaticBackupStartTime: String) {
        cdkBuilder.dailyAutomaticBackupStartTime(dailyAutomaticBackupStartTime)
      }

      /**
       * @param deploymentType Specifies the file system deployment type, valid values are the
       * following:.
       * * `MULTI_AZ_1` - Deploys a high availability file system that is configured for Multi-AZ
       * redundancy to tolerate temporary Availability Zone (AZ) unavailability. You can only deploy a
       * Multi-AZ file system in AWS Regions that have a minimum of three Availability Zones. Also
       * supports HDD storage type
       * * `SINGLE_AZ_1` - (Default) Choose to deploy a file system that is configured for single AZ
       * redundancy.
       * * `SINGLE_AZ_2` - The latest generation Single AZ file system. Specifies a file system that
       * is configured for single AZ redundancy and supports HDD storage type.
       *
       * For more information, see [Availability and Durability: Single-AZ and Multi-AZ File
       * Systems](https://docs.aws.amazon.com/fsx/latest/WindowsGuide/high-availability-multiAZ.html) .
       */
      override fun deploymentType(deploymentType: String) {
        cdkBuilder.deploymentType(deploymentType)
      }

      /**
       * @param diskIopsConfiguration The SSD IOPS (input/output operations per second)
       * configuration for an Amazon FSx for Windows file system.
       * By default, Amazon FSx automatically provisions 3 IOPS per GiB of storage capacity. You can
       * provision additional IOPS per GiB of storage, up to the maximum limit associated with your
       * chosen throughput capacity.
       */
      override fun diskIopsConfiguration(diskIopsConfiguration: IResolvable) {
        cdkBuilder.diskIopsConfiguration(diskIopsConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param diskIopsConfiguration The SSD IOPS (input/output operations per second)
       * configuration for an Amazon FSx for Windows file system.
       * By default, Amazon FSx automatically provisions 3 IOPS per GiB of storage capacity. You can
       * provision additional IOPS per GiB of storage, up to the maximum limit associated with your
       * chosen throughput capacity.
       */
      override fun diskIopsConfiguration(diskIopsConfiguration: DiskIopsConfigurationProperty) {
        cdkBuilder.diskIopsConfiguration(diskIopsConfiguration.let(DiskIopsConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param diskIopsConfiguration The SSD IOPS (input/output operations per second)
       * configuration for an Amazon FSx for Windows file system.
       * By default, Amazon FSx automatically provisions 3 IOPS per GiB of storage capacity. You can
       * provision additional IOPS per GiB of storage, up to the maximum limit associated with your
       * chosen throughput capacity.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("629a73cb1184c8d8e6e1aeee2e1a17222f7701a575244823c03d524616c7c576")
      override
          fun diskIopsConfiguration(diskIopsConfiguration: DiskIopsConfigurationProperty.Builder.() -> Unit):
          Unit = diskIopsConfiguration(DiskIopsConfigurationProperty(diskIopsConfiguration))

      /**
       * @param preferredSubnetId Required when `DeploymentType` is set to `MULTI_AZ_1` .
       * This specifies the subnet in which you want the preferred file server to be located. For
       * in- AWS applications, we recommend that you launch your clients in the same availability zone
       * as your preferred file server to reduce cross-availability zone data transfer costs and
       * minimize latency.
       */
      override fun preferredSubnetId(preferredSubnetId: String) {
        cdkBuilder.preferredSubnetId(preferredSubnetId)
      }

      /**
       * @param selfManagedActiveDirectoryConfiguration The configuration that Amazon FSx uses to
       * join a FSx for Windows File Server file system or an FSx for ONTAP storage virtual machine
       * (SVM) to a self-managed (including on-premises) Microsoft Active Directory (AD) directory.
       * For more information, see [Using Amazon FSx for Windows with your self-managed Microsoft
       * Active Directory](https://docs.aws.amazon.com/fsx/latest/WindowsGuide/self-managed-AD.html) or
       * [Managing FSx for ONTAP
       * SVMs](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/managing-svms.html) .
       */
      override
          fun selfManagedActiveDirectoryConfiguration(selfManagedActiveDirectoryConfiguration: IResolvable) {
        cdkBuilder.selfManagedActiveDirectoryConfiguration(selfManagedActiveDirectoryConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param selfManagedActiveDirectoryConfiguration The configuration that Amazon FSx uses to
       * join a FSx for Windows File Server file system or an FSx for ONTAP storage virtual machine
       * (SVM) to a self-managed (including on-premises) Microsoft Active Directory (AD) directory.
       * For more information, see [Using Amazon FSx for Windows with your self-managed Microsoft
       * Active Directory](https://docs.aws.amazon.com/fsx/latest/WindowsGuide/self-managed-AD.html) or
       * [Managing FSx for ONTAP
       * SVMs](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/managing-svms.html) .
       */
      override
          fun selfManagedActiveDirectoryConfiguration(selfManagedActiveDirectoryConfiguration: SelfManagedActiveDirectoryConfigurationProperty) {
        cdkBuilder.selfManagedActiveDirectoryConfiguration(selfManagedActiveDirectoryConfiguration.let(SelfManagedActiveDirectoryConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param selfManagedActiveDirectoryConfiguration The configuration that Amazon FSx uses to
       * join a FSx for Windows File Server file system or an FSx for ONTAP storage virtual machine
       * (SVM) to a self-managed (including on-premises) Microsoft Active Directory (AD) directory.
       * For more information, see [Using Amazon FSx for Windows with your self-managed Microsoft
       * Active Directory](https://docs.aws.amazon.com/fsx/latest/WindowsGuide/self-managed-AD.html) or
       * [Managing FSx for ONTAP
       * SVMs](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/managing-svms.html) .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bfc424b18d560f4ccb1d00ec2edf493cf56bd33b079c038bcdeeb7e29a499969")
      override
          fun selfManagedActiveDirectoryConfiguration(selfManagedActiveDirectoryConfiguration: SelfManagedActiveDirectoryConfigurationProperty.Builder.() -> Unit):
          Unit =
          selfManagedActiveDirectoryConfiguration(SelfManagedActiveDirectoryConfigurationProperty(selfManagedActiveDirectoryConfiguration))

      /**
       * @param throughputCapacity Sets the throughput capacity of an Amazon FSx file system,
       * measured in megabytes per second (MB/s), in 2 to the *n* th increments, between 2^3 (8) and
       * 2^11 (2048). 
       *
       * To increase storage capacity, a file system must have a minimum throughput capacity of 16
       * MB/s.
       */
      override fun throughputCapacity(throughputCapacity: Number) {
        cdkBuilder.throughputCapacity(throughputCapacity)
      }

      /**
       * @param weeklyMaintenanceStartTime A recurring weekly time, in the format `D:HH:MM` .
       * `D` is the day of the week, for which 1 represents Monday and 7 represents Sunday. For
       * further details, see [the ISO-8601 spec as described on
       * Wikipedia](https://docs.aws.amazon.com/https://en.wikipedia.org/wiki/ISO_week_date) .
       *
       * `HH` is the zero-padded hour of the day (0-23), and `MM` is the zero-padded minute of the
       * hour.
       *
       * For example, `1:05:00` specifies maintenance at 5 AM Monday.
       */
      override fun weeklyMaintenanceStartTime(weeklyMaintenanceStartTime: String) {
        cdkBuilder.weeklyMaintenanceStartTime(weeklyMaintenanceStartTime)
      }

      public fun build():
          software.amazon.awscdk.services.fsx.CfnFileSystem.WindowsConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.fsx.CfnFileSystem.WindowsConfigurationProperty,
    ) : CdkObject(cdkObject), WindowsConfigurationProperty {
      /**
       * The ID for an existing AWS Managed Microsoft Active Directory (AD) instance that the file
       * system should join when it's created.
       *
       * Required if you are joining the file system to an existing AWS Managed Microsoft AD.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-windowsconfiguration.html#cfn-fsx-filesystem-windowsconfiguration-activedirectoryid)
       */
      override fun activeDirectoryId(): String? = unwrap(this).getActiveDirectoryId()

      /**
       * An array of one or more DNS alias names that you want to associate with the Amazon FSx file
       * system.
       *
       * Aliases allow you to use existing DNS names to access the data in your Amazon FSx file
       * system. You can associate up to 50 aliases with a file system at any time.
       *
       * For more information, see [Working with DNS
       * Aliases](https://docs.aws.amazon.com/fsx/latest/WindowsGuide/managing-dns-aliases.html) and
       * [Walkthrough 5: Using DNS aliases to access your file
       * system](https://docs.aws.amazon.com/fsx/latest/WindowsGuide/walkthrough05-file-system-custom-CNAME.html)
       * , including additional steps you must take to be able to access your file system using a DNS
       * alias.
       *
       * An alias name has to meet the following requirements:
       *
       * * Formatted as a fully-qualified domain name (FQDN), `hostname.domain` , for example,
       * `accounting.example.com` .
       * * Can contain alphanumeric characters, the underscore (_), and the hyphen (-).
       * * Cannot start or end with a hyphen.
       * * Can start with a numeric.
       *
       * For DNS alias names, Amazon FSx stores alphabetical characters as lowercase letters (a-z),
       * regardless of how you specify them: as uppercase letters, lowercase letters, or the
       * corresponding letters in escape codes.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-windowsconfiguration.html#cfn-fsx-filesystem-windowsconfiguration-aliases)
       */
      override fun aliases(): List<String> = unwrap(this).getAliases() ?: emptyList()

      /**
       * The configuration that Amazon FSx for Windows File Server uses to audit and log user
       * accesses of files, folders, and file shares on the Amazon FSx for Windows File Server file
       * system.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-windowsconfiguration.html#cfn-fsx-filesystem-windowsconfiguration-auditlogconfiguration)
       */
      override fun auditLogConfiguration(): Any? = unwrap(this).getAuditLogConfiguration()

      /**
       * The number of days to retain automatic backups.
       *
       * Setting this property to `0` disables automatic backups. You can retain automatic backups
       * for a maximum of 90 days. The default is `30` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-windowsconfiguration.html#cfn-fsx-filesystem-windowsconfiguration-automaticbackupretentiondays)
       */
      override fun automaticBackupRetentionDays(): Number? =
          unwrap(this).getAutomaticBackupRetentionDays()

      /**
       * A boolean flag indicating whether tags for the file system should be copied to backups.
       *
       * This value defaults to false. If it's set to true, all tags for the file system are copied
       * to all automatic and user-initiated backups where the user doesn't specify tags. If this value
       * is true, and you specify one or more tags, only the specified tags are copied to backups. If
       * you specify one or more tags when creating a user-initiated backup, no tags are copied from
       * the file system, regardless of this value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-windowsconfiguration.html#cfn-fsx-filesystem-windowsconfiguration-copytagstobackups)
       */
      override fun copyTagsToBackups(): Any? = unwrap(this).getCopyTagsToBackups()

      /**
       * A recurring daily time, in the format `HH:MM` .
       *
       * `HH` is the zero-padded hour of the day (0-23), and `MM` is the zero-padded minute of the
       * hour. For example, `05:00` specifies 5 AM daily.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-windowsconfiguration.html#cfn-fsx-filesystem-windowsconfiguration-dailyautomaticbackupstarttime)
       */
      override fun dailyAutomaticBackupStartTime(): String? =
          unwrap(this).getDailyAutomaticBackupStartTime()

      /**
       * Specifies the file system deployment type, valid values are the following:.
       *
       * * `MULTI_AZ_1` - Deploys a high availability file system that is configured for Multi-AZ
       * redundancy to tolerate temporary Availability Zone (AZ) unavailability. You can only deploy a
       * Multi-AZ file system in AWS Regions that have a minimum of three Availability Zones. Also
       * supports HDD storage type
       * * `SINGLE_AZ_1` - (Default) Choose to deploy a file system that is configured for single AZ
       * redundancy.
       * * `SINGLE_AZ_2` - The latest generation Single AZ file system. Specifies a file system that
       * is configured for single AZ redundancy and supports HDD storage type.
       *
       * For more information, see [Availability and Durability: Single-AZ and Multi-AZ File
       * Systems](https://docs.aws.amazon.com/fsx/latest/WindowsGuide/high-availability-multiAZ.html) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-windowsconfiguration.html#cfn-fsx-filesystem-windowsconfiguration-deploymenttype)
       */
      override fun deploymentType(): String? = unwrap(this).getDeploymentType()

      /**
       * The SSD IOPS (input/output operations per second) configuration for an Amazon FSx for
       * Windows file system.
       *
       * By default, Amazon FSx automatically provisions 3 IOPS per GiB of storage capacity. You can
       * provision additional IOPS per GiB of storage, up to the maximum limit associated with your
       * chosen throughput capacity.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-windowsconfiguration.html#cfn-fsx-filesystem-windowsconfiguration-diskiopsconfiguration)
       */
      override fun diskIopsConfiguration(): Any? = unwrap(this).getDiskIopsConfiguration()

      /**
       * Required when `DeploymentType` is set to `MULTI_AZ_1` .
       *
       * This specifies the subnet in which you want the preferred file server to be located. For
       * in- AWS applications, we recommend that you launch your clients in the same availability zone
       * as your preferred file server to reduce cross-availability zone data transfer costs and
       * minimize latency.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-windowsconfiguration.html#cfn-fsx-filesystem-windowsconfiguration-preferredsubnetid)
       */
      override fun preferredSubnetId(): String? = unwrap(this).getPreferredSubnetId()

      /**
       * The configuration that Amazon FSx uses to join a FSx for Windows File Server file system or
       * an FSx for ONTAP storage virtual machine (SVM) to a self-managed (including on-premises)
       * Microsoft Active Directory (AD) directory.
       *
       * For more information, see [Using Amazon FSx for Windows with your self-managed Microsoft
       * Active Directory](https://docs.aws.amazon.com/fsx/latest/WindowsGuide/self-managed-AD.html) or
       * [Managing FSx for ONTAP
       * SVMs](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/managing-svms.html) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-windowsconfiguration.html#cfn-fsx-filesystem-windowsconfiguration-selfmanagedactivedirectoryconfiguration)
       */
      override fun selfManagedActiveDirectoryConfiguration(): Any? =
          unwrap(this).getSelfManagedActiveDirectoryConfiguration()

      /**
       * Sets the throughput capacity of an Amazon FSx file system, measured in megabytes per second
       * (MB/s), in 2 to the *n* th increments, between 2^3 (8) and 2^11 (2048).
       *
       *
       * To increase storage capacity, a file system must have a minimum throughput capacity of 16
       * MB/s.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-windowsconfiguration.html#cfn-fsx-filesystem-windowsconfiguration-throughputcapacity)
       */
      override fun throughputCapacity(): Number = unwrap(this).getThroughputCapacity()

      /**
       * A recurring weekly time, in the format `D:HH:MM` .
       *
       * `D` is the day of the week, for which 1 represents Monday and 7 represents Sunday. For
       * further details, see [the ISO-8601 spec as described on
       * Wikipedia](https://docs.aws.amazon.com/https://en.wikipedia.org/wiki/ISO_week_date) .
       *
       * `HH` is the zero-padded hour of the day (0-23), and `MM` is the zero-padded minute of the
       * hour.
       *
       * For example, `1:05:00` specifies maintenance at 5 AM Monday.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-windowsconfiguration.html#cfn-fsx-filesystem-windowsconfiguration-weeklymaintenancestarttime)
       */
      override fun weeklyMaintenanceStartTime(): String? =
          unwrap(this).getWeeklyMaintenanceStartTime()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): WindowsConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.fsx.CfnFileSystem.WindowsConfigurationProperty):
          WindowsConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          WindowsConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: WindowsConfigurationProperty):
          software.amazon.awscdk.services.fsx.CfnFileSystem.WindowsConfigurationProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.fsx.CfnFileSystem.WindowsConfigurationProperty
    }
  }
}
