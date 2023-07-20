@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.rolesanywhere

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.rolesanywhere.CfnProfileProps

@CdkDslMarker
public class CfnProfilePropsDsl {
  private val cdkBuilder: CfnProfileProps.Builder = CfnProfileProps.builder()

  private val _managedPolicyArns: MutableList<String> = mutableListOf()

  private val _roleArns: MutableList<String> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun durationSeconds(durationSeconds: Number) {
    cdkBuilder.durationSeconds(durationSeconds)
  }

  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  public fun enabled(enabled: IResolvable) {
    cdkBuilder.enabled(enabled)
  }

  public fun managedPolicyArns(vararg managedPolicyArns: String) {
    _managedPolicyArns.addAll(listOf(*managedPolicyArns))
  }

  public fun managedPolicyArns(managedPolicyArns: Collection<String>) {
    _managedPolicyArns.addAll(managedPolicyArns)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun requireInstanceProperties(requireInstanceProperties: Boolean) {
    cdkBuilder.requireInstanceProperties(requireInstanceProperties)
  }

  public fun requireInstanceProperties(requireInstanceProperties: IResolvable) {
    cdkBuilder.requireInstanceProperties(requireInstanceProperties)
  }

  public fun roleArns(vararg roleArns: String) {
    _roleArns.addAll(listOf(*roleArns))
  }

  public fun roleArns(roleArns: Collection<String>) {
    _roleArns.addAll(roleArns)
  }

  public fun sessionPolicy(sessionPolicy: String) {
    cdkBuilder.sessionPolicy(sessionPolicy)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnProfileProps {
    if(_managedPolicyArns.isNotEmpty()) cdkBuilder.managedPolicyArns(_managedPolicyArns)
    if(_roleArns.isNotEmpty()) cdkBuilder.roleArns(_roleArns)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
