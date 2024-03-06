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

package io.cloudshiftdev.awscdkdsl.services.s3

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3.CfnStorageLens
import software.amazon.awscdk.services.s3.CfnStorageLensProps

/**
 * Properties for defining a `CfnStorageLens`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.s3.*;
 * Object sses3;
 * CfnStorageLensProps cfnStorageLensProps = CfnStorageLensProps.builder()
 * .storageLensConfiguration(StorageLensConfigurationProperty.builder()
 * .accountLevel(AccountLevelProperty.builder()
 * .bucketLevel(BucketLevelProperty.builder()
 * .activityMetrics(ActivityMetricsProperty.builder()
 * .isEnabled(false)
 * .build())
 * .advancedCostOptimizationMetrics(AdvancedCostOptimizationMetricsProperty.builder()
 * .isEnabled(false)
 * .build())
 * .advancedDataProtectionMetrics(AdvancedDataProtectionMetricsProperty.builder()
 * .isEnabled(false)
 * .build())
 * .detailedStatusCodesMetrics(DetailedStatusCodesMetricsProperty.builder()
 * .isEnabled(false)
 * .build())
 * .prefixLevel(PrefixLevelProperty.builder()
 * .storageMetrics(PrefixLevelStorageMetricsProperty.builder()
 * .isEnabled(false)
 * .selectionCriteria(SelectionCriteriaProperty.builder()
 * .delimiter("delimiter")
 * .maxDepth(123)
 * .minStorageBytesPercentage(123)
 * .build())
 * .build())
 * .build())
 * .build())
 * // the properties below are optional
 * .activityMetrics(ActivityMetricsProperty.builder()
 * .isEnabled(false)
 * .build())
 * .advancedCostOptimizationMetrics(AdvancedCostOptimizationMetricsProperty.builder()
 * .isEnabled(false)
 * .build())
 * .advancedDataProtectionMetrics(AdvancedDataProtectionMetricsProperty.builder()
 * .isEnabled(false)
 * .build())
 * .detailedStatusCodesMetrics(DetailedStatusCodesMetricsProperty.builder()
 * .isEnabled(false)
 * .build())
 * .storageLensGroupLevel(StorageLensGroupLevelProperty.builder()
 * .storageLensGroupSelectionCriteria(StorageLensGroupSelectionCriteriaProperty.builder()
 * .exclude(List.of("exclude"))
 * .include(List.of("include"))
 * .build())
 * .build())
 * .build())
 * .id("id")
 * .isEnabled(false)
 * // the properties below are optional
 * .awsOrg(AwsOrgProperty.builder()
 * .arn("arn")
 * .build())
 * .dataExport(DataExportProperty.builder()
 * .cloudWatchMetrics(CloudWatchMetricsProperty.builder()
 * .isEnabled(false)
 * .build())
 * .s3BucketDestination(S3BucketDestinationProperty.builder()
 * .accountId("accountId")
 * .arn("arn")
 * .format("format")
 * .outputSchemaVersion("outputSchemaVersion")
 * // the properties below are optional
 * .encryption(EncryptionProperty.builder()
 * .ssekms(SSEKMSProperty.builder()
 * .keyId("keyId")
 * .build())
 * .sses3(sses3)
 * .build())
 * .prefix("prefix")
 * .build())
 * .build())
 * .exclude(BucketsAndRegionsProperty.builder()
 * .buckets(List.of("buckets"))
 * .regions(List.of("regions"))
 * .build())
 * .include(BucketsAndRegionsProperty.builder()
 * .buckets(List.of("buckets"))
 * .regions(List.of("regions"))
 * .build())
 * .storageLensArn("storageLensArn")
 * .build())
 * // the properties below are optional
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-storagelens.html)
 */
@CdkDslMarker
public class CfnStorageLensPropsDsl {
    private val cdkBuilder: CfnStorageLensProps.Builder = CfnStorageLensProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param storageLensConfiguration This resource contains the details Amazon S3 Storage Lens
     *   configuration.
     */
    public fun storageLensConfiguration(storageLensConfiguration: IResolvable) {
        cdkBuilder.storageLensConfiguration(storageLensConfiguration)
    }

    /**
     * @param storageLensConfiguration This resource contains the details Amazon S3 Storage Lens
     *   configuration.
     */
    public fun storageLensConfiguration(
        storageLensConfiguration: CfnStorageLens.StorageLensConfigurationProperty
    ) {
        cdkBuilder.storageLensConfiguration(storageLensConfiguration)
    }

    /**
     * @param tags A set of tags (key–value pairs) to associate with the Storage Lens configuration.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags A set of tags (key–value pairs) to associate with the Storage Lens configuration.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnStorageLensProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
