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
