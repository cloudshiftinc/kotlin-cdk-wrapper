@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.cxapi

import cloudshift.awscdk.dsl.cloudassembly.schema.ArtifactManifestDsl
import cloudshift.awscdk.dsl.cloudassembly.schema.MissingContextDsl
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.cxapi.CloudAssembly
import software.amazon.awscdk.cxapi.CloudAssemblyBuilder

/**
 * Adds an artifact into the cloud assembly.
 *
 * @param id The ID of the artifact. 
 * @param manifest The artifact manifest. 
 */
public inline fun CloudAssemblyBuilder.addArtifact(id: String, block: ArtifactManifestDsl.() -> Unit
    = {}) {
  val builder = ArtifactManifestDsl()
  builder.apply(block)
  return addArtifact(id, builder.build())
}

/**
 * Reports that some context is missing in order for this cloud assembly to be fully synthesized.
 *
 * @param missing Missing context information. 
 */
public inline fun CloudAssemblyBuilder.addMissing(block: MissingContextDsl.() -> Unit = {}) {
  val builder = MissingContextDsl()
  builder.apply(block)
  return addMissing(builder.build())
}

/**
 * Finalizes the cloud assembly into the output directory returns a `CloudAssembly` object that can
 * be used to inspect the assembly.
 *
 * @param options
 */
public inline fun CloudAssemblyBuilder.buildAssembly(block: AssemblyBuildOptionsDsl.() -> Unit =
    {}): CloudAssembly {
  val builder = AssemblyBuildOptionsDsl()
  builder.apply(block)
  return buildAssembly(builder.build())
}
