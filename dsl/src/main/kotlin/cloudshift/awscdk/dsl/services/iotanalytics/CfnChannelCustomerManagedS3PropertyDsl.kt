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

package cloudshift.awscdk.dsl.services.iotanalytics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iotanalytics.CfnChannel

/**
 * Used to store channel data in an S3 bucket that you manage.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotanalytics.*;
 * CustomerManagedS3Property customerManagedS3Property = CustomerManagedS3Property.builder()
 * .bucket("bucket")
 * .roleArn("roleArn")
 * // the properties below are optional
 * .keyPrefix("keyPrefix")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-channel-customermanageds3.html)
 */
@CdkDslMarker
public class CfnChannelCustomerManagedS3PropertyDsl {
    private val cdkBuilder: CfnChannel.CustomerManagedS3Property.Builder =
        CfnChannel.CustomerManagedS3Property.builder()

    /** @param bucket The name of the S3 bucket in which channel data is stored. */
    public fun bucket(bucket: String) {
        cdkBuilder.bucket(bucket)
    }

    /**
     * @param keyPrefix (Optional) The prefix used to create the keys of the channel data objects.
     *   Each object in an S3 bucket has a key that is its unique identifier within the bucket (each
     *   object in a bucket has exactly one key). The prefix must end with a forward slash (/).
     */
    public fun keyPrefix(keyPrefix: String) {
        cdkBuilder.keyPrefix(keyPrefix)
    }

    /**
     * @param roleArn The ARN of the role that grants AWS IoT Analytics permission to interact with
     *   your Amazon S3 resources.
     */
    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    public fun build(): CfnChannel.CustomerManagedS3Property = cdkBuilder.build()
}
