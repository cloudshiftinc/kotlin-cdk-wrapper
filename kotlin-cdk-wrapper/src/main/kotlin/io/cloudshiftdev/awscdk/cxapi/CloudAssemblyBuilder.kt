@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cxapi

import io.cloudshiftdev.awscdk.cloudassembly.schema.ArtifactManifest
import io.cloudshiftdev.awscdk.cloudassembly.schema.MissingContext
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public open class CloudAssemblyBuilder internal constructor(
  internal override val cdkObject: software.amazon.awscdk.cxapi.CloudAssemblyBuilder,
) : CdkObject(cdkObject) {
  public open fun addArtifact(id: String, manifest: ArtifactManifest) {
    unwrap(this).addArtifact(id, manifest.let(ArtifactManifest::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("675b01db8d9bf2a391afcf443b03d940a509db958d216804c5778d90668c7b97")
  public open fun addArtifact(id: String, manifest: ArtifactManifest.Builder.() -> Unit): Unit =
      addArtifact(id, ArtifactManifest(manifest))

  public open fun addMissing(missing: MissingContext) {
    unwrap(this).addMissing(missing.let(MissingContext::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f747fa8aecc81d1edab6dea64b6458f0d9e4cdba1a866f78ef4f1afe4d8cda56")
  public open fun addMissing(missing: MissingContext.Builder.() -> Unit): Unit =
      addMissing(MissingContext(missing))

  public open fun assetOutdir(): String = unwrap(this).getAssetOutdir()

  public open fun buildAssembly(): CloudAssembly =
      unwrap(this).buildAssembly().let(CloudAssembly::wrap)

  public open fun buildAssembly(options: AssemblyBuildOptions): CloudAssembly =
      unwrap(this).buildAssembly(options.let(AssemblyBuildOptions::unwrap)).let(CloudAssembly::wrap)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7e8dc94aec394b9c0819793c40ade96ea84e1a957c3c113b0059ee8ac6843e69")
  public open fun buildAssembly(options: AssemblyBuildOptions.Builder.() -> Unit): CloudAssembly =
      buildAssembly(AssemblyBuildOptions(options))

  public open fun createNestedAssembly(artifactId: String, displayName: String):
      CloudAssemblyBuilder = unwrap(this).createNestedAssembly(artifactId,
      displayName).let(CloudAssemblyBuilder::wrap)

  public open fun delete() {
    unwrap(this).delete()
  }

  public open fun outdir(): String = unwrap(this).getOutdir()

  @CdkDslMarker
  public interface Builder {
    public fun assetOutdir(assetOutdir: String)

    public fun parentBuilder(parentBuilder: CloudAssemblyBuilder)
  }

  private class BuilderImpl(
    outdir: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.cxapi.CloudAssemblyBuilder.Builder =
        software.amazon.awscdk.cxapi.CloudAssemblyBuilder.Builder.create(outdir)

    override fun assetOutdir(assetOutdir: String) {
      cdkBuilder.assetOutdir(assetOutdir)
    }

    override fun parentBuilder(parentBuilder: CloudAssemblyBuilder) {
      cdkBuilder.parentBuilder(parentBuilder.let(CloudAssemblyBuilder::unwrap))
    }

    public fun build(): software.amazon.awscdk.cxapi.CloudAssemblyBuilder = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(outdir: String, block: Builder.() -> Unit = {}):
        CloudAssemblyBuilder {
      val builderImpl = BuilderImpl(outdir)
      return CloudAssemblyBuilder(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.cxapi.CloudAssemblyBuilder):
        CloudAssemblyBuilder = CloudAssemblyBuilder(cdkObject)

    internal fun unwrap(wrapped: CloudAssemblyBuilder):
        software.amazon.awscdk.cxapi.CloudAssemblyBuilder = wrapped.cdkObject
  }
}
