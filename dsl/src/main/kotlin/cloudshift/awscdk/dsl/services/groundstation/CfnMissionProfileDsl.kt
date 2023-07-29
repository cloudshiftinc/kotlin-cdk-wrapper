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

package cloudshift.awscdk.dsl.services.groundstation

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.groundstation.CfnMissionProfile
import software.constructs.Construct

/**
 * Mission profiles specify parameters and provide references to config objects to define how Ground
 * Station lists and executes contacts.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.groundstation.*;
 * CfnMissionProfile cfnMissionProfile = CfnMissionProfile.Builder.create(this,
 * "MyCfnMissionProfile")
 * .dataflowEdges(List.of(DataflowEdgeProperty.builder()
 * .destination("destination")
 * .source("source")
 * .build()))
 * .minimumViableContactDurationSeconds(123)
 * .name("name")
 * .trackingConfigArn("trackingConfigArn")
 * // the properties below are optional
 * .contactPostPassDurationSeconds(123)
 * .contactPrePassDurationSeconds(123)
 * .streamsKmsKey(StreamsKmsKeyProperty.builder()
 * .kmsAliasArn("kmsAliasArn")
 * .kmsKeyArn("kmsKeyArn")
 * .build())
 * .streamsKmsRole("streamsKmsRole")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-groundstation-missionprofile.html)
 */
@CdkDslMarker
public class CfnMissionProfileDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnMissionProfile.Builder = CfnMissionProfile.Builder.create(scope, id)

    private val _dataflowEdges: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * Amount of time in seconds after a contact ends that you’d like to receive a CloudWatch Event
     * indicating the pass has finished.
     *
     * For more information on CloudWatch Events, see the
     * [What Is CloudWatch Events?](https://docs.aws.amazon.com/AmazonCloudWatch/latest/events/WhatIsCloudWatchEvents.html)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-groundstation-missionprofile.html#cfn-groundstation-missionprofile-contactpostpassdurationseconds)
     *
     * @param contactPostPassDurationSeconds Amount of time in seconds after a contact ends that
     *   you’d like to receive a CloudWatch Event indicating the pass has finished.
     */
    public fun contactPostPassDurationSeconds(contactPostPassDurationSeconds: Number) {
        cdkBuilder.contactPostPassDurationSeconds(contactPostPassDurationSeconds)
    }

    /**
     * Amount of time in seconds prior to contact start that you'd like to receive a CloudWatch
     * Event indicating an upcoming pass.
     *
     * For more information on CloudWatch Events, see the
     * [What Is CloudWatch Events?](https://docs.aws.amazon.com/AmazonCloudWatch/latest/events/WhatIsCloudWatchEvents.html)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-groundstation-missionprofile.html#cfn-groundstation-missionprofile-contactprepassdurationseconds)
     *
     * @param contactPrePassDurationSeconds Amount of time in seconds prior to contact start that
     *   you'd like to receive a CloudWatch Event indicating an upcoming pass.
     */
    public fun contactPrePassDurationSeconds(contactPrePassDurationSeconds: Number) {
        cdkBuilder.contactPrePassDurationSeconds(contactPrePassDurationSeconds)
    }

    /**
     * A list containing lists of config ARNs.
     *
     * Each list of config ARNs is an edge, with a "from" config and a "to" config.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-groundstation-missionprofile.html#cfn-groundstation-missionprofile-dataflowedges)
     *
     * @param dataflowEdges A list containing lists of config ARNs.
     */
    public fun dataflowEdges(vararg dataflowEdges: Any) {
        _dataflowEdges.addAll(listOf(*dataflowEdges))
    }

    /**
     * A list containing lists of config ARNs.
     *
     * Each list of config ARNs is an edge, with a "from" config and a "to" config.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-groundstation-missionprofile.html#cfn-groundstation-missionprofile-dataflowedges)
     *
     * @param dataflowEdges A list containing lists of config ARNs.
     */
    public fun dataflowEdges(dataflowEdges: Collection<Any>) {
        _dataflowEdges.addAll(dataflowEdges)
    }

    /**
     * A list containing lists of config ARNs.
     *
     * Each list of config ARNs is an edge, with a "from" config and a "to" config.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-groundstation-missionprofile.html#cfn-groundstation-missionprofile-dataflowedges)
     *
     * @param dataflowEdges A list containing lists of config ARNs.
     */
    public fun dataflowEdges(dataflowEdges: IResolvable) {
        cdkBuilder.dataflowEdges(dataflowEdges)
    }

    /**
     * Minimum length of a contact in seconds that Ground Station will return when listing contacts.
     *
     * Ground Station will not return contacts shorter than this duration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-groundstation-missionprofile.html#cfn-groundstation-missionprofile-minimumviablecontactdurationseconds)
     *
     * @param minimumViableContactDurationSeconds Minimum length of a contact in seconds that Ground
     *   Station will return when listing contacts.
     */
    public fun minimumViableContactDurationSeconds(minimumViableContactDurationSeconds: Number) {
        cdkBuilder.minimumViableContactDurationSeconds(minimumViableContactDurationSeconds)
    }

    /**
     * The name of the mission profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-groundstation-missionprofile.html#cfn-groundstation-missionprofile-name)
     *
     * @param name The name of the mission profile.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-groundstation-missionprofile.html#cfn-groundstation-missionprofile-streamskmskey)
     *
     * @param streamsKmsKey
     */
    public fun streamsKmsKey(streamsKmsKey: IResolvable) {
        cdkBuilder.streamsKmsKey(streamsKmsKey)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-groundstation-missionprofile.html#cfn-groundstation-missionprofile-streamskmskey)
     *
     * @param streamsKmsKey
     */
    public fun streamsKmsKey(streamsKmsKey: CfnMissionProfile.StreamsKmsKeyProperty) {
        cdkBuilder.streamsKmsKey(streamsKmsKey)
    }

    /**
     * The ARN of the KMS Key or Alias Key role used to define permissions on KMS Key usage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-groundstation-missionprofile.html#cfn-groundstation-missionprofile-streamskmsrole)
     *
     * @param streamsKmsRole The ARN of the KMS Key or Alias Key role used to define permissions on
     *   KMS Key usage.
     */
    public fun streamsKmsRole(streamsKmsRole: String) {
        cdkBuilder.streamsKmsRole(streamsKmsRole)
    }

    /**
     * Tags assigned to the mission profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-groundstation-missionprofile.html#cfn-groundstation-missionprofile-tags)
     *
     * @param tags Tags assigned to the mission profile.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * Tags assigned to the mission profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-groundstation-missionprofile.html#cfn-groundstation-missionprofile-tags)
     *
     * @param tags Tags assigned to the mission profile.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * The ARN of a tracking config objects that defines how to track the satellite through the sky
     * during a contact.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-groundstation-missionprofile.html#cfn-groundstation-missionprofile-trackingconfigarn)
     *
     * @param trackingConfigArn The ARN of a tracking config objects that defines how to track the
     *   satellite through the sky during a contact.
     */
    public fun trackingConfigArn(trackingConfigArn: String) {
        cdkBuilder.trackingConfigArn(trackingConfigArn)
    }

    public fun build(): CfnMissionProfile {
        if (_dataflowEdges.isNotEmpty()) cdkBuilder.dataflowEdges(_dataflowEdges)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
