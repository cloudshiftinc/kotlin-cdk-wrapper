package io.cloudshiftdev.awscdk.services.synthetics

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

public open class AssetCode internal constructor(
  private val cdkObject: software.amazon.awscdk.services.synthetics.AssetCode,
) : Code(cdkObject) {
  public override fun bind(
    scope: Construct,
    handler: String,
    family: RuntimeFamily,
  ): CodeConfig = unwrap(this).bind(scope.let(Construct::unwrap), handler,
      family.let(RuntimeFamily::unwrap)).let(CodeConfig::wrap)

  public interface Builder {
    public fun assetHash(assetHash: String)

    public fun assetHashType(assetHashType: AssetHashType)

    public fun bundling(bundling: BundlingOptions)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("72f8efb02f641e96633817a459b8e3dbef70ec2dd149f3739e2374d84657e8ea")
    public fun bundling(bundling: BundlingOptions.Builder.() -> Unit)

    public fun deployTime(deployTime: Boolean)

    public fun exclude(exclude: List<String>)

    public fun followSymlinks(followSymlinks: SymlinkFollowMode)

    public fun ignoreMode(ignoreMode: IgnoreMode)

    public fun readers(readers: List<IGrantable>)
  }

  private class BuilderImpl(
    assetPath: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.synthetics.AssetCode.Builder =
        software.amazon.awscdk.services.synthetics.AssetCode.Builder.create(assetPath)

    override fun assetHash(assetHash: String) {
      cdkBuilder.assetHash(assetHash)
    }

    override fun assetHashType(assetHashType: AssetHashType) {
      cdkBuilder.assetHashType(assetHashType.let(AssetHashType::unwrap))
    }

    override fun bundling(bundling: BundlingOptions) {
      cdkBuilder.bundling(bundling.let(BundlingOptions::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("72f8efb02f641e96633817a459b8e3dbef70ec2dd149f3739e2374d84657e8ea")
    override fun bundling(bundling: BundlingOptions.Builder.() -> Unit): Unit =
        bundling(BundlingOptions(bundling))

    override fun deployTime(deployTime: Boolean) {
      cdkBuilder.deployTime(deployTime)
    }

    override fun exclude(exclude: List<String>) {
      cdkBuilder.exclude(exclude)
    }

    override fun followSymlinks(followSymlinks: SymlinkFollowMode) {
      cdkBuilder.followSymlinks(followSymlinks.let(SymlinkFollowMode::unwrap))
    }

    override fun ignoreMode(ignoreMode: IgnoreMode) {
      cdkBuilder.ignoreMode(ignoreMode.let(IgnoreMode::unwrap))
    }

    override fun readers(readers: List<IGrantable>) {
      cdkBuilder.readers(readers.map(IGrantable::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.synthetics.AssetCode = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(assetPath: String, block: Builder.() -> Unit = {}): AssetCode {
      val builderImpl = BuilderImpl(assetPath)
      return AssetCode(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.synthetics.AssetCode): AssetCode =
        AssetCode(cdkObject)

    internal fun unwrap(wrapped: AssetCode): software.amazon.awscdk.services.synthetics.AssetCode =
        wrapped.cdkObject
  }
}
