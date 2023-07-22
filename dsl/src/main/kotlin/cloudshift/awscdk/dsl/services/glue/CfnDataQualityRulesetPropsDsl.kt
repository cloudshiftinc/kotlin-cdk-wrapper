@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.glue

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.glue.CfnDataQualityRuleset
import software.amazon.awscdk.services.glue.CfnDataQualityRulesetProps

/**
 * Properties for defining a `CfnDataQualityRuleset`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.glue.*;
 * Object tags;
 * CfnDataQualityRulesetProps cfnDataQualityRulesetProps = CfnDataQualityRulesetProps.builder()
 * .clientToken("clientToken")
 * .description("description")
 * .name("name")
 * .ruleset("ruleset")
 * .tags(tags)
 * .targetTable(DataQualityTargetTableProperty.builder()
 * .databaseName("databaseName")
 * .tableName("tableName")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-dataqualityruleset.html)
 */
@CdkDslMarker
public class CfnDataQualityRulesetPropsDsl {
  private val cdkBuilder: CfnDataQualityRulesetProps.Builder = CfnDataQualityRulesetProps.builder()

  /**
   * @param clientToken Used for idempotency and is recommended to be set to a random ID (such as a
   * UUID) to avoid creating or starting multiple instances of the same resource.
   */
  public fun clientToken(clientToken: String) {
    cdkBuilder.clientToken(clientToken)
  }

  /**
   * @param description A description of the data quality ruleset.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param name The name of the data quality ruleset.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param ruleset A Data Quality Definition Language (DQDL) ruleset.
   * For more information see the AWS Glue Developer Guide.
   */
  public fun ruleset(ruleset: String) {
    cdkBuilder.ruleset(ruleset)
  }

  /**
   * @param tags A list of tags applied to the data quality ruleset.
   */
  public fun tags(tags: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(tags)
    cdkBuilder.tags(builder.map)
  }

  /**
   * @param tags A list of tags applied to the data quality ruleset.
   */
  public fun tags(tags: Any) {
    cdkBuilder.tags(tags)
  }

  /**
   * @param targetTable An object representing an AWS Glue table.
   */
  public fun targetTable(targetTable: IResolvable) {
    cdkBuilder.targetTable(targetTable)
  }

  /**
   * @param targetTable An object representing an AWS Glue table.
   */
  public fun targetTable(targetTable: CfnDataQualityRuleset.DataQualityTargetTableProperty) {
    cdkBuilder.targetTable(targetTable)
  }

  public fun build(): CfnDataQualityRulesetProps = cdkBuilder.build()
}
