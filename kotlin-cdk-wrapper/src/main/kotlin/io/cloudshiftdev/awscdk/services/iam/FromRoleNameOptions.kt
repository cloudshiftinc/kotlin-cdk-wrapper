@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * Options allowing customizing the behavior of `Role.fromRoleName`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iam.*;
 * FromRoleNameOptions fromRoleNameOptions = FromRoleNameOptions.builder()
 * .addGrantsToResources(false)
 * .defaultPolicyName("defaultPolicyName")
 * .mutable(false)
 * .build();
 * ```
 */
public interface FromRoleNameOptions : FromRoleArnOptions {
  /**
   * A builder for [FromRoleNameOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param addGrantsToResources For immutable roles: add grants to resources instead of dropping
     * them.
     * If this is `false` or not specified, grant permissions added to this role are ignored.
     * It is your own responsibility to make sure the role has the required permissions.
     *
     * If this is `true`, any grant permissions will be added to the resource instead.
     */
    public fun addGrantsToResources(addGrantsToResources: Boolean)

    /**
     * @param defaultPolicyName Any policies created by this role will use this value as their ID,
     * if specified.
     * Specify this if importing the same role in multiple stacks, and granting it
     * different permissions in at least two stacks. If this is not specified
     * (or if the same name is specified in more than one stack),
     * a CloudFormation issue will result in the policy created in whichever stack
     * is deployed last overwriting the policies created by the others.
     */
    public fun defaultPolicyName(defaultPolicyName: String)

    /**
     * @param mutable Whether the imported role can be modified by attaching policy resources to it.
     */
    public fun mutable(mutable: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iam.FromRoleNameOptions.Builder =
        software.amazon.awscdk.services.iam.FromRoleNameOptions.builder()

    /**
     * @param addGrantsToResources For immutable roles: add grants to resources instead of dropping
     * them.
     * If this is `false` or not specified, grant permissions added to this role are ignored.
     * It is your own responsibility to make sure the role has the required permissions.
     *
     * If this is `true`, any grant permissions will be added to the resource instead.
     */
    override fun addGrantsToResources(addGrantsToResources: Boolean) {
      cdkBuilder.addGrantsToResources(addGrantsToResources)
    }

    /**
     * @param defaultPolicyName Any policies created by this role will use this value as their ID,
     * if specified.
     * Specify this if importing the same role in multiple stacks, and granting it
     * different permissions in at least two stacks. If this is not specified
     * (or if the same name is specified in more than one stack),
     * a CloudFormation issue will result in the policy created in whichever stack
     * is deployed last overwriting the policies created by the others.
     */
    override fun defaultPolicyName(defaultPolicyName: String) {
      cdkBuilder.defaultPolicyName(defaultPolicyName)
    }

    /**
     * @param mutable Whether the imported role can be modified by attaching policy resources to it.
     */
    override fun mutable(mutable: Boolean) {
      cdkBuilder.mutable(mutable)
    }

    public fun build(): software.amazon.awscdk.services.iam.FromRoleNameOptions = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iam.FromRoleNameOptions,
  ) : CdkObject(cdkObject), FromRoleNameOptions {
    /**
     * For immutable roles: add grants to resources instead of dropping them.
     *
     * If this is `false` or not specified, grant permissions added to this role are ignored.
     * It is your own responsibility to make sure the role has the required permissions.
     *
     * If this is `true`, any grant permissions will be added to the resource instead.
     *
     * Default: false
     */
    override fun addGrantsToResources(): Boolean? = unwrap(this).getAddGrantsToResources()

    /**
     * Any policies created by this role will use this value as their ID, if specified.
     *
     * Specify this if importing the same role in multiple stacks, and granting it
     * different permissions in at least two stacks. If this is not specified
     * (or if the same name is specified in more than one stack),
     * a CloudFormation issue will result in the policy created in whichever stack
     * is deployed last overwriting the policies created by the others.
     *
     * Default: 'Policy'
     */
    override fun defaultPolicyName(): String? = unwrap(this).getDefaultPolicyName()

    /**
     * Whether the imported role can be modified by attaching policy resources to it.
     *
     * Default: true
     */
    override fun mutable(): Boolean? = unwrap(this).getMutable()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): FromRoleNameOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.FromRoleNameOptions):
        FromRoleNameOptions = CdkObjectWrappers.wrap(cdkObject) as? FromRoleNameOptions ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: FromRoleNameOptions):
        software.amazon.awscdk.services.iam.FromRoleNameOptions = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.iam.FromRoleNameOptions
  }
}
