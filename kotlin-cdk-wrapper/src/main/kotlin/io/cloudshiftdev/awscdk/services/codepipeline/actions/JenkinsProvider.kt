@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline.actions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class JenkinsProvider internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.codepipeline.actions.JenkinsProvider,
) : BaseJenkinsProvider(cdkObject) {
  public override fun providerName(): String = unwrap(this).getProviderName()

  public override fun serverUrl(): String = unwrap(this).getServerUrl()

  @CdkDslMarker
  public interface Builder {
    public fun forBuild(forBuild: Boolean)

    public fun forTest(forTest: Boolean)

    public fun providerName(providerName: String)

    public fun serverUrl(serverUrl: String)

    public fun version(version: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codepipeline.actions.JenkinsProvider.Builder =
        software.amazon.awscdk.services.codepipeline.actions.JenkinsProvider.Builder.create(scope,
        id)

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

    public fun build(): software.amazon.awscdk.services.codepipeline.actions.JenkinsProvider =
        cdkBuilder.build()
  }

  public companion object {
    public fun fromJenkinsProviderAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: JenkinsProviderAttributes,
    ): IJenkinsProvider =
        software.amazon.awscdk.services.codepipeline.actions.JenkinsProvider.fromJenkinsProviderAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(JenkinsProviderAttributes::unwrap)).let(IJenkinsProvider::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0d90bec4732ec43072405e8717ccd4c0c26b54a0f0ed3221b659c8cb4a9e3db6")
    public fun fromJenkinsProviderAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: JenkinsProviderAttributes.Builder.() -> Unit,
    ): IJenkinsProvider = fromJenkinsProviderAttributes(scope, id, JenkinsProviderAttributes(attrs))

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): JenkinsProvider {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return JenkinsProvider(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.JenkinsProvider):
        JenkinsProvider = JenkinsProvider(cdkObject)

    internal fun unwrap(wrapped: JenkinsProvider):
        software.amazon.awscdk.services.codepipeline.actions.JenkinsProvider = wrapped.cdkObject
  }
}
