package io.cloudshiftdev.awscdk.services.amplify

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnApp internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.amplify.CfnApp,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The personal access token for a GitHub repository for an Amplify app.
   */
  public open fun accessToken(): String? = unwrap(this).getAccessToken()

  /**
   * The personal access token for a GitHub repository for an Amplify app.
   */
  public open fun accessToken(`value`: String) {
    unwrap(this).setAccessToken(`value`)
  }

  /**
   * Unique Id for the Amplify App.
   */
  public open fun attrAppId(): String = unwrap(this).getAttrAppId()

  /**
   * Name for the Amplify App.
   */
  public open fun attrAppName(): String = unwrap(this).getAttrAppName()

  /**
   * ARN for the Amplify App.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * Default domain for the Amplify App.
   */
  public open fun attrDefaultDomain(): String = unwrap(this).getAttrDefaultDomain()

  /**
   * Sets the configuration for your automatic branch creation.
   */
  public open fun autoBranchCreationConfig(): Any? = unwrap(this).getAutoBranchCreationConfig()

  /**
   * Sets the configuration for your automatic branch creation.
   */
  public open fun autoBranchCreationConfig(`value`: IResolvable) {
    unwrap(this).setAutoBranchCreationConfig(`value`.let(IResolvable::unwrap))
  }

  /**
   * Sets the configuration for your automatic branch creation.
   */
  public open fun autoBranchCreationConfig(`value`: AutoBranchCreationConfigProperty) {
    unwrap(this).setAutoBranchCreationConfig(`value`.let(AutoBranchCreationConfigProperty::unwrap))
  }

  /**
   * Sets the configuration for your automatic branch creation.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("72b5a78e0c2178a9932563a9b0a1b34747ce212371b55c1fe8604af2cec752ea")
  public open
      fun autoBranchCreationConfig(`value`: AutoBranchCreationConfigProperty.Builder.() -> Unit):
      Unit = autoBranchCreationConfig(AutoBranchCreationConfigProperty(`value`))

  /**
   * The credentials for basic authorization for an Amplify app.
   */
  public open fun basicAuthConfig(): Any? = unwrap(this).getBasicAuthConfig()

  /**
   * The credentials for basic authorization for an Amplify app.
   */
  public open fun basicAuthConfig(`value`: IResolvable) {
    unwrap(this).setBasicAuthConfig(`value`.let(IResolvable::unwrap))
  }

  /**
   * The credentials for basic authorization for an Amplify app.
   */
  public open fun basicAuthConfig(`value`: BasicAuthConfigProperty) {
    unwrap(this).setBasicAuthConfig(`value`.let(BasicAuthConfigProperty::unwrap))
  }

  /**
   * The credentials for basic authorization for an Amplify app.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("048ebf837e309052ce3d36879708e0c4bf8f731ffaab5fe3dc552721e567b98a")
  public open fun basicAuthConfig(`value`: BasicAuthConfigProperty.Builder.() -> Unit): Unit =
      basicAuthConfig(BasicAuthConfigProperty(`value`))

  /**
   * The build specification (build spec) for an Amplify app.
   */
  public open fun buildSpec(): String? = unwrap(this).getBuildSpec()

  /**
   * The build specification (build spec) for an Amplify app.
   */
  public open fun buildSpec(`value`: String) {
    unwrap(this).setBuildSpec(`value`)
  }

  /**
   * The custom HTTP headers for an Amplify app.
   */
  public open fun customHeaders(): String? = unwrap(this).getCustomHeaders()

  /**
   * The custom HTTP headers for an Amplify app.
   */
  public open fun customHeaders(`value`: String) {
    unwrap(this).setCustomHeaders(`value`)
  }

  /**
   * The custom rewrite and redirect rules for an Amplify app.
   */
  public open fun customRules(): Any? = unwrap(this).getCustomRules()

  /**
   * The custom rewrite and redirect rules for an Amplify app.
   */
  public open fun customRules(`value`: IResolvable) {
    unwrap(this).setCustomRules(`value`.let(IResolvable::unwrap))
  }

  /**
   * The custom rewrite and redirect rules for an Amplify app.
   */
  public open fun customRules(__idx_ac66f0: List<Any>) {
    unwrap(this).setCustomRules(__idx_ac66f0)
  }

  /**
   * The custom rewrite and redirect rules for an Amplify app.
   */
  public open fun customRules(vararg __idx_ac66f0: Any): Unit = customRules(__idx_ac66f0.toList())

  /**
   * The description of the Amplify app.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of the Amplify app.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * Automatically disconnect a branch in Amplify Hosting when you delete a branch from your Git
   * repository.
   */
  public open fun enableBranchAutoDeletion(): Any? = unwrap(this).getEnableBranchAutoDeletion()

  /**
   * Automatically disconnect a branch in Amplify Hosting when you delete a branch from your Git
   * repository.
   */
  public open fun enableBranchAutoDeletion(`value`: Boolean) {
    unwrap(this).setEnableBranchAutoDeletion(`value`)
  }

  /**
   * Automatically disconnect a branch in Amplify Hosting when you delete a branch from your Git
   * repository.
   */
  public open fun enableBranchAutoDeletion(`value`: IResolvable) {
    unwrap(this).setEnableBranchAutoDeletion(`value`.let(IResolvable::unwrap))
  }

  /**
   * The environment variables map for an Amplify app.
   */
  public open fun environmentVariables(): Any? = unwrap(this).getEnvironmentVariables()

  /**
   * The environment variables map for an Amplify app.
   */
  public open fun environmentVariables(`value`: IResolvable) {
    unwrap(this).setEnvironmentVariables(`value`.let(IResolvable::unwrap))
  }

  /**
   * The environment variables map for an Amplify app.
   */
  public open fun environmentVariables(__idx_ac66f0: List<Any>) {
    unwrap(this).setEnvironmentVariables(__idx_ac66f0)
  }

  /**
   * The environment variables map for an Amplify app.
   */
  public open fun environmentVariables(vararg __idx_ac66f0: Any): Unit =
      environmentVariables(__idx_ac66f0.toList())

  /**
   * AWS Identity and Access Management ( IAM ) service role for the Amazon Resource Name (ARN) of
   * the Amplify app.
   */
  public open fun iamServiceRole(): String? = unwrap(this).getIamServiceRole()

  /**
   * AWS Identity and Access Management ( IAM ) service role for the Amazon Resource Name (ARN) of
   * the Amplify app.
   */
  public open fun iamServiceRole(`value`: String) {
    unwrap(this).setIamServiceRole(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The name of the Amplify app.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the Amplify app.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The OAuth token for a third-party source control system for an Amplify app.
   */
  public open fun oauthToken(): String? = unwrap(this).getOauthToken()

  /**
   * The OAuth token for a third-party source control system for an Amplify app.
   */
  public open fun oauthToken(`value`: String) {
    unwrap(this).setOauthToken(`value`)
  }

  /**
   * The platform for the Amplify app.
   */
  public open fun platform(): String? = unwrap(this).getPlatform()

  /**
   * The platform for the Amplify app.
   */
  public open fun platform(`value`: String) {
    unwrap(this).setPlatform(`value`)
  }

  /**
   * The Git repository for the Amplify app.
   */
  public open fun repository(): String? = unwrap(this).getRepository()

  /**
   * The Git repository for the Amplify app.
   */
  public open fun repository(`value`: String) {
    unwrap(this).setRepository(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The tag for an Amplify app.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The tag for an Amplify app.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * The tag for an Amplify app.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.amplify.CfnApp].
   */
  @CdkDslMarker
  public interface Builder {
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
     * more information, see [Migrating an existing OAuth app to the Amplify GitHub
     * App](https://docs.aws.amazon.com/amplify/latest/userguide/setting-up-GitHub-access.html#migrating-to-github-app-auth)
     * in the *Amplify User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-accesstoken)
     * @param accessToken The personal access token for a GitHub repository for an Amplify app. 
     */
    public fun accessToken(accessToken: String)

    /**
     * Sets the configuration for your automatic branch creation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-autobranchcreationconfig)
     * @param autoBranchCreationConfig Sets the configuration for your automatic branch creation. 
     */
    public fun autoBranchCreationConfig(autoBranchCreationConfig: IResolvable)

    /**
     * Sets the configuration for your automatic branch creation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-autobranchcreationconfig)
     * @param autoBranchCreationConfig Sets the configuration for your automatic branch creation. 
     */
    public fun autoBranchCreationConfig(autoBranchCreationConfig: AutoBranchCreationConfigProperty)

    /**
     * Sets the configuration for your automatic branch creation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-autobranchcreationconfig)
     * @param autoBranchCreationConfig Sets the configuration for your automatic branch creation. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("caac41c0f554cf7f4b9a46c5f6ccaf09ede47a48e86652f05eeb750602591070")
    public
        fun autoBranchCreationConfig(autoBranchCreationConfig: AutoBranchCreationConfigProperty.Builder.() -> Unit)

    /**
     * The credentials for basic authorization for an Amplify app.
     *
     * You must base64-encode the authorization credentials and provide them in the format
     * `user:password` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-basicauthconfig)
     * @param basicAuthConfig The credentials for basic authorization for an Amplify app. 
     */
    public fun basicAuthConfig(basicAuthConfig: IResolvable)

    /**
     * The credentials for basic authorization for an Amplify app.
     *
     * You must base64-encode the authorization credentials and provide them in the format
     * `user:password` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-basicauthconfig)
     * @param basicAuthConfig The credentials for basic authorization for an Amplify app. 
     */
    public fun basicAuthConfig(basicAuthConfig: BasicAuthConfigProperty)

    /**
     * The credentials for basic authorization for an Amplify app.
     *
     * You must base64-encode the authorization credentials and provide them in the format
     * `user:password` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-basicauthconfig)
     * @param basicAuthConfig The credentials for basic authorization for an Amplify app. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("70412e491fd213efa06ca1dacddccd8c03669eff817a156e12cf1f84344cb5be")
    public fun basicAuthConfig(basicAuthConfig: BasicAuthConfigProperty.Builder.() -> Unit)

    /**
     * The build specification (build spec) for an Amplify app.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-buildspec)
     * @param buildSpec The build specification (build spec) for an Amplify app. 
     */
    public fun buildSpec(buildSpec: String)

    /**
     * The custom HTTP headers for an Amplify app.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-customheaders)
     * @param customHeaders The custom HTTP headers for an Amplify app. 
     */
    public fun customHeaders(customHeaders: String)

    /**
     * The custom rewrite and redirect rules for an Amplify app.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-customrules)
     * @param customRules The custom rewrite and redirect rules for an Amplify app. 
     */
    public fun customRules(customRules: IResolvable)

    /**
     * The custom rewrite and redirect rules for an Amplify app.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-customrules)
     * @param customRules The custom rewrite and redirect rules for an Amplify app. 
     */
    public fun customRules(customRules: List<Any>)

    /**
     * The custom rewrite and redirect rules for an Amplify app.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-customrules)
     * @param customRules The custom rewrite and redirect rules for an Amplify app. 
     */
    public fun customRules(vararg customRules: Any)

    /**
     * The description of the Amplify app.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-description)
     * @param description The description of the Amplify app. 
     */
    public fun description(description: String)

    /**
     * Automatically disconnect a branch in Amplify Hosting when you delete a branch from your Git
     * repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-enablebranchautodeletion)
     * @param enableBranchAutoDeletion Automatically disconnect a branch in Amplify Hosting when you
     * delete a branch from your Git repository. 
     */
    public fun enableBranchAutoDeletion(enableBranchAutoDeletion: Boolean)

    /**
     * Automatically disconnect a branch in Amplify Hosting when you delete a branch from your Git
     * repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-enablebranchautodeletion)
     * @param enableBranchAutoDeletion Automatically disconnect a branch in Amplify Hosting when you
     * delete a branch from your Git repository. 
     */
    public fun enableBranchAutoDeletion(enableBranchAutoDeletion: IResolvable)

    /**
     * The environment variables map for an Amplify app.
     *
     * For a list of the environment variables that are accessible to Amplify by default, see
     * [Amplify Environment
     * variables](https://docs.aws.amazon.com/amplify/latest/userguide/amplify-console-environment-variables.html)
     * in the *Amplify Hosting User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-environmentvariables)
     * @param environmentVariables The environment variables map for an Amplify app. 
     */
    public fun environmentVariables(environmentVariables: IResolvable)

    /**
     * The environment variables map for an Amplify app.
     *
     * For a list of the environment variables that are accessible to Amplify by default, see
     * [Amplify Environment
     * variables](https://docs.aws.amazon.com/amplify/latest/userguide/amplify-console-environment-variables.html)
     * in the *Amplify Hosting User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-environmentvariables)
     * @param environmentVariables The environment variables map for an Amplify app. 
     */
    public fun environmentVariables(environmentVariables: List<Any>)

    /**
     * The environment variables map for an Amplify app.
     *
     * For a list of the environment variables that are accessible to Amplify by default, see
     * [Amplify Environment
     * variables](https://docs.aws.amazon.com/amplify/latest/userguide/amplify-console-environment-variables.html)
     * in the *Amplify Hosting User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-environmentvariables)
     * @param environmentVariables The environment variables map for an Amplify app. 
     */
    public fun environmentVariables(vararg environmentVariables: Any)

    /**
     * AWS Identity and Access Management ( IAM ) service role for the Amazon Resource Name (ARN) of
     * the Amplify app.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-iamservicerole)
     * @param iamServiceRole AWS Identity and Access Management ( IAM ) service role for the Amazon
     * Resource Name (ARN) of the Amplify app. 
     */
    public fun iamServiceRole(iamServiceRole: String)

    /**
     * The name of the Amplify app.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-name)
     * @param name The name of the Amplify app. 
     */
    public fun name(name: String)

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
     * more information, see [Migrating an existing OAuth app to the Amplify GitHub
     * App](https://docs.aws.amazon.com/amplify/latest/userguide/setting-up-GitHub-access.html#migrating-to-github-app-auth)
     * in the *Amplify User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-oauthtoken)
     * @param oauthToken The OAuth token for a third-party source control system for an Amplify app.
     * 
     */
    public fun oauthToken(oauthToken: String)

    /**
     * The platform for the Amplify app.
     *
     * For a static app, set the platform type to `WEB` . For a dynamic server-side rendered (SSR)
     * app, set the platform type to `WEB_COMPUTE` . For an app requiring Amplify Hosting's original
     * SSR support only, set the platform type to `WEB_DYNAMIC` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-platform)
     * @param platform The platform for the Amplify app. 
     */
    public fun platform(platform: String)

    /**
     * The Git repository for the Amplify app.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-repository)
     * @param repository The Git repository for the Amplify app. 
     */
    public fun repository(repository: String)

    /**
     * The tag for an Amplify app.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-tags)
     * @param tags The tag for an Amplify app. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tag for an Amplify app.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-tags)
     * @param tags The tag for an Amplify app. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.amplify.CfnApp.Builder =
        software.amazon.awscdk.services.amplify.CfnApp.Builder.create(scope, id)

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
     * more information, see [Migrating an existing OAuth app to the Amplify GitHub
     * App](https://docs.aws.amazon.com/amplify/latest/userguide/setting-up-GitHub-access.html#migrating-to-github-app-auth)
     * in the *Amplify User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-accesstoken)
     * @param accessToken The personal access token for a GitHub repository for an Amplify app. 
     */
    override fun accessToken(accessToken: String) {
      cdkBuilder.accessToken(accessToken)
    }

    /**
     * Sets the configuration for your automatic branch creation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-autobranchcreationconfig)
     * @param autoBranchCreationConfig Sets the configuration for your automatic branch creation. 
     */
    override fun autoBranchCreationConfig(autoBranchCreationConfig: IResolvable) {
      cdkBuilder.autoBranchCreationConfig(autoBranchCreationConfig.let(IResolvable::unwrap))
    }

    /**
     * Sets the configuration for your automatic branch creation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-autobranchcreationconfig)
     * @param autoBranchCreationConfig Sets the configuration for your automatic branch creation. 
     */
    override
        fun autoBranchCreationConfig(autoBranchCreationConfig: AutoBranchCreationConfigProperty) {
      cdkBuilder.autoBranchCreationConfig(autoBranchCreationConfig.let(AutoBranchCreationConfigProperty::unwrap))
    }

    /**
     * Sets the configuration for your automatic branch creation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-autobranchcreationconfig)
     * @param autoBranchCreationConfig Sets the configuration for your automatic branch creation. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("caac41c0f554cf7f4b9a46c5f6ccaf09ede47a48e86652f05eeb750602591070")
    override
        fun autoBranchCreationConfig(autoBranchCreationConfig: AutoBranchCreationConfigProperty.Builder.() -> Unit):
        Unit = autoBranchCreationConfig(AutoBranchCreationConfigProperty(autoBranchCreationConfig))

    /**
     * The credentials for basic authorization for an Amplify app.
     *
     * You must base64-encode the authorization credentials and provide them in the format
     * `user:password` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-basicauthconfig)
     * @param basicAuthConfig The credentials for basic authorization for an Amplify app. 
     */
    override fun basicAuthConfig(basicAuthConfig: IResolvable) {
      cdkBuilder.basicAuthConfig(basicAuthConfig.let(IResolvable::unwrap))
    }

    /**
     * The credentials for basic authorization for an Amplify app.
     *
     * You must base64-encode the authorization credentials and provide them in the format
     * `user:password` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-basicauthconfig)
     * @param basicAuthConfig The credentials for basic authorization for an Amplify app. 
     */
    override fun basicAuthConfig(basicAuthConfig: BasicAuthConfigProperty) {
      cdkBuilder.basicAuthConfig(basicAuthConfig.let(BasicAuthConfigProperty::unwrap))
    }

    /**
     * The credentials for basic authorization for an Amplify app.
     *
     * You must base64-encode the authorization credentials and provide them in the format
     * `user:password` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-basicauthconfig)
     * @param basicAuthConfig The credentials for basic authorization for an Amplify app. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("70412e491fd213efa06ca1dacddccd8c03669eff817a156e12cf1f84344cb5be")
    override fun basicAuthConfig(basicAuthConfig: BasicAuthConfigProperty.Builder.() -> Unit): Unit
        = basicAuthConfig(BasicAuthConfigProperty(basicAuthConfig))

    /**
     * The build specification (build spec) for an Amplify app.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-buildspec)
     * @param buildSpec The build specification (build spec) for an Amplify app. 
     */
    override fun buildSpec(buildSpec: String) {
      cdkBuilder.buildSpec(buildSpec)
    }

    /**
     * The custom HTTP headers for an Amplify app.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-customheaders)
     * @param customHeaders The custom HTTP headers for an Amplify app. 
     */
    override fun customHeaders(customHeaders: String) {
      cdkBuilder.customHeaders(customHeaders)
    }

    /**
     * The custom rewrite and redirect rules for an Amplify app.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-customrules)
     * @param customRules The custom rewrite and redirect rules for an Amplify app. 
     */
    override fun customRules(customRules: IResolvable) {
      cdkBuilder.customRules(customRules.let(IResolvable::unwrap))
    }

    /**
     * The custom rewrite and redirect rules for an Amplify app.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-customrules)
     * @param customRules The custom rewrite and redirect rules for an Amplify app. 
     */
    override fun customRules(customRules: List<Any>) {
      cdkBuilder.customRules(customRules)
    }

    /**
     * The custom rewrite and redirect rules for an Amplify app.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-customrules)
     * @param customRules The custom rewrite and redirect rules for an Amplify app. 
     */
    override fun customRules(vararg customRules: Any): Unit = customRules(customRules.toList())

    /**
     * The description of the Amplify app.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-description)
     * @param description The description of the Amplify app. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * Automatically disconnect a branch in Amplify Hosting when you delete a branch from your Git
     * repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-enablebranchautodeletion)
     * @param enableBranchAutoDeletion Automatically disconnect a branch in Amplify Hosting when you
     * delete a branch from your Git repository. 
     */
    override fun enableBranchAutoDeletion(enableBranchAutoDeletion: Boolean) {
      cdkBuilder.enableBranchAutoDeletion(enableBranchAutoDeletion)
    }

    /**
     * Automatically disconnect a branch in Amplify Hosting when you delete a branch from your Git
     * repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-enablebranchautodeletion)
     * @param enableBranchAutoDeletion Automatically disconnect a branch in Amplify Hosting when you
     * delete a branch from your Git repository. 
     */
    override fun enableBranchAutoDeletion(enableBranchAutoDeletion: IResolvable) {
      cdkBuilder.enableBranchAutoDeletion(enableBranchAutoDeletion.let(IResolvable::unwrap))
    }

    /**
     * The environment variables map for an Amplify app.
     *
     * For a list of the environment variables that are accessible to Amplify by default, see
     * [Amplify Environment
     * variables](https://docs.aws.amazon.com/amplify/latest/userguide/amplify-console-environment-variables.html)
     * in the *Amplify Hosting User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-environmentvariables)
     * @param environmentVariables The environment variables map for an Amplify app. 
     */
    override fun environmentVariables(environmentVariables: IResolvable) {
      cdkBuilder.environmentVariables(environmentVariables.let(IResolvable::unwrap))
    }

    /**
     * The environment variables map for an Amplify app.
     *
     * For a list of the environment variables that are accessible to Amplify by default, see
     * [Amplify Environment
     * variables](https://docs.aws.amazon.com/amplify/latest/userguide/amplify-console-environment-variables.html)
     * in the *Amplify Hosting User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-environmentvariables)
     * @param environmentVariables The environment variables map for an Amplify app. 
     */
    override fun environmentVariables(environmentVariables: List<Any>) {
      cdkBuilder.environmentVariables(environmentVariables)
    }

    /**
     * The environment variables map for an Amplify app.
     *
     * For a list of the environment variables that are accessible to Amplify by default, see
     * [Amplify Environment
     * variables](https://docs.aws.amazon.com/amplify/latest/userguide/amplify-console-environment-variables.html)
     * in the *Amplify Hosting User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-environmentvariables)
     * @param environmentVariables The environment variables map for an Amplify app. 
     */
    override fun environmentVariables(vararg environmentVariables: Any): Unit =
        environmentVariables(environmentVariables.toList())

    /**
     * AWS Identity and Access Management ( IAM ) service role for the Amazon Resource Name (ARN) of
     * the Amplify app.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-iamservicerole)
     * @param iamServiceRole AWS Identity and Access Management ( IAM ) service role for the Amazon
     * Resource Name (ARN) of the Amplify app. 
     */
    override fun iamServiceRole(iamServiceRole: String) {
      cdkBuilder.iamServiceRole(iamServiceRole)
    }

    /**
     * The name of the Amplify app.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-name)
     * @param name The name of the Amplify app. 
     */
    override fun name(name: String) {
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
     * more information, see [Migrating an existing OAuth app to the Amplify GitHub
     * App](https://docs.aws.amazon.com/amplify/latest/userguide/setting-up-GitHub-access.html#migrating-to-github-app-auth)
     * in the *Amplify User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-oauthtoken)
     * @param oauthToken The OAuth token for a third-party source control system for an Amplify app.
     * 
     */
    override fun oauthToken(oauthToken: String) {
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
     * @param platform The platform for the Amplify app. 
     */
    override fun platform(platform: String) {
      cdkBuilder.platform(platform)
    }

    /**
     * The Git repository for the Amplify app.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-repository)
     * @param repository The Git repository for the Amplify app. 
     */
    override fun repository(repository: String) {
      cdkBuilder.repository(repository)
    }

    /**
     * The tag for an Amplify app.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-tags)
     * @param tags The tag for an Amplify app. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * The tag for an Amplify app.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-tags)
     * @param tags The tag for an Amplify app. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.amplify.CfnApp = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.amplify.CfnApp.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnApp {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnApp(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.amplify.CfnApp): CfnApp =
        CfnApp(cdkObject)

    internal fun unwrap(wrapped: CfnApp): software.amazon.awscdk.services.amplify.CfnApp =
        wrapped.cdkObject
  }

  public interface EnvironmentVariableProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-app-environmentvariable.html#cfn-amplify-app-environmentvariable-name)
     */
    public fun name(): String

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-app-environmentvariable.html#cfn-amplify-app-environmentvariable-value)
     */
    public fun `value`(): String

    /**
     * A builder for [EnvironmentVariableProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param name the value to be set. 
       */
      public fun name(name: String)

      /**
       * @param value the value to be set. 
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.amplify.CfnApp.EnvironmentVariableProperty.Builder =
          software.amazon.awscdk.services.amplify.CfnApp.EnvironmentVariableProperty.builder()

      /**
       * @param name the value to be set. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param value the value to be set. 
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.amplify.CfnApp.EnvironmentVariableProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.amplify.CfnApp.EnvironmentVariableProperty,
    ) : CdkObject(cdkObject), EnvironmentVariableProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-app-environmentvariable.html#cfn-amplify-app-environmentvariable-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-app-environmentvariable.html#cfn-amplify-app-environmentvariable-value)
       */
      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EnvironmentVariableProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.amplify.CfnApp.EnvironmentVariableProperty):
          EnvironmentVariableProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EnvironmentVariableProperty):
          software.amazon.awscdk.services.amplify.CfnApp.EnvironmentVariableProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.amplify.CfnApp.EnvironmentVariableProperty
    }
  }

  public interface CustomRuleProperty {
    /**
     * The condition for a URL rewrite or redirect rule, such as a country code.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-app-customrule.html#cfn-amplify-app-customrule-condition)
     */
    public fun condition(): String? = unwrap(this).getCondition()

    /**
     * The source pattern for a URL rewrite or redirect rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-app-customrule.html#cfn-amplify-app-customrule-source)
     */
    public fun source(): String

    /**
     * The status code for a URL rewrite or redirect rule.
     *
     * * **200** - Represents a 200 rewrite rule.
     * * **301** - Represents a 301 (moved pemanently) redirect rule. This and all future requests
     * should be directed to the target URL.
     * * **302** - Represents a 302 temporary redirect rule.
     * * **404** - Represents a 404 redirect rule.
     * * **404-200** - Represents a 404 rewrite rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-app-customrule.html#cfn-amplify-app-customrule-status)
     */
    public fun status(): String? = unwrap(this).getStatus()

    /**
     * The target pattern for a URL rewrite or redirect rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-app-customrule.html#cfn-amplify-app-customrule-target)
     */
    public fun target(): String

    /**
     * A builder for [CustomRuleProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param condition The condition for a URL rewrite or redirect rule, such as a country code.
       */
      public fun condition(condition: String)

      /**
       * @param source The source pattern for a URL rewrite or redirect rule. 
       */
      public fun source(source: String)

      /**
       * @param status The status code for a URL rewrite or redirect rule.
       * * **200** - Represents a 200 rewrite rule.
       * * **301** - Represents a 301 (moved pemanently) redirect rule. This and all future requests
       * should be directed to the target URL.
       * * **302** - Represents a 302 temporary redirect rule.
       * * **404** - Represents a 404 redirect rule.
       * * **404-200** - Represents a 404 rewrite rule.
       */
      public fun status(status: String)

      /**
       * @param target The target pattern for a URL rewrite or redirect rule. 
       */
      public fun target(target: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.amplify.CfnApp.CustomRuleProperty.Builder =
          software.amazon.awscdk.services.amplify.CfnApp.CustomRuleProperty.builder()

      /**
       * @param condition The condition for a URL rewrite or redirect rule, such as a country code.
       */
      override fun condition(condition: String) {
        cdkBuilder.condition(condition)
      }

      /**
       * @param source The source pattern for a URL rewrite or redirect rule. 
       */
      override fun source(source: String) {
        cdkBuilder.source(source)
      }

      /**
       * @param status The status code for a URL rewrite or redirect rule.
       * * **200** - Represents a 200 rewrite rule.
       * * **301** - Represents a 301 (moved pemanently) redirect rule. This and all future requests
       * should be directed to the target URL.
       * * **302** - Represents a 302 temporary redirect rule.
       * * **404** - Represents a 404 redirect rule.
       * * **404-200** - Represents a 404 rewrite rule.
       */
      override fun status(status: String) {
        cdkBuilder.status(status)
      }

      /**
       * @param target The target pattern for a URL rewrite or redirect rule. 
       */
      override fun target(target: String) {
        cdkBuilder.target(target)
      }

      public fun build(): software.amazon.awscdk.services.amplify.CfnApp.CustomRuleProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.amplify.CfnApp.CustomRuleProperty,
    ) : CdkObject(cdkObject), CustomRuleProperty {
      /**
       * The condition for a URL rewrite or redirect rule, such as a country code.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-app-customrule.html#cfn-amplify-app-customrule-condition)
       */
      override fun condition(): String? = unwrap(this).getCondition()

      /**
       * The source pattern for a URL rewrite or redirect rule.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-app-customrule.html#cfn-amplify-app-customrule-source)
       */
      override fun source(): String = unwrap(this).getSource()

      /**
       * The status code for a URL rewrite or redirect rule.
       *
       * * **200** - Represents a 200 rewrite rule.
       * * **301** - Represents a 301 (moved pemanently) redirect rule. This and all future requests
       * should be directed to the target URL.
       * * **302** - Represents a 302 temporary redirect rule.
       * * **404** - Represents a 404 redirect rule.
       * * **404-200** - Represents a 404 rewrite rule.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-app-customrule.html#cfn-amplify-app-customrule-status)
       */
      override fun status(): String? = unwrap(this).getStatus()

      /**
       * The target pattern for a URL rewrite or redirect rule.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-app-customrule.html#cfn-amplify-app-customrule-target)
       */
      override fun target(): String = unwrap(this).getTarget()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CustomRuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.amplify.CfnApp.CustomRuleProperty):
          CustomRuleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CustomRuleProperty):
          software.amazon.awscdk.services.amplify.CfnApp.CustomRuleProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.amplify.CfnApp.CustomRuleProperty
    }
  }

  public interface AutoBranchCreationConfigProperty {
    /**
     * Automated branch creation glob patterns for the Amplify app.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-app-autobranchcreationconfig.html#cfn-amplify-app-autobranchcreationconfig-autobranchcreationpatterns)
     */
    public fun autoBranchCreationPatterns(): List<String> =
        unwrap(this).getAutoBranchCreationPatterns() ?: emptyList()

    /**
     * Sets password protection for your auto created branch.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-app-autobranchcreationconfig.html#cfn-amplify-app-autobranchcreationconfig-basicauthconfig)
     */
    public fun basicAuthConfig(): Any? = unwrap(this).getBasicAuthConfig()

    /**
     * The build specification (build spec) for the autocreated branch.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-app-autobranchcreationconfig.html#cfn-amplify-app-autobranchcreationconfig-buildspec)
     */
    public fun buildSpec(): String? = unwrap(this).getBuildSpec()

    /**
     * Enables automated branch creation for the Amplify app.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-app-autobranchcreationconfig.html#cfn-amplify-app-autobranchcreationconfig-enableautobranchcreation)
     */
    public fun enableAutoBranchCreation(): Any? = unwrap(this).getEnableAutoBranchCreation()

    /**
     * Enables auto building for the auto created branch.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-app-autobranchcreationconfig.html#cfn-amplify-app-autobranchcreationconfig-enableautobuild)
     */
    public fun enableAutoBuild(): Any? = unwrap(this).getEnableAutoBuild()

    /**
     * Enables performance mode for the branch.
     *
     * Performance mode optimizes for faster hosting performance by keeping content cached at the
     * edge for a longer interval. When performance mode is enabled, hosting configuration or code
     * changes can take up to 10 minutes to roll out.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-app-autobranchcreationconfig.html#cfn-amplify-app-autobranchcreationconfig-enableperformancemode)
     */
    public fun enablePerformanceMode(): Any? = unwrap(this).getEnablePerformanceMode()

    /**
     * Sets whether pull request previews are enabled for each branch that Amplify Hosting
     * automatically creates for your app.
     *
     * Amplify creates previews by deploying your app to a unique URL whenever a pull request is
     * opened for the branch. Development and QA teams can use this preview to test the pull request
     * before it's merged into a production or integration branch.
     *
     * To provide backend support for your preview, Amplify Hosting automatically provisions a
     * temporary backend environment that it deletes when the pull request is closed. If you want to
     * specify a dedicated backend environment for your previews, use the `PullRequestEnvironmentName`
     * property.
     *
     * For more information, see [Web
     * Previews](https://docs.aws.amazon.com/amplify/latest/userguide/pr-previews.html) in the *AWS
     * Amplify Hosting User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-app-autobranchcreationconfig.html#cfn-amplify-app-autobranchcreationconfig-enablepullrequestpreview)
     */
    public fun enablePullRequestPreview(): Any? = unwrap(this).getEnablePullRequestPreview()

    /**
     * Environment variables for the auto created branch.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-app-autobranchcreationconfig.html#cfn-amplify-app-autobranchcreationconfig-environmentvariables)
     */
    public fun environmentVariables(): Any? = unwrap(this).getEnvironmentVariables()

    /**
     * The framework for the autocreated branch.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-app-autobranchcreationconfig.html#cfn-amplify-app-autobranchcreationconfig-framework)
     */
    public fun framework(): String? = unwrap(this).getFramework()

    /**
     * If pull request previews are enabled, you can use this property to specify a dedicated
     * backend environment for your previews.
     *
     * For example, you could specify an environment named `prod` , `test` , or `dev` that you
     * initialized with the Amplify CLI.
     *
     * To enable pull request previews, set the `EnablePullRequestPreview` property to `true` .
     *
     * If you don't specify an environment, Amplify Hosting provides backend support for each
     * preview by automatically provisioning a temporary backend environment. Amplify deletes this
     * environment when the pull request is closed.
     *
     * For more information about creating backend environments, see [Feature Branch Deployments and
     * Team Workflows](https://docs.aws.amazon.com/amplify/latest/userguide/multi-environments.html) in
     * the *AWS Amplify Hosting User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-app-autobranchcreationconfig.html#cfn-amplify-app-autobranchcreationconfig-pullrequestenvironmentname)
     */
    public fun pullRequestEnvironmentName(): String? = unwrap(this).getPullRequestEnvironmentName()

    /**
     * Stage for the auto created branch.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-app-autobranchcreationconfig.html#cfn-amplify-app-autobranchcreationconfig-stage)
     */
    public fun stage(): String? = unwrap(this).getStage()

    /**
     * A builder for [AutoBranchCreationConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param autoBranchCreationPatterns Automated branch creation glob patterns for the Amplify
       * app.
       */
      public fun autoBranchCreationPatterns(autoBranchCreationPatterns: List<String>)

      /**
       * @param autoBranchCreationPatterns Automated branch creation glob patterns for the Amplify
       * app.
       */
      public fun autoBranchCreationPatterns(vararg autoBranchCreationPatterns: String)

      /**
       * @param basicAuthConfig Sets password protection for your auto created branch.
       */
      public fun basicAuthConfig(basicAuthConfig: IResolvable)

      /**
       * @param basicAuthConfig Sets password protection for your auto created branch.
       */
      public fun basicAuthConfig(basicAuthConfig: BasicAuthConfigProperty)

      /**
       * @param basicAuthConfig Sets password protection for your auto created branch.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ddf458e62f1a42fa2f5bc13e21b25d23030ef08e42b73057b7c2980f3807d3b0")
      public fun basicAuthConfig(basicAuthConfig: BasicAuthConfigProperty.Builder.() -> Unit)

      /**
       * @param buildSpec The build specification (build spec) for the autocreated branch.
       */
      public fun buildSpec(buildSpec: String)

      /**
       * @param enableAutoBranchCreation Enables automated branch creation for the Amplify app.
       */
      public fun enableAutoBranchCreation(enableAutoBranchCreation: Boolean)

      /**
       * @param enableAutoBranchCreation Enables automated branch creation for the Amplify app.
       */
      public fun enableAutoBranchCreation(enableAutoBranchCreation: IResolvable)

      /**
       * @param enableAutoBuild Enables auto building for the auto created branch.
       */
      public fun enableAutoBuild(enableAutoBuild: Boolean)

      /**
       * @param enableAutoBuild Enables auto building for the auto created branch.
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
       * @param enablePullRequestPreview Sets whether pull request previews are enabled for each
       * branch that Amplify Hosting automatically creates for your app.
       * Amplify creates previews by deploying your app to a unique URL whenever a pull request is
       * opened for the branch. Development and QA teams can use this preview to test the pull request
       * before it's merged into a production or integration branch.
       *
       * To provide backend support for your preview, Amplify Hosting automatically provisions a
       * temporary backend environment that it deletes when the pull request is closed. If you want to
       * specify a dedicated backend environment for your previews, use the
       * `PullRequestEnvironmentName` property.
       *
       * For more information, see [Web
       * Previews](https://docs.aws.amazon.com/amplify/latest/userguide/pr-previews.html) in the *AWS
       * Amplify Hosting User Guide* .
       */
      public fun enablePullRequestPreview(enablePullRequestPreview: Boolean)

      /**
       * @param enablePullRequestPreview Sets whether pull request previews are enabled for each
       * branch that Amplify Hosting automatically creates for your app.
       * Amplify creates previews by deploying your app to a unique URL whenever a pull request is
       * opened for the branch. Development and QA teams can use this preview to test the pull request
       * before it's merged into a production or integration branch.
       *
       * To provide backend support for your preview, Amplify Hosting automatically provisions a
       * temporary backend environment that it deletes when the pull request is closed. If you want to
       * specify a dedicated backend environment for your previews, use the
       * `PullRequestEnvironmentName` property.
       *
       * For more information, see [Web
       * Previews](https://docs.aws.amazon.com/amplify/latest/userguide/pr-previews.html) in the *AWS
       * Amplify Hosting User Guide* .
       */
      public fun enablePullRequestPreview(enablePullRequestPreview: IResolvable)

      /**
       * @param environmentVariables Environment variables for the auto created branch.
       */
      public fun environmentVariables(environmentVariables: IResolvable)

      /**
       * @param environmentVariables Environment variables for the auto created branch.
       */
      public fun environmentVariables(environmentVariables: List<Any>)

      /**
       * @param environmentVariables Environment variables for the auto created branch.
       */
      public fun environmentVariables(vararg environmentVariables: Any)

      /**
       * @param framework The framework for the autocreated branch.
       */
      public fun framework(framework: String)

      /**
       * @param pullRequestEnvironmentName If pull request previews are enabled, you can use this
       * property to specify a dedicated backend environment for your previews.
       * For example, you could specify an environment named `prod` , `test` , or `dev` that you
       * initialized with the Amplify CLI.
       *
       * To enable pull request previews, set the `EnablePullRequestPreview` property to `true` .
       *
       * If you don't specify an environment, Amplify Hosting provides backend support for each
       * preview by automatically provisioning a temporary backend environment. Amplify deletes this
       * environment when the pull request is closed.
       *
       * For more information about creating backend environments, see [Feature Branch Deployments
       * and Team
       * Workflows](https://docs.aws.amazon.com/amplify/latest/userguide/multi-environments.html) in
       * the *AWS Amplify Hosting User Guide* .
       */
      public fun pullRequestEnvironmentName(pullRequestEnvironmentName: String)

      /**
       * @param stage Stage for the auto created branch.
       */
      public fun stage(stage: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.amplify.CfnApp.AutoBranchCreationConfigProperty.Builder =
          software.amazon.awscdk.services.amplify.CfnApp.AutoBranchCreationConfigProperty.builder()

      /**
       * @param autoBranchCreationPatterns Automated branch creation glob patterns for the Amplify
       * app.
       */
      override fun autoBranchCreationPatterns(autoBranchCreationPatterns: List<String>) {
        cdkBuilder.autoBranchCreationPatterns(autoBranchCreationPatterns)
      }

      /**
       * @param autoBranchCreationPatterns Automated branch creation glob patterns for the Amplify
       * app.
       */
      override fun autoBranchCreationPatterns(vararg autoBranchCreationPatterns: String): Unit =
          autoBranchCreationPatterns(autoBranchCreationPatterns.toList())

      /**
       * @param basicAuthConfig Sets password protection for your auto created branch.
       */
      override fun basicAuthConfig(basicAuthConfig: IResolvable) {
        cdkBuilder.basicAuthConfig(basicAuthConfig.let(IResolvable::unwrap))
      }

      /**
       * @param basicAuthConfig Sets password protection for your auto created branch.
       */
      override fun basicAuthConfig(basicAuthConfig: BasicAuthConfigProperty) {
        cdkBuilder.basicAuthConfig(basicAuthConfig.let(BasicAuthConfigProperty::unwrap))
      }

      /**
       * @param basicAuthConfig Sets password protection for your auto created branch.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ddf458e62f1a42fa2f5bc13e21b25d23030ef08e42b73057b7c2980f3807d3b0")
      override fun basicAuthConfig(basicAuthConfig: BasicAuthConfigProperty.Builder.() -> Unit):
          Unit = basicAuthConfig(BasicAuthConfigProperty(basicAuthConfig))

      /**
       * @param buildSpec The build specification (build spec) for the autocreated branch.
       */
      override fun buildSpec(buildSpec: String) {
        cdkBuilder.buildSpec(buildSpec)
      }

      /**
       * @param enableAutoBranchCreation Enables automated branch creation for the Amplify app.
       */
      override fun enableAutoBranchCreation(enableAutoBranchCreation: Boolean) {
        cdkBuilder.enableAutoBranchCreation(enableAutoBranchCreation)
      }

      /**
       * @param enableAutoBranchCreation Enables automated branch creation for the Amplify app.
       */
      override fun enableAutoBranchCreation(enableAutoBranchCreation: IResolvable) {
        cdkBuilder.enableAutoBranchCreation(enableAutoBranchCreation.let(IResolvable::unwrap))
      }

      /**
       * @param enableAutoBuild Enables auto building for the auto created branch.
       */
      override fun enableAutoBuild(enableAutoBuild: Boolean) {
        cdkBuilder.enableAutoBuild(enableAutoBuild)
      }

      /**
       * @param enableAutoBuild Enables auto building for the auto created branch.
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
       * @param enablePullRequestPreview Sets whether pull request previews are enabled for each
       * branch that Amplify Hosting automatically creates for your app.
       * Amplify creates previews by deploying your app to a unique URL whenever a pull request is
       * opened for the branch. Development and QA teams can use this preview to test the pull request
       * before it's merged into a production or integration branch.
       *
       * To provide backend support for your preview, Amplify Hosting automatically provisions a
       * temporary backend environment that it deletes when the pull request is closed. If you want to
       * specify a dedicated backend environment for your previews, use the
       * `PullRequestEnvironmentName` property.
       *
       * For more information, see [Web
       * Previews](https://docs.aws.amazon.com/amplify/latest/userguide/pr-previews.html) in the *AWS
       * Amplify Hosting User Guide* .
       */
      override fun enablePullRequestPreview(enablePullRequestPreview: Boolean) {
        cdkBuilder.enablePullRequestPreview(enablePullRequestPreview)
      }

      /**
       * @param enablePullRequestPreview Sets whether pull request previews are enabled for each
       * branch that Amplify Hosting automatically creates for your app.
       * Amplify creates previews by deploying your app to a unique URL whenever a pull request is
       * opened for the branch. Development and QA teams can use this preview to test the pull request
       * before it's merged into a production or integration branch.
       *
       * To provide backend support for your preview, Amplify Hosting automatically provisions a
       * temporary backend environment that it deletes when the pull request is closed. If you want to
       * specify a dedicated backend environment for your previews, use the
       * `PullRequestEnvironmentName` property.
       *
       * For more information, see [Web
       * Previews](https://docs.aws.amazon.com/amplify/latest/userguide/pr-previews.html) in the *AWS
       * Amplify Hosting User Guide* .
       */
      override fun enablePullRequestPreview(enablePullRequestPreview: IResolvable) {
        cdkBuilder.enablePullRequestPreview(enablePullRequestPreview.let(IResolvable::unwrap))
      }

      /**
       * @param environmentVariables Environment variables for the auto created branch.
       */
      override fun environmentVariables(environmentVariables: IResolvable) {
        cdkBuilder.environmentVariables(environmentVariables.let(IResolvable::unwrap))
      }

      /**
       * @param environmentVariables Environment variables for the auto created branch.
       */
      override fun environmentVariables(environmentVariables: List<Any>) {
        cdkBuilder.environmentVariables(environmentVariables)
      }

      /**
       * @param environmentVariables Environment variables for the auto created branch.
       */
      override fun environmentVariables(vararg environmentVariables: Any): Unit =
          environmentVariables(environmentVariables.toList())

      /**
       * @param framework The framework for the autocreated branch.
       */
      override fun framework(framework: String) {
        cdkBuilder.framework(framework)
      }

      /**
       * @param pullRequestEnvironmentName If pull request previews are enabled, you can use this
       * property to specify a dedicated backend environment for your previews.
       * For example, you could specify an environment named `prod` , `test` , or `dev` that you
       * initialized with the Amplify CLI.
       *
       * To enable pull request previews, set the `EnablePullRequestPreview` property to `true` .
       *
       * If you don't specify an environment, Amplify Hosting provides backend support for each
       * preview by automatically provisioning a temporary backend environment. Amplify deletes this
       * environment when the pull request is closed.
       *
       * For more information about creating backend environments, see [Feature Branch Deployments
       * and Team
       * Workflows](https://docs.aws.amazon.com/amplify/latest/userguide/multi-environments.html) in
       * the *AWS Amplify Hosting User Guide* .
       */
      override fun pullRequestEnvironmentName(pullRequestEnvironmentName: String) {
        cdkBuilder.pullRequestEnvironmentName(pullRequestEnvironmentName)
      }

      /**
       * @param stage Stage for the auto created branch.
       */
      override fun stage(stage: String) {
        cdkBuilder.stage(stage)
      }

      public fun build():
          software.amazon.awscdk.services.amplify.CfnApp.AutoBranchCreationConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.amplify.CfnApp.AutoBranchCreationConfigProperty,
    ) : CdkObject(cdkObject), AutoBranchCreationConfigProperty {
      /**
       * Automated branch creation glob patterns for the Amplify app.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-app-autobranchcreationconfig.html#cfn-amplify-app-autobranchcreationconfig-autobranchcreationpatterns)
       */
      override fun autoBranchCreationPatterns(): List<String> =
          unwrap(this).getAutoBranchCreationPatterns() ?: emptyList()

      /**
       * Sets password protection for your auto created branch.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-app-autobranchcreationconfig.html#cfn-amplify-app-autobranchcreationconfig-basicauthconfig)
       */
      override fun basicAuthConfig(): Any? = unwrap(this).getBasicAuthConfig()

      /**
       * The build specification (build spec) for the autocreated branch.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-app-autobranchcreationconfig.html#cfn-amplify-app-autobranchcreationconfig-buildspec)
       */
      override fun buildSpec(): String? = unwrap(this).getBuildSpec()

      /**
       * Enables automated branch creation for the Amplify app.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-app-autobranchcreationconfig.html#cfn-amplify-app-autobranchcreationconfig-enableautobranchcreation)
       */
      override fun enableAutoBranchCreation(): Any? = unwrap(this).getEnableAutoBranchCreation()

      /**
       * Enables auto building for the auto created branch.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-app-autobranchcreationconfig.html#cfn-amplify-app-autobranchcreationconfig-enableautobuild)
       */
      override fun enableAutoBuild(): Any? = unwrap(this).getEnableAutoBuild()

      /**
       * Enables performance mode for the branch.
       *
       * Performance mode optimizes for faster hosting performance by keeping content cached at the
       * edge for a longer interval. When performance mode is enabled, hosting configuration or code
       * changes can take up to 10 minutes to roll out.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-app-autobranchcreationconfig.html#cfn-amplify-app-autobranchcreationconfig-enableperformancemode)
       */
      override fun enablePerformanceMode(): Any? = unwrap(this).getEnablePerformanceMode()

      /**
       * Sets whether pull request previews are enabled for each branch that Amplify Hosting
       * automatically creates for your app.
       *
       * Amplify creates previews by deploying your app to a unique URL whenever a pull request is
       * opened for the branch. Development and QA teams can use this preview to test the pull request
       * before it's merged into a production or integration branch.
       *
       * To provide backend support for your preview, Amplify Hosting automatically provisions a
       * temporary backend environment that it deletes when the pull request is closed. If you want to
       * specify a dedicated backend environment for your previews, use the
       * `PullRequestEnvironmentName` property.
       *
       * For more information, see [Web
       * Previews](https://docs.aws.amazon.com/amplify/latest/userguide/pr-previews.html) in the *AWS
       * Amplify Hosting User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-app-autobranchcreationconfig.html#cfn-amplify-app-autobranchcreationconfig-enablepullrequestpreview)
       */
      override fun enablePullRequestPreview(): Any? = unwrap(this).getEnablePullRequestPreview()

      /**
       * Environment variables for the auto created branch.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-app-autobranchcreationconfig.html#cfn-amplify-app-autobranchcreationconfig-environmentvariables)
       */
      override fun environmentVariables(): Any? = unwrap(this).getEnvironmentVariables()

      /**
       * The framework for the autocreated branch.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-app-autobranchcreationconfig.html#cfn-amplify-app-autobranchcreationconfig-framework)
       */
      override fun framework(): String? = unwrap(this).getFramework()

      /**
       * If pull request previews are enabled, you can use this property to specify a dedicated
       * backend environment for your previews.
       *
       * For example, you could specify an environment named `prod` , `test` , or `dev` that you
       * initialized with the Amplify CLI.
       *
       * To enable pull request previews, set the `EnablePullRequestPreview` property to `true` .
       *
       * If you don't specify an environment, Amplify Hosting provides backend support for each
       * preview by automatically provisioning a temporary backend environment. Amplify deletes this
       * environment when the pull request is closed.
       *
       * For more information about creating backend environments, see [Feature Branch Deployments
       * and Team
       * Workflows](https://docs.aws.amazon.com/amplify/latest/userguide/multi-environments.html) in
       * the *AWS Amplify Hosting User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-app-autobranchcreationconfig.html#cfn-amplify-app-autobranchcreationconfig-pullrequestenvironmentname)
       */
      override fun pullRequestEnvironmentName(): String? =
          unwrap(this).getPullRequestEnvironmentName()

      /**
       * Stage for the auto created branch.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-app-autobranchcreationconfig.html#cfn-amplify-app-autobranchcreationconfig-stage)
       */
      override fun stage(): String? = unwrap(this).getStage()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AutoBranchCreationConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.amplify.CfnApp.AutoBranchCreationConfigProperty):
          AutoBranchCreationConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AutoBranchCreationConfigProperty):
          software.amazon.awscdk.services.amplify.CfnApp.AutoBranchCreationConfigProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.amplify.CfnApp.AutoBranchCreationConfigProperty
    }
  }

  public interface BasicAuthConfigProperty {
    /**
     * Enables basic authorization for the Amplify app's branches.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-app-basicauthconfig.html#cfn-amplify-app-basicauthconfig-enablebasicauth)
     */
    public fun enableBasicAuth(): Any? = unwrap(this).getEnableBasicAuth()

    /**
     * The password for basic authorization.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-app-basicauthconfig.html#cfn-amplify-app-basicauthconfig-password)
     */
    public fun password(): String? = unwrap(this).getPassword()

    /**
     * The user name for basic authorization.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-app-basicauthconfig.html#cfn-amplify-app-basicauthconfig-username)
     */
    public fun username(): String? = unwrap(this).getUsername()

    /**
     * A builder for [BasicAuthConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param enableBasicAuth Enables basic authorization for the Amplify app's branches.
       */
      public fun enableBasicAuth(enableBasicAuth: Boolean)

      /**
       * @param enableBasicAuth Enables basic authorization for the Amplify app's branches.
       */
      public fun enableBasicAuth(enableBasicAuth: IResolvable)

      /**
       * @param password The password for basic authorization.
       */
      public fun password(password: String)

      /**
       * @param username The user name for basic authorization.
       */
      public fun username(username: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.amplify.CfnApp.BasicAuthConfigProperty.Builder =
          software.amazon.awscdk.services.amplify.CfnApp.BasicAuthConfigProperty.builder()

      /**
       * @param enableBasicAuth Enables basic authorization for the Amplify app's branches.
       */
      override fun enableBasicAuth(enableBasicAuth: Boolean) {
        cdkBuilder.enableBasicAuth(enableBasicAuth)
      }

      /**
       * @param enableBasicAuth Enables basic authorization for the Amplify app's branches.
       */
      override fun enableBasicAuth(enableBasicAuth: IResolvable) {
        cdkBuilder.enableBasicAuth(enableBasicAuth.let(IResolvable::unwrap))
      }

      /**
       * @param password The password for basic authorization.
       */
      override fun password(password: String) {
        cdkBuilder.password(password)
      }

      /**
       * @param username The user name for basic authorization.
       */
      override fun username(username: String) {
        cdkBuilder.username(username)
      }

      public fun build(): software.amazon.awscdk.services.amplify.CfnApp.BasicAuthConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.amplify.CfnApp.BasicAuthConfigProperty,
    ) : CdkObject(cdkObject), BasicAuthConfigProperty {
      /**
       * Enables basic authorization for the Amplify app's branches.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-app-basicauthconfig.html#cfn-amplify-app-basicauthconfig-enablebasicauth)
       */
      override fun enableBasicAuth(): Any? = unwrap(this).getEnableBasicAuth()

      /**
       * The password for basic authorization.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-app-basicauthconfig.html#cfn-amplify-app-basicauthconfig-password)
       */
      override fun password(): String? = unwrap(this).getPassword()

      /**
       * The user name for basic authorization.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-app-basicauthconfig.html#cfn-amplify-app-basicauthconfig-username)
       */
      override fun username(): String? = unwrap(this).getUsername()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): BasicAuthConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.amplify.CfnApp.BasicAuthConfigProperty):
          BasicAuthConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BasicAuthConfigProperty):
          software.amazon.awscdk.services.amplify.CfnApp.BasicAuthConfigProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.amplify.CfnApp.BasicAuthConfigProperty
    }
  }
}
