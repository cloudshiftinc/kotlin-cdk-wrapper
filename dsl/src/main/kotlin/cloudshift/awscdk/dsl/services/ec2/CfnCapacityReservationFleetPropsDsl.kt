@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnCapacityReservationFleetProps

@CdkDslMarker
public class CfnCapacityReservationFleetPropsDsl {
  private val cdkBuilder: CfnCapacityReservationFleetProps.Builder =
      CfnCapacityReservationFleetProps.builder()

  private val _instanceTypeSpecifications: MutableList<Any> = mutableListOf()

  private val _tagSpecifications: MutableList<Any> = mutableListOf()

  public fun allocationStrategy(allocationStrategy: String) {
    cdkBuilder.allocationStrategy(allocationStrategy)
  }

  public fun endDate(endDate: String) {
    cdkBuilder.endDate(endDate)
  }

  public fun instanceMatchCriteria(instanceMatchCriteria: String) {
    cdkBuilder.instanceMatchCriteria(instanceMatchCriteria)
  }

  public fun instanceTypeSpecifications(vararg instanceTypeSpecifications: Any) {
    _instanceTypeSpecifications.addAll(listOf(*instanceTypeSpecifications))
  }

  public fun instanceTypeSpecifications(instanceTypeSpecifications: Collection<Any>) {
    _instanceTypeSpecifications.addAll(instanceTypeSpecifications)
  }

  public fun instanceTypeSpecifications(instanceTypeSpecifications: IResolvable) {
    cdkBuilder.instanceTypeSpecifications(instanceTypeSpecifications)
  }

  public fun noRemoveEndDate(noRemoveEndDate: Boolean) {
    cdkBuilder.noRemoveEndDate(noRemoveEndDate)
  }

  public fun noRemoveEndDate(noRemoveEndDate: IResolvable) {
    cdkBuilder.noRemoveEndDate(noRemoveEndDate)
  }

  public fun removeEndDate(removeEndDate: Boolean) {
    cdkBuilder.removeEndDate(removeEndDate)
  }

  public fun removeEndDate(removeEndDate: IResolvable) {
    cdkBuilder.removeEndDate(removeEndDate)
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

  public fun totalTargetCapacity(totalTargetCapacity: Number) {
    cdkBuilder.totalTargetCapacity(totalTargetCapacity)
  }

  public fun build(): CfnCapacityReservationFleetProps {
    if(_instanceTypeSpecifications.isNotEmpty())
        cdkBuilder.instanceTypeSpecifications(_instanceTypeSpecifications)
    if(_tagSpecifications.isNotEmpty()) cdkBuilder.tagSpecifications(_tagSpecifications)
    return cdkBuilder.build()
  }
}
