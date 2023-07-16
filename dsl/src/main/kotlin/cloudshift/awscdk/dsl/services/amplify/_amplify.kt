@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.amplify

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.amplify.CfnApp
import software.amazon.awscdk.services.amplify.CfnAppProps
import software.amazon.awscdk.services.amplify.CfnBranch
import software.amazon.awscdk.services.amplify.CfnBranchProps
import software.amazon.awscdk.services.amplify.CfnDomain
import software.amazon.awscdk.services.amplify.CfnDomainProps
import software.constructs.Construct

public object amplify {
  public inline fun cfnApp(
    scope: Construct,
    id: String,
    block: CfnAppDsl.() -> Unit = {},
  ): CfnApp {
    val builder = CfnAppDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAppAutoBranchCreationConfigProperty(block: CfnAppAutoBranchCreationConfigPropertyDsl.() -> Unit
      = {}): CfnApp.AutoBranchCreationConfigProperty {
    val builder = CfnAppAutoBranchCreationConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnAppBasicAuthConfigProperty(block: CfnAppBasicAuthConfigPropertyDsl.() -> Unit
      = {}): CfnApp.BasicAuthConfigProperty {
    val builder = CfnAppBasicAuthConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnAppCustomRuleProperty(block: CfnAppCustomRulePropertyDsl.() -> Unit = {}):
      CfnApp.CustomRuleProperty {
    val builder = CfnAppCustomRulePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAppEnvironmentVariableProperty(block: CfnAppEnvironmentVariablePropertyDsl.() -> Unit =
      {}): CfnApp.EnvironmentVariableProperty {
    val builder = CfnAppEnvironmentVariablePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnAppProps(block: CfnAppPropsDsl.() -> Unit = {}): CfnAppProps {
    val builder = CfnAppPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnBranch(
    scope: Construct,
    id: String,
    block: CfnBranchDsl.() -> Unit = {},
  ): CfnBranch {
    val builder = CfnBranchDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnBranchBasicAuthConfigProperty(block: CfnBranchBasicAuthConfigPropertyDsl.() -> Unit =
      {}): CfnBranch.BasicAuthConfigProperty {
    val builder = CfnBranchBasicAuthConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnBranchEnvironmentVariableProperty(block: CfnBranchEnvironmentVariablePropertyDsl.() -> Unit
      = {}): CfnBranch.EnvironmentVariableProperty {
    val builder = CfnBranchEnvironmentVariablePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnBranchProps(block: CfnBranchPropsDsl.() -> Unit = {}): CfnBranchProps {
    val builder = CfnBranchPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnDomain(
    scope: Construct,
    id: String,
    block: CfnDomainDsl.() -> Unit = {},
  ): CfnDomain {
    val builder = CfnDomainDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnDomainProps(block: CfnDomainPropsDsl.() -> Unit = {}): CfnDomainProps {
    val builder = CfnDomainPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDomainSubDomainSettingProperty(block: CfnDomainSubDomainSettingPropertyDsl.() -> Unit =
      {}): CfnDomain.SubDomainSettingProperty {
    val builder = CfnDomainSubDomainSettingPropertyDsl()
    builder.apply(block)
    return builder.build()
  }
}
