@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.imagebuilder

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration

@CdkDslMarker
public class CfnDistributionConfigurationAmiDistributionConfigurationPropertyDsl {
  private val cdkBuilder: CfnDistributionConfiguration.AmiDistributionConfigurationProperty.Builder
      = CfnDistributionConfiguration.AmiDistributionConfigurationProperty.builder()

  private val _targetAccountIds: MutableList<String> = mutableListOf()

  public fun amiTags(amiTags: Map<String, String>) {
    cdkBuilder.amiTags(amiTags)
  }

  public fun amiTags(amiTags: IResolvable) {
    cdkBuilder.amiTags(amiTags)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun kmsKeyId(kmsKeyId: String) {
    cdkBuilder.kmsKeyId(kmsKeyId)
  }

  public fun launchPermissionConfiguration(launchPermissionConfiguration: IResolvable) {
    cdkBuilder.launchPermissionConfiguration(launchPermissionConfiguration)
  }

  public
      fun launchPermissionConfiguration(launchPermissionConfiguration: CfnDistributionConfiguration.LaunchPermissionConfigurationProperty) {
    cdkBuilder.launchPermissionConfiguration(launchPermissionConfiguration)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun targetAccountIds(vararg targetAccountIds: String) {
    _targetAccountIds.addAll(listOf(*targetAccountIds))
  }

  public fun targetAccountIds(targetAccountIds: Collection<String>) {
    _targetAccountIds.addAll(targetAccountIds)
  }

  public fun build(): CfnDistributionConfiguration.AmiDistributionConfigurationProperty {
    if(_targetAccountIds.isNotEmpty()) cdkBuilder.targetAccountIds(_targetAccountIds)
    return cdkBuilder.build()
  }
}
