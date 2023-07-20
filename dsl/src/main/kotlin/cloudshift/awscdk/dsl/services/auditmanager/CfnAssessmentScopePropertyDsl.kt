@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.auditmanager

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.auditmanager.CfnAssessment

@CdkDslMarker
public class CfnAssessmentScopePropertyDsl {
  private val cdkBuilder: CfnAssessment.ScopeProperty.Builder =
      CfnAssessment.ScopeProperty.builder()

  private val _awsAccounts: MutableList<Any> = mutableListOf()

  private val _awsServices: MutableList<Any> = mutableListOf()

  public fun awsAccounts(vararg awsAccounts: Any) {
    _awsAccounts.addAll(listOf(*awsAccounts))
  }

  public fun awsAccounts(awsAccounts: Collection<Any>) {
    _awsAccounts.addAll(awsAccounts)
  }

  public fun awsAccounts(awsAccounts: IResolvable) {
    cdkBuilder.awsAccounts(awsAccounts)
  }

  public fun awsServices(vararg awsServices: Any) {
    _awsServices.addAll(listOf(*awsServices))
  }

  public fun awsServices(awsServices: Collection<Any>) {
    _awsServices.addAll(awsServices)
  }

  public fun awsServices(awsServices: IResolvable) {
    cdkBuilder.awsServices(awsServices)
  }

  public fun build(): CfnAssessment.ScopeProperty {
    if(_awsAccounts.isNotEmpty()) cdkBuilder.awsAccounts(_awsAccounts)
    if(_awsServices.isNotEmpty()) cdkBuilder.awsServices(_awsServices)
    return cdkBuilder.build()
  }
}
