package io.cloudshiftdev.awscdk.cloudassembly.schema

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit

public interface AssetManifestProperties : AssetManifestOptions {
  /**
   * Filename of the asset manifest.
   */
  public fun `file`(): String

  /**
   * A builder for [AssetManifestProperties]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param bootstrapStackVersionSsmParameter SSM parameter where the bootstrap stack version
     * number can be found.
     * * If this value is not set, the bootstrap stack name must be known at
     * deployment time so the stack version can be looked up from the stack
     * outputs.
     * * If this value is set, the bootstrap stack can have any name because
     * we won't need to look it up.
     */
    public fun bootstrapStackVersionSsmParameter(bootstrapStackVersionSsmParameter: String)

    /**
     * @param file Filename of the asset manifest. 
     */
    public fun `file`(`file`: String)

    /**
     * @param requiresBootstrapStackVersion Version of bootstrap stack required to deploy this
     * stack.
     */
    public fun requiresBootstrapStackVersion(requiresBootstrapStackVersion: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.cloudassembly.schema.AssetManifestProperties.Builder =
        software.amazon.awscdk.cloudassembly.schema.AssetManifestProperties.builder()

    /**
     * @param bootstrapStackVersionSsmParameter SSM parameter where the bootstrap stack version
     * number can be found.
     * * If this value is not set, the bootstrap stack name must be known at
     * deployment time so the stack version can be looked up from the stack
     * outputs.
     * * If this value is set, the bootstrap stack can have any name because
     * we won't need to look it up.
     */
    override fun bootstrapStackVersionSsmParameter(bootstrapStackVersionSsmParameter: String) {
      cdkBuilder.bootstrapStackVersionSsmParameter(bootstrapStackVersionSsmParameter)
    }

    /**
     * @param file Filename of the asset manifest. 
     */
    override fun `file`(`file`: String) {
      cdkBuilder.`file`(`file`)
    }

    /**
     * @param requiresBootstrapStackVersion Version of bootstrap stack required to deploy this
     * stack.
     */
    override fun requiresBootstrapStackVersion(requiresBootstrapStackVersion: Number) {
      cdkBuilder.requiresBootstrapStackVersion(requiresBootstrapStackVersion)
    }

    public fun build(): software.amazon.awscdk.cloudassembly.schema.AssetManifestProperties =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.cloudassembly.schema.AssetManifestProperties,
  ) : AssetManifestProperties {
    /**
     * SSM parameter where the bootstrap stack version number can be found.
     *
     * * If this value is not set, the bootstrap stack name must be known at
     * deployment time so the stack version can be looked up from the stack
     * outputs.
     * * If this value is set, the bootstrap stack can have any name because
     * we won't need to look it up.
     *
     * Default: - Bootstrap stack version number looked up
     */
    override fun bootstrapStackVersionSsmParameter(): String? =
        unwrap(this).getBootstrapStackVersionSsmParameter()

    /**
     * Filename of the asset manifest.
     */
    override fun `file`(): String = unwrap(this).getFile()

    /**
     * Version of bootstrap stack required to deploy this stack.
     *
     * Default: - Version 1 (basic modern bootstrap stack)
     */
    override fun requiresBootstrapStackVersion(): Number? =
        unwrap(this).getRequiresBootstrapStackVersion()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): AssetManifestProperties {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.cloudassembly.schema.AssetManifestProperties):
        AssetManifestProperties = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AssetManifestProperties):
        software.amazon.awscdk.cloudassembly.schema.AssetManifestProperties = (wrapped as
        Wrapper).cdkObject
  }
}
