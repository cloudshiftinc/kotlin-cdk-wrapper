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

package cloudshift.awscdk.dsl.services.refactorspaces

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.refactorspaces.CfnApplication
import software.constructs.Construct
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnApplicationDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnApplication.Builder = CfnApplication.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun apiGatewayProxy(apiGatewayProxy: IResolvable) {
        cdkBuilder.apiGatewayProxy(apiGatewayProxy)
    }

    public fun apiGatewayProxy(apiGatewayProxy: CfnApplication.ApiGatewayProxyInputProperty) {
        cdkBuilder.apiGatewayProxy(apiGatewayProxy)
    }

    public fun environmentIdentifier(environmentIdentifier: String) {
        cdkBuilder.environmentIdentifier(environmentIdentifier)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun proxyType(proxyType: String) {
        cdkBuilder.proxyType(proxyType)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun vpcId(vpcId: String) {
        cdkBuilder.vpcId(vpcId)
    }

    public fun build(): CfnApplication {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
