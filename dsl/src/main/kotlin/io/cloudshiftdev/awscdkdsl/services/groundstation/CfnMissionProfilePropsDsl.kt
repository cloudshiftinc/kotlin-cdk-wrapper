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

package io.cloudshiftdev.awscdkdsl.services.groundstation

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.groundstation.CfnMissionProfile
import software.amazon.awscdk.services.groundstation.CfnMissionProfileProps

/**
 * Properties for defining a `CfnMissionProfile`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.groundstation.*;
 * CfnMissionProfileProps cfnMissionProfileProps = CfnMissionProfileProps.builder()
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
public class CfnMissionProfilePropsDsl {
    private val cdkBuilder: CfnMissionProfileProps.Builder = CfnMissionProfileProps.builder()

    private val _dataflowEdges: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param contactPostPassDurationSeconds Amount of time in seconds after a contact ends that
     *   you’d like to receive a Ground Station Contact State Change indicating the pass has
     *   finished.
     */
    public fun contactPostPassDurationSeconds(contactPostPassDurationSeconds: Number) {
        cdkBuilder.contactPostPassDurationSeconds(contactPostPassDurationSeconds)
    }

    /**
     * @param contactPrePassDurationSeconds Amount of time in seconds prior to contact start that
     *   you'd like to receive a Ground Station Contact State Change Event indicating an upcoming
     *   pass.
     */
    public fun contactPrePassDurationSeconds(contactPrePassDurationSeconds: Number) {
        cdkBuilder.contactPrePassDurationSeconds(contactPrePassDurationSeconds)
    }

    /**
     * @param dataflowEdges A list containing lists of config ARNs. Each list of config ARNs is an
     *   edge, with a "from" config and a "to" config.
     */
    public fun dataflowEdges(vararg dataflowEdges: Any) {
        _dataflowEdges.addAll(listOf(*dataflowEdges))
    }

    /**
     * @param dataflowEdges A list containing lists of config ARNs. Each list of config ARNs is an
     *   edge, with a "from" config and a "to" config.
     */
    public fun dataflowEdges(dataflowEdges: Collection<Any>) {
        _dataflowEdges.addAll(dataflowEdges)
    }

    /**
     * @param dataflowEdges A list containing lists of config ARNs. Each list of config ARNs is an
     *   edge, with a "from" config and a "to" config.
     */
    public fun dataflowEdges(dataflowEdges: IResolvable) {
        cdkBuilder.dataflowEdges(dataflowEdges)
    }

    /**
     * @param minimumViableContactDurationSeconds Minimum length of a contact in seconds that Ground
     *   Station will return when listing contacts. Ground Station will not return contacts shorter
     *   than this duration.
     */
    public fun minimumViableContactDurationSeconds(minimumViableContactDurationSeconds: Number) {
        cdkBuilder.minimumViableContactDurationSeconds(minimumViableContactDurationSeconds)
    }

    /** @param name The name of the mission profile. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param streamsKmsKey the value to be set. */
    public fun streamsKmsKey(streamsKmsKey: IResolvable) {
        cdkBuilder.streamsKmsKey(streamsKmsKey)
    }

    /** @param streamsKmsKey the value to be set. */
    public fun streamsKmsKey(streamsKmsKey: CfnMissionProfile.StreamsKmsKeyProperty) {
        cdkBuilder.streamsKmsKey(streamsKmsKey)
    }

    /**
     * @param streamsKmsRole The ARN of the KMS Key or Alias Key role used to define permissions on
     *   KMS Key usage.
     */
    public fun streamsKmsRole(streamsKmsRole: String) {
        cdkBuilder.streamsKmsRole(streamsKmsRole)
    }

    /** @param tags Tags assigned to the mission profile. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags Tags assigned to the mission profile. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * @param trackingConfigArn The ARN of a tracking config objects that defines how to track the
     *   satellite through the sky during a contact.
     */
    public fun trackingConfigArn(trackingConfigArn: String) {
        cdkBuilder.trackingConfigArn(trackingConfigArn)
    }

    public fun build(): CfnMissionProfileProps {
        if (_dataflowEdges.isNotEmpty()) cdkBuilder.dataflowEdges(_dataflowEdges)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
