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

package io.cloudshiftdev.awscdkdsl.services.quicksight

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDataSet

/**
 * The element you can use to define tags for row-level security.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * Object tagRuleConfigurations;
 * RowLevelPermissionTagConfigurationProperty rowLevelPermissionTagConfigurationProperty =
 * RowLevelPermissionTagConfigurationProperty.builder()
 * .tagRules(List.of(RowLevelPermissionTagRuleProperty.builder()
 * .columnName("columnName")
 * .tagKey("tagKey")
 * // the properties below are optional
 * .matchAllValue("matchAllValue")
 * .tagMultiValueDelimiter("tagMultiValueDelimiter")
 * .build()))
 * // the properties below are optional
 * .status("status")
 * .tagRuleConfigurations(tagRuleConfigurations)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-rowlevelpermissiontagconfiguration.html)
 */
@CdkDslMarker
public class CfnDataSetRowLevelPermissionTagConfigurationPropertyDsl {
    private val cdkBuilder: CfnDataSet.RowLevelPermissionTagConfigurationProperty.Builder =
        CfnDataSet.RowLevelPermissionTagConfigurationProperty.builder()

    private val _tagRules: MutableList<Any> = mutableListOf()

    /**
     * @param status The status of row-level security tags. If enabled, the status is `ENABLED` . If
     *   disabled, the status is `DISABLED` .
     */
    public fun status(status: String) {
        cdkBuilder.status(status)
    }

    /**
     * @param tagRuleConfigurations The configuration of tags on a dataset to set row-level
     *   security.
     */
    public fun tagRuleConfigurations(tagRuleConfigurations: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(tagRuleConfigurations)
        cdkBuilder.tagRuleConfigurations(builder.map)
    }

    /**
     * @param tagRuleConfigurations The configuration of tags on a dataset to set row-level
     *   security.
     */
    public fun tagRuleConfigurations(tagRuleConfigurations: Any) {
        cdkBuilder.tagRuleConfigurations(tagRuleConfigurations)
    }

    /**
     * @param tagRules A set of rules associated with row-level security, such as the tag names and
     *   columns that they are assigned to.
     */
    public fun tagRules(vararg tagRules: Any) {
        _tagRules.addAll(listOf(*tagRules))
    }

    /**
     * @param tagRules A set of rules associated with row-level security, such as the tag names and
     *   columns that they are assigned to.
     */
    public fun tagRules(tagRules: Collection<Any>) {
        _tagRules.addAll(tagRules)
    }

    /**
     * @param tagRules A set of rules associated with row-level security, such as the tag names and
     *   columns that they are assigned to.
     */
    public fun tagRules(tagRules: IResolvable) {
        cdkBuilder.tagRules(tagRules)
    }

    public fun build(): CfnDataSet.RowLevelPermissionTagConfigurationProperty {
        if (_tagRules.isNotEmpty()) cdkBuilder.tagRules(_tagRules)
        return cdkBuilder.build()
    }
}
