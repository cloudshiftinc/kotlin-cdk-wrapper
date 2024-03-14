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

public open class CfnOIDCProvider internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.iam.CfnOIDCProvider,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * Returns the Amazon Resource Name (ARN) for the specified `AWS::IAM::OIDCProvider` resource.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * A list of client IDs (also known as audiences) that are associated with the specified IAM OIDC
   * provider resource object.
   */
  public open fun clientIdList(): List<String> = unwrap(this).getClientIdList() ?: emptyList()

  /**
   * A list of client IDs (also known as audiences) that are associated with the specified IAM OIDC
   * provider resource object.
   */
  public open fun clientIdList(`value`: List<String>) {
    unwrap(this).setClientIdList(`value`)
  }

  /**
   * A list of client IDs (also known as audiences) that are associated with the specified IAM OIDC
   * provider resource object.
   */
  public open fun clientIdList(vararg `value`: String): Unit = clientIdList(`value`.toList())

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * A list of tags that are attached to the specified IAM OIDC provider.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * A list of tags that are attached to the specified IAM OIDC provider.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * A list of tags that are attached to the specified IAM OIDC provider.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A list of certificate thumbprints that are associated with the specified IAM OIDC provider
   * resource object.
   */
  public open fun thumbprintList(): List<String> = unwrap(this).getThumbprintList()

  /**
   * A list of certificate thumbprints that are associated with the specified IAM OIDC provider
   * resource object.
   */
  public open fun thumbprintList(`value`: List<String>) {
    unwrap(this).setThumbprintList(`value`)
  }

  /**
   * A list of certificate thumbprints that are associated with the specified IAM OIDC provider
   * resource object.
   */
  public open fun thumbprintList(vararg `value`: String): Unit = thumbprintList(`value`.toList())

  /**
   * The URL that the IAM OIDC provider resource object is associated with.
   */
  public open fun url(): String? = unwrap(this).getUrl()

  /**
   * The URL that the IAM OIDC provider resource object is associated with.
   */
  public open fun url(`value`: String) {
    unwrap(this).setUrl(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.iam.CfnOIDCProvider].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A list of client IDs (also known as audiences) that are associated with the specified IAM
     * OIDC provider resource object.
     *
     * For more information, see
     * [CreateOpenIDConnectProvider](https://docs.aws.amazon.com/IAM/latest/APIReference/API_CreateOpenIDConnectProvider.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-oidcprovider.html#cfn-iam-oidcprovider-clientidlist)
     * @param clientIdList A list of client IDs (also known as audiences) that are associated with
     * the specified IAM OIDC provider resource object. 
     */
    public fun clientIdList(clientIdList: List<String>)

    /**
     * A list of client IDs (also known as audiences) that are associated with the specified IAM
     * OIDC provider resource object.
     *
     * For more information, see
     * [CreateOpenIDConnectProvider](https://docs.aws.amazon.com/IAM/latest/APIReference/API_CreateOpenIDConnectProvider.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-oidcprovider.html#cfn-iam-oidcprovider-clientidlist)
     * @param clientIdList A list of client IDs (also known as audiences) that are associated with
     * the specified IAM OIDC provider resource object. 
     */
    public fun clientIdList(vararg clientIdList: String)

    /**
     * A list of tags that are attached to the specified IAM OIDC provider.
     *
     * The returned list of tags is sorted by tag key. For more information about tagging, see
     * [Tagging IAM resources](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html) in the
     * *IAM User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-oidcprovider.html#cfn-iam-oidcprovider-tags)
     * @param tags A list of tags that are attached to the specified IAM OIDC provider. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * A list of tags that are attached to the specified IAM OIDC provider.
     *
     * The returned list of tags is sorted by tag key. For more information about tagging, see
     * [Tagging IAM resources](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html) in the
     * *IAM User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-oidcprovider.html#cfn-iam-oidcprovider-tags)
     * @param tags A list of tags that are attached to the specified IAM OIDC provider. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * A list of certificate thumbprints that are associated with the specified IAM OIDC provider
     * resource object.
     *
     * For more information, see
     * [CreateOpenIDConnectProvider](https://docs.aws.amazon.com/IAM/latest/APIReference/API_CreateOpenIDConnectProvider.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-oidcprovider.html#cfn-iam-oidcprovider-thumbprintlist)
     * @param thumbprintList A list of certificate thumbprints that are associated with the
     * specified IAM OIDC provider resource object. 
     */
    public fun thumbprintList(thumbprintList: List<String>)

    /**
     * A list of certificate thumbprints that are associated with the specified IAM OIDC provider
     * resource object.
     *
     * For more information, see
     * [CreateOpenIDConnectProvider](https://docs.aws.amazon.com/IAM/latest/APIReference/API_CreateOpenIDConnectProvider.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-oidcprovider.html#cfn-iam-oidcprovider-thumbprintlist)
     * @param thumbprintList A list of certificate thumbprints that are associated with the
     * specified IAM OIDC provider resource object. 
     */
    public fun thumbprintList(vararg thumbprintList: String)

    /**
     * The URL that the IAM OIDC provider resource object is associated with.
     *
     * For more information, see
     * [CreateOpenIDConnectProvider](https://docs.aws.amazon.com/IAM/latest/APIReference/API_CreateOpenIDConnectProvider.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-oidcprovider.html#cfn-iam-oidcprovider-url)
     * @param url The URL that the IAM OIDC provider resource object is associated with. 
     */
    public fun url(url: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iam.CfnOIDCProvider.Builder =
        software.amazon.awscdk.services.iam.CfnOIDCProvider.Builder.create(scope, id)

    /**
     * A list of client IDs (also known as audiences) that are associated with the specified IAM
     * OIDC provider resource object.
     *
     * For more information, see
     * [CreateOpenIDConnectProvider](https://docs.aws.amazon.com/IAM/latest/APIReference/API_CreateOpenIDConnectProvider.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-oidcprovider.html#cfn-iam-oidcprovider-clientidlist)
     * @param clientIdList A list of client IDs (also known as audiences) that are associated with
     * the specified IAM OIDC provider resource object. 
     */
    override fun clientIdList(clientIdList: List<String>) {
      cdkBuilder.clientIdList(clientIdList)
    }

    /**
     * A list of client IDs (also known as audiences) that are associated with the specified IAM
     * OIDC provider resource object.
     *
     * For more information, see
     * [CreateOpenIDConnectProvider](https://docs.aws.amazon.com/IAM/latest/APIReference/API_CreateOpenIDConnectProvider.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-oidcprovider.html#cfn-iam-oidcprovider-clientidlist)
     * @param clientIdList A list of client IDs (also known as audiences) that are associated with
     * the specified IAM OIDC provider resource object. 
     */
    override fun clientIdList(vararg clientIdList: String): Unit =
        clientIdList(clientIdList.toList())

    /**
     * A list of tags that are attached to the specified IAM OIDC provider.
     *
     * The returned list of tags is sorted by tag key. For more information about tagging, see
     * [Tagging IAM resources](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html) in the
     * *IAM User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-oidcprovider.html#cfn-iam-oidcprovider-tags)
     * @param tags A list of tags that are attached to the specified IAM OIDC provider. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * A list of tags that are attached to the specified IAM OIDC provider.
     *
     * The returned list of tags is sorted by tag key. For more information about tagging, see
     * [Tagging IAM resources](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html) in the
     * *IAM User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-oidcprovider.html#cfn-iam-oidcprovider-tags)
     * @param tags A list of tags that are attached to the specified IAM OIDC provider. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * A list of certificate thumbprints that are associated with the specified IAM OIDC provider
     * resource object.
     *
     * For more information, see
     * [CreateOpenIDConnectProvider](https://docs.aws.amazon.com/IAM/latest/APIReference/API_CreateOpenIDConnectProvider.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-oidcprovider.html#cfn-iam-oidcprovider-thumbprintlist)
     * @param thumbprintList A list of certificate thumbprints that are associated with the
     * specified IAM OIDC provider resource object. 
     */
    override fun thumbprintList(thumbprintList: List<String>) {
      cdkBuilder.thumbprintList(thumbprintList)
    }

    /**
     * A list of certificate thumbprints that are associated with the specified IAM OIDC provider
     * resource object.
     *
     * For more information, see
     * [CreateOpenIDConnectProvider](https://docs.aws.amazon.com/IAM/latest/APIReference/API_CreateOpenIDConnectProvider.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-oidcprovider.html#cfn-iam-oidcprovider-thumbprintlist)
     * @param thumbprintList A list of certificate thumbprints that are associated with the
     * specified IAM OIDC provider resource object. 
     */
    override fun thumbprintList(vararg thumbprintList: String): Unit =
        thumbprintList(thumbprintList.toList())

    /**
     * The URL that the IAM OIDC provider resource object is associated with.
     *
     * For more information, see
     * [CreateOpenIDConnectProvider](https://docs.aws.amazon.com/IAM/latest/APIReference/API_CreateOpenIDConnectProvider.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-oidcprovider.html#cfn-iam-oidcprovider-url)
     * @param url The URL that the IAM OIDC provider resource object is associated with. 
     */
    override fun url(url: String) {
      cdkBuilder.url(url)
    }

    public fun build(): software.amazon.awscdk.services.iam.CfnOIDCProvider = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.iam.CfnOIDCProvider.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnOIDCProvider {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnOIDCProvider(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.CfnOIDCProvider):
        CfnOIDCProvider = CfnOIDCProvider(cdkObject)

    internal fun unwrap(wrapped: CfnOIDCProvider):
        software.amazon.awscdk.services.iam.CfnOIDCProvider = wrapped.cdkObject
  }
}
