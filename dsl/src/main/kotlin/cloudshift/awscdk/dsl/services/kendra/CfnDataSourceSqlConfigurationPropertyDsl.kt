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
public class CfnDataSourceSqlConfigurationPropertyDsl {
    private val cdkBuilder: CfnDataSource.SqlConfigurationProperty.Builder =
        CfnDataSource.SqlConfigurationProperty.builder()

    public fun queryIdentifiersEnclosingOption(queryIdentifiersEnclosingOption: String) {
        cdkBuilder.queryIdentifiersEnclosingOption(queryIdentifiersEnclosingOption)
    }

    public fun build(): CfnDataSource.SqlConfigurationProperty = cdkBuilder.build()
}
