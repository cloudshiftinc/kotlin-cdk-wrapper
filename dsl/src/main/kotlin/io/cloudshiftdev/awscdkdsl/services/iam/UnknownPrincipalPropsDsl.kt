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

package io.cloudshiftdev.awscdkdsl.services.iam

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import software.amazon.awscdk.services.iam.UnknownPrincipalProps
import software.constructs.IConstruct

/**
 * Properties for an UnknownPrincipal.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iam.*;
 * import software.constructs.*;
 * Construct construct;
 * UnknownPrincipalProps unknownPrincipalProps = UnknownPrincipalProps.builder()
 * .resource(construct)
 * .build();
 * ```
 */
@CdkDslMarker
public class UnknownPrincipalPropsDsl {
    private val cdkBuilder: UnknownPrincipalProps.Builder = UnknownPrincipalProps.builder()

    /** @param resource The resource the role proxy is for. */
    public fun resource(resource: IConstruct) {
        cdkBuilder.resource(resource)
    }

    public fun build(): UnknownPrincipalProps = cdkBuilder.build()
}
