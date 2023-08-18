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

package io.cloudshiftdev.awscdkdsl.services.s3objectlambda

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint

/**
 * Indicates whether this access point policy is public.
 *
 * For more information about how Amazon S3 evaluates policies to determine whether they are public,
 * see
 * [The Meaning of "Public"](https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html#access-control-block-public-access-policy-status)
 * in the *Amazon S3 User Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.s3objectlambda.*;
 * PolicyStatusProperty policyStatusProperty = PolicyStatusProperty.builder()
 * .isPublic(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3objectlambda-accesspoint-policystatus.html)
 */
@CdkDslMarker
public class CfnAccessPointPolicyStatusPropertyDsl {
    private val cdkBuilder: CfnAccessPoint.PolicyStatusProperty.Builder =
        CfnAccessPoint.PolicyStatusProperty.builder()

    /**
     * @param isPublic Specifies whether the Object lambda Access Point Policy is Public or not.
     *   Object lambda Access Points are private by default.
     */
    public fun isPublic(isPublic: Boolean) {
        cdkBuilder.isPublic(isPublic)
    }

    /**
     * @param isPublic Specifies whether the Object lambda Access Point Policy is Public or not.
     *   Object lambda Access Points are private by default.
     */
    public fun isPublic(isPublic: IResolvable) {
        cdkBuilder.isPublic(isPublic)
    }

    public fun build(): CfnAccessPoint.PolicyStatusProperty = cdkBuilder.build()
}
