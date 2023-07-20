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

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnCapacityReservation
import software.constructs.Construct
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnCapacityReservationDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnCapacityReservation.Builder =
        CfnCapacityReservation.Builder.create(scope, id)

    private val _tagSpecifications: MutableList<Any> = mutableListOf()

    public fun availabilityZone(availabilityZone: String) {
        cdkBuilder.availabilityZone(availabilityZone)
    }

    public fun ebsOptimized(ebsOptimized: Boolean) {
        cdkBuilder.ebsOptimized(ebsOptimized)
    }

    public fun ebsOptimized(ebsOptimized: IResolvable) {
        cdkBuilder.ebsOptimized(ebsOptimized)
    }

    public fun endDate(endDate: String) {
        cdkBuilder.endDate(endDate)
    }

    public fun endDateType(endDateType: String) {
        cdkBuilder.endDateType(endDateType)
    }

    public fun ephemeralStorage(ephemeralStorage: Boolean) {
        cdkBuilder.ephemeralStorage(ephemeralStorage)
    }

    public fun ephemeralStorage(ephemeralStorage: IResolvable) {
        cdkBuilder.ephemeralStorage(ephemeralStorage)
    }

    public fun instanceCount(instanceCount: Number) {
        cdkBuilder.instanceCount(instanceCount)
    }

    public fun instanceMatchCriteria(instanceMatchCriteria: String) {
        cdkBuilder.instanceMatchCriteria(instanceMatchCriteria)
    }

    public fun instancePlatform(instancePlatform: String) {
        cdkBuilder.instancePlatform(instancePlatform)
    }

    public fun instanceType(instanceType: String) {
        cdkBuilder.instanceType(instanceType)
    }

    public fun outPostArn(outPostArn: String) {
        cdkBuilder.outPostArn(outPostArn)
    }

    public fun placementGroupArn(placementGroupArn: String) {
        cdkBuilder.placementGroupArn(placementGroupArn)
    }

    public fun tagSpecifications(vararg tagSpecifications: Any) {
        _tagSpecifications.addAll(listOf(*tagSpecifications))
    }

    public fun tagSpecifications(tagSpecifications: Collection<Any>) {
        _tagSpecifications.addAll(tagSpecifications)
    }

    public fun tagSpecifications(tagSpecifications: IResolvable) {
        cdkBuilder.tagSpecifications(tagSpecifications)
    }

    public fun tenancy(tenancy: String) {
        cdkBuilder.tenancy(tenancy)
    }

    public fun build(): CfnCapacityReservation {
        if (_tagSpecifications.isNotEmpty()) cdkBuilder.tagSpecifications(_tagSpecifications)
        return cdkBuilder.build()
    }
}
