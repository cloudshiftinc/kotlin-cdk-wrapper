@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline.actions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.String
import kotlin.Unit

/**
 * Properties for configuring self-managed permissions.
 *
 * Example:
 *
 * ```
 * IRole existingAdminRole = Role.fromRoleName(this, "AdminRole",
 * "AWSCloudFormationStackSetAdministrationRole");
 * StackSetDeploymentModel deploymentModel =
 * StackSetDeploymentModel.selfManaged(SelfManagedDeploymentProps.builder()
 * // Use an existing Role. Leave this out to create a new Role.
 * .administrationRole(existingAdminRole)
 * .build());
 * ```
 */
public interface SelfManagedDeploymentProps {
  /**
   * The IAM role in the administrator account used to assume execution roles in the target
   * accounts.
   *
   * You must create this role before using the StackSet action.
   *
   * The role needs to be assumable by CloudFormation, and it needs to be able
   * to `sts:AssumeRole` each of the execution roles (whose names are specified
   * in the `executionRoleName` parameter) in each of the target accounts.
   *
   * If you do not specify the role, we assume you have created a role named
   * `AWSCloudFormationStackSetAdministrationRole`.
   *
   * Default: - Assume an existing role named `AWSCloudFormationStackSetAdministrationRole` in the
   * same account as the pipeline.
   *
   * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs-self-managed.html)
   */
  public fun administrationRole(): IRole? = unwrap(this).getAdministrationRole()?.let(IRole::wrap)

  /**
   * The name of the IAM role in the target accounts used to perform stack set operations.
   *
   * You must create these roles in each of the target accounts before using the
   * StackSet action.
   *
   * The roles need to be assumable by by the `administrationRole`, and need to
   * have the permissions necessary to successfully create and modify the
   * resources that the subsequent CloudFormation deployments need.
   * Administrator permissions would be commonly granted to these, but if you can
   * scope the permissions down frome there you would be safer.
   *
   * Default: AWSCloudFormationStackSetExecutionRole
   *
   * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs-self-managed.html)
   */
  public fun executionRoleName(): String? = unwrap(this).getExecutionRoleName()

  /**
   * A builder for [SelfManagedDeploymentProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param administrationRole The IAM role in the administrator account used to assume execution
     * roles in the target accounts.
     * You must create this role before using the StackSet action.
     *
     * The role needs to be assumable by CloudFormation, and it needs to be able
     * to `sts:AssumeRole` each of the execution roles (whose names are specified
     * in the `executionRoleName` parameter) in each of the target accounts.
     *
     * If you do not specify the role, we assume you have created a role named
     * `AWSCloudFormationStackSetAdministrationRole`.
     */
    public fun administrationRole(administrationRole: IRole)

    /**
     * @param executionRoleName The name of the IAM role in the target accounts used to perform
     * stack set operations.
     * You must create these roles in each of the target accounts before using the
     * StackSet action.
     *
     * The roles need to be assumable by by the `administrationRole`, and need to
     * have the permissions necessary to successfully create and modify the
     * resources that the subsequent CloudFormation deployments need.
     * Administrator permissions would be commonly granted to these, but if you can
     * scope the permissions down frome there you would be safer.
     */
    public fun executionRoleName(executionRoleName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codepipeline.actions.SelfManagedDeploymentProps.Builder =
        software.amazon.awscdk.services.codepipeline.actions.SelfManagedDeploymentProps.builder()

    /**
     * @param administrationRole The IAM role in the administrator account used to assume execution
     * roles in the target accounts.
     * You must create this role before using the StackSet action.
     *
     * The role needs to be assumable by CloudFormation, and it needs to be able
     * to `sts:AssumeRole` each of the execution roles (whose names are specified
     * in the `executionRoleName` parameter) in each of the target accounts.
     *
     * If you do not specify the role, we assume you have created a role named
     * `AWSCloudFormationStackSetAdministrationRole`.
     */
    override fun administrationRole(administrationRole: IRole) {
      cdkBuilder.administrationRole(administrationRole.let(IRole::unwrap))
    }

    /**
     * @param executionRoleName The name of the IAM role in the target accounts used to perform
     * stack set operations.
     * You must create these roles in each of the target accounts before using the
     * StackSet action.
     *
     * The roles need to be assumable by by the `administrationRole`, and need to
     * have the permissions necessary to successfully create and modify the
     * resources that the subsequent CloudFormation deployments need.
     * Administrator permissions would be commonly granted to these, but if you can
     * scope the permissions down frome there you would be safer.
     */
    override fun executionRoleName(executionRoleName: String) {
      cdkBuilder.executionRoleName(executionRoleName)
    }

    public fun build():
        software.amazon.awscdk.services.codepipeline.actions.SelfManagedDeploymentProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.codepipeline.actions.SelfManagedDeploymentProps,
  ) : CdkObject(cdkObject), SelfManagedDeploymentProps {
    /**
     * The IAM role in the administrator account used to assume execution roles in the target
     * accounts.
     *
     * You must create this role before using the StackSet action.
     *
     * The role needs to be assumable by CloudFormation, and it needs to be able
     * to `sts:AssumeRole` each of the execution roles (whose names are specified
     * in the `executionRoleName` parameter) in each of the target accounts.
     *
     * If you do not specify the role, we assume you have created a role named
     * `AWSCloudFormationStackSetAdministrationRole`.
     *
     * Default: - Assume an existing role named `AWSCloudFormationStackSetAdministrationRole` in the
     * same account as the pipeline.
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs-self-managed.html)
     */
    override fun administrationRole(): IRole? =
        unwrap(this).getAdministrationRole()?.let(IRole::wrap)

    /**
     * The name of the IAM role in the target accounts used to perform stack set operations.
     *
     * You must create these roles in each of the target accounts before using the
     * StackSet action.
     *
     * The roles need to be assumable by by the `administrationRole`, and need to
     * have the permissions necessary to successfully create and modify the
     * resources that the subsequent CloudFormation deployments need.
     * Administrator permissions would be commonly granted to these, but if you can
     * scope the permissions down frome there you would be safer.
     *
     * Default: AWSCloudFormationStackSetExecutionRole
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs-self-managed.html)
     */
    override fun executionRoleName(): String? = unwrap(this).getExecutionRoleName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): SelfManagedDeploymentProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.SelfManagedDeploymentProps):
        SelfManagedDeploymentProps = CdkObjectWrappers.wrap(cdkObject) as?
        SelfManagedDeploymentProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: SelfManagedDeploymentProps):
        software.amazon.awscdk.services.codepipeline.actions.SelfManagedDeploymentProps = (wrapped
        as CdkObject).cdkObject as
        software.amazon.awscdk.services.codepipeline.actions.SelfManagedDeploymentProps
  }
}
