@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.datasync

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnLocationFSxONTAP`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.datasync.*;
 * CfnLocationFSxONTAPProps cfnLocationFSxONTAPProps = CfnLocationFSxONTAPProps.builder()
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
public interface CfnLocationFSxONTAPProps {
  /**
   * Specifies the data transfer protocol that DataSync uses to access your Amazon FSx file system.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxontap.html#cfn-datasync-locationfsxontap-protocol)
   */
  public fun protocol(): Any? = unwrap(this).getProtocol()

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
   */
  public fun securityGroupArns(): List<String>

  /**
   * Specifies the ARN of the storage virtual machine (SVM) in your file system where you want to
   * copy data to or from.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxontap.html#cfn-datasync-locationfsxontap-storagevirtualmachinearn)
   */
  public fun storageVirtualMachineArn(): String

  /**
   * Specifies a path to the file share in the SVM where you'll copy your data.
   *
   * You can specify a junction path (also known as a mount point), qtree path (for NFS file
   * shares), or share name (for SMB file shares). For example, your mount path might be `/vol1` ,
   * `/vol1/tree1` , or `/share1` .
   *
   *
   * Don't specify a junction path in the SVM's root volume. For more information, see [Managing FSx
   * for ONTAP storage virtual
   * machines](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/managing-svms.html) in the *Amazon FSx
   * for NetApp ONTAP User Guide* .
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxontap.html#cfn-datasync-locationfsxontap-subdirectory)
   */
  public fun subdirectory(): String? = unwrap(this).getSubdirectory()

  /**
   * Specifies labels that help you categorize, filter, and search for your AWS resources.
   *
   * We recommend creating at least a name tag for your location.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxontap.html#cfn-datasync-locationfsxontap-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnLocationFSxONTAPProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param protocol Specifies the data transfer protocol that DataSync uses to access your Amazon
     * FSx file system.
     */
    public fun protocol(protocol: IResolvable)

    /**
     * @param protocol Specifies the data transfer protocol that DataSync uses to access your Amazon
     * FSx file system.
     */
    public fun protocol(protocol: CfnLocationFSxONTAP.ProtocolProperty)

    /**
     * @param protocol Specifies the data transfer protocol that DataSync uses to access your Amazon
     * FSx file system.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2e26ef007f0005b9f71f98f8291591df6a8a99446b5645c8711ca11b9f640962")
    public fun protocol(protocol: CfnLocationFSxONTAP.ProtocolProperty.Builder.() -> Unit)

    /**
     * @param securityGroupArns Specifies the Amazon Resource Names (ARNs) of the security groups
     * that DataSync can use to access your FSx for ONTAP file system. 
     * You must configure the security groups to allow outbound traffic on the following ports
     * (depending on the protocol that you're using):
     *
     * * *Network File System (NFS)* : TCP ports 111, 635, and 2049
     * * *Server Message Block (SMB)* : TCP port 445
     *
     * Your file system's security groups must also allow inbound traffic on the same port.
     */
    public fun securityGroupArns(securityGroupArns: List<String>)

    /**
     * @param securityGroupArns Specifies the Amazon Resource Names (ARNs) of the security groups
     * that DataSync can use to access your FSx for ONTAP file system. 
     * You must configure the security groups to allow outbound traffic on the following ports
     * (depending on the protocol that you're using):
     *
     * * *Network File System (NFS)* : TCP ports 111, 635, and 2049
     * * *Server Message Block (SMB)* : TCP port 445
     *
     * Your file system's security groups must also allow inbound traffic on the same port.
     */
    public fun securityGroupArns(vararg securityGroupArns: String)

    /**
     * @param storageVirtualMachineArn Specifies the ARN of the storage virtual machine (SVM) in
     * your file system where you want to copy data to or from. 
     */
    public fun storageVirtualMachineArn(storageVirtualMachineArn: String)

    /**
     * @param subdirectory Specifies a path to the file share in the SVM where you'll copy your
     * data.
     * You can specify a junction path (also known as a mount point), qtree path (for NFS file
     * shares), or share name (for SMB file shares). For example, your mount path might be `/vol1` ,
     * `/vol1/tree1` , or `/share1` .
     *
     *
     * Don't specify a junction path in the SVM's root volume. For more information, see [Managing
     * FSx for ONTAP storage virtual
     * machines](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/managing-svms.html) in the *Amazon
     * FSx for NetApp ONTAP User Guide* .
     */
    public fun subdirectory(subdirectory: String)

    /**
     * @param tags Specifies labels that help you categorize, filter, and search for your AWS
     * resources.
     * We recommend creating at least a name tag for your location.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Specifies labels that help you categorize, filter, and search for your AWS
     * resources.
     * We recommend creating at least a name tag for your location.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.datasync.CfnLocationFSxONTAPProps.Builder =
        software.amazon.awscdk.services.datasync.CfnLocationFSxONTAPProps.builder()

    /**
     * @param protocol Specifies the data transfer protocol that DataSync uses to access your Amazon
     * FSx file system.
     */
    override fun protocol(protocol: IResolvable) {
      cdkBuilder.protocol(protocol.let(IResolvable::unwrap))
    }

    /**
     * @param protocol Specifies the data transfer protocol that DataSync uses to access your Amazon
     * FSx file system.
     */
    override fun protocol(protocol: CfnLocationFSxONTAP.ProtocolProperty) {
      cdkBuilder.protocol(protocol.let(CfnLocationFSxONTAP.ProtocolProperty::unwrap))
    }

    /**
     * @param protocol Specifies the data transfer protocol that DataSync uses to access your Amazon
     * FSx file system.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2e26ef007f0005b9f71f98f8291591df6a8a99446b5645c8711ca11b9f640962")
    override fun protocol(protocol: CfnLocationFSxONTAP.ProtocolProperty.Builder.() -> Unit): Unit =
        protocol(CfnLocationFSxONTAP.ProtocolProperty(protocol))

    /**
     * @param securityGroupArns Specifies the Amazon Resource Names (ARNs) of the security groups
     * that DataSync can use to access your FSx for ONTAP file system. 
     * You must configure the security groups to allow outbound traffic on the following ports
     * (depending on the protocol that you're using):
     *
     * * *Network File System (NFS)* : TCP ports 111, 635, and 2049
     * * *Server Message Block (SMB)* : TCP port 445
     *
     * Your file system's security groups must also allow inbound traffic on the same port.
     */
    override fun securityGroupArns(securityGroupArns: List<String>) {
      cdkBuilder.securityGroupArns(securityGroupArns)
    }

    /**
     * @param securityGroupArns Specifies the Amazon Resource Names (ARNs) of the security groups
     * that DataSync can use to access your FSx for ONTAP file system. 
     * You must configure the security groups to allow outbound traffic on the following ports
     * (depending on the protocol that you're using):
     *
     * * *Network File System (NFS)* : TCP ports 111, 635, and 2049
     * * *Server Message Block (SMB)* : TCP port 445
     *
     * Your file system's security groups must also allow inbound traffic on the same port.
     */
    override fun securityGroupArns(vararg securityGroupArns: String): Unit =
        securityGroupArns(securityGroupArns.toList())

    /**
     * @param storageVirtualMachineArn Specifies the ARN of the storage virtual machine (SVM) in
     * your file system where you want to copy data to or from. 
     */
    override fun storageVirtualMachineArn(storageVirtualMachineArn: String) {
      cdkBuilder.storageVirtualMachineArn(storageVirtualMachineArn)
    }

    /**
     * @param subdirectory Specifies a path to the file share in the SVM where you'll copy your
     * data.
     * You can specify a junction path (also known as a mount point), qtree path (for NFS file
     * shares), or share name (for SMB file shares). For example, your mount path might be `/vol1` ,
     * `/vol1/tree1` , or `/share1` .
     *
     *
     * Don't specify a junction path in the SVM's root volume. For more information, see [Managing
     * FSx for ONTAP storage virtual
     * machines](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/managing-svms.html) in the *Amazon
     * FSx for NetApp ONTAP User Guide* .
     */
    override fun subdirectory(subdirectory: String) {
      cdkBuilder.subdirectory(subdirectory)
    }

    /**
     * @param tags Specifies labels that help you categorize, filter, and search for your AWS
     * resources.
     * We recommend creating at least a name tag for your location.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags Specifies labels that help you categorize, filter, and search for your AWS
     * resources.
     * We recommend creating at least a name tag for your location.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.datasync.CfnLocationFSxONTAPProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.datasync.CfnLocationFSxONTAPProps,
  ) : CdkObject(cdkObject), CfnLocationFSxONTAPProps {
    /**
     * Specifies the data transfer protocol that DataSync uses to access your Amazon FSx file
     * system.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxontap.html#cfn-datasync-locationfsxontap-protocol)
     */
    override fun protocol(): Any? = unwrap(this).getProtocol()

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
     */
    override fun securityGroupArns(): List<String> = unwrap(this).getSecurityGroupArns()

    /**
     * Specifies the ARN of the storage virtual machine (SVM) in your file system where you want to
     * copy data to or from.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxontap.html#cfn-datasync-locationfsxontap-storagevirtualmachinearn)
     */
    override fun storageVirtualMachineArn(): String = unwrap(this).getStorageVirtualMachineArn()

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
     */
    override fun subdirectory(): String? = unwrap(this).getSubdirectory()

    /**
     * Specifies labels that help you categorize, filter, and search for your AWS resources.
     *
     * We recommend creating at least a name tag for your location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationfsxontap.html#cfn-datasync-locationfsxontap-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnLocationFSxONTAPProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.datasync.CfnLocationFSxONTAPProps):
        CfnLocationFSxONTAPProps = CdkObjectWrappers.wrap(cdkObject) as CfnLocationFSxONTAPProps

    internal fun unwrap(wrapped: CfnLocationFSxONTAPProps):
        software.amazon.awscdk.services.datasync.CfnLocationFSxONTAPProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.datasync.CfnLocationFSxONTAPProps
  }
}
