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

package cloudshift.awscdk.dsl.services.codeguruprofiler

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.codeguruprofiler.CfnProfilingGroup
import software.amazon.awscdk.services.codeguruprofiler.CfnProfilingGroupProps
import software.amazon.awscdk.services.codeguruprofiler.ProfilingGroup
import software.amazon.awscdk.services.codeguruprofiler.ProfilingGroupProps
import software.constructs.Construct

public object codeguruprofiler {
    /**
     * Creates a profiling group.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.codeguruprofiler.*;
     * Object agentPermissions;
     * CfnProfilingGroup cfnProfilingGroup = CfnProfilingGroup.Builder.create(this,
     * "MyCfnProfilingGroup")
     * .profilingGroupName("profilingGroupName")
     * // the properties below are optional
     * .agentPermissions(agentPermissions)
     * .anomalyDetectionNotificationConfiguration(List.of(ChannelProperty.builder()
     * .channelUri("channelUri")
     * // the properties below are optional
     * .channelId("channelId")
     * .build()))
     * .computePlatform("computePlatform")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeguruprofiler-profilinggroup.html)
     */
    public inline fun cfnProfilingGroup(
        scope: Construct,
        id: String,
        block: CfnProfilingGroupDsl.() -> Unit = {},
    ): CfnProfilingGroup {
        val builder = CfnProfilingGroupDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The agent permissions attached to this profiling group.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.codeguruprofiler.*;
     * AgentPermissionsProperty agentPermissionsProperty = AgentPermissionsProperty.builder()
     * .principals(List.of("principals"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codeguruprofiler-profilinggroup-agentpermissions.html)
     */
    public inline fun cfnProfilingGroupAgentPermissionsProperty(
        block: CfnProfilingGroupAgentPermissionsPropertyDsl.() -> Unit = {}
    ): CfnProfilingGroup.AgentPermissionsProperty {
        val builder = CfnProfilingGroupAgentPermissionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Notification medium for users to get alerted for events that occur in application profile.
     *
     * We support SNS topic as a notification channel.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.codeguruprofiler.*;
     * ChannelProperty channelProperty = ChannelProperty.builder()
     * .channelUri("channelUri")
     * // the properties below are optional
     * .channelId("channelId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codeguruprofiler-profilinggroup-channel.html)
     */
    public inline fun cfnProfilingGroupChannelProperty(
        block: CfnProfilingGroupChannelPropertyDsl.() -> Unit = {}
    ): CfnProfilingGroup.ChannelProperty {
        val builder = CfnProfilingGroupChannelPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnProfilingGroup`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.codeguruprofiler.*;
     * Object agentPermissions;
     * CfnProfilingGroupProps cfnProfilingGroupProps = CfnProfilingGroupProps.builder()
     * .profilingGroupName("profilingGroupName")
     * // the properties below are optional
     * .agentPermissions(agentPermissions)
     * .anomalyDetectionNotificationConfiguration(List.of(ChannelProperty.builder()
     * .channelUri("channelUri")
     * // the properties below are optional
     * .channelId("channelId")
     * .build()))
     * .computePlatform("computePlatform")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeguruprofiler-profilinggroup.html)
     */
    public inline fun cfnProfilingGroupProps(
        block: CfnProfilingGroupPropsDsl.() -> Unit = {}
    ): CfnProfilingGroupProps {
        val builder = CfnProfilingGroupPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A new Profiling Group.
     *
     * Example:
     * ```
     * // The execution role of your application that publishes to the ProfilingGroup via CodeGuru
     * Profiler Profiling Agent. (the following is merely an example)
     * Role publishAppRole = Role.Builder.create(this, "PublishAppRole")
     * .assumedBy(new AccountRootPrincipal())
     * .build();
     * ProfilingGroup profilingGroup = new ProfilingGroup(this, "MyProfilingGroup");
     * profilingGroup.grantPublish(publishAppRole);
     * ```
     */
    public inline fun profilingGroup(
        scope: Construct,
        id: String,
        block: ProfilingGroupDsl.() -> Unit = {},
    ): ProfilingGroup {
        val builder = ProfilingGroupDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for creating a new Profiling Group.
     *
     * Example:
     * ```
     * ProfilingGroup profilingGroup = ProfilingGroup.Builder.create(this, "MyProfilingGroup")
     * .computePlatform(ComputePlatform.AWS_LAMBDA)
     * .build();
     * ```
     */
    public inline fun profilingGroupProps(
        block: ProfilingGroupPropsDsl.() -> Unit = {}
    ): ProfilingGroupProps {
        val builder = ProfilingGroupPropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
