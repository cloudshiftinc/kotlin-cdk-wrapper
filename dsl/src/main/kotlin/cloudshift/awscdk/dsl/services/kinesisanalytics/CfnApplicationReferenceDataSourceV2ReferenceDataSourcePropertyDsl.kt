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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2
import kotlin.String

@CdkDslMarker
public class CfnApplicationReferenceDataSourceV2ReferenceDataSourcePropertyDsl {
    private val cdkBuilder: CfnApplicationReferenceDataSourceV2.ReferenceDataSourceProperty.Builder =
        CfnApplicationReferenceDataSourceV2.ReferenceDataSourceProperty.builder()

    public fun referenceSchema(referenceSchema: IResolvable) {
        cdkBuilder.referenceSchema(referenceSchema)
    }

    public fun referenceSchema(referenceSchema: CfnApplicationReferenceDataSourceV2.ReferenceSchemaProperty) {
        cdkBuilder.referenceSchema(referenceSchema)
    }

    public fun s3ReferenceDataSource(s3ReferenceDataSource: IResolvable) {
        cdkBuilder.s3ReferenceDataSource(s3ReferenceDataSource)
    }

    public fun s3ReferenceDataSource(s3ReferenceDataSource: CfnApplicationReferenceDataSourceV2.S3ReferenceDataSourceProperty) {
        cdkBuilder.s3ReferenceDataSource(s3ReferenceDataSource)
    }

    public fun tableName(tableName: String) {
        cdkBuilder.tableName(tableName)
    }

    public fun build(): CfnApplicationReferenceDataSourceV2.ReferenceDataSourceProperty =
        cdkBuilder.build()
}
