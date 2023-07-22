@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.glue

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.glue.CfnDataQualityRuleset
import software.constructs.Construct

@CdkDslMarker
public class CfnDataQualityRulesetDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnDataQualityRuleset.Builder =
      CfnDataQualityRuleset.Builder.create(scope, id)

  /**
   * Used for idempotency and is recommended to be set to a random ID (such as a UUID) to avoid
   * creating or starting multiple instances of the same resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-dataqualityruleset.html#cfn-glue-dataqualityruleset-clienttoken)
   * @param clientToken Used for idempotency and is recommended to be set to a random ID (such as a
   * UUID) to avoid creating or starting multiple instances of the same resource. 
   */
  public fun clientToken(clientToken: String) {
    cdkBuilder.clientToken(clientToken)
  }

  /**
   * A description of the data quality ruleset.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-dataqualityruleset.html#cfn-glue-dataqualityruleset-description)
   * @param description A description of the data quality ruleset. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * The name of the data quality ruleset.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-dataqualityruleset.html#cfn-glue-dataqualityruleset-name)
   * @param name The name of the data quality ruleset. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * A Data Quality Definition Language (DQDL) ruleset.
   *
   * For more information see the AWS Glue Developer Guide.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-dataqualityruleset.html#cfn-glue-dataqualityruleset-ruleset)
   * @param ruleset A Data Quality Definition Language (DQDL) ruleset. 
   */
  public fun ruleset(ruleset: String) {
    cdkBuilder.ruleset(ruleset)
  }

  /**
   * A list of tags applied to the data quality ruleset.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-dataqualityruleset.html#cfn-glue-dataqualityruleset-tags)
   * @param tags A list of tags applied to the data quality ruleset. 
   */
  public fun tags(tags: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(tags)
    cdkBuilder.tags(builder.map)
  }

  /**
   * A list of tags applied to the data quality ruleset.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-dataqualityruleset.html#cfn-glue-dataqualityruleset-tags)
   * @param tags A list of tags applied to the data quality ruleset. 
   */
  public fun tags(tags: Any) {
    cdkBuilder.tags(tags)
  }

  /**
   * An object representing an AWS Glue table.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-dataqualityruleset.html#cfn-glue-dataqualityruleset-targettable)
   * @param targetTable An object representing an AWS Glue table. 
   */
  public fun targetTable(targetTable: IResolvable) {
    cdkBuilder.targetTable(targetTable)
  }

  /**
   * An object representing an AWS Glue table.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-dataqualityruleset.html#cfn-glue-dataqualityruleset-targettable)
   * @param targetTable An object representing an AWS Glue table. 
   */
  public fun targetTable(targetTable: CfnDataQualityRuleset.DataQualityTargetTableProperty) {
    cdkBuilder.targetTable(targetTable)
  }

  public fun build(): CfnDataQualityRuleset = cdkBuilder.build()
}
