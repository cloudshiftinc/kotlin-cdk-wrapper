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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSet

/**
 * The target resource that the Route 53 record points to.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.route53recoveryreadiness.*;
 * TargetResourceProperty targetResourceProperty = TargetResourceProperty.builder()
 * .nlbResource(NLBResourceProperty.builder()
 * .arn("arn")
 * .build())
 * .r53Resource(R53ResourceRecordProperty.builder()
 * .domainName("domainName")
 * .recordSetId("recordSetId")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53recoveryreadiness-resourceset-targetresource.html)
 */
@CdkDslMarker
public class CfnResourceSetTargetResourcePropertyDsl {
    private val cdkBuilder: CfnResourceSet.TargetResourceProperty.Builder =
        CfnResourceSet.TargetResourceProperty.builder()

    /**
     * @param nlbResource The Network Load Balancer resource that a DNS target resource points to.
     */
    public fun nlbResource(nlbResource: IResolvable) {
        cdkBuilder.nlbResource(nlbResource)
    }

    /**
     * @param nlbResource The Network Load Balancer resource that a DNS target resource points to.
     */
    public fun nlbResource(nlbResource: CfnResourceSet.NLBResourceProperty) {
        cdkBuilder.nlbResource(nlbResource)
    }

    /** @param r53Resource The Route 53 resource that a DNS target resource record points to. */
    public fun r53Resource(r53Resource: IResolvable) {
        cdkBuilder.r53Resource(r53Resource)
    }

    /** @param r53Resource The Route 53 resource that a DNS target resource record points to. */
    public fun r53Resource(r53Resource: CfnResourceSet.R53ResourceRecordProperty) {
        cdkBuilder.r53Resource(r53Resource)
    }

    public fun build(): CfnResourceSet.TargetResourceProperty = cdkBuilder.build()
}
