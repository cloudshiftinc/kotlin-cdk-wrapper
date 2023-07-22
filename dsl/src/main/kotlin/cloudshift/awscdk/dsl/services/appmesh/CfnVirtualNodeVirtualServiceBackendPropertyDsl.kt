@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnVirtualNode

/**
 * An object that represents a virtual service backend for a virtual node.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appmesh.*;
 * VirtualServiceBackendProperty virtualServiceBackendProperty =
 * VirtualServiceBackendProperty.builder()
 * .virtualServiceName("virtualServiceName")
 * // the properties below are optional
 * .clientPolicy(ClientPolicyProperty.builder()
 * .tls(ClientPolicyTlsProperty.builder()
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
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-virtualservicebackend.html)
 */
@CdkDslMarker
public class CfnVirtualNodeVirtualServiceBackendPropertyDsl {
  private val cdkBuilder: CfnVirtualNode.VirtualServiceBackendProperty.Builder =
      CfnVirtualNode.VirtualServiceBackendProperty.builder()

  /**
   * @param clientPolicy A reference to an object that represents the client policy for a backend.
   */
  public fun clientPolicy(clientPolicy: IResolvable) {
    cdkBuilder.clientPolicy(clientPolicy)
  }

  /**
   * @param clientPolicy A reference to an object that represents the client policy for a backend.
   */
  public fun clientPolicy(clientPolicy: CfnVirtualNode.ClientPolicyProperty) {
    cdkBuilder.clientPolicy(clientPolicy)
  }

  /**
   * @param virtualServiceName The name of the virtual service that is acting as a virtual node
   * backend. 
   *
   * App Mesh doesn't validate the existence of those virtual services specified in backends. This
   * is to prevent a cyclic dependency between virtual nodes and virtual services creation. Make sure
   * the virtual service name is correct. The virtual service can be created afterwards if it doesn't
   * already exist.
   */
  public fun virtualServiceName(virtualServiceName: String) {
    cdkBuilder.virtualServiceName(virtualServiceName)
  }

  public fun build(): CfnVirtualNode.VirtualServiceBackendProperty = cdkBuilder.build()
}
