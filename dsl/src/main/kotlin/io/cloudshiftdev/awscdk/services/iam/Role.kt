package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class Role internal constructor(
  private val cdkObject: software.amazon.awscdk.services.iam.Role,
) : Resource(cdkObject), IRole {
  /**
   * Attaches a managed policy to this role.
   *
   * @param policy The the managed policy to attach. 
   */
  public override fun addManagedPolicy(policy: IManagedPolicy) {
    unwrap(this).addManagedPolicy(policy.let(IManagedPolicy::unwrap))
  }

  /**
   * Add to the policy of this principal.
   *
   * @param statement 
   */
  public open fun addToPolicy(statement: PolicyStatement): Boolean =
      unwrap(this).addToPolicy(statement.let(PolicyStatement::unwrap))

  /**
   * Add to the policy of this principal.
   *
   * @param statement 
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("6148e52b961e7728ba57cdabfd202385d97a77f6d5da33adb746c32e8c75340f")
  public open fun addToPolicy(statement: PolicyStatement.Builder.() -> Unit): Boolean =
      addToPolicy(PolicyStatement(statement))

  /**
   * Adds a permission to the role's default policy document.
   *
   * If there is no default policy attached to this role, it will be created.
   *
   * @param statement The permission statement to add to the policy document. 
   */
  public override fun addToPrincipalPolicy(statement: PolicyStatement): AddToPrincipalPolicyResult =
      unwrap(this).addToPrincipalPolicy(statement.let(PolicyStatement::unwrap)).let(AddToPrincipalPolicyResult::wrap)

  /**
   * Adds a permission to the role's default policy document.
   *
   * If there is no default policy attached to this role, it will be created.
   *
   * @param statement The permission statement to add to the policy document. 
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e5a2b0fec5c17722d0dc719c3fd27344bee07d931f9f715b331523f4aadc0661")
  public override fun addToPrincipalPolicy(statement: PolicyStatement.Builder.() -> Unit):
      AddToPrincipalPolicyResult = addToPrincipalPolicy(PolicyStatement(statement))

  /**
   * When this Principal is used in an AssumeRole policy, the action to use.
   */
  public override fun assumeRoleAction(): String = unwrap(this).getAssumeRoleAction()

  /**
   * The assume role policy document associated with this role.
   */
  public open fun assumeRolePolicy(): PolicyDocument? =
      unwrap(this).getAssumeRolePolicy()?.let(PolicyDocument::wrap)

  /**
   * Attaches a policy to this role.
   *
   * @param policy The policy to attach. 
   */
  public override fun attachInlinePolicy(policy: Policy) {
    unwrap(this).attachInlinePolicy(policy.let(Policy::unwrap))
  }

  /**
   * Grant the actions defined in actions to the identity Principal on this resource.
   *
   * @param grantee 
   * @param actions 
   */
  public override fun grant(grantee: IPrincipal, actions: String): Grant =
      unwrap(this).grant(grantee.let(IPrincipal::unwrap), actions).let(Grant::wrap)

  /**
   * Grant permissions to the given principal to assume this role.
   *
   * @param identity 
   */
  public override fun grantAssumeRole(identity: IPrincipal): Grant =
      unwrap(this).grantAssumeRole(identity.let(IPrincipal::unwrap)).let(Grant::wrap)

  /**
   * Grant permissions to the given principal to pass this role.
   *
   * @param identity 
   */
  public override fun grantPassRole(identity: IPrincipal): Grant =
      unwrap(this).grantPassRole(identity.let(IPrincipal::unwrap)).let(Grant::wrap)

  /**
   * The principal to grant permissions to.
   */
  public override fun grantPrincipal(): IPrincipal =
      unwrap(this).getGrantPrincipal().let(IPrincipal::wrap)

  /**
   * Returns the permissions boundary attached to this role.
   */
  public open fun permissionsBoundary(): IManagedPolicy? =
      unwrap(this).getPermissionsBoundary()?.let(IManagedPolicy::wrap)

  /**
   * Returns the role.
   */
  public override fun policyFragment(): PrincipalPolicyFragment =
      unwrap(this).getPolicyFragment().let(PrincipalPolicyFragment::wrap)

  /**
   * The AWS account ID of this principal.
   *
   * Can be undefined when the account is not known
   * (for example, for service principals).
   * Can be a Token - in that case,
   * it's assumed to be AWS::AccountId.
   */
  public override fun principalAccount(): String? = unwrap(this).getPrincipalAccount()

  /**
   * Returns the ARN of this role.
   */
  public override fun roleArn(): String = unwrap(this).getRoleArn()

  /**
   * Returns the stable and unique string identifying the role.
   *
   * For example,
   * AIDAJQABLZS4A3QDU576Q.
   */
  public open fun roleId(): String = unwrap(this).getRoleId()

  /**
   * Returns the name of the role.
   */
  public override fun roleName(): String = unwrap(this).getRoleName()

  /**
   * Return a copy of this Role object whose Policies will not be updated.
   *
   * Use the object returned by this method if you want this Role to be used by
   * a construct without it automatically updating the Role's Policies.
   *
   * If you do, you are responsible for adding the correct statements to the
   * Role's policies yourself.
   *
   * @param options
   */
  public open fun withoutPolicyUpdates(): IRole =
      unwrap(this).withoutPolicyUpdates().let(IRole::wrap)

  /**
   * Return a copy of this Role object whose Policies will not be updated.
   *
   * Use the object returned by this method if you want this Role to be used by
   * a construct without it automatically updating the Role's Policies.
   *
   * If you do, you are responsible for adding the correct statements to the
   * Role's policies yourself.
   *
   * @param options
   */
  public open fun withoutPolicyUpdates(options: WithoutPolicyUpdatesOptions): IRole =
      unwrap(this).withoutPolicyUpdates(options.let(WithoutPolicyUpdatesOptions::unwrap)).let(IRole::wrap)

  /**
   * Return a copy of this Role object whose Policies will not be updated.
   *
   * Use the object returned by this method if you want this Role to be used by
   * a construct without it automatically updating the Role's Policies.
   *
   * If you do, you are responsible for adding the correct statements to the
   * Role's policies yourself.
   *
   * @param options
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("df44f126146b57b381f4b6b389c40bffee2f6d872ff81d636b47bab7a910fe1f")
  public open fun withoutPolicyUpdates(options: WithoutPolicyUpdatesOptions.Builder.() -> Unit):
      IRole = withoutPolicyUpdates(WithoutPolicyUpdatesOptions(options))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.iam.Role].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The IAM principal (i.e. `new ServicePrincipal('sns.amazonaws.com')`) which can assume this
     * role.
     *
     * You can later modify the assume role policy document by accessing it via
     * the `assumeRolePolicy` property.
     *
     * @param assumedBy The IAM principal (i.e. `new ServicePrincipal('sns.amazonaws.com')`) which
     * can assume this role. 
     */
    public fun assumedBy(assumedBy: IPrincipal)

    /**
     * A description of the role.
     *
     * It can be up to 1000 characters long.
     *
     * Default: - No description.
     *
     * @param description A description of the role. 
     */
    public fun description(description: String)

    /**
     * List of IDs that the role assumer needs to provide one of when assuming this role.
     *
     * If the configured and provided external IDs do not match, the
     * AssumeRole operation will fail.
     *
     * Default: No external ID required
     *
     * @param externalIds List of IDs that the role assumer needs to provide one of when assuming
     * this role. 
     */
    public fun externalIds(externalIds: List<String>)

    /**
     * List of IDs that the role assumer needs to provide one of when assuming this role.
     *
     * If the configured and provided external IDs do not match, the
     * AssumeRole operation will fail.
     *
     * Default: No external ID required
     *
     * @param externalIds List of IDs that the role assumer needs to provide one of when assuming
     * this role. 
     */
    public fun externalIds(vararg externalIds: String)

    /**
     * A list of named policies to inline into this role.
     *
     * These policies will be
     * created with the role, whereas those added by `addToPolicy` are added
     * using a separate CloudFormation resource (allowing a way around circular
     * dependencies that could otherwise be introduced).
     *
     * Default: - No policy is inlined in the Role resource.
     *
     * @param inlinePolicies A list of named policies to inline into this role. 
     */
    public fun inlinePolicies(inlinePolicies: Map<String, PolicyDocument>)

    /**
     * A list of managed policies associated with this role.
     *
     * You can add managed policies later using
     * `addManagedPolicy(ManagedPolicy.fromAwsManagedPolicyName(policyName))`.
     *
     * Default: - No managed policies.
     *
     * @param managedPolicies A list of managed policies associated with this role. 
     */
    public fun managedPolicies(managedPolicies: List<IManagedPolicy>)

    /**
     * A list of managed policies associated with this role.
     *
     * You can add managed policies later using
     * `addManagedPolicy(ManagedPolicy.fromAwsManagedPolicyName(policyName))`.
     *
     * Default: - No managed policies.
     *
     * @param managedPolicies A list of managed policies associated with this role. 
     */
    public fun managedPolicies(vararg managedPolicies: IManagedPolicy)

    /**
     * The maximum session duration that you want to set for the specified role.
     *
     * This setting can have a value from 1 hour (3600sec) to 12 (43200sec) hours.
     *
     * Anyone who assumes the role from the AWS CLI or API can use the
     * DurationSeconds API parameter or the duration-seconds CLI parameter to
     * request a longer session. The MaxSessionDuration setting determines the
     * maximum duration that can be requested using the DurationSeconds
     * parameter.
     *
     * If users don't specify a value for the DurationSeconds parameter, their
     * security credentials are valid for one hour by default. This applies when
     * you use the AssumeRole* API operations or the assume-role* CLI operations
     * but does not apply when you use those operations to create a console URL.
     *
     * Default: Duration.hours(1)
     *
     * @param maxSessionDuration The maximum session duration that you want to set for the specified
     * role. 
     */
    public fun maxSessionDuration(maxSessionDuration: Duration)

    /**
     * The path associated with this role.
     *
     * For information about IAM paths, see
     * Friendly Names and Paths in IAM User Guide.
     *
     * Default: /
     *
     * @param path The path associated with this role. 
     */
    public fun path(path: String)

    /**
     * AWS supports permissions boundaries for IAM entities (users or roles).
     *
     * A permissions boundary is an advanced feature for using a managed policy
     * to set the maximum permissions that an identity-based policy can grant to
     * an IAM entity. An entity's permissions boundary allows it to perform only
     * the actions that are allowed by both its identity-based policies and its
     * permissions boundaries.
     *
     * Default: - No permissions boundary.
     *
     * @param permissionsBoundary AWS supports permissions boundaries for IAM entities (users or
     * roles). 
     */
    public fun permissionsBoundary(permissionsBoundary: IManagedPolicy)

    /**
     * A name for the IAM role.
     *
     * For valid values, see the RoleName parameter for
     * the CreateRole action in the IAM API Reference.
     *
     * IMPORTANT: If you specify a name, you cannot perform updates that require
     * replacement of this resource. You can perform updates that require no or
     * some interruption. If you must replace the resource, specify a new name.
     *
     * If you specify a name, you must specify the CAPABILITY_NAMED_IAM value to
     * acknowledge your template's capabilities. For more information, see
     * Acknowledging IAM Resources in AWS CloudFormation Templates.
     *
     * Default: - AWS CloudFormation generates a unique physical ID and uses that ID
     * for the role name.
     *
     * @param roleName A name for the IAM role. 
     */
    public fun roleName(roleName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iam.Role.Builder =
        software.amazon.awscdk.services.iam.Role.Builder.create(scope, id)

    /**
     * The IAM principal (i.e. `new ServicePrincipal('sns.amazonaws.com')`) which can assume this
     * role.
     *
     * You can later modify the assume role policy document by accessing it via
     * the `assumeRolePolicy` property.
     *
     * @param assumedBy The IAM principal (i.e. `new ServicePrincipal('sns.amazonaws.com')`) which
     * can assume this role. 
     */
    override fun assumedBy(assumedBy: IPrincipal) {
      cdkBuilder.assumedBy(assumedBy.let(IPrincipal::unwrap))
    }

    /**
     * A description of the role.
     *
     * It can be up to 1000 characters long.
     *
     * Default: - No description.
     *
     * @param description A description of the role. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * List of IDs that the role assumer needs to provide one of when assuming this role.
     *
     * If the configured and provided external IDs do not match, the
     * AssumeRole operation will fail.
     *
     * Default: No external ID required
     *
     * @param externalIds List of IDs that the role assumer needs to provide one of when assuming
     * this role. 
     */
    override fun externalIds(externalIds: List<String>) {
      cdkBuilder.externalIds(externalIds)
    }

    /**
     * List of IDs that the role assumer needs to provide one of when assuming this role.
     *
     * If the configured and provided external IDs do not match, the
     * AssumeRole operation will fail.
     *
     * Default: No external ID required
     *
     * @param externalIds List of IDs that the role assumer needs to provide one of when assuming
     * this role. 
     */
    override fun externalIds(vararg externalIds: String): Unit = externalIds(externalIds.toList())

    /**
     * A list of named policies to inline into this role.
     *
     * These policies will be
     * created with the role, whereas those added by `addToPolicy` are added
     * using a separate CloudFormation resource (allowing a way around circular
     * dependencies that could otherwise be introduced).
     *
     * Default: - No policy is inlined in the Role resource.
     *
     * @param inlinePolicies A list of named policies to inline into this role. 
     */
    override fun inlinePolicies(inlinePolicies: Map<String, PolicyDocument>) {
      cdkBuilder.inlinePolicies(inlinePolicies.mapValues{PolicyDocument.unwrap(it.value)})
    }

    /**
     * A list of managed policies associated with this role.
     *
     * You can add managed policies later using
     * `addManagedPolicy(ManagedPolicy.fromAwsManagedPolicyName(policyName))`.
     *
     * Default: - No managed policies.
     *
     * @param managedPolicies A list of managed policies associated with this role. 
     */
    override fun managedPolicies(managedPolicies: List<IManagedPolicy>) {
      cdkBuilder.managedPolicies(managedPolicies.map(IManagedPolicy::unwrap))
    }

    /**
     * A list of managed policies associated with this role.
     *
     * You can add managed policies later using
     * `addManagedPolicy(ManagedPolicy.fromAwsManagedPolicyName(policyName))`.
     *
     * Default: - No managed policies.
     *
     * @param managedPolicies A list of managed policies associated with this role. 
     */
    override fun managedPolicies(vararg managedPolicies: IManagedPolicy): Unit =
        managedPolicies(managedPolicies.toList())

    /**
     * The maximum session duration that you want to set for the specified role.
     *
     * This setting can have a value from 1 hour (3600sec) to 12 (43200sec) hours.
     *
     * Anyone who assumes the role from the AWS CLI or API can use the
     * DurationSeconds API parameter or the duration-seconds CLI parameter to
     * request a longer session. The MaxSessionDuration setting determines the
     * maximum duration that can be requested using the DurationSeconds
     * parameter.
     *
     * If users don't specify a value for the DurationSeconds parameter, their
     * security credentials are valid for one hour by default. This applies when
     * you use the AssumeRole* API operations or the assume-role* CLI operations
     * but does not apply when you use those operations to create a console URL.
     *
     * Default: Duration.hours(1)
     *
     * @param maxSessionDuration The maximum session duration that you want to set for the specified
     * role. 
     */
    override fun maxSessionDuration(maxSessionDuration: Duration) {
      cdkBuilder.maxSessionDuration(maxSessionDuration.let(Duration::unwrap))
    }

    /**
     * The path associated with this role.
     *
     * For information about IAM paths, see
     * Friendly Names and Paths in IAM User Guide.
     *
     * Default: /
     *
     * @param path The path associated with this role. 
     */
    override fun path(path: String) {
      cdkBuilder.path(path)
    }

    /**
     * AWS supports permissions boundaries for IAM entities (users or roles).
     *
     * A permissions boundary is an advanced feature for using a managed policy
     * to set the maximum permissions that an identity-based policy can grant to
     * an IAM entity. An entity's permissions boundary allows it to perform only
     * the actions that are allowed by both its identity-based policies and its
     * permissions boundaries.
     *
     * Default: - No permissions boundary.
     *
     * @param permissionsBoundary AWS supports permissions boundaries for IAM entities (users or
     * roles). 
     */
    override fun permissionsBoundary(permissionsBoundary: IManagedPolicy) {
      cdkBuilder.permissionsBoundary(permissionsBoundary.let(IManagedPolicy::unwrap))
    }

    /**
     * A name for the IAM role.
     *
     * For valid values, see the RoleName parameter for
     * the CreateRole action in the IAM API Reference.
     *
     * IMPORTANT: If you specify a name, you cannot perform updates that require
     * replacement of this resource. You can perform updates that require no or
     * some interruption. If you must replace the resource, specify a new name.
     *
     * If you specify a name, you must specify the CAPABILITY_NAMED_IAM value to
     * acknowledge your template's capabilities. For more information, see
     * Acknowledging IAM Resources in AWS CloudFormation Templates.
     *
     * Default: - AWS CloudFormation generates a unique physical ID and uses that ID
     * for the role name.
     *
     * @param roleName A name for the IAM role. 
     */
    override fun roleName(roleName: String) {
      cdkBuilder.roleName(roleName)
    }

    public fun build(): software.amazon.awscdk.services.iam.Role = cdkBuilder.build()
  }

  public companion object {
    public fun customizeRoles(scope: CloudshiftdevConstructsConstruct) {
      software.amazon.awscdk.services.iam.Role.customizeRoles(scope.let(CloudshiftdevConstructsConstruct::unwrap))
    }

    public fun customizeRoles(scope: CloudshiftdevConstructsConstruct,
        options: CustomizeRolesOptions) {
      software.amazon.awscdk.services.iam.Role.customizeRoles(scope.let(CloudshiftdevConstructsConstruct::unwrap),
          options.let(CustomizeRolesOptions::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("375a651383dd6f9b4f2086269a6db40f6b1f740e25e369749b93877413fc682f")
    public fun customizeRoles(scope: CloudshiftdevConstructsConstruct,
        options: CustomizeRolesOptions.Builder.() -> Unit): Unit = customizeRoles(scope,
        CustomizeRolesOptions(options))

    public fun fromRoleArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      roleArn: String,
    ): IRole =
        software.amazon.awscdk.services.iam.Role.fromRoleArn(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, roleArn).let(IRole::wrap)

    public fun fromRoleArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      roleArn: String,
      options: FromRoleArnOptions,
    ): IRole =
        software.amazon.awscdk.services.iam.Role.fromRoleArn(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, roleArn, options.let(FromRoleArnOptions::unwrap)).let(IRole::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a4fb31fe9dd1e72e4b8ca587f24946f2fdf30b789ba5dd86492388cc8e4a5a11")
    public fun fromRoleArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      roleArn: String,
      options: FromRoleArnOptions.Builder.() -> Unit,
    ): IRole = fromRoleArn(scope, id, roleArn, FromRoleArnOptions(options))

    public fun fromRoleName(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      roleName: String,
    ): IRole =
        software.amazon.awscdk.services.iam.Role.fromRoleName(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, roleName).let(IRole::wrap)

    public fun fromRoleName(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      roleName: String,
      options: FromRoleNameOptions,
    ): IRole =
        software.amazon.awscdk.services.iam.Role.fromRoleName(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, roleName, options.let(FromRoleNameOptions::unwrap)).let(IRole::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("75fdf9c6375dbd7430f3304bb8fd3be42333a5b7701b06ab210e40c20e6d1d3a")
    public fun fromRoleName(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      roleName: String,
      options: FromRoleNameOptions.Builder.() -> Unit,
    ): IRole = fromRoleName(scope, id, roleName, FromRoleNameOptions(options))

    public fun isRole(x: Any): Boolean = software.amazon.awscdk.services.iam.Role.isRole(x)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): Role {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return Role(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.Role): Role = Role(cdkObject)

    internal fun unwrap(wrapped: Role): software.amazon.awscdk.services.iam.Role = wrapped.cdkObject
  }
}
