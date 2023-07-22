@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lightsail

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lightsail.CfnDistribution
import software.constructs.Construct

@CdkDslMarker
public class CfnDistributionDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnDistribution.Builder = CfnDistribution.Builder.create(scope, id)

  private val _cacheBehaviors: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * The ID of the bundle applied to the distribution.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-distribution.html#cfn-lightsail-distribution-bundleid)
   * @param bundleId The ID of the bundle applied to the distribution. 
   */
  public fun bundleId(bundleId: String) {
    cdkBuilder.bundleId(bundleId)
  }

  /**
   * An object that describes the cache behavior settings of the distribution.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-distribution.html#cfn-lightsail-distribution-cachebehaviorsettings)
   * @param cacheBehaviorSettings An object that describes the cache behavior settings of the
   * distribution. 
   */
  public fun cacheBehaviorSettings(cacheBehaviorSettings: IResolvable) {
    cdkBuilder.cacheBehaviorSettings(cacheBehaviorSettings)
  }

  /**
   * An object that describes the cache behavior settings of the distribution.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-distribution.html#cfn-lightsail-distribution-cachebehaviorsettings)
   * @param cacheBehaviorSettings An object that describes the cache behavior settings of the
   * distribution. 
   */
  public fun cacheBehaviorSettings(cacheBehaviorSettings: CfnDistribution.CacheSettingsProperty) {
    cdkBuilder.cacheBehaviorSettings(cacheBehaviorSettings)
  }

  /**
   * An array of objects that describe the per-path cache behavior of the distribution.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-distribution.html#cfn-lightsail-distribution-cachebehaviors)
   * @param cacheBehaviors An array of objects that describe the per-path cache behavior of the
   * distribution. 
   */
  public fun cacheBehaviors(vararg cacheBehaviors: Any) {
    _cacheBehaviors.addAll(listOf(*cacheBehaviors))
  }

  /**
   * An array of objects that describe the per-path cache behavior of the distribution.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-distribution.html#cfn-lightsail-distribution-cachebehaviors)
   * @param cacheBehaviors An array of objects that describe the per-path cache behavior of the
   * distribution. 
   */
  public fun cacheBehaviors(cacheBehaviors: Collection<Any>) {
    _cacheBehaviors.addAll(cacheBehaviors)
  }

  /**
   * An array of objects that describe the per-path cache behavior of the distribution.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-distribution.html#cfn-lightsail-distribution-cachebehaviors)
   * @param cacheBehaviors An array of objects that describe the per-path cache behavior of the
   * distribution. 
   */
  public fun cacheBehaviors(cacheBehaviors: IResolvable) {
    cdkBuilder.cacheBehaviors(cacheBehaviors)
  }

  /**
   * The name of the SSL/TLS certificate attached to the distribution.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-distribution.html#cfn-lightsail-distribution-certificatename)
   * @param certificateName The name of the SSL/TLS certificate attached to the distribution. 
   */
  public fun certificateName(certificateName: String) {
    cdkBuilder.certificateName(certificateName)
  }

  /**
   * An object that describes the default cache behavior of the distribution.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-distribution.html#cfn-lightsail-distribution-defaultcachebehavior)
   * @param defaultCacheBehavior An object that describes the default cache behavior of the
   * distribution. 
   */
  public fun defaultCacheBehavior(defaultCacheBehavior: IResolvable) {
    cdkBuilder.defaultCacheBehavior(defaultCacheBehavior)
  }

  /**
   * An object that describes the default cache behavior of the distribution.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-distribution.html#cfn-lightsail-distribution-defaultcachebehavior)
   * @param defaultCacheBehavior An object that describes the default cache behavior of the
   * distribution. 
   */
  public fun defaultCacheBehavior(defaultCacheBehavior: CfnDistribution.CacheBehaviorProperty) {
    cdkBuilder.defaultCacheBehavior(defaultCacheBehavior)
  }

  /**
   * The name of the distribution.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-distribution.html#cfn-lightsail-distribution-distributionname)
   * @param distributionName The name of the distribution. 
   */
  public fun distributionName(distributionName: String) {
    cdkBuilder.distributionName(distributionName)
  }

  /**
   * The IP address type of the distribution.
   *
   * The possible values are `ipv4` for IPv4 only, and `dualstack` for IPv4 and IPv6.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-distribution.html#cfn-lightsail-distribution-ipaddresstype)
   * @param ipAddressType The IP address type of the distribution. 
   */
  public fun ipAddressType(ipAddressType: String) {
    cdkBuilder.ipAddressType(ipAddressType)
  }

  /**
   * A Boolean value indicating whether the distribution is enabled.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-distribution.html#cfn-lightsail-distribution-isenabled)
   * @param isEnabled A Boolean value indicating whether the distribution is enabled. 
   */
  public fun isEnabled(isEnabled: Boolean) {
    cdkBuilder.isEnabled(isEnabled)
  }

  /**
   * A Boolean value indicating whether the distribution is enabled.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-distribution.html#cfn-lightsail-distribution-isenabled)
   * @param isEnabled A Boolean value indicating whether the distribution is enabled. 
   */
  public fun isEnabled(isEnabled: IResolvable) {
    cdkBuilder.isEnabled(isEnabled)
  }

  /**
   * An object that describes the origin resource of the distribution, such as a Lightsail instance,
   * bucket, or load balancer.
   *
   * The distribution pulls, caches, and serves content from the origin.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-distribution.html#cfn-lightsail-distribution-origin)
   * @param origin An object that describes the origin resource of the distribution, such as a
   * Lightsail instance, bucket, or load balancer. 
   */
  public fun origin(origin: IResolvable) {
    cdkBuilder.origin(origin)
  }

  /**
   * An object that describes the origin resource of the distribution, such as a Lightsail instance,
   * bucket, or load balancer.
   *
   * The distribution pulls, caches, and serves content from the origin.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-distribution.html#cfn-lightsail-distribution-origin)
   * @param origin An object that describes the origin resource of the distribution, such as a
   * Lightsail instance, bucket, or load balancer. 
   */
  public fun origin(origin: CfnDistribution.InputOriginProperty) {
    cdkBuilder.origin(origin)
  }

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * in the *AWS CloudFormation User Guide* .
   *
   *
   * The `Value` of `Tags` is optional for Lightsail resources.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-distribution.html#cfn-lightsail-distribution-tags)
   * @param tags An array of key-value pairs to apply to this resource. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * in the *AWS CloudFormation User Guide* .
   *
   *
   * The `Value` of `Tags` is optional for Lightsail resources.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-distribution.html#cfn-lightsail-distribution-tags)
   * @param tags An array of key-value pairs to apply to this resource. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnDistribution {
    if(_cacheBehaviors.isNotEmpty()) cdkBuilder.cacheBehaviors(_cacheBehaviors)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
