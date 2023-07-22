@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.iam.InstanceProfileAttributes

/**
 * Attributes of an Instance Profile.
 *
 * Example:
 *
 * ```
 * Role role = Role.Builder.create(this, "Role")
 * .assumedBy(new ServicePrincipal("ec2.amazonaws.com"))
 * .build();
 * IInstanceProfile instanceProfile = InstanceProfile.fromInstanceProfileAttributes(this,
 * "ImportedInstanceProfile", InstanceProfileAttributes.builder()
 * .instanceProfileArn("arn:aws:iam::account-id:instance-profile/MyInstanceProfile")
 * .role(role)
 * .build());
 * ```
 */
@CdkDslMarker
public class InstanceProfileAttributesDsl {
  private val cdkBuilder: InstanceProfileAttributes.Builder = InstanceProfileAttributes.builder()

  /**
   * @param instanceProfileArn The ARN of the InstanceProfile. 
   * Format: arn:<partition>:iam::<account-id>:instance-profile/<instance-profile-name-with-path>
   */
  public fun instanceProfileArn(instanceProfileArn: String) {
    cdkBuilder.instanceProfileArn(instanceProfileArn)
  }

  /**
   * @param role The role associated with the InstanceProfile.
   */
  public fun role(role: IRole) {
    cdkBuilder.role(role)
  }

  public fun build(): InstanceProfileAttributes = cdkBuilder.build()
}
