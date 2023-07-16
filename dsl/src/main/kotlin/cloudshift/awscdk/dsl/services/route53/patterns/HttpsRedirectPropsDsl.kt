@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.route53.patterns

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.certificatemanager.ICertificate
import software.amazon.awscdk.services.route53.IHostedZone
import software.amazon.awscdk.services.route53.patterns.HttpsRedirectProps

@CdkDslMarker
public class HttpsRedirectPropsDsl {
  private val cdkBuilder: HttpsRedirectProps.Builder = HttpsRedirectProps.builder()

  private val _recordNames: MutableList<String> = mutableListOf()

  public fun certificate(certificate: ICertificate) {
    cdkBuilder.certificate(certificate)
  }

  public fun recordNames(vararg recordNames: String) {
    _recordNames.addAll(listOf(*recordNames))
  }

  public fun recordNames(recordNames: Collection<String>) {
    _recordNames.addAll(recordNames)
  }

  public fun targetDomain(targetDomain: String) {
    cdkBuilder.targetDomain(targetDomain)
  }

  public fun zone(zone: IHostedZone) {
    cdkBuilder.zone(zone)
  }

  public fun build(): HttpsRedirectProps {
    if(_recordNames.isNotEmpty()) cdkBuilder.recordNames(_recordNames)
    return cdkBuilder.build()
  }
}
