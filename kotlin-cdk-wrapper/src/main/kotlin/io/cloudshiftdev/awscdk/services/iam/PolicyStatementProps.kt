@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

/**
 * Interface for creating a policy statement.
 *
 * Example:
 *
 * ```
 * // Add gateway endpoints when creating the VPC
 * Vpc vpc = Vpc.Builder.create(this, "MyVpc")
 * .gatewayEndpoints(Map.of(
 * "S3", GatewayVpcEndpointOptions.builder()
 * .service(GatewayVpcEndpointAwsService.S3)
 * .build()))
 * .build();
 * // Alternatively gateway endpoints can be added on the VPC
 * GatewayVpcEndpoint dynamoDbEndpoint = vpc.addGatewayEndpoint("DynamoDbEndpoint",
 * GatewayVpcEndpointOptions.builder()
 * .service(GatewayVpcEndpointAwsService.DYNAMODB)
 * .build());
 * // This allows to customize the endpoint policy
 * dynamoDbEndpoint.addToPolicy(
 * PolicyStatement.Builder.create() // Restrict to listing and describing tables
 * .principals(List.of(new AnyPrincipal()))
 * .actions(List.of("dynamodb:DescribeTable", "dynamodb:ListTables"))
 * .resources(List.of("*")).build());
 * // Add an interface endpoint
 * vpc.addInterfaceEndpoint("EcrDockerEndpoint", InterfaceVpcEndpointOptions.builder()
 * .service(InterfaceVpcEndpointAwsService.ECR_DOCKER)
 * .build());
 * ```
 */
public interface PolicyStatementProps {
  /**
   * List of actions to add to the statement.
   *
   * Default: - no actions
   */
  public fun actions(): List<String> = unwrap(this).getActions() ?: emptyList()

  /**
   * Conditions to add to the statement.
   *
   * Default: - no condition
   */
  public fun conditions(): Map<String, Any> = unwrap(this).getConditions() ?: emptyMap()

  /**
   * Whether to allow or deny the actions in this statement.
   *
   * Default: Effect.ALLOW
   */
  public fun effect(): Effect? = unwrap(this).getEffect()?.let(Effect::wrap)

  /**
   * List of not actions to add to the statement.
   *
   * Default: - no not-actions
   */
  public fun notActions(): List<String> = unwrap(this).getNotActions() ?: emptyList()

  /**
   * List of not principals to add to the statement.
   *
   * Default: - no not principals
   */
  public fun notPrincipals(): List<IPrincipal> =
      unwrap(this).getNotPrincipals()?.map(IPrincipal::wrap) ?: emptyList()

  /**
   * NotResource ARNs to add to the statement.
   *
   * Default: - no not-resources
   */
  public fun notResources(): List<String> = unwrap(this).getNotResources() ?: emptyList()

  /**
   * List of principals to add to the statement.
   *
   * Default: - no principals
   */
  public fun principals(): List<IPrincipal> = unwrap(this).getPrincipals()?.map(IPrincipal::wrap) ?:
      emptyList()

  /**
   * Resource ARNs to add to the statement.
   *
   * Default: - no resources
   */
  public fun resources(): List<String> = unwrap(this).getResources() ?: emptyList()

  /**
   * The Sid (statement ID) is an optional identifier that you provide for the policy statement.
   *
   * You can assign a Sid value to each statement in a
   * statement array. In services that let you specify an ID element, such as
   * SQS and SNS, the Sid value is just a sub-ID of the policy document's ID. In
   * IAM, the Sid value must be unique within a JSON policy.
   *
   * Default: - no sid
   */
  public fun sid(): String? = unwrap(this).getSid()

  /**
   * A builder for [PolicyStatementProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param actions List of actions to add to the statement.
     */
    public fun actions(actions: List<String>)

    /**
     * @param actions List of actions to add to the statement.
     */
    public fun actions(vararg actions: String)

    /**
     * @param conditions Conditions to add to the statement.
     */
    public fun conditions(conditions: Map<String, Any>)

    /**
     * @param effect Whether to allow or deny the actions in this statement.
     */
    public fun effect(effect: Effect)

    /**
     * @param notActions List of not actions to add to the statement.
     */
    public fun notActions(notActions: List<String>)

    /**
     * @param notActions List of not actions to add to the statement.
     */
    public fun notActions(vararg notActions: String)

    /**
     * @param notPrincipals List of not principals to add to the statement.
     */
    public fun notPrincipals(notPrincipals: List<IPrincipal>)

    /**
     * @param notPrincipals List of not principals to add to the statement.
     */
    public fun notPrincipals(vararg notPrincipals: IPrincipal)

    /**
     * @param notResources NotResource ARNs to add to the statement.
     */
    public fun notResources(notResources: List<String>)

    /**
     * @param notResources NotResource ARNs to add to the statement.
     */
    public fun notResources(vararg notResources: String)

    /**
     * @param principals List of principals to add to the statement.
     */
    public fun principals(principals: List<IPrincipal>)

    /**
     * @param principals List of principals to add to the statement.
     */
    public fun principals(vararg principals: IPrincipal)

    /**
     * @param resources Resource ARNs to add to the statement.
     */
    public fun resources(resources: List<String>)

    /**
     * @param resources Resource ARNs to add to the statement.
     */
    public fun resources(vararg resources: String)

