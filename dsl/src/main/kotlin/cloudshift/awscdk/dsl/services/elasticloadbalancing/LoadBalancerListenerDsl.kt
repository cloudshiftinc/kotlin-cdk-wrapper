@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticloadbalancing

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ec2.IConnectable
import software.amazon.awscdk.services.elasticloadbalancing.LoadBalancerListener
import software.amazon.awscdk.services.elasticloadbalancing.LoadBalancingProtocol

@CdkDslMarker
public class LoadBalancerListenerDsl {
  private val cdkBuilder: LoadBalancerListener.Builder = LoadBalancerListener.builder()

  private val _allowConnectionsFrom: MutableList<IConnectable> = mutableListOf()

  private val _policyNames: MutableList<String> = mutableListOf()

  public fun allowConnectionsFrom(vararg allowConnectionsFrom: IConnectable) {
    _allowConnectionsFrom.addAll(listOf(*allowConnectionsFrom))
  }

  public fun allowConnectionsFrom(allowConnectionsFrom: Collection<IConnectable>) {
    _allowConnectionsFrom.addAll(allowConnectionsFrom)
  }

  public fun externalPort(externalPort: Number) {
    cdkBuilder.externalPort(externalPort)
  }

  public fun externalProtocol(externalProtocol: LoadBalancingProtocol) {
    cdkBuilder.externalProtocol(externalProtocol)
  }

  public fun internalPort(internalPort: Number) {
    cdkBuilder.internalPort(internalPort)
  }

  public fun internalProtocol(internalProtocol: LoadBalancingProtocol) {
    cdkBuilder.internalProtocol(internalProtocol)
  }

  public fun policyNames(vararg policyNames: String) {
    _policyNames.addAll(listOf(*policyNames))
  }

  public fun policyNames(policyNames: Collection<String>) {
    _policyNames.addAll(policyNames)
  }

  public fun sslCertificateArn(sslCertificateArn: String) {
    cdkBuilder.sslCertificateArn(sslCertificateArn)
  }

  public fun build(): LoadBalancerListener {
    if(_allowConnectionsFrom.isNotEmpty()) cdkBuilder.allowConnectionsFrom(_allowConnectionsFrom)
    if(_policyNames.isNotEmpty()) cdkBuilder.policyNames(_policyNames)
    return cdkBuilder.build()
  }
}
