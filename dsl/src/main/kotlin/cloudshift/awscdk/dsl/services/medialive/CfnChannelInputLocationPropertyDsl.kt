@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.medialive.CfnChannel

@CdkDslMarker
public class CfnChannelInputLocationPropertyDsl {
  private val cdkBuilder: CfnChannel.InputLocationProperty.Builder =
      CfnChannel.InputLocationProperty.builder()

  /**
   * @param passwordParam The password parameter that holds the password for accessing the
   * downstream system.
   * This applies only if the downstream system requires credentials.
   */
  public fun passwordParam(passwordParam: String) {
    cdkBuilder.passwordParam(passwordParam)
  }

  /**
   * @param uri The URI should be a path to a file that is accessible to the Live system (for
   * example, an http:// URI) depending on the output type.
   * For example, an RTMP destination should have a URI similar to rtmp://fmsserver/live.
   */
  public fun uri(uri: String) {
    cdkBuilder.uri(uri)
  }

  /**
   * @param username The user name to connect to the downstream system.
   * This applies only if the downstream system requires credentials.
   */
  public fun username(username: String) {
    cdkBuilder.username(username)
  }

  public fun build(): CfnChannel.InputLocationProperty = cdkBuilder.build()
}
