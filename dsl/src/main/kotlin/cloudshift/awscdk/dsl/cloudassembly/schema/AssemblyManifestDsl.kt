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

  /**
   * @param artifacts The set of artifacts in this assembly.
   */
  public fun artifacts(artifacts: Map<String, ArtifactManifest>) {
    cdkBuilder.artifacts(artifacts)
  }

  /**
   * @param missing Missing context information.
   * If this field has values, it means that the
   * cloud assembly is not complete and should not be deployed.
   */
  public fun missing(missing: MissingContextDsl.() -> Unit) {
    _missing.add(MissingContextDsl().apply(missing).build())
  }

  /**
   * @param missing Missing context information.
   * If this field has values, it means that the
   * cloud assembly is not complete and should not be deployed.
   */
  public fun missing(missing: Collection<MissingContext>) {
    _missing.addAll(missing)
  }

  /**
   * @param runtime Runtime information.
   */
  public fun runtime(runtime: RuntimeInfoDsl.() -> Unit = {}) {
    val builder = RuntimeInfoDsl()
    builder.apply(runtime)
    cdkBuilder.runtime(builder.build())
  }

  /**
   * @param runtime Runtime information.
   */
  public fun runtime(runtime: RuntimeInfo) {
    cdkBuilder.runtime(runtime)
  }

  /**
   * @param version Protocol version. 
   */
  public fun version(version: String) {
    cdkBuilder.version(version)
  }

  public fun build(): AssemblyManifest {
    if(_missing.isNotEmpty()) cdkBuilder.missing(_missing)
    return cdkBuilder.build()
  }
}
