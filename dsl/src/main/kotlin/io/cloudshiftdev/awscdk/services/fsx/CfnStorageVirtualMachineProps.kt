package io.cloudshiftdev.awscdk.services.fsx

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnStorageVirtualMachineProps {
  /**
   * Describes the Microsoft Active Directory configuration to which the SVM is joined, if
   * applicable.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-storagevirtualmachine.html#cfn-fsx-storagevirtualmachine-activedirectoryconfiguration)
   */
  public fun activeDirectoryConfiguration(): Any? = unwrap(this).getActiveDirectoryConfiguration()

  /**
   * Specifies the FSx for ONTAP file system on which to create the SVM.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-storagevirtualmachine.html#cfn-fsx-storagevirtualmachine-filesystemid)
   */
  public fun fileSystemId(): String

  /**
   * The name of the SVM.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-storagevirtualmachine.html#cfn-fsx-storagevirtualmachine-name)
   */
  public fun name(): String

  /**
   * The security style of the root volume of the SVM. Specify one of the following values:.
   *
   * * `UNIX` if the file system is managed by a UNIX administrator, the majority of users are NFS
   * clients, and an application accessing the data uses a UNIX user as the service account.
   * * `NTFS` if the file system is managed by a Microsoft Windows administrator, the majority of
   * users are SMB clients, and an application accessing the data uses a Microsoft Windows user as the
   * service account.
   * * `MIXED` This is an advanced setting. For more information, see [Volume security
   * style](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/volume-security-style.html) in the Amazon
   * FSx for NetApp ONTAP User Guide.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-storagevirtualmachine.html#cfn-fsx-storagevirtualmachine-rootvolumesecuritystyle)
   */
  public fun rootVolumeSecurityStyle(): String? = unwrap(this).getRootVolumeSecurityStyle()

  /**
   * Specifies the password to use when logging on to the SVM using a secure shell (SSH) connection
   * to the SVM's management endpoint.
   *
   * Doing so enables you to manage the SVM using the NetApp ONTAP CLI or REST API. If you do not
   * specify a password, you can still use the file system's `fsxadmin` user to manage the SVM. For
   * more information, see [Managing SVMs using the NetApp ONTAP
   * CLI](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/managing-resources-ontap-apps.html#vsadmin-ontap-cli)
   * in the *FSx for ONTAP User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-storagevirtualmachine.html#cfn-fsx-storagevirtualmachine-svmadminpassword)
   */
  public fun svmAdminPassword(): String? = unwrap(this).getSvmAdminPassword()

  /**
   * A list of `Tag` values, with a maximum of 50 elements.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-storagevirtualmachine.html#cfn-fsx-storagevirtualmachine-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnStorageVirtualMachineProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param activeDirectoryConfiguration Describes the Microsoft Active Directory configuration to
     * which the SVM is joined, if applicable.
     */
    public fun activeDirectoryConfiguration(activeDirectoryConfiguration: IResolvable)

    /**
     * @param activeDirectoryConfiguration Describes the Microsoft Active Directory configuration to
     * which the SVM is joined, if applicable.
     */
    public
        fun activeDirectoryConfiguration(activeDirectoryConfiguration: CfnStorageVirtualMachine.ActiveDirectoryConfigurationProperty)

    /**
     * @param activeDirectoryConfiguration Describes the Microsoft Active Directory configuration to
     * which the SVM is joined, if applicable.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("82b1f737d3bf838fc7a2a37be078f5e0dab5975b2241323420db11f55c487621")
    public
        fun activeDirectoryConfiguration(activeDirectoryConfiguration: CfnStorageVirtualMachine.ActiveDirectoryConfigurationProperty.Builder.() -> Unit)

    /**
     * @param fileSystemId Specifies the FSx for ONTAP file system on which to create the SVM. 
     */
    public fun fileSystemId(fileSystemId: String)

    /**
     * @param name The name of the SVM. 
     */
    public fun name(name: String)

    /**
     * @param rootVolumeSecurityStyle The security style of the root volume of the SVM. Specify one
     * of the following values:.
     * * `UNIX` if the file system is managed by a UNIX administrator, the majority of users are NFS
     * clients, and an application accessing the data uses a UNIX user as the service account.
     * * `NTFS` if the file system is managed by a Microsoft Windows administrator, the majority of
     * users are SMB clients, and an application accessing the data uses a Microsoft Windows user as
     * the service account.
     * * `MIXED` This is an advanced setting. For more information, see [Volume security
     * style](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/volume-security-style.html) in the
     * Amazon FSx for NetApp ONTAP User Guide.
     */
    public fun rootVolumeSecurityStyle(rootVolumeSecurityStyle: String)

    /**
     * @param svmAdminPassword Specifies the password to use when logging on to the SVM using a
     * secure shell (SSH) connection to the SVM's management endpoint.
     * Doing so enables you to manage the SVM using the NetApp ONTAP CLI or REST API. If you do not
     * specify a password, you can still use the file system's `fsxadmin` user to manage the SVM. For
     * more information, see [Managing SVMs using the NetApp ONTAP
     * CLI](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/managing-resources-ontap-apps.html#vsadmin-ontap-cli)
     * in the *FSx for ONTAP User Guide* .
     */
    public fun svmAdminPassword(svmAdminPassword: String)

    /**
     * @param tags A list of `Tag` values, with a maximum of 50 elements.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags A list of `Tag` values, with a maximum of 50 elements.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.fsx.CfnStorageVirtualMachineProps.Builder =
        software.amazon.awscdk.services.fsx.CfnStorageVirtualMachineProps.builder()

    /**
     * @param activeDirectoryConfiguration Describes the Microsoft Active Directory configuration to
     * which the SVM is joined, if applicable.
     */
    override fun activeDirectoryConfiguration(activeDirectoryConfiguration: IResolvable) {
      cdkBuilder.activeDirectoryConfiguration(activeDirectoryConfiguration.let(IResolvable::unwrap))
    }

    /**
     * @param activeDirectoryConfiguration Describes the Microsoft Active Directory configuration to
     * which the SVM is joined, if applicable.
     */
    override
        fun activeDirectoryConfiguration(activeDirectoryConfiguration: CfnStorageVirtualMachine.ActiveDirectoryConfigurationProperty) {
      cdkBuilder.activeDirectoryConfiguration(activeDirectoryConfiguration.let(CfnStorageVirtualMachine.ActiveDirectoryConfigurationProperty::unwrap))
    }

    /**
     * @param activeDirectoryConfiguration Describes the Microsoft Active Directory configuration to
     * which the SVM is joined, if applicable.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("82b1f737d3bf838fc7a2a37be078f5e0dab5975b2241323420db11f55c487621")
    override
        fun activeDirectoryConfiguration(activeDirectoryConfiguration: CfnStorageVirtualMachine.ActiveDirectoryConfigurationProperty.Builder.() -> Unit):
        Unit =
        activeDirectoryConfiguration(CfnStorageVirtualMachine.ActiveDirectoryConfigurationProperty(activeDirectoryConfiguration))

    /**
     * @param fileSystemId Specifies the FSx for ONTAP file system on which to create the SVM. 
     */
    override fun fileSystemId(fileSystemId: String) {
      cdkBuilder.fileSystemId(fileSystemId)
    }

    /**
     * @param name The name of the SVM. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param rootVolumeSecurityStyle The security style of the root volume of the SVM. Specify one
     * of the following values:.
     * * `UNIX` if the file system is managed by a UNIX administrator, the majority of users are NFS
     * clients, and an application accessing the data uses a UNIX user as the service account.
     * * `NTFS` if the file system is managed by a Microsoft Windows administrator, the majority of
     * users are SMB clients, and an application accessing the data uses a Microsoft Windows user as
     * the service account.
     * * `MIXED` This is an advanced setting. For more information, see [Volume security
     * style](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/volume-security-style.html) in the
     * Amazon FSx for NetApp ONTAP User Guide.
     */
    override fun rootVolumeSecurityStyle(rootVolumeSecurityStyle: String) {
      cdkBuilder.rootVolumeSecurityStyle(rootVolumeSecurityStyle)
    }

    /**
     * @param svmAdminPassword Specifies the password to use when logging on to the SVM using a
     * secure shell (SSH) connection to the SVM's management endpoint.
     * Doing so enables you to manage the SVM using the NetApp ONTAP CLI or REST API. If you do not
     * specify a password, you can still use the file system's `fsxadmin` user to manage the SVM. For
     * more information, see [Managing SVMs using the NetApp ONTAP
     * CLI](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/managing-resources-ontap-apps.html#vsadmin-ontap-cli)
     * in the *FSx for ONTAP User Guide* .
     */
    override fun svmAdminPassword(svmAdminPassword: String) {
      cdkBuilder.svmAdminPassword(svmAdminPassword)
    }

    /**
     * @param tags A list of `Tag` values, with a maximum of 50 elements.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags A list of `Tag` values, with a maximum of 50 elements.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.fsx.CfnStorageVirtualMachineProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.fsx.CfnStorageVirtualMachineProps,
  ) : CdkObject(cdkObject), CfnStorageVirtualMachineProps {
    /**
     * Describes the Microsoft Active Directory configuration to which the SVM is joined, if
     * applicable.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-storagevirtualmachine.html#cfn-fsx-storagevirtualmachine-activedirectoryconfiguration)
     */
    override fun activeDirectoryConfiguration(): Any? =
        unwrap(this).getActiveDirectoryConfiguration()

    /**
     * Specifies the FSx for ONTAP file system on which to create the SVM.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-storagevirtualmachine.html#cfn-fsx-storagevirtualmachine-filesystemid)
     */
    override fun fileSystemId(): String = unwrap(this).getFileSystemId()

    /**
     * The name of the SVM.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-storagevirtualmachine.html#cfn-fsx-storagevirtualmachine-name)
     */
    override fun name(): String = unwrap(this).getName()

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
     */
    override fun rootVolumeSecurityStyle(): String? = unwrap(this).getRootVolumeSecurityStyle()

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
     */
    override fun svmAdminPassword(): String? = unwrap(this).getSvmAdminPassword()

    /**
     * A list of `Tag` values, with a maximum of 50 elements.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-storagevirtualmachine.html#cfn-fsx-storagevirtualmachine-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnStorageVirtualMachineProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.fsx.CfnStorageVirtualMachineProps):
        CfnStorageVirtualMachineProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnStorageVirtualMachineProps):
        software.amazon.awscdk.services.fsx.CfnStorageVirtualMachineProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.fsx.CfnStorageVirtualMachineProps
  }
}
