@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codebuild

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.SecretValue
import software.amazon.awscdk.services.codebuild.BitBucketSourceCredentials
import software.constructs.Construct

@CdkDslMarker
public class BitBucketSourceCredentialsDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: BitBucketSourceCredentials.Builder =
      BitBucketSourceCredentials.Builder.create(scope, id)

  /**
   * Your BitBucket application password.
   *
   * @param password Your BitBucket application password. 
   */
  public fun password(password: SecretValue) {
    cdkBuilder.password(password)
  }

  /**
   * Your BitBucket username.
   *
   * @param username Your BitBucket username. 
   */
  public fun username(username: SecretValue) {
    cdkBuilder.username(username)
  }

  public fun build(): BitBucketSourceCredentials = cdkBuilder.build()
}
