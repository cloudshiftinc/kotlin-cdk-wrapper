package io.cloudshiftdev.awscdk.cloudassembly.schema

import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

public interface AssemblyManifest {
  public fun artifacts(): Map<String, ArtifactManifest> =
      unwrap(this).getArtifacts()?.mapValues{ArtifactManifest.wrap(it.value)} ?: emptyMap()

  public fun missing(): List<MissingContext> = unwrap(this).getMissing()?.map(MissingContext::wrap)
      ?: emptyList()

  public fun runtime(): RuntimeInfo? = unwrap(this).getRuntime()?.let(RuntimeInfo::wrap)

  public fun version(): String

  public interface Builder {
    public fun artifacts(artifacts: Map<String, ArtifactManifest>)

    public fun missing(missing: List<MissingContext>)

    public fun missing(vararg missing: MissingContext)

    public fun runtime(runtime: RuntimeInfo)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2fbe00ae4a039ff3c7f57bbb0cdea243308a2334a847904cd126a6e8b6a47d86")
    public fun runtime(runtime: RuntimeInfo.Builder.() -> Unit)

    public fun version(version: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.cloudassembly.schema.AssemblyManifest.Builder =
        software.amazon.awscdk.cloudassembly.schema.AssemblyManifest.builder()

    override fun artifacts(artifacts: Map<String, ArtifactManifest>) {
      cdkBuilder.artifacts(artifacts.mapValues{ArtifactManifest.unwrap(it.value)})
    }

    override fun missing(missing: List<MissingContext>) {
      cdkBuilder.missing(missing.map(MissingContext::unwrap))
    }

    override fun missing(vararg missing: MissingContext): Unit = missing(missing.toList())

    override fun runtime(runtime: RuntimeInfo) {
      cdkBuilder.runtime(runtime.let(RuntimeInfo::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2fbe00ae4a039ff3c7f57bbb0cdea243308a2334a847904cd126a6e8b6a47d86")
    override fun runtime(runtime: RuntimeInfo.Builder.() -> Unit): Unit =
        runtime(RuntimeInfo(runtime))

    override fun version(version: String) {
      cdkBuilder.version(version)
    }

    public fun build(): software.amazon.awscdk.cloudassembly.schema.AssemblyManifest =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.cloudassembly.schema.AssemblyManifest,
  ) : AssemblyManifest {
    override fun artifacts(): Map<String, ArtifactManifest> =
        unwrap(this).getArtifacts()?.mapValues{ArtifactManifest.wrap(it.value)} ?: emptyMap()

    override fun missing(): List<MissingContext> =
        unwrap(this).getMissing()?.map(MissingContext::wrap) ?: emptyList()

    override fun runtime(): RuntimeInfo? = unwrap(this).getRuntime()?.let(RuntimeInfo::wrap)

    override fun version(): String = unwrap(this).getVersion()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): AssemblyManifest {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.cloudassembly.schema.AssemblyManifest):
        AssemblyManifest = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AssemblyManifest):
        software.amazon.awscdk.cloudassembly.schema.AssemblyManifest = (wrapped as
        Wrapper).cdkObject
  }
}
