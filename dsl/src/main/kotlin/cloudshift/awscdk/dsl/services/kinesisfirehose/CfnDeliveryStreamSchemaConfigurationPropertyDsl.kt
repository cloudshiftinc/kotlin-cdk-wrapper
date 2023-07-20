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

package cloudshift.awscdk.dsl.services.kinesisfirehose

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream
import kotlin.String

@CdkDslMarker
public class CfnDeliveryStreamSchemaConfigurationPropertyDsl {
    private val cdkBuilder: CfnDeliveryStream.SchemaConfigurationProperty.Builder =
        CfnDeliveryStream.SchemaConfigurationProperty.builder()

    public fun catalogId(catalogId: String) {
        cdkBuilder.catalogId(catalogId)
    }

    public fun databaseName(databaseName: String) {
        cdkBuilder.databaseName(databaseName)
    }

    public fun region(region: String) {
        cdkBuilder.region(region)
    }

    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    public fun tableName(tableName: String) {
        cdkBuilder.tableName(tableName)
    }

    public fun versionId(versionId: String) {
        cdkBuilder.versionId(versionId)
    }

    public fun build(): CfnDeliveryStream.SchemaConfigurationProperty = cdkBuilder.build()
}
