@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.iam.InstanceProfileProps

/**
 * Properties of an Instance Profile.
 *
 * Example:
 *
 * ```
 * Role role = Role.Builder.create(this, "Role")
 * .assumedBy(new ServicePrincipal("ec2.amazonaws.com"))
 * .build();
 * InstanceProfile instanceProfile = InstanceProfile.Builder.create(this, "InstanceProfile")
 * .role(role)
 * .instanceProfileName("MyInstanceProfile")
 * .path("/sample/path/")
 * .build();
 * ```
 */
@CdkDslMarker
public class InstanceProfilePropsDsl {
  private val cdkBuilder: InstanceProfileProps.Builder = InstanceProfileProps.builder()

  /**
   * @param instanceProfileName The name of the InstanceProfile to create.
   */
  public fun instanceProfileName(instanceProfileName: String) {
    cdkBuilder.instanceProfileName(instanceProfileName)
  }

  /**
   * @param path The path to the InstanceProfile.
   */
  public fun path(path: String) {
    cdkBuilder.path(path)
  }

  /**
   * @param role An IAM role to associate with the instance profile that is used by EC2 instances.
   * The role must be assumable by the service principal `ec2.amazonaws.com`:
   */
  public fun role(role: IRole) {
    cdkBuilder.role(role)
  }

  public fun build(): InstanceProfileProps = cdkBuilder.build()
}
