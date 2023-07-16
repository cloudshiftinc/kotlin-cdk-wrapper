@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appflow

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appflow.CfnFlow

@CdkDslMarker
public class CfnFlowVeevaSourcePropertiesPropertyDsl {
  private val cdkBuilder: CfnFlow.VeevaSourcePropertiesProperty.Builder =
      CfnFlow.VeevaSourcePropertiesProperty.builder()

  public fun `object`(`object`: String) {
    cdkBuilder.`object`(`object`)
  }

  public fun documentType(documentType: String) {
    cdkBuilder.documentType(documentType)
  }

  public fun includeAllVersions(includeAllVersions: Boolean) {
    cdkBuilder.includeAllVersions(includeAllVersions)
  }

  public fun includeAllVersions(includeAllVersions: IResolvable) {
    cdkBuilder.includeAllVersions(includeAllVersions)
  }

  public fun includeRenditions(includeRenditions: Boolean) {
    cdkBuilder.includeRenditions(includeRenditions)
  }

  public fun includeRenditions(includeRenditions: IResolvable) {
    cdkBuilder.includeRenditions(includeRenditions)
  }

  public fun includeSourceFiles(includeSourceFiles: Boolean) {
    cdkBuilder.includeSourceFiles(includeSourceFiles)
  }

  public fun includeSourceFiles(includeSourceFiles: IResolvable) {
    cdkBuilder.includeSourceFiles(includeSourceFiles)
  }

  public fun build(): CfnFlow.VeevaSourcePropertiesProperty = cdkBuilder.build()
}
