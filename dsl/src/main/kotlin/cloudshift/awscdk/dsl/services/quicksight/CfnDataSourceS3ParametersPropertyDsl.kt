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

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDataSource

/**
 * The parameters for S3.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * S3ParametersProperty s3ParametersProperty = S3ParametersProperty.builder()
 * .manifestFileLocation(ManifestFileLocationProperty.builder()
 * .bucket("bucket")
 * .key("key")
 * .build())
 * // the properties below are optional
 * .roleArn("roleArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-s3parameters.html)
 */
@CdkDslMarker
public class CfnDataSourceS3ParametersPropertyDsl {
    private val cdkBuilder: CfnDataSource.S3ParametersProperty.Builder =
        CfnDataSource.S3ParametersProperty.builder()

    /**
     * @param manifestFileLocation Location of the Amazon S3 manifest file. This is NULL if the
     *   manifest file was uploaded into Amazon QuickSight.
     */
    public fun manifestFileLocation(manifestFileLocation: IResolvable) {
        cdkBuilder.manifestFileLocation(manifestFileLocation)
    }

    /**
     * @param manifestFileLocation Location of the Amazon S3 manifest file. This is NULL if the
     *   manifest file was uploaded into Amazon QuickSight.
     */
    public fun manifestFileLocation(
        manifestFileLocation: CfnDataSource.ManifestFileLocationProperty
    ) {
        cdkBuilder.manifestFileLocation(manifestFileLocation)
    }

    /**
     * @param roleArn Use the `RoleArn` structure to override an account-wide role for a specific S3
     *   data source. For example, say an account administrator has turned off all S3 access with an
     *   account-wide role. The administrator can then use `RoleArn` to bypass the account-wide role
     *   and allow S3 access for the single S3 data source that is specified in the structure, even
     *   if the account-wide role forbidding S3 access is still active.
     */
    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    public fun build(): CfnDataSource.S3ParametersProperty = cdkBuilder.build()
}
