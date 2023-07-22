@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.route53

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.route53.CfnCidrCollection

@CdkDslMarker
public class CfnCidrCollectionLocationPropertyDsl {
  private val cdkBuilder: CfnCidrCollection.LocationProperty.Builder =
      CfnCidrCollection.LocationProperty.builder()

  private val _cidrList: MutableList<String> = mutableListOf()

  /**
   * @param cidrList List of CIDR blocks. 
   */
  public fun cidrList(vararg cidrList: String) {
    _cidrList.addAll(listOf(*cidrList))
  }

  /**
   * @param cidrList List of CIDR blocks. 
   */
  public fun cidrList(cidrList: Collection<String>) {
    _cidrList.addAll(cidrList)
  }

  /**
   * @param locationName The CIDR collection location name. 
   */
  public fun locationName(locationName: String) {
    cdkBuilder.locationName(locationName)
  }

  public fun build(): CfnCidrCollection.LocationProperty {
    if(_cidrList.isNotEmpty()) cdkBuilder.cidrList(_cidrList)
    return cdkBuilder.build()
  }
}
