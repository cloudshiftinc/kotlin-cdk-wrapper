@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pipes

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.pipes.CfnPipe

@CdkDslMarker
public class CfnPipeSelfManagedKafkaAccessConfigurationVpcPropertyDsl {
  private val cdkBuilder: CfnPipe.SelfManagedKafkaAccessConfigurationVpcProperty.Builder =
      CfnPipe.SelfManagedKafkaAccessConfigurationVpcProperty.builder()

  private val _securityGroup: MutableList<String> = mutableListOf()

  private val _subnets: MutableList<String> = mutableListOf()

  public fun securityGroup(vararg securityGroup: String) {
    _securityGroup.addAll(listOf(*securityGroup))
  }

  public fun securityGroup(securityGroup: Collection<String>) {
    _securityGroup.addAll(securityGroup)
  }

  public fun subnets(vararg subnets: String) {
    _subnets.addAll(listOf(*subnets))
  }

  public fun subnets(subnets: Collection<String>) {
    _subnets.addAll(subnets)
  }

  public fun build(): CfnPipe.SelfManagedKafkaAccessConfigurationVpcProperty {
    if(_securityGroup.isNotEmpty()) cdkBuilder.securityGroup(_securityGroup)
    if(_subnets.isNotEmpty()) cdkBuilder.subnets(_subnets)
    return cdkBuilder.build()
  }
}
