@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ecs.CfnTaskSet

@CdkDslMarker
public class CfnTaskSetAwsVpcConfigurationPropertyDsl {
  private val cdkBuilder: CfnTaskSet.AwsVpcConfigurationProperty.Builder =
      CfnTaskSet.AwsVpcConfigurationProperty.builder()

  private val _securityGroups: MutableList<String> = mutableListOf()

  private val _subnets: MutableList<String> = mutableListOf()

  public fun assignPublicIp(assignPublicIp: String) {
    cdkBuilder.assignPublicIp(assignPublicIp)
  }

  public fun securityGroups(vararg securityGroups: String) {
    _securityGroups.addAll(listOf(*securityGroups))
  }

  public fun securityGroups(securityGroups: Collection<String>) {
    _securityGroups.addAll(securityGroups)
  }

  public fun subnets(vararg subnets: String) {
    _subnets.addAll(listOf(*subnets))
  }

  public fun subnets(subnets: Collection<String>) {
    _subnets.addAll(subnets)
  }

  public fun build(): CfnTaskSet.AwsVpcConfigurationProperty {
    if(_securityGroups.isNotEmpty()) cdkBuilder.securityGroups(_securityGroups)
    if(_subnets.isNotEmpty()) cdkBuilder.subnets(_subnets)
    return cdkBuilder.build()
  }
}
