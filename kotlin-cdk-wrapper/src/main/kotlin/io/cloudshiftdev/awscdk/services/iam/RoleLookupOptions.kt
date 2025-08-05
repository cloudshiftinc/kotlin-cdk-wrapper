@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * Properties for looking up an existing Role.
 *
 * Example:
 *
 * ```
 * IRole role = Role.fromLookup(this, "Role", RoleLookupOptions.builder()
 * .roleName("MyExistingRole")
 * .build());
 * ```
 */
public interface RoleLookupOptions : FromRoleArnOptions {
  /**
   * The name of the role to lookup.
   *
   * If the role you want to lookup is a service role, you need to specify
   * the role name without the 'service-role' prefix. For example, if the role arn is
   * 'arn:aws:iam::123456789012:role/service-role/ExampleServiceExecutionRole',
   * you need to specify the role name as 'ExampleServiceExecutionRole'.
   */
  public fun roleName(): String

  /**
   * A builder for [RoleLookupOptions]
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

    /**
     * @param roleName The name of the role to lookup. 
     * If the role you want to lookup is a service role, you need to specify
     * the role name without the 'service-role' prefix. For example, if the role arn is
     * 'arn:aws:iam::123456789012:role/service-role/ExampleServiceExecutionRole',
     * you need to specify the role name as 'ExampleServiceExecutionRole'.
     */
    public fun roleName(roleName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iam.RoleLookupOptions.Builder =
        software.amazon.awscdk.services.iam.RoleLookupOptions.builder()

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

    /**
     * @param roleName The name of the role to lookup. 
     * If the role you want to lookup is a service role, you need to specify
     * the role name without the 'service-role' prefix. For example, if the role arn is
     * 'arn:aws:iam::123456789012:role/service-role/ExampleServiceExecutionRole',
     * you need to specify the role name as 'ExampleServiceExecutionRole'.
     */
    override fun roleName(roleName: String) {
      cdkBuilder.roleName(roleName)
    }

    public fun build(): software.amazon.awscdk.services.iam.RoleLookupOptions = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.iam.RoleLookupOptions,
  ) : CdkObject(cdkObject),
      RoleLookupOptions {
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

    /**
     * The name of the role to lookup.
     *
     * If the role you want to lookup is a service role, you need to specify
     * the role name without the 'service-role' prefix. For example, if the role arn is
     * 'arn:aws:iam::123456789012:role/service-role/ExampleServiceExecutionRole',
     * you need to specify the role name as 'ExampleServiceExecutionRole'.
     */
    override fun roleName(): String = unwrap(this).getRoleName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): RoleLookupOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.RoleLookupOptions):
        RoleLookupOptions = CdkObjectWrappers.wrap(cdkObject) as? RoleLookupOptions ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: RoleLookupOptions):
        software.amazon.awscdk.services.iam.RoleLookupOptions = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.iam.RoleLookupOptions
  }
}
