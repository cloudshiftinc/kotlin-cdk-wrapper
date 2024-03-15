@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.Unit
import kotlin.jvm.JvmName

public interface ClusterEngineConfig {
  public fun features(): ClusterEngineFeatures? =
      unwrap(this).getFeatures()?.let(ClusterEngineFeatures::wrap)

  public fun parameterGroup(): IParameterGroup? =
      unwrap(this).getParameterGroup()?.let(IParameterGroup::wrap)

  public fun port(): Number? = unwrap(this).getPort()

  @CdkDslMarker
  public interface Builder {
    public fun features(features: ClusterEngineFeatures)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b953f0b03dd9c2894c3f2eba55a64d6d17393cebb08084b64f47c01ec15c5693")
    public fun features(features: ClusterEngineFeatures.Builder.() -> Unit)

    public fun parameterGroup(parameterGroup: IParameterGroup)

    public fun port(port: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.ClusterEngineConfig.Builder =
        software.amazon.awscdk.services.rds.ClusterEngineConfig.builder()

    override fun features(features: ClusterEngineFeatures) {
      cdkBuilder.features(features.let(ClusterEngineFeatures::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b953f0b03dd9c2894c3f2eba55a64d6d17393cebb08084b64f47c01ec15c5693")
    override fun features(features: ClusterEngineFeatures.Builder.() -> Unit): Unit =
        features(ClusterEngineFeatures(features))

    override fun parameterGroup(parameterGroup: IParameterGroup) {
      cdkBuilder.parameterGroup(parameterGroup.let(IParameterGroup::unwrap))
    }

    override fun port(port: Number) {
      cdkBuilder.port(port)
    }

    public fun build(): software.amazon.awscdk.services.rds.ClusterEngineConfig = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.rds.ClusterEngineConfig,
  ) : CdkObject(cdkObject), ClusterEngineConfig {
    override fun features(): ClusterEngineFeatures? =
        unwrap(this).getFeatures()?.let(ClusterEngineFeatures::wrap)

    override fun parameterGroup(): IParameterGroup? =
        unwrap(this).getParameterGroup()?.let(IParameterGroup::wrap)

    override fun port(): Number? = unwrap(this).getPort()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ClusterEngineConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.ClusterEngineConfig):
        ClusterEngineConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ClusterEngineConfig):
        software.amazon.awscdk.services.rds.ClusterEngineConfig = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.rds.ClusterEngineConfig
  }
}
