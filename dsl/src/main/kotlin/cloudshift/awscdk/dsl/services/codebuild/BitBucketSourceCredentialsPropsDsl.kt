@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codebuild

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.SecretValue
import software.amazon.awscdk.services.codebuild.BitBucketSourceCredentialsProps

@CdkDslMarker
public class BitBucketSourceCredentialsPropsDsl {
  private val cdkBuilder: BitBucketSourceCredentialsProps.Builder =
      BitBucketSourceCredentialsProps.builder()

  /**
   * @param password Your BitBucket application password. 
   */
  public fun password(password: SecretValue) {
    cdkBuilder.password(password)
  }

  /**
   * @param username Your BitBucket username. 
   */
  public fun username(username: SecretValue) {
    cdkBuilder.username(username)
  }

  public fun build(): BitBucketSourceCredentialsProps = cdkBuilder.build()
}
