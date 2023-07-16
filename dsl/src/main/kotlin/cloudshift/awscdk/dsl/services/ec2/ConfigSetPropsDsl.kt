@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Map
import software.amazon.awscdk.services.ec2.ConfigSetProps
import software.amazon.awscdk.services.ec2.InitConfig

@CdkDslMarker
public class ConfigSetPropsDsl {
  private val cdkBuilder: ConfigSetProps.Builder = ConfigSetProps.builder()

  public fun configSets(configSets: Map<String, out List<String>>) {
    cdkBuilder.configSets(configSets)
  }

  public fun configs(configs: Map<String, out InitConfig>) {
    cdkBuilder.configs(configs)
  }

  public fun build(): ConfigSetProps = cdkBuilder.build()
}
