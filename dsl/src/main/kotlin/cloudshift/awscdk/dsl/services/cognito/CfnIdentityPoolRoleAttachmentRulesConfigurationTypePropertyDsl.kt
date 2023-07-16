@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachment

@CdkDslMarker
public class CfnIdentityPoolRoleAttachmentRulesConfigurationTypePropertyDsl {
  private val cdkBuilder: CfnIdentityPoolRoleAttachment.RulesConfigurationTypeProperty.Builder =
      CfnIdentityPoolRoleAttachment.RulesConfigurationTypeProperty.builder()

  private val _rules: MutableList<Any> = mutableListOf()

  public fun rules(vararg rules: Any) {
    _rules.addAll(listOf(*rules))
  }

  public fun rules(rules: Collection<Any>) {
    _rules.addAll(rules)
  }

  public fun rules(rules: IResolvable) {
    cdkBuilder.rules(rules)
  }

  public fun build(): CfnIdentityPoolRoleAttachment.RulesConfigurationTypeProperty {
    if(_rules.isNotEmpty()) cdkBuilder.rules(_rules)
    return cdkBuilder.build()
  }
}
