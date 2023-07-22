@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster

@CdkDslMarker
public class EmrCreateClusterApplicationConfigPropertyDsl {
  private val cdkBuilder: EmrCreateCluster.ApplicationConfigProperty.Builder =
      EmrCreateCluster.ApplicationConfigProperty.builder()

  private val _args: MutableList<String> = mutableListOf()

  /**
   * @param additionalInfo This option is for advanced users only.
   * This is meta information about third-party applications that third-party vendors use
   * for testing purposes.
   */
  public fun additionalInfo(additionalInfo: Map<String, String>) {
    cdkBuilder.additionalInfo(additionalInfo)
  }

  /**
   * @param args Arguments for Amazon EMR to pass to the application.
   */
  public fun args(vararg args: String) {
    _args.addAll(listOf(*args))
  }

  /**
   * @param args Arguments for Amazon EMR to pass to the application.
   */
  public fun args(args: Collection<String>) {
    _args.addAll(args)
  }

  /**
   * @param name The name of the application. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param version The version of the application.
   */
  public fun version(version: String) {
    cdkBuilder.version(version)
  }

  public fun build(): EmrCreateCluster.ApplicationConfigProperty {
    if(_args.isNotEmpty()) cdkBuilder.args(_args)
    return cdkBuilder.build()
  }
}
