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

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.robomaker.CfnRobotApplication
import software.constructs.Construct

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
@CdkDslMarker
public class CfnRobotApplicationDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnRobotApplication.Builder =
        CfnRobotApplication.Builder.create(scope, id)

    private val _sources: MutableList<Any> = mutableListOf()

    /**
     * The current revision id.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-robotapplication.html#cfn-robomaker-robotapplication-currentrevisionid)
     *
     * @param currentRevisionId The current revision id.
     */
    public fun currentRevisionId(currentRevisionId: String) {
        cdkBuilder.currentRevisionId(currentRevisionId)
    }

    /**
     * The environment of the robot application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-robotapplication.html#cfn-robomaker-robotapplication-environment)
     *
     * @param environment The environment of the robot application.
     */
    public fun environment(environment: String) {
        cdkBuilder.environment(environment)
    }

    /**
     * The name of the robot application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-robotapplication.html#cfn-robomaker-robotapplication-name)
     *
     * @param name The name of the robot application.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * The robot software suite used by the robot application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-robotapplication.html#cfn-robomaker-robotapplication-robotsoftwaresuite)
     *
     * @param robotSoftwareSuite The robot software suite used by the robot application.
     */
    public fun robotSoftwareSuite(robotSoftwareSuite: IResolvable) {
        cdkBuilder.robotSoftwareSuite(robotSoftwareSuite)
    }

    /**
     * The robot software suite used by the robot application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-robotapplication.html#cfn-robomaker-robotapplication-robotsoftwaresuite)
     *
     * @param robotSoftwareSuite The robot software suite used by the robot application.
     */
    public fun robotSoftwareSuite(
        robotSoftwareSuite: CfnRobotApplication.RobotSoftwareSuiteProperty
    ) {
        cdkBuilder.robotSoftwareSuite(robotSoftwareSuite)
    }

    /**
     * The sources of the robot application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-robotapplication.html#cfn-robomaker-robotapplication-sources)
     *
     * @param sources The sources of the robot application.
     */
    public fun sources(vararg sources: Any) {
        _sources.addAll(listOf(*sources))
    }

    /**
     * The sources of the robot application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-robotapplication.html#cfn-robomaker-robotapplication-sources)
     *
     * @param sources The sources of the robot application.
     */
    public fun sources(sources: Collection<Any>) {
        _sources.addAll(sources)
    }

    /**
     * The sources of the robot application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-robotapplication.html#cfn-robomaker-robotapplication-sources)
     *
     * @param sources The sources of the robot application.
     */
    public fun sources(sources: IResolvable) {
        cdkBuilder.sources(sources)
    }

    /**
     * A map that contains tag keys and tag values that are attached to the robot application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-robotapplication.html#cfn-robomaker-robotapplication-tags)
     *
     * @param tags A map that contains tag keys and tag values that are attached to the robot
     *   application.
     */
    public fun tags(tags: Map<String, String>) {
        cdkBuilder.tags(tags)
    }

    public fun build(): CfnRobotApplication {
        if (_sources.isNotEmpty()) cdkBuilder.sources(_sources)
        return cdkBuilder.build()
    }
}
