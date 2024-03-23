@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.constructs.IConstruct
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

/**
 * Options for a grant operation that only applies to principals.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iam.*;
 * import software.constructs.*;
 * Object conditions;
 * Construct construct;
 * IGrantable grantable;
 * GrantOnPrincipalOptions grantOnPrincipalOptions = GrantOnPrincipalOptions.builder()
 * .actions(List.of("actions"))
 * .grantee(grantable)
 * .resourceArns(List.of("resourceArns"))
 * // the properties below are optional
 * .conditions(Map.of(
 * "conditionsKey", Map.of(
 * "conditionsKey", conditions)))
 * .scope(construct)
 * .build();
 * ```
 */
public interface GrantOnPrincipalOptions : CommonGrantOptions {
  /**
   * Construct to report warnings on in case grant could not be registered.
   *
   * Default: - the construct in which this construct is defined
   */
  public fun scope(): IConstruct? = unwrap(this).getScope()?.let(IConstruct::wrap)

  /**
   * A builder for [GrantOnPrincipalOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param actions The actions to grant. 
     */
    public fun actions(actions: List<String>)

    /**
     * @param actions The actions to grant. 
     */
    public fun actions(vararg actions: String)

    /**
     * @param conditions Any conditions to attach to the grant.
     */
    public fun conditions(conditions: Map<String, Map<String, Any>>)

    /**
     * @param grantee The principal to grant to. 
     */
    public fun grantee(grantee: IGrantable)

    /**
     * @param resourceArns The resource ARNs to grant to. 
     */
    public fun resourceArns(resourceArns: List<String>)

    /**
     * @param resourceArns The resource ARNs to grant to. 
     */
    public fun resourceArns(vararg resourceArns: String)

    /**
     * @param scope Construct to report warnings on in case grant could not be registered.
     */
    public fun scope(scope: IConstruct)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iam.GrantOnPrincipalOptions.Builder =
        software.amazon.awscdk.services.iam.GrantOnPrincipalOptions.builder()

    /**
     * @param actions The actions to grant. 
     */
    override fun actions(actions: List<String>) {
      cdkBuilder.actions(actions)
    }

    /**
     * @param actions The actions to grant. 
     */
    override fun actions(vararg actions: String): Unit = actions(actions.toList())

    /**
     * @param conditions Any conditions to attach to the grant.
     */
    override fun conditions(conditions: Map<String, Map<String, Any>>) {
      cdkBuilder.conditions(conditions)
    }

    /**
     * @param grantee The principal to grant to. 
     */
    override fun grantee(grantee: IGrantable) {
      cdkBuilder.grantee(grantee.let(IGrantable::unwrap))
    }

    /**
     * @param resourceArns The resource ARNs to grant to. 
     */
    override fun resourceArns(resourceArns: List<String>) {
      cdkBuilder.resourceArns(resourceArns)
    }

    /**
     * @param resourceArns The resource ARNs to grant to. 
     */
    override fun resourceArns(vararg resourceArns: String): Unit =
        resourceArns(resourceArns.toList())

    /**
     * @param scope Construct to report warnings on in case grant could not be registered.
     */
    override fun scope(scope: IConstruct) {
      cdkBuilder.scope(scope.let(IConstruct::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.iam.GrantOnPrincipalOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.iam.GrantOnPrincipalOptions,
  ) : CdkObject(cdkObject), GrantOnPrincipalOptions {
    /**
     * The actions to grant.
     */
    override fun actions(): List<String> = unwrap(this).getActions()

    /**
     * Any conditions to attach to the grant.
     *
     * Default: - No conditions
     */
    override fun conditions(): Map<String, Map<String, Any>> = unwrap(this).getConditions() ?:
        emptyMap()

    /**
     * The principal to grant to.
     *
     * Default: if principal is undefined, no work is done.
     */
    override fun grantee(): IGrantable = unwrap(this).getGrantee().let(IGrantable::wrap)

    /**
     * The resource ARNs to grant to.
     */
    override fun resourceArns(): List<String> = unwrap(this).getResourceArns()

    /**
     * Construct to report warnings on in case grant could not be registered.
     *
     * Default: - the construct in which this construct is defined
     */
    override fun scope(): IConstruct? = unwrap(this).getScope()?.let(IConstruct::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): GrantOnPrincipalOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.GrantOnPrincipalOptions):
        GrantOnPrincipalOptions = CdkObjectWrappers.wrap(cdkObject) as? GrantOnPrincipalOptions ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: GrantOnPrincipalOptions):
        software.amazon.awscdk.services.iam.GrantOnPrincipalOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.iam.GrantOnPrincipalOptions
  }
}
