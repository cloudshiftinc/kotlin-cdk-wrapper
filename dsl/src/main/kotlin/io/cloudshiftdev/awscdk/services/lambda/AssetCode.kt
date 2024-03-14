package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.AssetHashType
import io.cloudshiftdev.awscdk.BundlingOptions
import io.cloudshiftdev.awscdk.CfnResource
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
  private val cdkObject: software.amazon.awscdk.services.lambda.AssetCode,
) : Code(cdkObject) {
  public override fun bind(scope: Construct): CodeConfig =
      unwrap(this).bind(scope.let(Construct::unwrap)).let(CodeConfig::wrap)

  public override fun bindToResource(resource: CfnResource) {
    unwrap(this).bindToResource(resource.let(CfnResource::unwrap))
  }

  public override fun bindToResource(resource: CfnResource, options: ResourceBindOptions) {
    unwrap(this).bindToResource(resource.let(CfnResource::unwrap),
        options.let(ResourceBindOptions::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("83fd80fe1e3901a0f5645c4dd596ca04d5fabc7f1c05c24fc53008c232b144f1")
  public override fun bindToResource(resource: CfnResource,
      options: ResourceBindOptions.Builder.() -> Unit): Unit = bindToResource(resource,
      ResourceBindOptions(options))

  public open fun isInline(): Boolean = unwrap(this).getIsInline()

  public open fun path(): String = unwrap(this).getPath()

  public interface Builder {
    public fun assetHash(assetHash: String) {
    }

    public fun assetHashType(assetHashType: AssetHashType) {
    }

    public fun bundling(bundling: BundlingOptions) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("45c32cd646bf4fefc062e00a068fef11817bbd18cc6584ac8a1bbe8d95d5b0e2")
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
    private val cdkBuilder: software.amazon.awscdk.services.lambda.AssetCode.Builder =
        software.amazon.awscdk.services.lambda.AssetCode.Builder.create(path)

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
    @JvmName("45c32cd646bf4fefc062e00a068fef11817bbd18cc6584ac8a1bbe8d95d5b0e2")
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

    public fun build(): software.amazon.awscdk.services.lambda.AssetCode = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(path: String, block: Builder.() -> Unit = {}): AssetCode {
      val builderImpl = BuilderImpl(path)
      return AssetCode(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.AssetCode): AssetCode =
        AssetCode(cdkObject)

    internal fun unwrap(wrapped: AssetCode): software.amazon.awscdk.services.lambda.AssetCode =
        wrapped.cdkObject
  }
}
