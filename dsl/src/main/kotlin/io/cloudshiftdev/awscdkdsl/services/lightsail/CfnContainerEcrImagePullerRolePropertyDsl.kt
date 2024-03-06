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

package io.cloudshiftdev.awscdkdsl.services.lightsail

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lightsail.CfnContainer

/**
 * Describes the IAM role that you can use to grant a Lightsail container service access to Amazon
 * ECR private repositories.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lightsail.*;
 * EcrImagePullerRoleProperty ecrImagePullerRoleProperty = EcrImagePullerRoleProperty.builder()
 * .isActive(false)
 * .principalArn("principalArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-container-ecrimagepullerrole.html)
 */
@CdkDslMarker
public class CfnContainerEcrImagePullerRolePropertyDsl {
    private val cdkBuilder: CfnContainer.EcrImagePullerRoleProperty.Builder =
        CfnContainer.EcrImagePullerRoleProperty.builder()

    /**
     * @param isActive A boolean value that indicates whether the `ECRImagePullerRole` is active.
     */
    public fun isActive(isActive: Boolean) {
        cdkBuilder.isActive(isActive)
    }

    /**
     * @param isActive A boolean value that indicates whether the `ECRImagePullerRole` is active.
     */
    public fun isActive(isActive: IResolvable) {
        cdkBuilder.isActive(isActive)
    }

    /**
     * @param principalArn The principle Amazon Resource Name (ARN) of the role. This property is
     *   read-only.
     */
    public fun principalArn(principalArn: String) {
        cdkBuilder.principalArn(principalArn)
    }

    public fun build(): CfnContainer.EcrImagePullerRoleProperty = cdkBuilder.build()
}
