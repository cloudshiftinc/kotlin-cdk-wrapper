@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.AppProps
import software.amazon.awscdk.IPolicyValidationPluginBeta1
import software.amazon.awscdk.IReusableStackSynthesizer

@CdkDslMarker
public class AppPropsDsl {
  private val cdkBuilder: AppProps.Builder = AppProps.builder()

  private val _policyValidationBeta1: MutableList<IPolicyValidationPluginBeta1> = mutableListOf()

  /**
   * @param analyticsReporting Include runtime versioning information in the Stacks of this app.
   */
  public fun analyticsReporting(analyticsReporting: Boolean) {
    cdkBuilder.analyticsReporting(analyticsReporting)
  }

  /**
   * @param autoSynth Automatically call `synth()` before the program exits.
   * If you set this, you don't have to call `synth()` explicitly. Note that
   * this feature is only available for certain programming languages, and
   * calling `synth()` is still recommended.
   */
  public fun autoSynth(autoSynth: Boolean) {
    cdkBuilder.autoSynth(autoSynth)
  }

  /**
   * @param context Additional context values for the application.
   * Context set by the CLI or the `context` key in `cdk.json` has precedence.
   *
   * Context can be read from any construct using `node.getContext(key)`.
   */
  public fun context(context: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(context)
    cdkBuilder.context(builder.map)
  }

  /**
   * @param context Additional context values for the application.
   * Context set by the CLI or the `context` key in `cdk.json` has precedence.
   *
   * Context can be read from any construct using `node.getContext(key)`.
   */
  public fun context(context: Map<String, Any>) {
    cdkBuilder.context(context)
  }

  /**
   * @param defaultStackSynthesizer The stack synthesizer to use by default for all Stacks in the
   * App.
   * The Stack Synthesizer controls aspects of synthesis and deployment,
   * like how assets are referenced and what IAM roles to use. For more
   * information, see the README of the main CDK package.
   */
  public fun defaultStackSynthesizer(defaultStackSynthesizer: IReusableStackSynthesizer) {
    cdkBuilder.defaultStackSynthesizer(defaultStackSynthesizer)
  }

  /**
   * @param outdir The output directory into which to emit synthesized artifacts.
   * You should never need to set this value. By default, the value you pass to
   * the CLI's `--output` flag will be used, and if you change it to a different
   * directory the CLI will fail to pick up the generated Cloud Assembly.
   *
   * This property is intended for internal and testing use.
   */
  public fun outdir(outdir: String) {
    cdkBuilder.outdir(outdir)
  }

  /**
   * @param policyValidationBeta1 Validation plugins to run after synthesis.
   */
  public fun policyValidationBeta1(vararg policyValidationBeta1: IPolicyValidationPluginBeta1) {
    _policyValidationBeta1.addAll(listOf(*policyValidationBeta1))
  }

  /**
   * @param policyValidationBeta1 Validation plugins to run after synthesis.
   */
  public
      fun policyValidationBeta1(policyValidationBeta1: Collection<IPolicyValidationPluginBeta1>) {
    _policyValidationBeta1.addAll(policyValidationBeta1)
  }

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
  public fun postCliContext(postCliContext: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(postCliContext)
    cdkBuilder.postCliContext(builder.map)
  }

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
  public fun postCliContext(postCliContext: Map<String, Any>) {
    cdkBuilder.postCliContext(postCliContext)
  }

  /**
   * @param stackTraces Include construct creation stack trace in the `aws:cdk:trace` metadata key
   * of all constructs.
   */
  public fun stackTraces(stackTraces: Boolean) {
    cdkBuilder.stackTraces(stackTraces)
  }

  /**
   * @param treeMetadata Include construct tree metadata as part of the Cloud Assembly.
   */
  public fun treeMetadata(treeMetadata: Boolean) {
    cdkBuilder.treeMetadata(treeMetadata)
  }

  public fun build(): AppProps {
    if(_policyValidationBeta1.isNotEmpty()) cdkBuilder.policyValidationBeta1(_policyValidationBeta1)
    return cdkBuilder.build()
  }
}
