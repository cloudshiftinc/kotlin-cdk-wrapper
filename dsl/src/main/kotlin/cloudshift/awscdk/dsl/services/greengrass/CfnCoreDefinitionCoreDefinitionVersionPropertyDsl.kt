@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.greengrass

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.greengrass.CfnCoreDefinition

@CdkDslMarker
public class CfnCoreDefinitionCoreDefinitionVersionPropertyDsl {
  private val cdkBuilder: CfnCoreDefinition.CoreDefinitionVersionProperty.Builder =
      CfnCoreDefinition.CoreDefinitionVersionProperty.builder()

  private val _cores: MutableList<Any> = mutableListOf()

  public fun cores(vararg cores: Any) {
    _cores.addAll(listOf(*cores))
  }

  public fun cores(cores: Collection<Any>) {
    _cores.addAll(cores)
  }

  public fun cores(cores: IResolvable) {
    cdkBuilder.cores(cores)
  }

  public fun build(): CfnCoreDefinition.CoreDefinitionVersionProperty {
    if(_cores.isNotEmpty()) cdkBuilder.cores(_cores)
    return cdkBuilder.build()
  }
}
