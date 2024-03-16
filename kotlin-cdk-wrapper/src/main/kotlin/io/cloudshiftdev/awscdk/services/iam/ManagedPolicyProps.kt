@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining an IAM managed policy.
 *
 * Example:
 *
 * ```
 * Map&lt;String, Object&gt; policyDocument = Map.of(
 * "Version", "2012-10-17",
 * "Statement", List.of(Map.of(
 * "Sid", "FirstStatement",
 * "Effect", "Allow",
 * "Action", List.of("iam:ChangePassword"),
 * "Resource", List.of("*")), Map.of(
 * "Sid", "SecondStatement",
 * "Effect", "Allow",
 * "Action", List.of("s3:ListAllMyBuckets"),
 * "Resource", List.of("*")), Map.of(
 * "Sid", "ThirdStatement",
 * "Effect", "Allow",
 * "Action", List.of("s3:List*", "s3:Get*"),
 * "Resource", List.of("arn:aws:s3:::confidential-data", "arn:aws:s3:::confidential-data/ *"),
 * "Condition", Map.of("Bool", Map.of("aws:MultiFactorAuthPresent", "true")))));
 * PolicyDocument customPolicyDocument = PolicyDocument.fromJson(policyDocument);
 * // You can pass this document as an initial document to a ManagedPolicy
 * // or inline Policy.
 * ManagedPolicy newManagedPolicy = ManagedPolicy.Builder.create(this, "MyNewManagedPolicy")
 * .document(customPolicyDocument)
 * .build();
 * Policy newPolicy = Policy.Builder.create(this, "MyNewPolicy")
 * .document(customPolicyDocument)
 * .build();
 * ```
 */
public interface ManagedPolicyProps {
  /**
   * A description of the managed policy.
   *
   * Typically used to store information about the
   * permissions defined in the policy. For example, "Grants access to production DynamoDB tables."
   * The policy description is immutable. After a value is assigned, it cannot be changed.
   *
   * Default: - empty
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * Initial PolicyDocument to use for this ManagedPolicy.
   *
   * If omited, any
   * `PolicyStatement` provided in the `statements` property will be applied
   * against the empty default `PolicyDocument`.
   *
   * Default: - An empty policy.
   */
  public fun document(): PolicyDocument? = unwrap(this).getDocument()?.let(PolicyDocument::wrap)

  /**
   * Groups to attach this policy to.
   *
   * You can also use `attachToGroup(group)` to attach this policy to a group.
   *
   * Default: - No groups.
   */
  public fun groups(): List<IGroup> = unwrap(this).getGroups()?.map(IGroup::wrap) ?: emptyList()

  /**
   * The name of the managed policy.
   *
   * If you specify multiple policies for an entity,
   * specify unique names. For example, if you specify a list of policies for
   * an IAM role, each policy must have a unique name.
   *
   * Default: - A name is automatically generated.
   */
  public fun managedPolicyName(): String? = unwrap(this).getManagedPolicyName()

  /**
   * The path for the policy.
   *
   * This parameter allows (through its regex pattern) a string of characters
   * consisting of either a forward slash (/) by itself or a string that must begin and end with
   * forward slashes.
   * In addition, it can contain any ASCII character from the ! (\u0021) through the DEL character
   * (\u007F),
   * including most punctuation characters, digits, and upper and lowercased letters.
   *
   * For more information about paths, see IAM Identifiers in the IAM User Guide.
   *
   * Default: - "/"
   */
  public fun path(): String? = unwrap(this).getPath()

  /**
   * Roles to attach this policy to.
   *
   * You can also use `attachToRole(role)` to attach this policy to a role.
   *
   * Default: - No roles.
   */
  public fun roles(): List<IRole> = unwrap(this).getRoles()?.map(IRole::wrap) ?: emptyList()

  /**
   * Initial set of permissions to add to this policy document.
   *
   * You can also use `addPermission(statement)` to add permissions later.
   *
   * Default: - No statements.
   */
  public fun statements(): List<PolicyStatement> =
      unwrap(this).getStatements()?.map(PolicyStatement::wrap) ?: emptyList()

  /**
   * Users to attach this policy to.
   *
   * You can also use `attachToUser(user)` to attach this policy to a user.
   *
   * Default: - No users.
   */
  public fun users(): List<IUser> = unwrap(this).getUsers()?.map(IUser::wrap) ?: emptyList()

  /**
   * A builder for [ManagedPolicyProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description A description of the managed policy.
     * Typically used to store information about the
     * permissions defined in the policy. For example, "Grants access to production DynamoDB
     * tables."
     * The policy description is immutable. After a value is assigned, it cannot be changed.
     */
    public fun description(description: String)

    /**
     * @param document Initial PolicyDocument to use for this ManagedPolicy.
     * If omited, any
     * `PolicyStatement` provided in the `statements` property will be applied
     * against the empty default `PolicyDocument`.
     */
    public fun document(document: PolicyDocument)

