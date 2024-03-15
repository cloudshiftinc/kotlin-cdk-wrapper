@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

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

/**
 * Creates or updates an IAM entity to describe an identity provider (IdP) that supports [OpenID
 * Connect (OIDC)](https://docs.aws.amazon.com/http://openid.net/connect/) .
 *
 * The OIDC provider that you create with this operation can be used as a principal in a role's
 * trust policy. Such a policy establishes a trust relationship between AWS and the OIDC provider.
 *
 * When you create the IAM OIDC provider, you specify the following:
 *
 * * The URL of the OIDC identity provider (IdP) to trust
 * * A list of client IDs (also known as audiences) that identify the application or applications
 * that are allowed to authenticate using the OIDC provider
 * * A list of tags that are attached to the specified IAM OIDC provider
 * * A list of thumbprints of one or more server certificates that the IdP uses
 *
 * You get all of this information from the OIDC IdP that you want to use to access AWS .
 *
 * When you update the IAM OIDC provider, you specify the following:
 *
 * * The URL of the OIDC identity provider (IdP) to trust
 * * A list of client IDs (also known as audiences) that replaces the existing list of client IDs
 * associated with the OIDC IdP
 * * A list of tags that replaces the existing list of tags attached to the specified IAM OIDC
 * provider
 * * A list of thumbprints that replaces the existing list of server certificates thumbprints that
 * the IdP uses
 *
 *
 * The trust for the OIDC provider is derived from the IAM provider that this operation creates.
 * Therefore, it is best to limit access to the
 * [CreateOpenIDConnectProvider](https://docs.aws.amazon.com/IAM/latest/APIReference/API_CreateOpenIDConnectProvider.html)
 * operation to highly privileged users.
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iam.*;
 * CfnOIDCProvider cfnOIDCProvider = CfnOIDCProvider.Builder.create(this, "MyCfnOIDCProvider")
 * .thumbprintList(List.of("thumbprintList"))
 * // the properties below are optional
 * .clientIdList(List.of("clientIdList"))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .url("url")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-oidcprovider.html)
 */
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
