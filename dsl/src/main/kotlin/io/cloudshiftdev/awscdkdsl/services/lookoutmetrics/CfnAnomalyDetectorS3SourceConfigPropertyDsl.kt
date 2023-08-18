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

package io.cloudshiftdev.awscdkdsl.services.lookoutmetrics

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector

/**
 * Contains information about the configuration of the S3 bucket that contains source files.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lookoutmetrics.*;
 * S3SourceConfigProperty s3SourceConfigProperty = S3SourceConfigProperty.builder()
 * .fileFormatDescriptor(FileFormatDescriptorProperty.builder()
 * .csvFormatDescriptor(CsvFormatDescriptorProperty.builder()
 * .charset("charset")
 * .containsHeader(false)
 * .delimiter("delimiter")
 * .fileCompression("fileCompression")
 * .headerList(List.of("headerList"))
 * .quoteSymbol("quoteSymbol")
 * .build())
 * .jsonFormatDescriptor(JsonFormatDescriptorProperty.builder()
 * .charset("charset")
 * .fileCompression("fileCompression")
 * .build())
 * .build())
 * .roleArn("roleArn")
 * // the properties below are optional
 * .historicalDataPathList(List.of("historicalDataPathList"))
 * .templatedPathList(List.of("templatedPathList"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-s3sourceconfig.html)
 */
@CdkDslMarker
public class CfnAnomalyDetectorS3SourceConfigPropertyDsl {
    private val cdkBuilder: CfnAnomalyDetector.S3SourceConfigProperty.Builder =
        CfnAnomalyDetector.S3SourceConfigProperty.builder()

    private val _historicalDataPathList: MutableList<String> = mutableListOf()

    private val _templatedPathList: MutableList<String> = mutableListOf()

    /** @param fileFormatDescriptor Contains information about a source file's formatting. */
    public fun fileFormatDescriptor(fileFormatDescriptor: IResolvable) {
        cdkBuilder.fileFormatDescriptor(fileFormatDescriptor)
    }

    /** @param fileFormatDescriptor Contains information about a source file's formatting. */
    public fun fileFormatDescriptor(
        fileFormatDescriptor: CfnAnomalyDetector.FileFormatDescriptorProperty
    ) {
        cdkBuilder.fileFormatDescriptor(fileFormatDescriptor)
    }

    /** @param historicalDataPathList A list of paths to the historical data files. */
    public fun historicalDataPathList(vararg historicalDataPathList: String) {
        _historicalDataPathList.addAll(listOf(*historicalDataPathList))
    }

    /** @param historicalDataPathList A list of paths to the historical data files. */
    public fun historicalDataPathList(historicalDataPathList: Collection<String>) {
        _historicalDataPathList.addAll(historicalDataPathList)
    }

    /**
     * @param roleArn The ARN of an IAM role that has read and write access permissions to the
     *   source S3 bucket.
     */
    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    /** @param templatedPathList A list of templated paths to the source files. */
    public fun templatedPathList(vararg templatedPathList: String) {
        _templatedPathList.addAll(listOf(*templatedPathList))
    }

    /** @param templatedPathList A list of templated paths to the source files. */
    public fun templatedPathList(templatedPathList: Collection<String>) {
        _templatedPathList.addAll(templatedPathList)
    }

    public fun build(): CfnAnomalyDetector.S3SourceConfigProperty {
        if (_historicalDataPathList.isNotEmpty())
            cdkBuilder.historicalDataPathList(_historicalDataPathList)
        if (_templatedPathList.isNotEmpty()) cdkBuilder.templatedPathList(_templatedPathList)
        return cdkBuilder.build()
    }
}
