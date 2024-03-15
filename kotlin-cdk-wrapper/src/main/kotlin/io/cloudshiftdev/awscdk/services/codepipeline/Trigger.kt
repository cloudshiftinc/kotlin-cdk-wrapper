@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Unit
import kotlin.jvm.JvmName

public open class Trigger internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.codepipeline.Trigger,
) : CdkObject(cdkObject) {
  public open fun sourceAction(): IAction? = unwrap(this).getSourceAction()?.let(IAction::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun gitConfiguration(gitConfiguration: GitConfiguration)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("43bdb8c0f6051746f3f200fd74a269256b6b989d220404453f8b254e5c48c062")
    public fun gitConfiguration(gitConfiguration: GitConfiguration.Builder.() -> Unit)

    public fun providerType(providerType: ProviderType)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codepipeline.Trigger.Builder =
        software.amazon.awscdk.services.codepipeline.Trigger.Builder.create()

    override fun gitConfiguration(gitConfiguration: GitConfiguration) {
      cdkBuilder.gitConfiguration(gitConfiguration.let(GitConfiguration::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("43bdb8c0f6051746f3f200fd74a269256b6b989d220404453f8b254e5c48c062")
    override fun gitConfiguration(gitConfiguration: GitConfiguration.Builder.() -> Unit): Unit =
        gitConfiguration(GitConfiguration(gitConfiguration))

    override fun providerType(providerType: ProviderType) {
      cdkBuilder.providerType(providerType.let(ProviderType::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.codepipeline.Trigger = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): Trigger {
      val builderImpl = BuilderImpl()
      return Trigger(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.Trigger): Trigger =
        Trigger(cdkObject)

    internal fun unwrap(wrapped: Trigger): software.amazon.awscdk.services.codepipeline.Trigger =
        wrapped.cdkObject
  }
}
