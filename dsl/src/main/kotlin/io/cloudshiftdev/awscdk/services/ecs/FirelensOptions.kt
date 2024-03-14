package io.cloudshiftdev.awscdk.services.ecs

import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface FirelensOptions {
  public fun configFileType(): FirelensConfigFileType? =
      unwrap(this).getConfigFileType()?.let(FirelensConfigFileType::wrap)

  public fun configFileValue(): String? = unwrap(this).getConfigFileValue()

  public fun enableEcsLogMetadata(): Boolean? = unwrap(this).getEnableECSLogMetadata()

  public interface Builder {
    public fun configFileType(configFileType: FirelensConfigFileType) {
    }

    public fun configFileValue(configFileValue: String) {
    }

    public fun enableEcsLogMetadata(enableEcsLogMetadata: Boolean) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.FirelensOptions.Builder =
        software.amazon.awscdk.services.ecs.FirelensOptions.builder()

    public override fun configFileType(configFileType: FirelensConfigFileType) {
      cdkBuilder.configFileType(configFileType.let(FirelensConfigFileType::unwrap))
    }

    public override fun configFileValue(configFileValue: String) {
      cdkBuilder.configFileValue(configFileValue)
    }

    public override fun enableEcsLogMetadata(enableEcsLogMetadata: Boolean) {
      cdkBuilder.enableEcsLogMetadata(enableEcsLogMetadata)
    }

    public fun build(): software.amazon.awscdk.services.ecs.FirelensOptions = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ecs.FirelensOptions,
  ) : FirelensOptions {
    public override fun configFileType(): FirelensConfigFileType? =
        unwrap(this).getConfigFileType()?.let(FirelensConfigFileType::wrap)

    public override fun configFileValue(): String? = unwrap(this).getConfigFileValue()

    public override fun enableEcsLogMetadata(): Boolean? = unwrap(this).getEnableECSLogMetadata()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): FirelensOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.FirelensOptions):
        FirelensOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: FirelensOptions):
        software.amazon.awscdk.services.ecs.FirelensOptions = (wrapped as Wrapper).cdkObject
  }
}
