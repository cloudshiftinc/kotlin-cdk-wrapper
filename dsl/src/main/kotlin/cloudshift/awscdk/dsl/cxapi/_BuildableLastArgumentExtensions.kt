@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.cxapi

import cloudshift.awscdk.dsl.cloudassembly.schema.ArtifactManifestDsl
import cloudshift.awscdk.dsl.cloudassembly.schema.MissingContextDsl
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.cxapi.CloudAssembly
import software.amazon.awscdk.cxapi.CloudAssemblyBuilder

public inline fun CloudAssemblyBuilder.addArtifact(id: String, block: ArtifactManifestDsl.() -> Unit
    = {}) {
  val builder = ArtifactManifestDsl()
  builder.apply(block)
  return addArtifact(id, builder.build())
}

public inline fun CloudAssemblyBuilder.addMissing(block: MissingContextDsl.() -> Unit = {}) {
  val builder = MissingContextDsl()
  builder.apply(block)
  return addMissing(builder.build())
}

public inline fun CloudAssemblyBuilder.buildAssembly(block: AssemblyBuildOptionsDsl.() -> Unit =
    {}): CloudAssembly {
  val builder = AssemblyBuildOptionsDsl()
  builder.apply(block)
  return buildAssembly(builder.build())
}
