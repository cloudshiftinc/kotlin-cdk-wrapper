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
 * Properties for defining a `CfnOIDCProvider`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iam.*;
 * CfnOIDCProviderProps cfnOIDCProviderProps = CfnOIDCProviderProps.builder()
 * .clientIdList(List.of("clientIdList"))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .thumbprintList(List.of("thumbprintList"))
 * .url("url")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-oidcprovider.html)
 */
public interface CfnOIDCProviderProps {
  /**
   * A list of client IDs (also known as audiences) that are associated with the specified IAM OIDC
   * provider resource object.
   *
   * For more information, see
   * [CreateOpenIDConnectProvider](https://docs.aws.amazon.com/IAM/latest/APIReference/API_CreateOpenIDConnectProvider.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-oidcprovider.html#cfn-iam-oidcprovider-clientidlist)
   */
  public fun clientIdList(): List<String> = unwrap(this).getClientIdList() ?: emptyList()

  /**
   * A list of tags that are attached to the specified IAM OIDC provider.
   *
   * The returned list of tags is sorted by tag key. For more information about tagging, see
   * [Tagging IAM resources](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html) in the *IAM
   * User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-oidcprovider.html#cfn-iam-oidcprovider-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A list of certificate thumbprints that are associated with the specified IAM OIDC provider
   * resource object.
   *
   * For more information, see
   * [CreateOpenIDConnectProvider](https://docs.aws.amazon.com/IAM/latest/APIReference/API_CreateOpenIDConnectProvider.html)
   * .
   *
   * This property is optional. If it is not included, IAM will retrieve and use the top
   * intermediate certificate authority (CA) thumbprint of the OpenID Connect identity provider server
   * certificate.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-oidcprovider.html#cfn-iam-oidcprovider-thumbprintlist)
   */
  public fun thumbprintList(): List<String> = unwrap(this).getThumbprintList() ?: emptyList()

  /**
   * The URL that the IAM OIDC provider resource object is associated with.
   *
   * For more information, see
   * [CreateOpenIDConnectProvider](https://docs.aws.amazon.com/IAM/latest/APIReference/API_CreateOpenIDConnectProvider.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-oidcprovider.html#cfn-iam-oidcprovider-url)
   */
  public fun url(): String? = unwrap(this).getUrl()

  /**
   * A builder for [CfnOIDCProviderProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param clientIdList A list of client IDs (also known as audiences) that are associated with
     * the specified IAM OIDC provider resource object.
     * For more information, see
     * [CreateOpenIDConnectProvider](https://docs.aws.amazon.com/IAM/latest/APIReference/API_CreateOpenIDConnectProvider.html)
     * .
     */
    public fun clientIdList(clientIdList: List<String>)

    /**
     * @param clientIdList A list of client IDs (also known as audiences) that are associated with
     * the specified IAM OIDC provider resource object.
     * For more information, see
     * [CreateOpenIDConnectProvider](https://docs.aws.amazon.com/IAM/latest/APIReference/API_CreateOpenIDConnectProvider.html)
     * .
     */
    public fun clientIdList(vararg clientIdList: String)

    /**
     * @param tags A list of tags that are attached to the specified IAM OIDC provider.
     * The returned list of tags is sorted by tag key. For more information about tagging, see
     * [Tagging IAM resources](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html) in the
     * *IAM User Guide* .
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags A list of tags that are attached to the specified IAM OIDC provider.
     * The returned list of tags is sorted by tag key. For more information about tagging, see
     * [Tagging IAM resources](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html) in the
     * *IAM User Guide* .
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param thumbprintList A list of certificate thumbprints that are associated with the
     * specified IAM OIDC provider resource object.
     * For more information, see
     * [CreateOpenIDConnectProvider](https://docs.aws.amazon.com/IAM/latest/APIReference/API_CreateOpenIDConnectProvider.html)
     * .
     *
     * This property is optional. If it is not included, IAM will retrieve and use the top
     * intermediate certificate authority (CA) thumbprint of the OpenID Connect identity provider
     * server certificate.
     */
    public fun thumbprintList(thumbprintList: List<String>)

    /**
     * @param thumbprintList A list of certificate thumbprints that are associated with the
     * specified IAM OIDC provider resource object.
     * For more information, see
     * [CreateOpenIDConnectProvider](https://docs.aws.amazon.com/IAM/latest/APIReference/API_CreateOpenIDConnectProvider.html)
     * .
     *
     * This property is optional. If it is not included, IAM will retrieve and use the top
     * intermediate certificate authority (CA) thumbprint of the OpenID Connect identity provider
     * server certificate.
     */
    public fun thumbprintList(vararg thumbprintList: String)

