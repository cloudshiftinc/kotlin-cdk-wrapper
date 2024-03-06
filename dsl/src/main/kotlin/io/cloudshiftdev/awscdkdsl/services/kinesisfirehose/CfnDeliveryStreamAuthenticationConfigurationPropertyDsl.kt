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

package io.cloudshiftdev.awscdkdsl.services.kinesisfirehose

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

/**
 * The authentication configuration of the Amazon MSK cluster.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesisfirehose.*;
 * AuthenticationConfigurationProperty authenticationConfigurationProperty =
 * AuthenticationConfigurationProperty.builder()
 * .connectivity("connectivity")
 * .roleArn("roleArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-authenticationconfiguration.html)
 */
@CdkDslMarker
public class CfnDeliveryStreamAuthenticationConfigurationPropertyDsl {
    private val cdkBuilder: CfnDeliveryStream.AuthenticationConfigurationProperty.Builder =
        CfnDeliveryStream.AuthenticationConfigurationProperty.builder()

    /** @param connectivity The type of connectivity used to access the Amazon MSK cluster. */
    public fun connectivity(connectivity: String) {
        cdkBuilder.connectivity(connectivity)
    }

    /** @param roleArn The ARN of the role used to access the Amazon MSK cluster. */
    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    public fun build(): CfnDeliveryStream.AuthenticationConfigurationProperty = cdkBuilder.build()
}
