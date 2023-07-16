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

  public fun maxCpus(maxCpus: Number) {
    cdkBuilder.maxCpus(maxCpus)
  }

  public fun maxDuration(maxDuration: Number) {
    cdkBuilder.maxDuration(maxDuration)
  }

  public fun maxRuns(maxRuns: Number) {
    cdkBuilder.maxRuns(maxRuns)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun tags(tags: Map<String, String>) {
    cdkBuilder.tags(tags)
  }

  public fun build(): CfnRunGroupProps = cdkBuilder.build()
}
