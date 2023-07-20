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

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cognito.CfnIdentityPool
import software.amazon.awscdk.services.cognito.CfnIdentityPoolProps
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnIdentityPoolPropsDsl {
    private val cdkBuilder: CfnIdentityPoolProps.Builder = CfnIdentityPoolProps.builder()

    private val _cognitoIdentityProviders: MutableList<Any> = mutableListOf()

    private val _openIdConnectProviderArns: MutableList<String> = mutableListOf()

    private val _samlProviderArns: MutableList<String> = mutableListOf()

    public fun allowClassicFlow(allowClassicFlow: Boolean) {
        cdkBuilder.allowClassicFlow(allowClassicFlow)
    }

    public fun allowClassicFlow(allowClassicFlow: IResolvable) {
        cdkBuilder.allowClassicFlow(allowClassicFlow)
    }

    public fun allowUnauthenticatedIdentities(allowUnauthenticatedIdentities: Boolean) {
        cdkBuilder.allowUnauthenticatedIdentities(allowUnauthenticatedIdentities)
    }

    public fun allowUnauthenticatedIdentities(allowUnauthenticatedIdentities: IResolvable) {
        cdkBuilder.allowUnauthenticatedIdentities(allowUnauthenticatedIdentities)
    }

    public fun cognitoEvents(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.cognitoEvents(builder.map)
    }

    public fun cognitoEvents(cognitoEvents: Any) {
        cdkBuilder.cognitoEvents(cognitoEvents)
    }

    public fun cognitoIdentityProviders(vararg cognitoIdentityProviders: Any) {
        _cognitoIdentityProviders.addAll(listOf(*cognitoIdentityProviders))
    }

    public fun cognitoIdentityProviders(cognitoIdentityProviders: Collection<Any>) {
        _cognitoIdentityProviders.addAll(cognitoIdentityProviders)
    }

    public fun cognitoIdentityProviders(cognitoIdentityProviders: IResolvable) {
        cdkBuilder.cognitoIdentityProviders(cognitoIdentityProviders)
    }

    public fun cognitoStreams(cognitoStreams: IResolvable) {
        cdkBuilder.cognitoStreams(cognitoStreams)
    }

    public fun cognitoStreams(cognitoStreams: CfnIdentityPool.CognitoStreamsProperty) {
        cdkBuilder.cognitoStreams(cognitoStreams)
    }

    public fun developerProviderName(developerProviderName: String) {
        cdkBuilder.developerProviderName(developerProviderName)
    }

    public fun identityPoolName(identityPoolName: String) {
        cdkBuilder.identityPoolName(identityPoolName)
    }

    public fun openIdConnectProviderArns(vararg openIdConnectProviderArns: String) {
        _openIdConnectProviderArns.addAll(listOf(*openIdConnectProviderArns))
    }

    public fun openIdConnectProviderArns(openIdConnectProviderArns: Collection<String>) {
        _openIdConnectProviderArns.addAll(openIdConnectProviderArns)
    }

    public fun pushSync(pushSync: IResolvable) {
        cdkBuilder.pushSync(pushSync)
    }

    public fun pushSync(pushSync: CfnIdentityPool.PushSyncProperty) {
        cdkBuilder.pushSync(pushSync)
    }

    public fun samlProviderArns(vararg samlProviderArns: String) {
        _samlProviderArns.addAll(listOf(*samlProviderArns))
    }

    public fun samlProviderArns(samlProviderArns: Collection<String>) {
        _samlProviderArns.addAll(samlProviderArns)
    }

    public fun supportedLoginProviders(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.supportedLoginProviders(builder.map)
    }

    public fun supportedLoginProviders(supportedLoginProviders: Any) {
        cdkBuilder.supportedLoginProviders(supportedLoginProviders)
    }

    public fun build(): CfnIdentityPoolProps {
        if (_cognitoIdentityProviders.isNotEmpty()) {
            cdkBuilder.cognitoIdentityProviders(_cognitoIdentityProviders)
        }
        if (_openIdConnectProviderArns.isNotEmpty()) {
            cdkBuilder.openIdConnectProviderArns(_openIdConnectProviderArns)
        }
        if (_samlProviderArns.isNotEmpty()) cdkBuilder.samlProviderArns(_samlProviderArns)
        return cdkBuilder.build()
    }
}
