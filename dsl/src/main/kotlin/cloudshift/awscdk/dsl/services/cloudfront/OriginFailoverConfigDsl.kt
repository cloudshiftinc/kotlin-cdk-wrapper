@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.cloudfront.IOrigin
import software.amazon.awscdk.services.cloudfront.OriginFailoverConfig

@CdkDslMarker
public class OriginFailoverConfigDsl {
  private val cdkBuilder: OriginFailoverConfig.Builder = OriginFailoverConfig.builder()

  private val _statusCodes: MutableList<Number> = mutableListOf()

  /**
   * @param failoverOrigin The origin to use as the fallback origin. 
   */
  public fun failoverOrigin(failoverOrigin: IOrigin) {
    cdkBuilder.failoverOrigin(failoverOrigin)
  }

  /**
   * @param statusCodes The HTTP status codes of the response that trigger querying the failover
   * Origin.
   */
  public fun statusCodes(vararg statusCodes: Number) {
    _statusCodes.addAll(listOf(*statusCodes))
  }

  /**
   * @param statusCodes The HTTP status codes of the response that trigger querying the failover
   * Origin.
   */
  public fun statusCodes(statusCodes: Collection<Number>) {
    _statusCodes.addAll(statusCodes)
  }

  public fun build(): OriginFailoverConfig {
    if(_statusCodes.isNotEmpty()) cdkBuilder.statusCodes(_statusCodes)
    return cdkBuilder.build()
  }
}
