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

package cloudshift.awscdk.dsl.services.amplify

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.amplify.CfnApp
import software.constructs.Construct

/**
 * The AWS::Amplify::App resource specifies Apps in Amplify Hosting.
 *
 * An App is a collection of branches.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.amplify.*;
 * CfnApp cfnApp = CfnApp.Builder.create(this, "MyCfnApp")
 * .name("name")
 * // the properties below are optional
 * .accessToken("accessToken")
 * .autoBranchCreationConfig(AutoBranchCreationConfigProperty.builder()
 * .autoBranchCreationPatterns(List.of("autoBranchCreationPatterns"))
 * .basicAuthConfig(BasicAuthConfigProperty.builder()
 * .enableBasicAuth(false)
 * .password("password")
 * .username("username")
 * .build())
 * .buildSpec("buildSpec")
 * .enableAutoBranchCreation(false)
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
 * .build())
 * .basicAuthConfig(BasicAuthConfigProperty.builder()
 * .enableBasicAuth(false)
 * .password("password")
 * .username("username")
 * .build())
 * .buildSpec("buildSpec")
 * .customHeaders("customHeaders")
 * .customRules(List.of(CustomRuleProperty.builder()
 * .source("source")
 * .target("target")
 * // the properties below are optional
 * .condition("condition")
 * .status("status")
 * .build()))
 * .description("description")
 * .enableBranchAutoDeletion(false)
 * .environmentVariables(List.of(EnvironmentVariableProperty.builder()
 * .name("name")
 * .value("value")
 * .build()))
 * .iamServiceRole("iamServiceRole")
 * .oauthToken("oauthToken")
 * .platform("platform")
 * .repository("repository")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html)
 */
