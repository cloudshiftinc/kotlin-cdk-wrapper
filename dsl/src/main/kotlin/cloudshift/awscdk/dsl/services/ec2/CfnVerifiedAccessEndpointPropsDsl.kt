@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnVerifiedAccessEndpoint
import software.amazon.awscdk.services.ec2.CfnVerifiedAccessEndpointProps
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnVerifiedAccessEndpointPropsDsl {
    private val cdkBuilder: CfnVerifiedAccessEndpointProps.Builder =
        CfnVerifiedAccessEndpointProps.builder()

    private val _securityGroupIds: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun applicationDomain(applicationDomain: String) {
        cdkBuilder.applicationDomain(applicationDomain)
    }

    public fun attachmentType(attachmentType: String) {
        cdkBuilder.attachmentType(attachmentType)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun domainCertificateArn(domainCertificateArn: String) {
        cdkBuilder.domainCertificateArn(domainCertificateArn)
    }

    public fun endpointDomainPrefix(endpointDomainPrefix: String) {
        cdkBuilder.endpointDomainPrefix(endpointDomainPrefix)
    }

    public fun endpointType(endpointType: String) {
        cdkBuilder.endpointType(endpointType)
    }

    public fun loadBalancerOptions(loadBalancerOptions: IResolvable) {
        cdkBuilder.loadBalancerOptions(loadBalancerOptions)
    }

    public fun loadBalancerOptions(loadBalancerOptions: CfnVerifiedAccessEndpoint.LoadBalancerOptionsProperty) {
        cdkBuilder.loadBalancerOptions(loadBalancerOptions)
    }

    public fun networkInterfaceOptions(networkInterfaceOptions: IResolvable) {
        cdkBuilder.networkInterfaceOptions(networkInterfaceOptions)
    }

    public fun networkInterfaceOptions(networkInterfaceOptions: CfnVerifiedAccessEndpoint.NetworkInterfaceOptionsProperty) {
        cdkBuilder.networkInterfaceOptions(networkInterfaceOptions)
    }

    public fun policyDocument(policyDocument: String) {
        cdkBuilder.policyDocument(policyDocument)
    }

    public fun policyEnabled(policyEnabled: Boolean) {
        cdkBuilder.policyEnabled(policyEnabled)
    }

    public fun policyEnabled(policyEnabled: IResolvable) {
        cdkBuilder.policyEnabled(policyEnabled)
    }

    public fun securityGroupIds(vararg securityGroupIds: String) {
        _securityGroupIds.addAll(listOf(*securityGroupIds))
    }

    public fun securityGroupIds(securityGroupIds: Collection<String>) {
        _securityGroupIds.addAll(securityGroupIds)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun verifiedAccessGroupId(verifiedAccessGroupId: String) {
        cdkBuilder.verifiedAccessGroupId(verifiedAccessGroupId)
    }

    public fun build(): CfnVerifiedAccessEndpointProps {
        if (_securityGroupIds.isNotEmpty()) cdkBuilder.securityGroupIds(_securityGroupIds)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
