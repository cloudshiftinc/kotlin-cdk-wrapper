@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cloud_assembly_schema

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

/**
 * Options to use with cdk deploy.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.cloud_assembly_schema.*;
 * DeployOptions deployOptions = DeployOptions.builder()
 * .all(false)
 * .app("app")
 * .assetMetadata(false)
 * .caBundlePath("caBundlePath")
 * .changeSetName("changeSetName")
 * .ci(false)
 * .color(false)
 * .concurrency(123)
 * .context(Map.of(
 * "contextKey", "context"))
 * .debug(false)
 * .ec2Creds(false)
 * .exclusively(false)
 * .execute(false)
 * .force(false)
 * .ignoreErrors(false)
 * .json(false)
 * .lookups(false)
 * .notices(false)
 * .notificationArns(List.of("notificationArns"))
 * .output("output")
 * .outputsFile("outputsFile")
 * .parameters(Map.of(
 * "parametersKey", "parameters"))
 * .pathMetadata(false)
 * .profile("profile")
 * .proxy("proxy")
 * .requireApproval(RequireApproval.NEVER)
 * .reuseAssets(List.of("reuseAssets"))
 * .roleArn("roleArn")
 * .rollback(false)
 * .stacks(List.of("stacks"))
 * .staging(false)
 * .strict(false)
 * .toolkitStackName("toolkitStackName")
 * .trace(false)
 * .usePreviousParameters(false)
 * .verbose(false)
 * .versionReporting(false)
 * .build();
 * ```
 */
public interface DeployOptions : DefaultCdkOptions {
  /**
   * Optional name to use for the CloudFormation change set.
   *
   * If not provided, a name will be generated automatically.
   *
   * Default: - auto generate a name
   */
  public fun changeSetName(): String? = unwrap(this).getChangeSetName()

  /**
   * Whether we are on a CI system.
   *
   * Default: false
   */
  public fun ci(): Boolean? = unwrap(this).getCi()

  /**
   * Deploy multiple stacks in parallel.
   *
   * Default: 1
   */
  public fun concurrency(): Number? = unwrap(this).getConcurrency()

  /**
   * Only perform action on the given stack.
   *
   * Default: false
   */
  public fun exclusively(): Boolean? = unwrap(this).getExclusively()

  /**
   * Whether to execute the ChangeSet Not providing `execute` parameter will result in execution of
   * ChangeSet.
   *
   * Default: true
   */
  public fun execute(): Boolean? = unwrap(this).getExecute()

  /**
   * Always deploy, even if templates are identical.
   *
   * Default: false
   */
  public fun force(): Boolean? = unwrap(this).getForce()

  /**
   * ARNs of SNS topics that CloudFormation will notify with stack related events.
   *
   * Default: - no notifications
   */
  public fun notificationArns(): List<String> = unwrap(this).getNotificationArns() ?: emptyList()

  /**
   * Path to file where stack outputs will be written after a successful deploy as JSON.
   *
   * Default: - Outputs are not written to any file
   */
  public fun outputsFile(): String? = unwrap(this).getOutputsFile()

  /**
   * Additional parameters for CloudFormation at deploy time.
   *
   * Default: {}
   */
  public fun parameters(): Map<String, String> = unwrap(this).getParameters() ?: emptyMap()

  /**
   * What kind of security changes require approval.
   *
   * Default: RequireApproval.NEVER
   */
  public fun requireApproval(): RequireApproval? =
      unwrap(this).getRequireApproval()?.let(RequireApproval::wrap)

  /**
   * Reuse the assets with the given asset IDs.
   *
   * Default: - do not reuse assets
   */
  public fun reuseAssets(): List<String> = unwrap(this).getReuseAssets() ?: emptyList()

  /**
   * Rollback failed deployments.
   *
   * Default: true
   */
  public fun rollback(): Boolean? = unwrap(this).getRollback()

  /**
   * Name of the toolkit stack to use/deploy.
   *
   * Default: CDKToolkit
   */
  public fun toolkitStackName(): String? = unwrap(this).getToolkitStackName()

  /**
   * Use previous values for unspecified parameters.
   *
   * If not set, all parameters must be specified for every deployment.
   *
   * Default: true
   */
  public fun usePreviousParameters(): Boolean? = unwrap(this).getUsePreviousParameters()

  /**
   * A builder for [DeployOptions]
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
     * @param changeSetName Optional name to use for the CloudFormation change set.
     * If not provided, a name will be generated automatically.
     */
    public fun changeSetName(changeSetName: String)

    /**
     * @param ci Whether we are on a CI system.
     */
    public fun ci(ci: Boolean)

    /**
     * @param color Show colors and other style from console output.
     */
    public fun color(color: Boolean)

    /**
     * @param concurrency Deploy multiple stacks in parallel.
     */
    public fun concurrency(concurrency: Number)

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
     * @param exclusively Only perform action on the given stack.
     */
    public fun exclusively(exclusively: Boolean)

