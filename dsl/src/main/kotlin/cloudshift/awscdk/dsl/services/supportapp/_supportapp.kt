@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.supportapp

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.supportapp.CfnAccountAlias
import software.amazon.awscdk.services.supportapp.CfnAccountAliasProps
import software.amazon.awscdk.services.supportapp.CfnSlackChannelConfiguration
import software.amazon.awscdk.services.supportapp.CfnSlackChannelConfigurationProps
import software.amazon.awscdk.services.supportapp.CfnSlackWorkspaceConfiguration
import software.amazon.awscdk.services.supportapp.CfnSlackWorkspaceConfigurationProps
import software.constructs.Construct

public object supportapp {
  public inline fun cfnAccountAlias(
    scope: Construct,
    id: String,
    block: CfnAccountAliasDsl.() -> Unit = {},
  ): CfnAccountAlias {
    val builder = CfnAccountAliasDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnAccountAliasProps(block: CfnAccountAliasPropsDsl.() -> Unit = {}):
      CfnAccountAliasProps {
    val builder = CfnAccountAliasPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnSlackChannelConfiguration(
    scope: Construct,
    id: String,
    block: CfnSlackChannelConfigurationDsl.() -> Unit = {},
  ): CfnSlackChannelConfiguration {
    val builder = CfnSlackChannelConfigurationDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnSlackChannelConfigurationProps(block: CfnSlackChannelConfigurationPropsDsl.() -> Unit =
      {}): CfnSlackChannelConfigurationProps {
    val builder = CfnSlackChannelConfigurationPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnSlackWorkspaceConfiguration(
    scope: Construct,
    id: String,
    block: CfnSlackWorkspaceConfigurationDsl.() -> Unit = {},
  ): CfnSlackWorkspaceConfiguration {
    val builder = CfnSlackWorkspaceConfigurationDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnSlackWorkspaceConfigurationProps(block: CfnSlackWorkspaceConfigurationPropsDsl.() -> Unit
      = {}): CfnSlackWorkspaceConfigurationProps {
    val builder = CfnSlackWorkspaceConfigurationPropsDsl()
    builder.apply(block)
    return builder.build()
  }
}
