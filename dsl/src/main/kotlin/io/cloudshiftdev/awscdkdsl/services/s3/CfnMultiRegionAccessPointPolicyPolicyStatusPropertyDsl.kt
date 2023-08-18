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

package io.cloudshiftdev.awscdkdsl.services.s3

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.s3.CfnMultiRegionAccessPointPolicy

/**
 * The container element for a bucket's policy status.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.s3.*;
 * PolicyStatusProperty policyStatusProperty = PolicyStatusProperty.builder()
 * .isPublic("isPublic")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-multiregionaccesspointpolicy-policystatus.html)
 */
@CdkDslMarker
public class CfnMultiRegionAccessPointPolicyPolicyStatusPropertyDsl {
    private val cdkBuilder: CfnMultiRegionAccessPointPolicy.PolicyStatusProperty.Builder =
        CfnMultiRegionAccessPointPolicy.PolicyStatusProperty.builder()

    /**
     * @param isPublic The policy status for this bucket. `TRUE` indicates that this bucket is
     *   public. `FALSE` indicates that the bucket is not public.
     */
    public fun isPublic(isPublic: String) {
        cdkBuilder.isPublic(isPublic)
    }

    public fun build(): CfnMultiRegionAccessPointPolicy.PolicyStatusProperty = cdkBuilder.build()
}
