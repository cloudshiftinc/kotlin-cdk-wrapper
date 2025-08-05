@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cloudassembly.schema

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

public interface AssemblyManifest {
  public fun artifacts(): Map<String, ArtifactManifest> =
      unwrap(this).getArtifacts()?.mapValues{ArtifactManifest.wrap(it.value)} ?: emptyMap()

  public fun minimumCliVersion(): String? = unwrap(this).getMinimumCliVersion()

  public fun missing(): List<MissingContext> = unwrap(this).getMissing()?.map(MissingContext::wrap)
      ?: emptyList()

  public fun runtime(): RuntimeInfo? = unwrap(this).getRuntime()?.let(RuntimeInfo::wrap)

  public fun version(): String

  @CdkDslMarker
  public interface Builder {
    public fun artifacts(artifacts: Map<String, ArtifactManifest>)

    public fun minimumCliVersion(minimumCliVersion: String)

    public fun missing(missing: List<MissingContext>)

    public fun missing(vararg missing: MissingContext)

    public fun runtime(runtime: RuntimeInfo)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
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

    override fun minimumCliVersion(minimumCliVersion: String) {
      cdkBuilder.minimumCliVersion(minimumCliVersion)
    }

    override fun missing(missing: List<MissingContext>) {
      cdkBuilder.missing(missing.map(MissingContext.Companion::unwrap))
    }

    override fun missing(vararg missing: MissingContext): Unit = missing(missing.toList())

    override fun runtime(runtime: RuntimeInfo) {
      cdkBuilder.runtime(runtime.let(RuntimeInfo.Companion::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2fbe00ae4a039ff3c7f57bbb0cdea243308a2334a847904cd126a6e8b6a47d86")
    override fun runtime(runtime: RuntimeInfo.Builder.() -> Unit): Unit =
        runtime(RuntimeInfo(runtime))

    override fun version(version: String) {
      cdkBuilder.version(version)
    }

    public fun build(): software.amazon.awscdk.cloudassembly.schema.AssemblyManifest =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.cloudassembly.schema.AssemblyManifest,
  ) : CdkObject(cdkObject),
      AssemblyManifest {
    override fun artifacts(): Map<String, ArtifactManifest> =
        unwrap(this).getArtifacts()?.mapValues{ArtifactManifest.wrap(it.value)} ?: emptyMap()

    override fun minimumCliVersion(): String? = unwrap(this).getMinimumCliVersion()

    override fun missing(): List<MissingContext> =
        unwrap(this).getMissing()?.map(MissingContext::wrap) ?: emptyList()

    override fun runtime(): RuntimeInfo? = unwrap(this).getRuntime()?.let(RuntimeInfo::wrap)

    override fun version(): String = unwrap(this).getVersion()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AssemblyManifest {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.cloudassembly.schema.AssemblyManifest):
        AssemblyManifest = CdkObjectWrappers.wrap(cdkObject) as? AssemblyManifest ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: AssemblyManifest):
        software.amazon.awscdk.cloudassembly.schema.AssemblyManifest = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.cloudassembly.schema.AssemblyManifest
  }
}
