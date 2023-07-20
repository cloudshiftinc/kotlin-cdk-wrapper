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

package cloudshift.awscdk.dsl.services.appflow

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.appflow.CfnFlow
import kotlin.String

@CdkDslMarker
public class CfnFlowGlueDataCatalogPropertyDsl {
    private val cdkBuilder: CfnFlow.GlueDataCatalogProperty.Builder =
        CfnFlow.GlueDataCatalogProperty.builder()

    public fun databaseName(databaseName: String) {
        cdkBuilder.databaseName(databaseName)
    }

    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    public fun tablePrefix(tablePrefix: String) {
        cdkBuilder.tablePrefix(tablePrefix)
    }

    public fun build(): CfnFlow.GlueDataCatalogProperty = cdkBuilder.build()
}
