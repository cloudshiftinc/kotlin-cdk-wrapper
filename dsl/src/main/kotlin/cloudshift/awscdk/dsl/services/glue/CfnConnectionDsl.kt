@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.glue

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.glue.CfnConnection
import software.constructs.Construct

@CdkDslMarker
public class CfnConnectionDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnConnection.Builder = CfnConnection.Builder.create(scope, id)

  /**
   * The ID of the data catalog to create the catalog object in.
   *
   * Currently, this should be the AWS account ID.
   *
   *
   * To specify the account ID, you can use the `Ref` intrinsic function with the `AWS::AccountId`
   * pseudo parameter. For example: `!Ref AWS::AccountId` .
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-connection.html#cfn-glue-connection-catalogid)
   * @param catalogId The ID of the data catalog to create the catalog object in. 
   */
  public fun catalogId(catalogId: String) {
    cdkBuilder.catalogId(catalogId)
  }

  /**
   * The connection that you want to create.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-connection.html#cfn-glue-connection-connectioninput)
   * @param connectionInput The connection that you want to create. 
   */
  public fun connectionInput(connectionInput: IResolvable) {
    cdkBuilder.connectionInput(connectionInput)
  }

  /**
   * The connection that you want to create.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-connection.html#cfn-glue-connection-connectioninput)
   * @param connectionInput The connection that you want to create. 
   */
  public fun connectionInput(connectionInput: CfnConnection.ConnectionInputProperty) {
    cdkBuilder.connectionInput(connectionInput)
  }

  public fun build(): CfnConnection = cdkBuilder.build()
}
