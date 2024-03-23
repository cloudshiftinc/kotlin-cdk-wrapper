@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

/**
 * Initialization props for apps.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.s3.BucketEncryption;
 * App app = App.Builder.create()
 * .defaultStackSynthesizer(AppStagingSynthesizer.defaultResources(DefaultResourcesOptions.builder()
 * .appId("my-app-id")
 * .stagingBucketEncryption(BucketEncryption.S3_MANAGED)
 * .deploymentIdentities(DeploymentIdentities.cliCredentials())
 * .build()))
 * .build();
 * ```
 */
public interface AppProps {
  /**
   * Include runtime versioning information in the Stacks of this app.
   *
   * Default: Value of 'aws:cdk:version-reporting' context key
   */
  public fun analyticsReporting(): Boolean? = unwrap(this).getAnalyticsReporting()

  /**
   * Automatically call `synth()` before the program exits.
   *
   * If you set this, you don't have to call `synth()` explicitly. Note that
   * this feature is only available for certain programming languages, and
   * calling `synth()` is still recommended.
   *
   * Default: true if running via CDK CLI (`CDK_OUTDIR` is set), `false`
   * otherwise
   */
  public fun autoSynth(): Boolean? = unwrap(this).getAutoSynth()

  /**
   * Additional context values for the application.
   *
   * Context set by the CLI or the `context` key in `cdk.json` has precedence.
   *
   * Context can be read from any construct using `node.getContext(key)`.
   *
   * Default: - no additional context
   */
  public fun context(): Map<String, Any> = unwrap(this).getContext() ?: emptyMap()

  /**
   * The stack synthesizer to use by default for all Stacks in the App.
   *
   * The Stack Synthesizer controls aspects of synthesis and deployment,
   * like how assets are referenced and what IAM roles to use. For more
   * information, see the README of the main CDK package.
   *
   * Default: - A `DefaultStackSynthesizer` with default settings
   */
  public fun defaultStackSynthesizer(): IReusableStackSynthesizer? =
      unwrap(this).getDefaultStackSynthesizer()?.let(IReusableStackSynthesizer::wrap)

  /**
   * The output directory into which to emit synthesized artifacts.
   *
   * You should never need to set this value. By default, the value you pass to
   * the CLI's `--output` flag will be used, and if you change it to a different
   * directory the CLI will fail to pick up the generated Cloud Assembly.
   *
   * This property is intended for internal and testing use.
   *
   * Default: - If this value is _not_ set, considers the environment variable `CDK_OUTDIR`.
   * If `CDK_OUTDIR` is not defined, uses a temp directory.
   */
  public fun outdir(): String? = unwrap(this).getOutdir()

  /**
   * Validation plugins to run after synthesis.
   *
   * Default: - no validation plugins
   */
  public fun policyValidationBeta1(): List<IPolicyValidationPluginBeta1> =
      unwrap(this).getPolicyValidationBeta1()?.map(IPolicyValidationPluginBeta1::wrap) ?:
      emptyList()

  /**
   * Additional context values for the application.
   *
   * Context provided here has precedence over context set by:
   *
   * * The CLI via --context
   * * The `context` key in `cdk.json`
   * * The `AppProps.context` property
   *
   * This property is recommended over the `AppProps.context` property since you
   * can make final decision over which context value to take in your app.
   *
   * Context can be read from any construct using `node.getContext(key)`.
   *
   * Default: - no additional context
   *
   * Example:
   *
   * ```
   * // context from the CLI and from `cdk.json` are stored in the
   * // CDK_CONTEXT env variable
   * Object cliContext = JSON.parse(process.getEnv().getCDK_CONTEXT());
   * // determine whether to take the context passed in the CLI or not
   * Object determineValue = process.env.PROD ? cliContext.SOMEKEY : 'my-prod-value';
   * App.Builder.create()
   * .postCliContext(Map.of(
   * "SOMEKEY", determineValue))
   * .build();
   * ```
   */
  public fun postCliContext(): Map<String, Any> = unwrap(this).getPostCliContext() ?: emptyMap()

  /**
   * Include construct creation stack trace in the `aws:cdk:trace` metadata key of all constructs.
   *
   * Default: true stack traces are included unless `aws:cdk:disable-stack-trace` is set in the
   * context.
   */
  public fun stackTraces(): Boolean? = unwrap(this).getStackTraces()

  /**
   * Include construct tree metadata as part of the Cloud Assembly.
   *
   * Default: true
   */
  public fun treeMetadata(): Boolean? = unwrap(this).getTreeMetadata()

  /**
   * A builder for [AppProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param analyticsReporting Include runtime versioning information in the Stacks of this app.
     */
    public fun analyticsReporting(analyticsReporting: Boolean)

    /**
     * @param autoSynth Automatically call `synth()` before the program exits.
     * If you set this, you don't have to call `synth()` explicitly. Note that
     * this feature is only available for certain programming languages, and
     * calling `synth()` is still recommended.
     */
    public fun autoSynth(autoSynth: Boolean)

