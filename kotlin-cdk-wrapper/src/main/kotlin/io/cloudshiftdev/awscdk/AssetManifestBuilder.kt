@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.cloudassembly.schema.AssetManifestOptions
import io.cloudshiftdev.awscdk.cloudassembly.schema.DockerImageDestination
import io.cloudshiftdev.awscdk.cloudassembly.schema.DockerImageSource
import io.cloudshiftdev.awscdk.cloudassembly.schema.FileDestination
import io.cloudshiftdev.awscdk.cloudassembly.schema.FileSource
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Build an asset manifest from assets added to a stack.
 *
 * This class does not need to be used by app builders; it is only necessary for building Stack
 * Synthesizers.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * AssetManifestBuilder assetManifestBuilder = new AssetManifestBuilder();
 * ```
 */
public open class AssetManifestBuilder internal constructor(
  internal override val cdkObject: software.amazon.awscdk.AssetManifestBuilder,
) : CdkObject(cdkObject) {
  /**
   * Add a docker asset source and destination to the manifest.
   *
   * sourceHash should be unique for every source.
   *
   * @param stack 
   * @param sourceHash 
   * @param source 
   * @param dest 
   */
  public open fun addDockerImageAsset(
    stack: Stack,
    sourceHash: String,
    source: DockerImageSource,
    dest: DockerImageDestination,
  ): DockerImageDestination = unwrap(this).addDockerImageAsset(stack.let(Stack::unwrap), sourceHash,
      source.let(DockerImageSource::unwrap),
      dest.let(DockerImageDestination::unwrap)).let(DockerImageDestination::wrap)

  /**
   * Add a docker asset source and destination to the manifest.
   *
   * sourceHash should be unique for every source.
   *
   * @param stack 
   * @param sourceHash 
   * @param source 
   * @param dest 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("4e1edb95420b1cc4bc59bd1462cbbeac5654f4c6b50d919d3e5a3e7b82595099")
  public open fun addDockerImageAsset(
    stack: Stack,
    sourceHash: String,
    source: DockerImageSource,
    dest: DockerImageDestination.Builder.() -> Unit,
  ): DockerImageDestination = addDockerImageAsset(stack, sourceHash, source,
      DockerImageDestination(dest))

  /**
   * Add a file asset source and destination to the manifest.
   *
   * sourceHash should be unique for every source.
   *
   * @param stack 
   * @param sourceHash 
   * @param source 
   * @param dest 
   */
  public open fun addFileAsset(
    stack: Stack,
    sourceHash: String,
    source: FileSource,
    dest: FileDestination,
  ): FileDestination = unwrap(this).addFileAsset(stack.let(Stack::unwrap), sourceHash,
      source.let(FileSource::unwrap), dest.let(FileDestination::unwrap)).let(FileDestination::wrap)

  /**
   * Add a file asset source and destination to the manifest.
   *
   * sourceHash should be unique for every source.
   *
   * @param stack 
   * @param sourceHash 
   * @param source 
   * @param dest 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("afa728084935ca1ca8ec5a2a0d7affe349e6fa27eac23ff1b496c72cee9e5a36")
  public open fun addFileAsset(
    stack: Stack,
    sourceHash: String,
    source: FileSource,
    dest: FileDestination.Builder.() -> Unit,
  ): FileDestination = addFileAsset(stack, sourceHash, source, FileDestination(dest))

  /**
   * Add a docker image asset to the manifest with default settings.
   *
   * Derive the region from the stack, use the asset hash as the key, and set the prefix.
   *
   * @param stack 
   * @param asset 
   * @param target 
   */
  public open fun defaultAddDockerImageAsset(
    stack: Stack,
    asset: DockerImageAssetSource,
    target: AssetManifestDockerImageDestination,
  ): DockerImageDestination = unwrap(this).defaultAddDockerImageAsset(stack.let(Stack::unwrap),
      asset.let(DockerImageAssetSource::unwrap),
      target.let(AssetManifestDockerImageDestination::unwrap)).let(DockerImageDestination::wrap)

  /**
   * Add a docker image asset to the manifest with default settings.
   *
   * Derive the region from the stack, use the asset hash as the key, and set the prefix.
   *
   * @param stack 
   * @param asset 
   * @param target 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("8b4071378ed8a6722e86a3ca17715f5b4c14db29188a7ef32d099c2276b7db74")
  public open fun defaultAddDockerImageAsset(
    stack: Stack,
    asset: DockerImageAssetSource,
    target: AssetManifestDockerImageDestination.Builder.() -> Unit,
  ): DockerImageDestination = defaultAddDockerImageAsset(stack, asset,
      AssetManifestDockerImageDestination(target))

  /**
   * Add a file asset to the manifest with default settings.
   *
   * Derive the region from the stack, use the asset hash as the key, copy the
   * file extension over, and set the prefix.
   *
   * @param stack 
   * @param asset 
   * @param target 
   */
  public open fun defaultAddFileAsset(
    stack: Stack,
    asset: FileAssetSource,
    target: AssetManifestFileDestination,
  ): FileDestination = unwrap(this).defaultAddFileAsset(stack.let(Stack::unwrap),
      asset.let(FileAssetSource::unwrap),
      target.let(AssetManifestFileDestination::unwrap)).let(FileDestination::wrap)

  /**
   * Add a file asset to the manifest with default settings.
   *
   * Derive the region from the stack, use the asset hash as the key, copy the
   * file extension over, and set the prefix.
   *
   * @param stack 
   * @param asset 
   * @param target 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("da70fe31f1f903fedb3877c6896aa4ef53c6bb6d46fdbda3b083aabd79164f34")
  public open fun defaultAddFileAsset(
    stack: Stack,
    asset: FileAssetSource,
    target: AssetManifestFileDestination.Builder.() -> Unit,
  ): FileDestination = defaultAddFileAsset(stack, asset, AssetManifestFileDestination(target))

  /**
   * Write the manifest to disk, and add it to the synthesis session.
   *
   * Return the artifact id, which should be added to the `additionalDependencies`
   * field of the stack artifact.
   *
   * @param stack 
   * @param session 
   * @param options
   * @param dependencies
   */
  public open fun emitManifest(stack: Stack, session: ISynthesisSession): String =
      unwrap(this).emitManifest(stack.let(Stack::unwrap), session.let(ISynthesisSession::unwrap))

  /**
   * Write the manifest to disk, and add it to the synthesis session.
   *
   * Return the artifact id, which should be added to the `additionalDependencies`
   * field of the stack artifact.
   *
   * @param stack 
   * @param session 
   * @param options
   * @param dependencies
   */
  public open fun emitManifest(
    stack: Stack,
    session: ISynthesisSession,
    options: AssetManifestOptions,
  ): String = unwrap(this).emitManifest(stack.let(Stack::unwrap),
      session.let(ISynthesisSession::unwrap), options.let(AssetManifestOptions::unwrap))

  /**
   * Write the manifest to disk, and add it to the synthesis session.
   *
   * Return the artifact id, which should be added to the `additionalDependencies`
   * field of the stack artifact.
   *
   * @param stack 
   * @param session 
   * @param options
   * @param dependencies
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("cbf9b00226266766a573f3d537da4f8f6df03d9cb32b6699f98aefcec180af75")
  public open fun emitManifest(
    stack: Stack,
    session: ISynthesisSession,
    options: AssetManifestOptions.Builder.() -> Unit,
  ): String = emitManifest(stack, session, AssetManifestOptions(options))

  /**
   * Write the manifest to disk, and add it to the synthesis session.
   *
   * Return the artifact id, which should be added to the `additionalDependencies`
   * field of the stack artifact.
   *
   * @param stack 
   * @param session 
   * @param options
   * @param dependencies
   */
  public open fun emitManifest(
    stack: Stack,
    session: ISynthesisSession,
    options: AssetManifestOptions,
    dependencies: List<String>,
  ): String = unwrap(this).emitManifest(stack.let(Stack::unwrap),
      session.let(ISynthesisSession::unwrap), options.let(AssetManifestOptions::unwrap),
      dependencies)

  /**
   * Whether there are any assets registered in the manifest.
   */
  public open fun hasAssets(): Boolean = unwrap(this).getHasAssets()

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.AssetManifestBuilder): AssetManifestBuilder
        = AssetManifestBuilder(cdkObject)

    internal fun unwrap(wrapped: AssetManifestBuilder): software.amazon.awscdk.AssetManifestBuilder
        = wrapped.cdkObject
  }
}
