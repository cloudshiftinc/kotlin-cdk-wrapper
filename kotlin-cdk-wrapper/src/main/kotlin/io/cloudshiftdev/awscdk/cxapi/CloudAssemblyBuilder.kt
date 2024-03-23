@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cxapi

import io.cloudshiftdev.awscdk.cloudassembly.schema.ArtifactManifest
import io.cloudshiftdev.awscdk.cloudassembly.schema.MissingContext
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Can be used to build a cloud assembly.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.cxapi.*;
 * CloudAssemblyBuilder cloudAssemblyBuilder_;
 * CloudAssemblyBuilder cloudAssemblyBuilder = CloudAssemblyBuilder.Builder.create("outdir")
 * .assetOutdir("assetOutdir")
 * .parentBuilder(cloudAssemblyBuilder_)
 * .build();
 * ```
 */
public open class CloudAssemblyBuilder(
  cdkObject: software.amazon.awscdk.cxapi.CloudAssemblyBuilder,
) : CdkObject(cdkObject) {
  public constructor() : this(software.amazon.awscdk.cxapi.CloudAssemblyBuilder()
  )

  public constructor(outdir: String) :
      this(software.amazon.awscdk.cxapi.CloudAssemblyBuilder(outdir)
  )

  public constructor(outdir: String, props: CloudAssemblyBuilderProps) :
      this(software.amazon.awscdk.cxapi.CloudAssemblyBuilder(outdir,
      props.let(CloudAssemblyBuilderProps::unwrap))
  )

  public constructor(outdir: String, props: CloudAssemblyBuilderProps.Builder.() -> Unit) :
      this(outdir, CloudAssemblyBuilderProps(props)
  )

  /**
   * Adds an artifact into the cloud assembly.
   *
   * @param id The ID of the artifact. 
   * @param manifest The artifact manifest. 
   */
  public open fun addArtifact(id: String, manifest: ArtifactManifest) {
    unwrap(this).addArtifact(id, manifest.let(ArtifactManifest::unwrap))
  }

  /**
   * Adds an artifact into the cloud assembly.
   *
   * @param id The ID of the artifact. 
   * @param manifest The artifact manifest. 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("675b01db8d9bf2a391afcf443b03d940a509db958d216804c5778d90668c7b97")
  public open fun addArtifact(id: String, manifest: ArtifactManifest.Builder.() -> Unit): Unit =
      addArtifact(id, ArtifactManifest(manifest))

  /**
   * Reports that some context is missing in order for this cloud assembly to be fully synthesized.
   *
   * @param missing Missing context information. 
   */
  public open fun addMissing(missing: MissingContext) {
    unwrap(this).addMissing(missing.let(MissingContext::unwrap))
  }

  /**
   * Reports that some context is missing in order for this cloud assembly to be fully synthesized.
   *
   * @param missing Missing context information. 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f747fa8aecc81d1edab6dea64b6458f0d9e4cdba1a866f78ef4f1afe4d8cda56")
  public open fun addMissing(missing: MissingContext.Builder.() -> Unit): Unit =
      addMissing(MissingContext(missing))

  /**
   * The directory where assets of this Cloud Assembly should be stored.
   */
  public open fun assetOutdir(): String = unwrap(this).getAssetOutdir()

  /**
   * Finalizes the cloud assembly into the output directory returns a `CloudAssembly` object that
   * can be used to inspect the assembly.
   *
   * @param options
   */
  public open fun buildAssembly(): CloudAssembly =
      unwrap(this).buildAssembly().let(CloudAssembly::wrap)

  /**
   * Finalizes the cloud assembly into the output directory returns a `CloudAssembly` object that
   * can be used to inspect the assembly.
   *
   * @param options
   */
  public open fun buildAssembly(options: AssemblyBuildOptions): CloudAssembly =
      unwrap(this).buildAssembly(options.let(AssemblyBuildOptions::unwrap)).let(CloudAssembly::wrap)

  /**
   * Finalizes the cloud assembly into the output directory returns a `CloudAssembly` object that
   * can be used to inspect the assembly.
   *
   * @param options
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7e8dc94aec394b9c0819793c40ade96ea84e1a957c3c113b0059ee8ac6843e69")
  public open fun buildAssembly(options: AssemblyBuildOptions.Builder.() -> Unit): CloudAssembly =
      buildAssembly(AssemblyBuildOptions(options))

  /**
   * Creates a nested cloud assembly.
   *
   * @param artifactId 
   * @param displayName 
   */
  public open fun createNestedAssembly(artifactId: String, displayName: String):
      CloudAssemblyBuilder = unwrap(this).createNestedAssembly(artifactId,
      displayName).let(CloudAssemblyBuilder::wrap)

  /**
   * Delete the cloud assembly directory.
   */
  public open fun delete() {
    unwrap(this).delete()
  }

  /**
   * The root directory of the resulting cloud assembly.
   */
  public open fun outdir(): String = unwrap(this).getOutdir()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.cxapi.CloudAssemblyBuilder].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Use the given asset output directory.
     *
     * Default: - Same as the manifest outdir
     *
     * @param assetOutdir Use the given asset output directory. 
     */
    public fun assetOutdir(assetOutdir: String)

    /**
     * If this builder is for a nested assembly, the parent assembly builder.
     *
     * Default: - This is a root assembly
     *
     * @param parentBuilder If this builder is for a nested assembly, the parent assembly builder. 
     */
    public fun parentBuilder(parentBuilder: CloudAssemblyBuilder)
  }

  private class BuilderImpl(
    outdir: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.cxapi.CloudAssemblyBuilder.Builder =
        software.amazon.awscdk.cxapi.CloudAssemblyBuilder.Builder.create(outdir)

    /**
     * Use the given asset output directory.
     *
     * Default: - Same as the manifest outdir
     *
     * @param assetOutdir Use the given asset output directory. 
     */
    override fun assetOutdir(assetOutdir: String) {
      cdkBuilder.assetOutdir(assetOutdir)
    }

    /**
     * If this builder is for a nested assembly, the parent assembly builder.
     *
     * Default: - This is a root assembly
     *
     * @param parentBuilder If this builder is for a nested assembly, the parent assembly builder. 
     */
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
        software.amazon.awscdk.cxapi.CloudAssemblyBuilder = wrapped.cdkObject as
        software.amazon.awscdk.cxapi.CloudAssemblyBuilder
  }
}
