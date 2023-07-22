@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.cloudfront.SSLMethod
import software.amazon.awscdk.services.cloudfront.SecurityPolicyProtocol
import software.amazon.awscdk.services.cloudfront.ViewerCertificateOptions

@CdkDslMarker
public class ViewerCertificateOptionsDsl {
  private val cdkBuilder: ViewerCertificateOptions.Builder = ViewerCertificateOptions.builder()

  private val _aliases: MutableList<String> = mutableListOf()

  /**
   * @param aliases Domain names on the certificate (both main domain name and Subject Alternative
   * names).
   */
  public fun aliases(vararg aliases: String) {
    _aliases.addAll(listOf(*aliases))
  }

  /**
   * @param aliases Domain names on the certificate (both main domain name and Subject Alternative
   * names).
   */
  public fun aliases(aliases: Collection<String>) {
    _aliases.addAll(aliases)
  }

  /**
   * @param securityPolicy The minimum version of the SSL protocol that you want CloudFront to use
   * for HTTPS connections.
   * CloudFront serves your objects only to browsers or devices that support at
   * least the SSL version that you specify.
   */
  public fun securityPolicy(securityPolicy: SecurityPolicyProtocol) {
    cdkBuilder.securityPolicy(securityPolicy)
  }

  /**
   * @param sslMethod How CloudFront should serve HTTPS requests.
   * See the notes on SSLMethod if you wish to use other SSL termination types.
   */
  public fun sslMethod(sslMethod: SSLMethod) {
    cdkBuilder.sslMethod(sslMethod)
  }

  public fun build(): ViewerCertificateOptions {
    if(_aliases.isNotEmpty()) cdkBuilder.aliases(_aliases)
    return cdkBuilder.build()
  }
}
