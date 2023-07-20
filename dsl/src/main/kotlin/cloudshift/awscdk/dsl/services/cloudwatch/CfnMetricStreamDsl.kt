@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudwatch

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudwatch.CfnMetricStream
import software.constructs.Construct

@CdkDslMarker
public class CfnMetricStreamDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnMetricStream.Builder = CfnMetricStream.Builder.create(scope, id)

  private val _excludeFilters: MutableList<Any> = mutableListOf()

  private val _includeFilters: MutableList<Any> = mutableListOf()

  private val _statisticsConfigurations: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun excludeFilters(vararg excludeFilters: Any) {
    _excludeFilters.addAll(listOf(*excludeFilters))
  }

  public fun excludeFilters(excludeFilters: Collection<Any>) {
    _excludeFilters.addAll(excludeFilters)
  }

  public fun excludeFilters(excludeFilters: IResolvable) {
    cdkBuilder.excludeFilters(excludeFilters)
  }

  public fun firehoseArn(firehoseArn: String) {
    cdkBuilder.firehoseArn(firehoseArn)
  }

  public fun includeFilters(vararg includeFilters: Any) {
    _includeFilters.addAll(listOf(*includeFilters))
  }

  public fun includeFilters(includeFilters: Collection<Any>) {
    _includeFilters.addAll(includeFilters)
  }

  public fun includeFilters(includeFilters: IResolvable) {
    cdkBuilder.includeFilters(includeFilters)
  }

  public fun includeLinkedAccountsMetrics(includeLinkedAccountsMetrics: Boolean) {
    cdkBuilder.includeLinkedAccountsMetrics(includeLinkedAccountsMetrics)
  }

  public fun includeLinkedAccountsMetrics(includeLinkedAccountsMetrics: IResolvable) {
    cdkBuilder.includeLinkedAccountsMetrics(includeLinkedAccountsMetrics)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun outputFormat(outputFormat: String) {
    cdkBuilder.outputFormat(outputFormat)
  }

  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  public fun statisticsConfigurations(vararg statisticsConfigurations: Any) {
    _statisticsConfigurations.addAll(listOf(*statisticsConfigurations))
  }

  public fun statisticsConfigurations(statisticsConfigurations: Collection<Any>) {
    _statisticsConfigurations.addAll(statisticsConfigurations)
  }

  public fun statisticsConfigurations(statisticsConfigurations: IResolvable) {
    cdkBuilder.statisticsConfigurations(statisticsConfigurations)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnMetricStream {
    if(_excludeFilters.isNotEmpty()) cdkBuilder.excludeFilters(_excludeFilters)
    if(_includeFilters.isNotEmpty()) cdkBuilder.includeFilters(_includeFilters)
    if(_statisticsConfigurations.isNotEmpty())
        cdkBuilder.statisticsConfigurations(_statisticsConfigurations)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
