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
import cloudshift.awscdk.common.MapBuilder
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.apigateway.CfnRestApi
import software.amazon.awscdk.services.apigateway.CfnRestApiProps
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnRestApiPropsDsl {
    private val cdkBuilder: CfnRestApiProps.Builder = CfnRestApiProps.builder()

    private val _binaryMediaTypes: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun apiKeySourceType(apiKeySourceType: String) {
        cdkBuilder.apiKeySourceType(apiKeySourceType)
    }

    public fun binaryMediaTypes(vararg binaryMediaTypes: String) {
        _binaryMediaTypes.addAll(listOf(*binaryMediaTypes))
    }

    public fun binaryMediaTypes(binaryMediaTypes: Collection<String>) {
        _binaryMediaTypes.addAll(binaryMediaTypes)
    }

    public fun body(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.body(builder.map)
    }

    public fun body(body: Any) {
        cdkBuilder.body(body)
    }

    public fun bodyS3Location(bodyS3Location: IResolvable) {
        cdkBuilder.bodyS3Location(bodyS3Location)
    }

    public fun bodyS3Location(bodyS3Location: CfnRestApi.S3LocationProperty) {
        cdkBuilder.bodyS3Location(bodyS3Location)
    }

    public fun cloneFrom(cloneFrom: String) {
        cdkBuilder.cloneFrom(cloneFrom)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun disableExecuteApiEndpoint(disableExecuteApiEndpoint: Boolean) {
        cdkBuilder.disableExecuteApiEndpoint(disableExecuteApiEndpoint)
    }

    public fun disableExecuteApiEndpoint(disableExecuteApiEndpoint: IResolvable) {
        cdkBuilder.disableExecuteApiEndpoint(disableExecuteApiEndpoint)
    }

    public fun endpointConfiguration(endpointConfiguration: IResolvable) {
        cdkBuilder.endpointConfiguration(endpointConfiguration)
    }

    public fun endpointConfiguration(endpointConfiguration: CfnRestApi.EndpointConfigurationProperty) {
        cdkBuilder.endpointConfiguration(endpointConfiguration)
    }

    public fun failOnWarnings(failOnWarnings: Boolean) {
        cdkBuilder.failOnWarnings(failOnWarnings)
    }

    public fun failOnWarnings(failOnWarnings: IResolvable) {
        cdkBuilder.failOnWarnings(failOnWarnings)
    }

    public fun minimumCompressionSize(minimumCompressionSize: Number) {
        cdkBuilder.minimumCompressionSize(minimumCompressionSize)
    }

    public fun mode(mode: String) {
        cdkBuilder.mode(mode)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun parameters(parameters: Map<String, String>) {
        cdkBuilder.parameters(parameters)
    }

    public fun parameters(parameters: IResolvable) {
        cdkBuilder.parameters(parameters)
    }

    public fun policy(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.policy(builder.map)
    }

    public fun policy(policy: Any) {
        cdkBuilder.policy(policy)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnRestApiProps {
        if (_binaryMediaTypes.isNotEmpty()) cdkBuilder.binaryMediaTypes(_binaryMediaTypes)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
