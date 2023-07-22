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
import software.amazon.awscdk.services.config.CfnConfigurationAggregatorProps

/**
 * Properties for defining a `CfnConfigurationAggregator`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.config.*;
 * CfnConfigurationAggregatorProps cfnConfigurationAggregatorProps =
 * CfnConfigurationAggregatorProps.builder()
 * .accountAggregationSources(List.of(AccountAggregationSourceProperty.builder()
 * .accountIds(List.of("accountIds"))
 * // the properties below are optional
 * .allAwsRegions(false)
 * .awsRegions(List.of("awsRegions"))
 * .build()))
 * .configurationAggregatorName("configurationAggregatorName")
 * .organizationAggregationSource(OrganizationAggregationSourceProperty.builder()
 * .roleArn("roleArn")
 * // the properties below are optional
 * .allAwsRegions(false)
 * .awsRegions(List.of("awsRegions"))
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configurationaggregator.html)
 */
@CdkDslMarker
public class CfnConfigurationAggregatorPropsDsl {
  private val cdkBuilder: CfnConfigurationAggregatorProps.Builder =
      CfnConfigurationAggregatorProps.builder()

  private val _accountAggregationSources: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param accountAggregationSources Provides a list of source accounts and regions to be
   * aggregated.
   */
  public fun accountAggregationSources(vararg accountAggregationSources: Any) {
    _accountAggregationSources.addAll(listOf(*accountAggregationSources))
  }

  /**
   * @param accountAggregationSources Provides a list of source accounts and regions to be
   * aggregated.
   */
  public fun accountAggregationSources(accountAggregationSources: Collection<Any>) {
    _accountAggregationSources.addAll(accountAggregationSources)
  }

  /**
   * @param accountAggregationSources Provides a list of source accounts and regions to be
   * aggregated.
   */
  public fun accountAggregationSources(accountAggregationSources: IResolvable) {
    cdkBuilder.accountAggregationSources(accountAggregationSources)
  }

  /**
   * @param configurationAggregatorName The name of the aggregator.
   */
  public fun configurationAggregatorName(configurationAggregatorName: String) {
    cdkBuilder.configurationAggregatorName(configurationAggregatorName)
  }

  /**
   * @param organizationAggregationSource Provides an organization and list of regions to be
   * aggregated.
   */
  public fun organizationAggregationSource(organizationAggregationSource: IResolvable) {
    cdkBuilder.organizationAggregationSource(organizationAggregationSource)
  }

  /**
   * @param organizationAggregationSource Provides an organization and list of regions to be
   * aggregated.
   */
  public
      fun organizationAggregationSource(organizationAggregationSource: CfnConfigurationAggregator.OrganizationAggregationSourceProperty) {
    cdkBuilder.organizationAggregationSource(organizationAggregationSource)
  }

  /**
   * @param tags An array of tag object.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags An array of tag object.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnConfigurationAggregatorProps {
    if(_accountAggregationSources.isNotEmpty())
        cdkBuilder.accountAggregationSources(_accountAggregationSources)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
