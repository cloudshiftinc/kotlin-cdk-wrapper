@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.Environment
import software.amazon.awscdk.IPolicyValidationPluginBeta1
import software.amazon.awscdk.PermissionsBoundary
import software.amazon.awscdk.Stage
import software.constructs.Construct

@CdkDslMarker
public class StageDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: Stage.Builder = Stage.Builder.create(scope, id)

  private val _policyValidationBeta1: MutableList<IPolicyValidationPluginBeta1> = mutableListOf()

  /**
   * Default AWS environment (account/region) for `Stack`s in this `Stage`.
   *
   * Stacks defined inside this `Stage` with either `region` or `account` missing
   * from its env will use the corresponding field given here.
   *
   * If either `region` or `account`is is not configured for `Stack` (either on
   * the `Stack` itself or on the containing `Stage`), the Stack will be
   * *environment-agnostic*.
   *
   * Environment-agnostic stacks can be deployed to any environment, may not be
   * able to take advantage of all features of the CDK. For example, they will
   * not be able to use environmental context lookups, will not automatically
   * translate Service Principals to the right format based on the environment's
   * AWS partition, and other such enhancements.
   *
   * Default: - The environments should be configured on the `Stack`s.
   *
   * Example:
   *
   * ```
   * // Use a concrete account and region to deploy this Stage to
   * // Use a concrete account and region to deploy this Stage to
   * Stage.Builder.create(app, "Stage1")
   * .env(Environment.builder().account("123456789012").region("us-east-1").build())
   * .build();
   * // Use the CLI's current credentials to determine the target environment
   * // Use the CLI's current credentials to determine the target environment
   * Stage.Builder.create(app, "Stage2")
   * .env(Environment.builder().account(process.getEnv().getCDK_DEFAULT_ACCOUNT()).region(process.getEnv().getCDK_DEFAULT_REGION()).build())
   * .build();
   * ```
   *
   * @param env Default AWS environment (account/region) for `Stack`s in this `Stage`. 
   */
  public fun env(env: EnvironmentDsl.() -> Unit = {}) {
    val builder = EnvironmentDsl()
    builder.apply(env)
    cdkBuilder.env(builder.build())
  }

  /**
   * Default AWS environment (account/region) for `Stack`s in this `Stage`.
   *
   * Stacks defined inside this `Stage` with either `region` or `account` missing
   * from its env will use the corresponding field given here.
   *
   * If either `region` or `account`is is not configured for `Stack` (either on
   * the `Stack` itself or on the containing `Stage`), the Stack will be
   * *environment-agnostic*.
   *
   * Environment-agnostic stacks can be deployed to any environment, may not be
   * able to take advantage of all features of the CDK. For example, they will
   * not be able to use environmental context lookups, will not automatically
   * translate Service Principals to the right format based on the environment's
   * AWS partition, and other such enhancements.
   *
   * Default: - The environments should be configured on the `Stack`s.
   *
   * Example:
   *
   * ```
   * // Use a concrete account and region to deploy this Stage to
   * // Use a concrete account and region to deploy this Stage to
   * Stage.Builder.create(app, "Stage1")
   * .env(Environment.builder().account("123456789012").region("us-east-1").build())
   * .build();
   * // Use the CLI's current credentials to determine the target environment
   * // Use the CLI's current credentials to determine the target environment
   * Stage.Builder.create(app, "Stage2")
   * .env(Environment.builder().account(process.getEnv().getCDK_DEFAULT_ACCOUNT()).region(process.getEnv().getCDK_DEFAULT_REGION()).build())
   * .build();
   * ```
   *
   * @param env Default AWS environment (account/region) for `Stack`s in this `Stage`. 
   */
  public fun env(env: Environment) {
    cdkBuilder.env(env)
  }

  /**
   * The output directory into which to emit synthesized artifacts.
   *
   * Can only be specified if this stage is the root stage (the app). If this is
   * specified and this stage is nested within another stage, an error will be
   * thrown.
   *
   * Default: - for nested stages, outdir will be determined as a relative
   * directory to the outdir of the app. For apps, if outdir is not specified, a
   * temporary directory will be created.
   *
   * @param outdir The output directory into which to emit synthesized artifacts. 
   */
  public fun outdir(outdir: String) {
    cdkBuilder.outdir(outdir)
  }

  /**
   * Options for applying a permissions boundary to all IAM Roles and Users created within this
   * Stage.
   *
   * Default: - no permissions boundary is applied
   *
   * @param permissionsBoundary Options for applying a permissions boundary to all IAM Roles and
   * Users created within this Stage. 
   */
  public fun permissionsBoundary(permissionsBoundary: PermissionsBoundary) {
    cdkBuilder.permissionsBoundary(permissionsBoundary)
  }

  /**
   * Validation plugins to run during synthesis.
   *
   * If any plugin reports any violation,
   * synthesis will be interrupted and the report displayed to the user.
   *
   * Default: - no validation plugins are used
   *
   * @param policyValidationBeta1 Validation plugins to run during synthesis. 
   */
  public fun policyValidationBeta1(vararg policyValidationBeta1: IPolicyValidationPluginBeta1) {
    _policyValidationBeta1.addAll(listOf(*policyValidationBeta1))
  }

  /**
   * Validation plugins to run during synthesis.
   *
   * If any plugin reports any violation,
   * synthesis will be interrupted and the report displayed to the user.
   *
   * Default: - no validation plugins are used
   *
   * @param policyValidationBeta1 Validation plugins to run during synthesis. 
   */
  public
      fun policyValidationBeta1(policyValidationBeta1: Collection<IPolicyValidationPluginBeta1>) {
    _policyValidationBeta1.addAll(policyValidationBeta1)
  }

  /**
   * Name of this stage.
   *
   * Default: - Derived from the id.
   *
   * @param stageName Name of this stage. 
   */
  public fun stageName(stageName: String) {
    cdkBuilder.stageName(stageName)
  }

  public fun build(): Stage {
    if(_policyValidationBeta1.isNotEmpty()) cdkBuilder.policyValidationBeta1(_policyValidationBeta1)
    return cdkBuilder.build()
  }
}
