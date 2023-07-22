@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.DomainName
import software.amazon.awscdk.services.apigateway.EndpointType
import software.amazon.awscdk.services.apigateway.IRestApi
import software.amazon.awscdk.services.apigateway.MTLSConfig
import software.amazon.awscdk.services.apigateway.SecurityPolicy
import software.amazon.awscdk.services.certificatemanager.ICertificate
import software.constructs.Construct

/**
 * Example:
 *
 * ```
 * RestApi api;
 * IDomainName domainName = DomainName.fromDomainNameAttributes(this, "DomainName",
 * DomainNameAttributes.builder()
 * .domainName("domainName")
 * .domainNameAliasHostedZoneId("domainNameAliasHostedZoneId")
 * .domainNameAliasTarget("domainNameAliasTarget")
 * .build());
 * BasePathMapping.Builder.create(this, "BasePathMapping")
 * .domainName(domainName)
 * .restApi(api)
 * .build();
 * ```
 */
@CdkDslMarker
public class DomainNameDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: DomainName.Builder = DomainName.Builder.create(scope, id)

  /**
   * The base path name that callers of the API must provide in the URL after the domain name (e.g.
   * `example.com/base-path`). If you specify this property, it can't be an empty string.
   *
   * Default: - map requests from the domain root (e.g. `example.com`).
   *
   * @param basePath The base path name that callers of the API must provide in the URL after the
   * domain name (e.g. `example.com/base-path`). If you specify this property, it can't be an empty
   * string. 
   */
  public fun basePath(basePath: String) {
    cdkBuilder.basePath(basePath)
  }

  /**
   * The reference to an AWS-managed certificate for use by the edge-optimized endpoint for the
   * domain name.
   *
   * For "EDGE" domain names, the certificate
   * needs to be in the US East (N. Virginia) region.
   *
   * @param certificate The reference to an AWS-managed certificate for use by the edge-optimized
   * endpoint for the domain name. 
   */
  public fun certificate(certificate: ICertificate) {
    cdkBuilder.certificate(certificate)
  }

  /**
   * The custom domain name for your API.
   *
   * Uppercase letters are not supported.
   *
   * @param domainName The custom domain name for your API. 
   */
  public fun domainName(domainName: String) {
    cdkBuilder.domainName(domainName)
  }

  /**
   * The type of endpoint for this DomainName.
   *
   * Default: REGIONAL
   *
   * @param endpointType The type of endpoint for this DomainName. 
   */
  public fun endpointType(endpointType: EndpointType) {
    cdkBuilder.endpointType(endpointType)
  }

  /**
   * If specified, all requests to this domain will be mapped to the production deployment of this
   * API.
   *
   * If you wish to map this domain to multiple APIs
   * with different base paths, use `addBasePathMapping` or `addApiMapping`.
   *
   * Default: - you will have to call `addBasePathMapping` to map this domain to
   * API endpoints.
   *
   * @param mapping If specified, all requests to this domain will be mapped to the production
   * deployment of this API. 
   */
  public fun mapping(mapping: IRestApi) {
    cdkBuilder.mapping(mapping)
  }

  /**
   * The mutual TLS authentication configuration for a custom domain name.
   *
   * Default: - mTLS is not configured.
   *
   * @param mtls The mutual TLS authentication configuration for a custom domain name. 
   */
  public fun mtls(mtls: MTLSConfigDsl.() -> Unit = {}) {
    val builder = MTLSConfigDsl()
    builder.apply(mtls)
    cdkBuilder.mtls(builder.build())
  }

  /**
   * The mutual TLS authentication configuration for a custom domain name.
   *
   * Default: - mTLS is not configured.
   *
   * @param mtls The mutual TLS authentication configuration for a custom domain name. 
   */
  public fun mtls(mtls: MTLSConfig) {
    cdkBuilder.mtls(mtls)
  }

  /**
   * The Transport Layer Security (TLS) version + cipher suite for this domain name.
   *
   * Default: SecurityPolicy.TLS_1_2
   *
   * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-domainname.html)
   * @param securityPolicy The Transport Layer Security (TLS) version + cipher suite for this domain
   * name. 
   */
  public fun securityPolicy(securityPolicy: SecurityPolicy) {
    cdkBuilder.securityPolicy(securityPolicy)
  }

  public fun build(): DomainName = cdkBuilder.build()
}
