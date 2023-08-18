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

package io.cloudshiftdev.awscdkdsl.services.cloudtrail

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudtrail.CfnEventDataStore
import software.constructs.Construct

/**
 * Creates a new event data store.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudtrail.*;
 * CfnEventDataStore cfnEventDataStore = CfnEventDataStore.Builder.create(this,
 * "MyCfnEventDataStore")
 * .advancedEventSelectors(List.of(AdvancedEventSelectorProperty.builder()
 * .fieldSelectors(List.of(AdvancedFieldSelectorProperty.builder()
 * .field("field")
 * // the properties below are optional
 * .endsWith(List.of("endsWith"))
 * .equalTo(List.of("equalTo"))
 * .notEndsWith(List.of("notEndsWith"))
 * .notEquals(List.of("notEquals"))
 * .notStartsWith(List.of("notStartsWith"))
 * .startsWith(List.of("startsWith"))
 * .build()))
 * // the properties below are optional
 * .name("name")
 * .build()))
 * .ingestionEnabled(false)
 * .kmsKeyId("kmsKeyId")
 * .multiRegionEnabled(false)
 * .name("name")
 * .organizationEnabled(false)
 * .retentionPeriod(123)
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .terminationProtectionEnabled(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-eventdatastore.html)
 */
@CdkDslMarker
public class CfnEventDataStoreDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnEventDataStore.Builder = CfnEventDataStore.Builder.create(scope, id)

    private val _advancedEventSelectors: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * The advanced event selectors to use to select the events for the data store.
     *
     * You can configure up to five advanced event selectors for each event data store.
     *
     * For more information about how to use advanced event selectors to log CloudTrail events, see
     * [Log events by using advanced event selectors](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-data-events-with-cloudtrail.html#creating-data-event-selectors-advanced)
     * in the CloudTrail User Guide.
     *
     * For more information about how to use advanced event selectors to include AWS Config
     * configuration items in your event data store, see
     * [Create an event data store for AWS Config configuration items](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-lake-cli.html#lake-cli-create-eds-config)
     * in the CloudTrail User Guide.
     *
     * For more information about how to use advanced event selectors to include non- AWS events in
     * your event data store, see
     * [Create an integration to log events from outside AWS](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-lake-cli.html#lake-cli-create-integration)
     * in the CloudTrail User Guide.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-eventdatastore.html#cfn-cloudtrail-eventdatastore-advancedeventselectors)
     *
     * @param advancedEventSelectors The advanced event selectors to use to select the events for
     *   the data store.
     */
    public fun advancedEventSelectors(vararg advancedEventSelectors: Any) {
        _advancedEventSelectors.addAll(listOf(*advancedEventSelectors))
    }

    /**
     * The advanced event selectors to use to select the events for the data store.
     *
     * You can configure up to five advanced event selectors for each event data store.
     *
     * For more information about how to use advanced event selectors to log CloudTrail events, see
     * [Log events by using advanced event selectors](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-data-events-with-cloudtrail.html#creating-data-event-selectors-advanced)
     * in the CloudTrail User Guide.
     *
     * For more information about how to use advanced event selectors to include AWS Config
     * configuration items in your event data store, see
     * [Create an event data store for AWS Config configuration items](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-lake-cli.html#lake-cli-create-eds-config)
     * in the CloudTrail User Guide.
     *
     * For more information about how to use advanced event selectors to include non- AWS events in
     * your event data store, see
     * [Create an integration to log events from outside AWS](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-lake-cli.html#lake-cli-create-integration)
     * in the CloudTrail User Guide.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-eventdatastore.html#cfn-cloudtrail-eventdatastore-advancedeventselectors)
     *
     * @param advancedEventSelectors The advanced event selectors to use to select the events for
     *   the data store.
     */
    public fun advancedEventSelectors(advancedEventSelectors: Collection<Any>) {
        _advancedEventSelectors.addAll(advancedEventSelectors)
    }

    /**
     * The advanced event selectors to use to select the events for the data store.
     *
     * You can configure up to five advanced event selectors for each event data store.
     *
     * For more information about how to use advanced event selectors to log CloudTrail events, see
     * [Log events by using advanced event selectors](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-data-events-with-cloudtrail.html#creating-data-event-selectors-advanced)
     * in the CloudTrail User Guide.
     *
     * For more information about how to use advanced event selectors to include AWS Config
     * configuration items in your event data store, see
     * [Create an event data store for AWS Config configuration items](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-lake-cli.html#lake-cli-create-eds-config)
     * in the CloudTrail User Guide.
     *
     * For more information about how to use advanced event selectors to include non- AWS events in
     * your event data store, see
     * [Create an integration to log events from outside AWS](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-lake-cli.html#lake-cli-create-integration)
     * in the CloudTrail User Guide.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-eventdatastore.html#cfn-cloudtrail-eventdatastore-advancedeventselectors)
     *
     * @param advancedEventSelectors The advanced event selectors to use to select the events for
     *   the data store.
     */
    public fun advancedEventSelectors(advancedEventSelectors: IResolvable) {
        cdkBuilder.advancedEventSelectors(advancedEventSelectors)
    }

    /**
     * Specifies whether the event data store should start ingesting live events.
     *
     * The default is true.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-eventdatastore.html#cfn-cloudtrail-eventdatastore-ingestionenabled)
     *
     * @param ingestionEnabled Specifies whether the event data store should start ingesting live
     *   events.
     */
    public fun ingestionEnabled(ingestionEnabled: Boolean) {
        cdkBuilder.ingestionEnabled(ingestionEnabled)
    }

    /**
     * Specifies whether the event data store should start ingesting live events.
     *
     * The default is true.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-eventdatastore.html#cfn-cloudtrail-eventdatastore-ingestionenabled)
     *
     * @param ingestionEnabled Specifies whether the event data store should start ingesting live
     *   events.
     */
    public fun ingestionEnabled(ingestionEnabled: IResolvable) {
        cdkBuilder.ingestionEnabled(ingestionEnabled)
    }

    /**
     * Specifies the AWS KMS key ID to use to encrypt the events delivered by CloudTrail.
     *
     * The value can be an alias name prefixed by `alias/` , a fully specified ARN to an alias, a
     * fully specified ARN to a key, or a globally unique identifier.
     *
     * Disabling or deleting the KMS key, or removing CloudTrail permissions on the key, prevents
     * CloudTrail from logging events to the event data store, and prevents users from querying the
     * data in the event data store that was encrypted with the key. After you associate an event
     * data store with a KMS key, the KMS key cannot be removed or changed. Before you disable or
     * delete a KMS key that you are using with an event data store, delete or back up your event
     * data store.
     *
     * CloudTrail also supports AWS KMS multi-Region keys. For more information about multi-Region
     * keys, see
     * [Using multi-Region keys](https://docs.aws.amazon.com/kms/latest/developerguide/multi-region-keys-overview.html)
     * in the *AWS Key Management Service Developer Guide* .
     *
     * Examples:
     * * `alias/MyAliasName`
     * * `arn:aws:kms:us-east-2:123456789012:alias/MyAliasName`
     * * `arn:aws:kms:us-east-2:123456789012:key/12345678-1234-1234-1234-123456789012`
     * * `12345678-1234-1234-1234-123456789012`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-eventdatastore.html#cfn-cloudtrail-eventdatastore-kmskeyid)
     *
     * @param kmsKeyId Specifies the AWS KMS key ID to use to encrypt the events delivered by
     *   CloudTrail.
     */
    public fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
    }

    /**
     * Specifies whether the event data store includes events from all Regions, or only from the
     * Region in which the event data store is created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-eventdatastore.html#cfn-cloudtrail-eventdatastore-multiregionenabled)
     *
     * @param multiRegionEnabled Specifies whether the event data store includes events from all
     *   Regions, or only from the Region in which the event data store is created.
     */
    public fun multiRegionEnabled(multiRegionEnabled: Boolean) {
        cdkBuilder.multiRegionEnabled(multiRegionEnabled)
    }

    /**
     * Specifies whether the event data store includes events from all Regions, or only from the
     * Region in which the event data store is created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-eventdatastore.html#cfn-cloudtrail-eventdatastore-multiregionenabled)
     *
     * @param multiRegionEnabled Specifies whether the event data store includes events from all
     *   Regions, or only from the Region in which the event data store is created.
     */
    public fun multiRegionEnabled(multiRegionEnabled: IResolvable) {
        cdkBuilder.multiRegionEnabled(multiRegionEnabled)
    }

    /**
     * The name of the event data store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-eventdatastore.html#cfn-cloudtrail-eventdatastore-name)
     *
     * @param name The name of the event data store.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * Specifies whether an event data store collects events logged for an organization in AWS
     * Organizations .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-eventdatastore.html#cfn-cloudtrail-eventdatastore-organizationenabled)
     *
     * @param organizationEnabled Specifies whether an event data store collects events logged for
     *   an organization in AWS Organizations .
     */
    public fun organizationEnabled(organizationEnabled: Boolean) {
        cdkBuilder.organizationEnabled(organizationEnabled)
    }

    /**
     * Specifies whether an event data store collects events logged for an organization in AWS
     * Organizations .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-eventdatastore.html#cfn-cloudtrail-eventdatastore-organizationenabled)
     *
     * @param organizationEnabled Specifies whether an event data store collects events logged for
     *   an organization in AWS Organizations .
     */
    public fun organizationEnabled(organizationEnabled: IResolvable) {
        cdkBuilder.organizationEnabled(organizationEnabled)
    }

    /**
     * The retention period of the event data store, in days.
     *
     * You can set a retention period of up to 2557 days, the equivalent of seven years.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-eventdatastore.html#cfn-cloudtrail-eventdatastore-retentionperiod)
     *
     * @param retentionPeriod The retention period of the event data store, in days.
     */
    public fun retentionPeriod(retentionPeriod: Number) {
        cdkBuilder.retentionPeriod(retentionPeriod)
    }

    /**
     * A list of tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-eventdatastore.html#cfn-cloudtrail-eventdatastore-tags)
     *
     * @param tags A list of tags.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * A list of tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-eventdatastore.html#cfn-cloudtrail-eventdatastore-tags)
     *
     * @param tags A list of tags.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * Specifies whether termination protection is enabled for the event data store.
     *
     * If termination protection is enabled, you cannot delete the event data store until
     * termination protection is disabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-eventdatastore.html#cfn-cloudtrail-eventdatastore-terminationprotectionenabled)
     *
     * @param terminationProtectionEnabled Specifies whether termination protection is enabled for
     *   the event data store.
     */
    public fun terminationProtectionEnabled(terminationProtectionEnabled: Boolean) {
        cdkBuilder.terminationProtectionEnabled(terminationProtectionEnabled)
    }

    /**
     * Specifies whether termination protection is enabled for the event data store.
     *
     * If termination protection is enabled, you cannot delete the event data store until
     * termination protection is disabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-eventdatastore.html#cfn-cloudtrail-eventdatastore-terminationprotectionenabled)
     *
     * @param terminationProtectionEnabled Specifies whether termination protection is enabled for
     *   the event data store.
     */
    public fun terminationProtectionEnabled(terminationProtectionEnabled: IResolvable) {
        cdkBuilder.terminationProtectionEnabled(terminationProtectionEnabled)
    }

    public fun build(): CfnEventDataStore {
        if (_advancedEventSelectors.isNotEmpty())
            cdkBuilder.advancedEventSelectors(_advancedEventSelectors)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
