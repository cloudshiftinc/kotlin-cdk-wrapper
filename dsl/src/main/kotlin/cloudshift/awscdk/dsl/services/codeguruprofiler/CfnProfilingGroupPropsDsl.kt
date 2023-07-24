@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.codeguruprofiler

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.codeguruprofiler.CfnProfilingGroupProps
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

/**
 * Properties for defining a `CfnProfilingGroup`.
 *
 * Example:
 *
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
@CdkDslMarker
public class CfnProfilingGroupPropsDsl {
    private val cdkBuilder: CfnProfilingGroupProps.Builder = CfnProfilingGroupProps.builder()

    private val _anomalyDetectionNotificationConfiguration: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param agentPermissions The agent permissions attached to this profiling group.
     * This action group grants `ConfigureAgent` and `PostAgentProfile` permissions to perform actions
     * required by the profiling agent. The Json consists of key `Principals` .
     *
     * *Principals* : A list of string ARNs for the roles and users you want to grant access to the
     * profiling group. Wildcards are not supported in the ARNs. You are allowed to provide up to 50
     * ARNs. An empty list is not permitted. This is a required key.
     *
     * For more information, see [Resource-based policies in CodeGuru
   * Profiler](https://docs.aws.amazon.com/codeguru/latest/profiler-ug/resource-based-policies.html) in
     * the *Amazon CodeGuru Profiler user guide* ,
     * [ConfigureAgent](https://docs.aws.amazon.com/codeguru/latest/profiler-api/API_ConfigureAgent.html)
     * , and
     * [PostAgentProfile](https://docs.aws.amazon.com/codeguru/latest/profiler-api/API_PostAgentProfile.html)
     * .
     */
    public fun agentPermissions(agentPermissions: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(agentPermissions)
        cdkBuilder.agentPermissions(builder.map)
    }

    /**
     * @param agentPermissions The agent permissions attached to this profiling group.
     * This action group grants `ConfigureAgent` and `PostAgentProfile` permissions to perform actions
     * required by the profiling agent. The Json consists of key `Principals` .
     *
     * *Principals* : A list of string ARNs for the roles and users you want to grant access to the
     * profiling group. Wildcards are not supported in the ARNs. You are allowed to provide up to 50
     * ARNs. An empty list is not permitted. This is a required key.
     *
     * For more information, see [Resource-based policies in CodeGuru
   * Profiler](https://docs.aws.amazon.com/codeguru/latest/profiler-ug/resource-based-policies.html) in
     * the *Amazon CodeGuru Profiler user guide* ,
     * [ConfigureAgent](https://docs.aws.amazon.com/codeguru/latest/profiler-api/API_ConfigureAgent.html)
     * , and
     * [PostAgentProfile](https://docs.aws.amazon.com/codeguru/latest/profiler-api/API_PostAgentProfile.html)
     * .
     */
    public fun agentPermissions(agentPermissions: Any) {
        cdkBuilder.agentPermissions(agentPermissions)
    }

    /**
     * @param anomalyDetectionNotificationConfiguration Adds anomaly notifications for a profiling
     * group.
     */
    public fun anomalyDetectionNotificationConfiguration(vararg anomalyDetectionNotificationConfiguration: Any) {
        _anomalyDetectionNotificationConfiguration.addAll(listOf(*anomalyDetectionNotificationConfiguration))
    }

    /**
     * @param anomalyDetectionNotificationConfiguration Adds anomaly notifications for a profiling
     * group.
     */
    public fun anomalyDetectionNotificationConfiguration(anomalyDetectionNotificationConfiguration: Collection<Any>) {
        _anomalyDetectionNotificationConfiguration.addAll(anomalyDetectionNotificationConfiguration)
    }

    /**
     * @param anomalyDetectionNotificationConfiguration Adds anomaly notifications for a profiling
     * group.
     */
    public fun anomalyDetectionNotificationConfiguration(anomalyDetectionNotificationConfiguration: IResolvable) {
        cdkBuilder.anomalyDetectionNotificationConfiguration(anomalyDetectionNotificationConfiguration)
    }

    /**
     * @param computePlatform The compute platform of the profiling group.
     * Use `AWSLambda` if your application runs on AWS Lambda. Use `Default` if your application runs
     * on a compute platform that is not AWS Lambda , such an Amazon EC2 instance, an on-premises server,
     * or a different platform. If not specified, `Default` is used. This property is immutable.
     */
    public fun computePlatform(computePlatform: String) {
        cdkBuilder.computePlatform(computePlatform)
    }

    /**
     * @param profilingGroupName The name of the profiling group.
     */
    public fun profilingGroupName(profilingGroupName: String) {
        cdkBuilder.profilingGroupName(profilingGroupName)
    }

    /**
     * @param tags A list of tags to add to the created profiling group.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags A list of tags to add to the created profiling group.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnProfilingGroupProps {
        if (_anomalyDetectionNotificationConfiguration.isNotEmpty()) {
            cdkBuilder.anomalyDetectionNotificationConfiguration(_anomalyDetectionNotificationConfiguration)
        }
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
