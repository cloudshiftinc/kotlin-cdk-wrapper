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

package cloudshift.awscdk.dsl.services.ce

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ce.CfnAnomalyMonitor
import software.constructs.Construct
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnAnomalyMonitorDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnAnomalyMonitor.Builder = CfnAnomalyMonitor.Builder.create(scope, id)

    private val _resourceTags: MutableList<Any> = mutableListOf()

    public fun monitorDimension(monitorDimension: String) {
        cdkBuilder.monitorDimension(monitorDimension)
    }

    public fun monitorName(monitorName: String) {
        cdkBuilder.monitorName(monitorName)
    }

    public fun monitorSpecification(monitorSpecification: String) {
        cdkBuilder.monitorSpecification(monitorSpecification)
    }

    public fun monitorType(monitorType: String) {
        cdkBuilder.monitorType(monitorType)
    }

    public fun resourceTags(vararg resourceTags: Any) {
        _resourceTags.addAll(listOf(*resourceTags))
    }

    public fun resourceTags(resourceTags: Collection<Any>) {
        _resourceTags.addAll(resourceTags)
    }

    public fun resourceTags(resourceTags: IResolvable) {
        cdkBuilder.resourceTags(resourceTags)
    }

    public fun build(): CfnAnomalyMonitor {
        if (_resourceTags.isNotEmpty()) cdkBuilder.resourceTags(_resourceTags)
        return cdkBuilder.build()
    }
}
