@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.iam.OpenIdConnectProvider
import software.constructs.Construct

@CdkDslMarker
public class OpenIdConnectProviderDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: OpenIdConnectProvider.Builder =
      OpenIdConnectProvider.Builder.create(scope, id)

  private val _clientIds: MutableList<String> = mutableListOf()

  private val _thumbprints: MutableList<String> = mutableListOf()

  public fun clientIds(vararg clientIds: String) {
    _clientIds.addAll(listOf(*clientIds))
  }

  public fun clientIds(clientIds: Collection<String>) {
    _clientIds.addAll(clientIds)
  }

  public fun thumbprints(vararg thumbprints: String) {
    _thumbprints.addAll(listOf(*thumbprints))
  }

  public fun thumbprints(thumbprints: Collection<String>) {
    _thumbprints.addAll(thumbprints)
  }

  public fun url(url: String) {
    cdkBuilder.url(url)
  }

  public fun build(): OpenIdConnectProvider {
    if(_clientIds.isNotEmpty()) cdkBuilder.clientIds(_clientIds)
    if(_thumbprints.isNotEmpty()) cdkBuilder.thumbprints(_thumbprints)
    return cdkBuilder.build()
  }
}
