@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.emr

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.emr.CfnStep

@CdkDslMarker
public class CfnStepHadoopJarStepConfigPropertyDsl {
  private val cdkBuilder: CfnStep.HadoopJarStepConfigProperty.Builder =
      CfnStep.HadoopJarStepConfigProperty.builder()

  private val _args: MutableList<String> = mutableListOf()

  private val _stepProperties: MutableList<Any> = mutableListOf()

  public fun args(vararg args: String) {
    _args.addAll(listOf(*args))
  }

  public fun args(args: Collection<String>) {
    _args.addAll(args)
  }

  public fun jar(jar: String) {
    cdkBuilder.jar(jar)
  }

  public fun mainClass(mainClass: String) {
    cdkBuilder.mainClass(mainClass)
  }

  public fun stepProperties(vararg stepProperties: Any) {
    _stepProperties.addAll(listOf(*stepProperties))
  }

  public fun stepProperties(stepProperties: Collection<Any>) {
    _stepProperties.addAll(stepProperties)
  }

  public fun stepProperties(stepProperties: IResolvable) {
    cdkBuilder.stepProperties(stepProperties)
  }

  public fun build(): CfnStep.HadoopJarStepConfigProperty {
    if(_args.isNotEmpty()) cdkBuilder.args(_args)
    if(_stepProperties.isNotEmpty()) cdkBuilder.stepProperties(_stepProperties)
    return cdkBuilder.build()
  }
}
