@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.omics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.services.omics.CfnRunGroupProps

@CdkDslMarker
public class CfnRunGroupPropsDsl {
  private val cdkBuilder: CfnRunGroupProps.Builder = CfnRunGroupProps.builder()

  /**
   * @param maxCpus The group's maximum CPU count setting.
   */
  public fun maxCpus(maxCpus: Number) {
    cdkBuilder.maxCpus(maxCpus)
  }

  /**
   * @param maxDuration The group's maximum duration setting in minutes.
   */
  public fun maxDuration(maxDuration: Number) {
    cdkBuilder.maxDuration(maxDuration)
  }

  /**
   * @param maxRuns The group's maximum concurrent run setting.
   */
  public fun maxRuns(maxRuns: Number) {
    cdkBuilder.maxRuns(maxRuns)
  }

  /**
   * @param name The group's name.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param tags Tags for the group.
   */
  public fun tags(tags: Map<String, String>) {
    cdkBuilder.tags(tags)
  }

  public fun build(): CfnRunGroupProps = cdkBuilder.build()
}
