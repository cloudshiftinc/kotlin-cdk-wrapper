@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.emr

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.emr.CfnCluster

@CdkDslMarker
public class CfnClusterApplicationPropertyDsl {
  private val cdkBuilder: CfnCluster.ApplicationProperty.Builder =
      CfnCluster.ApplicationProperty.builder()

  private val _args: MutableList<String> = mutableListOf()

  public fun additionalInfo(additionalInfo: Map<String, String>) {
    cdkBuilder.additionalInfo(additionalInfo)
  }

  public fun additionalInfo(additionalInfo: IResolvable) {
    cdkBuilder.additionalInfo(additionalInfo)
  }

  public fun args(vararg args: String) {
    _args.addAll(listOf(*args))
  }

  public fun args(args: Collection<String>) {
    _args.addAll(args)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun version(version: String) {
    cdkBuilder.version(version)
  }

  public fun build(): CfnCluster.ApplicationProperty {
    if(_args.isNotEmpty()) cdkBuilder.args(_args)
    return cdkBuilder.build()
  }
}
