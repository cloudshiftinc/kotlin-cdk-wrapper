@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.opsworks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.opsworks.CfnApp

@CdkDslMarker
public class CfnAppSourcePropertyDsl {
  private val cdkBuilder: CfnApp.SourceProperty.Builder = CfnApp.SourceProperty.builder()

  public fun password(password: String) {
    cdkBuilder.password(password)
  }

  public fun revision(revision: String) {
    cdkBuilder.revision(revision)
  }

  public fun sshKey(sshKey: String) {
    cdkBuilder.sshKey(sshKey)
  }

  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun url(url: String) {
    cdkBuilder.url(url)
  }

  public fun username(username: String) {
    cdkBuilder.username(username)
  }

  public fun build(): CfnApp.SourceProperty = cdkBuilder.build()
}
