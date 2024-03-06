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

package io.cloudshiftdev.awscdkdsl.services.accessanalyzer

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.accessanalyzer.CfnAnalyzer
import software.amazon.awscdk.services.accessanalyzer.CfnAnalyzerProps

/**
 * Properties for defining a `CfnAnalyzer`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.accessanalyzer.*;
 * CfnAnalyzerProps cfnAnalyzerProps = CfnAnalyzerProps.builder()
 * .type("type")
 * // the properties below are optional
 * .analyzerConfiguration(AnalyzerConfigurationProperty.builder()
 * .unusedAccessConfiguration(UnusedAccessConfigurationProperty.builder()
 * .unusedAccessAge(123)
 * .build())
 * .build())
 * .analyzerName("analyzerName")
 * .archiveRules(List.of(ArchiveRuleProperty.builder()
 * .filter(List.of(FilterProperty.builder()
 * .property("property")
 * // the properties below are optional
 * .contains(List.of("contains"))
 * .eq(List.of("eq"))
 * .exists(false)
 * .neq(List.of("neq"))
 * .build()))
 * .ruleName("ruleName")
 * .build()))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-accessanalyzer-analyzer.html)
 */
@CdkDslMarker
public class CfnAnalyzerPropsDsl {
    private val cdkBuilder: CfnAnalyzerProps.Builder = CfnAnalyzerProps.builder()

    private val _archiveRules: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param analyzerConfiguration Contains information about the configuration of an unused access
     *   analyzer for an AWS organization or account.
     */
    public fun analyzerConfiguration(analyzerConfiguration: IResolvable) {
        cdkBuilder.analyzerConfiguration(analyzerConfiguration)
    }

    /**
     * @param analyzerConfiguration Contains information about the configuration of an unused access
     *   analyzer for an AWS organization or account.
     */
    public fun analyzerConfiguration(
        analyzerConfiguration: CfnAnalyzer.AnalyzerConfigurationProperty
    ) {
        cdkBuilder.analyzerConfiguration(analyzerConfiguration)
    }

    /** @param analyzerName The name of the analyzer. */
    public fun analyzerName(analyzerName: String) {
        cdkBuilder.analyzerName(analyzerName)
    }

    /**
     * @param archiveRules Specifies the archive rules to add for the analyzer. Archive rules
     *   automatically archive findings that meet the criteria you define for the rule.
     */
    public fun archiveRules(vararg archiveRules: Any) {
        _archiveRules.addAll(listOf(*archiveRules))
    }

    /**
     * @param archiveRules Specifies the archive rules to add for the analyzer. Archive rules
     *   automatically archive findings that meet the criteria you define for the rule.
     */
    public fun archiveRules(archiveRules: Collection<Any>) {
        _archiveRules.addAll(archiveRules)
    }

    /**
     * @param archiveRules Specifies the archive rules to add for the analyzer. Archive rules
     *   automatically archive findings that meet the criteria you define for the rule.
     */
    public fun archiveRules(archiveRules: IResolvable) {
        cdkBuilder.archiveRules(archiveRules)
    }

    /** @param tags An array of key-value pairs to apply to the analyzer. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags An array of key-value pairs to apply to the analyzer. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * @param type The type represents the zone of trust for the analyzer. *Allowed Values* :
     *   ACCOUNT | ORGANIZATION | ACCOUNT_UNUSED_ACCESS | ORGANIZATION_UNUSED_ACCESS
     */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnAnalyzerProps {
        if (_archiveRules.isNotEmpty()) cdkBuilder.archiveRules(_archiveRules)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
