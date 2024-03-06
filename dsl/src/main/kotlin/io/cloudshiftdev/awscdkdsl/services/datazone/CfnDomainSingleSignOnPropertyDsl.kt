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

package io.cloudshiftdev.awscdkdsl.services.datazone

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.datazone.CfnDomain

/**
 * The single sign-on details in Amazon DataZone.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.datazone.*;
 * SingleSignOnProperty singleSignOnProperty = SingleSignOnProperty.builder()
 * .type("type")
 * .userAssignment("userAssignment")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-domain-singlesignon.html)
 */
@CdkDslMarker
public class CfnDomainSingleSignOnPropertyDsl {
    private val cdkBuilder: CfnDomain.SingleSignOnProperty.Builder =
        CfnDomain.SingleSignOnProperty.builder()

    /** @param type The type of single sign-on in Amazon DataZone. */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    /** @param userAssignment The single sign-on user assignment in Amazon DataZone. */
    public fun userAssignment(userAssignment: String) {
        cdkBuilder.userAssignment(userAssignment)
    }

    public fun build(): CfnDomain.SingleSignOnProperty = cdkBuilder.build()
}
