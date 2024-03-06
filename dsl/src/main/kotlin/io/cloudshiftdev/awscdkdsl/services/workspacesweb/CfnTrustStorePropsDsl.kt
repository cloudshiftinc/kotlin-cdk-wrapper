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
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.workspacesweb.CfnTrustStoreProps

/**
 * Properties for defining a `CfnTrustStore`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.workspacesweb.*;
 * CfnTrustStoreProps cfnTrustStoreProps = CfnTrustStoreProps.builder()
 * .certificateList(List.of("certificateList"))
 * // the properties below are optional
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-truststore.html)
 */
@CdkDslMarker
public class CfnTrustStorePropsDsl {
    private val cdkBuilder: CfnTrustStoreProps.Builder = CfnTrustStoreProps.builder()

    private val _certificateList: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param certificateList A list of CA certificates to be added to the trust store. */
    public fun certificateList(vararg certificateList: String) {
        _certificateList.addAll(listOf(*certificateList))
    }

    /** @param certificateList A list of CA certificates to be added to the trust store. */
    public fun certificateList(certificateList: Collection<String>) {
        _certificateList.addAll(certificateList)
    }

    /** @param tags The tags to add to the trust store. A tag is a key-value pair. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags The tags to add to the trust store. A tag is a key-value pair. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnTrustStoreProps {
        if (_certificateList.isNotEmpty()) cdkBuilder.certificateList(_certificateList)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
