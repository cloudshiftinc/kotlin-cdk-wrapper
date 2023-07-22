@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.cloudassembly.schema

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.cloudassembly.schema.AssetManifestProperties

/**
 * Artifact properties for the Asset Manifest.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.cloudassembly.schema.*;
 * AssetManifestProperties assetManifestProperties = AssetManifestProperties.builder()
 * .file("file")
 * // the properties below are optional
 * .bootstrapStackVersionSsmParameter("bootstrapStackVersionSsmParameter")
 * .requiresBootstrapStackVersion(123)
 * .build();
 * ```
 */
@CdkDslMarker
public class AssetManifestPropertiesDsl {
  private val cdkBuilder: AssetManifestProperties.Builder = AssetManifestProperties.builder()

  /**
   * @param bootstrapStackVersionSsmParameter SSM parameter where the bootstrap stack version number
   * can be found.
   * * If this value is not set, the bootstrap stack name must be known at
   * deployment time so the stack version can be looked up from the stack
   * outputs.
   * * If this value is set, the bootstrap stack can have any name because
   * we won't need to look it up.
   */
  public fun bootstrapStackVersionSsmParameter(bootstrapStackVersionSsmParameter: String) {
    cdkBuilder.bootstrapStackVersionSsmParameter(bootstrapStackVersionSsmParameter)
  }

  /**
   * @param file Filename of the asset manifest. 
   */
  public fun `file`(`file`: String) {
    cdkBuilder.`file`(`file`)
  }

  /**
   * @param requiresBootstrapStackVersion Version of bootstrap stack required to deploy this stack.
   */
  public fun requiresBootstrapStackVersion(requiresBootstrapStackVersion: Number) {
    cdkBuilder.requiresBootstrapStackVersion(requiresBootstrapStackVersion)
  }

  public fun build(): AssetManifestProperties = cdkBuilder.build()
}
