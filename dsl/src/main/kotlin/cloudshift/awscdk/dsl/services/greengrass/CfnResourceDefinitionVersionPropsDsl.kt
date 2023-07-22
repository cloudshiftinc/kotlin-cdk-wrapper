@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.greengrass

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersionProps

@CdkDslMarker
public class CfnResourceDefinitionVersionPropsDsl {
  private val cdkBuilder: CfnResourceDefinitionVersionProps.Builder =
      CfnResourceDefinitionVersionProps.builder()

  private val _resources: MutableList<Any> = mutableListOf()

  /**
   * @param resourceDefinitionId The ID of the resource definition associated with this version. 
   * This value is a GUID.
   */
  public fun resourceDefinitionId(resourceDefinitionId: String) {
    cdkBuilder.resourceDefinitionId(resourceDefinitionId)
  }

  /**
   * @param resources The resources in this version. 
   */
  public fun resources(vararg resources: Any) {
    _resources.addAll(listOf(*resources))
  }

  /**
   * @param resources The resources in this version. 
   */
  public fun resources(resources: Collection<Any>) {
    _resources.addAll(resources)
  }

  /**
   * @param resources The resources in this version. 
   */
  public fun resources(resources: IResolvable) {
    cdkBuilder.resources(resources)
  }

  public fun build(): CfnResourceDefinitionVersionProps {
    if(_resources.isNotEmpty()) cdkBuilder.resources(_resources)
    return cdkBuilder.build()
  }
}