    /**
     * @param execute Whether to execute the ChangeSet Not providing `execute` parameter will result
     * in execution of ChangeSet.
     */
    public fun execute(execute: Boolean)

    /**
     * @param force Always deploy, even if templates are identical.
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
     * @param notificationArns ARNs of SNS topics that CloudFormation will notify with stack related
     * events.
     */
    public fun notificationArns(notificationArns: List<String>)

    /**
     * @param notificationArns ARNs of SNS topics that CloudFormation will notify with stack related
     * events.
     */
    public fun notificationArns(vararg notificationArns: String)

    /**
     * @param output Emits the synthesized cloud assembly into a directory.
     */
    public fun output(output: String)

    /**
     * @param outputsFile Path to file where stack outputs will be written after a successful deploy
     * as JSON.
     */
    public fun outputsFile(outputsFile: String)

    /**
     * @param parameters Additional parameters for CloudFormation at deploy time.
     */
    public fun parameters(parameters: Map<String, String>)

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
     * @param requireApproval What kind of security changes require approval.
     */
    public fun requireApproval(requireApproval: RequireApproval)

    /**
     * @param reuseAssets Reuse the assets with the given asset IDs.
     */
    public fun reuseAssets(reuseAssets: List<String>)

    /**
     * @param reuseAssets Reuse the assets with the given asset IDs.
     */
    public fun reuseAssets(vararg reuseAssets: String)

    /**
     * @param roleArn Role to pass to CloudFormation for deployment.
     */
    public fun roleArn(roleArn: String)

    /**
     * @param rollback Rollback failed deployments.
     */
    public fun rollback(rollback: Boolean)

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
     * @param toolkitStackName Name of the toolkit stack to use/deploy.
     */
    public fun toolkitStackName(toolkitStackName: String)

    /**
     * @param trace Print trace for stack warnings.
     */
    public fun trace(trace: Boolean)

    /**
     * @param usePreviousParameters Use previous values for unspecified parameters.
     * If not set, all parameters must be specified for every deployment.
     */
    public fun usePreviousParameters(usePreviousParameters: Boolean)

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
    private val cdkBuilder: software.amazon.awscdk.cloud_assembly_schema.DeployOptions.Builder =
        software.amazon.awscdk.cloud_assembly_schema.DeployOptions.builder()

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
     * @param changeSetName Optional name to use for the CloudFormation change set.
     * If not provided, a name will be generated automatically.
     */
    override fun changeSetName(changeSetName: String) {
      cdkBuilder.changeSetName(changeSetName)
    }

    /**
     * @param ci Whether we are on a CI system.
     */
    override fun ci(ci: Boolean) {
      cdkBuilder.ci(ci)
    }

    /**
     * @param color Show colors and other style from console output.
     */
    override fun color(color: Boolean) {
      cdkBuilder.color(color)
    }

