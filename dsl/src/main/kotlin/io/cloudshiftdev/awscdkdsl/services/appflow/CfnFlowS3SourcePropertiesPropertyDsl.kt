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

package io.cloudshiftdev.awscdkdsl.services.appflow

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appflow.CfnFlow

/**
 * The properties that are applied when Amazon S3 is being used as the flow source.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appflow.*;
 * S3SourcePropertiesProperty s3SourcePropertiesProperty = S3SourcePropertiesProperty.builder()
 * .bucketName("bucketName")
 * .bucketPrefix("bucketPrefix")
 * // the properties below are optional
 * .s3InputFormatConfig(S3InputFormatConfigProperty.builder()
 * .s3InputFileType("s3InputFileType")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-s3sourceproperties.html)
 */
@CdkDslMarker
public class CfnFlowS3SourcePropertiesPropertyDsl {
    private val cdkBuilder: CfnFlow.S3SourcePropertiesProperty.Builder =
        CfnFlow.S3SourcePropertiesProperty.builder()

    /** @param bucketName The Amazon S3 bucket name where the source files are stored. */
    public fun bucketName(bucketName: String) {
        cdkBuilder.bucketName(bucketName)
    }

    /**
     * @param bucketPrefix The object key for the Amazon S3 bucket in which the source files are
     *   stored.
     */
    public fun bucketPrefix(bucketPrefix: String) {
        cdkBuilder.bucketPrefix(bucketPrefix)
    }

    /**
     * @param s3InputFormatConfig When you use Amazon S3 as the source, the configuration format
     *   that you provide the flow input data.
     */
    public fun s3InputFormatConfig(s3InputFormatConfig: IResolvable) {
        cdkBuilder.s3InputFormatConfig(s3InputFormatConfig)
    }

    /**
     * @param s3InputFormatConfig When you use Amazon S3 as the source, the configuration format
     *   that you provide the flow input data.
     */
    public fun s3InputFormatConfig(s3InputFormatConfig: CfnFlow.S3InputFormatConfigProperty) {
        cdkBuilder.s3InputFormatConfig(s3InputFormatConfig)
    }

    public fun build(): CfnFlow.S3SourcePropertiesProperty = cdkBuilder.build()
}
