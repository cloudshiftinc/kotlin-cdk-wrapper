@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ssmcontacts

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ssmcontacts.CfnRotation

/**
 * Information about the days of the week that the on-call rotation coverage includes.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ssmcontacts.*;
 * ShiftCoverageProperty shiftCoverageProperty = ShiftCoverageProperty.builder()
 * .coverageTimes(List.of(CoverageTimeProperty.builder()
 * .endTime("endTime")
 * .startTime("startTime")
 * .build()))
 * .dayOfWeek("dayOfWeek")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmcontacts-rotation-shiftcoverage.html)
 */
@CdkDslMarker
public class CfnRotationShiftCoveragePropertyDsl {
  private val cdkBuilder: CfnRotation.ShiftCoverageProperty.Builder =
      CfnRotation.ShiftCoverageProperty.builder()

  private val _coverageTimes: MutableList<Any> = mutableListOf()

  /**
   * @param coverageTimes The start and end times of the shift. 
   */
  public fun coverageTimes(vararg coverageTimes: Any) {
    _coverageTimes.addAll(listOf(*coverageTimes))
  }

  /**
   * @param coverageTimes The start and end times of the shift. 
   */
  public fun coverageTimes(coverageTimes: Collection<Any>) {
    _coverageTimes.addAll(coverageTimes)
  }

  /**
   * @param coverageTimes The start and end times of the shift. 
   */
  public fun coverageTimes(coverageTimes: IResolvable) {
    cdkBuilder.coverageTimes(coverageTimes)
  }

  /**
   * @param dayOfWeek A list of days on which the schedule is active. 
   */
  public fun dayOfWeek(dayOfWeek: String) {
    cdkBuilder.dayOfWeek(dayOfWeek)
  }

  public fun build(): CfnRotation.ShiftCoverageProperty {
    if(_coverageTimes.isNotEmpty()) cdkBuilder.coverageTimes(_coverageTimes)
    return cdkBuilder.build()
  }
}