    /**
     * @param url The URL that the IAM OIDC provider resource object is associated with.
     * For more information, see
     * [CreateOpenIDConnectProvider](https://docs.aws.amazon.com/IAM/latest/APIReference/API_CreateOpenIDConnectProvider.html)
     * .
     */
    public fun url(url: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iam.CfnOIDCProviderProps.Builder =
        software.amazon.awscdk.services.iam.CfnOIDCProviderProps.builder()

    /**
     * @param clientIdList A list of client IDs (also known as audiences) that are associated with
     * the specified IAM OIDC provider resource object.
     * For more information, see
     * [CreateOpenIDConnectProvider](https://docs.aws.amazon.com/IAM/latest/APIReference/API_CreateOpenIDConnectProvider.html)
     * .
     */
    override fun clientIdList(clientIdList: List<String>) {
      cdkBuilder.clientIdList(clientIdList)
    }

    /**
     * @param clientIdList A list of client IDs (also known as audiences) that are associated with
     * the specified IAM OIDC provider resource object.
     * For more information, see
     * [CreateOpenIDConnectProvider](https://docs.aws.amazon.com/IAM/latest/APIReference/API_CreateOpenIDConnectProvider.html)
     * .
     */
    override fun clientIdList(vararg clientIdList: String): Unit =
        clientIdList(clientIdList.toList())

    /**
     * @param tags A list of tags that are attached to the specified IAM OIDC provider.
     * The returned list of tags is sorted by tag key. For more information about tagging, see
     * [Tagging IAM resources](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html) in the
     * *IAM User Guide* .
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags A list of tags that are attached to the specified IAM OIDC provider.
     * The returned list of tags is sorted by tag key. For more information about tagging, see
     * [Tagging IAM resources](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html) in the
     * *IAM User Guide* .
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param thumbprintList A list of certificate thumbprints that are associated with the
     * specified IAM OIDC provider resource object.
     * For more information, see
     * [CreateOpenIDConnectProvider](https://docs.aws.amazon.com/IAM/latest/APIReference/API_CreateOpenIDConnectProvider.html)
     * .
     *
     * This property is optional. If it is not included, IAM will retrieve and use the top
     * intermediate certificate authority (CA) thumbprint of the OpenID Connect identity provider
     * server certificate.
     */
    override fun thumbprintList(thumbprintList: List<String>) {
      cdkBuilder.thumbprintList(thumbprintList)
    }

    /**
     * @param thumbprintList A list of certificate thumbprints that are associated with the
     * specified IAM OIDC provider resource object.
     * For more information, see
     * [CreateOpenIDConnectProvider](https://docs.aws.amazon.com/IAM/latest/APIReference/API_CreateOpenIDConnectProvider.html)
     * .
     *
     * This property is optional. If it is not included, IAM will retrieve and use the top
     * intermediate certificate authority (CA) thumbprint of the OpenID Connect identity provider
     * server certificate.
     */
    override fun thumbprintList(vararg thumbprintList: String): Unit =
        thumbprintList(thumbprintList.toList())

    /**
     * @param url The URL that the IAM OIDC provider resource object is associated with.
     * For more information, see
     * [CreateOpenIDConnectProvider](https://docs.aws.amazon.com/IAM/latest/APIReference/API_CreateOpenIDConnectProvider.html)
     * .
     */
    override fun url(url: String) {
      cdkBuilder.url(url)
    }

    public fun build(): software.amazon.awscdk.services.iam.CfnOIDCProviderProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.iam.CfnOIDCProviderProps,
  ) : CdkObject(cdkObject),
      CfnOIDCProviderProps {
    /**
     * A list of client IDs (also known as audiences) that are associated with the specified IAM
     * OIDC provider resource object.
     *
     * For more information, see
     * [CreateOpenIDConnectProvider](https://docs.aws.amazon.com/IAM/latest/APIReference/API_CreateOpenIDConnectProvider.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-oidcprovider.html#cfn-iam-oidcprovider-clientidlist)
     */
    override fun clientIdList(): List<String> = unwrap(this).getClientIdList() ?: emptyList()

    /**
     * A list of tags that are attached to the specified IAM OIDC provider.
     *
     * The returned list of tags is sorted by tag key. For more information about tagging, see
     * [Tagging IAM resources](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html) in the
     * *IAM User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-oidcprovider.html#cfn-iam-oidcprovider-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * A list of certificate thumbprints that are associated with the specified IAM OIDC provider
     * resource object.
     *
     * For more information, see
     * [CreateOpenIDConnectProvider](https://docs.aws.amazon.com/IAM/latest/APIReference/API_CreateOpenIDConnectProvider.html)
     * .
     *
     * This property is optional. If it is not included, IAM will retrieve and use the top
     * intermediate certificate authority (CA) thumbprint of the OpenID Connect identity provider
     * server certificate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-oidcprovider.html#cfn-iam-oidcprovider-thumbprintlist)
     */
    override fun thumbprintList(): List<String> = unwrap(this).getThumbprintList() ?: emptyList()

    /**
     * The URL that the IAM OIDC provider resource object is associated with.
     *
     * For more information, see
     * [CreateOpenIDConnectProvider](https://docs.aws.amazon.com/IAM/latest/APIReference/API_CreateOpenIDConnectProvider.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-oidcprovider.html#cfn-iam-oidcprovider-url)
     */
    override fun url(): String? = unwrap(this).getUrl()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnOIDCProviderProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.CfnOIDCProviderProps):
        CfnOIDCProviderProps = CdkObjectWrappers.wrap(cdkObject) as? CfnOIDCProviderProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnOIDCProviderProps):
        software.amazon.awscdk.services.iam.CfnOIDCProviderProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.iam.CfnOIDCProviderProps
  }
}
