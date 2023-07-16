@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotsitewise

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy
import software.amazon.awscdk.services.iotsitewise.CfnAccessPolicyProps
import software.amazon.awscdk.services.iotsitewise.CfnAsset
import software.amazon.awscdk.services.iotsitewise.CfnAssetModel
import software.amazon.awscdk.services.iotsitewise.CfnAssetModelProps
import software.amazon.awscdk.services.iotsitewise.CfnAssetProps
import software.amazon.awscdk.services.iotsitewise.CfnDashboard
import software.amazon.awscdk.services.iotsitewise.CfnDashboardProps
import software.amazon.awscdk.services.iotsitewise.CfnGateway
import software.amazon.awscdk.services.iotsitewise.CfnGatewayProps
import software.amazon.awscdk.services.iotsitewise.CfnPortal
import software.amazon.awscdk.services.iotsitewise.CfnPortalProps
import software.amazon.awscdk.services.iotsitewise.CfnProject
import software.amazon.awscdk.services.iotsitewise.CfnProjectProps
import software.constructs.Construct

public object iotsitewise {
  public inline fun cfnAccessPolicy(
    scope: Construct,
    id: String,
    block: CfnAccessPolicyDsl.() -> Unit = {},
  ): CfnAccessPolicy {
    val builder = CfnAccessPolicyDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAccessPolicyAccessPolicyIdentityProperty(block: CfnAccessPolicyAccessPolicyIdentityPropertyDsl.() -> Unit
      = {}): CfnAccessPolicy.AccessPolicyIdentityProperty {
    val builder = CfnAccessPolicyAccessPolicyIdentityPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAccessPolicyAccessPolicyResourceProperty(block: CfnAccessPolicyAccessPolicyResourcePropertyDsl.() -> Unit
      = {}): CfnAccessPolicy.AccessPolicyResourceProperty {
    val builder = CfnAccessPolicyAccessPolicyResourcePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAccessPolicyIamRoleProperty(block: CfnAccessPolicyIamRolePropertyDsl.() -> Unit = {}):
      CfnAccessPolicy.IamRoleProperty {
    val builder = CfnAccessPolicyIamRolePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAccessPolicyIamUserProperty(block: CfnAccessPolicyIamUserPropertyDsl.() -> Unit = {}):
      CfnAccessPolicy.IamUserProperty {
    val builder = CfnAccessPolicyIamUserPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnAccessPolicyPortalProperty(block: CfnAccessPolicyPortalPropertyDsl.() -> Unit
      = {}): CfnAccessPolicy.PortalProperty {
    val builder = CfnAccessPolicyPortalPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAccessPolicyProjectProperty(block: CfnAccessPolicyProjectPropertyDsl.() -> Unit = {}):
      CfnAccessPolicy.ProjectProperty {
    val builder = CfnAccessPolicyProjectPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnAccessPolicyProps(block: CfnAccessPolicyPropsDsl.() -> Unit = {}):
      CfnAccessPolicyProps {
    val builder = CfnAccessPolicyPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnAccessPolicyUserProperty(block: CfnAccessPolicyUserPropertyDsl.() -> Unit =
      {}): CfnAccessPolicy.UserProperty {
    val builder = CfnAccessPolicyUserPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnAsset(
    scope: Construct,
    id: String,
    block: CfnAssetDsl.() -> Unit = {},
  ): CfnAsset {
    val builder = CfnAssetDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAssetAssetHierarchyProperty(block: CfnAssetAssetHierarchyPropertyDsl.() -> Unit = {}):
      CfnAsset.AssetHierarchyProperty {
    val builder = CfnAssetAssetHierarchyPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnAssetAssetPropertyProperty(block: CfnAssetAssetPropertyPropertyDsl.() -> Unit
      = {}): CfnAsset.AssetPropertyProperty {
    val builder = CfnAssetAssetPropertyPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnAssetModel(
    scope: Construct,
    id: String,
    block: CfnAssetModelDsl.() -> Unit = {},
  ): CfnAssetModel {
    val builder = CfnAssetModelDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAssetModelAssetModelCompositeModelProperty(block: CfnAssetModelAssetModelCompositeModelPropertyDsl.() -> Unit
      = {}): CfnAssetModel.AssetModelCompositeModelProperty {
    val builder = CfnAssetModelAssetModelCompositeModelPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAssetModelAssetModelHierarchyProperty(block: CfnAssetModelAssetModelHierarchyPropertyDsl.() -> Unit
      = {}): CfnAssetModel.AssetModelHierarchyProperty {
    val builder = CfnAssetModelAssetModelHierarchyPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAssetModelAssetModelPropertyProperty(block: CfnAssetModelAssetModelPropertyPropertyDsl.() -> Unit
      = {}): CfnAssetModel.AssetModelPropertyProperty {
    val builder = CfnAssetModelAssetModelPropertyPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAssetModelAttributeProperty(block: CfnAssetModelAttributePropertyDsl.() -> Unit = {}):
      CfnAssetModel.AttributeProperty {
    val builder = CfnAssetModelAttributePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAssetModelExpressionVariableProperty(block: CfnAssetModelExpressionVariablePropertyDsl.() -> Unit
      = {}): CfnAssetModel.ExpressionVariableProperty {
    val builder = CfnAssetModelExpressionVariablePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnAssetModelMetricProperty(block: CfnAssetModelMetricPropertyDsl.() -> Unit =
      {}): CfnAssetModel.MetricProperty {
    val builder = CfnAssetModelMetricPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAssetModelMetricWindowProperty(block: CfnAssetModelMetricWindowPropertyDsl.() -> Unit =
      {}): CfnAssetModel.MetricWindowProperty {
    val builder = CfnAssetModelMetricWindowPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAssetModelPropertyTypeProperty(block: CfnAssetModelPropertyTypePropertyDsl.() -> Unit =
      {}): CfnAssetModel.PropertyTypeProperty {
    val builder = CfnAssetModelPropertyTypePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnAssetModelProps(block: CfnAssetModelPropsDsl.() -> Unit = {}):
      CfnAssetModelProps {
    val builder = CfnAssetModelPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAssetModelTransformProperty(block: CfnAssetModelTransformPropertyDsl.() -> Unit = {}):
      CfnAssetModel.TransformProperty {
    val builder = CfnAssetModelTransformPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAssetModelTumblingWindowProperty(block: CfnAssetModelTumblingWindowPropertyDsl.() -> Unit
      = {}): CfnAssetModel.TumblingWindowProperty {
    val builder = CfnAssetModelTumblingWindowPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAssetModelVariableValueProperty(block: CfnAssetModelVariableValuePropertyDsl.() -> Unit
      = {}): CfnAssetModel.VariableValueProperty {
    val builder = CfnAssetModelVariableValuePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnAssetProps(block: CfnAssetPropsDsl.() -> Unit = {}): CfnAssetProps {
    val builder = CfnAssetPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnDashboard(
    scope: Construct,
    id: String,
    block: CfnDashboardDsl.() -> Unit = {},
  ): CfnDashboard {
    val builder = CfnDashboardDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnDashboardProps(block: CfnDashboardPropsDsl.() -> Unit = {}):
      CfnDashboardProps {
    val builder = CfnDashboardPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnGateway(
    scope: Construct,
    id: String,
    block: CfnGatewayDsl.() -> Unit = {},
  ): CfnGateway {
    val builder = CfnGatewayDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnGatewayGatewayCapabilitySummaryProperty(block: CfnGatewayGatewayCapabilitySummaryPropertyDsl.() -> Unit
      = {}): CfnGateway.GatewayCapabilitySummaryProperty {
    val builder = CfnGatewayGatewayCapabilitySummaryPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnGatewayGatewayPlatformProperty(block: CfnGatewayGatewayPlatformPropertyDsl.() -> Unit =
      {}): CfnGateway.GatewayPlatformProperty {
    val builder = CfnGatewayGatewayPlatformPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnGatewayGreengrassProperty(block: CfnGatewayGreengrassPropertyDsl.() -> Unit =
      {}): CfnGateway.GreengrassProperty {
    val builder = CfnGatewayGreengrassPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnGatewayGreengrassV2Property(block: CfnGatewayGreengrassV2PropertyDsl.() -> Unit = {}):
      CfnGateway.GreengrassV2Property {
    val builder = CfnGatewayGreengrassV2PropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnGatewayProps(block: CfnGatewayPropsDsl.() -> Unit = {}): CfnGatewayProps {
    val builder = CfnGatewayPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnPortal(
    scope: Construct,
    id: String,
    block: CfnPortalDsl.() -> Unit = {},
  ): CfnPortal {
    val builder = CfnPortalDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnPortalAlarmsProperty(block: CfnPortalAlarmsPropertyDsl.() -> Unit = {}):
      CfnPortal.AlarmsProperty {
    val builder = CfnPortalAlarmsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnPortalProps(block: CfnPortalPropsDsl.() -> Unit = {}): CfnPortalProps {
    val builder = CfnPortalPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnProject(
    scope: Construct,
    id: String,
    block: CfnProjectDsl.() -> Unit = {},
  ): CfnProject {
    val builder = CfnProjectDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnProjectProps(block: CfnProjectPropsDsl.() -> Unit = {}): CfnProjectProps {
    val builder = CfnProjectPropsDsl()
    builder.apply(block)
    return builder.build()
  }
}
