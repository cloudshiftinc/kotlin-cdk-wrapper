@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iam

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.iam.CfnServerCertificate
import software.constructs.Construct

/**
 * Uploads a server certificate entity for the AWS account .
 *
 * The server certificate entity includes a public key certificate, a private key, and an optional
 * certificate chain, which should all be PEM-encoded.
 *
 * We recommend that you use [AWS Certificate Manager](https://docs.aws.amazon.com/acm/) to
 * provision, manage, and deploy your server certificates. With ACM you can request a certificate,
 * deploy it to AWS resources, and let ACM handle certificate renewals for you. Certificates provided
 * by ACM are free. For more information about using ACM, see the [AWS Certificate Manager User
 * Guide](https://docs.aws.amazon.com/acm/latest/userguide/) .
 *
 * For more information about working with server certificates, see [Working with server
 * certificates](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_server-certs.html) in
 * the *IAM User Guide* . This topic includes a list of AWS services that can use the server
 * certificates that you manage with IAM.
 *
 * For information about the number of server certificates you can upload, see [IAM and AWS STS
 * quotas](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-quotas.html) in the *IAM User
 * Guide* .
 *
 *
 * Because the body of the public key certificate, private key, and the certificate chain can be
 * large, you should use POST rather than GET when calling `UploadServerCertificate` . For information
 * about setting up signatures and authorization through the API, see [Signing AWS API
 * requests](https://docs.aws.amazon.com/general/latest/gr/signing_aws_api_requests.html) in the *AWS
 * General Reference* . For general information about using the Query API with IAM, see [Calling the
 * API by making HTTP query
 * requests](https://docs.aws.amazon.com/IAM/latest/UserGuide/programming.html) in the *IAM User Guide*
 * .
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iam.*;
 * CfnServerCertificate cfnServerCertificate = CfnServerCertificate.Builder.create(this,
 * "MyCfnServerCertificate")
 * .certificateBody("certificateBody")
 * .certificateChain("certificateChain")
 * .path("path")
 * .privateKey("privateKey")
 * .serverCertificateName("serverCertificateName")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-servercertificate.html)
 */
@CdkDslMarker
public class CfnServerCertificateDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnServerCertificate.Builder = CfnServerCertificate.Builder.create(scope,
      id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * The contents of the public key certificate.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-servercertificate.html#cfn-iam-servercertificate-certificatebody)
   * @param certificateBody The contents of the public key certificate. 
   */
  public fun certificateBody(certificateBody: String) {
    cdkBuilder.certificateBody(certificateBody)
  }

  /**
   * The contents of the public key certificate chain.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-servercertificate.html#cfn-iam-servercertificate-certificatechain)
   * @param certificateChain The contents of the public key certificate chain. 
   */
  public fun certificateChain(certificateChain: String) {
    cdkBuilder.certificateChain(certificateChain)
  }

  /**
   * The path for the server certificate.
   *
   * For more information about paths, see [IAM
   * identifiers](https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html) in the *IAM
   * User Guide* .
   *
   * This parameter is optional. If it is not included, it defaults to a slash (/). This parameter
   * allows (through its [regex pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) )
   * a string of characters consisting of either a forward slash (/) by itself or a string that must
   * begin and end with forward slashes. In addition, it can contain any ASCII character from the ! (
   * `\u0021` ) through the DEL character ( `\u007F` ), including most punctuation characters, digits,
   * and upper and lowercased letters.
   *
   *
   * If you are uploading a server certificate specifically for use with Amazon CloudFront
   * distributions, you must specify a path using the `path` parameter. The path must begin with
   * `/cloudfront` and must include a trailing slash (for example, `/cloudfront/test/` ).
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-servercertificate.html#cfn-iam-servercertificate-path)
   * @param path The path for the server certificate. 
   */
  public fun path(path: String) {
    cdkBuilder.path(path)
  }

  /**
   * The contents of the private key in PEM-encoded format.
   *
   * The [regex pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) used to
   * validate this parameter is a string of characters consisting of the following:
   *
   * * Any printable ASCII character ranging from the space character ( `\u0020` ) through the end
   * of the ASCII character range
   * * The printable characters in the Basic Latin and Latin-1 Supplement character set (through
   * `\u00FF` )
   * * The special characters tab ( `\u0009` ), line feed ( `\u000A` ), and carriage return (
   * `\u000D` )
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-servercertificate.html#cfn-iam-servercertificate-privatekey)
   * @param privateKey The contents of the private key in PEM-encoded format. 
   */
  public fun privateKey(privateKey: String) {
    cdkBuilder.privateKey(privateKey)
  }

  /**
   * The name for the server certificate.
   *
   * Do not include the path in this value. The name of the certificate cannot contain any spaces.
   *
   * This parameter allows (through its [regex
   * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
   * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any
   * of the following characters: _+=,.&#64;-
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-servercertificate.html#cfn-iam-servercertificate-servercertificatename)
   * @param serverCertificateName The name for the server certificate. 
   */
  public fun serverCertificateName(serverCertificateName: String) {
    cdkBuilder.serverCertificateName(serverCertificateName)
  }

  /**
   * A list of tags that are attached to the server certificate.
   *
   * For more information about tagging, see [Tagging IAM
   * resources](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html) in the *IAM User Guide*
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-servercertificate.html#cfn-iam-servercertificate-tags)
   * @param tags A list of tags that are attached to the server certificate. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * A list of tags that are attached to the server certificate.
   *
   * For more information about tagging, see [Tagging IAM
   * resources](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html) in the *IAM User Guide*
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-servercertificate.html#cfn-iam-servercertificate-tags)
   * @param tags A list of tags that are attached to the server certificate. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnServerCertificate {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
