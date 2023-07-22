@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnVirtualGateway

@CdkDslMarker
public class CfnVirtualGatewayVirtualGatewayClientPolicyTlsPropertyDsl {
  private val cdkBuilder: CfnVirtualGateway.VirtualGatewayClientPolicyTlsProperty.Builder =
      CfnVirtualGateway.VirtualGatewayClientPolicyTlsProperty.builder()

  private val _ports: MutableList<Number> = mutableListOf()

  /**
   * @param certificate A reference to an object that represents a virtual gateway's client's
   * Transport Layer Security (TLS) certificate.
   */
  public fun certificate(certificate: IResolvable) {
    cdkBuilder.certificate(certificate)
  }

  /**
   * @param certificate A reference to an object that represents a virtual gateway's client's
   * Transport Layer Security (TLS) certificate.
   */
  public
      fun certificate(certificate: CfnVirtualGateway.VirtualGatewayClientTlsCertificateProperty) {
    cdkBuilder.certificate(certificate)
  }

  /**
   * @param enforce Whether the policy is enforced.
   * The default is `True` , if a value isn't specified.
   */
  public fun enforce(enforce: Boolean) {
    cdkBuilder.enforce(enforce)
  }

  /**
   * @param enforce Whether the policy is enforced.
   * The default is `True` , if a value isn't specified.
   */
  public fun enforce(enforce: IResolvable) {
    cdkBuilder.enforce(enforce)
  }

  /**
   * @param ports One or more ports that the policy is enforced for.
   */
  public fun ports(vararg ports: Number) {
    _ports.addAll(listOf(*ports))
  }

  /**
   * @param ports One or more ports that the policy is enforced for.
   */
  public fun ports(ports: Collection<Number>) {
    _ports.addAll(ports)
  }

  /**
   * @param ports One or more ports that the policy is enforced for.
   */
  public fun ports(ports: IResolvable) {
    cdkBuilder.ports(ports)
  }

  /**
   * @param validation A reference to an object that represents a Transport Layer Security (TLS)
   * validation context. 
   */
  public fun validation(validation: IResolvable) {
    cdkBuilder.validation(validation)
  }

  /**
   * @param validation A reference to an object that represents a Transport Layer Security (TLS)
   * validation context. 
   */
  public fun validation(validation: CfnVirtualGateway.VirtualGatewayTlsValidationContextProperty) {
    cdkBuilder.validation(validation)
  }

  public fun build(): CfnVirtualGateway.VirtualGatewayClientPolicyTlsProperty {
    if(_ports.isNotEmpty()) cdkBuilder.ports(_ports)
    return cdkBuilder.build()
  }
}
