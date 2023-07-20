@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.organizations

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.organizations.CfnAccount
import software.amazon.awscdk.services.organizations.CfnAccountProps
import software.amazon.awscdk.services.organizations.CfnOrganization
import software.amazon.awscdk.services.organizations.CfnOrganizationProps
import software.amazon.awscdk.services.organizations.CfnOrganizationalUnit
import software.amazon.awscdk.services.organizations.CfnOrganizationalUnitProps
import software.amazon.awscdk.services.organizations.CfnPolicy
import software.amazon.awscdk.services.organizations.CfnPolicyProps
import software.amazon.awscdk.services.organizations.CfnResourcePolicy
import software.amazon.awscdk.services.organizations.CfnResourcePolicyProps
import software.constructs.Construct

public object organizations {
  public inline fun cfnAccount(
    scope: Construct,
    id: String,
    block: CfnAccountDsl.() -> Unit = {},
  ): CfnAccount {
    val builder = CfnAccountDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnAccountProps(block: CfnAccountPropsDsl.() -> Unit = {}): CfnAccountProps {
    val builder = CfnAccountPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnOrganization(
    scope: Construct,
    id: String,
    block: CfnOrganizationDsl.() -> Unit = {},
  ): CfnOrganization {
    val builder = CfnOrganizationDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnOrganizationProps(block: CfnOrganizationPropsDsl.() -> Unit = {}):
      CfnOrganizationProps {
    val builder = CfnOrganizationPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnOrganizationalUnit(
    scope: Construct,
    id: String,
    block: CfnOrganizationalUnitDsl.() -> Unit = {},
  ): CfnOrganizationalUnit {
    val builder = CfnOrganizationalUnitDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnOrganizationalUnitProps(block: CfnOrganizationalUnitPropsDsl.() -> Unit =
      {}): CfnOrganizationalUnitProps {
    val builder = CfnOrganizationalUnitPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnPolicy(
    scope: Construct,
    id: String,
    block: CfnPolicyDsl.() -> Unit = {},
  ): CfnPolicy {
    val builder = CfnPolicyDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnPolicyProps(block: CfnPolicyPropsDsl.() -> Unit = {}): CfnPolicyProps {
    val builder = CfnPolicyPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnResourcePolicy(
    scope: Construct,
    id: String,
    block: CfnResourcePolicyDsl.() -> Unit = {},
  ): CfnResourcePolicy {
    val builder = CfnResourcePolicyDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnResourcePolicyProps(block: CfnResourcePolicyPropsDsl.() -> Unit = {}):
      CfnResourcePolicyProps {
    val builder = CfnResourcePolicyPropsDsl()
    builder.apply(block)
    return builder.build()
  }
}
