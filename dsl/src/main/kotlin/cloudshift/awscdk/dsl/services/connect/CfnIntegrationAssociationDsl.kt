@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.connect

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.connect.CfnIntegrationAssociation
import software.constructs.Construct

/**
 * Specifies the association of an AWS resource such as Lex bot (both v1 and v2) and Lambda function
 * with an Amazon Connect instance.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.connect.*;
 * CfnIntegrationAssociation cfnIntegrationAssociation =
 * CfnIntegrationAssociation.Builder.create(this, "MyCfnIntegrationAssociation")
 * .instanceId("instanceId")
 * .integrationArn("integrationArn")
 * .integrationType("integrationType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-integrationassociation.html)
 */
@CdkDslMarker
public class CfnIntegrationAssociationDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnIntegrationAssociation.Builder =
      CfnIntegrationAssociation.Builder.create(scope, id)

  /**
   * The Amazon Resource Name (ARN) of the instance.
   *
   * *Minimum* : `1`
   *
   * *Maximum* : `100`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-integrationassociation.html#cfn-connect-integrationassociation-instanceid)
   * @param instanceId The Amazon Resource Name (ARN) of the instance. 
   */
  public fun instanceId(instanceId: String) {
    cdkBuilder.instanceId(instanceId)
  }

  /**
   * ARN of the integration being associated with the instance.
   *
   * *Minimum* : `1`
   *
   * *Maximum* : `140`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-integrationassociation.html#cfn-connect-integrationassociation-integrationarn)
   * @param integrationArn ARN of the integration being associated with the instance. 
   */
  public fun integrationArn(integrationArn: String) {
    cdkBuilder.integrationArn(integrationArn)
  }

  /**
   * Specifies the integration type to be associated with the instance.
   *
   * *Allowed Values* : `LEX_BOT` | `LAMBDA_FUNCTION`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-integrationassociation.html#cfn-connect-integrationassociation-integrationtype)
   * @param integrationType Specifies the integration type to be associated with the instance. 
   */
  public fun integrationType(integrationType: String) {
    cdkBuilder.integrationType(integrationType)
  }

  public fun build(): CfnIntegrationAssociation = cdkBuilder.build()
}
