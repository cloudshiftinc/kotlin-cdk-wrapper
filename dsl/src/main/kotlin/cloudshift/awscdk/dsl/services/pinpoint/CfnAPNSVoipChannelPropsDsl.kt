@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pinpoint

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pinpoint.CfnAPNSVoipChannelProps

@CdkDslMarker
public class CfnAPNSVoipChannelPropsDsl {
  private val cdkBuilder: CfnAPNSVoipChannelProps.Builder = CfnAPNSVoipChannelProps.builder()

  public fun applicationId(applicationId: String) {
    cdkBuilder.applicationId(applicationId)
  }

  public fun bundleId(bundleId: String) {
    cdkBuilder.bundleId(bundleId)
  }

  public fun certificate(certificate: String) {
    cdkBuilder.certificate(certificate)
  }

  public fun defaultAuthenticationMethod(defaultAuthenticationMethod: String) {
    cdkBuilder.defaultAuthenticationMethod(defaultAuthenticationMethod)
  }

  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  public fun enabled(enabled: IResolvable) {
    cdkBuilder.enabled(enabled)
  }

  public fun privateKey(privateKey: String) {
    cdkBuilder.privateKey(privateKey)
  }

  public fun teamId(teamId: String) {
    cdkBuilder.teamId(teamId)
  }

  public fun tokenKey(tokenKey: String) {
    cdkBuilder.tokenKey(tokenKey)
  }

  public fun tokenKeyId(tokenKeyId: String) {
    cdkBuilder.tokenKeyId(tokenKeyId)
  }

  public fun build(): CfnAPNSVoipChannelProps = cdkBuilder.build()
}
