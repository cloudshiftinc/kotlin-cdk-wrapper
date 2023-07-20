@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lightsail

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lightsail.CfnLoadBalancerTlsCertificate
import software.constructs.Construct

@CdkDslMarker
public class CfnLoadBalancerTlsCertificateDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnLoadBalancerTlsCertificate.Builder =
      CfnLoadBalancerTlsCertificate.Builder.create(scope, id)

  private val _certificateAlternativeNames: MutableList<String> = mutableListOf()

  public fun certificateAlternativeNames(vararg certificateAlternativeNames: String) {
    _certificateAlternativeNames.addAll(listOf(*certificateAlternativeNames))
  }

  public fun certificateAlternativeNames(certificateAlternativeNames: Collection<String>) {
    _certificateAlternativeNames.addAll(certificateAlternativeNames)
  }

  public fun certificateDomainName(certificateDomainName: String) {
    cdkBuilder.certificateDomainName(certificateDomainName)
  }

  public fun certificateName(certificateName: String) {
    cdkBuilder.certificateName(certificateName)
  }

  public fun httpsRedirectionEnabled(httpsRedirectionEnabled: Boolean) {
    cdkBuilder.httpsRedirectionEnabled(httpsRedirectionEnabled)
  }

  public fun httpsRedirectionEnabled(httpsRedirectionEnabled: IResolvable) {
    cdkBuilder.httpsRedirectionEnabled(httpsRedirectionEnabled)
  }

  public fun isAttached(isAttached: Boolean) {
    cdkBuilder.isAttached(isAttached)
  }

  public fun isAttached(isAttached: IResolvable) {
    cdkBuilder.isAttached(isAttached)
  }

  public fun loadBalancerName(loadBalancerName: String) {
    cdkBuilder.loadBalancerName(loadBalancerName)
  }

  public fun build(): CfnLoadBalancerTlsCertificate {
    if(_certificateAlternativeNames.isNotEmpty())
        cdkBuilder.certificateAlternativeNames(_certificateAlternativeNames)
    return cdkBuilder.build()
  }
}
