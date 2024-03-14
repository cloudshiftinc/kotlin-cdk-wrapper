package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface StageProps {
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
   */
  public fun env(): Environment? = unwrap(this).getEnv()?.let(Environment::wrap)

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
   */
  public fun outdir(): String? = unwrap(this).getOutdir()

  /**
   * Options for applying a permissions boundary to all IAM Roles and Users created within this
   * Stage.
   *
   * Default: - no permissions boundary is applied
   */
  public fun permissionsBoundary(): PermissionsBoundary? =
      unwrap(this).getPermissionsBoundary()?.let(PermissionsBoundary::wrap)

  /**
   * Validation plugins to run during synthesis.
   *
   * If any plugin reports any violation,
   * synthesis will be interrupted and the report displayed to the user.
   *
   * Default: - no validation plugins are used
   */
  public fun policyValidationBeta1(): List<IPolicyValidationPluginBeta1> =
      unwrap(this).getPolicyValidationBeta1()?.map(IPolicyValidationPluginBeta1::wrap) ?:
      emptyList()

  /**
   * Name of this stage.
   *
   * Default: - Derived from the id.
   */
  public fun stageName(): String? = unwrap(this).getStageName()

  /**
   * A builder for [StageProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param env Default AWS environment (account/region) for `Stack`s in this `Stage`.
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
     */
    public fun env(env: Environment)

    /**
     * @param env Default AWS environment (account/region) for `Stack`s in this `Stage`.
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
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6d5d98f94c57171b02019bdc4ddef1b892e8c2707d946056f79dfbd7b0be7b3a")
    public fun env(env: Environment.Builder.() -> Unit)

    /**
     * @param outdir The output directory into which to emit synthesized artifacts.
     * Can only be specified if this stage is the root stage (the app). If this is
     * specified and this stage is nested within another stage, an error will be
     * thrown.
     */
    public fun outdir(outdir: String)

    /**
     * @param permissionsBoundary Options for applying a permissions boundary to all IAM Roles and
     * Users created within this Stage.
     */
    public fun permissionsBoundary(permissionsBoundary: PermissionsBoundary)

    /**
     * @param policyValidationBeta1 Validation plugins to run during synthesis.
     * If any plugin reports any violation,
     * synthesis will be interrupted and the report displayed to the user.
     */
    public fun policyValidationBeta1(policyValidationBeta1: List<IPolicyValidationPluginBeta1>)

    /**
     * @param policyValidationBeta1 Validation plugins to run during synthesis.
     * If any plugin reports any violation,
     * synthesis will be interrupted and the report displayed to the user.
     */
    public fun policyValidationBeta1(vararg policyValidationBeta1: IPolicyValidationPluginBeta1)

    /**
     * @param stageName Name of this stage.
     */
    public fun stageName(stageName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.StageProps.Builder =
        software.amazon.awscdk.StageProps.builder()

    /**
     * @param env Default AWS environment (account/region) for `Stack`s in this `Stage`.
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
     */
    override fun env(env: Environment) {
      cdkBuilder.env(env.let(Environment::unwrap))
    }

    /**
     * @param env Default AWS environment (account/region) for `Stack`s in this `Stage`.
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
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6d5d98f94c57171b02019bdc4ddef1b892e8c2707d946056f79dfbd7b0be7b3a")
    override fun env(env: Environment.Builder.() -> Unit): Unit = env(Environment(env))

    /**
     * @param outdir The output directory into which to emit synthesized artifacts.
     * Can only be specified if this stage is the root stage (the app). If this is
     * specified and this stage is nested within another stage, an error will be
     * thrown.
     */
    override fun outdir(outdir: String) {
      cdkBuilder.outdir(outdir)
    }

    /**
     * @param permissionsBoundary Options for applying a permissions boundary to all IAM Roles and
     * Users created within this Stage.
     */
    override fun permissionsBoundary(permissionsBoundary: PermissionsBoundary) {
      cdkBuilder.permissionsBoundary(permissionsBoundary.let(PermissionsBoundary::unwrap))
    }

    /**
     * @param policyValidationBeta1 Validation plugins to run during synthesis.
     * If any plugin reports any violation,
     * synthesis will be interrupted and the report displayed to the user.
     */
    override fun policyValidationBeta1(policyValidationBeta1: List<IPolicyValidationPluginBeta1>) {
      cdkBuilder.policyValidationBeta1(policyValidationBeta1.map(IPolicyValidationPluginBeta1::unwrap))
    }

    /**
     * @param policyValidationBeta1 Validation plugins to run during synthesis.
     * If any plugin reports any violation,
     * synthesis will be interrupted and the report displayed to the user.
     */
    override fun policyValidationBeta1(vararg policyValidationBeta1: IPolicyValidationPluginBeta1):
        Unit = policyValidationBeta1(policyValidationBeta1.toList())

    /**
     * @param stageName Name of this stage.
     */
    override fun stageName(stageName: String) {
      cdkBuilder.stageName(stageName)
    }

    public fun build(): software.amazon.awscdk.StageProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.StageProps,
  ) : CdkObject(cdkObject), StageProps {
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
     */
    override fun env(): Environment? = unwrap(this).getEnv()?.let(Environment::wrap)

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
     */
    override fun outdir(): String? = unwrap(this).getOutdir()

    /**
     * Options for applying a permissions boundary to all IAM Roles and Users created within this
     * Stage.
     *
     * Default: - no permissions boundary is applied
     */
    override fun permissionsBoundary(): PermissionsBoundary? =
        unwrap(this).getPermissionsBoundary()?.let(PermissionsBoundary::wrap)

    /**
     * Validation plugins to run during synthesis.
     *
     * If any plugin reports any violation,
     * synthesis will be interrupted and the report displayed to the user.
     *
     * Default: - no validation plugins are used
     */
    override fun policyValidationBeta1(): List<IPolicyValidationPluginBeta1> =
        unwrap(this).getPolicyValidationBeta1()?.map(IPolicyValidationPluginBeta1::wrap) ?:
        emptyList()

    /**
     * Name of this stage.
     *
     * Default: - Derived from the id.
     */
    override fun stageName(): String? = unwrap(this).getStageName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): StageProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.StageProps): StageProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: StageProps): software.amazon.awscdk.StageProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.StageProps
  }
}
