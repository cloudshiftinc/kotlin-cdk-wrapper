@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.amplify

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnAppProps {
  public fun accessToken(): String? = unwrap(this).getAccessToken()

  public fun autoBranchCreationConfig(): Any? = unwrap(this).getAutoBranchCreationConfig()

  public fun basicAuthConfig(): Any? = unwrap(this).getBasicAuthConfig()

  public fun buildSpec(): String? = unwrap(this).getBuildSpec()

  public fun customHeaders(): String? = unwrap(this).getCustomHeaders()

  public fun customRules(): Any? = unwrap(this).getCustomRules()

  public fun description(): String? = unwrap(this).getDescription()

  public fun enableBranchAutoDeletion(): Any? = unwrap(this).getEnableBranchAutoDeletion()

  public fun environmentVariables(): Any? = unwrap(this).getEnvironmentVariables()

  public fun iamServiceRole(): String? = unwrap(this).getIamServiceRole()

  public fun name(): String

  public fun oauthToken(): String? = unwrap(this).getOauthToken()

  public fun platform(): String? = unwrap(this).getPlatform()

  public fun repository(): String? = unwrap(this).getRepository()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun accessToken(accessToken: String)

    public fun autoBranchCreationConfig(autoBranchCreationConfig: IResolvable)

    public
        fun autoBranchCreationConfig(autoBranchCreationConfig: CfnApp.AutoBranchCreationConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a1c56ccaf9feaaf1b12f4afd7974c51f702dcf6198fabfc1396eee5957703ddf")
    public
        fun autoBranchCreationConfig(autoBranchCreationConfig: CfnApp.AutoBranchCreationConfigProperty.Builder.() -> Unit)

    public fun basicAuthConfig(basicAuthConfig: IResolvable)

    public fun basicAuthConfig(basicAuthConfig: CfnApp.BasicAuthConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("59c32c4fcf172e49bf54b96dfb4425c22e856024e18dc48c53e0e1ef02714881")
    public fun basicAuthConfig(basicAuthConfig: CfnApp.BasicAuthConfigProperty.Builder.() -> Unit)

    public fun buildSpec(buildSpec: String)

    public fun customHeaders(customHeaders: String)

    public fun customRules(customRules: IResolvable)

    public fun customRules(customRules: List<Any>)

    public fun customRules(vararg customRules: Any)

    public fun description(description: String)

    public fun enableBranchAutoDeletion(enableBranchAutoDeletion: Boolean)

    public fun enableBranchAutoDeletion(enableBranchAutoDeletion: IResolvable)

    public fun environmentVariables(environmentVariables: IResolvable)

    public fun environmentVariables(environmentVariables: List<Any>)

    public fun environmentVariables(vararg environmentVariables: Any)

    public fun iamServiceRole(iamServiceRole: String)

    public fun name(name: String)

    public fun oauthToken(oauthToken: String)

    public fun platform(platform: String)

    public fun repository(repository: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.amplify.CfnAppProps.Builder =
        software.amazon.awscdk.services.amplify.CfnAppProps.builder()

    override fun accessToken(accessToken: String) {
      cdkBuilder.accessToken(accessToken)
    }

    override fun autoBranchCreationConfig(autoBranchCreationConfig: IResolvable) {
      cdkBuilder.autoBranchCreationConfig(autoBranchCreationConfig.let(IResolvable::unwrap))
    }

    override
        fun autoBranchCreationConfig(autoBranchCreationConfig: CfnApp.AutoBranchCreationConfigProperty) {
      cdkBuilder.autoBranchCreationConfig(autoBranchCreationConfig.let(CfnApp.AutoBranchCreationConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a1c56ccaf9feaaf1b12f4afd7974c51f702dcf6198fabfc1396eee5957703ddf")
    override
        fun autoBranchCreationConfig(autoBranchCreationConfig: CfnApp.AutoBranchCreationConfigProperty.Builder.() -> Unit):
        Unit =
        autoBranchCreationConfig(CfnApp.AutoBranchCreationConfigProperty(autoBranchCreationConfig))

    override fun basicAuthConfig(basicAuthConfig: IResolvable) {
      cdkBuilder.basicAuthConfig(basicAuthConfig.let(IResolvable::unwrap))
    }

    override fun basicAuthConfig(basicAuthConfig: CfnApp.BasicAuthConfigProperty) {
      cdkBuilder.basicAuthConfig(basicAuthConfig.let(CfnApp.BasicAuthConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("59c32c4fcf172e49bf54b96dfb4425c22e856024e18dc48c53e0e1ef02714881")
    override
        fun basicAuthConfig(basicAuthConfig: CfnApp.BasicAuthConfigProperty.Builder.() -> Unit):
        Unit = basicAuthConfig(CfnApp.BasicAuthConfigProperty(basicAuthConfig))

    override fun buildSpec(buildSpec: String) {
      cdkBuilder.buildSpec(buildSpec)
    }

    override fun customHeaders(customHeaders: String) {
      cdkBuilder.customHeaders(customHeaders)
    }

    override fun customRules(customRules: IResolvable) {
      cdkBuilder.customRules(customRules.let(IResolvable::unwrap))
    }

    override fun customRules(customRules: List<Any>) {
      cdkBuilder.customRules(customRules)
    }

    override fun customRules(vararg customRules: Any): Unit = customRules(customRules.toList())

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun enableBranchAutoDeletion(enableBranchAutoDeletion: Boolean) {
      cdkBuilder.enableBranchAutoDeletion(enableBranchAutoDeletion)
    }

    override fun enableBranchAutoDeletion(enableBranchAutoDeletion: IResolvable) {
      cdkBuilder.enableBranchAutoDeletion(enableBranchAutoDeletion.let(IResolvable::unwrap))
    }

    override fun environmentVariables(environmentVariables: IResolvable) {
      cdkBuilder.environmentVariables(environmentVariables.let(IResolvable::unwrap))
    }

    override fun environmentVariables(environmentVariables: List<Any>) {
      cdkBuilder.environmentVariables(environmentVariables)
    }

    override fun environmentVariables(vararg environmentVariables: Any): Unit =
        environmentVariables(environmentVariables.toList())

    override fun iamServiceRole(iamServiceRole: String) {
      cdkBuilder.iamServiceRole(iamServiceRole)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun oauthToken(oauthToken: String) {
      cdkBuilder.oauthToken(oauthToken)
    }

    override fun platform(platform: String) {
      cdkBuilder.platform(platform)
    }

    override fun repository(repository: String) {
      cdkBuilder.repository(repository)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.amplify.CfnAppProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.amplify.CfnAppProps,
  ) : CdkObject(cdkObject), CfnAppProps {
    override fun accessToken(): String? = unwrap(this).getAccessToken()

    override fun autoBranchCreationConfig(): Any? = unwrap(this).getAutoBranchCreationConfig()

    override fun basicAuthConfig(): Any? = unwrap(this).getBasicAuthConfig()

    override fun buildSpec(): String? = unwrap(this).getBuildSpec()

    override fun customHeaders(): String? = unwrap(this).getCustomHeaders()

    override fun customRules(): Any? = unwrap(this).getCustomRules()

    override fun description(): String? = unwrap(this).getDescription()

    override fun enableBranchAutoDeletion(): Any? = unwrap(this).getEnableBranchAutoDeletion()

    override fun environmentVariables(): Any? = unwrap(this).getEnvironmentVariables()

    override fun iamServiceRole(): String? = unwrap(this).getIamServiceRole()

    override fun name(): String = unwrap(this).getName()

    override fun oauthToken(): String? = unwrap(this).getOauthToken()

    override fun platform(): String? = unwrap(this).getPlatform()

    override fun repository(): String? = unwrap(this).getRepository()

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
