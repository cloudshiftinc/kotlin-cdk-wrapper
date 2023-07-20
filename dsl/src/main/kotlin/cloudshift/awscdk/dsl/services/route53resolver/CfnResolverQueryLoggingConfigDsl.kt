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

package cloudshift.awscdk.dsl.services.route53resolver

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.route53resolver.CfnResolverQueryLoggingConfig
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class CfnResolverQueryLoggingConfigDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnResolverQueryLoggingConfig.Builder =
        CfnResolverQueryLoggingConfig.Builder.create(scope, id)

    public fun destinationArn(destinationArn: String) {
        cdkBuilder.destinationArn(destinationArn)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CfnResolverQueryLoggingConfig = cdkBuilder.build()
}
