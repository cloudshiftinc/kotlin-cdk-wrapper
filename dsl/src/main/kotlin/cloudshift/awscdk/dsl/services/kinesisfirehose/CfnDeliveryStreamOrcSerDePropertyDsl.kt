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
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

/**
 * A serializer to use for converting data to the ORC format before storing it in Amazon S3.
 *
 * For more information, see [Apache ORC](https://docs.aws.amazon.com/https://orc.apache.org/docs/)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesisfirehose.*;
 * OrcSerDeProperty orcSerDeProperty = OrcSerDeProperty.builder()
 * .blockSizeBytes(123)
 * .bloomFilterColumns(List.of("bloomFilterColumns"))
 * .bloomFilterFalsePositiveProbability(123)
 * .compression("compression")
 * .dictionaryKeyThreshold(123)
 * .enablePadding(false)
 * .formatVersion("formatVersion")
 * .paddingTolerance(123)
 * .rowIndexStride(123)
 * .stripeSizeBytes(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-orcserde.html)
 */
@CdkDslMarker
public class CfnDeliveryStreamOrcSerDePropertyDsl {
    private val cdkBuilder: CfnDeliveryStream.OrcSerDeProperty.Builder =
        CfnDeliveryStream.OrcSerDeProperty.builder()

    private val _bloomFilterColumns: MutableList<String> = mutableListOf()

    /**
     * @param blockSizeBytes The Hadoop Distributed File System (HDFS) block size. This is useful if
     *   you intend to copy the data from Amazon S3 to HDFS before querying. The default is 256 MiB
     *   and the minimum is 64 MiB. Kinesis Data Firehose uses this value for padding calculations.
     */
    public fun blockSizeBytes(blockSizeBytes: Number) {
        cdkBuilder.blockSizeBytes(blockSizeBytes)
    }

    /**
     * @param bloomFilterColumns The column names for which you want Kinesis Data Firehose to create
     *   bloom filters. The default is `null` .
     */
    public fun bloomFilterColumns(vararg bloomFilterColumns: String) {
        _bloomFilterColumns.addAll(listOf(*bloomFilterColumns))
    }

    /**
     * @param bloomFilterColumns The column names for which you want Kinesis Data Firehose to create
     *   bloom filters. The default is `null` .
     */
    public fun bloomFilterColumns(bloomFilterColumns: Collection<String>) {
        _bloomFilterColumns.addAll(bloomFilterColumns)
    }

    /**
     * @param bloomFilterFalsePositiveProbability The Bloom filter false positive probability (FPP).
     *   The lower the FPP, the bigger the Bloom filter. The default value is 0.05, the minimum is
     *   0, and the maximum is 1.
     */
    public fun bloomFilterFalsePositiveProbability(bloomFilterFalsePositiveProbability: Number) {
        cdkBuilder.bloomFilterFalsePositiveProbability(bloomFilterFalsePositiveProbability)
    }

    /**
     * @param compression The compression code to use over data blocks. The default is `SNAPPY` .
     */
    public fun compression(compression: String) {
        cdkBuilder.compression(compression)
    }

    /**
     * @param dictionaryKeyThreshold Represents the fraction of the total number of non-null rows.
     *   To turn off dictionary encoding, set this fraction to a number that is less than the number
     *   of distinct keys in a dictionary. To always use dictionary encoding, set this threshold
     *   to 1.
     */
    public fun dictionaryKeyThreshold(dictionaryKeyThreshold: Number) {
        cdkBuilder.dictionaryKeyThreshold(dictionaryKeyThreshold)
    }

    /**
     * @param enablePadding Set this to `true` to indicate that you want stripes to be padded to the
     *   HDFS block boundaries. This is useful if you intend to copy the data from Amazon S3 to HDFS
     *   before querying. The default is `false` .
     */
    public fun enablePadding(enablePadding: Boolean) {
        cdkBuilder.enablePadding(enablePadding)
    }

    /**
     * @param enablePadding Set this to `true` to indicate that you want stripes to be padded to the
     *   HDFS block boundaries. This is useful if you intend to copy the data from Amazon S3 to HDFS
     *   before querying. The default is `false` .
     */
    public fun enablePadding(enablePadding: IResolvable) {
        cdkBuilder.enablePadding(enablePadding)
    }

    /**
     * @param formatVersion The version of the file to write. The possible values are `V0_11` and
     *   `V0_12` . The default is `V0_12` .
     */
    public fun formatVersion(formatVersion: String) {
        cdkBuilder.formatVersion(formatVersion)
    }

    /**
     * @param paddingTolerance A number between 0 and 1 that defines the tolerance for block padding
     *   as a decimal fraction of stripe size. The default value is 0.05, which means 5 percent of
     *   stripe size.
     *
     * For the default values of 64 MiB ORC stripes and 256 MiB HDFS blocks, the default block
     * padding tolerance of 5 percent reserves a maximum of 3.2 MiB for padding within the 256 MiB
     * block. In such a case, if the available size within the block is more than 3.2 MiB, a new,
     * smaller stripe is inserted to fit within that space. This ensures that no stripe crosses
     * block boundaries and causes remote reads within a node-local task.
     *
     * Kinesis Data Firehose ignores this parameter when `EnablePadding` is `false` .
     */
    public fun paddingTolerance(paddingTolerance: Number) {
        cdkBuilder.paddingTolerance(paddingTolerance)
    }

    /**
     * @param rowIndexStride The number of rows between index entries. The default is 10,000 and the
     *   minimum is 1,000.
     */
    public fun rowIndexStride(rowIndexStride: Number) {
        cdkBuilder.rowIndexStride(rowIndexStride)
    }

    /**
     * @param stripeSizeBytes The number of bytes in each stripe. The default is 64 MiB and the
     *   minimum is 8 MiB.
     */
    public fun stripeSizeBytes(stripeSizeBytes: Number) {
        cdkBuilder.stripeSizeBytes(stripeSizeBytes)
    }

    public fun build(): CfnDeliveryStream.OrcSerDeProperty {
        if (_bloomFilterColumns.isNotEmpty()) cdkBuilder.bloomFilterColumns(_bloomFilterColumns)
        return cdkBuilder.build()
    }
}
