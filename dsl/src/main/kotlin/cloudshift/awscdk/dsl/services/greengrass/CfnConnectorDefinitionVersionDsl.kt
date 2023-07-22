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

  /**
   * The ID of the connector definition associated with this version.
   *
   * This value is a GUID.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-connectordefinitionversion.html#cfn-greengrass-connectordefinitionversion-connectordefinitionid)
   * @param connectorDefinitionId The ID of the connector definition associated with this version. 
   */
  public fun connectorDefinitionId(connectorDefinitionId: String) {
    cdkBuilder.connectorDefinitionId(connectorDefinitionId)
  }

  /**
   * The connectors in this version.
   *
   * Only one instance of a given connector can be added to the connector definition version at a
   * time.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-connectordefinitionversion.html#cfn-greengrass-connectordefinitionversion-connectors)
   * @param connectors The connectors in this version. 
   */
  public fun connectors(vararg connectors: Any) {
    _connectors.addAll(listOf(*connectors))
  }

  /**
   * The connectors in this version.
   *
   * Only one instance of a given connector can be added to the connector definition version at a
   * time.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-connectordefinitionversion.html#cfn-greengrass-connectordefinitionversion-connectors)
   * @param connectors The connectors in this version. 
   */
  public fun connectors(connectors: Collection<Any>) {
    _connectors.addAll(connectors)
  }

  /**
   * The connectors in this version.
   *
   * Only one instance of a given connector can be added to the connector definition version at a
   * time.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-connectordefinitionversion.html#cfn-greengrass-connectordefinitionversion-connectors)
   * @param connectors The connectors in this version. 
   */
  public fun connectors(connectors: IResolvable) {
    cdkBuilder.connectors(connectors)
  }

  public fun build(): CfnConnectorDefinitionVersion {
    if(_connectors.isNotEmpty()) cdkBuilder.connectors(_connectors)
    return cdkBuilder.build()
  }
}
