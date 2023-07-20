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

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3.CfnBucket
import kotlin.Boolean

@CdkDslMarker
public class CfnBucketServerSideEncryptionRulePropertyDsl {
    private val cdkBuilder: CfnBucket.ServerSideEncryptionRuleProperty.Builder =
        CfnBucket.ServerSideEncryptionRuleProperty.builder()

    public fun bucketKeyEnabled(bucketKeyEnabled: Boolean) {
        cdkBuilder.bucketKeyEnabled(bucketKeyEnabled)
    }

    public fun bucketKeyEnabled(bucketKeyEnabled: IResolvable) {
        cdkBuilder.bucketKeyEnabled(bucketKeyEnabled)
    }

    public fun serverSideEncryptionByDefault(serverSideEncryptionByDefault: IResolvable) {
        cdkBuilder.serverSideEncryptionByDefault(serverSideEncryptionByDefault)
    }

    public fun serverSideEncryptionByDefault(serverSideEncryptionByDefault: CfnBucket.ServerSideEncryptionByDefaultProperty) {
        cdkBuilder.serverSideEncryptionByDefault(serverSideEncryptionByDefault)
    }

    public fun build(): CfnBucket.ServerSideEncryptionRuleProperty = cdkBuilder.build()
}
