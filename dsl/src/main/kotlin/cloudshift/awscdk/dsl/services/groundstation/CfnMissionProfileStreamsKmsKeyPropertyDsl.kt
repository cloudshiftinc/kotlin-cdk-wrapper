@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.groundstation

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.groundstation.CfnMissionProfile

@CdkDslMarker
public class CfnMissionProfileStreamsKmsKeyPropertyDsl {
  private val cdkBuilder: CfnMissionProfile.StreamsKmsKeyProperty.Builder =
      CfnMissionProfile.StreamsKmsKeyProperty.builder()

  public fun kmsAliasArn(kmsAliasArn: String) {
    cdkBuilder.kmsAliasArn(kmsAliasArn)
  }

  public fun kmsKeyArn(kmsKeyArn: String) {
    cdkBuilder.kmsKeyArn(kmsKeyArn)
  }

  public fun build(): CfnMissionProfile.StreamsKmsKeyProperty = cdkBuilder.build()
}
