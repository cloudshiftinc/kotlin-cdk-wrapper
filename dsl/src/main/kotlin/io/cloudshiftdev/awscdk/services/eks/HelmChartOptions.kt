package io.cloudshiftdev.awscdk.services.eks

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.services.s3.assets.Asset
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface HelmChartOptions {
  public fun chart(): String? = unwrap(this).getChart()

  public fun chartAsset(): Asset? = unwrap(this).getChartAsset()?.let(Asset::wrap)

  public fun createNamespace(): Boolean? = unwrap(this).getCreateNamespace()

  public fun namespace(): String? = unwrap(this).getNamespace()

  public fun release(): String? = unwrap(this).getRelease()

  public fun repository(): String? = unwrap(this).getRepository()

  public fun skipCrds(): Boolean? = unwrap(this).getSkipCrds()

  public fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)

  public fun values(): Map<String, Any> = unwrap(this).getValues() ?: emptyMap()

  public fun version(): String? = unwrap(this).getVersion()

  public fun wait(): Boolean? = unwrap(this).getWait()

  public interface Builder {
    public fun chart(chart: String) {
    }

    public fun chartAsset(chartAsset: Asset) {
    }

    public fun createNamespace(createNamespace: Boolean) {
    }

    public fun namespace(namespace: String) {
    }

    public fun release(release: String) {
    }

    public fun repository(repository: String) {
    }

    public fun skipCrds(skipCrds: Boolean) {
    }

    public fun timeout(timeout: Duration) {
    }

    public fun values(values: Map<String, Any>) {
    }

    public fun version(version: String) {
    }

    public fun wait(wait: Boolean) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.eks.HelmChartOptions.Builder =
        software.amazon.awscdk.services.eks.HelmChartOptions.builder()

    public override fun chart(chart: String) {
      cdkBuilder.chart(chart)
    }

    public override fun chartAsset(chartAsset: Asset) {
      cdkBuilder.chartAsset(chartAsset.let(Asset::unwrap))
    }

    public override fun createNamespace(createNamespace: Boolean) {
      cdkBuilder.createNamespace(createNamespace)
    }

    public override fun namespace(namespace: String) {
      cdkBuilder.namespace(namespace)
    }

    public override fun release(release: String) {
      cdkBuilder.release(release)
    }

    public override fun repository(repository: String) {
      cdkBuilder.repository(repository)
    }

    public override fun skipCrds(skipCrds: Boolean) {
      cdkBuilder.skipCrds(skipCrds)
    }

    public override fun timeout(timeout: Duration) {
      cdkBuilder.timeout(timeout.let(Duration::unwrap))
    }

    public override fun values(values: Map<String, Any>) {
      cdkBuilder.values(values)
    }

    public override fun version(version: String) {
      cdkBuilder.version(version)
    }

    public override fun wait(wait: Boolean) {
      cdkBuilder.wait(wait)
    }

    public fun build(): software.amazon.awscdk.services.eks.HelmChartOptions = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.eks.HelmChartOptions,
  ) : HelmChartOptions {
    public override fun chart(): String? = unwrap(this).getChart()

    public override fun chartAsset(): Asset? = unwrap(this).getChartAsset()?.let(Asset::wrap)

    public override fun createNamespace(): Boolean? = unwrap(this).getCreateNamespace()

    public override fun namespace(): String? = unwrap(this).getNamespace()

    public override fun release(): String? = unwrap(this).getRelease()

    public override fun repository(): String? = unwrap(this).getRepository()

    public override fun skipCrds(): Boolean? = unwrap(this).getSkipCrds()

    public override fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)

    public override fun values(): Map<String, Any> = unwrap(this).getValues() ?: emptyMap()

    public override fun version(): String? = unwrap(this).getVersion()

    public override fun wait(): Boolean? = unwrap(this).getWait()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): HelmChartOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.HelmChartOptions):
        HelmChartOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: HelmChartOptions):
        software.amazon.awscdk.services.eks.HelmChartOptions = (wrapped as Wrapper).cdkObject
  }
}
