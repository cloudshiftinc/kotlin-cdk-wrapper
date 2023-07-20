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

package cloudshift.awscdk.dsl.customresources

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import software.amazon.awscdk.customresources.AwsSdkCall
import software.amazon.awscdk.customresources.PhysicalResourceId
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class AwsSdkCallDsl {
    private val cdkBuilder: AwsSdkCall.Builder = AwsSdkCall.builder()

    private val _outputPaths: MutableList<String> = mutableListOf()

    public fun action(action: String) {
        cdkBuilder.action(action)
    }

    public fun apiVersion(apiVersion: String) {
        cdkBuilder.apiVersion(apiVersion)
    }

    public fun assumedRoleArn(assumedRoleArn: String) {
        cdkBuilder.assumedRoleArn(assumedRoleArn)
    }

    public fun ignoreErrorCodesMatching(ignoreErrorCodesMatching: String) {
        cdkBuilder.ignoreErrorCodesMatching(ignoreErrorCodesMatching)
    }

    public fun outputPaths(vararg outputPaths: String) {
        _outputPaths.addAll(listOf(*outputPaths))
    }

    public fun outputPaths(outputPaths: Collection<String>) {
        _outputPaths.addAll(outputPaths)
    }

    public fun parameters(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.parameters(builder.map)
    }

    public fun parameters(parameters: Any) {
        cdkBuilder.parameters(parameters)
    }

    public fun physicalResourceId(physicalResourceId: PhysicalResourceId) {
        cdkBuilder.physicalResourceId(physicalResourceId)
    }

    public fun region(region: String) {
        cdkBuilder.region(region)
    }

    public fun service(service: String) {
        cdkBuilder.service(service)
    }

    public fun build(): AwsSdkCall {
        if (_outputPaths.isNotEmpty()) cdkBuilder.outputPaths(_outputPaths)
        return cdkBuilder.build()
    }
}
