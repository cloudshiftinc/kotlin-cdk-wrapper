@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iot.CfnSecurityProfileProps

@CdkDslMarker
public class CfnSecurityProfilePropsDsl {
  private val cdkBuilder: CfnSecurityProfileProps.Builder = CfnSecurityProfileProps.builder()

  private val _additionalMetricsToRetainV2: MutableList<Any> = mutableListOf()

  private val _behaviors: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  private val _targetArns: MutableList<String> = mutableListOf()

  public fun additionalMetricsToRetainV2(vararg additionalMetricsToRetainV2: Any) {
    _additionalMetricsToRetainV2.addAll(listOf(*additionalMetricsToRetainV2))
  }

  public fun additionalMetricsToRetainV2(additionalMetricsToRetainV2: Collection<Any>) {
    _additionalMetricsToRetainV2.addAll(additionalMetricsToRetainV2)
  }

  public fun additionalMetricsToRetainV2(additionalMetricsToRetainV2: IResolvable) {
    cdkBuilder.additionalMetricsToRetainV2(additionalMetricsToRetainV2)
  }

  public fun alertTargets(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.alertTargets(builder.map)
  }

  public fun alertTargets(alertTargets: Map<String, *>) {
    cdkBuilder.alertTargets(alertTargets)
  }

  public fun alertTargets(alertTargets: IResolvable) {
    cdkBuilder.alertTargets(alertTargets)
  }

  public fun behaviors(vararg behaviors: Any) {
    _behaviors.addAll(listOf(*behaviors))
  }

  public fun behaviors(behaviors: Collection<Any>) {
    _behaviors.addAll(behaviors)
  }

  public fun behaviors(behaviors: IResolvable) {
    cdkBuilder.behaviors(behaviors)
  }

  public fun securityProfileDescription(securityProfileDescription: String) {
    cdkBuilder.securityProfileDescription(securityProfileDescription)
  }

  public fun securityProfileName(securityProfileName: String) {
    cdkBuilder.securityProfileName(securityProfileName)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun targetArns(vararg targetArns: String) {
    _targetArns.addAll(listOf(*targetArns))
  }

  public fun targetArns(targetArns: Collection<String>) {
    _targetArns.addAll(targetArns)
  }

  public fun build(): CfnSecurityProfileProps {
    if(_additionalMetricsToRetainV2.isNotEmpty())
        cdkBuilder.additionalMetricsToRetainV2(_additionalMetricsToRetainV2)
    if(_behaviors.isNotEmpty()) cdkBuilder.behaviors(_behaviors)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    if(_targetArns.isNotEmpty()) cdkBuilder.targetArns(_targetArns)
    return cdkBuilder.build()
  }
}
