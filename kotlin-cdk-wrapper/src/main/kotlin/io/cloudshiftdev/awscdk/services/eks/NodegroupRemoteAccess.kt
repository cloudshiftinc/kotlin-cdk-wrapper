@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.eks

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * The remote access (SSH) configuration to use with your node group.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * import io.cloudshiftdev.awscdk.services.eks.*;
 * SecurityGroup securityGroup;
 * NodegroupRemoteAccess nodegroupRemoteAccess = NodegroupRemoteAccess.builder()
 * .sshKeyName("sshKeyName")
 * // the properties below are optional
 * .sourceSecurityGroups(List.of(securityGroup))
 * .build();
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-nodegroup-remoteaccess.html)
 */
public interface NodegroupRemoteAccess {
  /**
   * The security groups that are allowed SSH access (port 22) to the worker nodes.
   *
   * If you specify an Amazon EC2 SSH
   * key but do not specify a source security group when you create a managed node group, then port
   * 22 on the worker
   * nodes is opened to the internet (0.0.0.0/0).
   *
   * Default: - port 22 on the worker nodes is opened to the internet (0.0.0.0/0)
   */
  public fun sourceSecurityGroups(): List<ISecurityGroup> =
      unwrap(this).getSourceSecurityGroups()?.map(ISecurityGroup::wrap) ?: emptyList()

  /**
   * The Amazon EC2 SSH key that provides access for SSH communication with the worker nodes in the
   * managed node group.
   */
  public fun sshKeyName(): String

  /**
   * A builder for [NodegroupRemoteAccess]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param sourceSecurityGroups The security groups that are allowed SSH access (port 22) to the
     * worker nodes.
     * If you specify an Amazon EC2 SSH
     * key but do not specify a source security group when you create a managed node group, then
     * port 22 on the worker
     * nodes is opened to the internet (0.0.0.0/0).
     */
    public fun sourceSecurityGroups(sourceSecurityGroups: List<ISecurityGroup>)

    /**
     * @param sourceSecurityGroups The security groups that are allowed SSH access (port 22) to the
     * worker nodes.
     * If you specify an Amazon EC2 SSH
     * key but do not specify a source security group when you create a managed node group, then
     * port 22 on the worker
     * nodes is opened to the internet (0.0.0.0/0).
     */
    public fun sourceSecurityGroups(vararg sourceSecurityGroups: ISecurityGroup)

    /**
     * @param sshKeyName The Amazon EC2 SSH key that provides access for SSH communication with the
     * worker nodes in the managed node group. 
     */
    public fun sshKeyName(sshKeyName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.eks.NodegroupRemoteAccess.Builder =
        software.amazon.awscdk.services.eks.NodegroupRemoteAccess.builder()

    /**
     * @param sourceSecurityGroups The security groups that are allowed SSH access (port 22) to the
     * worker nodes.
     * If you specify an Amazon EC2 SSH
     * key but do not specify a source security group when you create a managed node group, then
     * port 22 on the worker
     * nodes is opened to the internet (0.0.0.0/0).
     */
    override fun sourceSecurityGroups(sourceSecurityGroups: List<ISecurityGroup>) {
      cdkBuilder.sourceSecurityGroups(sourceSecurityGroups.map(ISecurityGroup.Companion::unwrap))
    }

    /**
     * @param sourceSecurityGroups The security groups that are allowed SSH access (port 22) to the
     * worker nodes.
     * If you specify an Amazon EC2 SSH
     * key but do not specify a source security group when you create a managed node group, then
     * port 22 on the worker
     * nodes is opened to the internet (0.0.0.0/0).
     */
    override fun sourceSecurityGroups(vararg sourceSecurityGroups: ISecurityGroup): Unit =
        sourceSecurityGroups(sourceSecurityGroups.toList())

    /**
     * @param sshKeyName The Amazon EC2 SSH key that provides access for SSH communication with the
     * worker nodes in the managed node group. 
     */
    override fun sshKeyName(sshKeyName: String) {
      cdkBuilder.sshKeyName(sshKeyName)
    }

    public fun build(): software.amazon.awscdk.services.eks.NodegroupRemoteAccess =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.eks.NodegroupRemoteAccess,
  ) : CdkObject(cdkObject), NodegroupRemoteAccess {
    /**
     * The security groups that are allowed SSH access (port 22) to the worker nodes.
     *
     * If you specify an Amazon EC2 SSH
     * key but do not specify a source security group when you create a managed node group, then
     * port 22 on the worker
     * nodes is opened to the internet (0.0.0.0/0).
     *
     * Default: - port 22 on the worker nodes is opened to the internet (0.0.0.0/0)
     */
    override fun sourceSecurityGroups(): List<ISecurityGroup> =
        unwrap(this).getSourceSecurityGroups()?.map(ISecurityGroup::wrap) ?: emptyList()

    /**
     * The Amazon EC2 SSH key that provides access for SSH communication with the worker nodes in
     * the managed node group.
     */
    override fun sshKeyName(): String = unwrap(this).getSshKeyName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): NodegroupRemoteAccess {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.NodegroupRemoteAccess):
        NodegroupRemoteAccess = CdkObjectWrappers.wrap(cdkObject) as? NodegroupRemoteAccess ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: NodegroupRemoteAccess):
        software.amazon.awscdk.services.eks.NodegroupRemoteAccess = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.eks.NodegroupRemoteAccess
  }
}
