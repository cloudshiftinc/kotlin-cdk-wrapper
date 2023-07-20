@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.cloudfront.CfnDistribution

@CdkDslMarker
public class CfnDistributionLegacyCustomOriginPropertyDsl {
  private val cdkBuilder: CfnDistribution.LegacyCustomOriginProperty.Builder =
      CfnDistribution.LegacyCustomOriginProperty.builder()

  private val _originSslProtocols: MutableList<String> = mutableListOf()

  public fun dnsName(dnsName: String) {
    cdkBuilder.dnsName(dnsName)
  }

  public fun httpPort(httpPort: Number) {
    cdkBuilder.httpPort(httpPort)
  }

  public fun httpsPort(httpsPort: Number) {
    cdkBuilder.httpsPort(httpsPort)
  }

  public fun originProtocolPolicy(originProtocolPolicy: String) {
    cdkBuilder.originProtocolPolicy(originProtocolPolicy)
  }

  public fun originSslProtocols(vararg originSslProtocols: String) {
    _originSslProtocols.addAll(listOf(*originSslProtocols))
  }

  public fun originSslProtocols(originSslProtocols: Collection<String>) {
    _originSslProtocols.addAll(originSslProtocols)
  }

  public fun build(): CfnDistribution.LegacyCustomOriginProperty {
    if(_originSslProtocols.isNotEmpty()) cdkBuilder.originSslProtocols(_originSslProtocols)
    return cdkBuilder.build()
  }
}
