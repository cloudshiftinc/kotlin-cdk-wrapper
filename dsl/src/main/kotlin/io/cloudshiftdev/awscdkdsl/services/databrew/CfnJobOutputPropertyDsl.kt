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

package io.cloudshiftdev.awscdkdsl.services.databrew

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.databrew.CfnJob

/**
 * Represents options that specify how and where in Amazon S3 DataBrew writes the output generated
 * by recipe jobs or profile jobs.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.databrew.*;
 * OutputProperty outputProperty = OutputProperty.builder()
 * .location(S3LocationProperty.builder()
 * .bucket("bucket")
 * // the properties below are optional
 * .bucketOwner("bucketOwner")
 * .key("key")
 * .build())
 * // the properties below are optional
 * .compressionFormat("compressionFormat")
 * .format("format")
 * .formatOptions(OutputFormatOptionsProperty.builder()
 * .csv(CsvOutputOptionsProperty.builder()
 * .delimiter("delimiter")
 * .build())
 * .build())
 * .maxOutputFiles(123)
 * .overwrite(false)
 * .partitionColumns(List.of("partitionColumns"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-output.html)
 */
@CdkDslMarker
public class CfnJobOutputPropertyDsl {
    private val cdkBuilder: CfnJob.OutputProperty.Builder = CfnJob.OutputProperty.builder()

    private val _partitionColumns: MutableList<String> = mutableListOf()

    /**
     * @param compressionFormat The compression algorithm used to compress the output text of the
     *   job.
     */
    public fun compressionFormat(compressionFormat: String) {
        cdkBuilder.compressionFormat(compressionFormat)
    }

    /** @param format The data format of the output of the job. */
    public fun format(format: String) {
        cdkBuilder.format(format)
    }

    /**
     * @param formatOptions Represents options that define how DataBrew formats job output files.
     */
    public fun formatOptions(formatOptions: IResolvable) {
        cdkBuilder.formatOptions(formatOptions)
    }

    /**
     * @param formatOptions Represents options that define how DataBrew formats job output files.
     */
    public fun formatOptions(formatOptions: CfnJob.OutputFormatOptionsProperty) {
        cdkBuilder.formatOptions(formatOptions)
    }

    /** @param location The location in Amazon S3 where the job writes its output. */
    public fun location(location: IResolvable) {
        cdkBuilder.location(location)
    }

    /** @param location The location in Amazon S3 where the job writes its output. */
    public fun location(location: CfnJob.S3LocationProperty) {
        cdkBuilder.location(location)
    }

    /**
     * @param maxOutputFiles The maximum number of files to be generated by the job and written to
     *   the output folder.
     */
    public fun maxOutputFiles(maxOutputFiles: Number) {
        cdkBuilder.maxOutputFiles(maxOutputFiles)
    }

    /**
     * @param overwrite A value that, if true, means that any data in the location specified for
     *   output is overwritten with new output.
     */
    public fun overwrite(overwrite: Boolean) {
        cdkBuilder.overwrite(overwrite)
    }

    /**
     * @param overwrite A value that, if true, means that any data in the location specified for
     *   output is overwritten with new output.
     */
    public fun overwrite(overwrite: IResolvable) {
        cdkBuilder.overwrite(overwrite)
    }

    /**
     * @param partitionColumns The names of one or more partition columns for the output of the job.
     */
    public fun partitionColumns(vararg partitionColumns: String) {
        _partitionColumns.addAll(listOf(*partitionColumns))
    }

    /**
     * @param partitionColumns The names of one or more partition columns for the output of the job.
     */
    public fun partitionColumns(partitionColumns: Collection<String>) {
        _partitionColumns.addAll(partitionColumns)
    }

    public fun build(): CfnJob.OutputProperty {
        if (_partitionColumns.isNotEmpty()) cdkBuilder.partitionColumns(_partitionColumns)
        return cdkBuilder.build()
    }
}