@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Unit
import kotlin.jvm.JvmName

public interface InstanceEngineConfig {
  public fun features(): InstanceEngineFeatures? =
      unwrap(this).getFeatures()?.let(InstanceEngineFeatures::wrap)

  public fun optionGroup(): IOptionGroup? = unwrap(this).getOptionGroup()?.let(IOptionGroup::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun features(features: InstanceEngineFeatures)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("750c4e3d367a1eed55fd985b9a583a4a5eed9ef9c237c45095fb2870144a2a65")
    public fun features(features: InstanceEngineFeatures.Builder.() -> Unit)

    public fun optionGroup(optionGroup: IOptionGroup)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.InstanceEngineConfig.Builder =
        software.amazon.awscdk.services.rds.InstanceEngineConfig.builder()

    override fun features(features: InstanceEngineFeatures) {
      cdkBuilder.features(features.let(InstanceEngineFeatures::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("750c4e3d367a1eed55fd985b9a583a4a5eed9ef9c237c45095fb2870144a2a65")
    override fun features(features: InstanceEngineFeatures.Builder.() -> Unit): Unit =
        features(InstanceEngineFeatures(features))

    override fun optionGroup(optionGroup: IOptionGroup) {
      cdkBuilder.optionGroup(optionGroup.let(IOptionGroup::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.rds.InstanceEngineConfig =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.rds.InstanceEngineConfig,
  ) : CdkObject(cdkObject), InstanceEngineConfig {
    override fun features(): InstanceEngineFeatures? =
        unwrap(this).getFeatures()?.let(InstanceEngineFeatures::wrap)

    override fun optionGroup(): IOptionGroup? =
        unwrap(this).getOptionGroup()?.let(IOptionGroup::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): InstanceEngineConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.InstanceEngineConfig):
        InstanceEngineConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: InstanceEngineConfig):
        software.amazon.awscdk.services.rds.InstanceEngineConfig = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.rds.InstanceEngineConfig
  }
}
