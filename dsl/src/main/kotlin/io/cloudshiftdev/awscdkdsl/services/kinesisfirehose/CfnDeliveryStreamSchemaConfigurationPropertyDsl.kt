@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.kinesisfirehose

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

/**
 * Specifies the schema to which you want Firehose to configure your data before it writes it to
 * Amazon S3.
 *
 * This parameter is required if `Enabled` is set to true.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesisfirehose.*;
 * SchemaConfigurationProperty schemaConfigurationProperty = SchemaConfigurationProperty.builder()
 * .catalogId("catalogId")
 * .databaseName("databaseName")
 * .region("region")
 * .roleArn("roleArn")
 * .tableName("tableName")
 * .versionId("versionId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-schemaconfiguration.html)
 */
@CdkDslMarker
public class CfnDeliveryStreamSchemaConfigurationPropertyDsl {
    private val cdkBuilder: CfnDeliveryStream.SchemaConfigurationProperty.Builder =
        CfnDeliveryStream.SchemaConfigurationProperty.builder()

    /**
     * @param catalogId The ID of the AWS Glue Data Catalog. If you don't supply this, the AWS
     *   account ID is used by default.
     */
    public fun catalogId(catalogId: String) {
        cdkBuilder.catalogId(catalogId)
    }

    /**
     * @param databaseName Specifies the name of the AWS Glue database that contains the schema for
     *   the output data.
     *
     * If the `SchemaConfiguration` request parameter is used as part of invoking the
     * `CreateDeliveryStream` API, then the `DatabaseName` property is required and its value must
     * be specified.
     */
    public fun databaseName(databaseName: String) {
        cdkBuilder.databaseName(databaseName)
    }

    /** @param region If you don't specify an AWS Region, the default is the current Region. */
    public fun region(region: String) {
        cdkBuilder.region(region)
    }

    /**
     * @param roleArn The role that Firehose can use to access AWS Glue. This role must be in the
     *   same account you use for Firehose. Cross-account roles aren't allowed.
     *
     * If the `SchemaConfiguration` request parameter is used as part of invoking the
     * `CreateDeliveryStream` API, then the `RoleARN` property is required and its value must be
     * specified.
     */
    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    /**
     * @param tableName Specifies the AWS Glue table that contains the column information that
     *   constitutes your data schema.
     *
     * If the `SchemaConfiguration` request parameter is used as part of invoking the
     * `CreateDeliveryStream` API, then the `TableName` property is required and its value must be
     * specified.
     */
    public fun tableName(tableName: String) {
        cdkBuilder.tableName(tableName)
    }

    /**
     * @param versionId Specifies the table version for the output data schema. If you don't specify
     *   this version ID, or if you set it to `LATEST` , Firehose uses the most recent version. This
     *   means that any updates to the table are automatically picked up.
     */
    public fun versionId(versionId: String) {
        cdkBuilder.versionId(versionId)
    }

    public fun build(): CfnDeliveryStream.SchemaConfigurationProperty = cdkBuilder.build()
}
