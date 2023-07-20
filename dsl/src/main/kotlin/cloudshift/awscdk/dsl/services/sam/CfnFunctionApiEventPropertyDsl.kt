@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sam.CfnFunction

@CdkDslMarker
public class CfnFunctionApiEventPropertyDsl {
  private val cdkBuilder: CfnFunction.ApiEventProperty.Builder =
      CfnFunction.ApiEventProperty.builder()

  private val _requestParameters: MutableList<Any> = mutableListOf()

  public fun auth(auth: IResolvable) {
    cdkBuilder.auth(auth)
  }

  public fun auth(auth: CfnFunction.AuthProperty) {
    cdkBuilder.auth(auth)
  }

  public fun method(method: String) {
    cdkBuilder.method(method)
  }

  public fun path(path: String) {
    cdkBuilder.path(path)
  }

  public fun requestModel(requestModel: IResolvable) {
    cdkBuilder.requestModel(requestModel)
  }

  public fun requestModel(requestModel: CfnFunction.RequestModelProperty) {
    cdkBuilder.requestModel(requestModel)
  }

  public fun requestParameters(vararg requestParameters: Any) {
    _requestParameters.addAll(listOf(*requestParameters))
  }

  public fun requestParameters(requestParameters: Collection<Any>) {
    _requestParameters.addAll(requestParameters)
  }

  public fun requestParameters(requestParameters: IResolvable) {
    cdkBuilder.requestParameters(requestParameters)
  }

  public fun restApiId(restApiId: String) {
    cdkBuilder.restApiId(restApiId)
  }

  public fun build(): CfnFunction.ApiEventProperty {
    if(_requestParameters.isNotEmpty()) cdkBuilder.requestParameters(_requestParameters)
    return cdkBuilder.build()
  }
}
