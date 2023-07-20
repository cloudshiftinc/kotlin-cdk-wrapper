@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.servicediscovery

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.servicediscovery.CfnService

@CdkDslMarker
public class CfnServiceDnsRecordPropertyDsl {
  private val cdkBuilder: CfnService.DnsRecordProperty.Builder =
      CfnService.DnsRecordProperty.builder()

  public fun ttl(ttl: Number) {
    cdkBuilder.ttl(ttl)
  }

  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnService.DnsRecordProperty = cdkBuilder.build()
}
