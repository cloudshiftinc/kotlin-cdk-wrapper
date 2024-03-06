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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lightsail.CfnContainer

/**
 * Describes the configuration for an Amazon Lightsail container service to access private container
 * image repositories, such as Amazon Elastic Container Registry ( Amazon ECR ) private
 * repositories.
 *
 * For more information, see
 * [Configuring access to an Amazon ECR private repository for an Amazon Lightsail container service](https://docs.aws.amazon.com/lightsail/latest/userguide/amazon-lightsail-container-service-ecr-private-repo-access)
 * in the *Amazon Lightsail Developer Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lightsail.*;
 * PrivateRegistryAccessProperty privateRegistryAccessProperty =
 * PrivateRegistryAccessProperty.builder()
 * .ecrImagePullerRole(EcrImagePullerRoleProperty.builder()
 * .isActive(false)
 * .principalArn("principalArn")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-container-privateregistryaccess.html)
 */
@CdkDslMarker
public class CfnContainerPrivateRegistryAccessPropertyDsl {
    private val cdkBuilder: CfnContainer.PrivateRegistryAccessProperty.Builder =
        CfnContainer.PrivateRegistryAccessProperty.builder()

    /**
     * @param ecrImagePullerRole An object that describes the activation status of the role that you
     *   can use to grant a Lightsail container service access to Amazon ECR private repositories.
     *   If the role is activated, the Amazon Resource Name (ARN) of the role is also listed.
     */
    public fun ecrImagePullerRole(ecrImagePullerRole: IResolvable) {
        cdkBuilder.ecrImagePullerRole(ecrImagePullerRole)
    }

    /**
     * @param ecrImagePullerRole An object that describes the activation status of the role that you
     *   can use to grant a Lightsail container service access to Amazon ECR private repositories.
     *   If the role is activated, the Amazon Resource Name (ARN) of the role is also listed.
     */
    public fun ecrImagePullerRole(ecrImagePullerRole: CfnContainer.EcrImagePullerRoleProperty) {
        cdkBuilder.ecrImagePullerRole(ecrImagePullerRole)
    }

    public fun build(): CfnContainer.PrivateRegistryAccessProperty = cdkBuilder.build()
}
