@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.greengrass

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.greengrass.CfnConnectorDefinitionVersionProps

@CdkDslMarker
public class CfnConnectorDefinitionVersionPropsDsl {
  private val cdkBuilder: CfnConnectorDefinitionVersionProps.Builder =
      CfnConnectorDefinitionVersionProps.builder()

  private val _connectors: MutableList<Any> = mutableListOf()

  public fun connectorDefinitionId(connectorDefinitionId: String) {
    cdkBuilder.connectorDefinitionId(connectorDefinitionId)
  }

  public fun connectors(vararg connectors: Any) {
    _connectors.addAll(listOf(*connectors))
  }

  public fun connectors(connectors: Collection<Any>) {
    _connectors.addAll(connectors)
  }

  public fun connectors(connectors: IResolvable) {
    cdkBuilder.connectors(connectors)
  }

  public fun build(): CfnConnectorDefinitionVersionProps {
    if(_connectors.isNotEmpty()) cdkBuilder.connectors(_connectors)
    return cdkBuilder.build()
  }
}
