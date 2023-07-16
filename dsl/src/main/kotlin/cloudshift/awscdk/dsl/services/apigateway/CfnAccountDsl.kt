@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.apigateway.CfnAccount
import software.constructs.Construct

@CdkDslMarker
public class CfnAccountDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnAccount.Builder = CfnAccount.Builder.create(scope, id)

  public fun cloudWatchRoleArn(cloudWatchRoleArn: String) {
    cdkBuilder.cloudWatchRoleArn(cloudWatchRoleArn)
  }

  public fun build(): CfnAccount = cdkBuilder.build()
}
