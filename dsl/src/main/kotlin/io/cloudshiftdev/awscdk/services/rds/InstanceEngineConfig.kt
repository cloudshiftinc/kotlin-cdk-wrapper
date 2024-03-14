package io.cloudshiftdev.awscdk.services.rds

import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface InstanceEngineConfig {
  public fun features(): InstanceEngineFeatures? =
      unwrap(this).getFeatures()?.let(InstanceEngineFeatures::wrap)

  public fun optionGroup(): IOptionGroup? = unwrap(this).getOptionGroup()?.let(IOptionGroup::wrap)

  public interface Builder {
    public fun features(features: InstanceEngineFeatures) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("750c4e3d367a1eed55fd985b9a583a4a5eed9ef9c237c45095fb2870144a2a65")
    public fun features(features: InstanceEngineFeatures.Builder.() -> Unit) {
    }

    public fun optionGroup(optionGroup: IOptionGroup) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.InstanceEngineConfig.Builder =
        software.amazon.awscdk.services.rds.InstanceEngineConfig.builder()

    public override fun features(features: InstanceEngineFeatures) {
      cdkBuilder.features(features.let(InstanceEngineFeatures::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("750c4e3d367a1eed55fd985b9a583a4a5eed9ef9c237c45095fb2870144a2a65")
    public override fun features(features: InstanceEngineFeatures.Builder.() -> Unit): Unit =
        features(InstanceEngineFeatures(features))

    public override fun optionGroup(optionGroup: IOptionGroup) {
      cdkBuilder.optionGroup(optionGroup.let(IOptionGroup::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.rds.InstanceEngineConfig =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.rds.InstanceEngineConfig,
  ) : InstanceEngineConfig {
    public override fun features(): InstanceEngineFeatures? =
        unwrap(this).getFeatures()?.let(InstanceEngineFeatures::wrap)

    public override fun optionGroup(): IOptionGroup? =
        unwrap(this).getOptionGroup()?.let(IOptionGroup::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): InstanceEngineConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.InstanceEngineConfig):
        InstanceEngineConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: InstanceEngineConfig):
        software.amazon.awscdk.services.rds.InstanceEngineConfig = (wrapped as Wrapper).cdkObject
  }
}
