@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudfront.CfnDistribution

@CdkDslMarker
public class CfnDistributionDistributionConfigPropertyDsl {
  private val cdkBuilder: CfnDistribution.DistributionConfigProperty.Builder =
      CfnDistribution.DistributionConfigProperty.builder()

  private val _aliases: MutableList<String> = mutableListOf()

  private val _cacheBehaviors: MutableList<Any> = mutableListOf()

  private val _cnamEs: MutableList<String> = mutableListOf()

  private val _customErrorResponses: MutableList<Any> = mutableListOf()

  private val _origins: MutableList<Any> = mutableListOf()

  public fun aliases(vararg aliases: String) {
    _aliases.addAll(listOf(*aliases))
  }

  public fun aliases(aliases: Collection<String>) {
    _aliases.addAll(aliases)
  }

  public fun cacheBehaviors(vararg cacheBehaviors: Any) {
    _cacheBehaviors.addAll(listOf(*cacheBehaviors))
  }

  public fun cacheBehaviors(cacheBehaviors: Collection<Any>) {
    _cacheBehaviors.addAll(cacheBehaviors)
  }

  public fun cacheBehaviors(cacheBehaviors: IResolvable) {
    cdkBuilder.cacheBehaviors(cacheBehaviors)
  }

  public fun cnamEs(vararg cnamEs: String) {
    _cnamEs.addAll(listOf(*cnamEs))
  }

  public fun cnamEs(cnamEs: Collection<String>) {
    _cnamEs.addAll(cnamEs)
  }

  public fun comment(comment: String) {
    cdkBuilder.comment(comment)
  }

  public fun continuousDeploymentPolicyId(continuousDeploymentPolicyId: String) {
    cdkBuilder.continuousDeploymentPolicyId(continuousDeploymentPolicyId)
  }

  public fun customErrorResponses(vararg customErrorResponses: Any) {
    _customErrorResponses.addAll(listOf(*customErrorResponses))
  }

  public fun customErrorResponses(customErrorResponses: Collection<Any>) {
    _customErrorResponses.addAll(customErrorResponses)
  }

  public fun customErrorResponses(customErrorResponses: IResolvable) {
    cdkBuilder.customErrorResponses(customErrorResponses)
  }

  public fun customOrigin(customOrigin: IResolvable) {
    cdkBuilder.customOrigin(customOrigin)
  }

  public fun customOrigin(customOrigin: CfnDistribution.LegacyCustomOriginProperty) {
    cdkBuilder.customOrigin(customOrigin)
  }

  public fun defaultCacheBehavior(defaultCacheBehavior: IResolvable) {
    cdkBuilder.defaultCacheBehavior(defaultCacheBehavior)
  }

  public
      fun defaultCacheBehavior(defaultCacheBehavior: CfnDistribution.DefaultCacheBehaviorProperty) {
    cdkBuilder.defaultCacheBehavior(defaultCacheBehavior)
  }

  public fun defaultRootObject(defaultRootObject: String) {
    cdkBuilder.defaultRootObject(defaultRootObject)
  }

  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  public fun enabled(enabled: IResolvable) {
    cdkBuilder.enabled(enabled)
  }

  public fun httpVersion(httpVersion: String) {
    cdkBuilder.httpVersion(httpVersion)
  }

  public fun ipv6Enabled(ipv6Enabled: Boolean) {
    cdkBuilder.ipv6Enabled(ipv6Enabled)
  }

  public fun ipv6Enabled(ipv6Enabled: IResolvable) {
    cdkBuilder.ipv6Enabled(ipv6Enabled)
  }

  public fun logging(logging: IResolvable) {
    cdkBuilder.logging(logging)
  }

  public fun logging(logging: CfnDistribution.LoggingProperty) {
    cdkBuilder.logging(logging)
  }

  public fun originGroups(originGroups: IResolvable) {
    cdkBuilder.originGroups(originGroups)
  }

  public fun originGroups(originGroups: CfnDistribution.OriginGroupsProperty) {
    cdkBuilder.originGroups(originGroups)
  }

  public fun origins(vararg origins: Any) {
    _origins.addAll(listOf(*origins))
  }

  public fun origins(origins: Collection<Any>) {
    _origins.addAll(origins)
  }

  public fun origins(origins: IResolvable) {
    cdkBuilder.origins(origins)
  }

  public fun priceClass(priceClass: String) {
    cdkBuilder.priceClass(priceClass)
  }

  public fun restrictions(restrictions: IResolvable) {
    cdkBuilder.restrictions(restrictions)
  }

  public fun restrictions(restrictions: CfnDistribution.RestrictionsProperty) {
    cdkBuilder.restrictions(restrictions)
  }

  public fun s3Origin(s3Origin: IResolvable) {
    cdkBuilder.s3Origin(s3Origin)
  }

  public fun s3Origin(s3Origin: CfnDistribution.LegacyS3OriginProperty) {
    cdkBuilder.s3Origin(s3Origin)
  }

  public fun staging(staging: Boolean) {
    cdkBuilder.staging(staging)
  }

  public fun staging(staging: IResolvable) {
    cdkBuilder.staging(staging)
  }

  public fun viewerCertificate(viewerCertificate: IResolvable) {
    cdkBuilder.viewerCertificate(viewerCertificate)
  }

  public fun viewerCertificate(viewerCertificate: CfnDistribution.ViewerCertificateProperty) {
    cdkBuilder.viewerCertificate(viewerCertificate)
  }

  public fun webAclId(webAclId: String) {
    cdkBuilder.webAclId(webAclId)
  }

  public fun build(): CfnDistribution.DistributionConfigProperty {
    if(_aliases.isNotEmpty()) cdkBuilder.aliases(_aliases)
    if(_cacheBehaviors.isNotEmpty()) cdkBuilder.cacheBehaviors(_cacheBehaviors)
    if(_cnamEs.isNotEmpty()) cdkBuilder.cnamEs(_cnamEs)
    if(_customErrorResponses.isNotEmpty()) cdkBuilder.customErrorResponses(_customErrorResponses)
    if(_origins.isNotEmpty()) cdkBuilder.origins(_origins)
    return cdkBuilder.build()
  }
}
