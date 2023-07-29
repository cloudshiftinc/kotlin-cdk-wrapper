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

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.s3.CfnStorageLens

/**
 * This resource contains the details of the AWS Organization for Amazon S3 Storage Lens.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.s3.*;
 * AwsOrgProperty awsOrgProperty = AwsOrgProperty.builder()
 * .arn("arn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelens-awsorg.html)
 */
@CdkDslMarker
public class CfnStorageLensAwsOrgPropertyDsl {
    private val cdkBuilder: CfnStorageLens.AwsOrgProperty.Builder =
        CfnStorageLens.AwsOrgProperty.builder()

    /** @param arn This resource contains the ARN of the AWS Organization. */
    public fun arn(arn: String) {
        cdkBuilder.arn(arn)
    }

    public fun build(): CfnStorageLens.AwsOrgProperty = cdkBuilder.build()
}
