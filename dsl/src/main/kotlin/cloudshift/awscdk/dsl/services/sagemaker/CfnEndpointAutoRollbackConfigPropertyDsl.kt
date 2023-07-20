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

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnEndpoint
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnEndpointAutoRollbackConfigPropertyDsl {
    private val cdkBuilder: CfnEndpoint.AutoRollbackConfigProperty.Builder =
        CfnEndpoint.AutoRollbackConfigProperty.builder()

    private val _alarms: MutableList<Any> = mutableListOf()

    public fun alarms(vararg alarms: Any) {
        _alarms.addAll(listOf(*alarms))
    }

    public fun alarms(alarms: Collection<Any>) {
        _alarms.addAll(alarms)
    }

    public fun alarms(alarms: IResolvable) {
        cdkBuilder.alarms(alarms)
    }

    public fun build(): CfnEndpoint.AutoRollbackConfigProperty {
        if (_alarms.isNotEmpty()) cdkBuilder.alarms(_alarms)
        return cdkBuilder.build()
    }
}
