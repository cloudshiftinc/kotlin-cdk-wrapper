@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.logs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.logs.CrossAccountDestinationProps

/**
 * Properties for a CrossAccountDestination.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iam.*;
 * import software.amazon.awscdk.services.logs.*;
 * Role role;
 * CrossAccountDestinationProps crossAccountDestinationProps =
 * CrossAccountDestinationProps.builder()
 * .role(role)
 * .targetArn("targetArn")
 * // the properties below are optional
 * .destinationName("destinationName")
 * .build();
 * ```
 */
@CdkDslMarker
public class CrossAccountDestinationPropsDsl {
  private val cdkBuilder: CrossAccountDestinationProps.Builder =
      CrossAccountDestinationProps.builder()

  /**
   * @param destinationName The name of the log destination.
   */
  public fun destinationName(destinationName: String) {
    cdkBuilder.destinationName(destinationName)
  }

  /**
   * @param role The role to assume that grants permissions to write to 'target'. 
   * The role must be assumable by 'logs.{REGION}.amazonaws.com'.
   */
  public fun role(role: IRole) {
    cdkBuilder.role(role)
  }

  /**
   * @param targetArn The log destination target's ARN. 
   */
  public fun targetArn(targetArn: String) {
    cdkBuilder.targetArn(targetArn)
  }

  public fun build(): CrossAccountDestinationProps = cdkBuilder.build()
}
