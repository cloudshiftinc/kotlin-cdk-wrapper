package io.cloudshiftdev.awscdk.services.apigateway

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

public open class AssetApiDefinition internal constructor(
  private val cdkObject: software.amazon.awscdk.services.apigateway.AssetApiDefinition,
) : ApiDefinition(cdkObject) {
  public override fun bind(scope: Construct): ApiDefinitionConfig =
      unwrap(this).bind(scope.let(Construct::unwrap)).let(ApiDefinitionConfig::wrap)

  public override fun bindAfterCreate(scope: Construct, restApi: IRestApi) {
    unwrap(this).bindAfterCreate(scope.let(Construct::unwrap), restApi.let(IRestApi::unwrap))
  }

  public interface Builder {
    public fun assetHash(assetHash: String)

    public fun assetHashType(assetHashType: AssetHashType)

    public fun bundling(bundling: BundlingOptions)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5762edf749046903d7d4cfdc9042b96ec5afcfc4bea007a5849459e6f65f084c")
    public fun bundling(bundling: BundlingOptions.Builder.() -> Unit)

    public fun deployTime(deployTime: Boolean)

    public fun exclude(exclude: List<String>)

    public fun exclude(vararg exclude: String)

    public fun followSymlinks(followSymlinks: SymlinkFollowMode)

    public fun ignoreMode(ignoreMode: IgnoreMode)

    public fun readers(readers: List<IGrantable>)

    public fun readers(vararg readers: IGrantable)
  }

  private class BuilderImpl(
    path: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.AssetApiDefinition.Builder =
        software.amazon.awscdk.services.apigateway.AssetApiDefinition.Builder.create(path)

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
    @JvmName("5762edf749046903d7d4cfdc9042b96ec5afcfc4bea007a5849459e6f65f084c")
    override fun bundling(bundling: BundlingOptions.Builder.() -> Unit): Unit =
        bundling(BundlingOptions(bundling))

    override fun deployTime(deployTime: Boolean) {
      cdkBuilder.deployTime(deployTime)
    }

    override fun exclude(exclude: List<String>) {
      cdkBuilder.exclude(exclude)
    }

    override fun exclude(vararg exclude: String): Unit = exclude(exclude.toList())

    override fun followSymlinks(followSymlinks: SymlinkFollowMode) {
      cdkBuilder.followSymlinks(followSymlinks.let(SymlinkFollowMode::unwrap))
    }

    override fun ignoreMode(ignoreMode: IgnoreMode) {
      cdkBuilder.ignoreMode(ignoreMode.let(IgnoreMode::unwrap))
    }

    override fun readers(readers: List<IGrantable>) {
      cdkBuilder.readers(readers.map(IGrantable::unwrap))
    }

    override fun readers(vararg readers: IGrantable): Unit = readers(readers.toList())

    public fun build(): software.amazon.awscdk.services.apigateway.AssetApiDefinition =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(path: String, block: Builder.() -> Unit = {}): AssetApiDefinition {
      val builderImpl = BuilderImpl(path)
      return AssetApiDefinition(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.AssetApiDefinition):
        AssetApiDefinition = AssetApiDefinition(cdkObject)

    internal fun unwrap(wrapped: AssetApiDefinition):
        software.amazon.awscdk.services.apigateway.AssetApiDefinition = wrapped.cdkObject
  }
}
