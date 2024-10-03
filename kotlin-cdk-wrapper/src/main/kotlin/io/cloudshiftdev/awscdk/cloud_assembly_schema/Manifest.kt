@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cloud_assembly_schema

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Protocol utility class.
 */
public open class Manifest(
  cdkObject: software.amazon.awscdk.cloud_assembly_schema.Manifest,
) : CdkObject(cdkObject) {
  public companion object {
    public fun loadAssemblyManifest(filePath: String): AssemblyManifest =
        software.amazon.awscdk.cloud_assembly_schema.Manifest.loadAssemblyManifest(filePath).let(AssemblyManifest::wrap)

    public fun loadAssemblyManifest(filePath: String, options: LoadManifestOptions):
        AssemblyManifest =
        software.amazon.awscdk.cloud_assembly_schema.Manifest.loadAssemblyManifest(filePath,
        options.let(LoadManifestOptions.Companion::unwrap)).let(AssemblyManifest::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("24846e6ab1d65096878f923e2386bc2b1a5581fa516cc3e23a1b8a8087c1c1df")
    public fun loadAssemblyManifest(filePath: String,
        options: LoadManifestOptions.Builder.() -> Unit): AssemblyManifest =
        loadAssemblyManifest(filePath, LoadManifestOptions(options))

    public fun loadAssetManifest(filePath: String): AssetManifest =
        software.amazon.awscdk.cloud_assembly_schema.Manifest.loadAssetManifest(filePath).let(AssetManifest::wrap)

    public fun loadIntegManifest(filePath: String): IntegManifest =
        software.amazon.awscdk.cloud_assembly_schema.Manifest.loadIntegManifest(filePath).let(IntegManifest::wrap)

    public fun saveAssemblyManifest(manifest: AssemblyManifest, filePath: String) {
      software.amazon.awscdk.cloud_assembly_schema.Manifest.saveAssemblyManifest(manifest.let(AssemblyManifest.Companion::unwrap),
          filePath)
    }

    public fun saveAssetManifest(manifest: AssetManifest, filePath: String) {
      software.amazon.awscdk.cloud_assembly_schema.Manifest.saveAssetManifest(manifest.let(AssetManifest.Companion::unwrap),
          filePath)
    }

    public fun saveIntegManifest(manifest: IntegManifest, filePath: String) {
      software.amazon.awscdk.cloud_assembly_schema.Manifest.saveIntegManifest(manifest.let(IntegManifest.Companion::unwrap),
          filePath)
    }

    public fun version(): String = software.amazon.awscdk.cloud_assembly_schema.Manifest.version()

    internal fun wrap(cdkObject: software.amazon.awscdk.cloud_assembly_schema.Manifest): Manifest =
        Manifest(cdkObject)

    internal fun unwrap(wrapped: Manifest): software.amazon.awscdk.cloud_assembly_schema.Manifest =
        wrapped.cdkObject as software.amazon.awscdk.cloud_assembly_schema.Manifest
  }
}
