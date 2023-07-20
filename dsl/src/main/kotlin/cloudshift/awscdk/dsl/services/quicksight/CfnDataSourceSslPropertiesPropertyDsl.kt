@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDataSource
import kotlin.Boolean

@CdkDslMarker
public class CfnDataSourceSslPropertiesPropertyDsl {
    private val cdkBuilder: CfnDataSource.SslPropertiesProperty.Builder =
        CfnDataSource.SslPropertiesProperty.builder()

    public fun disableSsl(disableSsl: Boolean) {
        cdkBuilder.disableSsl(disableSsl)
    }

    public fun disableSsl(disableSsl: IResolvable) {
        cdkBuilder.disableSsl(disableSsl)
    }

    public fun build(): CfnDataSource.SslPropertiesProperty = cdkBuilder.build()
}
