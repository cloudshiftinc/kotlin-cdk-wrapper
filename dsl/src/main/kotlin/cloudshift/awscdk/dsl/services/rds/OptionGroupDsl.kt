@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.rds

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.rds.IInstanceEngine
import software.amazon.awscdk.services.rds.OptionConfiguration
import software.amazon.awscdk.services.rds.OptionGroup
import software.constructs.Construct

@CdkDslMarker
public class OptionGroupDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: OptionGroup.Builder = OptionGroup.Builder.create(scope, id)

  private val _configurations: MutableList<OptionConfiguration> = mutableListOf()

  /**
   * The configurations for this option group.
   *
   * @param configurations The configurations for this option group. 
   */
  public fun configurations(configurations: OptionConfigurationDsl.() -> Unit) {
    _configurations.add(OptionConfigurationDsl().apply(configurations).build())
  }

  /**
   * The configurations for this option group.
   *
   * @param configurations The configurations for this option group. 
   */
  public fun configurations(configurations: Collection<OptionConfiguration>) {
    _configurations.addAll(configurations)
  }

  /**
   * A description of the option group.
   *
   * Default: a CDK generated description
   *
   * @param description A description of the option group. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * The database engine that this option group is associated with.
   *
   * @param engine The database engine that this option group is associated with. 
   */
  public fun engine(engine: IInstanceEngine) {
    cdkBuilder.engine(engine)
  }

  public fun build(): OptionGroup {
    if(_configurations.isNotEmpty()) cdkBuilder.configurations(_configurations)
    return cdkBuilder.build()
  }
}
