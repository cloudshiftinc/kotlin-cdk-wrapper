@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.datasync

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::DataSync::LocationFSxONTAP` resource creates an endpoint for an Amazon FSx for NetApp
 * ONTAP file system.
 *
 * AWS DataSync can access this endpoint as a source or destination location.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.datasync.*;
 * CfnLocationFSxONTAP cfnLocationFSxONTAP = CfnLocationFSxONTAP.Builder.create(this,
 * "MyCfnLocationFSxONTAP")
 * .securityGroupArns(List.of("securityGroupArns"))
 * .storageVirtualMachineArn("storageVirtualMachineArn")
 * // the properties below are optional
 * .protocol(ProtocolProperty.builder()
 * .nfs(NFSProperty.builder()
 * .mountOptions(NfsMountOptionsProperty.builder()
 * .version("version")
 * .build())
 * .build())
 * .smb(SMBProperty.builder()
 * .mountOptions(SmbMountOptionsProperty.builder()
 * .version("version")
 * .build())
 * .password("password")
 * .user("user")
 * // the properties below are optional
 * .domain("domain")
 * .build())
 * .build())
 * .subdirectory("subdirectory")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxontap.html)
 */
public open class CfnLocationFSxONTAP internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.datasync.CfnLocationFSxONTAP,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The ARN of the FSx for ONTAP file system in the specified location.
   */
  public open fun attrFsxFilesystemArn(): String = unwrap(this).getAttrFsxFilesystemArn()

  /**
   * The ARN of the specified location.
   */
  public open fun attrLocationArn(): String = unwrap(this).getAttrLocationArn()

  /**
   * The URI of the specified location.
   */
  public open fun attrLocationUri(): String = unwrap(this).getAttrLocationUri()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * Specifies the data transfer protocol that DataSync uses to access your Amazon FSx file system.
   */
  public open fun protocol(): Any? = unwrap(this).getProtocol()

  /**
   * Specifies the data transfer protocol that DataSync uses to access your Amazon FSx file system.
   */
  public open fun protocol(`value`: IResolvable) {
    unwrap(this).setProtocol(`value`.let(IResolvable::unwrap))
  }

  /**
   * Specifies the data transfer protocol that DataSync uses to access your Amazon FSx file system.
   */
  public open fun protocol(`value`: ProtocolProperty) {
    unwrap(this).setProtocol(`value`.let(ProtocolProperty::unwrap))
  }

  /**
   * Specifies the data transfer protocol that DataSync uses to access your Amazon FSx file system.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f260a9de86d50f11be0ae0e4df7bc4c33bf62217c0efe05c324ad5b69932f747")
  public open fun protocol(`value`: ProtocolProperty.Builder.() -> Unit): Unit =
      protocol(ProtocolProperty(`value`))

  /**
   * Specifies the Amazon Resource Names (ARNs) of the security groups that DataSync can use to
   * access your FSx for ONTAP file system.
   */
  public open fun securityGroupArns(): List<String> = unwrap(this).getSecurityGroupArns()

  /**
   * Specifies the Amazon Resource Names (ARNs) of the security groups that DataSync can use to
   * access your FSx for ONTAP file system.
   */
  public open fun securityGroupArns(`value`: List<String>) {
    unwrap(this).setSecurityGroupArns(`value`)
  }

  /**
   * Specifies the Amazon Resource Names (ARNs) of the security groups that DataSync can use to
   * access your FSx for ONTAP file system.
   */
  public open fun securityGroupArns(vararg `value`: String): Unit =
      securityGroupArns(`value`.toList())

  /**
   * Specifies the ARN of the storage virtual machine (SVM) in your file system where you want to
   * copy data to or from.
   */
  public open fun storageVirtualMachineArn(): String = unwrap(this).getStorageVirtualMachineArn()

  /**
   * Specifies the ARN of the storage virtual machine (SVM) in your file system where you want to
   * copy data to or from.
   */
  public open fun storageVirtualMachineArn(`value`: String) {
    unwrap(this).setStorageVirtualMachineArn(`value`)
  }

  /**
   * Specifies a path to the file share in the SVM where you'll copy your data.
   */
  public open fun subdirectory(): String? = unwrap(this).getSubdirectory()

  /**
   * Specifies a path to the file share in the SVM where you'll copy your data.
   */
  public open fun subdirectory(`value`: String) {
    unwrap(this).setSubdirectory(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * Specifies labels that help you categorize, filter, and search for your AWS resources.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * Specifies labels that help you categorize, filter, and search for your AWS resources.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * Specifies labels that help you categorize, filter, and search for your AWS resources.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.datasync.CfnLocationFSxONTAP].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Specifies the data transfer protocol that DataSync uses to access your Amazon FSx file
     * system.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxontap.html#cfn-datasync-locationfsxontap-protocol)
     * @param protocol Specifies the data transfer protocol that DataSync uses to access your Amazon
     * FSx file system. 
     */
    public fun protocol(protocol: IResolvable)

    /**
     * Specifies the data transfer protocol that DataSync uses to access your Amazon FSx file
     * system.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxontap.html#cfn-datasync-locationfsxontap-protocol)
     * @param protocol Specifies the data transfer protocol that DataSync uses to access your Amazon
     * FSx file system. 
     */
    public fun protocol(protocol: ProtocolProperty)

    /**
     * Specifies the data transfer protocol that DataSync uses to access your Amazon FSx file
     * system.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxontap.html#cfn-datasync-locationfsxontap-protocol)
     * @param protocol Specifies the data transfer protocol that DataSync uses to access your Amazon
     * FSx file system. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7641b926322602b576aaffe49c086d0d25de6353417991882e2bb2c85ffb8dbd")
    public fun protocol(protocol: ProtocolProperty.Builder.() -> Unit)

    /**
     * Specifies the Amazon Resource Names (ARNs) of the security groups that DataSync can use to
     * access your FSx for ONTAP file system.
     *
     * You must configure the security groups to allow outbound traffic on the following ports
     * (depending on the protocol that you're using):
     *
     * * *Network File System (NFS)* : TCP ports 111, 635, and 2049
     * * *Server Message Block (SMB)* : TCP port 445
     *
     * Your file system's security groups must also allow inbound traffic on the same port.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxontap.html#cfn-datasync-locationfsxontap-securitygrouparns)
     * @param securityGroupArns Specifies the Amazon Resource Names (ARNs) of the security groups
     * that DataSync can use to access your FSx for ONTAP file system. 
     */
    public fun securityGroupArns(securityGroupArns: List<String>)

    /**
     * Specifies the Amazon Resource Names (ARNs) of the security groups that DataSync can use to
     * access your FSx for ONTAP file system.
     *
     * You must configure the security groups to allow outbound traffic on the following ports
     * (depending on the protocol that you're using):
     *
     * * *Network File System (NFS)* : TCP ports 111, 635, and 2049
     * * *Server Message Block (SMB)* : TCP port 445
     *
     * Your file system's security groups must also allow inbound traffic on the same port.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxontap.html#cfn-datasync-locationfsxontap-securitygrouparns)
     * @param securityGroupArns Specifies the Amazon Resource Names (ARNs) of the security groups
     * that DataSync can use to access your FSx for ONTAP file system. 
     */
    public fun securityGroupArns(vararg securityGroupArns: String)

    /**
     * Specifies the ARN of the storage virtual machine (SVM) in your file system where you want to
     * copy data to or from.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxontap.html#cfn-datasync-locationfsxontap-storagevirtualmachinearn)
     * @param storageVirtualMachineArn Specifies the ARN of the storage virtual machine (SVM) in
     * your file system where you want to copy data to or from. 
     */
    public fun storageVirtualMachineArn(storageVirtualMachineArn: String)

    /**
     * Specifies a path to the file share in the SVM where you'll copy your data.
     *
     * You can specify a junction path (also known as a mount point), qtree path (for NFS file
     * shares), or share name (for SMB file shares). For example, your mount path might be `/vol1` ,
     * `/vol1/tree1` , or `/share1` .
     *
     *
     * Don't specify a junction path in the SVM's root volume. For more information, see [Managing
     * FSx for ONTAP storage virtual
     * machines](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/managing-svms.html) in the *Amazon
     * FSx for NetApp ONTAP User Guide* .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxontap.html#cfn-datasync-locationfsxontap-subdirectory)
     * @param subdirectory Specifies a path to the file share in the SVM where you'll copy your
     * data. 
     */
    public fun subdirectory(subdirectory: String)

    /**
     * Specifies labels that help you categorize, filter, and search for your AWS resources.
     *
     * We recommend creating at least a name tag for your location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxontap.html#cfn-datasync-locationfsxontap-tags)
     * @param tags Specifies labels that help you categorize, filter, and search for your AWS
     * resources. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Specifies labels that help you categorize, filter, and search for your AWS resources.
     *
     * We recommend creating at least a name tag for your location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxontap.html#cfn-datasync-locationfsxontap-tags)
     * @param tags Specifies labels that help you categorize, filter, and search for your AWS
     * resources. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.datasync.CfnLocationFSxONTAP.Builder =
        software.amazon.awscdk.services.datasync.CfnLocationFSxONTAP.Builder.create(scope, id)

    /**
     * Specifies the data transfer protocol that DataSync uses to access your Amazon FSx file
     * system.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxontap.html#cfn-datasync-locationfsxontap-protocol)
     * @param protocol Specifies the data transfer protocol that DataSync uses to access your Amazon
     * FSx file system. 
     */
    override fun protocol(protocol: IResolvable) {
      cdkBuilder.protocol(protocol.let(IResolvable::unwrap))
    }

    /**
     * Specifies the data transfer protocol that DataSync uses to access your Amazon FSx file
     * system.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxontap.html#cfn-datasync-locationfsxontap-protocol)
     * @param protocol Specifies the data transfer protocol that DataSync uses to access your Amazon
     * FSx file system. 
     */
    override fun protocol(protocol: ProtocolProperty) {
      cdkBuilder.protocol(protocol.let(ProtocolProperty::unwrap))
    }

    /**
     * Specifies the data transfer protocol that DataSync uses to access your Amazon FSx file
     * system.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxontap.html#cfn-datasync-locationfsxontap-protocol)
     * @param protocol Specifies the data transfer protocol that DataSync uses to access your Amazon
     * FSx file system. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7641b926322602b576aaffe49c086d0d25de6353417991882e2bb2c85ffb8dbd")
    override fun protocol(protocol: ProtocolProperty.Builder.() -> Unit): Unit =
        protocol(ProtocolProperty(protocol))

    /**
     * Specifies the Amazon Resource Names (ARNs) of the security groups that DataSync can use to
     * access your FSx for ONTAP file system.
     *
     * You must configure the security groups to allow outbound traffic on the following ports
     * (depending on the protocol that you're using):
     *
     * * *Network File System (NFS)* : TCP ports 111, 635, and 2049
     * * *Server Message Block (SMB)* : TCP port 445
     *
     * Your file system's security groups must also allow inbound traffic on the same port.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxontap.html#cfn-datasync-locationfsxontap-securitygrouparns)
     * @param securityGroupArns Specifies the Amazon Resource Names (ARNs) of the security groups
     * that DataSync can use to access your FSx for ONTAP file system. 
     */
    override fun securityGroupArns(securityGroupArns: List<String>) {
      cdkBuilder.securityGroupArns(securityGroupArns)
    }

    /**
     * Specifies the Amazon Resource Names (ARNs) of the security groups that DataSync can use to
     * access your FSx for ONTAP file system.
     *
     * You must configure the security groups to allow outbound traffic on the following ports
     * (depending on the protocol that you're using):
     *
     * * *Network File System (NFS)* : TCP ports 111, 635, and 2049
     * * *Server Message Block (SMB)* : TCP port 445
     *
     * Your file system's security groups must also allow inbound traffic on the same port.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxontap.html#cfn-datasync-locationfsxontap-securitygrouparns)
     * @param securityGroupArns Specifies the Amazon Resource Names (ARNs) of the security groups
     * that DataSync can use to access your FSx for ONTAP file system. 
     */
    override fun securityGroupArns(vararg securityGroupArns: String): Unit =
        securityGroupArns(securityGroupArns.toList())

    /**
     * Specifies the ARN of the storage virtual machine (SVM) in your file system where you want to
     * copy data to or from.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxontap.html#cfn-datasync-locationfsxontap-storagevirtualmachinearn)
     * @param storageVirtualMachineArn Specifies the ARN of the storage virtual machine (SVM) in
     * your file system where you want to copy data to or from. 
     */
    override fun storageVirtualMachineArn(storageVirtualMachineArn: String) {
      cdkBuilder.storageVirtualMachineArn(storageVirtualMachineArn)
    }

    /**
     * Specifies a path to the file share in the SVM where you'll copy your data.
     *
     * You can specify a junction path (also known as a mount point), qtree path (for NFS file
     * shares), or share name (for SMB file shares). For example, your mount path might be `/vol1` ,
     * `/vol1/tree1` , or `/share1` .
     *
     *
     * Don't specify a junction path in the SVM's root volume. For more information, see [Managing
     * FSx for ONTAP storage virtual
     * machines](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/managing-svms.html) in the *Amazon
     * FSx for NetApp ONTAP User Guide* .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxontap.html#cfn-datasync-locationfsxontap-subdirectory)
     * @param subdirectory Specifies a path to the file share in the SVM where you'll copy your
     * data. 
     */
    override fun subdirectory(subdirectory: String) {
      cdkBuilder.subdirectory(subdirectory)
    }

    /**
     * Specifies labels that help you categorize, filter, and search for your AWS resources.
     *
     * We recommend creating at least a name tag for your location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxontap.html#cfn-datasync-locationfsxontap-tags)
     * @param tags Specifies labels that help you categorize, filter, and search for your AWS
     * resources. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * Specifies labels that help you categorize, filter, and search for your AWS resources.
     *
     * We recommend creating at least a name tag for your location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxontap.html#cfn-datasync-locationfsxontap-tags)
     * @param tags Specifies labels that help you categorize, filter, and search for your AWS
     * resources. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.datasync.CfnLocationFSxONTAP =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.datasync.CfnLocationFSxONTAP.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnLocationFSxONTAP {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnLocationFSxONTAP(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.datasync.CfnLocationFSxONTAP):
        CfnLocationFSxONTAP = CfnLocationFSxONTAP(cdkObject)

    internal fun unwrap(wrapped: CfnLocationFSxONTAP):
        software.amazon.awscdk.services.datasync.CfnLocationFSxONTAP = wrapped.cdkObject
  }

  /**
   * Specifies the version of the Server Message Block (SMB) protocol that AWS DataSync uses to
   * access an SMB file server.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.datasync.*;
   * SmbMountOptionsProperty smbMountOptionsProperty = SmbMountOptionsProperty.builder()
   * .version("version")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-locationfsxontap-smbmountoptions.html)
   */
  public interface SmbMountOptionsProperty {
    /**
     * By default, DataSync automatically chooses an SMB protocol version based on negotiation with
     * your SMB file server.
     *
     * You also can configure DataSync to use a specific SMB version, but we recommend doing this
     * only if DataSync has trouble negotiating with the SMB file server automatically.
     *
     * These are the following options for configuring the SMB version:
     *
     * * `AUTOMATIC` (default): DataSync and the SMB file server negotiate the highest version of
     * SMB that they mutually support between 2.1 and 3.1.1.
     *
     * This is the recommended option. If you instead choose a specific version that your file
     * server doesn't support, you may get an `Operation Not Supported` error.
     *
     * * `SMB3` : Restricts the protocol negotiation to only SMB version 3.0.2.
     * * `SMB2` : Restricts the protocol negotiation to only SMB version 2.1.
     * * `SMB2_0` : Restricts the protocol negotiation to only SMB version 2.0.
     * * `SMB1` : Restricts the protocol negotiation to only SMB version 1.0.
     *
     *
     * The `SMB1` option isn't available when [creating an Amazon FSx for NetApp ONTAP
     * location](https://docs.aws.amazon.com/datasync/latest/userguide/API_CreateLocationFsxOntap.html)
     * .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-locationfsxontap-smbmountoptions.html#cfn-datasync-locationfsxontap-smbmountoptions-version)
     */
    public fun version(): String? = unwrap(this).getVersion()

    /**
     * A builder for [SmbMountOptionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param version By default, DataSync automatically chooses an SMB protocol version based on
       * negotiation with your SMB file server.
       * You also can configure DataSync to use a specific SMB version, but we recommend doing this
       * only if DataSync has trouble negotiating with the SMB file server automatically.
       *
       * These are the following options for configuring the SMB version:
       *
       * * `AUTOMATIC` (default): DataSync and the SMB file server negotiate the highest version of
       * SMB that they mutually support between 2.1 and 3.1.1.
       *
       * This is the recommended option. If you instead choose a specific version that your file
       * server doesn't support, you may get an `Operation Not Supported` error.
       *
       * * `SMB3` : Restricts the protocol negotiation to only SMB version 3.0.2.
       * * `SMB2` : Restricts the protocol negotiation to only SMB version 2.1.
       * * `SMB2_0` : Restricts the protocol negotiation to only SMB version 2.0.
       * * `SMB1` : Restricts the protocol negotiation to only SMB version 1.0.
       *
       *
       * The `SMB1` option isn't available when [creating an Amazon FSx for NetApp ONTAP
       * location](https://docs.aws.amazon.com/datasync/latest/userguide/API_CreateLocationFsxOntap.html)
       * .
       */
      public fun version(version: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datasync.CfnLocationFSxONTAP.SmbMountOptionsProperty.Builder
          =
          software.amazon.awscdk.services.datasync.CfnLocationFSxONTAP.SmbMountOptionsProperty.builder()

      /**
       * @param version By default, DataSync automatically chooses an SMB protocol version based on
       * negotiation with your SMB file server.
       * You also can configure DataSync to use a specific SMB version, but we recommend doing this
       * only if DataSync has trouble negotiating with the SMB file server automatically.
       *
       * These are the following options for configuring the SMB version:
       *
       * * `AUTOMATIC` (default): DataSync and the SMB file server negotiate the highest version of
       * SMB that they mutually support between 2.1 and 3.1.1.
       *
       * This is the recommended option. If you instead choose a specific version that your file
       * server doesn't support, you may get an `Operation Not Supported` error.
       *
       * * `SMB3` : Restricts the protocol negotiation to only SMB version 3.0.2.
       * * `SMB2` : Restricts the protocol negotiation to only SMB version 2.1.
       * * `SMB2_0` : Restricts the protocol negotiation to only SMB version 2.0.
       * * `SMB1` : Restricts the protocol negotiation to only SMB version 1.0.
       *
       *
       * The `SMB1` option isn't available when [creating an Amazon FSx for NetApp ONTAP
       * location](https://docs.aws.amazon.com/datasync/latest/userguide/API_CreateLocationFsxOntap.html)
       * .
       */
      override fun version(version: String) {
        cdkBuilder.version(version)
      }

      public fun build():
          software.amazon.awscdk.services.datasync.CfnLocationFSxONTAP.SmbMountOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.datasync.CfnLocationFSxONTAP.SmbMountOptionsProperty,
    ) : CdkObject(cdkObject), SmbMountOptionsProperty {
      /**
       * By default, DataSync automatically chooses an SMB protocol version based on negotiation
       * with your SMB file server.
       *
       * You also can configure DataSync to use a specific SMB version, but we recommend doing this
       * only if DataSync has trouble negotiating with the SMB file server automatically.
       *
       * These are the following options for configuring the SMB version:
       *
       * * `AUTOMATIC` (default): DataSync and the SMB file server negotiate the highest version of
       * SMB that they mutually support between 2.1 and 3.1.1.
       *
       * This is the recommended option. If you instead choose a specific version that your file
       * server doesn't support, you may get an `Operation Not Supported` error.
       *
       * * `SMB3` : Restricts the protocol negotiation to only SMB version 3.0.2.
       * * `SMB2` : Restricts the protocol negotiation to only SMB version 2.1.
       * * `SMB2_0` : Restricts the protocol negotiation to only SMB version 2.0.
       * * `SMB1` : Restricts the protocol negotiation to only SMB version 1.0.
       *
       *
       * The `SMB1` option isn't available when [creating an Amazon FSx for NetApp ONTAP
       * location](https://docs.aws.amazon.com/datasync/latest/userguide/API_CreateLocationFsxOntap.html)
       * .
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-locationfsxontap-smbmountoptions.html#cfn-datasync-locationfsxontap-smbmountoptions-version)
       */
      override fun version(): String? = unwrap(this).getVersion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SmbMountOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.datasync.CfnLocationFSxONTAP.SmbMountOptionsProperty):
          SmbMountOptionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SmbMountOptionsProperty):
          software.amazon.awscdk.services.datasync.CfnLocationFSxONTAP.SmbMountOptionsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.datasync.CfnLocationFSxONTAP.SmbMountOptionsProperty
    }
  }

  /**
   * Specifies the Network File System (NFS) protocol configuration that AWS DataSync uses to access
   * a storage virtual machine (SVM) on your Amazon FSx for NetApp ONTAP file system.
   *
   * For more information, see [Accessing FSx for ONTAP file
   * systems](https://docs.aws.amazon.com/datasync/latest/userguide/create-ontap-location.html#create-ontap-location-access)
   * .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.datasync.*;
   * NFSProperty nFSProperty = NFSProperty.builder()
   * .mountOptions(NfsMountOptionsProperty.builder()
   * .version("version")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-locationfsxontap-nfs.html)
   */
  public interface NFSProperty {
    /**
     * Specifies how DataSync can access a location using the NFS protocol.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-locationfsxontap-nfs.html#cfn-datasync-locationfsxontap-nfs-mountoptions)
     */
    public fun mountOptions(): Any

    /**
     * A builder for [NFSProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param mountOptions Specifies how DataSync can access a location using the NFS protocol. 
       */
      public fun mountOptions(mountOptions: IResolvable)

      /**
       * @param mountOptions Specifies how DataSync can access a location using the NFS protocol. 
       */
      public fun mountOptions(mountOptions: NfsMountOptionsProperty)

      /**
       * @param mountOptions Specifies how DataSync can access a location using the NFS protocol. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("033f4be26885125e4eadaf1dd772bb9201c4c29cbcf806a8b9cc513bbf365fa7")
      public fun mountOptions(mountOptions: NfsMountOptionsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datasync.CfnLocationFSxONTAP.NFSProperty.Builder =
          software.amazon.awscdk.services.datasync.CfnLocationFSxONTAP.NFSProperty.builder()

      /**
       * @param mountOptions Specifies how DataSync can access a location using the NFS protocol. 
       */
      override fun mountOptions(mountOptions: IResolvable) {
        cdkBuilder.mountOptions(mountOptions.let(IResolvable::unwrap))
      }

      /**
       * @param mountOptions Specifies how DataSync can access a location using the NFS protocol. 
       */
      override fun mountOptions(mountOptions: NfsMountOptionsProperty) {
        cdkBuilder.mountOptions(mountOptions.let(NfsMountOptionsProperty::unwrap))
      }

      /**
       * @param mountOptions Specifies how DataSync can access a location using the NFS protocol. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("033f4be26885125e4eadaf1dd772bb9201c4c29cbcf806a8b9cc513bbf365fa7")
      override fun mountOptions(mountOptions: NfsMountOptionsProperty.Builder.() -> Unit): Unit =
          mountOptions(NfsMountOptionsProperty(mountOptions))

      public fun build(): software.amazon.awscdk.services.datasync.CfnLocationFSxONTAP.NFSProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.datasync.CfnLocationFSxONTAP.NFSProperty,
    ) : CdkObject(cdkObject), NFSProperty {
      /**
       * Specifies how DataSync can access a location using the NFS protocol.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-locationfsxontap-nfs.html#cfn-datasync-locationfsxontap-nfs-mountoptions)
       */
      override fun mountOptions(): Any = unwrap(this).getMountOptions()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): NFSProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.datasync.CfnLocationFSxONTAP.NFSProperty):
          NFSProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: NFSProperty):
          software.amazon.awscdk.services.datasync.CfnLocationFSxONTAP.NFSProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.datasync.CfnLocationFSxONTAP.NFSProperty
    }
  }

  /**
   * Specifies how DataSync can access a location using the NFS protocol.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.datasync.*;
   * NfsMountOptionsProperty nfsMountOptionsProperty = NfsMountOptionsProperty.builder()
   * .version("version")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-locationfsxontap-nfsmountoptions.html)
   */
  public interface NfsMountOptionsProperty {
    /**
     * Specifies the NFS version that you want DataSync to use when mounting your NFS share.
     *
     * If the server refuses to use the version specified, the task fails.
     *
     * You can specify the following options:
     *
     * * `AUTOMATIC` (default): DataSync chooses NFS version 4.1.
     * * `NFS3` : Stateless protocol version that allows for asynchronous writes on the server.
     * * `NFSv4_0` : Stateful, firewall-friendly protocol version that supports delegations and
     * pseudo file systems.
     * * `NFSv4_1` : Stateful protocol version that supports sessions, directory delegations, and
     * parallel data processing. NFS version 4.1 also includes all features available in version 4.0.
     *
     *
     * DataSync currently only supports NFS version 3 with Amazon FSx for NetApp ONTAP locations.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-locationfsxontap-nfsmountoptions.html#cfn-datasync-locationfsxontap-nfsmountoptions-version)
     */
    public fun version(): String? = unwrap(this).getVersion()

    /**
     * A builder for [NfsMountOptionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param version Specifies the NFS version that you want DataSync to use when mounting your
       * NFS share.
       * If the server refuses to use the version specified, the task fails.
       *
       * You can specify the following options:
       *
       * * `AUTOMATIC` (default): DataSync chooses NFS version 4.1.
       * * `NFS3` : Stateless protocol version that allows for asynchronous writes on the server.
       * * `NFSv4_0` : Stateful, firewall-friendly protocol version that supports delegations and
       * pseudo file systems.
       * * `NFSv4_1` : Stateful protocol version that supports sessions, directory delegations, and
       * parallel data processing. NFS version 4.1 also includes all features available in version 4.0.
       *
       *
       * DataSync currently only supports NFS version 3 with Amazon FSx for NetApp ONTAP locations.
       */
      public fun version(version: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datasync.CfnLocationFSxONTAP.NfsMountOptionsProperty.Builder
          =
          software.amazon.awscdk.services.datasync.CfnLocationFSxONTAP.NfsMountOptionsProperty.builder()

      /**
       * @param version Specifies the NFS version that you want DataSync to use when mounting your
       * NFS share.
       * If the server refuses to use the version specified, the task fails.
       *
       * You can specify the following options:
       *
       * * `AUTOMATIC` (default): DataSync chooses NFS version 4.1.
       * * `NFS3` : Stateless protocol version that allows for asynchronous writes on the server.
       * * `NFSv4_0` : Stateful, firewall-friendly protocol version that supports delegations and
       * pseudo file systems.
       * * `NFSv4_1` : Stateful protocol version that supports sessions, directory delegations, and
       * parallel data processing. NFS version 4.1 also includes all features available in version 4.0.
       *
       *
       * DataSync currently only supports NFS version 3 with Amazon FSx for NetApp ONTAP locations.
       */
      override fun version(version: String) {
        cdkBuilder.version(version)
      }

      public fun build():
          software.amazon.awscdk.services.datasync.CfnLocationFSxONTAP.NfsMountOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.datasync.CfnLocationFSxONTAP.NfsMountOptionsProperty,
    ) : CdkObject(cdkObject), NfsMountOptionsProperty {
      /**
       * Specifies the NFS version that you want DataSync to use when mounting your NFS share.
       *
       * If the server refuses to use the version specified, the task fails.
       *
       * You can specify the following options:
       *
       * * `AUTOMATIC` (default): DataSync chooses NFS version 4.1.
       * * `NFS3` : Stateless protocol version that allows for asynchronous writes on the server.
       * * `NFSv4_0` : Stateful, firewall-friendly protocol version that supports delegations and
       * pseudo file systems.
       * * `NFSv4_1` : Stateful protocol version that supports sessions, directory delegations, and
       * parallel data processing. NFS version 4.1 also includes all features available in version 4.0.
       *
       *
       * DataSync currently only supports NFS version 3 with Amazon FSx for NetApp ONTAP locations.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-locationfsxontap-nfsmountoptions.html#cfn-datasync-locationfsxontap-nfsmountoptions-version)
       */
      override fun version(): String? = unwrap(this).getVersion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): NfsMountOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.datasync.CfnLocationFSxONTAP.NfsMountOptionsProperty):
          NfsMountOptionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: NfsMountOptionsProperty):
          software.amazon.awscdk.services.datasync.CfnLocationFSxONTAP.NfsMountOptionsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.datasync.CfnLocationFSxONTAP.NfsMountOptionsProperty
    }
  }

  /**
   * Specifies the data transfer protocol that AWS DataSync uses to access your Amazon FSx file
   * system.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.datasync.*;
   * ProtocolProperty protocolProperty = ProtocolProperty.builder()
   * .nfs(NFSProperty.builder()
   * .mountOptions(NfsMountOptionsProperty.builder()
   * .version("version")
   * .build())
   * .build())
   * .smb(SMBProperty.builder()
   * .mountOptions(SmbMountOptionsProperty.builder()
   * .version("version")
   * .build())
   * .password("password")
   * .user("user")
   * // the properties below are optional
   * .domain("domain")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-locationfsxontap-protocol.html)
   */
  public interface ProtocolProperty {
    /**
     * Specifies the Network File System (NFS) protocol configuration that DataSync uses to access
     * your FSx for ONTAP file system's storage virtual machine (SVM).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-locationfsxontap-protocol.html#cfn-datasync-locationfsxontap-protocol-nfs)
     */
    public fun nfs(): Any? = unwrap(this).getNfs()

    /**
     * Specifies the Server Message Block (SMB) protocol configuration that DataSync uses to access
     * your FSx for ONTAP file system's SVM.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-locationfsxontap-protocol.html#cfn-datasync-locationfsxontap-protocol-smb)
     */
    public fun smb(): Any? = unwrap(this).getSmb()

    /**
     * A builder for [ProtocolProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param nfs Specifies the Network File System (NFS) protocol configuration that DataSync
       * uses to access your FSx for ONTAP file system's storage virtual machine (SVM).
       */
      public fun nfs(nfs: IResolvable)

      /**
       * @param nfs Specifies the Network File System (NFS) protocol configuration that DataSync
       * uses to access your FSx for ONTAP file system's storage virtual machine (SVM).
       */
      public fun nfs(nfs: NFSProperty)

      /**
       * @param nfs Specifies the Network File System (NFS) protocol configuration that DataSync
       * uses to access your FSx for ONTAP file system's storage virtual machine (SVM).
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("06b224cb9409b415fb5e24827f5dfcea7b3d9bf295bcef0b39a174100f85e1c6")
      public fun nfs(nfs: NFSProperty.Builder.() -> Unit)

      /**
       * @param smb Specifies the Server Message Block (SMB) protocol configuration that DataSync
       * uses to access your FSx for ONTAP file system's SVM.
       */
      public fun smb(smb: IResolvable)

      /**
       * @param smb Specifies the Server Message Block (SMB) protocol configuration that DataSync
       * uses to access your FSx for ONTAP file system's SVM.
       */
      public fun smb(smb: SMBProperty)

      /**
       * @param smb Specifies the Server Message Block (SMB) protocol configuration that DataSync
       * uses to access your FSx for ONTAP file system's SVM.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f717d73cab6ad0a60e71361da9a2ab93603b509210d4c0deb60ee4cb1d98bbec")
      public fun smb(smb: SMBProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datasync.CfnLocationFSxONTAP.ProtocolProperty.Builder =
          software.amazon.awscdk.services.datasync.CfnLocationFSxONTAP.ProtocolProperty.builder()

      /**
       * @param nfs Specifies the Network File System (NFS) protocol configuration that DataSync
       * uses to access your FSx for ONTAP file system's storage virtual machine (SVM).
       */
      override fun nfs(nfs: IResolvable) {
        cdkBuilder.nfs(nfs.let(IResolvable::unwrap))
      }

      /**
       * @param nfs Specifies the Network File System (NFS) protocol configuration that DataSync
       * uses to access your FSx for ONTAP file system's storage virtual machine (SVM).
       */
      override fun nfs(nfs: NFSProperty) {
        cdkBuilder.nfs(nfs.let(NFSProperty::unwrap))
      }

      /**
       * @param nfs Specifies the Network File System (NFS) protocol configuration that DataSync
       * uses to access your FSx for ONTAP file system's storage virtual machine (SVM).
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("06b224cb9409b415fb5e24827f5dfcea7b3d9bf295bcef0b39a174100f85e1c6")
      override fun nfs(nfs: NFSProperty.Builder.() -> Unit): Unit = nfs(NFSProperty(nfs))

      /**
       * @param smb Specifies the Server Message Block (SMB) protocol configuration that DataSync
       * uses to access your FSx for ONTAP file system's SVM.
       */
      override fun smb(smb: IResolvable) {
        cdkBuilder.smb(smb.let(IResolvable::unwrap))
      }

      /**
       * @param smb Specifies the Server Message Block (SMB) protocol configuration that DataSync
       * uses to access your FSx for ONTAP file system's SVM.
       */
      override fun smb(smb: SMBProperty) {
        cdkBuilder.smb(smb.let(SMBProperty::unwrap))
      }

      /**
       * @param smb Specifies the Server Message Block (SMB) protocol configuration that DataSync
       * uses to access your FSx for ONTAP file system's SVM.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f717d73cab6ad0a60e71361da9a2ab93603b509210d4c0deb60ee4cb1d98bbec")
      override fun smb(smb: SMBProperty.Builder.() -> Unit): Unit = smb(SMBProperty(smb))

      public fun build():
          software.amazon.awscdk.services.datasync.CfnLocationFSxONTAP.ProtocolProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.datasync.CfnLocationFSxONTAP.ProtocolProperty,
    ) : CdkObject(cdkObject), ProtocolProperty {
      /**
       * Specifies the Network File System (NFS) protocol configuration that DataSync uses to access
       * your FSx for ONTAP file system's storage virtual machine (SVM).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-locationfsxontap-protocol.html#cfn-datasync-locationfsxontap-protocol-nfs)
       */
      override fun nfs(): Any? = unwrap(this).getNfs()

      /**
       * Specifies the Server Message Block (SMB) protocol configuration that DataSync uses to
       * access your FSx for ONTAP file system's SVM.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-locationfsxontap-protocol.html#cfn-datasync-locationfsxontap-protocol-smb)
       */
      override fun smb(): Any? = unwrap(this).getSmb()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ProtocolProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.datasync.CfnLocationFSxONTAP.ProtocolProperty):
          ProtocolProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ProtocolProperty):
          software.amazon.awscdk.services.datasync.CfnLocationFSxONTAP.ProtocolProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.datasync.CfnLocationFSxONTAP.ProtocolProperty
    }
  }

  /**
   * Specifies the Server Message Block (SMB) protocol configuration that AWS DataSync uses to
   * access a storage virtual machine (SVM) on your Amazon FSx for NetApp ONTAP file system.
   *
   * For more information, see [Accessing FSx for ONTAP file
   * systems](https://docs.aws.amazon.com/datasync/latest/userguide/create-ontap-location.html#create-ontap-location-access)
   * .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.datasync.*;
   * SMBProperty sMBProperty = SMBProperty.builder()
   * .mountOptions(SmbMountOptionsProperty.builder()
   * .version("version")
   * .build())
   * .password("password")
   * .user("user")
   * // the properties below are optional
   * .domain("domain")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-locationfsxontap-smb.html)
   */
  public interface SMBProperty {
    /**
     * Specifies the fully qualified domain name (FQDN) of the Microsoft Active Directory that your
     * storage virtual machine (SVM) belongs to.
     *
     * If you have multiple domains in your environment, configuring this setting makes sure that
     * DataSync connects to the right SVM.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-locationfsxontap-smb.html#cfn-datasync-locationfsxontap-smb-domain)
     */
    public fun domain(): String? = unwrap(this).getDomain()

    /**
     * Specifies how DataSync can access a location using the SMB protocol.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-locationfsxontap-smb.html#cfn-datasync-locationfsxontap-smb-mountoptions)
     */
    public fun mountOptions(): Any

    /**
     * Specifies the password of a user who has permission to access your SVM.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-locationfsxontap-smb.html#cfn-datasync-locationfsxontap-smb-password)
     */
    public fun password(): String

    /**
     * Specifies a user name that can mount the location and access the files, folders, and metadata
     * that you need in the SVM.
     *
     * If you provide a user in your Active Directory, note the following:
     *
     * * If you're using AWS Directory Service for Microsoft Active Directory , the user must be a
     * member of the AWS Delegated FSx Administrators group.
     * * If you're using a self-managed Active Directory, the user must be a member of either the
     * Domain Admins group or a custom group that you specified for file system administration when you
     * created your file system.
     *
     * Make sure that the user has the permissions it needs to copy the data you want:
     *
     * * `SE_TCB_NAME` : Required to set object ownership and file metadata. With this privilege,
     * you also can copy NTFS discretionary access lists (DACLs).
     * * `SE_SECURITY_NAME` : May be needed to copy NTFS system access control lists (SACLs). This
     * operation specifically requires the Windows privilege, which is granted to members of the Domain
     * Admins group. If you configure your task to copy SACLs, make sure that the user has the required
     * privileges. For information about copying SACLs, see [Ownership and permissions-related
     * options](https://docs.aws.amazon.com/datasync/latest/userguide/create-task.html#configure-ownership-and-permissions)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-locationfsxontap-smb.html#cfn-datasync-locationfsxontap-smb-user)
     */
    public fun user(): String

    /**
     * A builder for [SMBProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param domain Specifies the fully qualified domain name (FQDN) of the Microsoft Active
       * Directory that your storage virtual machine (SVM) belongs to.
       * If you have multiple domains in your environment, configuring this setting makes sure that
       * DataSync connects to the right SVM.
       */
      public fun domain(domain: String)

      /**
       * @param mountOptions Specifies how DataSync can access a location using the SMB protocol. 
       */
      public fun mountOptions(mountOptions: IResolvable)

      /**
       * @param mountOptions Specifies how DataSync can access a location using the SMB protocol. 
       */
      public fun mountOptions(mountOptions: SmbMountOptionsProperty)

      /**
       * @param mountOptions Specifies how DataSync can access a location using the SMB protocol. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("97d502a9fa55737f807ba05f319d7aeeaa18f7474c96932ae50515bbd8b0740c")
      public fun mountOptions(mountOptions: SmbMountOptionsProperty.Builder.() -> Unit)

      /**
       * @param password Specifies the password of a user who has permission to access your SVM. 
       */
      public fun password(password: String)

      /**
       * @param user Specifies a user name that can mount the location and access the files,
       * folders, and metadata that you need in the SVM. 
       * If you provide a user in your Active Directory, note the following:
       *
       * * If you're using AWS Directory Service for Microsoft Active Directory , the user must be a
       * member of the AWS Delegated FSx Administrators group.
       * * If you're using a self-managed Active Directory, the user must be a member of either the
       * Domain Admins group or a custom group that you specified for file system administration when
       * you created your file system.
       *
       * Make sure that the user has the permissions it needs to copy the data you want:
       *
       * * `SE_TCB_NAME` : Required to set object ownership and file metadata. With this privilege,
       * you also can copy NTFS discretionary access lists (DACLs).
       * * `SE_SECURITY_NAME` : May be needed to copy NTFS system access control lists (SACLs). This
       * operation specifically requires the Windows privilege, which is granted to members of the
       * Domain Admins group. If you configure your task to copy SACLs, make sure that the user has the
       * required privileges. For information about copying SACLs, see [Ownership and
       * permissions-related
       * options](https://docs.aws.amazon.com/datasync/latest/userguide/create-task.html#configure-ownership-and-permissions)
       * .
       */
      public fun user(user: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datasync.CfnLocationFSxONTAP.SMBProperty.Builder =
          software.amazon.awscdk.services.datasync.CfnLocationFSxONTAP.SMBProperty.builder()

      /**
       * @param domain Specifies the fully qualified domain name (FQDN) of the Microsoft Active
       * Directory that your storage virtual machine (SVM) belongs to.
       * If you have multiple domains in your environment, configuring this setting makes sure that
       * DataSync connects to the right SVM.
       */
      override fun domain(domain: String) {
        cdkBuilder.domain(domain)
      }

      /**
       * @param mountOptions Specifies how DataSync can access a location using the SMB protocol. 
       */
      override fun mountOptions(mountOptions: IResolvable) {
        cdkBuilder.mountOptions(mountOptions.let(IResolvable::unwrap))
      }

      /**
       * @param mountOptions Specifies how DataSync can access a location using the SMB protocol. 
       */
      override fun mountOptions(mountOptions: SmbMountOptionsProperty) {
        cdkBuilder.mountOptions(mountOptions.let(SmbMountOptionsProperty::unwrap))
      }

      /**
       * @param mountOptions Specifies how DataSync can access a location using the SMB protocol. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("97d502a9fa55737f807ba05f319d7aeeaa18f7474c96932ae50515bbd8b0740c")
      override fun mountOptions(mountOptions: SmbMountOptionsProperty.Builder.() -> Unit): Unit =
          mountOptions(SmbMountOptionsProperty(mountOptions))

      /**
       * @param password Specifies the password of a user who has permission to access your SVM. 
       */
      override fun password(password: String) {
        cdkBuilder.password(password)
      }

      /**
       * @param user Specifies a user name that can mount the location and access the files,
       * folders, and metadata that you need in the SVM. 
       * If you provide a user in your Active Directory, note the following:
       *
       * * If you're using AWS Directory Service for Microsoft Active Directory , the user must be a
       * member of the AWS Delegated FSx Administrators group.
       * * If you're using a self-managed Active Directory, the user must be a member of either the
       * Domain Admins group or a custom group that you specified for file system administration when
       * you created your file system.
       *
       * Make sure that the user has the permissions it needs to copy the data you want:
       *
       * * `SE_TCB_NAME` : Required to set object ownership and file metadata. With this privilege,
       * you also can copy NTFS discretionary access lists (DACLs).
       * * `SE_SECURITY_NAME` : May be needed to copy NTFS system access control lists (SACLs). This
       * operation specifically requires the Windows privilege, which is granted to members of the
       * Domain Admins group. If you configure your task to copy SACLs, make sure that the user has the
       * required privileges. For information about copying SACLs, see [Ownership and
       * permissions-related
       * options](https://docs.aws.amazon.com/datasync/latest/userguide/create-task.html#configure-ownership-and-permissions)
       * .
       */
      override fun user(user: String) {
        cdkBuilder.user(user)
      }

      public fun build(): software.amazon.awscdk.services.datasync.CfnLocationFSxONTAP.SMBProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.datasync.CfnLocationFSxONTAP.SMBProperty,
    ) : CdkObject(cdkObject), SMBProperty {
      /**
       * Specifies the fully qualified domain name (FQDN) of the Microsoft Active Directory that
       * your storage virtual machine (SVM) belongs to.
       *
       * If you have multiple domains in your environment, configuring this setting makes sure that
       * DataSync connects to the right SVM.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-locationfsxontap-smb.html#cfn-datasync-locationfsxontap-smb-domain)
       */
      override fun domain(): String? = unwrap(this).getDomain()

      /**
       * Specifies how DataSync can access a location using the SMB protocol.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-locationfsxontap-smb.html#cfn-datasync-locationfsxontap-smb-mountoptions)
       */
      override fun mountOptions(): Any = unwrap(this).getMountOptions()

      /**
       * Specifies the password of a user who has permission to access your SVM.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-locationfsxontap-smb.html#cfn-datasync-locationfsxontap-smb-password)
       */
      override fun password(): String = unwrap(this).getPassword()

      /**
       * Specifies a user name that can mount the location and access the files, folders, and
       * metadata that you need in the SVM.
       *
       * If you provide a user in your Active Directory, note the following:
       *
       * * If you're using AWS Directory Service for Microsoft Active Directory , the user must be a
       * member of the AWS Delegated FSx Administrators group.
       * * If you're using a self-managed Active Directory, the user must be a member of either the
       * Domain Admins group or a custom group that you specified for file system administration when
       * you created your file system.
       *
       * Make sure that the user has the permissions it needs to copy the data you want:
       *
       * * `SE_TCB_NAME` : Required to set object ownership and file metadata. With this privilege,
       * you also can copy NTFS discretionary access lists (DACLs).
       * * `SE_SECURITY_NAME` : May be needed to copy NTFS system access control lists (SACLs). This
       * operation specifically requires the Windows privilege, which is granted to members of the
       * Domain Admins group. If you configure your task to copy SACLs, make sure that the user has the
       * required privileges. For information about copying SACLs, see [Ownership and
       * permissions-related
       * options](https://docs.aws.amazon.com/datasync/latest/userguide/create-task.html#configure-ownership-and-permissions)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-locationfsxontap-smb.html#cfn-datasync-locationfsxontap-smb-user)
       */
      override fun user(): String = unwrap(this).getUser()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SMBProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.datasync.CfnLocationFSxONTAP.SMBProperty):
          SMBProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SMBProperty):
          software.amazon.awscdk.services.datasync.CfnLocationFSxONTAP.SMBProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.datasync.CfnLocationFSxONTAP.SMBProperty
    }
  }
}
