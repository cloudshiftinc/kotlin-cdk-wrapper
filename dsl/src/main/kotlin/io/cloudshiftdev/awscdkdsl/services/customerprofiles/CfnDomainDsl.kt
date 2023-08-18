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

package io.cloudshiftdev.awscdkdsl.services.customerprofiles

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.customerprofiles.CfnDomain
import software.constructs.Construct

/**
 * Specifies an Amazon Connect Customer Profiles Domain.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.customerprofiles.*;
 * CfnDomain cfnDomain = CfnDomain.Builder.create(this, "MyCfnDomain")
 * .domainName("domainName")
 * // the properties below are optional
 * .deadLetterQueueUrl("deadLetterQueueUrl")
 * .defaultEncryptionKey("defaultEncryptionKey")
 * .defaultExpirationDays(123)
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-domain.html)
 */
@CdkDslMarker
public class CfnDomainDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnDomain.Builder = CfnDomain.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * The URL of the SQS dead letter queue, which is used for reporting errors associated with
     * ingesting data from third party applications.
     *
     * You must set up a policy on the DeadLetterQueue for the SendMessage operation to enable
     * Amazon Connect Customer Profiles to send messages to the DeadLetterQueue.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-domain.html#cfn-customerprofiles-domain-deadletterqueueurl)
     *
     * @param deadLetterQueueUrl The URL of the SQS dead letter queue, which is used for reporting
     *   errors associated with ingesting data from third party applications.
     */
    public fun deadLetterQueueUrl(deadLetterQueueUrl: String) {
        cdkBuilder.deadLetterQueueUrl(deadLetterQueueUrl)
    }

    /**
     * The default encryption key, which is an AWS managed key, is used when no specific type of
     * encryption key is specified.
     *
     * It is used to encrypt all data before it is placed in permanent or semi-permanent storage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-domain.html#cfn-customerprofiles-domain-defaultencryptionkey)
     *
     * @param defaultEncryptionKey The default encryption key, which is an AWS managed key, is used
     *   when no specific type of encryption key is specified.
     */
    public fun defaultEncryptionKey(defaultEncryptionKey: String) {
        cdkBuilder.defaultEncryptionKey(defaultEncryptionKey)
    }

    /**
     * The default number of days until the data within the domain expires.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-domain.html#cfn-customerprofiles-domain-defaultexpirationdays)
     *
     * @param defaultExpirationDays The default number of days until the data within the domain
     *   expires.
     */
    public fun defaultExpirationDays(defaultExpirationDays: Number) {
        cdkBuilder.defaultExpirationDays(defaultExpirationDays)
    }

    /**
     * The unique name of the domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-domain.html#cfn-customerprofiles-domain-domainname)
     *
     * @param domainName The unique name of the domain.
     */
    public fun domainName(domainName: String) {
        cdkBuilder.domainName(domainName)
    }

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-domain.html#cfn-customerprofiles-domain-tags)
     *
     * @param tags The tags used to organize, track, or control access for this resource.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-domain.html#cfn-customerprofiles-domain-tags)
     *
     * @param tags The tags used to organize, track, or control access for this resource.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnDomain {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
