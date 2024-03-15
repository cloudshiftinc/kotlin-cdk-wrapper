@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.Node
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface INetworkAcl : IResource {
  public fun addEntry(arg0: String, arg1: CommonNetworkAclEntryOptions): NetworkAclEntry

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9ded3168e29970080cb3758417dce7573f6048a2cd62d2c05c7c24d3ed40bb13")
  public fun addEntry(arg0: String, arg1: CommonNetworkAclEntryOptions.Builder.() -> Unit):
      NetworkAclEntry

  public fun networkAclId(): String

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.INetworkAcl,
  ) : CdkObject(cdkObject), INetworkAcl {
    override fun addEntry(arg0: String, arg1: CommonNetworkAclEntryOptions): NetworkAclEntry =
        unwrap(this).addEntry(arg0,
        arg1.let(CommonNetworkAclEntryOptions::unwrap)).let(NetworkAclEntry::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9ded3168e29970080cb3758417dce7573f6048a2cd62d2c05c7c24d3ed40bb13")
    override fun addEntry(arg0: String, arg1: CommonNetworkAclEntryOptions.Builder.() -> Unit):
        NetworkAclEntry = addEntry(arg0, CommonNetworkAclEntryOptions(arg1))

    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun networkAclId(): String = unwrap(this).getNetworkAclId()

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.INetworkAcl): INetworkAcl =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: INetworkAcl): software.amazon.awscdk.services.ec2.INetworkAcl =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.ec2.INetworkAcl
  }
}
