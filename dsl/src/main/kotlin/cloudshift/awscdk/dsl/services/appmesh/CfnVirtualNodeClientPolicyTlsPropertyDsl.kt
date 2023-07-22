@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnVirtualNode

/**
 * A reference to an object that represents a Transport Layer Security (TLS) client policy.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appmesh.*;
 * ClientPolicyTlsProperty clientPolicyTlsProperty = ClientPolicyTlsProperty.builder()
 * .validation(TlsValidationContextProperty.builder()
 * .trust(TlsValidationContextTrustProperty.builder()
 * .acm(TlsValidationContextAcmTrustProperty.builder()
 * .certificateAuthorityArns(List.of("certificateAuthorityArns"))
 * .build())
 * .file(TlsValidationContextFileTrustProperty.builder()
 * .certificateChain("certificateChain")
 * .build())
 * .sds(TlsValidationContextSdsTrustProperty.builder()
 * .secretName("secretName")
 * .build())
 * .build())
 * // the properties below are optional
 * .subjectAlternativeNames(SubjectAlternativeNamesProperty.builder()
 * .match(SubjectAlternativeNameMatchersProperty.builder()
 * .exact(List.of("exact"))
 * .build())
 * .build())
 * .build())
 * // the properties below are optional
 * .certificate(ClientTlsCertificateProperty.builder()
 * .file(ListenerTlsFileCertificateProperty.builder()
 * .certificateChain("certificateChain")
 * .privateKey("privateKey")
 * .build())
 * .sds(ListenerTlsSdsCertificateProperty.builder()
 * .secretName("secretName")
 * .build())
 * .build())
 * .enforce(false)
 * .ports(List.of(123))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-clientpolicytls.html)
 */
@CdkDslMarker
public class CfnVirtualNodeClientPolicyTlsPropertyDsl {
  private val cdkBuilder: CfnVirtualNode.ClientPolicyTlsProperty.Builder =
      CfnVirtualNode.ClientPolicyTlsProperty.builder()

  private val _ports: MutableList<Number> = mutableListOf()

  /**
   * @param certificate A reference to an object that represents a client's TLS certificate.
   */
  public fun certificate(certificate: IResolvable) {
    cdkBuilder.certificate(certificate)
  }

  /**
   * @param certificate A reference to an object that represents a client's TLS certificate.
   */
  public fun certificate(certificate: CfnVirtualNode.ClientTlsCertificateProperty) {
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
   * @param validation A reference to an object that represents a TLS validation context. 
   */
  public fun validation(validation: IResolvable) {
    cdkBuilder.validation(validation)
  }

  /**
   * @param validation A reference to an object that represents a TLS validation context. 
   */
  public fun validation(validation: CfnVirtualNode.TlsValidationContextProperty) {
    cdkBuilder.validation(validation)
  }

  public fun build(): CfnVirtualNode.ClientPolicyTlsProperty {
    if(_ports.isNotEmpty()) cdkBuilder.ports(_ports)
    return cdkBuilder.build()
  }
}
