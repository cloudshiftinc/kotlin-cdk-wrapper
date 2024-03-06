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

package io.cloudshiftdev.awscdkdsl.services.pcaconnectorad

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.pcaconnectorad.CfnTemplate

/**
 * Application policies describe what the certificate can be used for.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pcaconnectorad.*;
 * ApplicationPolicyProperty applicationPolicyProperty = ApplicationPolicyProperty.builder()
 * .policyObjectIdentifier("policyObjectIdentifier")
 * .policyType("policyType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-applicationpolicy.html)
 */
@CdkDslMarker
public class CfnTemplateApplicationPolicyPropertyDsl {
    private val cdkBuilder: CfnTemplate.ApplicationPolicyProperty.Builder =
        CfnTemplate.ApplicationPolicyProperty.builder()

    /** @param policyObjectIdentifier The object identifier (OID) of an application policy. */
    public fun policyObjectIdentifier(policyObjectIdentifier: String) {
        cdkBuilder.policyObjectIdentifier(policyObjectIdentifier)
    }

    /** @param policyType The type of application policy. */
    public fun policyType(policyType: String) {
        cdkBuilder.policyType(policyType)
    }

    public fun build(): CfnTemplate.ApplicationPolicyProperty = cdkBuilder.build()
}
