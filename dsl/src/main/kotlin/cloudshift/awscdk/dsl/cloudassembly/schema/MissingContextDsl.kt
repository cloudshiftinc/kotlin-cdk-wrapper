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

package cloudshift.awscdk.dsl.cloudassembly.schema

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.cloudassembly.schema.AmiContextQuery
import software.amazon.awscdk.cloudassembly.schema.AvailabilityZonesContextQuery
import software.amazon.awscdk.cloudassembly.schema.ContextProvider
import software.amazon.awscdk.cloudassembly.schema.EndpointServiceAvailabilityZonesContextQuery
import software.amazon.awscdk.cloudassembly.schema.HostedZoneContextQuery
import software.amazon.awscdk.cloudassembly.schema.KeyContextQuery
import software.amazon.awscdk.cloudassembly.schema.LoadBalancerContextQuery
import software.amazon.awscdk.cloudassembly.schema.LoadBalancerListenerContextQuery
import software.amazon.awscdk.cloudassembly.schema.MissingContext
import software.amazon.awscdk.cloudassembly.schema.PluginContextQuery
import software.amazon.awscdk.cloudassembly.schema.SSMParameterContextQuery
import software.amazon.awscdk.cloudassembly.schema.SecurityGroupContextQuery
import software.amazon.awscdk.cloudassembly.schema.VpcContextQuery
import kotlin.String

@CdkDslMarker
public class MissingContextDsl {
    private val cdkBuilder: MissingContext.Builder = MissingContext.builder()

    public fun key(key: String) {
        cdkBuilder.key(key)
    }

    public fun props(props: AmiContextQuery) {
        cdkBuilder.props(props)
    }

    public fun props(props: AvailabilityZonesContextQuery) {
        cdkBuilder.props(props)
    }

    public fun props(props: EndpointServiceAvailabilityZonesContextQuery) {
        cdkBuilder.props(props)
    }

    public fun props(props: HostedZoneContextQuery) {
        cdkBuilder.props(props)
    }

    public fun props(props: KeyContextQuery) {
        cdkBuilder.props(props)
    }

    public fun props(props: LoadBalancerContextQuery) {
        cdkBuilder.props(props)
    }

    public fun props(props: LoadBalancerListenerContextQuery) {
        cdkBuilder.props(props)
    }

    public fun props(props: PluginContextQuery) {
        cdkBuilder.props(props)
    }

    public fun props(props: SSMParameterContextQuery) {
        cdkBuilder.props(props)
    }

    public fun props(props: SecurityGroupContextQuery) {
        cdkBuilder.props(props)
    }

    public fun props(props: VpcContextQuery) {
        cdkBuilder.props(props)
    }

    public fun provider(provider: ContextProvider) {
        cdkBuilder.provider(provider)
    }

    public fun build(): MissingContext = cdkBuilder.build()
}
