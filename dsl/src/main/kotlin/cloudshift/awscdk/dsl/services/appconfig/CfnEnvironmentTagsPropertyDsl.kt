@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appconfig

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appconfig.CfnEnvironment

@CdkDslMarker
public class CfnEnvironmentTagsPropertyDsl {
  private val cdkBuilder: CfnEnvironment.TagsProperty.Builder =
      CfnEnvironment.TagsProperty.builder()

  public fun key(key: String) {
    cdkBuilder.key(key)
  }

  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnEnvironment.TagsProperty = cdkBuilder.build()
}
