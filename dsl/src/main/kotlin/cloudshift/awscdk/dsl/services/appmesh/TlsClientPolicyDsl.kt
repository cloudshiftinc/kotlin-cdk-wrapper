@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.appmesh.MutualTlsCertificate
import software.amazon.awscdk.services.appmesh.TlsClientPolicy
import software.amazon.awscdk.services.appmesh.TlsValidation

@CdkDslMarker
public class TlsClientPolicyDsl {
  private val cdkBuilder: TlsClientPolicy.Builder = TlsClientPolicy.builder()

  private val _ports: MutableList<Number> = mutableListOf()

  public fun enforce(enforce: Boolean) {
    cdkBuilder.enforce(enforce)
  }

  public fun mutualTlsCertificate(mutualTlsCertificate: MutualTlsCertificate) {
    cdkBuilder.mutualTlsCertificate(mutualTlsCertificate)
  }

  public fun ports(vararg ports: Number) {
    _ports.addAll(listOf(*ports))
  }

  public fun ports(ports: Collection<Number>) {
    _ports.addAll(ports)
  }

  public fun validation(block: TlsValidationDsl.() -> Unit = {}) {
    val builder = TlsValidationDsl()
    builder.apply(block)
    cdkBuilder.validation(builder.build())
  }

  public fun validation(validation: TlsValidation) {
    cdkBuilder.validation(validation)
  }

  public fun build(): TlsClientPolicy {
    if(_ports.isNotEmpty()) cdkBuilder.ports(_ports)
    return cdkBuilder.build()
  }
}
