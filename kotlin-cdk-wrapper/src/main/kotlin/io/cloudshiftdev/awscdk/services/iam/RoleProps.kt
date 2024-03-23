@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

/**
 * Properties for defining an IAM Role.
 *
 * Example:
 *
 * ```
 * // Option 3: Create a new role that allows the account root principal to assume. Add this role in
 * the `system:masters` and witch to this role from the AWS console.
 * Cluster cluster;
 * Role consoleReadOnlyRole = Role.Builder.create(this, "ConsoleReadOnlyRole")
 * .assumedBy(new ArnPrincipal("arn_for_trusted_principal"))
 * .build();
 * consoleReadOnlyRole.addToPolicy(PolicyStatement.Builder.create()
 * .actions(List.of("eks:AccessKubernetesApi", "eks:Describe*", "eks:List*"))
 * .resources(List.of(cluster.getClusterArn()))
 * .build());
 * // Add this role to system:masters RBAC group
 * cluster.awsAuth.addMastersRole(consoleReadOnlyRole);
 * ```
 */
public interface RoleProps {
  /**
   * The IAM principal (i.e. `new ServicePrincipal('sns.amazonaws.com')`) which can assume this
   * role.
   *
   * You can later modify the assume role policy document by accessing it via
   * the `assumeRolePolicy` property.
   */
  public fun assumedBy(): IPrincipal

  /**
   * A description of the role.
   *
   * It can be up to 1000 characters long.
   *
   * Default: - No description.
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * List of IDs that the role assumer needs to provide one of when assuming this role.
   *
   * If the configured and provided external IDs do not match, the
   * AssumeRole operation will fail.
   *
   * Default: No external ID required
   */
  public fun externalIds(): List<String> = unwrap(this).getExternalIds() ?: emptyList()

  /**
   * A list of named policies to inline into this role.
   *
   * These policies will be
   * created with the role, whereas those added by `addToPolicy` are added
   * using a separate CloudFormation resource (allowing a way around circular
   * dependencies that could otherwise be introduced).
   *
   * Default: - No policy is inlined in the Role resource.
   */
  public fun inlinePolicies(): Map<String, PolicyDocument> =
      unwrap(this).getInlinePolicies()?.mapValues{PolicyDocument.wrap(it.value)} ?: emptyMap()

  /**
   * A list of managed policies associated with this role.
   *
   * You can add managed policies later using
   * `addManagedPolicy(ManagedPolicy.fromAwsManagedPolicyName(policyName))`.
   *
   * Default: - No managed policies.
   */
  public fun managedPolicies(): List<IManagedPolicy> =
      unwrap(this).getManagedPolicies()?.map(IManagedPolicy::wrap) ?: emptyList()

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
   */
  public fun maxSessionDuration(): Duration? =
      unwrap(this).getMaxSessionDuration()?.let(Duration::wrap)

  /**
   * The path associated with this role.
   *
   * For information about IAM paths, see
   * Friendly Names and Paths in IAM User Guide.
   *
   * Default: /
   */
  public fun path(): String? = unwrap(this).getPath()

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
   */
  public fun permissionsBoundary(): IManagedPolicy? =
      unwrap(this).getPermissionsBoundary()?.let(IManagedPolicy::wrap)

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
   */
  public fun roleName(): String? = unwrap(this).getRoleName()

  /**
   * A builder for [RoleProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param assumedBy The IAM principal (i.e. `new ServicePrincipal('sns.amazonaws.com')`) which
     * can assume this role. 
     * You can later modify the assume role policy document by accessing it via
     * the `assumeRolePolicy` property.
     */
    public fun assumedBy(assumedBy: IPrincipal)

    /**
     * @param description A description of the role.
     * It can be up to 1000 characters long.
     */
    public fun description(description: String)

    /**
     * @param externalIds List of IDs that the role assumer needs to provide one of when assuming
     * this role.
     * If the configured and provided external IDs do not match, the
     * AssumeRole operation will fail.
     */
    public fun externalIds(externalIds: List<String>)

    /**
     * @param externalIds List of IDs that the role assumer needs to provide one of when assuming
     * this role.
     * If the configured and provided external IDs do not match, the
     * AssumeRole operation will fail.
     */
    public fun externalIds(vararg externalIds: String)

