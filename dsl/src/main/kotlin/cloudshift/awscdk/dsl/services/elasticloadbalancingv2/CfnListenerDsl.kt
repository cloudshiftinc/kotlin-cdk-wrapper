@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticloadbalancingv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener
import software.constructs.Construct

@CdkDslMarker
public class CfnListenerDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnListener.Builder = CfnListener.Builder.create(scope, id)

  private val _alpnPolicy: MutableList<String> = mutableListOf()

  private val _certificates: MutableList<Any> = mutableListOf()

  private val _defaultActions: MutableList<Any> = mutableListOf()

  public fun alpnPolicy(vararg alpnPolicy: String) {
    _alpnPolicy.addAll(listOf(*alpnPolicy))
  }

  public fun alpnPolicy(alpnPolicy: Collection<String>) {
    _alpnPolicy.addAll(alpnPolicy)
  }

  public fun certificates(vararg certificates: Any) {
    _certificates.addAll(listOf(*certificates))
  }

  public fun certificates(certificates: Collection<Any>) {
    _certificates.addAll(certificates)
  }

  public fun certificates(certificates: IResolvable) {
    cdkBuilder.certificates(certificates)
  }

  public fun defaultActions(vararg defaultActions: Any) {
    _defaultActions.addAll(listOf(*defaultActions))
  }

  public fun defaultActions(defaultActions: Collection<Any>) {
    _defaultActions.addAll(defaultActions)
  }

  public fun defaultActions(defaultActions: IResolvable) {
    cdkBuilder.defaultActions(defaultActions)
  }

  public fun loadBalancerArn(loadBalancerArn: String) {
    cdkBuilder.loadBalancerArn(loadBalancerArn)
  }

  public fun port(port: Number) {
    cdkBuilder.port(port)
  }

  public fun protocol(protocol: String) {
    cdkBuilder.protocol(protocol)
  }

  public fun sslPolicy(sslPolicy: String) {
    cdkBuilder.sslPolicy(sslPolicy)
  }

  public fun build(): CfnListener {
    if(_alpnPolicy.isNotEmpty()) cdkBuilder.alpnPolicy(_alpnPolicy)
    if(_certificates.isNotEmpty()) cdkBuilder.certificates(_certificates)
    if(_defaultActions.isNotEmpty()) cdkBuilder.defaultActions(_defaultActions)
    return cdkBuilder.build()
  }
}