    /**
     * @param concurrency Deploy multiple stacks in parallel.
     */
    override fun concurrency(concurrency: Number) {
      cdkBuilder.concurrency(concurrency)
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
     * @param exclusively Only perform action on the given stack.
     */
    override fun exclusively(exclusively: Boolean) {
      cdkBuilder.exclusively(exclusively)
    }

    /**
     * @param execute Whether to execute the ChangeSet Not providing `execute` parameter will result
     * in execution of ChangeSet.
     */
    override fun execute(execute: Boolean) {
      cdkBuilder.execute(execute)
    }

    /**
     * @param force Always deploy, even if templates are identical.
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
     * @param notificationArns ARNs of SNS topics that CloudFormation will notify with stack related
     * events.
     */
    override fun notificationArns(notificationArns: List<String>) {
      cdkBuilder.notificationArns(notificationArns)
    }

    /**
     * @param notificationArns ARNs of SNS topics that CloudFormation will notify with stack related
     * events.
     */
    override fun notificationArns(vararg notificationArns: String): Unit =
        notificationArns(notificationArns.toList())

    /**
     * @param output Emits the synthesized cloud assembly into a directory.
     */
    override fun output(output: String) {
      cdkBuilder.output(output)
    }

    /**
     * @param outputsFile Path to file where stack outputs will be written after a successful deploy
     * as JSON.
     */
    override fun outputsFile(outputsFile: String) {
      cdkBuilder.outputsFile(outputsFile)
    }

    /**
     * @param parameters Additional parameters for CloudFormation at deploy time.
     */
    override fun parameters(parameters: Map<String, String>) {
      cdkBuilder.parameters(parameters)
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
     * @param requireApproval What kind of security changes require approval.
     */
    override fun requireApproval(requireApproval: RequireApproval) {
      cdkBuilder.requireApproval(requireApproval.let(RequireApproval.Companion::unwrap))
    }

    /**
     * @param reuseAssets Reuse the assets with the given asset IDs.
     */
    override fun reuseAssets(reuseAssets: List<String>) {
      cdkBuilder.reuseAssets(reuseAssets)
    }

    /**
     * @param reuseAssets Reuse the assets with the given asset IDs.
     */
    override fun reuseAssets(vararg reuseAssets: String): Unit = reuseAssets(reuseAssets.toList())

    /**
     * @param roleArn Role to pass to CloudFormation for deployment.
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    /**
     * @param rollback Rollback failed deployments.
     */
    override fun rollback(rollback: Boolean) {
      cdkBuilder.rollback(rollback)
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
     * @param toolkitStackName Name of the toolkit stack to use/deploy.
     */
    override fun toolkitStackName(toolkitStackName: String) {
      cdkBuilder.toolkitStackName(toolkitStackName)
    }

    /**
     * @param trace Print trace for stack warnings.
     */
    override fun trace(trace: Boolean) {
      cdkBuilder.trace(trace)
    }

    /**
     * @param usePreviousParameters Use previous values for unspecified parameters.
     * If not set, all parameters must be specified for every deployment.
     */
    override fun usePreviousParameters(usePreviousParameters: Boolean) {
      cdkBuilder.usePreviousParameters(usePreviousParameters)
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

    public fun build(): software.amazon.awscdk.cloud_assembly_schema.DeployOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.cloud_assembly_schema.DeployOptions,
  ) : CdkObject(cdkObject),
      DeployOptions {
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
     * Optional name to use for the CloudFormation change set.
     *
     * If not provided, a name will be generated automatically.
     *
     * Default: - auto generate a name
     */
    override fun changeSetName(): String? = unwrap(this).getChangeSetName()

    /**
     * Whether we are on a CI system.
     *
     * Default: false
     */
    override fun ci(): Boolean? = unwrap(this).getCi()

    /**
     * Show colors and other style from console output.
     *
     * Default: true
     */
    override fun color(): Boolean? = unwrap(this).getColor()

    /**
     * Deploy multiple stacks in parallel.
     *
     * Default: 1
     */
    override fun concurrency(): Number? = unwrap(this).getConcurrency()

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
     * Only perform action on the given stack.
     *
     * Default: false
     */
    override fun exclusively(): Boolean? = unwrap(this).getExclusively()

    /**
     * Whether to execute the ChangeSet Not providing `execute` parameter will result in execution
     * of ChangeSet.
     *
     * Default: true
     */
    override fun execute(): Boolean? = unwrap(this).getExecute()

    /**
     * Always deploy, even if templates are identical.
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
     * ARNs of SNS topics that CloudFormation will notify with stack related events.
     *
     * Default: - no notifications
     */
    override fun notificationArns(): List<String> = unwrap(this).getNotificationArns() ?:
        emptyList()

    /**
     * Emits the synthesized cloud assembly into a directory.
     *
     * Default: cdk.out
     */
    override fun output(): String? = unwrap(this).getOutput()

    /**
     * Path to file where stack outputs will be written after a successful deploy as JSON.
     *
     * Default: - Outputs are not written to any file
     */
    override fun outputsFile(): String? = unwrap(this).getOutputsFile()

    /**
     * Additional parameters for CloudFormation at deploy time.
     *
     * Default: {}
     */
    override fun parameters(): Map<String, String> = unwrap(this).getParameters() ?: emptyMap()

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
     * What kind of security changes require approval.
     *
     * Default: RequireApproval.NEVER
     */
    override fun requireApproval(): RequireApproval? =
        unwrap(this).getRequireApproval()?.let(RequireApproval::wrap)

    /**
     * Reuse the assets with the given asset IDs.
     *
     * Default: - do not reuse assets
     */
    override fun reuseAssets(): List<String> = unwrap(this).getReuseAssets() ?: emptyList()

    /**
     * Role to pass to CloudFormation for deployment.
     *
     * Default: - use the bootstrap cfn-exec role
     */
    override fun roleArn(): String? = unwrap(this).getRoleArn()

    /**
     * Rollback failed deployments.
     *
     * Default: true
     */
    override fun rollback(): Boolean? = unwrap(this).getRollback()

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
     * Name of the toolkit stack to use/deploy.
     *
     * Default: CDKToolkit
     */
    override fun toolkitStackName(): String? = unwrap(this).getToolkitStackName()

    /**
     * Print trace for stack warnings.
     *
     * Default: false
     */
    override fun trace(): Boolean? = unwrap(this).getTrace()

    /**
     * Use previous values for unspecified parameters.
     *
     * If not set, all parameters must be specified for every deployment.
     *
     * Default: true
     */
    override fun usePreviousParameters(): Boolean? = unwrap(this).getUsePreviousParameters()

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
    public operator fun invoke(block: Builder.() -> Unit = {}): DeployOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.cloud_assembly_schema.DeployOptions):
        DeployOptions = CdkObjectWrappers.wrap(cdkObject) as? DeployOptions ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: DeployOptions):
        software.amazon.awscdk.cloud_assembly_schema.DeployOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.cloud_assembly_schema.DeployOptions
  }
}
