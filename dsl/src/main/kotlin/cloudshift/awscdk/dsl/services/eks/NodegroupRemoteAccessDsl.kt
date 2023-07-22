@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.eks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ec2.ISecurityGroup
import software.amazon.awscdk.services.eks.NodegroupRemoteAccess

@CdkDslMarker
public class NodegroupRemoteAccessDsl {
  private val cdkBuilder: NodegroupRemoteAccess.Builder = NodegroupRemoteAccess.builder()

  private val _sourceSecurityGroups: MutableList<ISecurityGroup> = mutableListOf()

  /**
   * @param sourceSecurityGroups The security groups that are allowed SSH access (port 22) to the
   * worker nodes.
   * If you specify an Amazon EC2 SSH
   * key but do not specify a source security group when you create a managed node group, then port
   * 22 on the worker
   * nodes is opened to the internet (0.0.0.0/0).
   */
  public fun sourceSecurityGroups(vararg sourceSecurityGroups: ISecurityGroup) {
    _sourceSecurityGroups.addAll(listOf(*sourceSecurityGroups))
  }

  /**
   * @param sourceSecurityGroups The security groups that are allowed SSH access (port 22) to the
   * worker nodes.
   * If you specify an Amazon EC2 SSH
   * key but do not specify a source security group when you create a managed node group, then port
   * 22 on the worker
   * nodes is opened to the internet (0.0.0.0/0).
   */
  public fun sourceSecurityGroups(sourceSecurityGroups: Collection<ISecurityGroup>) {
    _sourceSecurityGroups.addAll(sourceSecurityGroups)
  }

  /**
   * @param sshKeyName The Amazon EC2 SSH key that provides access for SSH communication with the
   * worker nodes in the managed node group. 
   */
  public fun sshKeyName(sshKeyName: String) {
    cdkBuilder.sshKeyName(sshKeyName)
  }

  public fun build(): NodegroupRemoteAccess {
    if(_sourceSecurityGroups.isNotEmpty()) cdkBuilder.sourceSecurityGroups(_sourceSecurityGroups)
    return cdkBuilder.build()
  }
}
