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

package io.cloudshiftdev.awscdkdsl.cloudassembly.schema

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.cloudassembly.schema.DestroyOptions

/**
 * Options to use with cdk destroy.
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
public class DestroyOptionsDsl {
    private val cdkBuilder: DestroyOptions.Builder = DestroyOptions.builder()

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

    /** @param exclusively Only destroy the given stack. */
    public fun exclusively(exclusively: Boolean) {
        cdkBuilder.exclusively(exclusively)
    }

    /** @param force Do not ask for permission before destroying stacks. */
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

    /** @param output Emits the synthesized cloud assembly into a directory. */
    public fun output(output: String) {
        cdkBuilder.output(output)
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

    /** @param roleArn Role to pass to CloudFormation for deployment. */
    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
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

    /** @param trace Print trace for stack warnings. */
    public fun trace(trace: Boolean) {
        cdkBuilder.trace(trace)
    }

    /** @param verbose show debug logs. */
    public fun verbose(verbose: Boolean) {
        cdkBuilder.verbose(verbose)
    }

    /** @param versionReporting Include "AWS::CDK::Metadata" resource in synthesized templates. */
    public fun versionReporting(versionReporting: Boolean) {
        cdkBuilder.versionReporting(versionReporting)
    }

    public fun build(): DestroyOptions {
        if (_stacks.isNotEmpty()) cdkBuilder.stacks(_stacks)
        return cdkBuilder.build()
    }
}
