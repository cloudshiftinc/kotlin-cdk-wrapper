@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.cloudassembly.schema

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.cloudassembly.schema.AssetManifestOptions

@CdkDslMarker
public class AssetManifestOptionsDsl {
  private val cdkBuilder: AssetManifestOptions.Builder = AssetManifestOptions.builder()

  public fun bootstrapStackVersionSsmParameter(bootstrapStackVersionSsmParameter: String) {
    cdkBuilder.bootstrapStackVersionSsmParameter(bootstrapStackVersionSsmParameter)
  }

  public fun requiresBootstrapStackVersion(requiresBootstrapStackVersion: Number) {
    cdkBuilder.requiresBootstrapStackVersion(requiresBootstrapStackVersion)
  }

  public fun build(): AssetManifestOptions = cdkBuilder.build()
}
