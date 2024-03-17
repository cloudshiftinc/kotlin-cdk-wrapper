@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnServerCertificate`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iam.*;
 * CfnServerCertificateProps cfnServerCertificateProps = CfnServerCertificateProps.builder()
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
public interface CfnServerCertificateProps {
  /**
   * The contents of the public key certificate.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-servercertificate.html#cfn-iam-servercertificate-certificatebody)
   */
  public fun certificateBody(): String? = unwrap(this).getCertificateBody()

  /**
   * The contents of the public key certificate chain.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-servercertificate.html#cfn-iam-servercertificate-certificatechain)
   */
  public fun certificateChain(): String? = unwrap(this).getCertificateChain()

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
   */
  public fun path(): String? = unwrap(this).getPath()

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
   */
  public fun privateKey(): String? = unwrap(this).getPrivateKey()

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
   */
  public fun serverCertificateName(): String? = unwrap(this).getServerCertificateName()

  /**
   * A list of tags that are attached to the server certificate.
   *
   * For more information about tagging, see [Tagging IAM
   * resources](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html) in the *IAM User Guide*
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-servercertificate.html#cfn-iam-servercertificate-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnServerCertificateProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param certificateBody The contents of the public key certificate.
     */
    public fun certificateBody(certificateBody: String)

    /**
     * @param certificateChain The contents of the public key certificate chain.
     */
    public fun certificateChain(certificateChain: String)

    /**
     * @param path The path for the server certificate.
     * For more information about paths, see [IAM
     * identifiers](https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html) in the
     * *IAM User Guide* .
     *
     * This parameter is optional. If it is not included, it defaults to a slash (/). This parameter
     * allows (through its [regex pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex)
     * ) a string of characters consisting of either a forward slash (/) by itself or a string that
     * must begin and end with forward slashes. In addition, it can contain any ASCII character from
     * the ! ( `\u0021` ) through the DEL character ( `\u007F` ), including most punctuation
     * characters, digits, and upper and lowercased letters.
     *
     *
     * If you are uploading a server certificate specifically for use with Amazon CloudFront
     * distributions, you must specify a path using the `path` parameter. The path must begin with
     * `/cloudfront` and must include a trailing slash (for example, `/cloudfront/test/` ).
     */
    public fun path(path: String)

    /**
     * @param privateKey The contents of the private key in PEM-encoded format.
     * The [regex pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) used to
     * validate this parameter is a string of characters consisting of the following:
     *
     * * Any printable ASCII character ranging from the space character ( `\u0020` ) through the end
     * of the ASCII character range
     * * The printable characters in the Basic Latin and Latin-1 Supplement character set (through
     * `\u00FF` )
     * * The special characters tab ( `\u0009` ), line feed ( `\u000A` ), and carriage return (
     * `\u000D` )
     */
    public fun privateKey(privateKey: String)

    /**
     * @param serverCertificateName The name for the server certificate.
     * Do not include the path in this value. The name of the certificate cannot contain any spaces.
     *
     * This parameter allows (through its [regex
     * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
     * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include
     * any of the following characters: _+=,.&#64;-
     */
    public fun serverCertificateName(serverCertificateName: String)

    /**
     * @param tags A list of tags that are attached to the server certificate.
     * For more information about tagging, see [Tagging IAM
     * resources](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html) in the *IAM User
     * Guide* .
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags A list of tags that are attached to the server certificate.
     * For more information about tagging, see [Tagging IAM
     * resources](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html) in the *IAM User
     * Guide* .
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iam.CfnServerCertificateProps.Builder =
        software.amazon.awscdk.services.iam.CfnServerCertificateProps.builder()

    /**
     * @param certificateBody The contents of the public key certificate.
     */
    override fun certificateBody(certificateBody: String) {
      cdkBuilder.certificateBody(certificateBody)
    }

    /**
     * @param certificateChain The contents of the public key certificate chain.
     */
    override fun certificateChain(certificateChain: String) {
      cdkBuilder.certificateChain(certificateChain)
    }

    /**
     * @param path The path for the server certificate.
     * For more information about paths, see [IAM
     * identifiers](https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html) in the
     * *IAM User Guide* .
     *
     * This parameter is optional. If it is not included, it defaults to a slash (/). This parameter
     * allows (through its [regex pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex)
     * ) a string of characters consisting of either a forward slash (/) by itself or a string that
     * must begin and end with forward slashes. In addition, it can contain any ASCII character from
     * the ! ( `\u0021` ) through the DEL character ( `\u007F` ), including most punctuation
     * characters, digits, and upper and lowercased letters.
     *
     *
     * If you are uploading a server certificate specifically for use with Amazon CloudFront
     * distributions, you must specify a path using the `path` parameter. The path must begin with
     * `/cloudfront` and must include a trailing slash (for example, `/cloudfront/test/` ).
     */
    override fun path(path: String) {
      cdkBuilder.path(path)
    }

    /**
     * @param privateKey The contents of the private key in PEM-encoded format.
     * The [regex pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) used to
     * validate this parameter is a string of characters consisting of the following:
     *
     * * Any printable ASCII character ranging from the space character ( `\u0020` ) through the end
     * of the ASCII character range
     * * The printable characters in the Basic Latin and Latin-1 Supplement character set (through
     * `\u00FF` )
     * * The special characters tab ( `\u0009` ), line feed ( `\u000A` ), and carriage return (
     * `\u000D` )
     */
    override fun privateKey(privateKey: String) {
      cdkBuilder.privateKey(privateKey)
    }

    /**
     * @param serverCertificateName The name for the server certificate.
     * Do not include the path in this value. The name of the certificate cannot contain any spaces.
     *
     * This parameter allows (through its [regex
     * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
     * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include
     * any of the following characters: _+=,.&#64;-
     */
    override fun serverCertificateName(serverCertificateName: String) {
      cdkBuilder.serverCertificateName(serverCertificateName)
    }

    /**
     * @param tags A list of tags that are attached to the server certificate.
     * For more information about tagging, see [Tagging IAM
     * resources](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html) in the *IAM User
     * Guide* .
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags A list of tags that are attached to the server certificate.
     * For more information about tagging, see [Tagging IAM
     * resources](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html) in the *IAM User
     * Guide* .
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.iam.CfnServerCertificateProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iam.CfnServerCertificateProps,
  ) : CdkObject(cdkObject), CfnServerCertificateProps {
    /**
     * The contents of the public key certificate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-servercertificate.html#cfn-iam-servercertificate-certificatebody)
     */
    override fun certificateBody(): String? = unwrap(this).getCertificateBody()

    /**
     * The contents of the public key certificate chain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-servercertificate.html#cfn-iam-servercertificate-certificatechain)
     */
    override fun certificateChain(): String? = unwrap(this).getCertificateChain()

    /**
     * The path for the server certificate.
     *
     * For more information about paths, see [IAM
     * identifiers](https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html) in the
     * *IAM User Guide* .
     *
     * This parameter is optional. If it is not included, it defaults to a slash (/). This parameter
     * allows (through its [regex pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex)
     * ) a string of characters consisting of either a forward slash (/) by itself or a string that
     * must begin and end with forward slashes. In addition, it can contain any ASCII character from
     * the ! ( `\u0021` ) through the DEL character ( `\u007F` ), including most punctuation
     * characters, digits, and upper and lowercased letters.
     *
     *
     * If you are uploading a server certificate specifically for use with Amazon CloudFront
     * distributions, you must specify a path using the `path` parameter. The path must begin with
     * `/cloudfront` and must include a trailing slash (for example, `/cloudfront/test/` ).
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-servercertificate.html#cfn-iam-servercertificate-path)
     */
    override fun path(): String? = unwrap(this).getPath()

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
     */
    override fun privateKey(): String? = unwrap(this).getPrivateKey()

    /**
     * The name for the server certificate.
     *
     * Do not include the path in this value. The name of the certificate cannot contain any spaces.
     *
     * This parameter allows (through its [regex
     * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
     * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include
     * any of the following characters: _+=,.&#64;-
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-servercertificate.html#cfn-iam-servercertificate-servercertificatename)
     */
    override fun serverCertificateName(): String? = unwrap(this).getServerCertificateName()

    /**
     * A list of tags that are attached to the server certificate.
     *
     * For more information about tagging, see [Tagging IAM
     * resources](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html) in the *IAM User
     * Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-servercertificate.html#cfn-iam-servercertificate-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnServerCertificateProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.CfnServerCertificateProps):
        CfnServerCertificateProps = CdkObjectWrappers.wrap(cdkObject) as? CfnServerCertificateProps
        ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnServerCertificateProps):
        software.amazon.awscdk.services.iam.CfnServerCertificateProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.iam.CfnServerCertificateProps
  }
}
