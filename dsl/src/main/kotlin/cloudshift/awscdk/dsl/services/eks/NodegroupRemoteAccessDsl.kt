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

  public fun sourceSecurityGroups(vararg sourceSecurityGroups: ISecurityGroup) {
    _sourceSecurityGroups.addAll(listOf(*sourceSecurityGroups))
  }

  public fun sourceSecurityGroups(sourceSecurityGroups: Collection<ISecurityGroup>) {
    _sourceSecurityGroups.addAll(sourceSecurityGroups)
  }

  public fun sshKeyName(sshKeyName: String) {
    cdkBuilder.sshKeyName(sshKeyName)
  }

  public fun build(): NodegroupRemoteAccess {
    if(_sourceSecurityGroups.isNotEmpty()) cdkBuilder.sourceSecurityGroups(_sourceSecurityGroups)
    return cdkBuilder.build()
  }
}
