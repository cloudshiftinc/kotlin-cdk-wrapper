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

package cloudshift.awscdk.dsl.services.kinesisanalyticsv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication

/**
 * Specifies either the application code, or the location of the application code, for a Flink-based
 * Kinesis Data Analytics application.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesisanalyticsv2.*;
 * CodeContentProperty codeContentProperty = CodeContentProperty.builder()
 * .s3ContentLocation(S3ContentLocationProperty.builder()
 * .bucketArn("bucketArn")
 * .fileKey("fileKey")
 * // the properties below are optional
 * .objectVersion("objectVersion")
 * .build())
 * .textContent("textContent")
 * .zipFileContent("zipFileContent")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-codecontent.html)
 */
@CdkDslMarker
public class CfnApplicationCodeContentPropertyDsl {
    private val cdkBuilder: CfnApplication.CodeContentProperty.Builder =
        CfnApplication.CodeContentProperty.builder()

    /**
     * @param s3ContentLocation Information about the Amazon S3 bucket that contains the application
     *   code.
     */
    public fun s3ContentLocation(s3ContentLocation: IResolvable) {
        cdkBuilder.s3ContentLocation(s3ContentLocation)
    }

    /**
     * @param s3ContentLocation Information about the Amazon S3 bucket that contains the application
     *   code.
     */
    public fun s3ContentLocation(s3ContentLocation: CfnApplication.S3ContentLocationProperty) {
        cdkBuilder.s3ContentLocation(s3ContentLocation)
    }

    /**
     * @param textContent The text-format code for a Flink-based Kinesis Data Analytics application.
     */
    public fun textContent(textContent: String) {
        cdkBuilder.textContent(textContent)
    }

    /**
     * @param zipFileContent The zip-format code for a Flink-based Kinesis Data Analytics
     *   application.
     */
    public fun zipFileContent(zipFileContent: String) {
        cdkBuilder.zipFileContent(zipFileContent)
    }

    public fun build(): CfnApplication.CodeContentProperty = cdkBuilder.build()
}
