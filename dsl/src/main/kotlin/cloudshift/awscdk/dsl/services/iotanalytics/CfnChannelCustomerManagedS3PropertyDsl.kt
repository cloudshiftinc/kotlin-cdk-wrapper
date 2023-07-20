@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.iotanalytics

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.iotanalytics.CfnChannel
import kotlin.String

@CdkDslMarker
public class CfnChannelCustomerManagedS3PropertyDsl {
    private val cdkBuilder: CfnChannel.CustomerManagedS3Property.Builder =
        CfnChannel.CustomerManagedS3Property.builder()

    public fun bucket(bucket: String) {
        cdkBuilder.bucket(bucket)
    }

    public fun keyPrefix(keyPrefix: String) {
        cdkBuilder.keyPrefix(keyPrefix)
    }

    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    public fun build(): CfnChannel.CustomerManagedS3Property = cdkBuilder.build()
}
