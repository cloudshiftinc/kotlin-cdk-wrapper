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

package cloudshift.awscdk.dsl.services.iam

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.iam.UnknownPrincipalProps
import software.constructs.IConstruct

@CdkDslMarker
public class UnknownPrincipalPropsDsl {
    private val cdkBuilder: UnknownPrincipalProps.Builder = UnknownPrincipalProps.builder()

    public fun resource(resource: IConstruct) {
        cdkBuilder.resource(resource)
    }

    public fun build(): UnknownPrincipalProps = cdkBuilder.build()
}
