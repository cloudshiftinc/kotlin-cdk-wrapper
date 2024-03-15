@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.cxapi.CloudAssembly
import io.cloudshiftdev.constructs.IConstruct
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * An abstract application modeling unit consisting of Stacks that should be deployed together.
 *
 * Derive a subclass of `Stage` and use it to model a single instance of your
 * application.
 *
 * You can then instantiate your subclass multiple times to model multiple
 * copies of your application which should be be deployed to different
 * environments.
 *
 * Example:
 *
 * ```
 * CodePipeline pipeline;
 * MyApplicationStage preprod = new MyApplicationStage(this, "PreProd");
 * MyApplicationStage prod = new MyApplicationStage(this, "Prod");
 * pipeline.addStage(preprod, AddStageOpts.builder()
 * .post(List.of(
 * ShellStep.Builder.create("Validate Endpoint")
 * .commands(List.of("curl -Ssf https://my.webservice.com/"))
 * .build()))
 * .build());
 * pipeline.addStage(prod, AddStageOpts.builder()
 * .pre(List.of(
 * new ManualApprovalStep("PromoteToProd")))
 * .build());
 * ```
 */
public open class Stage internal constructor(
  internal override val cdkObject: software.amazon.awscdk.Stage,
) : CloudshiftdevConstructsConstruct(cdkObject) {
  /**
   * The default account for all resources defined within this stage.
   */
  public open fun account(): String? = unwrap(this).getAccount()

  /**
   * Artifact ID of the assembly if it is a nested stage. The root stage (app) will return an empty
   * string.
   *
   * Derived from the construct path.
   */
  public open fun artifactId(): String = unwrap(this).getArtifactId()

  /**
   * The cloud assembly asset output directory.
   */
  public open fun assetOutdir(): String = unwrap(this).getAssetOutdir()

  /**
   * The cloud assembly output directory.
   */
  public open fun outdir(): String = unwrap(this).getOutdir()

  /**
   * The parent stage or `undefined` if this is the app.
   *
   * * 
   */
  public open fun parentStage(): Stage? = unwrap(this).getParentStage()?.let(Stage::wrap)

  /**
   * Validation plugins to run during synthesis.
   *
   * If any plugin reports any violation,
   * synthesis will be interrupted and the report displayed to the user.
   *
   * Default: - no validation plugins are used
   */
  public open fun policyValidationBeta1(): List<IPolicyValidationPluginBeta1> =
      unwrap(this).getPolicyValidationBeta1().map(IPolicyValidationPluginBeta1::wrap)

  /**
   * The default region for all resources defined within this stage.
   */
  public open fun region(): String? = unwrap(this).getRegion()

  /**
   * The name of the stage.
   *
   * Based on names of the parent stages separated by
   * hypens.
   */
  public open fun stageName(): String = unwrap(this).getStageName()

  /**
   * Synthesize this stage into a cloud assembly.
   *
   * Once an assembly has been synthesized, it cannot be modified. Subsequent
   * calls will return the same assembly.
   *
   * @param options
   */
  public open fun synth(): CloudAssembly = unwrap(this).synth().let(CloudAssembly::wrap)

  /**
   * Synthesize this stage into a cloud assembly.
   *
   * Once an assembly has been synthesized, it cannot be modified. Subsequent
   * calls will return the same assembly.
   *
   * @param options
   */
  public open fun synth(options: StageSynthesisOptions): CloudAssembly =
      unwrap(this).synth(options.let(StageSynthesisOptions::unwrap)).let(CloudAssembly::wrap)

  /**
   * Synthesize this stage into a cloud assembly.
   *
   * Once an assembly has been synthesized, it cannot be modified. Subsequent
   * calls will return the same assembly.
   *
   * @param options
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("51a65fc739ba0b8c9800ffaf94d00db702d5465092951431a38b37419a2e2a02")
  public open fun synth(options: StageSynthesisOptions.Builder.() -> Unit): CloudAssembly =
      synth(StageSynthesisOptions(options))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.Stage].
   */
  @CdkDslMarker
  public interface Builder {
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
    public fun env(env: Environment)

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
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3d6fb3bfd47ec19372384a721dfafbb2e623d906353b629e5d3f9b8ecc34bd33")
    public fun env(env: Environment.Builder.() -> Unit)

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
    public fun outdir(outdir: String)

    /**
     * Options for applying a permissions boundary to all IAM Roles and Users created within this
     * Stage.
     *
     * Default: - no permissions boundary is applied
     *
     * @param permissionsBoundary Options for applying a permissions boundary to all IAM Roles and
     * Users created within this Stage. 
     */
    public fun permissionsBoundary(permissionsBoundary: PermissionsBoundary)

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
    public fun policyValidationBeta1(policyValidationBeta1: List<IPolicyValidationPluginBeta1>)

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
    public fun policyValidationBeta1(vararg policyValidationBeta1: IPolicyValidationPluginBeta1)

    /**
     * Name of this stage.
     *
     * Default: - Derived from the id.
     *
     * @param stageName Name of this stage. 
     */
    public fun stageName(stageName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.Stage.Builder =
        software.amazon.awscdk.Stage.Builder.create(scope, id)

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
    override fun env(env: Environment) {
      cdkBuilder.env(env.let(Environment::unwrap))
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
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3d6fb3bfd47ec19372384a721dfafbb2e623d906353b629e5d3f9b8ecc34bd33")
    override fun env(env: Environment.Builder.() -> Unit): Unit = env(Environment(env))

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
    override fun outdir(outdir: String) {
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
    override fun permissionsBoundary(permissionsBoundary: PermissionsBoundary) {
      cdkBuilder.permissionsBoundary(permissionsBoundary.let(PermissionsBoundary::unwrap))
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
    override fun policyValidationBeta1(policyValidationBeta1: List<IPolicyValidationPluginBeta1>) {
      cdkBuilder.policyValidationBeta1(policyValidationBeta1.map(IPolicyValidationPluginBeta1::unwrap))
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
    override fun policyValidationBeta1(vararg policyValidationBeta1: IPolicyValidationPluginBeta1):
        Unit = policyValidationBeta1(policyValidationBeta1.toList())

    /**
     * Name of this stage.
     *
     * Default: - Derived from the id.
     *
     * @param stageName Name of this stage. 
     */
    override fun stageName(stageName: String) {
      cdkBuilder.stageName(stageName)
    }

    public fun build(): software.amazon.awscdk.Stage = cdkBuilder.build()
  }

  public companion object {
    public fun isStage(x: Any): Boolean = software.amazon.awscdk.Stage.isStage(x)

    public fun of(construct: IConstruct): Stage? =
        software.amazon.awscdk.Stage.of(construct.let(IConstruct::unwrap))?.let(Stage::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): Stage {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return Stage(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.Stage): Stage = Stage(cdkObject)

    internal fun unwrap(wrapped: Stage): software.amazon.awscdk.Stage = wrapped.cdkObject
  }
}
