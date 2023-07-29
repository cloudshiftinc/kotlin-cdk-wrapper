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

package cloudshift.awscdk.dsl.services.timestream

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.timestream.CfnScheduledQuery

/**
 * Configuration required for error reporting.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.timestream.*;
 * ErrorReportConfigurationProperty errorReportConfigurationProperty =
 * ErrorReportConfigurationProperty.builder()
 * .s3Configuration(S3ConfigurationProperty.builder()
 * .bucketName("bucketName")
 * // the properties below are optional
 * .encryptionOption("encryptionOption")
 * .objectKeyPrefix("objectKeyPrefix")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-timestream-scheduledquery-errorreportconfiguration.html)
 */
@CdkDslMarker
public class CfnScheduledQueryErrorReportConfigurationPropertyDsl {
    private val cdkBuilder: CfnScheduledQuery.ErrorReportConfigurationProperty.Builder =
        CfnScheduledQuery.ErrorReportConfigurationProperty.builder()

    /** @param s3Configuration The S3 configuration for the error reports. */
    public fun s3Configuration(s3Configuration: IResolvable) {
        cdkBuilder.s3Configuration(s3Configuration)
    }

    /** @param s3Configuration The S3 configuration for the error reports. */
    public fun s3Configuration(s3Configuration: CfnScheduledQuery.S3ConfigurationProperty) {
        cdkBuilder.s3Configuration(s3Configuration)
    }

    public fun build(): CfnScheduledQuery.ErrorReportConfigurationProperty = cdkBuilder.build()
}