    /**
     * @param document Initial PolicyDocument to use for this ManagedPolicy.
     * If omited, any
     * `PolicyStatement` provided in the `statements` property will be applied
     * against the empty default `PolicyDocument`.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8a4f5f96c59c0b0de3516c6f29487e97194ced16113cf4e5d91098fc6e6f57d9")
    public fun document(document: PolicyDocument.Builder.() -> Unit)

    /**
     * @param groups Groups to attach this policy to.
     * You can also use `attachToGroup(group)` to attach this policy to a group.
     */
    public fun groups(groups: List<IGroup>)

    /**
     * @param groups Groups to attach this policy to.
     * You can also use `attachToGroup(group)` to attach this policy to a group.
     */
    public fun groups(vararg groups: IGroup)

    /**
     * @param managedPolicyName The name of the managed policy.
     * If you specify multiple policies for an entity,
     * specify unique names. For example, if you specify a list of policies for
     * an IAM role, each policy must have a unique name.
     */
    public fun managedPolicyName(managedPolicyName: String)

    /**
     * @param path The path for the policy.
     * This parameter allows (through its regex pattern) a string of characters
     * consisting of either a forward slash (/) by itself or a string that must begin and end with
     * forward slashes.
     * In addition, it can contain any ASCII character from the ! (\u0021) through the DEL character
     * (\u007F),
     * including most punctuation characters, digits, and upper and lowercased letters.
     *
     * For more information about paths, see IAM Identifiers in the IAM User Guide.
     */
    public fun path(path: String)

    /**
     * @param roles Roles to attach this policy to.
     * You can also use `attachToRole(role)` to attach this policy to a role.
     */
    public fun roles(roles: List<IRole>)

    /**
     * @param roles Roles to attach this policy to.
     * You can also use `attachToRole(role)` to attach this policy to a role.
     */
    public fun roles(vararg roles: IRole)

    /**
     * @param statements Initial set of permissions to add to this policy document.
     * You can also use `addPermission(statement)` to add permissions later.
     */
    public fun statements(statements: List<PolicyStatement>)

    /**
     * @param statements Initial set of permissions to add to this policy document.
     * You can also use `addPermission(statement)` to add permissions later.
     */
    public fun statements(vararg statements: PolicyStatement)

    /**
     * @param users Users to attach this policy to.
     * You can also use `attachToUser(user)` to attach this policy to a user.
     */
    public fun users(users: List<IUser>)

    /**
     * @param users Users to attach this policy to.
     * You can also use `attachToUser(user)` to attach this policy to a user.
     */
    public fun users(vararg users: IUser)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iam.ManagedPolicyProps.Builder =
        software.amazon.awscdk.services.iam.ManagedPolicyProps.builder()

    /**
     * @param description A description of the managed policy.
     * Typically used to store information about the
     * permissions defined in the policy. For example, "Grants access to production DynamoDB
     * tables."
     * The policy description is immutable. After a value is assigned, it cannot be changed.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param document Initial PolicyDocument to use for this ManagedPolicy.
     * If omited, any
     * `PolicyStatement` provided in the `statements` property will be applied
     * against the empty default `PolicyDocument`.
     */
    override fun document(document: PolicyDocument) {
      cdkBuilder.document(document.let(PolicyDocument::unwrap))
    }

    /**
     * @param document Initial PolicyDocument to use for this ManagedPolicy.
     * If omited, any
     * `PolicyStatement` provided in the `statements` property will be applied
     * against the empty default `PolicyDocument`.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8a4f5f96c59c0b0de3516c6f29487e97194ced16113cf4e5d91098fc6e6f57d9")
    override fun document(document: PolicyDocument.Builder.() -> Unit): Unit =
        document(PolicyDocument(document))

    /**
     * @param groups Groups to attach this policy to.
     * You can also use `attachToGroup(group)` to attach this policy to a group.
     */
    override fun groups(groups: List<IGroup>) {
      cdkBuilder.groups(groups.map(IGroup::unwrap))
    }

    /**
     * @param groups Groups to attach this policy to.
     * You can also use `attachToGroup(group)` to attach this policy to a group.
     */
    override fun groups(vararg groups: IGroup): Unit = groups(groups.toList())

    /**
     * @param managedPolicyName The name of the managed policy.
     * If you specify multiple policies for an entity,
     * specify unique names. For example, if you specify a list of policies for
     * an IAM role, each policy must have a unique name.
     */
    override fun managedPolicyName(managedPolicyName: String) {
      cdkBuilder.managedPolicyName(managedPolicyName)
    }

