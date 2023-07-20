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

package cloudshift.awscdk.dsl.services.kendraranking

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kendraranking.CfnExecutionPlan
import software.constructs.Construct
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnExecutionPlanDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnExecutionPlan.Builder = CfnExecutionPlan.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun capacityUnits(capacityUnits: IResolvable) {
        cdkBuilder.capacityUnits(capacityUnits)
    }

    public fun capacityUnits(capacityUnits: CfnExecutionPlan.CapacityUnitsConfigurationProperty) {
        cdkBuilder.capacityUnits(capacityUnits)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnExecutionPlan {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
