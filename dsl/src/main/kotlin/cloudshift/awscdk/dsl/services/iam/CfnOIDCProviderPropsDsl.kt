@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iam

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.iam.CfnOIDCProviderProps

@CdkDslMarker
public class CfnOIDCProviderPropsDsl {
  private val cdkBuilder: CfnOIDCProviderProps.Builder = CfnOIDCProviderProps.builder()

  private val _clientIdList: MutableList<String> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  private val _thumbprintList: MutableList<String> = mutableListOf()

  /**
   * @param clientIdList A list of client IDs (also known as audiences) that are associated with the
   * specified IAM OIDC provider resource object.
   * For more information, see
   * [CreateOpenIDConnectProvider](https://docs.aws.amazon.com/IAM/latest/APIReference/API_CreateOpenIDConnectProvider.html)
   * .
   */
  public fun clientIdList(vararg clientIdList: String) {
    _clientIdList.addAll(listOf(*clientIdList))
  }

  /**
   * @param clientIdList A list of client IDs (also known as audiences) that are associated with the
   * specified IAM OIDC provider resource object.
   * For more information, see
   * [CreateOpenIDConnectProvider](https://docs.aws.amazon.com/IAM/latest/APIReference/API_CreateOpenIDConnectProvider.html)
   * .
   */
  public fun clientIdList(clientIdList: Collection<String>) {
    _clientIdList.addAll(clientIdList)
  }

  /**
   * @param tags A list of tags that are attached to the specified IAM OIDC provider.
   * The returned list of tags is sorted by tag key. For more information about tagging, see
   * [Tagging IAM resources](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html) in the *IAM
   * User Guide* .
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags A list of tags that are attached to the specified IAM OIDC provider.
   * The returned list of tags is sorted by tag key. For more information about tagging, see
   * [Tagging IAM resources](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html) in the *IAM
   * User Guide* .
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * @param thumbprintList A list of certificate thumbprints that are associated with the specified
   * IAM OIDC provider resource object. 
   * For more information, see
   * [CreateOpenIDConnectProvider](https://docs.aws.amazon.com/IAM/latest/APIReference/API_CreateOpenIDConnectProvider.html)
   * .
   */
  public fun thumbprintList(vararg thumbprintList: String) {
    _thumbprintList.addAll(listOf(*thumbprintList))
  }

  /**
   * @param thumbprintList A list of certificate thumbprints that are associated with the specified
   * IAM OIDC provider resource object. 
   * For more information, see
   * [CreateOpenIDConnectProvider](https://docs.aws.amazon.com/IAM/latest/APIReference/API_CreateOpenIDConnectProvider.html)
   * .
   */
  public fun thumbprintList(thumbprintList: Collection<String>) {
    _thumbprintList.addAll(thumbprintList)
  }

  /**
   * @param url The URL that the IAM OIDC provider resource object is associated with.
   * For more information, see
   * [CreateOpenIDConnectProvider](https://docs.aws.amazon.com/IAM/latest/APIReference/API_CreateOpenIDConnectProvider.html)
   * .
   */
  public fun url(url: String) {
    cdkBuilder.url(url)
  }

  public fun build(): CfnOIDCProviderProps {
    if(_clientIdList.isNotEmpty()) cdkBuilder.clientIdList(_clientIdList)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    if(_thumbprintList.isNotEmpty()) cdkBuilder.thumbprintList(_thumbprintList)
    return cdkBuilder.build()
  }
}
