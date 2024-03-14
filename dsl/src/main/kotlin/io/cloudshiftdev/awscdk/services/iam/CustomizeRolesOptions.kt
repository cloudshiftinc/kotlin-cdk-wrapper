package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface CustomizeRolesOptions {
  /**
   * Whether or not to synthesize the resource into the CFN template.
   *
   * Set this to `false` if you still want to create the resources *and*
   * you also want to create the policy report.
   *
   * Default: true
   */
  public fun preventSynthesis(): Boolean? = unwrap(this).getPreventSynthesis()

  /**
   * A list of precreated IAM roles to substitute for roles that CDK is creating.
   *
   * The constructPath can be either a relative or absolute path
   * from the scope that `customizeRoles` is used on to the role being created.
   *
   * Default: - there are no precreated roles. Synthesis will fail if `preventSynthesis=true`
   *
   * Example:
   *
   * ```
   * App app;
   * Stack stack = new Stack(app, "MyStack");
   * Role.Builder.create(stack, "MyRole")
   * .assumedBy(new AccountPrincipal("1111111111"))
   * .build();
   * Role.customizeRoles(stack, CustomizeRolesOptions.builder()
   * .usePrecreatedRoles(Map.of(
   * // absolute path
   * "MyStack/MyRole", "my-precreated-role-name",
   * // or relative path from `stack`
   * "MyRole", "my-precreated-role"))
   * .build());
   * ```
   */
  public fun usePrecreatedRoles(): Map<String, String> = unwrap(this).getUsePrecreatedRoles() ?:
      emptyMap()

  /**
   * A builder for [CustomizeRolesOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param preventSynthesis Whether or not to synthesize the resource into the CFN template.
     * Set this to `false` if you still want to create the resources *and*
     * you also want to create the policy report.
     */
    public fun preventSynthesis(preventSynthesis: Boolean)

    /**
     * @param usePrecreatedRoles A list of precreated IAM roles to substitute for roles that CDK is
     * creating.
     * The constructPath can be either a relative or absolute path
     * from the scope that `customizeRoles` is used on to the role being created.
     */
    public fun usePrecreatedRoles(usePrecreatedRoles: Map<String, String>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iam.CustomizeRolesOptions.Builder =
        software.amazon.awscdk.services.iam.CustomizeRolesOptions.builder()

    /**
     * @param preventSynthesis Whether or not to synthesize the resource into the CFN template.
     * Set this to `false` if you still want to create the resources *and*
     * you also want to create the policy report.
     */
    override fun preventSynthesis(preventSynthesis: Boolean) {
      cdkBuilder.preventSynthesis(preventSynthesis)
    }

    /**
     * @param usePrecreatedRoles A list of precreated IAM roles to substitute for roles that CDK is
     * creating.
     * The constructPath can be either a relative or absolute path
     * from the scope that `customizeRoles` is used on to the role being created.
     */
    override fun usePrecreatedRoles(usePrecreatedRoles: Map<String, String>) {
      cdkBuilder.usePrecreatedRoles(usePrecreatedRoles)
    }

    public fun build(): software.amazon.awscdk.services.iam.CustomizeRolesOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iam.CustomizeRolesOptions,
  ) : CdkObject(cdkObject), CustomizeRolesOptions {
    /**
     * Whether or not to synthesize the resource into the CFN template.
     *
     * Set this to `false` if you still want to create the resources *and*
     * you also want to create the policy report.
     *
     * Default: true
     */
    override fun preventSynthesis(): Boolean? = unwrap(this).getPreventSynthesis()

    /**
     * A list of precreated IAM roles to substitute for roles that CDK is creating.
     *
     * The constructPath can be either a relative or absolute path
     * from the scope that `customizeRoles` is used on to the role being created.
     *
     * Default: - there are no precreated roles. Synthesis will fail if `preventSynthesis=true`
     *
     * Example:
     *
     * ```
     * App app;
     * Stack stack = new Stack(app, "MyStack");
     * Role.Builder.create(stack, "MyRole")
     * .assumedBy(new AccountPrincipal("1111111111"))
     * .build();
     * Role.customizeRoles(stack, CustomizeRolesOptions.builder()
     * .usePrecreatedRoles(Map.of(
     * // absolute path
     * "MyStack/MyRole", "my-precreated-role-name",
     * // or relative path from `stack`
     * "MyRole", "my-precreated-role"))
     * .build());
     * ```
     */
    override fun usePrecreatedRoles(): Map<String, String> = unwrap(this).getUsePrecreatedRoles() ?:
        emptyMap()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CustomizeRolesOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.CustomizeRolesOptions):
        CustomizeRolesOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CustomizeRolesOptions):
        software.amazon.awscdk.services.iam.CustomizeRolesOptions = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.iam.CustomizeRolesOptions
  }
}
