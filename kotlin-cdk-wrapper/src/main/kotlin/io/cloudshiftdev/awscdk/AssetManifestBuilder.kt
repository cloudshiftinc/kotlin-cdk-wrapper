@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.cloud_assembly_schema.AssetManifestOptions
import io.cloudshiftdev.awscdk.cloud_assembly_schema.DockerImageDestination
import io.cloudshiftdev.awscdk.cloud_assembly_schema.DockerImageSource
import io.cloudshiftdev.awscdk.cloud_assembly_schema.FileDestination
import io.cloudshiftdev.awscdk.cloud_assembly_schema.FileSource
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
public open class AssetManifestBuilder(
  cdkObject: software.amazon.awscdk.AssetManifestBuilder,
) : CdkObject(cdkObject) {
  public constructor() : this(software.amazon.awscdk.AssetManifestBuilder()
  )

  /**
   * Add a docker asset source and destination to the manifest.
   *
   * sourceHash should be unique for every source.
   *
   * @param stack 
   * @param sourceHash 
   * @param source 
   * @param dest 
   * @param options
   */
  public open fun addDockerImageAsset(
    stack: Stack,
    sourceHash: String,
    source: DockerImageSource,
    dest: DockerImageDestination,
  ): DockerImageDestination = unwrap(this).addDockerImageAsset(stack.let(Stack.Companion::unwrap),
      sourceHash, source.let(DockerImageSource.Companion::unwrap),
      dest.let(DockerImageDestination.Companion::unwrap)).let(DockerImageDestination::wrap)

  /**
   * Add a docker asset source and destination to the manifest.
   *
   * sourceHash should be unique for every source.
   *
   * @param stack 
   * @param sourceHash 
   * @param source 
   * @param dest 
   * @param options
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("54e5456fa066f79fbad9029e272e9bf9de8aad90e1195836eeb7243fb908e06d")
  public open fun addDockerImageAsset(
    stack: Stack,
    sourceHash: String,
    source: DockerImageSource,
    dest: DockerImageDestination.Builder.() -> Unit,
  ): DockerImageDestination = addDockerImageAsset(stack, sourceHash, source,
      DockerImageDestination(dest))

  /**
   * Add a docker asset source and destination to the manifest.
   *
   * sourceHash should be unique for every source.
   *
   * @param stack 
   * @param sourceHash 
   * @param source 
   * @param dest 
   * @param options
   */
  public open fun addDockerImageAsset(
    stack: Stack,
    sourceHash: String,
    source: DockerImageSource,
    dest: DockerImageDestination,
    options: AddDockerImageAssetOptions,
  ): DockerImageDestination = unwrap(this).addDockerImageAsset(stack.let(Stack.Companion::unwrap),
      sourceHash, source.let(DockerImageSource.Companion::unwrap),
      dest.let(DockerImageDestination.Companion::unwrap),
      options.let(AddDockerImageAssetOptions.Companion::unwrap)).let(DockerImageDestination::wrap)

  /**
   * Add a docker asset source and destination to the manifest.
   *
   * sourceHash should be unique for every source.
   *
   * @param stack 
   * @param sourceHash 
   * @param source 
   * @param dest 
   * @param options
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("2c406616eeedc81e6489c47d1205f7083521737d0227b8b5f0bfa5d413b2832f")
  public open fun addDockerImageAsset(
    stack: Stack,
    sourceHash: String,
    source: DockerImageSource,
    dest: DockerImageDestination,
    options: AddDockerImageAssetOptions.Builder.() -> Unit,
  ): DockerImageDestination = addDockerImageAsset(stack, sourceHash, source, dest,
      AddDockerImageAssetOptions(options))

  /**
   * Add a file asset source and destination to the manifest.
   *
   * sourceHash should be unique for every source.
   *
   * @param stack 
   * @param sourceHash 
   * @param source 
   * @param dest 
   * @param options
   */
  public open fun addFileAsset(
    stack: Stack,
    sourceHash: String,
    source: FileSource,
    dest: FileDestination,
  ): FileDestination = unwrap(this).addFileAsset(stack.let(Stack.Companion::unwrap), sourceHash,
      source.let(FileSource.Companion::unwrap),
      dest.let(FileDestination.Companion::unwrap)).let(FileDestination::wrap)

  /**
   * Add a file asset source and destination to the manifest.
   *
   * sourceHash should be unique for every source.
   *
   * @param stack 
   * @param sourceHash 
   * @param source 
   * @param dest 
   * @param options
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("72eafdc567a6181964439383b6bcd3ce562703282a903f7cc6a2231e57a363a5")
  public open fun addFileAsset(
    stack: Stack,
    sourceHash: String,
    source: FileSource,
    dest: FileDestination.Builder.() -> Unit,
  ): FileDestination = addFileAsset(stack, sourceHash, source, FileDestination(dest))

  /**
   * Add a file asset source and destination to the manifest.
   *
   * sourceHash should be unique for every source.
   *
   * @param stack 
   * @param sourceHash 
   * @param source 
   * @param dest 
   * @param options
   */
  public open fun addFileAsset(
    stack: Stack,
    sourceHash: String,
    source: FileSource,
    dest: FileDestination,
    options: AddFileAssetOptions,
  ): FileDestination = unwrap(this).addFileAsset(stack.let(Stack.Companion::unwrap), sourceHash,
      source.let(FileSource.Companion::unwrap), dest.let(FileDestination.Companion::unwrap),
      options.let(AddFileAssetOptions.Companion::unwrap)).let(FileDestination::wrap)

  /**
   * Add a file asset source and destination to the manifest.
   *
   * sourceHash should be unique for every source.
   *
   * @param stack 
   * @param sourceHash 
   * @param source 
   * @param dest 
   * @param options
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("706ed314809ced139fd428ef662abb476709c7ec8f3c29362d1f21fefe13e5e8")
  public open fun addFileAsset(
    stack: Stack,
    sourceHash: String,
    source: FileSource,
    dest: FileDestination,
    options: AddFileAssetOptions.Builder.() -> Unit,
  ): FileDestination = addFileAsset(stack, sourceHash, source, dest, AddFileAssetOptions(options))

  /**
   * Add a docker image asset to the manifest with default settings.
   *
   * Derive the region from the stack, use the asset hash as the key, and set the prefix.
   *
   * @param stack 
   * @param asset 
   * @param target 
   * @param options
   */
  public open fun defaultAddDockerImageAsset(
    stack: Stack,
    asset: DockerImageAssetSource,
    target: AssetManifestDockerImageDestination,
  ): DockerImageDestination =
      unwrap(this).defaultAddDockerImageAsset(stack.let(Stack.Companion::unwrap),
      asset.let(DockerImageAssetSource.Companion::unwrap),
      target.let(AssetManifestDockerImageDestination.Companion::unwrap)).let(DockerImageDestination::wrap)

  /**
   * Add a docker image asset to the manifest with default settings.
   *
   * Derive the region from the stack, use the asset hash as the key, and set the prefix.
   *
   * @param stack 
   * @param asset 
   * @param target 
   * @param options
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("58c402a5954ad544e84d12adade7f63acaa16f1da034b40517699778b7c0cfc0")
  public open fun defaultAddDockerImageAsset(
    stack: Stack,
    asset: DockerImageAssetSource,
    target: AssetManifestDockerImageDestination.Builder.() -> Unit,
  ): DockerImageDestination = defaultAddDockerImageAsset(stack, asset,
      AssetManifestDockerImageDestination(target))

  /**
   * Add a docker image asset to the manifest with default settings.
   *
   * Derive the region from the stack, use the asset hash as the key, and set the prefix.
   *
   * @param stack 
   * @param asset 
   * @param target 
   * @param options
   */
  public open fun defaultAddDockerImageAsset(
    stack: Stack,
    asset: DockerImageAssetSource,
    target: AssetManifestDockerImageDestination,
    options: AddDockerImageAssetOptions,
  ): DockerImageDestination =
      unwrap(this).defaultAddDockerImageAsset(stack.let(Stack.Companion::unwrap),
      asset.let(DockerImageAssetSource.Companion::unwrap),
      target.let(AssetManifestDockerImageDestination.Companion::unwrap),
      options.let(AddDockerImageAssetOptions.Companion::unwrap)).let(DockerImageDestination::wrap)

  /**
   * Add a docker image asset to the manifest with default settings.
   *
   * Derive the region from the stack, use the asset hash as the key, and set the prefix.
   *
   * @param stack 
   * @param asset 
   * @param target 
   * @param options
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("898d96b46b7559e80d35f328e4f1ef9270cdf12f8749d58eac9da1b811f730c2")
  public open fun defaultAddDockerImageAsset(
    stack: Stack,
    asset: DockerImageAssetSource,
    target: AssetManifestDockerImageDestination,
    options: AddDockerImageAssetOptions.Builder.() -> Unit,
  ): DockerImageDestination = defaultAddDockerImageAsset(stack, asset, target,
      AddDockerImageAssetOptions(options))

  /**
   * Add a file asset to the manifest with default settings.
   *
   * Derive the region from the stack, use the asset hash as the key, copy the
   * file extension over, and set the prefix.
   *
   * @param stack 
   * @param asset 
   * @param target 
   * @param options
   */
  public open fun defaultAddFileAsset(
    stack: Stack,
    asset: FileAssetSource,
    target: AssetManifestFileDestination,
  ): FileDestination = unwrap(this).defaultAddFileAsset(stack.let(Stack.Companion::unwrap),
      asset.let(FileAssetSource.Companion::unwrap),
      target.let(AssetManifestFileDestination.Companion::unwrap)).let(FileDestination::wrap)

  /**
   * Add a file asset to the manifest with default settings.
   *
   * Derive the region from the stack, use the asset hash as the key, copy the
   * file extension over, and set the prefix.
   *
   * @param stack 
   * @param asset 
   * @param target 
   * @param options
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3af534afd81e127cca714111a29fd8dba3b9212966d3d315a30f50db18276d88")
  public open fun defaultAddFileAsset(
    stack: Stack,
    asset: FileAssetSource,
    target: AssetManifestFileDestination.Builder.() -> Unit,
  ): FileDestination = defaultAddFileAsset(stack, asset, AssetManifestFileDestination(target))

  /**
   * Add a file asset to the manifest with default settings.
   *
   * Derive the region from the stack, use the asset hash as the key, copy the
   * file extension over, and set the prefix.
   *
   * @param stack 
   * @param asset 
   * @param target 
   * @param options
   */
  public open fun defaultAddFileAsset(
    stack: Stack,
    asset: FileAssetSource,
    target: AssetManifestFileDestination,
    options: AddFileAssetOptions,
  ): FileDestination = unwrap(this).defaultAddFileAsset(stack.let(Stack.Companion::unwrap),
      asset.let(FileAssetSource.Companion::unwrap),
      target.let(AssetManifestFileDestination.Companion::unwrap),
      options.let(AddFileAssetOptions.Companion::unwrap)).let(FileDestination::wrap)

  /**
   * Add a file asset to the manifest with default settings.
   *
   * Derive the region from the stack, use the asset hash as the key, copy the
   * file extension over, and set the prefix.
   *
   * @param stack 
   * @param asset 
   * @param target 
   * @param options
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("314771ea5dbac2482f722a49f3a864011d9b93af4828a39e178b71e70e7bbc75")
  public open fun defaultAddFileAsset(
    stack: Stack,
    asset: FileAssetSource,
    target: AssetManifestFileDestination,
    options: AddFileAssetOptions.Builder.() -> Unit,
  ): FileDestination = defaultAddFileAsset(stack, asset, target, AddFileAssetOptions(options))

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
      unwrap(this).emitManifest(stack.let(Stack.Companion::unwrap),
      session.let(ISynthesisSession.Companion::unwrap))

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
  ): String = unwrap(this).emitManifest(stack.let(Stack.Companion::unwrap),
      session.let(ISynthesisSession.Companion::unwrap),
      options.let(AssetManifestOptions.Companion::unwrap))

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
  @JvmName("232b13ecbf611c0b0a19d1341a4d3b360e7053f02c66b171f602813eaf291858")
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
  ): String = unwrap(this).emitManifest(stack.let(Stack.Companion::unwrap),
      session.let(ISynthesisSession.Companion::unwrap),
      options.let(AssetManifestOptions.Companion::unwrap), dependencies)

  /**
   * Whether there are any assets registered in the manifest.
   */
  public open fun hasAssets(): Boolean = unwrap(this).getHasAssets()

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.AssetManifestBuilder): AssetManifestBuilder
        = AssetManifestBuilder(cdkObject)

    internal fun unwrap(wrapped: AssetManifestBuilder): software.amazon.awscdk.AssetManifestBuilder
        = wrapped.cdkObject as software.amazon.awscdk.AssetManifestBuilder
  }
}
