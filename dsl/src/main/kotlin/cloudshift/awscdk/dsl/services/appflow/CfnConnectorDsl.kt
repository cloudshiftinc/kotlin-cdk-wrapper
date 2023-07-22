@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appflow

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appflow.CfnConnector
import software.constructs.Construct

@CdkDslMarker
public class CfnConnectorDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnConnector.Builder = CfnConnector.Builder.create(scope, id)

  /**
   * The label used for registering the connector.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-connector.html#cfn-appflow-connector-connectorlabel)
   * @param connectorLabel The label used for registering the connector. 
   */
  public fun connectorLabel(connectorLabel: String) {
    cdkBuilder.connectorLabel(connectorLabel)
  }

  /**
   * The configuration required for registering the connector.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-connector.html#cfn-appflow-connector-connectorprovisioningconfig)
   * @param connectorProvisioningConfig The configuration required for registering the connector. 
   */
  public fun connectorProvisioningConfig(connectorProvisioningConfig: IResolvable) {
    cdkBuilder.connectorProvisioningConfig(connectorProvisioningConfig)
  }

  /**
   * The configuration required for registering the connector.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-connector.html#cfn-appflow-connector-connectorprovisioningconfig)
   * @param connectorProvisioningConfig The configuration required for registering the connector. 
   */
  public
      fun connectorProvisioningConfig(connectorProvisioningConfig: CfnConnector.ConnectorProvisioningConfigProperty) {
    cdkBuilder.connectorProvisioningConfig(connectorProvisioningConfig)
  }

  /**
   * The provisioning type used to register the connector.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-connector.html#cfn-appflow-connector-connectorprovisioningtype)
   * @param connectorProvisioningType The provisioning type used to register the connector. 
   */
  public fun connectorProvisioningType(connectorProvisioningType: String) {
    cdkBuilder.connectorProvisioningType(connectorProvisioningType)
  }

  /**
   * A description about the connector runtime setting.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-connector.html#cfn-appflow-connector-description)
   * @param description A description about the connector runtime setting. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun build(): CfnConnector = cdkBuilder.build()
}
