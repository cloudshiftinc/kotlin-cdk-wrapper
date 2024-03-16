@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

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
public interface InstanceProfileAttributes {
  /**
   * The ARN of the InstanceProfile.
   *
   * Format: arn:<partition>:iam::<account-id>:instance-profile/<instance-profile-name-with-path>
   */
  public fun instanceProfileArn(): String

  /**
   * The role associated with the InstanceProfile.
   *
   * Default: - no role
   */
  public fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

  /**
   * A builder for [InstanceProfileAttributes]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param instanceProfileArn The ARN of the InstanceProfile. 
     * Format: arn:<partition>:iam::<account-id>:instance-profile/<instance-profile-name-with-path>
     */
    public fun instanceProfileArn(instanceProfileArn: String)

    /**
     * @param role The role associated with the InstanceProfile.
     */
    public fun role(role: IRole)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iam.InstanceProfileAttributes.Builder =
        software.amazon.awscdk.services.iam.InstanceProfileAttributes.builder()

    /**
     * @param instanceProfileArn The ARN of the InstanceProfile. 
     * Format: arn:<partition>:iam::<account-id>:instance-profile/<instance-profile-name-with-path>
     */
    override fun instanceProfileArn(instanceProfileArn: String) {
      cdkBuilder.instanceProfileArn(instanceProfileArn)
    }

    /**
     * @param role The role associated with the InstanceProfile.
     */
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.iam.InstanceProfileAttributes =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iam.InstanceProfileAttributes,
  ) : CdkObject(cdkObject), InstanceProfileAttributes {
    /**
     * The ARN of the InstanceProfile.
     *
     * Format: arn:<partition>:iam::<account-id>:instance-profile/<instance-profile-name-with-path>
     */
    override fun instanceProfileArn(): String = unwrap(this).getInstanceProfileArn()

    /**
     * The role associated with the InstanceProfile.
     *
     * Default: - no role
     */
    override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): InstanceProfileAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.InstanceProfileAttributes):
        InstanceProfileAttributes = CdkObjectWrappers.wrap(cdkObject) as InstanceProfileAttributes

    internal fun unwrap(wrapped: InstanceProfileAttributes):
        software.amazon.awscdk.services.iam.InstanceProfileAttributes = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.iam.InstanceProfileAttributes
  }
}
