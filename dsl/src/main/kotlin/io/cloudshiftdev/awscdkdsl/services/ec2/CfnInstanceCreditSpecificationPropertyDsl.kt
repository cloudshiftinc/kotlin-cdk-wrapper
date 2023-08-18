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

package io.cloudshiftdev.awscdkdsl.services.ec2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnInstance

/**
 * Specifies the credit option for CPU usage of a T instance.
 *
 * `CreditSpecification` is a property of the
 * [AWS::EC2::Instance](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html)
 * resource.
 *
 * For more information, see
 * [Burstable performance instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/burstable-performance-instances.html)
 * in the *Amazon EC2 User Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * CreditSpecificationProperty creditSpecificationProperty = CreditSpecificationProperty.builder()
 * .cpuCredits("cpuCredits")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-creditspecification.html)
 */
@CdkDslMarker
public class CfnInstanceCreditSpecificationPropertyDsl {
    private val cdkBuilder: CfnInstance.CreditSpecificationProperty.Builder =
        CfnInstance.CreditSpecificationProperty.builder()

    /**
     * @param cpuCredits The credit option for CPU usage of the instance. Valid values: `standard` |
     *   `unlimited`
     *
     * T3 instances with `host` tenancy do not support the `unlimited` CPU credit option.
     */
    public fun cpuCredits(cpuCredits: String) {
        cdkBuilder.cpuCredits(cpuCredits)
    }

    public fun build(): CfnInstance.CreditSpecificationProperty = cdkBuilder.build()
}
