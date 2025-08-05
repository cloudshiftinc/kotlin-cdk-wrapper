@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * An IAM Group (collection of IAM users) lets you specify permissions for multiple users, which can
 * make it easier to manage permissions for those users.
 *
 * Example:
 *
 * ```
 * User user = new User(this, "MyUser"); // or User.fromUserName(this, 'User', 'johnsmith');
 * Group group = new Group(this, "MyGroup"); // or Group.fromGroupArn(this, 'Group',
 * 'arn:aws:iam::account-id:group/group-name');
 * user.addToGroup(group);
 * // or
 * group.addUser(user);
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_groups.html)
 */
public open class Group(
  cdkObject: software.amazon.awscdk.services.iam.Group,
) : Resource(cdkObject),
    IGroup {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.iam.Group(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: GroupProps,
  ) :
      this(software.amazon.awscdk.services.iam.Group(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(GroupProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: GroupProps.Builder.() -> Unit,
  ) : this(scope, id, GroupProps(props)
  )

  /**
   * Attaches a managed policy to this group.
   *
   * See [IAM and AWS STS quotas, name requirements, and character limits]
   * (https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-quotas.html#reference_iam-quotas-entities)
   * for quota of managed policies attached to an IAM group.
   *
   * @param policy The managed policy to attach. 
   */
  public override fun addManagedPolicy(policy: IManagedPolicy) {
    unwrap(this).addManagedPolicy(policy.let(IManagedPolicy.Companion::unwrap))
  }

  /**
   * Add to the policy of this principal.
   *
   * @param statement 
   */
  public open fun addToPolicy(statement: PolicyStatement): Boolean =
      unwrap(this).addToPolicy(statement.let(PolicyStatement.Companion::unwrap))

  /**
   * Add to the policy of this principal.
   *
   * @param statement 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("6148e52b961e7728ba57cdabfd202385d97a77f6d5da33adb746c32e8c75340f")
  public open fun addToPolicy(statement: PolicyStatement.Builder.() -> Unit): Boolean =
      addToPolicy(PolicyStatement(statement))

  /**
   * Adds an IAM statement to the default policy.
   *
   * @param statement 
   */
  public override fun addToPrincipalPolicy(statement: PolicyStatement): AddToPrincipalPolicyResult =
      unwrap(this).addToPrincipalPolicy(statement.let(PolicyStatement.Companion::unwrap)).let(AddToPrincipalPolicyResult::wrap)

  /**
   * Adds an IAM statement to the default policy.
   *
   * @param statement 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e5a2b0fec5c17722d0dc719c3fd27344bee07d931f9f715b331523f4aadc0661")
  public override fun addToPrincipalPolicy(statement: PolicyStatement.Builder.() -> Unit):
      AddToPrincipalPolicyResult = addToPrincipalPolicy(PolicyStatement(statement))

  /**
   * Adds a user to this group.
   *
   * @param user 
   */
  public open fun addUser(user: IUser) {
    unwrap(this).addUser(user.let(IUser.Companion::unwrap))
  }

  /**
   * When this Principal is used in an AssumeRole policy, the action to use.
   */
  public override fun assumeRoleAction(): String = unwrap(this).getAssumeRoleAction()

  /**
   * Attaches a policy to this group.
   *
   * @param policy The policy to attach. 
   */
  public override fun attachInlinePolicy(policy: Policy) {
    unwrap(this).attachInlinePolicy(policy.let(Policy.Companion::unwrap))
  }

  /**
   * The principal to grant permissions to.
   */
  public override fun grantPrincipal(): IPrincipal =
      unwrap(this).getGrantPrincipal().let(IPrincipal::wrap)

  /**
   * Returns the IAM Group ARN.
   */
  public override fun groupArn(): String = unwrap(this).getGroupArn()

  /**
   * Returns the IAM Group Name.
   */
  public override fun groupName(): String = unwrap(this).getGroupName()

  /**
   * Return the policy fragment that identifies this principal in a Policy.
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
   * A fluent builder for [io.cloudshiftdev.awscdk.services.iam.Group].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A name for the IAM group.
     *
     * For valid values, see the GroupName parameter
     * for the CreateGroup action in the IAM API Reference. If you don't specify
     * a name, AWS CloudFormation generates a unique physical ID and uses that
     * ID for the group name.
     *
     * If you specify a name, you must specify the CAPABILITY_NAMED_IAM value to
     * acknowledge your template's capabilities. For more information, see
     * Acknowledging IAM Resources in AWS CloudFormation Templates.
     *
     * Default: Generated by CloudFormation (recommended)
     *
     * @param groupName A name for the IAM group. 
     */
    public fun groupName(groupName: String)

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
     * The path to the group.
     *
     * For more information about paths, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/index.html?Using_Identifiers.html">IAM
     * Identifiers</a>
     * in the IAM User Guide.
     *
     * Default: /
     *
     * @param path The path to the group. 
     */
    public fun path(path: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iam.Group.Builder =
        software.amazon.awscdk.services.iam.Group.Builder.create(scope, id)

    /**
     * A name for the IAM group.
     *
     * For valid values, see the GroupName parameter
     * for the CreateGroup action in the IAM API Reference. If you don't specify
     * a name, AWS CloudFormation generates a unique physical ID and uses that
     * ID for the group name.
     *
     * If you specify a name, you must specify the CAPABILITY_NAMED_IAM value to
     * acknowledge your template's capabilities. For more information, see
     * Acknowledging IAM Resources in AWS CloudFormation Templates.
     *
     * Default: Generated by CloudFormation (recommended)
     *
     * @param groupName A name for the IAM group. 
     */
    override fun groupName(groupName: String) {
      cdkBuilder.groupName(groupName)
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
      cdkBuilder.managedPolicies(managedPolicies.map(IManagedPolicy.Companion::unwrap))
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
     * The path to the group.
     *
     * For more information about paths, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/index.html?Using_Identifiers.html">IAM
     * Identifiers</a>
     * in the IAM User Guide.
     *
     * Default: /
     *
     * @param path The path to the group. 
     */
    override fun path(path: String) {
      cdkBuilder.path(path)
    }

    public fun build(): software.amazon.awscdk.services.iam.Group = cdkBuilder.build()
  }

  public companion object {
    public val PROPERTY_INJECTION_ID: String =
        software.amazon.awscdk.services.iam.Group.PROPERTY_INJECTION_ID

    public fun fromGroupArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      groupArn: String,
    ): IGroup =
        software.amazon.awscdk.services.iam.Group.fromGroupArn(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, groupArn).let(IGroup::wrap)

    public fun fromGroupName(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      groupName: String,
    ): IGroup =
        software.amazon.awscdk.services.iam.Group.fromGroupName(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, groupName).let(IGroup::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): Group {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return Group(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.Group): Group =
        Group(cdkObject)

    internal fun unwrap(wrapped: Group): software.amazon.awscdk.services.iam.Group =
        wrapped.cdkObject as software.amazon.awscdk.services.iam.Group
  }
}
