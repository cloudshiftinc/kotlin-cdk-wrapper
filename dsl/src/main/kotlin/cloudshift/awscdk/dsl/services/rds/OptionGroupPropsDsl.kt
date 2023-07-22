@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.rds

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.rds.IInstanceEngine
import software.amazon.awscdk.services.rds.OptionConfiguration
import software.amazon.awscdk.services.rds.OptionGroupProps

@CdkDslMarker
public class OptionGroupPropsDsl {
  private val cdkBuilder: OptionGroupProps.Builder = OptionGroupProps.builder()

  private val _configurations: MutableList<OptionConfiguration> = mutableListOf()

  /**
   * @param configurations The configurations for this option group. 
   */
  public fun configurations(configurations: OptionConfigurationDsl.() -> Unit) {
    _configurations.add(OptionConfigurationDsl().apply(configurations).build())
  }

  /**
   * @param configurations The configurations for this option group. 
   */
  public fun configurations(configurations: Collection<OptionConfiguration>) {
    _configurations.addAll(configurations)
  }

  /**
   * @param description A description of the option group.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param engine The database engine that this option group is associated with. 
   */
  public fun engine(engine: IInstanceEngine) {
    cdkBuilder.engine(engine)
  }

  public fun build(): OptionGroupProps {
    if(_configurations.isNotEmpty()) cdkBuilder.configurations(_configurations)
    return cdkBuilder.build()
  }
}
