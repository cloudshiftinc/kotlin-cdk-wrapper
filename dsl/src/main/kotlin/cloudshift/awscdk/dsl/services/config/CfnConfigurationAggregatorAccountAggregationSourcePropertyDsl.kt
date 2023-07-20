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
public class CfnConfigurationAggregatorAccountAggregationSourcePropertyDsl {
  private val cdkBuilder: CfnConfigurationAggregator.AccountAggregationSourceProperty.Builder =
      CfnConfigurationAggregator.AccountAggregationSourceProperty.builder()

  private val _accountIds: MutableList<String> = mutableListOf()

  private val _awsRegions: MutableList<String> = mutableListOf()

  public fun accountIds(vararg accountIds: String) {
    _accountIds.addAll(listOf(*accountIds))
  }

  public fun accountIds(accountIds: Collection<String>) {
    _accountIds.addAll(accountIds)
  }

  public fun allAwsRegions(allAwsRegions: Boolean) {
    cdkBuilder.allAwsRegions(allAwsRegions)
  }

  public fun allAwsRegions(allAwsRegions: IResolvable) {
    cdkBuilder.allAwsRegions(allAwsRegions)
  }

  public fun awsRegions(vararg awsRegions: String) {
    _awsRegions.addAll(listOf(*awsRegions))
  }

  public fun awsRegions(awsRegions: Collection<String>) {
    _awsRegions.addAll(awsRegions)
  }

  public fun build(): CfnConfigurationAggregator.AccountAggregationSourceProperty {
    if(_accountIds.isNotEmpty()) cdkBuilder.accountIds(_accountIds)
    if(_awsRegions.isNotEmpty()) cdkBuilder.awsRegions(_awsRegions)
    return cdkBuilder.build()
  }
}
