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
import software.amazon.awscdk.services.ec2.CfnSpotFleet

/**
 * Describes an IAM instance profile.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * IamInstanceProfileSpecificationProperty iamInstanceProfileSpecificationProperty =
 * IamInstanceProfileSpecificationProperty.builder()
 * .arn("arn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-iaminstanceprofilespecification.html)
 */
@CdkDslMarker
public class CfnSpotFleetIamInstanceProfileSpecificationPropertyDsl {
    private val cdkBuilder: CfnSpotFleet.IamInstanceProfileSpecificationProperty.Builder =
        CfnSpotFleet.IamInstanceProfileSpecificationProperty.builder()

    /** @param arn The Amazon Resource Name (ARN) of the instance profile. */
    public fun arn(arn: String) {
        cdkBuilder.arn(arn)
    }

    public fun build(): CfnSpotFleet.IamInstanceProfileSpecificationProperty = cdkBuilder.build()
}
