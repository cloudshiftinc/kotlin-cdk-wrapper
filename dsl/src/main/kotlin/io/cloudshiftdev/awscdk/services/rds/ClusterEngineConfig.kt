package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface ClusterEngineConfig {
  /**
   * Features supported by the database engine.
   *
   * Default: - no features
   *
   * [Documentation](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_DBEngineVersion.html)
   */
  public fun features(): ClusterEngineFeatures? =
      unwrap(this).getFeatures()?.let(ClusterEngineFeatures::wrap)

  /**
   * The ParameterGroup to use for the cluster.
   *
   * Default: - no ParameterGroup will be used
   */
  public fun parameterGroup(): IParameterGroup? =
      unwrap(this).getParameterGroup()?.let(IParameterGroup::wrap)

  /**
   * The port to use for this cluster, unless the customer specified the port directly.
   *
   * Default: - use the default port for clusters (3306)
   */
  public fun port(): Number? = unwrap(this).getPort()

  /**
   * A builder for [ClusterEngineConfig]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param features Features supported by the database engine.
     */
    public fun features(features: ClusterEngineFeatures)

    /**
     * @param features Features supported by the database engine.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b953f0b03dd9c2894c3f2eba55a64d6d17393cebb08084b64f47c01ec15c5693")
    public fun features(features: ClusterEngineFeatures.Builder.() -> Unit)

    /**
     * @param parameterGroup The ParameterGroup to use for the cluster.
     */
    public fun parameterGroup(parameterGroup: IParameterGroup)

    /**
     * @param port The port to use for this cluster, unless the customer specified the port
     * directly.
     */
    public fun port(port: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.ClusterEngineConfig.Builder =
        software.amazon.awscdk.services.rds.ClusterEngineConfig.builder()

    /**
     * @param features Features supported by the database engine.
     */
    override fun features(features: ClusterEngineFeatures) {
      cdkBuilder.features(features.let(ClusterEngineFeatures::unwrap))
    }

    /**
     * @param features Features supported by the database engine.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b953f0b03dd9c2894c3f2eba55a64d6d17393cebb08084b64f47c01ec15c5693")
    override fun features(features: ClusterEngineFeatures.Builder.() -> Unit): Unit =
        features(ClusterEngineFeatures(features))

    /**
     * @param parameterGroup The ParameterGroup to use for the cluster.
     */
    override fun parameterGroup(parameterGroup: IParameterGroup) {
      cdkBuilder.parameterGroup(parameterGroup.let(IParameterGroup::unwrap))
    }

    /**
     * @param port The port to use for this cluster, unless the customer specified the port
     * directly.
     */
    override fun port(port: Number) {
      cdkBuilder.port(port)
    }

    public fun build(): software.amazon.awscdk.services.rds.ClusterEngineConfig = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.rds.ClusterEngineConfig,
  ) : CdkObject(cdkObject), ClusterEngineConfig {
    /**
     * Features supported by the database engine.
     *
     * Default: - no features
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_DBEngineVersion.html)
     */
    override fun features(): ClusterEngineFeatures? =
        unwrap(this).getFeatures()?.let(ClusterEngineFeatures::wrap)

    /**
     * The ParameterGroup to use for the cluster.
     *
     * Default: - no ParameterGroup will be used
     */
    override fun parameterGroup(): IParameterGroup? =
        unwrap(this).getParameterGroup()?.let(IParameterGroup::wrap)

    /**
     * The port to use for this cluster, unless the customer specified the port directly.
     *
     * Default: - use the default port for clusters (3306)
     */
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
