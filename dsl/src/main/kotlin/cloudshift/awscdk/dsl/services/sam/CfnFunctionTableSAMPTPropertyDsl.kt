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

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.sam.CfnFunction
import kotlin.String

@CdkDslMarker
public class CfnFunctionTableSAMPTPropertyDsl {
    private val cdkBuilder: CfnFunction.TableSAMPTProperty.Builder =
        CfnFunction.TableSAMPTProperty.builder()

    public fun tableName(tableName: String) {
        cdkBuilder.tableName(tableName)
    }

    public fun build(): CfnFunction.TableSAMPTProperty = cdkBuilder.build()
}
