@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.opsworks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.opsworks.CfnStack

@CdkDslMarker
public class CfnStackElasticIpPropertyDsl {
  private val cdkBuilder: CfnStack.ElasticIpProperty.Builder = CfnStack.ElasticIpProperty.builder()

  public fun ip(ip: String) {
    cdkBuilder.ip(ip)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): CfnStack.ElasticIpProperty = cdkBuilder.build()
}
