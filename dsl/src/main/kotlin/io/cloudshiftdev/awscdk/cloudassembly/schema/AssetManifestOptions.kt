package io.cloudshiftdev.awscdk.cloudassembly.schema

import kotlin.Number
import kotlin.String
import kotlin.Unit

public interface AssetManifestOptions {
  public fun bootstrapStackVersionSsmParameter(): String? =
      unwrap(this).getBootstrapStackVersionSsmParameter()

  public fun requiresBootstrapStackVersion(): Number? =
      unwrap(this).getRequiresBootstrapStackVersion()

  public interface Builder {
    public fun bootstrapStackVersionSsmParameter(bootstrapStackVersionSsmParameter: String) {
    }

    public fun requiresBootstrapStackVersion(requiresBootstrapStackVersion: Number) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.cloudassembly.schema.AssetManifestOptions.Builder
        = software.amazon.awscdk.cloudassembly.schema.AssetManifestOptions.builder()

    public override
        fun bootstrapStackVersionSsmParameter(bootstrapStackVersionSsmParameter: String) {
      cdkBuilder.bootstrapStackVersionSsmParameter(bootstrapStackVersionSsmParameter)
    }

    public override fun requiresBootstrapStackVersion(requiresBootstrapStackVersion: Number) {
      cdkBuilder.requiresBootstrapStackVersion(requiresBootstrapStackVersion)
    }

    public fun build(): software.amazon.awscdk.cloudassembly.schema.AssetManifestOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.cloudassembly.schema.AssetManifestOptions,
  ) : AssetManifestOptions {
    public override fun bootstrapStackVersionSsmParameter(): String? =
        unwrap(this).getBootstrapStackVersionSsmParameter()

    public override fun requiresBootstrapStackVersion(): Number? =
        unwrap(this).getRequiresBootstrapStackVersion()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): AssetManifestOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.cloudassembly.schema.AssetManifestOptions):
        AssetManifestOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AssetManifestOptions):
        software.amazon.awscdk.cloudassembly.schema.AssetManifestOptions = (wrapped as
        Wrapper).cdkObject
  }
}
