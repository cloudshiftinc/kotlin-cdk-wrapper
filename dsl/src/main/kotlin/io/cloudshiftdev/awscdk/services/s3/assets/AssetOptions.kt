package io.cloudshiftdev.awscdk.services.s3.assets

import io.cloudshiftdev.awscdk.AssetHashType
import io.cloudshiftdev.awscdk.BundlingOptions
import io.cloudshiftdev.awscdk.FileCopyOptions
import io.cloudshiftdev.awscdk.IgnoreMode
import io.cloudshiftdev.awscdk.SymlinkFollowMode
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface AssetOptions : io.cloudshiftdev.awscdk.AssetOptions, FileCopyOptions {
  public fun deployTime(): Boolean? = unwrap(this).getDeployTime()

  public fun readers(): List<IGrantable> = unwrap(this).getReaders()?.map(IGrantable::wrap) ?:
      emptyList()

  public interface Builder {
    public fun assetHash(assetHash: String) {
    }

    public fun assetHashType(assetHashType: AssetHashType) {
    }

    public fun bundling(bundling: BundlingOptions) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5e4839270a5dcff2c1b91d0006869247f9a5e445bf2d9b19aaaadb836021b09e")
    public fun bundling(bundling: BundlingOptions.Builder.() -> Unit) {
    }

    public fun deployTime(deployTime: Boolean) {
    }

    public fun exclude(exclude: List<String>) {
    }

    public fun followSymlinks(followSymlinks: SymlinkFollowMode) {
    }

    public fun ignoreMode(ignoreMode: IgnoreMode) {
    }

    public fun readers(readers: List<IGrantable>) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.s3.assets.AssetOptions.Builder =
        software.amazon.awscdk.services.s3.assets.AssetOptions.builder()

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
    @JvmName("5e4839270a5dcff2c1b91d0006869247f9a5e445bf2d9b19aaaadb836021b09e")
    public override fun bundling(bundling: BundlingOptions.Builder.() -> Unit): Unit =
        bundling(BundlingOptions(bundling))

    public override fun deployTime(deployTime: Boolean) {
      cdkBuilder.deployTime(deployTime)
    }

    public override fun exclude(exclude: List<String>) {
      cdkBuilder.exclude(exclude)
    }

    public override fun followSymlinks(followSymlinks: SymlinkFollowMode) {
      cdkBuilder.followSymlinks(followSymlinks.let(SymlinkFollowMode::unwrap))
    }

    public override fun ignoreMode(ignoreMode: IgnoreMode) {
      cdkBuilder.ignoreMode(ignoreMode.let(IgnoreMode::unwrap))
    }

    public override fun readers(readers: List<IGrantable>) {
      cdkBuilder.readers(readers.map(IGrantable::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.s3.assets.AssetOptions = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.s3.assets.AssetOptions,
  ) : AssetOptions {
    public override fun assetHash(): String? = unwrap(this).getAssetHash()

    public override fun assetHashType(): AssetHashType? =
        unwrap(this).getAssetHashType()?.let(AssetHashType::wrap)

    public override fun bundling(): BundlingOptions? =
        unwrap(this).getBundling()?.let(BundlingOptions::wrap)

    public override fun deployTime(): Boolean? = unwrap(this).getDeployTime()

    public override fun exclude(): List<String> = unwrap(this).getExclude() ?: emptyList()

    public override fun followSymlinks(): SymlinkFollowMode? =
        unwrap(this).getFollowSymlinks()?.let(SymlinkFollowMode::wrap)

    public override fun ignoreMode(): IgnoreMode? =
        unwrap(this).getIgnoreMode()?.let(IgnoreMode::wrap)

    public override fun readers(): List<IGrantable> =
        unwrap(this).getReaders()?.map(IGrantable::wrap) ?: emptyList()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): AssetOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3.assets.AssetOptions):
        AssetOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AssetOptions):
        software.amazon.awscdk.services.s3.assets.AssetOptions = (wrapped as Wrapper).cdkObject
  }
}
