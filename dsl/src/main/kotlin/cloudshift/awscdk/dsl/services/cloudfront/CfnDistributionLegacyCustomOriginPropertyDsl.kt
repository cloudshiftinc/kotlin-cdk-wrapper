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

  /**
   * @param dnsName the value to be set. 
   */
  public fun dnsName(dnsName: String) {
    cdkBuilder.dnsName(dnsName)
  }

  /**
   * @param httpPort the value to be set.
   */
  public fun httpPort(httpPort: Number) {
    cdkBuilder.httpPort(httpPort)
  }

  /**
   * @param httpsPort the value to be set.
   */
  public fun httpsPort(httpsPort: Number) {
    cdkBuilder.httpsPort(httpsPort)
  }

  /**
   * @param originProtocolPolicy the value to be set. 
   */
  public fun originProtocolPolicy(originProtocolPolicy: String) {
    cdkBuilder.originProtocolPolicy(originProtocolPolicy)
  }

  /**
   * @param originSslProtocols the value to be set. 
   */
  public fun originSslProtocols(vararg originSslProtocols: String) {
    _originSslProtocols.addAll(listOf(*originSslProtocols))
  }

  /**
   * @param originSslProtocols the value to be set. 
   */
  public fun originSslProtocols(originSslProtocols: Collection<String>) {
    _originSslProtocols.addAll(originSslProtocols)
  }

  public fun build(): CfnDistribution.LegacyCustomOriginProperty {
    if(_originSslProtocols.isNotEmpty()) cdkBuilder.originSslProtocols(_originSslProtocols)
    return cdkBuilder.build()
  }
}
