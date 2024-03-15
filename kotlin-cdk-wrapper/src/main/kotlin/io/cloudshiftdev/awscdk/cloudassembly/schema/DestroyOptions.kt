@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cloudassembly.schema

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

/**
 * Options to use with cdk destroy.
 *
 * Example:
 *
 * ```
 * App app = new App();
 * Stack stackUnderTest = new Stack(app, "StackUnderTest");
 * Stack stack = new Stack(app, "stack");
 * IntegTest testCase = IntegTest.Builder.create(app, "CustomizedDeploymentWorkflow")
 * .testCases(List.of(stackUnderTest))
 * .diffAssets(true)
 * .stackUpdateWorkflow(true)
 * .cdkCommandOptions(CdkCommands.builder()
 * .deploy(DeployCommand.builder()
 * .args(DeployOptions.builder()
 * .requireApproval(RequireApproval.NEVER)
 * .json(true)
 * .build())
 * .build())
 * .destroy(DestroyCommand.builder()
 * .args(DestroyOptions.builder()
 * .force(true)
 * .build())
 * .build())
 * .build())
 * .build();
 * ```
 */
public interface DestroyOptions : DefaultCdkOptions {
  /**
   * Only destroy the given stack.
   *
   * Default: false
   */
  public fun exclusively(): Boolean? = unwrap(this).getExclusively()

  /**
   * Do not ask for permission before destroying stacks.
   *
   * Default: false
   */
  public fun force(): Boolean? = unwrap(this).getForce()

  /**
   * A builder for [DestroyOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param all Deploy all stacks.
     * Requried if `stacks` is not set
     */
    public fun all(all: Boolean)

    /**
     * @param app command-line for executing your app or a cloud assembly directory e.g. "node
     * bin/my-app.js" or "cdk.out".
     */
    public fun app(app: String)

    /**
     * @param assetMetadata Include "aws:asset:*" CloudFormation metadata for resources that use
     * assets.
     */
    public fun assetMetadata(assetMetadata: Boolean)

    /**
     * @param caBundlePath Path to CA certificate to use when validating HTTPS requests.
     */
    public fun caBundlePath(caBundlePath: String)

    /**
     * @param color Show colors and other style from console output.
     */
    public fun color(color: Boolean)

    /**
     * @param context Additional context.
     */
    public fun context(context: Map<String, String>)

    /**
     * @param debug enable emission of additional debugging information, such as creation stack
     * traces of tokens.
     */
    public fun debug(debug: Boolean)

    /**
     * @param ec2Creds Force trying to fetch EC2 instance credentials.
     */
    public fun ec2Creds(ec2Creds: Boolean)

    /**
     * @param exclusively Only destroy the given stack.
     */
    public fun exclusively(exclusively: Boolean)

    /**
     * @param force Do not ask for permission before destroying stacks.
     */
    public fun force(force: Boolean)

    /**
     * @param ignoreErrors Ignores synthesis errors, which will likely produce an invalid output.
     */
    public fun ignoreErrors(ignoreErrors: Boolean)

    /**
     * @param json Use JSON output instead of YAML when templates are printed to STDOUT.
     */
    public fun json(json: Boolean)

    /**
     * @param lookups Perform context lookups.
     * Synthesis fails if this is disabled and context lookups need
     * to be performed
     */
    public fun lookups(lookups: Boolean)

    /**
     * @param notices Show relevant notices.
     */
    public fun notices(notices: Boolean)

    /**
     * @param output Emits the synthesized cloud assembly into a directory.
     */
    public fun output(output: String)

    /**
     * @param pathMetadata Include "aws:cdk:path" CloudFormation metadata for each resource.
     */
    public fun pathMetadata(pathMetadata: Boolean)

    /**
     * @param profile Use the indicated AWS profile as the default environment.
     */
    public fun profile(profile: String)

    /**
     * @param proxy Use the indicated proxy.
     * Will read from
     * HTTPS_PROXY environment if specified
     */
    public fun proxy(proxy: String)

    /**
     * @param roleArn Role to pass to CloudFormation for deployment.
     */
    public fun roleArn(roleArn: String)

    /**
     * @param stacks List of stacks to deploy.
     * Requried if `all` is not set
     */
    public fun stacks(stacks: List<String>)

    /**
     * @param stacks List of stacks to deploy.
     * Requried if `all` is not set
     */
    public fun stacks(vararg stacks: String)

    /**
     * @param staging Copy assets to the output directory.
     * Needed for local debugging the source files with SAM CLI
     */
    public fun staging(staging: Boolean)

    /**
     * @param strict Do not construct stacks with warnings.
     */
    public fun strict(strict: Boolean)

    /**
     * @param trace Print trace for stack warnings.
     */
    public fun trace(trace: Boolean)

    /**
     * @param verbose show debug logs.
     */
    public fun verbose(verbose: Boolean)

