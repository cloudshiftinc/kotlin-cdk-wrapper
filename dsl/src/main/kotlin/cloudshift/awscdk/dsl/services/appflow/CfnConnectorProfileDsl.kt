@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appflow

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appflow.CfnConnectorProfile
import software.constructs.Construct

@CdkDslMarker
public class CfnConnectorProfileDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnConnectorProfile.Builder = CfnConnectorProfile.Builder.create(scope,
      id)

  /**
   * Indicates the connection mode and if it is public or private.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-connectorprofile.html#cfn-appflow-connectorprofile-connectionmode)
   * @param connectionMode Indicates the connection mode and if it is public or private. 
   */
  public fun connectionMode(connectionMode: String) {
    cdkBuilder.connectionMode(connectionMode)
  }

  /**
   * The label for the connector profile being created.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-connectorprofile.html#cfn-appflow-connectorprofile-connectorlabel)
   * @param connectorLabel The label for the connector profile being created. 
   */
  public fun connectorLabel(connectorLabel: String) {
    cdkBuilder.connectorLabel(connectorLabel)
  }

  /**
   * Defines the connector-specific configuration and credentials.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-connectorprofile.html#cfn-appflow-connectorprofile-connectorprofileconfig)
   * @param connectorProfileConfig Defines the connector-specific configuration and credentials. 
   */
  public fun connectorProfileConfig(connectorProfileConfig: IResolvable) {
    cdkBuilder.connectorProfileConfig(connectorProfileConfig)
  }

  /**
   * Defines the connector-specific configuration and credentials.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-connectorprofile.html#cfn-appflow-connectorprofile-connectorprofileconfig)
   * @param connectorProfileConfig Defines the connector-specific configuration and credentials. 
   */
  public
      fun connectorProfileConfig(connectorProfileConfig: CfnConnectorProfile.ConnectorProfileConfigProperty) {
    cdkBuilder.connectorProfileConfig(connectorProfileConfig)
  }

  /**
   * The name of the connector profile.
   *
   * The name is unique for each `ConnectorProfile` in the AWS account .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-connectorprofile.html#cfn-appflow-connectorprofile-connectorprofilename)
   * @param connectorProfileName The name of the connector profile. 
   */
  public fun connectorProfileName(connectorProfileName: String) {
    cdkBuilder.connectorProfileName(connectorProfileName)
  }

  /**
   * The type of connector, such as Salesforce, Amplitude, and so on.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-connectorprofile.html#cfn-appflow-connectorprofile-connectortype)
   * @param connectorType The type of connector, such as Salesforce, Amplitude, and so on. 
   */
  public fun connectorType(connectorType: String) {
    cdkBuilder.connectorType(connectorType)
  }

  /**
   * The ARN (Amazon Resource Name) of the Key Management Service (KMS) key you provide for
   * encryption.
   *
   * This is required if you do not want to use the Amazon AppFlow-managed KMS key. If you don't
   * provide anything here, Amazon AppFlow uses the Amazon AppFlow-managed KMS key.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-connectorprofile.html#cfn-appflow-connectorprofile-kmsarn)
   * @param kmsArn The ARN (Amazon Resource Name) of the Key Management Service (KMS) key you
   * provide for encryption. 
   */
  public fun kmsArn(kmsArn: String) {
    cdkBuilder.kmsArn(kmsArn)
  }

  public fun build(): CfnConnectorProfile = cdkBuilder.build()
}
