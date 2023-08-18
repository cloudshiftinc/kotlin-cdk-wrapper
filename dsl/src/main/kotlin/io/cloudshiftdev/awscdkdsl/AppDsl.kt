@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.App
import software.amazon.awscdk.IPolicyValidationPluginBeta1
import software.amazon.awscdk.IReusableStackSynthesizer

/**
 * A construct which represents an entire CDK app. This construct is normally the root of the
 * construct tree.
 *
 * You would normally define an `App` instance in your program's entrypoint, then define constructs
 * where the app is used as the parent scope.
 *
 * After all the child constructs are defined within the app, you should call `app.synth()` which
 * will emit a "cloud assembly" from this app into the directory specified by `outdir`. Cloud
 * assemblies includes artifacts such as CloudFormation templates and assets that are needed to
 * deploy this app into the AWS cloud.
 *
 * Example:
 * ```
 * import software.amazon.awscdk.*;
 * import software.amazon.awscdk.*;
 * App app = new App();
 * Stack stack = new Stack(app, "aws-servicediscovery-integ");
 * PublicDnsNamespace namespace = PublicDnsNamespace.Builder.create(stack, "Namespace")
 * .name("foobar.com")
 * .build();
 * Service service = namespace.createService("Service", DnsServiceProps.builder()
 * .name("foo")
 * .dnsRecordType(DnsRecordType.CNAME)
 * .dnsTtl(Duration.seconds(30))
 * .build());
 * service.registerCnameInstance("CnameInstance", CnameInstanceBaseProps.builder()
 * .instanceCname("service.pizza")
 * .build());
 * app.synth();
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/cdk/latest/guide/apps.html)
 */
@CdkDslMarker
public class AppDsl {
    private val cdkBuilder: App.Builder = App.Builder.create()

    private val _policyValidationBeta1: MutableList<IPolicyValidationPluginBeta1> = mutableListOf()

    /**
     * Include runtime versioning information in the Stacks of this app.
     *
     * Default: Value of 'aws:cdk:version-reporting' context key
     *
     * @param analyticsReporting Include runtime versioning information in the Stacks of this app.
     */
    public fun analyticsReporting(analyticsReporting: Boolean) {
        cdkBuilder.analyticsReporting(analyticsReporting)
    }

    /**
     * Automatically call `synth()` before the program exits.
     *
     * If you set this, you don't have to call `synth()` explicitly. Note that this feature is only
     * available for certain programming languages, and calling `synth()` is still recommended.
     *
     * Default: true if running via CDK CLI (`CDK_OUTDIR` is set), `false` otherwise
     *
     * @param autoSynth Automatically call `synth()` before the program exits.
     */
    public fun autoSynth(autoSynth: Boolean) {
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
    public fun context(context: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(context)
        cdkBuilder.context(builder.map)
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
    public fun context(context: Map<String, Any>) {
        cdkBuilder.context(context)
    }

    /**
     * The stack synthesizer to use by default for all Stacks in the App.
     *
     * The Stack Synthesizer controls aspects of synthesis and deployment, like how assets are
     * referenced and what IAM roles to use. For more information, see the README of the main CDK
     * package.
     *
     * Default: - A `DefaultStackSynthesizer` with default settings
     *
     * @param defaultStackSynthesizer The stack synthesizer to use by default for all Stacks in the
     *   App.
     */
    public fun defaultStackSynthesizer(defaultStackSynthesizer: IReusableStackSynthesizer) {
        cdkBuilder.defaultStackSynthesizer(defaultStackSynthesizer)
    }

    /**
     * The output directory into which to emit synthesized artifacts.
     *
     * You should never need to set this value. By default, the value you pass to the CLI's
     * `--output` flag will be used, and if you change it to a different directory the CLI will fail
     * to pick up the generated Cloud Assembly.
     *
     * This property is intended for internal and testing use.
     *
     * Default: - If this value is _not_ set, considers the environment variable `CDK_OUTDIR`. If
     * `CDK_OUTDIR` is not defined, uses a temp directory.
     *
     * @param outdir The output directory into which to emit synthesized artifacts.
     */
    public fun outdir(outdir: String) {
        cdkBuilder.outdir(outdir)
    }

    /**
     * Validation plugins to run after synthesis.
     *
     * Default: - no validation plugins
     *
     * @param policyValidationBeta1 Validation plugins to run after synthesis.
     */
    public fun policyValidationBeta1(vararg policyValidationBeta1: IPolicyValidationPluginBeta1) {
        _policyValidationBeta1.addAll(listOf(*policyValidationBeta1))
    }

    /**
     * Validation plugins to run after synthesis.
     *
     * Default: - no validation plugins
     *
     * @param policyValidationBeta1 Validation plugins to run after synthesis.
     */
    public fun policyValidationBeta1(
        policyValidationBeta1: Collection<IPolicyValidationPluginBeta1>
    ) {
        _policyValidationBeta1.addAll(policyValidationBeta1)
    }

    /**
     * Additional context values for the application.
     *
     * Context provided here has precedence over context set by:
     * * The CLI via --context
     * * The `context` key in `cdk.json`
     * * The `AppProps.context` property
     *
     * This property is recommended over the `AppProps.context` property since you can make final
     * decision over which context value to take in your app.
     *
     * Context can be read from any construct using `node.getContext(key)`.
     *
     * Default: - no additional context
     *
     * Example:
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
    public fun postCliContext(postCliContext: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(postCliContext)
        cdkBuilder.postCliContext(builder.map)
    }

    /**
     * Additional context values for the application.
     *
     * Context provided here has precedence over context set by:
     * * The CLI via --context
     * * The `context` key in `cdk.json`
     * * The `AppProps.context` property
     *
     * This property is recommended over the `AppProps.context` property since you can make final
     * decision over which context value to take in your app.
     *
     * Context can be read from any construct using `node.getContext(key)`.
     *
     * Default: - no additional context
     *
     * Example:
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
    public fun postCliContext(postCliContext: Map<String, Any>) {
        cdkBuilder.postCliContext(postCliContext)
    }

    /**
     * Include construct creation stack trace in the `aws:cdk:trace` metadata key of all constructs.
     *
     * Default: true stack traces are included unless `aws:cdk:disable-stack-trace` is set in the
     * context.
     *
     * @param stackTraces Include construct creation stack trace in the `aws:cdk:trace` metadata key
     *   of all constructs.
     */
    public fun stackTraces(stackTraces: Boolean) {
        cdkBuilder.stackTraces(stackTraces)
    }

    /**
     * Include construct tree metadata as part of the Cloud Assembly.
     *
     * Default: true
     *
     * @param treeMetadata Include construct tree metadata as part of the Cloud Assembly.
     */
    public fun treeMetadata(treeMetadata: Boolean) {
        cdkBuilder.treeMetadata(treeMetadata)
    }

    public fun build(): App {
        if (_policyValidationBeta1.isNotEmpty())
            cdkBuilder.policyValidationBeta1(_policyValidationBeta1)
        return cdkBuilder.build()
    }
}
