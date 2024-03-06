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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

/**
 * The configuration for the Amazon MSK cluster to be used as the source for a delivery stream.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesisfirehose.*;
 * MSKSourceConfigurationProperty mSKSourceConfigurationProperty =
 * MSKSourceConfigurationProperty.builder()
 * .authenticationConfiguration(AuthenticationConfigurationProperty.builder()
 * .connectivity("connectivity")
 * .roleArn("roleArn")
 * .build())
 * .mskClusterArn("mskClusterArn")
 * .topicName("topicName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-msksourceconfiguration.html)
 */
@CdkDslMarker
public class CfnDeliveryStreamMSKSourceConfigurationPropertyDsl {
    private val cdkBuilder: CfnDeliveryStream.MSKSourceConfigurationProperty.Builder =
        CfnDeliveryStream.MSKSourceConfigurationProperty.builder()

    /**
     * @param authenticationConfiguration The authentication configuration of the Amazon MSK
     *   cluster.
     */
    public fun authenticationConfiguration(authenticationConfiguration: IResolvable) {
        cdkBuilder.authenticationConfiguration(authenticationConfiguration)
    }

    /**
     * @param authenticationConfiguration The authentication configuration of the Amazon MSK
     *   cluster.
     */
    public fun authenticationConfiguration(
        authenticationConfiguration: CfnDeliveryStream.AuthenticationConfigurationProperty
    ) {
        cdkBuilder.authenticationConfiguration(authenticationConfiguration)
    }

    /** @param mskClusterArn The ARN of the Amazon MSK cluster. */
    public fun mskClusterArn(mskClusterArn: String) {
        cdkBuilder.mskClusterArn(mskClusterArn)
    }

    /** @param topicName The topic name within the Amazon MSK cluster. */
    public fun topicName(topicName: String) {
        cdkBuilder.topicName(topicName)
    }

    public fun build(): CfnDeliveryStream.MSKSourceConfigurationProperty = cdkBuilder.build()
}
