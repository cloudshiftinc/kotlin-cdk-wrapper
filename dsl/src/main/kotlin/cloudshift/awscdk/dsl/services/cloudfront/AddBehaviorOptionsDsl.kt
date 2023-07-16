@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.cloudfront.AddBehaviorOptions
import software.amazon.awscdk.services.cloudfront.AllowedMethods
import software.amazon.awscdk.services.cloudfront.CachedMethods
import software.amazon.awscdk.services.cloudfront.EdgeLambda
import software.amazon.awscdk.services.cloudfront.FunctionAssociation
import software.amazon.awscdk.services.cloudfront.ICachePolicy
import software.amazon.awscdk.services.cloudfront.IKeyGroup
import software.amazon.awscdk.services.cloudfront.IOriginRequestPolicy
import software.amazon.awscdk.services.cloudfront.IResponseHeadersPolicy
import software.amazon.awscdk.services.cloudfront.ViewerProtocolPolicy

@CdkDslMarker
public class AddBehaviorOptionsDsl {
  private val cdkBuilder: AddBehaviorOptions.Builder = AddBehaviorOptions.builder()

  private val _edgeLambdas: MutableList<EdgeLambda> = mutableListOf()

  private val _functionAssociations: MutableList<FunctionAssociation> = mutableListOf()

  private val _trustedKeyGroups: MutableList<IKeyGroup> = mutableListOf()

  public fun allowedMethods(allowedMethods: AllowedMethods) {
    cdkBuilder.allowedMethods(allowedMethods)
  }

  public fun cachePolicy(cachePolicy: ICachePolicy) {
    cdkBuilder.cachePolicy(cachePolicy)
  }

  public fun cachedMethods(cachedMethods: CachedMethods) {
    cdkBuilder.cachedMethods(cachedMethods)
  }

  public fun compress(compress: Boolean) {
    cdkBuilder.compress(compress)
  }

  public fun edgeLambdas(edgeLambdas: EdgeLambdaDsl.() -> Unit) {
    _edgeLambdas.add(EdgeLambdaDsl().apply(edgeLambdas).build())
  }

  public fun edgeLambdas(edgeLambdas: Collection<EdgeLambda>) {
    _edgeLambdas.addAll(edgeLambdas)
  }

  public fun functionAssociations(functionAssociations: FunctionAssociationDsl.() -> Unit) {
    _functionAssociations.add(FunctionAssociationDsl().apply(functionAssociations).build())
  }

  public fun functionAssociations(functionAssociations: Collection<FunctionAssociation>) {
    _functionAssociations.addAll(functionAssociations)
  }

  public fun originRequestPolicy(originRequestPolicy: IOriginRequestPolicy) {
    cdkBuilder.originRequestPolicy(originRequestPolicy)
  }

  public fun responseHeadersPolicy(responseHeadersPolicy: IResponseHeadersPolicy) {
    cdkBuilder.responseHeadersPolicy(responseHeadersPolicy)
  }

  public fun smoothStreaming(smoothStreaming: Boolean) {
    cdkBuilder.smoothStreaming(smoothStreaming)
  }

  public fun trustedKeyGroups(vararg trustedKeyGroups: IKeyGroup) {
    _trustedKeyGroups.addAll(listOf(*trustedKeyGroups))
  }

  public fun trustedKeyGroups(trustedKeyGroups: Collection<IKeyGroup>) {
    _trustedKeyGroups.addAll(trustedKeyGroups)
  }

  public fun viewerProtocolPolicy(viewerProtocolPolicy: ViewerProtocolPolicy) {
    cdkBuilder.viewerProtocolPolicy(viewerProtocolPolicy)
  }

  public fun build(): AddBehaviorOptions {
    if(_edgeLambdas.isNotEmpty()) cdkBuilder.edgeLambdas(_edgeLambdas)
    if(_functionAssociations.isNotEmpty()) cdkBuilder.functionAssociations(_functionAssociations)
    if(_trustedKeyGroups.isNotEmpty()) cdkBuilder.trustedKeyGroups(_trustedKeyGroups)
    return cdkBuilder.build()
  }
}
