@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cloud_assembly_schema

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

/**
 * Default CDK CLI options that apply to all commands.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.cloud_assembly_schema.*;
 * DefaultCdkOptions defaultCdkOptions = DefaultCdkOptions.builder()
 * .all(false)
 * .app("app")
 * .assetMetadata(false)
 * .caBundlePath("caBundlePath")
 * .color(false)
 * .context(Map.of(
 * "contextKey", "context"))
 * .debug(false)
 * .ec2Creds(false)
 * .ignoreErrors(false)
 * .json(false)
 * .lookups(false)
 * .notices(false)
 * .output("output")
 * .pathMetadata(false)
 * .profile("profile")
 * .proxy("proxy")
 * .roleArn("roleArn")
 * .stacks(List.of("stacks"))
 * .staging(false)
 * .strict(false)
 * .trace(false)
 * .verbose(false)
 * .versionReporting(false)
 * .build();
 * ```
 */
public interface DefaultCdkOptions {
  /**
   * Deploy all stacks.
   *
   * Requried if `stacks` is not set
   *
   * Default: - false
   */
  public fun all(): Boolean? = unwrap(this).getAll()

  /**
   * command-line for executing your app or a cloud assembly directory e.g. "node bin/my-app.js" or
   * "cdk.out".
   *
   * Default: - read from cdk.json
   */
  public fun app(): String? = unwrap(this).getApp()

  /**
   * Include "aws:asset:*" CloudFormation metadata for resources that use assets.
   *
   * Default: true
   */
  public fun assetMetadata(): Boolean? = unwrap(this).getAssetMetadata()

  /**
   * Path to CA certificate to use when validating HTTPS requests.
   *
   * Default: - read from AWS_CA_BUNDLE environment variable
   */
  public fun caBundlePath(): String? = unwrap(this).getCaBundlePath()

  /**
   * Show colors and other style from console output.
   *
   * Default: true
   */
  public fun color(): Boolean? = unwrap(this).getColor()

  /**
   * Additional context.
   *
   * Default: - no additional context
   */
  public fun context(): Map<String, String> = unwrap(this).getContext() ?: emptyMap()

  /**
   * enable emission of additional debugging information, such as creation stack traces of tokens.
   *
   * Default: false
   */
  public fun debug(): Boolean? = unwrap(this).getDebug()

  /**
   * Force trying to fetch EC2 instance credentials.
   *
   * Default: - guess EC2 instance status
   */
  public fun ec2Creds(): Boolean? = unwrap(this).getEc2Creds()

  /**
   * Ignores synthesis errors, which will likely produce an invalid output.
   *
   * Default: false
   */
  public fun ignoreErrors(): Boolean? = unwrap(this).getIgnoreErrors()

  /**
   * Use JSON output instead of YAML when templates are printed to STDOUT.
   *
   * Default: false
   */
  public fun json(): Boolean? = unwrap(this).getJson()

  /**
   * Perform context lookups.
   *
   * Synthesis fails if this is disabled and context lookups need
   * to be performed
   *
   * Default: true
   */
  public fun lookups(): Boolean? = unwrap(this).getLookups()

  /**
   * Show relevant notices.
   *
   * Default: true
   */
  public fun notices(): Boolean? = unwrap(this).getNotices()

  /**
   * Emits the synthesized cloud assembly into a directory.
   *
   * Default: cdk.out
   */
  public fun output(): String? = unwrap(this).getOutput()

  /**
   * Include "aws:cdk:path" CloudFormation metadata for each resource.
   *
   * Default: true
   */
  public fun pathMetadata(): Boolean? = unwrap(this).getPathMetadata()

  /**
   * Use the indicated AWS profile as the default environment.
   *
   * Default: - no profile is used
   */
  public fun profile(): String? = unwrap(this).getProfile()

  /**
   * Use the indicated proxy.
   *
   * Will read from
   * HTTPS_PROXY environment if specified
   *
   * Default: - no proxy
   */
  public fun proxy(): String? = unwrap(this).getProxy()

  /**
   * Role to pass to CloudFormation for deployment.
   *
   * Default: - use the bootstrap cfn-exec role
   */
  public fun roleArn(): String? = unwrap(this).getRoleArn()

  /**
   * List of stacks to deploy.
   *
   * Requried if `all` is not set
   *
   * Default: - []
   */
  public fun stacks(): List<String> = unwrap(this).getStacks() ?: emptyList()

  /**
   * Copy assets to the output directory.
   *
   * Needed for local debugging the source files with SAM CLI
   *
   * Default: false
   */
  public fun staging(): Boolean? = unwrap(this).getStaging()

  /**
   * Do not construct stacks with warnings.
   *
   * Default: false
   */
  public fun strict(): Boolean? = unwrap(this).getStrict()

  /**
   * Print trace for stack warnings.
   *
   * Default: false
   */
  public fun trace(): Boolean? = unwrap(this).getTrace()

  /**
   * show debug logs.
   *
   * Default: false
   */
  public fun verbose(): Boolean? = unwrap(this).getVerbose()

  /**
   * Include "AWS::CDK::Metadata" resource in synthesized templates.
   *
   * Default: true
   */
  public fun versionReporting(): Boolean? = unwrap(this).getVersionReporting()

  /**
   * A builder for [DefaultCdkOptions]
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
    private val cdkBuilder: software.amazon.awscdk.cloud_assembly_schema.DefaultCdkOptions.Builder =
        software.amazon.awscdk.cloud_assembly_schema.DefaultCdkOptions.builder()

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

    public fun build(): software.amazon.awscdk.cloud_assembly_schema.DefaultCdkOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.cloud_assembly_schema.DefaultCdkOptions,
  ) : CdkObject(cdkObject),
      DefaultCdkOptions {
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
    public operator fun invoke(block: Builder.() -> Unit = {}): DefaultCdkOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.cloud_assembly_schema.DefaultCdkOptions):
        DefaultCdkOptions = CdkObjectWrappers.wrap(cdkObject) as? DefaultCdkOptions ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: DefaultCdkOptions):
        software.amazon.awscdk.cloud_assembly_schema.DefaultCdkOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.cloud_assembly_schema.DefaultCdkOptions
  }
}
