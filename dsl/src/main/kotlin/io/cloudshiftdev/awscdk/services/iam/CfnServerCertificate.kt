package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnServerCertificate internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.iam.CfnServerCertificate,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * Returns the Amazon Resource Name (ARN) for the specified `AWS::IAM::ServerCertificate`
   * resource.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The contents of the public key certificate.
   */
  public open fun certificateBody(): String? = unwrap(this).getCertificateBody()

  /**
   * The contents of the public key certificate.
   */
  public open fun certificateBody(`value`: String) {
    unwrap(this).setCertificateBody(`value`)
  }

  /**
   * The contents of the public key certificate chain.
   */
  public open fun certificateChain(): String? = unwrap(this).getCertificateChain()

  /**
   * The contents of the public key certificate chain.
   */
  public open fun certificateChain(`value`: String) {
    unwrap(this).setCertificateChain(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The path for the server certificate.
   */
  public open fun path(): String? = unwrap(this).getPath()

  /**
   * The path for the server certificate.
   */
  public open fun path(`value`: String) {
    unwrap(this).setPath(`value`)
  }

  /**
   * The contents of the private key in PEM-encoded format.
   */
  public open fun privateKey(): String? = unwrap(this).getPrivateKey()

  /**
   * The contents of the private key in PEM-encoded format.
   */
  public open fun privateKey(`value`: String) {
    unwrap(this).setPrivateKey(`value`)
  }

  /**
   * The name for the server certificate.
   */
  public open fun serverCertificateName(): String? = unwrap(this).getServerCertificateName()

  /**
   * The name for the server certificate.
   */
  public open fun serverCertificateName(`value`: String) {
    unwrap(this).setServerCertificateName(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * A list of tags that are attached to the server certificate.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * A list of tags that are attached to the server certificate.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * A list of tags that are attached to the server certificate.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.iam.CfnServerCertificate].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The contents of the public key certificate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-servercertificate.html#cfn-iam-servercertificate-certificatebody)
     * @param certificateBody The contents of the public key certificate. 
     */
    public fun certificateBody(certificateBody: String)

    /**
     * The contents of the public key certificate chain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-servercertificate.html#cfn-iam-servercertificate-certificatechain)
     * @param certificateChain The contents of the public key certificate chain. 
     */
    public fun certificateChain(certificateChain: String)

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
     * @param path The path for the server certificate. 
     */
    public fun path(path: String)

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
    public fun privateKey(privateKey: String)

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
     * @param serverCertificateName The name for the server certificate. 
     */
    public fun serverCertificateName(serverCertificateName: String)

    /**
     * A list of tags that are attached to the server certificate.
     *
     * For more information about tagging, see [Tagging IAM
     * resources](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html) in the *IAM User
     * Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-servercertificate.html#cfn-iam-servercertificate-tags)
     * @param tags A list of tags that are attached to the server certificate. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * A list of tags that are attached to the server certificate.
     *
     * For more information about tagging, see [Tagging IAM
     * resources](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html) in the *IAM User
     * Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-servercertificate.html#cfn-iam-servercertificate-tags)
     * @param tags A list of tags that are attached to the server certificate. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iam.CfnServerCertificate.Builder =
        software.amazon.awscdk.services.iam.CfnServerCertificate.Builder.create(scope, id)

    /**
     * The contents of the public key certificate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-servercertificate.html#cfn-iam-servercertificate-certificatebody)
     * @param certificateBody The contents of the public key certificate. 
     */
    override fun certificateBody(certificateBody: String) {
      cdkBuilder.certificateBody(certificateBody)
    }

    /**
     * The contents of the public key certificate chain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-servercertificate.html#cfn-iam-servercertificate-certificatechain)
     * @param certificateChain The contents of the public key certificate chain. 
     */
    override fun certificateChain(certificateChain: String) {
      cdkBuilder.certificateChain(certificateChain)
    }

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
     * @param path The path for the server certificate. 
     */
    override fun path(path: String) {
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
    override fun privateKey(privateKey: String) {
      cdkBuilder.privateKey(privateKey)
    }

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
     * @param serverCertificateName The name for the server certificate. 
     */
    override fun serverCertificateName(serverCertificateName: String) {
      cdkBuilder.serverCertificateName(serverCertificateName)
    }

    /**
     * A list of tags that are attached to the server certificate.
     *
     * For more information about tagging, see [Tagging IAM
     * resources](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html) in the *IAM User
     * Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-servercertificate.html#cfn-iam-servercertificate-tags)
     * @param tags A list of tags that are attached to the server certificate. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * A list of tags that are attached to the server certificate.
     *
     * For more information about tagging, see [Tagging IAM
     * resources](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html) in the *IAM User
     * Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-servercertificate.html#cfn-iam-servercertificate-tags)
     * @param tags A list of tags that are attached to the server certificate. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.iam.CfnServerCertificate =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnServerCertificate {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnServerCertificate(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.CfnServerCertificate):
        CfnServerCertificate = CfnServerCertificate(cdkObject)

    internal fun unwrap(wrapped: CfnServerCertificate):
        software.amazon.awscdk.services.iam.CfnServerCertificate = wrapped.cdkObject
  }
}
