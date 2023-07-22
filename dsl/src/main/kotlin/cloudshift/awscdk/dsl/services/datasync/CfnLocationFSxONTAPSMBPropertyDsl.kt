@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.datasync

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.datasync.CfnLocationFSxONTAP

@CdkDslMarker
public class CfnLocationFSxONTAPSMBPropertyDsl {
  private val cdkBuilder: CfnLocationFSxONTAP.SMBProperty.Builder =
      CfnLocationFSxONTAP.SMBProperty.builder()

  /**
   * @param domain Specifies the fully qualified domain name (FQDN) of the Microsoft Active
   * Directory that your storage virtual machine (SVM) belongs to.
   */
  public fun domain(domain: String) {
    cdkBuilder.domain(domain)
  }

  /**
   * @param mountOptions Specifies how DataSync can access a location using the SMB protocol. 
   */
  public fun mountOptions(mountOptions: IResolvable) {
    cdkBuilder.mountOptions(mountOptions)
  }

  /**
   * @param mountOptions Specifies how DataSync can access a location using the SMB protocol. 
   */
  public fun mountOptions(mountOptions: CfnLocationFSxONTAP.SmbMountOptionsProperty) {
    cdkBuilder.mountOptions(mountOptions)
  }

  /**
   * @param password Specifies the password of a user who has permission to access your SVM. 
   */
  public fun password(password: String) {
    cdkBuilder.password(password)
  }

  /**
   * @param user Specifies a user name that can mount the location and access the files, folders,
   * and metadata that you need in the SVM. 
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
   * * `SE_TCB_NAME` : Required to set object ownership and file metadata. With this privilege, you
   * also can copy NTFS discretionary access lists (DACLs).
   * * `SE_SECURITY_NAME` : May be needed to copy NTFS system access control lists (SACLs). This
   * operation specifically requires the Windows privilege, which is granted to members of the Domain
   * Admins group. If you configure your task to copy SACLs, make sure that the user has the required
   * privileges. For information about copying SACLs, see [Ownership and permissions-related
   * options](https://docs.aws.amazon.com/datasync/latest/userguide/create-task.html#configure-ownership-and-permissions)
   * .
   */
  public fun user(user: String) {
    cdkBuilder.user(user)
  }

  public fun build(): CfnLocationFSxONTAP.SMBProperty = cdkBuilder.build()
}
