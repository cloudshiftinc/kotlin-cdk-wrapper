@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.synthetics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.synthetics.CfnCanary

@CdkDslMarker
public class CfnCanaryVisualReferencePropertyDsl {
  private val cdkBuilder: CfnCanary.VisualReferenceProperty.Builder =
      CfnCanary.VisualReferenceProperty.builder()

  private val _baseScreenshots: MutableList<Any> = mutableListOf()

  /**
   * @param baseCanaryRunId Specifies which canary run to use the screenshots from as the baseline
   * for future visual monitoring with this canary. 
   * Valid values are `nextrun` to use the screenshots from the next run after this update is made,
   * `lastrun` to use the screenshots from the most recent run before this update was made, or the
   * value of `Id` in the
   * [CanaryRun](https://docs.aws.amazon.com/AmazonSynthetics/latest/APIReference/API_CanaryRun.html)
   * from any past run of this canary.
   */
  public fun baseCanaryRunId(baseCanaryRunId: String) {
    cdkBuilder.baseCanaryRunId(baseCanaryRunId)
  }

  /**
   * @param baseScreenshots An array of screenshots that are used as the baseline for comparisons
   * during visual monitoring.
   */
  public fun baseScreenshots(vararg baseScreenshots: Any) {
    _baseScreenshots.addAll(listOf(*baseScreenshots))
  }

  /**
   * @param baseScreenshots An array of screenshots that are used as the baseline for comparisons
   * during visual monitoring.
   */
  public fun baseScreenshots(baseScreenshots: Collection<Any>) {
    _baseScreenshots.addAll(baseScreenshots)
  }

  /**
   * @param baseScreenshots An array of screenshots that are used as the baseline for comparisons
   * during visual monitoring.
   */
  public fun baseScreenshots(baseScreenshots: IResolvable) {
    cdkBuilder.baseScreenshots(baseScreenshots)
  }

  public fun build(): CfnCanary.VisualReferenceProperty {
    if(_baseScreenshots.isNotEmpty()) cdkBuilder.baseScreenshots(_baseScreenshots)
    return cdkBuilder.build()
  }
}
