@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appflow

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appflow.CfnConnector
import software.constructs.Construct

/**
 * Creates a new connector profile associated with your AWS account .
 *
 * There is a soft quota of 100 connector profiles per AWS account . If you need more connector
 * profiles than this quota allows, you can submit a request to the Amazon AppFlow team through the
 * Amazon AppFlow support channel. In each connector profile that you create, you can provide the
 * credentials and properties for only one connector.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appflow.*;
 * CfnConnector cfnConnector = CfnConnector.Builder.create(this, "MyCfnConnector")
 * .connectorProvisioningConfig(ConnectorProvisioningConfigProperty.builder()
 * .lambda(LambdaConnectorProvisioningConfigProperty.builder()
 * .lambdaArn("lambdaArn")
 * .build())
 * .build())
 * .connectorProvisioningType("connectorProvisioningType")
 * // the properties below are optional
 * .connectorLabel("connectorLabel")
 * .description("description")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-connector.html)
 */
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
