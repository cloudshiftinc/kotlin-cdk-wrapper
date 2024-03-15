@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline.actions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface JenkinsProviderAttributes {
  public fun providerName(): String

  public fun serverUrl(): String

  public fun version(): String? = unwrap(this).getVersion()

  @CdkDslMarker
  public interface Builder {
    public fun providerName(providerName: String)

    public fun serverUrl(serverUrl: String)

    public fun version(version: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codepipeline.actions.JenkinsProviderAttributes.Builder =
        software.amazon.awscdk.services.codepipeline.actions.JenkinsProviderAttributes.builder()

    override fun providerName(providerName: String) {
      cdkBuilder.providerName(providerName)
    }

    override fun serverUrl(serverUrl: String) {
      cdkBuilder.serverUrl(serverUrl)
    }

    override fun version(version: String) {
      cdkBuilder.version(version)
    }

    public fun build():
        software.amazon.awscdk.services.codepipeline.actions.JenkinsProviderAttributes =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.codepipeline.actions.JenkinsProviderAttributes,
  ) : CdkObject(cdkObject), JenkinsProviderAttributes {
    override fun providerName(): String = unwrap(this).getProviderName()

    override fun serverUrl(): String = unwrap(this).getServerUrl()

    override fun version(): String? = unwrap(this).getVersion()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): JenkinsProviderAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.JenkinsProviderAttributes):
        JenkinsProviderAttributes = Wrapper(cdkObject)

    internal fun unwrap(wrapped: JenkinsProviderAttributes):
        software.amazon.awscdk.services.codepipeline.actions.JenkinsProviderAttributes = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.codepipeline.actions.JenkinsProviderAttributes
  }
}