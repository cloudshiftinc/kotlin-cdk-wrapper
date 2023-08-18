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
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.s3.CfnMultiRegionAccessPointPolicy
import software.constructs.Construct

/**
 * Applies an Amazon S3 access policy to an Amazon S3 Multi-Region Access Point.
 *
 * It is not possible to delete an access policy for a Multi-Region Access Point from the
 * CloudFormation template. When you attempt to delete the policy, CloudFormation updates the policy
 * using `DeletionPolicy:Retain` and `UpdateReplacePolicy:Retain` . CloudFormation updates the
 * policy to only allow access to the account that created the bucket.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.s3.*;
 * Object policy;
 * CfnMultiRegionAccessPointPolicy cfnMultiRegionAccessPointPolicy =
 * CfnMultiRegionAccessPointPolicy.Builder.create(this, "MyCfnMultiRegionAccessPointPolicy")
 * .mrapName("mrapName")
 * .policy(policy)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-multiregionaccesspointpolicy.html)
 */
@CdkDslMarker
public class CfnMultiRegionAccessPointPolicyDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnMultiRegionAccessPointPolicy.Builder =
        CfnMultiRegionAccessPointPolicy.Builder.create(scope, id)

    /**
     * The name of the Multi-Region Access Point.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-multiregionaccesspointpolicy.html#cfn-s3-multiregionaccesspointpolicy-mrapname)
     *
     * @param mrapName The name of the Multi-Region Access Point.
     */
    public fun mrapName(mrapName: String) {
        cdkBuilder.mrapName(mrapName)
    }

    /**
     * The access policy associated with the Multi-Region Access Point.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-multiregionaccesspointpolicy.html#cfn-s3-multiregionaccesspointpolicy-policy)
     *
     * @param policy The access policy associated with the Multi-Region Access Point.
     */
    public fun policy(policy: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(policy)
        cdkBuilder.policy(builder.map)
    }

    /**
     * The access policy associated with the Multi-Region Access Point.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-multiregionaccesspointpolicy.html#cfn-s3-multiregionaccesspointpolicy-policy)
     *
     * @param policy The access policy associated with the Multi-Region Access Point.
     */
    public fun policy(policy: Any) {
        cdkBuilder.policy(policy)
    }

    public fun build(): CfnMultiRegionAccessPointPolicy = cdkBuilder.build()
}