@CdkDslMarker
public class CfnAppDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnApp.Builder = CfnApp.Builder.create(scope, id)

    private val _customRules: MutableList<Any> = mutableListOf()

    private val _environmentVariables: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * The personal access token for a GitHub repository for an Amplify app.
     *
     * The personal access token is used to authorize access to a GitHub repository using the
     * Amplify GitHub App. The token is not stored.
     *
     * Use `AccessToken` for GitHub repositories only. To authorize access to a repository provider
     * such as Bitbucket or CodeCommit, use `OauthToken` .
     *
     * You must specify either `AccessToken` or `OauthToken` when you create a new app.
     *
     * Existing Amplify apps deployed from a GitHub repository using OAuth continue to work with
     * CI/CD. However, we strongly recommend that you migrate these apps to use the GitHub App. For
     * more information, see
     * [Migrating an existing OAuth app to the Amplify GitHub App](https://docs.aws.amazon.com/amplify/latest/userguide/setting-up-GitHub-access.html#migrating-to-github-app-auth)
     * in the *Amplify User Guide* .
     *
     * *Length Constraints:* Minimum length of 1. Maximum length of 255.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-accesstoken)
     *
     * @param accessToken The personal access token for a GitHub repository for an Amplify app.
     */
    public fun accessToken(accessToken: String) {
        cdkBuilder.accessToken(accessToken)
    }

    /**
     * Sets the configuration for your automatic branch creation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-autobranchcreationconfig)
     *
     * @param autoBranchCreationConfig Sets the configuration for your automatic branch creation.
     */
    public fun autoBranchCreationConfig(autoBranchCreationConfig: IResolvable) {
        cdkBuilder.autoBranchCreationConfig(autoBranchCreationConfig)
    }

    /**
     * Sets the configuration for your automatic branch creation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-autobranchcreationconfig)
     *
     * @param autoBranchCreationConfig Sets the configuration for your automatic branch creation.
     */
    public fun autoBranchCreationConfig(
        autoBranchCreationConfig: CfnApp.AutoBranchCreationConfigProperty
    ) {
        cdkBuilder.autoBranchCreationConfig(autoBranchCreationConfig)
    }

    /**
     * The credentials for basic authorization for an Amplify app.
     *
     * You must base64-encode the authorization credentials and provide them in the format
     * `user:password` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-basicauthconfig)
     *
     * @param basicAuthConfig The credentials for basic authorization for an Amplify app.
     */
    public fun basicAuthConfig(basicAuthConfig: IResolvable) {
        cdkBuilder.basicAuthConfig(basicAuthConfig)
    }

    /**
     * The credentials for basic authorization for an Amplify app.
     *
     * You must base64-encode the authorization credentials and provide them in the format
     * `user:password` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-basicauthconfig)
     *
     * @param basicAuthConfig The credentials for basic authorization for an Amplify app.
     */
    public fun basicAuthConfig(basicAuthConfig: CfnApp.BasicAuthConfigProperty) {
        cdkBuilder.basicAuthConfig(basicAuthConfig)
    }

    /**
     * The build specification (build spec) for an Amplify app.
     *
     * *Length Constraints:* Minimum length of 1. Maximum length of 25000.
     *
     * *Pattern:* (?s).+
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-buildspec)
     *
     * @param buildSpec The build specification (build spec) for an Amplify app.
     */
    public fun buildSpec(buildSpec: String) {
        cdkBuilder.buildSpec(buildSpec)
    }

    /**
     * The custom HTTP headers for an Amplify app.
     *
     * *Length Constraints:* Minimum length of 0. Maximum length of 25000.
     *
     * *Pattern:* (?s).*
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-customheaders)
     *
     * @param customHeaders The custom HTTP headers for an Amplify app.
     */
    public fun customHeaders(customHeaders: String) {
        cdkBuilder.customHeaders(customHeaders)
    }

    /**
     * The custom rewrite and redirect rules for an Amplify app.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-customrules)
     *
     * @param customRules The custom rewrite and redirect rules for an Amplify app.
     */
    public fun customRules(vararg customRules: Any) {
        _customRules.addAll(listOf(*customRules))
    }

    /**
     * The custom rewrite and redirect rules for an Amplify app.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-customrules)
     *
     * @param customRules The custom rewrite and redirect rules for an Amplify app.
     */
    public fun customRules(customRules: Collection<Any>) {
        _customRules.addAll(customRules)
    }

    /**
     * The custom rewrite and redirect rules for an Amplify app.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-customrules)
     *
     * @param customRules The custom rewrite and redirect rules for an Amplify app.
     */
    public fun customRules(customRules: IResolvable) {
        cdkBuilder.customRules(customRules)
    }

    /**
     * The description for an Amplify app.
     *
     * *Length Constraints:* Maximum length of 1000.
     *
     * *Pattern:* (?s).*
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-description)
     *
     * @param description The description for an Amplify app.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * Automatically disconnect a branch in Amplify Hosting when you delete a branch from your Git
     * repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-enablebranchautodeletion)
     *
     * @param enableBranchAutoDeletion Automatically disconnect a branch in Amplify Hosting when you
     *   delete a branch from your Git repository.
     */
    public fun enableBranchAutoDeletion(enableBranchAutoDeletion: Boolean) {
        cdkBuilder.enableBranchAutoDeletion(enableBranchAutoDeletion)
    }

    /**
     * Automatically disconnect a branch in Amplify Hosting when you delete a branch from your Git
     * repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-enablebranchautodeletion)
     *
     * @param enableBranchAutoDeletion Automatically disconnect a branch in Amplify Hosting when you
     *   delete a branch from your Git repository.
     */
    public fun enableBranchAutoDeletion(enableBranchAutoDeletion: IResolvable) {
        cdkBuilder.enableBranchAutoDeletion(enableBranchAutoDeletion)
    }

    /**
     * The environment variables map for an Amplify app.
     *
     * For a list of the environment variables that are accessible to Amplify by default, see
     * [Amplify Environment variables](https://docs.aws.amazon.com/amplify/latest/userguide/amplify-console-environment-variables.html)
     * in the *Amplify Hosting User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-environmentvariables)
     *
     * @param environmentVariables The environment variables map for an Amplify app.
     */
    public fun environmentVariables(vararg environmentVariables: Any) {
        _environmentVariables.addAll(listOf(*environmentVariables))
    }

    /**
     * The environment variables map for an Amplify app.
     *
     * For a list of the environment variables that are accessible to Amplify by default, see
     * [Amplify Environment variables](https://docs.aws.amazon.com/amplify/latest/userguide/amplify-console-environment-variables.html)
     * in the *Amplify Hosting User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-environmentvariables)
     *
     * @param environmentVariables The environment variables map for an Amplify app.
     */
    public fun environmentVariables(environmentVariables: Collection<Any>) {
        _environmentVariables.addAll(environmentVariables)
    }

    /**
     * The environment variables map for an Amplify app.
     *
     * For a list of the environment variables that are accessible to Amplify by default, see
     * [Amplify Environment variables](https://docs.aws.amazon.com/amplify/latest/userguide/amplify-console-environment-variables.html)
     * in the *Amplify Hosting User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-environmentvariables)
     *
     * @param environmentVariables The environment variables map for an Amplify app.
     */
    public fun environmentVariables(environmentVariables: IResolvable) {
        cdkBuilder.environmentVariables(environmentVariables)
    }

    /**
     * The AWS Identity and Access Management (IAM) service role for the Amazon Resource Name (ARN)
     * of the Amplify app.
     *
     * *Length Constraints:* Minimum length of 0. Maximum length of 1000.
     *
     * *Pattern:* (?s).*
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-iamservicerole)
     *
     * @param iamServiceRole The AWS Identity and Access Management (IAM) service role for the
     *   Amazon Resource Name (ARN) of the Amplify app.
     */
    public fun iamServiceRole(iamServiceRole: String) {
        cdkBuilder.iamServiceRole(iamServiceRole)
    }

    /**
     * The name for an Amplify app.
     *
     * *Length Constraints:* Minimum length of 1. Maximum length of 255.
     *
     * *Pattern:* (?s).+
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-name)
     *
     * @param name The name for an Amplify app.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * The OAuth token for a third-party source control system for an Amplify app.
     *
     * The OAuth token is used to create a webhook and a read-only deploy key using SSH cloning. The
     * OAuth token is not stored.
     *
     * Use `OauthToken` for repository providers other than GitHub, such as Bitbucket or CodeCommit.
     * To authorize access to GitHub as your repository provider, use `AccessToken` .
     *
     * You must specify either `OauthToken` or `AccessToken` when you create a new app.
     *
     * Existing Amplify apps deployed from a GitHub repository using OAuth continue to work with
     * CI/CD. However, we strongly recommend that you migrate these apps to use the GitHub App. For
     * more information, see
     * [Migrating an existing OAuth app to the Amplify GitHub App](https://docs.aws.amazon.com/amplify/latest/userguide/setting-up-GitHub-access.html#migrating-to-github-app-auth)
     * in the *Amplify User Guide* .
     *
     * *Length Constraints:* Maximum length of 1000.
     *
     * *Pattern:* (?s).*
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-oauthtoken)
     *
     * @param oauthToken The OAuth token for a third-party source control system for an Amplify app.
     */
    public fun oauthToken(oauthToken: String) {
        cdkBuilder.oauthToken(oauthToken)
    }

    /**
     * The platform for the Amplify app.
     *
     * For a static app, set the platform type to `WEB` . For a dynamic server-side rendered (SSR)
     * app, set the platform type to `WEB_COMPUTE` . For an app requiring Amplify Hosting's original
     * SSR support only, set the platform type to `WEB_DYNAMIC` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-platform)
     *
     * @param platform The platform for the Amplify app.
     */
    public fun platform(platform: String) {
        cdkBuilder.platform(platform)
    }

    /**
     * The repository for an Amplify app.
     *
     * *Pattern:* (?s).*
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-repository)
     *
     * @param repository The repository for an Amplify app.
     */
    public fun repository(repository: String) {
        cdkBuilder.repository(repository)
    }

    /**
     * The tag for an Amplify app.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-tags)
     *
     * @param tags The tag for an Amplify app.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * The tag for an Amplify app.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-tags)
     *
     * @param tags The tag for an Amplify app.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnApp {
        if (_customRules.isNotEmpty()) cdkBuilder.customRules(_customRules)
        if (_environmentVariables.isNotEmpty())
            cdkBuilder.environmentVariables(_environmentVariables)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
