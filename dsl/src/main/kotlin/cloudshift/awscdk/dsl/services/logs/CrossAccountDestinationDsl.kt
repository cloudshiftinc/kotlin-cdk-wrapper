@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.logs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.logs.CrossAccountDestination
import software.constructs.Construct

@CdkDslMarker
public class CrossAccountDestinationDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CrossAccountDestination.Builder =
      CrossAccountDestination.Builder.create(scope, id)

  public fun destinationName(destinationName: String) {
    cdkBuilder.destinationName(destinationName)
  }

  public fun role(role: IRole) {
    cdkBuilder.role(role)
  }

  public fun targetArn(targetArn: String) {
    cdkBuilder.targetArn(targetArn)
  }

  public fun build(): CrossAccountDestination = cdkBuilder.build()
}
