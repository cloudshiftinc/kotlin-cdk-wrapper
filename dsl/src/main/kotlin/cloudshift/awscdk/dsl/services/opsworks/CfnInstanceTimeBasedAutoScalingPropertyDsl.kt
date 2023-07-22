@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.opsworks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.opsworks.CfnInstance

@CdkDslMarker
public class CfnInstanceTimeBasedAutoScalingPropertyDsl {
  private val cdkBuilder: CfnInstance.TimeBasedAutoScalingProperty.Builder =
      CfnInstance.TimeBasedAutoScalingProperty.builder()

  /**
   * @param friday The schedule for Friday.
   */
  public fun friday(friday: Map<String, String>) {
    cdkBuilder.friday(friday)
  }

  /**
   * @param friday The schedule for Friday.
   */
  public fun friday(friday: IResolvable) {
    cdkBuilder.friday(friday)
  }

  /**
   * @param monday The schedule for Monday.
   */
  public fun monday(monday: Map<String, String>) {
    cdkBuilder.monday(monday)
  }

  /**
   * @param monday The schedule for Monday.
   */
  public fun monday(monday: IResolvable) {
    cdkBuilder.monday(monday)
  }

  /**
   * @param saturday The schedule for Saturday.
   */
  public fun saturday(saturday: Map<String, String>) {
    cdkBuilder.saturday(saturday)
  }

  /**
   * @param saturday The schedule for Saturday.
   */
  public fun saturday(saturday: IResolvable) {
    cdkBuilder.saturday(saturday)
  }

  /**
   * @param sunday The schedule for Sunday.
   */
  public fun sunday(sunday: Map<String, String>) {
    cdkBuilder.sunday(sunday)
  }

  /**
   * @param sunday The schedule for Sunday.
   */
  public fun sunday(sunday: IResolvable) {
    cdkBuilder.sunday(sunday)
  }

  /**
   * @param thursday The schedule for Thursday.
   */
  public fun thursday(thursday: Map<String, String>) {
    cdkBuilder.thursday(thursday)
  }

  /**
   * @param thursday The schedule for Thursday.
   */
  public fun thursday(thursday: IResolvable) {
    cdkBuilder.thursday(thursday)
  }

  /**
   * @param tuesday The schedule for Tuesday.
   */
  public fun tuesday(tuesday: Map<String, String>) {
    cdkBuilder.tuesday(tuesday)
  }

  /**
   * @param tuesday The schedule for Tuesday.
   */
  public fun tuesday(tuesday: IResolvable) {
    cdkBuilder.tuesday(tuesday)
  }

  /**
   * @param wednesday The schedule for Wednesday.
   */
  public fun wednesday(wednesday: Map<String, String>) {
    cdkBuilder.wednesday(wednesday)
  }

  /**
   * @param wednesday The schedule for Wednesday.
   */
  public fun wednesday(wednesday: IResolvable) {
    cdkBuilder.wednesday(wednesday)
  }

  public fun build(): CfnInstance.TimeBasedAutoScalingProperty = cdkBuilder.build()
}