    /**
     * @param inlinePolicies A list of named policies to inline into this role.
     * These policies will be
     * created with the role, whereas those added by `addToPolicy` are added
     * using a separate CloudFormation resource (allowing a way around circular
     * dependencies that could otherwise be introduced).
     */
    public fun inlinePolicies(inlinePolicies: Map<String, PolicyDocument>)

    /**
     * @param managedPolicies A list of managed policies associated with this role.
     * You can add managed policies later using
     * `addManagedPolicy(ManagedPolicy.fromAwsManagedPolicyName(policyName))`.
     */
    public fun managedPolicies(managedPolicies: List<IManagedPolicy>)

    /**
     * @param managedPolicies A list of managed policies associated with this role.
     * You can add managed policies later using
     * `addManagedPolicy(ManagedPolicy.fromAwsManagedPolicyName(policyName))`.
     */
    public fun managedPolicies(vararg managedPolicies: IManagedPolicy)

    /**
     * @param maxSessionDuration The maximum session duration that you want to set for the specified
     * role.
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
     */
    public fun maxSessionDuration(maxSessionDuration: Duration)

    /**
     * @param path The path associated with this role.
     * For information about IAM paths, see
     * Friendly Names and Paths in IAM User Guide.
     */
    public fun path(path: String)

    /**
     * @param permissionsBoundary AWS supports permissions boundaries for IAM entities (users or
     * roles).
     * A permissions boundary is an advanced feature for using a managed policy
     * to set the maximum permissions that an identity-based policy can grant to
     * an IAM entity. An entity's permissions boundary allows it to perform only
     * the actions that are allowed by both its identity-based policies and its
     * permissions boundaries.
     */
    public fun permissionsBoundary(permissionsBoundary: IManagedPolicy)

