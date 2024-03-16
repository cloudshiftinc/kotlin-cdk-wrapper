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
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a storage virtual machine (SVM) for an Amazon FSx for ONTAP file system.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.fsx.*;
 * CfnStorageVirtualMachine cfnStorageVirtualMachine = CfnStorageVirtualMachine.Builder.create(this,
 * "MyCfnStorageVirtualMachine")
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
public open class CfnStorageVirtualMachine internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.fsx.CfnStorageVirtualMachine,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * Describes the Microsoft Active Directory configuration to which the SVM is joined, if
   * applicable.
   */
  public open fun activeDirectoryConfiguration(): Any? =
      unwrap(this).getActiveDirectoryConfiguration()

  /**
   * Describes the Microsoft Active Directory configuration to which the SVM is joined, if
   * applicable.
   */
  public open fun activeDirectoryConfiguration(`value`: IResolvable) {
    unwrap(this).setActiveDirectoryConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * Describes the Microsoft Active Directory configuration to which the SVM is joined, if
   * applicable.
   */
  public open fun activeDirectoryConfiguration(`value`: ActiveDirectoryConfigurationProperty) {
    unwrap(this).setActiveDirectoryConfiguration(`value`.let(ActiveDirectoryConfigurationProperty::unwrap))
  }

  /**
   * Describes the Microsoft Active Directory configuration to which the SVM is joined, if
   * applicable.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3f2b9c5ae86be2ef8d38f86ebc83e423b54a06b9e75ad1c879ecab55e71da02b")
  public open
      fun activeDirectoryConfiguration(`value`: ActiveDirectoryConfigurationProperty.Builder.() -> Unit):
      Unit = activeDirectoryConfiguration(ActiveDirectoryConfigurationProperty(`value`))

  /**
   * Returns the storage virtual machine's Amazon Resource Name (ARN).
   *
   * Example:
   * `arn:aws:fsx:us-east-2:111111111111:storage-virtual-machine/fs-0123456789abcdef1/svm-01234567890123456`
   */
  public open fun attrResourceArn(): String = unwrap(this).getAttrResourceArn()

  /**
   * Returns the storgage virtual machine's system generated ID.
   *
   * Example: `svm-0123456789abcedf1`
   */
  public open fun attrStorageVirtualMachineId(): String =
      unwrap(this).getAttrStorageVirtualMachineId()

  /**
   * Returns the storage virtual machine's system generated unique identifier (UUID).
   *
   * Example: `abcd0123-cd45-ef67-11aa-1111aaaa23bc`
   */
  public open fun attrUuid(): String = unwrap(this).getAttrUuid()

  /**
   * Specifies the FSx for ONTAP file system on which to create the SVM.
   */
  public open fun fileSystemId(): String = unwrap(this).getFileSystemId()

  /**
   * Specifies the FSx for ONTAP file system on which to create the SVM.
   */
  public open fun fileSystemId(`value`: String) {
    unwrap(this).setFileSystemId(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The name of the SVM.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the SVM.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The security style of the root volume of the SVM.
   *
   * Specify one of the following values:.
   */
  public open fun rootVolumeSecurityStyle(): String? = unwrap(this).getRootVolumeSecurityStyle()

  /**
   * The security style of the root volume of the SVM.
   *
   * Specify one of the following values:.
   */
  public open fun rootVolumeSecurityStyle(`value`: String) {
    unwrap(this).setRootVolumeSecurityStyle(`value`)
  }

  /**
   * Specifies the password to use when logging on to the SVM using a secure shell (SSH) connection
   * to the SVM's management endpoint.
   */
  public open fun svmAdminPassword(): String? = unwrap(this).getSvmAdminPassword()

  /**
   * Specifies the password to use when logging on to the SVM using a secure shell (SSH) connection
   * to the SVM's management endpoint.
   */
  public open fun svmAdminPassword(`value`: String) {
    unwrap(this).setSvmAdminPassword(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * A list of `Tag` values, with a maximum of 50 elements.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * A list of `Tag` values, with a maximum of 50 elements.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * A list of `Tag` values, with a maximum of 50 elements.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.fsx.CfnStorageVirtualMachine].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Describes the Microsoft Active Directory configuration to which the SVM is joined, if
     * applicable.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-storagevirtualmachine.html#cfn-fsx-storagevirtualmachine-activedirectoryconfiguration)
     * @param activeDirectoryConfiguration Describes the Microsoft Active Directory configuration to
     * which the SVM is joined, if applicable. 
     */
    public fun activeDirectoryConfiguration(activeDirectoryConfiguration: IResolvable)

    /**
     * Describes the Microsoft Active Directory configuration to which the SVM is joined, if
     * applicable.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-storagevirtualmachine.html#cfn-fsx-storagevirtualmachine-activedirectoryconfiguration)
     * @param activeDirectoryConfiguration Describes the Microsoft Active Directory configuration to
     * which the SVM is joined, if applicable. 
     */
    public
        fun activeDirectoryConfiguration(activeDirectoryConfiguration: ActiveDirectoryConfigurationProperty)

    /**
     * Describes the Microsoft Active Directory configuration to which the SVM is joined, if
     * applicable.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-storagevirtualmachine.html#cfn-fsx-storagevirtualmachine-activedirectoryconfiguration)
     * @param activeDirectoryConfiguration Describes the Microsoft Active Directory configuration to
     * which the SVM is joined, if applicable. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3777fa4b33efd2030c60cd94751de6b23d72c20d6e39ab9e701f492a1b0b42ee")
    public
        fun activeDirectoryConfiguration(activeDirectoryConfiguration: ActiveDirectoryConfigurationProperty.Builder.() -> Unit)

    /**
     * Specifies the FSx for ONTAP file system on which to create the SVM.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-storagevirtualmachine.html#cfn-fsx-storagevirtualmachine-filesystemid)
     * @param fileSystemId Specifies the FSx for ONTAP file system on which to create the SVM. 
     */
    public fun fileSystemId(fileSystemId: String)

    /**
     * The name of the SVM.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-storagevirtualmachine.html#cfn-fsx-storagevirtualmachine-name)
     * @param name The name of the SVM. 
     */
    public fun name(name: String)

    /**
     * The security style of the root volume of the SVM. Specify one of the following values:.
     *
     * * `UNIX` if the file system is managed by a UNIX administrator, the majority of users are NFS
     * clients, and an application accessing the data uses a UNIX user as the service account.
     * * `NTFS` if the file system is managed by a Microsoft Windows administrator, the majority of
     * users are SMB clients, and an application accessing the data uses a Microsoft Windows user as
     * the service account.
     * * `MIXED` This is an advanced setting. For more information, see [Volume security
     * style](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/volume-security-style.html) in the
     * Amazon FSx for NetApp ONTAP User Guide.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-storagevirtualmachine.html#cfn-fsx-storagevirtualmachine-rootvolumesecuritystyle)
     * @param rootVolumeSecurityStyle The security style of the root volume of the SVM. Specify one
     * of the following values:. 
     */
    public fun rootVolumeSecurityStyle(rootVolumeSecurityStyle: String)

    /**
     * Specifies the password to use when logging on to the SVM using a secure shell (SSH)
     * connection to the SVM's management endpoint.
     *
     * Doing so enables you to manage the SVM using the NetApp ONTAP CLI or REST API. If you do not
     * specify a password, you can still use the file system's `fsxadmin` user to manage the SVM. For
     * more information, see [Managing SVMs using the NetApp ONTAP
     * CLI](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/managing-resources-ontap-apps.html#vsadmin-ontap-cli)
     * in the *FSx for ONTAP User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-storagevirtualmachine.html#cfn-fsx-storagevirtualmachine-svmadminpassword)
     * @param svmAdminPassword Specifies the password to use when logging on to the SVM using a
     * secure shell (SSH) connection to the SVM's management endpoint. 
     */
    public fun svmAdminPassword(svmAdminPassword: String)

    /**
     * A list of `Tag` values, with a maximum of 50 elements.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-storagevirtualmachine.html#cfn-fsx-storagevirtualmachine-tags)
     * @param tags A list of `Tag` values, with a maximum of 50 elements. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * A list of `Tag` values, with a maximum of 50 elements.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-storagevirtualmachine.html#cfn-fsx-storagevirtualmachine-tags)
     * @param tags A list of `Tag` values, with a maximum of 50 elements. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.fsx.CfnStorageVirtualMachine.Builder =
        software.amazon.awscdk.services.fsx.CfnStorageVirtualMachine.Builder.create(scope, id)

    /**
     * Describes the Microsoft Active Directory configuration to which the SVM is joined, if
     * applicable.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-storagevirtualmachine.html#cfn-fsx-storagevirtualmachine-activedirectoryconfiguration)
     * @param activeDirectoryConfiguration Describes the Microsoft Active Directory configuration to
     * which the SVM is joined, if applicable. 
     */
    override fun activeDirectoryConfiguration(activeDirectoryConfiguration: IResolvable) {
      cdkBuilder.activeDirectoryConfiguration(activeDirectoryConfiguration.let(IResolvable::unwrap))
    }

    /**
     * Describes the Microsoft Active Directory configuration to which the SVM is joined, if
     * applicable.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-storagevirtualmachine.html#cfn-fsx-storagevirtualmachine-activedirectoryconfiguration)
     * @param activeDirectoryConfiguration Describes the Microsoft Active Directory configuration to
     * which the SVM is joined, if applicable. 
     */
    override
        fun activeDirectoryConfiguration(activeDirectoryConfiguration: ActiveDirectoryConfigurationProperty) {
      cdkBuilder.activeDirectoryConfiguration(activeDirectoryConfiguration.let(ActiveDirectoryConfigurationProperty::unwrap))
    }

    /**
     * Describes the Microsoft Active Directory configuration to which the SVM is joined, if
     * applicable.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-storagevirtualmachine.html#cfn-fsx-storagevirtualmachine-activedirectoryconfiguration)
     * @param activeDirectoryConfiguration Describes the Microsoft Active Directory configuration to
     * which the SVM is joined, if applicable. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3777fa4b33efd2030c60cd94751de6b23d72c20d6e39ab9e701f492a1b0b42ee")
    override
        fun activeDirectoryConfiguration(activeDirectoryConfiguration: ActiveDirectoryConfigurationProperty.Builder.() -> Unit):
        Unit =
        activeDirectoryConfiguration(ActiveDirectoryConfigurationProperty(activeDirectoryConfiguration))

    /**
     * Specifies the FSx for ONTAP file system on which to create the SVM.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-storagevirtualmachine.html#cfn-fsx-storagevirtualmachine-filesystemid)
     * @param fileSystemId Specifies the FSx for ONTAP file system on which to create the SVM. 
     */
    override fun fileSystemId(fileSystemId: String) {
      cdkBuilder.fileSystemId(fileSystemId)
    }

    /**
     * The name of the SVM.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-storagevirtualmachine.html#cfn-fsx-storagevirtualmachine-name)
     * @param name The name of the SVM. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The security style of the root volume of the SVM. Specify one of the following values:.
     *
     * * `UNIX` if the file system is managed by a UNIX administrator, the majority of users are NFS
     * clients, and an application accessing the data uses a UNIX user as the service account.
     * * `NTFS` if the file system is managed by a Microsoft Windows administrator, the majority of
     * users are SMB clients, and an application accessing the data uses a Microsoft Windows user as
     * the service account.
     * * `MIXED` This is an advanced setting. For more information, see [Volume security
     * style](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/volume-security-style.html) in the
     * Amazon FSx for NetApp ONTAP User Guide.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-storagevirtualmachine.html#cfn-fsx-storagevirtualmachine-rootvolumesecuritystyle)
     * @param rootVolumeSecurityStyle The security style of the root volume of the SVM. Specify one
     * of the following values:. 
     */
    override fun rootVolumeSecurityStyle(rootVolumeSecurityStyle: String) {
      cdkBuilder.rootVolumeSecurityStyle(rootVolumeSecurityStyle)
    }

    /**
     * Specifies the password to use when logging on to the SVM using a secure shell (SSH)
     * connection to the SVM's management endpoint.
     *
     * Doing so enables you to manage the SVM using the NetApp ONTAP CLI or REST API. If you do not
     * specify a password, you can still use the file system's `fsxadmin` user to manage the SVM. For
     * more information, see [Managing SVMs using the NetApp ONTAP
     * CLI](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/managing-resources-ontap-apps.html#vsadmin-ontap-cli)
     * in the *FSx for ONTAP User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-storagevirtualmachine.html#cfn-fsx-storagevirtualmachine-svmadminpassword)
     * @param svmAdminPassword Specifies the password to use when logging on to the SVM using a
     * secure shell (SSH) connection to the SVM's management endpoint. 
     */
    override fun svmAdminPassword(svmAdminPassword: String) {
      cdkBuilder.svmAdminPassword(svmAdminPassword)
    }

    /**
     * A list of `Tag` values, with a maximum of 50 elements.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-storagevirtualmachine.html#cfn-fsx-storagevirtualmachine-tags)
     * @param tags A list of `Tag` values, with a maximum of 50 elements. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * A list of `Tag` values, with a maximum of 50 elements.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-storagevirtualmachine.html#cfn-fsx-storagevirtualmachine-tags)
     * @param tags A list of `Tag` values, with a maximum of 50 elements. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.fsx.CfnStorageVirtualMachine =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.fsx.CfnStorageVirtualMachine.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnStorageVirtualMachine {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnStorageVirtualMachine(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.fsx.CfnStorageVirtualMachine):
        CfnStorageVirtualMachine = CfnStorageVirtualMachine(cdkObject)

    internal fun unwrap(wrapped: CfnStorageVirtualMachine):
        software.amazon.awscdk.services.fsx.CfnStorageVirtualMachine = wrapped.cdkObject
  }

  /**
   * The configuration that Amazon FSx uses to join the ONTAP storage virtual machine (SVM) to your
   * self-managed (including on-premises) Microsoft Active Directory directory.
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-storagevirtualmachine-selfmanagedactivedirectoryconfiguration.html)
   */
  public interface SelfManagedActiveDirectoryConfigurationProperty {
    /**
     * A list of up to three IP addresses of DNS servers or domain controllers in the self-managed
     * AD directory.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-storagevirtualmachine-selfmanagedactivedirectoryconfiguration.html#cfn-fsx-storagevirtualmachine-selfmanagedactivedirectoryconfiguration-dnsips)
     */
    public fun dnsIps(): List<String> = unwrap(this).getDnsIps() ?: emptyList()

    /**
     * The fully qualified domain name of the self-managed AD directory, such as `corp.example.com`
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-storagevirtualmachine-selfmanagedactivedirectoryconfiguration.html#cfn-fsx-storagevirtualmachine-selfmanagedactivedirectoryconfiguration-domainname)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-storagevirtualmachine-selfmanagedactivedirectoryconfiguration.html#cfn-fsx-storagevirtualmachine-selfmanagedactivedirectoryconfiguration-filesystemadministratorsgroup)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-storagevirtualmachine-selfmanagedactivedirectoryconfiguration.html#cfn-fsx-storagevirtualmachine-selfmanagedactivedirectoryconfiguration-organizationalunitdistinguishedname)
     */
    public fun organizationalUnitDistinguishedName(): String? =
        unwrap(this).getOrganizationalUnitDistinguishedName()

    /**
     * The password for the service account on your self-managed AD domain that Amazon FSx will use
     * to join to your AD domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-storagevirtualmachine-selfmanagedactivedirectoryconfiguration.html#cfn-fsx-storagevirtualmachine-selfmanagedactivedirectoryconfiguration-password)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-storagevirtualmachine-selfmanagedactivedirectoryconfiguration.html#cfn-fsx-storagevirtualmachine-selfmanagedactivedirectoryconfiguration-username)
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
          software.amazon.awscdk.services.fsx.CfnStorageVirtualMachine.SelfManagedActiveDirectoryConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.fsx.CfnStorageVirtualMachine.SelfManagedActiveDirectoryConfigurationProperty.builder()

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
          software.amazon.awscdk.services.fsx.CfnStorageVirtualMachine.SelfManagedActiveDirectoryConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.fsx.CfnStorageVirtualMachine.SelfManagedActiveDirectoryConfigurationProperty,
    ) : CdkObject(cdkObject), SelfManagedActiveDirectoryConfigurationProperty {
      /**
       * A list of up to three IP addresses of DNS servers or domain controllers in the self-managed
       * AD directory.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-storagevirtualmachine-selfmanagedactivedirectoryconfiguration.html#cfn-fsx-storagevirtualmachine-selfmanagedactivedirectoryconfiguration-dnsips)
       */
      override fun dnsIps(): List<String> = unwrap(this).getDnsIps() ?: emptyList()

      /**
       * The fully qualified domain name of the self-managed AD directory, such as
       * `corp.example.com` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-storagevirtualmachine-selfmanagedactivedirectoryconfiguration.html#cfn-fsx-storagevirtualmachine-selfmanagedactivedirectoryconfiguration-domainname)
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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-storagevirtualmachine-selfmanagedactivedirectoryconfiguration.html#cfn-fsx-storagevirtualmachine-selfmanagedactivedirectoryconfiguration-filesystemadministratorsgroup)
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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-storagevirtualmachine-selfmanagedactivedirectoryconfiguration.html#cfn-fsx-storagevirtualmachine-selfmanagedactivedirectoryconfiguration-organizationalunitdistinguishedname)
       */
      override fun organizationalUnitDistinguishedName(): String? =
          unwrap(this).getOrganizationalUnitDistinguishedName()

      /**
       * The password for the service account on your self-managed AD domain that Amazon FSx will
       * use to join to your AD domain.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-storagevirtualmachine-selfmanagedactivedirectoryconfiguration.html#cfn-fsx-storagevirtualmachine-selfmanagedactivedirectoryconfiguration-password)
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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-storagevirtualmachine-selfmanagedactivedirectoryconfiguration.html#cfn-fsx-storagevirtualmachine-selfmanagedactivedirectoryconfiguration-username)
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
          fun wrap(cdkObject: software.amazon.awscdk.services.fsx.CfnStorageVirtualMachine.SelfManagedActiveDirectoryConfigurationProperty):
          SelfManagedActiveDirectoryConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as
          SelfManagedActiveDirectoryConfigurationProperty

      internal fun unwrap(wrapped: SelfManagedActiveDirectoryConfigurationProperty):
          software.amazon.awscdk.services.fsx.CfnStorageVirtualMachine.SelfManagedActiveDirectoryConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.fsx.CfnStorageVirtualMachine.SelfManagedActiveDirectoryConfigurationProperty
    }
  }

  /**
   * Describes the self-managed Microsoft Active Directory to which you want to join the SVM.
   *
   * Joining an Active Directory provides user authentication and access control for SMB clients,
   * including Microsoft Windows and macOS clients accessing the file system.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.fsx.*;
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
  public interface ActiveDirectoryConfigurationProperty {
    /**
     * The NetBIOS name of the Active Directory computer object that will be created for your SVM.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-storagevirtualmachine-activedirectoryconfiguration.html#cfn-fsx-storagevirtualmachine-activedirectoryconfiguration-netbiosname)
     */
    public fun netBiosName(): String? = unwrap(this).getNetBiosName()

    /**
     * The configuration that Amazon FSx uses to join the ONTAP storage virtual machine (SVM) to
     * your self-managed (including on-premises) Microsoft Active Directory directory.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-storagevirtualmachine-activedirectoryconfiguration.html#cfn-fsx-storagevirtualmachine-activedirectoryconfiguration-selfmanagedactivedirectoryconfiguration)
     */
    public fun selfManagedActiveDirectoryConfiguration(): Any? =
        unwrap(this).getSelfManagedActiveDirectoryConfiguration()

    /**
     * A builder for [ActiveDirectoryConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param netBiosName The NetBIOS name of the Active Directory computer object that will be
       * created for your SVM.
       */
      public fun netBiosName(netBiosName: String)

      /**
       * @param selfManagedActiveDirectoryConfiguration The configuration that Amazon FSx uses to
       * join the ONTAP storage virtual machine (SVM) to your self-managed (including on-premises)
       * Microsoft Active Directory directory.
       */
      public
          fun selfManagedActiveDirectoryConfiguration(selfManagedActiveDirectoryConfiguration: IResolvable)

      /**
       * @param selfManagedActiveDirectoryConfiguration The configuration that Amazon FSx uses to
       * join the ONTAP storage virtual machine (SVM) to your self-managed (including on-premises)
       * Microsoft Active Directory directory.
       */
      public
          fun selfManagedActiveDirectoryConfiguration(selfManagedActiveDirectoryConfiguration: SelfManagedActiveDirectoryConfigurationProperty)

      /**
       * @param selfManagedActiveDirectoryConfiguration The configuration that Amazon FSx uses to
       * join the ONTAP storage virtual machine (SVM) to your self-managed (including on-premises)
       * Microsoft Active Directory directory.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("53a4f8685f10a7d60d886f79d56103df35a2c2d5e8958ac5a7ffa5d607a746a1")
      public
          fun selfManagedActiveDirectoryConfiguration(selfManagedActiveDirectoryConfiguration: SelfManagedActiveDirectoryConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.fsx.CfnStorageVirtualMachine.ActiveDirectoryConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.fsx.CfnStorageVirtualMachine.ActiveDirectoryConfigurationProperty.builder()

      /**
       * @param netBiosName The NetBIOS name of the Active Directory computer object that will be
       * created for your SVM.
       */
      override fun netBiosName(netBiosName: String) {
        cdkBuilder.netBiosName(netBiosName)
      }

      /**
       * @param selfManagedActiveDirectoryConfiguration The configuration that Amazon FSx uses to
       * join the ONTAP storage virtual machine (SVM) to your self-managed (including on-premises)
       * Microsoft Active Directory directory.
       */
      override
          fun selfManagedActiveDirectoryConfiguration(selfManagedActiveDirectoryConfiguration: IResolvable) {
        cdkBuilder.selfManagedActiveDirectoryConfiguration(selfManagedActiveDirectoryConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param selfManagedActiveDirectoryConfiguration The configuration that Amazon FSx uses to
       * join the ONTAP storage virtual machine (SVM) to your self-managed (including on-premises)
       * Microsoft Active Directory directory.
       */
      override
          fun selfManagedActiveDirectoryConfiguration(selfManagedActiveDirectoryConfiguration: SelfManagedActiveDirectoryConfigurationProperty) {
        cdkBuilder.selfManagedActiveDirectoryConfiguration(selfManagedActiveDirectoryConfiguration.let(SelfManagedActiveDirectoryConfigurationProperty::unwrap))
      }

      /**
       * @param selfManagedActiveDirectoryConfiguration The configuration that Amazon FSx uses to
       * join the ONTAP storage virtual machine (SVM) to your self-managed (including on-premises)
       * Microsoft Active Directory directory.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("53a4f8685f10a7d60d886f79d56103df35a2c2d5e8958ac5a7ffa5d607a746a1")
      override
          fun selfManagedActiveDirectoryConfiguration(selfManagedActiveDirectoryConfiguration: SelfManagedActiveDirectoryConfigurationProperty.Builder.() -> Unit):
          Unit =
          selfManagedActiveDirectoryConfiguration(SelfManagedActiveDirectoryConfigurationProperty(selfManagedActiveDirectoryConfiguration))

      public fun build():
          software.amazon.awscdk.services.fsx.CfnStorageVirtualMachine.ActiveDirectoryConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.fsx.CfnStorageVirtualMachine.ActiveDirectoryConfigurationProperty,
    ) : CdkObject(cdkObject), ActiveDirectoryConfigurationProperty {
      /**
       * The NetBIOS name of the Active Directory computer object that will be created for your SVM.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-storagevirtualmachine-activedirectoryconfiguration.html#cfn-fsx-storagevirtualmachine-activedirectoryconfiguration-netbiosname)
       */
      override fun netBiosName(): String? = unwrap(this).getNetBiosName()

      /**
       * The configuration that Amazon FSx uses to join the ONTAP storage virtual machine (SVM) to
       * your self-managed (including on-premises) Microsoft Active Directory directory.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-storagevirtualmachine-activedirectoryconfiguration.html#cfn-fsx-storagevirtualmachine-activedirectoryconfiguration-selfmanagedactivedirectoryconfiguration)
       */
      override fun selfManagedActiveDirectoryConfiguration(): Any? =
          unwrap(this).getSelfManagedActiveDirectoryConfiguration()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ActiveDirectoryConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.fsx.CfnStorageVirtualMachine.ActiveDirectoryConfigurationProperty):
          ActiveDirectoryConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as
          ActiveDirectoryConfigurationProperty

      internal fun unwrap(wrapped: ActiveDirectoryConfigurationProperty):
          software.amazon.awscdk.services.fsx.CfnStorageVirtualMachine.ActiveDirectoryConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.fsx.CfnStorageVirtualMachine.ActiveDirectoryConfigurationProperty
    }
  }
}
