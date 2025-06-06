@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

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
public interface InstanceProfileProps {
  /**
   * The name of the InstanceProfile to create.
   *
   * Default: - generated by CloudFormation
   */
  public fun instanceProfileName(): String? = unwrap(this).getInstanceProfileName()

  /**
   * The path to the InstanceProfile.
   *
   * Default: /
   */
  public fun path(): String? = unwrap(this).getPath()

  /**
   * An IAM role to associate with the instance profile that is used by EC2 instances.
   *
   * The role must be assumable by the service principal `ec2.amazonaws.com`:
   *
   * Default: - a role will be automatically created, it can be accessed via the `role` property
   *
   * Example:
   *
   * ```
   * Role role = Role.Builder.create(this, "MyRole")
   * .assumedBy(new ServicePrincipal("ec2.amazonaws.com"))
   * .build();
   * ```
   */
  public fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

  /**
   * A builder for [InstanceProfileProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param instanceProfileName The name of the InstanceProfile to create.
     */
    public fun instanceProfileName(instanceProfileName: String)

    /**
     * @param path The path to the InstanceProfile.
     */
    public fun path(path: String)

    /**
     * @param role An IAM role to associate with the instance profile that is used by EC2 instances.
     * The role must be assumable by the service principal `ec2.amazonaws.com`:
     */
    public fun role(role: IRole)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iam.InstanceProfileProps.Builder =
        software.amazon.awscdk.services.iam.InstanceProfileProps.builder()

    /**
     * @param instanceProfileName The name of the InstanceProfile to create.
     */
    override fun instanceProfileName(instanceProfileName: String) {
      cdkBuilder.instanceProfileName(instanceProfileName)
    }

    /**
     * @param path The path to the InstanceProfile.
     */
    override fun path(path: String) {
      cdkBuilder.path(path)
    }

    /**
     * @param role An IAM role to associate with the instance profile that is used by EC2 instances.
     * The role must be assumable by the service principal `ec2.amazonaws.com`:
     */
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.iam.InstanceProfileProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.iam.InstanceProfileProps,
  ) : CdkObject(cdkObject),
      InstanceProfileProps {
    /**
     * The name of the InstanceProfile to create.
     *
     * Default: - generated by CloudFormation
     */
    override fun instanceProfileName(): String? = unwrap(this).getInstanceProfileName()

    /**
     * The path to the InstanceProfile.
     *
     * Default: /
     */
    override fun path(): String? = unwrap(this).getPath()

    /**
     * An IAM role to associate with the instance profile that is used by EC2 instances.
     *
     * The role must be assumable by the service principal `ec2.amazonaws.com`:
     *
     * Default: - a role will be automatically created, it can be accessed via the `role` property
     *
     * Example:
     *
     * ```
     * Role role = Role.Builder.create(this, "MyRole")
     * .assumedBy(new ServicePrincipal("ec2.amazonaws.com"))
     * .build();
     * ```
     */
    override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): InstanceProfileProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.InstanceProfileProps):
        InstanceProfileProps = CdkObjectWrappers.wrap(cdkObject) as? InstanceProfileProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: InstanceProfileProps):
        software.amazon.awscdk.services.iam.InstanceProfileProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.iam.InstanceProfileProps
  }
}
