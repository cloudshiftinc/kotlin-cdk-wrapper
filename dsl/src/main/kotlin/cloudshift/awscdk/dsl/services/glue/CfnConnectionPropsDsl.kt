@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.glue

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.glue.CfnConnection
import software.amazon.awscdk.services.glue.CfnConnectionProps

@CdkDslMarker
public class CfnConnectionPropsDsl {
  private val cdkBuilder: CfnConnectionProps.Builder = CfnConnectionProps.builder()

  /**
   * @param catalogId The ID of the data catalog to create the catalog object in. 
   * Currently, this should be the AWS account ID.
   *
   *
   * To specify the account ID, you can use the `Ref` intrinsic function with the `AWS::AccountId`
   * pseudo parameter. For example: `!Ref AWS::AccountId` .
   */
  public fun catalogId(catalogId: String) {
    cdkBuilder.catalogId(catalogId)
  }

  /**
   * @param connectionInput The connection that you want to create. 
   */
  public fun connectionInput(connectionInput: IResolvable) {
    cdkBuilder.connectionInput(connectionInput)
  }

  /**
   * @param connectionInput The connection that you want to create. 
   */
  public fun connectionInput(connectionInput: CfnConnection.ConnectionInputProperty) {
    cdkBuilder.connectionInput(connectionInput)
  }

  public fun build(): CfnConnectionProps = cdkBuilder.build()
}
