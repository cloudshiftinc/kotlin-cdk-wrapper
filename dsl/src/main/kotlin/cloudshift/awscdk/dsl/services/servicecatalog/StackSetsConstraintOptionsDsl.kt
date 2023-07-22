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

  /**
   * @param accounts List of accounts to deploy stacks to. 
   */
  public fun accounts(vararg accounts: String) {
    _accounts.addAll(listOf(*accounts))
  }

  /**
   * @param accounts List of accounts to deploy stacks to. 
   */
  public fun accounts(accounts: Collection<String>) {
    _accounts.addAll(accounts)
  }

  /**
   * @param adminRole IAM role used to administer the StackSets configuration. 
   */
  public fun adminRole(adminRole: IRole) {
    cdkBuilder.adminRole(adminRole)
  }

  /**
   * @param allowStackSetInstanceOperations Wether to allow end users to create, update, and delete
   * stacks.
   */
  public fun allowStackSetInstanceOperations(allowStackSetInstanceOperations: Boolean) {
    cdkBuilder.allowStackSetInstanceOperations(allowStackSetInstanceOperations)
  }

  /**
   * @param description The description of the constraint.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param executionRoleName IAM role used to provision the products in the Stacks. 
   */
  public fun executionRoleName(executionRoleName: String) {
    cdkBuilder.executionRoleName(executionRoleName)
  }

  /**
   * @param messageLanguage The language code.
   * Configures the language for error messages from service catalog.
   */
  public fun messageLanguage(messageLanguage: MessageLanguage) {
    cdkBuilder.messageLanguage(messageLanguage)
  }

  /**
   * @param regions List of regions to deploy stacks to. 
   */
  public fun regions(vararg regions: String) {
    _regions.addAll(listOf(*regions))
  }

  /**
   * @param regions List of regions to deploy stacks to. 
   */
  public fun regions(regions: Collection<String>) {
    _regions.addAll(regions)
  }

  public fun build(): StackSetsConstraintOptions {
    if(_accounts.isNotEmpty()) cdkBuilder.accounts(_accounts)
    if(_regions.isNotEmpty()) cdkBuilder.regions(_regions)
    return cdkBuilder.build()
  }
}
