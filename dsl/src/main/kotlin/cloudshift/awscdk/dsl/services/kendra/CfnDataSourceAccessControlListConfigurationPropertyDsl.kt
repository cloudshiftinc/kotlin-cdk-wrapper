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

package cloudshift.awscdk.dsl.services.kendra

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.kendra.CfnDataSource
import kotlin.String

@CdkDslMarker
public class CfnDataSourceAccessControlListConfigurationPropertyDsl {
    private val cdkBuilder: CfnDataSource.AccessControlListConfigurationProperty.Builder =
        CfnDataSource.AccessControlListConfigurationProperty.builder()

    public fun keyPath(keyPath: String) {
        cdkBuilder.keyPath(keyPath)
    }

    public fun build(): CfnDataSource.AccessControlListConfigurationProperty = cdkBuilder.build()
}
