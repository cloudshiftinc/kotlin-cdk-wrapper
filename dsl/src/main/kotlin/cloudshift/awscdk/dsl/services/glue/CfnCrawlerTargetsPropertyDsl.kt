@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.glue

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.glue.CfnCrawler

@CdkDslMarker
public class CfnCrawlerTargetsPropertyDsl {
  private val cdkBuilder: CfnCrawler.TargetsProperty.Builder = CfnCrawler.TargetsProperty.builder()

  private val _catalogTargets: MutableList<Any> = mutableListOf()

  private val _deltaTargets: MutableList<Any> = mutableListOf()

  private val _dynamoDbTargets: MutableList<Any> = mutableListOf()

  private val _jdbcTargets: MutableList<Any> = mutableListOf()

  private val _mongoDbTargets: MutableList<Any> = mutableListOf()

  private val _s3Targets: MutableList<Any> = mutableListOf()

  public fun catalogTargets(vararg catalogTargets: Any) {
    _catalogTargets.addAll(listOf(*catalogTargets))
  }

  public fun catalogTargets(catalogTargets: Collection<Any>) {
    _catalogTargets.addAll(catalogTargets)
  }

  public fun catalogTargets(catalogTargets: IResolvable) {
    cdkBuilder.catalogTargets(catalogTargets)
  }

  public fun deltaTargets(vararg deltaTargets: Any) {
    _deltaTargets.addAll(listOf(*deltaTargets))
  }

  public fun deltaTargets(deltaTargets: Collection<Any>) {
    _deltaTargets.addAll(deltaTargets)
  }

  public fun deltaTargets(deltaTargets: IResolvable) {
    cdkBuilder.deltaTargets(deltaTargets)
  }

  public fun dynamoDbTargets(vararg dynamoDbTargets: Any) {
    _dynamoDbTargets.addAll(listOf(*dynamoDbTargets))
  }

  public fun dynamoDbTargets(dynamoDbTargets: Collection<Any>) {
    _dynamoDbTargets.addAll(dynamoDbTargets)
  }

  public fun dynamoDbTargets(dynamoDbTargets: IResolvable) {
    cdkBuilder.dynamoDbTargets(dynamoDbTargets)
  }

  public fun jdbcTargets(vararg jdbcTargets: Any) {
    _jdbcTargets.addAll(listOf(*jdbcTargets))
  }

  public fun jdbcTargets(jdbcTargets: Collection<Any>) {
    _jdbcTargets.addAll(jdbcTargets)
  }

  public fun jdbcTargets(jdbcTargets: IResolvable) {
    cdkBuilder.jdbcTargets(jdbcTargets)
  }

  public fun mongoDbTargets(vararg mongoDbTargets: Any) {
    _mongoDbTargets.addAll(listOf(*mongoDbTargets))
  }

  public fun mongoDbTargets(mongoDbTargets: Collection<Any>) {
    _mongoDbTargets.addAll(mongoDbTargets)
  }

  public fun mongoDbTargets(mongoDbTargets: IResolvable) {
    cdkBuilder.mongoDbTargets(mongoDbTargets)
  }

  public fun s3Targets(vararg s3Targets: Any) {
    _s3Targets.addAll(listOf(*s3Targets))
  }

  public fun s3Targets(s3Targets: Collection<Any>) {
    _s3Targets.addAll(s3Targets)
  }

  public fun s3Targets(s3Targets: IResolvable) {
    cdkBuilder.s3Targets(s3Targets)
  }

  public fun build(): CfnCrawler.TargetsProperty {
    if(_catalogTargets.isNotEmpty()) cdkBuilder.catalogTargets(_catalogTargets)
    if(_deltaTargets.isNotEmpty()) cdkBuilder.deltaTargets(_deltaTargets)
    if(_dynamoDbTargets.isNotEmpty()) cdkBuilder.dynamoDbTargets(_dynamoDbTargets)
    if(_jdbcTargets.isNotEmpty()) cdkBuilder.jdbcTargets(_jdbcTargets)
    if(_mongoDbTargets.isNotEmpty()) cdkBuilder.mongoDbTargets(_mongoDbTargets)
    if(_s3Targets.isNotEmpty()) cdkBuilder.s3Targets(_s3Targets)
    return cdkBuilder.build()
  }
}
