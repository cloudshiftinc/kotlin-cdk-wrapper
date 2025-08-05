@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.accessanalyzer

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnAnalyzer`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.accessanalyzer.*;
 * CfnAnalyzerProps cfnAnalyzerProps = CfnAnalyzerProps.builder()
 * .type("type")
 * // the properties below are optional
 * .analyzerConfiguration(AnalyzerConfigurationProperty.builder()
 * .internalAccessConfiguration(InternalAccessConfigurationProperty.builder()
 * .internalAccessAnalysisRule(InternalAccessAnalysisRuleProperty.builder()
 * .inclusions(List.of(InternalAccessAnalysisRuleCriteriaProperty.builder()
 * .accountIds(List.of("accountIds"))
 * .resourceArns(List.of("resourceArns"))
 * .resourceTypes(List.of("resourceTypes"))
 * .build()))
 * .build())
 * .build())
 * .unusedAccessConfiguration(UnusedAccessConfigurationProperty.builder()
 * .analysisRule(AnalysisRuleProperty.builder()
 * .exclusions(List.of(AnalysisRuleCriteriaProperty.builder()
 * .accountIds(List.of("accountIds"))
 * .resourceTags(List.of(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build())))
 * .build()))
 * .build())
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
public interface CfnAnalyzerProps {
  /**
   * Contains information about the configuration of an analyzer for an AWS organization or account.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-accessanalyzer-analyzer.html#cfn-accessanalyzer-analyzer-analyzerconfiguration)
   */
  public fun analyzerConfiguration(): Any? = unwrap(this).getAnalyzerConfiguration()

  /**
   * The name of the analyzer.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-accessanalyzer-analyzer.html#cfn-accessanalyzer-analyzer-analyzername)
   */
  public fun analyzerName(): String? = unwrap(this).getAnalyzerName()

  /**
   * Specifies the archive rules to add for the analyzer.
   *
   * Archive rules automatically archive findings that meet the criteria you define for the rule.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-accessanalyzer-analyzer.html#cfn-accessanalyzer-analyzer-archiverules)
   */
  public fun archiveRules(): Any? = unwrap(this).getArchiveRules()

  /**
   * An array of key-value pairs to apply to the analyzer.
   *
   * You can use the set of Unicode letters, digits, whitespace, `_` , `.` , `/` , `=` , `+` , and
   * `-` .
   *
   * For the tag key, you can specify a value that is 1 to 128 characters in length and cannot be
   * prefixed with `aws:` .
   *
   * For the tag value, you can specify a value that is 0 to 256 characters in length.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-accessanalyzer-analyzer.html#cfn-accessanalyzer-analyzer-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The type represents the zone of trust for the analyzer.
   *
   * *Allowed Values* : ACCOUNT | ORGANIZATION | ACCOUNT_UNUSED_ACCESS | ACCOUNT_INTERNAL_ACCESS |
   * ORGANIZATION_INTERNAL_ACCESS | ORGANIZATION_UNUSED_ACCESS
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-accessanalyzer-analyzer.html#cfn-accessanalyzer-analyzer-type)
   */
  public fun type(): String

  /**
   * A builder for [CfnAnalyzerProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param analyzerConfiguration Contains information about the configuration of an analyzer for
     * an AWS organization or account.
     */
    public fun analyzerConfiguration(analyzerConfiguration: IResolvable)

    /**
     * @param analyzerConfiguration Contains information about the configuration of an analyzer for
     * an AWS organization or account.
     */
    public
        fun analyzerConfiguration(analyzerConfiguration: CfnAnalyzer.AnalyzerConfigurationProperty)

    /**
     * @param analyzerConfiguration Contains information about the configuration of an analyzer for
     * an AWS organization or account.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4e8ef999c1ee18f5f538bd76caa12533cc428031c70ead9e147324a194fc0e6c")
    public
        fun analyzerConfiguration(analyzerConfiguration: CfnAnalyzer.AnalyzerConfigurationProperty.Builder.() -> Unit)

    /**
     * @param analyzerName The name of the analyzer.
     */
    public fun analyzerName(analyzerName: String)

    /**
     * @param archiveRules Specifies the archive rules to add for the analyzer.
     * Archive rules automatically archive findings that meet the criteria you define for the rule.
     */
    public fun archiveRules(archiveRules: IResolvable)

    /**
     * @param archiveRules Specifies the archive rules to add for the analyzer.
     * Archive rules automatically archive findings that meet the criteria you define for the rule.
     */
    public fun archiveRules(archiveRules: List<Any>)

    /**
     * @param archiveRules Specifies the archive rules to add for the analyzer.
     * Archive rules automatically archive findings that meet the criteria you define for the rule.
     */
    public fun archiveRules(vararg archiveRules: Any)

    /**
     * @param tags An array of key-value pairs to apply to the analyzer.
     * You can use the set of Unicode letters, digits, whitespace, `_` , `.` , `/` , `=` , `+` , and
     * `-` .
     *
     * For the tag key, you can specify a value that is 1 to 128 characters in length and cannot be
     * prefixed with `aws:` .
     *
     * For the tag value, you can specify a value that is 0 to 256 characters in length.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An array of key-value pairs to apply to the analyzer.
     * You can use the set of Unicode letters, digits, whitespace, `_` , `.` , `/` , `=` , `+` , and
     * `-` .
     *
     * For the tag key, you can specify a value that is 1 to 128 characters in length and cannot be
     * prefixed with `aws:` .
     *
     * For the tag value, you can specify a value that is 0 to 256 characters in length.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param type The type represents the zone of trust for the analyzer. 
     * *Allowed Values* : ACCOUNT | ORGANIZATION | ACCOUNT_UNUSED_ACCESS | ACCOUNT_INTERNAL_ACCESS |
     * ORGANIZATION_INTERNAL_ACCESS | ORGANIZATION_UNUSED_ACCESS
     */
    public fun type(type: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.accessanalyzer.CfnAnalyzerProps.Builder
        = software.amazon.awscdk.services.accessanalyzer.CfnAnalyzerProps.builder()

    /**
     * @param analyzerConfiguration Contains information about the configuration of an analyzer for
     * an AWS organization or account.
     */
    override fun analyzerConfiguration(analyzerConfiguration: IResolvable) {
      cdkBuilder.analyzerConfiguration(analyzerConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param analyzerConfiguration Contains information about the configuration of an analyzer for
     * an AWS organization or account.
     */
    override
        fun analyzerConfiguration(analyzerConfiguration: CfnAnalyzer.AnalyzerConfigurationProperty) {
      cdkBuilder.analyzerConfiguration(analyzerConfiguration.let(CfnAnalyzer.AnalyzerConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param analyzerConfiguration Contains information about the configuration of an analyzer for
     * an AWS organization or account.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4e8ef999c1ee18f5f538bd76caa12533cc428031c70ead9e147324a194fc0e6c")
    override
        fun analyzerConfiguration(analyzerConfiguration: CfnAnalyzer.AnalyzerConfigurationProperty.Builder.() -> Unit):
        Unit =
        analyzerConfiguration(CfnAnalyzer.AnalyzerConfigurationProperty(analyzerConfiguration))

    /**
     * @param analyzerName The name of the analyzer.
     */
    override fun analyzerName(analyzerName: String) {
      cdkBuilder.analyzerName(analyzerName)
    }

    /**
     * @param archiveRules Specifies the archive rules to add for the analyzer.
     * Archive rules automatically archive findings that meet the criteria you define for the rule.
     */
    override fun archiveRules(archiveRules: IResolvable) {
      cdkBuilder.archiveRules(archiveRules.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param archiveRules Specifies the archive rules to add for the analyzer.
     * Archive rules automatically archive findings that meet the criteria you define for the rule.
     */
    override fun archiveRules(archiveRules: List<Any>) {
      cdkBuilder.archiveRules(archiveRules.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param archiveRules Specifies the archive rules to add for the analyzer.
     * Archive rules automatically archive findings that meet the criteria you define for the rule.
     */
    override fun archiveRules(vararg archiveRules: Any): Unit = archiveRules(archiveRules.toList())

    /**
     * @param tags An array of key-value pairs to apply to the analyzer.
     * You can use the set of Unicode letters, digits, whitespace, `_` , `.` , `/` , `=` , `+` , and
     * `-` .
     *
     * For the tag key, you can specify a value that is 1 to 128 characters in length and cannot be
     * prefixed with `aws:` .
     *
     * For the tag value, you can specify a value that is 0 to 256 characters in length.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags An array of key-value pairs to apply to the analyzer.
     * You can use the set of Unicode letters, digits, whitespace, `_` , `.` , `/` , `=` , `+` , and
     * `-` .
     *
     * For the tag key, you can specify a value that is 1 to 128 characters in length and cannot be
     * prefixed with `aws:` .
     *
     * For the tag value, you can specify a value that is 0 to 256 characters in length.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param type The type represents the zone of trust for the analyzer. 
     * *Allowed Values* : ACCOUNT | ORGANIZATION | ACCOUNT_UNUSED_ACCESS | ACCOUNT_INTERNAL_ACCESS |
     * ORGANIZATION_INTERNAL_ACCESS | ORGANIZATION_UNUSED_ACCESS
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.accessanalyzer.CfnAnalyzerProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.accessanalyzer.CfnAnalyzerProps,
  ) : CdkObject(cdkObject),
      CfnAnalyzerProps {
    /**
     * Contains information about the configuration of an analyzer for an AWS organization or
     * account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-accessanalyzer-analyzer.html#cfn-accessanalyzer-analyzer-analyzerconfiguration)
     */
    override fun analyzerConfiguration(): Any? = unwrap(this).getAnalyzerConfiguration()

    /**
     * The name of the analyzer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-accessanalyzer-analyzer.html#cfn-accessanalyzer-analyzer-analyzername)
     */
    override fun analyzerName(): String? = unwrap(this).getAnalyzerName()

    /**
     * Specifies the archive rules to add for the analyzer.
     *
     * Archive rules automatically archive findings that meet the criteria you define for the rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-accessanalyzer-analyzer.html#cfn-accessanalyzer-analyzer-archiverules)
     */
    override fun archiveRules(): Any? = unwrap(this).getArchiveRules()

    /**
     * An array of key-value pairs to apply to the analyzer.
     *
     * You can use the set of Unicode letters, digits, whitespace, `_` , `.` , `/` , `=` , `+` , and
     * `-` .
     *
     * For the tag key, you can specify a value that is 1 to 128 characters in length and cannot be
     * prefixed with `aws:` .
     *
     * For the tag value, you can specify a value that is 0 to 256 characters in length.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-accessanalyzer-analyzer.html#cfn-accessanalyzer-analyzer-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The type represents the zone of trust for the analyzer.
     *
     * *Allowed Values* : ACCOUNT | ORGANIZATION | ACCOUNT_UNUSED_ACCESS | ACCOUNT_INTERNAL_ACCESS |
     * ORGANIZATION_INTERNAL_ACCESS | ORGANIZATION_UNUSED_ACCESS
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-accessanalyzer-analyzer.html#cfn-accessanalyzer-analyzer-type)
     */
    override fun type(): String = unwrap(this).getType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAnalyzerProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.accessanalyzer.CfnAnalyzerProps):
        CfnAnalyzerProps = CdkObjectWrappers.wrap(cdkObject) as? CfnAnalyzerProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAnalyzerProps):
        software.amazon.awscdk.services.accessanalyzer.CfnAnalyzerProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.accessanalyzer.CfnAnalyzerProps
  }
}
