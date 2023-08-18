@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.iam

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.iam.CfnOIDCProvider
import software.constructs.Construct

/**
 * Creates or updates an IAM entity to describe an identity provider (IdP) that supports
 * [OpenID Connect (OIDC)](https://docs.aws.amazon.com/http://openid.net/connect/) .
 *
 * The OIDC provider that you create with this operation can be used as a principal in a role's
 * trust policy. Such a policy establishes a trust relationship between AWS and the OIDC provider.
 *
 * When you create the IAM OIDC provider, you specify the following:
 * * The URL of the OIDC identity provider (IdP) to trust
 * * A list of client IDs (also known as audiences) that identify the application or applications
 *   that are allowed to authenticate using the OIDC provider
 * * A list of tags that are attached to the specified IAM OIDC provider
 * * A list of thumbprints of one or more server certificates that the IdP uses
 *
 * You get all of this information from the OIDC IdP that you want to use to access AWS .
 *
 * When you update the IAM OIDC provider, you specify the following:
 * * The URL of the OIDC identity provider (IdP) to trust
 * * A list of client IDs (also known as audiences) that replaces the existing list of client IDs
 *   associated with the OIDC IdP
 * * A list of tags that replaces the existing list of tags attached to the specified IAM OIDC
 *   provider
 * * A list of thumbprints that replaces the existing list of server certificates thumbprints that
 *   the IdP uses
 *
 * The trust for the OIDC provider is derived from the IAM provider that this operation creates.
 * Therefore, it is best to limit access to the
 * [CreateOpenIDConnectProvider](https://docs.aws.amazon.com/IAM/latest/APIReference/API_CreateOpenIDConnectProvider.html)
 * operation to highly privileged users.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iam.*;
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
@CdkDslMarker
public class CfnOIDCProviderDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnOIDCProvider.Builder = CfnOIDCProvider.Builder.create(scope, id)

    private val _clientIdList: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    private val _thumbprintList: MutableList<String> = mutableListOf()

    /**
     * A list of client IDs (also known as audiences) that are associated with the specified IAM
     * OIDC provider resource object.
     *
     * For more information, see
     * [CreateOpenIDConnectProvider](https://docs.aws.amazon.com/IAM/latest/APIReference/API_CreateOpenIDConnectProvider.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-oidcprovider.html#cfn-iam-oidcprovider-clientidlist)
     *
     * @param clientIdList A list of client IDs (also known as audiences) that are associated with
     *   the specified IAM OIDC provider resource object.
     */
    public fun clientIdList(vararg clientIdList: String) {
        _clientIdList.addAll(listOf(*clientIdList))
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
     *
     * @param clientIdList A list of client IDs (also known as audiences) that are associated with
     *   the specified IAM OIDC provider resource object.
     */
    public fun clientIdList(clientIdList: Collection<String>) {
        _clientIdList.addAll(clientIdList)
    }

    /**
     * A list of tags that are attached to the specified IAM OIDC provider.
     *
     * The returned list of tags is sorted by tag key. For more information about tagging, see
     * [Tagging IAM resources](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html) in the
     * *IAM User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-oidcprovider.html#cfn-iam-oidcprovider-tags)
     *
     * @param tags A list of tags that are attached to the specified IAM OIDC provider.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * A list of tags that are attached to the specified IAM OIDC provider.
     *
     * The returned list of tags is sorted by tag key. For more information about tagging, see
     * [Tagging IAM resources](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html) in the
     * *IAM User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-oidcprovider.html#cfn-iam-oidcprovider-tags)
     *
     * @param tags A list of tags that are attached to the specified IAM OIDC provider.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
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
     *
     * @param thumbprintList A list of certificate thumbprints that are associated with the
     *   specified IAM OIDC provider resource object.
     */
    public fun thumbprintList(vararg thumbprintList: String) {
        _thumbprintList.addAll(listOf(*thumbprintList))
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
     *
     * @param thumbprintList A list of certificate thumbprints that are associated with the
     *   specified IAM OIDC provider resource object.
     */
    public fun thumbprintList(thumbprintList: Collection<String>) {
        _thumbprintList.addAll(thumbprintList)
    }

    /**
     * The URL that the IAM OIDC provider resource object is associated with.
     *
     * For more information, see
     * [CreateOpenIDConnectProvider](https://docs.aws.amazon.com/IAM/latest/APIReference/API_CreateOpenIDConnectProvider.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-oidcprovider.html#cfn-iam-oidcprovider-url)
     *
     * @param url The URL that the IAM OIDC provider resource object is associated with.
     */
    public fun url(url: String) {
        cdkBuilder.url(url)
    }

    public fun build(): CfnOIDCProvider {
        if (_clientIdList.isNotEmpty()) cdkBuilder.clientIdList(_clientIdList)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        if (_thumbprintList.isNotEmpty()) cdkBuilder.thumbprintList(_thumbprintList)
        return cdkBuilder.build()
    }
}
