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
import software.amazon.awscdk.services.quicksight.CfnDataSource
import kotlin.String

@CdkDslMarker
public class CfnDataSourceDataSourceErrorInfoPropertyDsl {
    private val cdkBuilder: CfnDataSource.DataSourceErrorInfoProperty.Builder =
        CfnDataSource.DataSourceErrorInfoProperty.builder()

    public fun message(message: String) {
        cdkBuilder.message(message)
    }

    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnDataSource.DataSourceErrorInfoProperty = cdkBuilder.build()
}
