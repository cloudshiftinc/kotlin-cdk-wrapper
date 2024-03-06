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

package io.cloudshiftdev.awscdkdsl.services.ec2

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnVerifiedAccessEndpoint
import software.amazon.awscdk.services.ec2.CfnVerifiedAccessEndpointProps

/**
 * Properties for defining a `CfnVerifiedAccessEndpoint`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * CfnVerifiedAccessEndpointProps cfnVerifiedAccessEndpointProps =
 * CfnVerifiedAccessEndpointProps.builder()
 * .applicationDomain("applicationDomain")
 * .attachmentType("attachmentType")
 * .domainCertificateArn("domainCertificateArn")
 * .endpointDomainPrefix("endpointDomainPrefix")
 * .endpointType("endpointType")
 * .verifiedAccessGroupId("verifiedAccessGroupId")
 * // the properties below are optional
 * .description("description")
 * .loadBalancerOptions(LoadBalancerOptionsProperty.builder()
 * .loadBalancerArn("loadBalancerArn")
 * .port(123)
 * .protocol("protocol")
 * .subnetIds(List.of("subnetIds"))
 * .build())
 * .networkInterfaceOptions(NetworkInterfaceOptionsProperty.builder()
 * .networkInterfaceId("networkInterfaceId")
 * .port(123)
 * .protocol("protocol")
 * .build())
 * .policyDocument("policyDocument")
 * .policyEnabled(false)
 * .securityGroupIds(List.of("securityGroupIds"))
 * .sseSpecification(SseSpecificationProperty.builder()
 * .customerManagedKeyEnabled(false)
 * .kmsKeyArn("kmsKeyArn")
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessendpoint.html)
 */
@CdkDslMarker
public class CfnVerifiedAccessEndpointPropsDsl {
    private val cdkBuilder: CfnVerifiedAccessEndpointProps.Builder =
        CfnVerifiedAccessEndpointProps.builder()

    private val _securityGroupIds: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param applicationDomain The DNS name for users to reach your application. */
    public fun applicationDomain(applicationDomain: String) {
        cdkBuilder.applicationDomain(applicationDomain)
    }

    /**
     * @param attachmentType The type of attachment used to provide connectivity between the AWS
     *   Verified Access endpoint and the application.
     */
    public fun attachmentType(attachmentType: String) {
        cdkBuilder.attachmentType(attachmentType)
    }

    /** @param description A description for the AWS Verified Access endpoint. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * @param domainCertificateArn The ARN of a public TLS/SSL certificate imported into or created
     *   with ACM.
     */
    public fun domainCertificateArn(domainCertificateArn: String) {
        cdkBuilder.domainCertificateArn(domainCertificateArn)
    }

    /**
     * @param endpointDomainPrefix A custom identifier that is prepended to the DNS name that is
     *   generated for the endpoint.
     */
    public fun endpointDomainPrefix(endpointDomainPrefix: String) {
        cdkBuilder.endpointDomainPrefix(endpointDomainPrefix)
    }

    /**
     * @param endpointType The type of AWS Verified Access endpoint. Incoming application requests
     *   will be sent to an IP address, load balancer or a network interface depending on the
     *   endpoint type specified.
     */
    public fun endpointType(endpointType: String) {
        cdkBuilder.endpointType(endpointType)
    }

    /**
     * @param loadBalancerOptions The load balancer details if creating the AWS Verified Access
     *   endpoint as `load-balancer` type.
     */
    public fun loadBalancerOptions(loadBalancerOptions: IResolvable) {
        cdkBuilder.loadBalancerOptions(loadBalancerOptions)
    }

    /**
     * @param loadBalancerOptions The load balancer details if creating the AWS Verified Access
     *   endpoint as `load-balancer` type.
     */
    public fun loadBalancerOptions(
        loadBalancerOptions: CfnVerifiedAccessEndpoint.LoadBalancerOptionsProperty
    ) {
        cdkBuilder.loadBalancerOptions(loadBalancerOptions)
    }

    /** @param networkInterfaceOptions The options for network-interface type endpoint. */
    public fun networkInterfaceOptions(networkInterfaceOptions: IResolvable) {
        cdkBuilder.networkInterfaceOptions(networkInterfaceOptions)
    }

    /** @param networkInterfaceOptions The options for network-interface type endpoint. */
    public fun networkInterfaceOptions(
        networkInterfaceOptions: CfnVerifiedAccessEndpoint.NetworkInterfaceOptionsProperty
    ) {
        cdkBuilder.networkInterfaceOptions(networkInterfaceOptions)
    }

    /** @param policyDocument The Verified Access policy document. */
    public fun policyDocument(policyDocument: String) {
        cdkBuilder.policyDocument(policyDocument)
    }

    /** @param policyEnabled The status of the Verified Access policy. */
    public fun policyEnabled(policyEnabled: Boolean) {
        cdkBuilder.policyEnabled(policyEnabled)
    }

    /** @param policyEnabled The status of the Verified Access policy. */
    public fun policyEnabled(policyEnabled: IResolvable) {
        cdkBuilder.policyEnabled(policyEnabled)
    }

    /** @param securityGroupIds The IDs of the security groups for the endpoint. */
    public fun securityGroupIds(vararg securityGroupIds: String) {
        _securityGroupIds.addAll(listOf(*securityGroupIds))
    }

    /** @param securityGroupIds The IDs of the security groups for the endpoint. */
    public fun securityGroupIds(securityGroupIds: Collection<String>) {
        _securityGroupIds.addAll(securityGroupIds)
    }

    /** @param sseSpecification The options for additional server side encryption. */
    public fun sseSpecification(sseSpecification: IResolvable) {
        cdkBuilder.sseSpecification(sseSpecification)
    }

    /** @param sseSpecification The options for additional server side encryption. */
    public fun sseSpecification(
        sseSpecification: CfnVerifiedAccessEndpoint.SseSpecificationProperty
    ) {
        cdkBuilder.sseSpecification(sseSpecification)
    }

    /** @param tags The tags. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags The tags. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /** @param verifiedAccessGroupId The ID of the AWS Verified Access group. */
    public fun verifiedAccessGroupId(verifiedAccessGroupId: String) {
        cdkBuilder.verifiedAccessGroupId(verifiedAccessGroupId)
    }

    public fun build(): CfnVerifiedAccessEndpointProps {
        if (_securityGroupIds.isNotEmpty()) cdkBuilder.securityGroupIds(_securityGroupIds)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
