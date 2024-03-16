@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * A NetworkAcl.
 */
public interface INetworkAcl : IResource {
  /**
   * Add a new entry to the ACL.
   *
   * @param id 
   * @param options 
   */
  public fun addEntry(id: String, options: CommonNetworkAclEntryOptions): NetworkAclEntry

  /**
   * Add a new entry to the ACL.
   *
   * @param id 
   * @param options 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9ded3168e29970080cb3758417dce7573f6048a2cd62d2c05c7c24d3ed40bb13")
  public fun addEntry(id: String, options: CommonNetworkAclEntryOptions.Builder.() -> Unit):
      NetworkAclEntry

  /**
   * ID for the current Network ACL.
   */
  public fun networkAclId(): String

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.INetworkAcl): INetworkAcl =
        CdkObjectWrappers.wrap(cdkObject) as INetworkAcl

    internal fun unwrap(wrapped: INetworkAcl): software.amazon.awscdk.services.ec2.INetworkAcl =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.ec2.INetworkAcl
  }
}
