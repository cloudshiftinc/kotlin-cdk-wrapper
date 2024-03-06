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

package io.cloudshiftdev.awscdkdsl.services.wisdom

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.wisdom.CfnAssistant
import software.amazon.awscdk.services.wisdom.CfnAssistantProps

/**
 * Properties for defining a `CfnAssistant`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.wisdom.*;
 * CfnAssistantProps cfnAssistantProps = CfnAssistantProps.builder()
 * .name("name")
 * .type("type")
 * // the properties below are optional
 * .description("description")
 * .serverSideEncryptionConfiguration(ServerSideEncryptionConfigurationProperty.builder()
 * .kmsKeyId("kmsKeyId")
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-assistant.html)
 */
@CdkDslMarker
public class CfnAssistantPropsDsl {
    private val cdkBuilder: CfnAssistantProps.Builder = CfnAssistantProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param description The description of the assistant. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param name The name of the assistant. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param serverSideEncryptionConfiguration The configuration information for the customer
     *   managed key used for encryption. The customer managed key must have a policy that allows
     *   `kms:CreateGrant` and `kms:DescribeKey` permissions to the IAM identity using the key to
     *   invoke Wisdom. To use Wisdom with chat, the key policy must also allow `kms:Decrypt` ,
     *   `kms:GenerateDataKey*` , and `kms:DescribeKey` permissions to the `connect.amazonaws.com`
     *   service principal. For more information about setting up a customer managed key for Wisdom,
     *   see
     *   [Enable Amazon Connect Wisdom for your instance](https://docs.aws.amazon.com/connect/latest/adminguide/enable-wisdom.html)
     *   .
     */
    public fun serverSideEncryptionConfiguration(serverSideEncryptionConfiguration: IResolvable) {
        cdkBuilder.serverSideEncryptionConfiguration(serverSideEncryptionConfiguration)
    }

    /**
     * @param serverSideEncryptionConfiguration The configuration information for the customer
     *   managed key used for encryption. The customer managed key must have a policy that allows
     *   `kms:CreateGrant` and `kms:DescribeKey` permissions to the IAM identity using the key to
     *   invoke Wisdom. To use Wisdom with chat, the key policy must also allow `kms:Decrypt` ,
     *   `kms:GenerateDataKey*` , and `kms:DescribeKey` permissions to the `connect.amazonaws.com`
     *   service principal. For more information about setting up a customer managed key for Wisdom,
     *   see
     *   [Enable Amazon Connect Wisdom for your instance](https://docs.aws.amazon.com/connect/latest/adminguide/enable-wisdom.html)
     *   .
     */
    public fun serverSideEncryptionConfiguration(
        serverSideEncryptionConfiguration: CfnAssistant.ServerSideEncryptionConfigurationProperty
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

    /** @param type The type of assistant. */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnAssistantProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
