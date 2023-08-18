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

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.accessanalyzer.CfnAnalyzer
import software.amazon.awscdk.services.accessanalyzer.CfnAnalyzerProps
import software.constructs.Construct

public object accessanalyzer {
    /**
     * The `AWS::AccessAnalyzer::Analyzer` resource specifies a new analyzer.
     *
     * The analyzer is an object that represents the IAM Access Analyzer feature. An analyzer is
     * required for Access Analyzer to become operational.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.accessanalyzer.*;
     * CfnAnalyzer cfnAnalyzer = CfnAnalyzer.Builder.create(this, "MyCfnAnalyzer")
     * .type("type")
     * // the properties below are optional
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
    public inline fun cfnAnalyzer(
        scope: Construct,
        id: String,
        block: CfnAnalyzerDsl.() -> Unit = {},
    ): CfnAnalyzer {
        val builder = CfnAnalyzerDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The criteria for an archive rule.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.accessanalyzer.*;
     * ArchiveRuleProperty archiveRuleProperty = ArchiveRuleProperty.builder()
     * .filter(List.of(FilterProperty.builder()
     * .property("property")
     * // the properties below are optional
     * .contains(List.of("contains"))
     * .eq(List.of("eq"))
     * .exists(false)
     * .neq(List.of("neq"))
     * .build()))
     * .ruleName("ruleName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-accessanalyzer-analyzer-archiverule.html)
     */
    public inline fun cfnAnalyzerArchiveRuleProperty(
        block: CfnAnalyzerArchiveRulePropertyDsl.() -> Unit = {}
    ): CfnAnalyzer.ArchiveRuleProperty {
        val builder = CfnAnalyzerArchiveRulePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The criteria that defines the rule.
     *
     * To learn about filter keys that you can use to create an archive rule, see
     * [filter keys](https://docs.aws.amazon.com/IAM/latest/UserGuide/access-analyzer-reference-filter-keys.html)
     * in the *User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.accessanalyzer.*;
     * FilterProperty filterProperty = FilterProperty.builder()
     * .property("property")
     * // the properties below are optional
     * .contains(List.of("contains"))
     * .eq(List.of("eq"))
     * .exists(false)
     * .neq(List.of("neq"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-accessanalyzer-analyzer-filter.html)
     */
    public inline fun cfnAnalyzerFilterProperty(
        block: CfnAnalyzerFilterPropertyDsl.() -> Unit = {}
    ): CfnAnalyzer.FilterProperty {
        val builder = CfnAnalyzerFilterPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

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
    public inline fun cfnAnalyzerProps(
        block: CfnAnalyzerPropsDsl.() -> Unit = {}
    ): CfnAnalyzerProps {
        val builder = CfnAnalyzerPropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
