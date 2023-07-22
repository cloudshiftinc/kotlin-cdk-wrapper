@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.acmpca

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.acmpca.CfnCertificateAuthority

@CdkDslMarker
public class CfnCertificateAuthorityCrlConfigurationPropertyDsl {
  private val cdkBuilder: CfnCertificateAuthority.CrlConfigurationProperty.Builder =
      CfnCertificateAuthority.CrlConfigurationProperty.builder()

  /**
   * @param customCname Name inserted into the certificate *CRL Distribution Points* extension that
   * enables the use of an alias for the CRL distribution point.
   * Use this value if you don't want the name of your S3 bucket to be public.
   *
   *
   * The content of a Canonical Name (CNAME) record must conform to
   * [RFC2396](https://docs.aws.amazon.com/https://www.ietf.org/rfc/rfc2396.txt) restrictions on the
   * use of special characters in URIs. Additionally, the value of the CNAME must not include a
   * protocol prefix such as "http://" or "https://".
   */
  public fun customCname(customCname: String) {
    cdkBuilder.customCname(customCname)
  }

  /**
   * @param enabled Boolean value that specifies whether certificate revocation lists (CRLs) are
   * enabled.
   * You can use this value to enable certificate revocation for a new CA when you call the
   * `CreateCertificateAuthority` operation or for an existing CA when you call the
   * `UpdateCertificateAuthority` operation.
   */
  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * @param enabled Boolean value that specifies whether certificate revocation lists (CRLs) are
   * enabled.
   * You can use this value to enable certificate revocation for a new CA when you call the
   * `CreateCertificateAuthority` operation or for an existing CA when you call the
   * `UpdateCertificateAuthority` operation.
   */
  public fun enabled(enabled: IResolvable) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * @param expirationInDays Validity period of the CRL in days.
   */
  public fun expirationInDays(expirationInDays: Number) {
    cdkBuilder.expirationInDays(expirationInDays)
  }

  /**
   * @param s3BucketName Name of the S3 bucket that contains the CRL.
   * If you do not provide a value for the *CustomCname* argument, the name of your S3 bucket is
   * placed into the *CRL Distribution Points* extension of the issued certificate. You can change the
   * name of your bucket by calling the
   * [UpdateCertificateAuthority](https://docs.aws.amazon.com/privateca/latest/APIReference/API_UpdateCertificateAuthority.html)
   * operation. You must specify a [bucket
   * policy](https://docs.aws.amazon.com/privateca/latest/userguide/PcaCreateCa.html#s3-policies) that
   * allows AWS Private CA to write the CRL to your bucket.
   *
   *
   * The `S3BucketName` parameter must conform to the [S3 bucket naming
   * rules](https://docs.aws.amazon.com/AmazonS3/latest/userguide/bucketnamingrules.html) .
   */
  public fun s3BucketName(s3BucketName: String) {
    cdkBuilder.s3BucketName(s3BucketName)
  }

  /**
   * @param s3ObjectAcl Determines whether the CRL will be publicly readable or privately held in
   * the CRL Amazon S3 bucket.
   * If you choose PUBLIC_READ, the CRL will be accessible over the public internet. If you choose
   * BUCKET_OWNER_FULL_CONTROL, only the owner of the CRL S3 bucket can access the CRL, and your PKI
   * clients may need an alternative method of access.
   *
   * If no value is specified, the default is PUBLIC_READ.
   *
   * *Note:* This default can cause CA creation to fail in some circumstances. If you have have
   * enabled the Block Public Access (BPA) feature in your S3 account, then you must specify the value
   * of this parameter as `BUCKET_OWNER_FULL_CONTROL` , and not doing so results in an error. If you
   * have disabled BPA in S3, then you can specify either `BUCKET_OWNER_FULL_CONTROL` or `PUBLIC_READ`
   * as the value.
   *
   * For more information, see [Blocking public access to the S3
   * bucket](https://docs.aws.amazon.com/privateca/latest/userguide/PcaCreateCa.html#s3-bpa) .
   */
  public fun s3ObjectAcl(s3ObjectAcl: String) {
    cdkBuilder.s3ObjectAcl(s3ObjectAcl)
  }

  public fun build(): CfnCertificateAuthority.CrlConfigurationProperty = cdkBuilder.build()
}
