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

package cloudshift.awscdk.dsl.cloudassembly.schema

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.cloudassembly.schema.DeployOptions
import software.amazon.awscdk.cloudassembly.schema.RequireApproval

/**
 * Options to use with cdk deploy.
 *
 * Example:
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
@CdkDslMarker
public class DeployOptionsDsl {
    private val cdkBuilder: DeployOptions.Builder = DeployOptions.builder()

    private val _notificationArns: MutableList<String> = mutableListOf()

    private val _reuseAssets: MutableList<String> = mutableListOf()

    private val _stacks: MutableList<String> = mutableListOf()

    /** @param all Deploy all stacks. Requried if `stacks` is not set */
    public fun all(all: Boolean) {
        cdkBuilder.all(all)
    }

    /**
     * @param app command-line for executing your app or a cloud assembly directory e.g. "node
     *   bin/my-app.js" or "cdk.out".
     */
    public fun app(app: String) {
        cdkBuilder.app(app)
    }

    /**
     * @param assetMetadata Include "aws:asset:*" CloudFormation metadata for resources that use
     *   assets.
     */
    public fun assetMetadata(assetMetadata: Boolean) {
        cdkBuilder.assetMetadata(assetMetadata)
    }

    /** @param caBundlePath Path to CA certificate to use when validating HTTPS requests. */
    public fun caBundlePath(caBundlePath: String) {
        cdkBuilder.caBundlePath(caBundlePath)
    }

    /**
     * @param changeSetName Optional name to use for the CloudFormation change set. If not provided,
     *   a name will be generated automatically.
     */
    public fun changeSetName(changeSetName: String) {
        cdkBuilder.changeSetName(changeSetName)
    }

    /** @param ci Whether we are on a CI system. */
    public fun ci(ci: Boolean) {
        cdkBuilder.ci(ci)
    }

    /** @param color Show colors and other style from console output. */
    public fun color(color: Boolean) {
        cdkBuilder.color(color)
    }

    /** @param context Additional context. */
    public fun context(context: Map<String, String>) {
        cdkBuilder.context(context)
    }

    /**
     * @param debug enable emission of additional debugging information, such as creation stack
     *   traces of tokens.
     */
    public fun debug(debug: Boolean) {
        cdkBuilder.debug(debug)
    }

    /** @param ec2Creds Force trying to fetch EC2 instance credentials. */
    public fun ec2Creds(ec2Creds: Boolean) {
        cdkBuilder.ec2Creds(ec2Creds)
    }

    /** @param exclusively Only perform action on the given stack. */
    public fun exclusively(exclusively: Boolean) {
        cdkBuilder.exclusively(exclusively)
    }

    /**
     * @param execute Whether to execute the ChangeSet Not providing `execute` parameter will result
     *   in execution of ChangeSet.
     */
    public fun execute(execute: Boolean) {
        cdkBuilder.execute(execute)
    }

    /** @param force Always deploy, even if templates are identical. */
    public fun force(force: Boolean) {
        cdkBuilder.force(force)
    }

    /**
     * @param ignoreErrors Ignores synthesis errors, which will likely produce an invalid output.
     */
    public fun ignoreErrors(ignoreErrors: Boolean) {
        cdkBuilder.ignoreErrors(ignoreErrors)
    }

    /** @param json Use JSON output instead of YAML when templates are printed to STDOUT. */
    public fun json(json: Boolean) {
        cdkBuilder.json(json)
    }

    /**
     * @param lookups Perform context lookups. Synthesis fails if this is disabled and context
     *   lookups need to be performed
     */
    public fun lookups(lookups: Boolean) {
        cdkBuilder.lookups(lookups)
    }

    /** @param notices Show relevant notices. */
    public fun notices(notices: Boolean) {
        cdkBuilder.notices(notices)
    }

    /**
     * @param notificationArns ARNs of SNS topics that CloudFormation will notify with stack related
     *   events.
     */
    public fun notificationArns(vararg notificationArns: String) {
        _notificationArns.addAll(listOf(*notificationArns))
    }

    /**
     * @param notificationArns ARNs of SNS topics that CloudFormation will notify with stack related
     *   events.
     */
    public fun notificationArns(notificationArns: Collection<String>) {
        _notificationArns.addAll(notificationArns)
    }

    /** @param output Emits the synthesized cloud assembly into a directory. */
    public fun output(output: String) {
        cdkBuilder.output(output)
    }

    /**
     * @param outputsFile Path to file where stack outputs will be written after a successful deploy
     *   as JSON.
     */
    public fun outputsFile(outputsFile: String) {
        cdkBuilder.outputsFile(outputsFile)
    }

    /** @param parameters Additional parameters for CloudFormation at deploy time. */
    public fun parameters(parameters: Map<String, String>) {
        cdkBuilder.parameters(parameters)
    }

    /** @param pathMetadata Include "aws:cdk:path" CloudFormation metadata for each resource. */
    public fun pathMetadata(pathMetadata: Boolean) {
        cdkBuilder.pathMetadata(pathMetadata)
    }

    /** @param profile Use the indicated AWS profile as the default environment. */
    public fun profile(profile: String) {
        cdkBuilder.profile(profile)
    }

    /** @param proxy Use the indicated proxy. Will read from HTTPS_PROXY environment if specified */
    public fun proxy(proxy: String) {
        cdkBuilder.proxy(proxy)
    }

    /** @param requireApproval What kind of security changes require approval. */
    public fun requireApproval(requireApproval: RequireApproval) {
        cdkBuilder.requireApproval(requireApproval)
    }

    /** @param reuseAssets Reuse the assets with the given asset IDs. */
    public fun reuseAssets(vararg reuseAssets: String) {
        _reuseAssets.addAll(listOf(*reuseAssets))
    }

    /** @param reuseAssets Reuse the assets with the given asset IDs. */
    public fun reuseAssets(reuseAssets: Collection<String>) {
        _reuseAssets.addAll(reuseAssets)
    }

    /** @param roleArn Role to pass to CloudFormation for deployment. */
    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    /** @param rollback Rollback failed deployments. */
    public fun rollback(rollback: Boolean) {
        cdkBuilder.rollback(rollback)
    }

    /** @param stacks List of stacks to deploy. Requried if `all` is not set */
    public fun stacks(vararg stacks: String) {
        _stacks.addAll(listOf(*stacks))
    }

    /** @param stacks List of stacks to deploy. Requried if `all` is not set */
    public fun stacks(stacks: Collection<String>) {
        _stacks.addAll(stacks)
    }

    /**
     * @param staging Copy assets to the output directory. Needed for local debugging the source
     *   files with SAM CLI
     */
    public fun staging(staging: Boolean) {
        cdkBuilder.staging(staging)
    }

    /** @param strict Do not construct stacks with warnings. */
    public fun strict(strict: Boolean) {
        cdkBuilder.strict(strict)
    }

    /** @param toolkitStackName Name of the toolkit stack to use/deploy. */
    public fun toolkitStackName(toolkitStackName: String) {
        cdkBuilder.toolkitStackName(toolkitStackName)
    }

    /** @param trace Print trace for stack warnings. */
    public fun trace(trace: Boolean) {
        cdkBuilder.trace(trace)
    }

    /**
     * @param usePreviousParameters Use previous values for unspecified parameters. If not set, all
     *   parameters must be specified for every deployment.
     */
    public fun usePreviousParameters(usePreviousParameters: Boolean) {
        cdkBuilder.usePreviousParameters(usePreviousParameters)
    }

    /** @param verbose show debug logs. */
    public fun verbose(verbose: Boolean) {
        cdkBuilder.verbose(verbose)
    }

    /** @param versionReporting Include "AWS::CDK::Metadata" resource in synthesized templates. */
    public fun versionReporting(versionReporting: Boolean) {
        cdkBuilder.versionReporting(versionReporting)
    }

    public fun build(): DeployOptions {
        if (_notificationArns.isNotEmpty()) cdkBuilder.notificationArns(_notificationArns)
        if (_reuseAssets.isNotEmpty()) cdkBuilder.reuseAssets(_reuseAssets)
        if (_stacks.isNotEmpty()) cdkBuilder.stacks(_stacks)
        return cdkBuilder.build()
    }
}
