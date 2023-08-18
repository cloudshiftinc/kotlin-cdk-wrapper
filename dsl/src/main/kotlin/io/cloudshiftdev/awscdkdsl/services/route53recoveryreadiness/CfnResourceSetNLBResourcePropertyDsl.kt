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

package io.cloudshiftdev.awscdkdsl.services.route53recoveryreadiness

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSet

/**
 * The Network Load Balancer resource that a DNS target resource points to.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.route53recoveryreadiness.*;
 * NLBResourceProperty nLBResourceProperty = NLBResourceProperty.builder()
 * .arn("arn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53recoveryreadiness-resourceset-nlbresource.html)
 */
@CdkDslMarker
public class CfnResourceSetNLBResourcePropertyDsl {
    private val cdkBuilder: CfnResourceSet.NLBResourceProperty.Builder =
        CfnResourceSet.NLBResourceProperty.builder()

    /** @param arn The Network Load Balancer resource Amazon Resource Name (ARN). */
    public fun arn(arn: String) {
        cdkBuilder.arn(arn)
    }

    public fun build(): CfnResourceSet.NLBResourceProperty = cdkBuilder.build()
}