    /**
     * @param sid The Sid (statement ID) is an optional identifier that you provide for the policy
     * statement.
     * You can assign a Sid value to each statement in a
     * statement array. In services that let you specify an ID element, such as
     * SQS and SNS, the Sid value is just a sub-ID of the policy document's ID. In
     * IAM, the Sid value must be unique within a JSON policy.
     */
    public fun sid(sid: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iam.PolicyStatementProps.Builder =
        software.amazon.awscdk.services.iam.PolicyStatementProps.builder()

    /**
     * @param actions List of actions to add to the statement.
     */
    override fun actions(actions: List<String>) {
      cdkBuilder.actions(actions)
    }

    /**
     * @param actions List of actions to add to the statement.
     */
    override fun actions(vararg actions: String): Unit = actions(actions.toList())

    /**
     * @param conditions Conditions to add to the statement.
     */
    override fun conditions(conditions: Map<String, Any>) {
      cdkBuilder.conditions(conditions)
    }

    /**
     * @param effect Whether to allow or deny the actions in this statement.
     */
    override fun effect(effect: Effect) {
      cdkBuilder.effect(effect.let(Effect::unwrap))
    }

    /**
     * @param notActions List of not actions to add to the statement.
     */
    override fun notActions(notActions: List<String>) {
      cdkBuilder.notActions(notActions)
    }

    /**
     * @param notActions List of not actions to add to the statement.
     */
    override fun notActions(vararg notActions: String): Unit = notActions(notActions.toList())

    /**
     * @param notPrincipals List of not principals to add to the statement.
     */
    override fun notPrincipals(notPrincipals: List<IPrincipal>) {
      cdkBuilder.notPrincipals(notPrincipals.map(IPrincipal::unwrap))
    }

    /**
     * @param notPrincipals List of not principals to add to the statement.
     */
    override fun notPrincipals(vararg notPrincipals: IPrincipal): Unit =
        notPrincipals(notPrincipals.toList())

    /**
     * @param notResources NotResource ARNs to add to the statement.
     */
    override fun notResources(notResources: List<String>) {
      cdkBuilder.notResources(notResources)
    }

    /**
     * @param notResources NotResource ARNs to add to the statement.
     */
    override fun notResources(vararg notResources: String): Unit =
        notResources(notResources.toList())

    /**
     * @param principals List of principals to add to the statement.
     */
    override fun principals(principals: List<IPrincipal>) {
      cdkBuilder.principals(principals.map(IPrincipal::unwrap))
    }

    /**
     * @param principals List of principals to add to the statement.
     */
    override fun principals(vararg principals: IPrincipal): Unit = principals(principals.toList())

    /**
     * @param resources Resource ARNs to add to the statement.
     */
    override fun resources(resources: List<String>) {
      cdkBuilder.resources(resources)
    }

    /**
     * @param resources Resource ARNs to add to the statement.
     */
    override fun resources(vararg resources: String): Unit = resources(resources.toList())

    /**
     * @param sid The Sid (statement ID) is an optional identifier that you provide for the policy
     * statement.
     * You can assign a Sid value to each statement in a
     * statement array. In services that let you specify an ID element, such as
     * SQS and SNS, the Sid value is just a sub-ID of the policy document's ID. In
     * IAM, the Sid value must be unique within a JSON policy.
     */
    override fun sid(sid: String) {
      cdkBuilder.sid(sid)
    }

    public fun build(): software.amazon.awscdk.services.iam.PolicyStatementProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iam.PolicyStatementProps,
  ) : CdkObject(cdkObject), PolicyStatementProps {
    /**
     * List of actions to add to the statement.
     *
     * Default: - no actions
     */
    override fun actions(): List<String> = unwrap(this).getActions() ?: emptyList()

    /**
     * Conditions to add to the statement.
     *
     * Default: - no condition
     */
    override fun conditions(): Map<String, Any> = unwrap(this).getConditions() ?: emptyMap()

    /**
     * Whether to allow or deny the actions in this statement.
     *
     * Default: Effect.ALLOW
     */
    override fun effect(): Effect? = unwrap(this).getEffect()?.let(Effect::wrap)

    /**
     * List of not actions to add to the statement.
     *
     * Default: - no not-actions
     */
    override fun notActions(): List<String> = unwrap(this).getNotActions() ?: emptyList()

    /**
     * List of not principals to add to the statement.
     *
     * Default: - no not principals
     */
    override fun notPrincipals(): List<IPrincipal> =
        unwrap(this).getNotPrincipals()?.map(IPrincipal::wrap) ?: emptyList()

    /**
     * NotResource ARNs to add to the statement.
     *
     * Default: - no not-resources
     */
    override fun notResources(): List<String> = unwrap(this).getNotResources() ?: emptyList()

    /**
     * List of principals to add to the statement.
     *
     * Default: - no principals
     */
    override fun principals(): List<IPrincipal> =
        unwrap(this).getPrincipals()?.map(IPrincipal::wrap) ?: emptyList()

    /**
     * Resource ARNs to add to the statement.
     *
     * Default: - no resources
     */
    override fun resources(): List<String> = unwrap(this).getResources() ?: emptyList()

    /**
     * The Sid (statement ID) is an optional identifier that you provide for the policy statement.
     *
     * You can assign a Sid value to each statement in a
     * statement array. In services that let you specify an ID element, such as
     * SQS and SNS, the Sid value is just a sub-ID of the policy document's ID. In
     * IAM, the Sid value must be unique within a JSON policy.
     *
     * Default: - no sid
     */
    override fun sid(): String? = unwrap(this).getSid()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): PolicyStatementProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.PolicyStatementProps):
        PolicyStatementProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: PolicyStatementProps):
        software.amazon.awscdk.services.iam.PolicyStatementProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.iam.PolicyStatementProps
  }
}
