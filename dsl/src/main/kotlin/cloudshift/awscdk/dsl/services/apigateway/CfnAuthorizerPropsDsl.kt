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

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.apigateway.CfnAuthorizerProps
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnAuthorizerPropsDsl {
    private val cdkBuilder: CfnAuthorizerProps.Builder = CfnAuthorizerProps.builder()

    private val _providerArns: MutableList<String> = mutableListOf()

    public fun authType(authType: String) {
        cdkBuilder.authType(authType)
    }

    public fun authorizerCredentials(authorizerCredentials: String) {
        cdkBuilder.authorizerCredentials(authorizerCredentials)
    }

    public fun authorizerResultTtlInSeconds(authorizerResultTtlInSeconds: Number) {
        cdkBuilder.authorizerResultTtlInSeconds(authorizerResultTtlInSeconds)
    }

    public fun authorizerUri(authorizerUri: String) {
        cdkBuilder.authorizerUri(authorizerUri)
    }

    public fun identitySource(identitySource: String) {
        cdkBuilder.identitySource(identitySource)
    }

    public fun identityValidationExpression(identityValidationExpression: String) {
        cdkBuilder.identityValidationExpression(identityValidationExpression)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun providerArns(vararg providerArns: String) {
        _providerArns.addAll(listOf(*providerArns))
    }

    public fun providerArns(providerArns: Collection<String>) {
        _providerArns.addAll(providerArns)
    }

    public fun restApiId(restApiId: String) {
        cdkBuilder.restApiId(restApiId)
    }

    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnAuthorizerProps {
        if (_providerArns.isNotEmpty()) cdkBuilder.providerArns(_providerArns)
        return cdkBuilder.build()
    }
}
