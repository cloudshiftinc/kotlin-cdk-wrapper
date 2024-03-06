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

package io.cloudshiftdev.awscdkdsl.services.dms

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.dms.CfnDataProvider

/**
 * PostgreSqlSettings property identifier.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.dms.*;
 * SettingsProperty settingsProperty = SettingsProperty.builder()
 * .postgreSqlSettings(PostgreSqlSettingsProperty.builder()
 * .certificateArn("certificateArn")
 * .databaseName("databaseName")
 * .port(123)
 * .serverName("serverName")
 * .sslMode("sslMode")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-dataprovider-settings.html)
 */
@CdkDslMarker
public class CfnDataProviderSettingsPropertyDsl {
    private val cdkBuilder: CfnDataProvider.SettingsProperty.Builder =
        CfnDataProvider.SettingsProperty.builder()

    /** @param postgreSqlSettings the value to be set. */
    public fun postgreSqlSettings(postgreSqlSettings: IResolvable) {
        cdkBuilder.postgreSqlSettings(postgreSqlSettings)
    }

    /** @param postgreSqlSettings the value to be set. */
    public fun postgreSqlSettings(postgreSqlSettings: CfnDataProvider.PostgreSqlSettingsProperty) {
        cdkBuilder.postgreSqlSettings(postgreSqlSettings)
    }

    public fun build(): CfnDataProvider.SettingsProperty = cdkBuilder.build()
}
