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
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnBucketBucketEncryptionPropertyDsl {
    private val cdkBuilder: CfnBucket.BucketEncryptionProperty.Builder =
        CfnBucket.BucketEncryptionProperty.builder()

    private val _serverSideEncryptionConfiguration: MutableList<Any> = mutableListOf()

    public fun serverSideEncryptionConfiguration(vararg serverSideEncryptionConfiguration: Any) {
        _serverSideEncryptionConfiguration.addAll(listOf(*serverSideEncryptionConfiguration))
    }

    public fun serverSideEncryptionConfiguration(serverSideEncryptionConfiguration: Collection<Any>) {
        _serverSideEncryptionConfiguration.addAll(serverSideEncryptionConfiguration)
    }

    public fun serverSideEncryptionConfiguration(serverSideEncryptionConfiguration: IResolvable) {
        cdkBuilder.serverSideEncryptionConfiguration(serverSideEncryptionConfiguration)
    }

    public fun build(): CfnBucket.BucketEncryptionProperty {
        if (_serverSideEncryptionConfiguration.isNotEmpty()) {
            cdkBuilder.serverSideEncryptionConfiguration(_serverSideEncryptionConfiguration)
        }
        return cdkBuilder.build()
    }
}