    /**
     * @param versionReporting Include "AWS::CDK::Metadata" resource in synthesized templates.
     */
    public fun versionReporting(versionReporting: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.cloudassembly.schema.DestroyOptions.Builder =
        software.amazon.awscdk.cloudassembly.schema.DestroyOptions.builder()

    /**
     * @param all Deploy all stacks.
     * Requried if `stacks` is not set
     */
    override fun all(all: Boolean) {
      cdkBuilder.all(all)
    }

    /**
     * @param app command-line for executing your app or a cloud assembly directory e.g. "node
     * bin/my-app.js" or "cdk.out".
     */
    override fun app(app: String) {
      cdkBuilder.app(app)
    }

    /**
     * @param assetMetadata Include "aws:asset:*" CloudFormation metadata for resources that use
     * assets.
     */
    override fun assetMetadata(assetMetadata: Boolean) {
      cdkBuilder.assetMetadata(assetMetadata)
    }

    /**
     * @param caBundlePath Path to CA certificate to use when validating HTTPS requests.
     */
    override fun caBundlePath(caBundlePath: String) {
      cdkBuilder.caBundlePath(caBundlePath)
    }

    /**
     * @param color Show colors and other style from console output.
     */
    override fun color(color: Boolean) {
      cdkBuilder.color(color)
    }

    /**
     * @param context Additional context.
     */
    override fun context(context: Map<String, String>) {
      cdkBuilder.context(context)
    }

    /**
     * @param debug enable emission of additional debugging information, such as creation stack
     * traces of tokens.
     */
    override fun debug(debug: Boolean) {
      cdkBuilder.debug(debug)
    }

    /**
     * @param ec2Creds Force trying to fetch EC2 instance credentials.
     */
    override fun ec2Creds(ec2Creds: Boolean) {
      cdkBuilder.ec2Creds(ec2Creds)
    }

    /**
     * @param exclusively Only destroy the given stack.
     */
    override fun exclusively(exclusively: Boolean) {
      cdkBuilder.exclusively(exclusively)
    }

    /**
     * @param force Do not ask for permission before destroying stacks.
     */
    override fun force(force: Boolean) {
      cdkBuilder.force(force)
    }

    /**
     * @param ignoreErrors Ignores synthesis errors, which will likely produce an invalid output.
     */
    override fun ignoreErrors(ignoreErrors: Boolean) {
      cdkBuilder.ignoreErrors(ignoreErrors)
    }

    /**
     * @param json Use JSON output instead of YAML when templates are printed to STDOUT.
     */
    override fun json(json: Boolean) {
      cdkBuilder.json(json)
    }

    /**
     * @param lookups Perform context lookups.
     * Synthesis fails if this is disabled and context lookups need
     * to be performed
     */
    override fun lookups(lookups: Boolean) {
      cdkBuilder.lookups(lookups)
    }

    /**
     * @param notices Show relevant notices.
     */
    override fun notices(notices: Boolean) {
      cdkBuilder.notices(notices)
    }

    /**
     * @param output Emits the synthesized cloud assembly into a directory.
     */
    override fun output(output: String) {
      cdkBuilder.output(output)
    }

    /**
     * @param pathMetadata Include "aws:cdk:path" CloudFormation metadata for each resource.
     */
    override fun pathMetadata(pathMetadata: Boolean) {
      cdkBuilder.pathMetadata(pathMetadata)
    }

    /**
     * @param profile Use the indicated AWS profile as the default environment.
     */
    override fun profile(profile: String) {
      cdkBuilder.profile(profile)
    }

    /**
     * @param proxy Use the indicated proxy.
     * Will read from
     * HTTPS_PROXY environment if specified
     */
    override fun proxy(proxy: String) {
      cdkBuilder.proxy(proxy)
    }

    /**
     * @param roleArn Role to pass to CloudFormation for deployment.
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    /**
     * @param stacks List of stacks to deploy.
     * Requried if `all` is not set
     */
    override fun stacks(stacks: List<String>) {
      cdkBuilder.stacks(stacks)
    }

    /**
     * @param stacks List of stacks to deploy.
     * Requried if `all` is not set
     */
    override fun stacks(vararg stacks: String): Unit = stacks(stacks.toList())

    /**
     * @param staging Copy assets to the output directory.
     * Needed for local debugging the source files with SAM CLI
     */
    override fun staging(staging: Boolean) {
      cdkBuilder.staging(staging)
    }

    /**
     * @param strict Do not construct stacks with warnings.
     */
    override fun strict(strict: Boolean) {
      cdkBuilder.strict(strict)
    }

    /**
     * @param trace Print trace for stack warnings.
     */
    override fun trace(trace: Boolean) {
      cdkBuilder.trace(trace)
    }

    /**
     * @param verbose show debug logs.
     */
    override fun verbose(verbose: Boolean) {
      cdkBuilder.verbose(verbose)
    }

    /**
     * @param versionReporting Include "AWS::CDK::Metadata" resource in synthesized templates.
     */
    override fun versionReporting(versionReporting: Boolean) {
      cdkBuilder.versionReporting(versionReporting)
    }

    public fun build(): software.amazon.awscdk.cloudassembly.schema.DestroyOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.cloudassembly.schema.DestroyOptions,
  ) : CdkObject(cdkObject), DestroyOptions {
    /**
     * Deploy all stacks.
     *
     * Requried if `stacks` is not set
     *
     * Default: - false
     */
    override fun all(): Boolean? = unwrap(this).getAll()

    /**
     * command-line for executing your app or a cloud assembly directory e.g. "node bin/my-app.js"
     * or "cdk.out".
     *
     * Default: - read from cdk.json
     */
    override fun app(): String? = unwrap(this).getApp()

    /**
     * Include "aws:asset:*" CloudFormation metadata for resources that use assets.
     *
     * Default: true
     */
    override fun assetMetadata(): Boolean? = unwrap(this).getAssetMetadata()

    /**
     * Path to CA certificate to use when validating HTTPS requests.
     *
     * Default: - read from AWS_CA_BUNDLE environment variable
     */
    override fun caBundlePath(): String? = unwrap(this).getCaBundlePath()

    /**
     * Show colors and other style from console output.
     *
     * Default: true
     */
    override fun color(): Boolean? = unwrap(this).getColor()

    /**
     * Additional context.
     *
     * Default: - no additional context
     */
    override fun context(): Map<String, String> = unwrap(this).getContext() ?: emptyMap()

    /**
     * enable emission of additional debugging information, such as creation stack traces of tokens.
     *
     * Default: false
     */
    override fun debug(): Boolean? = unwrap(this).getDebug()

    /**
     * Force trying to fetch EC2 instance credentials.
     *
     * Default: - guess EC2 instance status
     */
    override fun ec2Creds(): Boolean? = unwrap(this).getEc2Creds()

    /**
     * Only destroy the given stack.
     *
     * Default: false
     */
    override fun exclusively(): Boolean? = unwrap(this).getExclusively()

    /**
     * Do not ask for permission before destroying stacks.
     *
     * Default: false
     */
    override fun force(): Boolean? = unwrap(this).getForce()

    /**
     * Ignores synthesis errors, which will likely produce an invalid output.
     *
     * Default: false
     */
    override fun ignoreErrors(): Boolean? = unwrap(this).getIgnoreErrors()

    /**
     * Use JSON output instead of YAML when templates are printed to STDOUT.
     *
     * Default: false
     */
    override fun json(): Boolean? = unwrap(this).getJson()

    /**
     * Perform context lookups.
     *
     * Synthesis fails if this is disabled and context lookups need
     * to be performed
     *
     * Default: true
     */
    override fun lookups(): Boolean? = unwrap(this).getLookups()

    /**
     * Show relevant notices.
     *
     * Default: true
     */
    override fun notices(): Boolean? = unwrap(this).getNotices()

    /**
     * Emits the synthesized cloud assembly into a directory.
     *
     * Default: cdk.out
     */
    override fun output(): String? = unwrap(this).getOutput()

    /**
     * Include "aws:cdk:path" CloudFormation metadata for each resource.
     *
     * Default: true
     */
    override fun pathMetadata(): Boolean? = unwrap(this).getPathMetadata()

    /**
     * Use the indicated AWS profile as the default environment.
     *
     * Default: - no profile is used
     */
    override fun profile(): String? = unwrap(this).getProfile()

    /**
     * Use the indicated proxy.
     *
     * Will read from
     * HTTPS_PROXY environment if specified
     *
     * Default: - no proxy
     */
    override fun proxy(): String? = unwrap(this).getProxy()

    /**
     * Role to pass to CloudFormation for deployment.
     *
     * Default: - use the bootstrap cfn-exec role
     */
    override fun roleArn(): String? = unwrap(this).getRoleArn()

    /**
     * List of stacks to deploy.
     *
     * Requried if `all` is not set
     *
     * Default: - []
     */
    override fun stacks(): List<String> = unwrap(this).getStacks() ?: emptyList()

    /**
     * Copy assets to the output directory.
     *
     * Needed for local debugging the source files with SAM CLI
     *
     * Default: false
     */
    override fun staging(): Boolean? = unwrap(this).getStaging()

    /**
     * Do not construct stacks with warnings.
     *
     * Default: false
     */
    override fun strict(): Boolean? = unwrap(this).getStrict()

    /**
     * Print trace for stack warnings.
     *
     * Default: false
     */
    override fun trace(): Boolean? = unwrap(this).getTrace()

    /**
     * show debug logs.
     *
     * Default: false
     */
    override fun verbose(): Boolean? = unwrap(this).getVerbose()

    /**
     * Include "AWS::CDK::Metadata" resource in synthesized templates.
     *
     * Default: true
     */
    override fun versionReporting(): Boolean? = unwrap(this).getVersionReporting()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): DestroyOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.cloudassembly.schema.DestroyOptions):
        DestroyOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: DestroyOptions):
        software.amazon.awscdk.cloudassembly.schema.DestroyOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.cloudassembly.schema.DestroyOptions
  }
}
