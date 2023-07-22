@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.opsworks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.opsworks.CfnStack

@CdkDslMarker
public class CfnStackElasticIpPropertyDsl {
  private val cdkBuilder: CfnStack.ElasticIpProperty.Builder = CfnStack.ElasticIpProperty.builder()

  /**
   * @param ip The IP address. 
   */
  public fun ip(ip: String) {
    cdkBuilder.ip(ip)
  }

  /**
   * @param name The name, which can be a maximum of 32 characters.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): CfnStack.ElasticIpProperty = cdkBuilder.build()
}
