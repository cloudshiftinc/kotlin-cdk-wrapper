@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.athena

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.athena.CfnCapacityReservation
import software.amazon.awscdk.services.athena.CfnCapacityReservationProps

@CdkDslMarker
public class CfnCapacityReservationPropsDsl {
  private val cdkBuilder: CfnCapacityReservationProps.Builder =
      CfnCapacityReservationProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param capacityAssignmentConfiguration Assigns Athena workgroups (and hence their queries) to
   * capacity reservations.
   * A capacity reservation can have only one capacity assignment configuration, but the capacity
   * assignment configuration can be made up of multiple individual assignments. Each assignment
   * specifies how Athena queries can consume capacity from the capacity reservation that their
   * workgroup is mapped to.
   */
  public fun capacityAssignmentConfiguration(capacityAssignmentConfiguration: IResolvable) {
    cdkBuilder.capacityAssignmentConfiguration(capacityAssignmentConfiguration)
  }

  /**
   * @param capacityAssignmentConfiguration Assigns Athena workgroups (and hence their queries) to
   * capacity reservations.
   * A capacity reservation can have only one capacity assignment configuration, but the capacity
   * assignment configuration can be made up of multiple individual assignments. Each assignment
   * specifies how Athena queries can consume capacity from the capacity reservation that their
   * workgroup is mapped to.
   */
  public
      fun capacityAssignmentConfiguration(capacityAssignmentConfiguration: CfnCapacityReservation.CapacityAssignmentConfigurationProperty) {
    cdkBuilder.capacityAssignmentConfiguration(capacityAssignmentConfiguration)
  }

  /**
   * @param name The name of the capacity reservation. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param tags An array of key-value pairs to apply to the capacity reservation.
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags An array of key-value pairs to apply to the capacity reservation.
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * @param targetDpus The number of data processing units requested. 
   */
  public fun targetDpus(targetDpus: Number) {
    cdkBuilder.targetDpus(targetDpus)
  }

  public fun build(): CfnCapacityReservationProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
