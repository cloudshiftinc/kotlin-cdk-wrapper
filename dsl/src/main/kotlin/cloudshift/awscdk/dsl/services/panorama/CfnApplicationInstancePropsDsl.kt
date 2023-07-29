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

package cloudshift.awscdk.dsl.services.panorama

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.panorama.CfnApplicationInstance
import software.amazon.awscdk.services.panorama.CfnApplicationInstanceProps

/**
 * Properties for defining a `CfnApplicationInstance`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.panorama.*;
 * CfnApplicationInstanceProps cfnApplicationInstanceProps = CfnApplicationInstanceProps.builder()
 * .defaultRuntimeContextDevice("defaultRuntimeContextDevice")
 * .manifestPayload(ManifestPayloadProperty.builder()
 * .payloadData("payloadData")
 * .build())
 * // the properties below are optional
 * .applicationInstanceIdToReplace("applicationInstanceIdToReplace")
 * .description("description")
 * .manifestOverridesPayload(ManifestOverridesPayloadProperty.builder()
 * .payloadData("payloadData")
 * .build())
 * .name("name")
 * .runtimeRoleArn("runtimeRoleArn")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-panorama-applicationinstance.html)
 */
@CdkDslMarker
public class CfnApplicationInstancePropsDsl {
    private val cdkBuilder: CfnApplicationInstanceProps.Builder =
        CfnApplicationInstanceProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param applicationInstanceIdToReplace The ID of an application instance to replace with the
     *   new instance.
     */
    public fun applicationInstanceIdToReplace(applicationInstanceIdToReplace: String) {
        cdkBuilder.applicationInstanceIdToReplace(applicationInstanceIdToReplace)
    }

    /** @param defaultRuntimeContextDevice The device's ID. */
    public fun defaultRuntimeContextDevice(defaultRuntimeContextDevice: String) {
        cdkBuilder.defaultRuntimeContextDevice(defaultRuntimeContextDevice)
    }

    /** @param description A description for the application instance. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param manifestOverridesPayload Setting overrides for the application manifest. */
    public fun manifestOverridesPayload(manifestOverridesPayload: IResolvable) {
        cdkBuilder.manifestOverridesPayload(manifestOverridesPayload)
    }

    /** @param manifestOverridesPayload Setting overrides for the application manifest. */
    public fun manifestOverridesPayload(
        manifestOverridesPayload: CfnApplicationInstance.ManifestOverridesPayloadProperty
    ) {
        cdkBuilder.manifestOverridesPayload(manifestOverridesPayload)
    }

    /** @param manifestPayload The application's manifest document. */
    public fun manifestPayload(manifestPayload: IResolvable) {
        cdkBuilder.manifestPayload(manifestPayload)
    }

    /** @param manifestPayload The application's manifest document. */
    public fun manifestPayload(manifestPayload: CfnApplicationInstance.ManifestPayloadProperty) {
        cdkBuilder.manifestPayload(manifestPayload)
    }

    /** @param name A name for the application instance. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param runtimeRoleArn The ARN of a runtime role for the application instance. */
    public fun runtimeRoleArn(runtimeRoleArn: String) {
        cdkBuilder.runtimeRoleArn(runtimeRoleArn)
    }

    /** @param tags Tags for the application instance. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags Tags for the application instance. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnApplicationInstanceProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
