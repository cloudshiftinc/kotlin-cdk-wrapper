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

package io.cloudshiftdev.awscdkdsl.services.amplify

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.amplify.CfnBranch
import software.amazon.awscdk.services.amplify.CfnBranchProps

/**
 * Properties for defining a `CfnBranch`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.amplify.*;
 * CfnBranchProps cfnBranchProps = CfnBranchProps.builder()
 * .appId("appId")
 * .branchName("branchName")
 * // the properties below are optional
 * .basicAuthConfig(BasicAuthConfigProperty.builder()
 * .password("password")
 * .username("username")
 * // the properties below are optional
 * .enableBasicAuth(false)
 * .build())
 * .buildSpec("buildSpec")
 * .description("description")
 * .enableAutoBuild(false)
 * .enablePerformanceMode(false)
 * .enablePullRequestPreview(false)
 * .environmentVariables(List.of(EnvironmentVariableProperty.builder()
 * .name("name")
 * .value("value")
 * .build()))
 * .framework("framework")
 * .pullRequestEnvironmentName("pullRequestEnvironmentName")
 * .stage("stage")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-branch.html)
 */
@CdkDslMarker
public class CfnBranchPropsDsl {
    private val cdkBuilder: CfnBranchProps.Builder = CfnBranchProps.builder()

    private val _environmentVariables: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param appId The unique ID for an Amplify app. *Length Constraints:* Minimum length of 1.
     *   Maximum length of 20.
     *
     * *Pattern:* d[a-z0-9]+
     */
    public fun appId(appId: String) {
        cdkBuilder.appId(appId)
    }

    /**
     * @param basicAuthConfig The basic authorization credentials for a branch of an Amplify app.
     *   You must base64-encode the authorization credentials and provide them in the format
     *   `user:password` .
     */
    public fun basicAuthConfig(basicAuthConfig: IResolvable) {
        cdkBuilder.basicAuthConfig(basicAuthConfig)
    }

    /**
     * @param basicAuthConfig The basic authorization credentials for a branch of an Amplify app.
     *   You must base64-encode the authorization credentials and provide them in the format
     *   `user:password` .
     */
    public fun basicAuthConfig(basicAuthConfig: CfnBranch.BasicAuthConfigProperty) {
        cdkBuilder.basicAuthConfig(basicAuthConfig)
    }

    /**
     * @param branchName The name for the branch. *Length Constraints:* Minimum length of 1. Maximum
     *   length of 255.
     *
     * *Pattern:* (?s).+
     */
    public fun branchName(branchName: String) {
        cdkBuilder.branchName(branchName)
    }

    /**
     * @param buildSpec The build specification (build spec) for the branch. *Length Constraints:*
     *   Minimum length of 1. Maximum length of 25000.
     *
     * *Pattern:* (?s).+
     */
    public fun buildSpec(buildSpec: String) {
        cdkBuilder.buildSpec(buildSpec)
    }

    /**
     * @param description The description for the branch that is part of an Amplify app. *Length
     *   Constraints:* Maximum length of 1000.
     *
     * *Pattern:* (?s).*
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param enableAutoBuild Enables auto building for the branch. */
    public fun enableAutoBuild(enableAutoBuild: Boolean) {
        cdkBuilder.enableAutoBuild(enableAutoBuild)
    }

    /** @param enableAutoBuild Enables auto building for the branch. */
    public fun enableAutoBuild(enableAutoBuild: IResolvable) {
        cdkBuilder.enableAutoBuild(enableAutoBuild)
    }

    /**
     * @param enablePerformanceMode Enables performance mode for the branch. Performance mode
     *   optimizes for faster hosting performance by keeping content cached at the edge for a longer
     *   interval. When performance mode is enabled, hosting configuration or code changes can take
     *   up to 10 minutes to roll out.
     */
    public fun enablePerformanceMode(enablePerformanceMode: Boolean) {
        cdkBuilder.enablePerformanceMode(enablePerformanceMode)
    }

    /**
     * @param enablePerformanceMode Enables performance mode for the branch. Performance mode
     *   optimizes for faster hosting performance by keeping content cached at the edge for a longer
     *   interval. When performance mode is enabled, hosting configuration or code changes can take
     *   up to 10 minutes to roll out.
     */
    public fun enablePerformanceMode(enablePerformanceMode: IResolvable) {
        cdkBuilder.enablePerformanceMode(enablePerformanceMode)
    }

