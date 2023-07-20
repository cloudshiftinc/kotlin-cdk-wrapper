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

package cloudshift.awscdk.dsl.services.events.targets

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import cloudshift.awscdk.dsl.services.iam.PolicyStatementDsl
import software.amazon.awscdk.services.events.targets.AwsApiProps
import software.amazon.awscdk.services.iam.PolicyStatement
import kotlin.Any
import kotlin.String
import kotlin.Unit

@CdkDslMarker
public class AwsApiPropsDsl {
    private val cdkBuilder: AwsApiProps.Builder = AwsApiProps.builder()

    public fun action(action: String) {
        cdkBuilder.action(action)
    }

    public fun apiVersion(apiVersion: String) {
        cdkBuilder.apiVersion(apiVersion)
    }

    public fun catchErrorPattern(catchErrorPattern: String) {
        cdkBuilder.catchErrorPattern(catchErrorPattern)
    }

    public fun parameters(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.parameters(builder.map)
    }

    public fun parameters(parameters: Any) {
        cdkBuilder.parameters(parameters)
    }

    public fun policyStatement(block: PolicyStatementDsl.() -> Unit = {}) {
        val builder = PolicyStatementDsl()
        builder.apply(block)
        cdkBuilder.policyStatement(builder.build())
    }

    public fun policyStatement(policyStatement: PolicyStatement) {
        cdkBuilder.policyStatement(policyStatement)
    }

    public fun service(service: String) {
        cdkBuilder.service(service)
    }

    public fun build(): AwsApiProps = cdkBuilder.build()
}
