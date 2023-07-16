@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.macie

import cloudshift.awscdk.dsl.RemovalPolicyOptionsDsl
import kotlin.Unit
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.macie.CfnAllowList
import software.amazon.awscdk.services.macie.CfnCustomDataIdentifier
import software.amazon.awscdk.services.macie.CfnFindingsFilter
import software.amazon.awscdk.services.macie.CfnSession

public inline fun CfnAllowList.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnAllowList.setCriteria(block: CfnAllowListCriteriaPropertyDsl.() -> Unit = {}) {
  val builder = CfnAllowListCriteriaPropertyDsl()
  builder.apply(block)
  return setCriteria(builder.build())
}

public inline fun CfnCustomDataIdentifier.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnFindingsFilter.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnFindingsFilter.setFindingCriteria(block: CfnFindingsFilterFindingCriteriaPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnFindingsFilterFindingCriteriaPropertyDsl()
  builder.apply(block)
  return setFindingCriteria(builder.build())
}

public inline fun CfnSession.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}
