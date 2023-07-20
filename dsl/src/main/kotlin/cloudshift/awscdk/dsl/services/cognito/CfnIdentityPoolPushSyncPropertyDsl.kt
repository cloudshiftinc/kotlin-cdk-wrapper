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

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.cognito.CfnIdentityPool
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnIdentityPoolPushSyncPropertyDsl {
    private val cdkBuilder: CfnIdentityPool.PushSyncProperty.Builder =
        CfnIdentityPool.PushSyncProperty.builder()

    private val _applicationArns: MutableList<String> = mutableListOf()

    public fun applicationArns(vararg applicationArns: String) {
        _applicationArns.addAll(listOf(*applicationArns))
    }

    public fun applicationArns(applicationArns: Collection<String>) {
        _applicationArns.addAll(applicationArns)
    }

    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    public fun build(): CfnIdentityPool.PushSyncProperty {
        if (_applicationArns.isNotEmpty()) cdkBuilder.applicationArns(_applicationArns)
        return cdkBuilder.build()
    }
}
