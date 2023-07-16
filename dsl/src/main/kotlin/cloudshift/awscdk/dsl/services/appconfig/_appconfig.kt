@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appconfig

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appconfig.CfnApplication
import software.amazon.awscdk.services.appconfig.CfnApplicationProps
import software.amazon.awscdk.services.appconfig.CfnConfigurationProfile
import software.amazon.awscdk.services.appconfig.CfnConfigurationProfileProps
import software.amazon.awscdk.services.appconfig.CfnDeployment
import software.amazon.awscdk.services.appconfig.CfnDeploymentProps
import software.amazon.awscdk.services.appconfig.CfnDeploymentStrategy
import software.amazon.awscdk.services.appconfig.CfnDeploymentStrategyProps
import software.amazon.awscdk.services.appconfig.CfnEnvironment
import software.amazon.awscdk.services.appconfig.CfnEnvironmentProps
import software.amazon.awscdk.services.appconfig.CfnExtension
import software.amazon.awscdk.services.appconfig.CfnExtensionAssociation
import software.amazon.awscdk.services.appconfig.CfnExtensionAssociationProps
import software.amazon.awscdk.services.appconfig.CfnExtensionProps
import software.amazon.awscdk.services.appconfig.CfnHostedConfigurationVersion
import software.amazon.awscdk.services.appconfig.CfnHostedConfigurationVersionProps
import software.constructs.Construct

public object appconfig {
  public inline fun cfnApplication(
    scope: Construct,
    id: String,
    block: CfnApplicationDsl.() -> Unit = {},
  ): CfnApplication {
    val builder = CfnApplicationDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnApplicationProps(block: CfnApplicationPropsDsl.() -> Unit = {}):
      CfnApplicationProps {
    val builder = CfnApplicationPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnApplicationTagsProperty(block: CfnApplicationTagsPropertyDsl.() -> Unit =
      {}): CfnApplication.TagsProperty {
    val builder = CfnApplicationTagsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnConfigurationProfile(
    scope: Construct,
    id: String,
    block: CfnConfigurationProfileDsl.() -> Unit = {},
  ): CfnConfigurationProfile {
    val builder = CfnConfigurationProfileDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnConfigurationProfileProps(block: CfnConfigurationProfilePropsDsl.() -> Unit =
      {}): CfnConfigurationProfileProps {
    val builder = CfnConfigurationProfilePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnConfigurationProfileTagsProperty(block: CfnConfigurationProfileTagsPropertyDsl.() -> Unit
      = {}): CfnConfigurationProfile.TagsProperty {
    val builder = CfnConfigurationProfileTagsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnConfigurationProfileValidatorsProperty(block: CfnConfigurationProfileValidatorsPropertyDsl.() -> Unit
      = {}): CfnConfigurationProfile.ValidatorsProperty {
    val builder = CfnConfigurationProfileValidatorsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnDeployment(
    scope: Construct,
    id: String,
    block: CfnDeploymentDsl.() -> Unit = {},
  ): CfnDeployment {
    val builder = CfnDeploymentDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnDeploymentProps(block: CfnDeploymentPropsDsl.() -> Unit = {}):
      CfnDeploymentProps {
    val builder = CfnDeploymentPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnDeploymentStrategy(
    scope: Construct,
    id: String,
    block: CfnDeploymentStrategyDsl.() -> Unit = {},
  ): CfnDeploymentStrategy {
    val builder = CfnDeploymentStrategyDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnDeploymentStrategyProps(block: CfnDeploymentStrategyPropsDsl.() -> Unit =
      {}): CfnDeploymentStrategyProps {
    val builder = CfnDeploymentStrategyPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDeploymentStrategyTagsProperty(block: CfnDeploymentStrategyTagsPropertyDsl.() -> Unit =
      {}): CfnDeploymentStrategy.TagsProperty {
    val builder = CfnDeploymentStrategyTagsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnDeploymentTagsProperty(block: CfnDeploymentTagsPropertyDsl.() -> Unit = {}):
      CfnDeployment.TagsProperty {
    val builder = CfnDeploymentTagsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnEnvironment(
    scope: Construct,
    id: String,
    block: CfnEnvironmentDsl.() -> Unit = {},
  ): CfnEnvironment {
    val builder = CfnEnvironmentDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnEnvironmentMonitorsProperty(block: CfnEnvironmentMonitorsPropertyDsl.() -> Unit = {}):
      CfnEnvironment.MonitorsProperty {
    val builder = CfnEnvironmentMonitorsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnEnvironmentProps(block: CfnEnvironmentPropsDsl.() -> Unit = {}):
      CfnEnvironmentProps {
    val builder = CfnEnvironmentPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnEnvironmentTagsProperty(block: CfnEnvironmentTagsPropertyDsl.() -> Unit =
      {}): CfnEnvironment.TagsProperty {
    val builder = CfnEnvironmentTagsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnExtension(
    scope: Construct,
    id: String,
    block: CfnExtensionDsl.() -> Unit = {},
  ): CfnExtension {
    val builder = CfnExtensionDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnExtensionAssociation(
    scope: Construct,
    id: String,
    block: CfnExtensionAssociationDsl.() -> Unit = {},
  ): CfnExtensionAssociation {
    val builder = CfnExtensionAssociationDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnExtensionAssociationProps(block: CfnExtensionAssociationPropsDsl.() -> Unit =
      {}): CfnExtensionAssociationProps {
    val builder = CfnExtensionAssociationPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnExtensionParameterProperty(block: CfnExtensionParameterPropertyDsl.() -> Unit
      = {}): CfnExtension.ParameterProperty {
    val builder = CfnExtensionParameterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnExtensionProps(block: CfnExtensionPropsDsl.() -> Unit = {}):
      CfnExtensionProps {
    val builder = CfnExtensionPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnHostedConfigurationVersion(
    scope: Construct,
    id: String,
    block: CfnHostedConfigurationVersionDsl.() -> Unit = {},
  ): CfnHostedConfigurationVersion {
    val builder = CfnHostedConfigurationVersionDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnHostedConfigurationVersionProps(block: CfnHostedConfigurationVersionPropsDsl.() -> Unit
      = {}): CfnHostedConfigurationVersionProps {
    val builder = CfnHostedConfigurationVersionPropsDsl()
    builder.apply(block)
    return builder.build()
  }
}
