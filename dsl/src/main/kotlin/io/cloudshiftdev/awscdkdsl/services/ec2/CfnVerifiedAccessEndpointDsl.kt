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
import software.constructs.Construct

/**
 * An AWS Verified Access endpoint specifies the application that AWS Verified Access provides
 * access to.
 *
 * It must be attached to an AWS Verified Access group. An AWS Verified Access endpoint must also
 * have an attached access policy before you attached it to a group.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * CfnVerifiedAccessEndpoint cfnVerifiedAccessEndpoint =
 * CfnVerifiedAccessEndpoint.Builder.create(this, "MyCfnVerifiedAccessEndpoint")
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
public class CfnVerifiedAccessEndpointDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnVerifiedAccessEndpoint.Builder =
        CfnVerifiedAccessEndpoint.Builder.create(scope, id)

    private val _securityGroupIds: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * The DNS name for users to reach your application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessendpoint.html#cfn-ec2-verifiedaccessendpoint-applicationdomain)
     *
     * @param applicationDomain The DNS name for users to reach your application.
     */
    public fun applicationDomain(applicationDomain: String) {
        cdkBuilder.applicationDomain(applicationDomain)
    }

    /**
     * The type of attachment used to provide connectivity between the AWS Verified Access endpoint
     * and the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessendpoint.html#cfn-ec2-verifiedaccessendpoint-attachmenttype)
     *
     * @param attachmentType The type of attachment used to provide connectivity between the AWS
     *   Verified Access endpoint and the application.
     */
    public fun attachmentType(attachmentType: String) {
        cdkBuilder.attachmentType(attachmentType)
    }

    /**
     * A description for the AWS Verified Access endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessendpoint.html#cfn-ec2-verifiedaccessendpoint-description)
     *
     * @param description A description for the AWS Verified Access endpoint.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * The ARN of a public TLS/SSL certificate imported into or created with ACM.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessendpoint.html#cfn-ec2-verifiedaccessendpoint-domaincertificatearn)
     *
     * @param domainCertificateArn The ARN of a public TLS/SSL certificate imported into or created
     *   with ACM.
     */
    public fun domainCertificateArn(domainCertificateArn: String) {
        cdkBuilder.domainCertificateArn(domainCertificateArn)
    }

    /**
     * A custom identifier that is prepended to the DNS name that is generated for the endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessendpoint.html#cfn-ec2-verifiedaccessendpoint-endpointdomainprefix)
     *
     * @param endpointDomainPrefix A custom identifier that is prepended to the DNS name that is
     *   generated for the endpoint.
     */
    public fun endpointDomainPrefix(endpointDomainPrefix: String) {
        cdkBuilder.endpointDomainPrefix(endpointDomainPrefix)
    }

    /**
     * The type of AWS Verified Access endpoint.
     *
     * Incoming application requests will be sent to an IP address, load balancer or a network
     * interface depending on the endpoint type specified.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessendpoint.html#cfn-ec2-verifiedaccessendpoint-endpointtype)
     *
     * @param endpointType The type of AWS Verified Access endpoint.
     */
    public fun endpointType(endpointType: String) {
        cdkBuilder.endpointType(endpointType)
    }

    /**
     * The load balancer details if creating the AWS Verified Access endpoint as `load-balancer`
     * type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessendpoint.html#cfn-ec2-verifiedaccessendpoint-loadbalanceroptions)
     *
     * @param loadBalancerOptions The load balancer details if creating the AWS Verified Access
     *   endpoint as `load-balancer` type.
     */
    public fun loadBalancerOptions(loadBalancerOptions: IResolvable) {
        cdkBuilder.loadBalancerOptions(loadBalancerOptions)
    }

    /**
     * The load balancer details if creating the AWS Verified Access endpoint as `load-balancer`
     * type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessendpoint.html#cfn-ec2-verifiedaccessendpoint-loadbalanceroptions)
     *
     * @param loadBalancerOptions The load balancer details if creating the AWS Verified Access
     *   endpoint as `load-balancer` type.
     */
    public fun loadBalancerOptions(
        loadBalancerOptions: CfnVerifiedAccessEndpoint.LoadBalancerOptionsProperty
    ) {
        cdkBuilder.loadBalancerOptions(loadBalancerOptions)
    }

    /**
     * The options for network-interface type endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessendpoint.html#cfn-ec2-verifiedaccessendpoint-networkinterfaceoptions)
     *
     * @param networkInterfaceOptions The options for network-interface type endpoint.
     */
    public fun networkInterfaceOptions(networkInterfaceOptions: IResolvable) {
        cdkBuilder.networkInterfaceOptions(networkInterfaceOptions)
    }

    /**
     * The options for network-interface type endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessendpoint.html#cfn-ec2-verifiedaccessendpoint-networkinterfaceoptions)
     *
     * @param networkInterfaceOptions The options for network-interface type endpoint.
     */
    public fun networkInterfaceOptions(
        networkInterfaceOptions: CfnVerifiedAccessEndpoint.NetworkInterfaceOptionsProperty
    ) {
        cdkBuilder.networkInterfaceOptions(networkInterfaceOptions)
    }

    /**
     * The Verified Access policy document.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessendpoint.html#cfn-ec2-verifiedaccessendpoint-policydocument)
     *
     * @param policyDocument The Verified Access policy document.
     */
    public fun policyDocument(policyDocument: String) {
        cdkBuilder.policyDocument(policyDocument)
    }

    /**
     * The status of the Verified Access policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessendpoint.html#cfn-ec2-verifiedaccessendpoint-policyenabled)
     *
     * @param policyEnabled The status of the Verified Access policy.
     */
    public fun policyEnabled(policyEnabled: Boolean) {
        cdkBuilder.policyEnabled(policyEnabled)
    }

    /**
     * The status of the Verified Access policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessendpoint.html#cfn-ec2-verifiedaccessendpoint-policyenabled)
     *
     * @param policyEnabled The status of the Verified Access policy.
     */
    public fun policyEnabled(policyEnabled: IResolvable) {
        cdkBuilder.policyEnabled(policyEnabled)
    }

    /**
     * The IDs of the security groups for the endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessendpoint.html#cfn-ec2-verifiedaccessendpoint-securitygroupids)
     *
     * @param securityGroupIds The IDs of the security groups for the endpoint.
     */
    public fun securityGroupIds(vararg securityGroupIds: String) {
        _securityGroupIds.addAll(listOf(*securityGroupIds))
    }

    /**
     * The IDs of the security groups for the endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessendpoint.html#cfn-ec2-verifiedaccessendpoint-securitygroupids)
     *
     * @param securityGroupIds The IDs of the security groups for the endpoint.
     */
    public fun securityGroupIds(securityGroupIds: Collection<String>) {
        _securityGroupIds.addAll(securityGroupIds)
    }

    /**
     * The tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessendpoint.html#cfn-ec2-verifiedaccessendpoint-tags)
     *
     * @param tags The tags.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * The tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessendpoint.html#cfn-ec2-verifiedaccessendpoint-tags)
     *
     * @param tags The tags.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * The ID of the AWS Verified Access group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessendpoint.html#cfn-ec2-verifiedaccessendpoint-verifiedaccessgroupid)
     *
     * @param verifiedAccessGroupId The ID of the AWS Verified Access group.
     */
    public fun verifiedAccessGroupId(verifiedAccessGroupId: String) {
        cdkBuilder.verifiedAccessGroupId(verifiedAccessGroupId)
    }

    public fun build(): CfnVerifiedAccessEndpoint {
        if (_securityGroupIds.isNotEmpty()) cdkBuilder.securityGroupIds(_securityGroupIds)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
