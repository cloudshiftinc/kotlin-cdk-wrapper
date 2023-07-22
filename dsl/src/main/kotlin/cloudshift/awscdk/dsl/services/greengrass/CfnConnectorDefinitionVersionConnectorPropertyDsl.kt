@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.greengrass

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.greengrass.CfnConnectorDefinitionVersion

@CdkDslMarker
public class CfnConnectorDefinitionVersionConnectorPropertyDsl {
  private val cdkBuilder: CfnConnectorDefinitionVersion.ConnectorProperty.Builder =
      CfnConnectorDefinitionVersion.ConnectorProperty.builder()

  /**
   * @param connectorArn The Amazon Resource Name (ARN) of the connector. 
   * For more information about connectors provided by AWS , see [Greengrass Connectors Provided by
   * AWS](https://docs.aws.amazon.com/greengrass/latest/developerguide/connectors-list.html) .
   */
  public fun connectorArn(connectorArn: String) {
    cdkBuilder.connectorArn(connectorArn)
  }

  /**
   * @param id A descriptive or arbitrary ID for the connector. 
   * This value must be unique within the connector definition version. Maximum length is 128
   * characters with pattern `[a-zA-Z0-9:_-]+` .
   */
  public fun id(id: String) {
    cdkBuilder.id(id)
  }

  /**
   * @param parameters The parameters or configuration that the connector uses.
   * For more information about connectors provided by AWS , see [Greengrass Connectors Provided by
   * AWS](https://docs.aws.amazon.com/greengrass/latest/developerguide/connectors-list.html) .
   */
  public fun parameters(parameters: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(parameters)
    cdkBuilder.parameters(builder.map)
  }

  /**
   * @param parameters The parameters or configuration that the connector uses.
   * For more information about connectors provided by AWS , see [Greengrass Connectors Provided by
   * AWS](https://docs.aws.amazon.com/greengrass/latest/developerguide/connectors-list.html) .
   */
  public fun parameters(parameters: Any) {
    cdkBuilder.parameters(parameters)
  }

  public fun build(): CfnConnectorDefinitionVersion.ConnectorProperty = cdkBuilder.build()
}
