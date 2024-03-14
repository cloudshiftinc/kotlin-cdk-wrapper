package io.cloudshiftdev.awscdk.services.ecr.assets

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IgnoreMode
import io.cloudshiftdev.awscdk.SymlinkFollowMode
import io.cloudshiftdev.awscdk.services.ecr.IRepository
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class DockerImageAsset internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ecr.assets.DockerImageAsset,
) : CloudshiftdevConstructsConstruct(cdkObject) {
  public open fun addResourceMetadata(resource: CfnResource, resourceProperty: String) {
    unwrap(this).addResourceMetadata(resource.let(CfnResource::unwrap), resourceProperty)
  }

  public open fun assetHash(): String = unwrap(this).getAssetHash()

  public open fun imageTag(): String = unwrap(this).getImageTag()

  public open fun imageUri(): String = unwrap(this).getImageUri()

  public open fun imageUri(`value`: String) {
    unwrap(this).setImageUri(`value`)
  }

  public open fun repository(): IRepository = unwrap(this).getRepository().let(IRepository::wrap)

  public open fun repository(`value`: IRepository) {
    unwrap(this).setRepository(`value`.let(IRepository::unwrap))
  }

  public interface Builder {
    public fun assetName(assetName: String)

    public fun buildArgs(buildArgs: Map<String, String>)

    public fun buildSecrets(buildSecrets: Map<String, String>)

    public fun buildSsh(buildSsh: String)

    public fun cacheDisabled(cacheDisabled: Boolean)

    public fun cacheFrom(cacheFrom: List<DockerCacheOption>)

    public fun cacheTo(cacheTo: DockerCacheOption)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("55a8bc6aaf46f20b979662bf52ea903702deb987f1444eb38425bc78da79a0e9")
    public fun cacheTo(cacheTo: DockerCacheOption.Builder.() -> Unit)

    public fun directory(directory: String)

    public fun exclude(exclude: List<String>)

    public fun extraHash(extraHash: String)

    public fun `file`(`file`: String)

    public fun followSymlinks(followSymlinks: SymlinkFollowMode)

    public fun ignoreMode(ignoreMode: IgnoreMode)

    public fun invalidation(invalidation: DockerImageAssetInvalidationOptions)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ba7e582cb180be1f52bef86d2d258e1e348d4f6d030ec88401700b2186152039")
    public fun invalidation(invalidation: DockerImageAssetInvalidationOptions.Builder.() -> Unit)

    public fun networkMode(networkMode: NetworkMode)

    public fun outputs(outputs: List<String>)

    public fun platform(platform: Platform)

    public fun target(target: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecr.assets.DockerImageAsset.Builder =
        software.amazon.awscdk.services.ecr.assets.DockerImageAsset.Builder.create(scope, id)

    override fun assetName(assetName: String) {
      cdkBuilder.assetName(assetName)
    }

    override fun buildArgs(buildArgs: Map<String, String>) {
      cdkBuilder.buildArgs(buildArgs)
    }

    override fun buildSecrets(buildSecrets: Map<String, String>) {
      cdkBuilder.buildSecrets(buildSecrets)
    }

    override fun buildSsh(buildSsh: String) {
      cdkBuilder.buildSsh(buildSsh)
    }

    override fun cacheDisabled(cacheDisabled: Boolean) {
      cdkBuilder.cacheDisabled(cacheDisabled)
    }

    override fun cacheFrom(cacheFrom: List<DockerCacheOption>) {
      cdkBuilder.cacheFrom(cacheFrom.map(DockerCacheOption::unwrap))
    }

    override fun cacheTo(cacheTo: DockerCacheOption) {
      cdkBuilder.cacheTo(cacheTo.let(DockerCacheOption::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("55a8bc6aaf46f20b979662bf52ea903702deb987f1444eb38425bc78da79a0e9")
    override fun cacheTo(cacheTo: DockerCacheOption.Builder.() -> Unit): Unit =
        cacheTo(DockerCacheOption(cacheTo))

    override fun directory(directory: String) {
      cdkBuilder.directory(directory)
    }

    override fun exclude(exclude: List<String>) {
      cdkBuilder.exclude(exclude)
    }

    override fun extraHash(extraHash: String) {
      cdkBuilder.extraHash(extraHash)
    }

    override fun `file`(`file`: String) {
      cdkBuilder.`file`(`file`)
    }

    override fun followSymlinks(followSymlinks: SymlinkFollowMode) {
      cdkBuilder.followSymlinks(followSymlinks.let(SymlinkFollowMode::unwrap))
    }

    override fun ignoreMode(ignoreMode: IgnoreMode) {
      cdkBuilder.ignoreMode(ignoreMode.let(IgnoreMode::unwrap))
    }

    override fun invalidation(invalidation: DockerImageAssetInvalidationOptions) {
      cdkBuilder.invalidation(invalidation.let(DockerImageAssetInvalidationOptions::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ba7e582cb180be1f52bef86d2d258e1e348d4f6d030ec88401700b2186152039")
    override fun invalidation(invalidation: DockerImageAssetInvalidationOptions.Builder.() -> Unit):
        Unit = invalidation(DockerImageAssetInvalidationOptions(invalidation))

    override fun networkMode(networkMode: NetworkMode) {
      cdkBuilder.networkMode(networkMode.let(NetworkMode::unwrap))
    }

    override fun outputs(outputs: List<String>) {
      cdkBuilder.outputs(outputs)
    }

    override fun platform(platform: Platform) {
      cdkBuilder.platform(platform.let(Platform::unwrap))
    }

    override fun target(target: String) {
      cdkBuilder.target(target)
    }

    public fun build(): software.amazon.awscdk.services.ecr.assets.DockerImageAsset =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): DockerImageAsset {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return DockerImageAsset(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecr.assets.DockerImageAsset):
        DockerImageAsset = DockerImageAsset(cdkObject)

    internal fun unwrap(wrapped: DockerImageAsset):
        software.amazon.awscdk.services.ecr.assets.DockerImageAsset = wrapped.cdkObject
  }
}
