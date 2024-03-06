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

package io.cloudshiftdev.awscdkdsl.services.greengrass

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.greengrass.CfnConnectorDefinition
import software.amazon.awscdk.services.greengrass.CfnConnectorDefinitionProps
import software.amazon.awscdk.services.greengrass.CfnConnectorDefinitionVersion
import software.amazon.awscdk.services.greengrass.CfnConnectorDefinitionVersionProps
import software.amazon.awscdk.services.greengrass.CfnCoreDefinition
import software.amazon.awscdk.services.greengrass.CfnCoreDefinitionProps
import software.amazon.awscdk.services.greengrass.CfnCoreDefinitionVersion
import software.amazon.awscdk.services.greengrass.CfnCoreDefinitionVersionProps
import software.amazon.awscdk.services.greengrass.CfnDeviceDefinition
import software.amazon.awscdk.services.greengrass.CfnDeviceDefinitionProps
import software.amazon.awscdk.services.greengrass.CfnDeviceDefinitionVersion
import software.amazon.awscdk.services.greengrass.CfnDeviceDefinitionVersionProps
import software.amazon.awscdk.services.greengrass.CfnFunctionDefinition
import software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionProps
import software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion
import software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersionProps
import software.amazon.awscdk.services.greengrass.CfnGroup
import software.amazon.awscdk.services.greengrass.CfnGroupProps
import software.amazon.awscdk.services.greengrass.CfnGroupVersion
import software.amazon.awscdk.services.greengrass.CfnGroupVersionProps
import software.amazon.awscdk.services.greengrass.CfnLoggerDefinition
import software.amazon.awscdk.services.greengrass.CfnLoggerDefinitionProps
import software.amazon.awscdk.services.greengrass.CfnLoggerDefinitionVersion
import software.amazon.awscdk.services.greengrass.CfnLoggerDefinitionVersionProps
import software.amazon.awscdk.services.greengrass.CfnResourceDefinition
import software.amazon.awscdk.services.greengrass.CfnResourceDefinitionProps
import software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion
import software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersionProps
import software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinition
import software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinitionProps
import software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinitionVersion
import software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinitionVersionProps
import software.constructs.Construct

