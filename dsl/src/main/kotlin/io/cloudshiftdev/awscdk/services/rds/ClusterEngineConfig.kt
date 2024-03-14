package io.cloudshiftdev.awscdk.services.rds

import kotlin.Number
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface ClusterEngineConfig {
  public fun features(): ClusterEngineFeatures? =
      unwrap(this).getFeatures()?.let(ClusterEngineFeatures::wrap)

  public fun parameterGroup(): IParameterGroup? =
      unwrap(this).getParameterGroup()?.let(IParameterGroup::wrap)

  public fun port(): Number? = unwrap(this).getPort()

  public interface Builder {
    public fun features(features: ClusterEngineFeatures) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b953f0b03dd9c2894c3f2eba55a64d6d17393cebb08084b64f47c01ec15c5693")
    public fun features(features: ClusterEngineFeatures.Builder.() -> Unit) {
    }

    public fun parameterGroup(parameterGroup: IParameterGroup) {
    }

    public fun port(port: Number) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.ClusterEngineConfig.Builder =
        software.amazon.awscdk.services.rds.ClusterEngineConfig.builder()

    public override fun features(features: ClusterEngineFeatures) {
      cdkBuilder.features(features.let(ClusterEngineFeatures::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b953f0b03dd9c2894c3f2eba55a64d6d17393cebb08084b64f47c01ec15c5693")
    public override fun features(features: ClusterEngineFeatures.Builder.() -> Unit): Unit =
        features(ClusterEngineFeatures(features))

    public override fun parameterGroup(parameterGroup: IParameterGroup) {
      cdkBuilder.parameterGroup(parameterGroup.let(IParameterGroup::unwrap))
    }

    public override fun port(port: Number) {
      cdkBuilder.port(port)
    }

    public fun build(): software.amazon.awscdk.services.rds.ClusterEngineConfig = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.rds.ClusterEngineConfig,
  ) : ClusterEngineConfig {
    public override fun features(): ClusterEngineFeatures? =
        unwrap(this).getFeatures()?.let(ClusterEngineFeatures::wrap)

    public override fun parameterGroup(): IParameterGroup? =
        unwrap(this).getParameterGroup()?.let(IParameterGroup::wrap)

    public override fun port(): Number? = unwrap(this).getPort()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): ClusterEngineConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.ClusterEngineConfig):
        ClusterEngineConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ClusterEngineConfig):
        software.amazon.awscdk.services.rds.ClusterEngineConfig = (wrapped as Wrapper).cdkObject
  }
}
