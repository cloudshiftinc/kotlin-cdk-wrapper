@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline.actions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface JenkinsProviderProps {
  public fun forBuild(): Boolean? = unwrap(this).getForBuild()

  public fun forTest(): Boolean? = unwrap(this).getForTest()

  public fun providerName(): String

  public fun serverUrl(): String

  public fun version(): String? = unwrap(this).getVersion()

  @CdkDslMarker
  public interface Builder {
    public fun forBuild(forBuild: Boolean)

    public fun forTest(forTest: Boolean)

    public fun providerName(providerName: String)

    public fun serverUrl(serverUrl: String)

    public fun version(version: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codepipeline.actions.JenkinsProviderProps.Builder =
        software.amazon.awscdk.services.codepipeline.actions.JenkinsProviderProps.builder()

    override fun forBuild(forBuild: Boolean) {
      cdkBuilder.forBuild(forBuild)
    }

    override fun forTest(forTest: Boolean) {
      cdkBuilder.forTest(forTest)
    }

    override fun providerName(providerName: String) {
      cdkBuilder.providerName(providerName)
    }

    override fun serverUrl(serverUrl: String) {
      cdkBuilder.serverUrl(serverUrl)
    }

    override fun version(version: String) {
      cdkBuilder.version(version)
    }

    public fun build(): software.amazon.awscdk.services.codepipeline.actions.JenkinsProviderProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.codepipeline.actions.JenkinsProviderProps,
  ) : CdkObject(cdkObject), JenkinsProviderProps {
    override fun forBuild(): Boolean? = unwrap(this).getForBuild()

    override fun forTest(): Boolean? = unwrap(this).getForTest()

    override fun providerName(): String = unwrap(this).getProviderName()

    override fun serverUrl(): String = unwrap(this).getServerUrl()

    override fun version(): String? = unwrap(this).getVersion()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): JenkinsProviderProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.JenkinsProviderProps):
        JenkinsProviderProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: JenkinsProviderProps):
        software.amazon.awscdk.services.codepipeline.actions.JenkinsProviderProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.codepipeline.actions.JenkinsProviderProps
  }
}
