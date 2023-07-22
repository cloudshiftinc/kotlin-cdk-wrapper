@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codeguruprofiler

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.codeguruprofiler.CfnProfilingGroup

@CdkDslMarker
public class CfnProfilingGroupAgentPermissionsPropertyDsl {
  private val cdkBuilder: CfnProfilingGroup.AgentPermissionsProperty.Builder =
      CfnProfilingGroup.AgentPermissionsProperty.builder()

  private val _principals: MutableList<String> = mutableListOf()

  /**
   * @param principals The principals for the agent permissions. 
   */
  public fun principals(vararg principals: String) {
    _principals.addAll(listOf(*principals))
  }

  /**
   * @param principals The principals for the agent permissions. 
   */
  public fun principals(principals: Collection<String>) {
    _principals.addAll(principals)
  }

  public fun build(): CfnProfilingGroup.AgentPermissionsProperty {
    if(_principals.isNotEmpty()) cdkBuilder.principals(_principals)
    return cdkBuilder.build()
  }
}
