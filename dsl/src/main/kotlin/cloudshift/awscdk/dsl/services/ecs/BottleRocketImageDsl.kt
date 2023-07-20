@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.services.ec2.InstanceArchitecture
import software.amazon.awscdk.services.ecs.BottleRocketImage
import software.amazon.awscdk.services.ecs.BottlerocketEcsVariant

@CdkDslMarker
public class BottleRocketImageDsl {
  private val cdkBuilder: BottleRocketImage.Builder = BottleRocketImage.Builder.create()

  public fun architecture(architecture: InstanceArchitecture) {
    cdkBuilder.architecture(architecture)
  }

  public fun cachedInContext(cachedInContext: Boolean) {
    cdkBuilder.cachedInContext(cachedInContext)
  }

  public fun variant(variant: BottlerocketEcsVariant) {
    cdkBuilder.variant(variant)
  }

  public fun build(): BottleRocketImage = cdkBuilder.build()
}
