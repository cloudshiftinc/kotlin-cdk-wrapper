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

package io.cloudshiftdev.awscdkdsl.services.refactorspaces

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.refactorspaces.CfnApplication
import software.amazon.awscdk.services.refactorspaces.CfnApplicationProps

/**
 * Properties for defining a `CfnApplication`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.refactorspaces.*;
 * CfnApplicationProps cfnApplicationProps = CfnApplicationProps.builder()
 * .environmentIdentifier("environmentIdentifier")
 * .name("name")
 * .proxyType("proxyType")
 * .vpcId("vpcId")
 * // the properties below are optional
 * .apiGatewayProxy(ApiGatewayProxyInputProperty.builder()
 * .endpointType("endpointType")
 * .stageName("stageName")
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-application.html)
 */
@CdkDslMarker
public class CfnApplicationPropsDsl {
    private val cdkBuilder: CfnApplicationProps.Builder = CfnApplicationProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param apiGatewayProxy The endpoint URL of the Amazon API Gateway proxy. */
    public fun apiGatewayProxy(apiGatewayProxy: IResolvable) {
        cdkBuilder.apiGatewayProxy(apiGatewayProxy)
    }

    /** @param apiGatewayProxy The endpoint URL of the Amazon API Gateway proxy. */
    public fun apiGatewayProxy(apiGatewayProxy: CfnApplication.ApiGatewayProxyInputProperty) {
        cdkBuilder.apiGatewayProxy(apiGatewayProxy)
    }

    /** @param environmentIdentifier The unique identifier of the environment. */
    public fun environmentIdentifier(environmentIdentifier: String) {
        cdkBuilder.environmentIdentifier(environmentIdentifier)
    }

    /** @param name The name of the application. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param proxyType The proxy type of the proxy created within the application. */
    public fun proxyType(proxyType: String) {
        cdkBuilder.proxyType(proxyType)
    }

    /** @param tags The tags assigned to the application. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags The tags assigned to the application. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /** @param vpcId The ID of the virtual private cloud (VPC). */
    public fun vpcId(vpcId: String) {
        cdkBuilder.vpcId(vpcId)
    }

    public fun build(): CfnApplicationProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
