@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

/**
 * A construct which represents an entire CDK app. This construct is normally the root of the
 * construct tree.
 *
 * You would normally define an `App` instance in your program's entrypoint,
 * then define constructs where the app is used as the parent scope.
 *
 * After all the child constructs are defined within the app, you should call
 * `app.synth()` which will emit a "cloud assembly" from this app into the
 * directory specified by `outdir`. Cloud assemblies includes artifacts such as
 * CloudFormation templates and assets that are needed to deploy this app into
 * the AWS cloud.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.s3.*;
 * IBucket bucket;
 * App app = new App();
 * Stack stack = new Stack(app, "Stack");
 * Table.Builder.create(stack, "Table")
 * .partitionKey(Attribute.builder()
 * .name("id")
 * .type(AttributeType.STRING)
 * .build())
 * .importSource(ImportSourceSpecification.builder()
 * .compressionType(InputCompressionType.GZIP)
 * .inputFormat(InputFormat.csv(CsvOptions.builder()
 * .delimiter(",")
 * .headerList(List.of("id", "name"))
 * .build()))
 * .bucket(bucket)
 * .keyPrefix("prefix")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/cdk/latest/guide/apps.html)
 */
public open class App internal constructor(
  internal override val cdkObject: software.amazon.awscdk.App,
) : Stage(cdkObject) {
  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.App].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Include runtime versioning information in the Stacks of this app.
     *
     * Default: Value of 'aws:cdk:version-reporting' context key
     *
     * @param analyticsReporting Include runtime versioning information in the Stacks of this app. 
     */
    public fun analyticsReporting(analyticsReporting: Boolean)

    /**
     * Automatically call `synth()` before the program exits.
     *
     * If you set this, you don't have to call `synth()` explicitly. Note that
     * this feature is only available for certain programming languages, and
     * calling `synth()` is still recommended.
     *
     * Default: true if running via CDK CLI (`CDK_OUTDIR` is set), `false`
     * otherwise
     *
     * @param autoSynth Automatically call `synth()` before the program exits. 
     */
    public fun autoSynth(autoSynth: Boolean)

    /**
     * Additional context values for the application.
     *
     * Context set by the CLI or the `context` key in `cdk.json` has precedence.
     *
     * Context can be read from any construct using `node.getContext(key)`.
     *
     * Default: - no additional context
     *
     * @param context Additional context values for the application. 
     */
    public fun context(context: Map<String, Any>)

    /**
     * The stack synthesizer to use by default for all Stacks in the App.
     *
     * The Stack Synthesizer controls aspects of synthesis and deployment,
     * like how assets are referenced and what IAM roles to use. For more
     * information, see the README of the main CDK package.
     *
     * Default: - A `DefaultStackSynthesizer` with default settings
     *
     * @param defaultStackSynthesizer The stack synthesizer to use by default for all Stacks in the
     * App. 
     */
    public fun defaultStackSynthesizer(defaultStackSynthesizer: IReusableStackSynthesizer)

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
     *
     * @param outdir The output directory into which to emit synthesized artifacts. 
     */
    public fun outdir(outdir: String)

    /**
     * Validation plugins to run after synthesis.
     *
     * Default: - no validation plugins
     *
     * @param policyValidationBeta1 Validation plugins to run after synthesis. 
     */
    public fun policyValidationBeta1(policyValidationBeta1: List<IPolicyValidationPluginBeta1>)

    /**
     * Validation plugins to run after synthesis.
     *
     * Default: - no validation plugins
     *
     * @param policyValidationBeta1 Validation plugins to run after synthesis. 
     */
    public fun policyValidationBeta1(vararg policyValidationBeta1: IPolicyValidationPluginBeta1)

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
     *
     * @param postCliContext Additional context values for the application. 
     */
    public fun postCliContext(postCliContext: Map<String, Any>)

    /**
     * Include construct creation stack trace in the `aws:cdk:trace` metadata key of all constructs.
     *
     * Default: true stack traces are included unless `aws:cdk:disable-stack-trace` is set in the
     * context.
     *
     * @param stackTraces Include construct creation stack trace in the `aws:cdk:trace` metadata key
     * of all constructs. 
     */
    public fun stackTraces(stackTraces: Boolean)

    /**
     * Include construct tree metadata as part of the Cloud Assembly.
     *
     * Default: true
     *
     * @param treeMetadata Include construct tree metadata as part of the Cloud Assembly. 
     */
    public fun treeMetadata(treeMetadata: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.App.Builder =
        software.amazon.awscdk.App.Builder.create()

    /**
     * Include runtime versioning information in the Stacks of this app.
     *
     * Default: Value of 'aws:cdk:version-reporting' context key
     *
     * @param analyticsReporting Include runtime versioning information in the Stacks of this app. 
     */
    override fun analyticsReporting(analyticsReporting: Boolean) {
      cdkBuilder.analyticsReporting(analyticsReporting)
    }

    /**
     * Automatically call `synth()` before the program exits.
     *
     * If you set this, you don't have to call `synth()` explicitly. Note that
     * this feature is only available for certain programming languages, and
     * calling `synth()` is still recommended.
     *
     * Default: true if running via CDK CLI (`CDK_OUTDIR` is set), `false`
     * otherwise
     *
     * @param autoSynth Automatically call `synth()` before the program exits. 
     */
    override fun autoSynth(autoSynth: Boolean) {
      cdkBuilder.autoSynth(autoSynth)
    }

    /**
     * Additional context values for the application.
     *
     * Context set by the CLI or the `context` key in `cdk.json` has precedence.
     *
     * Context can be read from any construct using `node.getContext(key)`.
     *
     * Default: - no additional context
     *
     * @param context Additional context values for the application. 
     */
    override fun context(context: Map<String, Any>) {
      cdkBuilder.context(context)
    }

    /**
     * The stack synthesizer to use by default for all Stacks in the App.
     *
     * The Stack Synthesizer controls aspects of synthesis and deployment,
     * like how assets are referenced and what IAM roles to use. For more
     * information, see the README of the main CDK package.
     *
     * Default: - A `DefaultStackSynthesizer` with default settings
     *
     * @param defaultStackSynthesizer The stack synthesizer to use by default for all Stacks in the
     * App. 
     */
    override fun defaultStackSynthesizer(defaultStackSynthesizer: IReusableStackSynthesizer) {
      cdkBuilder.defaultStackSynthesizer(defaultStackSynthesizer.let(IReusableStackSynthesizer::unwrap))
    }

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
     *
     * @param outdir The output directory into which to emit synthesized artifacts. 
     */
    override fun outdir(outdir: String) {
      cdkBuilder.outdir(outdir)
    }

    /**
     * Validation plugins to run after synthesis.
     *
     * Default: - no validation plugins
     *
     * @param policyValidationBeta1 Validation plugins to run after synthesis. 
     */
    override fun policyValidationBeta1(policyValidationBeta1: List<IPolicyValidationPluginBeta1>) {
      cdkBuilder.policyValidationBeta1(policyValidationBeta1.map(IPolicyValidationPluginBeta1::unwrap))
    }

    /**
     * Validation plugins to run after synthesis.
     *
     * Default: - no validation plugins
     *
     * @param policyValidationBeta1 Validation plugins to run after synthesis. 
     */
    override fun policyValidationBeta1(vararg policyValidationBeta1: IPolicyValidationPluginBeta1):
        Unit = policyValidationBeta1(policyValidationBeta1.toList())

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
     *
     * @param postCliContext Additional context values for the application. 
     */
    override fun postCliContext(postCliContext: Map<String, Any>) {
      cdkBuilder.postCliContext(postCliContext)
    }

    /**
     * Include construct creation stack trace in the `aws:cdk:trace` metadata key of all constructs.
     *
     * Default: true stack traces are included unless `aws:cdk:disable-stack-trace` is set in the
     * context.
     *
     * @param stackTraces Include construct creation stack trace in the `aws:cdk:trace` metadata key
     * of all constructs. 
     */
    override fun stackTraces(stackTraces: Boolean) {
      cdkBuilder.stackTraces(stackTraces)
    }

    /**
     * Include construct tree metadata as part of the Cloud Assembly.
     *
     * Default: true
     *
     * @param treeMetadata Include construct tree metadata as part of the Cloud Assembly. 
     */
    override fun treeMetadata(treeMetadata: Boolean) {
      cdkBuilder.treeMetadata(treeMetadata)
    }

    public fun build(): software.amazon.awscdk.App = cdkBuilder.build()
  }

  public companion object {
    public fun isApp(obj: Any): Boolean = software.amazon.awscdk.App.isApp(obj)

    public operator fun invoke(block: Builder.() -> Unit = {}): App {
      val builderImpl = BuilderImpl()
      return App(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.App): App = App(cdkObject)

    internal fun unwrap(wrapped: App): software.amazon.awscdk.App = wrapped.cdkObject
  }
}
