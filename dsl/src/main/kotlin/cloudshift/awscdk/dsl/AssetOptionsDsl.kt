@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.AssetHashType
import software.amazon.awscdk.AssetOptions
import software.amazon.awscdk.BundlingOptions

@CdkDslMarker
public class AssetOptionsDsl {
  private val cdkBuilder: AssetOptions.Builder = AssetOptions.builder()

  public fun assetHash(assetHash: String) {
    cdkBuilder.assetHash(assetHash)
  }

  public fun assetHashType(assetHashType: AssetHashType) {
    cdkBuilder.assetHashType(assetHashType)
  }

  public fun bundling(block: BundlingOptionsDsl.() -> Unit = {}) {
    val builder = BundlingOptionsDsl()
    builder.apply(block)
    cdkBuilder.bundling(builder.build())
  }

  public fun bundling(bundling: BundlingOptions) {
    cdkBuilder.bundling(bundling)
  }

  public fun build(): AssetOptions = cdkBuilder.build()
}
