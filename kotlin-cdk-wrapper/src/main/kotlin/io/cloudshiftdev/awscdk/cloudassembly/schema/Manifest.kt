@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cloudassembly.schema

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Protocol utility class.
 */
public open class Manifest(
  cdkObject: software.amazon.awscdk.cloudassembly.schema.Manifest,
) : CdkObject(cdkObject) {
  public companion object {
    public fun loadAssemblyManifest(filePath: String): AssemblyManifest =
        software.amazon.awscdk.cloudassembly.schema.Manifest.loadAssemblyManifest(filePath).let(AssemblyManifest::wrap)

    public fun loadAssemblyManifest(filePath: String, options: LoadManifestOptions):
        AssemblyManifest =
        software.amazon.awscdk.cloudassembly.schema.Manifest.loadAssemblyManifest(filePath,
        options.let(LoadManifestOptions::unwrap)).let(AssemblyManifest::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1575cc5d564d7ee8a1e46bf56062264175e0f212de5913b209ebf22d560edb8b")
    public fun loadAssemblyManifest(filePath: String,
        options: LoadManifestOptions.Builder.() -> Unit): AssemblyManifest =
        loadAssemblyManifest(filePath, LoadManifestOptions(options))

    public fun loadAssetManifest(filePath: String): AssetManifest =
        software.amazon.awscdk.cloudassembly.schema.Manifest.loadAssetManifest(filePath).let(AssetManifest::wrap)

    public fun loadIntegManifest(filePath: String): IntegManifest =
        software.amazon.awscdk.cloudassembly.schema.Manifest.loadIntegManifest(filePath).let(IntegManifest::wrap)

    public fun saveAssemblyManifest(manifest: AssemblyManifest, filePath: String) {
      software.amazon.awscdk.cloudassembly.schema.Manifest.saveAssemblyManifest(manifest.let(AssemblyManifest::unwrap),
          filePath)
    }

    public fun saveAssetManifest(manifest: AssetManifest, filePath: String) {
      software.amazon.awscdk.cloudassembly.schema.Manifest.saveAssetManifest(manifest.let(AssetManifest::unwrap),
          filePath)
    }

    public fun saveIntegManifest(manifest: IntegManifest, filePath: String) {
      software.amazon.awscdk.cloudassembly.schema.Manifest.saveIntegManifest(manifest.let(IntegManifest::unwrap),
          filePath)
    }

    public fun version(): String = software.amazon.awscdk.cloudassembly.schema.Manifest.version()

    internal fun wrap(cdkObject: software.amazon.awscdk.cloudassembly.schema.Manifest): Manifest =
        Manifest(cdkObject)

    internal fun unwrap(wrapped: Manifest): software.amazon.awscdk.cloudassembly.schema.Manifest =
        wrapped.cdkObject as software.amazon.awscdk.cloudassembly.schema.Manifest
  }
}
