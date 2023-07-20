@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.config

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.config.CfnConfigurationAggregator
import software.constructs.Construct

@CdkDslMarker
public class CfnConfigurationAggregatorDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnConfigurationAggregator.Builder =
      CfnConfigurationAggregator.Builder.create(scope, id)

  private val _accountAggregationSources: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun accountAggregationSources(vararg accountAggregationSources: Any) {
    _accountAggregationSources.addAll(listOf(*accountAggregationSources))
  }

  public fun accountAggregationSources(accountAggregationSources: Collection<Any>) {
    _accountAggregationSources.addAll(accountAggregationSources)
  }

  public fun accountAggregationSources(accountAggregationSources: IResolvable) {
    cdkBuilder.accountAggregationSources(accountAggregationSources)
  }

  public fun configurationAggregatorName(configurationAggregatorName: String) {
    cdkBuilder.configurationAggregatorName(configurationAggregatorName)
  }

  public fun organizationAggregationSource(organizationAggregationSource: IResolvable) {
    cdkBuilder.organizationAggregationSource(organizationAggregationSource)
  }

  public
      fun organizationAggregationSource(organizationAggregationSource: CfnConfigurationAggregator.OrganizationAggregationSourceProperty) {
    cdkBuilder.organizationAggregationSource(organizationAggregationSource)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnConfigurationAggregator {
    if(_accountAggregationSources.isNotEmpty())
        cdkBuilder.accountAggregationSources(_accountAggregationSources)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
