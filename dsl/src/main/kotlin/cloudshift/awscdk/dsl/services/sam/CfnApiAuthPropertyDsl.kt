@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sam.CfnApi

@CdkDslMarker
public class CfnApiAuthPropertyDsl {
  private val cdkBuilder: CfnApi.AuthProperty.Builder = CfnApi.AuthProperty.builder()

  /**
   * @param addDefaultAuthorizerToCorsPreflight the value to be set.
   */
  public fun addDefaultAuthorizerToCorsPreflight(addDefaultAuthorizerToCorsPreflight: Boolean) {
    cdkBuilder.addDefaultAuthorizerToCorsPreflight(addDefaultAuthorizerToCorsPreflight)
  }

  /**
   * @param addDefaultAuthorizerToCorsPreflight the value to be set.
   */
  public fun addDefaultAuthorizerToCorsPreflight(addDefaultAuthorizerToCorsPreflight: IResolvable) {
    cdkBuilder.addDefaultAuthorizerToCorsPreflight(addDefaultAuthorizerToCorsPreflight)
  }

  /**
   * @param authorizers the value to be set.
   */
  public fun authorizers(authorizers: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(authorizers)
    cdkBuilder.authorizers(builder.map)
  }

  /**
   * @param authorizers the value to be set.
   */
  public fun authorizers(authorizers: Any) {
    cdkBuilder.authorizers(authorizers)
  }

  /**
   * @param defaultAuthorizer the value to be set.
   */
  public fun defaultAuthorizer(defaultAuthorizer: String) {
    cdkBuilder.defaultAuthorizer(defaultAuthorizer)
  }

  public fun build(): CfnApi.AuthProperty = cdkBuilder.build()
}
