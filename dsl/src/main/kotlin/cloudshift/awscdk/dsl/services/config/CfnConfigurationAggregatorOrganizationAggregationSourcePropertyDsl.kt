@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.config

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.config.CfnConfigurationAggregator

@CdkDslMarker
public class CfnConfigurationAggregatorOrganizationAggregationSourcePropertyDsl {
  private val cdkBuilder: CfnConfigurationAggregator.OrganizationAggregationSourceProperty.Builder =
      CfnConfigurationAggregator.OrganizationAggregationSourceProperty.builder()

  private val _awsRegions: MutableList<String> = mutableListOf()

  /**
   * @param allAwsRegions If true, aggregate existing AWS Config regions and future regions.
   */
  public fun allAwsRegions(allAwsRegions: Boolean) {
    cdkBuilder.allAwsRegions(allAwsRegions)
  }

  /**
   * @param allAwsRegions If true, aggregate existing AWS Config regions and future regions.
   */
  public fun allAwsRegions(allAwsRegions: IResolvable) {
    cdkBuilder.allAwsRegions(allAwsRegions)
  }

  /**
   * @param awsRegions The source regions being aggregated.
   */
  public fun awsRegions(vararg awsRegions: String) {
    _awsRegions.addAll(listOf(*awsRegions))
  }

  /**
   * @param awsRegions The source regions being aggregated.
   */
  public fun awsRegions(awsRegions: Collection<String>) {
    _awsRegions.addAll(awsRegions)
  }

  /**
   * @param roleArn ARN of the IAM role used to retrieve AWS Organizations details associated with
   * the aggregator account. 
   */
  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  public fun build(): CfnConfigurationAggregator.OrganizationAggregationSourceProperty {
    if(_awsRegions.isNotEmpty()) cdkBuilder.awsRegions(_awsRegions)
    return cdkBuilder.build()
  }
}
