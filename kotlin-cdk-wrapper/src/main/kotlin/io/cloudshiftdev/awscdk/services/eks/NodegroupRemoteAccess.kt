@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.eks

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface NodegroupRemoteAccess {
  public fun sourceSecurityGroups(): List<ISecurityGroup> =
      unwrap(this).getSourceSecurityGroups()?.map(ISecurityGroup::wrap) ?: emptyList()

  public fun sshKeyName(): String

  @CdkDslMarker
  public interface Builder {
    public fun sourceSecurityGroups(sourceSecurityGroups: List<ISecurityGroup>)

    public fun sourceSecurityGroups(vararg sourceSecurityGroups: ISecurityGroup)

    public fun sshKeyName(sshKeyName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.eks.NodegroupRemoteAccess.Builder =
        software.amazon.awscdk.services.eks.NodegroupRemoteAccess.builder()

    override fun sourceSecurityGroups(sourceSecurityGroups: List<ISecurityGroup>) {
      cdkBuilder.sourceSecurityGroups(sourceSecurityGroups.map(ISecurityGroup::unwrap))
    }

    override fun sourceSecurityGroups(vararg sourceSecurityGroups: ISecurityGroup): Unit =
        sourceSecurityGroups(sourceSecurityGroups.toList())

    override fun sshKeyName(sshKeyName: String) {
      cdkBuilder.sshKeyName(sshKeyName)
    }

    public fun build(): software.amazon.awscdk.services.eks.NodegroupRemoteAccess =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.eks.NodegroupRemoteAccess,
  ) : CdkObject(cdkObject), NodegroupRemoteAccess {
    override fun sourceSecurityGroups(): List<ISecurityGroup> =
        unwrap(this).getSourceSecurityGroups()?.map(ISecurityGroup::wrap) ?: emptyList()

    override fun sshKeyName(): String = unwrap(this).getSshKeyName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): NodegroupRemoteAccess {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.NodegroupRemoteAccess):
        NodegroupRemoteAccess = Wrapper(cdkObject)

    internal fun unwrap(wrapped: NodegroupRemoteAccess):
        software.amazon.awscdk.services.eks.NodegroupRemoteAccess = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.eks.NodegroupRemoteAccess
  }
}
