@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.opensearchserverless

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.opensearchserverless.CfnAccessPolicy
import software.amazon.awscdk.services.opensearchserverless.CfnAccessPolicyProps
import software.amazon.awscdk.services.opensearchserverless.CfnCollection
import software.amazon.awscdk.services.opensearchserverless.CfnCollectionProps
import software.amazon.awscdk.services.opensearchserverless.CfnSecurityConfig
import software.amazon.awscdk.services.opensearchserverless.CfnSecurityConfigProps
import software.amazon.awscdk.services.opensearchserverless.CfnSecurityPolicy
import software.amazon.awscdk.services.opensearchserverless.CfnSecurityPolicyProps
import software.amazon.awscdk.services.opensearchserverless.CfnVpcEndpoint
import software.amazon.awscdk.services.opensearchserverless.CfnVpcEndpointProps
import software.constructs.Construct

public object opensearchserverless {
  public inline fun cfnAccessPolicy(
    scope: Construct,
    id: String,
    block: CfnAccessPolicyDsl.() -> Unit = {},
  ): CfnAccessPolicy {
    val builder = CfnAccessPolicyDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnAccessPolicyProps(block: CfnAccessPolicyPropsDsl.() -> Unit = {}):
      CfnAccessPolicyProps {
    val builder = CfnAccessPolicyPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnCollection(
    scope: Construct,
    id: String,
    block: CfnCollectionDsl.() -> Unit = {},
  ): CfnCollection {
    val builder = CfnCollectionDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnCollectionProps(block: CfnCollectionPropsDsl.() -> Unit = {}):
      CfnCollectionProps {
    val builder = CfnCollectionPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnSecurityConfig(
    scope: Construct,
    id: String,
    block: CfnSecurityConfigDsl.() -> Unit = {},
  ): CfnSecurityConfig {
    val builder = CfnSecurityConfigDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnSecurityConfigProps(block: CfnSecurityConfigPropsDsl.() -> Unit = {}):
      CfnSecurityConfigProps {
    val builder = CfnSecurityConfigPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnSecurityConfigSamlConfigOptionsProperty(block: CfnSecurityConfigSamlConfigOptionsPropertyDsl.() -> Unit
      = {}): CfnSecurityConfig.SamlConfigOptionsProperty {
    val builder = CfnSecurityConfigSamlConfigOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnSecurityPolicy(
    scope: Construct,
    id: String,
    block: CfnSecurityPolicyDsl.() -> Unit = {},
  ): CfnSecurityPolicy {
    val builder = CfnSecurityPolicyDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnSecurityPolicyProps(block: CfnSecurityPolicyPropsDsl.() -> Unit = {}):
      CfnSecurityPolicyProps {
    val builder = CfnSecurityPolicyPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnVpcEndpoint(
    scope: Construct,
    id: String,
    block: CfnVpcEndpointDsl.() -> Unit = {},
  ): CfnVpcEndpoint {
    val builder = CfnVpcEndpointDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnVpcEndpointProps(block: CfnVpcEndpointPropsDsl.() -> Unit = {}):
      CfnVpcEndpointProps {
    val builder = CfnVpcEndpointPropsDsl()
    builder.apply(block)
    return builder.build()
  }
}
