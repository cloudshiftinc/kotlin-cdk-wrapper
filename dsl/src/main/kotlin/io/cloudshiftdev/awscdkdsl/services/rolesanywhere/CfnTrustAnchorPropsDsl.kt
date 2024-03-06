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

package io.cloudshiftdev.awscdkdsl.services.rolesanywhere

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.rolesanywhere.CfnTrustAnchor
import software.amazon.awscdk.services.rolesanywhere.CfnTrustAnchorProps

/**
 * Properties for defining a `CfnTrustAnchor`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.rolesanywhere.*;
 * CfnTrustAnchorProps cfnTrustAnchorProps = CfnTrustAnchorProps.builder()
 * .name("name")
 * .source(SourceProperty.builder()
 * .sourceData(SourceDataProperty.builder()
 * .acmPcaArn("acmPcaArn")
 * .x509CertificateData("x509CertificateData")
 * .build())
 * .sourceType("sourceType")
 * .build())
 * // the properties below are optional
 * .enabled(false)
 * .notificationSettings(List.of(NotificationSettingProperty.builder()
 * .enabled(false)
 * .event("event")
 * // the properties below are optional
 * .channel("channel")
 * .threshold(123)
 * .build()))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-trustanchor.html)
 */
@CdkDslMarker
public class CfnTrustAnchorPropsDsl {
    private val cdkBuilder: CfnTrustAnchorProps.Builder = CfnTrustAnchorProps.builder()

    private val _notificationSettings: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param enabled Indicates whether the trust anchor is enabled. */
    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    /** @param enabled Indicates whether the trust anchor is enabled. */
    public fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled)
    }

    /** @param name The name of the trust anchor. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param notificationSettings A list of notification settings to be associated to the trust
     *   anchor.
     */
    public fun notificationSettings(vararg notificationSettings: Any) {
        _notificationSettings.addAll(listOf(*notificationSettings))
    }

    /**
     * @param notificationSettings A list of notification settings to be associated to the trust
     *   anchor.
     */
    public fun notificationSettings(notificationSettings: Collection<Any>) {
        _notificationSettings.addAll(notificationSettings)
    }

    /**
     * @param notificationSettings A list of notification settings to be associated to the trust
     *   anchor.
     */
    public fun notificationSettings(notificationSettings: IResolvable) {
        cdkBuilder.notificationSettings(notificationSettings)
    }

    /** @param source The trust anchor type and its related certificate data. */
    public fun source(source: IResolvable) {
        cdkBuilder.source(source)
    }

    /** @param source The trust anchor type and its related certificate data. */
    public fun source(source: CfnTrustAnchor.SourceProperty) {
        cdkBuilder.source(source)
    }

    /** @param tags The tags to attach to the trust anchor. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags The tags to attach to the trust anchor. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnTrustAnchorProps {
        if (_notificationSettings.isNotEmpty())
            cdkBuilder.notificationSettings(_notificationSettings)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
