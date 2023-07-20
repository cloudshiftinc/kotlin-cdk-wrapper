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

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudfront.CfnRealtimeLogConfig
import software.constructs.Construct
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnRealtimeLogConfigDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnRealtimeLogConfig.Builder = CfnRealtimeLogConfig.Builder.create(
        scope,
        id,
    )

    private val _endPoints: MutableList<Any> = mutableListOf()

    private val _fields: MutableList<String> = mutableListOf()

    public fun endPoints(vararg endPoints: Any) {
        _endPoints.addAll(listOf(*endPoints))
    }

    public fun endPoints(endPoints: Collection<Any>) {
        _endPoints.addAll(endPoints)
    }

    public fun endPoints(endPoints: IResolvable) {
        cdkBuilder.endPoints(endPoints)
    }

    public fun fields(vararg fields: String) {
        _fields.addAll(listOf(*fields))
    }

    public fun fields(fields: Collection<String>) {
        _fields.addAll(fields)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun samplingRate(samplingRate: Number) {
        cdkBuilder.samplingRate(samplingRate)
    }

    public fun build(): CfnRealtimeLogConfig {
        if (_endPoints.isNotEmpty()) cdkBuilder.endPoints(_endPoints)
        if (_fields.isNotEmpty()) cdkBuilder.fields(_fields)
        return cdkBuilder.build()
    }
}
