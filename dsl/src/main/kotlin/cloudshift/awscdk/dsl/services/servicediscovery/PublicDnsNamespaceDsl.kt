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

package cloudshift.awscdk.dsl.services.servicediscovery

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.servicediscovery.PublicDnsNamespace
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class PublicDnsNamespaceDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: PublicDnsNamespace.Builder = PublicDnsNamespace.Builder.create(scope, id)

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): PublicDnsNamespace = cdkBuilder.build()
}
