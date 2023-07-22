@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.gamelift

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.gamelift.CfnAlias
import software.constructs.Construct

@CdkDslMarker
public class CfnAliasDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnAlias.Builder = CfnAlias.Builder.create(scope, id)

  /**
   * A human-readable description of the alias.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-alias.html#cfn-gamelift-alias-description)
   * @param description A human-readable description of the alias. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * A descriptive label that is associated with an alias.
   *
   * Alias names do not need to be unique.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-alias.html#cfn-gamelift-alias-name)
   * @param name A descriptive label that is associated with an alias. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * The routing configuration, including routing type and fleet target, for the alias.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-alias.html#cfn-gamelift-alias-routingstrategy)
   * @param routingStrategy The routing configuration, including routing type and fleet target, for
   * the alias. 
   */
  public fun routingStrategy(routingStrategy: IResolvable) {
    cdkBuilder.routingStrategy(routingStrategy)
  }

  /**
   * The routing configuration, including routing type and fleet target, for the alias.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-alias.html#cfn-gamelift-alias-routingstrategy)
   * @param routingStrategy The routing configuration, including routing type and fleet target, for
   * the alias. 
   */
  public fun routingStrategy(routingStrategy: CfnAlias.RoutingStrategyProperty) {
    cdkBuilder.routingStrategy(routingStrategy)
  }

  public fun build(): CfnAlias = cdkBuilder.build()
}
