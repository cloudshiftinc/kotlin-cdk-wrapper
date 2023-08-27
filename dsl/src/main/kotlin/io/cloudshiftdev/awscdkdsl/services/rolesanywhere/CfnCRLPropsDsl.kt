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
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.rolesanywhere.CfnCRLProps

/**
 * Properties for defining a `CfnCRL`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.rolesanywhere.*;
 * CfnCRLProps cfnCRLProps = CfnCRLProps.builder()
 * .crlData("crlData")
 * .name("name")
 * // the properties below are optional
 * .enabled(false)
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .trustAnchorArn("trustAnchorArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-crl.html)
 */
@CdkDslMarker
public class CfnCRLPropsDsl {
    private val cdkBuilder: CfnCRLProps.Builder = CfnCRLProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param crlData The x509 v3 specified certificate revocation list (CRL). */
    public fun crlData(crlData: String) {
        cdkBuilder.crlData(crlData)
    }

    /** @param enabled Specifies whether the certificate revocation list (CRL) is enabled. */
    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    /** @param enabled Specifies whether the certificate revocation list (CRL) is enabled. */
    public fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled)
    }

    /** @param name The name of the certificate revocation list (CRL). */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param tags A list of tags to attach to the certificate revocation list (CRL). */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags A list of tags to attach to the certificate revocation list (CRL). */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * @param trustAnchorArn The ARN of the TrustAnchor the certificate revocation list (CRL) will
     *   provide revocation for.
     */
    public fun trustAnchorArn(trustAnchorArn: String) {
        cdkBuilder.trustAnchorArn(trustAnchorArn)
    }

    public fun build(): CfnCRLProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