    /**
     * @param context Additional context values for the application.
     * Context set by the CLI or the `context` key in `cdk.json` has precedence.
     *
     * Context can be read from any construct using `node.getContext(key)`.
     */
    public fun context(context: Map<String, Any>)

    /**
     * @param defaultStackSynthesizer The stack synthesizer to use by default for all Stacks in the
     * App.
     * The Stack Synthesizer controls aspects of synthesis and deployment,
     * like how assets are referenced and what IAM roles to use. For more
     * information, see the README of the main CDK package.
     */
    public fun defaultStackSynthesizer(defaultStackSynthesizer: IReusableStackSynthesizer)

    /**
     * @param outdir The output directory into which to emit synthesized artifacts.
     * You should never need to set this value. By default, the value you pass to
     * the CLI's `--output` flag will be used, and if you change it to a different
     * directory the CLI will fail to pick up the generated Cloud Assembly.
     *
     * This property is intended for internal and testing use.
     */
    public fun outdir(outdir: String)

    /**
     * @param policyValidationBeta1 Validation plugins to run after synthesis.
     */
    public fun policyValidationBeta1(policyValidationBeta1: List<IPolicyValidationPluginBeta1>)

    /**
     * @param policyValidationBeta1 Validation plugins to run after synthesis.
     */
    public fun policyValidationBeta1(vararg policyValidationBeta1: IPolicyValidationPluginBeta1)

    /**
     * @param postCliContext Additional context values for the application.
     * Context provided here has precedence over context set by:
     *
     * * The CLI via --context
     * * The `context` key in `cdk.json`
     * * The `AppProps.context` property
     *
     * This property is recommended over the `AppProps.context` property since you
     * can make final decision over which context value to take in your app.
     *
     * Context can be read from any construct using `node.getContext(key)`.
     */
    public fun postCliContext(postCliContext: Map<String, Any>)

    /**
     * @param stackTraces Include construct creation stack trace in the `aws:cdk:trace` metadata key
     * of all constructs.
     */
    public fun stackTraces(stackTraces: Boolean)

