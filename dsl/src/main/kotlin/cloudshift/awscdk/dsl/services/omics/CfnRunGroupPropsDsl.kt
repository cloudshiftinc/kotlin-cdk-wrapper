@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.omics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.services.omics.CfnRunGroupProps

/**
 * Properties for defining a `CfnRunGroup`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.omics.*;
 * CfnRunGroupProps cfnRunGroupProps = CfnRunGroupProps.builder()
 * .maxCpus(123)
 * .maxDuration(123)
 * .maxRuns(123)
 * .name("name")
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-rungroup.html)
 */
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
