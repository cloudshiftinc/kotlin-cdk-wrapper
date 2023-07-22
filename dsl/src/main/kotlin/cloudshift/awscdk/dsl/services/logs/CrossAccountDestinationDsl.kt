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

  /**
   * The name of the log destination.
   *
   * Default: Automatically generated
   *
   * @param destinationName The name of the log destination. 
   */
  public fun destinationName(destinationName: String) {
    cdkBuilder.destinationName(destinationName)
  }

  /**
   * The role to assume that grants permissions to write to 'target'.
   *
   * The role must be assumable by 'logs.{REGION}.amazonaws.com'.
   *
   * @param role The role to assume that grants permissions to write to 'target'. 
   */
  public fun role(role: IRole) {
    cdkBuilder.role(role)
  }

  /**
   * The log destination target's ARN.
   *
   * @param targetArn The log destination target's ARN. 
   */
  public fun targetArn(targetArn: String) {
    cdkBuilder.targetArn(targetArn)
  }

  public fun build(): CrossAccountDestination = cdkBuilder.build()
}
