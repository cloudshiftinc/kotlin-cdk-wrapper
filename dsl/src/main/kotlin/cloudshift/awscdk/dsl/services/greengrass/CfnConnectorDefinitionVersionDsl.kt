@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.greengrass

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.greengrass.CfnConnectorDefinitionVersion
import software.constructs.Construct

@CdkDslMarker
public class CfnConnectorDefinitionVersionDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnConnectorDefinitionVersion.Builder =
      CfnConnectorDefinitionVersion.Builder.create(scope, id)

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

  public fun build(): CfnConnectorDefinitionVersion {
    if(_connectors.isNotEmpty()) cdkBuilder.connectors(_connectors)
    return cdkBuilder.build()
  }
}
