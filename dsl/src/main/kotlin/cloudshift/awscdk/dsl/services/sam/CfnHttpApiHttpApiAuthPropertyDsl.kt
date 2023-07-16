@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sam.CfnHttpApi

@CdkDslMarker
public class CfnHttpApiHttpApiAuthPropertyDsl {
  private val cdkBuilder: CfnHttpApi.HttpApiAuthProperty.Builder =
      CfnHttpApi.HttpApiAuthProperty.builder()

  public fun authorizers(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.authorizers(builder.map)
  }

  public fun authorizers(authorizers: Any) {
    cdkBuilder.authorizers(authorizers)
  }

  public fun defaultAuthorizer(defaultAuthorizer: String) {
    cdkBuilder.defaultAuthorizer(defaultAuthorizer)
  }

  public fun build(): CfnHttpApi.HttpApiAuthProperty = cdkBuilder.build()
}