public object greengrass {
    /**
     * The `AWS::Greengrass::ConnectorDefinition` resource represents a connector definition for AWS
     * IoT Greengrass .
     *
     * Connector definitions are used to organize your connector definition versions.
     *
     * Connector definitions can reference multiple connector definition versions. All connector
     * definition versions must be associated with a connector definition. Each connector definition
     * version can contain one or more connectors.
     *
     * When you create a connector definition, you can optionally include an initial connector
     * definition version. To associate a connector definition version later, create an
     * [`AWS::Greengrass::ConnectorDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-connectordefinitionversion.html)
     * resource and specify the ID of this connector definition.
     *
     * After you create the connector definition version that contains the connectors you want to
     * deploy, you must add it to your group version. For more information, see
     * [`AWS::Greengrass::Group`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-group.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.greengrass.*;
     * Object parameters;
     * Object tags;
     * CfnConnectorDefinition cfnConnectorDefinition = CfnConnectorDefinition.Builder.create(this,
     * "MyCfnConnectorDefinition")
     * .name("name")
     * // the properties below are optional
     * .initialVersion(ConnectorDefinitionVersionProperty.builder()
     * .connectors(List.of(ConnectorProperty.builder()
     * .connectorArn("connectorArn")
     * .id("id")
     * // the properties below are optional
     * .parameters(parameters)
     * .build()))
     * .build())
     * .tags(tags)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-connectordefinition.html)
     */
    public inline fun cfnConnectorDefinition(
        scope: Construct,
        id: String,
        block: CfnConnectorDefinitionDsl.() -> Unit = {},
    ): CfnConnectorDefinition {
        val builder = CfnConnectorDefinitionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * A connector definition version contains a list of connectors.
     *
     * After you create a connector definition version that contains the connectors you want to
     * deploy, you must add it to your group version. For more information, see
     * [`AWS::Greengrass::Group`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-group.html)
     * .
     *
     * In an AWS CloudFormation template, `ConnectorDefinitionVersion` is the property type of the
     * `InitialVersion` property in the
     * [`AWS::Greengrass::ConnectorDefinition`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-connectordefinition.html)
     * resource.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.greengrass.*;
     * Object parameters;
     * ConnectorDefinitionVersionProperty connectorDefinitionVersionProperty =
     * ConnectorDefinitionVersionProperty.builder()
     * .connectors(List.of(ConnectorProperty.builder()
     * .connectorArn("connectorArn")
     * .id("id")
     * // the properties below are optional
     * .parameters(parameters)
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-connectordefinition-connectordefinitionversion.html)
     */
    public inline fun cfnConnectorDefinitionConnectorDefinitionVersionProperty(
        block: CfnConnectorDefinitionConnectorDefinitionVersionPropertyDsl.() -> Unit = {}
    ): CfnConnectorDefinition.ConnectorDefinitionVersionProperty {
        val builder = CfnConnectorDefinitionConnectorDefinitionVersionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Connectors are modules that provide built-in integration with local infrastructure, device
     * protocols, AWS , and other cloud services.
     *
     * For more information, see
     * [Integrate with Services and Protocols Using Greengrass Connectors](https://docs.aws.amazon.com/greengrass/v1/developerguide/connectors.html)
     * in the *Developer Guide* .
     *
     * In an AWS CloudFormation template, the `Connectors` property of the
     * [`ConnectorDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-connectordefinition-connectordefinitionversion.html)
     * property type contains a list of `Connector` property types.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.greengrass.*;
     * Object parameters;
     * ConnectorProperty connectorProperty = ConnectorProperty.builder()
     * .connectorArn("connectorArn")
     * .id("id")
     * // the properties below are optional
     * .parameters(parameters)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-connectordefinition-connector.html)
     */
    public inline fun cfnConnectorDefinitionConnectorProperty(
        block: CfnConnectorDefinitionConnectorPropertyDsl.() -> Unit = {}
    ): CfnConnectorDefinition.ConnectorProperty {
        val builder = CfnConnectorDefinitionConnectorPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnConnectorDefinition`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.greengrass.*;
     * Object parameters;
     * Object tags;
     * CfnConnectorDefinitionProps cfnConnectorDefinitionProps = CfnConnectorDefinitionProps.builder()
     * .name("name")
     * // the properties below are optional
     * .initialVersion(ConnectorDefinitionVersionProperty.builder()
     * .connectors(List.of(ConnectorProperty.builder()
     * .connectorArn("connectorArn")
     * .id("id")
     * // the properties below are optional
     * .parameters(parameters)
     * .build()))
     * .build())
     * .tags(tags)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-connectordefinition.html)
     */
    public inline fun cfnConnectorDefinitionProps(
        block: CfnConnectorDefinitionPropsDsl.() -> Unit = {}
    ): CfnConnectorDefinitionProps {
        val builder = CfnConnectorDefinitionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::Greengrass::ConnectorDefinitionVersion` resource represents a connector definition
     * version for AWS IoT Greengrass .
     *
     * A connector definition version contains a list of connectors.
     *
     * To create a connector definition version, you must specify the ID of the connector definition
     * that you want to associate with the version. For information about creating a connector
     * definition, see
     * [`AWS::Greengrass::ConnectorDefinition`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-connectordefinition.html)
     * .
     *
     * After you create a connector definition version that contains the connectors you want to
     * deploy, you must add it to your group version. For more information, see
     * [`AWS::Greengrass::Group`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-group.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.greengrass.*;
     * Object parameters;
     * CfnConnectorDefinitionVersion cfnConnectorDefinitionVersion =
     * CfnConnectorDefinitionVersion.Builder.create(this, "MyCfnConnectorDefinitionVersion")
     * .connectorDefinitionId("connectorDefinitionId")
     * .connectors(List.of(ConnectorProperty.builder()
     * .connectorArn("connectorArn")
     * .id("id")
     * // the properties below are optional
     * .parameters(parameters)
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-connectordefinitionversion.html)
     */
    public inline fun cfnConnectorDefinitionVersion(
        scope: Construct,
        id: String,
        block: CfnConnectorDefinitionVersionDsl.() -> Unit = {},
    ): CfnConnectorDefinitionVersion {
        val builder = CfnConnectorDefinitionVersionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Connectors are modules that provide built-in integration with local infrastructure, device
     * protocols, AWS , and other cloud services.
     *
     * For more information, see
     * [Integrate with Services and Protocols Using Greengrass Connectors](https://docs.aws.amazon.com/greengrass/v1/developerguide/connectors.html)
     * in the *Developer Guide* .
     *
     * In an AWS CloudFormation template, the `Connectors` property of the
     * [`AWS::Greengrass::ConnectorDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-connectordefinitionversion.html)
     * resource contains a list of `Connector` property types.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.greengrass.*;
     * Object parameters;
     * ConnectorProperty connectorProperty = ConnectorProperty.builder()
     * .connectorArn("connectorArn")
     * .id("id")
     * // the properties below are optional
     * .parameters(parameters)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-connectordefinitionversion-connector.html)
     */
    public inline fun cfnConnectorDefinitionVersionConnectorProperty(
        block: CfnConnectorDefinitionVersionConnectorPropertyDsl.() -> Unit = {}
    ): CfnConnectorDefinitionVersion.ConnectorProperty {
        val builder = CfnConnectorDefinitionVersionConnectorPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnConnectorDefinitionVersion`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.greengrass.*;
     * Object parameters;
     * CfnConnectorDefinitionVersionProps cfnConnectorDefinitionVersionProps =
     * CfnConnectorDefinitionVersionProps.builder()
     * .connectorDefinitionId("connectorDefinitionId")
     * .connectors(List.of(ConnectorProperty.builder()
     * .connectorArn("connectorArn")
     * .id("id")
     * // the properties below are optional
     * .parameters(parameters)
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-connectordefinitionversion.html)
     */
    public inline fun cfnConnectorDefinitionVersionProps(
        block: CfnConnectorDefinitionVersionPropsDsl.() -> Unit = {}
    ): CfnConnectorDefinitionVersionProps {
        val builder = CfnConnectorDefinitionVersionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::Greengrass::CoreDefinition` resource represents a core definition for AWS IoT
     * Greengrass .
     *
     * Core definitions are used to organize your core definition versions.
     *
     * Core definitions can reference multiple core definition versions. All core definition
     * versions must be associated with a core definition. Each core definition version can contain
     * one Greengrass core.
     *
     * When you create a core definition, you can optionally include an initial core definition
     * version. To associate a core definition version later, create an
     * [`AWS::Greengrass::CoreDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-coredefinitionversion.html)
     * resource and specify the ID of this core definition.
     *
     * After you create the core definition version that contains the core you want to deploy, you
     * must add it to your group version. For more information, see
     * [`AWS::Greengrass::Group`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-group.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.greengrass.*;
     * Object tags;
     * CfnCoreDefinition cfnCoreDefinition = CfnCoreDefinition.Builder.create(this,
     * "MyCfnCoreDefinition")
     * .name("name")
     * // the properties below are optional
     * .initialVersion(CoreDefinitionVersionProperty.builder()
     * .cores(List.of(CoreProperty.builder()
     * .certificateArn("certificateArn")
     * .id("id")
     * .thingArn("thingArn")
     * // the properties below are optional
     * .syncShadow(false)
     * .build()))
     * .build())
     * .tags(tags)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-coredefinition.html)
     */
    public inline fun cfnCoreDefinition(
        scope: Construct,
        id: String,
        block: CfnCoreDefinitionDsl.() -> Unit = {},
    ): CfnCoreDefinition {
        val builder = CfnCoreDefinitionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * A core definition version contains a Greengrass
     * [core](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-coredefinition-core.html)
     * .
     *
     * After you create a core definition version that contains the core you want to deploy, you
     * must add it to your group version. For more information, see
     * [`AWS::Greengrass::Group`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-group.html)
     * .
     *
     * In an AWS CloudFormation template, `CoreDefinitionVersion` is the property type of the
     * `InitialVersion` property in the
     * [`AWS::Greengrass::CoreDefinition`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-coredefinition.html)
     * resource.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.greengrass.*;
     * CoreDefinitionVersionProperty coreDefinitionVersionProperty =
     * CoreDefinitionVersionProperty.builder()
     * .cores(List.of(CoreProperty.builder()
     * .certificateArn("certificateArn")
     * .id("id")
     * .thingArn("thingArn")
     * // the properties below are optional
     * .syncShadow(false)
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-coredefinition-coredefinitionversion.html)
     */
    public inline fun cfnCoreDefinitionCoreDefinitionVersionProperty(
        block: CfnCoreDefinitionCoreDefinitionVersionPropertyDsl.() -> Unit = {}
    ): CfnCoreDefinition.CoreDefinitionVersionProperty {
        val builder = CfnCoreDefinitionCoreDefinitionVersionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A core is an AWS IoT device that runs the AWS IoT Greengrass core software and manages local
     * processes for a Greengrass group.
     *
     * For more information, see
     * [What Is AWS IoT Greengrass ?](https://docs.aws.amazon.com/greengrass/v1/developerguide/what-is-gg.html)
     * in the *Developer Guide* .
     *
     * In an AWS CloudFormation template, the `Cores` property of the
     * [`CoreDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-coredefinition-coredefinitionversion.html)
     * property type contains a list of `Core` property types. Currently, the list can contain only
     * one core.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.greengrass.*;
     * CoreProperty coreProperty = CoreProperty.builder()
     * .certificateArn("certificateArn")
     * .id("id")
     * .thingArn("thingArn")
     * // the properties below are optional
     * .syncShadow(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-coredefinition-core.html)
     */
    public inline fun cfnCoreDefinitionCoreProperty(
        block: CfnCoreDefinitionCorePropertyDsl.() -> Unit = {}
    ): CfnCoreDefinition.CoreProperty {
        val builder = CfnCoreDefinitionCorePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnCoreDefinition`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.greengrass.*;
     * Object tags;
     * CfnCoreDefinitionProps cfnCoreDefinitionProps = CfnCoreDefinitionProps.builder()
     * .name("name")
     * // the properties below are optional
     * .initialVersion(CoreDefinitionVersionProperty.builder()
     * .cores(List.of(CoreProperty.builder()
     * .certificateArn("certificateArn")
     * .id("id")
     * .thingArn("thingArn")
     * // the properties below are optional
     * .syncShadow(false)
     * .build()))
     * .build())
     * .tags(tags)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-coredefinition.html)
     */
    public inline fun cfnCoreDefinitionProps(
        block: CfnCoreDefinitionPropsDsl.() -> Unit = {}
    ): CfnCoreDefinitionProps {
        val builder = CfnCoreDefinitionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::Greengrass::CoreDefinitionVersion` resource represents a core definition version
     * for AWS IoT Greengrass .
     *
     * A core definition version contains a Greengrass core.
     *
     * To create a core definition version, you must specify the ID of the core definition that you
     * want to associate with the version. For information about creating a core definition, see
     * [`AWS::Greengrass::CoreDefinition`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-coredefinition.html)
     * .
     *
     * After you create a core definition version that contains the core you want to deploy, you
     * must add it to your group version. For more information, see
     * [`AWS::Greengrass::Group`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-group.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.greengrass.*;
     * CfnCoreDefinitionVersion cfnCoreDefinitionVersion =
     * CfnCoreDefinitionVersion.Builder.create(this, "MyCfnCoreDefinitionVersion")
     * .coreDefinitionId("coreDefinitionId")
     * .cores(List.of(CoreProperty.builder()
     * .certificateArn("certificateArn")
     * .id("id")
     * .thingArn("thingArn")
     * // the properties below are optional
     * .syncShadow(false)
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-coredefinitionversion.html)
     */
    public inline fun cfnCoreDefinitionVersion(
        scope: Construct,
        id: String,
        block: CfnCoreDefinitionVersionDsl.() -> Unit = {},
    ): CfnCoreDefinitionVersion {
        val builder = CfnCoreDefinitionVersionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * A core is an AWS IoT device that runs the AWS IoT Greengrass core software and manages local
     * processes for a Greengrass group.
     *
     * For more information, see
     * [What Is AWS IoT Greengrass ?](https://docs.aws.amazon.com/greengrass/v1/developerguide/what-is-gg.html)
     * in the *Developer Guide* .
     *
     * In an AWS CloudFormation template, the `Cores` property of the
     * [`AWS::Greengrass::CoreDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-coredefinitionversion.html)
     * resource contains a list of `Core` property types. Currently, the list can contain only one
     * core.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.greengrass.*;
     * CoreProperty coreProperty = CoreProperty.builder()
     * .certificateArn("certificateArn")
     * .id("id")
     * .thingArn("thingArn")
     * // the properties below are optional
     * .syncShadow(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-coredefinitionversion-core.html)
     */
    public inline fun cfnCoreDefinitionVersionCoreProperty(
        block: CfnCoreDefinitionVersionCorePropertyDsl.() -> Unit = {}
    ): CfnCoreDefinitionVersion.CoreProperty {
        val builder = CfnCoreDefinitionVersionCorePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnCoreDefinitionVersion`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.greengrass.*;
     * CfnCoreDefinitionVersionProps cfnCoreDefinitionVersionProps =
     * CfnCoreDefinitionVersionProps.builder()
     * .coreDefinitionId("coreDefinitionId")
     * .cores(List.of(CoreProperty.builder()
     * .certificateArn("certificateArn")
     * .id("id")
     * .thingArn("thingArn")
     * // the properties below are optional
     * .syncShadow(false)
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-coredefinitionversion.html)
     */
    public inline fun cfnCoreDefinitionVersionProps(
        block: CfnCoreDefinitionVersionPropsDsl.() -> Unit = {}
    ): CfnCoreDefinitionVersionProps {
        val builder = CfnCoreDefinitionVersionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::Greengrass::DeviceDefinition` resource represents a device definition for AWS IoT
     * Greengrass .
     *
     * Device definitions are used to organize your device definition versions.
     *
     * Device definitions can reference multiple device definition versions. All device definition
     * versions must be associated with a device definition. Each device definition version can
     * contain one or more devices.
     *
     * When you create a device definition, you can optionally include an initial device definition
     * version. To associate a device definition version later, create an
     * [`AWS::Greengrass::DeviceDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-devicedefinitionversion.html)
     * resource and specify the ID of this device definition.
     *
     * After you create the device definition version that contains the devices you want to deploy,
     * you must add it to your group version. For more information, see
     * [`AWS::Greengrass::Group`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-group.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.greengrass.*;
     * Object tags;
     * CfnDeviceDefinition cfnDeviceDefinition = CfnDeviceDefinition.Builder.create(this,
     * "MyCfnDeviceDefinition")
     * .name("name")
     * // the properties below are optional
     * .initialVersion(DeviceDefinitionVersionProperty.builder()
     * .devices(List.of(DeviceProperty.builder()
     * .certificateArn("certificateArn")
     * .id("id")
     * .thingArn("thingArn")
     * // the properties below are optional
     * .syncShadow(false)
     * .build()))
     * .build())
     * .tags(tags)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-devicedefinition.html)
     */
    public inline fun cfnDeviceDefinition(
        scope: Construct,
        id: String,
        block: CfnDeviceDefinitionDsl.() -> Unit = {},
    ): CfnDeviceDefinition {
        val builder = CfnDeviceDefinitionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * A device definition version contains a list of
     * [devices](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-devicedefinition-device.html)
     * .
     *
     * After you create a device definition version that contains the devices you want to deploy,
     * you must add it to your group version. For more information, see
     * [`AWS::Greengrass::Group`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-group.html)
     * .
     *
     * In an AWS CloudFormation template, `DeviceDefinitionVersion` is the property type of the
     * `InitialVersion` property in the
     * [`AWS::Greengrass::DeviceDefinition`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-devicedefinition.html)
     * resource.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.greengrass.*;
     * DeviceDefinitionVersionProperty deviceDefinitionVersionProperty =
     * DeviceDefinitionVersionProperty.builder()
     * .devices(List.of(DeviceProperty.builder()
     * .certificateArn("certificateArn")
     * .id("id")
     * .thingArn("thingArn")
     * // the properties below are optional
     * .syncShadow(false)
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-devicedefinition-devicedefinitionversion.html)
     */
    public inline fun cfnDeviceDefinitionDeviceDefinitionVersionProperty(
        block: CfnDeviceDefinitionDeviceDefinitionVersionPropertyDsl.() -> Unit = {}
    ): CfnDeviceDefinition.DeviceDefinitionVersionProperty {
        val builder = CfnDeviceDefinitionDeviceDefinitionVersionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A device is an AWS IoT device (thing) that's added to a Greengrass group.
     *
     * Greengrass devices can communicate with the Greengrass core in the same group. For more
     * information, see
     * [What Is AWS IoT Greengrass ?](https://docs.aws.amazon.com/greengrass/v1/developerguide/what-is-gg.html)
     * in the *Developer Guide* .
     *
     * In an AWS CloudFormation template, the `Devices` property of the
     * [`DeviceDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-devicedefinition-devicedefinitionversion.html)
     * property type contains a list of `Device` property types.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.greengrass.*;
     * DeviceProperty deviceProperty = DeviceProperty.builder()
     * .certificateArn("certificateArn")
     * .id("id")
     * .thingArn("thingArn")
     * // the properties below are optional
     * .syncShadow(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-devicedefinition-device.html)
     */
    public inline fun cfnDeviceDefinitionDeviceProperty(
        block: CfnDeviceDefinitionDevicePropertyDsl.() -> Unit = {}
    ): CfnDeviceDefinition.DeviceProperty {
        val builder = CfnDeviceDefinitionDevicePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnDeviceDefinition`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.greengrass.*;
     * Object tags;
     * CfnDeviceDefinitionProps cfnDeviceDefinitionProps = CfnDeviceDefinitionProps.builder()
     * .name("name")
     * // the properties below are optional
     * .initialVersion(DeviceDefinitionVersionProperty.builder()
     * .devices(List.of(DeviceProperty.builder()
     * .certificateArn("certificateArn")
     * .id("id")
     * .thingArn("thingArn")
     * // the properties below are optional
     * .syncShadow(false)
     * .build()))
     * .build())
     * .tags(tags)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-devicedefinition.html)
     */
    public inline fun cfnDeviceDefinitionProps(
        block: CfnDeviceDefinitionPropsDsl.() -> Unit = {}
    ): CfnDeviceDefinitionProps {
        val builder = CfnDeviceDefinitionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::Greengrass::DeviceDefinitionVersion` resource represents a device definition
     * version for AWS IoT Greengrass .
     *
     * A device definition version contains a list of devices.
     *
     * To create a device definition version, you must specify the ID of the device definition that
     * you want to associate with the version. For information about creating a device definition,
     * see
     * [`AWS::Greengrass::DeviceDefinition`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-devicedefinition.html)
     * .
     *
     * After you create a device definition version that contains the devices you want to deploy,
     * you must add it to your group version. For more information, see
     * [`AWS::Greengrass::Group`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-group.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.greengrass.*;
     * CfnDeviceDefinitionVersion cfnDeviceDefinitionVersion =
     * CfnDeviceDefinitionVersion.Builder.create(this, "MyCfnDeviceDefinitionVersion")
     * .deviceDefinitionId("deviceDefinitionId")
     * .devices(List.of(DeviceProperty.builder()
     * .certificateArn("certificateArn")
     * .id("id")
     * .thingArn("thingArn")
     * // the properties below are optional
     * .syncShadow(false)
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-devicedefinitionversion.html)
     */
    public inline fun cfnDeviceDefinitionVersion(
        scope: Construct,
        id: String,
        block: CfnDeviceDefinitionVersionDsl.() -> Unit = {},
    ): CfnDeviceDefinitionVersion {
        val builder = CfnDeviceDefinitionVersionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * A device is an AWS IoT device (thing) that's added to a Greengrass group.
     *
     * Greengrass devices can communicate with the Greengrass core in the same group. For more
     * information, see
     * [What Is AWS IoT Greengrass ?](https://docs.aws.amazon.com/greengrass/v1/developerguide/what-is-gg.html)
     * in the *Developer Guide* .
     *
     * In an AWS CloudFormation template, the `Devices` property of the
     * [`AWS::Greengrass::DeviceDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-devicedefinitionversion.html)
     * resource contains a list of `Device` property types.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.greengrass.*;
     * DeviceProperty deviceProperty = DeviceProperty.builder()
     * .certificateArn("certificateArn")
     * .id("id")
     * .thingArn("thingArn")
     * // the properties below are optional
     * .syncShadow(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-devicedefinitionversion-device.html)
     */
    public inline fun cfnDeviceDefinitionVersionDeviceProperty(
        block: CfnDeviceDefinitionVersionDevicePropertyDsl.() -> Unit = {}
    ): CfnDeviceDefinitionVersion.DeviceProperty {
        val builder = CfnDeviceDefinitionVersionDevicePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnDeviceDefinitionVersion`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.greengrass.*;
     * CfnDeviceDefinitionVersionProps cfnDeviceDefinitionVersionProps =
     * CfnDeviceDefinitionVersionProps.builder()
     * .deviceDefinitionId("deviceDefinitionId")
     * .devices(List.of(DeviceProperty.builder()
     * .certificateArn("certificateArn")
     * .id("id")
     * .thingArn("thingArn")
     * // the properties below are optional
     * .syncShadow(false)
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-devicedefinitionversion.html)
     */
    public inline fun cfnDeviceDefinitionVersionProps(
        block: CfnDeviceDefinitionVersionPropsDsl.() -> Unit = {}
    ): CfnDeviceDefinitionVersionProps {
        val builder = CfnDeviceDefinitionVersionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::Greengrass::FunctionDefinition` resource represents a function definition for AWS
     * IoT Greengrass .
     *
     * Function definitions are used to organize your function definition versions.
     *
     * Function definitions can reference multiple function definition versions. All function
     * definition versions must be associated with a function definition. Each function definition
     * version can contain one or more functions.
     *
     * When you create a function definition, you can optionally include an initial function
     * definition version. To associate a function definition version later, create an
     * [`AWS::Greengrass::FunctionDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-functiondefinitionversion.html)
     * resource and specify the ID of this function definition.
     *
     * After you create the function definition version that contains the functions you want to
     * deploy, you must add it to your group version. For more information, see
     * [`AWS::Greengrass::Group`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-group.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.greengrass.*;
     * Object tags;
     * Object variables;
     * CfnFunctionDefinition cfnFunctionDefinition = CfnFunctionDefinition.Builder.create(this,
     * "MyCfnFunctionDefinition")
     * .name("name")
     * // the properties below are optional
     * .initialVersion(FunctionDefinitionVersionProperty.builder()
     * .functions(List.of(FunctionProperty.builder()
     * .functionArn("functionArn")
     * .functionConfiguration(FunctionConfigurationProperty.builder()
     * .encodingType("encodingType")
     * .environment(EnvironmentProperty.builder()
     * .accessSysfs(false)
     * .execution(ExecutionProperty.builder()
     * .isolationMode("isolationMode")
     * .runAs(RunAsProperty.builder()
     * .gid(123)
     * .uid(123)
     * .build())
     * .build())
     * .resourceAccessPolicies(List.of(ResourceAccessPolicyProperty.builder()
     * .resourceId("resourceId")
     * // the properties below are optional
     * .permission("permission")
     * .build()))
     * .variables(variables)
     * .build())
     * .execArgs("execArgs")
     * .executable("executable")
     * .memorySize(123)
     * .pinned(false)
     * .timeout(123)
     * .build())
     * .id("id")
     * .build()))
     * // the properties below are optional
     * .defaultConfig(DefaultConfigProperty.builder()
     * .execution(ExecutionProperty.builder()
     * .isolationMode("isolationMode")
     * .runAs(RunAsProperty.builder()
     * .gid(123)
     * .uid(123)
     * .build())
     * .build())
     * .build())
     * .build())
     * .tags(tags)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-functiondefinition.html)
     */
    public inline fun cfnFunctionDefinition(
        scope: Construct,
        id: String,
        block: CfnFunctionDefinitionDsl.() -> Unit = {},
    ): CfnFunctionDefinition {
        val builder = CfnFunctionDefinitionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The default configuration that applies to all Lambda functions in the function definition
     * version.
     *
     * Individual Lambda functions can override these settings.
     *
     * In an AWS CloudFormation template, `DefaultConfig` is a property of the
     * [`FunctionDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-functiondefinitionversion.html)
     * property type.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.greengrass.*;
     * DefaultConfigProperty defaultConfigProperty = DefaultConfigProperty.builder()
     * .execution(ExecutionProperty.builder()
     * .isolationMode("isolationMode")
     * .runAs(RunAsProperty.builder()
     * .gid(123)
     * .uid(123)
     * .build())
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-defaultconfig.html)
     */
    public inline fun cfnFunctionDefinitionDefaultConfigProperty(
        block: CfnFunctionDefinitionDefaultConfigPropertyDsl.() -> Unit = {}
    ): CfnFunctionDefinition.DefaultConfigProperty {
        val builder = CfnFunctionDefinitionDefaultConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The environment configuration for a Lambda function on the AWS IoT Greengrass core.
     *
     * In an AWS CloudFormation template, `Environment` is a property of the
     * [`FunctionConfiguration`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-functionconfiguration.html)
     * property type.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.greengrass.*;
     * Object variables;
     * EnvironmentProperty environmentProperty = EnvironmentProperty.builder()
     * .accessSysfs(false)
     * .execution(ExecutionProperty.builder()
     * .isolationMode("isolationMode")
     * .runAs(RunAsProperty.builder()
     * .gid(123)
     * .uid(123)
     * .build())
     * .build())
     * .resourceAccessPolicies(List.of(ResourceAccessPolicyProperty.builder()
     * .resourceId("resourceId")
     * // the properties below are optional
     * .permission("permission")
     * .build()))
     * .variables(variables)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-environment.html)
     */
    public inline fun cfnFunctionDefinitionEnvironmentProperty(
        block: CfnFunctionDefinitionEnvironmentPropertyDsl.() -> Unit = {}
    ): CfnFunctionDefinition.EnvironmentProperty {
        val builder = CfnFunctionDefinitionEnvironmentPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configuration settings for the Lambda execution environment on the AWS IoT Greengrass core.
     *
     * In an AWS CloudFormation template, `Execution` is a property of the
     * [`DefaultConfig`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-defaultconfig.html)
     * property type for a function definition version and the
     * [`Environment`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-environment.html)
     * property type for a function.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.greengrass.*;
     * ExecutionProperty executionProperty = ExecutionProperty.builder()
     * .isolationMode("isolationMode")
     * .runAs(RunAsProperty.builder()
     * .gid(123)
     * .uid(123)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-execution.html)
     */
    public inline fun cfnFunctionDefinitionExecutionProperty(
        block: CfnFunctionDefinitionExecutionPropertyDsl.() -> Unit = {}
    ): CfnFunctionDefinition.ExecutionProperty {
        val builder = CfnFunctionDefinitionExecutionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The group-specific configuration settings for a Lambda function.
     *
     * These settings configure the function's behavior in the Greengrass group. For more
     * information, see
     * [Controlling Execution of Greengrass Lambda Functions by Using Group-Specific Configuration](https://docs.aws.amazon.com/greengrass/v1/developerguide/lambda-group-config.html)
     * in the *Developer Guide* .
     *
     * In an AWS CloudFormation template, `FunctionConfiguration` is a property of the
     * [`Function`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-function.html)
     * property type.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.greengrass.*;
     * Object variables;
     * FunctionConfigurationProperty functionConfigurationProperty =
     * FunctionConfigurationProperty.builder()
     * .encodingType("encodingType")
     * .environment(EnvironmentProperty.builder()
     * .accessSysfs(false)
     * .execution(ExecutionProperty.builder()
     * .isolationMode("isolationMode")
     * .runAs(RunAsProperty.builder()
     * .gid(123)
     * .uid(123)
     * .build())
     * .build())
     * .resourceAccessPolicies(List.of(ResourceAccessPolicyProperty.builder()
     * .resourceId("resourceId")
     * // the properties below are optional
     * .permission("permission")
     * .build()))
     * .variables(variables)
     * .build())
     * .execArgs("execArgs")
     * .executable("executable")
     * .memorySize(123)
     * .pinned(false)
     * .timeout(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-functionconfiguration.html)
     */
    public inline fun cfnFunctionDefinitionFunctionConfigurationProperty(
        block: CfnFunctionDefinitionFunctionConfigurationPropertyDsl.() -> Unit = {}
    ): CfnFunctionDefinition.FunctionConfigurationProperty {
        val builder = CfnFunctionDefinitionFunctionConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A function definition version contains a list of functions.
     *
     * After you create a function definition version that contains the functions you want to
     * deploy, you must add it to your group version. For more information, see
     * [`AWS::Greengrass::Group`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-group.html)
     * .
     *
     * In an AWS CloudFormation template, `FunctionDefinitionVersion` is the property type of the
     * `InitialVersion` property in the
     * [`AWS::Greengrass::FunctionDefinition`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-functiondefinition.html)
     * resource.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.greengrass.*;
     * Object variables;
     * FunctionDefinitionVersionProperty functionDefinitionVersionProperty =
     * FunctionDefinitionVersionProperty.builder()
     * .functions(List.of(FunctionProperty.builder()
     * .functionArn("functionArn")
     * .functionConfiguration(FunctionConfigurationProperty.builder()
     * .encodingType("encodingType")
     * .environment(EnvironmentProperty.builder()
     * .accessSysfs(false)
     * .execution(ExecutionProperty.builder()
     * .isolationMode("isolationMode")
     * .runAs(RunAsProperty.builder()
     * .gid(123)
     * .uid(123)
     * .build())
     * .build())
     * .resourceAccessPolicies(List.of(ResourceAccessPolicyProperty.builder()
     * .resourceId("resourceId")
     * // the properties below are optional
     * .permission("permission")
     * .build()))
     * .variables(variables)
     * .build())
     * .execArgs("execArgs")
     * .executable("executable")
     * .memorySize(123)
     * .pinned(false)
     * .timeout(123)
     * .build())
     * .id("id")
     * .build()))
     * // the properties below are optional
     * .defaultConfig(DefaultConfigProperty.builder()
     * .execution(ExecutionProperty.builder()
     * .isolationMode("isolationMode")
     * .runAs(RunAsProperty.builder()
     * .gid(123)
     * .uid(123)
     * .build())
     * .build())
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-functiondefinitionversion.html)
     */
    public inline fun cfnFunctionDefinitionFunctionDefinitionVersionProperty(
        block: CfnFunctionDefinitionFunctionDefinitionVersionPropertyDsl.() -> Unit = {}
    ): CfnFunctionDefinition.FunctionDefinitionVersionProperty {
        val builder = CfnFunctionDefinitionFunctionDefinitionVersionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A function is a Lambda function that's referenced from an AWS IoT Greengrass group.
     *
     * The function is deployed to a Greengrass core where it runs locally. For more information,
     * see
     * [Run Lambda Functions on the AWS IoT Greengrass Core](https://docs.aws.amazon.com/greengrass/v1/developerguide/lambda-functions.html)
     * in the *Developer Guide* .
     *
     * In an AWS CloudFormation template, the `Functions` property of the
     * [`FunctionDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-functiondefinitionversion.html)
     * property type contains a list of `Function` property types.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.greengrass.*;
     * Object variables;
     * FunctionProperty functionProperty = FunctionProperty.builder()
     * .functionArn("functionArn")
     * .functionConfiguration(FunctionConfigurationProperty.builder()
     * .encodingType("encodingType")
     * .environment(EnvironmentProperty.builder()
     * .accessSysfs(false)
     * .execution(ExecutionProperty.builder()
     * .isolationMode("isolationMode")
     * .runAs(RunAsProperty.builder()
     * .gid(123)
     * .uid(123)
     * .build())
     * .build())
     * .resourceAccessPolicies(List.of(ResourceAccessPolicyProperty.builder()
     * .resourceId("resourceId")
     * // the properties below are optional
     * .permission("permission")
     * .build()))
     * .variables(variables)
     * .build())
     * .execArgs("execArgs")
     * .executable("executable")
     * .memorySize(123)
     * .pinned(false)
     * .timeout(123)
     * .build())
     * .id("id")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-function.html)
     */
    public inline fun cfnFunctionDefinitionFunctionProperty(
        block: CfnFunctionDefinitionFunctionPropertyDsl.() -> Unit = {}
    ): CfnFunctionDefinition.FunctionProperty {
        val builder = CfnFunctionDefinitionFunctionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnFunctionDefinition`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.greengrass.*;
     * Object tags;
     * Object variables;
     * CfnFunctionDefinitionProps cfnFunctionDefinitionProps = CfnFunctionDefinitionProps.builder()
     * .name("name")
     * // the properties below are optional
     * .initialVersion(FunctionDefinitionVersionProperty.builder()
     * .functions(List.of(FunctionProperty.builder()
     * .functionArn("functionArn")
     * .functionConfiguration(FunctionConfigurationProperty.builder()
     * .encodingType("encodingType")
     * .environment(EnvironmentProperty.builder()
     * .accessSysfs(false)
     * .execution(ExecutionProperty.builder()
     * .isolationMode("isolationMode")
     * .runAs(RunAsProperty.builder()
     * .gid(123)
     * .uid(123)
     * .build())
     * .build())
     * .resourceAccessPolicies(List.of(ResourceAccessPolicyProperty.builder()
     * .resourceId("resourceId")
     * // the properties below are optional
     * .permission("permission")
     * .build()))
     * .variables(variables)
     * .build())
     * .execArgs("execArgs")
     * .executable("executable")
     * .memorySize(123)
     * .pinned(false)
     * .timeout(123)
     * .build())
     * .id("id")
     * .build()))
     * // the properties below are optional
     * .defaultConfig(DefaultConfigProperty.builder()
     * .execution(ExecutionProperty.builder()
     * .isolationMode("isolationMode")
     * .runAs(RunAsProperty.builder()
     * .gid(123)
     * .uid(123)
     * .build())
     * .build())
     * .build())
     * .build())
     * .tags(tags)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-functiondefinition.html)
     */
    public inline fun cfnFunctionDefinitionProps(
        block: CfnFunctionDefinitionPropsDsl.() -> Unit = {}
    ): CfnFunctionDefinitionProps {
        val builder = CfnFunctionDefinitionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A list of the
     * [resources](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-resourceinstance.html)
     * in the group that the function can access, with the corresponding read-only or read-write
     * permissions. The maximum is 10 resources.
     *
     * This property applies only to Lambda functions that run in a Greengrass container.
     *
     * In an AWS CloudFormation template, `ResourceAccessPolicy` is a property of the
     * [`Environment`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-environment.html)
     * property type.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.greengrass.*;
     * ResourceAccessPolicyProperty resourceAccessPolicyProperty =
     * ResourceAccessPolicyProperty.builder()
     * .resourceId("resourceId")
     * // the properties below are optional
     * .permission("permission")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-resourceaccesspolicy.html)
     */
    public inline fun cfnFunctionDefinitionResourceAccessPolicyProperty(
        block: CfnFunctionDefinitionResourceAccessPolicyPropertyDsl.() -> Unit = {}
    ): CfnFunctionDefinition.ResourceAccessPolicyProperty {
        val builder = CfnFunctionDefinitionResourceAccessPolicyPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The access identity whose permissions are used to run the Lambda function.
     *
     * This setting overrides the default access identity that's specified for the group (by
     * default, ggc_user and ggc_group). You can override the user, group, or both. For more
     * information, see
     * [Run as](https://docs.aws.amazon.com/greengrass/v1/developerguide/lambda-group-config.html#lambda-access-identity.html)
     * in the *Developer Guide* .
     *
     * Running as the root user increases risks to your data and device. Do not run as root
     * (UID/GID=0) unless your business case requires it. For more information and requirements, see
     * [Running a Lambda Function as Root](https://docs.aws.amazon.com/greengrass/v1/developerguide/lambda-group-config.html#lambda-running-as-root)
     * .
     *
     * In an AWS CloudFormation template, `RunAs` is a property of the
     * [`Execution`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-execution.html)
     * property type.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.greengrass.*;
     * RunAsProperty runAsProperty = RunAsProperty.builder()
     * .gid(123)
     * .uid(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinition-runas.html)
     */
    public inline fun cfnFunctionDefinitionRunAsProperty(
        block: CfnFunctionDefinitionRunAsPropertyDsl.() -> Unit = {}
    ): CfnFunctionDefinition.RunAsProperty {
        val builder = CfnFunctionDefinitionRunAsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::Greengrass::FunctionDefinitionVersion` resource represents a function definition
     * version for AWS IoT Greengrass .
     *
     * A function definition version contains contain a list of functions.
     *
     * To create a function definition version, you must specify the ID of the function definition
     * that you want to associate with the version. For information about creating a function
     * definition, see
     * [`AWS::Greengrass::FunctionDefinition`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-functiondefinition.html)
     * .
     *
     * After you create a function definition version that contains the functions you want to
     * deploy, you must add it to your group version. For more information, see
     * [`AWS::Greengrass::Group`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-group.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.greengrass.*;
     * Object variables;
     * CfnFunctionDefinitionVersion cfnFunctionDefinitionVersion =
     * CfnFunctionDefinitionVersion.Builder.create(this, "MyCfnFunctionDefinitionVersion")
     * .functionDefinitionId("functionDefinitionId")
     * .functions(List.of(FunctionProperty.builder()
     * .functionArn("functionArn")
     * .functionConfiguration(FunctionConfigurationProperty.builder()
     * .encodingType("encodingType")
     * .environment(EnvironmentProperty.builder()
     * .accessSysfs(false)
     * .execution(ExecutionProperty.builder()
     * .isolationMode("isolationMode")
     * .runAs(RunAsProperty.builder()
     * .gid(123)
     * .uid(123)
     * .build())
     * .build())
     * .resourceAccessPolicies(List.of(ResourceAccessPolicyProperty.builder()
     * .resourceId("resourceId")
     * // the properties below are optional
     * .permission("permission")
     * .build()))
     * .variables(variables)
     * .build())
     * .execArgs("execArgs")
     * .executable("executable")
     * .memorySize(123)
     * .pinned(false)
     * .timeout(123)
     * .build())
     * .id("id")
     * .build()))
     * // the properties below are optional
     * .defaultConfig(DefaultConfigProperty.builder()
     * .execution(ExecutionProperty.builder()
     * .isolationMode("isolationMode")
     * .runAs(RunAsProperty.builder()
     * .gid(123)
     * .uid(123)
     * .build())
     * .build())
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-functiondefinitionversion.html)
     */
    public inline fun cfnFunctionDefinitionVersion(
        scope: Construct,
        id: String,
        block: CfnFunctionDefinitionVersionDsl.() -> Unit = {},
    ): CfnFunctionDefinitionVersion {
        val builder = CfnFunctionDefinitionVersionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The default configuration that applies to all Lambda functions in the function definition
     * version.
     *
     * Individual Lambda functions can override these settings.
     *
     * In an AWS CloudFormation template, `DefaultConfig` is a property of the
     * [`AWS::Greengrass::FunctionDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-functiondefinitionversion.html)
     * resource.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.greengrass.*;
     * DefaultConfigProperty defaultConfigProperty = DefaultConfigProperty.builder()
     * .execution(ExecutionProperty.builder()
     * .isolationMode("isolationMode")
     * .runAs(RunAsProperty.builder()
     * .gid(123)
     * .uid(123)
     * .build())
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-defaultconfig.html)
     */
    public inline fun cfnFunctionDefinitionVersionDefaultConfigProperty(
        block: CfnFunctionDefinitionVersionDefaultConfigPropertyDsl.() -> Unit = {}
    ): CfnFunctionDefinitionVersion.DefaultConfigProperty {
        val builder = CfnFunctionDefinitionVersionDefaultConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The environment configuration for a Lambda function on the AWS IoT Greengrass core.
     *
     * In an AWS CloudFormation template, `Environment` is a property of the
     * [`FunctionConfiguration`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-functionconfiguration.html)
     * property type.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.greengrass.*;
     * Object variables;
     * EnvironmentProperty environmentProperty = EnvironmentProperty.builder()
     * .accessSysfs(false)
     * .execution(ExecutionProperty.builder()
     * .isolationMode("isolationMode")
     * .runAs(RunAsProperty.builder()
     * .gid(123)
     * .uid(123)
     * .build())
     * .build())
     * .resourceAccessPolicies(List.of(ResourceAccessPolicyProperty.builder()
     * .resourceId("resourceId")
     * // the properties below are optional
     * .permission("permission")
     * .build()))
     * .variables(variables)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-environment.html)
     */
    public inline fun cfnFunctionDefinitionVersionEnvironmentProperty(
        block: CfnFunctionDefinitionVersionEnvironmentPropertyDsl.() -> Unit = {}
    ): CfnFunctionDefinitionVersion.EnvironmentProperty {
        val builder = CfnFunctionDefinitionVersionEnvironmentPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configuration settings for the Lambda execution environment on the AWS IoT Greengrass core.
     *
     * In an AWS CloudFormation template, `Execution` is a property of the
     * [`DefaultConfig`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-defaultconfig.html)
     * property type for a function definition version and the
     * [`Environment`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-environment.html)
     * property type for a function.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.greengrass.*;
     * ExecutionProperty executionProperty = ExecutionProperty.builder()
     * .isolationMode("isolationMode")
     * .runAs(RunAsProperty.builder()
     * .gid(123)
     * .uid(123)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-execution.html)
     */
    public inline fun cfnFunctionDefinitionVersionExecutionProperty(
        block: CfnFunctionDefinitionVersionExecutionPropertyDsl.() -> Unit = {}
    ): CfnFunctionDefinitionVersion.ExecutionProperty {
        val builder = CfnFunctionDefinitionVersionExecutionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The group-specific configuration settings for a Lambda function.
     *
     * These settings configure the function's behavior in the Greengrass group. For more
     * information, see
     * [Controlling Execution of Greengrass Lambda Functions by Using Group-Specific Configuration](https://docs.aws.amazon.com/greengrass/v1/developerguide/lambda-group-config.html)
     * in the *Developer Guide* .
     *
     * In an AWS CloudFormation template, `FunctionConfiguration` is a property of the
     * [`Function`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-function.html)
     * property type.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.greengrass.*;
     * Object variables;
     * FunctionConfigurationProperty functionConfigurationProperty =
     * FunctionConfigurationProperty.builder()
     * .encodingType("encodingType")
     * .environment(EnvironmentProperty.builder()
     * .accessSysfs(false)
     * .execution(ExecutionProperty.builder()
     * .isolationMode("isolationMode")
     * .runAs(RunAsProperty.builder()
     * .gid(123)
     * .uid(123)
     * .build())
     * .build())
     * .resourceAccessPolicies(List.of(ResourceAccessPolicyProperty.builder()
     * .resourceId("resourceId")
     * // the properties below are optional
     * .permission("permission")
     * .build()))
     * .variables(variables)
     * .build())
     * .execArgs("execArgs")
     * .executable("executable")
     * .memorySize(123)
     * .pinned(false)
     * .timeout(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-functionconfiguration.html)
     */
    public inline fun cfnFunctionDefinitionVersionFunctionConfigurationProperty(
        block: CfnFunctionDefinitionVersionFunctionConfigurationPropertyDsl.() -> Unit = {}
    ): CfnFunctionDefinitionVersion.FunctionConfigurationProperty {
        val builder = CfnFunctionDefinitionVersionFunctionConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A function is a Lambda function that's referenced from an AWS IoT Greengrass group.
     *
     * The function is deployed to a Greengrass core where it runs locally. For more information,
     * see
     * [Run Lambda Functions on the AWS IoT Greengrass Core](https://docs.aws.amazon.com/greengrass/v1/developerguide/lambda-functions.html)
     * in the *Developer Guide* .
     *
     * In an AWS CloudFormation template, the `Functions` property of the
     * [`AWS::Greengrass::FunctionDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-functiondefinitionversion.html)
     * resource contains a list of `Function` property types.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.greengrass.*;
     * Object variables;
     * FunctionProperty functionProperty = FunctionProperty.builder()
     * .functionArn("functionArn")
     * .functionConfiguration(FunctionConfigurationProperty.builder()
     * .encodingType("encodingType")
     * .environment(EnvironmentProperty.builder()
     * .accessSysfs(false)
     * .execution(ExecutionProperty.builder()
     * .isolationMode("isolationMode")
     * .runAs(RunAsProperty.builder()
     * .gid(123)
     * .uid(123)
     * .build())
     * .build())
     * .resourceAccessPolicies(List.of(ResourceAccessPolicyProperty.builder()
     * .resourceId("resourceId")
     * // the properties below are optional
     * .permission("permission")
     * .build()))
     * .variables(variables)
     * .build())
     * .execArgs("execArgs")
     * .executable("executable")
     * .memorySize(123)
     * .pinned(false)
     * .timeout(123)
     * .build())
     * .id("id")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-function.html)
     */
    public inline fun cfnFunctionDefinitionVersionFunctionProperty(
        block: CfnFunctionDefinitionVersionFunctionPropertyDsl.() -> Unit = {}
    ): CfnFunctionDefinitionVersion.FunctionProperty {
        val builder = CfnFunctionDefinitionVersionFunctionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnFunctionDefinitionVersion`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.greengrass.*;
     * Object variables;
     * CfnFunctionDefinitionVersionProps cfnFunctionDefinitionVersionProps =
     * CfnFunctionDefinitionVersionProps.builder()
     * .functionDefinitionId("functionDefinitionId")
     * .functions(List.of(FunctionProperty.builder()
     * .functionArn("functionArn")
     * .functionConfiguration(FunctionConfigurationProperty.builder()
     * .encodingType("encodingType")
     * .environment(EnvironmentProperty.builder()
     * .accessSysfs(false)
     * .execution(ExecutionProperty.builder()
     * .isolationMode("isolationMode")
     * .runAs(RunAsProperty.builder()
     * .gid(123)
     * .uid(123)
     * .build())
     * .build())
     * .resourceAccessPolicies(List.of(ResourceAccessPolicyProperty.builder()
     * .resourceId("resourceId")
     * // the properties below are optional
     * .permission("permission")
     * .build()))
     * .variables(variables)
     * .build())
     * .execArgs("execArgs")
     * .executable("executable")
     * .memorySize(123)
     * .pinned(false)
     * .timeout(123)
     * .build())
     * .id("id")
     * .build()))
     * // the properties below are optional
     * .defaultConfig(DefaultConfigProperty.builder()
     * .execution(ExecutionProperty.builder()
     * .isolationMode("isolationMode")
     * .runAs(RunAsProperty.builder()
     * .gid(123)
     * .uid(123)
     * .build())
     * .build())
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-functiondefinitionversion.html)
     */
    public inline fun cfnFunctionDefinitionVersionProps(
        block: CfnFunctionDefinitionVersionPropsDsl.() -> Unit = {}
    ): CfnFunctionDefinitionVersionProps {
        val builder = CfnFunctionDefinitionVersionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A list of the
     * [resources](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-resourceinstance.html)
     * in the group that the function can access, with the corresponding read-only or read-write
     * permissions. The maximum is 10 resources.
     *
     * This property applies only to Lambda functions that run in a Greengrass container.
     *
     * In an AWS CloudFormation template, `ResourceAccessPolicy` is a property of the
     * [`Environment`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-environment.html)
     * property type.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.greengrass.*;
     * ResourceAccessPolicyProperty resourceAccessPolicyProperty =
     * ResourceAccessPolicyProperty.builder()
     * .resourceId("resourceId")
     * // the properties below are optional
     * .permission("permission")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-resourceaccesspolicy.html)
     */
    public inline fun cfnFunctionDefinitionVersionResourceAccessPolicyProperty(
        block: CfnFunctionDefinitionVersionResourceAccessPolicyPropertyDsl.() -> Unit = {}
    ): CfnFunctionDefinitionVersion.ResourceAccessPolicyProperty {
        val builder = CfnFunctionDefinitionVersionResourceAccessPolicyPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The user and group permissions used to run the Lambda function.
     *
     * This setting overrides the default access identity that's specified for the group (by
     * default, ggc_user and ggc_group). You can override the user, group, or both. For more
     * information, see
     * [Run as](https://docs.aws.amazon.com/greengrass/v1/developerguide/lambda-group-config.html#lambda-access-identity.html)
     * in the *Developer Guide* .
     *
     * Running as the root user increases risks to your data and device. Do not run as root
     * (UID/GID=0) unless your business case requires it. For more information and requirements, see
     * [Running a Lambda Function as Root](https://docs.aws.amazon.com/greengrass/v1/developerguide/lambda-group-config.html#lambda-running-as-root)
     * .
     *
     * In an AWS CloudFormation template, `RunAs` is a property of the
     * [`Execution`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-execution.html)
     * property type.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.greengrass.*;
     * RunAsProperty runAsProperty = RunAsProperty.builder()
     * .gid(123)
     * .uid(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-runas.html)
     */
    public inline fun cfnFunctionDefinitionVersionRunAsProperty(
        block: CfnFunctionDefinitionVersionRunAsPropertyDsl.() -> Unit = {}
    ): CfnFunctionDefinitionVersion.RunAsProperty {
        val builder = CfnFunctionDefinitionVersionRunAsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * AWS IoT Greengrass seamlessly extends AWS to edge devices so they can act locally on the data
     * they generate, while still using the cloud for management, analytics, and durable storage.
     *
     * With AWS IoT Greengrass , connected devices can run AWS Lambda functions, execute predictions
     * based on machine learning models, keep device data in sync, and communicate with other
     * devices securely – even when not connected to the internet. For more information, see the
     * [Developer Guide](https://docs.aws.amazon.com/greengrass/v1/developerguide/what-is-gg.html) .
     *
     * For AWS Region support, see
     * [AWS CloudFormation Support for AWS IoT Greengrass](https://docs.aws.amazon.com/greengrass/v1/developerguide/cloudformation-support.html)
     * in the *Developer Guide* .
     *
     * The `AWS::Greengrass::Group` resource represents a group in AWS IoT Greengrass . In the AWS
     * IoT Greengrass API, groups are used to organize your group versions.
     *
     * Groups can reference multiple group versions. All group versions must be associated with a
     * group. A group version references a device definition version, subscription definition
     * version, and other version types that contain the components you want to deploy to a
     * Greengrass core device.
     *
     * To deploy a group version, the group version must reference a core definition version that
     * contains one core. Other version types are optionally included, depending on your business
     * need.
     *
     * When you create a group, you can optionally include an initial group version. To associate a
     * group version later, create a
     * [`AWS::Greengrass::GroupVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-groupversion.html)
     * resource and specify the ID of this group.
     *
     * To change group components (such as devices, subscriptions, or functions), you must create
     * new versions. This is because versions are immutable. For example, to add a function, you
     * create a function definition version that contains the new function (and all other functions
     * that you want to deploy). Then you create a group version that references the new function
     * definition version (and all other version types that you want to deploy).
     *
     * *Deploying a Group Version*
     *
     * After you create the group version in your AWS CloudFormation template, you can deploy it
     * using the
     * [`aws greengrass create-deployment`](https://docs.aws.amazon.com/greengrass/v1/apireference/createdeployment-post.html)
     * command in the AWS CLI or from the *Greengrass* node in the AWS IoT console. To deploy a
     * group version, you must have a Greengrass service role associated with your AWS account . For
     * more information, see
     * [AWS CloudFormation Support for AWS IoT Greengrass](https://docs.aws.amazon.com/greengrass/v1/developerguide/cloudformation-support.html)
     * in the *Developer Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.greengrass.*;
     * Object tags;
     * CfnGroup cfnGroup = CfnGroup.Builder.create(this, "MyCfnGroup")
     * .name("name")
     * // the properties below are optional
     * .initialVersion(GroupVersionProperty.builder()
     * .connectorDefinitionVersionArn("connectorDefinitionVersionArn")
     * .coreDefinitionVersionArn("coreDefinitionVersionArn")
     * .deviceDefinitionVersionArn("deviceDefinitionVersionArn")
     * .functionDefinitionVersionArn("functionDefinitionVersionArn")
     * .loggerDefinitionVersionArn("loggerDefinitionVersionArn")
     * .resourceDefinitionVersionArn("resourceDefinitionVersionArn")
     * .subscriptionDefinitionVersionArn("subscriptionDefinitionVersionArn")
     * .build())
     * .roleArn("roleArn")
     * .tags(tags)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-group.html)
     */
    public inline fun cfnGroup(
        scope: Construct,
        id: String,
        block: CfnGroupDsl.() -> Unit = {},
    ): CfnGroup {
        val builder = CfnGroupDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * A group version in AWS IoT Greengrass , which references of a core definition version, device
     * definition version, subscription definition version, and other version types that contain the
     * components you want to deploy to a Greengrass core device.
     *
     * The group version must reference a core definition version that contains one core. Other
     * version types are optionally included, depending on your business need.
     *
     * In an AWS CloudFormation template, `GroupVersion` is the property type of the
     * `InitialVersion` property in the
     * [`AWS::Greengrass::Group`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-group.html)
     * resource.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.greengrass.*;
     * GroupVersionProperty groupVersionProperty = GroupVersionProperty.builder()
     * .connectorDefinitionVersionArn("connectorDefinitionVersionArn")
     * .coreDefinitionVersionArn("coreDefinitionVersionArn")
     * .deviceDefinitionVersionArn("deviceDefinitionVersionArn")
     * .functionDefinitionVersionArn("functionDefinitionVersionArn")
     * .loggerDefinitionVersionArn("loggerDefinitionVersionArn")
     * .resourceDefinitionVersionArn("resourceDefinitionVersionArn")
     * .subscriptionDefinitionVersionArn("subscriptionDefinitionVersionArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-group-groupversion.html)
     */
    public inline fun cfnGroupGroupVersionProperty(
        block: CfnGroupGroupVersionPropertyDsl.() -> Unit = {}
    ): CfnGroup.GroupVersionProperty {
        val builder = CfnGroupGroupVersionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnGroup`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.greengrass.*;
     * Object tags;
     * CfnGroupProps cfnGroupProps = CfnGroupProps.builder()
     * .name("name")
     * // the properties below are optional
     * .initialVersion(GroupVersionProperty.builder()
     * .connectorDefinitionVersionArn("connectorDefinitionVersionArn")
     * .coreDefinitionVersionArn("coreDefinitionVersionArn")
     * .deviceDefinitionVersionArn("deviceDefinitionVersionArn")
     * .functionDefinitionVersionArn("functionDefinitionVersionArn")
     * .loggerDefinitionVersionArn("loggerDefinitionVersionArn")
     * .resourceDefinitionVersionArn("resourceDefinitionVersionArn")
     * .subscriptionDefinitionVersionArn("subscriptionDefinitionVersionArn")
     * .build())
     * .roleArn("roleArn")
     * .tags(tags)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-group.html)
     */
    public inline fun cfnGroupProps(block: CfnGroupPropsDsl.() -> Unit = {}): CfnGroupProps {
        val builder = CfnGroupPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::Greengrass::GroupVersion` resource represents a group version in AWS IoT Greengrass
     * .
     *
     * A group version references a core definition version, device definition version, subscription
     * definition version, and other version types that contain the components you want to deploy to
     * a Greengrass core device. The group version must reference a core definition version that
     * contains one core. Other version types are optionally included, depending on your business
     * need.
     *
     * To create a group version, you must specify the ID of the group that you want to associate
     * with the version. For information about creating a group, see
     * [`AWS::Greengrass::Group`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-group.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.greengrass.*;
     * CfnGroupVersion cfnGroupVersion = CfnGroupVersion.Builder.create(this, "MyCfnGroupVersion")
     * .groupId("groupId")
     * // the properties below are optional
     * .connectorDefinitionVersionArn("connectorDefinitionVersionArn")
     * .coreDefinitionVersionArn("coreDefinitionVersionArn")
     * .deviceDefinitionVersionArn("deviceDefinitionVersionArn")
     * .functionDefinitionVersionArn("functionDefinitionVersionArn")
     * .loggerDefinitionVersionArn("loggerDefinitionVersionArn")
     * .resourceDefinitionVersionArn("resourceDefinitionVersionArn")
     * .subscriptionDefinitionVersionArn("subscriptionDefinitionVersionArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-groupversion.html)
     */
    public inline fun cfnGroupVersion(
        scope: Construct,
        id: String,
        block: CfnGroupVersionDsl.() -> Unit = {},
    ): CfnGroupVersion {
        val builder = CfnGroupVersionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnGroupVersion`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.greengrass.*;
     * CfnGroupVersionProps cfnGroupVersionProps = CfnGroupVersionProps.builder()
     * .groupId("groupId")
     * // the properties below are optional
     * .connectorDefinitionVersionArn("connectorDefinitionVersionArn")
     * .coreDefinitionVersionArn("coreDefinitionVersionArn")
     * .deviceDefinitionVersionArn("deviceDefinitionVersionArn")
     * .functionDefinitionVersionArn("functionDefinitionVersionArn")
     * .loggerDefinitionVersionArn("loggerDefinitionVersionArn")
     * .resourceDefinitionVersionArn("resourceDefinitionVersionArn")
     * .subscriptionDefinitionVersionArn("subscriptionDefinitionVersionArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-groupversion.html)
     */
    public inline fun cfnGroupVersionProps(
        block: CfnGroupVersionPropsDsl.() -> Unit = {}
    ): CfnGroupVersionProps {
        val builder = CfnGroupVersionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::Greengrass::LoggerDefinition` resource represents a logger definition for AWS IoT
     * Greengrass .
     *
     * Logger definitions are used to organize your logger definition versions.
     *
     * Logger definitions can reference multiple logger definition versions. All logger definition
     * versions must be associated with a logger definition. Each logger definition version can
     * contain one or more loggers.
     *
     * When you create a logger definition, you can optionally include an initial logger definition
     * version. To associate a logger definition version later, create an
     * [`AWS::Greengrass::LoggerDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-loggerdefinitionversion.html)
     * resource and specify the ID of this logger definition.
     *
     * After you create the logger definition version that contains the loggers you want to deploy,
     * you must add it to your group version. For more information, see
     * [`AWS::Greengrass::Group`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-group.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.greengrass.*;
     * Object tags;
     * CfnLoggerDefinition cfnLoggerDefinition = CfnLoggerDefinition.Builder.create(this,
     * "MyCfnLoggerDefinition")
     * .name("name")
     * // the properties below are optional
     * .initialVersion(LoggerDefinitionVersionProperty.builder()
     * .loggers(List.of(LoggerProperty.builder()
     * .component("component")
     * .id("id")
     * .level("level")
     * .type("type")
     * // the properties below are optional
     * .space(123)
     * .build()))
     * .build())
     * .tags(tags)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-loggerdefinition.html)
     */
    public inline fun cfnLoggerDefinition(
        scope: Construct,
        id: String,
        block: CfnLoggerDefinitionDsl.() -> Unit = {},
    ): CfnLoggerDefinition {
        val builder = CfnLoggerDefinitionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * A logger definition version contains a list of
     * [loggers](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-loggerdefinition-logger.html)
     * .
     *
     * After you create a logger definition version that contains the loggers you want to deploy,
     * you must add it to your group version. For more information, see
     * [`AWS::Greengrass::Group`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-group.html)
     * .
     *
     * In an AWS CloudFormation template, `LoggerDefinitionVersion` is the property type of the
     * `InitialVersion` property in the
     * [`AWS::Greengrass::LoggerDefinition`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-loggerdefinition.html)
     * resource.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.greengrass.*;
     * LoggerDefinitionVersionProperty loggerDefinitionVersionProperty =
     * LoggerDefinitionVersionProperty.builder()
     * .loggers(List.of(LoggerProperty.builder()
     * .component("component")
     * .id("id")
     * .level("level")
     * .type("type")
     * // the properties below are optional
     * .space(123)
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-loggerdefinition-loggerdefinitionversion.html)
     */
    public inline fun cfnLoggerDefinitionLoggerDefinitionVersionProperty(
        block: CfnLoggerDefinitionLoggerDefinitionVersionPropertyDsl.() -> Unit = {}
    ): CfnLoggerDefinition.LoggerDefinitionVersionProperty {
        val builder = CfnLoggerDefinitionLoggerDefinitionVersionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A logger represents logging settings for the AWS IoT Greengrass group, which can be stored in
     * CloudWatch and the local file system of your core device.
     *
     * All log entries include a timestamp, log level, and information about the event. For more
     * information, see
     * [Monitoring with AWS IoT Greengrass Logs](https://docs.aws.amazon.com/greengrass/v1/developerguide/greengrass-logs-overview.html)
     * in the *Developer Guide* .
     *
     * In an AWS CloudFormation template, the `Loggers` property of the
     * [`LoggerDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-loggerdefinition-loggerdefinitionversion.html)
     * property type contains a list of `Logger` property types.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.greengrass.*;
     * LoggerProperty loggerProperty = LoggerProperty.builder()
     * .component("component")
     * .id("id")
     * .level("level")
     * .type("type")
     * // the properties below are optional
     * .space(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-loggerdefinition-logger.html)
     */
    public inline fun cfnLoggerDefinitionLoggerProperty(
        block: CfnLoggerDefinitionLoggerPropertyDsl.() -> Unit = {}
    ): CfnLoggerDefinition.LoggerProperty {
        val builder = CfnLoggerDefinitionLoggerPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnLoggerDefinition`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.greengrass.*;
     * Object tags;
     * CfnLoggerDefinitionProps cfnLoggerDefinitionProps = CfnLoggerDefinitionProps.builder()
     * .name("name")
     * // the properties below are optional
     * .initialVersion(LoggerDefinitionVersionProperty.builder()
     * .loggers(List.of(LoggerProperty.builder()
     * .component("component")
     * .id("id")
     * .level("level")
     * .type("type")
     * // the properties below are optional
     * .space(123)
     * .build()))
     * .build())
     * .tags(tags)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-loggerdefinition.html)
     */
    public inline fun cfnLoggerDefinitionProps(
        block: CfnLoggerDefinitionPropsDsl.() -> Unit = {}
    ): CfnLoggerDefinitionProps {
        val builder = CfnLoggerDefinitionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::Greengrass::LoggerDefinitionVersion` resource represents a logger definition
     * version for AWS IoT Greengrass .
     *
     * A logger definition version contains a list of loggers.
     *
     * To create a logger definition version, you must specify the ID of the logger definition that
     * you want to associate with the version. For information about creating a logger definition,
     * see
     * [`AWS::Greengrass::LoggerDefinition`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-loggerdefinition.html)
     * .
     *
     * After you create a logger definition version that contains the loggers you want to deploy,
     * you must add it to your group version. For more information, see
     * [`AWS::Greengrass::Group`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-group.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.greengrass.*;
     * CfnLoggerDefinitionVersion cfnLoggerDefinitionVersion =
     * CfnLoggerDefinitionVersion.Builder.create(this, "MyCfnLoggerDefinitionVersion")
     * .loggerDefinitionId("loggerDefinitionId")
     * .loggers(List.of(LoggerProperty.builder()
     * .component("component")
     * .id("id")
     * .level("level")
     * .type("type")
     * // the properties below are optional
     * .space(123)
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-loggerdefinitionversion.html)
     */
    public inline fun cfnLoggerDefinitionVersion(
        scope: Construct,
        id: String,
        block: CfnLoggerDefinitionVersionDsl.() -> Unit = {},
    ): CfnLoggerDefinitionVersion {
        val builder = CfnLoggerDefinitionVersionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * A logger represents logging settings for the AWS IoT Greengrass group, which can be stored in
     * CloudWatch and the local file system of your core device.
     *
     * All log entries include a timestamp, log level, and information about the event. For more
     * information, see
     * [Monitoring with AWS IoT Greengrass Logs](https://docs.aws.amazon.com/greengrass/v1/developerguide/greengrass-logs-overview.html)
     * in the *Developer Guide* .
     *
     * In an AWS CloudFormation template, the `Loggers` property of the
     * [`AWS::Greengrass::LoggerDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-loggerdefinitionversion.html)
     * resource contains a list of `Logger` property types.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.greengrass.*;
     * LoggerProperty loggerProperty = LoggerProperty.builder()
     * .component("component")
     * .id("id")
     * .level("level")
     * .type("type")
     * // the properties below are optional
     * .space(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-loggerdefinitionversion-logger.html)
     */
    public inline fun cfnLoggerDefinitionVersionLoggerProperty(
        block: CfnLoggerDefinitionVersionLoggerPropertyDsl.() -> Unit = {}
    ): CfnLoggerDefinitionVersion.LoggerProperty {
        val builder = CfnLoggerDefinitionVersionLoggerPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnLoggerDefinitionVersion`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.greengrass.*;
     * CfnLoggerDefinitionVersionProps cfnLoggerDefinitionVersionProps =
     * CfnLoggerDefinitionVersionProps.builder()
     * .loggerDefinitionId("loggerDefinitionId")
     * .loggers(List.of(LoggerProperty.builder()
     * .component("component")
     * .id("id")
     * .level("level")
     * .type("type")
     * // the properties below are optional
     * .space(123)
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-loggerdefinitionversion.html)
     */
    public inline fun cfnLoggerDefinitionVersionProps(
        block: CfnLoggerDefinitionVersionPropsDsl.() -> Unit = {}
    ): CfnLoggerDefinitionVersionProps {
        val builder = CfnLoggerDefinitionVersionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::Greengrass::ResourceDefinition` resource represents a resource definition for AWS
     * IoT Greengrass .
     *
     * Resource definitions are used to organize your resource definition versions.
     *
     * Resource definitions can reference multiple resource definition versions. All resource
     * definition versions must be associated with a resource definition. Each resource definition
     * version can contain one or more resources. (In AWS CloudFormation , resources are named
     * *resource instances* .)
     *
     * When you create a resource definition, you can optionally include an initial resource
     * definition version. To associate a resource definition version later, create an
     * [`AWS::Greengrass::ResourceDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-resourcedefinitionversion.html)
     * resource and specify the ID of this resource definition.
     *
     * After you create the resource definition version that contains the resources you want to
     * deploy, you must add it to your group version. For more information, see
     * [`AWS::Greengrass::Group`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-group.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.greengrass.*;
     * Object tags;
     * CfnResourceDefinition cfnResourceDefinition = CfnResourceDefinition.Builder.create(this,
     * "MyCfnResourceDefinition")
     * .name("name")
     * // the properties below are optional
     * .initialVersion(ResourceDefinitionVersionProperty.builder()
     * .resources(List.of(ResourceInstanceProperty.builder()
     * .id("id")
     * .name("name")
     * .resourceDataContainer(ResourceDataContainerProperty.builder()
     * .localDeviceResourceData(LocalDeviceResourceDataProperty.builder()
     * .sourcePath("sourcePath")
     * // the properties below are optional
     * .groupOwnerSetting(GroupOwnerSettingProperty.builder()
     * .autoAddGroupOwner(false)
     * // the properties below are optional
     * .groupOwner("groupOwner")
     * .build())
     * .build())
     * .localVolumeResourceData(LocalVolumeResourceDataProperty.builder()
     * .destinationPath("destinationPath")
     * .sourcePath("sourcePath")
     * // the properties below are optional
     * .groupOwnerSetting(GroupOwnerSettingProperty.builder()
     * .autoAddGroupOwner(false)
     * // the properties below are optional
     * .groupOwner("groupOwner")
     * .build())
     * .build())
     * .s3MachineLearningModelResourceData(S3MachineLearningModelResourceDataProperty.builder()
     * .destinationPath("destinationPath")
     * .s3Uri("s3Uri")
     * // the properties below are optional
     * .ownerSetting(ResourceDownloadOwnerSettingProperty.builder()
     * .groupOwner("groupOwner")
     * .groupPermission("groupPermission")
     * .build())
     * .build())
     * .sageMakerMachineLearningModelResourceData(SageMakerMachineLearningModelResourceDataProperty.builder()
     * .destinationPath("destinationPath")
     * .sageMakerJobArn("sageMakerJobArn")
     * // the properties below are optional
     * .ownerSetting(ResourceDownloadOwnerSettingProperty.builder()
     * .groupOwner("groupOwner")
     * .groupPermission("groupPermission")
     * .build())
     * .build())
     * .secretsManagerSecretResourceData(SecretsManagerSecretResourceDataProperty.builder()
     * .arn("arn")
     * // the properties below are optional
     * .additionalStagingLabelsToDownload(List.of("additionalStagingLabelsToDownload"))
     * .build())
     * .build())
     * .build()))
     * .build())
     * .tags(tags)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-resourcedefinition.html)
     */
    public inline fun cfnResourceDefinition(
        scope: Construct,
        id: String,
        block: CfnResourceDefinitionDsl.() -> Unit = {},
    ): CfnResourceDefinition {
        val builder = CfnResourceDefinitionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Settings that define additional Linux OS group permissions to give to the Lambda function
     * process.
     *
     * You can give the permissions of the Linux group that owns the resource or choose another
     * Linux group. These permissions are in addition to the function's `RunAs` permissions.
     *
     * In an AWS CloudFormation template, `GroupOwnerSetting` is a property of the
     * [`LocalDeviceResourceData`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-localdeviceresourcedata.html)
     * and
     * [`LocalVolumeResourceData`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-localvolumeresourcedata.html)
     * property types.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.greengrass.*;
     * GroupOwnerSettingProperty groupOwnerSettingProperty = GroupOwnerSettingProperty.builder()
     * .autoAddGroupOwner(false)
     * // the properties below are optional
     * .groupOwner("groupOwner")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-groupownersetting.html)
     */
    public inline fun cfnResourceDefinitionGroupOwnerSettingProperty(
        block: CfnResourceDefinitionGroupOwnerSettingPropertyDsl.() -> Unit = {}
    ): CfnResourceDefinition.GroupOwnerSettingProperty {
        val builder = CfnResourceDefinitionGroupOwnerSettingPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Settings for a local device resource, which represents a file under `/dev` .
     *
     * For more information, see
     * [Access Local Resources with Lambda Functions](https://docs.aws.amazon.com/greengrass/v1/developerguide/access-local-resources.html)
     * in the *Developer Guide* .
     *
     * In an AWS CloudFormation template, `LocalDeviceResourceData` can be used in the
     * [`ResourceDataContainer`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-resourcedatacontainer.html)
     * property type.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.greengrass.*;
     * LocalDeviceResourceDataProperty localDeviceResourceDataProperty =
     * LocalDeviceResourceDataProperty.builder()
     * .sourcePath("sourcePath")
     * // the properties below are optional
     * .groupOwnerSetting(GroupOwnerSettingProperty.builder()
     * .autoAddGroupOwner(false)
     * // the properties below are optional
     * .groupOwner("groupOwner")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-localdeviceresourcedata.html)
     */
    public inline fun cfnResourceDefinitionLocalDeviceResourceDataProperty(
        block: CfnResourceDefinitionLocalDeviceResourceDataPropertyDsl.() -> Unit = {}
    ): CfnResourceDefinition.LocalDeviceResourceDataProperty {
        val builder = CfnResourceDefinitionLocalDeviceResourceDataPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Settings for a local volume resource, which represents a file or directory on the root file
     * system.
     *
     * For more information, see
     * [Access Local Resources with Lambda Functions](https://docs.aws.amazon.com/greengrass/v1/developerguide/access-local-resources.html)
     * in the *Developer Guide* .
     *
     * In an AWS CloudFormation template, `LocalVolumeResourceData` can be used in the
     * [`ResourceDataContainer`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-resourcedatacontainer.html)
     * property type.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.greengrass.*;
     * LocalVolumeResourceDataProperty localVolumeResourceDataProperty =
     * LocalVolumeResourceDataProperty.builder()
     * .destinationPath("destinationPath")
     * .sourcePath("sourcePath")
     * // the properties below are optional
     * .groupOwnerSetting(GroupOwnerSettingProperty.builder()
     * .autoAddGroupOwner(false)
     * // the properties below are optional
     * .groupOwner("groupOwner")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-localvolumeresourcedata.html)
     */
    public inline fun cfnResourceDefinitionLocalVolumeResourceDataProperty(
        block: CfnResourceDefinitionLocalVolumeResourceDataPropertyDsl.() -> Unit = {}
    ): CfnResourceDefinition.LocalVolumeResourceDataProperty {
        val builder = CfnResourceDefinitionLocalVolumeResourceDataPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnResourceDefinition`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.greengrass.*;
     * Object tags;
     * CfnResourceDefinitionProps cfnResourceDefinitionProps = CfnResourceDefinitionProps.builder()
     * .name("name")
     * // the properties below are optional
     * .initialVersion(ResourceDefinitionVersionProperty.builder()
     * .resources(List.of(ResourceInstanceProperty.builder()
     * .id("id")
     * .name("name")
     * .resourceDataContainer(ResourceDataContainerProperty.builder()
     * .localDeviceResourceData(LocalDeviceResourceDataProperty.builder()
     * .sourcePath("sourcePath")
     * // the properties below are optional
     * .groupOwnerSetting(GroupOwnerSettingProperty.builder()
     * .autoAddGroupOwner(false)
     * // the properties below are optional
     * .groupOwner("groupOwner")
     * .build())
     * .build())
     * .localVolumeResourceData(LocalVolumeResourceDataProperty.builder()
     * .destinationPath("destinationPath")
     * .sourcePath("sourcePath")
     * // the properties below are optional
     * .groupOwnerSetting(GroupOwnerSettingProperty.builder()
     * .autoAddGroupOwner(false)
     * // the properties below are optional
     * .groupOwner("groupOwner")
     * .build())
     * .build())
     * .s3MachineLearningModelResourceData(S3MachineLearningModelResourceDataProperty.builder()
     * .destinationPath("destinationPath")
     * .s3Uri("s3Uri")
     * // the properties below are optional
     * .ownerSetting(ResourceDownloadOwnerSettingProperty.builder()
     * .groupOwner("groupOwner")
     * .groupPermission("groupPermission")
     * .build())
     * .build())
     * .sageMakerMachineLearningModelResourceData(SageMakerMachineLearningModelResourceDataProperty.builder()
     * .destinationPath("destinationPath")
     * .sageMakerJobArn("sageMakerJobArn")
     * // the properties below are optional
     * .ownerSetting(ResourceDownloadOwnerSettingProperty.builder()
     * .groupOwner("groupOwner")
     * .groupPermission("groupPermission")
     * .build())
     * .build())
     * .secretsManagerSecretResourceData(SecretsManagerSecretResourceDataProperty.builder()
     * .arn("arn")
     * // the properties below are optional
     * .additionalStagingLabelsToDownload(List.of("additionalStagingLabelsToDownload"))
     * .build())
     * .build())
     * .build()))
     * .build())
     * .tags(tags)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-resourcedefinition.html)
     */
    public inline fun cfnResourceDefinitionProps(
        block: CfnResourceDefinitionPropsDsl.() -> Unit = {}
    ): CfnResourceDefinitionProps {
        val builder = CfnResourceDefinitionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A container for resource data, which defines the resource type.
     *
     * The container takes only one of the following supported resource data types:
     * `LocalDeviceResourceData` , `LocalVolumeResourceData` ,
     * `SageMakerMachineLearningModelResourceData` , `S3MachineLearningModelResourceData` , or
     * `SecretsManagerSecretResourceData` .
     *
     * Only one resource type can be defined for a `ResourceDataContainer` instance.
     *
     * In an AWS CloudFormation template, `ResourceDataContainer` is a property of the
     * [`ResourceInstance`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-resourceinstance.html)
     * property type.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.greengrass.*;
     * ResourceDataContainerProperty resourceDataContainerProperty =
     * ResourceDataContainerProperty.builder()
     * .localDeviceResourceData(LocalDeviceResourceDataProperty.builder()
     * .sourcePath("sourcePath")
     * // the properties below are optional
     * .groupOwnerSetting(GroupOwnerSettingProperty.builder()
     * .autoAddGroupOwner(false)
     * // the properties below are optional
     * .groupOwner("groupOwner")
     * .build())
     * .build())
     * .localVolumeResourceData(LocalVolumeResourceDataProperty.builder()
     * .destinationPath("destinationPath")
     * .sourcePath("sourcePath")
     * // the properties below are optional
     * .groupOwnerSetting(GroupOwnerSettingProperty.builder()
     * .autoAddGroupOwner(false)
     * // the properties below are optional
     * .groupOwner("groupOwner")
     * .build())
     * .build())
     * .s3MachineLearningModelResourceData(S3MachineLearningModelResourceDataProperty.builder()
     * .destinationPath("destinationPath")
     * .s3Uri("s3Uri")
     * // the properties below are optional
     * .ownerSetting(ResourceDownloadOwnerSettingProperty.builder()
     * .groupOwner("groupOwner")
     * .groupPermission("groupPermission")
     * .build())
     * .build())
     * .sageMakerMachineLearningModelResourceData(SageMakerMachineLearningModelResourceDataProperty.builder()
     * .destinationPath("destinationPath")
     * .sageMakerJobArn("sageMakerJobArn")
     * // the properties below are optional
     * .ownerSetting(ResourceDownloadOwnerSettingProperty.builder()
     * .groupOwner("groupOwner")
     * .groupPermission("groupPermission")
     * .build())
     * .build())
     * .secretsManagerSecretResourceData(SecretsManagerSecretResourceDataProperty.builder()
     * .arn("arn")
     * // the properties below are optional
     * .additionalStagingLabelsToDownload(List.of("additionalStagingLabelsToDownload"))
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-resourcedatacontainer.html)
     */
    public inline fun cfnResourceDefinitionResourceDataContainerProperty(
        block: CfnResourceDefinitionResourceDataContainerPropertyDsl.() -> Unit = {}
    ): CfnResourceDefinition.ResourceDataContainerProperty {
        val builder = CfnResourceDefinitionResourceDataContainerPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A resource definition version contains a list of resources. (In AWS CloudFormation ,
     * resources are named *resource instances* .).
     *
     * After you create a resource definition version that contains the resources you want to
     * deploy, you must add it to your group version. For more information, see
     * [`AWS::Greengrass::Group`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-group.html)
     * .
     *
     * In an AWS CloudFormation template, `ResourceDefinitionVersion` is the property type of the
     * `InitialVersion` property in the
     * [`AWS::Greengrass::ResourceDefinition`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-resourcedefinition.html)
     * resource.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.greengrass.*;
     * ResourceDefinitionVersionProperty resourceDefinitionVersionProperty =
     * ResourceDefinitionVersionProperty.builder()
     * .resources(List.of(ResourceInstanceProperty.builder()
     * .id("id")
     * .name("name")
     * .resourceDataContainer(ResourceDataContainerProperty.builder()
     * .localDeviceResourceData(LocalDeviceResourceDataProperty.builder()
     * .sourcePath("sourcePath")
     * // the properties below are optional
     * .groupOwnerSetting(GroupOwnerSettingProperty.builder()
     * .autoAddGroupOwner(false)
     * // the properties below are optional
     * .groupOwner("groupOwner")
     * .build())
     * .build())
     * .localVolumeResourceData(LocalVolumeResourceDataProperty.builder()
     * .destinationPath("destinationPath")
     * .sourcePath("sourcePath")
     * // the properties below are optional
     * .groupOwnerSetting(GroupOwnerSettingProperty.builder()
     * .autoAddGroupOwner(false)
     * // the properties below are optional
     * .groupOwner("groupOwner")
     * .build())
     * .build())
     * .s3MachineLearningModelResourceData(S3MachineLearningModelResourceDataProperty.builder()
     * .destinationPath("destinationPath")
     * .s3Uri("s3Uri")
     * // the properties below are optional
     * .ownerSetting(ResourceDownloadOwnerSettingProperty.builder()
     * .groupOwner("groupOwner")
     * .groupPermission("groupPermission")
     * .build())
     * .build())
     * .sageMakerMachineLearningModelResourceData(SageMakerMachineLearningModelResourceDataProperty.builder()
     * .destinationPath("destinationPath")
     * .sageMakerJobArn("sageMakerJobArn")
     * // the properties below are optional
     * .ownerSetting(ResourceDownloadOwnerSettingProperty.builder()
     * .groupOwner("groupOwner")
     * .groupPermission("groupPermission")
     * .build())
     * .build())
     * .secretsManagerSecretResourceData(SecretsManagerSecretResourceDataProperty.builder()
     * .arn("arn")
     * // the properties below are optional
     * .additionalStagingLabelsToDownload(List.of("additionalStagingLabelsToDownload"))
     * .build())
     * .build())
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-resourcedefinitionversion.html)
     */
    public inline fun cfnResourceDefinitionResourceDefinitionVersionProperty(
        block: CfnResourceDefinitionResourceDefinitionVersionPropertyDsl.() -> Unit = {}
    ): CfnResourceDefinition.ResourceDefinitionVersionProperty {
        val builder = CfnResourceDefinitionResourceDefinitionVersionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The owner setting for a downloaded machine learning resource.
     *
     * For more information, see
     * [Access Machine Learning Resources from Lambda Functions](https://docs.aws.amazon.com/greengrass/v1/developerguide/access-ml-resources.html)
     * in the *Developer Guide* .
     *
     * In an AWS CloudFormation template, `ResourceDownloadOwnerSetting` is the property type of the
     * `OwnerSetting` property for the
     * [`S3MachineLearningModelResourceData`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-s3machinelearningmodelresourcedata.html)
     * and
     * [`SageMakerMachineLearningModelResourceData`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-sagemakermachinelearningmodelresourcedata.html)
     * property types.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.greengrass.*;
     * ResourceDownloadOwnerSettingProperty resourceDownloadOwnerSettingProperty =
     * ResourceDownloadOwnerSettingProperty.builder()
     * .groupOwner("groupOwner")
     * .groupPermission("groupPermission")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-resourcedownloadownersetting.html)
     */
    public inline fun cfnResourceDefinitionResourceDownloadOwnerSettingProperty(
        block: CfnResourceDefinitionResourceDownloadOwnerSettingPropertyDsl.() -> Unit = {}
    ): CfnResourceDefinition.ResourceDownloadOwnerSettingProperty {
        val builder = CfnResourceDefinitionResourceDownloadOwnerSettingPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A local resource, machine learning resource, or secret resource.
     *
     * For more information, see
     * [Access Local Resources with Lambda Functions](https://docs.aws.amazon.com/greengrass/v1/developerguide/access-local-resources.html)
     * ,
     * [Perform Machine Learning Inference](https://docs.aws.amazon.com/greengrass/v1/developerguide/ml-inference.html)
     * , and
     * [Deploy Secrets to the AWS IoT Greengrass Core](https://docs.aws.amazon.com/greengrass/v1/developerguide/secrets.html)
     * in the *Developer Guide* .
     *
     * In an AWS CloudFormation template, the `Resources` property of the
     * [`AWS::Greengrass::ResourceDefinition`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-resourcedefinition.html)
     * resource contains a list of `ResourceInstance` property types.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.greengrass.*;
     * ResourceInstanceProperty resourceInstanceProperty = ResourceInstanceProperty.builder()
     * .id("id")
     * .name("name")
     * .resourceDataContainer(ResourceDataContainerProperty.builder()
     * .localDeviceResourceData(LocalDeviceResourceDataProperty.builder()
     * .sourcePath("sourcePath")
     * // the properties below are optional
     * .groupOwnerSetting(GroupOwnerSettingProperty.builder()
     * .autoAddGroupOwner(false)
     * // the properties below are optional
     * .groupOwner("groupOwner")
     * .build())
     * .build())
     * .localVolumeResourceData(LocalVolumeResourceDataProperty.builder()
     * .destinationPath("destinationPath")
     * .sourcePath("sourcePath")
     * // the properties below are optional
     * .groupOwnerSetting(GroupOwnerSettingProperty.builder()
     * .autoAddGroupOwner(false)
     * // the properties below are optional
     * .groupOwner("groupOwner")
     * .build())
     * .build())
     * .s3MachineLearningModelResourceData(S3MachineLearningModelResourceDataProperty.builder()
     * .destinationPath("destinationPath")
     * .s3Uri("s3Uri")
     * // the properties below are optional
     * .ownerSetting(ResourceDownloadOwnerSettingProperty.builder()
     * .groupOwner("groupOwner")
     * .groupPermission("groupPermission")
     * .build())
     * .build())
     * .sageMakerMachineLearningModelResourceData(SageMakerMachineLearningModelResourceDataProperty.builder()
     * .destinationPath("destinationPath")
     * .sageMakerJobArn("sageMakerJobArn")
     * // the properties below are optional
     * .ownerSetting(ResourceDownloadOwnerSettingProperty.builder()
     * .groupOwner("groupOwner")
     * .groupPermission("groupPermission")
     * .build())
     * .build())
     * .secretsManagerSecretResourceData(SecretsManagerSecretResourceDataProperty.builder()
     * .arn("arn")
     * // the properties below are optional
     * .additionalStagingLabelsToDownload(List.of("additionalStagingLabelsToDownload"))
     * .build())
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-resourceinstance.html)
     */
    public inline fun cfnResourceDefinitionResourceInstanceProperty(
        block: CfnResourceDefinitionResourceInstancePropertyDsl.() -> Unit = {}
    ): CfnResourceDefinition.ResourceInstanceProperty {
        val builder = CfnResourceDefinitionResourceInstancePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Settings for an Amazon S3 machine learning resource.
     *
     * For more information, see
     * [Perform Machine Learning Inference](https://docs.aws.amazon.com/greengrass/v1/developerguide/ml-inference.html)
     * in the *Developer Guide* .
     *
     * In an AWS CloudFormation template, `S3MachineLearningModelResourceData` can be used in the
     * [`ResourceDataContainer`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-resourcedatacontainer.html)
     * property type.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.greengrass.*;
     * S3MachineLearningModelResourceDataProperty s3MachineLearningModelResourceDataProperty =
     * S3MachineLearningModelResourceDataProperty.builder()
     * .destinationPath("destinationPath")
     * .s3Uri("s3Uri")
     * // the properties below are optional
     * .ownerSetting(ResourceDownloadOwnerSettingProperty.builder()
     * .groupOwner("groupOwner")
     * .groupPermission("groupPermission")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-s3machinelearningmodelresourcedata.html)
     */
    public inline fun cfnResourceDefinitionS3MachineLearningModelResourceDataProperty(
        block: CfnResourceDefinitionS3MachineLearningModelResourceDataPropertyDsl.() -> Unit = {}
    ): CfnResourceDefinition.S3MachineLearningModelResourceDataProperty {
        val builder = CfnResourceDefinitionS3MachineLearningModelResourceDataPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Settings for an Secrets Manager machine learning resource.
     *
     * For more information, see
     * [Perform Machine Learning Inference](https://docs.aws.amazon.com/greengrass/v1/developerguide/ml-inference.html)
     * in the *Developer Guide* .
     *
     * In an AWS CloudFormation template, `SageMakerMachineLearningModelResourceData` can be used in
     * the
     * [`ResourceDataContainer`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-resourcedatacontainer.html)
     * property type.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.greengrass.*;
     * SageMakerMachineLearningModelResourceDataProperty
     * sageMakerMachineLearningModelResourceDataProperty =
     * SageMakerMachineLearningModelResourceDataProperty.builder()
     * .destinationPath("destinationPath")
     * .sageMakerJobArn("sageMakerJobArn")
     * // the properties below are optional
     * .ownerSetting(ResourceDownloadOwnerSettingProperty.builder()
     * .groupOwner("groupOwner")
     * .groupPermission("groupPermission")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-sagemakermachinelearningmodelresourcedata.html)
     */
    public inline fun cfnResourceDefinitionSageMakerMachineLearningModelResourceDataProperty(
        block:
            CfnResourceDefinitionSageMakerMachineLearningModelResourceDataPropertyDsl.() -> Unit =
            {}
    ): CfnResourceDefinition.SageMakerMachineLearningModelResourceDataProperty {
        val builder = CfnResourceDefinitionSageMakerMachineLearningModelResourceDataPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Settings for a secret resource, which references a secret from AWS Secrets Manager .
     *
     * AWS IoT Greengrass stores a local, encrypted copy of the secret on the Greengrass core, where
     * it can be securely accessed by connectors and Lambda functions. For more information, see
     * [Deploy Secrets to the AWS IoT Greengrass Core](https://docs.aws.amazon.com/greengrass/v1/developerguide/secrets.html)
     * in the *Developer Guide* .
     *
     * In an AWS CloudFormation template, `SecretsManagerSecretResourceData` can be used in the
     * [`ResourceDataContainer`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-resourcedatacontainer.html)
     * property type.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.greengrass.*;
     * SecretsManagerSecretResourceDataProperty secretsManagerSecretResourceDataProperty =
     * SecretsManagerSecretResourceDataProperty.builder()
     * .arn("arn")
     * // the properties below are optional
     * .additionalStagingLabelsToDownload(List.of("additionalStagingLabelsToDownload"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-secretsmanagersecretresourcedata.html)
     */
    public inline fun cfnResourceDefinitionSecretsManagerSecretResourceDataProperty(
        block: CfnResourceDefinitionSecretsManagerSecretResourceDataPropertyDsl.() -> Unit = {}
    ): CfnResourceDefinition.SecretsManagerSecretResourceDataProperty {
        val builder = CfnResourceDefinitionSecretsManagerSecretResourceDataPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::Greengrass::ResourceDefinitionVersion` resource represents a resource definition
     * version for AWS IoT Greengrass .
     *
     * A resource definition version contains a list of resources. (In AWS CloudFormation ,
     * resources are named *resource instances* .)
     *
     * To create a resource definition version, you must specify the ID of the resource definition
     * that you want to associate with the version. For information about creating a resource
     * definition, see
     * [`AWS::Greengrass::ResourceDefinition`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-resourcedefinition.html)
     * .
     *
     * After you create a resource definition version that contains the resources you want to
     * deploy, you must add it to your group version. For more information, see
     * [`AWS::Greengrass::Group`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-group.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.greengrass.*;
     * CfnResourceDefinitionVersion cfnResourceDefinitionVersion =
     * CfnResourceDefinitionVersion.Builder.create(this, "MyCfnResourceDefinitionVersion")
     * .resourceDefinitionId("resourceDefinitionId")
     * .resources(List.of(ResourceInstanceProperty.builder()
     * .id("id")
     * .name("name")
     * .resourceDataContainer(ResourceDataContainerProperty.builder()
     * .localDeviceResourceData(LocalDeviceResourceDataProperty.builder()
     * .sourcePath("sourcePath")
     * // the properties below are optional
     * .groupOwnerSetting(GroupOwnerSettingProperty.builder()
     * .autoAddGroupOwner(false)
     * // the properties below are optional
     * .groupOwner("groupOwner")
     * .build())
     * .build())
     * .localVolumeResourceData(LocalVolumeResourceDataProperty.builder()
     * .destinationPath("destinationPath")
     * .sourcePath("sourcePath")
     * // the properties below are optional
     * .groupOwnerSetting(GroupOwnerSettingProperty.builder()
     * .autoAddGroupOwner(false)
     * // the properties below are optional
     * .groupOwner("groupOwner")
     * .build())
     * .build())
     * .s3MachineLearningModelResourceData(S3MachineLearningModelResourceDataProperty.builder()
     * .destinationPath("destinationPath")
     * .s3Uri("s3Uri")
     * // the properties below are optional
     * .ownerSetting(ResourceDownloadOwnerSettingProperty.builder()
     * .groupOwner("groupOwner")
     * .groupPermission("groupPermission")
     * .build())
     * .build())
     * .sageMakerMachineLearningModelResourceData(SageMakerMachineLearningModelResourceDataProperty.builder()
     * .destinationPath("destinationPath")
     * .sageMakerJobArn("sageMakerJobArn")
     * // the properties below are optional
     * .ownerSetting(ResourceDownloadOwnerSettingProperty.builder()
     * .groupOwner("groupOwner")
     * .groupPermission("groupPermission")
     * .build())
     * .build())
     * .secretsManagerSecretResourceData(SecretsManagerSecretResourceDataProperty.builder()
     * .arn("arn")
     * // the properties below are optional
     * .additionalStagingLabelsToDownload(List.of("additionalStagingLabelsToDownload"))
     * .build())
     * .build())
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-resourcedefinitionversion.html)
     */
    public inline fun cfnResourceDefinitionVersion(
        scope: Construct,
        id: String,
        block: CfnResourceDefinitionVersionDsl.() -> Unit = {},
    ): CfnResourceDefinitionVersion {
        val builder = CfnResourceDefinitionVersionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Settings that define additional Linux OS group permissions to give to the Lambda function
     * process.
     *
     * You can give the permissions of the Linux group that owns the resource or choose another
     * Linux group. These permissions are in addition to the function's `RunAs` permissions.
     *
     * In an AWS CloudFormation template, `GroupOwnerSetting` is a property of the
     * [`LocalDeviceResourceData`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-localdeviceresourcedata.html)
     * and
     * [`LocalVolumeResourceData`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-localvolumeresourcedata.html)
     * property types.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.greengrass.*;
     * GroupOwnerSettingProperty groupOwnerSettingProperty = GroupOwnerSettingProperty.builder()
     * .autoAddGroupOwner(false)
     * // the properties below are optional
     * .groupOwner("groupOwner")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-groupownersetting.html)
     */
    public inline fun cfnResourceDefinitionVersionGroupOwnerSettingProperty(
        block: CfnResourceDefinitionVersionGroupOwnerSettingPropertyDsl.() -> Unit = {}
    ): CfnResourceDefinitionVersion.GroupOwnerSettingProperty {
        val builder = CfnResourceDefinitionVersionGroupOwnerSettingPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Settings for a local device resource, which represents a file under `/dev` .
     *
     * For more information, see
     * [Access Local Resources with Lambda Functions](https://docs.aws.amazon.com/greengrass/v1/developerguide/access-local-resources.html)
     * in the *Developer Guide* .
     *
     * In an AWS CloudFormation template, `LocalDeviceResourceData` can be used in the
     * [`ResourceDataContainer`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-resourcedatacontainer.html)
     * property type.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.greengrass.*;
     * LocalDeviceResourceDataProperty localDeviceResourceDataProperty =
     * LocalDeviceResourceDataProperty.builder()
     * .sourcePath("sourcePath")
     * // the properties below are optional
     * .groupOwnerSetting(GroupOwnerSettingProperty.builder()
     * .autoAddGroupOwner(false)
     * // the properties below are optional
     * .groupOwner("groupOwner")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-localdeviceresourcedata.html)
     */
    public inline fun cfnResourceDefinitionVersionLocalDeviceResourceDataProperty(
        block: CfnResourceDefinitionVersionLocalDeviceResourceDataPropertyDsl.() -> Unit = {}
    ): CfnResourceDefinitionVersion.LocalDeviceResourceDataProperty {
        val builder = CfnResourceDefinitionVersionLocalDeviceResourceDataPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Settings for a local volume resource, which represents a file or directory on the root file
     * system.
     *
     * For more information, see
     * [Access Local Resources with Lambda Functions](https://docs.aws.amazon.com/greengrass/v1/developerguide/access-local-resources.html)
     * in the *Developer Guide* .
     *
     * In an AWS CloudFormation template, `LocalVolumeResourceData` can be used in the
     * [`ResourceDataContainer`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-resourcedatacontainer.html)
     * property type.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.greengrass.*;
     * LocalVolumeResourceDataProperty localVolumeResourceDataProperty =
     * LocalVolumeResourceDataProperty.builder()
     * .destinationPath("destinationPath")
     * .sourcePath("sourcePath")
     * // the properties below are optional
     * .groupOwnerSetting(GroupOwnerSettingProperty.builder()
     * .autoAddGroupOwner(false)
     * // the properties below are optional
     * .groupOwner("groupOwner")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-localvolumeresourcedata.html)
     */
    public inline fun cfnResourceDefinitionVersionLocalVolumeResourceDataProperty(
        block: CfnResourceDefinitionVersionLocalVolumeResourceDataPropertyDsl.() -> Unit = {}
    ): CfnResourceDefinitionVersion.LocalVolumeResourceDataProperty {
        val builder = CfnResourceDefinitionVersionLocalVolumeResourceDataPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnResourceDefinitionVersion`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.greengrass.*;
     * CfnResourceDefinitionVersionProps cfnResourceDefinitionVersionProps =
     * CfnResourceDefinitionVersionProps.builder()
     * .resourceDefinitionId("resourceDefinitionId")
     * .resources(List.of(ResourceInstanceProperty.builder()
     * .id("id")
     * .name("name")
     * .resourceDataContainer(ResourceDataContainerProperty.builder()
     * .localDeviceResourceData(LocalDeviceResourceDataProperty.builder()
     * .sourcePath("sourcePath")
     * // the properties below are optional
     * .groupOwnerSetting(GroupOwnerSettingProperty.builder()
     * .autoAddGroupOwner(false)
     * // the properties below are optional
     * .groupOwner("groupOwner")
     * .build())
     * .build())
     * .localVolumeResourceData(LocalVolumeResourceDataProperty.builder()
     * .destinationPath("destinationPath")
     * .sourcePath("sourcePath")
     * // the properties below are optional
     * .groupOwnerSetting(GroupOwnerSettingProperty.builder()
     * .autoAddGroupOwner(false)
     * // the properties below are optional
     * .groupOwner("groupOwner")
     * .build())
     * .build())
     * .s3MachineLearningModelResourceData(S3MachineLearningModelResourceDataProperty.builder()
     * .destinationPath("destinationPath")
     * .s3Uri("s3Uri")
     * // the properties below are optional
     * .ownerSetting(ResourceDownloadOwnerSettingProperty.builder()
     * .groupOwner("groupOwner")
     * .groupPermission("groupPermission")
     * .build())
     * .build())
     * .sageMakerMachineLearningModelResourceData(SageMakerMachineLearningModelResourceDataProperty.builder()
     * .destinationPath("destinationPath")
     * .sageMakerJobArn("sageMakerJobArn")
     * // the properties below are optional
     * .ownerSetting(ResourceDownloadOwnerSettingProperty.builder()
     * .groupOwner("groupOwner")
     * .groupPermission("groupPermission")
     * .build())
     * .build())
     * .secretsManagerSecretResourceData(SecretsManagerSecretResourceDataProperty.builder()
     * .arn("arn")
     * // the properties below are optional
     * .additionalStagingLabelsToDownload(List.of("additionalStagingLabelsToDownload"))
     * .build())
     * .build())
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-resourcedefinitionversion.html)
     */
    public inline fun cfnResourceDefinitionVersionProps(
        block: CfnResourceDefinitionVersionPropsDsl.() -> Unit = {}
    ): CfnResourceDefinitionVersionProps {
        val builder = CfnResourceDefinitionVersionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A container for resource data, which defines the resource type.
     *
     * The container takes only one of the following supported resource data types:
     * `LocalDeviceResourceData` , `LocalVolumeResourceData` ,
     * `SageMakerMachineLearningModelResourceData` , `S3MachineLearningModelResourceData` , or
     * `SecretsManagerSecretResourceData` .
     *
     * Only one resource type can be defined for a `ResourceDataContainer` instance.
     *
     * In an AWS CloudFormation template, `ResourceDataContainer` is a property of the
     * [`ResourceInstance`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-resourceinstance.html)
     * property type.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.greengrass.*;
     * ResourceDataContainerProperty resourceDataContainerProperty =
     * ResourceDataContainerProperty.builder()
     * .localDeviceResourceData(LocalDeviceResourceDataProperty.builder()
     * .sourcePath("sourcePath")
     * // the properties below are optional
     * .groupOwnerSetting(GroupOwnerSettingProperty.builder()
     * .autoAddGroupOwner(false)
     * // the properties below are optional
     * .groupOwner("groupOwner")
     * .build())
     * .build())
     * .localVolumeResourceData(LocalVolumeResourceDataProperty.builder()
     * .destinationPath("destinationPath")
     * .sourcePath("sourcePath")
     * // the properties below are optional
     * .groupOwnerSetting(GroupOwnerSettingProperty.builder()
     * .autoAddGroupOwner(false)
     * // the properties below are optional
     * .groupOwner("groupOwner")
     * .build())
     * .build())
     * .s3MachineLearningModelResourceData(S3MachineLearningModelResourceDataProperty.builder()
     * .destinationPath("destinationPath")
     * .s3Uri("s3Uri")
     * // the properties below are optional
     * .ownerSetting(ResourceDownloadOwnerSettingProperty.builder()
     * .groupOwner("groupOwner")
     * .groupPermission("groupPermission")
     * .build())
     * .build())
     * .sageMakerMachineLearningModelResourceData(SageMakerMachineLearningModelResourceDataProperty.builder()
     * .destinationPath("destinationPath")
     * .sageMakerJobArn("sageMakerJobArn")
     * // the properties below are optional
     * .ownerSetting(ResourceDownloadOwnerSettingProperty.builder()
     * .groupOwner("groupOwner")
     * .groupPermission("groupPermission")
     * .build())
     * .build())
     * .secretsManagerSecretResourceData(SecretsManagerSecretResourceDataProperty.builder()
     * .arn("arn")
     * // the properties below are optional
     * .additionalStagingLabelsToDownload(List.of("additionalStagingLabelsToDownload"))
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-resourcedatacontainer.html)
     */
    public inline fun cfnResourceDefinitionVersionResourceDataContainerProperty(
        block: CfnResourceDefinitionVersionResourceDataContainerPropertyDsl.() -> Unit = {}
    ): CfnResourceDefinitionVersion.ResourceDataContainerProperty {
        val builder = CfnResourceDefinitionVersionResourceDataContainerPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The owner setting for a downloaded machine learning resource.
     *
     * For more information, see
     * [Access Machine Learning Resources from Lambda Functions](https://docs.aws.amazon.com/greengrass/v1/developerguide/access-ml-resources.html)
     * in the *Developer Guide* .
     *
     * In an AWS CloudFormation template, `ResourceDownloadOwnerSetting` is the property type of the
     * `OwnerSetting` property for the
     * [`S3MachineLearningModelResourceData`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-s3machinelearningmodelresourcedata.html)
     * and
     * [`SageMakerMachineLearningModelResourceData`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-sagemakermachinelearningmodelresourcedata.html)
     * property types.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.greengrass.*;
     * ResourceDownloadOwnerSettingProperty resourceDownloadOwnerSettingProperty =
     * ResourceDownloadOwnerSettingProperty.builder()
     * .groupOwner("groupOwner")
     * .groupPermission("groupPermission")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-resourcedownloadownersetting.html)
     */
    public inline fun cfnResourceDefinitionVersionResourceDownloadOwnerSettingProperty(
        block: CfnResourceDefinitionVersionResourceDownloadOwnerSettingPropertyDsl.() -> Unit = {}
    ): CfnResourceDefinitionVersion.ResourceDownloadOwnerSettingProperty {
        val builder = CfnResourceDefinitionVersionResourceDownloadOwnerSettingPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A local resource, machine learning resource, or secret resource.
     *
     * For more information, see
     * [Access Local Resources with Lambda Functions](https://docs.aws.amazon.com/greengrass/v1/developerguide/access-local-resources.html)
     * ,
     * [Perform Machine Learning Inference](https://docs.aws.amazon.com/greengrass/v1/developerguide/ml-inference.html)
     * , and
     * [Deploy Secrets to the AWS IoT Greengrass Core](https://docs.aws.amazon.com/greengrass/v1/developerguide/secrets.html)
     * in the *Developer Guide* .
     *
     * In an AWS CloudFormation template, the `Resources` property of the
     * [`AWS::Greengrass::ResourceDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-resourcedefinitionversion.html)
     * resource contains a list of `ResourceInstance` property types.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.greengrass.*;
     * ResourceInstanceProperty resourceInstanceProperty = ResourceInstanceProperty.builder()
     * .id("id")
     * .name("name")
     * .resourceDataContainer(ResourceDataContainerProperty.builder()
     * .localDeviceResourceData(LocalDeviceResourceDataProperty.builder()
     * .sourcePath("sourcePath")
     * // the properties below are optional
     * .groupOwnerSetting(GroupOwnerSettingProperty.builder()
     * .autoAddGroupOwner(false)
     * // the properties below are optional
     * .groupOwner("groupOwner")
     * .build())
     * .build())
     * .localVolumeResourceData(LocalVolumeResourceDataProperty.builder()
     * .destinationPath("destinationPath")
     * .sourcePath("sourcePath")
     * // the properties below are optional
     * .groupOwnerSetting(GroupOwnerSettingProperty.builder()
     * .autoAddGroupOwner(false)
     * // the properties below are optional
     * .groupOwner("groupOwner")
     * .build())
     * .build())
     * .s3MachineLearningModelResourceData(S3MachineLearningModelResourceDataProperty.builder()
     * .destinationPath("destinationPath")
     * .s3Uri("s3Uri")
     * // the properties below are optional
     * .ownerSetting(ResourceDownloadOwnerSettingProperty.builder()
     * .groupOwner("groupOwner")
     * .groupPermission("groupPermission")
     * .build())
     * .build())
     * .sageMakerMachineLearningModelResourceData(SageMakerMachineLearningModelResourceDataProperty.builder()
     * .destinationPath("destinationPath")
     * .sageMakerJobArn("sageMakerJobArn")
     * // the properties below are optional
     * .ownerSetting(ResourceDownloadOwnerSettingProperty.builder()
     * .groupOwner("groupOwner")
     * .groupPermission("groupPermission")
     * .build())
     * .build())
     * .secretsManagerSecretResourceData(SecretsManagerSecretResourceDataProperty.builder()
     * .arn("arn")
     * // the properties below are optional
     * .additionalStagingLabelsToDownload(List.of("additionalStagingLabelsToDownload"))
     * .build())
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-resourceinstance.html)
     */
    public inline fun cfnResourceDefinitionVersionResourceInstanceProperty(
        block: CfnResourceDefinitionVersionResourceInstancePropertyDsl.() -> Unit = {}
    ): CfnResourceDefinitionVersion.ResourceInstanceProperty {
        val builder = CfnResourceDefinitionVersionResourceInstancePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Settings for an Amazon S3 machine learning resource.
     *
     * For more information, see
     * [Perform Machine Learning Inference](https://docs.aws.amazon.com/greengrass/v1/developerguide/ml-inference.html)
     * in the *Developer Guide* .
     *
     * In an AWS CloudFormation template, `S3MachineLearningModelResourceData` can be used in the
     * [`ResourceDataContainer`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-resourcedatacontainer.html)
     * property type.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.greengrass.*;
     * S3MachineLearningModelResourceDataProperty s3MachineLearningModelResourceDataProperty =
     * S3MachineLearningModelResourceDataProperty.builder()
     * .destinationPath("destinationPath")
     * .s3Uri("s3Uri")
     * // the properties below are optional
     * .ownerSetting(ResourceDownloadOwnerSettingProperty.builder()
     * .groupOwner("groupOwner")
     * .groupPermission("groupPermission")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-s3machinelearningmodelresourcedata.html)
     */
    public inline fun cfnResourceDefinitionVersionS3MachineLearningModelResourceDataProperty(
        block:
            CfnResourceDefinitionVersionS3MachineLearningModelResourceDataPropertyDsl.() -> Unit =
            {}
    ): CfnResourceDefinitionVersion.S3MachineLearningModelResourceDataProperty {
        val builder = CfnResourceDefinitionVersionS3MachineLearningModelResourceDataPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Settings for an Secrets Manager machine learning resource.
     *
     * For more information, see
     * [Perform Machine Learning Inference](https://docs.aws.amazon.com/greengrass/v1/developerguide/ml-inference.html)
     * in the *Developer Guide* .
     *
     * In an AWS CloudFormation template, `SageMakerMachineLearningModelResourceData` can be used in
     * the
     * [`ResourceDataContainer`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-resourcedatacontainer.html)
     * property type.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.greengrass.*;
     * SageMakerMachineLearningModelResourceDataProperty
     * sageMakerMachineLearningModelResourceDataProperty =
     * SageMakerMachineLearningModelResourceDataProperty.builder()
     * .destinationPath("destinationPath")
     * .sageMakerJobArn("sageMakerJobArn")
     * // the properties below are optional
     * .ownerSetting(ResourceDownloadOwnerSettingProperty.builder()
     * .groupOwner("groupOwner")
     * .groupPermission("groupPermission")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-sagemakermachinelearningmodelresourcedata.html)
     */
    public inline fun cfnResourceDefinitionVersionSageMakerMachineLearningModelResourceDataProperty(
        block:
            CfnResourceDefinitionVersionSageMakerMachineLearningModelResourceDataPropertyDsl.(
            ) -> Unit =
            {}
    ): CfnResourceDefinitionVersion.SageMakerMachineLearningModelResourceDataProperty {
        val builder =
            CfnResourceDefinitionVersionSageMakerMachineLearningModelResourceDataPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Settings for a secret resource, which references a secret from AWS Secrets Manager .
     *
     * AWS IoT Greengrass stores a local, encrypted copy of the secret on the Greengrass core, where
     * it can be securely accessed by connectors and Lambda functions. For more information, see
     * [Deploy Secrets to the AWS IoT Greengrass Core](https://docs.aws.amazon.com/greengrass/v1/developerguide/secrets.html)
     * in the *Developer Guide* .
     *
     * In an AWS CloudFormation template, `SecretsManagerSecretResourceData` can be used in the
     * [`ResourceDataContainer`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-resourcedatacontainer.html)
     * property type.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.greengrass.*;
     * SecretsManagerSecretResourceDataProperty secretsManagerSecretResourceDataProperty =
     * SecretsManagerSecretResourceDataProperty.builder()
     * .arn("arn")
     * // the properties below are optional
     * .additionalStagingLabelsToDownload(List.of("additionalStagingLabelsToDownload"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-secretsmanagersecretresourcedata.html)
     */
    public inline fun cfnResourceDefinitionVersionSecretsManagerSecretResourceDataProperty(
        block: CfnResourceDefinitionVersionSecretsManagerSecretResourceDataPropertyDsl.() -> Unit =
            {}
    ): CfnResourceDefinitionVersion.SecretsManagerSecretResourceDataProperty {
        val builder = CfnResourceDefinitionVersionSecretsManagerSecretResourceDataPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::Greengrass::SubscriptionDefinition` resource represents a subscription definition
     * for AWS IoT Greengrass .
     *
     * Subscription definitions are used to organize your subscription definition versions.
     *
     * Subscription definitions can reference multiple subscription definition versions. All
     * subscription definition versions must be associated with a subscription definition. Each
     * subscription definition version can contain one or more subscriptions.
     *
     * When you create a subscription definition, you can optionally include an initial subscription
     * definition version. To associate a subscription definition version later, create an
     * [`AWS::Greengrass::SubscriptionDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-subscriptiondefinitionversion.html)
     * resource and specify the ID of this subscription definition.
     *
     * After you create the subscription definition version that contains the subscriptions you want
     * to deploy, you must add it to your group version. For more information, see
     * [`AWS::Greengrass::Group`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-group.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.greengrass.*;
     * Object tags;
     * CfnSubscriptionDefinition cfnSubscriptionDefinition =
     * CfnSubscriptionDefinition.Builder.create(this, "MyCfnSubscriptionDefinition")
     * .name("name")
     * // the properties below are optional
     * .initialVersion(SubscriptionDefinitionVersionProperty.builder()
     * .subscriptions(List.of(SubscriptionProperty.builder()
     * .id("id")
     * .source("source")
     * .subject("subject")
     * .target("target")
     * .build()))
     * .build())
     * .tags(tags)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-subscriptiondefinition.html)
     */
    public inline fun cfnSubscriptionDefinition(
        scope: Construct,
        id: String,
        block: CfnSubscriptionDefinitionDsl.() -> Unit = {},
    ): CfnSubscriptionDefinition {
        val builder = CfnSubscriptionDefinitionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnSubscriptionDefinition`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.greengrass.*;
     * Object tags;
     * CfnSubscriptionDefinitionProps cfnSubscriptionDefinitionProps =
     * CfnSubscriptionDefinitionProps.builder()
     * .name("name")
     * // the properties below are optional
     * .initialVersion(SubscriptionDefinitionVersionProperty.builder()
     * .subscriptions(List.of(SubscriptionProperty.builder()
     * .id("id")
     * .source("source")
     * .subject("subject")
     * .target("target")
     * .build()))
     * .build())
     * .tags(tags)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-subscriptiondefinition.html)
     */
    public inline fun cfnSubscriptionDefinitionProps(
        block: CfnSubscriptionDefinitionPropsDsl.() -> Unit = {}
    ): CfnSubscriptionDefinitionProps {
        val builder = CfnSubscriptionDefinitionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A subscription definition version contains a list of
     * [subscriptions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-subscriptiondefinition-subscription.html)
     * .
     *
     * After you create a subscription definition version that contains the subscriptions you want
     * to deploy, you must add it to your group version. For more information, see
     * [`AWS::Greengrass::Group`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-group.html)
     * .
     *
     * In an AWS CloudFormation template, `SubscriptionDefinitionVersion` is the property type of
     * the `InitialVersion` property in the
     * [`AWS::Greengrass::SubscriptionDefinition`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-subscriptiondefinition.html)
     * resource.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.greengrass.*;
     * SubscriptionDefinitionVersionProperty subscriptionDefinitionVersionProperty =
     * SubscriptionDefinitionVersionProperty.builder()
     * .subscriptions(List.of(SubscriptionProperty.builder()
     * .id("id")
     * .source("source")
     * .subject("subject")
     * .target("target")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-subscriptiondefinition-subscriptiondefinitionversion.html)
     */
    public inline fun cfnSubscriptionDefinitionSubscriptionDefinitionVersionProperty(
        block: CfnSubscriptionDefinitionSubscriptionDefinitionVersionPropertyDsl.() -> Unit = {}
    ): CfnSubscriptionDefinition.SubscriptionDefinitionVersionProperty {
        val builder = CfnSubscriptionDefinitionSubscriptionDefinitionVersionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Subscriptions define how MQTT messages can be exchanged between devices, functions, and
     * connectors in the group, and with AWS IoT or the local shadow service.
     *
     * A subscription defines a message source, message target, and a topic (or subject) that's used
     * to route messages from the source to the target. A subscription defines the message flow in
     * one direction, from the source to the target. For two-way communication, you must set up two
     * subscriptions, one for each direction.
     *
     * In an AWS CloudFormation template, the `Subscriptions` property of the
     * [`SubscriptionDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-subscriptiondefinition-subscriptiondefinitionversion.html)
     * property type contains a list of `Subscription` property types.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.greengrass.*;
     * SubscriptionProperty subscriptionProperty = SubscriptionProperty.builder()
     * .id("id")
     * .source("source")
     * .subject("subject")
     * .target("target")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-subscriptiondefinition-subscription.html)
     */
    public inline fun cfnSubscriptionDefinitionSubscriptionProperty(
        block: CfnSubscriptionDefinitionSubscriptionPropertyDsl.() -> Unit = {}
    ): CfnSubscriptionDefinition.SubscriptionProperty {
        val builder = CfnSubscriptionDefinitionSubscriptionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::Greengrass::SubscriptionDefinitionVersion` resource represents a subscription
     * definition version for AWS IoT Greengrass .
     *
     * A subscription definition version contains a list of subscriptions.
     *
     * To create a subscription definition version, you must specify the ID of the subscription
     * definition that you want to associate with the version. For information about creating a
     * subscription definition, see
     * [`AWS::Greengrass::SubscriptionDefinition`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-subscriptiondefinition.html)
     * .
     *
     * After you create a subscription definition version that contains the subscriptions you want
     * to deploy, you must add it to your group version. For more information, see
     * [`AWS::Greengrass::Group`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-group.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.greengrass.*;
     * CfnSubscriptionDefinitionVersion cfnSubscriptionDefinitionVersion =
     * CfnSubscriptionDefinitionVersion.Builder.create(this, "MyCfnSubscriptionDefinitionVersion")
     * .subscriptionDefinitionId("subscriptionDefinitionId")
     * .subscriptions(List.of(SubscriptionProperty.builder()
     * .id("id")
     * .source("source")
     * .subject("subject")
     * .target("target")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-subscriptiondefinitionversion.html)
     */
    public inline fun cfnSubscriptionDefinitionVersion(
        scope: Construct,
        id: String,
        block: CfnSubscriptionDefinitionVersionDsl.() -> Unit = {},
    ): CfnSubscriptionDefinitionVersion {
        val builder = CfnSubscriptionDefinitionVersionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnSubscriptionDefinitionVersion`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.greengrass.*;
     * CfnSubscriptionDefinitionVersionProps cfnSubscriptionDefinitionVersionProps =
     * CfnSubscriptionDefinitionVersionProps.builder()
     * .subscriptionDefinitionId("subscriptionDefinitionId")
     * .subscriptions(List.of(SubscriptionProperty.builder()
     * .id("id")
     * .source("source")
     * .subject("subject")
     * .target("target")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-subscriptiondefinitionversion.html)
     */
    public inline fun cfnSubscriptionDefinitionVersionProps(
        block: CfnSubscriptionDefinitionVersionPropsDsl.() -> Unit = {}
    ): CfnSubscriptionDefinitionVersionProps {
        val builder = CfnSubscriptionDefinitionVersionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Subscriptions define how MQTT messages can be exchanged between devices, functions, and
     * connectors in the group, and with AWS IoT or the local shadow service.
     *
     * A subscription defines a message source, message target, and a topic (or subject) that's used
     * to route messages from the source to the target. A subscription defines the message flow in
     * one direction, from the source to the target. For two-way communication, you must set up two
     * subscriptions, one for each direction.
     *
     * In an AWS CloudFormation template, the `Subscriptions` property of the
     * [`AWS::Greengrass::SubscriptionDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-subscriptiondefinitionversion.html)
     * resource contains a list of `Subscription` property types.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.greengrass.*;
     * SubscriptionProperty subscriptionProperty = SubscriptionProperty.builder()
     * .id("id")
     * .source("source")
     * .subject("subject")
     * .target("target")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-subscriptiondefinitionversion-subscription.html)
     */
    public inline fun cfnSubscriptionDefinitionVersionSubscriptionProperty(
        block: CfnSubscriptionDefinitionVersionSubscriptionPropertyDsl.() -> Unit = {}
    ): CfnSubscriptionDefinitionVersion.SubscriptionProperty {
        val builder = CfnSubscriptionDefinitionVersionSubscriptionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }
}
