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

package cloudshift.awscdk.dsl.services.kinesisanalyticsv2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationReferenceDataSource
import kotlin.String

@CdkDslMarker
public class CfnApplicationReferenceDataSourceRecordColumnPropertyDsl {
    private val cdkBuilder: CfnApplicationReferenceDataSource.RecordColumnProperty.Builder =
        CfnApplicationReferenceDataSource.RecordColumnProperty.builder()

    public fun mapping(mapping: String) {
        cdkBuilder.mapping(mapping)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun sqlType(sqlType: String) {
        cdkBuilder.sqlType(sqlType)
    }

    public fun build(): CfnApplicationReferenceDataSource.RecordColumnProperty = cdkBuilder.build()
}
