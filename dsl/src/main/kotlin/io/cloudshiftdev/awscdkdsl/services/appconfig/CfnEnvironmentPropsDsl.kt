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

package io.cloudshiftdev.awscdkdsl.services.appconfig

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appconfig.CfnEnvironment
import software.amazon.awscdk.services.appconfig.CfnEnvironmentProps

/**
 * Properties for defining a `CfnEnvironment`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appconfig.*;
 * CfnEnvironmentProps cfnEnvironmentProps = CfnEnvironmentProps.builder()
 * .applicationId("applicationId")
 * .name("name")
 * // the properties below are optional
 * .description("description")
 * .monitors(List.of(MonitorsProperty.builder()
 * .alarmArn("alarmArn")
 * .alarmRoleArn("alarmRoleArn")
 * .build()))
 * .tags(List.of(TagsProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-environment.html)
 */
@CdkDslMarker
public class CfnEnvironmentPropsDsl {
    private val cdkBuilder: CfnEnvironmentProps.Builder = CfnEnvironmentProps.builder()

    private val _monitors: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnEnvironment.TagsProperty> = mutableListOf()

    /** @param applicationId The application ID. */
    public fun applicationId(applicationId: String) {
        cdkBuilder.applicationId(applicationId)
    }

    /** @param description A description of the environment. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param monitors Amazon CloudWatch alarms to monitor during the deployment process. */
    public fun monitors(vararg monitors: Any) {
        _monitors.addAll(listOf(*monitors))
    }

    /** @param monitors Amazon CloudWatch alarms to monitor during the deployment process. */
    public fun monitors(monitors: Collection<Any>) {
        _monitors.addAll(monitors)
    }

    /** @param monitors Amazon CloudWatch alarms to monitor during the deployment process. */
    public fun monitors(monitors: IResolvable) {
        cdkBuilder.monitors(monitors)
    }

    /** @param name A name for the environment. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param tags Metadata to assign to the environment. Tags help organize and categorize your AWS
     *   AppConfig resources. Each tag consists of a key and an optional value, both of which you
     *   define.
     */
    public fun tags(tags: CfnEnvironmentTagsPropertyDsl.() -> Unit) {
        _tags.add(CfnEnvironmentTagsPropertyDsl().apply(tags).build())
    }

    /**
     * @param tags Metadata to assign to the environment. Tags help organize and categorize your AWS
     *   AppConfig resources. Each tag consists of a key and an optional value, both of which you
     *   define.
     */
    public fun tags(tags: Collection<CfnEnvironment.TagsProperty>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnEnvironmentProps {
        if (_monitors.isNotEmpty()) cdkBuilder.monitors(_monitors)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
