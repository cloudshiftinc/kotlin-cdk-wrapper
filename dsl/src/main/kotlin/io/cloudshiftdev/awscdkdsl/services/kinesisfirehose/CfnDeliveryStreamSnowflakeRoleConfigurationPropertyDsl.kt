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
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

/**
 * Optionally configure a Snowflake role.
 *
 * Otherwise the default user role will be used.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesisfirehose.*;
 * SnowflakeRoleConfigurationProperty snowflakeRoleConfigurationProperty =
 * SnowflakeRoleConfigurationProperty.builder()
 * .enabled(false)
 * .snowflakeRole("snowflakeRole")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-snowflakeroleconfiguration.html)
 */
@CdkDslMarker
public class CfnDeliveryStreamSnowflakeRoleConfigurationPropertyDsl {
    private val cdkBuilder: CfnDeliveryStream.SnowflakeRoleConfigurationProperty.Builder =
        CfnDeliveryStream.SnowflakeRoleConfigurationProperty.builder()

    /** @param enabled Enable Snowflake role. */
    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    /** @param enabled Enable Snowflake role. */
    public fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled)
    }

    /** @param snowflakeRole The Snowflake role you wish to configure. */
    public fun snowflakeRole(snowflakeRole: String) {
        cdkBuilder.snowflakeRole(snowflakeRole)
    }

    public fun build(): CfnDeliveryStream.SnowflakeRoleConfigurationProperty = cdkBuilder.build()
}
