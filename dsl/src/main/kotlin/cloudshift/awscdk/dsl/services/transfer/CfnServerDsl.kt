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

package cloudshift.awscdk.dsl.services.transfer

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.transfer.CfnServer
import software.constructs.Construct
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnServerDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnServer.Builder = CfnServer.Builder.create(scope, id)

    private val _protocols: MutableList<String> = mutableListOf()

    private val _structuredLogDestinations: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun certificate(certificate: String) {
        cdkBuilder.certificate(certificate)
    }

    public fun domain(domain: String) {
        cdkBuilder.domain(domain)
    }

    public fun endpointDetails(endpointDetails: IResolvable) {
        cdkBuilder.endpointDetails(endpointDetails)
    }

    public fun endpointDetails(endpointDetails: CfnServer.EndpointDetailsProperty) {
        cdkBuilder.endpointDetails(endpointDetails)
    }

    public fun endpointType(endpointType: String) {
        cdkBuilder.endpointType(endpointType)
    }

    public fun identityProviderDetails(identityProviderDetails: IResolvable) {
        cdkBuilder.identityProviderDetails(identityProviderDetails)
    }

    public fun identityProviderDetails(identityProviderDetails: CfnServer.IdentityProviderDetailsProperty) {
        cdkBuilder.identityProviderDetails(identityProviderDetails)
    }

    public fun identityProviderType(identityProviderType: String) {
        cdkBuilder.identityProviderType(identityProviderType)
    }

    public fun loggingRole(loggingRole: String) {
        cdkBuilder.loggingRole(loggingRole)
    }

    public fun postAuthenticationLoginBanner(postAuthenticationLoginBanner: String) {
        cdkBuilder.postAuthenticationLoginBanner(postAuthenticationLoginBanner)
    }

    public fun preAuthenticationLoginBanner(preAuthenticationLoginBanner: String) {
        cdkBuilder.preAuthenticationLoginBanner(preAuthenticationLoginBanner)
    }

    public fun protocolDetails(protocolDetails: IResolvable) {
        cdkBuilder.protocolDetails(protocolDetails)
    }

    public fun protocolDetails(protocolDetails: CfnServer.ProtocolDetailsProperty) {
        cdkBuilder.protocolDetails(protocolDetails)
    }

    public fun protocols(vararg protocols: String) {
        _protocols.addAll(listOf(*protocols))
    }

    public fun protocols(protocols: Collection<String>) {
        _protocols.addAll(protocols)
    }

    public fun securityPolicyName(securityPolicyName: String) {
        cdkBuilder.securityPolicyName(securityPolicyName)
    }

    public fun structuredLogDestinations(vararg structuredLogDestinations: String) {
        _structuredLogDestinations.addAll(listOf(*structuredLogDestinations))
    }

    public fun structuredLogDestinations(structuredLogDestinations: Collection<String>) {
        _structuredLogDestinations.addAll(structuredLogDestinations)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun workflowDetails(workflowDetails: IResolvable) {
        cdkBuilder.workflowDetails(workflowDetails)
    }

    public fun workflowDetails(workflowDetails: CfnServer.WorkflowDetailsProperty) {
        cdkBuilder.workflowDetails(workflowDetails)
    }

    public fun build(): CfnServer {
        if (_protocols.isNotEmpty()) cdkBuilder.protocols(_protocols)
        if (_structuredLogDestinations.isNotEmpty()) {
            cdkBuilder.structuredLogDestinations(_structuredLogDestinations)
        }
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
