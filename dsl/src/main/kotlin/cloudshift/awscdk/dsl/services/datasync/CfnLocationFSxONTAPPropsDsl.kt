@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.datasync

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.datasync.CfnLocationFSxONTAP
import software.amazon.awscdk.services.datasync.CfnLocationFSxONTAPProps

@CdkDslMarker
public class CfnLocationFSxONTAPPropsDsl {
  private val cdkBuilder: CfnLocationFSxONTAPProps.Builder = CfnLocationFSxONTAPProps.builder()

  private val _securityGroupArns: MutableList<String> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param protocol Specifies the data transfer protocol that DataSync uses to access your Amazon
   * FSx file system.
   */
  public fun protocol(protocol: IResolvable) {
    cdkBuilder.protocol(protocol)
  }

  /**
   * @param protocol Specifies the data transfer protocol that DataSync uses to access your Amazon
   * FSx file system.
   */
  public fun protocol(protocol: CfnLocationFSxONTAP.ProtocolProperty) {
    cdkBuilder.protocol(protocol)
  }

  /**
   * @param securityGroupArns Specifies the Amazon Resource Names (ARNs) of the security groups that
   * DataSync can use to access your FSx for ONTAP file system. 
   * You must configure the security groups to allow outbound traffic on the following ports
   * (depending on the protocol that you're using):
   *
   * * *Network File System (NFS)* : TCP ports 111, 635, and 2049
   * * *Server Message Block (SMB)* : TCP port 445
   *
   * Your file system's security groups must also allow inbound traffic on the same port.
   */
  public fun securityGroupArns(vararg securityGroupArns: String) {
    _securityGroupArns.addAll(listOf(*securityGroupArns))
  }

  /**
   * @param securityGroupArns Specifies the Amazon Resource Names (ARNs) of the security groups that
   * DataSync can use to access your FSx for ONTAP file system. 
   * You must configure the security groups to allow outbound traffic on the following ports
   * (depending on the protocol that you're using):
   *
   * * *Network File System (NFS)* : TCP ports 111, 635, and 2049
   * * *Server Message Block (SMB)* : TCP port 445
   *
   * Your file system's security groups must also allow inbound traffic on the same port.
   */
  public fun securityGroupArns(securityGroupArns: Collection<String>) {
    _securityGroupArns.addAll(securityGroupArns)
  }

  /**
   * @param storageVirtualMachineArn Specifies the ARN of the storage virtual machine (SVM) in your
   * file system where you want to copy data to or from. 
   */
  public fun storageVirtualMachineArn(storageVirtualMachineArn: String) {
    cdkBuilder.storageVirtualMachineArn(storageVirtualMachineArn)
  }

  /**
   * @param subdirectory Specifies a path to the file share in the SVM where you'll copy your data.
   * You can specify a junction path (also known as a mount point), qtree path (for NFS file
   * shares), or share name (for SMB file shares). For example, your mount path might be `/vol1` ,
   * `/vol1/tree1` , or `/share1` .
   *
   *
   * Don't specify a junction path in the SVM's root volume. For more information, see [Managing FSx
   * for ONTAP storage virtual
   * machines](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/managing-svms.html) in the *Amazon FSx
   * for NetApp ONTAP User Guide* .
   */
  public fun subdirectory(subdirectory: String) {
    cdkBuilder.subdirectory(subdirectory)
  }

  /**
   * @param tags Specifies labels that help you categorize, filter, and search for your AWS
   * resources.
   * We recommend creating at least a name tag for your location.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags Specifies labels that help you categorize, filter, and search for your AWS
   * resources.
   * We recommend creating at least a name tag for your location.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnLocationFSxONTAPProps {
    if(_securityGroupArns.isNotEmpty()) cdkBuilder.securityGroupArns(_securityGroupArns)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
