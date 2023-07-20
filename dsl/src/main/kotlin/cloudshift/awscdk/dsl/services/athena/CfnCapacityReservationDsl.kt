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

package cloudshift.awscdk.dsl.services.athena

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.athena.CfnCapacityReservation
import software.constructs.Construct
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnCapacityReservationDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnCapacityReservation.Builder =
        CfnCapacityReservation.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun capacityAssignmentConfiguration(capacityAssignmentConfiguration: IResolvable) {
        cdkBuilder.capacityAssignmentConfiguration(capacityAssignmentConfiguration)
    }

    public fun capacityAssignmentConfiguration(capacityAssignmentConfiguration: CfnCapacityReservation.CapacityAssignmentConfigurationProperty) {
        cdkBuilder.capacityAssignmentConfiguration(capacityAssignmentConfiguration)
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

    public fun targetDpus(targetDpus: Number) {
        cdkBuilder.targetDpus(targetDpus)
    }

    public fun build(): CfnCapacityReservation {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
