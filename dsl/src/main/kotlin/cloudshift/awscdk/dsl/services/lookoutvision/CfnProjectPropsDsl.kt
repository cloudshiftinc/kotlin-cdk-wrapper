@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lookoutvision

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.lookoutvision.CfnProjectProps

@CdkDslMarker
public class CfnProjectPropsDsl {
  private val cdkBuilder: CfnProjectProps.Builder = CfnProjectProps.builder()

  public fun projectName(projectName: String) {
    cdkBuilder.projectName(projectName)
  }

  public fun build(): CfnProjectProps = cdkBuilder.build()
}
