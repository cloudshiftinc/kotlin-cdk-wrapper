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
import kotlin.Any
import kotlin.Boolean
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pcaconnectorad.CfnTemplate

/**
 * Application policies describe what the certificate can be used for.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pcaconnectorad.*;
 * ApplicationPoliciesProperty applicationPoliciesProperty = ApplicationPoliciesProperty.builder()
 * .policies(List.of(ApplicationPolicyProperty.builder()
 * .policyObjectIdentifier("policyObjectIdentifier")
 * .policyType("policyType")
 * .build()))
 * // the properties below are optional
 * .critical(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-applicationpolicies.html)
 */
@CdkDslMarker
public class CfnTemplateApplicationPoliciesPropertyDsl {
    private val cdkBuilder: CfnTemplate.ApplicationPoliciesProperty.Builder =
        CfnTemplate.ApplicationPoliciesProperty.builder()

    private val _policies: MutableList<Any> = mutableListOf()

    /** @param critical Marks the application policy extension as critical. */
    public fun critical(critical: Boolean) {
        cdkBuilder.critical(critical)
    }

    /** @param critical Marks the application policy extension as critical. */
    public fun critical(critical: IResolvable) {
        cdkBuilder.critical(critical)
    }

    /** @param policies Application policies describe what the certificate can be used for. */
    public fun policies(vararg policies: Any) {
        _policies.addAll(listOf(*policies))
    }

    /** @param policies Application policies describe what the certificate can be used for. */
    public fun policies(policies: Collection<Any>) {
        _policies.addAll(policies)
    }

    /** @param policies Application policies describe what the certificate can be used for. */
    public fun policies(policies: IResolvable) {
        cdkBuilder.policies(policies)
    }

    public fun build(): CfnTemplate.ApplicationPoliciesProperty {
        if (_policies.isNotEmpty()) cdkBuilder.policies(_policies)
        return cdkBuilder.build()
    }
}
