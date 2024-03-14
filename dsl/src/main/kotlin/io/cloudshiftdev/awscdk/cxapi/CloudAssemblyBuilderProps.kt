package io.cloudshiftdev.awscdk.cxapi

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

public interface CloudAssemblyBuilderProps {
  /**
   * Use the given asset output directory.
   *
   * Default: - Same as the manifest outdir
   */
  public fun assetOutdir(): String? = unwrap(this).getAssetOutdir()

  /**
   * If this builder is for a nested assembly, the parent assembly builder.
   *
   * Default: - This is a root assembly
   */
  public fun parentBuilder(): CloudAssemblyBuilder? =
      unwrap(this).getParentBuilder()?.let(CloudAssemblyBuilder::wrap)

  /**
   * A builder for [CloudAssemblyBuilderProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param assetOutdir Use the given asset output directory.
     */
    public fun assetOutdir(assetOutdir: String)

    /**
     * @param parentBuilder If this builder is for a nested assembly, the parent assembly builder.
     */
    public fun parentBuilder(parentBuilder: CloudAssemblyBuilder)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.cxapi.CloudAssemblyBuilderProps.Builder =
        software.amazon.awscdk.cxapi.CloudAssemblyBuilderProps.builder()

    /**
     * @param assetOutdir Use the given asset output directory.
     */
    override fun assetOutdir(assetOutdir: String) {
      cdkBuilder.assetOutdir(assetOutdir)
    }

    /**
     * @param parentBuilder If this builder is for a nested assembly, the parent assembly builder.
     */
    override fun parentBuilder(parentBuilder: CloudAssemblyBuilder) {
      cdkBuilder.parentBuilder(parentBuilder.let(CloudAssemblyBuilder::unwrap))
    }

    public fun build(): software.amazon.awscdk.cxapi.CloudAssemblyBuilderProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.cxapi.CloudAssemblyBuilderProps,
  ) : CdkObject(cdkObject), CloudAssemblyBuilderProps {
    /**
     * Use the given asset output directory.
     *
     * Default: - Same as the manifest outdir
     */
    override fun assetOutdir(): String? = unwrap(this).getAssetOutdir()

    /**
     * If this builder is for a nested assembly, the parent assembly builder.
     *
     * Default: - This is a root assembly
     */
    override fun parentBuilder(): CloudAssemblyBuilder? =
        unwrap(this).getParentBuilder()?.let(CloudAssemblyBuilder::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CloudAssemblyBuilderProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.cxapi.CloudAssemblyBuilderProps):
        CloudAssemblyBuilderProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CloudAssemblyBuilderProps):
        software.amazon.awscdk.cxapi.CloudAssemblyBuilderProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.cxapi.CloudAssemblyBuilderProps
  }
}
