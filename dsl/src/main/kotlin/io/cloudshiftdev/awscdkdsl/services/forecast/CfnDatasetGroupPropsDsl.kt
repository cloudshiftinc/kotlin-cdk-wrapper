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

package io.cloudshiftdev.awscdkdsl.services.forecast

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.forecast.CfnDatasetGroupProps

/**
 * Properties for defining a `CfnDatasetGroup`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.forecast.*;
 * CfnDatasetGroupProps cfnDatasetGroupProps = CfnDatasetGroupProps.builder()
 * .datasetGroupName("datasetGroupName")
 * .domain("domain")
 * // the properties below are optional
 * .datasetArns(List.of("datasetArns"))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-forecast-datasetgroup.html)
 */
@CdkDslMarker
public class CfnDatasetGroupPropsDsl {
    private val cdkBuilder: CfnDatasetGroupProps.Builder = CfnDatasetGroupProps.builder()

    private val _datasetArns: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param datasetArns An array of Amazon Resource Names (ARNs) of the datasets that you want to
     *   include in the dataset group.
     */
    public fun datasetArns(vararg datasetArns: String) {
        _datasetArns.addAll(listOf(*datasetArns))
    }

    /**
     * @param datasetArns An array of Amazon Resource Names (ARNs) of the datasets that you want to
     *   include in the dataset group.
     */
    public fun datasetArns(datasetArns: Collection<String>) {
        _datasetArns.addAll(datasetArns)
    }

    /** @param datasetGroupName The name of the dataset group. */
    public fun datasetGroupName(datasetGroupName: String) {
        cdkBuilder.datasetGroupName(datasetGroupName)
    }

    /**
     * @param domain The domain associated with the dataset group. When you add a dataset to a
     *   dataset group, this value and the value specified for the `Domain` parameter of the
     *   [CreateDataset](https://docs.aws.amazon.com/forecast/latest/dg/API_CreateDataset.html)
     *   operation must match.
     *
     * The `Domain` and `DatasetType` that you choose determine the fields that must be present in
     * training data that you import to a dataset. For example, if you choose the `RETAIL` domain
     * and `TARGET_TIME_SERIES` as the `DatasetType` , Amazon Forecast requires that `item_id` ,
     * `timestamp` , and `demand` fields are present in your data. For more information, see
     * [Dataset groups](https://docs.aws.amazon.com/forecast/latest/dg/howitworks-datasets-groups.html)
     * .
     */
    public fun domain(domain: String) {
        cdkBuilder.domain(domain)
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource. For more information, see
     *   [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     *   .
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource. For more information, see
     *   [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     *   .
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnDatasetGroupProps {
        if (_datasetArns.isNotEmpty()) cdkBuilder.datasetArns(_datasetArns)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
