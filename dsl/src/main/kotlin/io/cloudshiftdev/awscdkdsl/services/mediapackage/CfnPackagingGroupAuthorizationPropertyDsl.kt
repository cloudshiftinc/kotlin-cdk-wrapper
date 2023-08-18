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

package io.cloudshiftdev.awscdkdsl.services.mediapackage

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.mediapackage.CfnPackagingGroup

/**
 * Parameters for enabling CDN authorization.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.mediapackage.*;
 * AuthorizationProperty authorizationProperty = AuthorizationProperty.builder()
 * .cdnIdentifierSecret("cdnIdentifierSecret")
 * .secretsRoleArn("secretsRoleArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packaginggroup-authorization.html)
 */
@CdkDslMarker
public class CfnPackagingGroupAuthorizationPropertyDsl {
    private val cdkBuilder: CfnPackagingGroup.AuthorizationProperty.Builder =
        CfnPackagingGroup.AuthorizationProperty.builder()

    /**
     * @param cdnIdentifierSecret The Amazon Resource Name (ARN) for the secret in AWS Secrets
     *   Manager that is used for CDN authorization.
     */
    public fun cdnIdentifierSecret(cdnIdentifierSecret: String) {
        cdkBuilder.cdnIdentifierSecret(cdnIdentifierSecret)
    }

    /**
     * @param secretsRoleArn The Amazon Resource Name (ARN) for the IAM role that allows AWS
     *   Elemental MediaPackage to communicate with AWS Secrets Manager .
     */
    public fun secretsRoleArn(secretsRoleArn: String) {
        cdkBuilder.secretsRoleArn(secretsRoleArn)
    }

    public fun build(): CfnPackagingGroup.AuthorizationProperty = cdkBuilder.build()
}
