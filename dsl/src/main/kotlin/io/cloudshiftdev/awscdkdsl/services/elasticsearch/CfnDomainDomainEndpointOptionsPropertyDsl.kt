@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.elasticsearch

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.elasticsearch.CfnDomain

/**
 * Specifies additional options for the domain endpoint, such as whether to require HTTPS for all
 * traffic or whether to use a custom endpoint rather than the default endpoint.
 *
 * The `AWS::Elasticsearch::Domain` resource is being replaced by the
 * [AWS::OpenSearchService::Domain](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html)
 * resource. While the legacy Elasticsearch resource and options are still supported, we recommend
 * modifying your existing Cloudformation templates to use the new OpenSearch Service resource,
 * which supports both OpenSearch and Elasticsearch. For more information about the service rename,
 * see
 * [New resource types](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/rename.html#rename-resource)
 * in the *Amazon OpenSearch Service Developer Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.elasticsearch.*;
 * DomainEndpointOptionsProperty domainEndpointOptionsProperty =
 * DomainEndpointOptionsProperty.builder()
 * .customEndpoint("customEndpoint")
 * .customEndpointCertificateArn("customEndpointCertificateArn")
 * .customEndpointEnabled(false)
 * .enforceHttps(false)
 * .tlsSecurityPolicy("tlsSecurityPolicy")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-domainendpointoptions.html)
 */
@CdkDslMarker
public class CfnDomainDomainEndpointOptionsPropertyDsl {
    private val cdkBuilder: CfnDomain.DomainEndpointOptionsProperty.Builder =
        CfnDomain.DomainEndpointOptionsProperty.builder()

    /**
     * @param customEndpoint The fully qualified URL for your custom endpoint. Required if you
     *   enabled a custom endpoint for the domain.
     */
    public fun customEndpoint(customEndpoint: String) {
        cdkBuilder.customEndpoint(customEndpoint)
    }

    /**
     * @param customEndpointCertificateArn The AWS Certificate Manager ARN for your domain's SSL/TLS
     *   certificate. Required if you enabled a custom endpoint for the domain.
     */
    public fun customEndpointCertificateArn(customEndpointCertificateArn: String) {
        cdkBuilder.customEndpointCertificateArn(customEndpointCertificateArn)
    }

    /**
     * @param customEndpointEnabled True to enable a custom endpoint for the domain. If enabled, you
     *   must also provide values for `CustomEndpoint` and `CustomEndpointCertificateArn` .
     */
    public fun customEndpointEnabled(customEndpointEnabled: Boolean) {
        cdkBuilder.customEndpointEnabled(customEndpointEnabled)
    }

    /**
     * @param customEndpointEnabled True to enable a custom endpoint for the domain. If enabled, you
     *   must also provide values for `CustomEndpoint` and `CustomEndpointCertificateArn` .
     */
    public fun customEndpointEnabled(customEndpointEnabled: IResolvable) {
        cdkBuilder.customEndpointEnabled(customEndpointEnabled)
    }

    /** @param enforceHttps True to require that all traffic to the domain arrive over HTTPS. */
    public fun enforceHttps(enforceHttps: Boolean) {
        cdkBuilder.enforceHttps(enforceHttps)
    }

    /** @param enforceHttps True to require that all traffic to the domain arrive over HTTPS. */
    public fun enforceHttps(enforceHttps: IResolvable) {
        cdkBuilder.enforceHttps(enforceHttps)
    }

    /**
     * @param tlsSecurityPolicy The minimum TLS version required for traffic to the domain. Valid
     *   values are TLS 1.3 (recommended) or 1.2:.
     * * `Policy-Min-TLS-1-0-2019-07`
     * * `Policy-Min-TLS-1-2-2019-07`
     */
    public fun tlsSecurityPolicy(tlsSecurityPolicy: String) {
        cdkBuilder.tlsSecurityPolicy(tlsSecurityPolicy)
    }

    public fun build(): CfnDomain.DomainEndpointOptionsProperty = cdkBuilder.build()
}
