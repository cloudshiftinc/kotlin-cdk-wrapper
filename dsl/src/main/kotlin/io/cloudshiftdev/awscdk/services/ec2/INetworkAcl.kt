package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.constructs.Node
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface INetworkAcl : IResource {
  public fun addEntry(arg0: String, arg1: CommonNetworkAclEntryOptions): NetworkAclEntry

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9ded3168e29970080cb3758417dce7573f6048a2cd62d2c05c7c24d3ed40bb13")
  public fun addEntry(arg0: String, arg1: CommonNetworkAclEntryOptions.Builder.() -> Unit):
      NetworkAclEntry

  public fun networkAclId(): String

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ec2.INetworkAcl,
  ) : INetworkAcl {
    public override fun addEntry(arg0: String, arg1: CommonNetworkAclEntryOptions): NetworkAclEntry
        = unwrap(this).addEntry(arg0,
        arg1.let(CommonNetworkAclEntryOptions::unwrap)).let(NetworkAclEntry::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9ded3168e29970080cb3758417dce7573f6048a2cd62d2c05c7c24d3ed40bb13")
    public override fun addEntry(arg0: String,
        arg1: CommonNetworkAclEntryOptions.Builder.() -> Unit): NetworkAclEntry = addEntry(arg0,
        CommonNetworkAclEntryOptions(arg1))

    public override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    public override fun env(): ResourceEnvironment =
        unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    public override fun networkAclId(): String = unwrap(this).getNetworkAclId()

    public override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    public override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.INetworkAcl): INetworkAcl =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: INetworkAcl): software.amazon.awscdk.services.ec2.INetworkAcl =
        (wrapped as Wrapper).cdkObject
  }
}