    /**
     * @param roleName A name for the IAM role.
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
     */
    public fun roleName(roleName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iam.RoleProps.Builder =
        software.amazon.awscdk.services.iam.RoleProps.builder()

    /**
     * @param assumedBy The IAM principal (i.e. `new ServicePrincipal('sns.amazonaws.com')`) which
     * can assume this role. 
     * You can later modify the assume role policy document by accessing it via
     * the `assumeRolePolicy` property.
     */
    override fun assumedBy(assumedBy: IPrincipal) {
      cdkBuilder.assumedBy(assumedBy.let(IPrincipal::unwrap))
    }

    /**
     * @param description A description of the role.
     * It can be up to 1000 characters long.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param externalIds List of IDs that the role assumer needs to provide one of when assuming
     * this role.
     * If the configured and provided external IDs do not match, the
     * AssumeRole operation will fail.
     */
    override fun externalIds(externalIds: List<String>) {
      cdkBuilder.externalIds(externalIds)
    }

    /**
     * @param externalIds List of IDs that the role assumer needs to provide one of when assuming
     * this role.
     * If the configured and provided external IDs do not match, the
     * AssumeRole operation will fail.
     */
    override fun externalIds(vararg externalIds: String): Unit = externalIds(externalIds.toList())

    /**
     * @param inlinePolicies A list of named policies to inline into this role.
     * These policies will be
     * created with the role, whereas those added by `addToPolicy` are added
     * using a separate CloudFormation resource (allowing a way around circular
     * dependencies that could otherwise be introduced).
     */
    override fun inlinePolicies(inlinePolicies: Map<String, PolicyDocument>) {
      cdkBuilder.inlinePolicies(inlinePolicies.mapValues{PolicyDocument.unwrap(it.value)})
    }

    /**
     * @param managedPolicies A list of managed policies associated with this role.
     * You can add managed policies later using
     * `addManagedPolicy(ManagedPolicy.fromAwsManagedPolicyName(policyName))`.
     */
    override fun managedPolicies(managedPolicies: List<IManagedPolicy>) {
      cdkBuilder.managedPolicies(managedPolicies.map(IManagedPolicy::unwrap))
    }

    /**
     * @param managedPolicies A list of managed policies associated with this role.
     * You can add managed policies later using
     * `addManagedPolicy(ManagedPolicy.fromAwsManagedPolicyName(policyName))`.
     */
    override fun managedPolicies(vararg managedPolicies: IManagedPolicy): Unit =
        managedPolicies(managedPolicies.toList())

    /**
     * @param maxSessionDuration The maximum session duration that you want to set for the specified
     * role.
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
     */
    override fun maxSessionDuration(maxSessionDuration: Duration) {
      cdkBuilder.maxSessionDuration(maxSessionDuration.let(Duration::unwrap))
    }

    /**
     * @param path The path associated with this role.
     * For information about IAM paths, see
     * Friendly Names and Paths in IAM User Guide.
     */
    override fun path(path: String) {
      cdkBuilder.path(path)
    }

    /**
     * @param permissionsBoundary AWS supports permissions boundaries for IAM entities (users or
     * roles).
     * A permissions boundary is an advanced feature for using a managed policy
     * to set the maximum permissions that an identity-based policy can grant to
     * an IAM entity. An entity's permissions boundary allows it to perform only
     * the actions that are allowed by both its identity-based policies and its
     * permissions boundaries.
     */
    override fun permissionsBoundary(permissionsBoundary: IManagedPolicy) {
      cdkBuilder.permissionsBoundary(permissionsBoundary.let(IManagedPolicy::unwrap))
    }

    /**
     * @param roleName A name for the IAM role.
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
     */
    override fun roleName(roleName: String) {
      cdkBuilder.roleName(roleName)
    }

    public fun build(): software.amazon.awscdk.services.iam.RoleProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.iam.RoleProps,
  ) : CdkObject(cdkObject), RoleProps {
    /**
     * The IAM principal (i.e. `new ServicePrincipal('sns.amazonaws.com')`) which can assume this
     * role.
     *
     * You can later modify the assume role policy document by accessing it via
     * the `assumeRolePolicy` property.
     */
    override fun assumedBy(): IPrincipal = unwrap(this).getAssumedBy().let(IPrincipal::wrap)

    /**
     * A description of the role.
     *
     * It can be up to 1000 characters long.
     *
     * Default: - No description.
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * List of IDs that the role assumer needs to provide one of when assuming this role.
     *
     * If the configured and provided external IDs do not match, the
     * AssumeRole operation will fail.
     *
     * Default: No external ID required
     */
    override fun externalIds(): List<String> = unwrap(this).getExternalIds() ?: emptyList()

    /**
     * A list of named policies to inline into this role.
     *
     * These policies will be
     * created with the role, whereas those added by `addToPolicy` are added
     * using a separate CloudFormation resource (allowing a way around circular
     * dependencies that could otherwise be introduced).
     *
     * Default: - No policy is inlined in the Role resource.
     */
    override fun inlinePolicies(): Map<String, PolicyDocument> =
        unwrap(this).getInlinePolicies()?.mapValues{PolicyDocument.wrap(it.value)} ?: emptyMap()

    /**
     * A list of managed policies associated with this role.
     *
     * You can add managed policies later using
     * `addManagedPolicy(ManagedPolicy.fromAwsManagedPolicyName(policyName))`.
     *
     * Default: - No managed policies.
     */
    override fun managedPolicies(): List<IManagedPolicy> =
        unwrap(this).getManagedPolicies()?.map(IManagedPolicy::wrap) ?: emptyList()

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
     */
    override fun maxSessionDuration(): Duration? =
        unwrap(this).getMaxSessionDuration()?.let(Duration::wrap)

    /**
     * The path associated with this role.
     *
     * For information about IAM paths, see
     * Friendly Names and Paths in IAM User Guide.
     *
     * Default: /
     */
    override fun path(): String? = unwrap(this).getPath()

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
     */
    override fun permissionsBoundary(): IManagedPolicy? =
        unwrap(this).getPermissionsBoundary()?.let(IManagedPolicy::wrap)

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
     */
    override fun roleName(): String? = unwrap(this).getRoleName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): RoleProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.RoleProps): RoleProps =
        CdkObjectWrappers.wrap(cdkObject) as? RoleProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: RoleProps): software.amazon.awscdk.services.iam.RoleProps =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.iam.RoleProps
  }
}
