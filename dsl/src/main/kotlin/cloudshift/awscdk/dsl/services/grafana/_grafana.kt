@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.grafana

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.grafana.CfnWorkspace
import software.amazon.awscdk.services.grafana.CfnWorkspaceProps
import software.constructs.Construct

public object grafana {
  public inline fun cfnWorkspace(
    scope: Construct,
    id: String,
    block: CfnWorkspaceDsl.() -> Unit = {},
  ): CfnWorkspace {
    val builder = CfnWorkspaceDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnWorkspaceAssertionAttributesProperty(block: CfnWorkspaceAssertionAttributesPropertyDsl.() -> Unit
      = {}): CfnWorkspace.AssertionAttributesProperty {
    val builder = CfnWorkspaceAssertionAttributesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnWorkspaceIdpMetadataProperty(block: CfnWorkspaceIdpMetadataPropertyDsl.() -> Unit =
      {}): CfnWorkspace.IdpMetadataProperty {
    val builder = CfnWorkspaceIdpMetadataPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnWorkspaceNetworkAccessControlProperty(block: CfnWorkspaceNetworkAccessControlPropertyDsl.() -> Unit
      = {}): CfnWorkspace.NetworkAccessControlProperty {
    val builder = CfnWorkspaceNetworkAccessControlPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnWorkspaceProps(block: CfnWorkspacePropsDsl.() -> Unit = {}):
      CfnWorkspaceProps {
    val builder = CfnWorkspacePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnWorkspaceRoleValuesProperty(block: CfnWorkspaceRoleValuesPropertyDsl.() -> Unit = {}):
      CfnWorkspace.RoleValuesProperty {
    val builder = CfnWorkspaceRoleValuesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnWorkspaceSamlConfigurationProperty(block: CfnWorkspaceSamlConfigurationPropertyDsl.() -> Unit
      = {}): CfnWorkspace.SamlConfigurationProperty {
    val builder = CfnWorkspaceSamlConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnWorkspaceVpcConfigurationProperty(block: CfnWorkspaceVpcConfigurationPropertyDsl.() -> Unit
      = {}): CfnWorkspace.VpcConfigurationProperty {
    val builder = CfnWorkspaceVpcConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }
}
