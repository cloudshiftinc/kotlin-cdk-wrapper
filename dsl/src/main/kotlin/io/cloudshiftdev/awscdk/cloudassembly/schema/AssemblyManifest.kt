package io.cloudshiftdev.awscdk.cloudassembly.schema

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

public interface AssemblyManifest {
  /**
   * The set of artifacts in this assembly.
   *
   * Default: - no artifacts.
   */
  public fun artifacts(): Map<String, ArtifactManifest> =
      unwrap(this).getArtifacts()?.mapValues{ArtifactManifest.wrap(it.value)} ?: emptyMap()

  /**
   * Missing context information.
   *
   * If this field has values, it means that the
   * cloud assembly is not complete and should not be deployed.
   *
   * Default: - no missing context.
   */
  public fun missing(): List<MissingContext> = unwrap(this).getMissing()?.map(MissingContext::wrap)
      ?: emptyList()

  /**
   * Runtime information.
   *
   * Default: - no info.
   */
  public fun runtime(): RuntimeInfo? = unwrap(this).getRuntime()?.let(RuntimeInfo::wrap)

  /**
   * Protocol version.
   */
  public fun version(): String

  /**
   * A builder for [AssemblyManifest]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param artifacts The set of artifacts in this assembly.
     */
    public fun artifacts(artifacts: Map<String, ArtifactManifest>)

    /**
     * @param missing Missing context information.
     * If this field has values, it means that the
     * cloud assembly is not complete and should not be deployed.
     */
    public fun missing(missing: List<MissingContext>)

    /**
     * @param missing Missing context information.
     * If this field has values, it means that the
     * cloud assembly is not complete and should not be deployed.
     */
    public fun missing(vararg missing: MissingContext)

    /**
     * @param runtime Runtime information.
     */
    public fun runtime(runtime: RuntimeInfo)

    /**
     * @param runtime Runtime information.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2fbe00ae4a039ff3c7f57bbb0cdea243308a2334a847904cd126a6e8b6a47d86")
    public fun runtime(runtime: RuntimeInfo.Builder.() -> Unit)

    /**
     * @param version Protocol version. 
     */
    public fun version(version: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.cloudassembly.schema.AssemblyManifest.Builder =
        software.amazon.awscdk.cloudassembly.schema.AssemblyManifest.builder()

    /**
     * @param artifacts The set of artifacts in this assembly.
     */
    override fun artifacts(artifacts: Map<String, ArtifactManifest>) {
      cdkBuilder.artifacts(artifacts.mapValues{ArtifactManifest.unwrap(it.value)})
    }

    /**
     * @param missing Missing context information.
     * If this field has values, it means that the
     * cloud assembly is not complete and should not be deployed.
     */
    override fun missing(missing: List<MissingContext>) {
      cdkBuilder.missing(missing.map(MissingContext::unwrap))
    }

    /**
     * @param missing Missing context information.
     * If this field has values, it means that the
     * cloud assembly is not complete and should not be deployed.
     */
    override fun missing(vararg missing: MissingContext): Unit = missing(missing.toList())

    /**
     * @param runtime Runtime information.
     */
    override fun runtime(runtime: RuntimeInfo) {
      cdkBuilder.runtime(runtime.let(RuntimeInfo::unwrap))
    }

    /**
     * @param runtime Runtime information.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2fbe00ae4a039ff3c7f57bbb0cdea243308a2334a847904cd126a6e8b6a47d86")
    override fun runtime(runtime: RuntimeInfo.Builder.() -> Unit): Unit =
        runtime(RuntimeInfo(runtime))

    /**
     * @param version Protocol version. 
     */
    override fun version(version: String) {
      cdkBuilder.version(version)
    }

    public fun build(): software.amazon.awscdk.cloudassembly.schema.AssemblyManifest =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.cloudassembly.schema.AssemblyManifest,
  ) : CdkObject(cdkObject), AssemblyManifest {
    /**
     * The set of artifacts in this assembly.
     *
     * Default: - no artifacts.
     */
    override fun artifacts(): Map<String, ArtifactManifest> =
        unwrap(this).getArtifacts()?.mapValues{ArtifactManifest.wrap(it.value)} ?: emptyMap()

    /**
     * Missing context information.
     *
     * If this field has values, it means that the
     * cloud assembly is not complete and should not be deployed.
     *
     * Default: - no missing context.
     */
    override fun missing(): List<MissingContext> =
        unwrap(this).getMissing()?.map(MissingContext::wrap) ?: emptyList()

    /**
     * Runtime information.
     *
     * Default: - no info.
     */
    override fun runtime(): RuntimeInfo? = unwrap(this).getRuntime()?.let(RuntimeInfo::wrap)

    /**
     * Protocol version.
     */
    override fun version(): String = unwrap(this).getVersion()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AssemblyManifest {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.cloudassembly.schema.AssemblyManifest):
        AssemblyManifest = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AssemblyManifest):
        software.amazon.awscdk.cloudassembly.schema.AssemblyManifest = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.cloudassembly.schema.AssemblyManifest
  }
}
