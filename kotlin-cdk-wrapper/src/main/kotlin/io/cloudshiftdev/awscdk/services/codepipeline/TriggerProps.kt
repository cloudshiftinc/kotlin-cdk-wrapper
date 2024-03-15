@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Unit
import kotlin.jvm.JvmName

public interface TriggerProps {
  public fun gitConfiguration(): GitConfiguration? =
      unwrap(this).getGitConfiguration()?.let(GitConfiguration::wrap)

  public fun providerType(): ProviderType

  @CdkDslMarker
  public interface Builder {
    public fun gitConfiguration(gitConfiguration: GitConfiguration)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b85b1726b85e5b4a3b1361634b4df38a127b13a300f38da15ac1fd974942c800")
    public fun gitConfiguration(gitConfiguration: GitConfiguration.Builder.() -> Unit)

    public fun providerType(providerType: ProviderType)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codepipeline.TriggerProps.Builder =
        software.amazon.awscdk.services.codepipeline.TriggerProps.builder()

    override fun gitConfiguration(gitConfiguration: GitConfiguration) {
      cdkBuilder.gitConfiguration(gitConfiguration.let(GitConfiguration::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b85b1726b85e5b4a3b1361634b4df38a127b13a300f38da15ac1fd974942c800")
    override fun gitConfiguration(gitConfiguration: GitConfiguration.Builder.() -> Unit): Unit =
        gitConfiguration(GitConfiguration(gitConfiguration))

    override fun providerType(providerType: ProviderType) {
      cdkBuilder.providerType(providerType.let(ProviderType::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.codepipeline.TriggerProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codepipeline.TriggerProps,
  ) : CdkObject(cdkObject), TriggerProps {
    override fun gitConfiguration(): GitConfiguration? =
        unwrap(this).getGitConfiguration()?.let(GitConfiguration::wrap)

    override fun providerType(): ProviderType =
        unwrap(this).getProviderType().let(ProviderType::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): TriggerProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.TriggerProps):
        TriggerProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: TriggerProps):
        software.amazon.awscdk.services.codepipeline.TriggerProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.codepipeline.TriggerProps
  }
}
