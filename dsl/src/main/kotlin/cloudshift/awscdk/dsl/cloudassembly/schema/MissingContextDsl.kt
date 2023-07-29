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

package cloudshift.awscdk.dsl.cloudassembly.schema

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
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

/**
 * Represents a missing piece of context.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.cloudassembly.schema.*;
 * MissingContext missingContext = MissingContext.builder()
 * .key("key")
 * .props(AmiContextQuery.builder()
 * .account("account")
 * .filters(Map.of(
 * "filtersKey", List.of("filters")))
 * .region("region")
 * // the properties below are optional
 * .lookupRoleArn("lookupRoleArn")
 * .owners(List.of("owners"))
 * .build())
 * .provider(ContextProvider.AMI_PROVIDER)
 * .build();
 * ```
 */
@CdkDslMarker
public class MissingContextDsl {
    private val cdkBuilder: MissingContext.Builder = MissingContext.builder()

    /** @param key The missing context key. */
    public fun key(key: String) {
        cdkBuilder.key(key)
    }

    /** @param props A set of provider-specific options. */
    public fun props(props: AmiContextQuery) {
        cdkBuilder.props(props)
    }

    /** @param props A set of provider-specific options. */
    public fun props(props: AvailabilityZonesContextQuery) {
        cdkBuilder.props(props)
    }

    /** @param props A set of provider-specific options. */
    public fun props(props: EndpointServiceAvailabilityZonesContextQuery) {
        cdkBuilder.props(props)
    }

    /** @param props A set of provider-specific options. */
    public fun props(props: HostedZoneContextQuery) {
        cdkBuilder.props(props)
    }

    /** @param props A set of provider-specific options. */
    public fun props(props: KeyContextQuery) {
        cdkBuilder.props(props)
    }

    /** @param props A set of provider-specific options. */
    public fun props(props: LoadBalancerContextQuery) {
        cdkBuilder.props(props)
    }

    /** @param props A set of provider-specific options. */
    public fun props(props: LoadBalancerListenerContextQuery) {
        cdkBuilder.props(props)
    }

    /** @param props A set of provider-specific options. */
    public fun props(props: PluginContextQuery) {
        cdkBuilder.props(props)
    }

    /** @param props A set of provider-specific options. */
    public fun props(props: SSMParameterContextQuery) {
        cdkBuilder.props(props)
    }

    /** @param props A set of provider-specific options. */
    public fun props(props: SecurityGroupContextQuery) {
        cdkBuilder.props(props)
    }

    /** @param props A set of provider-specific options. */
    public fun props(props: VpcContextQuery) {
        cdkBuilder.props(props)
    }

    /** @param provider The provider from which we expect this context key to be obtained. */
    public fun provider(provider: ContextProvider) {
        cdkBuilder.provider(provider)
    }

    public fun build(): MissingContext = cdkBuilder.build()
}
