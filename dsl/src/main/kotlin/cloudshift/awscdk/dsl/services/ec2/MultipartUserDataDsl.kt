@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.MultipartUserData

@CdkDslMarker
public class MultipartUserDataDsl {
  private val cdkBuilder: MultipartUserData.Builder = MultipartUserData.Builder.create()

  /**
   * The string used to separate parts in multipart user data archive (it's like MIME boundary).
   *
   * This string should contain [a-zA-Z0-9()+,-./:=?] characters only, and should not be present in
   * any part, or in text content of archive.
   *
   * Default: `+AWS+CDK+User+Data+Separator==`
   *
   * @param partsSeparator The string used to separate parts in multipart user data archive (it's
   * like MIME boundary). 
   */
  public fun partsSeparator(partsSeparator: String) {
    cdkBuilder.partsSeparator(partsSeparator)
  }

  public fun build(): MultipartUserData = cdkBuilder.build()
}
