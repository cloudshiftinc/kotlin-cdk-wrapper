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
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnBranch internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.amplify.CfnBranch,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun appId(): String = unwrap(this).getAppId()

  public open fun appId(`value`: String) {
    unwrap(this).setAppId(`value`)
  }

  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrBranchName(): String = unwrap(this).getAttrBranchName()

  public open fun backend(): Any? = unwrap(this).getBackend()

  public open fun backend(`value`: IResolvable) {
    unwrap(this).setBackend(`value`.let(IResolvable::unwrap))
  }

  public open fun backend(`value`: BackendProperty) {
    unwrap(this).setBackend(`value`.let(BackendProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f6972dc5b70fdec993fe4752c385a82a78e9b4405c4d956c1400f41c72ae0767")
  public open fun backend(`value`: BackendProperty.Builder.() -> Unit): Unit =
      backend(BackendProperty(`value`))

  public open fun basicAuthConfig(): Any? = unwrap(this).getBasicAuthConfig()

  public open fun basicAuthConfig(`value`: IResolvable) {
    unwrap(this).setBasicAuthConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun basicAuthConfig(`value`: BasicAuthConfigProperty) {
    unwrap(this).setBasicAuthConfig(`value`.let(BasicAuthConfigProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("1fce00b5f98214408f76c3f864f42dbc4c0f58156f8b653c685907ff76d07c1b")
  public open fun basicAuthConfig(`value`: BasicAuthConfigProperty.Builder.() -> Unit): Unit =
      basicAuthConfig(BasicAuthConfigProperty(`value`))

  public open fun branchName(): String = unwrap(this).getBranchName()

  public open fun branchName(`value`: String) {
    unwrap(this).setBranchName(`value`)
  }

  public open fun buildSpec(): String? = unwrap(this).getBuildSpec()

  public open fun buildSpec(`value`: String) {
    unwrap(this).setBuildSpec(`value`)
  }

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun enableAutoBuild(): Any? = unwrap(this).getEnableAutoBuild()

  public open fun enableAutoBuild(`value`: Boolean) {
    unwrap(this).setEnableAutoBuild(`value`)
  }

  public open fun enableAutoBuild(`value`: IResolvable) {
    unwrap(this).setEnableAutoBuild(`value`.let(IResolvable::unwrap))
  }

  public open fun enablePerformanceMode(): Any? = unwrap(this).getEnablePerformanceMode()

  public open fun enablePerformanceMode(`value`: Boolean) {
    unwrap(this).setEnablePerformanceMode(`value`)
  }

  public open fun enablePerformanceMode(`value`: IResolvable) {
    unwrap(this).setEnablePerformanceMode(`value`.let(IResolvable::unwrap))
  }

  public open fun enablePullRequestPreview(): Any? = unwrap(this).getEnablePullRequestPreview()

  public open fun enablePullRequestPreview(`value`: Boolean) {
    unwrap(this).setEnablePullRequestPreview(`value`)
  }

  public open fun enablePullRequestPreview(`value`: IResolvable) {
    unwrap(this).setEnablePullRequestPreview(`value`.let(IResolvable::unwrap))
  }

  public open fun environmentVariables(): Any? = unwrap(this).getEnvironmentVariables()

  public open fun environmentVariables(`value`: IResolvable) {
    unwrap(this).setEnvironmentVariables(`value`.let(IResolvable::unwrap))
  }

  public open fun environmentVariables(__idx_ac66f0: List<Any>) {
    unwrap(this).setEnvironmentVariables(__idx_ac66f0)
  }

  public open fun environmentVariables(vararg __idx_ac66f0: Any): Unit =
      environmentVariables(__idx_ac66f0.toList())

  public open fun framework(): String? = unwrap(this).getFramework()

  public open fun framework(`value`: String) {
    unwrap(this).setFramework(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun pullRequestEnvironmentName(): String? =
      unwrap(this).getPullRequestEnvironmentName()

  public open fun pullRequestEnvironmentName(`value`: String) {
    unwrap(this).setPullRequestEnvironmentName(`value`)
  }

  public open fun stage(): String? = unwrap(this).getStage()

  public open fun stage(`value`: String) {
    unwrap(this).setStage(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  @CdkDslMarker
  public interface Builder {
    public fun appId(appId: String)

    public fun backend(backend: IResolvable)

    public fun backend(backend: BackendProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("99ab4a4914f072f0a0e0c21db94a5879d3b7a68a5b44fd2af1d426d83f87aef0")
    public fun backend(backend: BackendProperty.Builder.() -> Unit)

    public fun basicAuthConfig(basicAuthConfig: IResolvable)

    public fun basicAuthConfig(basicAuthConfig: BasicAuthConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9df38851042ee64d5330a6663621351e0c985ce359f43958a67e42387d97f56b")
    public fun basicAuthConfig(basicAuthConfig: BasicAuthConfigProperty.Builder.() -> Unit)

    public fun branchName(branchName: String)

    public fun buildSpec(buildSpec: String)

    public fun description(description: String)

    public fun enableAutoBuild(enableAutoBuild: Boolean)

    public fun enableAutoBuild(enableAutoBuild: IResolvable)

    public fun enablePerformanceMode(enablePerformanceMode: Boolean)

    public fun enablePerformanceMode(enablePerformanceMode: IResolvable)

    public fun enablePullRequestPreview(enablePullRequestPreview: Boolean)

    public fun enablePullRequestPreview(enablePullRequestPreview: IResolvable)

    public fun environmentVariables(environmentVariables: IResolvable)

    public fun environmentVariables(environmentVariables: List<Any>)

    public fun environmentVariables(vararg environmentVariables: Any)

    public fun framework(framework: String)

    public fun pullRequestEnvironmentName(pullRequestEnvironmentName: String)

    public fun stage(stage: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.amplify.CfnBranch.Builder =
        software.amazon.awscdk.services.amplify.CfnBranch.Builder.create(scope, id)

    override fun appId(appId: String) {
      cdkBuilder.appId(appId)
    }

    override fun backend(backend: IResolvable) {
      cdkBuilder.backend(backend.let(IResolvable::unwrap))
    }

    override fun backend(backend: BackendProperty) {
      cdkBuilder.backend(backend.let(BackendProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("99ab4a4914f072f0a0e0c21db94a5879d3b7a68a5b44fd2af1d426d83f87aef0")
    override fun backend(backend: BackendProperty.Builder.() -> Unit): Unit =
        backend(BackendProperty(backend))

    override fun basicAuthConfig(basicAuthConfig: IResolvable) {
      cdkBuilder.basicAuthConfig(basicAuthConfig.let(IResolvable::unwrap))
    }

    override fun basicAuthConfig(basicAuthConfig: BasicAuthConfigProperty) {
      cdkBuilder.basicAuthConfig(basicAuthConfig.let(BasicAuthConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9df38851042ee64d5330a6663621351e0c985ce359f43958a67e42387d97f56b")
    override fun basicAuthConfig(basicAuthConfig: BasicAuthConfigProperty.Builder.() -> Unit): Unit
        = basicAuthConfig(BasicAuthConfigProperty(basicAuthConfig))

    override fun branchName(branchName: String) {
      cdkBuilder.branchName(branchName)
    }

    override fun buildSpec(buildSpec: String) {
      cdkBuilder.buildSpec(buildSpec)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun enableAutoBuild(enableAutoBuild: Boolean) {
      cdkBuilder.enableAutoBuild(enableAutoBuild)
    }

    override fun enableAutoBuild(enableAutoBuild: IResolvable) {
      cdkBuilder.enableAutoBuild(enableAutoBuild.let(IResolvable::unwrap))
    }

    override fun enablePerformanceMode(enablePerformanceMode: Boolean) {
      cdkBuilder.enablePerformanceMode(enablePerformanceMode)
    }

    override fun enablePerformanceMode(enablePerformanceMode: IResolvable) {
      cdkBuilder.enablePerformanceMode(enablePerformanceMode.let(IResolvable::unwrap))
    }

    override fun enablePullRequestPreview(enablePullRequestPreview: Boolean) {
      cdkBuilder.enablePullRequestPreview(enablePullRequestPreview)
    }

    override fun enablePullRequestPreview(enablePullRequestPreview: IResolvable) {
      cdkBuilder.enablePullRequestPreview(enablePullRequestPreview.let(IResolvable::unwrap))
    }

    override fun environmentVariables(environmentVariables: IResolvable) {
      cdkBuilder.environmentVariables(environmentVariables.let(IResolvable::unwrap))
    }

    override fun environmentVariables(environmentVariables: List<Any>) {
      cdkBuilder.environmentVariables(environmentVariables)
    }

    override fun environmentVariables(vararg environmentVariables: Any): Unit =
        environmentVariables(environmentVariables.toList())

    override fun framework(framework: String) {
      cdkBuilder.framework(framework)
    }

    override fun pullRequestEnvironmentName(pullRequestEnvironmentName: String) {
      cdkBuilder.pullRequestEnvironmentName(pullRequestEnvironmentName)
    }

    override fun stage(stage: String) {
      cdkBuilder.stage(stage)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

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
        wrapped.cdkObject
  }

  public interface BasicAuthConfigProperty {
    public fun enableBasicAuth(): Any? = unwrap(this).getEnableBasicAuth()

    public fun password(): String

    public fun username(): String

    @CdkDslMarker
    public interface Builder {
      public fun enableBasicAuth(enableBasicAuth: Boolean)

      public fun enableBasicAuth(enableBasicAuth: IResolvable)

      public fun password(password: String)

      public fun username(username: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.amplify.CfnBranch.BasicAuthConfigProperty.Builder =
          software.amazon.awscdk.services.amplify.CfnBranch.BasicAuthConfigProperty.builder()

      override fun enableBasicAuth(enableBasicAuth: Boolean) {
        cdkBuilder.enableBasicAuth(enableBasicAuth)
      }

      override fun enableBasicAuth(enableBasicAuth: IResolvable) {
        cdkBuilder.enableBasicAuth(enableBasicAuth.let(IResolvable::unwrap))
      }

      override fun password(password: String) {
        cdkBuilder.password(password)
      }

      override fun username(username: String) {
        cdkBuilder.username(username)
      }

      public fun build(): software.amazon.awscdk.services.amplify.CfnBranch.BasicAuthConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.amplify.CfnBranch.BasicAuthConfigProperty,
    ) : CdkObject(cdkObject), BasicAuthConfigProperty {
      override fun enableBasicAuth(): Any? = unwrap(this).getEnableBasicAuth()

      override fun password(): String = unwrap(this).getPassword()

      override fun username(): String = unwrap(this).getUsername()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): BasicAuthConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.amplify.CfnBranch.BasicAuthConfigProperty):
          BasicAuthConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BasicAuthConfigProperty):
          software.amazon.awscdk.services.amplify.CfnBranch.BasicAuthConfigProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.amplify.CfnBranch.BasicAuthConfigProperty
    }
  }

  public interface EnvironmentVariableProperty {
    public fun name(): String

    public fun `value`(): String

    @CdkDslMarker
    public interface Builder {
      public fun name(name: String)

      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.amplify.CfnBranch.EnvironmentVariableProperty.Builder =
          software.amazon.awscdk.services.amplify.CfnBranch.EnvironmentVariableProperty.builder()

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.amplify.CfnBranch.EnvironmentVariableProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.amplify.CfnBranch.EnvironmentVariableProperty,
    ) : CdkObject(cdkObject), EnvironmentVariableProperty {
      override fun name(): String = unwrap(this).getName()

      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EnvironmentVariableProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.amplify.CfnBranch.EnvironmentVariableProperty):
          EnvironmentVariableProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EnvironmentVariableProperty):
          software.amazon.awscdk.services.amplify.CfnBranch.EnvironmentVariableProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.amplify.CfnBranch.EnvironmentVariableProperty
    }
  }

  public interface BackendProperty {
    public fun stackArn(): String? = unwrap(this).getStackArn()

    @CdkDslMarker
    public interface Builder {
      public fun stackArn(stackArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.amplify.CfnBranch.BackendProperty.Builder =
          software.amazon.awscdk.services.amplify.CfnBranch.BackendProperty.builder()

      override fun stackArn(stackArn: String) {
        cdkBuilder.stackArn(stackArn)
      }

      public fun build(): software.amazon.awscdk.services.amplify.CfnBranch.BackendProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.amplify.CfnBranch.BackendProperty,
    ) : CdkObject(cdkObject), BackendProperty {
      override fun stackArn(): String? = unwrap(this).getStackArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): BackendProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.amplify.CfnBranch.BackendProperty):
          BackendProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BackendProperty):
          software.amazon.awscdk.services.amplify.CfnBranch.BackendProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.amplify.CfnBranch.BackendProperty
    }
  }
}