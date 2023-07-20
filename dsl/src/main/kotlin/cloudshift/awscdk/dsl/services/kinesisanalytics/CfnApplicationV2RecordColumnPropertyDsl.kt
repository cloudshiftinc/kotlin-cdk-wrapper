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

package cloudshift.awscdk.dsl.services.kinesisanalytics

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2
import kotlin.String

@CdkDslMarker
public class CfnApplicationV2RecordColumnPropertyDsl {
    private val cdkBuilder: CfnApplicationV2.RecordColumnProperty.Builder =
        CfnApplicationV2.RecordColumnProperty.builder()

    public fun mapping(mapping: String) {
        cdkBuilder.mapping(mapping)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun sqlType(sqlType: String) {
        cdkBuilder.sqlType(sqlType)
    }

    public fun build(): CfnApplicationV2.RecordColumnProperty = cdkBuilder.build()
}
