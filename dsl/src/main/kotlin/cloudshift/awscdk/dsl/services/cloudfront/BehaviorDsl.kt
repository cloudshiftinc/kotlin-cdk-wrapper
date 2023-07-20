@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.cloudfront.Behavior
import software.amazon.awscdk.services.cloudfront.CfnDistribution
import software.amazon.awscdk.services.cloudfront.CloudFrontAllowedCachedMethods
import software.amazon.awscdk.services.cloudfront.CloudFrontAllowedMethods
import software.amazon.awscdk.services.cloudfront.FunctionAssociation
import software.amazon.awscdk.services.cloudfront.IKeyGroup
import software.amazon.awscdk.services.cloudfront.LambdaFunctionAssociation
import software.amazon.awscdk.services.cloudfront.ViewerProtocolPolicy

@CdkDslMarker
public class BehaviorDsl {
  private val cdkBuilder: Behavior.Builder = Behavior.builder()

  private val _functionAssociations: MutableList<FunctionAssociation> = mutableListOf()

  private val _lambdaFunctionAssociations: MutableList<LambdaFunctionAssociation> = mutableListOf()

  private val _trustedKeyGroups: MutableList<IKeyGroup> = mutableListOf()

  private val _trustedSigners: MutableList<String> = mutableListOf()

  public fun allowedMethods(allowedMethods: CloudFrontAllowedMethods) {
    cdkBuilder.allowedMethods(allowedMethods)
  }

  public fun cachedMethods(cachedMethods: CloudFrontAllowedCachedMethods) {
    cdkBuilder.cachedMethods(cachedMethods)
  }

  public fun compress(compress: Boolean) {
    cdkBuilder.compress(compress)
  }

  public fun defaultTtl(defaultTtl: Duration) {
    cdkBuilder.defaultTtl(defaultTtl)
  }

  public fun forwardedValues(block: CfnDistributionForwardedValuesPropertyDsl.() -> Unit = {}) {
    val builder = CfnDistributionForwardedValuesPropertyDsl()
    builder.apply(block)
    cdkBuilder.forwardedValues(builder.build())
  }

  public fun forwardedValues(forwardedValues: CfnDistribution.ForwardedValuesProperty) {
    cdkBuilder.forwardedValues(forwardedValues)
  }

  public fun functionAssociations(functionAssociations: FunctionAssociationDsl.() -> Unit) {
    _functionAssociations.add(FunctionAssociationDsl().apply(functionAssociations).build())
  }

  public fun functionAssociations(functionAssociations: Collection<FunctionAssociation>) {
    _functionAssociations.addAll(functionAssociations)
  }

  public fun isDefaultBehavior(isDefaultBehavior: Boolean) {
    cdkBuilder.isDefaultBehavior(isDefaultBehavior)
  }

  public
      fun lambdaFunctionAssociations(lambdaFunctionAssociations: LambdaFunctionAssociationDsl.() -> Unit) {
    _lambdaFunctionAssociations.add(LambdaFunctionAssociationDsl().apply(lambdaFunctionAssociations).build())
  }

  public
      fun lambdaFunctionAssociations(lambdaFunctionAssociations: Collection<LambdaFunctionAssociation>) {
    _lambdaFunctionAssociations.addAll(lambdaFunctionAssociations)
  }

  public fun maxTtl(maxTtl: Duration) {
    cdkBuilder.maxTtl(maxTtl)
  }

  public fun minTtl(minTtl: Duration) {
    cdkBuilder.minTtl(minTtl)
  }

  public fun pathPattern(pathPattern: String) {
    cdkBuilder.pathPattern(pathPattern)
  }

  public fun trustedKeyGroups(vararg trustedKeyGroups: IKeyGroup) {
    _trustedKeyGroups.addAll(listOf(*trustedKeyGroups))
  }

  public fun trustedKeyGroups(trustedKeyGroups: Collection<IKeyGroup>) {
    _trustedKeyGroups.addAll(trustedKeyGroups)
  }

  @Deprecated(message = "deprecated in CDK")
  public fun trustedSigners(vararg trustedSigners: String) {
    _trustedSigners.addAll(listOf(*trustedSigners))
  }

  @Deprecated(message = "deprecated in CDK")
  public fun trustedSigners(trustedSigners: Collection<String>) {
    _trustedSigners.addAll(trustedSigners)
  }

  public fun viewerProtocolPolicy(viewerProtocolPolicy: ViewerProtocolPolicy) {
    cdkBuilder.viewerProtocolPolicy(viewerProtocolPolicy)
  }

  public fun build(): Behavior {
    if(_functionAssociations.isNotEmpty()) cdkBuilder.functionAssociations(_functionAssociations)
    if(_lambdaFunctionAssociations.isNotEmpty())
        cdkBuilder.lambdaFunctionAssociations(_lambdaFunctionAssociations)
    if(_trustedKeyGroups.isNotEmpty()) cdkBuilder.trustedKeyGroups(_trustedKeyGroups)
    if(_trustedSigners.isNotEmpty()) cdkBuilder.trustedSigners(_trustedSigners)
    return cdkBuilder.build()
  }
}
