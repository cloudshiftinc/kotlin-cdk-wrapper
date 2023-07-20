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
import software.amazon.awscdk.services.cognito.OAuthFlows
import software.amazon.awscdk.services.cognito.OAuthScope
import software.amazon.awscdk.services.cognito.OAuthSettings
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class OAuthSettingsDsl {
    private val cdkBuilder: OAuthSettings.Builder = OAuthSettings.builder()

    private val _callbackUrls: MutableList<String> = mutableListOf()

    private val _logoutUrls: MutableList<String> = mutableListOf()

    private val _scopes: MutableList<OAuthScope> = mutableListOf()

    public fun callbackUrls(vararg callbackUrls: String) {
        _callbackUrls.addAll(listOf(*callbackUrls))
    }

    public fun callbackUrls(callbackUrls: Collection<String>) {
        _callbackUrls.addAll(callbackUrls)
    }

    public fun flows(block: OAuthFlowsDsl.() -> Unit = {}) {
        val builder = OAuthFlowsDsl()
        builder.apply(block)
        cdkBuilder.flows(builder.build())
    }

    public fun flows(flows: OAuthFlows) {
        cdkBuilder.flows(flows)
    }

    public fun logoutUrls(vararg logoutUrls: String) {
        _logoutUrls.addAll(listOf(*logoutUrls))
    }

    public fun logoutUrls(logoutUrls: Collection<String>) {
        _logoutUrls.addAll(logoutUrls)
    }

    public fun scopes(vararg scopes: OAuthScope) {
        _scopes.addAll(listOf(*scopes))
    }

    public fun scopes(scopes: Collection<OAuthScope>) {
        _scopes.addAll(scopes)
    }

    public fun build(): OAuthSettings {
        if (_callbackUrls.isNotEmpty()) cdkBuilder.callbackUrls(_callbackUrls)
        if (_logoutUrls.isNotEmpty()) cdkBuilder.logoutUrls(_logoutUrls)
        if (_scopes.isNotEmpty()) cdkBuilder.scopes(_scopes)
        return cdkBuilder.build()
    }
}
