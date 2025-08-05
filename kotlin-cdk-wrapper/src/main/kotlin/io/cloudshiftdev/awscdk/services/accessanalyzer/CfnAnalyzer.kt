@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.accessanalyzer

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::AccessAnalyzer::Analyzer` resource specifies a new analyzer.
 *
 * The analyzer is an object that represents the IAM Access Analyzer feature. An analyzer is
 * required for Access Analyzer to become operational.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.accessanalyzer.*;
 * CfnAnalyzer cfnAnalyzer = CfnAnalyzer.Builder.create(this, "MyCfnAnalyzer")
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
public open class CfnAnalyzer(
  cdkObject: software.amazon.awscdk.services.accessanalyzer.CfnAnalyzer,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnAnalyzerProps,
  ) :
      this(software.amazon.awscdk.services.accessanalyzer.CfnAnalyzer(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnAnalyzerProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnAnalyzerProps.Builder.() -> Unit,
  ) : this(scope, id, CfnAnalyzerProps(props)
  )

  /**
   * Contains information about the configuration of an analyzer for an AWS organization or account.
   */
  public open fun analyzerConfiguration(): Any? = unwrap(this).getAnalyzerConfiguration()

  /**
   * Contains information about the configuration of an analyzer for an AWS organization or account.
   */
  public open fun analyzerConfiguration(`value`: IResolvable) {
    unwrap(this).setAnalyzerConfiguration(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Contains information about the configuration of an analyzer for an AWS organization or account.
   */
  public open fun analyzerConfiguration(`value`: AnalyzerConfigurationProperty) {
    unwrap(this).setAnalyzerConfiguration(`value`.let(AnalyzerConfigurationProperty.Companion::unwrap))
  }

  /**
   * Contains information about the configuration of an analyzer for an AWS organization or account.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d96198f42b896af4b94eb3419f13ed3346f921e992c5710fccec212e0514de1b")
  public open fun analyzerConfiguration(`value`: AnalyzerConfigurationProperty.Builder.() -> Unit):
      Unit = analyzerConfiguration(AnalyzerConfigurationProperty(`value`))

  /**
   * The name of the analyzer.
   */
  public open fun analyzerName(): String? = unwrap(this).getAnalyzerName()

  /**
   * The name of the analyzer.
   */
  public open fun analyzerName(`value`: String) {
    unwrap(this).setAnalyzerName(`value`)
  }

  /**
   * Specifies the archive rules to add for the analyzer.
   */
  public open fun archiveRules(): Any? = unwrap(this).getArchiveRules()

  /**
   * Specifies the archive rules to add for the analyzer.
   */
  public open fun archiveRules(`value`: IResolvable) {
    unwrap(this).setArchiveRules(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Specifies the archive rules to add for the analyzer.
   */
  public open fun archiveRules(`value`: List<Any>) {
    unwrap(this).setArchiveRules(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * Specifies the archive rules to add for the analyzer.
   */
  public open fun archiveRules(vararg `value`: Any): Unit = archiveRules(`value`.toList())

  /**
   * The ARN of the analyzer that was created.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * An array of key-value pairs to apply to the analyzer.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * An array of key-value pairs to apply to the analyzer.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * An array of key-value pairs to apply to the analyzer.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * The type represents the zone of trust for the analyzer.
   */
  public open fun type(): String = unwrap(this).getType()

  /**
   * The type represents the zone of trust for the analyzer.
   */
  public open fun type(`value`: String) {
    unwrap(this).setType(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.accessanalyzer.CfnAnalyzer].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Contains information about the configuration of an analyzer for an AWS organization or
     * account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-accessanalyzer-analyzer.html#cfn-accessanalyzer-analyzer-analyzerconfiguration)
     * @param analyzerConfiguration Contains information about the configuration of an analyzer for
     * an AWS organization or account. 
     */
    public fun analyzerConfiguration(analyzerConfiguration: IResolvable)

    /**
     * Contains information about the configuration of an analyzer for an AWS organization or
     * account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-accessanalyzer-analyzer.html#cfn-accessanalyzer-analyzer-analyzerconfiguration)
     * @param analyzerConfiguration Contains information about the configuration of an analyzer for
     * an AWS organization or account. 
     */
    public fun analyzerConfiguration(analyzerConfiguration: AnalyzerConfigurationProperty)

    /**
     * Contains information about the configuration of an analyzer for an AWS organization or
     * account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-accessanalyzer-analyzer.html#cfn-accessanalyzer-analyzer-analyzerconfiguration)
     * @param analyzerConfiguration Contains information about the configuration of an analyzer for
     * an AWS organization or account. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("08181d83c131043275ab65dc780b8019da1eaca230ceb165db05ef754008c5a8")
    public
        fun analyzerConfiguration(analyzerConfiguration: AnalyzerConfigurationProperty.Builder.() -> Unit)

    /**
     * The name of the analyzer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-accessanalyzer-analyzer.html#cfn-accessanalyzer-analyzer-analyzername)
     * @param analyzerName The name of the analyzer. 
     */
    public fun analyzerName(analyzerName: String)

    /**
     * Specifies the archive rules to add for the analyzer.
     *
     * Archive rules automatically archive findings that meet the criteria you define for the rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-accessanalyzer-analyzer.html#cfn-accessanalyzer-analyzer-archiverules)
     * @param archiveRules Specifies the archive rules to add for the analyzer. 
     */
    public fun archiveRules(archiveRules: IResolvable)

    /**
     * Specifies the archive rules to add for the analyzer.
     *
     * Archive rules automatically archive findings that meet the criteria you define for the rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-accessanalyzer-analyzer.html#cfn-accessanalyzer-analyzer-archiverules)
     * @param archiveRules Specifies the archive rules to add for the analyzer. 
     */
    public fun archiveRules(archiveRules: List<Any>)

    /**
     * Specifies the archive rules to add for the analyzer.
     *
     * Archive rules automatically archive findings that meet the criteria you define for the rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-accessanalyzer-analyzer.html#cfn-accessanalyzer-analyzer-archiverules)
     * @param archiveRules Specifies the archive rules to add for the analyzer. 
     */
    public fun archiveRules(vararg archiveRules: Any)

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
     * @param tags An array of key-value pairs to apply to the analyzer. 
     */
    public fun tags(tags: List<CfnTag>)

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
     * @param tags An array of key-value pairs to apply to the analyzer. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The type represents the zone of trust for the analyzer.
     *
     * *Allowed Values* : ACCOUNT | ORGANIZATION | ACCOUNT_UNUSED_ACCESS | ACCOUNT_INTERNAL_ACCESS |
     * ORGANIZATION_INTERNAL_ACCESS | ORGANIZATION_UNUSED_ACCESS
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-accessanalyzer-analyzer.html#cfn-accessanalyzer-analyzer-type)
     * @param type The type represents the zone of trust for the analyzer. 
     */
    public fun type(type: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.accessanalyzer.CfnAnalyzer.Builder =
        software.amazon.awscdk.services.accessanalyzer.CfnAnalyzer.Builder.create(scope, id)

    /**
     * Contains information about the configuration of an analyzer for an AWS organization or
     * account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-accessanalyzer-analyzer.html#cfn-accessanalyzer-analyzer-analyzerconfiguration)
     * @param analyzerConfiguration Contains information about the configuration of an analyzer for
     * an AWS organization or account. 
     */
    override fun analyzerConfiguration(analyzerConfiguration: IResolvable) {
      cdkBuilder.analyzerConfiguration(analyzerConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * Contains information about the configuration of an analyzer for an AWS organization or
     * account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-accessanalyzer-analyzer.html#cfn-accessanalyzer-analyzer-analyzerconfiguration)
     * @param analyzerConfiguration Contains information about the configuration of an analyzer for
     * an AWS organization or account. 
     */
    override fun analyzerConfiguration(analyzerConfiguration: AnalyzerConfigurationProperty) {
      cdkBuilder.analyzerConfiguration(analyzerConfiguration.let(AnalyzerConfigurationProperty.Companion::unwrap))
    }

    /**
     * Contains information about the configuration of an analyzer for an AWS organization or
     * account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-accessanalyzer-analyzer.html#cfn-accessanalyzer-analyzer-analyzerconfiguration)
     * @param analyzerConfiguration Contains information about the configuration of an analyzer for
     * an AWS organization or account. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("08181d83c131043275ab65dc780b8019da1eaca230ceb165db05ef754008c5a8")
    override
        fun analyzerConfiguration(analyzerConfiguration: AnalyzerConfigurationProperty.Builder.() -> Unit):
        Unit = analyzerConfiguration(AnalyzerConfigurationProperty(analyzerConfiguration))

    /**
     * The name of the analyzer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-accessanalyzer-analyzer.html#cfn-accessanalyzer-analyzer-analyzername)
     * @param analyzerName The name of the analyzer. 
     */
    override fun analyzerName(analyzerName: String) {
      cdkBuilder.analyzerName(analyzerName)
    }

    /**
     * Specifies the archive rules to add for the analyzer.
     *
     * Archive rules automatically archive findings that meet the criteria you define for the rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-accessanalyzer-analyzer.html#cfn-accessanalyzer-analyzer-archiverules)
     * @param archiveRules Specifies the archive rules to add for the analyzer. 
     */
    override fun archiveRules(archiveRules: IResolvable) {
      cdkBuilder.archiveRules(archiveRules.let(IResolvable.Companion::unwrap))
    }

    /**
     * Specifies the archive rules to add for the analyzer.
     *
     * Archive rules automatically archive findings that meet the criteria you define for the rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-accessanalyzer-analyzer.html#cfn-accessanalyzer-analyzer-archiverules)
     * @param archiveRules Specifies the archive rules to add for the analyzer. 
     */
    override fun archiveRules(archiveRules: List<Any>) {
      cdkBuilder.archiveRules(archiveRules.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * Specifies the archive rules to add for the analyzer.
     *
     * Archive rules automatically archive findings that meet the criteria you define for the rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-accessanalyzer-analyzer.html#cfn-accessanalyzer-analyzer-archiverules)
     * @param archiveRules Specifies the archive rules to add for the analyzer. 
     */
    override fun archiveRules(vararg archiveRules: Any): Unit = archiveRules(archiveRules.toList())

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
     * @param tags An array of key-value pairs to apply to the analyzer. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

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
     * @param tags An array of key-value pairs to apply to the analyzer. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The type represents the zone of trust for the analyzer.
     *
     * *Allowed Values* : ACCOUNT | ORGANIZATION | ACCOUNT_UNUSED_ACCESS | ACCOUNT_INTERNAL_ACCESS |
     * ORGANIZATION_INTERNAL_ACCESS | ORGANIZATION_UNUSED_ACCESS
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-accessanalyzer-analyzer.html#cfn-accessanalyzer-analyzer-type)
     * @param type The type represents the zone of trust for the analyzer. 
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.accessanalyzer.CfnAnalyzer =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.accessanalyzer.CfnAnalyzer.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnAnalyzer {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnAnalyzer(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.accessanalyzer.CfnAnalyzer):
        CfnAnalyzer = CfnAnalyzer(cdkObject)

    internal fun unwrap(wrapped: CfnAnalyzer):
        software.amazon.awscdk.services.accessanalyzer.CfnAnalyzer = wrapped.cdkObject as
        software.amazon.awscdk.services.accessanalyzer.CfnAnalyzer
  }

  /**
   * The criteria for an analysis rule for an analyzer.
   *
   * The criteria determine which entities will generate findings.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.accessanalyzer.*;
   * AnalysisRuleCriteriaProperty analysisRuleCriteriaProperty =
   * AnalysisRuleCriteriaProperty.builder()
   * .accountIds(List.of("accountIds"))
   * .resourceTags(List.of(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build())))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-accessanalyzer-analyzer-analysisrulecriteria.html)
   */
  public interface AnalysisRuleCriteriaProperty {
    /**
     * A list of AWS account IDs to apply to the analysis rule criteria.
     *
     * The accounts cannot include the organization analyzer owner account. Account IDs can only be
     * applied to the analysis rule criteria for organization-level analyzers. The list cannot include
     * more than 2,000 account IDs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-accessanalyzer-analyzer-analysisrulecriteria.html#cfn-accessanalyzer-analyzer-analysisrulecriteria-accountids)
     */
    public fun accountIds(): List<String> = unwrap(this).getAccountIds() ?: emptyList()

    /**
     * An array of key-value pairs to match for your resources.
     *
     * You can use the set of Unicode letters, digits, whitespace, `_` , `.` , `/` , `=` , `+` , and
     * `-` .
     *
     * For the tag key, you can specify a value that is 1 to 128 characters in length and cannot be
     * prefixed with `aws:` .
     *
     * For the tag value, you can specify a value that is 0 to 256 characters in length. If the
     * specified tag value is 0 characters, the rule is applied to all principals with the specified
     * tag key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-accessanalyzer-analyzer-analysisrulecriteria.html#cfn-accessanalyzer-analyzer-analysisrulecriteria-resourcetags)
     */
    public fun resourceTags(): Any? = unwrap(this).getResourceTags()

    /**
     * A builder for [AnalysisRuleCriteriaProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param accountIds A list of AWS account IDs to apply to the analysis rule criteria.
       * The accounts cannot include the organization analyzer owner account. Account IDs can only
       * be applied to the analysis rule criteria for organization-level analyzers. The list cannot
       * include more than 2,000 account IDs.
       */
      public fun accountIds(accountIds: List<String>)

      /**
       * @param accountIds A list of AWS account IDs to apply to the analysis rule criteria.
       * The accounts cannot include the organization analyzer owner account. Account IDs can only
       * be applied to the analysis rule criteria for organization-level analyzers. The list cannot
       * include more than 2,000 account IDs.
       */
      public fun accountIds(vararg accountIds: String)

      /**
       * @param resourceTags An array of key-value pairs to match for your resources.
       * You can use the set of Unicode letters, digits, whitespace, `_` , `.` , `/` , `=` , `+` ,
       * and `-` .
       *
       * For the tag key, you can specify a value that is 1 to 128 characters in length and cannot
       * be prefixed with `aws:` .
       *
       * For the tag value, you can specify a value that is 0 to 256 characters in length. If the
       * specified tag value is 0 characters, the rule is applied to all principals with the specified
       * tag key.
       */
      public fun resourceTags(resourceTags: IResolvable)

      /**
       * @param resourceTags An array of key-value pairs to match for your resources.
       * You can use the set of Unicode letters, digits, whitespace, `_` , `.` , `/` , `=` , `+` ,
       * and `-` .
       *
       * For the tag key, you can specify a value that is 1 to 128 characters in length and cannot
       * be prefixed with `aws:` .
       *
       * For the tag value, you can specify a value that is 0 to 256 characters in length. If the
       * specified tag value is 0 characters, the rule is applied to all principals with the specified
       * tag key.
       */
      public fun resourceTags(resourceTags: List<Any>)

      /**
       * @param resourceTags An array of key-value pairs to match for your resources.
       * You can use the set of Unicode letters, digits, whitespace, `_` , `.` , `/` , `=` , `+` ,
       * and `-` .
       *
       * For the tag key, you can specify a value that is 1 to 128 characters in length and cannot
       * be prefixed with `aws:` .
       *
       * For the tag value, you can specify a value that is 0 to 256 characters in length. If the
       * specified tag value is 0 characters, the rule is applied to all principals with the specified
       * tag key.
       */
      public fun resourceTags(vararg resourceTags: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.accessanalyzer.CfnAnalyzer.AnalysisRuleCriteriaProperty.Builder
          =
          software.amazon.awscdk.services.accessanalyzer.CfnAnalyzer.AnalysisRuleCriteriaProperty.builder()

      /**
       * @param accountIds A list of AWS account IDs to apply to the analysis rule criteria.
       * The accounts cannot include the organization analyzer owner account. Account IDs can only
       * be applied to the analysis rule criteria for organization-level analyzers. The list cannot
       * include more than 2,000 account IDs.
       */
      override fun accountIds(accountIds: List<String>) {
        cdkBuilder.accountIds(accountIds)
      }

      /**
       * @param accountIds A list of AWS account IDs to apply to the analysis rule criteria.
       * The accounts cannot include the organization analyzer owner account. Account IDs can only
       * be applied to the analysis rule criteria for organization-level analyzers. The list cannot
       * include more than 2,000 account IDs.
       */
      override fun accountIds(vararg accountIds: String): Unit = accountIds(accountIds.toList())

      /**
       * @param resourceTags An array of key-value pairs to match for your resources.
       * You can use the set of Unicode letters, digits, whitespace, `_` , `.` , `/` , `=` , `+` ,
       * and `-` .
       *
       * For the tag key, you can specify a value that is 1 to 128 characters in length and cannot
       * be prefixed with `aws:` .
       *
       * For the tag value, you can specify a value that is 0 to 256 characters in length. If the
       * specified tag value is 0 characters, the rule is applied to all principals with the specified
       * tag key.
       */
      override fun resourceTags(resourceTags: IResolvable) {
        cdkBuilder.resourceTags(resourceTags.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param resourceTags An array of key-value pairs to match for your resources.
       * You can use the set of Unicode letters, digits, whitespace, `_` , `.` , `/` , `=` , `+` ,
       * and `-` .
       *
       * For the tag key, you can specify a value that is 1 to 128 characters in length and cannot
       * be prefixed with `aws:` .
       *
       * For the tag value, you can specify a value that is 0 to 256 characters in length. If the
       * specified tag value is 0 characters, the rule is applied to all principals with the specified
       * tag key.
       */
      override fun resourceTags(resourceTags: List<Any>) {
        cdkBuilder.resourceTags(resourceTags.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param resourceTags An array of key-value pairs to match for your resources.
       * You can use the set of Unicode letters, digits, whitespace, `_` , `.` , `/` , `=` , `+` ,
       * and `-` .
       *
       * For the tag key, you can specify a value that is 1 to 128 characters in length and cannot
       * be prefixed with `aws:` .
       *
       * For the tag value, you can specify a value that is 0 to 256 characters in length. If the
       * specified tag value is 0 characters, the rule is applied to all principals with the specified
       * tag key.
       */
      override fun resourceTags(vararg resourceTags: Any): Unit =
          resourceTags(resourceTags.toList())

      public fun build():
          software.amazon.awscdk.services.accessanalyzer.CfnAnalyzer.AnalysisRuleCriteriaProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.accessanalyzer.CfnAnalyzer.AnalysisRuleCriteriaProperty,
    ) : CdkObject(cdkObject),
        AnalysisRuleCriteriaProperty {
      /**
       * A list of AWS account IDs to apply to the analysis rule criteria.
       *
       * The accounts cannot include the organization analyzer owner account. Account IDs can only
       * be applied to the analysis rule criteria for organization-level analyzers. The list cannot
       * include more than 2,000 account IDs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-accessanalyzer-analyzer-analysisrulecriteria.html#cfn-accessanalyzer-analyzer-analysisrulecriteria-accountids)
       */
      override fun accountIds(): List<String> = unwrap(this).getAccountIds() ?: emptyList()

      /**
       * An array of key-value pairs to match for your resources.
       *
       * You can use the set of Unicode letters, digits, whitespace, `_` , `.` , `/` , `=` , `+` ,
       * and `-` .
       *
       * For the tag key, you can specify a value that is 1 to 128 characters in length and cannot
       * be prefixed with `aws:` .
       *
       * For the tag value, you can specify a value that is 0 to 256 characters in length. If the
       * specified tag value is 0 characters, the rule is applied to all principals with the specified
       * tag key.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-accessanalyzer-analyzer-analysisrulecriteria.html#cfn-accessanalyzer-analyzer-analysisrulecriteria-resourcetags)
       */
      override fun resourceTags(): Any? = unwrap(this).getResourceTags()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AnalysisRuleCriteriaProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.accessanalyzer.CfnAnalyzer.AnalysisRuleCriteriaProperty):
          AnalysisRuleCriteriaProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AnalysisRuleCriteriaProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AnalysisRuleCriteriaProperty):
          software.amazon.awscdk.services.accessanalyzer.CfnAnalyzer.AnalysisRuleCriteriaProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.accessanalyzer.CfnAnalyzer.AnalysisRuleCriteriaProperty
    }
  }

  /**
   * Contains information about analysis rules for the analyzer.
   *
   * Analysis rules determine which entities will generate findings based on the criteria you define
   * when you create the rule.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.accessanalyzer.*;
   * AnalysisRuleProperty analysisRuleProperty = AnalysisRuleProperty.builder()
   * .exclusions(List.of(AnalysisRuleCriteriaProperty.builder()
   * .accountIds(List.of("accountIds"))
   * .resourceTags(List.of(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build())))
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-accessanalyzer-analyzer-analysisrule.html)
   */
  public interface AnalysisRuleProperty {
    /**
     * A list of rules for the analyzer containing criteria to exclude from analysis.
     *
     * Entities that meet the rule criteria will not generate findings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-accessanalyzer-analyzer-analysisrule.html#cfn-accessanalyzer-analyzer-analysisrule-exclusions)
     */
    public fun exclusions(): Any? = unwrap(this).getExclusions()

    /**
     * A builder for [AnalysisRuleProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param exclusions A list of rules for the analyzer containing criteria to exclude from
       * analysis.
       * Entities that meet the rule criteria will not generate findings.
       */
      public fun exclusions(exclusions: IResolvable)

      /**
       * @param exclusions A list of rules for the analyzer containing criteria to exclude from
       * analysis.
       * Entities that meet the rule criteria will not generate findings.
       */
      public fun exclusions(exclusions: List<Any>)

      /**
       * @param exclusions A list of rules for the analyzer containing criteria to exclude from
       * analysis.
       * Entities that meet the rule criteria will not generate findings.
       */
      public fun exclusions(vararg exclusions: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.accessanalyzer.CfnAnalyzer.AnalysisRuleProperty.Builder =
          software.amazon.awscdk.services.accessanalyzer.CfnAnalyzer.AnalysisRuleProperty.builder()

      /**
       * @param exclusions A list of rules for the analyzer containing criteria to exclude from
       * analysis.
       * Entities that meet the rule criteria will not generate findings.
       */
      override fun exclusions(exclusions: IResolvable) {
        cdkBuilder.exclusions(exclusions.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param exclusions A list of rules for the analyzer containing criteria to exclude from
       * analysis.
       * Entities that meet the rule criteria will not generate findings.
       */
      override fun exclusions(exclusions: List<Any>) {
        cdkBuilder.exclusions(exclusions.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param exclusions A list of rules for the analyzer containing criteria to exclude from
       * analysis.
       * Entities that meet the rule criteria will not generate findings.
       */
      override fun exclusions(vararg exclusions: Any): Unit = exclusions(exclusions.toList())

      public fun build():
          software.amazon.awscdk.services.accessanalyzer.CfnAnalyzer.AnalysisRuleProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.accessanalyzer.CfnAnalyzer.AnalysisRuleProperty,
    ) : CdkObject(cdkObject),
        AnalysisRuleProperty {
      /**
       * A list of rules for the analyzer containing criteria to exclude from analysis.
       *
       * Entities that meet the rule criteria will not generate findings.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-accessanalyzer-analyzer-analysisrule.html#cfn-accessanalyzer-analyzer-analysisrule-exclusions)
       */
      override fun exclusions(): Any? = unwrap(this).getExclusions()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AnalysisRuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.accessanalyzer.CfnAnalyzer.AnalysisRuleProperty):
          AnalysisRuleProperty = CdkObjectWrappers.wrap(cdkObject) as? AnalysisRuleProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: AnalysisRuleProperty):
          software.amazon.awscdk.services.accessanalyzer.CfnAnalyzer.AnalysisRuleProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.accessanalyzer.CfnAnalyzer.AnalysisRuleProperty
    }
  }

  /**
   * Contains information about the configuration of an analyzer for an AWS organization or account.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.accessanalyzer.*;
   * AnalyzerConfigurationProperty analyzerConfigurationProperty =
   * AnalyzerConfigurationProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-accessanalyzer-analyzer-analyzerconfiguration.html)
   */
  public interface AnalyzerConfigurationProperty {
    /**
     * Specifies the configuration of an internal access analyzer for an AWS organization or
     * account.
     *
     * This configuration determines how the analyzer evaluates access within your AWS environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-accessanalyzer-analyzer-analyzerconfiguration.html#cfn-accessanalyzer-analyzer-analyzerconfiguration-internalaccessconfiguration)
     */
    public fun internalAccessConfiguration(): Any? = unwrap(this).getInternalAccessConfiguration()

    /**
     * Specifies the configuration of an unused access analyzer for an AWS organization or account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-accessanalyzer-analyzer-analyzerconfiguration.html#cfn-accessanalyzer-analyzer-analyzerconfiguration-unusedaccessconfiguration)
     */
    public fun unusedAccessConfiguration(): Any? = unwrap(this).getUnusedAccessConfiguration()

    /**
     * A builder for [AnalyzerConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param internalAccessConfiguration Specifies the configuration of an internal access
       * analyzer for an AWS organization or account.
       * This configuration determines how the analyzer evaluates access within your AWS
       * environment.
       */
      public fun internalAccessConfiguration(internalAccessConfiguration: IResolvable)

      /**
       * @param internalAccessConfiguration Specifies the configuration of an internal access
       * analyzer for an AWS organization or account.
       * This configuration determines how the analyzer evaluates access within your AWS
       * environment.
       */
      public
          fun internalAccessConfiguration(internalAccessConfiguration: InternalAccessConfigurationProperty)

      /**
       * @param internalAccessConfiguration Specifies the configuration of an internal access
       * analyzer for an AWS organization or account.
       * This configuration determines how the analyzer evaluates access within your AWS
       * environment.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8cc145c26da8304cda8cffafa8bbb7bcd26ae82bf46a77fde334f099939dda90")
      public
          fun internalAccessConfiguration(internalAccessConfiguration: InternalAccessConfigurationProperty.Builder.() -> Unit)

      /**
       * @param unusedAccessConfiguration Specifies the configuration of an unused access analyzer
       * for an AWS organization or account.
       */
      public fun unusedAccessConfiguration(unusedAccessConfiguration: IResolvable)

      /**
       * @param unusedAccessConfiguration Specifies the configuration of an unused access analyzer
       * for an AWS organization or account.
       */
      public
          fun unusedAccessConfiguration(unusedAccessConfiguration: UnusedAccessConfigurationProperty)

      /**
       * @param unusedAccessConfiguration Specifies the configuration of an unused access analyzer
       * for an AWS organization or account.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("63ab8f673dc332d9b0d20c53140bcf87473a0e8d671b6890e885eeb33b85cc81")
      public
          fun unusedAccessConfiguration(unusedAccessConfiguration: UnusedAccessConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.accessanalyzer.CfnAnalyzer.AnalyzerConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.accessanalyzer.CfnAnalyzer.AnalyzerConfigurationProperty.builder()

      /**
       * @param internalAccessConfiguration Specifies the configuration of an internal access
       * analyzer for an AWS organization or account.
       * This configuration determines how the analyzer evaluates access within your AWS
       * environment.
       */
      override fun internalAccessConfiguration(internalAccessConfiguration: IResolvable) {
        cdkBuilder.internalAccessConfiguration(internalAccessConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param internalAccessConfiguration Specifies the configuration of an internal access
       * analyzer for an AWS organization or account.
       * This configuration determines how the analyzer evaluates access within your AWS
       * environment.
       */
      override
          fun internalAccessConfiguration(internalAccessConfiguration: InternalAccessConfigurationProperty) {
        cdkBuilder.internalAccessConfiguration(internalAccessConfiguration.let(InternalAccessConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param internalAccessConfiguration Specifies the configuration of an internal access
       * analyzer for an AWS organization or account.
       * This configuration determines how the analyzer evaluates access within your AWS
       * environment.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8cc145c26da8304cda8cffafa8bbb7bcd26ae82bf46a77fde334f099939dda90")
      override
          fun internalAccessConfiguration(internalAccessConfiguration: InternalAccessConfigurationProperty.Builder.() -> Unit):
          Unit =
          internalAccessConfiguration(InternalAccessConfigurationProperty(internalAccessConfiguration))

      /**
       * @param unusedAccessConfiguration Specifies the configuration of an unused access analyzer
       * for an AWS organization or account.
       */
      override fun unusedAccessConfiguration(unusedAccessConfiguration: IResolvable) {
        cdkBuilder.unusedAccessConfiguration(unusedAccessConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param unusedAccessConfiguration Specifies the configuration of an unused access analyzer
       * for an AWS organization or account.
       */
      override
          fun unusedAccessConfiguration(unusedAccessConfiguration: UnusedAccessConfigurationProperty) {
        cdkBuilder.unusedAccessConfiguration(unusedAccessConfiguration.let(UnusedAccessConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param unusedAccessConfiguration Specifies the configuration of an unused access analyzer
       * for an AWS organization or account.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("63ab8f673dc332d9b0d20c53140bcf87473a0e8d671b6890e885eeb33b85cc81")
      override
          fun unusedAccessConfiguration(unusedAccessConfiguration: UnusedAccessConfigurationProperty.Builder.() -> Unit):
          Unit =
          unusedAccessConfiguration(UnusedAccessConfigurationProperty(unusedAccessConfiguration))

      public fun build():
          software.amazon.awscdk.services.accessanalyzer.CfnAnalyzer.AnalyzerConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.accessanalyzer.CfnAnalyzer.AnalyzerConfigurationProperty,
    ) : CdkObject(cdkObject),
        AnalyzerConfigurationProperty {
      /**
       * Specifies the configuration of an internal access analyzer for an AWS organization or
       * account.
       *
       * This configuration determines how the analyzer evaluates access within your AWS
       * environment.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-accessanalyzer-analyzer-analyzerconfiguration.html#cfn-accessanalyzer-analyzer-analyzerconfiguration-internalaccessconfiguration)
       */
      override fun internalAccessConfiguration(): Any? =
          unwrap(this).getInternalAccessConfiguration()

      /**
       * Specifies the configuration of an unused access analyzer for an AWS organization or
       * account.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-accessanalyzer-analyzer-analyzerconfiguration.html#cfn-accessanalyzer-analyzer-analyzerconfiguration-unusedaccessconfiguration)
       */
      override fun unusedAccessConfiguration(): Any? = unwrap(this).getUnusedAccessConfiguration()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AnalyzerConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.accessanalyzer.CfnAnalyzer.AnalyzerConfigurationProperty):
          AnalyzerConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AnalyzerConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AnalyzerConfigurationProperty):
          software.amazon.awscdk.services.accessanalyzer.CfnAnalyzer.AnalyzerConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.accessanalyzer.CfnAnalyzer.AnalyzerConfigurationProperty
    }
  }

  /**
   * Contains information about an archive rule.
   *
   * Archive rules automatically archive new findings that meet the criteria you define when you
   * create the rule.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.accessanalyzer.*;
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
  public interface ArchiveRuleProperty {
    /**
     * The criteria for the rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-accessanalyzer-analyzer-archiverule.html#cfn-accessanalyzer-analyzer-archiverule-filter)
     */
    public fun filter(): Any

    /**
     * The name of the rule to create.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-accessanalyzer-analyzer-archiverule.html#cfn-accessanalyzer-analyzer-archiverule-rulename)
     */
    public fun ruleName(): String

    /**
     * A builder for [ArchiveRuleProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param filter The criteria for the rule. 
       */
      public fun filter(filter: IResolvable)

      /**
       * @param filter The criteria for the rule. 
       */
      public fun filter(filter: List<Any>)

      /**
       * @param filter The criteria for the rule. 
       */
      public fun filter(vararg filter: Any)

      /**
       * @param ruleName The name of the rule to create. 
       */
      public fun ruleName(ruleName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.accessanalyzer.CfnAnalyzer.ArchiveRuleProperty.Builder =
          software.amazon.awscdk.services.accessanalyzer.CfnAnalyzer.ArchiveRuleProperty.builder()

      /**
       * @param filter The criteria for the rule. 
       */
      override fun filter(filter: IResolvable) {
        cdkBuilder.filter(filter.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param filter The criteria for the rule. 
       */
      override fun filter(filter: List<Any>) {
        cdkBuilder.filter(filter.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param filter The criteria for the rule. 
       */
      override fun filter(vararg filter: Any): Unit = filter(filter.toList())

      /**
       * @param ruleName The name of the rule to create. 
       */
      override fun ruleName(ruleName: String) {
        cdkBuilder.ruleName(ruleName)
      }

      public fun build():
          software.amazon.awscdk.services.accessanalyzer.CfnAnalyzer.ArchiveRuleProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.accessanalyzer.CfnAnalyzer.ArchiveRuleProperty,
    ) : CdkObject(cdkObject),
        ArchiveRuleProperty {
      /**
       * The criteria for the rule.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-accessanalyzer-analyzer-archiverule.html#cfn-accessanalyzer-analyzer-archiverule-filter)
       */
      override fun filter(): Any = unwrap(this).getFilter()

      /**
       * The name of the rule to create.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-accessanalyzer-analyzer-archiverule.html#cfn-accessanalyzer-analyzer-archiverule-rulename)
       */
      override fun ruleName(): String = unwrap(this).getRuleName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ArchiveRuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.accessanalyzer.CfnAnalyzer.ArchiveRuleProperty):
          ArchiveRuleProperty = CdkObjectWrappers.wrap(cdkObject) as? ArchiveRuleProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ArchiveRuleProperty):
          software.amazon.awscdk.services.accessanalyzer.CfnAnalyzer.ArchiveRuleProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.accessanalyzer.CfnAnalyzer.ArchiveRuleProperty
    }
  }

  /**
   * The criteria that defines the archive rule.
   *
   * To learn about filter keys that you can use to create an archive rule, see [filter
   * keys](https://docs.aws.amazon.com/IAM/latest/UserGuide/access-analyzer-reference-filter-keys.html)
   * in the *User Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.accessanalyzer.*;
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
  public interface FilterProperty {
    /**
     * A "contains" condition to match for the rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-accessanalyzer-analyzer-filter.html#cfn-accessanalyzer-analyzer-filter-contains)
     */
    public fun contains(): List<String> = unwrap(this).getContains() ?: emptyList()

    /**
     * An "equals" condition to match for the rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-accessanalyzer-analyzer-filter.html#cfn-accessanalyzer-analyzer-filter-eq)
     */
    public fun eq(): List<String> = unwrap(this).getEq() ?: emptyList()

    /**
     * An "exists" condition to match for the rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-accessanalyzer-analyzer-filter.html#cfn-accessanalyzer-analyzer-filter-exists)
     */
    public fun exists(): Any? = unwrap(this).getExists()

    /**
     * A "not equal" condition to match for the rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-accessanalyzer-analyzer-filter.html#cfn-accessanalyzer-analyzer-filter-neq)
     */
    public fun neq(): List<String> = unwrap(this).getNeq() ?: emptyList()

    /**
     * The property used to define the criteria in the filter for the rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-accessanalyzer-analyzer-filter.html#cfn-accessanalyzer-analyzer-filter-property)
     */
    public fun `property`(): String

    /**
     * A builder for [FilterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param contains A "contains" condition to match for the rule.
       */
      public fun contains(contains: List<String>)

      /**
       * @param contains A "contains" condition to match for the rule.
       */
      public fun contains(vararg contains: String)

      /**
       * @param eq An "equals" condition to match for the rule.
       */
      public fun eq(eq: List<String>)

      /**
       * @param eq An "equals" condition to match for the rule.
       */
      public fun eq(vararg eq: String)

      /**
       * @param exists An "exists" condition to match for the rule.
       */
      public fun exists(exists: Boolean)

      /**
       * @param exists An "exists" condition to match for the rule.
       */
      public fun exists(exists: IResolvable)

      /**
       * @param neq A "not equal" condition to match for the rule.
       */
      public fun neq(neq: List<String>)

      /**
       * @param neq A "not equal" condition to match for the rule.
       */
      public fun neq(vararg neq: String)

      /**
       * @param property The property used to define the criteria in the filter for the rule. 
       */
      public fun `property`(`property`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.accessanalyzer.CfnAnalyzer.FilterProperty.Builder =
          software.amazon.awscdk.services.accessanalyzer.CfnAnalyzer.FilterProperty.builder()

      /**
       * @param contains A "contains" condition to match for the rule.
       */
      override fun contains(contains: List<String>) {
        cdkBuilder.contains(contains)
      }

      /**
       * @param contains A "contains" condition to match for the rule.
       */
      override fun contains(vararg contains: String): Unit = contains(contains.toList())

      /**
       * @param eq An "equals" condition to match for the rule.
       */
      override fun eq(eq: List<String>) {
        cdkBuilder.eq(eq)
      }

      /**
       * @param eq An "equals" condition to match for the rule.
       */
      override fun eq(vararg eq: String): Unit = eq(eq.toList())

      /**
       * @param exists An "exists" condition to match for the rule.
       */
      override fun exists(exists: Boolean) {
        cdkBuilder.exists(exists)
      }

      /**
       * @param exists An "exists" condition to match for the rule.
       */
      override fun exists(exists: IResolvable) {
        cdkBuilder.exists(exists.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param neq A "not equal" condition to match for the rule.
       */
      override fun neq(neq: List<String>) {
        cdkBuilder.neq(neq)
      }

      /**
       * @param neq A "not equal" condition to match for the rule.
       */
      override fun neq(vararg neq: String): Unit = neq(neq.toList())

      /**
       * @param property The property used to define the criteria in the filter for the rule. 
       */
      override fun `property`(`property`: String) {
        cdkBuilder.`property`(`property`)
      }

      public fun build(): software.amazon.awscdk.services.accessanalyzer.CfnAnalyzer.FilterProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.accessanalyzer.CfnAnalyzer.FilterProperty,
    ) : CdkObject(cdkObject),
        FilterProperty {
      /**
       * A "contains" condition to match for the rule.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-accessanalyzer-analyzer-filter.html#cfn-accessanalyzer-analyzer-filter-contains)
       */
      override fun contains(): List<String> = unwrap(this).getContains() ?: emptyList()

      /**
       * An "equals" condition to match for the rule.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-accessanalyzer-analyzer-filter.html#cfn-accessanalyzer-analyzer-filter-eq)
       */
      override fun eq(): List<String> = unwrap(this).getEq() ?: emptyList()

      /**
       * An "exists" condition to match for the rule.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-accessanalyzer-analyzer-filter.html#cfn-accessanalyzer-analyzer-filter-exists)
       */
      override fun exists(): Any? = unwrap(this).getExists()

      /**
       * A "not equal" condition to match for the rule.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-accessanalyzer-analyzer-filter.html#cfn-accessanalyzer-analyzer-filter-neq)
       */
      override fun neq(): List<String> = unwrap(this).getNeq() ?: emptyList()

      /**
       * The property used to define the criteria in the filter for the rule.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-accessanalyzer-analyzer-filter.html#cfn-accessanalyzer-analyzer-filter-property)
       */
      override fun `property`(): String = unwrap(this).getProperty()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.accessanalyzer.CfnAnalyzer.FilterProperty):
          FilterProperty = CdkObjectWrappers.wrap(cdkObject) as? FilterProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: FilterProperty):
          software.amazon.awscdk.services.accessanalyzer.CfnAnalyzer.FilterProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.accessanalyzer.CfnAnalyzer.FilterProperty
    }
  }

  /**
   * The criteria for an analysis rule for an internal access analyzer.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.accessanalyzer.*;
   * InternalAccessAnalysisRuleCriteriaProperty internalAccessAnalysisRuleCriteriaProperty =
   * InternalAccessAnalysisRuleCriteriaProperty.builder()
   * .accountIds(List.of("accountIds"))
   * .resourceArns(List.of("resourceArns"))
   * .resourceTypes(List.of("resourceTypes"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-accessanalyzer-analyzer-internalaccessanalysisrulecriteria.html)
   */
  public interface InternalAccessAnalysisRuleCriteriaProperty {
    /**
     * A list of AWS account IDs to apply to the internal access analysis rule criteria.
     *
     * Account IDs can only be applied to the analysis rule criteria for organization-level
     * analyzers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-accessanalyzer-analyzer-internalaccessanalysisrulecriteria.html#cfn-accessanalyzer-analyzer-internalaccessanalysisrulecriteria-accountids)
     */
    public fun accountIds(): List<String> = unwrap(this).getAccountIds() ?: emptyList()

    /**
     * A list of resource ARNs to apply to the internal access analysis rule criteria.
     *
     * The analyzer will only generate findings for resources that match these ARNs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-accessanalyzer-analyzer-internalaccessanalysisrulecriteria.html#cfn-accessanalyzer-analyzer-internalaccessanalysisrulecriteria-resourcearns)
     */
    public fun resourceArns(): List<String> = unwrap(this).getResourceArns() ?: emptyList()

    /**
     * A list of resource types to apply to the internal access analysis rule criteria.
     *
     * The analyzer will only generate findings for resources of these types. These resource types
     * are currently supported for internal access analyzers:
     *
     * * `AWS::S3::Bucket`
     * * `AWS::RDS::DBSnapshot`
     * * `AWS::RDS::DBClusterSnapshot`
     * * `AWS::S3Express::DirectoryBucket`
     * * `AWS::DynamoDB::Table`
     * * `AWS::DynamoDB::Stream`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-accessanalyzer-analyzer-internalaccessanalysisrulecriteria.html#cfn-accessanalyzer-analyzer-internalaccessanalysisrulecriteria-resourcetypes)
     */
    public fun resourceTypes(): List<String> = unwrap(this).getResourceTypes() ?: emptyList()

    /**
     * A builder for [InternalAccessAnalysisRuleCriteriaProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param accountIds A list of AWS account IDs to apply to the internal access analysis rule
       * criteria.
       * Account IDs can only be applied to the analysis rule criteria for organization-level
       * analyzers.
       */
      public fun accountIds(accountIds: List<String>)

      /**
       * @param accountIds A list of AWS account IDs to apply to the internal access analysis rule
       * criteria.
       * Account IDs can only be applied to the analysis rule criteria for organization-level
       * analyzers.
       */
      public fun accountIds(vararg accountIds: String)

      /**
       * @param resourceArns A list of resource ARNs to apply to the internal access analysis rule
       * criteria.
       * The analyzer will only generate findings for resources that match these ARNs.
       */
      public fun resourceArns(resourceArns: List<String>)

      /**
       * @param resourceArns A list of resource ARNs to apply to the internal access analysis rule
       * criteria.
       * The analyzer will only generate findings for resources that match these ARNs.
       */
      public fun resourceArns(vararg resourceArns: String)

      /**
       * @param resourceTypes A list of resource types to apply to the internal access analysis rule
       * criteria.
       * The analyzer will only generate findings for resources of these types. These resource types
       * are currently supported for internal access analyzers:
       *
       * * `AWS::S3::Bucket`
       * * `AWS::RDS::DBSnapshot`
       * * `AWS::RDS::DBClusterSnapshot`
       * * `AWS::S3Express::DirectoryBucket`
       * * `AWS::DynamoDB::Table`
       * * `AWS::DynamoDB::Stream`
       */
      public fun resourceTypes(resourceTypes: List<String>)

      /**
       * @param resourceTypes A list of resource types to apply to the internal access analysis rule
       * criteria.
       * The analyzer will only generate findings for resources of these types. These resource types
       * are currently supported for internal access analyzers:
       *
       * * `AWS::S3::Bucket`
       * * `AWS::RDS::DBSnapshot`
       * * `AWS::RDS::DBClusterSnapshot`
       * * `AWS::S3Express::DirectoryBucket`
       * * `AWS::DynamoDB::Table`
       * * `AWS::DynamoDB::Stream`
       */
      public fun resourceTypes(vararg resourceTypes: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.accessanalyzer.CfnAnalyzer.InternalAccessAnalysisRuleCriteriaProperty.Builder
          =
          software.amazon.awscdk.services.accessanalyzer.CfnAnalyzer.InternalAccessAnalysisRuleCriteriaProperty.builder()

      /**
       * @param accountIds A list of AWS account IDs to apply to the internal access analysis rule
       * criteria.
       * Account IDs can only be applied to the analysis rule criteria for organization-level
       * analyzers.
       */
      override fun accountIds(accountIds: List<String>) {
        cdkBuilder.accountIds(accountIds)
      }

      /**
       * @param accountIds A list of AWS account IDs to apply to the internal access analysis rule
       * criteria.
       * Account IDs can only be applied to the analysis rule criteria for organization-level
       * analyzers.
       */
      override fun accountIds(vararg accountIds: String): Unit = accountIds(accountIds.toList())

      /**
       * @param resourceArns A list of resource ARNs to apply to the internal access analysis rule
       * criteria.
       * The analyzer will only generate findings for resources that match these ARNs.
       */
      override fun resourceArns(resourceArns: List<String>) {
        cdkBuilder.resourceArns(resourceArns)
      }

      /**
       * @param resourceArns A list of resource ARNs to apply to the internal access analysis rule
       * criteria.
       * The analyzer will only generate findings for resources that match these ARNs.
       */
      override fun resourceArns(vararg resourceArns: String): Unit =
          resourceArns(resourceArns.toList())

      /**
       * @param resourceTypes A list of resource types to apply to the internal access analysis rule
       * criteria.
       * The analyzer will only generate findings for resources of these types. These resource types
       * are currently supported for internal access analyzers:
       *
       * * `AWS::S3::Bucket`
       * * `AWS::RDS::DBSnapshot`
       * * `AWS::RDS::DBClusterSnapshot`
       * * `AWS::S3Express::DirectoryBucket`
       * * `AWS::DynamoDB::Table`
       * * `AWS::DynamoDB::Stream`
       */
      override fun resourceTypes(resourceTypes: List<String>) {
        cdkBuilder.resourceTypes(resourceTypes)
      }

      /**
       * @param resourceTypes A list of resource types to apply to the internal access analysis rule
       * criteria.
       * The analyzer will only generate findings for resources of these types. These resource types
       * are currently supported for internal access analyzers:
       *
       * * `AWS::S3::Bucket`
       * * `AWS::RDS::DBSnapshot`
       * * `AWS::RDS::DBClusterSnapshot`
       * * `AWS::S3Express::DirectoryBucket`
       * * `AWS::DynamoDB::Table`
       * * `AWS::DynamoDB::Stream`
       */
      override fun resourceTypes(vararg resourceTypes: String): Unit =
          resourceTypes(resourceTypes.toList())

      public fun build():
          software.amazon.awscdk.services.accessanalyzer.CfnAnalyzer.InternalAccessAnalysisRuleCriteriaProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.accessanalyzer.CfnAnalyzer.InternalAccessAnalysisRuleCriteriaProperty,
    ) : CdkObject(cdkObject),
        InternalAccessAnalysisRuleCriteriaProperty {
      /**
       * A list of AWS account IDs to apply to the internal access analysis rule criteria.
       *
       * Account IDs can only be applied to the analysis rule criteria for organization-level
       * analyzers.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-accessanalyzer-analyzer-internalaccessanalysisrulecriteria.html#cfn-accessanalyzer-analyzer-internalaccessanalysisrulecriteria-accountids)
       */
      override fun accountIds(): List<String> = unwrap(this).getAccountIds() ?: emptyList()

      /**
       * A list of resource ARNs to apply to the internal access analysis rule criteria.
       *
       * The analyzer will only generate findings for resources that match these ARNs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-accessanalyzer-analyzer-internalaccessanalysisrulecriteria.html#cfn-accessanalyzer-analyzer-internalaccessanalysisrulecriteria-resourcearns)
       */
      override fun resourceArns(): List<String> = unwrap(this).getResourceArns() ?: emptyList()

      /**
       * A list of resource types to apply to the internal access analysis rule criteria.
       *
       * The analyzer will only generate findings for resources of these types. These resource types
       * are currently supported for internal access analyzers:
       *
       * * `AWS::S3::Bucket`
       * * `AWS::RDS::DBSnapshot`
       * * `AWS::RDS::DBClusterSnapshot`
       * * `AWS::S3Express::DirectoryBucket`
       * * `AWS::DynamoDB::Table`
       * * `AWS::DynamoDB::Stream`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-accessanalyzer-analyzer-internalaccessanalysisrulecriteria.html#cfn-accessanalyzer-analyzer-internalaccessanalysisrulecriteria-resourcetypes)
       */
      override fun resourceTypes(): List<String> = unwrap(this).getResourceTypes() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          InternalAccessAnalysisRuleCriteriaProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.accessanalyzer.CfnAnalyzer.InternalAccessAnalysisRuleCriteriaProperty):
          InternalAccessAnalysisRuleCriteriaProperty = CdkObjectWrappers.wrap(cdkObject) as?
          InternalAccessAnalysisRuleCriteriaProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: InternalAccessAnalysisRuleCriteriaProperty):
          software.amazon.awscdk.services.accessanalyzer.CfnAnalyzer.InternalAccessAnalysisRuleCriteriaProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.accessanalyzer.CfnAnalyzer.InternalAccessAnalysisRuleCriteriaProperty
    }
  }

  /**
   * Contains information about analysis rules for the internal access analyzer.
   *
   * Analysis rules determine which entities will generate findings based on the criteria you define
   * when you create the rule.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.accessanalyzer.*;
   * InternalAccessAnalysisRuleProperty internalAccessAnalysisRuleProperty =
   * InternalAccessAnalysisRuleProperty.builder()
   * .inclusions(List.of(InternalAccessAnalysisRuleCriteriaProperty.builder()
   * .accountIds(List.of("accountIds"))
   * .resourceArns(List.of("resourceArns"))
   * .resourceTypes(List.of("resourceTypes"))
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-accessanalyzer-analyzer-internalaccessanalysisrule.html)
   */
  public interface InternalAccessAnalysisRuleProperty {
    /**
     * A list of rules for the internal access analyzer containing criteria to include in analysis.
     *
     * Only resources that meet the rule criteria will generate findings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-accessanalyzer-analyzer-internalaccessanalysisrule.html#cfn-accessanalyzer-analyzer-internalaccessanalysisrule-inclusions)
     */
    public fun inclusions(): Any? = unwrap(this).getInclusions()

    /**
     * A builder for [InternalAccessAnalysisRuleProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param inclusions A list of rules for the internal access analyzer containing criteria to
       * include in analysis.
       * Only resources that meet the rule criteria will generate findings.
       */
      public fun inclusions(inclusions: IResolvable)

      /**
       * @param inclusions A list of rules for the internal access analyzer containing criteria to
       * include in analysis.
       * Only resources that meet the rule criteria will generate findings.
       */
      public fun inclusions(inclusions: List<Any>)

      /**
       * @param inclusions A list of rules for the internal access analyzer containing criteria to
       * include in analysis.
       * Only resources that meet the rule criteria will generate findings.
       */
      public fun inclusions(vararg inclusions: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.accessanalyzer.CfnAnalyzer.InternalAccessAnalysisRuleProperty.Builder
          =
          software.amazon.awscdk.services.accessanalyzer.CfnAnalyzer.InternalAccessAnalysisRuleProperty.builder()

      /**
       * @param inclusions A list of rules for the internal access analyzer containing criteria to
       * include in analysis.
       * Only resources that meet the rule criteria will generate findings.
       */
      override fun inclusions(inclusions: IResolvable) {
        cdkBuilder.inclusions(inclusions.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param inclusions A list of rules for the internal access analyzer containing criteria to
       * include in analysis.
       * Only resources that meet the rule criteria will generate findings.
       */
      override fun inclusions(inclusions: List<Any>) {
        cdkBuilder.inclusions(inclusions.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param inclusions A list of rules for the internal access analyzer containing criteria to
       * include in analysis.
       * Only resources that meet the rule criteria will generate findings.
       */
      override fun inclusions(vararg inclusions: Any): Unit = inclusions(inclusions.toList())

      public fun build():
          software.amazon.awscdk.services.accessanalyzer.CfnAnalyzer.InternalAccessAnalysisRuleProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.accessanalyzer.CfnAnalyzer.InternalAccessAnalysisRuleProperty,
    ) : CdkObject(cdkObject),
        InternalAccessAnalysisRuleProperty {
      /**
       * A list of rules for the internal access analyzer containing criteria to include in
       * analysis.
       *
       * Only resources that meet the rule criteria will generate findings.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-accessanalyzer-analyzer-internalaccessanalysisrule.html#cfn-accessanalyzer-analyzer-internalaccessanalysisrule-inclusions)
       */
      override fun inclusions(): Any? = unwrap(this).getInclusions()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          InternalAccessAnalysisRuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.accessanalyzer.CfnAnalyzer.InternalAccessAnalysisRuleProperty):
          InternalAccessAnalysisRuleProperty = CdkObjectWrappers.wrap(cdkObject) as?
          InternalAccessAnalysisRuleProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: InternalAccessAnalysisRuleProperty):
          software.amazon.awscdk.services.accessanalyzer.CfnAnalyzer.InternalAccessAnalysisRuleProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.accessanalyzer.CfnAnalyzer.InternalAccessAnalysisRuleProperty
    }
  }

  /**
   * Specifies the configuration of an internal access analyzer for an AWS organization or account.
   *
   * This configuration determines how the analyzer evaluates internal access within your AWS
   * environment.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.accessanalyzer.*;
   * InternalAccessConfigurationProperty internalAccessConfigurationProperty =
   * InternalAccessConfigurationProperty.builder()
   * .internalAccessAnalysisRule(InternalAccessAnalysisRuleProperty.builder()
   * .inclusions(List.of(InternalAccessAnalysisRuleCriteriaProperty.builder()
   * .accountIds(List.of("accountIds"))
   * .resourceArns(List.of("resourceArns"))
   * .resourceTypes(List.of("resourceTypes"))
   * .build()))
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-accessanalyzer-analyzer-internalaccessconfiguration.html)
   */
  public interface InternalAccessConfigurationProperty {
    /**
     * Contains information about analysis rules for the internal access analyzer.
     *
     * These rules determine which resources and access patterns will be analyzed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-accessanalyzer-analyzer-internalaccessconfiguration.html#cfn-accessanalyzer-analyzer-internalaccessconfiguration-internalaccessanalysisrule)
     */
    public fun internalAccessAnalysisRule(): Any? = unwrap(this).getInternalAccessAnalysisRule()

    /**
     * A builder for [InternalAccessConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param internalAccessAnalysisRule Contains information about analysis rules for the
       * internal access analyzer.
       * These rules determine which resources and access patterns will be analyzed.
       */
      public fun internalAccessAnalysisRule(internalAccessAnalysisRule: IResolvable)

      /**
       * @param internalAccessAnalysisRule Contains information about analysis rules for the
       * internal access analyzer.
       * These rules determine which resources and access patterns will be analyzed.
       */
      public
          fun internalAccessAnalysisRule(internalAccessAnalysisRule: InternalAccessAnalysisRuleProperty)

      /**
       * @param internalAccessAnalysisRule Contains information about analysis rules for the
       * internal access analyzer.
       * These rules determine which resources and access patterns will be analyzed.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6d8a68552294bf0af8221c44be5d223425befc8c9d4059c220d475e96b1da097")
      public
          fun internalAccessAnalysisRule(internalAccessAnalysisRule: InternalAccessAnalysisRuleProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.accessanalyzer.CfnAnalyzer.InternalAccessConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.accessanalyzer.CfnAnalyzer.InternalAccessConfigurationProperty.builder()

      /**
       * @param internalAccessAnalysisRule Contains information about analysis rules for the
       * internal access analyzer.
       * These rules determine which resources and access patterns will be analyzed.
       */
      override fun internalAccessAnalysisRule(internalAccessAnalysisRule: IResolvable) {
        cdkBuilder.internalAccessAnalysisRule(internalAccessAnalysisRule.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param internalAccessAnalysisRule Contains information about analysis rules for the
       * internal access analyzer.
       * These rules determine which resources and access patterns will be analyzed.
       */
      override
          fun internalAccessAnalysisRule(internalAccessAnalysisRule: InternalAccessAnalysisRuleProperty) {
        cdkBuilder.internalAccessAnalysisRule(internalAccessAnalysisRule.let(InternalAccessAnalysisRuleProperty.Companion::unwrap))
      }

      /**
       * @param internalAccessAnalysisRule Contains information about analysis rules for the
       * internal access analyzer.
       * These rules determine which resources and access patterns will be analyzed.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6d8a68552294bf0af8221c44be5d223425befc8c9d4059c220d475e96b1da097")
      override
          fun internalAccessAnalysisRule(internalAccessAnalysisRule: InternalAccessAnalysisRuleProperty.Builder.() -> Unit):
          Unit =
          internalAccessAnalysisRule(InternalAccessAnalysisRuleProperty(internalAccessAnalysisRule))

      public fun build():
          software.amazon.awscdk.services.accessanalyzer.CfnAnalyzer.InternalAccessConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.accessanalyzer.CfnAnalyzer.InternalAccessConfigurationProperty,
    ) : CdkObject(cdkObject),
        InternalAccessConfigurationProperty {
      /**
       * Contains information about analysis rules for the internal access analyzer.
       *
       * These rules determine which resources and access patterns will be analyzed.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-accessanalyzer-analyzer-internalaccessconfiguration.html#cfn-accessanalyzer-analyzer-internalaccessconfiguration-internalaccessanalysisrule)
       */
      override fun internalAccessAnalysisRule(): Any? = unwrap(this).getInternalAccessAnalysisRule()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          InternalAccessConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.accessanalyzer.CfnAnalyzer.InternalAccessConfigurationProperty):
          InternalAccessConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          InternalAccessConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: InternalAccessConfigurationProperty):
          software.amazon.awscdk.services.accessanalyzer.CfnAnalyzer.InternalAccessConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.accessanalyzer.CfnAnalyzer.InternalAccessConfigurationProperty
    }
  }

  /**
   * Contains information about an unused access analyzer.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.accessanalyzer.*;
   * UnusedAccessConfigurationProperty unusedAccessConfigurationProperty =
   * UnusedAccessConfigurationProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-accessanalyzer-analyzer-unusedaccessconfiguration.html)
   */
  public interface UnusedAccessConfigurationProperty {
    /**
     * Contains information about analysis rules for the analyzer.
     *
     * Analysis rules determine which entities will generate findings based on the criteria you
     * define when you create the rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-accessanalyzer-analyzer-unusedaccessconfiguration.html#cfn-accessanalyzer-analyzer-unusedaccessconfiguration-analysisrule)
     */
    public fun analysisRule(): Any? = unwrap(this).getAnalysisRule()

    /**
     * The specified access age in days for which to generate findings for unused access.
     *
     * For example, if you specify 90 days, the analyzer will generate findings for IAM entities
     * within the accounts of the selected organization for any access that hasn't been used in 90 or
     * more days since the analyzer's last scan. You can choose a value between 1 and 365 days.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-accessanalyzer-analyzer-unusedaccessconfiguration.html#cfn-accessanalyzer-analyzer-unusedaccessconfiguration-unusedaccessage)
     */
    public fun unusedAccessAge(): Number? = unwrap(this).getUnusedAccessAge()

    /**
     * A builder for [UnusedAccessConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param analysisRule Contains information about analysis rules for the analyzer.
       * Analysis rules determine which entities will generate findings based on the criteria you
       * define when you create the rule.
       */
      public fun analysisRule(analysisRule: IResolvable)

      /**
       * @param analysisRule Contains information about analysis rules for the analyzer.
       * Analysis rules determine which entities will generate findings based on the criteria you
       * define when you create the rule.
       */
      public fun analysisRule(analysisRule: AnalysisRuleProperty)

      /**
       * @param analysisRule Contains information about analysis rules for the analyzer.
       * Analysis rules determine which entities will generate findings based on the criteria you
       * define when you create the rule.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f1df882813b57a10a69199200f7a6d1c602b657341cd9299f41a1dd2e718e3c9")
      public fun analysisRule(analysisRule: AnalysisRuleProperty.Builder.() -> Unit)

      /**
       * @param unusedAccessAge The specified access age in days for which to generate findings for
       * unused access.
       * For example, if you specify 90 days, the analyzer will generate findings for IAM entities
       * within the accounts of the selected organization for any access that hasn't been used in 90 or
       * more days since the analyzer's last scan. You can choose a value between 1 and 365 days.
       */
      public fun unusedAccessAge(unusedAccessAge: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.accessanalyzer.CfnAnalyzer.UnusedAccessConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.accessanalyzer.CfnAnalyzer.UnusedAccessConfigurationProperty.builder()

      /**
       * @param analysisRule Contains information about analysis rules for the analyzer.
       * Analysis rules determine which entities will generate findings based on the criteria you
       * define when you create the rule.
       */
      override fun analysisRule(analysisRule: IResolvable) {
        cdkBuilder.analysisRule(analysisRule.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param analysisRule Contains information about analysis rules for the analyzer.
       * Analysis rules determine which entities will generate findings based on the criteria you
       * define when you create the rule.
       */
      override fun analysisRule(analysisRule: AnalysisRuleProperty) {
        cdkBuilder.analysisRule(analysisRule.let(AnalysisRuleProperty.Companion::unwrap))
      }

      /**
       * @param analysisRule Contains information about analysis rules for the analyzer.
       * Analysis rules determine which entities will generate findings based on the criteria you
       * define when you create the rule.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f1df882813b57a10a69199200f7a6d1c602b657341cd9299f41a1dd2e718e3c9")
      override fun analysisRule(analysisRule: AnalysisRuleProperty.Builder.() -> Unit): Unit =
          analysisRule(AnalysisRuleProperty(analysisRule))

      /**
       * @param unusedAccessAge The specified access age in days for which to generate findings for
       * unused access.
       * For example, if you specify 90 days, the analyzer will generate findings for IAM entities
       * within the accounts of the selected organization for any access that hasn't been used in 90 or
       * more days since the analyzer's last scan. You can choose a value between 1 and 365 days.
       */
      override fun unusedAccessAge(unusedAccessAge: Number) {
        cdkBuilder.unusedAccessAge(unusedAccessAge)
      }

      public fun build():
          software.amazon.awscdk.services.accessanalyzer.CfnAnalyzer.UnusedAccessConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.accessanalyzer.CfnAnalyzer.UnusedAccessConfigurationProperty,
    ) : CdkObject(cdkObject),
        UnusedAccessConfigurationProperty {
      /**
       * Contains information about analysis rules for the analyzer.
       *
       * Analysis rules determine which entities will generate findings based on the criteria you
       * define when you create the rule.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-accessanalyzer-analyzer-unusedaccessconfiguration.html#cfn-accessanalyzer-analyzer-unusedaccessconfiguration-analysisrule)
       */
      override fun analysisRule(): Any? = unwrap(this).getAnalysisRule()

      /**
       * The specified access age in days for which to generate findings for unused access.
       *
       * For example, if you specify 90 days, the analyzer will generate findings for IAM entities
       * within the accounts of the selected organization for any access that hasn't been used in 90 or
       * more days since the analyzer's last scan. You can choose a value between 1 and 365 days.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-accessanalyzer-analyzer-unusedaccessconfiguration.html#cfn-accessanalyzer-analyzer-unusedaccessconfiguration-unusedaccessage)
       */
      override fun unusedAccessAge(): Number? = unwrap(this).getUnusedAccessAge()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          UnusedAccessConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.accessanalyzer.CfnAnalyzer.UnusedAccessConfigurationProperty):
          UnusedAccessConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          UnusedAccessConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: UnusedAccessConfigurationProperty):
          software.amazon.awscdk.services.accessanalyzer.CfnAnalyzer.UnusedAccessConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.accessanalyzer.CfnAnalyzer.UnusedAccessConfigurationProperty
    }
  }
}
