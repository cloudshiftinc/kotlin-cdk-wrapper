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

package cloudshift.awscdk.dsl.services.appsync

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appsync.CfnGraphQLApi
import software.amazon.awscdk.services.appsync.CfnGraphQLApiProps
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnGraphQLApiPropsDsl {
    private val cdkBuilder: CfnGraphQLApiProps.Builder = CfnGraphQLApiProps.builder()

    private val _additionalAuthenticationProviders: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun additionalAuthenticationProviders(vararg additionalAuthenticationProviders: Any) {
        _additionalAuthenticationProviders.addAll(listOf(*additionalAuthenticationProviders))
    }

    public fun additionalAuthenticationProviders(additionalAuthenticationProviders: Collection<Any>) {
        _additionalAuthenticationProviders.addAll(additionalAuthenticationProviders)
    }

    public fun additionalAuthenticationProviders(additionalAuthenticationProviders: IResolvable) {
        cdkBuilder.additionalAuthenticationProviders(additionalAuthenticationProviders)
    }

    public fun apiType(apiType: String) {
        cdkBuilder.apiType(apiType)
    }

    public fun authenticationType(authenticationType: String) {
        cdkBuilder.authenticationType(authenticationType)
    }

    public fun lambdaAuthorizerConfig(lambdaAuthorizerConfig: IResolvable) {
        cdkBuilder.lambdaAuthorizerConfig(lambdaAuthorizerConfig)
    }

    public fun lambdaAuthorizerConfig(lambdaAuthorizerConfig: CfnGraphQLApi.LambdaAuthorizerConfigProperty) {
        cdkBuilder.lambdaAuthorizerConfig(lambdaAuthorizerConfig)
    }

    public fun logConfig(logConfig: IResolvable) {
        cdkBuilder.logConfig(logConfig)
    }

    public fun logConfig(logConfig: CfnGraphQLApi.LogConfigProperty) {
        cdkBuilder.logConfig(logConfig)
    }

    public fun mergedApiExecutionRoleArn(mergedApiExecutionRoleArn: String) {
        cdkBuilder.mergedApiExecutionRoleArn(mergedApiExecutionRoleArn)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun openIdConnectConfig(openIdConnectConfig: IResolvable) {
        cdkBuilder.openIdConnectConfig(openIdConnectConfig)
    }

    public fun openIdConnectConfig(openIdConnectConfig: CfnGraphQLApi.OpenIDConnectConfigProperty) {
        cdkBuilder.openIdConnectConfig(openIdConnectConfig)
    }

    public fun ownerContact(ownerContact: String) {
        cdkBuilder.ownerContact(ownerContact)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun userPoolConfig(userPoolConfig: IResolvable) {
        cdkBuilder.userPoolConfig(userPoolConfig)
    }

    public fun userPoolConfig(userPoolConfig: CfnGraphQLApi.UserPoolConfigProperty) {
        cdkBuilder.userPoolConfig(userPoolConfig)
    }

    public fun visibility(visibility: String) {
        cdkBuilder.visibility(visibility)
    }

    public fun xrayEnabled(xrayEnabled: Boolean) {
        cdkBuilder.xrayEnabled(xrayEnabled)
    }

    public fun xrayEnabled(xrayEnabled: IResolvable) {
        cdkBuilder.xrayEnabled(xrayEnabled)
    }

    public fun build(): CfnGraphQLApiProps {
        if (_additionalAuthenticationProviders.isNotEmpty()) {
            cdkBuilder.additionalAuthenticationProviders(_additionalAuthenticationProviders)
        }
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
