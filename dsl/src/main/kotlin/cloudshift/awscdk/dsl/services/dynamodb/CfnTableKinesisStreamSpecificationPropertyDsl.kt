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

package cloudshift.awscdk.dsl.services.dynamodb

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.dynamodb.CfnTable
import kotlin.String

@CdkDslMarker
public class CfnTableKinesisStreamSpecificationPropertyDsl {
    private val cdkBuilder: CfnTable.KinesisStreamSpecificationProperty.Builder =
        CfnTable.KinesisStreamSpecificationProperty.builder()

    public fun streamArn(streamArn: String) {
        cdkBuilder.streamArn(streamArn)
    }

    public fun build(): CfnTable.KinesisStreamSpecificationProperty = cdkBuilder.build()
}
