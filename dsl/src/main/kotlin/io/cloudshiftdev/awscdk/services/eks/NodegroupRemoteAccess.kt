package io.cloudshiftdev.awscdk.services.eks

import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface NodegroupRemoteAccess {
  public fun sourceSecurityGroups(): List<ISecurityGroup> =
      unwrap(this).getSourceSecurityGroups()?.map(ISecurityGroup::wrap) ?: emptyList()

  public fun sshKeyName(): String

  public interface Builder {
    public fun sourceSecurityGroups(sourceSecurityGroups: List<ISecurityGroup>)

    public fun sshKeyName(sshKeyName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.eks.NodegroupRemoteAccess.Builder =
        software.amazon.awscdk.services.eks.NodegroupRemoteAccess.builder()

    override fun sourceSecurityGroups(sourceSecurityGroups: List<ISecurityGroup>) {
      cdkBuilder.sourceSecurityGroups(sourceSecurityGroups.map(ISecurityGroup::unwrap))
    }

    override fun sshKeyName(sshKeyName: String) {
      cdkBuilder.sshKeyName(sshKeyName)
    }

    public fun build(): software.amazon.awscdk.services.eks.NodegroupRemoteAccess =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.eks.NodegroupRemoteAccess,
  ) : NodegroupRemoteAccess {
    override fun sourceSecurityGroups(): List<ISecurityGroup> =
        unwrap(this).getSourceSecurityGroups()?.map(ISecurityGroup::wrap) ?: emptyList()

    override fun sshKeyName(): String = unwrap(this).getSshKeyName()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): NodegroupRemoteAccess {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.NodegroupRemoteAccess):
        NodegroupRemoteAccess = Wrapper(cdkObject)

    internal fun unwrap(wrapped: NodegroupRemoteAccess):
        software.amazon.awscdk.services.eks.NodegroupRemoteAccess = (wrapped as Wrapper).cdkObject
  }
}
