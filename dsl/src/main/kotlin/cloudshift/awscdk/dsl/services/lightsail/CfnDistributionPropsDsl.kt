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
import software.amazon.awscdk.services.lightsail.CfnDistributionProps

@CdkDslMarker
public class CfnDistributionPropsDsl {
  private val cdkBuilder: CfnDistributionProps.Builder = CfnDistributionProps.builder()

  private val _cacheBehaviors: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun bundleId(bundleId: String) {
    cdkBuilder.bundleId(bundleId)
  }

  public fun cacheBehaviorSettings(cacheBehaviorSettings: IResolvable) {
    cdkBuilder.cacheBehaviorSettings(cacheBehaviorSettings)
  }

  public fun cacheBehaviorSettings(cacheBehaviorSettings: CfnDistribution.CacheSettingsProperty) {
    cdkBuilder.cacheBehaviorSettings(cacheBehaviorSettings)
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

  public fun certificateName(certificateName: String) {
    cdkBuilder.certificateName(certificateName)
  }

  public fun defaultCacheBehavior(defaultCacheBehavior: IResolvable) {
    cdkBuilder.defaultCacheBehavior(defaultCacheBehavior)
  }

  public fun defaultCacheBehavior(defaultCacheBehavior: CfnDistribution.CacheBehaviorProperty) {
    cdkBuilder.defaultCacheBehavior(defaultCacheBehavior)
  }

  public fun distributionName(distributionName: String) {
    cdkBuilder.distributionName(distributionName)
  }

  public fun ipAddressType(ipAddressType: String) {
    cdkBuilder.ipAddressType(ipAddressType)
  }

  public fun isEnabled(isEnabled: Boolean) {
    cdkBuilder.isEnabled(isEnabled)
  }

  public fun isEnabled(isEnabled: IResolvable) {
    cdkBuilder.isEnabled(isEnabled)
  }

  public fun origin(origin: IResolvable) {
    cdkBuilder.origin(origin)
  }

  public fun origin(origin: CfnDistribution.InputOriginProperty) {
    cdkBuilder.origin(origin)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnDistributionProps {
    if(_cacheBehaviors.isNotEmpty()) cdkBuilder.cacheBehaviors(_cacheBehaviors)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
