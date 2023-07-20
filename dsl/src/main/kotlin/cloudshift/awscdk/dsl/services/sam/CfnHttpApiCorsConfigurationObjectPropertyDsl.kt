@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sam.CfnHttpApi

@CdkDslMarker
public class CfnHttpApiCorsConfigurationObjectPropertyDsl {
  private val cdkBuilder: CfnHttpApi.CorsConfigurationObjectProperty.Builder =
      CfnHttpApi.CorsConfigurationObjectProperty.builder()

  private val _allowHeaders: MutableList<String> = mutableListOf()

  private val _allowMethods: MutableList<String> = mutableListOf()

  private val _allowOrigins: MutableList<String> = mutableListOf()

  private val _exposeHeaders: MutableList<String> = mutableListOf()

  public fun allowCredentials(allowCredentials: Boolean) {
    cdkBuilder.allowCredentials(allowCredentials)
  }

  public fun allowCredentials(allowCredentials: IResolvable) {
    cdkBuilder.allowCredentials(allowCredentials)
  }

  public fun allowHeaders(vararg allowHeaders: String) {
    _allowHeaders.addAll(listOf(*allowHeaders))
  }

  public fun allowHeaders(allowHeaders: Collection<String>) {
    _allowHeaders.addAll(allowHeaders)
  }

  public fun allowMethods(vararg allowMethods: String) {
    _allowMethods.addAll(listOf(*allowMethods))
  }

  public fun allowMethods(allowMethods: Collection<String>) {
    _allowMethods.addAll(allowMethods)
  }

  public fun allowOrigins(vararg allowOrigins: String) {
    _allowOrigins.addAll(listOf(*allowOrigins))
  }

  public fun allowOrigins(allowOrigins: Collection<String>) {
    _allowOrigins.addAll(allowOrigins)
  }

  public fun exposeHeaders(vararg exposeHeaders: String) {
    _exposeHeaders.addAll(listOf(*exposeHeaders))
  }

  public fun exposeHeaders(exposeHeaders: Collection<String>) {
    _exposeHeaders.addAll(exposeHeaders)
  }

  public fun maxAge(maxAge: Number) {
    cdkBuilder.maxAge(maxAge)
  }

  public fun build(): CfnHttpApi.CorsConfigurationObjectProperty {
    if(_allowHeaders.isNotEmpty()) cdkBuilder.allowHeaders(_allowHeaders)
    if(_allowMethods.isNotEmpty()) cdkBuilder.allowMethods(_allowMethods)
    if(_allowOrigins.isNotEmpty()) cdkBuilder.allowOrigins(_allowOrigins)
    if(_exposeHeaders.isNotEmpty()) cdkBuilder.exposeHeaders(_exposeHeaders)
    return cdkBuilder.build()
  }
}
