@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnVirtualNode

/**
 * An object that represents the default properties for a backend.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appmesh.*;
 * BackendDefaultsProperty backendDefaultsProperty = BackendDefaultsProperty.builder()
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-backenddefaults.html)
 */
@CdkDslMarker
public class CfnVirtualNodeBackendDefaultsPropertyDsl {
  private val cdkBuilder: CfnVirtualNode.BackendDefaultsProperty.Builder =
      CfnVirtualNode.BackendDefaultsProperty.builder()

  /**
   * @param clientPolicy A reference to an object that represents a client policy.
   */
  public fun clientPolicy(clientPolicy: IResolvable) {
    cdkBuilder.clientPolicy(clientPolicy)
  }

  /**
   * @param clientPolicy A reference to an object that represents a client policy.
   */
  public fun clientPolicy(clientPolicy: CfnVirtualNode.ClientPolicyProperty) {
    cdkBuilder.clientPolicy(clientPolicy)
  }

  public fun build(): CfnVirtualNode.BackendDefaultsProperty = cdkBuilder.build()
}
