@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisanalytics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2

@CdkDslMarker
public class CfnApplicationV2MavenReferencePropertyDsl {
  private val cdkBuilder: CfnApplicationV2.MavenReferenceProperty.Builder =
      CfnApplicationV2.MavenReferenceProperty.builder()

  /**
   * @param artifactId The artifact ID of the Maven reference. 
   */
  public fun artifactId(artifactId: String) {
    cdkBuilder.artifactId(artifactId)
  }

  /**
   * @param groupId The group ID of the Maven reference. 
   */
  public fun groupId(groupId: String) {
    cdkBuilder.groupId(groupId)
  }

  /**
   * @param version The version of the Maven reference. 
   */
  public fun version(version: String) {
    cdkBuilder.version(version)
  }

  public fun build(): CfnApplicationV2.MavenReferenceProperty = cdkBuilder.build()
}
