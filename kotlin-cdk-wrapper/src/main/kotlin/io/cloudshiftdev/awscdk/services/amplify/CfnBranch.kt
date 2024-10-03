@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.amplify

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The AWS::Amplify::Branch resource specifies a new branch within an app.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.amplify.*;
 * CfnBranch cfnBranch = CfnBranch.Builder.create(this, "MyCfnBranch")
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
public open class CfnBranch(
  cdkObject: software.amazon.awscdk.services.amplify.CfnBranch,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnBranchProps,
  ) :
      this(software.amazon.awscdk.services.amplify.CfnBranch(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnBranchProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnBranchProps.Builder.() -> Unit,
  ) : this(scope, id, CfnBranchProps(props)
  )

  /**
   * The unique ID for an Amplify app.
   */
  public open fun appId(): String = unwrap(this).getAppId()

  /**
   * The unique ID for an Amplify app.
   */
  public open fun appId(`value`: String) {
    unwrap(this).setAppId(`value`)
  }

  /**
   * ARN for a branch, part of an Amplify App.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * Name for a branch, part of an Amplify App.
   */
  public open fun attrBranchName(): String = unwrap(this).getAttrBranchName()

  /**
   * The backend for a `Branch` of an Amplify app.
   *
   * Use for a backend created from an AWS CloudFormation stack.
   */
  public open fun backend(): Any? = unwrap(this).getBackend()

  /**
   * The backend for a `Branch` of an Amplify app.
   *
   * Use for a backend created from an AWS CloudFormation stack.
   */
  public open fun backend(`value`: IResolvable) {
    unwrap(this).setBackend(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The backend for a `Branch` of an Amplify app.
   *
   * Use for a backend created from an AWS CloudFormation stack.
   */
  public open fun backend(`value`: BackendProperty) {
    unwrap(this).setBackend(`value`.let(BackendProperty.Companion::unwrap))
  }

  /**
   * The backend for a `Branch` of an Amplify app.
   *
   * Use for a backend created from an AWS CloudFormation stack.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f6972dc5b70fdec993fe4752c385a82a78e9b4405c4d956c1400f41c72ae0767")
  public open fun backend(`value`: BackendProperty.Builder.() -> Unit): Unit =
      backend(BackendProperty(`value`))

  /**
   * The basic authorization credentials for a branch of an Amplify app.
   */
  public open fun basicAuthConfig(): Any? = unwrap(this).getBasicAuthConfig()

  /**
   * The basic authorization credentials for a branch of an Amplify app.
   */
  public open fun basicAuthConfig(`value`: IResolvable) {
    unwrap(this).setBasicAuthConfig(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The basic authorization credentials for a branch of an Amplify app.
   */
  public open fun basicAuthConfig(`value`: BasicAuthConfigProperty) {
    unwrap(this).setBasicAuthConfig(`value`.let(BasicAuthConfigProperty.Companion::unwrap))
  }

  /**
   * The basic authorization credentials for a branch of an Amplify app.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("1fce00b5f98214408f76c3f864f42dbc4c0f58156f8b653c685907ff76d07c1b")
  public open fun basicAuthConfig(`value`: BasicAuthConfigProperty.Builder.() -> Unit): Unit =
      basicAuthConfig(BasicAuthConfigProperty(`value`))

  /**
   * The name for the branch.
   */
  public open fun branchName(): String = unwrap(this).getBranchName()

  /**
   * The name for the branch.
   */
  public open fun branchName(`value`: String) {
    unwrap(this).setBranchName(`value`)
  }

  /**
   * The build specification (build spec) for the branch.
   */
  public open fun buildSpec(): String? = unwrap(this).getBuildSpec()

  /**
   * The build specification (build spec) for the branch.
   */
  public open fun buildSpec(`value`: String) {
    unwrap(this).setBuildSpec(`value`)
  }

  /**
   * The description for the branch that is part of an Amplify app.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description for the branch that is part of an Amplify app.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * Enables auto building for the branch.
   */
  public open fun enableAutoBuild(): Any? = unwrap(this).getEnableAutoBuild()

  /**
   * Enables auto building for the branch.
   */
  public open fun enableAutoBuild(`value`: Boolean) {
    unwrap(this).setEnableAutoBuild(`value`)
  }

  /**
   * Enables auto building for the branch.
   */
  public open fun enableAutoBuild(`value`: IResolvable) {
    unwrap(this).setEnableAutoBuild(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Enables performance mode for the branch.
   */
  public open fun enablePerformanceMode(): Any? = unwrap(this).getEnablePerformanceMode()

  /**
   * Enables performance mode for the branch.
   */
  public open fun enablePerformanceMode(`value`: Boolean) {
    unwrap(this).setEnablePerformanceMode(`value`)
  }

  /**
   * Enables performance mode for the branch.
   */
  public open fun enablePerformanceMode(`value`: IResolvable) {
    unwrap(this).setEnablePerformanceMode(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Specifies whether Amplify Hosting creates a preview for each pull request that is made for this
   * branch.
   */
  public open fun enablePullRequestPreview(): Any? = unwrap(this).getEnablePullRequestPreview()

  /**
   * Specifies whether Amplify Hosting creates a preview for each pull request that is made for this
   * branch.
   */
  public open fun enablePullRequestPreview(`value`: Boolean) {
    unwrap(this).setEnablePullRequestPreview(`value`)
  }

  /**
   * Specifies whether Amplify Hosting creates a preview for each pull request that is made for this
   * branch.
   */
  public open fun enablePullRequestPreview(`value`: IResolvable) {
    unwrap(this).setEnablePullRequestPreview(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The environment variables for the branch.
   */
  public open fun environmentVariables(): Any? = unwrap(this).getEnvironmentVariables()

  /**
   * The environment variables for the branch.
   */
  public open fun environmentVariables(`value`: IResolvable) {
    unwrap(this).setEnvironmentVariables(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The environment variables for the branch.
   */
  public open fun environmentVariables(`value`: List<Any>) {
    unwrap(this).setEnvironmentVariables(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * The environment variables for the branch.
   */
  public open fun environmentVariables(vararg `value`: Any): Unit =
      environmentVariables(`value`.toList())

  /**
   * The framework for the branch.
   */
  public open fun framework(): String? = unwrap(this).getFramework()

  /**
   * The framework for the branch.
   */
  public open fun framework(`value`: String) {
    unwrap(this).setFramework(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * If pull request previews are enabled for this branch, you can use this property to specify a
   * dedicated backend environment for your previews.
   */
  public open fun pullRequestEnvironmentName(): String? =
      unwrap(this).getPullRequestEnvironmentName()

  /**
   * If pull request previews are enabled for this branch, you can use this property to specify a
   * dedicated backend environment for your previews.
   */
  public open fun pullRequestEnvironmentName(`value`: String) {
    unwrap(this).setPullRequestEnvironmentName(`value`)
  }

  /**
   * Describes the current stage for the branch.
   */
  public open fun stage(): String? = unwrap(this).getStage()

  /**
   * Describes the current stage for the branch.
   */
  public open fun stage(`value`: String) {
    unwrap(this).setStage(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The tag for the branch.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The tag for the branch.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * The tag for the branch.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.amplify.CfnBranch].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The unique ID for an Amplify app.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-branch.html#cfn-amplify-branch-appid)
     * @param appId The unique ID for an Amplify app. 
     */
    public fun appId(appId: String)

    /**
     * The backend for a `Branch` of an Amplify app. Use for a backend created from an AWS
     * CloudFormation stack.
     *
     * This field is available to Amplify Gen 2 apps only. When you deploy an application with
     * Amplify Gen 2, you provision the app's backend infrastructure using Typescript code.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-branch.html#cfn-amplify-branch-backend)
     * @param backend The backend for a `Branch` of an Amplify app. Use for a backend created from
     * an AWS CloudFormation stack. 
     */
    public fun backend(backend: IResolvable)

    /**
     * The backend for a `Branch` of an Amplify app. Use for a backend created from an AWS
     * CloudFormation stack.
     *
     * This field is available to Amplify Gen 2 apps only. When you deploy an application with
     * Amplify Gen 2, you provision the app's backend infrastructure using Typescript code.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-branch.html#cfn-amplify-branch-backend)
     * @param backend The backend for a `Branch` of an Amplify app. Use for a backend created from
     * an AWS CloudFormation stack. 
     */
    public fun backend(backend: BackendProperty)

    /**
     * The backend for a `Branch` of an Amplify app. Use for a backend created from an AWS
     * CloudFormation stack.
     *
     * This field is available to Amplify Gen 2 apps only. When you deploy an application with
     * Amplify Gen 2, you provision the app's backend infrastructure using Typescript code.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-branch.html#cfn-amplify-branch-backend)
     * @param backend The backend for a `Branch` of an Amplify app. Use for a backend created from
     * an AWS CloudFormation stack. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("99ab4a4914f072f0a0e0c21db94a5879d3b7a68a5b44fd2af1d426d83f87aef0")
    public fun backend(backend: BackendProperty.Builder.() -> Unit)

    /**
     * The basic authorization credentials for a branch of an Amplify app.
     *
     * You must base64-encode the authorization credentials and provide them in the format
     * `user:password` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-branch.html#cfn-amplify-branch-basicauthconfig)
     * @param basicAuthConfig The basic authorization credentials for a branch of an Amplify app. 
     */
    public fun basicAuthConfig(basicAuthConfig: IResolvable)

    /**
     * The basic authorization credentials for a branch of an Amplify app.
     *
     * You must base64-encode the authorization credentials and provide them in the format
     * `user:password` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-branch.html#cfn-amplify-branch-basicauthconfig)
     * @param basicAuthConfig The basic authorization credentials for a branch of an Amplify app. 
     */
    public fun basicAuthConfig(basicAuthConfig: BasicAuthConfigProperty)

    /**
     * The basic authorization credentials for a branch of an Amplify app.
     *
     * You must base64-encode the authorization credentials and provide them in the format
     * `user:password` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-branch.html#cfn-amplify-branch-basicauthconfig)
     * @param basicAuthConfig The basic authorization credentials for a branch of an Amplify app. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9df38851042ee64d5330a6663621351e0c985ce359f43958a67e42387d97f56b")
    public fun basicAuthConfig(basicAuthConfig: BasicAuthConfigProperty.Builder.() -> Unit)

    /**
     * The name for the branch.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-branch.html#cfn-amplify-branch-branchname)
     * @param branchName The name for the branch. 
     */
    public fun branchName(branchName: String)

    /**
     * The build specification (build spec) for the branch.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-branch.html#cfn-amplify-branch-buildspec)
     * @param buildSpec The build specification (build spec) for the branch. 
     */
    public fun buildSpec(buildSpec: String)

    /**
     * The description for the branch that is part of an Amplify app.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-branch.html#cfn-amplify-branch-description)
     * @param description The description for the branch that is part of an Amplify app. 
     */
    public fun description(description: String)

    /**
     * Enables auto building for the branch.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-branch.html#cfn-amplify-branch-enableautobuild)
     * @param enableAutoBuild Enables auto building for the branch. 
     */
    public fun enableAutoBuild(enableAutoBuild: Boolean)

    /**
     * Enables auto building for the branch.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-branch.html#cfn-amplify-branch-enableautobuild)
     * @param enableAutoBuild Enables auto building for the branch. 
     */
    public fun enableAutoBuild(enableAutoBuild: IResolvable)

    /**
     * Enables performance mode for the branch.
     *
     * Performance mode optimizes for faster hosting performance by keeping content cached at the
     * edge for a longer interval. When performance mode is enabled, hosting configuration or code
     * changes can take up to 10 minutes to roll out.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-branch.html#cfn-amplify-branch-enableperformancemode)
     * @param enablePerformanceMode Enables performance mode for the branch. 
     */
    public fun enablePerformanceMode(enablePerformanceMode: Boolean)

    /**
     * Enables performance mode for the branch.
     *
     * Performance mode optimizes for faster hosting performance by keeping content cached at the
     * edge for a longer interval. When performance mode is enabled, hosting configuration or code
     * changes can take up to 10 minutes to roll out.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-branch.html#cfn-amplify-branch-enableperformancemode)
     * @param enablePerformanceMode Enables performance mode for the branch. 
     */
    public fun enablePerformanceMode(enablePerformanceMode: IResolvable)

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
     * @param enablePullRequestPreview Specifies whether Amplify Hosting creates a preview for each
     * pull request that is made for this branch. 
     */
    public fun enablePullRequestPreview(enablePullRequestPreview: Boolean)

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
     * @param enablePullRequestPreview Specifies whether Amplify Hosting creates a preview for each
     * pull request that is made for this branch. 
     */
    public fun enablePullRequestPreview(enablePullRequestPreview: IResolvable)

    /**
     * The environment variables for the branch.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-branch.html#cfn-amplify-branch-environmentvariables)
     * @param environmentVariables The environment variables for the branch. 
     */
    public fun environmentVariables(environmentVariables: IResolvable)

    /**
     * The environment variables for the branch.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-branch.html#cfn-amplify-branch-environmentvariables)
     * @param environmentVariables The environment variables for the branch. 
     */
    public fun environmentVariables(environmentVariables: List<Any>)

    /**
     * The environment variables for the branch.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-branch.html#cfn-amplify-branch-environmentvariables)
     * @param environmentVariables The environment variables for the branch. 
     */
    public fun environmentVariables(vararg environmentVariables: Any)

    /**
     * The framework for the branch.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-branch.html#cfn-amplify-branch-framework)
     * @param framework The framework for the branch. 
     */
    public fun framework(framework: String)

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
     * @param pullRequestEnvironmentName If pull request previews are enabled for this branch, you
     * can use this property to specify a dedicated backend environment for your previews. 
     */
    public fun pullRequestEnvironmentName(pullRequestEnvironmentName: String)

    /**
     * Describes the current stage for the branch.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-branch.html#cfn-amplify-branch-stage)
     * @param stage Describes the current stage for the branch. 
     */
    public fun stage(stage: String)

    /**
     * The tag for the branch.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-branch.html#cfn-amplify-branch-tags)
     * @param tags The tag for the branch. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tag for the branch.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-branch.html#cfn-amplify-branch-tags)
     * @param tags The tag for the branch. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.amplify.CfnBranch.Builder =
        software.amazon.awscdk.services.amplify.CfnBranch.Builder.create(scope, id)

    /**
     * The unique ID for an Amplify app.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-branch.html#cfn-amplify-branch-appid)
     * @param appId The unique ID for an Amplify app. 
     */
    override fun appId(appId: String) {
      cdkBuilder.appId(appId)
    }

    /**
     * The backend for a `Branch` of an Amplify app. Use for a backend created from an AWS
     * CloudFormation stack.
     *
     * This field is available to Amplify Gen 2 apps only. When you deploy an application with
     * Amplify Gen 2, you provision the app's backend infrastructure using Typescript code.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-branch.html#cfn-amplify-branch-backend)
     * @param backend The backend for a `Branch` of an Amplify app. Use for a backend created from
     * an AWS CloudFormation stack. 
     */
    override fun backend(backend: IResolvable) {
      cdkBuilder.backend(backend.let(IResolvable.Companion::unwrap))
    }

    /**
     * The backend for a `Branch` of an Amplify app. Use for a backend created from an AWS
     * CloudFormation stack.
     *
     * This field is available to Amplify Gen 2 apps only. When you deploy an application with
     * Amplify Gen 2, you provision the app's backend infrastructure using Typescript code.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-branch.html#cfn-amplify-branch-backend)
     * @param backend The backend for a `Branch` of an Amplify app. Use for a backend created from
     * an AWS CloudFormation stack. 
     */
    override fun backend(backend: BackendProperty) {
      cdkBuilder.backend(backend.let(BackendProperty.Companion::unwrap))
    }

    /**
     * The backend for a `Branch` of an Amplify app. Use for a backend created from an AWS
     * CloudFormation stack.
     *
     * This field is available to Amplify Gen 2 apps only. When you deploy an application with
     * Amplify Gen 2, you provision the app's backend infrastructure using Typescript code.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-branch.html#cfn-amplify-branch-backend)
     * @param backend The backend for a `Branch` of an Amplify app. Use for a backend created from
     * an AWS CloudFormation stack. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("99ab4a4914f072f0a0e0c21db94a5879d3b7a68a5b44fd2af1d426d83f87aef0")
    override fun backend(backend: BackendProperty.Builder.() -> Unit): Unit =
        backend(BackendProperty(backend))

    /**
     * The basic authorization credentials for a branch of an Amplify app.
     *
     * You must base64-encode the authorization credentials and provide them in the format
     * `user:password` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-branch.html#cfn-amplify-branch-basicauthconfig)
     * @param basicAuthConfig The basic authorization credentials for a branch of an Amplify app. 
     */
    override fun basicAuthConfig(basicAuthConfig: IResolvable) {
      cdkBuilder.basicAuthConfig(basicAuthConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * The basic authorization credentials for a branch of an Amplify app.
     *
     * You must base64-encode the authorization credentials and provide them in the format
     * `user:password` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-branch.html#cfn-amplify-branch-basicauthconfig)
     * @param basicAuthConfig The basic authorization credentials for a branch of an Amplify app. 
     */
    override fun basicAuthConfig(basicAuthConfig: BasicAuthConfigProperty) {
      cdkBuilder.basicAuthConfig(basicAuthConfig.let(BasicAuthConfigProperty.Companion::unwrap))
    }

    /**
     * The basic authorization credentials for a branch of an Amplify app.
     *
     * You must base64-encode the authorization credentials and provide them in the format
     * `user:password` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-branch.html#cfn-amplify-branch-basicauthconfig)
     * @param basicAuthConfig The basic authorization credentials for a branch of an Amplify app. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9df38851042ee64d5330a6663621351e0c985ce359f43958a67e42387d97f56b")
    override fun basicAuthConfig(basicAuthConfig: BasicAuthConfigProperty.Builder.() -> Unit): Unit
        = basicAuthConfig(BasicAuthConfigProperty(basicAuthConfig))

    /**
     * The name for the branch.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-branch.html#cfn-amplify-branch-branchname)
     * @param branchName The name for the branch. 
     */
    override fun branchName(branchName: String) {
      cdkBuilder.branchName(branchName)
    }

    /**
     * The build specification (build spec) for the branch.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-branch.html#cfn-amplify-branch-buildspec)
     * @param buildSpec The build specification (build spec) for the branch. 
     */
    override fun buildSpec(buildSpec: String) {
      cdkBuilder.buildSpec(buildSpec)
    }

    /**
     * The description for the branch that is part of an Amplify app.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-branch.html#cfn-amplify-branch-description)
     * @param description The description for the branch that is part of an Amplify app. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * Enables auto building for the branch.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-branch.html#cfn-amplify-branch-enableautobuild)
     * @param enableAutoBuild Enables auto building for the branch. 
     */
    override fun enableAutoBuild(enableAutoBuild: Boolean) {
      cdkBuilder.enableAutoBuild(enableAutoBuild)
    }

    /**
     * Enables auto building for the branch.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-branch.html#cfn-amplify-branch-enableautobuild)
     * @param enableAutoBuild Enables auto building for the branch. 
     */
    override fun enableAutoBuild(enableAutoBuild: IResolvable) {
      cdkBuilder.enableAutoBuild(enableAutoBuild.let(IResolvable.Companion::unwrap))
    }

    /**
     * Enables performance mode for the branch.
     *
     * Performance mode optimizes for faster hosting performance by keeping content cached at the
     * edge for a longer interval. When performance mode is enabled, hosting configuration or code
     * changes can take up to 10 minutes to roll out.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-branch.html#cfn-amplify-branch-enableperformancemode)
     * @param enablePerformanceMode Enables performance mode for the branch. 
     */
    override fun enablePerformanceMode(enablePerformanceMode: Boolean) {
      cdkBuilder.enablePerformanceMode(enablePerformanceMode)
    }

    /**
     * Enables performance mode for the branch.
     *
     * Performance mode optimizes for faster hosting performance by keeping content cached at the
     * edge for a longer interval. When performance mode is enabled, hosting configuration or code
     * changes can take up to 10 minutes to roll out.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-branch.html#cfn-amplify-branch-enableperformancemode)
     * @param enablePerformanceMode Enables performance mode for the branch. 
     */
    override fun enablePerformanceMode(enablePerformanceMode: IResolvable) {
      cdkBuilder.enablePerformanceMode(enablePerformanceMode.let(IResolvable.Companion::unwrap))
    }

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
     * @param enablePullRequestPreview Specifies whether Amplify Hosting creates a preview for each
     * pull request that is made for this branch. 
     */
    override fun enablePullRequestPreview(enablePullRequestPreview: Boolean) {
      cdkBuilder.enablePullRequestPreview(enablePullRequestPreview)
    }

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
     * @param enablePullRequestPreview Specifies whether Amplify Hosting creates a preview for each
     * pull request that is made for this branch. 
     */
    override fun enablePullRequestPreview(enablePullRequestPreview: IResolvable) {
      cdkBuilder.enablePullRequestPreview(enablePullRequestPreview.let(IResolvable.Companion::unwrap))
    }

    /**
     * The environment variables for the branch.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-branch.html#cfn-amplify-branch-environmentvariables)
     * @param environmentVariables The environment variables for the branch. 
     */
    override fun environmentVariables(environmentVariables: IResolvable) {
      cdkBuilder.environmentVariables(environmentVariables.let(IResolvable.Companion::unwrap))
    }

    /**
     * The environment variables for the branch.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-branch.html#cfn-amplify-branch-environmentvariables)
     * @param environmentVariables The environment variables for the branch. 
     */
    override fun environmentVariables(environmentVariables: List<Any>) {
      cdkBuilder.environmentVariables(environmentVariables.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * The environment variables for the branch.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-branch.html#cfn-amplify-branch-environmentvariables)
     * @param environmentVariables The environment variables for the branch. 
     */
    override fun environmentVariables(vararg environmentVariables: Any): Unit =
        environmentVariables(environmentVariables.toList())

    /**
     * The framework for the branch.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-branch.html#cfn-amplify-branch-framework)
     * @param framework The framework for the branch. 
     */
    override fun framework(framework: String) {
      cdkBuilder.framework(framework)
    }

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
     * @param pullRequestEnvironmentName If pull request previews are enabled for this branch, you
     * can use this property to specify a dedicated backend environment for your previews. 
     */
    override fun pullRequestEnvironmentName(pullRequestEnvironmentName: String) {
      cdkBuilder.pullRequestEnvironmentName(pullRequestEnvironmentName)
    }

    /**
     * Describes the current stage for the branch.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-branch.html#cfn-amplify-branch-stage)
     * @param stage Describes the current stage for the branch. 
     */
    override fun stage(stage: String) {
      cdkBuilder.stage(stage)
    }

    /**
     * The tag for the branch.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-branch.html#cfn-amplify-branch-tags)
     * @param tags The tag for the branch. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * The tag for the branch.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-branch.html#cfn-amplify-branch-tags)
     * @param tags The tag for the branch. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.amplify.CfnBranch = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.amplify.CfnBranch.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnBranch {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnBranch(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.amplify.CfnBranch): CfnBranch =
        CfnBranch(cdkObject)

    internal fun unwrap(wrapped: CfnBranch): software.amazon.awscdk.services.amplify.CfnBranch =
        wrapped.cdkObject as software.amazon.awscdk.services.amplify.CfnBranch
  }

  /**
   * Describes the backend associated with an Amplify `Branch` .
   *
   * This property is available to Amplify Gen 2 apps only. When you deploy an application with
   * Amplify Gen 2, you provision the app's backend infrastructure using Typescript code.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.amplify.*;
   * BackendProperty backendProperty = BackendProperty.builder()
   * .stackArn("stackArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-branch-backend.html)
   */
  public interface BackendProperty {
    /**
     * The Amazon Resource Name (ARN) for the AWS CloudFormation stack.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-branch-backend.html#cfn-amplify-branch-backend-stackarn)
     */
    public fun stackArn(): String? = unwrap(this).getStackArn()

    /**
     * A builder for [BackendProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param stackArn The Amazon Resource Name (ARN) for the AWS CloudFormation stack.
       */
      public fun stackArn(stackArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.amplify.CfnBranch.BackendProperty.Builder =
          software.amazon.awscdk.services.amplify.CfnBranch.BackendProperty.builder()

      /**
       * @param stackArn The Amazon Resource Name (ARN) for the AWS CloudFormation stack.
       */
      override fun stackArn(stackArn: String) {
        cdkBuilder.stackArn(stackArn)
      }

      public fun build(): software.amazon.awscdk.services.amplify.CfnBranch.BackendProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.amplify.CfnBranch.BackendProperty,
    ) : CdkObject(cdkObject),
        BackendProperty {
      /**
       * The Amazon Resource Name (ARN) for the AWS CloudFormation stack.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-branch-backend.html#cfn-amplify-branch-backend-stackarn)
       */
      override fun stackArn(): String? = unwrap(this).getStackArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): BackendProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.amplify.CfnBranch.BackendProperty):
          BackendProperty = CdkObjectWrappers.wrap(cdkObject) as? BackendProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: BackendProperty):
          software.amazon.awscdk.services.amplify.CfnBranch.BackendProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.amplify.CfnBranch.BackendProperty
    }
  }

  /**
   * Use the BasicAuthConfig property type to set password protection for a specific branch.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.amplify.*;
   * BasicAuthConfigProperty basicAuthConfigProperty = BasicAuthConfigProperty.builder()
   * .password("password")
   * .username("username")
   * // the properties below are optional
   * .enableBasicAuth(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-branch-basicauthconfig.html)
   */
  public interface BasicAuthConfigProperty {
    /**
     * Enables basic authorization for the branch.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-branch-basicauthconfig.html#cfn-amplify-branch-basicauthconfig-enablebasicauth)
     */
    public fun enableBasicAuth(): Any? = unwrap(this).getEnableBasicAuth()

    /**
     * The password for basic authorization.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-branch-basicauthconfig.html#cfn-amplify-branch-basicauthconfig-password)
     */
    public fun password(): String

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-branch-basicauthconfig.html#cfn-amplify-branch-basicauthconfig-username)
     */
    public fun username(): String

    /**
     * A builder for [BasicAuthConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param enableBasicAuth Enables basic authorization for the branch.
       */
      public fun enableBasicAuth(enableBasicAuth: Boolean)

      /**
       * @param enableBasicAuth Enables basic authorization for the branch.
       */
      public fun enableBasicAuth(enableBasicAuth: IResolvable)

      /**
       * @param password The password for basic authorization. 
       */
      public fun password(password: String)

      /**
       * @param username the value to be set. 
       */
      public fun username(username: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.amplify.CfnBranch.BasicAuthConfigProperty.Builder =
          software.amazon.awscdk.services.amplify.CfnBranch.BasicAuthConfigProperty.builder()

      /**
       * @param enableBasicAuth Enables basic authorization for the branch.
       */
      override fun enableBasicAuth(enableBasicAuth: Boolean) {
        cdkBuilder.enableBasicAuth(enableBasicAuth)
      }

      /**
       * @param enableBasicAuth Enables basic authorization for the branch.
       */
      override fun enableBasicAuth(enableBasicAuth: IResolvable) {
        cdkBuilder.enableBasicAuth(enableBasicAuth.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param password The password for basic authorization. 
       */
      override fun password(password: String) {
        cdkBuilder.password(password)
      }

      /**
       * @param username the value to be set. 
       */
      override fun username(username: String) {
        cdkBuilder.username(username)
      }

      public fun build(): software.amazon.awscdk.services.amplify.CfnBranch.BasicAuthConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.amplify.CfnBranch.BasicAuthConfigProperty,
    ) : CdkObject(cdkObject),
        BasicAuthConfigProperty {
      /**
       * Enables basic authorization for the branch.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-branch-basicauthconfig.html#cfn-amplify-branch-basicauthconfig-enablebasicauth)
       */
      override fun enableBasicAuth(): Any? = unwrap(this).getEnableBasicAuth()

      /**
       * The password for basic authorization.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-branch-basicauthconfig.html#cfn-amplify-branch-basicauthconfig-password)
       */
      override fun password(): String = unwrap(this).getPassword()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-branch-basicauthconfig.html#cfn-amplify-branch-basicauthconfig-username)
       */
      override fun username(): String = unwrap(this).getUsername()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): BasicAuthConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.amplify.CfnBranch.BasicAuthConfigProperty):
          BasicAuthConfigProperty = CdkObjectWrappers.wrap(cdkObject) as? BasicAuthConfigProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: BasicAuthConfigProperty):
          software.amazon.awscdk.services.amplify.CfnBranch.BasicAuthConfigProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.amplify.CfnBranch.BasicAuthConfigProperty
    }
  }

  /**
   * The EnvironmentVariable property type sets environment variables for a specific branch.
   *
   * Environment variables are key-value pairs that are available at build time.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.amplify.*;
   * EnvironmentVariableProperty environmentVariableProperty = EnvironmentVariableProperty.builder()
   * .name("name")
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-branch-environmentvariable.html)
   */
  public interface EnvironmentVariableProperty {
    /**
     * The environment variable name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-branch-environmentvariable.html#cfn-amplify-branch-environmentvariable-name)
     */
    public fun name(): String

    /**
     * The environment variable value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-branch-environmentvariable.html#cfn-amplify-branch-environmentvariable-value)
     */
    public fun `value`(): String

    /**
     * A builder for [EnvironmentVariableProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param name The environment variable name. 
       */
      public fun name(name: String)

      /**
       * @param value The environment variable value. 
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.amplify.CfnBranch.EnvironmentVariableProperty.Builder =
          software.amazon.awscdk.services.amplify.CfnBranch.EnvironmentVariableProperty.builder()

      /**
       * @param name The environment variable name. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param value The environment variable value. 
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.amplify.CfnBranch.EnvironmentVariableProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.amplify.CfnBranch.EnvironmentVariableProperty,
    ) : CdkObject(cdkObject),
        EnvironmentVariableProperty {
      /**
       * The environment variable name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-branch-environmentvariable.html#cfn-amplify-branch-environmentvariable-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * The environment variable value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-branch-environmentvariable.html#cfn-amplify-branch-environmentvariable-value)
       */
      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EnvironmentVariableProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.amplify.CfnBranch.EnvironmentVariableProperty):
          EnvironmentVariableProperty = CdkObjectWrappers.wrap(cdkObject) as?
          EnvironmentVariableProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: EnvironmentVariableProperty):
          software.amazon.awscdk.services.amplify.CfnBranch.EnvironmentVariableProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.amplify.CfnBranch.EnvironmentVariableProperty
    }
  }
}
