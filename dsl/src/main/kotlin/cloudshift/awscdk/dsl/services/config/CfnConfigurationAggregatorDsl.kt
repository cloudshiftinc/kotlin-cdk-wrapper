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

  /**
   * Provides a list of source accounts and regions to be aggregated.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configurationaggregator.html#cfn-config-configurationaggregator-accountaggregationsources)
   * @param accountAggregationSources Provides a list of source accounts and regions to be
   * aggregated. 
   */
  public fun accountAggregationSources(vararg accountAggregationSources: Any) {
    _accountAggregationSources.addAll(listOf(*accountAggregationSources))
  }

  /**
   * Provides a list of source accounts and regions to be aggregated.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configurationaggregator.html#cfn-config-configurationaggregator-accountaggregationsources)
   * @param accountAggregationSources Provides a list of source accounts and regions to be
   * aggregated. 
   */
  public fun accountAggregationSources(accountAggregationSources: Collection<Any>) {
    _accountAggregationSources.addAll(accountAggregationSources)
  }

  /**
   * Provides a list of source accounts and regions to be aggregated.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configurationaggregator.html#cfn-config-configurationaggregator-accountaggregationsources)
   * @param accountAggregationSources Provides a list of source accounts and regions to be
   * aggregated. 
   */
  public fun accountAggregationSources(accountAggregationSources: IResolvable) {
    cdkBuilder.accountAggregationSources(accountAggregationSources)
  }

  /**
   * The name of the aggregator.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configurationaggregator.html#cfn-config-configurationaggregator-configurationaggregatorname)
   * @param configurationAggregatorName The name of the aggregator. 
   */
  public fun configurationAggregatorName(configurationAggregatorName: String) {
    cdkBuilder.configurationAggregatorName(configurationAggregatorName)
  }

  /**
   * Provides an organization and list of regions to be aggregated.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configurationaggregator.html#cfn-config-configurationaggregator-organizationaggregationsource)
   * @param organizationAggregationSource Provides an organization and list of regions to be
   * aggregated. 
   */
  public fun organizationAggregationSource(organizationAggregationSource: IResolvable) {
    cdkBuilder.organizationAggregationSource(organizationAggregationSource)
  }

  /**
   * Provides an organization and list of regions to be aggregated.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configurationaggregator.html#cfn-config-configurationaggregator-organizationaggregationsource)
   * @param organizationAggregationSource Provides an organization and list of regions to be
   * aggregated. 
   */
  public
      fun organizationAggregationSource(organizationAggregationSource: CfnConfigurationAggregator.OrganizationAggregationSourceProperty) {
    cdkBuilder.organizationAggregationSource(organizationAggregationSource)
  }

  /**
   * An array of tag object.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configurationaggregator.html#cfn-config-configurationaggregator-tags)
   * @param tags An array of tag object. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * An array of tag object.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configurationaggregator.html#cfn-config-configurationaggregator-tags)
   * @param tags An array of tag object. 
   */
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
