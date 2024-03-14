package io.cloudshiftdev.awscdk.services.amplify

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
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
  private val cdkObject: software.amazon.awscdk.services.amplify.CfnApp,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun accessToken(): String? = unwrap(this).getAccessToken()

  public open fun accessToken(`value`: String) {
    unwrap(this).setAccessToken(`value`)
  }

  public open fun attrAppId(): String = unwrap(this).getAttrAppId()

  public open fun attrAppName(): String = unwrap(this).getAttrAppName()

  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrDefaultDomain(): String = unwrap(this).getAttrDefaultDomain()

  public open fun autoBranchCreationConfig(): Any? = unwrap(this).getAutoBranchCreationConfig()

  public open fun autoBranchCreationConfig(`value`: IResolvable) {
    unwrap(this).setAutoBranchCreationConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun autoBranchCreationConfig(`value`: AutoBranchCreationConfigProperty) {
    unwrap(this).setAutoBranchCreationConfig(`value`.let(AutoBranchCreationConfigProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("72b5a78e0c2178a9932563a9b0a1b34747ce212371b55c1fe8604af2cec752ea")
  public open
      fun autoBranchCreationConfig(`value`: AutoBranchCreationConfigProperty.Builder.() -> Unit):
      Unit = autoBranchCreationConfig(AutoBranchCreationConfigProperty(`value`))

  public open fun basicAuthConfig(): Any? = unwrap(this).getBasicAuthConfig()

  public open fun basicAuthConfig(`value`: IResolvable) {
    unwrap(this).setBasicAuthConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun basicAuthConfig(`value`: BasicAuthConfigProperty) {
    unwrap(this).setBasicAuthConfig(`value`.let(BasicAuthConfigProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("048ebf837e309052ce3d36879708e0c4bf8f731ffaab5fe3dc552721e567b98a")
  public open fun basicAuthConfig(`value`: BasicAuthConfigProperty.Builder.() -> Unit): Unit =
      basicAuthConfig(BasicAuthConfigProperty(`value`))

  public open fun buildSpec(): String? = unwrap(this).getBuildSpec()

  public open fun buildSpec(`value`: String) {
    unwrap(this).setBuildSpec(`value`)
  }

  public open fun customHeaders(): String? = unwrap(this).getCustomHeaders()

  public open fun customHeaders(`value`: String) {
    unwrap(this).setCustomHeaders(`value`)
  }

  public open fun customRules(): Any? = unwrap(this).getCustomRules()

  public open fun customRules(`value`: IResolvable) {
    unwrap(this).setCustomRules(`value`.let(IResolvable::unwrap))
  }

  public open fun customRules(__idx_ac66f0: List<Any>) {
    unwrap(this).setCustomRules(__idx_ac66f0)
  }

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun enableBranchAutoDeletion(): Any? = unwrap(this).getEnableBranchAutoDeletion()

  public open fun enableBranchAutoDeletion(`value`: Boolean) {
    unwrap(this).setEnableBranchAutoDeletion(`value`)
  }

  public open fun enableBranchAutoDeletion(`value`: IResolvable) {
    unwrap(this).setEnableBranchAutoDeletion(`value`.let(IResolvable::unwrap))
  }

  public open fun environmentVariables(): Any? = unwrap(this).getEnvironmentVariables()

  public open fun environmentVariables(`value`: IResolvable) {
    unwrap(this).setEnvironmentVariables(`value`.let(IResolvable::unwrap))
  }

  public open fun environmentVariables(__idx_ac66f0: List<Any>) {
    unwrap(this).setEnvironmentVariables(__idx_ac66f0)
  }

  public open fun iamServiceRole(): String? = unwrap(this).getIamServiceRole()

  public open fun iamServiceRole(`value`: String) {
    unwrap(this).setIamServiceRole(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun oauthToken(): String? = unwrap(this).getOauthToken()

  public open fun oauthToken(`value`: String) {
    unwrap(this).setOauthToken(`value`)
  }

  public open fun platform(): String? = unwrap(this).getPlatform()

  public open fun platform(`value`: String) {
    unwrap(this).setPlatform(`value`)
  }

  public open fun repository(): String? = unwrap(this).getRepository()

  public open fun repository(`value`: String) {
    unwrap(this).setRepository(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun accessToken(accessToken: String) {
    }

    public fun autoBranchCreationConfig(autoBranchCreationConfig: IResolvable) {
    }

    public
        fun autoBranchCreationConfig(autoBranchCreationConfig: AutoBranchCreationConfigProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("caac41c0f554cf7f4b9a46c5f6ccaf09ede47a48e86652f05eeb750602591070")
    public
        fun autoBranchCreationConfig(autoBranchCreationConfig: AutoBranchCreationConfigProperty.Builder.() -> Unit) {
    }

    public fun basicAuthConfig(basicAuthConfig: IResolvable) {
    }

    public fun basicAuthConfig(basicAuthConfig: BasicAuthConfigProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("70412e491fd213efa06ca1dacddccd8c03669eff817a156e12cf1f84344cb5be")
    public fun basicAuthConfig(basicAuthConfig: BasicAuthConfigProperty.Builder.() -> Unit) {
    }

    public fun buildSpec(buildSpec: String) {
    }

    public fun customHeaders(customHeaders: String) {
    }

    public fun customRules(customRules: IResolvable) {
    }

    public fun customRules(customRules: List<Any>) {
    }

    public fun description(description: String) {
    }

    public fun enableBranchAutoDeletion(enableBranchAutoDeletion: Boolean) {
    }

    public fun enableBranchAutoDeletion(enableBranchAutoDeletion: IResolvable) {
    }

    public fun environmentVariables(environmentVariables: IResolvable) {
    }

    public fun environmentVariables(environmentVariables: List<Any>) {
    }

    public fun iamServiceRole(iamServiceRole: String) {
    }

    public fun name(name: String) {
    }

    public fun oauthToken(oauthToken: String) {
    }

    public fun platform(platform: String) {
    }

    public fun repository(repository: String) {
    }

    public fun tags(tags: List<CfnTag>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.amplify.CfnApp.Builder =
        software.amazon.awscdk.services.amplify.CfnApp.Builder.create(scope, id)

    public override fun accessToken(accessToken: String) {
      cdkBuilder.accessToken(accessToken)
    }

    public override fun autoBranchCreationConfig(autoBranchCreationConfig: IResolvable) {
      cdkBuilder.autoBranchCreationConfig(autoBranchCreationConfig.let(IResolvable::unwrap))
    }

    public override
        fun autoBranchCreationConfig(autoBranchCreationConfig: AutoBranchCreationConfigProperty) {
      cdkBuilder.autoBranchCreationConfig(autoBranchCreationConfig.let(AutoBranchCreationConfigProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("caac41c0f554cf7f4b9a46c5f6ccaf09ede47a48e86652f05eeb750602591070")
    public override
        fun autoBranchCreationConfig(autoBranchCreationConfig: AutoBranchCreationConfigProperty.Builder.() -> Unit):
        Unit = autoBranchCreationConfig(AutoBranchCreationConfigProperty(autoBranchCreationConfig))

    public override fun basicAuthConfig(basicAuthConfig: IResolvable) {
      cdkBuilder.basicAuthConfig(basicAuthConfig.let(IResolvable::unwrap))
    }

    public override fun basicAuthConfig(basicAuthConfig: BasicAuthConfigProperty) {
      cdkBuilder.basicAuthConfig(basicAuthConfig.let(BasicAuthConfigProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("70412e491fd213efa06ca1dacddccd8c03669eff817a156e12cf1f84344cb5be")
    public override
        fun basicAuthConfig(basicAuthConfig: BasicAuthConfigProperty.Builder.() -> Unit): Unit =
        basicAuthConfig(BasicAuthConfigProperty(basicAuthConfig))

    public override fun buildSpec(buildSpec: String) {
      cdkBuilder.buildSpec(buildSpec)
    }

    public override fun customHeaders(customHeaders: String) {
      cdkBuilder.customHeaders(customHeaders)
    }

    public override fun customRules(customRules: IResolvable) {
      cdkBuilder.customRules(customRules.let(IResolvable::unwrap))
    }

    public override fun customRules(customRules: List<Any>) {
      cdkBuilder.customRules(customRules)
    }

    public override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public override fun enableBranchAutoDeletion(enableBranchAutoDeletion: Boolean) {
      cdkBuilder.enableBranchAutoDeletion(enableBranchAutoDeletion)
    }

    public override fun enableBranchAutoDeletion(enableBranchAutoDeletion: IResolvable) {
      cdkBuilder.enableBranchAutoDeletion(enableBranchAutoDeletion.let(IResolvable::unwrap))
    }

    public override fun environmentVariables(environmentVariables: IResolvable) {
      cdkBuilder.environmentVariables(environmentVariables.let(IResolvable::unwrap))
    }

    public override fun environmentVariables(environmentVariables: List<Any>) {
      cdkBuilder.environmentVariables(environmentVariables)
    }

    public override fun iamServiceRole(iamServiceRole: String) {
      cdkBuilder.iamServiceRole(iamServiceRole)
    }

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public override fun oauthToken(oauthToken: String) {
      cdkBuilder.oauthToken(oauthToken)
    }

    public override fun platform(platform: String) {
      cdkBuilder.platform(platform)
    }

    public override fun repository(repository: String) {
      cdkBuilder.repository(repository)
    }

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.amplify.CfnApp = cdkBuilder.build()
  }

  public companion object {
    init {

    }

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
    public fun name(): String

    public fun `value`(): String

    public interface Builder {
      public fun name(name: String) {
      }

      public fun `value`(`value`: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.amplify.CfnApp.EnvironmentVariableProperty.Builder =
          software.amazon.awscdk.services.amplify.CfnApp.EnvironmentVariableProperty.builder()

      public override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.amplify.CfnApp.EnvironmentVariableProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.amplify.CfnApp.EnvironmentVariableProperty,
    ) : EnvironmentVariableProperty {
      public override fun name(): String = unwrap(this).getName()

      public override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EnvironmentVariableProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.amplify.CfnApp.EnvironmentVariableProperty):
          EnvironmentVariableProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EnvironmentVariableProperty):
          software.amazon.awscdk.services.amplify.CfnApp.EnvironmentVariableProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface CustomRuleProperty {
    public fun condition(): String? = unwrap(this).getCondition()

    public fun source(): String

    public fun status(): String? = unwrap(this).getStatus()

    public fun target(): String

    public interface Builder {
      public fun condition(condition: String) {
      }

      public fun source(source: String) {
      }

      public fun status(status: String) {
      }

      public fun target(target: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.amplify.CfnApp.CustomRuleProperty.Builder =
          software.amazon.awscdk.services.amplify.CfnApp.CustomRuleProperty.builder()

      public override fun condition(condition: String) {
        cdkBuilder.condition(condition)
      }

      public override fun source(source: String) {
        cdkBuilder.source(source)
      }

      public override fun status(status: String) {
        cdkBuilder.status(status)
      }

      public override fun target(target: String) {
        cdkBuilder.target(target)
      }

      public fun build(): software.amazon.awscdk.services.amplify.CfnApp.CustomRuleProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.amplify.CfnApp.CustomRuleProperty,
    ) : CustomRuleProperty {
      public override fun condition(): String? = unwrap(this).getCondition()

      public override fun source(): String = unwrap(this).getSource()

      public override fun status(): String? = unwrap(this).getStatus()

      public override fun target(): String = unwrap(this).getTarget()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CustomRuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.amplify.CfnApp.CustomRuleProperty):
          CustomRuleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CustomRuleProperty):
          software.amazon.awscdk.services.amplify.CfnApp.CustomRuleProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface AutoBranchCreationConfigProperty {
    public fun autoBranchCreationPatterns(): List<String> =
        unwrap(this).getAutoBranchCreationPatterns() ?: emptyList()

    public fun basicAuthConfig(): Any? = unwrap(this).getBasicAuthConfig()

    public fun buildSpec(): String? = unwrap(this).getBuildSpec()

    public fun enableAutoBranchCreation(): Any? = unwrap(this).getEnableAutoBranchCreation()

    public fun enableAutoBuild(): Any? = unwrap(this).getEnableAutoBuild()

    public fun enablePerformanceMode(): Any? = unwrap(this).getEnablePerformanceMode()

    public fun enablePullRequestPreview(): Any? = unwrap(this).getEnablePullRequestPreview()

    public fun environmentVariables(): Any? = unwrap(this).getEnvironmentVariables()

    public fun framework(): String? = unwrap(this).getFramework()

    public fun pullRequestEnvironmentName(): String? = unwrap(this).getPullRequestEnvironmentName()

    public fun stage(): String? = unwrap(this).getStage()

    public interface Builder {
      public fun autoBranchCreationPatterns(autoBranchCreationPatterns: List<String>) {
      }

      public fun basicAuthConfig(basicAuthConfig: IResolvable) {
      }

      public fun basicAuthConfig(basicAuthConfig: BasicAuthConfigProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ddf458e62f1a42fa2f5bc13e21b25d23030ef08e42b73057b7c2980f3807d3b0")
      public fun basicAuthConfig(basicAuthConfig: BasicAuthConfigProperty.Builder.() -> Unit) {
      }

      public fun buildSpec(buildSpec: String) {
      }

      public fun enableAutoBranchCreation(enableAutoBranchCreation: Boolean) {
      }

      public fun enableAutoBranchCreation(enableAutoBranchCreation: IResolvable) {
      }

      public fun enableAutoBuild(enableAutoBuild: Boolean) {
      }

      public fun enableAutoBuild(enableAutoBuild: IResolvable) {
      }

      public fun enablePerformanceMode(enablePerformanceMode: Boolean) {
      }

      public fun enablePerformanceMode(enablePerformanceMode: IResolvable) {
      }

      public fun enablePullRequestPreview(enablePullRequestPreview: Boolean) {
      }

      public fun enablePullRequestPreview(enablePullRequestPreview: IResolvable) {
      }

      public fun environmentVariables(environmentVariables: IResolvable) {
      }

      public fun environmentVariables(environmentVariables: List<Any>) {
      }

      public fun framework(framework: String) {
      }

      public fun pullRequestEnvironmentName(pullRequestEnvironmentName: String) {
      }

      public fun stage(stage: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.amplify.CfnApp.AutoBranchCreationConfigProperty.Builder =
          software.amazon.awscdk.services.amplify.CfnApp.AutoBranchCreationConfigProperty.builder()

      public override fun autoBranchCreationPatterns(autoBranchCreationPatterns: List<String>) {
        cdkBuilder.autoBranchCreationPatterns(autoBranchCreationPatterns)
      }

      public override fun basicAuthConfig(basicAuthConfig: IResolvable) {
        cdkBuilder.basicAuthConfig(basicAuthConfig.let(IResolvable::unwrap))
      }

      public override fun basicAuthConfig(basicAuthConfig: BasicAuthConfigProperty) {
        cdkBuilder.basicAuthConfig(basicAuthConfig.let(BasicAuthConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ddf458e62f1a42fa2f5bc13e21b25d23030ef08e42b73057b7c2980f3807d3b0")
      public override
          fun basicAuthConfig(basicAuthConfig: BasicAuthConfigProperty.Builder.() -> Unit): Unit =
          basicAuthConfig(BasicAuthConfigProperty(basicAuthConfig))

      public override fun buildSpec(buildSpec: String) {
        cdkBuilder.buildSpec(buildSpec)
      }

      public override fun enableAutoBranchCreation(enableAutoBranchCreation: Boolean) {
        cdkBuilder.enableAutoBranchCreation(enableAutoBranchCreation)
      }

      public override fun enableAutoBranchCreation(enableAutoBranchCreation: IResolvable) {
        cdkBuilder.enableAutoBranchCreation(enableAutoBranchCreation.let(IResolvable::unwrap))
      }

      public override fun enableAutoBuild(enableAutoBuild: Boolean) {
        cdkBuilder.enableAutoBuild(enableAutoBuild)
      }

      public override fun enableAutoBuild(enableAutoBuild: IResolvable) {
        cdkBuilder.enableAutoBuild(enableAutoBuild.let(IResolvable::unwrap))
      }

      public override fun enablePerformanceMode(enablePerformanceMode: Boolean) {
        cdkBuilder.enablePerformanceMode(enablePerformanceMode)
      }

      public override fun enablePerformanceMode(enablePerformanceMode: IResolvable) {
        cdkBuilder.enablePerformanceMode(enablePerformanceMode.let(IResolvable::unwrap))
      }

      public override fun enablePullRequestPreview(enablePullRequestPreview: Boolean) {
        cdkBuilder.enablePullRequestPreview(enablePullRequestPreview)
      }

      public override fun enablePullRequestPreview(enablePullRequestPreview: IResolvable) {
        cdkBuilder.enablePullRequestPreview(enablePullRequestPreview.let(IResolvable::unwrap))
      }

      public override fun environmentVariables(environmentVariables: IResolvable) {
        cdkBuilder.environmentVariables(environmentVariables.let(IResolvable::unwrap))
      }

      public override fun environmentVariables(environmentVariables: List<Any>) {
        cdkBuilder.environmentVariables(environmentVariables)
      }

      public override fun framework(framework: String) {
        cdkBuilder.framework(framework)
      }

      public override fun pullRequestEnvironmentName(pullRequestEnvironmentName: String) {
        cdkBuilder.pullRequestEnvironmentName(pullRequestEnvironmentName)
      }

      public override fun stage(stage: String) {
        cdkBuilder.stage(stage)
      }

      public fun build():
          software.amazon.awscdk.services.amplify.CfnApp.AutoBranchCreationConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.amplify.CfnApp.AutoBranchCreationConfigProperty,
    ) : AutoBranchCreationConfigProperty {
      public override fun autoBranchCreationPatterns(): List<String> =
          unwrap(this).getAutoBranchCreationPatterns() ?: emptyList()

      public override fun basicAuthConfig(): Any? = unwrap(this).getBasicAuthConfig()

      public override fun buildSpec(): String? = unwrap(this).getBuildSpec()

      public override fun enableAutoBranchCreation(): Any? =
          unwrap(this).getEnableAutoBranchCreation()

      public override fun enableAutoBuild(): Any? = unwrap(this).getEnableAutoBuild()

      public override fun enablePerformanceMode(): Any? = unwrap(this).getEnablePerformanceMode()

      public override fun enablePullRequestPreview(): Any? =
          unwrap(this).getEnablePullRequestPreview()

      public override fun environmentVariables(): Any? = unwrap(this).getEnvironmentVariables()

      public override fun framework(): String? = unwrap(this).getFramework()

      public override fun pullRequestEnvironmentName(): String? =
          unwrap(this).getPullRequestEnvironmentName()

      public override fun stage(): String? = unwrap(this).getStage()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AutoBranchCreationConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.amplify.CfnApp.AutoBranchCreationConfigProperty):
          AutoBranchCreationConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AutoBranchCreationConfigProperty):
          software.amazon.awscdk.services.amplify.CfnApp.AutoBranchCreationConfigProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface BasicAuthConfigProperty {
    public fun enableBasicAuth(): Any? = unwrap(this).getEnableBasicAuth()

    public fun password(): String? = unwrap(this).getPassword()

    public fun username(): String? = unwrap(this).getUsername()

    public interface Builder {
      public fun enableBasicAuth(enableBasicAuth: Boolean) {
      }

      public fun enableBasicAuth(enableBasicAuth: IResolvable) {
      }

      public fun password(password: String) {
      }

      public fun username(username: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.amplify.CfnApp.BasicAuthConfigProperty.Builder =
          software.amazon.awscdk.services.amplify.CfnApp.BasicAuthConfigProperty.builder()

      public override fun enableBasicAuth(enableBasicAuth: Boolean) {
        cdkBuilder.enableBasicAuth(enableBasicAuth)
      }

      public override fun enableBasicAuth(enableBasicAuth: IResolvable) {
        cdkBuilder.enableBasicAuth(enableBasicAuth.let(IResolvable::unwrap))
      }

      public override fun password(password: String) {
        cdkBuilder.password(password)
      }

      public override fun username(username: String) {
        cdkBuilder.username(username)
      }

      public fun build(): software.amazon.awscdk.services.amplify.CfnApp.BasicAuthConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.amplify.CfnApp.BasicAuthConfigProperty,
    ) : BasicAuthConfigProperty {
      public override fun enableBasicAuth(): Any? = unwrap(this).getEnableBasicAuth()

      public override fun password(): String? = unwrap(this).getPassword()

      public override fun username(): String? = unwrap(this).getUsername()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): BasicAuthConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.amplify.CfnApp.BasicAuthConfigProperty):
          BasicAuthConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BasicAuthConfigProperty):
          software.amazon.awscdk.services.amplify.CfnApp.BasicAuthConfigProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
