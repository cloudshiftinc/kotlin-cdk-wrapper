@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.glue

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.glue.CfnJob

@CdkDslMarker
public class CfnJobJobCommandPropertyDsl {
  private val cdkBuilder: CfnJob.JobCommandProperty.Builder = CfnJob.JobCommandProperty.builder()

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun pythonVersion(pythonVersion: String) {
    cdkBuilder.pythonVersion(pythonVersion)
  }

  public fun runtime(runtime: String) {
    cdkBuilder.runtime(runtime)
  }

  public fun scriptLocation(scriptLocation: String) {
    cdkBuilder.scriptLocation(scriptLocation)
  }

  public fun build(): CfnJob.JobCommandProperty = cdkBuilder.build()
}
