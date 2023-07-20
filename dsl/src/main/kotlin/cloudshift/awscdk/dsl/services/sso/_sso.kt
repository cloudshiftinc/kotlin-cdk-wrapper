@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sso

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sso.CfnAssignment
import software.amazon.awscdk.services.sso.CfnAssignmentProps
import software.amazon.awscdk.services.sso.CfnInstanceAccessControlAttributeConfiguration
import software.amazon.awscdk.services.sso.CfnInstanceAccessControlAttributeConfigurationProps
import software.amazon.awscdk.services.sso.CfnPermissionSet
import software.amazon.awscdk.services.sso.CfnPermissionSetProps
import software.constructs.Construct

public object sso {
  public inline fun cfnAssignment(
    scope: Construct,
    id: String,
    block: CfnAssignmentDsl.() -> Unit = {},
  ): CfnAssignment {
    val builder = CfnAssignmentDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnAssignmentProps(block: CfnAssignmentPropsDsl.() -> Unit = {}):
      CfnAssignmentProps {
    val builder = CfnAssignmentPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnInstanceAccessControlAttributeConfiguration(
    scope: Construct,
    id: String,
    block: CfnInstanceAccessControlAttributeConfigurationDsl.() -> Unit = {},
  ): CfnInstanceAccessControlAttributeConfiguration {
    val builder = CfnInstanceAccessControlAttributeConfigurationDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnInstanceAccessControlAttributeConfigurationAccessControlAttributeProperty(block: CfnInstanceAccessControlAttributeConfigurationAccessControlAttributePropertyDsl.() -> Unit
      = {}): CfnInstanceAccessControlAttributeConfiguration.AccessControlAttributeProperty {
    val builder = CfnInstanceAccessControlAttributeConfigurationAccessControlAttributePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnInstanceAccessControlAttributeConfigurationAccessControlAttributeValueProperty(block: CfnInstanceAccessControlAttributeConfigurationAccessControlAttributeValuePropertyDsl.() -> Unit
      = {}): CfnInstanceAccessControlAttributeConfiguration.AccessControlAttributeValueProperty {
    val builder =
        CfnInstanceAccessControlAttributeConfigurationAccessControlAttributeValuePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnInstanceAccessControlAttributeConfigurationInstanceAccessControlAttributeConfigurationProperty(block: CfnInstanceAccessControlAttributeConfigurationInstanceAccessControlAttributeConfigurationPropertyDsl.() -> Unit
      = {}):
      CfnInstanceAccessControlAttributeConfiguration.InstanceAccessControlAttributeConfigurationProperty {
    val builder =
        CfnInstanceAccessControlAttributeConfigurationInstanceAccessControlAttributeConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnInstanceAccessControlAttributeConfigurationProps(block: CfnInstanceAccessControlAttributeConfigurationPropsDsl.() -> Unit
      = {}): CfnInstanceAccessControlAttributeConfigurationProps {
    val builder = CfnInstanceAccessControlAttributeConfigurationPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnPermissionSet(
    scope: Construct,
    id: String,
    block: CfnPermissionSetDsl.() -> Unit = {},
  ): CfnPermissionSet {
    val builder = CfnPermissionSetDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnPermissionSetCustomerManagedPolicyReferenceProperty(block: CfnPermissionSetCustomerManagedPolicyReferencePropertyDsl.() -> Unit
      = {}): CfnPermissionSet.CustomerManagedPolicyReferenceProperty {
    val builder = CfnPermissionSetCustomerManagedPolicyReferencePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnPermissionSetPermissionsBoundaryProperty(block: CfnPermissionSetPermissionsBoundaryPropertyDsl.() -> Unit
      = {}): CfnPermissionSet.PermissionsBoundaryProperty {
    val builder = CfnPermissionSetPermissionsBoundaryPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnPermissionSetProps(block: CfnPermissionSetPropsDsl.() -> Unit = {}):
      CfnPermissionSetProps {
    val builder = CfnPermissionSetPropsDsl()
    builder.apply(block)
    return builder.build()
  }
}
