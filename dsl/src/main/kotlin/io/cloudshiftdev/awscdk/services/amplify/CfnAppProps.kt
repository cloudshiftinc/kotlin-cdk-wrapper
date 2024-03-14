package io.cloudshiftdev.awscdk.services.amplify

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnAppProps {
  /**
   * The personal access token for a GitHub repository for an Amplify app.
   *
   * The personal access token is used to authorize access to a GitHub repository using the Amplify
   * GitHub App. The token is not stored.
   *
   * Use `AccessToken` for GitHub repositories only. To authorize access to a repository provider
   * such as Bitbucket or CodeCommit, use `OauthToken` .
   *
   * You must specify either `AccessToken` or `OauthToken` when you create a new app.
   *
   * Existing Amplify apps deployed from a GitHub repository using OAuth continue to work with
   * CI/CD. However, we strongly recommend that you migrate these apps to use the GitHub App. For more
   * information, see [Migrating an existing OAuth app to the Amplify GitHub
   * App](https://docs.aws.amazon.com/amplify/latest/userguide/setting-up-GitHub-access.html#migrating-to-github-app-auth)
   * in the *Amplify User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-accesstoken)
   */
  public fun accessToken(): String? = unwrap(this).getAccessToken()

  /**
   * Sets the configuration for your automatic branch creation.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-autobranchcreationconfig)
   */
  public fun autoBranchCreationConfig(): Any? = unwrap(this).getAutoBranchCreationConfig()

  /**
   * The credentials for basic authorization for an Amplify app.
   *
   * You must base64-encode the authorization credentials and provide them in the format
   * `user:password` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-basicauthconfig)
   */
  public fun basicAuthConfig(): Any? = unwrap(this).getBasicAuthConfig()

  /**
   * The build specification (build spec) for an Amplify app.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-buildspec)
   */
  public fun buildSpec(): String? = unwrap(this).getBuildSpec()

  /**
   * The custom HTTP headers for an Amplify app.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-customheaders)
   */
  public fun customHeaders(): String? = unwrap(this).getCustomHeaders()

  /**
   * The custom rewrite and redirect rules for an Amplify app.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-customrules)
   */
  public fun customRules(): Any? = unwrap(this).getCustomRules()

  /**
   * The description of the Amplify app.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * Automatically disconnect a branch in Amplify Hosting when you delete a branch from your Git
   * repository.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-enablebranchautodeletion)
   */
  public fun enableBranchAutoDeletion(): Any? = unwrap(this).getEnableBranchAutoDeletion()

  /**
   * The environment variables map for an Amplify app.
   *
   * For a list of the environment variables that are accessible to Amplify by default, see [Amplify
   * Environment
   * variables](https://docs.aws.amazon.com/amplify/latest/userguide/amplify-console-environment-variables.html)
   * in the *Amplify Hosting User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-environmentvariables)
   */
  public fun environmentVariables(): Any? = unwrap(this).getEnvironmentVariables()

  /**
   * AWS Identity and Access Management ( IAM ) service role for the Amazon Resource Name (ARN) of
   * the Amplify app.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-iamservicerole)
   */
  public fun iamServiceRole(): String? = unwrap(this).getIamServiceRole()

  /**
   * The name of the Amplify app.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-name)
   */
  public fun name(): String

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
   * CI/CD. However, we strongly recommend that you migrate these apps to use the GitHub App. For more
   * information, see [Migrating an existing OAuth app to the Amplify GitHub
   * App](https://docs.aws.amazon.com/amplify/latest/userguide/setting-up-GitHub-access.html#migrating-to-github-app-auth)
   * in the *Amplify User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-oauthtoken)
   */
  public fun oauthToken(): String? = unwrap(this).getOauthToken()

  /**
   * The platform for the Amplify app.
   *
   * For a static app, set the platform type to `WEB` . For a dynamic server-side rendered (SSR)
   * app, set the platform type to `WEB_COMPUTE` . For an app requiring Amplify Hosting's original SSR
   * support only, set the platform type to `WEB_DYNAMIC` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-platform)
   */
  public fun platform(): String? = unwrap(this).getPlatform()

  /**
   * The Git repository for the Amplify app.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-repository)
   */
  public fun repository(): String? = unwrap(this).getRepository()

  /**
   * The tag for an Amplify app.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnAppProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param accessToken The personal access token for a GitHub repository for an Amplify app.
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
     */
    public fun accessToken(accessToken: String)

    /**
     * @param autoBranchCreationConfig Sets the configuration for your automatic branch creation.
     */
    public fun autoBranchCreationConfig(autoBranchCreationConfig: IResolvable)

    /**
     * @param autoBranchCreationConfig Sets the configuration for your automatic branch creation.
     */
    public
        fun autoBranchCreationConfig(autoBranchCreationConfig: CfnApp.AutoBranchCreationConfigProperty)

    /**
     * @param autoBranchCreationConfig Sets the configuration for your automatic branch creation.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a1c56ccaf9feaaf1b12f4afd7974c51f702dcf6198fabfc1396eee5957703ddf")
    public
        fun autoBranchCreationConfig(autoBranchCreationConfig: CfnApp.AutoBranchCreationConfigProperty.Builder.() -> Unit)

    /**
     * @param basicAuthConfig The credentials for basic authorization for an Amplify app.
     * You must base64-encode the authorization credentials and provide them in the format
     * `user:password` .
     */
    public fun basicAuthConfig(basicAuthConfig: IResolvable)

    /**
     * @param basicAuthConfig The credentials for basic authorization for an Amplify app.
     * You must base64-encode the authorization credentials and provide them in the format
     * `user:password` .
     */
    public fun basicAuthConfig(basicAuthConfig: CfnApp.BasicAuthConfigProperty)

    /**
     * @param basicAuthConfig The credentials for basic authorization for an Amplify app.
     * You must base64-encode the authorization credentials and provide them in the format
     * `user:password` .
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("59c32c4fcf172e49bf54b96dfb4425c22e856024e18dc48c53e0e1ef02714881")
    public fun basicAuthConfig(basicAuthConfig: CfnApp.BasicAuthConfigProperty.Builder.() -> Unit)

    /**
     * @param buildSpec The build specification (build spec) for an Amplify app.
     */
    public fun buildSpec(buildSpec: String)

    /**
     * @param customHeaders The custom HTTP headers for an Amplify app.
     */
    public fun customHeaders(customHeaders: String)

    /**
     * @param customRules The custom rewrite and redirect rules for an Amplify app.
     */
    public fun customRules(customRules: IResolvable)

    /**
     * @param customRules The custom rewrite and redirect rules for an Amplify app.
     */
    public fun customRules(customRules: List<Any>)

    /**
     * @param customRules The custom rewrite and redirect rules for an Amplify app.
     */
    public fun customRules(vararg customRules: Any)

    /**
     * @param description The description of the Amplify app.
     */
    public fun description(description: String)

    /**
     * @param enableBranchAutoDeletion Automatically disconnect a branch in Amplify Hosting when you
     * delete a branch from your Git repository.
     */
    public fun enableBranchAutoDeletion(enableBranchAutoDeletion: Boolean)

    /**
     * @param enableBranchAutoDeletion Automatically disconnect a branch in Amplify Hosting when you
     * delete a branch from your Git repository.
     */
    public fun enableBranchAutoDeletion(enableBranchAutoDeletion: IResolvable)

    /**
     * @param environmentVariables The environment variables map for an Amplify app.
     * For a list of the environment variables that are accessible to Amplify by default, see
     * [Amplify Environment
     * variables](https://docs.aws.amazon.com/amplify/latest/userguide/amplify-console-environment-variables.html)
     * in the *Amplify Hosting User Guide* .
     */
    public fun environmentVariables(environmentVariables: IResolvable)

    /**
     * @param environmentVariables The environment variables map for an Amplify app.
     * For a list of the environment variables that are accessible to Amplify by default, see
     * [Amplify Environment
     * variables](https://docs.aws.amazon.com/amplify/latest/userguide/amplify-console-environment-variables.html)
     * in the *Amplify Hosting User Guide* .
     */
    public fun environmentVariables(environmentVariables: List<Any>)

    /**
     * @param environmentVariables The environment variables map for an Amplify app.
     * For a list of the environment variables that are accessible to Amplify by default, see
     * [Amplify Environment
     * variables](https://docs.aws.amazon.com/amplify/latest/userguide/amplify-console-environment-variables.html)
     * in the *Amplify Hosting User Guide* .
     */
    public fun environmentVariables(vararg environmentVariables: Any)

    /**
     * @param iamServiceRole AWS Identity and Access Management ( IAM ) service role for the Amazon
     * Resource Name (ARN) of the Amplify app.
     */
    public fun iamServiceRole(iamServiceRole: String)

    /**
     * @param name The name of the Amplify app. 
     */
    public fun name(name: String)

    /**
     * @param oauthToken The OAuth token for a third-party source control system for an Amplify app.
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
     */
    public fun oauthToken(oauthToken: String)

    /**
     * @param platform The platform for the Amplify app.
     * For a static app, set the platform type to `WEB` . For a dynamic server-side rendered (SSR)
     * app, set the platform type to `WEB_COMPUTE` . For an app requiring Amplify Hosting's original
     * SSR support only, set the platform type to `WEB_DYNAMIC` .
     */
    public fun platform(platform: String)

    /**
     * @param repository The Git repository for the Amplify app.
     */
    public fun repository(repository: String)

    /**
     * @param tags The tag for an Amplify app.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tag for an Amplify app.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.amplify.CfnAppProps.Builder =
        software.amazon.awscdk.services.amplify.CfnAppProps.builder()

    /**
     * @param accessToken The personal access token for a GitHub repository for an Amplify app.
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
     */
    override fun accessToken(accessToken: String) {
      cdkBuilder.accessToken(accessToken)
    }

    /**
     * @param autoBranchCreationConfig Sets the configuration for your automatic branch creation.
     */
    override fun autoBranchCreationConfig(autoBranchCreationConfig: IResolvable) {
      cdkBuilder.autoBranchCreationConfig(autoBranchCreationConfig.let(IResolvable::unwrap))
    }

    /**
     * @param autoBranchCreationConfig Sets the configuration for your automatic branch creation.
     */
    override
        fun autoBranchCreationConfig(autoBranchCreationConfig: CfnApp.AutoBranchCreationConfigProperty) {
      cdkBuilder.autoBranchCreationConfig(autoBranchCreationConfig.let(CfnApp.AutoBranchCreationConfigProperty::unwrap))
    }

    /**
     * @param autoBranchCreationConfig Sets the configuration for your automatic branch creation.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a1c56ccaf9feaaf1b12f4afd7974c51f702dcf6198fabfc1396eee5957703ddf")
    override
        fun autoBranchCreationConfig(autoBranchCreationConfig: CfnApp.AutoBranchCreationConfigProperty.Builder.() -> Unit):
        Unit =
        autoBranchCreationConfig(CfnApp.AutoBranchCreationConfigProperty(autoBranchCreationConfig))

    /**
     * @param basicAuthConfig The credentials for basic authorization for an Amplify app.
     * You must base64-encode the authorization credentials and provide them in the format
     * `user:password` .
     */
    override fun basicAuthConfig(basicAuthConfig: IResolvable) {
      cdkBuilder.basicAuthConfig(basicAuthConfig.let(IResolvable::unwrap))
    }

    /**
     * @param basicAuthConfig The credentials for basic authorization for an Amplify app.
     * You must base64-encode the authorization credentials and provide them in the format
     * `user:password` .
     */
    override fun basicAuthConfig(basicAuthConfig: CfnApp.BasicAuthConfigProperty) {
      cdkBuilder.basicAuthConfig(basicAuthConfig.let(CfnApp.BasicAuthConfigProperty::unwrap))
    }

    /**
     * @param basicAuthConfig The credentials for basic authorization for an Amplify app.
     * You must base64-encode the authorization credentials and provide them in the format
     * `user:password` .
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("59c32c4fcf172e49bf54b96dfb4425c22e856024e18dc48c53e0e1ef02714881")
    override
        fun basicAuthConfig(basicAuthConfig: CfnApp.BasicAuthConfigProperty.Builder.() -> Unit):
        Unit = basicAuthConfig(CfnApp.BasicAuthConfigProperty(basicAuthConfig))

    /**
     * @param buildSpec The build specification (build spec) for an Amplify app.
     */
    override fun buildSpec(buildSpec: String) {
      cdkBuilder.buildSpec(buildSpec)
    }

    /**
     * @param customHeaders The custom HTTP headers for an Amplify app.
     */
    override fun customHeaders(customHeaders: String) {
      cdkBuilder.customHeaders(customHeaders)
    }

    /**
     * @param customRules The custom rewrite and redirect rules for an Amplify app.
     */
    override fun customRules(customRules: IResolvable) {
      cdkBuilder.customRules(customRules.let(IResolvable::unwrap))
    }

    /**
     * @param customRules The custom rewrite and redirect rules for an Amplify app.
     */
    override fun customRules(customRules: List<Any>) {
      cdkBuilder.customRules(customRules)
    }

    /**
     * @param customRules The custom rewrite and redirect rules for an Amplify app.
     */
    override fun customRules(vararg customRules: Any): Unit = customRules(customRules.toList())

    /**
     * @param description The description of the Amplify app.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param enableBranchAutoDeletion Automatically disconnect a branch in Amplify Hosting when you
     * delete a branch from your Git repository.
     */
    override fun enableBranchAutoDeletion(enableBranchAutoDeletion: Boolean) {
      cdkBuilder.enableBranchAutoDeletion(enableBranchAutoDeletion)
    }

    /**
     * @param enableBranchAutoDeletion Automatically disconnect a branch in Amplify Hosting when you
     * delete a branch from your Git repository.
     */
    override fun enableBranchAutoDeletion(enableBranchAutoDeletion: IResolvable) {
      cdkBuilder.enableBranchAutoDeletion(enableBranchAutoDeletion.let(IResolvable::unwrap))
    }

    /**
     * @param environmentVariables The environment variables map for an Amplify app.
     * For a list of the environment variables that are accessible to Amplify by default, see
     * [Amplify Environment
     * variables](https://docs.aws.amazon.com/amplify/latest/userguide/amplify-console-environment-variables.html)
     * in the *Amplify Hosting User Guide* .
     */
    override fun environmentVariables(environmentVariables: IResolvable) {
      cdkBuilder.environmentVariables(environmentVariables.let(IResolvable::unwrap))
    }

    /**
     * @param environmentVariables The environment variables map for an Amplify app.
     * For a list of the environment variables that are accessible to Amplify by default, see
     * [Amplify Environment
     * variables](https://docs.aws.amazon.com/amplify/latest/userguide/amplify-console-environment-variables.html)
     * in the *Amplify Hosting User Guide* .
     */
    override fun environmentVariables(environmentVariables: List<Any>) {
      cdkBuilder.environmentVariables(environmentVariables)
    }

    /**
     * @param environmentVariables The environment variables map for an Amplify app.
     * For a list of the environment variables that are accessible to Amplify by default, see
     * [Amplify Environment
     * variables](https://docs.aws.amazon.com/amplify/latest/userguide/amplify-console-environment-variables.html)
     * in the *Amplify Hosting User Guide* .
     */
    override fun environmentVariables(vararg environmentVariables: Any): Unit =
        environmentVariables(environmentVariables.toList())

    /**
     * @param iamServiceRole AWS Identity and Access Management ( IAM ) service role for the Amazon
     * Resource Name (ARN) of the Amplify app.
     */
    override fun iamServiceRole(iamServiceRole: String) {
      cdkBuilder.iamServiceRole(iamServiceRole)
    }

    /**
     * @param name The name of the Amplify app. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param oauthToken The OAuth token for a third-party source control system for an Amplify app.
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
     */
    override fun oauthToken(oauthToken: String) {
      cdkBuilder.oauthToken(oauthToken)
    }

    /**
     * @param platform The platform for the Amplify app.
     * For a static app, set the platform type to `WEB` . For a dynamic server-side rendered (SSR)
     * app, set the platform type to `WEB_COMPUTE` . For an app requiring Amplify Hosting's original
     * SSR support only, set the platform type to `WEB_DYNAMIC` .
     */
    override fun platform(platform: String) {
      cdkBuilder.platform(platform)
    }

    /**
     * @param repository The Git repository for the Amplify app.
     */
    override fun repository(repository: String) {
      cdkBuilder.repository(repository)
    }

    /**
     * @param tags The tag for an Amplify app.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags The tag for an Amplify app.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.amplify.CfnAppProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.amplify.CfnAppProps,
  ) : CdkObject(cdkObject), CfnAppProps {
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
     */
    override fun accessToken(): String? = unwrap(this).getAccessToken()

    /**
     * Sets the configuration for your automatic branch creation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-autobranchcreationconfig)
     */
    override fun autoBranchCreationConfig(): Any? = unwrap(this).getAutoBranchCreationConfig()

    /**
     * The credentials for basic authorization for an Amplify app.
     *
     * You must base64-encode the authorization credentials and provide them in the format
     * `user:password` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-basicauthconfig)
     */
    override fun basicAuthConfig(): Any? = unwrap(this).getBasicAuthConfig()

    /**
     * The build specification (build spec) for an Amplify app.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-buildspec)
     */
    override fun buildSpec(): String? = unwrap(this).getBuildSpec()

    /**
     * The custom HTTP headers for an Amplify app.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-customheaders)
     */
    override fun customHeaders(): String? = unwrap(this).getCustomHeaders()

    /**
     * The custom rewrite and redirect rules for an Amplify app.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-customrules)
     */
    override fun customRules(): Any? = unwrap(this).getCustomRules()

    /**
     * The description of the Amplify app.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * Automatically disconnect a branch in Amplify Hosting when you delete a branch from your Git
     * repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-enablebranchautodeletion)
     */
    override fun enableBranchAutoDeletion(): Any? = unwrap(this).getEnableBranchAutoDeletion()

    /**
     * The environment variables map for an Amplify app.
     *
     * For a list of the environment variables that are accessible to Amplify by default, see
     * [Amplify Environment
     * variables](https://docs.aws.amazon.com/amplify/latest/userguide/amplify-console-environment-variables.html)
     * in the *Amplify Hosting User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-environmentvariables)
     */
    override fun environmentVariables(): Any? = unwrap(this).getEnvironmentVariables()

    /**
     * AWS Identity and Access Management ( IAM ) service role for the Amazon Resource Name (ARN) of
     * the Amplify app.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-iamservicerole)
     */
    override fun iamServiceRole(): String? = unwrap(this).getIamServiceRole()

    /**
     * The name of the Amplify app.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-name)
     */
    override fun name(): String = unwrap(this).getName()

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
     */
    override fun oauthToken(): String? = unwrap(this).getOauthToken()

    /**
     * The platform for the Amplify app.
     *
     * For a static app, set the platform type to `WEB` . For a dynamic server-side rendered (SSR)
     * app, set the platform type to `WEB_COMPUTE` . For an app requiring Amplify Hosting's original
     * SSR support only, set the platform type to `WEB_DYNAMIC` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-platform)
     */
    override fun platform(): String? = unwrap(this).getPlatform()

    /**
     * The Git repository for the Amplify app.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-repository)
     */
    override fun repository(): String? = unwrap(this).getRepository()

    /**
     * The tag for an Amplify app.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAppProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.amplify.CfnAppProps): CfnAppProps =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAppProps): software.amazon.awscdk.services.amplify.CfnAppProps =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.amplify.CfnAppProps
  }
}
