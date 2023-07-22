@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codepipeline

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.codepipeline.ActionBindOptions
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.s3.IBucket

@CdkDslMarker
public class ActionBindOptionsDsl {
  private val cdkBuilder: ActionBindOptions.Builder = ActionBindOptions.builder()

  /**
   * @param bucket the value to be set. 
   */
  public fun bucket(bucket: IBucket) {
    cdkBuilder.bucket(bucket)
  }

  /**
   * @param role the value to be set. 
   */
  public fun role(role: IRole) {
    cdkBuilder.role(role)
  }

  public fun build(): ActionBindOptions = cdkBuilder.build()
}
