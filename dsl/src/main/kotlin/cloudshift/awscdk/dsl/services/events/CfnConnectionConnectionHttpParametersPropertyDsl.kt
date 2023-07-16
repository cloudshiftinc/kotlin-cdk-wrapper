@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.events

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.events.CfnConnection

@CdkDslMarker
public class CfnConnectionConnectionHttpParametersPropertyDsl {
  private val cdkBuilder: CfnConnection.ConnectionHttpParametersProperty.Builder =
      CfnConnection.ConnectionHttpParametersProperty.builder()

  private val _bodyParameters: MutableList<Any> = mutableListOf()

  private val _headerParameters: MutableList<Any> = mutableListOf()

  private val _queryStringParameters: MutableList<Any> = mutableListOf()

  public fun bodyParameters(vararg bodyParameters: Any) {
    _bodyParameters.addAll(listOf(*bodyParameters))
  }

  public fun bodyParameters(bodyParameters: Collection<Any>) {
    _bodyParameters.addAll(bodyParameters)
  }

  public fun bodyParameters(bodyParameters: IResolvable) {
    cdkBuilder.bodyParameters(bodyParameters)
  }

  public fun headerParameters(vararg headerParameters: Any) {
    _headerParameters.addAll(listOf(*headerParameters))
  }

  public fun headerParameters(headerParameters: Collection<Any>) {
    _headerParameters.addAll(headerParameters)
  }

  public fun headerParameters(headerParameters: IResolvable) {
    cdkBuilder.headerParameters(headerParameters)
  }

  public fun queryStringParameters(vararg queryStringParameters: Any) {
    _queryStringParameters.addAll(listOf(*queryStringParameters))
  }

  public fun queryStringParameters(queryStringParameters: Collection<Any>) {
    _queryStringParameters.addAll(queryStringParameters)
  }

  public fun queryStringParameters(queryStringParameters: IResolvable) {
    cdkBuilder.queryStringParameters(queryStringParameters)
  }

  public fun build(): CfnConnection.ConnectionHttpParametersProperty {
    if(_bodyParameters.isNotEmpty()) cdkBuilder.bodyParameters(_bodyParameters)
    if(_headerParameters.isNotEmpty()) cdkBuilder.headerParameters(_headerParameters)
    if(_queryStringParameters.isNotEmpty()) cdkBuilder.queryStringParameters(_queryStringParameters)
    return cdkBuilder.build()
  }
}
