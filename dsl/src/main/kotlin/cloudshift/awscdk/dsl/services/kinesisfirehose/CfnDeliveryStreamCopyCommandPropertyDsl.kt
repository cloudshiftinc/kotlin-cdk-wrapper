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

package cloudshift.awscdk.dsl.services.kinesisfirehose

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

/**
 * The `CopyCommand` property type configures the Amazon Redshift `COPY` command that Amazon Kinesis
 * Data Firehose (Kinesis Data Firehose) uses to load data into an Amazon Redshift cluster from an
 * Amazon S3 bucket.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesisfirehose.*;
 * CopyCommandProperty copyCommandProperty = CopyCommandProperty.builder()
 * .dataTableName("dataTableName")
 * // the properties below are optional
 * .copyOptions("copyOptions")
 * .dataTableColumns("dataTableColumns")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-copycommand.html)
 */
@CdkDslMarker
public class CfnDeliveryStreamCopyCommandPropertyDsl {
    private val cdkBuilder: CfnDeliveryStream.CopyCommandProperty.Builder =
        CfnDeliveryStream.CopyCommandProperty.builder()

    /**
     * @param copyOptions Parameters to use with the Amazon Redshift `COPY` command. For examples,
     *   see the `CopyOptions` content for the
     *   [CopyCommand](https://docs.aws.amazon.com/firehose/latest/APIReference/API_CopyCommand.html)
     *   data type in the *Amazon Kinesis Data Firehose API Reference* .
     */
    public fun copyOptions(copyOptions: String) {
        cdkBuilder.copyOptions(copyOptions)
    }

    /** @param dataTableColumns A comma-separated list of column names. */
    public fun dataTableColumns(dataTableColumns: String) {
        cdkBuilder.dataTableColumns(dataTableColumns)
    }

    /**
     * @param dataTableName The name of the target table. The table must already exist in the
     *   database.
     */
    public fun dataTableName(dataTableName: String) {
        cdkBuilder.dataTableName(dataTableName)
    }

    public fun build(): CfnDeliveryStream.CopyCommandProperty = cdkBuilder.build()
}
