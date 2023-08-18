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

package io.cloudshiftdev.awscdkdsl.services.voiceid

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.voiceid.CfnDomain
import software.amazon.awscdk.services.voiceid.CfnDomainProps

/**
 * Properties for defining a `CfnDomain`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.voiceid.*;
 * CfnDomainProps cfnDomainProps = CfnDomainProps.builder()
 * .name("name")
 * .serverSideEncryptionConfiguration(ServerSideEncryptionConfigurationProperty.builder()
 * .kmsKeyId("kmsKeyId")
 * .build())
 * // the properties below are optional
 * .description("description")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-voiceid-domain.html)
 */
@CdkDslMarker
public class CfnDomainPropsDsl {
    private val cdkBuilder: CfnDomainProps.Builder = CfnDomainProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param description The description of the domain. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param name The name for the domain. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param serverSideEncryptionConfiguration The server-side encryption configuration containing
     *   the KMS key identifier you want Voice ID to use to encrypt your data.
     */
    public fun serverSideEncryptionConfiguration(serverSideEncryptionConfiguration: IResolvable) {
        cdkBuilder.serverSideEncryptionConfiguration(serverSideEncryptionConfiguration)
    }

    /**
     * @param serverSideEncryptionConfiguration The server-side encryption configuration containing
     *   the KMS key identifier you want Voice ID to use to encrypt your data.
     */
    public fun serverSideEncryptionConfiguration(
        serverSideEncryptionConfiguration: CfnDomain.ServerSideEncryptionConfigurationProperty
    ) {
        cdkBuilder.serverSideEncryptionConfiguration(serverSideEncryptionConfiguration)
    }

    /** @param tags The tags used to organize, track, or control access for this resource. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags The tags used to organize, track, or control access for this resource. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnDomainProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
