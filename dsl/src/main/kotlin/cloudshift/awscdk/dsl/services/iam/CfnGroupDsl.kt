@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iam.CfnGroup
import software.constructs.Construct

@CdkDslMarker
public class CfnGroupDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnGroup.Builder = CfnGroup.Builder.create(scope, id)

  private val _managedPolicyArns: MutableList<String> = mutableListOf()

  private val _policies: MutableList<Any> = mutableListOf()

  public fun groupName(groupName: String) {
    cdkBuilder.groupName(groupName)
  }

  public fun managedPolicyArns(vararg managedPolicyArns: String) {
    _managedPolicyArns.addAll(listOf(*managedPolicyArns))
  }

  public fun managedPolicyArns(managedPolicyArns: Collection<String>) {
    _managedPolicyArns.addAll(managedPolicyArns)
  }

  public fun path(path: String) {
    cdkBuilder.path(path)
  }

  public fun policies(vararg policies: Any) {
    _policies.addAll(listOf(*policies))
  }

  public fun policies(policies: Collection<Any>) {
    _policies.addAll(policies)
  }

  public fun policies(policies: IResolvable) {
    cdkBuilder.policies(policies)
  }

  public fun build(): CfnGroup {
    if(_managedPolicyArns.isNotEmpty()) cdkBuilder.managedPolicyArns(_managedPolicyArns)
    if(_policies.isNotEmpty()) cdkBuilder.policies(_policies)
    return cdkBuilder.build()
  }
}
