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

package io.cloudshiftdev.awscdkdsl.services.workspacesweb

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.workspacesweb.CfnBrowserSettingsProps

/**
 * Properties for defining a `CfnBrowserSettings`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.workspacesweb.*;
 * CfnBrowserSettingsProps cfnBrowserSettingsProps = CfnBrowserSettingsProps.builder()
 * .additionalEncryptionContext(Map.of(
 * "additionalEncryptionContextKey", "additionalEncryptionContext"))
 * .browserPolicy("browserPolicy")
 * .customerManagedKey("customerManagedKey")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-browsersettings.html)
 */
@CdkDslMarker
public class CfnBrowserSettingsPropsDsl {
    private val cdkBuilder: CfnBrowserSettingsProps.Builder = CfnBrowserSettingsProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param additionalEncryptionContext Additional encryption context of the browser settings. */
    public fun additionalEncryptionContext(additionalEncryptionContext: Map<String, String>) {
        cdkBuilder.additionalEncryptionContext(additionalEncryptionContext)
    }

    /** @param additionalEncryptionContext Additional encryption context of the browser settings. */
    public fun additionalEncryptionContext(additionalEncryptionContext: IResolvable) {
        cdkBuilder.additionalEncryptionContext(additionalEncryptionContext)
    }

    /**
     * @param browserPolicy A JSON string containing Chrome Enterprise policies that will be applied
     *   to all streaming sessions.
     */
    public fun browserPolicy(browserPolicy: String) {
        cdkBuilder.browserPolicy(browserPolicy)
    }

    /**
     * @param customerManagedKey The custom managed key of the browser settings. *Pattern* :
     *   `^arn:[\w+=\/,.&#64;-]+:kms:[a-zA-Z0-9\-]*:[a-zA-Z0-9]{1,12}:key\/[a-zA-Z0-9-]+$`
     */
    public fun customerManagedKey(customerManagedKey: String) {
        cdkBuilder.customerManagedKey(customerManagedKey)
    }

    /** @param tags The tags to add to the browser settings resource. A tag is a key-value pair. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags The tags to add to the browser settings resource. A tag is a key-value pair. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnBrowserSettingsProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
