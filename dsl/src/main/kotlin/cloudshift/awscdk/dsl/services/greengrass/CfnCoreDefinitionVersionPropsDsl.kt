@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.greengrass

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.greengrass.CfnCoreDefinitionVersionProps

@CdkDslMarker
public class CfnCoreDefinitionVersionPropsDsl {
  private val cdkBuilder: CfnCoreDefinitionVersionProps.Builder =
      CfnCoreDefinitionVersionProps.builder()

  private val _cores: MutableList<Any> = mutableListOf()

  /**
   * @param coreDefinitionId The ID of the core definition associated with this version. 
   * This value is a GUID.
   */
  public fun coreDefinitionId(coreDefinitionId: String) {
    cdkBuilder.coreDefinitionId(coreDefinitionId)
  }

  /**
   * @param cores The Greengrass core in this version. 
   * Currently, the `Cores` property for a core definition version can contain only one core.
   */
  public fun cores(vararg cores: Any) {
    _cores.addAll(listOf(*cores))
  }

  /**
   * @param cores The Greengrass core in this version. 
   * Currently, the `Cores` property for a core definition version can contain only one core.
   */
  public fun cores(cores: Collection<Any>) {
    _cores.addAll(cores)
  }

  /**
   * @param cores The Greengrass core in this version. 
   * Currently, the `Cores` property for a core definition version can contain only one core.
   */
  public fun cores(cores: IResolvable) {
    cdkBuilder.cores(cores)
  }

  public fun build(): CfnCoreDefinitionVersionProps {
    if(_cores.isNotEmpty()) cdkBuilder.cores(_cores)
    return cdkBuilder.build()
  }
}