    /**
     * @param path The path for the policy.
     * This parameter allows (through its regex pattern) a string of characters
     * consisting of either a forward slash (/) by itself or a string that must begin and end with
     * forward slashes.
     * In addition, it can contain any ASCII character from the ! (\u0021) through the DEL character
     * (\u007F),
     * including most punctuation characters, digits, and upper and lowercased letters.
     *
     * For more information about paths, see IAM Identifiers in the IAM User Guide.
     */
    override fun path(path: String) {
      cdkBuilder.path(path)
    }

    /**
     * @param roles Roles to attach this policy to.
     * You can also use `attachToRole(role)` to attach this policy to a role.
     */
    override fun roles(roles: List<IRole>) {
      cdkBuilder.roles(roles.map(IRole::unwrap))
    }

    /**
     * @param roles Roles to attach this policy to.
     * You can also use `attachToRole(role)` to attach this policy to a role.
     */
    override fun roles(vararg roles: IRole): Unit = roles(roles.toList())

    /**
     * @param statements Initial set of permissions to add to this policy document.
     * You can also use `addPermission(statement)` to add permissions later.
     */
    override fun statements(statements: List<PolicyStatement>) {
      cdkBuilder.statements(statements.map(PolicyStatement::unwrap))
    }

    /**
     * @param statements Initial set of permissions to add to this policy document.
     * You can also use `addPermission(statement)` to add permissions later.
     */
    override fun statements(vararg statements: PolicyStatement): Unit =
        statements(statements.toList())

    /**
     * @param users Users to attach this policy to.
     * You can also use `attachToUser(user)` to attach this policy to a user.
     */
    override fun users(users: List<IUser>) {
      cdkBuilder.users(users.map(IUser::unwrap))
    }

    /**
     * @param users Users to attach this policy to.
     * You can also use `attachToUser(user)` to attach this policy to a user.
     */
    override fun users(vararg users: IUser): Unit = users(users.toList())

    public fun build(): software.amazon.awscdk.services.iam.ManagedPolicyProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iam.ManagedPolicyProps,
  ) : CdkObject(cdkObject), ManagedPolicyProps {
    /**
     * A description of the managed policy.
     *
     * Typically used to store information about the
     * permissions defined in the policy. For example, "Grants access to production DynamoDB
     * tables."
     * The policy description is immutable. After a value is assigned, it cannot be changed.
     *
     * Default: - empty
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * Initial PolicyDocument to use for this ManagedPolicy.
     *
     * If omited, any
     * `PolicyStatement` provided in the `statements` property will be applied
     * against the empty default `PolicyDocument`.
     *
     * Default: - An empty policy.
     */
    override fun document(): PolicyDocument? = unwrap(this).getDocument()?.let(PolicyDocument::wrap)

    /**
     * Groups to attach this policy to.
     *
     * You can also use `attachToGroup(group)` to attach this policy to a group.
     *
     * Default: - No groups.
     */
    override fun groups(): List<IGroup> = unwrap(this).getGroups()?.map(IGroup::wrap) ?: emptyList()

    /**
     * The name of the managed policy.
     *
     * If you specify multiple policies for an entity,
     * specify unique names. For example, if you specify a list of policies for
     * an IAM role, each policy must have a unique name.
     *
     * Default: - A name is automatically generated.
     */
    override fun managedPolicyName(): String? = unwrap(this).getManagedPolicyName()

    /**
     * The path for the policy.
     *
     * This parameter allows (through its regex pattern) a string of characters
     * consisting of either a forward slash (/) by itself or a string that must begin and end with
     * forward slashes.
     * In addition, it can contain any ASCII character from the ! (\u0021) through the DEL character
     * (\u007F),
     * including most punctuation characters, digits, and upper and lowercased letters.
     *
     * For more information about paths, see IAM Identifiers in the IAM User Guide.
     *
     * Default: - "/"
     */
    override fun path(): String? = unwrap(this).getPath()

    /**
     * Roles to attach this policy to.
     *
     * You can also use `attachToRole(role)` to attach this policy to a role.
     *
     * Default: - No roles.
     */
    override fun roles(): List<IRole> = unwrap(this).getRoles()?.map(IRole::wrap) ?: emptyList()

    /**
     * Initial set of permissions to add to this policy document.
     *
     * You can also use `addPermission(statement)` to add permissions later.
     *
     * Default: - No statements.
     */
    override fun statements(): List<PolicyStatement> =
        unwrap(this).getStatements()?.map(PolicyStatement::wrap) ?: emptyList()

    /**
     * Users to attach this policy to.
     *
     * You can also use `attachToUser(user)` to attach this policy to a user.
     *
     * Default: - No users.
     */
    override fun users(): List<IUser> = unwrap(this).getUsers()?.map(IUser::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ManagedPolicyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.ManagedPolicyProps):
        ManagedPolicyProps = CdkObjectWrappers.wrap(cdkObject) as ManagedPolicyProps

    internal fun unwrap(wrapped: ManagedPolicyProps):
        software.amazon.awscdk.services.iam.ManagedPolicyProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.iam.ManagedPolicyProps
  }
}
