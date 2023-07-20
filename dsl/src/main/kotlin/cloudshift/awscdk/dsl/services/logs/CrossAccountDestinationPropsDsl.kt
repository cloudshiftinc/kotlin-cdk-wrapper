@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.logs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.logs.CrossAccountDestinationProps

@CdkDslMarker
public class CrossAccountDestinationPropsDsl {
  private val cdkBuilder: CrossAccountDestinationProps.Builder =
      CrossAccountDestinationProps.builder()

  public fun destinationName(destinationName: String) {
    cdkBuilder.destinationName(destinationName)
  }

  public fun role(role: IRole) {
    cdkBuilder.role(role)
  }

  public fun targetArn(targetArn: String) {
    cdkBuilder.targetArn(targetArn)
  }

  public fun build(): CrossAccountDestinationProps = cdkBuilder.build()
}
