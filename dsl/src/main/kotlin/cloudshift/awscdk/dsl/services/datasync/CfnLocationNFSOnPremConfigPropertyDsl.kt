@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.datasync

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.datasync.CfnLocationNFS

@CdkDslMarker
public class CfnLocationNFSOnPremConfigPropertyDsl {
  private val cdkBuilder: CfnLocationNFS.OnPremConfigProperty.Builder =
      CfnLocationNFS.OnPremConfigProperty.builder()

  private val _agentArns: MutableList<String> = mutableListOf()

  /**
   * @param agentArns ARNs of the agents to use for an NFS location. 
   */
  public fun agentArns(vararg agentArns: String) {
    _agentArns.addAll(listOf(*agentArns))
  }

  /**
   * @param agentArns ARNs of the agents to use for an NFS location. 
   */
  public fun agentArns(agentArns: Collection<String>) {
    _agentArns.addAll(agentArns)
  }

  public fun build(): CfnLocationNFS.OnPremConfigProperty {
    if(_agentArns.isNotEmpty()) cdkBuilder.agentArns(_agentArns)
    return cdkBuilder.build()
  }
}
