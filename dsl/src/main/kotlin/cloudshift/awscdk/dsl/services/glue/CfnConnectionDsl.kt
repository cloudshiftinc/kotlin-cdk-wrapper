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

  public fun catalogId(catalogId: String) {
    cdkBuilder.catalogId(catalogId)
  }

  public fun connectionInput(connectionInput: IResolvable) {
    cdkBuilder.connectionInput(connectionInput)
  }

  public fun connectionInput(connectionInput: CfnConnection.ConnectionInputProperty) {
    cdkBuilder.connectionInput(connectionInput)
  }

  public fun build(): CfnConnection = cdkBuilder.build()
}