    /**
     * @param treeMetadata Include construct tree metadata as part of the Cloud Assembly.
     */
    public fun treeMetadata(treeMetadata: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.AppProps.Builder =
        software.amazon.awscdk.AppProps.builder()

    /**
     * @param analyticsReporting Include runtime versioning information in the Stacks of this app.
     */
    override fun analyticsReporting(analyticsReporting: Boolean) {
      cdkBuilder.analyticsReporting(analyticsReporting)
    }

    /**
     * @param autoSynth Automatically call `synth()` before the program exits.
     * If you set this, you don't have to call `synth()` explicitly. Note that
     * this feature is only available for certain programming languages, and
     * calling `synth()` is still recommended.
     */
    override fun autoSynth(autoSynth: Boolean) {
      cdkBuilder.autoSynth(autoSynth)
    }

    /**
     * @param context Additional context values for the application.
     * Context set by the CLI or the `context` key in `cdk.json` has precedence.
     *
     * Context can be read from any construct using `node.getContext(key)`.
     */
    override fun context(context: Map<String, Any>) {
      cdkBuilder.context(context)
    }

    /**
     * @param defaultStackSynthesizer The stack synthesizer to use by default for all Stacks in the
     * App.
     * The Stack Synthesizer controls aspects of synthesis and deployment,
     * like how assets are referenced and what IAM roles to use. For more
     * information, see the README of the main CDK package.
     */
    override fun defaultStackSynthesizer(defaultStackSynthesizer: IReusableStackSynthesizer) {
      cdkBuilder.defaultStackSynthesizer(defaultStackSynthesizer.let(IReusableStackSynthesizer::unwrap))
    }

    /**
     * @param outdir The output directory into which to emit synthesized artifacts.
     * You should never need to set this value. By default, the value you pass to
     * the CLI's `--output` flag will be used, and if you change it to a different
     * directory the CLI will fail to pick up the generated Cloud Assembly.
     *
     * This property is intended for internal and testing use.
     */
    override fun outdir(outdir: String) {
      cdkBuilder.outdir(outdir)
    }

    /**
     * @param policyValidationBeta1 Validation plugins to run after synthesis.
     */
    override fun policyValidationBeta1(policyValidationBeta1: List<IPolicyValidationPluginBeta1>) {
      cdkBuilder.policyValidationBeta1(policyValidationBeta1.map(IPolicyValidationPluginBeta1::unwrap))
    }

    /**
     * @param policyValidationBeta1 Validation plugins to run after synthesis.
     */
    override fun policyValidationBeta1(vararg policyValidationBeta1: IPolicyValidationPluginBeta1):
        Unit = policyValidationBeta1(policyValidationBeta1.toList())

    /**
     * @param postCliContext Additional context values for the application.
     * Context provided here has precedence over context set by:
     *
     * * The CLI via --context
     * * The `context` key in `cdk.json`
     * * The `AppProps.context` property
     *
     * This property is recommended over the `AppProps.context` property since you
     * can make final decision over which context value to take in your app.
     *
     * Context can be read from any construct using `node.getContext(key)`.
     */
    override fun postCliContext(postCliContext: Map<String, Any>) {
      cdkBuilder.postCliContext(postCliContext)
    }

    /**
     * @param stackTraces Include construct creation stack trace in the `aws:cdk:trace` metadata key
     * of all constructs.
     */
    override fun stackTraces(stackTraces: Boolean) {
      cdkBuilder.stackTraces(stackTraces)
    }

    /**
     * @param treeMetadata Include construct tree metadata as part of the Cloud Assembly.
     */
    override fun treeMetadata(treeMetadata: Boolean) {
      cdkBuilder.treeMetadata(treeMetadata)
    }

    public fun build(): software.amazon.awscdk.AppProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.AppProps,
  ) : CdkObject(cdkObject), AppProps {
    /**
     * Include runtime versioning information in the Stacks of this app.
     *
     * Default: Value of 'aws:cdk:version-reporting' context key
     */
    override fun analyticsReporting(): Boolean? = unwrap(this).getAnalyticsReporting()

    /**
     * Automatically call `synth()` before the program exits.
     *
     * If you set this, you don't have to call `synth()` explicitly. Note that
     * this feature is only available for certain programming languages, and
     * calling `synth()` is still recommended.
     *
     * Default: true if running via CDK CLI (`CDK_OUTDIR` is set), `false`
     * otherwise
     */
    override fun autoSynth(): Boolean? = unwrap(this).getAutoSynth()

    /**
     * Additional context values for the application.
     *
     * Context set by the CLI or the `context` key in `cdk.json` has precedence.
     *
     * Context can be read from any construct using `node.getContext(key)`.
     *
     * Default: - no additional context
     */
    override fun context(): Map<String, Any> = unwrap(this).getContext() ?: emptyMap()

    /**
     * The stack synthesizer to use by default for all Stacks in the App.
     *
     * The Stack Synthesizer controls aspects of synthesis and deployment,
     * like how assets are referenced and what IAM roles to use. For more
     * information, see the README of the main CDK package.
     *
     * Default: - A `DefaultStackSynthesizer` with default settings
     */
    override fun defaultStackSynthesizer(): IReusableStackSynthesizer? =
        unwrap(this).getDefaultStackSynthesizer()?.let(IReusableStackSynthesizer::wrap)

    /**
     * The output directory into which to emit synthesized artifacts.
     *
     * You should never need to set this value. By default, the value you pass to
     * the CLI's `--output` flag will be used, and if you change it to a different
     * directory the CLI will fail to pick up the generated Cloud Assembly.
     *
     * This property is intended for internal and testing use.
     *
     * Default: - If this value is _not_ set, considers the environment variable `CDK_OUTDIR`.
     * If `CDK_OUTDIR` is not defined, uses a temp directory.
     */
    override fun outdir(): String? = unwrap(this).getOutdir()

    /**
     * Validation plugins to run after synthesis.
     *
     * Default: - no validation plugins
     */
    override fun policyValidationBeta1(): List<IPolicyValidationPluginBeta1> =
        unwrap(this).getPolicyValidationBeta1()?.map(IPolicyValidationPluginBeta1::wrap) ?:
        emptyList()

    /**
     * Additional context values for the application.
     *
     * Context provided here has precedence over context set by:
     *
     * * The CLI via --context
     * * The `context` key in `cdk.json`
     * * The `AppProps.context` property
     *
     * This property is recommended over the `AppProps.context` property since you
     * can make final decision over which context value to take in your app.
     *
     * Context can be read from any construct using `node.getContext(key)`.
     *
     * Default: - no additional context
     *
     * Example:
     *
     * ```
     * // context from the CLI and from `cdk.json` are stored in the
     * // CDK_CONTEXT env variable
     * Object cliContext = JSON.parse(process.getEnv().getCDK_CONTEXT());
     * // determine whether to take the context passed in the CLI or not
     * Object determineValue = process.env.PROD ? cliContext.SOMEKEY : 'my-prod-value';
     * App.Builder.create()
     * .postCliContext(Map.of(
     * "SOMEKEY", determineValue))
     * .build();
     * ```
     */
    override fun postCliContext(): Map<String, Any> = unwrap(this).getPostCliContext() ?: emptyMap()

    /**
     * Include construct creation stack trace in the `aws:cdk:trace` metadata key of all constructs.
     *
     * Default: true stack traces are included unless `aws:cdk:disable-stack-trace` is set in the
     * context.
     */
    override fun stackTraces(): Boolean? = unwrap(this).getStackTraces()

    /**
     * Include construct tree metadata as part of the Cloud Assembly.
     *
     * Default: true
     */
    override fun treeMetadata(): Boolean? = unwrap(this).getTreeMetadata()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AppProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.AppProps): AppProps =
        CdkObjectWrappers.wrap(cdkObject) as? AppProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: AppProps): software.amazon.awscdk.AppProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.AppProps
  }
}
