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
import software.amazon.awscdk.services.s3.BucketNotificationDestinationConfig
import software.amazon.awscdk.services.s3.BucketNotificationDestinationType
import software.constructs.IDependable
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class BucketNotificationDestinationConfigDsl {
    private val cdkBuilder: BucketNotificationDestinationConfig.Builder =
        BucketNotificationDestinationConfig.builder()

    private val _dependencies: MutableList<IDependable> = mutableListOf()

    public fun arn(arn: String) {
        cdkBuilder.arn(arn)
    }

    public fun dependencies(vararg dependencies: IDependable) {
        _dependencies.addAll(listOf(*dependencies))
    }

    public fun dependencies(dependencies: Collection<IDependable>) {
        _dependencies.addAll(dependencies)
    }

    public fun type(type: BucketNotificationDestinationType) {
        cdkBuilder.type(type)
    }

    public fun build(): BucketNotificationDestinationConfig {
        if (_dependencies.isNotEmpty()) cdkBuilder.dependencies(_dependencies)
        return cdkBuilder.build()
    }
}
