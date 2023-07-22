@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.iam.IManagedPolicy
import software.amazon.awscdk.services.iam.IPrincipal
import software.amazon.awscdk.services.iam.LazyRole
import software.amazon.awscdk.services.iam.PolicyDocument
import software.constructs.Construct

@CdkDslMarker
public class LazyRoleDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: LazyRole.Builder = LazyRole.Builder.create(scope, id)

  private val _externalIds: MutableList<String> = mutableListOf()

  private val _managedPolicies: MutableList<IManagedPolicy> = mutableListOf()

  /**
   * The IAM principal (i.e. `new ServicePrincipal('sns.amazonaws.com')`) which can assume this
   * role.
   *
   * You can later modify the assume role policy document by accessing it via
   * the `assumeRolePolicy` property.
   *
   * @param assumedBy The IAM principal (i.e. `new ServicePrincipal('sns.amazonaws.com')`) which can
   * assume this role. 
   */
  public fun assumedBy(assumedBy: IPrincipal) {
    cdkBuilder.assumedBy(assumedBy)
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
  public fun description(description: String) {
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
   * @param externalIds List of IDs that the role assumer needs to provide one of when assuming this
   * role. 
   */
  public fun externalIds(vararg externalIds: String) {
    _externalIds.addAll(listOf(*externalIds))
  }

  /**
   * List of IDs that the role assumer needs to provide one of when assuming this role.
   *
   * If the configured and provided external IDs do not match, the
   * AssumeRole operation will fail.
   *
   * Default: No external ID required
   *
   * @param externalIds List of IDs that the role assumer needs to provide one of when assuming this
   * role. 
   */
  public fun externalIds(externalIds: Collection<String>) {
    _externalIds.addAll(externalIds)
  }

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
  public fun inlinePolicies(inlinePolicies: Map<String, PolicyDocument>) {
    cdkBuilder.inlinePolicies(inlinePolicies)
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
  public fun managedPolicies(vararg managedPolicies: IManagedPolicy) {
    _managedPolicies.addAll(listOf(*managedPolicies))
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
  public fun managedPolicies(managedPolicies: Collection<IManagedPolicy>) {
    _managedPolicies.addAll(managedPolicies)
  }

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
  public fun maxSessionDuration(maxSessionDuration: Duration) {
    cdkBuilder.maxSessionDuration(maxSessionDuration)
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
  public fun path(path: String) {
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
  public fun permissionsBoundary(permissionsBoundary: IManagedPolicy) {
    cdkBuilder.permissionsBoundary(permissionsBoundary)
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
  public fun roleName(roleName: String) {
    cdkBuilder.roleName(roleName)
  }

  public fun build(): LazyRole {
    if(_externalIds.isNotEmpty()) cdkBuilder.externalIds(_externalIds)
    if(_managedPolicies.isNotEmpty()) cdkBuilder.managedPolicies(_managedPolicies)
    return cdkBuilder.build()
  }
}
