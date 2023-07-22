@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.cxapi

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.cxapi.CloudAssemblyBuilder

@CdkDslMarker
public class CloudAssemblyBuilderDsl(
  outdir: String,
) {
  private val cdkBuilder: CloudAssemblyBuilder.Builder = CloudAssemblyBuilder.Builder.create(outdir)

  /**
   * Use the given asset output directory.
   *
   * Default: - Same as the manifest outdir
   *
   * @param assetOutdir Use the given asset output directory. 
   */
  public fun assetOutdir(assetOutdir: String) {
    cdkBuilder.assetOutdir(assetOutdir)
  }

  /**
   * If this builder is for a nested assembly, the parent assembly builder.
   *
   * Default: - This is a root assembly
   *
   * @param parentBuilder If this builder is for a nested assembly, the parent assembly builder. 
   */
  public fun parentBuilder(parentBuilder: CloudAssemblyBuilder) {
    cdkBuilder.parentBuilder(parentBuilder)
  }

  public fun build(): CloudAssemblyBuilder = cdkBuilder.build()
}
