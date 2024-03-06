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
import software.amazon.awscdk.services.workspacesweb.CfnTrustStore
import software.constructs.Construct

/**
 * This resource specifies a trust store that can be associated with a web portal.
 *
 * A trust store contains certificate authority (CA) certificates. Once associated with a web
 * portal, the browser in a streaming session will recognize certificates that have been issued
 * using any of the CAs in the trust store. If your organization has internal websites that use
 * certificates issued by private CAs, you should add the private CA certificate to the trust store.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.workspacesweb.*;
 * CfnTrustStore cfnTrustStore = CfnTrustStore.Builder.create(this, "MyCfnTrustStore")
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
public class CfnTrustStoreDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnTrustStore.Builder = CfnTrustStore.Builder.create(scope, id)

    private val _certificateList: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * A list of CA certificates to be added to the trust store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-truststore.html#cfn-workspacesweb-truststore-certificatelist)
     *
     * @param certificateList A list of CA certificates to be added to the trust store.
     */
    public fun certificateList(vararg certificateList: String) {
        _certificateList.addAll(listOf(*certificateList))
    }

    /**
     * A list of CA certificates to be added to the trust store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-truststore.html#cfn-workspacesweb-truststore-certificatelist)
     *
     * @param certificateList A list of CA certificates to be added to the trust store.
     */
    public fun certificateList(certificateList: Collection<String>) {
        _certificateList.addAll(certificateList)
    }

    /**
     * The tags to add to the trust store.
     *
     * A tag is a key-value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-truststore.html#cfn-workspacesweb-truststore-tags)
     *
     * @param tags The tags to add to the trust store.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * The tags to add to the trust store.
     *
     * A tag is a key-value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-truststore.html#cfn-workspacesweb-truststore-tags)
     *
     * @param tags The tags to add to the trust store.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnTrustStore {
        if (_certificateList.isNotEmpty()) cdkBuilder.certificateList(_certificateList)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
