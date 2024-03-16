@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.amplify

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnBranch`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.amplify.*;
 * CfnBranchProps cfnBranchProps = CfnBranchProps.builder()
 * .appId("appId")
 * .branchName("branchName")
 * // the properties below are optional
 * .backend(BackendProperty.builder()
 * .stackArn("stackArn")
 * .build())
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
public interface CfnBranchProps {
  /**
   * The unique ID for an Amplify app.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-branch.html#cfn-amplify-branch-appid)
   */
  public fun appId(): String

  /**
   * Specifies the backend for a `Branch` of an Amplify app.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-branch.html#cfn-amplify-branch-backend)
   */
  public fun backend(): Any? = unwrap(this).getBackend()

  /**
   * The basic authorization credentials for a branch of an Amplify app.
   *
   * You must base64-encode the authorization credentials and provide them in the format
   * `user:password` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-branch.html#cfn-amplify-branch-basicauthconfig)
   */
  public fun basicAuthConfig(): Any? = unwrap(this).getBasicAuthConfig()

  /**
   * The name for the branch.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-branch.html#cfn-amplify-branch-branchname)
   */
  public fun branchName(): String

  /**
   * The build specification (build spec) for the branch.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-branch.html#cfn-amplify-branch-buildspec)
   */
  public fun buildSpec(): String? = unwrap(this).getBuildSpec()

  /**
   * The description for the branch that is part of an Amplify app.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-branch.html#cfn-amplify-branch-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * Enables auto building for the branch.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-branch.html#cfn-amplify-branch-enableautobuild)
   */
  public fun enableAutoBuild(): Any? = unwrap(this).getEnableAutoBuild()

  /**
   * Enables performance mode for the branch.
   *
   * Performance mode optimizes for faster hosting performance by keeping content cached at the edge
   * for a longer interval. When performance mode is enabled, hosting configuration or code changes can
   * take up to 10 minutes to roll out.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-branch.html#cfn-amplify-branch-enableperformancemode)
   */
  public fun enablePerformanceMode(): Any? = unwrap(this).getEnablePerformanceMode()

  /**
   * Specifies whether Amplify Hosting creates a preview for each pull request that is made for this
   * branch.
   *
   * If this property is enabled, Amplify deploys your app to a unique preview URL after each pull
   * request is opened. Development and QA teams can use this preview to test the pull request before
   * it's merged into a production or integration branch.
   *
   * To provide backend support for your preview, Amplify automatically provisions a temporary
   * backend environment that it deletes when the pull request is closed. If you want to specify a
   * dedicated backend environment for your previews, use the `PullRequestEnvironmentName` property.
   *
   * For more information, see [Web
   * Previews](https://docs.aws.amazon.com/amplify/latest/userguide/pr-previews.html) in the *AWS
   * Amplify Hosting User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-branch.html#cfn-amplify-branch-enablepullrequestpreview)
   */
  public fun enablePullRequestPreview(): Any? = unwrap(this).getEnablePullRequestPreview()

  /**
   * The environment variables for the branch.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-branch.html#cfn-amplify-branch-environmentvariables)
   */
  public fun environmentVariables(): Any? = unwrap(this).getEnvironmentVariables()

  /**
   * The framework for the branch.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-branch.html#cfn-amplify-branch-framework)
   */
  public fun framework(): String? = unwrap(this).getFramework()

  /**
   * If pull request previews are enabled for this branch, you can use this property to specify a
   * dedicated backend environment for your previews.
   *
   * For example, you could specify an environment named `prod` , `test` , or `dev` that you
   * initialized with the Amplify CLI and mapped to this branch.
   *
   * To enable pull request previews, set the `EnablePullRequestPreview` property to `true` .
   *
   * If you don't specify an environment, Amplify Hosting provides backend support for each preview
   * by automatically provisioning a temporary backend environment. Amplify Hosting deletes this
   * environment when the pull request is closed.
   *
   * For more information about creating backend environments, see [Feature Branch Deployments and
   * Team Workflows](https://docs.aws.amazon.com/amplify/latest/userguide/multi-environments.html) in
   * the *AWS Amplify Hosting User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-branch.html#cfn-amplify-branch-pullrequestenvironmentname)
   */
  public fun pullRequestEnvironmentName(): String? = unwrap(this).getPullRequestEnvironmentName()

  /**
   * Describes the current stage for the branch.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-branch.html#cfn-amplify-branch-stage)
   */
  public fun stage(): String? = unwrap(this).getStage()

  /**
   * The tag for the branch.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-branch.html#cfn-amplify-branch-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnBranchProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param appId The unique ID for an Amplify app. 
     */
    public fun appId(appId: String)

    /**
     * @param backend Specifies the backend for a `Branch` of an Amplify app.
     */
    public fun backend(backend: IResolvable)

    /**
     * @param backend Specifies the backend for a `Branch` of an Amplify app.
     */
    public fun backend(backend: CfnBranch.BackendProperty)

    /**
     * @param backend Specifies the backend for a `Branch` of an Amplify app.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5ca1e5a8e883f335ce3d4909bf2590b31a5a37227e08ef1959dba530961b7676")
    public fun backend(backend: CfnBranch.BackendProperty.Builder.() -> Unit)

    /**
     * @param basicAuthConfig The basic authorization credentials for a branch of an Amplify app.
     * You must base64-encode the authorization credentials and provide them in the format
     * `user:password` .
     */
    public fun basicAuthConfig(basicAuthConfig: IResolvable)

    /**
     * @param basicAuthConfig The basic authorization credentials for a branch of an Amplify app.
     * You must base64-encode the authorization credentials and provide them in the format
     * `user:password` .
     */
    public fun basicAuthConfig(basicAuthConfig: CfnBranch.BasicAuthConfigProperty)

    /**
     * @param basicAuthConfig The basic authorization credentials for a branch of an Amplify app.
     * You must base64-encode the authorization credentials and provide them in the format
     * `user:password` .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4be9f9f4c05ea70af84949ceab597667719bb03914a9c4cedc3e361162cc9de5")
    public
        fun basicAuthConfig(basicAuthConfig: CfnBranch.BasicAuthConfigProperty.Builder.() -> Unit)

    /**
     * @param branchName The name for the branch. 
     */
    public fun branchName(branchName: String)

    /**
     * @param buildSpec The build specification (build spec) for the branch.
     */
    public fun buildSpec(buildSpec: String)

    /**
     * @param description The description for the branch that is part of an Amplify app.
     */
    public fun description(description: String)

    /**
     * @param enableAutoBuild Enables auto building for the branch.
     */
    public fun enableAutoBuild(enableAutoBuild: Boolean)

    /**
     * @param enableAutoBuild Enables auto building for the branch.
     */
    public fun enableAutoBuild(enableAutoBuild: IResolvable)

    /**
     * @param enablePerformanceMode Enables performance mode for the branch.
     * Performance mode optimizes for faster hosting performance by keeping content cached at the
     * edge for a longer interval. When performance mode is enabled, hosting configuration or code
     * changes can take up to 10 minutes to roll out.
     */
    public fun enablePerformanceMode(enablePerformanceMode: Boolean)

    /**
     * @param enablePerformanceMode Enables performance mode for the branch.
     * Performance mode optimizes for faster hosting performance by keeping content cached at the
     * edge for a longer interval. When performance mode is enabled, hosting configuration or code
     * changes can take up to 10 minutes to roll out.
     */
    public fun enablePerformanceMode(enablePerformanceMode: IResolvable)

    /**
     * @param enablePullRequestPreview Specifies whether Amplify Hosting creates a preview for each
     * pull request that is made for this branch.
     * If this property is enabled, Amplify deploys your app to a unique preview URL after each pull
     * request is opened. Development and QA teams can use this preview to test the pull request before
     * it's merged into a production or integration branch.
     *
     * To provide backend support for your preview, Amplify automatically provisions a temporary
     * backend environment that it deletes when the pull request is closed. If you want to specify a
     * dedicated backend environment for your previews, use the `PullRequestEnvironmentName` property.
     *
     * For more information, see [Web
     * Previews](https://docs.aws.amazon.com/amplify/latest/userguide/pr-previews.html) in the *AWS
     * Amplify Hosting User Guide* .
     */
    public fun enablePullRequestPreview(enablePullRequestPreview: Boolean)

    /**
     * @param enablePullRequestPreview Specifies whether Amplify Hosting creates a preview for each
     * pull request that is made for this branch.
     * If this property is enabled, Amplify deploys your app to a unique preview URL after each pull
     * request is opened. Development and QA teams can use this preview to test the pull request before
     * it's merged into a production or integration branch.
     *
     * To provide backend support for your preview, Amplify automatically provisions a temporary
     * backend environment that it deletes when the pull request is closed. If you want to specify a
     * dedicated backend environment for your previews, use the `PullRequestEnvironmentName` property.
     *
     * For more information, see [Web
     * Previews](https://docs.aws.amazon.com/amplify/latest/userguide/pr-previews.html) in the *AWS
     * Amplify Hosting User Guide* .
     */
    public fun enablePullRequestPreview(enablePullRequestPreview: IResolvable)

    /**
     * @param environmentVariables The environment variables for the branch.
     */
    public fun environmentVariables(environmentVariables: IResolvable)

    /**
     * @param environmentVariables The environment variables for the branch.
     */
    public fun environmentVariables(environmentVariables: List<Any>)

    /**
     * @param environmentVariables The environment variables for the branch.
     */
    public fun environmentVariables(vararg environmentVariables: Any)

    /**
     * @param framework The framework for the branch.
     */
    public fun framework(framework: String)

    /**
     * @param pullRequestEnvironmentName If pull request previews are enabled for this branch, you
     * can use this property to specify a dedicated backend environment for your previews.
     * For example, you could specify an environment named `prod` , `test` , or `dev` that you
     * initialized with the Amplify CLI and mapped to this branch.
     *
     * To enable pull request previews, set the `EnablePullRequestPreview` property to `true` .
     *
     * If you don't specify an environment, Amplify Hosting provides backend support for each
     * preview by automatically provisioning a temporary backend environment. Amplify Hosting deletes
     * this environment when the pull request is closed.
     *
     * For more information about creating backend environments, see [Feature Branch Deployments and
     * Team Workflows](https://docs.aws.amazon.com/amplify/latest/userguide/multi-environments.html) in
     * the *AWS Amplify Hosting User Guide* .
     */
    public fun pullRequestEnvironmentName(pullRequestEnvironmentName: String)

    /**
     * @param stage Describes the current stage for the branch.
     */
    public fun stage(stage: String)

    /**
     * @param tags The tag for the branch.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tag for the branch.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.amplify.CfnBranchProps.Builder =
        software.amazon.awscdk.services.amplify.CfnBranchProps.builder()

    /**
     * @param appId The unique ID for an Amplify app. 
     */
    override fun appId(appId: String) {
      cdkBuilder.appId(appId)
    }

    /**
     * @param backend Specifies the backend for a `Branch` of an Amplify app.
     */
    override fun backend(backend: IResolvable) {
      cdkBuilder.backend(backend.let(IResolvable::unwrap))
    }

    /**
     * @param backend Specifies the backend for a `Branch` of an Amplify app.
     */
    override fun backend(backend: CfnBranch.BackendProperty) {
      cdkBuilder.backend(backend.let(CfnBranch.BackendProperty::unwrap))
    }

    /**
     * @param backend Specifies the backend for a `Branch` of an Amplify app.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5ca1e5a8e883f335ce3d4909bf2590b31a5a37227e08ef1959dba530961b7676")
    override fun backend(backend: CfnBranch.BackendProperty.Builder.() -> Unit): Unit =
        backend(CfnBranch.BackendProperty(backend))

    /**
     * @param basicAuthConfig The basic authorization credentials for a branch of an Amplify app.
     * You must base64-encode the authorization credentials and provide them in the format
     * `user:password` .
     */
    override fun basicAuthConfig(basicAuthConfig: IResolvable) {
      cdkBuilder.basicAuthConfig(basicAuthConfig.let(IResolvable::unwrap))
    }

    /**
     * @param basicAuthConfig The basic authorization credentials for a branch of an Amplify app.
     * You must base64-encode the authorization credentials and provide them in the format
     * `user:password` .
     */
    override fun basicAuthConfig(basicAuthConfig: CfnBranch.BasicAuthConfigProperty) {
      cdkBuilder.basicAuthConfig(basicAuthConfig.let(CfnBranch.BasicAuthConfigProperty::unwrap))
    }

    /**
     * @param basicAuthConfig The basic authorization credentials for a branch of an Amplify app.
     * You must base64-encode the authorization credentials and provide them in the format
     * `user:password` .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4be9f9f4c05ea70af84949ceab597667719bb03914a9c4cedc3e361162cc9de5")
    override
        fun basicAuthConfig(basicAuthConfig: CfnBranch.BasicAuthConfigProperty.Builder.() -> Unit):
        Unit = basicAuthConfig(CfnBranch.BasicAuthConfigProperty(basicAuthConfig))

    /**
     * @param branchName The name for the branch. 
     */
    override fun branchName(branchName: String) {
      cdkBuilder.branchName(branchName)
    }

    /**
     * @param buildSpec The build specification (build spec) for the branch.
     */
    override fun buildSpec(buildSpec: String) {
      cdkBuilder.buildSpec(buildSpec)
    }

    /**
     * @param description The description for the branch that is part of an Amplify app.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param enableAutoBuild Enables auto building for the branch.
     */
    override fun enableAutoBuild(enableAutoBuild: Boolean) {
      cdkBuilder.enableAutoBuild(enableAutoBuild)
    }

    /**
     * @param enableAutoBuild Enables auto building for the branch.
     */
    override fun enableAutoBuild(enableAutoBuild: IResolvable) {
      cdkBuilder.enableAutoBuild(enableAutoBuild.let(IResolvable::unwrap))
    }

    /**
     * @param enablePerformanceMode Enables performance mode for the branch.
     * Performance mode optimizes for faster hosting performance by keeping content cached at the
     * edge for a longer interval. When performance mode is enabled, hosting configuration or code
     * changes can take up to 10 minutes to roll out.
     */
    override fun enablePerformanceMode(enablePerformanceMode: Boolean) {
      cdkBuilder.enablePerformanceMode(enablePerformanceMode)
    }

    /**
     * @param enablePerformanceMode Enables performance mode for the branch.
     * Performance mode optimizes for faster hosting performance by keeping content cached at the
     * edge for a longer interval. When performance mode is enabled, hosting configuration or code
     * changes can take up to 10 minutes to roll out.
     */
    override fun enablePerformanceMode(enablePerformanceMode: IResolvable) {
      cdkBuilder.enablePerformanceMode(enablePerformanceMode.let(IResolvable::unwrap))
    }

    /**
     * @param enablePullRequestPreview Specifies whether Amplify Hosting creates a preview for each
     * pull request that is made for this branch.
     * If this property is enabled, Amplify deploys your app to a unique preview URL after each pull
     * request is opened. Development and QA teams can use this preview to test the pull request before
     * it's merged into a production or integration branch.
     *
     * To provide backend support for your preview, Amplify automatically provisions a temporary
     * backend environment that it deletes when the pull request is closed. If you want to specify a
     * dedicated backend environment for your previews, use the `PullRequestEnvironmentName` property.
     *
     * For more information, see [Web
     * Previews](https://docs.aws.amazon.com/amplify/latest/userguide/pr-previews.html) in the *AWS
     * Amplify Hosting User Guide* .
     */
    override fun enablePullRequestPreview(enablePullRequestPreview: Boolean) {
      cdkBuilder.enablePullRequestPreview(enablePullRequestPreview)
    }

    /**
     * @param enablePullRequestPreview Specifies whether Amplify Hosting creates a preview for each
     * pull request that is made for this branch.
     * If this property is enabled, Amplify deploys your app to a unique preview URL after each pull
     * request is opened. Development and QA teams can use this preview to test the pull request before
     * it's merged into a production or integration branch.
     *
     * To provide backend support for your preview, Amplify automatically provisions a temporary
     * backend environment that it deletes when the pull request is closed. If you want to specify a
     * dedicated backend environment for your previews, use the `PullRequestEnvironmentName` property.
     *
     * For more information, see [Web
     * Previews](https://docs.aws.amazon.com/amplify/latest/userguide/pr-previews.html) in the *AWS
     * Amplify Hosting User Guide* .
     */
    override fun enablePullRequestPreview(enablePullRequestPreview: IResolvable) {
      cdkBuilder.enablePullRequestPreview(enablePullRequestPreview.let(IResolvable::unwrap))
    }

    /**
     * @param environmentVariables The environment variables for the branch.
     */
    override fun environmentVariables(environmentVariables: IResolvable) {
      cdkBuilder.environmentVariables(environmentVariables.let(IResolvable::unwrap))
    }

    /**
     * @param environmentVariables The environment variables for the branch.
     */
    override fun environmentVariables(environmentVariables: List<Any>) {
      cdkBuilder.environmentVariables(environmentVariables)
    }

    /**
     * @param environmentVariables The environment variables for the branch.
     */
    override fun environmentVariables(vararg environmentVariables: Any): Unit =
        environmentVariables(environmentVariables.toList())

    /**
     * @param framework The framework for the branch.
     */
    override fun framework(framework: String) {
      cdkBuilder.framework(framework)
    }

    /**
     * @param pullRequestEnvironmentName If pull request previews are enabled for this branch, you
     * can use this property to specify a dedicated backend environment for your previews.
     * For example, you could specify an environment named `prod` , `test` , or `dev` that you
     * initialized with the Amplify CLI and mapped to this branch.
     *
     * To enable pull request previews, set the `EnablePullRequestPreview` property to `true` .
     *
     * If you don't specify an environment, Amplify Hosting provides backend support for each
     * preview by automatically provisioning a temporary backend environment. Amplify Hosting deletes
     * this environment when the pull request is closed.
     *
     * For more information about creating backend environments, see [Feature Branch Deployments and
     * Team Workflows](https://docs.aws.amazon.com/amplify/latest/userguide/multi-environments.html) in
     * the *AWS Amplify Hosting User Guide* .
     */
    override fun pullRequestEnvironmentName(pullRequestEnvironmentName: String) {
      cdkBuilder.pullRequestEnvironmentName(pullRequestEnvironmentName)
    }

    /**
     * @param stage Describes the current stage for the branch.
     */
    override fun stage(stage: String) {
      cdkBuilder.stage(stage)
    }

    /**
     * @param tags The tag for the branch.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags The tag for the branch.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.amplify.CfnBranchProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.amplify.CfnBranchProps,
  ) : CdkObject(cdkObject), CfnBranchProps {
    /**
     * The unique ID for an Amplify app.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-branch.html#cfn-amplify-branch-appid)
     */
    override fun appId(): String = unwrap(this).getAppId()

    /**
     * Specifies the backend for a `Branch` of an Amplify app.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-branch.html#cfn-amplify-branch-backend)
     */
    override fun backend(): Any? = unwrap(this).getBackend()

    /**
     * The basic authorization credentials for a branch of an Amplify app.
     *
     * You must base64-encode the authorization credentials and provide them in the format
     * `user:password` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-branch.html#cfn-amplify-branch-basicauthconfig)
     */
    override fun basicAuthConfig(): Any? = unwrap(this).getBasicAuthConfig()

    /**
     * The name for the branch.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-branch.html#cfn-amplify-branch-branchname)
     */
    override fun branchName(): String = unwrap(this).getBranchName()

    /**
     * The build specification (build spec) for the branch.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-branch.html#cfn-amplify-branch-buildspec)
     */
    override fun buildSpec(): String? = unwrap(this).getBuildSpec()

    /**
     * The description for the branch that is part of an Amplify app.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-branch.html#cfn-amplify-branch-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * Enables auto building for the branch.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-branch.html#cfn-amplify-branch-enableautobuild)
     */
    override fun enableAutoBuild(): Any? = unwrap(this).getEnableAutoBuild()

    /**
     * Enables performance mode for the branch.
     *
     * Performance mode optimizes for faster hosting performance by keeping content cached at the
     * edge for a longer interval. When performance mode is enabled, hosting configuration or code
     * changes can take up to 10 minutes to roll out.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-branch.html#cfn-amplify-branch-enableperformancemode)
     */
    override fun enablePerformanceMode(): Any? = unwrap(this).getEnablePerformanceMode()

    /**
     * Specifies whether Amplify Hosting creates a preview for each pull request that is made for
     * this branch.
     *
     * If this property is enabled, Amplify deploys your app to a unique preview URL after each pull
     * request is opened. Development and QA teams can use this preview to test the pull request before
     * it's merged into a production or integration branch.
     *
     * To provide backend support for your preview, Amplify automatically provisions a temporary
     * backend environment that it deletes when the pull request is closed. If you want to specify a
     * dedicated backend environment for your previews, use the `PullRequestEnvironmentName` property.
     *
     * For more information, see [Web
     * Previews](https://docs.aws.amazon.com/amplify/latest/userguide/pr-previews.html) in the *AWS
     * Amplify Hosting User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-branch.html#cfn-amplify-branch-enablepullrequestpreview)
     */
    override fun enablePullRequestPreview(): Any? = unwrap(this).getEnablePullRequestPreview()

    /**
     * The environment variables for the branch.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-branch.html#cfn-amplify-branch-environmentvariables)
     */
    override fun environmentVariables(): Any? = unwrap(this).getEnvironmentVariables()

    /**
     * The framework for the branch.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-branch.html#cfn-amplify-branch-framework)
     */
    override fun framework(): String? = unwrap(this).getFramework()

    /**
     * If pull request previews are enabled for this branch, you can use this property to specify a
     * dedicated backend environment for your previews.
     *
     * For example, you could specify an environment named `prod` , `test` , or `dev` that you
     * initialized with the Amplify CLI and mapped to this branch.
     *
     * To enable pull request previews, set the `EnablePullRequestPreview` property to `true` .
     *
     * If you don't specify an environment, Amplify Hosting provides backend support for each
     * preview by automatically provisioning a temporary backend environment. Amplify Hosting deletes
     * this environment when the pull request is closed.
     *
     * For more information about creating backend environments, see [Feature Branch Deployments and
     * Team Workflows](https://docs.aws.amazon.com/amplify/latest/userguide/multi-environments.html) in
     * the *AWS Amplify Hosting User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-branch.html#cfn-amplify-branch-pullrequestenvironmentname)
     */
    override fun pullRequestEnvironmentName(): String? =
        unwrap(this).getPullRequestEnvironmentName()

    /**
     * Describes the current stage for the branch.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-branch.html#cfn-amplify-branch-stage)
     */
    override fun stage(): String? = unwrap(this).getStage()

    /**
     * The tag for the branch.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-branch.html#cfn-amplify-branch-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnBranchProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.amplify.CfnBranchProps):
        CfnBranchProps = CdkObjectWrappers.wrap(cdkObject) as CfnBranchProps

    internal fun unwrap(wrapped: CfnBranchProps):
        software.amazon.awscdk.services.amplify.CfnBranchProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.amplify.CfnBranchProps
  }
}
