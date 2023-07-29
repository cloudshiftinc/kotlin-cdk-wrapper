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

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDataSource

/**
 * Secure Socket Layer (SSL) properties that apply when Amazon QuickSight connects to your
 * underlying data source.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * SslPropertiesProperty sslPropertiesProperty = SslPropertiesProperty.builder()
 * .disableSsl(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-sslproperties.html)
 */
@CdkDslMarker
public class CfnDataSourceSslPropertiesPropertyDsl {
    private val cdkBuilder: CfnDataSource.SslPropertiesProperty.Builder =
        CfnDataSource.SslPropertiesProperty.builder()

    /** @param disableSsl A Boolean option to control whether SSL should be disabled. */
    public fun disableSsl(disableSsl: Boolean) {
        cdkBuilder.disableSsl(disableSsl)
    }

    /** @param disableSsl A Boolean option to control whether SSL should be disabled. */
    public fun disableSsl(disableSsl: IResolvable) {
        cdkBuilder.disableSsl(disableSsl)
    }

    public fun build(): CfnDataSource.SslPropertiesProperty = cdkBuilder.build()
}
