@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appflow

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appflow.CfnConnectorProfile
import software.amazon.awscdk.services.appflow.CfnConnectorProfileProps

@CdkDslMarker
public class CfnConnectorProfilePropsDsl {
  private val cdkBuilder: CfnConnectorProfileProps.Builder = CfnConnectorProfileProps.builder()

  /**
   * @param connectionMode Indicates the connection mode and if it is public or private. 
   */
  public fun connectionMode(connectionMode: String) {
    cdkBuilder.connectionMode(connectionMode)
  }

  /**
   * @param connectorLabel The label for the connector profile being created.
   */
  public fun connectorLabel(connectorLabel: String) {
    cdkBuilder.connectorLabel(connectorLabel)
  }

  /**
   * @param connectorProfileConfig Defines the connector-specific configuration and credentials.
   */
  public fun connectorProfileConfig(connectorProfileConfig: IResolvable) {
    cdkBuilder.connectorProfileConfig(connectorProfileConfig)
  }

  /**
   * @param connectorProfileConfig Defines the connector-specific configuration and credentials.
   */
  public
      fun connectorProfileConfig(connectorProfileConfig: CfnConnectorProfile.ConnectorProfileConfigProperty) {
    cdkBuilder.connectorProfileConfig(connectorProfileConfig)
  }

  /**
   * @param connectorProfileName The name of the connector profile. 
   * The name is unique for each `ConnectorProfile` in the AWS account .
   */
  public fun connectorProfileName(connectorProfileName: String) {
    cdkBuilder.connectorProfileName(connectorProfileName)
  }

  /**
   * @param connectorType The type of connector, such as Salesforce, Amplitude, and so on. 
   */
  public fun connectorType(connectorType: String) {
    cdkBuilder.connectorType(connectorType)
  }

  /**
   * @param kmsArn The ARN (Amazon Resource Name) of the Key Management Service (KMS) key you
   * provide for encryption.
   * This is required if you do not want to use the Amazon AppFlow-managed KMS key. If you don't
   * provide anything here, Amazon AppFlow uses the Amazon AppFlow-managed KMS key.
   */
  public fun kmsArn(kmsArn: String) {
    cdkBuilder.kmsArn(kmsArn)
  }

  public fun build(): CfnConnectorProfileProps = cdkBuilder.build()
}
