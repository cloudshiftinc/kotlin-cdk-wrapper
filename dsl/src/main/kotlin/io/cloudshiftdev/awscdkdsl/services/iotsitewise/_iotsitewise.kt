@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.iotsitewise

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
    /**
     * Creates an access policy that grants the specified identity (IAM Identity Center user, IAM
     * Identity Center group, or IAM user) access to the specified AWS IoT SiteWise Monitor portal
     * or project resource.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotsitewise.*;
     * CfnAccessPolicy cfnAccessPolicy = CfnAccessPolicy.Builder.create(this, "MyCfnAccessPolicy")
     * .accessPolicyIdentity(AccessPolicyIdentityProperty.builder()
     * .iamRole(IamRoleProperty.builder()
     * .arn("arn")
     * .build())
     * .iamUser(IamUserProperty.builder()
     * .arn("arn")
     * .build())
     * .user(UserProperty.builder()
     * .id("id")
     * .build())
     * .build())
     * .accessPolicyPermission("accessPolicyPermission")
     * .accessPolicyResource(AccessPolicyResourceProperty.builder()
     * .portal(PortalProperty.builder()
     * .id("id")
     * .build())
     * .project(ProjectProperty.builder()
     * .id("id")
     * .build())
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-accesspolicy.html)
     */
    public inline fun cfnAccessPolicy(
        scope: Construct,
        id: String,
        block: CfnAccessPolicyDsl.() -> Unit = {},
    ): CfnAccessPolicy {
        val builder = CfnAccessPolicyDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The identity (IAM Identity Center user, IAM Identity Center group, or IAM user) to which this
     * access policy applies.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotsitewise.*;
     * AccessPolicyIdentityProperty accessPolicyIdentityProperty =
     * AccessPolicyIdentityProperty.builder()
     * .iamRole(IamRoleProperty.builder()
     * .arn("arn")
     * .build())
     * .iamUser(IamUserProperty.builder()
     * .arn("arn")
     * .build())
     * .user(UserProperty.builder()
     * .id("id")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-accesspolicy-accesspolicyidentity.html)
     */
    public inline fun cfnAccessPolicyAccessPolicyIdentityProperty(
        block: CfnAccessPolicyAccessPolicyIdentityPropertyDsl.() -> Unit = {}
    ): CfnAccessPolicy.AccessPolicyIdentityProperty {
        val builder = CfnAccessPolicyAccessPolicyIdentityPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The AWS IoT SiteWise Monitor resource for this access policy.
     *
     * Choose either a portal or a project.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotsitewise.*;
     * AccessPolicyResourceProperty accessPolicyResourceProperty =
     * AccessPolicyResourceProperty.builder()
     * .portal(PortalProperty.builder()
     * .id("id")
     * .build())
     * .project(ProjectProperty.builder()
     * .id("id")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-accesspolicy-accesspolicyresource.html)
     */
    public inline fun cfnAccessPolicyAccessPolicyResourceProperty(
        block: CfnAccessPolicyAccessPolicyResourcePropertyDsl.() -> Unit = {}
    ): CfnAccessPolicy.AccessPolicyResourceProperty {
        val builder = CfnAccessPolicyAccessPolicyResourcePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Contains information about an AWS Identity and Access Management role.
     *
     * For more information, see
     * [IAM roles](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles.html) in the *IAM User
     * Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotsitewise.*;
     * IamRoleProperty iamRoleProperty = IamRoleProperty.builder()
     * .arn("arn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-accesspolicy-iamrole.html)
     */
    public inline fun cfnAccessPolicyIamRoleProperty(
        block: CfnAccessPolicyIamRolePropertyDsl.() -> Unit = {}
    ): CfnAccessPolicy.IamRoleProperty {
        val builder = CfnAccessPolicyIamRolePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Contains information about an AWS Identity and Access Management user.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotsitewise.*;
     * IamUserProperty iamUserProperty = IamUserProperty.builder()
     * .arn("arn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-accesspolicy-iamuser.html)
     */
    public inline fun cfnAccessPolicyIamUserProperty(
        block: CfnAccessPolicyIamUserPropertyDsl.() -> Unit = {}
    ): CfnAccessPolicy.IamUserProperty {
        val builder = CfnAccessPolicyIamUserPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `Portal` property type specifies the AWS IoT SiteWise Monitor portal for an
     * [AWS::IoTSiteWise::AccessPolicy](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-accesspolicy.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotsitewise.*;
     * PortalProperty portalProperty = PortalProperty.builder()
     * .id("id")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-accesspolicy-portal.html)
     */
    public inline fun cfnAccessPolicyPortalProperty(
        block: CfnAccessPolicyPortalPropertyDsl.() -> Unit = {}
    ): CfnAccessPolicy.PortalProperty {
        val builder = CfnAccessPolicyPortalPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `Project` property type specifies the AWS IoT SiteWise Monitor project for an
     * [AWS::IoTSiteWise::AccessPolicy](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-accesspolicy.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotsitewise.*;
     * ProjectProperty projectProperty = ProjectProperty.builder()
     * .id("id")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-accesspolicy-project.html)
     */
    public inline fun cfnAccessPolicyProjectProperty(
        block: CfnAccessPolicyProjectPropertyDsl.() -> Unit = {}
    ): CfnAccessPolicy.ProjectProperty {
        val builder = CfnAccessPolicyProjectPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnAccessPolicy`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotsitewise.*;
     * CfnAccessPolicyProps cfnAccessPolicyProps = CfnAccessPolicyProps.builder()
     * .accessPolicyIdentity(AccessPolicyIdentityProperty.builder()
     * .iamRole(IamRoleProperty.builder()
     * .arn("arn")
     * .build())
     * .iamUser(IamUserProperty.builder()
     * .arn("arn")
     * .build())
     * .user(UserProperty.builder()
     * .id("id")
     * .build())
     * .build())
     * .accessPolicyPermission("accessPolicyPermission")
     * .accessPolicyResource(AccessPolicyResourceProperty.builder()
     * .portal(PortalProperty.builder()
     * .id("id")
     * .build())
     * .project(ProjectProperty.builder()
     * .id("id")
     * .build())
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-accesspolicy.html)
     */
    public inline fun cfnAccessPolicyProps(
        block: CfnAccessPolicyPropsDsl.() -> Unit = {}
    ): CfnAccessPolicyProps {
        val builder = CfnAccessPolicyPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `User` property type specifies the AWS IoT SiteWise Monitor user for an
     * [AWS::IoTSiteWise::AccessPolicy](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-accesspolicy.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotsitewise.*;
     * UserProperty userProperty = UserProperty.builder()
     * .id("id")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-accesspolicy-user.html)
     */
    public inline fun cfnAccessPolicyUserProperty(
        block: CfnAccessPolicyUserPropertyDsl.() -> Unit = {}
    ): CfnAccessPolicy.UserProperty {
        val builder = CfnAccessPolicyUserPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates an asset from an existing asset model.
     *
     * For more information, see
     * [Creating assets](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/create-assets.html)
     * in the *AWS IoT SiteWise User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotsitewise.*;
     * CfnAsset cfnAsset = CfnAsset.Builder.create(this, "MyCfnAsset")
     * .assetModelId("assetModelId")
     * .assetName("assetName")
     * // the properties below are optional
     * .assetDescription("assetDescription")
     * .assetHierarchies(List.of(AssetHierarchyProperty.builder()
     * .childAssetId("childAssetId")
     * .logicalId("logicalId")
     * .build()))
     * .assetProperties(List.of(AssetPropertyProperty.builder()
     * .logicalId("logicalId")
     * // the properties below are optional
     * .alias("alias")
     * .notificationState("notificationState")
     * .unit("unit")
     * .build()))
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-asset.html)
     */
    public inline fun cfnAsset(
        scope: Construct,
        id: String,
        block: CfnAssetDsl.() -> Unit = {},
    ): CfnAsset {
        val builder = CfnAssetDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes an asset hierarchy that contains a `childAssetId` and `hierarchyLogicalId` .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotsitewise.*;
     * AssetHierarchyProperty assetHierarchyProperty = AssetHierarchyProperty.builder()
     * .childAssetId("childAssetId")
     * .logicalId("logicalId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-asset-assethierarchy.html)
     */
    public inline fun cfnAssetAssetHierarchyProperty(
        block: CfnAssetAssetHierarchyPropertyDsl.() -> Unit = {}
    ): CfnAsset.AssetHierarchyProperty {
        val builder = CfnAssetAssetHierarchyPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Contains asset property information.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotsitewise.*;
     * AssetPropertyProperty assetPropertyProperty = AssetPropertyProperty.builder()
     * .logicalId("logicalId")
     * // the properties below are optional
     * .alias("alias")
     * .notificationState("notificationState")
     * .unit("unit")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-asset-assetproperty.html)
     */
    public inline fun cfnAssetAssetPropertyProperty(
        block: CfnAssetAssetPropertyPropertyDsl.() -> Unit = {}
    ): CfnAsset.AssetPropertyProperty {
        val builder = CfnAssetAssetPropertyPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates an asset model from specified property and hierarchy definitions.
     *
     * You create assets from asset models. With asset models, you can easily create assets of the
     * same type that have standardized definitions. Each asset created from a model inherits the
     * asset model's property and hierarchy definitions. For more information, see
     * [Defining asset models](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/define-models.html)
     * in the *AWS IoT SiteWise User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotsitewise.*;
     * CfnAssetModel cfnAssetModel = CfnAssetModel.Builder.create(this, "MyCfnAssetModel")
     * .assetModelName("assetModelName")
     * // the properties below are optional
     * .assetModelCompositeModels(List.of(AssetModelCompositeModelProperty.builder()
     * .name("name")
     * .type("type")
     * // the properties below are optional
     * .compositeModelProperties(List.of(AssetModelPropertyProperty.builder()
     * .dataType("dataType")
     * .logicalId("logicalId")
     * .name("name")
     * .type(PropertyTypeProperty.builder()
     * .typeName("typeName")
     * // the properties below are optional
     * .attribute(AttributeProperty.builder()
     * .defaultValue("defaultValue")
     * .build())
     * .metric(MetricProperty.builder()
     * .expression("expression")
     * .variables(List.of(ExpressionVariableProperty.builder()
     * .name("name")
     * .value(VariableValueProperty.builder()
     * .propertyLogicalId("propertyLogicalId")
     * // the properties below are optional
     * .hierarchyLogicalId("hierarchyLogicalId")
     * .build())
     * .build()))
     * .window(MetricWindowProperty.builder()
     * .tumbling(TumblingWindowProperty.builder()
     * .interval("interval")
     * // the properties below are optional
     * .offset("offset")
     * .build())
     * .build())
     * .build())
     * .transform(TransformProperty.builder()
     * .expression("expression")
     * .variables(List.of(ExpressionVariableProperty.builder()
     * .name("name")
     * .value(VariableValueProperty.builder()
     * .propertyLogicalId("propertyLogicalId")
     * // the properties below are optional
     * .hierarchyLogicalId("hierarchyLogicalId")
     * .build())
     * .build()))
     * .build())
     * .build())
     * // the properties below are optional
     * .dataTypeSpec("dataTypeSpec")
     * .unit("unit")
     * .build()))
     * .description("description")
     * .build()))
     * .assetModelDescription("assetModelDescription")
     * .assetModelHierarchies(List.of(AssetModelHierarchyProperty.builder()
     * .childAssetModelId("childAssetModelId")
     * .logicalId("logicalId")
     * .name("name")
     * .build()))
     * .assetModelProperties(List.of(AssetModelPropertyProperty.builder()
     * .dataType("dataType")
     * .logicalId("logicalId")
     * .name("name")
     * .type(PropertyTypeProperty.builder()
     * .typeName("typeName")
     * // the properties below are optional
     * .attribute(AttributeProperty.builder()
     * .defaultValue("defaultValue")
     * .build())
     * .metric(MetricProperty.builder()
     * .expression("expression")
     * .variables(List.of(ExpressionVariableProperty.builder()
     * .name("name")
     * .value(VariableValueProperty.builder()
     * .propertyLogicalId("propertyLogicalId")
     * // the properties below are optional
     * .hierarchyLogicalId("hierarchyLogicalId")
     * .build())
     * .build()))
     * .window(MetricWindowProperty.builder()
     * .tumbling(TumblingWindowProperty.builder()
     * .interval("interval")
     * // the properties below are optional
     * .offset("offset")
     * .build())
     * .build())
     * .build())
     * .transform(TransformProperty.builder()
     * .expression("expression")
     * .variables(List.of(ExpressionVariableProperty.builder()
     * .name("name")
     * .value(VariableValueProperty.builder()
     * .propertyLogicalId("propertyLogicalId")
     * // the properties below are optional
     * .hierarchyLogicalId("hierarchyLogicalId")
     * .build())
     * .build()))
     * .build())
     * .build())
     * // the properties below are optional
     * .dataTypeSpec("dataTypeSpec")
     * .unit("unit")
     * .build()))
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-assetmodel.html)
     */
    public inline fun cfnAssetModel(
        scope: Construct,
        id: String,
        block: CfnAssetModelDsl.() -> Unit = {},
    ): CfnAssetModel {
        val builder = CfnAssetModelDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Contains information about a composite model in an asset model.
     *
     * This object contains the asset property definitions that you define in the composite model.
     * You can use composite asset models to define alarms on this asset model.
     *
     * If you use the `AssetModelCompositeModel` property to create an alarm, you must use the
     * following information to define three asset model properties:
     * * Use an asset model property to specify the alarm type.
     * * The name must be `AWS/ALARM_TYPE` .
     * * The data type must be `STRING` .
     * * For the `Type` property, the type name must be `Attribute` and the default value must be
     *   `IOT_EVENTS` .
     * * Use an asset model property to specify the alarm source.
     * * The name must be `AWS/ALARM_SOURCE` .
     * * The data type must be `STRING` .
     * * For the `Type` property, the type name must be `Attribute` and the default value must be
     *   the ARN of the alarm model that you created in AWS IoT Events .
     *
     * For the ARN of the alarm model, you can use the `Fn::Sub` intrinsic function to substitute
     * the `AWS::Partition` , `AWS::Region` , and `AWS::AccountId` variables in an input string with
     * values that you specify.
     *
     * For example, `Fn::Sub:
     * "arn:${AWS::Partition}:iotevents:${AWS::Region}:${AWS::AccountId}:alarmModel/TestAlarmModel"`
     * .
     *
     * Replace `TestAlarmModel` with the name of your alarm model.
     *
     * For more information about using the `Fn::Sub` intrinsic function, see
     * [Fn::Sub](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference-sub.html)
     * .
     * * Use an asset model property to specify the state of the alarm.
     * * The name must be `AWS/ALARM_STATE` .
     * * The data type must be `STRUCT` .
     * * The `DataTypeSpec` value must be `AWS/ALARM_STATE` .
     * * For the `Type` property, the type name must be `Measurement` .
     *
     * At the bottom of this page, we provide a YAML example that you can modify to create an alarm.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotsitewise.*;
     * AssetModelCompositeModelProperty assetModelCompositeModelProperty =
     * AssetModelCompositeModelProperty.builder()
     * .name("name")
     * .type("type")
     * // the properties below are optional
     * .compositeModelProperties(List.of(AssetModelPropertyProperty.builder()
     * .dataType("dataType")
     * .logicalId("logicalId")
     * .name("name")
     * .type(PropertyTypeProperty.builder()
     * .typeName("typeName")
     * // the properties below are optional
     * .attribute(AttributeProperty.builder()
     * .defaultValue("defaultValue")
     * .build())
     * .metric(MetricProperty.builder()
     * .expression("expression")
     * .variables(List.of(ExpressionVariableProperty.builder()
     * .name("name")
     * .value(VariableValueProperty.builder()
     * .propertyLogicalId("propertyLogicalId")
     * // the properties below are optional
     * .hierarchyLogicalId("hierarchyLogicalId")
     * .build())
     * .build()))
     * .window(MetricWindowProperty.builder()
     * .tumbling(TumblingWindowProperty.builder()
     * .interval("interval")
     * // the properties below are optional
     * .offset("offset")
     * .build())
     * .build())
     * .build())
     * .transform(TransformProperty.builder()
     * .expression("expression")
     * .variables(List.of(ExpressionVariableProperty.builder()
     * .name("name")
     * .value(VariableValueProperty.builder()
     * .propertyLogicalId("propertyLogicalId")
     * // the properties below are optional
     * .hierarchyLogicalId("hierarchyLogicalId")
     * .build())
     * .build()))
     * .build())
     * .build())
     * // the properties below are optional
     * .dataTypeSpec("dataTypeSpec")
     * .unit("unit")
     * .build()))
     * .description("description")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-assetmodel-assetmodelcompositemodel.html)
     */
    public inline fun cfnAssetModelAssetModelCompositeModelProperty(
        block: CfnAssetModelAssetModelCompositeModelPropertyDsl.() -> Unit = {}
    ): CfnAssetModel.AssetModelCompositeModelProperty {
        val builder = CfnAssetModelAssetModelCompositeModelPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes an asset hierarchy that contains a hierarchy's name, `LogicalID` , and child asset
     * model ID that specifies the type of asset that can be in this hierarchy.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotsitewise.*;
     * AssetModelHierarchyProperty assetModelHierarchyProperty = AssetModelHierarchyProperty.builder()
     * .childAssetModelId("childAssetModelId")
     * .logicalId("logicalId")
     * .name("name")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-assetmodel-assetmodelhierarchy.html)
     */
    public inline fun cfnAssetModelAssetModelHierarchyProperty(
        block: CfnAssetModelAssetModelHierarchyPropertyDsl.() -> Unit = {}
    ): CfnAssetModel.AssetModelHierarchyProperty {
        val builder = CfnAssetModelAssetModelHierarchyPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Contains information about an asset model property.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotsitewise.*;
     * AssetModelPropertyProperty assetModelPropertyProperty = AssetModelPropertyProperty.builder()
     * .dataType("dataType")
     * .logicalId("logicalId")
     * .name("name")
     * .type(PropertyTypeProperty.builder()
     * .typeName("typeName")
     * // the properties below are optional
     * .attribute(AttributeProperty.builder()
     * .defaultValue("defaultValue")
     * .build())
     * .metric(MetricProperty.builder()
     * .expression("expression")
     * .variables(List.of(ExpressionVariableProperty.builder()
     * .name("name")
     * .value(VariableValueProperty.builder()
     * .propertyLogicalId("propertyLogicalId")
     * // the properties below are optional
     * .hierarchyLogicalId("hierarchyLogicalId")
     * .build())
     * .build()))
     * .window(MetricWindowProperty.builder()
     * .tumbling(TumblingWindowProperty.builder()
     * .interval("interval")
     * // the properties below are optional
     * .offset("offset")
     * .build())
     * .build())
     * .build())
     * .transform(TransformProperty.builder()
     * .expression("expression")
     * .variables(List.of(ExpressionVariableProperty.builder()
     * .name("name")
     * .value(VariableValueProperty.builder()
     * .propertyLogicalId("propertyLogicalId")
     * // the properties below are optional
     * .hierarchyLogicalId("hierarchyLogicalId")
     * .build())
     * .build()))
     * .build())
     * .build())
     * // the properties below are optional
     * .dataTypeSpec("dataTypeSpec")
     * .unit("unit")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-assetmodel-assetmodelproperty.html)
     */
    public inline fun cfnAssetModelAssetModelPropertyProperty(
        block: CfnAssetModelAssetModelPropertyPropertyDsl.() -> Unit = {}
    ): CfnAssetModel.AssetModelPropertyProperty {
        val builder = CfnAssetModelAssetModelPropertyPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Contains an asset attribute property.
     *
     * For more information, see
     * [Defining data properties](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/asset-properties.html#attributes)
     * in the *AWS IoT SiteWise User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotsitewise.*;
     * AttributeProperty attributeProperty = AttributeProperty.builder()
     * .defaultValue("defaultValue")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-assetmodel-attribute.html)
     */
    public inline fun cfnAssetModelAttributeProperty(
        block: CfnAssetModelAttributePropertyDsl.() -> Unit = {}
    ): CfnAssetModel.AttributeProperty {
        val builder = CfnAssetModelAttributePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Contains expression variable information.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotsitewise.*;
     * ExpressionVariableProperty expressionVariableProperty = ExpressionVariableProperty.builder()
     * .name("name")
     * .value(VariableValueProperty.builder()
     * .propertyLogicalId("propertyLogicalId")
     * // the properties below are optional
     * .hierarchyLogicalId("hierarchyLogicalId")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-assetmodel-expressionvariable.html)
     */
    public inline fun cfnAssetModelExpressionVariableProperty(
        block: CfnAssetModelExpressionVariablePropertyDsl.() -> Unit = {}
    ): CfnAssetModel.ExpressionVariableProperty {
        val builder = CfnAssetModelExpressionVariablePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Contains an asset metric property.
     *
     * With metrics, you can calculate aggregate functions, such as an average, maximum, or minimum,
     * as specified through an expression. A metric maps several values to a single value (such as a
     * sum).
     *
     * The maximum number of dependent/cascading variables used in any one metric calculation is 10.
     * Therefore, a *root* metric can have up to 10 cascading metrics in its computational
     * dependency tree. Additionally, a metric can only have a data type of `DOUBLE` and consume
     * properties with data types of `INTEGER` or `DOUBLE` .
     *
     * For more information, see
     * [Defining data properties](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/asset-properties.html#metrics)
     * in the *AWS IoT SiteWise User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotsitewise.*;
     * MetricProperty metricProperty = MetricProperty.builder()
     * .expression("expression")
     * .variables(List.of(ExpressionVariableProperty.builder()
     * .name("name")
     * .value(VariableValueProperty.builder()
     * .propertyLogicalId("propertyLogicalId")
     * // the properties below are optional
     * .hierarchyLogicalId("hierarchyLogicalId")
     * .build())
     * .build()))
     * .window(MetricWindowProperty.builder()
     * .tumbling(TumblingWindowProperty.builder()
     * .interval("interval")
     * // the properties below are optional
     * .offset("offset")
     * .build())
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-assetmodel-metric.html)
     */
    public inline fun cfnAssetModelMetricProperty(
        block: CfnAssetModelMetricPropertyDsl.() -> Unit = {}
    ): CfnAssetModel.MetricProperty {
        val builder = CfnAssetModelMetricPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Contains a time interval window used for data aggregate computations (for example, average,
     * sum, count, and so on).
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotsitewise.*;
     * MetricWindowProperty metricWindowProperty = MetricWindowProperty.builder()
     * .tumbling(TumblingWindowProperty.builder()
     * .interval("interval")
     * // the properties below are optional
     * .offset("offset")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-assetmodel-metricwindow.html)
     */
    public inline fun cfnAssetModelMetricWindowProperty(
        block: CfnAssetModelMetricWindowPropertyDsl.() -> Unit = {}
    ): CfnAssetModel.MetricWindowProperty {
        val builder = CfnAssetModelMetricWindowPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Contains a property type, which can be one of `Attribute` , `Measurement` , `Metric` , or
     * `Transform` .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotsitewise.*;
     * PropertyTypeProperty propertyTypeProperty = PropertyTypeProperty.builder()
     * .typeName("typeName")
     * // the properties below are optional
     * .attribute(AttributeProperty.builder()
     * .defaultValue("defaultValue")
     * .build())
     * .metric(MetricProperty.builder()
     * .expression("expression")
     * .variables(List.of(ExpressionVariableProperty.builder()
     * .name("name")
     * .value(VariableValueProperty.builder()
     * .propertyLogicalId("propertyLogicalId")
     * // the properties below are optional
     * .hierarchyLogicalId("hierarchyLogicalId")
     * .build())
     * .build()))
     * .window(MetricWindowProperty.builder()
     * .tumbling(TumblingWindowProperty.builder()
     * .interval("interval")
     * // the properties below are optional
     * .offset("offset")
     * .build())
     * .build())
     * .build())
     * .transform(TransformProperty.builder()
     * .expression("expression")
     * .variables(List.of(ExpressionVariableProperty.builder()
     * .name("name")
     * .value(VariableValueProperty.builder()
     * .propertyLogicalId("propertyLogicalId")
     * // the properties below are optional
     * .hierarchyLogicalId("hierarchyLogicalId")
     * .build())
     * .build()))
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-assetmodel-propertytype.html)
     */
    public inline fun cfnAssetModelPropertyTypeProperty(
        block: CfnAssetModelPropertyTypePropertyDsl.() -> Unit = {}
    ): CfnAssetModel.PropertyTypeProperty {
        val builder = CfnAssetModelPropertyTypePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnAssetModel`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotsitewise.*;
     * CfnAssetModelProps cfnAssetModelProps = CfnAssetModelProps.builder()
     * .assetModelName("assetModelName")
     * // the properties below are optional
     * .assetModelCompositeModels(List.of(AssetModelCompositeModelProperty.builder()
     * .name("name")
     * .type("type")
     * // the properties below are optional
     * .compositeModelProperties(List.of(AssetModelPropertyProperty.builder()
     * .dataType("dataType")
     * .logicalId("logicalId")
     * .name("name")
     * .type(PropertyTypeProperty.builder()
     * .typeName("typeName")
     * // the properties below are optional
     * .attribute(AttributeProperty.builder()
     * .defaultValue("defaultValue")
     * .build())
     * .metric(MetricProperty.builder()
     * .expression("expression")
     * .variables(List.of(ExpressionVariableProperty.builder()
     * .name("name")
     * .value(VariableValueProperty.builder()
     * .propertyLogicalId("propertyLogicalId")
     * // the properties below are optional
     * .hierarchyLogicalId("hierarchyLogicalId")
     * .build())
     * .build()))
     * .window(MetricWindowProperty.builder()
     * .tumbling(TumblingWindowProperty.builder()
     * .interval("interval")
     * // the properties below are optional
     * .offset("offset")
     * .build())
     * .build())
     * .build())
     * .transform(TransformProperty.builder()
     * .expression("expression")
     * .variables(List.of(ExpressionVariableProperty.builder()
     * .name("name")
     * .value(VariableValueProperty.builder()
     * .propertyLogicalId("propertyLogicalId")
     * // the properties below are optional
     * .hierarchyLogicalId("hierarchyLogicalId")
     * .build())
     * .build()))
     * .build())
     * .build())
     * // the properties below are optional
     * .dataTypeSpec("dataTypeSpec")
     * .unit("unit")
     * .build()))
     * .description("description")
     * .build()))
     * .assetModelDescription("assetModelDescription")
     * .assetModelHierarchies(List.of(AssetModelHierarchyProperty.builder()
     * .childAssetModelId("childAssetModelId")
     * .logicalId("logicalId")
     * .name("name")
     * .build()))
     * .assetModelProperties(List.of(AssetModelPropertyProperty.builder()
     * .dataType("dataType")
     * .logicalId("logicalId")
     * .name("name")
     * .type(PropertyTypeProperty.builder()
     * .typeName("typeName")
     * // the properties below are optional
     * .attribute(AttributeProperty.builder()
     * .defaultValue("defaultValue")
     * .build())
     * .metric(MetricProperty.builder()
     * .expression("expression")
     * .variables(List.of(ExpressionVariableProperty.builder()
     * .name("name")
     * .value(VariableValueProperty.builder()
     * .propertyLogicalId("propertyLogicalId")
     * // the properties below are optional
     * .hierarchyLogicalId("hierarchyLogicalId")
     * .build())
     * .build()))
     * .window(MetricWindowProperty.builder()
     * .tumbling(TumblingWindowProperty.builder()
     * .interval("interval")
     * // the properties below are optional
     * .offset("offset")
     * .build())
     * .build())
     * .build())
     * .transform(TransformProperty.builder()
     * .expression("expression")
     * .variables(List.of(ExpressionVariableProperty.builder()
     * .name("name")
     * .value(VariableValueProperty.builder()
     * .propertyLogicalId("propertyLogicalId")
     * // the properties below are optional
     * .hierarchyLogicalId("hierarchyLogicalId")
     * .build())
     * .build()))
     * .build())
     * .build())
     * // the properties below are optional
     * .dataTypeSpec("dataTypeSpec")
     * .unit("unit")
     * .build()))
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-assetmodel.html)
     */
    public inline fun cfnAssetModelProps(
        block: CfnAssetModelPropsDsl.() -> Unit = {}
    ): CfnAssetModelProps {
        val builder = CfnAssetModelPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Contains an asset transform property.
     *
     * A transform is a one-to-one mapping of a property's data points from one form to another. For
     * example, you can use a transform to convert a Celsius data stream to Fahrenheit by applying
     * the transformation expression to each data point of the Celsius stream. Transforms can only
     * input properties that are `INTEGER` , `DOUBLE` , or `BOOLEAN` type. Booleans convert to `0` (
     * `FALSE` ) and `1` ( `TRUE` )..
     *
     * For more information, see
     * [Defining data properties](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/asset-properties.html#transforms)
     * in the *AWS IoT SiteWise User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotsitewise.*;
     * TransformProperty transformProperty = TransformProperty.builder()
     * .expression("expression")
     * .variables(List.of(ExpressionVariableProperty.builder()
     * .name("name")
     * .value(VariableValueProperty.builder()
     * .propertyLogicalId("propertyLogicalId")
     * // the properties below are optional
     * .hierarchyLogicalId("hierarchyLogicalId")
     * .build())
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-assetmodel-transform.html)
     */
    public inline fun cfnAssetModelTransformProperty(
        block: CfnAssetModelTransformPropertyDsl.() -> Unit = {}
    ): CfnAssetModel.TransformProperty {
        val builder = CfnAssetModelTransformPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Contains a tumbling window, which is a repeating fixed-sized, non-overlapping, and contiguous
     * time window.
     *
     * You can use this window in metrics to aggregate data from properties and other assets.
     *
     * You can use `m` , `h` , `d` , and `w` when you specify an interval or offset. Note that `m`
     * represents minutes, `h` represents hours, `d` represents days, and `w` represents weeks. You
     * can also use `s` to represent seconds in `offset` .
     *
     * The `interval` and `offset` parameters support the
     * [ISO 8601 format](https://docs.aws.amazon.com/https://en.wikipedia.org/wiki/ISO_8601) . For
     * example, `PT5S` represents 5 seconds, `PT5M` represents 5 minutes, and `PT5H` represents 5
     * hours.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotsitewise.*;
     * TumblingWindowProperty tumblingWindowProperty = TumblingWindowProperty.builder()
     * .interval("interval")
     * // the properties below are optional
     * .offset("offset")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-assetmodel-tumblingwindow.html)
     */
    public inline fun cfnAssetModelTumblingWindowProperty(
        block: CfnAssetModelTumblingWindowPropertyDsl.() -> Unit = {}
    ): CfnAssetModel.TumblingWindowProperty {
        val builder = CfnAssetModelTumblingWindowPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Identifies a property value used in an expression.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotsitewise.*;
     * VariableValueProperty variableValueProperty = VariableValueProperty.builder()
     * .propertyLogicalId("propertyLogicalId")
     * // the properties below are optional
     * .hierarchyLogicalId("hierarchyLogicalId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-assetmodel-variablevalue.html)
     */
    public inline fun cfnAssetModelVariableValueProperty(
        block: CfnAssetModelVariableValuePropertyDsl.() -> Unit = {}
    ): CfnAssetModel.VariableValueProperty {
        val builder = CfnAssetModelVariableValuePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnAsset`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotsitewise.*;
     * CfnAssetProps cfnAssetProps = CfnAssetProps.builder()
     * .assetModelId("assetModelId")
     * .assetName("assetName")
     * // the properties below are optional
     * .assetDescription("assetDescription")
     * .assetHierarchies(List.of(AssetHierarchyProperty.builder()
     * .childAssetId("childAssetId")
     * .logicalId("logicalId")
     * .build()))
     * .assetProperties(List.of(AssetPropertyProperty.builder()
     * .logicalId("logicalId")
     * // the properties below are optional
     * .alias("alias")
     * .notificationState("notificationState")
     * .unit("unit")
     * .build()))
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-asset.html)
     */
    public inline fun cfnAssetProps(block: CfnAssetPropsDsl.() -> Unit = {}): CfnAssetProps {
        val builder = CfnAssetPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a dashboard in an AWS IoT SiteWise Monitor project.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotsitewise.*;
     * CfnDashboard cfnDashboard = CfnDashboard.Builder.create(this, "MyCfnDashboard")
     * .dashboardDefinition("dashboardDefinition")
     * .dashboardDescription("dashboardDescription")
     * .dashboardName("dashboardName")
     * // the properties below are optional
     * .projectId("projectId")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-dashboard.html)
     */
    public inline fun cfnDashboard(
        scope: Construct,
        id: String,
        block: CfnDashboardDsl.() -> Unit = {},
    ): CfnDashboard {
        val builder = CfnDashboardDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnDashboard`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotsitewise.*;
     * CfnDashboardProps cfnDashboardProps = CfnDashboardProps.builder()
     * .dashboardDefinition("dashboardDefinition")
     * .dashboardDescription("dashboardDescription")
     * .dashboardName("dashboardName")
     * // the properties below are optional
     * .projectId("projectId")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-dashboard.html)
     */
    public inline fun cfnDashboardProps(
        block: CfnDashboardPropsDsl.() -> Unit = {}
    ): CfnDashboardProps {
        val builder = CfnDashboardPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a gateway, which is a virtual or edge device that delivers industrial data streams
     * from local servers to AWS IoT SiteWise .
     *
     * For more information, see
     * [Ingesting data using a gateway](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/gateway-connector.html)
     * in the *AWS IoT SiteWise User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotsitewise.*;
     * CfnGateway cfnGateway = CfnGateway.Builder.create(this, "MyCfnGateway")
     * .gatewayName("gatewayName")
     * .gatewayPlatform(GatewayPlatformProperty.builder()
     * .greengrass(GreengrassProperty.builder()
     * .groupArn("groupArn")
     * .build())
     * .greengrassV2(GreengrassV2Property.builder()
     * .coreDeviceThingName("coreDeviceThingName")
     * .build())
     * .build())
     * // the properties below are optional
     * .gatewayCapabilitySummaries(List.of(GatewayCapabilitySummaryProperty.builder()
     * .capabilityNamespace("capabilityNamespace")
     * // the properties below are optional
     * .capabilityConfiguration("capabilityConfiguration")
     * .build()))
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-gateway.html)
     */
    public inline fun cfnGateway(
        scope: Construct,
        id: String,
        block: CfnGatewayDsl.() -> Unit = {},
    ): CfnGateway {
        val builder = CfnGatewayDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Contains a summary of a gateway capability configuration.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotsitewise.*;
     * GatewayCapabilitySummaryProperty gatewayCapabilitySummaryProperty =
     * GatewayCapabilitySummaryProperty.builder()
     * .capabilityNamespace("capabilityNamespace")
     * // the properties below are optional
     * .capabilityConfiguration("capabilityConfiguration")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-gateway-gatewaycapabilitysummary.html)
     */
    public inline fun cfnGatewayGatewayCapabilitySummaryProperty(
        block: CfnGatewayGatewayCapabilitySummaryPropertyDsl.() -> Unit = {}
    ): CfnGateway.GatewayCapabilitySummaryProperty {
        val builder = CfnGatewayGatewayCapabilitySummaryPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Contains a gateway's platform information.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotsitewise.*;
     * GatewayPlatformProperty gatewayPlatformProperty = GatewayPlatformProperty.builder()
     * .greengrass(GreengrassProperty.builder()
     * .groupArn("groupArn")
     * .build())
     * .greengrassV2(GreengrassV2Property.builder()
     * .coreDeviceThingName("coreDeviceThingName")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-gateway-gatewayplatform.html)
     */
    public inline fun cfnGatewayGatewayPlatformProperty(
        block: CfnGatewayGatewayPlatformPropertyDsl.() -> Unit = {}
    ): CfnGateway.GatewayPlatformProperty {
        val builder = CfnGatewayGatewayPlatformPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Contains details for a gateway that runs on AWS IoT Greengrass .
     *
     * To create a gateway that runs on AWS IoT Greengrass , you must add the IoT SiteWise connector
     * to a Greengrass group and deploy it. Your Greengrass group must also have permissions to
     * upload data to AWS IoT SiteWise . For more information, see
     * [Ingesting data using a gateway](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/gateway-connector.html)
     * in the *AWS IoT SiteWise User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotsitewise.*;
     * GreengrassProperty greengrassProperty = GreengrassProperty.builder()
     * .groupArn("groupArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-gateway-greengrass.html)
     */
    public inline fun cfnGatewayGreengrassProperty(
        block: CfnGatewayGreengrassPropertyDsl.() -> Unit = {}
    ): CfnGateway.GreengrassProperty {
        val builder = CfnGatewayGreengrassPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Contains details for a gateway that runs on AWS IoT Greengrass V2.
     *
     * To create a gateway that runs on AWS IoT Greengrass V2, you must deploy the IoT SiteWise Edge
     * component to your gateway device. Your
     * [Greengrass device role](https://docs.aws.amazon.com/greengrass/v2/developerguide/device-service-role.html)
     * must use the `AWSIoTSiteWiseEdgeAccess` policy. For more information, see
     * [Using AWS IoT SiteWise at the edge](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/sw-gateways.html)
     * in the *AWS IoT SiteWise User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotsitewise.*;
     * GreengrassV2Property greengrassV2Property = GreengrassV2Property.builder()
     * .coreDeviceThingName("coreDeviceThingName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-gateway-greengrassv2.html)
     */
    public inline fun cfnGatewayGreengrassV2Property(
        block: CfnGatewayGreengrassV2PropertyDsl.() -> Unit = {}
    ): CfnGateway.GreengrassV2Property {
        val builder = CfnGatewayGreengrassV2PropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnGateway`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotsitewise.*;
     * CfnGatewayProps cfnGatewayProps = CfnGatewayProps.builder()
     * .gatewayName("gatewayName")
     * .gatewayPlatform(GatewayPlatformProperty.builder()
     * .greengrass(GreengrassProperty.builder()
     * .groupArn("groupArn")
     * .build())
     * .greengrassV2(GreengrassV2Property.builder()
     * .coreDeviceThingName("coreDeviceThingName")
     * .build())
     * .build())
     * // the properties below are optional
     * .gatewayCapabilitySummaries(List.of(GatewayCapabilitySummaryProperty.builder()
     * .capabilityNamespace("capabilityNamespace")
     * // the properties below are optional
     * .capabilityConfiguration("capabilityConfiguration")
     * .build()))
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-gateway.html)
     */
    public inline fun cfnGatewayProps(block: CfnGatewayPropsDsl.() -> Unit = {}): CfnGatewayProps {
        val builder = CfnGatewayPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a portal, which can contain projects and dashboards.
     *
     * Before you can create a portal, you must enable IAM Identity Center . AWS IoT SiteWise
     * Monitor uses IAM Identity Center to manage user permissions. For more information, see
     * [Enabling IAM Identity Center](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/monitor-get-started.html#mon-gs-sso)
     * in the *AWS IoT SiteWise User Guide* .
     *
     * Before you can sign in to a new portal, you must add at least one IAM Identity Center user or
     * group to that portal. For more information, see
     * [Adding or removing portal administrators](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/administer-portals.html#portal-change-admins)
     * in the *AWS IoT SiteWise User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotsitewise.*;
     * Object alarms;
     * CfnPortal cfnPortal = CfnPortal.Builder.create(this, "MyCfnPortal")
     * .portalContactEmail("portalContactEmail")
     * .portalName("portalName")
     * .roleArn("roleArn")
     * // the properties below are optional
     * .alarms(alarms)
     * .notificationSenderEmail("notificationSenderEmail")
     * .portalAuthMode("portalAuthMode")
     * .portalDescription("portalDescription")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-portal.html)
     */
    public inline fun cfnPortal(
        scope: Construct,
        id: String,
        block: CfnPortalDsl.() -> Unit = {},
    ): CfnPortal {
        val builder = CfnPortalDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Contains the configuration information of an alarm created in an AWS IoT SiteWise Monitor
     * portal.
     *
     * You can use the alarm to monitor an asset property and get notified when the asset property
     * value is outside a specified range. For more information, see
     * [Monitoring with alarms](https://docs.aws.amazon.com/iot-sitewise/latest/appguide/monitor-alarms.html)
     * in the *AWS IoT SiteWise Application Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotsitewise.*;
     * AlarmsProperty alarmsProperty = AlarmsProperty.builder()
     * .alarmRoleArn("alarmRoleArn")
     * .notificationLambdaArn("notificationLambdaArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotsitewise-portal-alarms.html)
     */
    public inline fun cfnPortalAlarmsProperty(
        block: CfnPortalAlarmsPropertyDsl.() -> Unit = {}
    ): CfnPortal.AlarmsProperty {
        val builder = CfnPortalAlarmsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnPortal`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotsitewise.*;
     * Object alarms;
     * CfnPortalProps cfnPortalProps = CfnPortalProps.builder()
     * .portalContactEmail("portalContactEmail")
     * .portalName("portalName")
     * .roleArn("roleArn")
     * // the properties below are optional
     * .alarms(alarms)
     * .notificationSenderEmail("notificationSenderEmail")
     * .portalAuthMode("portalAuthMode")
     * .portalDescription("portalDescription")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-portal.html)
     */
    public inline fun cfnPortalProps(block: CfnPortalPropsDsl.() -> Unit = {}): CfnPortalProps {
        val builder = CfnPortalPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a project in the specified portal.
     *
     * Make sure that the project name and description don't contain confidential information.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotsitewise.*;
     * CfnProject cfnProject = CfnProject.Builder.create(this, "MyCfnProject")
     * .portalId("portalId")
     * .projectName("projectName")
     * // the properties below are optional
     * .assetIds(List.of("assetIds"))
     * .projectDescription("projectDescription")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-project.html)
     */
    public inline fun cfnProject(
        scope: Construct,
        id: String,
        block: CfnProjectDsl.() -> Unit = {},
    ): CfnProject {
        val builder = CfnProjectDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnProject`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotsitewise.*;
     * CfnProjectProps cfnProjectProps = CfnProjectProps.builder()
     * .portalId("portalId")
     * .projectName("projectName")
     * // the properties below are optional
     * .assetIds(List.of("assetIds"))
     * .projectDescription("projectDescription")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-project.html)
     */
    public inline fun cfnProjectProps(block: CfnProjectPropsDsl.() -> Unit = {}): CfnProjectProps {
        val builder = CfnProjectPropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
