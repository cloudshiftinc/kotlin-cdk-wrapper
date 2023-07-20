@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.s3.CfnBucket

@CdkDslMarker
public class CfnBucketCorsRulePropertyDsl {
  private val cdkBuilder: CfnBucket.CorsRuleProperty.Builder = CfnBucket.CorsRuleProperty.builder()

  private val _allowedHeaders: MutableList<String> = mutableListOf()

  private val _allowedMethods: MutableList<String> = mutableListOf()

  private val _allowedOrigins: MutableList<String> = mutableListOf()

  private val _exposedHeaders: MutableList<String> = mutableListOf()

  public fun allowedHeaders(vararg allowedHeaders: String) {
    _allowedHeaders.addAll(listOf(*allowedHeaders))
  }

  public fun allowedHeaders(allowedHeaders: Collection<String>) {
    _allowedHeaders.addAll(allowedHeaders)
  }

  public fun allowedMethods(vararg allowedMethods: String) {
    _allowedMethods.addAll(listOf(*allowedMethods))
  }

  public fun allowedMethods(allowedMethods: Collection<String>) {
    _allowedMethods.addAll(allowedMethods)
  }

  public fun allowedOrigins(vararg allowedOrigins: String) {
    _allowedOrigins.addAll(listOf(*allowedOrigins))
  }

  public fun allowedOrigins(allowedOrigins: Collection<String>) {
    _allowedOrigins.addAll(allowedOrigins)
  }

  public fun exposedHeaders(vararg exposedHeaders: String) {
    _exposedHeaders.addAll(listOf(*exposedHeaders))
  }

  public fun exposedHeaders(exposedHeaders: Collection<String>) {
    _exposedHeaders.addAll(exposedHeaders)
  }

  public fun id(id: String) {
    cdkBuilder.id(id)
  }

  public fun maxAge(maxAge: Number) {
    cdkBuilder.maxAge(maxAge)
  }

  public fun build(): CfnBucket.CorsRuleProperty {
    if(_allowedHeaders.isNotEmpty()) cdkBuilder.allowedHeaders(_allowedHeaders)
    if(_allowedMethods.isNotEmpty()) cdkBuilder.allowedMethods(_allowedMethods)
    if(_allowedOrigins.isNotEmpty()) cdkBuilder.allowedOrigins(_allowedOrigins)
    if(_exposedHeaders.isNotEmpty()) cdkBuilder.exposedHeaders(_exposedHeaders)
    return cdkBuilder.build()
  }
}
