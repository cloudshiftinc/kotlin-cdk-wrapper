@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.accessanalyzer

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.accessanalyzer.CfnAnalyzer
import software.constructs.Construct

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
@CdkDslMarker
public class CfnAnalyzerDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnAnalyzer.Builder = CfnAnalyzer.Builder.create(scope, id)

  private val _archiveRules: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * The name of the analyzer.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-accessanalyzer-analyzer.html#cfn-accessanalyzer-analyzer-analyzername)
   * @param analyzerName The name of the analyzer. 
   */
  public fun analyzerName(analyzerName: String) {
    cdkBuilder.analyzerName(analyzerName)
  }

  /**
   * Specifies the archive rules to add for the analyzer.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-accessanalyzer-analyzer.html#cfn-accessanalyzer-analyzer-archiverules)
   * @param archiveRules Specifies the archive rules to add for the analyzer. 
   */
  public fun archiveRules(vararg archiveRules: Any) {
    _archiveRules.addAll(listOf(*archiveRules))
  }

  /**
   * Specifies the archive rules to add for the analyzer.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-accessanalyzer-analyzer.html#cfn-accessanalyzer-analyzer-archiverules)
   * @param archiveRules Specifies the archive rules to add for the analyzer. 
   */
  public fun archiveRules(archiveRules: Collection<Any>) {
    _archiveRules.addAll(archiveRules)
  }

  /**
   * Specifies the archive rules to add for the analyzer.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-accessanalyzer-analyzer.html#cfn-accessanalyzer-analyzer-archiverules)
   * @param archiveRules Specifies the archive rules to add for the analyzer. 
   */
  public fun archiveRules(archiveRules: IResolvable) {
    cdkBuilder.archiveRules(archiveRules)
  }

  /**
   * The tags to apply to the analyzer.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-accessanalyzer-analyzer.html#cfn-accessanalyzer-analyzer-tags)
   * @param tags The tags to apply to the analyzer. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * The tags to apply to the analyzer.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-accessanalyzer-analyzer.html#cfn-accessanalyzer-analyzer-tags)
   * @param tags The tags to apply to the analyzer. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * The type represents the zone of trust for the analyzer.
   *
   * *Allowed Values* : ACCOUNT | ORGANIZATION
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-accessanalyzer-analyzer.html#cfn-accessanalyzer-analyzer-type)
   * @param type The type represents the zone of trust for the analyzer. 
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnAnalyzer {
    if(_archiveRules.isNotEmpty()) cdkBuilder.archiveRules(_archiveRules)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
