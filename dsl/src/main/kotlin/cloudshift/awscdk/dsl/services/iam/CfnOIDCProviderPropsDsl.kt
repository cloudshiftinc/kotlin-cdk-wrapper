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

  public fun clientIdList(vararg clientIdList: String) {
    _clientIdList.addAll(listOf(*clientIdList))
  }

  public fun clientIdList(clientIdList: Collection<String>) {
    _clientIdList.addAll(clientIdList)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun thumbprintList(vararg thumbprintList: String) {
    _thumbprintList.addAll(listOf(*thumbprintList))
  }

  public fun thumbprintList(thumbprintList: Collection<String>) {
    _thumbprintList.addAll(thumbprintList)
  }

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