    /**
     * @param enablePullRequestPreview Specifies whether Amplify Hosting creates a preview for each
     *   pull request that is made for this branch. If this property is enabled, Amplify deploys
     *   your app to a unique preview URL after each pull request is opened. Development and QA
     *   teams can use this preview to test the pull request before it's merged into a production or
     *   integration branch.
     *
     * To provide backend support for your preview, Amplify automatically provisions a temporary
     * backend environment that it deletes when the pull request is closed. If you want to specify a
     * dedicated backend environment for your previews, use the `PullRequestEnvironmentName`
     * property.
     *
     * For more information, see
     * [Web Previews](https://docs.aws.amazon.com/amplify/latest/userguide/pr-previews.html) in the
     * *AWS Amplify Hosting User Guide* .
     */
    public fun enablePullRequestPreview(enablePullRequestPreview: Boolean) {
        cdkBuilder.enablePullRequestPreview(enablePullRequestPreview)
    }

    /**
     * @param enablePullRequestPreview Specifies whether Amplify Hosting creates a preview for each
     *   pull request that is made for this branch. If this property is enabled, Amplify deploys
     *   your app to a unique preview URL after each pull request is opened. Development and QA
     *   teams can use this preview to test the pull request before it's merged into a production or
     *   integration branch.
     *
     * To provide backend support for your preview, Amplify automatically provisions a temporary
     * backend environment that it deletes when the pull request is closed. If you want to specify a
     * dedicated backend environment for your previews, use the `PullRequestEnvironmentName`
     * property.
     *
     * For more information, see
     * [Web Previews](https://docs.aws.amazon.com/amplify/latest/userguide/pr-previews.html) in the
     * *AWS Amplify Hosting User Guide* .
     */
    public fun enablePullRequestPreview(enablePullRequestPreview: IResolvable) {
        cdkBuilder.enablePullRequestPreview(enablePullRequestPreview)
    }

    /** @param environmentVariables The environment variables for the branch. */
    public fun environmentVariables(vararg environmentVariables: Any) {
        _environmentVariables.addAll(listOf(*environmentVariables))
    }

    /** @param environmentVariables The environment variables for the branch. */
    public fun environmentVariables(environmentVariables: Collection<Any>) {
        _environmentVariables.addAll(environmentVariables)
    }

    /** @param environmentVariables The environment variables for the branch. */
    public fun environmentVariables(environmentVariables: IResolvable) {
        cdkBuilder.environmentVariables(environmentVariables)
    }

    /** @param framework The framework for the branch. */
    public fun framework(framework: String) {
        cdkBuilder.framework(framework)
    }

    /**
     * @param pullRequestEnvironmentName If pull request previews are enabled for this branch, you
     *   can use this property to specify a dedicated backend environment for your previews. For
     *   example, you could specify an environment named `prod` , `test` , or `dev` that you
     *   initialized with the Amplify CLI and mapped to this branch.
     *
     * To enable pull request previews, set the `EnablePullRequestPreview` property to `true` .
     *
     * If you don't specify an environment, Amplify Hosting provides backend support for each
     * preview by automatically provisioning a temporary backend environment. Amplify Hosting
     * deletes this environment when the pull request is closed.
     *
     * For more information about creating backend environments, see
     * [Feature Branch Deployments and Team Workflows](https://docs.aws.amazon.com/amplify/latest/userguide/multi-environments.html)
     * in the *AWS Amplify Hosting User Guide* .
     *
     * *Length Constraints:* Maximum length of 20.
     *
     * *Pattern:* (?s).*
     */
    public fun pullRequestEnvironmentName(pullRequestEnvironmentName: String) {
        cdkBuilder.pullRequestEnvironmentName(pullRequestEnvironmentName)
    }

    /**
     * @param stage Describes the current stage for the branch. *Valid Values:* PRODUCTION | BETA |
     *   DEVELOPMENT | EXPERIMENTAL | PULL_REQUEST
     */
    public fun stage(stage: String) {
        cdkBuilder.stage(stage)
    }

    /** @param tags The tag for the branch. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags The tag for the branch. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnBranchProps {
        if (_environmentVariables.isNotEmpty())
            cdkBuilder.environmentVariables(_environmentVariables)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
