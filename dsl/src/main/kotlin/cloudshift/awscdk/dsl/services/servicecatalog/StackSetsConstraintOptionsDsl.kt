@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.servicecatalog

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.servicecatalog.MessageLanguage
import software.amazon.awscdk.services.servicecatalog.StackSetsConstraintOptions

@CdkDslMarker
public class StackSetsConstraintOptionsDsl {
  private val cdkBuilder: StackSetsConstraintOptions.Builder = StackSetsConstraintOptions.builder()

  private val _accounts: MutableList<String> = mutableListOf()

  private val _regions: MutableList<String> = mutableListOf()

  public fun accounts(vararg accounts: String) {
    _accounts.addAll(listOf(*accounts))
  }

  public fun accounts(accounts: Collection<String>) {
    _accounts.addAll(accounts)
  }

  public fun adminRole(adminRole: IRole) {
    cdkBuilder.adminRole(adminRole)
  }

  public fun allowStackSetInstanceOperations(allowStackSetInstanceOperations: Boolean) {
    cdkBuilder.allowStackSetInstanceOperations(allowStackSetInstanceOperations)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun executionRoleName(executionRoleName: String) {
    cdkBuilder.executionRoleName(executionRoleName)
  }

  public fun messageLanguage(messageLanguage: MessageLanguage) {
    cdkBuilder.messageLanguage(messageLanguage)
  }

  public fun regions(vararg regions: String) {
    _regions.addAll(listOf(*regions))
  }

  public fun regions(regions: Collection<String>) {
    _regions.addAll(regions)
  }

  public fun build(): StackSetsConstraintOptions {
    if(_accounts.isNotEmpty()) cdkBuilder.accounts(_accounts)
    if(_regions.isNotEmpty()) cdkBuilder.regions(_regions)
    return cdkBuilder.build()
  }
}
