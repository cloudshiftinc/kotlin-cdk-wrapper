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

  public fun assetOutdir(assetOutdir: String) {
    cdkBuilder.assetOutdir(assetOutdir)
  }

  public fun parentBuilder(parentBuilder: CloudAssemblyBuilder) {
    cdkBuilder.parentBuilder(parentBuilder)
  }

  public fun build(): CloudAssemblyBuilder = cdkBuilder.build()
}
