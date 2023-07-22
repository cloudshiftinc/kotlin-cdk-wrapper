@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.DomainNameOptions
import software.amazon.awscdk.services.apigateway.EndpointType
import software.amazon.awscdk.services.apigateway.MTLSConfig
import software.amazon.awscdk.services.apigateway.SecurityPolicy
import software.amazon.awscdk.services.certificatemanager.ICertificate

@CdkDslMarker
public class DomainNameOptionsDsl {
  private val cdkBuilder: DomainNameOptions.Builder = DomainNameOptions.builder()

  /**
   * @param basePath The base path name that callers of the API must provide in the URL after the
   * domain name (e.g. `example.com/base-path`). If you specify this property, it can't be an empty
   * string.
   */
  public fun basePath(basePath: String) {
    cdkBuilder.basePath(basePath)
  }

  /**
   * @param certificate The reference to an AWS-managed certificate for use by the edge-optimized
   * endpoint for the domain name. 
   * For "EDGE" domain names, the certificate
   * needs to be in the US East (N. Virginia) region.
   */
  public fun certificate(certificate: ICertificate) {
    cdkBuilder.certificate(certificate)
  }

  /**
   * @param domainName The custom domain name for your API. 
   * Uppercase letters are not supported.
   */
  public fun domainName(domainName: String) {
    cdkBuilder.domainName(domainName)
  }

  /**
   * @param endpointType The type of endpoint for this DomainName.
   */
  public fun endpointType(endpointType: EndpointType) {
    cdkBuilder.endpointType(endpointType)
  }

  /**
   * @param mtls The mutual TLS authentication configuration for a custom domain name.
   */
  public fun mtls(mtls: MTLSConfigDsl.() -> Unit = {}) {
    val builder = MTLSConfigDsl()
    builder.apply(mtls)
    cdkBuilder.mtls(builder.build())
  }

  /**
   * @param mtls The mutual TLS authentication configuration for a custom domain name.
   */
  public fun mtls(mtls: MTLSConfig) {
    cdkBuilder.mtls(mtls)
  }

  /**
   * @param securityPolicy The Transport Layer Security (TLS) version + cipher suite for this domain
   * name.
   */
  public fun securityPolicy(securityPolicy: SecurityPolicy) {
    cdkBuilder.securityPolicy(securityPolicy)
  }

  public fun build(): DomainNameOptions = cdkBuilder.build()
}
