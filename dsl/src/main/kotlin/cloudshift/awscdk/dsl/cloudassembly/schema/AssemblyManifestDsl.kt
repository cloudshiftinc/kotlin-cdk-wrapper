@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.cloudassembly.schema

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.cloudassembly.schema.ArtifactManifest
import software.amazon.awscdk.cloudassembly.schema.AssemblyManifest
import software.amazon.awscdk.cloudassembly.schema.MissingContext
import software.amazon.awscdk.cloudassembly.schema.RuntimeInfo

@CdkDslMarker
public class AssemblyManifestDsl {
  private val cdkBuilder: AssemblyManifest.Builder = AssemblyManifest.builder()

  private val _missing: MutableList<MissingContext> = mutableListOf()

  public fun artifacts(artifacts: Map<String, ArtifactManifest>) {
    cdkBuilder.artifacts(artifacts)
  }

  public fun missing(missing: MissingContextDsl.() -> Unit) {
    _missing.add(MissingContextDsl().apply(missing).build())
  }

  public fun missing(missing: Collection<MissingContext>) {
    _missing.addAll(missing)
  }

  public fun runtime(block: RuntimeInfoDsl.() -> Unit = {}) {
    val builder = RuntimeInfoDsl()
    builder.apply(block)
    cdkBuilder.runtime(builder.build())
  }

  public fun runtime(runtime: RuntimeInfo) {
    cdkBuilder.runtime(runtime)
  }

  public fun version(version: String) {
    cdkBuilder.version(version)
  }

  public fun build(): AssemblyManifest {
    if(_missing.isNotEmpty()) cdkBuilder.missing(_missing)
    return cdkBuilder.build()
  }
}
