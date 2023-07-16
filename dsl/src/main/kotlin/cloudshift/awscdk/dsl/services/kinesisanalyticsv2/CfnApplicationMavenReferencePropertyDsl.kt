@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisanalyticsv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication

@CdkDslMarker
public class CfnApplicationMavenReferencePropertyDsl {
  private val cdkBuilder: CfnApplication.MavenReferenceProperty.Builder =
      CfnApplication.MavenReferenceProperty.builder()

  public fun artifactId(artifactId: String) {
    cdkBuilder.artifactId(artifactId)
  }

  public fun groupId(groupId: String) {
    cdkBuilder.groupId(groupId)
  }

  public fun version(version: String) {
    cdkBuilder.version(version)
  }

  public fun build(): CfnApplication.MavenReferenceProperty = cdkBuilder.build()
}
