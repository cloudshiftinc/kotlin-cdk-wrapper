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
import software.amazon.awscdk.services.iotanalytics.CfnDatastore
import kotlin.String

@CdkDslMarker
public class CfnDatastoreCustomerManagedS3PropertyDsl {
    private val cdkBuilder: CfnDatastore.CustomerManagedS3Property.Builder =
        CfnDatastore.CustomerManagedS3Property.builder()

    public fun bucket(bucket: String) {
        cdkBuilder.bucket(bucket)
    }

    public fun keyPrefix(keyPrefix: String) {
        cdkBuilder.keyPrefix(keyPrefix)
    }

    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    public fun build(): CfnDatastore.CustomerManagedS3Property = cdkBuilder.build()
}
