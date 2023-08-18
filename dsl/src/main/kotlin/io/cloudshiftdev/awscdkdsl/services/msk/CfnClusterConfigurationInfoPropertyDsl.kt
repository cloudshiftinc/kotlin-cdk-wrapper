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

package io.cloudshiftdev.awscdkdsl.services.msk

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.msk.CfnCluster

/**
 * Specifies the configuration to use for the brokers.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.msk.*;
 * ConfigurationInfoProperty configurationInfoProperty = ConfigurationInfoProperty.builder()
 * .arn("arn")
 * .revision(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-configurationinfo.html)
 */
@CdkDslMarker
public class CfnClusterConfigurationInfoPropertyDsl {
    private val cdkBuilder: CfnCluster.ConfigurationInfoProperty.Builder =
        CfnCluster.ConfigurationInfoProperty.builder()

    /** @param arn ARN of the configuration to use. */
    public fun arn(arn: String) {
        cdkBuilder.arn(arn)
    }

    /** @param revision The revision of the configuration to use. */
    public fun revision(revision: Number) {
        cdkBuilder.revision(revision)
    }

    public fun build(): CfnCluster.ConfigurationInfoProperty = cdkBuilder.build()
}
