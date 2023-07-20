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
import software.amazon.awscdk.services.refactorspaces.CfnService
import software.amazon.awscdk.services.refactorspaces.CfnServiceProps
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnServicePropsDsl {
    private val cdkBuilder: CfnServiceProps.Builder = CfnServiceProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun applicationIdentifier(applicationIdentifier: String) {
        cdkBuilder.applicationIdentifier(applicationIdentifier)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun endpointType(endpointType: String) {
        cdkBuilder.endpointType(endpointType)
    }

    public fun environmentIdentifier(environmentIdentifier: String) {
        cdkBuilder.environmentIdentifier(environmentIdentifier)
    }

    public fun lambdaEndpoint(lambdaEndpoint: IResolvable) {
        cdkBuilder.lambdaEndpoint(lambdaEndpoint)
    }

    public fun lambdaEndpoint(lambdaEndpoint: CfnService.LambdaEndpointInputProperty) {
        cdkBuilder.lambdaEndpoint(lambdaEndpoint)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun urlEndpoint(urlEndpoint: IResolvable) {
        cdkBuilder.urlEndpoint(urlEndpoint)
    }

    public fun urlEndpoint(urlEndpoint: CfnService.UrlEndpointInputProperty) {
        cdkBuilder.urlEndpoint(urlEndpoint)
    }

    public fun vpcId(vpcId: String) {
        cdkBuilder.vpcId(vpcId)
    }

    public fun build(): CfnServiceProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
