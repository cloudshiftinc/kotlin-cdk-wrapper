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

package io.cloudshiftdev.awscdkdsl.services.ecr

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.Unit
import software.amazon.awscdk.services.ecr.CfnRegistryPolicyProps

/**
 * Properties for defining a `CfnRegistryPolicy`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ecr.*;
 * Object policyText;
 * CfnRegistryPolicyProps cfnRegistryPolicyProps = CfnRegistryPolicyProps.builder()
 * .policyText(policyText)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-registrypolicy.html)
 */
@CdkDslMarker
public class CfnRegistryPolicyPropsDsl {
    private val cdkBuilder: CfnRegistryPolicyProps.Builder = CfnRegistryPolicyProps.builder()

    /** @param policyText The JSON policy text for your registry. */
    public fun policyText(policyText: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(policyText)
        cdkBuilder.policyText(builder.map)
    }

    /** @param policyText The JSON policy text for your registry. */
    public fun policyText(policyText: Any) {
        cdkBuilder.policyText(policyText)
    }

    public fun build(): CfnRegistryPolicyProps = cdkBuilder.build()
}
