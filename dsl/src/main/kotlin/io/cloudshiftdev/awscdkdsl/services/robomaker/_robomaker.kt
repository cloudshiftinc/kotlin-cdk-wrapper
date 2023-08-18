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

package io.cloudshiftdev.awscdkdsl.services.robomaker

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.robomaker.CfnFleet
import software.amazon.awscdk.services.robomaker.CfnFleetProps
import software.amazon.awscdk.services.robomaker.CfnRobot
import software.amazon.awscdk.services.robomaker.CfnRobotApplication
import software.amazon.awscdk.services.robomaker.CfnRobotApplicationProps
import software.amazon.awscdk.services.robomaker.CfnRobotApplicationVersion
import software.amazon.awscdk.services.robomaker.CfnRobotApplicationVersionProps
import software.amazon.awscdk.services.robomaker.CfnRobotProps
import software.amazon.awscdk.services.robomaker.CfnSimulationApplication
import software.amazon.awscdk.services.robomaker.CfnSimulationApplicationProps
import software.amazon.awscdk.services.robomaker.CfnSimulationApplicationVersion
import software.amazon.awscdk.services.robomaker.CfnSimulationApplicationVersionProps
import software.constructs.Construct

public object robomaker {
    /**
     * The following resource is now deprecated.
     *
     * This resource can no longer be provisioned via stack create or update operations, and should
     * not be included in your stack templates.
     *
     * We recommend migrating to AWS IoT Greengrass Version 2. For more information, see
     * [Support Changes: May 2, 2022](https://docs.aws.amazon.com/robomaker/latest/dg/chapter-support-policy.html#software-support-policy-may2022)
     * in the *AWS RoboMaker Developer Guide* .
     *
     * The `AWS::RoboMaker::Fleet` resource creates an AWS RoboMaker fleet. Fleets contain robots
     * and can receive deployments.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.robomaker.*;
     * CfnFleet cfnFleet = CfnFleet.Builder.create(this, "MyCfnFleet")
     * .name("name")
     * .tags(Map.of(
     * "tagsKey", "tags"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-fleet.html)
     */
    public inline fun cfnFleet(
        scope: Construct,
        id: String,
        block: CfnFleetDsl.() -> Unit = {},
    ): CfnFleet {
        val builder = CfnFleetDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnFleet`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.robomaker.*;
     * CfnFleetProps cfnFleetProps = CfnFleetProps.builder()
     * .name("name")
     * .tags(Map.of(
     * "tagsKey", "tags"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-fleet.html)
     */
    public inline fun cfnFleetProps(block: CfnFleetPropsDsl.() -> Unit = {}): CfnFleetProps {
        val builder = CfnFleetPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The following resource is now deprecated.
     *
     * This resource can no longer be provisioned via stack create or update operations, and should
     * not be included in your stack templates.
     *
     * We recommend migrating to AWS IoT Greengrass Version 2. For more information, see
     * [Support Changes: May 2, 2022](https://docs.aws.amazon.com/robomaker/latest/dg/chapter-support-policy.html#software-support-policy-may2022)
     * in the *AWS RoboMaker Developer Guide* .
     *
     * The `AWS::RoboMaker::RobotApplication` resource creates an AWS RoboMaker robot.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.robomaker.*;
     * CfnRobot cfnRobot = CfnRobot.Builder.create(this, "MyCfnRobot")
     * .architecture("architecture")
     * .greengrassGroupId("greengrassGroupId")
     * // the properties below are optional
     * .fleet("fleet")
     * .name("name")
     * .tags(Map.of(
     * "tagsKey", "tags"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-robot.html)
     */
    public inline fun cfnRobot(
        scope: Construct,
        id: String,
        block: CfnRobotDsl.() -> Unit = {},
    ): CfnRobot {
        val builder = CfnRobotDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::RoboMaker::RobotApplication` resource creates an AWS RoboMaker robot application.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.robomaker.*;
     * CfnRobotApplication cfnRobotApplication = CfnRobotApplication.Builder.create(this,
     * "MyCfnRobotApplication")
     * .robotSoftwareSuite(RobotSoftwareSuiteProperty.builder()
     * .name("name")
     * // the properties below are optional
     * .version("version")
     * .build())
     * // the properties below are optional
     * .currentRevisionId("currentRevisionId")
     * .environment("environment")
     * .name("name")
     * .sources(List.of(SourceConfigProperty.builder()
     * .architecture("architecture")
     * .s3Bucket("s3Bucket")
     * .s3Key("s3Key")
     * .build()))
     * .tags(Map.of(
     * "tagsKey", "tags"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-robotapplication.html)
     */
    public inline fun cfnRobotApplication(
        scope: Construct,
        id: String,
        block: CfnRobotApplicationDsl.() -> Unit = {},
    ): CfnRobotApplication {
        val builder = CfnRobotApplicationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnRobotApplication`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.robomaker.*;
     * CfnRobotApplicationProps cfnRobotApplicationProps = CfnRobotApplicationProps.builder()
     * .robotSoftwareSuite(RobotSoftwareSuiteProperty.builder()
     * .name("name")
     * // the properties below are optional
     * .version("version")
     * .build())
     * // the properties below are optional
     * .currentRevisionId("currentRevisionId")
     * .environment("environment")
     * .name("name")
     * .sources(List.of(SourceConfigProperty.builder()
     * .architecture("architecture")
     * .s3Bucket("s3Bucket")
     * .s3Key("s3Key")
     * .build()))
     * .tags(Map.of(
     * "tagsKey", "tags"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-robotapplication.html)
     */
    public inline fun cfnRobotApplicationProps(
        block: CfnRobotApplicationPropsDsl.() -> Unit = {}
    ): CfnRobotApplicationProps {
        val builder = CfnRobotApplicationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Information about a robot software suite.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.robomaker.*;
     * RobotSoftwareSuiteProperty robotSoftwareSuiteProperty = RobotSoftwareSuiteProperty.builder()
     * .name("name")
     * // the properties below are optional
     * .version("version")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-robomaker-robotapplication-robotsoftwaresuite.html)
     */
    public inline fun cfnRobotApplicationRobotSoftwareSuiteProperty(
        block: CfnRobotApplicationRobotSoftwareSuitePropertyDsl.() -> Unit = {}
    ): CfnRobotApplication.RobotSoftwareSuiteProperty {
        val builder = CfnRobotApplicationRobotSoftwareSuitePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Information about a source configuration.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.robomaker.*;
     * SourceConfigProperty sourceConfigProperty = SourceConfigProperty.builder()
     * .architecture("architecture")
     * .s3Bucket("s3Bucket")
     * .s3Key("s3Key")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-robomaker-robotapplication-sourceconfig.html)
     */
    public inline fun cfnRobotApplicationSourceConfigProperty(
        block: CfnRobotApplicationSourceConfigPropertyDsl.() -> Unit = {}
    ): CfnRobotApplication.SourceConfigProperty {
        val builder = CfnRobotApplicationSourceConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::RoboMaker::RobotApplicationVersion` resource creates an AWS RoboMaker robot
     * version.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.robomaker.*;
     * CfnRobotApplicationVersion cfnRobotApplicationVersion =
     * CfnRobotApplicationVersion.Builder.create(this, "MyCfnRobotApplicationVersion")
     * .application("application")
     * // the properties below are optional
     * .currentRevisionId("currentRevisionId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-robotapplicationversion.html)
     */
    public inline fun cfnRobotApplicationVersion(
        scope: Construct,
        id: String,
        block: CfnRobotApplicationVersionDsl.() -> Unit = {},
    ): CfnRobotApplicationVersion {
        val builder = CfnRobotApplicationVersionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnRobotApplicationVersion`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.robomaker.*;
     * CfnRobotApplicationVersionProps cfnRobotApplicationVersionProps =
     * CfnRobotApplicationVersionProps.builder()
     * .application("application")
     * // the properties below are optional
     * .currentRevisionId("currentRevisionId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-robotapplicationversion.html)
     */
    public inline fun cfnRobotApplicationVersionProps(
        block: CfnRobotApplicationVersionPropsDsl.() -> Unit = {}
    ): CfnRobotApplicationVersionProps {
        val builder = CfnRobotApplicationVersionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnRobot`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.robomaker.*;
     * CfnRobotProps cfnRobotProps = CfnRobotProps.builder()
     * .architecture("architecture")
     * .greengrassGroupId("greengrassGroupId")
     * // the properties below are optional
     * .fleet("fleet")
     * .name("name")
     * .tags(Map.of(
     * "tagsKey", "tags"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-robot.html)
     */
    public inline fun cfnRobotProps(block: CfnRobotPropsDsl.() -> Unit = {}): CfnRobotProps {
        val builder = CfnRobotPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::RoboMaker::SimulationApplication` resource creates an AWS RoboMaker simulation
     * application.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.robomaker.*;
     * CfnSimulationApplication cfnSimulationApplication =
     * CfnSimulationApplication.Builder.create(this, "MyCfnSimulationApplication")
     * .robotSoftwareSuite(RobotSoftwareSuiteProperty.builder()
     * .name("name")
     * // the properties below are optional
     * .version("version")
     * .build())
     * .simulationSoftwareSuite(SimulationSoftwareSuiteProperty.builder()
     * .name("name")
     * // the properties below are optional
     * .version("version")
     * .build())
     * // the properties below are optional
     * .currentRevisionId("currentRevisionId")
     * .environment("environment")
     * .name("name")
     * .renderingEngine(RenderingEngineProperty.builder()
     * .name("name")
     * .version("version")
     * .build())
     * .sources(List.of(SourceConfigProperty.builder()
     * .architecture("architecture")
     * .s3Bucket("s3Bucket")
     * .s3Key("s3Key")
     * .build()))
     * .tags(Map.of(
     * "tagsKey", "tags"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-simulationapplication.html)
     */
    public inline fun cfnSimulationApplication(
        scope: Construct,
        id: String,
        block: CfnSimulationApplicationDsl.() -> Unit = {},
    ): CfnSimulationApplication {
        val builder = CfnSimulationApplicationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnSimulationApplication`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.robomaker.*;
     * CfnSimulationApplicationProps cfnSimulationApplicationProps =
     * CfnSimulationApplicationProps.builder()
     * .robotSoftwareSuite(RobotSoftwareSuiteProperty.builder()
     * .name("name")
     * // the properties below are optional
     * .version("version")
     * .build())
     * .simulationSoftwareSuite(SimulationSoftwareSuiteProperty.builder()
     * .name("name")
     * // the properties below are optional
     * .version("version")
     * .build())
     * // the properties below are optional
     * .currentRevisionId("currentRevisionId")
     * .environment("environment")
     * .name("name")
     * .renderingEngine(RenderingEngineProperty.builder()
     * .name("name")
     * .version("version")
     * .build())
     * .sources(List.of(SourceConfigProperty.builder()
     * .architecture("architecture")
     * .s3Bucket("s3Bucket")
     * .s3Key("s3Key")
     * .build()))
     * .tags(Map.of(
     * "tagsKey", "tags"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-simulationapplication.html)
     */
    public inline fun cfnSimulationApplicationProps(
        block: CfnSimulationApplicationPropsDsl.() -> Unit = {}
    ): CfnSimulationApplicationProps {
        val builder = CfnSimulationApplicationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Information about a rendering engine.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.robomaker.*;
     * RenderingEngineProperty renderingEngineProperty = RenderingEngineProperty.builder()
     * .name("name")
     * .version("version")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-robomaker-simulationapplication-renderingengine.html)
     */
    public inline fun cfnSimulationApplicationRenderingEngineProperty(
        block: CfnSimulationApplicationRenderingEnginePropertyDsl.() -> Unit = {}
    ): CfnSimulationApplication.RenderingEngineProperty {
        val builder = CfnSimulationApplicationRenderingEnginePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Information about a robot software suite.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.robomaker.*;
     * RobotSoftwareSuiteProperty robotSoftwareSuiteProperty = RobotSoftwareSuiteProperty.builder()
     * .name("name")
     * // the properties below are optional
     * .version("version")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-robomaker-simulationapplication-robotsoftwaresuite.html)
     */
    public inline fun cfnSimulationApplicationRobotSoftwareSuiteProperty(
        block: CfnSimulationApplicationRobotSoftwareSuitePropertyDsl.() -> Unit = {}
    ): CfnSimulationApplication.RobotSoftwareSuiteProperty {
        val builder = CfnSimulationApplicationRobotSoftwareSuitePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Information about a simulation software suite.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.robomaker.*;
     * SimulationSoftwareSuiteProperty simulationSoftwareSuiteProperty =
     * SimulationSoftwareSuiteProperty.builder()
     * .name("name")
     * // the properties below are optional
     * .version("version")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-robomaker-simulationapplication-simulationsoftwaresuite.html)
     */
    public inline fun cfnSimulationApplicationSimulationSoftwareSuiteProperty(
        block: CfnSimulationApplicationSimulationSoftwareSuitePropertyDsl.() -> Unit = {}
    ): CfnSimulationApplication.SimulationSoftwareSuiteProperty {
        val builder = CfnSimulationApplicationSimulationSoftwareSuitePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Information about a source configuration.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.robomaker.*;
     * SourceConfigProperty sourceConfigProperty = SourceConfigProperty.builder()
     * .architecture("architecture")
     * .s3Bucket("s3Bucket")
     * .s3Key("s3Key")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-robomaker-simulationapplication-sourceconfig.html)
     */
    public inline fun cfnSimulationApplicationSourceConfigProperty(
        block: CfnSimulationApplicationSourceConfigPropertyDsl.() -> Unit = {}
    ): CfnSimulationApplication.SourceConfigProperty {
        val builder = CfnSimulationApplicationSourceConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::RoboMaker::SimulationApplicationVersion` resource creates a version of an AWS
     * RoboMaker simulation application.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.robomaker.*;
     * CfnSimulationApplicationVersion cfnSimulationApplicationVersion =
     * CfnSimulationApplicationVersion.Builder.create(this, "MyCfnSimulationApplicationVersion")
     * .application("application")
     * // the properties below are optional
     * .currentRevisionId("currentRevisionId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-simulationapplicationversion.html)
     */
    public inline fun cfnSimulationApplicationVersion(
        scope: Construct,
        id: String,
        block: CfnSimulationApplicationVersionDsl.() -> Unit = {},
    ): CfnSimulationApplicationVersion {
        val builder = CfnSimulationApplicationVersionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnSimulationApplicationVersion`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.robomaker.*;
     * CfnSimulationApplicationVersionProps cfnSimulationApplicationVersionProps =
     * CfnSimulationApplicationVersionProps.builder()
     * .application("application")
     * // the properties below are optional
     * .currentRevisionId("currentRevisionId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-simulationapplicationversion.html)
     */
    public inline fun cfnSimulationApplicationVersionProps(
        block: CfnSimulationApplicationVersionPropsDsl.() -> Unit = {}
    ): CfnSimulationApplicationVersionProps {
        val builder = CfnSimulationApplicationVersionPropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
