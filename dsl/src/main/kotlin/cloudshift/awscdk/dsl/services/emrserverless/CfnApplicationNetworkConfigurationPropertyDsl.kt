@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.emrserverless

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.emrserverless.CfnApplication

@CdkDslMarker
public class CfnApplicationNetworkConfigurationPropertyDsl {
  private val cdkBuilder: CfnApplication.NetworkConfigurationProperty.Builder =
      CfnApplication.NetworkConfigurationProperty.builder()

  private val _securityGroupIds: MutableList<String> = mutableListOf()

  private val _subnetIds: MutableList<String> = mutableListOf()

  /**
   * @param securityGroupIds The array of security group Ids for customer VPC connectivity.
   * *Minimum* : 1
   *
   * *Maximum* : 32
   *
   * *Pattern* : `^[-0-9a-zA-Z]+`
   */
  public fun securityGroupIds(vararg securityGroupIds: String) {
    _securityGroupIds.addAll(listOf(*securityGroupIds))
  }

  /**
   * @param securityGroupIds The array of security group Ids for customer VPC connectivity.
   * *Minimum* : 1
   *
   * *Maximum* : 32
   *
   * *Pattern* : `^[-0-9a-zA-Z]+`
   */
  public fun securityGroupIds(securityGroupIds: Collection<String>) {
    _securityGroupIds.addAll(securityGroupIds)
  }

  /**
   * @param subnetIds The array of subnet Ids for customer VPC connectivity.
   * *Minimum* : 1
   *
   * *Maximum* : 32
   *
   * *Pattern* : `^[-0-9a-zA-Z]+`
   */
  public fun subnetIds(vararg subnetIds: String) {
    _subnetIds.addAll(listOf(*subnetIds))
  }

  /**
   * @param subnetIds The array of subnet Ids for customer VPC connectivity.
   * *Minimum* : 1
   *
   * *Maximum* : 32
   *
   * *Pattern* : `^[-0-9a-zA-Z]+`
   */
  public fun subnetIds(subnetIds: Collection<String>) {
    _subnetIds.addAll(subnetIds)
  }

  public fun build(): CfnApplication.NetworkConfigurationProperty {
    if(_securityGroupIds.isNotEmpty()) cdkBuilder.securityGroupIds(_securityGroupIds)
    if(_subnetIds.isNotEmpty()) cdkBuilder.subnetIds(_subnetIds)
    return cdkBuilder.build()
  }
}
