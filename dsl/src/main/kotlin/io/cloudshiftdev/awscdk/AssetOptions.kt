package io.cloudshiftdev.awscdk

import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface AssetOptions {
  public fun assetHash(): String? = unwrap(this).getAssetHash()

  public fun assetHashType(): AssetHashType? =
      unwrap(this).getAssetHashType()?.let(AssetHashType::wrap)

  public fun bundling(): BundlingOptions? = unwrap(this).getBundling()?.let(BundlingOptions::wrap)

  public interface Builder {
    public fun assetHash(assetHash: String) {
    }

    public fun assetHashType(assetHashType: AssetHashType) {
    }

    public fun bundling(bundling: BundlingOptions) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ab28d33e994f3bcf578da232f9f18828c83bb8c71639a3c730b57fb713dade02")
    public fun bundling(bundling: BundlingOptions.Builder.() -> Unit) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.AssetOptions.Builder =
        software.amazon.awscdk.AssetOptions.builder()

    public override fun assetHash(assetHash: String) {
      cdkBuilder.assetHash(assetHash)
    }

    public override fun assetHashType(assetHashType: AssetHashType) {
      cdkBuilder.assetHashType(assetHashType.let(AssetHashType::unwrap))
    }

    public override fun bundling(bundling: BundlingOptions) {
      cdkBuilder.bundling(bundling.let(BundlingOptions::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ab28d33e994f3bcf578da232f9f18828c83bb8c71639a3c730b57fb713dade02")
    public override fun bundling(bundling: BundlingOptions.Builder.() -> Unit): Unit =
        bundling(BundlingOptions(bundling))

    public fun build(): software.amazon.awscdk.AssetOptions = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.AssetOptions,
  ) : AssetOptions {
    public override fun assetHash(): String? = unwrap(this).getAssetHash()

    public override fun assetHashType(): AssetHashType? =
        unwrap(this).getAssetHashType()?.let(AssetHashType::wrap)

    public override fun bundling(): BundlingOptions? =
        unwrap(this).getBundling()?.let(BundlingOptions::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): AssetOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.AssetOptions): AssetOptions =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: AssetOptions): software.amazon.awscdk.AssetOptions = (wrapped as
        Wrapper).cdkObject
  }
}
