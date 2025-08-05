@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * Options for a grant operation that directly adds a policy statement to a resource.
 *
 * This differs from GrantWithResourceOptions in that it requires a pre-constructed
 * PolicyStatement rather than constructing one from individual permissions.
 * Use this when you need fine-grained control over the initial policy statement's contents.
 *
 * Example:
 *
 * ```
 * IGrantable grantee;
 * String[] actions;
 * String[] resourceArns;
 * Bucket bucket;
 * PolicyStatement statement = PolicyStatement.Builder.create()
 * .effect(Effect.ALLOW)
 * .actions(actions)
 * .principals(List.of(new ServicePrincipal("lambda.amazonaws.com")))
 * .conditions(Map.of(
 * "StringEquals", Map.of(
 * "aws:SourceAccount", Stack.of(this).getAccount())))
 * .build();
 * Grant.addStatementToResourcePolicy(GrantPolicyWithResourceOptions.builder()
 * .grantee(grantee)
 * .actions(actions)
 * .resourceArns(resourceArns)
 * .resource(bucket)
 * .statement(statement)
 * .build());
 * ```
 */
public interface GrantPolicyWithResourceOptions : GrantWithResourceOptions {
  /**
   * The policy statement to add to the resource's policy.
   *
   * This statement will be passed to the resource's addToResourcePolicy method.
   * The actual handling of the statement depends on the specific IResourceWithPolicy
   * implementation.
   */
  public fun statement(): PolicyStatement

  /**
   * A builder for [GrantPolicyWithResourceOptions]
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
     * @param resource The resource with a resource policy. 
     * The statement will be added to the resource policy if it couldn't be
     * added to the principal policy.
     */
    public fun resource(resource: IResourceWithPolicy)

    /**
     * @param resourceArns The resource ARNs to grant to. 
     */
    public fun resourceArns(resourceArns: List<String>)

    /**
     * @param resourceArns The resource ARNs to grant to. 
     */
    public fun resourceArns(vararg resourceArns: String)

    /**
     * @param resourceSelfArns When referring to the resource in a resource policy, use this as ARN.
     * (Depending on the resource type, this needs to be '*' in a resource policy).
     */
    public fun resourceSelfArns(resourceSelfArns: List<String>)

    /**
     * @param resourceSelfArns When referring to the resource in a resource policy, use this as ARN.
     * (Depending on the resource type, this needs to be '*' in a resource policy).
     */
    public fun resourceSelfArns(vararg resourceSelfArns: String)

    /**
     * @param statement The policy statement to add to the resource's policy. 
     * This statement will be passed to the resource's addToResourcePolicy method.
     * The actual handling of the statement depends on the specific IResourceWithPolicy
     * implementation.
     */
    public fun statement(statement: PolicyStatement)

    /**
     * @param statement The policy statement to add to the resource's policy. 
     * This statement will be passed to the resource's addToResourcePolicy method.
     * The actual handling of the statement depends on the specific IResourceWithPolicy
     * implementation.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9477b93ec833b6c9a93275848591929b3cbc9c0dc413dde5a42e4d26d98d524b")
    public fun statement(statement: PolicyStatement.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.iam.GrantPolicyWithResourceOptions.Builder =
        software.amazon.awscdk.services.iam.GrantPolicyWithResourceOptions.builder()

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
      cdkBuilder.grantee(grantee.let(IGrantable.Companion::unwrap))
    }

    /**
     * @param resource The resource with a resource policy. 
     * The statement will be added to the resource policy if it couldn't be
     * added to the principal policy.
     */
    override fun resource(resource: IResourceWithPolicy) {
      cdkBuilder.resource(resource.let(IResourceWithPolicy.Companion::unwrap))
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
     * @param resourceSelfArns When referring to the resource in a resource policy, use this as ARN.
     * (Depending on the resource type, this needs to be '*' in a resource policy).
     */
    override fun resourceSelfArns(resourceSelfArns: List<String>) {
      cdkBuilder.resourceSelfArns(resourceSelfArns)
    }

    /**
     * @param resourceSelfArns When referring to the resource in a resource policy, use this as ARN.
     * (Depending on the resource type, this needs to be '*' in a resource policy).
     */
    override fun resourceSelfArns(vararg resourceSelfArns: String): Unit =
        resourceSelfArns(resourceSelfArns.toList())

    /**
     * @param statement The policy statement to add to the resource's policy. 
     * This statement will be passed to the resource's addToResourcePolicy method.
     * The actual handling of the statement depends on the specific IResourceWithPolicy
     * implementation.
     */
    override fun statement(statement: PolicyStatement) {
      cdkBuilder.statement(statement.let(PolicyStatement.Companion::unwrap))
    }

    /**
     * @param statement The policy statement to add to the resource's policy. 
     * This statement will be passed to the resource's addToResourcePolicy method.
     * The actual handling of the statement depends on the specific IResourceWithPolicy
     * implementation.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9477b93ec833b6c9a93275848591929b3cbc9c0dc413dde5a42e4d26d98d524b")
    override fun statement(statement: PolicyStatement.Builder.() -> Unit): Unit =
        statement(PolicyStatement(statement))

    public fun build(): software.amazon.awscdk.services.iam.GrantPolicyWithResourceOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.iam.GrantPolicyWithResourceOptions,
  ) : CdkObject(cdkObject),
      GrantPolicyWithResourceOptions {
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
     * The resource with a resource policy.
     *
     * The statement will be added to the resource policy if it couldn't be
     * added to the principal policy.
     */
    override fun resource(): IResourceWithPolicy =
        unwrap(this).getResource().let(IResourceWithPolicy::wrap)

    /**
     * The resource ARNs to grant to.
     */
    override fun resourceArns(): List<String> = unwrap(this).getResourceArns()

    /**
     * When referring to the resource in a resource policy, use this as ARN.
     *
     * (Depending on the resource type, this needs to be '*' in a resource policy).
     *
     * Default: Same as regular resource ARNs
     */
    override fun resourceSelfArns(): List<String> = unwrap(this).getResourceSelfArns() ?:
        emptyList()

    /**
     * The policy statement to add to the resource's policy.
     *
     * This statement will be passed to the resource's addToResourcePolicy method.
     * The actual handling of the statement depends on the specific IResourceWithPolicy
     * implementation.
     */
    override fun statement(): PolicyStatement =
        unwrap(this).getStatement().let(PolicyStatement::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): GrantPolicyWithResourceOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.iam.GrantPolicyWithResourceOptions):
        GrantPolicyWithResourceOptions = CdkObjectWrappers.wrap(cdkObject) as?
        GrantPolicyWithResourceOptions ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: GrantPolicyWithResourceOptions):
        software.amazon.awscdk.services.iam.GrantPolicyWithResourceOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.iam.GrantPolicyWithResourceOptions
  }
}
