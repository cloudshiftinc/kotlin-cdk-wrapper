@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.imagebuilder

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration
import software.constructs.Construct

@CdkDslMarker
public class CfnDistributionConfigurationDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnDistributionConfiguration.Builder =
      CfnDistributionConfiguration.Builder.create(scope, id)

  private val _distributions: MutableList<Any> = mutableListOf()

  /**
   * The description of this distribution configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-distributionconfiguration.html#cfn-imagebuilder-distributionconfiguration-description)
   * @param description The description of this distribution configuration. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * The distributions of this distribution configuration formatted as an array of Distribution
   * objects.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-distributionconfiguration.html#cfn-imagebuilder-distributionconfiguration-distributions)
   * @param distributions The distributions of this distribution configuration formatted as an array
   * of Distribution objects. 
   */
  public fun distributions(vararg distributions: Any) {
    _distributions.addAll(listOf(*distributions))
  }

  /**
   * The distributions of this distribution configuration formatted as an array of Distribution
   * objects.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-distributionconfiguration.html#cfn-imagebuilder-distributionconfiguration-distributions)
   * @param distributions The distributions of this distribution configuration formatted as an array
   * of Distribution objects. 
   */
  public fun distributions(distributions: Collection<Any>) {
    _distributions.addAll(distributions)
  }

  /**
   * The distributions of this distribution configuration formatted as an array of Distribution
   * objects.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-distributionconfiguration.html#cfn-imagebuilder-distributionconfiguration-distributions)
   * @param distributions The distributions of this distribution configuration formatted as an array
   * of Distribution objects. 
   */
  public fun distributions(distributions: IResolvable) {
    cdkBuilder.distributions(distributions)
  }

  /**
   * The name of this distribution configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-distributionconfiguration.html#cfn-imagebuilder-distributionconfiguration-name)
   * @param name The name of this distribution configuration. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * The tags of this distribution configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-distributionconfiguration.html#cfn-imagebuilder-distributionconfiguration-tags)
   * @param tags The tags of this distribution configuration. 
   */
  public fun tags(tags: Map<String, String>) {
    cdkBuilder.tags(tags)
  }

  public fun build(): CfnDistributionConfiguration {
    if(_distributions.isNotEmpty()) cdkBuilder.distributions(_distributions)
    return cdkBuilder.build()
  }
}
