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

package cloudshift.awscdk.dsl.services.customerprofiles

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.customerprofiles.CfnDomainProps

/**
 * Properties for defining a `CfnDomain`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.customerprofiles.*;
 * CfnDomainProps cfnDomainProps = CfnDomainProps.builder()
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
public class CfnDomainPropsDsl {
    private val cdkBuilder: CfnDomainProps.Builder = CfnDomainProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param deadLetterQueueUrl The URL of the SQS dead letter queue, which is used for reporting
     *   errors associated with ingesting data from third party applications. You must set up a
     *   policy on the DeadLetterQueue for the SendMessage operation to enable Amazon Connect
     *   Customer Profiles to send messages to the DeadLetterQueue.
     */
    public fun deadLetterQueueUrl(deadLetterQueueUrl: String) {
        cdkBuilder.deadLetterQueueUrl(deadLetterQueueUrl)
    }

    /**
     * @param defaultEncryptionKey The default encryption key, which is an AWS managed key, is used
     *   when no specific type of encryption key is specified. It is used to encrypt all data before
     *   it is placed in permanent or semi-permanent storage.
     */
    public fun defaultEncryptionKey(defaultEncryptionKey: String) {
        cdkBuilder.defaultEncryptionKey(defaultEncryptionKey)
    }

    /**
     * @param defaultExpirationDays The default number of days until the data within the domain
     *   expires.
     */
    public fun defaultExpirationDays(defaultExpirationDays: Number) {
        cdkBuilder.defaultExpirationDays(defaultExpirationDays)
    }

    /** @param domainName The unique name of the domain. */
    public fun domainName(domainName: String) {
        cdkBuilder.domainName(domainName)
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
