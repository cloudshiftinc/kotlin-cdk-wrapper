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
 * Configure a Snowflake VPC.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesisfirehose.*;
 * SnowflakeVpcConfigurationProperty snowflakeVpcConfigurationProperty =
 * SnowflakeVpcConfigurationProperty.builder()
 * .privateLinkVpceId("privateLinkVpceId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-snowflakevpcconfiguration.html)
 */
@CdkDslMarker
public class CfnDeliveryStreamSnowflakeVpcConfigurationPropertyDsl {
    private val cdkBuilder: CfnDeliveryStream.SnowflakeVpcConfigurationProperty.Builder =
        CfnDeliveryStream.SnowflakeVpcConfigurationProperty.builder()

    /**
     * @param privateLinkVpceId The VPCE ID for Firehose to privately connect with Snowflake. The ID
     *   format is com.amazonaws.vpce.[region].vpce-svc-&lt;[id]&gt;. For more information, see
     *   [Amazon PrivateLink &amp; Snowflake](https://docs.aws.amazon.com/https://docs.snowflake.com/en/user-guide/admin-security-privatelink)
     */
    public fun privateLinkVpceId(privateLinkVpceId: String) {
        cdkBuilder.privateLinkVpceId(privateLinkVpceId)
    }

    public fun build(): CfnDeliveryStream.SnowflakeVpcConfigurationProperty = cdkBuilder.build()
}
