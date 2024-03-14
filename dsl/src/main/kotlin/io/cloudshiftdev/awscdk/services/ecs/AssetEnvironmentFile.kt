package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.AssetHashType
import io.cloudshiftdev.awscdk.BundlingOptions
import io.cloudshiftdev.awscdk.IgnoreMode
import io.cloudshiftdev.awscdk.SymlinkFollowMode
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.constructs.Construct
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public open class AssetEnvironmentFile internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ecs.AssetEnvironmentFile,
) : EnvironmentFile(cdkObject) {
  public override fun bind(scope: Construct): EnvironmentFileConfig =
      unwrap(this).bind(scope.let(Construct::unwrap)).let(EnvironmentFileConfig::wrap)

  public open fun path(): String = unwrap(this).getPath()

  public interface Builder {
    public fun assetHash(assetHash: String) {
    }

    public fun assetHashType(assetHashType: AssetHashType) {
    }

    public fun bundling(bundling: BundlingOptions) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f2340990b1c321dbdf222110179975f1e8a15d6807621bbce582a740dac93f0b")
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

  private class BuilderImpl(
    path: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.AssetEnvironmentFile.Builder =
        software.amazon.awscdk.services.ecs.AssetEnvironmentFile.Builder.create(path)

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
    @JvmName("f2340990b1c321dbdf222110179975f1e8a15d6807621bbce582a740dac93f0b")
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

    public fun build(): software.amazon.awscdk.services.ecs.AssetEnvironmentFile =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(path: String, block: Builder.() -> Unit = {}): AssetEnvironmentFile {
      val builderImpl = BuilderImpl(path)
      return AssetEnvironmentFile(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.AssetEnvironmentFile):
        AssetEnvironmentFile = AssetEnvironmentFile(cdkObject)

    internal fun unwrap(wrapped: AssetEnvironmentFile):
        software.amazon.awscdk.services.ecs.AssetEnvironmentFile = wrapped.cdkObject
  }
}
