@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.apigateway.CfnDomainName

@CdkDslMarker
public class CfnDomainNameMutualTlsAuthenticationPropertyDsl {
  private val cdkBuilder: CfnDomainName.MutualTlsAuthenticationProperty.Builder =
      CfnDomainName.MutualTlsAuthenticationProperty.builder()

  /**
   * @param truststoreUri An Amazon S3 URL that specifies the truststore for mutual TLS
   * authentication, for example `s3://bucket-name/key-name` .
   * The truststore can contain certificates from public or private certificate authorities. To
   * update the truststore, upload a new version to S3, and then update your custom domain name to use
   * the new version. To update the truststore, you must have permissions to access the S3 object.
   */
  public fun truststoreUri(truststoreUri: String) {
    cdkBuilder.truststoreUri(truststoreUri)
  }

  /**
   * @param truststoreVersion The version of the S3 object that contains your truststore.
   * To specify a version, you must have versioning enabled for the S3 bucket.
   */
  public fun truststoreVersion(truststoreVersion: String) {
    cdkBuilder.truststoreVersion(truststoreVersion)
  }

  public fun build(): CfnDomainName.MutualTlsAuthenticationProperty = cdkBuilder.build()
}
