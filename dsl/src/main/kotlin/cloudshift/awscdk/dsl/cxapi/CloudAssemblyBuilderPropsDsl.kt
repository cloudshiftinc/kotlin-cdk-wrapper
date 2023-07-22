@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.cxapi

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.cxapi.CloudAssemblyBuilder
import software.amazon.awscdk.cxapi.CloudAssemblyBuilderProps

@CdkDslMarker
public class CloudAssemblyBuilderPropsDsl {
  private val cdkBuilder: CloudAssemblyBuilderProps.Builder = CloudAssemblyBuilderProps.builder()

  /**
   * @param assetOutdir Use the given asset output directory.
   */
  public fun assetOutdir(assetOutdir: String) {
    cdkBuilder.assetOutdir(assetOutdir)
  }

  /**
   * @param parentBuilder If this builder is for a nested assembly, the parent assembly builder.
   */
  public fun parentBuilder(parentBuilder: CloudAssemblyBuilder) {
    cdkBuilder.parentBuilder(parentBuilder)
  }

  public fun build(): CloudAssemblyBuilderProps = cdkBuilder.build()
}
