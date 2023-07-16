@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.wafv2

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
import software.amazon.awscdk.services.wafv2.CfnWebACL
import software.amazon.awscdk.services.wafv2.CfnWebACLProps

@CdkDslMarker
public class CfnWebACLPropsDsl {
  private val cdkBuilder: CfnWebACLProps.Builder = CfnWebACLProps.builder()

  private val _rules: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  private val _tokenDomains: MutableList<String> = mutableListOf()

  public fun associationConfig(associationConfig: IResolvable) {
    cdkBuilder.associationConfig(associationConfig)
  }

  public fun associationConfig(associationConfig: CfnWebACL.AssociationConfigProperty) {
    cdkBuilder.associationConfig(associationConfig)
  }

  public fun captchaConfig(captchaConfig: IResolvable) {
    cdkBuilder.captchaConfig(captchaConfig)
  }

  public fun captchaConfig(captchaConfig: CfnWebACL.CaptchaConfigProperty) {
    cdkBuilder.captchaConfig(captchaConfig)
  }

  public fun challengeConfig(challengeConfig: IResolvable) {
    cdkBuilder.challengeConfig(challengeConfig)
  }

  public fun challengeConfig(challengeConfig: CfnWebACL.ChallengeConfigProperty) {
    cdkBuilder.challengeConfig(challengeConfig)
  }

  public fun customResponseBodies(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.customResponseBodies(builder.map)
  }

  public fun customResponseBodies(customResponseBodies: Map<String, *>) {
    cdkBuilder.customResponseBodies(customResponseBodies)
  }

  public fun customResponseBodies(customResponseBodies: IResolvable) {
    cdkBuilder.customResponseBodies(customResponseBodies)
  }

  public fun defaultAction(defaultAction: IResolvable) {
    cdkBuilder.defaultAction(defaultAction)
  }

  public fun defaultAction(defaultAction: CfnWebACL.DefaultActionProperty) {
    cdkBuilder.defaultAction(defaultAction)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun rules(vararg rules: Any) {
    _rules.addAll(listOf(*rules))
  }

  public fun rules(rules: Collection<Any>) {
    _rules.addAll(rules)
  }

  public fun rules(rules: IResolvable) {
    cdkBuilder.rules(rules)
  }

  public fun scope(scope: String) {
    cdkBuilder.scope(scope)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun tokenDomains(vararg tokenDomains: String) {
    _tokenDomains.addAll(listOf(*tokenDomains))
  }

  public fun tokenDomains(tokenDomains: Collection<String>) {
    _tokenDomains.addAll(tokenDomains)
  }

  public fun visibilityConfig(visibilityConfig: IResolvable) {
    cdkBuilder.visibilityConfig(visibilityConfig)
  }

  public fun visibilityConfig(visibilityConfig: CfnWebACL.VisibilityConfigProperty) {
    cdkBuilder.visibilityConfig(visibilityConfig)
  }

  public fun build(): CfnWebACLProps {
    if(_rules.isNotEmpty()) cdkBuilder.rules(_rules)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    if(_tokenDomains.isNotEmpty()) cdkBuilder.tokenDomains(_tokenDomains)
    return cdkBuilder.build()
  }
}
