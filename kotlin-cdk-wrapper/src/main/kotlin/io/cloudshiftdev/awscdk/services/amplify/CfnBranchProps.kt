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

public interface CfnBranchProps {
  public fun appId(): String

  public fun backend(): Any? = unwrap(this).getBackend()

  public fun basicAuthConfig(): Any? = unwrap(this).getBasicAuthConfig()

  public fun branchName(): String

  public fun buildSpec(): String? = unwrap(this).getBuildSpec()

  public fun description(): String? = unwrap(this).getDescription()

  public fun enableAutoBuild(): Any? = unwrap(this).getEnableAutoBuild()

  public fun enablePerformanceMode(): Any? = unwrap(this).getEnablePerformanceMode()

  public fun enablePullRequestPreview(): Any? = unwrap(this).getEnablePullRequestPreview()

  public fun environmentVariables(): Any? = unwrap(this).getEnvironmentVariables()

  public fun framework(): String? = unwrap(this).getFramework()

  public fun pullRequestEnvironmentName(): String? = unwrap(this).getPullRequestEnvironmentName()

  public fun stage(): String? = unwrap(this).getStage()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun appId(appId: String)

    public fun backend(backend: IResolvable)

    public fun backend(backend: CfnBranch.BackendProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5ca1e5a8e883f335ce3d4909bf2590b31a5a37227e08ef1959dba530961b7676")
    public fun backend(backend: CfnBranch.BackendProperty.Builder.() -> Unit)

    public fun basicAuthConfig(basicAuthConfig: IResolvable)

    public fun basicAuthConfig(basicAuthConfig: CfnBranch.BasicAuthConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4be9f9f4c05ea70af84949ceab597667719bb03914a9c4cedc3e361162cc9de5")
    public
        fun basicAuthConfig(basicAuthConfig: CfnBranch.BasicAuthConfigProperty.Builder.() -> Unit)

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

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.amplify.CfnBranchProps.Builder =
        software.amazon.awscdk.services.amplify.CfnBranchProps.builder()

    override fun appId(appId: String) {
      cdkBuilder.appId(appId)
    }

    override fun backend(backend: IResolvable) {
      cdkBuilder.backend(backend.let(IResolvable::unwrap))
    }

    override fun backend(backend: CfnBranch.BackendProperty) {
      cdkBuilder.backend(backend.let(CfnBranch.BackendProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5ca1e5a8e883f335ce3d4909bf2590b31a5a37227e08ef1959dba530961b7676")
    override fun backend(backend: CfnBranch.BackendProperty.Builder.() -> Unit): Unit =
        backend(CfnBranch.BackendProperty(backend))

    override fun basicAuthConfig(basicAuthConfig: IResolvable) {
      cdkBuilder.basicAuthConfig(basicAuthConfig.let(IResolvable::unwrap))
    }

    override fun basicAuthConfig(basicAuthConfig: CfnBranch.BasicAuthConfigProperty) {
      cdkBuilder.basicAuthConfig(basicAuthConfig.let(CfnBranch.BasicAuthConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4be9f9f4c05ea70af84949ceab597667719bb03914a9c4cedc3e361162cc9de5")
    override
        fun basicAuthConfig(basicAuthConfig: CfnBranch.BasicAuthConfigProperty.Builder.() -> Unit):
        Unit = basicAuthConfig(CfnBranch.BasicAuthConfigProperty(basicAuthConfig))

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

    public fun build(): software.amazon.awscdk.services.amplify.CfnBranchProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.amplify.CfnBranchProps,
  ) : CdkObject(cdkObject), CfnBranchProps {
    override fun appId(): String = unwrap(this).getAppId()

    override fun backend(): Any? = unwrap(this).getBackend()

    override fun basicAuthConfig(): Any? = unwrap(this).getBasicAuthConfig()

    override fun branchName(): String = unwrap(this).getBranchName()

    override fun buildSpec(): String? = unwrap(this).getBuildSpec()

    override fun description(): String? = unwrap(this).getDescription()

    override fun enableAutoBuild(): Any? = unwrap(this).getEnableAutoBuild()

    override fun enablePerformanceMode(): Any? = unwrap(this).getEnablePerformanceMode()

    override fun enablePullRequestPreview(): Any? = unwrap(this).getEnablePullRequestPreview()

    override fun environmentVariables(): Any? = unwrap(this).getEnvironmentVariables()

    override fun framework(): String? = unwrap(this).getFramework()

    override fun pullRequestEnvironmentName(): String? =
        unwrap(this).getPullRequestEnvironmentName()

    override fun stage(): String? = unwrap(this).getStage()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnBranchProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.amplify.CfnBranchProps):
        CfnBranchProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnBranchProps):
        software.amazon.awscdk.services.amplify.CfnBranchProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.amplify.CfnBranchProps
  }
}
