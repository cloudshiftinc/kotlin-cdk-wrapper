package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

public open class PolicyStatement internal constructor(
  private val cdkObject: software.amazon.awscdk.services.iam.PolicyStatement,
) {
  /**
   * The Actions added to this statement.
   */
  public open fun actions(): List<String> = unwrap(this).getActions()

  /**
   * Add a `StringEquals` condition that limits to a given account from `sts:ExternalId`.
   *
   * This method can only be called once: subsequent calls will overwrite earlier calls.
   *
   * [Documentation](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_create_for-user_externalid.html)
   * @param accountId 
   */
  public open fun addAccountCondition(accountId: String) {
    unwrap(this).addAccountCondition(accountId)
  }

  /**
   * Adds an AWS account root user principal to this policy statement.
   */
  public open fun addAccountRootPrincipal() {
    unwrap(this).addAccountRootPrincipal()
  }

  /**
   * Specify allowed actions into the "Action" section of the policy statement.
   *
   * [Documentation](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_action.html)
   * @param actions actions that will be allowed. 
   */
  public open fun addActions(actions: String) {
    unwrap(this).addActions(actions)
  }

  /**
   * Adds a `"*"` resource to this statement.
   */
  public open fun addAllResources() {
    unwrap(this).addAllResources()
  }

  /**
   * Adds all identities in all accounts ("*") to this policy statement.
   */
  public open fun addAnyPrincipal() {
    unwrap(this).addAnyPrincipal()
  }

  /**
   * Specify a principal using the ARN  identifier of the principal.
   *
   * You cannot specify IAM groups and instance profiles as principals.
   *
   * @param arn ARN identifier of AWS account, IAM user, or IAM role (i.e.
   * arn:aws:iam::123456789012:user/user-name). 
   */
  public open fun addArnPrincipal(arn: String) {
    unwrap(this).addArnPrincipal(arn)
  }

  /**
   * Specify AWS account ID as the principal entity to the "Principal" section of a policy
   * statement.
   *
   * @param accountId 
   */
  public open fun addAwsAccountPrincipal(accountId: String) {
    unwrap(this).addAwsAccountPrincipal(accountId)
  }

  /**
   * Adds a canonical user ID principal to this policy document.
   *
   * @param canonicalUserId unique identifier assigned by AWS for every account. 
   */
  public open fun addCanonicalUserPrincipal(canonicalUserId: String) {
    unwrap(this).addCanonicalUserPrincipal(canonicalUserId)
  }

  /**
   * Add a condition to the Policy.
   *
   * If multiple calls are made to add a condition with the same operator and field, only
   * the last one wins. For example:
   *
   * ```
   * PolicyStatement stmt;
   * stmt.addCondition("StringEquals", Map.of("aws:SomeField", "1"));
   * stmt.addCondition("StringEquals", Map.of("aws:SomeField", "2"));
   * ```
   *
   * Will end up with the single condition `StringEquals: { 'aws:SomeField': '2' }`.
   *
   * If you meant to add a condition to say that the field can be *either* `1` or `2`, write
   * this:
   *
   * ```
   * PolicyStatement stmt;
   * stmt.addCondition("StringEquals", Map.of("aws:SomeField", List.of("1", "2")));
   * ```
   *
   * @param key 
   * @param value 
   */
  public open fun addCondition(key: String, `value`: Any) {
    unwrap(this).addCondition(key, `value`)
  }

  /**
   * Add multiple conditions to the Policy.
   *
   * See the `addCondition` function for a caveat on calling this method multiple times.
   *
   * @param conditions 
   */
  public open fun addConditions(conditions: Map<String, Any>) {
    unwrap(this).addConditions(conditions)
  }

  /**
   * Adds a federated identity provider such as Amazon Cognito to this policy statement.
   *
   * @param federated federated identity provider (i.e. 'cognito-identity.amazonaws.com'). 
   * @param conditions The conditions under which the policy is in effect. 
   */
  public open fun addFederatedPrincipal(federated: Any, conditions: Map<String, Any>) {
    unwrap(this).addFederatedPrincipal(federated, conditions)
  }

  /**
   * Explicitly allow all actions except the specified list of actions into the "NotAction" section
   * of the policy document.
   *
   * [Documentation](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_notaction.html)
   * @param notActions actions that will be denied. 
   */
  public open fun addNotActions(notActions: String) {
    unwrap(this).addNotActions(notActions)
  }

  /**
   * Specify principals that is not allowed or denied access to the "NotPrincipal" section of a
   * policy statement.
   *
   * [Documentation](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_notprincipal.html)
   * @param notPrincipals IAM principals that will be denied access. 
   */
  public open fun addNotPrincipals(notPrincipals: IPrincipal) {
    unwrap(this).addNotPrincipals(notPrincipals.let(IPrincipal::unwrap))
  }

  /**
   * Specify resources that this policy statement will not apply to in the "NotResource" section of
   * this policy statement.
   *
   * All resources except the specified list will be matched.
   *
   * [Documentation](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_notresource.html)
   * @param arns Amazon Resource Names (ARNs) of the resources that this policy statement does not
   * apply to. 
   */
  public open fun addNotResources(arns: String) {
    unwrap(this).addNotResources(arns)
  }

  /**
   * Adds principals to the "Principal" section of a policy statement.
   *
   * [Documentation](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_principal.html)
   * @param principals IAM principals that will be added. 
   */
  public open fun addPrincipals(principals: IPrincipal) {
    unwrap(this).addPrincipals(principals.let(IPrincipal::unwrap))
  }

  /**
   * Specify resources that this policy statement applies into the "Resource" section of this policy
   * statement.
   *
   * [Documentation](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_resource.html)
   * @param arns Amazon Resource Names (ARNs) of the resources that this policy statement applies
   * to. 
   */
  public open fun addResources(arns: String) {
    unwrap(this).addResources(arns)
  }

  /**
   * Adds a service principal to this policy statement.
   *
   * @param service the service name for which a service principal is requested (e.g:
   * `s3.amazonaws.com`). 
   * @param opts options for adding the service principal (such as specifying a principal in a
   * different region).
   */
  public open fun addServicePrincipal(service: String) {
    unwrap(this).addServicePrincipal(service)
  }

  /**
   * Adds a service principal to this policy statement.
   *
   * @param service the service name for which a service principal is requested (e.g:
   * `s3.amazonaws.com`). 
   * @param opts options for adding the service principal (such as specifying a principal in a
   * different region).
   */
  public open fun addServicePrincipal(service: String, opts: ServicePrincipalOpts) {
    unwrap(this).addServicePrincipal(service, opts.let(ServicePrincipalOpts::unwrap))
  }

  /**
   * Adds a service principal to this policy statement.
   *
   * @param service the service name for which a service principal is requested (e.g:
   * `s3.amazonaws.com`). 
   * @param opts options for adding the service principal (such as specifying a principal in a
   * different region).
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("01f982aa65ad7d50f10c65b2c50eae381c720349ccb3d598b29dd0bb966cde71")
  public open fun addServicePrincipal(service: String,
      opts: ServicePrincipalOpts.Builder.() -> Unit): Unit = addServicePrincipal(service,
      ServicePrincipalOpts(opts))

  /**
   * Add an `StringEquals` condition that limits to a given account from `aws:SourceAccount`.
   *
   * This method can only be called once: subsequent calls will overwrite earlier calls.
   *
   * [Documentation](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_condition-keys.html#condition-keys-sourceaccount)
   * @param accountId 
   */
  public open fun addSourceAccountCondition(accountId: String) {
    unwrap(this).addSourceAccountCondition(accountId)
  }

  /**
   * Add an `ArnEquals` condition that limits to a given resource arn from `aws:SourceArn`.
   *
   * This method can only be called once: subsequent calls will overwrite earlier calls.
   *
   * [Documentation](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_condition-keys.html#condition-keys-sourcearn)
   * @param arn 
   */
  public open fun addSourceArnCondition(arn: String) {
    unwrap(this).addSourceArnCondition(arn)
  }

  /**
   * The conditions added to this statement.
   */
  public open fun conditions(): Any = unwrap(this).getConditions()

  /**
   * Create a new `PolicyStatement` with the same exact properties as this one, except for the
   * overrides.
   *
   * @param overrides
   */
  public open fun copy(): PolicyStatement = unwrap(this).copy().let(PolicyStatement::wrap)

  /**
   * Create a new `PolicyStatement` with the same exact properties as this one, except for the
   * overrides.
   *
   * @param overrides
   */
  public open fun copy(overrides: PolicyStatementProps): PolicyStatement =
      unwrap(this).copy(overrides.let(PolicyStatementProps::unwrap)).let(PolicyStatement::wrap)

  /**
   * Create a new `PolicyStatement` with the same exact properties as this one, except for the
   * overrides.
   *
   * @param overrides
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("49fd20e1ad8116acd8ec88b0dbea23455b65b7ed0904a56b0ac55b81b04e2498")
  public open fun copy(overrides: PolicyStatementProps.Builder.() -> Unit): PolicyStatement =
      copy(PolicyStatementProps(overrides))

  /**
   * Whether to allow or deny the actions in this statement Set effect for this statement.
   */
  public open fun effect(): Effect = unwrap(this).getEffect().let(Effect::wrap)

  /**
   * Whether to allow or deny the actions in this statement Set effect for this statement.
   */
  public open fun effect(`value`: Effect) {
    unwrap(this).setEffect(`value`.let(Effect::unwrap))
  }

  /**
   * Make the PolicyStatement immutable.
   *
   * After calling this, any of the `addXxx()` methods will throw an exception.
   *
   * Libraries that lazily generate statement bodies can override this method to
   * fill the actual PolicyStatement fields. Be aware that this method may be called
   * multiple times.
   */
  public open fun freeze(): PolicyStatement = unwrap(this).freeze().let(PolicyStatement::wrap)

  /**
   * Whether the PolicyStatement has been frozen.
   *
   * The statement object is frozen when `freeze()` is called.
   */
  public open fun frozen(): Boolean = unwrap(this).getFrozen()

  /**
   * Indicates if this permission has a "Principal" section.
   */
  public open fun hasPrincipal(): Boolean = unwrap(this).getHasPrincipal()

  /**
   * Indicates if this permission has at least one resource associated with it.
   */
  public open fun hasResource(): Boolean = unwrap(this).getHasResource()

  /**
   * The NotActions added to this statement.
   */
  public open fun notActions(): List<String> = unwrap(this).getNotActions()

  /**
   * The NotPrincipals added to this statement.
   */
  public open fun notPrincipals(): List<IPrincipal> =
      unwrap(this).getNotPrincipals().map(IPrincipal::wrap)

  /**
   * The NotResources added to this statement.
   */
  public open fun notResources(): List<String> = unwrap(this).getNotResources()

  /**
   * The Principals added to this statement.
   */
  public open fun principals(): List<IPrincipal> =
      unwrap(this).getPrincipals().map(IPrincipal::wrap)

  /**
   * The Resources added to this statement.
   */
  public open fun resources(): List<String> = unwrap(this).getResources()

  /**
   * Statement ID for this statement Set Statement ID for this statement.
   */
  public open fun sid(): String? = unwrap(this).getSid()

  /**
   * Statement ID for this statement Set Statement ID for this statement.
   */
  public open fun sid(`value`: String) {
    unwrap(this).setSid(`value`)
  }

  /**
   * JSON-ify the statement.
   *
   * Used when JSON.stringify() is called
   */
  public open fun toJson(): Any = unwrap(this).toJSON()

  /**
   * JSON-ify the policy statement.
   *
   * Used when JSON.stringify() is called
   */
  public open fun toStatementJson(): Any = unwrap(this).toStatementJson()

  /**
   * Validate that the policy statement satisfies base requirements for a policy.
   *
   * @return An array of validation error messages, or an empty array if the statement is valid.
   */
  public open fun validateForAnyPolicy(): List<String> = unwrap(this).validateForAnyPolicy()

  /**
   * Validate that the policy statement satisfies all requirements for an identity-based policy.
   *
   * @return An array of validation error messages, or an empty array if the statement is valid.
   */
  public open fun validateForIdentityPolicy(): List<String> =
      unwrap(this).validateForIdentityPolicy()

  /**
   * Validate that the policy statement satisfies all requirements for a resource-based policy.
   *
   * @return An array of validation error messages, or an empty array if the statement is valid.
   */
  public open fun validateForResourcePolicy(): List<String> =
      unwrap(this).validateForResourcePolicy()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.iam.PolicyStatement].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * List of actions to add to the statement.
     *
     * Default: - no actions
     *
     * @param actions List of actions to add to the statement. 
     */
    public fun actions(actions: List<String>)

    /**
     * List of actions to add to the statement.
     *
     * Default: - no actions
     *
     * @param actions List of actions to add to the statement. 
     */
    public fun actions(vararg actions: String)

    /**
     * Conditions to add to the statement.
     *
     * Default: - no condition
     *
     * @param conditions Conditions to add to the statement. 
     */
    public fun conditions(conditions: Map<String, Any>)

    /**
     * Whether to allow or deny the actions in this statement.
     *
     * Default: Effect.ALLOW
     *
     * @param effect Whether to allow or deny the actions in this statement. 
     */
    public fun effect(effect: Effect)

    /**
     * List of not actions to add to the statement.
     *
     * Default: - no not-actions
     *
     * @param notActions List of not actions to add to the statement. 
     */
    public fun notActions(notActions: List<String>)

    /**
     * List of not actions to add to the statement.
     *
     * Default: - no not-actions
     *
     * @param notActions List of not actions to add to the statement. 
     */
    public fun notActions(vararg notActions: String)

    /**
     * List of not principals to add to the statement.
     *
     * Default: - no not principals
     *
     * @param notPrincipals List of not principals to add to the statement. 
     */
    public fun notPrincipals(notPrincipals: List<IPrincipal>)

    /**
     * List of not principals to add to the statement.
     *
     * Default: - no not principals
     *
     * @param notPrincipals List of not principals to add to the statement. 
     */
    public fun notPrincipals(vararg notPrincipals: IPrincipal)

    /**
     * NotResource ARNs to add to the statement.
     *
     * Default: - no not-resources
     *
     * @param notResources NotResource ARNs to add to the statement. 
     */
    public fun notResources(notResources: List<String>)

    /**
     * NotResource ARNs to add to the statement.
     *
     * Default: - no not-resources
     *
     * @param notResources NotResource ARNs to add to the statement. 
     */
    public fun notResources(vararg notResources: String)

    /**
     * List of principals to add to the statement.
     *
     * Default: - no principals
     *
     * @param principals List of principals to add to the statement. 
     */
    public fun principals(principals: List<IPrincipal>)

    /**
     * List of principals to add to the statement.
     *
     * Default: - no principals
     *
     * @param principals List of principals to add to the statement. 
     */
    public fun principals(vararg principals: IPrincipal)

    /**
     * Resource ARNs to add to the statement.
     *
     * Default: - no resources
     *
     * @param resources Resource ARNs to add to the statement. 
     */
    public fun resources(resources: List<String>)

    /**
     * Resource ARNs to add to the statement.
     *
     * Default: - no resources
     *
     * @param resources Resource ARNs to add to the statement. 
     */
    public fun resources(vararg resources: String)

    /**
     * The Sid (statement ID) is an optional identifier that you provide for the policy statement.
     *
     * You can assign a Sid value to each statement in a
     * statement array. In services that let you specify an ID element, such as
     * SQS and SNS, the Sid value is just a sub-ID of the policy document's ID. In
     * IAM, the Sid value must be unique within a JSON policy.
     *
     * Default: - no sid
     *
     * @param sid The Sid (statement ID) is an optional identifier that you provide for the policy
     * statement. 
     */
    public fun sid(sid: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iam.PolicyStatement.Builder =
        software.amazon.awscdk.services.iam.PolicyStatement.Builder.create()

    /**
     * List of actions to add to the statement.
     *
     * Default: - no actions
     *
     * @param actions List of actions to add to the statement. 
     */
    override fun actions(actions: List<String>) {
      cdkBuilder.actions(actions)
    }

    /**
     * List of actions to add to the statement.
     *
     * Default: - no actions
     *
     * @param actions List of actions to add to the statement. 
     */
    override fun actions(vararg actions: String): Unit = actions(actions.toList())

    /**
     * Conditions to add to the statement.
     *
     * Default: - no condition
     *
     * @param conditions Conditions to add to the statement. 
     */
    override fun conditions(conditions: Map<String, Any>) {
      cdkBuilder.conditions(conditions)
    }

    /**
     * Whether to allow or deny the actions in this statement.
     *
     * Default: Effect.ALLOW
     *
     * @param effect Whether to allow or deny the actions in this statement. 
     */
    override fun effect(effect: Effect) {
      cdkBuilder.effect(effect.let(Effect::unwrap))
    }

    /**
     * List of not actions to add to the statement.
     *
     * Default: - no not-actions
     *
     * @param notActions List of not actions to add to the statement. 
     */
    override fun notActions(notActions: List<String>) {
      cdkBuilder.notActions(notActions)
    }

    /**
     * List of not actions to add to the statement.
     *
     * Default: - no not-actions
     *
     * @param notActions List of not actions to add to the statement. 
     */
    override fun notActions(vararg notActions: String): Unit = notActions(notActions.toList())

    /**
     * List of not principals to add to the statement.
     *
     * Default: - no not principals
     *
     * @param notPrincipals List of not principals to add to the statement. 
     */
    override fun notPrincipals(notPrincipals: List<IPrincipal>) {
      cdkBuilder.notPrincipals(notPrincipals.map(IPrincipal::unwrap))
    }

    /**
     * List of not principals to add to the statement.
     *
     * Default: - no not principals
     *
     * @param notPrincipals List of not principals to add to the statement. 
     */
    override fun notPrincipals(vararg notPrincipals: IPrincipal): Unit =
        notPrincipals(notPrincipals.toList())

    /**
     * NotResource ARNs to add to the statement.
     *
     * Default: - no not-resources
     *
     * @param notResources NotResource ARNs to add to the statement. 
     */
    override fun notResources(notResources: List<String>) {
      cdkBuilder.notResources(notResources)
    }

    /**
     * NotResource ARNs to add to the statement.
     *
     * Default: - no not-resources
     *
     * @param notResources NotResource ARNs to add to the statement. 
     */
    override fun notResources(vararg notResources: String): Unit =
        notResources(notResources.toList())

    /**
     * List of principals to add to the statement.
     *
     * Default: - no principals
     *
     * @param principals List of principals to add to the statement. 
     */
    override fun principals(principals: List<IPrincipal>) {
      cdkBuilder.principals(principals.map(IPrincipal::unwrap))
    }

    /**
     * List of principals to add to the statement.
     *
     * Default: - no principals
     *
     * @param principals List of principals to add to the statement. 
     */
    override fun principals(vararg principals: IPrincipal): Unit = principals(principals.toList())

    /**
     * Resource ARNs to add to the statement.
     *
     * Default: - no resources
     *
     * @param resources Resource ARNs to add to the statement. 
     */
    override fun resources(resources: List<String>) {
      cdkBuilder.resources(resources)
    }

    /**
     * Resource ARNs to add to the statement.
     *
     * Default: - no resources
     *
     * @param resources Resource ARNs to add to the statement. 
     */
    override fun resources(vararg resources: String): Unit = resources(resources.toList())

    /**
     * The Sid (statement ID) is an optional identifier that you provide for the policy statement.
     *
     * You can assign a Sid value to each statement in a
     * statement array. In services that let you specify an ID element, such as
     * SQS and SNS, the Sid value is just a sub-ID of the policy document's ID. In
     * IAM, the Sid value must be unique within a JSON policy.
     *
     * Default: - no sid
     *
     * @param sid The Sid (statement ID) is an optional identifier that you provide for the policy
     * statement. 
     */
    override fun sid(sid: String) {
      cdkBuilder.sid(sid)
    }

    public fun build(): software.amazon.awscdk.services.iam.PolicyStatement = cdkBuilder.build()
  }

  public companion object {
    public fun fromJson(obj: Any): PolicyStatement =
        software.amazon.awscdk.services.iam.PolicyStatement.fromJson(obj).let(PolicyStatement::wrap)

    public operator fun invoke(block: Builder.() -> Unit = {}): PolicyStatement {
      val builderImpl = BuilderImpl()
      return PolicyStatement(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.PolicyStatement):
        PolicyStatement = PolicyStatement(cdkObject)

    internal fun unwrap(wrapped: PolicyStatement):
        software.amazon.awscdk.services.iam.PolicyStatement = wrapped.cdkObject
  }
}
