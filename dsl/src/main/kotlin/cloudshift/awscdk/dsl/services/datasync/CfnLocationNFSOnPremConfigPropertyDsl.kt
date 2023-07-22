@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.datasync

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.datasync.CfnLocationNFS

/**
 * A list of Amazon Resource Names (ARNs) of agents to use for a Network File System (NFS) location.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.datasync.*;
 * OnPremConfigProperty onPremConfigProperty = OnPremConfigProperty.builder()
 * .agentArns(List.of("agentArns"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-locationnfs-onpremconfig.html)
 */
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
