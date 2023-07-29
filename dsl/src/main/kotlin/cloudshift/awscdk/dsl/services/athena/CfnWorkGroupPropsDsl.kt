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

package cloudshift.awscdk.dsl.services.athena

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.athena.CfnWorkGroup
import software.amazon.awscdk.services.athena.CfnWorkGroupProps

/**
 * Properties for defining a `CfnWorkGroup`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.athena.*;
 * CfnWorkGroupProps cfnWorkGroupProps = CfnWorkGroupProps.builder()
 * .name("name")
 * // the properties below are optional
 * .description("description")
 * .recursiveDeleteOption(false)
 * .state("state")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .workGroupConfiguration(WorkGroupConfigurationProperty.builder()
 * .additionalConfiguration("additionalConfiguration")
 * .bytesScannedCutoffPerQuery(123)
 * .customerContentEncryptionConfiguration(CustomerContentEncryptionConfigurationProperty.builder()
 * .kmsKey("kmsKey")
 * .build())
 * .enforceWorkGroupConfiguration(false)
 * .engineVersion(EngineVersionProperty.builder()
 * .effectiveEngineVersion("effectiveEngineVersion")
 * .selectedEngineVersion("selectedEngineVersion")
 * .build())
 * .executionRole("executionRole")
 * .publishCloudWatchMetricsEnabled(false)
 * .requesterPaysEnabled(false)
 * .resultConfiguration(ResultConfigurationProperty.builder()
 * .aclConfiguration(AclConfigurationProperty.builder()
 * .s3AclOption("s3AclOption")
 * .build())
 * .encryptionConfiguration(EncryptionConfigurationProperty.builder()
 * .encryptionOption("encryptionOption")
 * // the properties below are optional
 * .kmsKey("kmsKey")
 * .build())
 * .expectedBucketOwner("expectedBucketOwner")
 * .outputLocation("outputLocation")
 * .build())
 * .build())
 * .workGroupConfigurationUpdates(WorkGroupConfigurationUpdatesProperty.builder()
 * .additionalConfiguration("additionalConfiguration")
 * .bytesScannedCutoffPerQuery(123)
 * .customerContentEncryptionConfiguration(CustomerContentEncryptionConfigurationProperty.builder()
 * .kmsKey("kmsKey")
 * .build())
 * .enforceWorkGroupConfiguration(false)
 * .engineVersion(EngineVersionProperty.builder()
 * .effectiveEngineVersion("effectiveEngineVersion")
 * .selectedEngineVersion("selectedEngineVersion")
 * .build())
 * .executionRole("executionRole")
 * .publishCloudWatchMetricsEnabled(false)
 * .removeBytesScannedCutoffPerQuery(false)
 * .removeCustomerContentEncryptionConfiguration(false)
 * .requesterPaysEnabled(false)
 * .resultConfigurationUpdates(ResultConfigurationUpdatesProperty.builder()
 * .aclConfiguration(AclConfigurationProperty.builder()
 * .s3AclOption("s3AclOption")
 * .build())
 * .encryptionConfiguration(EncryptionConfigurationProperty.builder()
 * .encryptionOption("encryptionOption")
 * // the properties below are optional
 * .kmsKey("kmsKey")
 * .build())
 * .expectedBucketOwner("expectedBucketOwner")
 * .outputLocation("outputLocation")
 * .removeAclConfiguration(false)
 * .removeEncryptionConfiguration(false)
 * .removeExpectedBucketOwner(false)
 * .removeOutputLocation(false)
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-workgroup.html)
 */
@CdkDslMarker
public class CfnWorkGroupPropsDsl {
    private val cdkBuilder: CfnWorkGroupProps.Builder = CfnWorkGroupProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param description The workgroup description. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param name The workgroup name. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param recursiveDeleteOption The option to delete a workgroup and its contents even if the
     *   workgroup contains any named queries. The default is false.
     */
    public fun recursiveDeleteOption(recursiveDeleteOption: Boolean) {
        cdkBuilder.recursiveDeleteOption(recursiveDeleteOption)
    }

    /**
     * @param recursiveDeleteOption The option to delete a workgroup and its contents even if the
     *   workgroup contains any named queries. The default is false.
     */
    public fun recursiveDeleteOption(recursiveDeleteOption: IResolvable) {
        cdkBuilder.recursiveDeleteOption(recursiveDeleteOption)
    }

    /** @param state The state of the workgroup: ENABLED or DISABLED. */
    public fun state(state: String) {
        cdkBuilder.state(state)
    }

    /** @param tags The tags (key-value pairs) to associate with this resource. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags The tags (key-value pairs) to associate with this resource. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * @param workGroupConfiguration The configuration of the workgroup, which includes the location
     *   in Amazon S3 where query results are stored, the encryption option, if any, used for query
     *   results, whether Amazon CloudWatch Metrics are enabled for the workgroup, and the limit for
     *   the amount of bytes scanned (cutoff) per query, if it is specified. The
     *   `EnforceWorkGroupConfiguration` option determines whether workgroup settings override
     *   client-side query settings.
     */
    public fun workGroupConfiguration(workGroupConfiguration: IResolvable) {
        cdkBuilder.workGroupConfiguration(workGroupConfiguration)
    }

    /**
     * @param workGroupConfiguration The configuration of the workgroup, which includes the location
     *   in Amazon S3 where query results are stored, the encryption option, if any, used for query
     *   results, whether Amazon CloudWatch Metrics are enabled for the workgroup, and the limit for
     *   the amount of bytes scanned (cutoff) per query, if it is specified. The
     *   `EnforceWorkGroupConfiguration` option determines whether workgroup settings override
     *   client-side query settings.
     */
    public fun workGroupConfiguration(
        workGroupConfiguration: CfnWorkGroup.WorkGroupConfigurationProperty
    ) {
        cdkBuilder.workGroupConfiguration(workGroupConfiguration)
    }

    /**
     * @param workGroupConfigurationUpdates The configuration information that will be updated for
     *   this workgroup, which includes the location in Amazon S3 where query results are stored,
     *   the encryption option, if any, used for query results, whether the Amazon CloudWatch
     *   Metrics are enabled for the workgroup, whether the workgroup settings override the
     *   client-side settings, and the data usage limit for the amount of bytes scanned per query,
     *   if it is specified.
     * @deprecated this property has been deprecated
     */
    @Deprecated(message = "deprecated in CDK")
    public fun workGroupConfigurationUpdates(workGroupConfigurationUpdates: IResolvable) {
        cdkBuilder.workGroupConfigurationUpdates(workGroupConfigurationUpdates)
    }

    /**
     * @param workGroupConfigurationUpdates The configuration information that will be updated for
     *   this workgroup, which includes the location in Amazon S3 where query results are stored,
     *   the encryption option, if any, used for query results, whether the Amazon CloudWatch
     *   Metrics are enabled for the workgroup, whether the workgroup settings override the
     *   client-side settings, and the data usage limit for the amount of bytes scanned per query,
     *   if it is specified.
     * @deprecated this property has been deprecated
     */
    @Deprecated(message = "deprecated in CDK")
    public fun workGroupConfigurationUpdates(
        workGroupConfigurationUpdates: CfnWorkGroup.WorkGroupConfigurationUpdatesProperty
    ) {
        cdkBuilder.workGroupConfigurationUpdates(workGroupConfigurationUpdates)
    }

    public fun build(): CfnWorkGroupProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
