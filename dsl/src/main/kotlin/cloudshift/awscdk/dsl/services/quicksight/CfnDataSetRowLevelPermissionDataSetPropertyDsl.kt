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
import software.amazon.awscdk.services.quicksight.CfnDataSet
import kotlin.String

@CdkDslMarker
public class CfnDataSetRowLevelPermissionDataSetPropertyDsl {
    private val cdkBuilder: CfnDataSet.RowLevelPermissionDataSetProperty.Builder =
        CfnDataSet.RowLevelPermissionDataSetProperty.builder()

    public fun arn(arn: String) {
        cdkBuilder.arn(arn)
    }

    public fun formatVersion(formatVersion: String) {
        cdkBuilder.formatVersion(formatVersion)
    }

    public fun namespace(namespace: String) {
        cdkBuilder.namespace(namespace)
    }

    public fun permissionPolicy(permissionPolicy: String) {
        cdkBuilder.permissionPolicy(permissionPolicy)
    }

    public fun status(status: String) {
        cdkBuilder.status(status)
    }

    public fun build(): CfnDataSet.RowLevelPermissionDataSetProperty = cdkBuilder.build()
}
