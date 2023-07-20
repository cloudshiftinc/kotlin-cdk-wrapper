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
public class CfnFunctionTableStreamSAMPTPropertyDsl {
    private val cdkBuilder: CfnFunction.TableStreamSAMPTProperty.Builder =
        CfnFunction.TableStreamSAMPTProperty.builder()

    public fun streamName(streamName: String) {
        cdkBuilder.streamName(streamName)
    }

    public fun tableName(tableName: String) {
        cdkBuilder.tableName(tableName)
    }

    public fun build(): CfnFunction.TableStreamSAMPTProperty = cdkBuilder.build()
}
